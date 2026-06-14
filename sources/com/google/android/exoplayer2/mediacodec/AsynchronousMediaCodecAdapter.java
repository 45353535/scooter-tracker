package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecAdapter;
import com.google.android.exoplayer2.mediacodec.MediaCodecAdapter;
import com.google.android.exoplayer2.util.TraceUtil;
import com.google.common.base.Supplier;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes7.dex */
@RequiresApi(23)
final class AsynchronousMediaCodecAdapter implements MediaCodecAdapter {
    private static final int STATE_CREATED = 0;
    private static final int STATE_INITIALIZED = 1;
    private static final int STATE_SHUT_DOWN = 2;
    private final AsynchronousMediaCodecCallback asynchronousMediaCodecCallback;
    private final AsynchronousMediaCodecBufferEnqueuer bufferEnqueuer;
    private final MediaCodec codec;
    private boolean codecReleased;
    private int state;
    private final boolean synchronizeCodecInteractionsWithQueueing;

    public static final class Factory implements MediaCodecAdapter.Factory {
        private final Supplier<HandlerThread> callbackThreadSupplier;
        private final Supplier<HandlerThread> queueingThreadSupplier;
        private final boolean synchronizeCodecInteractionsWithQueueing;

        public Factory(final int i10, boolean z10) {
            this(new Supplier() { // from class: com.google.android.exoplayer2.mediacodec.b
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return AsynchronousMediaCodecAdapter.Factory.a(i10);
                }
            }, new Supplier() { // from class: com.google.android.exoplayer2.mediacodec.c
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return AsynchronousMediaCodecAdapter.Factory.b(i10);
                }
            }, z10);
        }

        public static /* synthetic */ HandlerThread a(int i10) {
            return new HandlerThread(AsynchronousMediaCodecAdapter.createCallbackThreadLabel(i10));
        }

        public static /* synthetic */ HandlerThread b(int i10) {
            return new HandlerThread(AsynchronousMediaCodecAdapter.createQueueingThreadLabel(i10));
        }

        @VisibleForTesting
        Factory(Supplier<HandlerThread> supplier, Supplier<HandlerThread> supplier2, boolean z10) {
            this.callbackThreadSupplier = supplier;
            this.queueingThreadSupplier = supplier2;
            this.synchronizeCodecInteractionsWithQueueing = z10;
        }

        @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter.Factory
        public AsynchronousMediaCodecAdapter createAdapter(MediaCodecAdapter.Configuration configuration) throws Exception {
            Exception exc;
            MediaCodec mediaCodecCreateByCodecName;
            String str = configuration.codecInfo.name;
            AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter = null;
            try {
                TraceUtil.beginSection("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter2 = new AsynchronousMediaCodecAdapter(mediaCodecCreateByCodecName, this.callbackThreadSupplier.get(), this.queueingThreadSupplier.get(), this.synchronizeCodecInteractionsWithQueueing);
                    try {
                        TraceUtil.endSection();
                        asynchronousMediaCodecAdapter2.initialize(configuration.mediaFormat, configuration.surface, configuration.crypto, configuration.flags);
                        return asynchronousMediaCodecAdapter2;
                    } catch (Exception e10) {
                        exc = e10;
                        asynchronousMediaCodecAdapter = asynchronousMediaCodecAdapter2;
                        if (asynchronousMediaCodecAdapter != null) {
                            asynchronousMediaCodecAdapter.release();
                            throw exc;
                        }
                        if (mediaCodecCreateByCodecName == null) {
                            throw exc;
                        }
                        mediaCodecCreateByCodecName.release();
                        throw exc;
                    }
                } catch (Exception e11) {
                    exc = e11;
                }
            } catch (Exception e12) {
                exc = e12;
                mediaCodecCreateByCodecName = null;
            }
        }
    }

    public static /* synthetic */ void a(AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter, MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, MediaCodec mediaCodec, long j10, long j11) {
        asynchronousMediaCodecAdapter.getClass();
        onFrameRenderedListener.onFrameRendered(asynchronousMediaCodecAdapter, j10, j11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String createCallbackThreadLabel(int i10) {
        return createThreadLabel(i10, "ExoPlayer:MediaCodecAsyncAdapter:");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String createQueueingThreadLabel(int i10) {
        return createThreadLabel(i10, "ExoPlayer:MediaCodecQueueingThread:");
    }

    private static String createThreadLabel(int i10, String str) {
        StringBuilder sb2 = new StringBuilder(str);
        if (i10 == 1) {
            sb2.append("Audio");
        } else if (i10 == 2) {
            sb2.append("Video");
        } else {
            sb2.append("Unknown(");
            sb2.append(i10);
            sb2.append(")");
        }
        return sb2.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initialize(@Nullable MediaFormat mediaFormat, @Nullable Surface surface, @Nullable MediaCrypto mediaCrypto, int i10) {
        this.asynchronousMediaCodecCallback.initialize(this.codec);
        TraceUtil.beginSection("configureCodec");
        this.codec.configure(mediaFormat, surface, mediaCrypto, i10);
        TraceUtil.endSection();
        this.bufferEnqueuer.start();
        TraceUtil.beginSection("startCodec");
        this.codec.start();
        TraceUtil.endSection();
        this.state = 1;
    }

    private void maybeBlockOnQueueing() {
        if (this.synchronizeCodecInteractionsWithQueueing) {
            try {
                this.bufferEnqueuer.waitUntilQueueingComplete();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public int dequeueInputBufferIndex() {
        this.bufferEnqueuer.maybeThrowException();
        return this.asynchronousMediaCodecCallback.dequeueInputBufferIndex();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        this.bufferEnqueuer.maybeThrowException();
        return this.asynchronousMediaCodecCallback.dequeueOutputBufferIndex(bufferInfo);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void flush() {
        this.bufferEnqueuer.flush();
        this.codec.flush();
        this.asynchronousMediaCodecCallback.flush();
        this.codec.start();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    @Nullable
    public ByteBuffer getInputBuffer(int i10) {
        return this.codec.getInputBuffer(i10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    @RequiresApi(26)
    public PersistableBundle getMetrics() {
        maybeBlockOnQueueing();
        return this.codec.getMetrics();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    @Nullable
    public ByteBuffer getOutputBuffer(int i10) {
        return this.codec.getOutputBuffer(i10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public MediaFormat getOutputFormat() {
        return this.asynchronousMediaCodecCallback.getOutputFormat();
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public boolean needsReconfiguration() {
        return false;
    }

    @VisibleForTesting
    void onError(MediaCodec.CodecException codecException) {
        this.asynchronousMediaCodecCallback.onError(this.codec, codecException);
    }

    @VisibleForTesting
    void onOutputFormatChanged(MediaFormat mediaFormat) {
        this.asynchronousMediaCodecCallback.onOutputFormatChanged(this.codec, mediaFormat);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        this.bufferEnqueuer.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void queueSecureInputBuffer(int i10, int i11, CryptoInfo cryptoInfo, long j10, int i12) {
        this.bufferEnqueuer.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void release() {
        try {
            if (this.state == 1) {
                this.bufferEnqueuer.shutdown();
                this.asynchronousMediaCodecCallback.shutdown();
            }
            this.state = 2;
            if (this.codecReleased) {
                return;
            }
            this.codec.release();
            this.codecReleased = true;
        } catch (Throwable th2) {
            if (!this.codecReleased) {
                this.codec.release();
                this.codecReleased = true;
            }
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i10, boolean z10) {
        this.codec.releaseOutputBuffer(i10, z10);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void setOnFrameRenderedListener(final MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        maybeBlockOnQueueing();
        this.codec.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: com.google.android.exoplayer2.mediacodec.a
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                AsynchronousMediaCodecAdapter.a(this.f24972a, onFrameRenderedListener, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void setOutputSurface(Surface surface) {
        maybeBlockOnQueueing();
        this.codec.setOutputSurface(surface);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void setParameters(Bundle bundle) {
        maybeBlockOnQueueing();
        this.codec.setParameters(bundle);
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void setVideoScalingMode(int i10) {
        maybeBlockOnQueueing();
        this.codec.setVideoScalingMode(i10);
    }

    private AsynchronousMediaCodecAdapter(MediaCodec mediaCodec, HandlerThread handlerThread, HandlerThread handlerThread2, boolean z10) {
        this.codec = mediaCodec;
        this.asynchronousMediaCodecCallback = new AsynchronousMediaCodecCallback(handlerThread);
        this.bufferEnqueuer = new AsynchronousMediaCodecBufferEnqueuer(mediaCodec, handlerThread2);
        this.synchronizeCodecInteractionsWithQueueing = z10;
        this.state = 0;
    }

    @Override // com.google.android.exoplayer2.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i10, long j10) {
        this.codec.releaseOutputBuffer(i10, j10);
    }
}
