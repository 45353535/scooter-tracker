package com.google.android.exoplayer2.decoder;

import androidx.annotation.CallSuper;
import androidx.annotation.Nullable;
import com.google.android.exoplayer2.decoder.DecoderException;
import com.google.android.exoplayer2.decoder.DecoderInputBuffer;
import com.google.android.exoplayer2.decoder.DecoderOutputBuffer;
import com.google.android.exoplayer2.util.Assertions;
import java.util.ArrayDeque;

/* JADX INFO: loaded from: classes7.dex */
public abstract class SimpleDecoder<I extends DecoderInputBuffer, O extends DecoderOutputBuffer, E extends DecoderException> implements Decoder<I, O, E> {
    private int availableInputBufferCount;
    private final I[] availableInputBuffers;
    private int availableOutputBufferCount;
    private final O[] availableOutputBuffers;
    private final Thread decodeThread;

    @Nullable
    private I dequeuedInputBuffer;

    @Nullable
    private E exception;
    private boolean flushed;
    private final Object lock = new Object();
    private final ArrayDeque<I> queuedInputBuffers = new ArrayDeque<>();
    private final ArrayDeque<O> queuedOutputBuffers = new ArrayDeque<>();
    private boolean released;
    private int skippedOutputBufferCount;

    protected SimpleDecoder(I[] iArr, O[] oArr) {
        this.availableInputBuffers = iArr;
        this.availableInputBufferCount = iArr.length;
        for (int i10 = 0; i10 < this.availableInputBufferCount; i10++) {
            ((I[]) this.availableInputBuffers)[i10] = createInputBuffer();
        }
        this.availableOutputBuffers = oArr;
        this.availableOutputBufferCount = oArr.length;
        for (int i11 = 0; i11 < this.availableOutputBufferCount; i11++) {
            ((O[]) this.availableOutputBuffers)[i11] = createOutputBuffer();
        }
        Thread thread = new Thread("ExoPlayer:SimpleDecoder") { // from class: com.google.android.exoplayer2.decoder.SimpleDecoder.1
            @Override // java.lang.Thread, java.lang.Runnable
            public void run() {
                SimpleDecoder.this.run();
            }
        };
        this.decodeThread = thread;
        thread.start();
    }

    private boolean canDecodeBuffer() {
        return !this.queuedInputBuffers.isEmpty() && this.availableOutputBufferCount > 0;
    }

    private boolean decode() throws InterruptedException {
        E e10;
        synchronized (this.lock) {
            while (!this.released && !canDecodeBuffer()) {
                try {
                    this.lock.wait();
                } finally {
                }
            }
            if (this.released) {
                return false;
            }
            I iRemoveFirst = this.queuedInputBuffers.removeFirst();
            O[] oArr = this.availableOutputBuffers;
            int i10 = this.availableOutputBufferCount - 1;
            this.availableOutputBufferCount = i10;
            O o10 = oArr[i10];
            boolean z10 = this.flushed;
            this.flushed = false;
            if (iRemoveFirst.isEndOfStream()) {
                o10.addFlag(4);
            } else {
                if (iRemoveFirst.isDecodeOnly()) {
                    o10.addFlag(Integer.MIN_VALUE);
                }
                if (iRemoveFirst.isFirstSample()) {
                    o10.addFlag(134217728);
                }
                try {
                    e10 = (E) decode(iRemoveFirst, o10, z10);
                } catch (OutOfMemoryError e11) {
                    e10 = (E) createUnexpectedDecodeException(e11);
                } catch (RuntimeException e12) {
                    e10 = (E) createUnexpectedDecodeException(e12);
                }
                if (e10 != null) {
                    synchronized (this.lock) {
                        this.exception = e10;
                    }
                    return false;
                }
            }
            synchronized (this.lock) {
                try {
                    if (this.flushed) {
                        o10.release();
                    } else if (o10.isDecodeOnly()) {
                        this.skippedOutputBufferCount++;
                        o10.release();
                    } else {
                        o10.skippedOutputBufferCount = this.skippedOutputBufferCount;
                        this.skippedOutputBufferCount = 0;
                        this.queuedOutputBuffers.addLast(o10);
                    }
                    releaseInputBufferInternal(iRemoveFirst);
                } finally {
                }
            }
            return true;
        }
    }

