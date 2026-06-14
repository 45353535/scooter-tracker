package com.google.android.exoplayer2.mediacodec;

import android.media.MediaCodec;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.annotation.GuardedBy;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.annotation.VisibleForTesting;
import com.google.android.exoplayer2.decoder.CryptoInfo;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.ConditionVariable;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes7.dex */
@RequiresApi(23)
class AsynchronousMediaCodecBufferEnqueuer {
    private static final int MSG_OPEN_CV = 2;
    private static final int MSG_QUEUE_INPUT_BUFFER = 0;
    private static final int MSG_QUEUE_SECURE_INPUT_BUFFER = 1;
    private final MediaCodec codec;
    private final ConditionVariable conditionVariable;
    private Handler handler;
    private final HandlerThread handlerThread;
    private final AtomicReference<RuntimeException> pendingRuntimeException;
    private boolean started;

    @GuardedBy("MESSAGE_PARAMS_INSTANCE_POOL")
    private static final ArrayDeque<MessageParams> MESSAGE_PARAMS_INSTANCE_POOL = new ArrayDeque<>();
    private static final Object QUEUE_SECURE_LOCK = new Object();

    private static class MessageParams {
        public final MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        public int flags;
        public int index;
        public int offset;
        public long presentationTimeUs;
        public int size;

        MessageParams() {
        }

        public void setQueueParams(int i10, int i11, int i12, long j10, int i13) {
            this.index = i10;
            this.offset = i11;
            this.size = i12;
            this.presentationTimeUs = j10;
            this.flags = i13;
        }
    }

    public AsynchronousMediaCodecBufferEnqueuer(MediaCodec mediaCodec, HandlerThread handlerThread) {
        this(mediaCodec, handlerThread, new ConditionVariable());
    }

    private void blockUntilHandlerThreadIsIdle() throws InterruptedException {
        this.conditionVariable.close();
        ((Handler) Assertions.checkNotNull(this.handler)).obtainMessage(2).sendToTarget();
        this.conditionVariable.block();
    }

