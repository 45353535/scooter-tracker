package androidx.media3.exoplayer.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.PersistableBundle;
import android.view.Surface;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import androidx.media3.common.Format;
import androidx.media3.common.MimeTypes;
import androidx.media3.common.util.TraceUtil;
import androidx.media3.common.util.Util;
import androidx.media3.decoder.CryptoInfo;
import androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter;
import androidx.media3.exoplayer.mediacodec.MediaCodecAdapter;
import com.google.common.base.Supplier;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes5.dex */
@RequiresApi(23)
final class AsynchronousMediaCodecAdapter implements MediaCodecAdapter {
    private static final int STATE_CREATED = 0;
    private static final int STATE_INITIALIZED = 1;
    private static final int STATE_SHUT_DOWN = 2;
    private final AsynchronousMediaCodecCallback asynchronousMediaCodecCallback;
    private final MediaCodecBufferEnqueuer bufferEnqueuer;
    private final MediaCodec codec;
    private boolean codecReleased;
    private int state;

    public static final class Factory implements MediaCodecAdapter.Factory {
        private final Supplier<HandlerThread> callbackThreadSupplier;
        private boolean enableSynchronousBufferQueueingWithAsyncCryptoFlag;
        private final Supplier<HandlerThread> queueingThreadSupplier;

        public Factory(final int i10) {
            this(new Supplier() { // from class: androidx.media3.exoplayer.mediacodec.c
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return AsynchronousMediaCodecAdapter.Factory.b(i10);
                }
            }, new Supplier() { // from class: androidx.media3.exoplayer.mediacodec.d
                @Override // com.google.common.base.Supplier
                public final Object get() {
                    return AsynchronousMediaCodecAdapter.Factory.a(i10);
                }
            });
        }

        public static /* synthetic */ HandlerThread a(int i10) {
            return new HandlerThread(AsynchronousMediaCodecAdapter.createQueueingThreadLabel(i10));
        }

        public static /* synthetic */ HandlerThread b(int i10) {
            return new HandlerThread(AsynchronousMediaCodecAdapter.createCallbackThreadLabel(i10));
        }

        @ChecksSdkIntAtLeast(api = 34)
        private static boolean useSynchronousBufferQueueingWithAsyncCryptoFlag(Format format) {
            int i10 = Util.SDK_INT;
            if (i10 < 34) {
                return false;
            }
            return i10 >= 35 || MimeTypes.isVideo(format.sampleMimeType);
        }

        public void experimentalSetAsyncCryptoFlagEnabled(boolean z10) {
            this.enableSynchronousBufferQueueingWithAsyncCryptoFlag = z10;
        }