    private void maybeNotifyDecodeLoop() {
        if (canDecodeBuffer()) {
            this.lock.notify();
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: E extends com.google.android.exoplayer2.decoder.DecoderException */
    private void maybeThrowException() throws E, DecoderException {
        E e10 = this.exception;
        if (e10 != null) {
            throw e10;
        }
    }

    private void releaseInputBufferInternal(I i10) {
        i10.clear();
        I[] iArr = this.availableInputBuffers;
        int i11 = this.availableInputBufferCount;
        this.availableInputBufferCount = i11 + 1;
        iArr[i11] = i10;
    }

    private void releaseOutputBufferInternal(O o10) {
        o10.clear();
        O[] oArr = this.availableOutputBuffers;
        int i10 = this.availableOutputBufferCount;
        this.availableOutputBufferCount = i10 + 1;
        oArr[i10] = o10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void run() {
        do {
            try {
            } catch (InterruptedException e10) {
                throw new IllegalStateException(e10);
            }
        } while (decode());
    }

    protected abstract I createInputBuffer();

    protected abstract O createOutputBuffer();

    protected abstract E createUnexpectedDecodeException(Throwable th2);

    @Nullable
    protected abstract E decode(I i10, O o10, boolean z10);

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final void flush() {
        synchronized (this.lock) {
            try {
                this.flushed = true;
                this.skippedOutputBufferCount = 0;
                I i10 = this.dequeuedInputBuffer;
                if (i10 != null) {
                    releaseInputBufferInternal(i10);
                    this.dequeuedInputBuffer = null;
                }
                while (!this.queuedInputBuffers.isEmpty()) {
                    releaseInputBufferInternal(this.queuedInputBuffers.removeFirst());
                }
                while (!this.queuedOutputBuffers.isEmpty()) {
                    this.queuedOutputBuffers.removeFirst().release();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @CallSuper
    public void release() {
        synchronized (this.lock) {
            this.released = true;
            this.lock.notify();
        }
        try {
            this.decodeThread.join();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
        }
    }

    @CallSuper
    protected void releaseOutputBuffer(O o10) {
        synchronized (this.lock) {
            releaseOutputBufferInternal(o10);
            maybeNotifyDecodeLoop();
        }
    }

    protected final void setInitialInputBufferSize(int i10) {
        Assertions.checkState(this.availableInputBufferCount == this.availableInputBuffers.length);
        for (I i11 : this.availableInputBuffers) {
            i11.ensureSpaceForWrite(i10);
        }
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public final I dequeueInputBuffer() throws DecoderException {
        I i10;
        synchronized (this.lock) {
            maybeThrowException();
            Assertions.checkState(this.dequeuedInputBuffer == null);
            int i11 = this.availableInputBufferCount;
            if (i11 == 0) {
                i10 = null;
            } else {
                I[] iArr = this.availableInputBuffers;
                int i12 = i11 - 1;
                this.availableInputBufferCount = i12;
                i10 = iArr[i12];
            }
            this.dequeuedInputBuffer = i10;
        }
        return i10;
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    @Nullable
    public final O dequeueOutputBuffer() throws DecoderException {
        synchronized (this.lock) {
            try {
                maybeThrowException();
                if (this.queuedOutputBuffers.isEmpty()) {
                    return null;
                }
                return this.queuedOutputBuffers.removeFirst();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.exoplayer2.decoder.Decoder
    public final void queueInputBuffer(I i10) throws DecoderException {
        synchronized (this.lock) {
            maybeThrowException();
            Assertions.checkArgument(i10 == this.dequeuedInputBuffer);
            this.queuedInputBuffers.addLast(i10);
            maybeNotifyDecodeLoop();
            this.dequeuedInputBuffer = null;
        }
    }
}