    private static void copy(CryptoInfo cryptoInfo, MediaCodec.CryptoInfo cryptoInfo2) {
        cryptoInfo2.numSubSamples = cryptoInfo.numSubSamples;
        cryptoInfo2.numBytesOfClearData = copy(cryptoInfo.numBytesOfClearData, cryptoInfo2.numBytesOfClearData);
        cryptoInfo2.numBytesOfEncryptedData = copy(cryptoInfo.numBytesOfEncryptedData, cryptoInfo2.numBytesOfEncryptedData);
        cryptoInfo2.key = (byte[]) Assertions.checkNotNull(copy(cryptoInfo.key, cryptoInfo2.key));
        cryptoInfo2.iv = (byte[]) Assertions.checkNotNull(copy(cryptoInfo.iv, cryptoInfo2.iv));
        cryptoInfo2.mode = cryptoInfo.mode;
        if (Util.SDK_INT >= 24) {
            androidx.media3.exoplayer.mediacodec.e.a();
            cryptoInfo2.setPattern(androidx.media3.decoder.c.a(cryptoInfo.encryptedBlocks, cryptoInfo.clearBlocks));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void doHandleMessage(android.os.Message r9) {
        /*
            r8 = this;
            int r2 = r9.what
            if (r2 == 0) goto L37
            r3 = 1
            if (r2 == r3) goto L22
            r3 = 2
            r4 = 0
            if (r2 == r3) goto L1c
            java.util.concurrent.atomic.AtomicReference<java.lang.RuntimeException> r2 = r8.pendingRuntimeException
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            int r1 = r9.what
            java.lang.String r1 = java.lang.String.valueOf(r1)
            r3.<init>(r1)
            androidx.compose.animation.core.c.a(r2, r4, r3)
            goto L4b
        L1c:
            com.google.android.exoplayer2.util.ConditionVariable r1 = r8.conditionVariable
            r1.open()
            goto L4b
        L22:
            java.lang.Object r1 = r9.obj
            r7 = r1
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer$MessageParams r7 = (com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams) r7
            int r1 = r7.index
            int r2 = r7.offset
            android.media.MediaCodec$CryptoInfo r3 = r7.cryptoInfo
            long r4 = r7.presentationTimeUs
            int r6 = r7.flags
            r0 = r8
            r0.doQueueSecureInputBuffer(r1, r2, r3, r4, r6)
        L35:
            r4 = r7
            goto L4b
        L37:
            java.lang.Object r0 = r9.obj
            r7 = r0
            com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer$MessageParams r7 = (com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer.MessageParams) r7
            int r1 = r7.index
            int r2 = r7.offset
            int r3 = r7.size
            long r4 = r7.presentationTimeUs
            int r6 = r7.flags
            r0 = r8
            r0.doQueueInputBuffer(r1, r2, r3, r4, r6)
            goto L35
        L4b:
            if (r4 == 0) goto L50
            recycleMessageParams(r4)
        L50:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer.doHandleMessage(android.os.Message):void");
    }

    private void doQueueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        try {
            this.codec.queueInputBuffer(i10, i11, i12, j10, i13);
        } catch (RuntimeException e10) {
            androidx.compose.animation.core.c.a(this.pendingRuntimeException, null, e10);
        }
    }

    private void doQueueSecureInputBuffer(int i10, int i11, MediaCodec.CryptoInfo cryptoInfo, long j10, int i12) {
        try {
            synchronized (QUEUE_SECURE_LOCK) {
                this.codec.queueSecureInputBuffer(i10, i11, cryptoInfo, j10, i12);
            }
        } catch (RuntimeException e10) {
            androidx.compose.animation.core.c.a(this.pendingRuntimeException, null, e10);
        }
    }

    private void flushHandlerThread() throws InterruptedException {
        ((Handler) Assertions.checkNotNull(this.handler)).removeCallbacksAndMessages(null);
        blockUntilHandlerThreadIsIdle();
    }

    private static MessageParams getMessageParams() {
        ArrayDeque<MessageParams> arrayDeque = MESSAGE_PARAMS_INSTANCE_POOL;
        synchronized (arrayDeque) {
            try {
                if (arrayDeque.isEmpty()) {
                    return new MessageParams();
                }
                return arrayDeque.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private static void recycleMessageParams(MessageParams messageParams) {
        ArrayDeque<MessageParams> arrayDeque = MESSAGE_PARAMS_INSTANCE_POOL;
        synchronized (arrayDeque) {
            arrayDeque.add(messageParams);
        }
    }

    public void flush() {
        if (this.started) {
            try {
                flushHandlerThread();
            } catch (InterruptedException e10) {
                Thread.currentThread().interrupt();
                throw new IllegalStateException(e10);
            }
        }
    }

    public void maybeThrowException() {
        RuntimeException andSet = this.pendingRuntimeException.getAndSet(null);
        if (andSet != null) {
            throw andSet;
        }
    }

    public void queueInputBuffer(int i10, int i11, int i12, long j10, int i13) {
        maybeThrowException();
        MessageParams messageParams = getMessageParams();
        messageParams.setQueueParams(i10, i11, i12, j10, i13);
        ((Handler) Util.castNonNull(this.handler)).obtainMessage(0, messageParams).sendToTarget();
    }

    public void queueSecureInputBuffer(int i10, int i11, CryptoInfo cryptoInfo, long j10, int i12) {
        maybeThrowException();
        MessageParams messageParams = getMessageParams();
        messageParams.setQueueParams(i10, i11, 0, j10, i12);
        copy(cryptoInfo, messageParams.cryptoInfo);
        ((Handler) Util.castNonNull(this.handler)).obtainMessage(1, messageParams).sendToTarget();
    }

    @VisibleForTesting(otherwise = 5)
    void setPendingRuntimeException(RuntimeException runtimeException) {
        this.pendingRuntimeException.set(runtimeException);
    }

    public void shutdown() {
        if (this.started) {
            flush();
            this.handlerThread.quit();
        }
        this.started = false;
    }

    public void start() {
        if (this.started) {
            return;
        }
        this.handlerThread.start();
        this.handler = new Handler(this.handlerThread.getLooper()) { // from class: com.google.android.exoplayer2.mediacodec.AsynchronousMediaCodecBufferEnqueuer.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                AsynchronousMediaCodecBufferEnqueuer.this.doHandleMessage(message);
            }
        };
        this.started = true;
    }

    public void waitUntilQueueingComplete() throws InterruptedException {
        blockUntilHandlerThreadIsIdle();
    }

    @VisibleForTesting
    AsynchronousMediaCodecBufferEnqueuer(MediaCodec mediaCodec, HandlerThread handlerThread, ConditionVariable conditionVariable) {
        this.codec = mediaCodec;
        this.handlerThread = handlerThread;
        this.conditionVariable = conditionVariable;
        this.pendingRuntimeException = new AtomicReference<>();
    }

    @Nullable
    private static int[] copy(@Nullable int[] iArr, @Nullable int[] iArr2) {
        if (iArr == null) {
            return iArr2;
        }
        if (iArr2 != null && iArr2.length >= iArr.length) {
            System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
            return iArr2;
        }
        return Arrays.copyOf(iArr, iArr.length);
    }

    @Nullable
    private static byte[] copy(@Nullable byte[] bArr, @Nullable byte[] bArr2) {
        if (bArr == null) {
            return bArr2;
        }
        if (bArr2 != null && bArr2.length >= bArr.length) {
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            return bArr2;
        }
        return Arrays.copyOf(bArr, bArr.length);
    }
}