        @VisibleForTesting
        Factory(Supplier<HandlerThread> supplier, Supplier<HandlerThread> supplier2) {
            this.callbackThreadSupplier = supplier;
            this.queueingThreadSupplier = supplier2;
            this.enableSynchronousBufferQueueingWithAsyncCryptoFlag = true;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter$1] */
        /* JADX WARN: Type inference failed for: r1v1, types: [androidx.media3.exoplayer.mediacodec.AsynchronousMediaCodecAdapter] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v4 */
        @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter.Factory
        public AsynchronousMediaCodecAdapter createAdapter(MediaCodecAdapter.Configuration configuration) throws Exception {
            MediaCodec mediaCodecCreateByCodecName;
            int i10;
            MediaCodecBufferEnqueuer asynchronousMediaCodecBufferEnqueuer;
            AsynchronousMediaCodecAdapter asynchronousMediaCodecAdapter;
            String str = configuration.codecInfo.name;
            ?? r12 = 0;
            r12 = 0;
            try {
                TraceUtil.beginSection("createCodec:" + str);
                mediaCodecCreateByCodecName = MediaCodec.createByCodecName(str);
                try {
                    i10 = configuration.flags;
                    if (this.enableSynchronousBufferQueueingWithAsyncCryptoFlag && useSynchronousBufferQueueingWithAsyncCryptoFlag(configuration.format)) {
                        asynchronousMediaCodecBufferEnqueuer = new SynchronousMediaCodecBufferEnqueuer(mediaCodecCreateByCodecName);
                        i10 |= 4;
                    } else {
                        asynchronousMediaCodecBufferEnqueuer = new AsynchronousMediaCodecBufferEnqueuer(mediaCodecCreateByCodecName, this.queueingThreadSupplier.get());
                    }
                    asynchronousMediaCodecAdapter = new AsynchronousMediaCodecAdapter(mediaCodecCreateByCodecName, this.callbackThreadSupplier.get(), asynchronousMediaCodecBufferEnqueuer);
                } catch (Exception e10) {
                    e = e10;
                }
                try {
                    TraceUtil.endSection();
                    asynchronousMediaCodecAdapter.initialize(configuration.mediaFormat, configuration.surface, configuration.crypto, i10);
                    return asynchronousMediaCodecAdapter;
                } catch (Exception e11) {
                    e = e11;
                    r12 = asynchronousMediaCodecAdapter;
                    if (r12 != 0) {
                        r12.release();
                    } else if (mediaCodecCreateByCodecName != null) {
                        mediaCodecCreateByCodecName.release();
                    }
                    throw e;
                }
            } catch (Exception e12) {
                e = e12;
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

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueInputBufferIndex() {
        this.bufferEnqueuer.maybeThrowException();
        return this.asynchronousMediaCodecCallback.dequeueInputBufferIndex();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public int dequeueOutputBufferIndex(MediaCodec.BufferInfo bufferInfo) {
        this.bufferEnqueuer.maybeThrowException();
        return this.asynchronousMediaCodecCallback.dequeueOutputBufferIndex(bufferInfo);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void flush() {
        this.bufferEnqueuer.flush();
        this.codec.flush();
        this.asynchronousMediaCodecCallback.flush();
        this.codec.start();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @Nullable
    public ByteBuffer getInputBuffer(int i10) {
        return this.codec.getInputBuffer(i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @RequiresApi(26)
    public PersistableBundle getMetrics() {
        return this.codec.getMetrics();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    @Nullable
    public ByteBuffer getOutputBuffer(int i10) {
        return this.codec.getOutputBuffer(i10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public MediaFormat getOutputFormat() {
        return this.asynchronousMediaCodecCallback.getOutputFormat();
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
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

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        this.bufferEnqueuer.queueInputBuffer(i10, i11, i12, j10, i13);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void queueSecureInputBuffer(int i10, int i11, CryptoInfo cryptoInfo, long j10, int i12) {
        this.bufferEnqueuer.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public boolean registerOnBufferAvailableListener(MediaCodecAdapter.OnBufferAvailableListener onBufferAvailableListener) {
        this.asynchronousMediaCodecCallback.setOnBufferAvailableListener(onBufferAvailableListener);
        return true;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
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
            try {
                int i10 = Util.SDK_INT;
                if (i10 >= 30 && i10 < 33) {
                    this.codec.stop();
                }
            } finally {
            }
        } catch (Throwable th2) {
            if (!this.codecReleased) {
                try {
                    int i11 = Util.SDK_INT;
                    if (i11 >= 30 && i11 < 33) {
                        this.codec.stop();
                    }
                } finally {
                }
            }
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i10, boolean z10) {
        this.codec.releaseOutputBuffer(i10, z10);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setOnFrameRenderedListener(final MediaCodecAdapter.OnFrameRenderedListener onFrameRenderedListener, Handler handler) {
        this.codec.setOnFrameRenderedListener(new MediaCodec.OnFrameRenderedListener() { // from class: androidx.media3.exoplayer.mediacodec.b
            @Override // android.media.MediaCodec.OnFrameRenderedListener
            public final void onFrameRendered(MediaCodec mediaCodec, long j10, long j11) {
                AsynchronousMediaCodecAdapter.a(this.f5069a, onFrameRenderedListener, mediaCodec, j10, j11);
            }
        }, handler);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setOutputSurface(Surface surface) {
        this.codec.setOutputSurface(surface);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setParameters(Bundle bundle) {
        this.bufferEnqueuer.setParameters(bundle);
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void setVideoScalingMode(int i10) {
        this.codec.setVideoScalingMode(i10);
    }

    private AsynchronousMediaCodecAdapter(MediaCodec mediaCodec, HandlerThread handlerThread, MediaCodecBufferEnqueuer mediaCodecBufferEnqueuer) {
        this.codec = mediaCodec;
        this.asynchronousMediaCodecCallback = new AsynchronousMediaCodecCallback(handlerThread);
        this.bufferEnqueuer = mediaCodecBufferEnqueuer;
        this.state = 0;
    }

    @Override // androidx.media3.exoplayer.mediacodec.MediaCodecAdapter
    public void releaseOutputBuffer(int i10, long j10) {
        this.codec.releaseOutputBuffer(i10, j10);
    }
}
