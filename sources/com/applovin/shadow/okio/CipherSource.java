package com.applovin.shadow.okio;

import java.io.IOException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.ShortBufferException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\nJ\u001f\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0016\u0010!\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010#\u001a\u00020 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010\"¨\u0006$"}, d2 = {"Lcom/applovin/shadow/okio/CipherSource;", "Lcom/applovin/shadow/okio/Source;", "Lcom/applovin/shadow/okio/BufferedSource;", "source", "Ljavax/crypto/Cipher;", "cipher", "<init>", "(Lvh/g;Ljavax/crypto/Cipher;)V", "", "refill", "()V", "update", "doFinal", "Lcom/applovin/shadow/okio/Buffer;", "sink", "", "byteCount", "read", "(Lcom/applovin/shadow/okio/Buffer;J)J", "Lcom/applovin/shadow/okio/Timeout;", "timeout", "()Lcom/applovin/shadow/okio/Timeout;", "close", "Lcom/applovin/shadow/okio/BufferedSource;", "Ljavax/crypto/Cipher;", "getCipher", "()Ljavax/crypto/Cipher;", "", "blockSize", "I", "buffer", "Lcom/applovin/shadow/okio/Buffer;", "", "final", "Z", "closed", "com.applovin.shadow.okio"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class CipherSource implements Source, AutoCloseable {
    private final int blockSize;

    @NotNull
    private final Buffer buffer;

    @NotNull
    private final Cipher cipher;
    private boolean closed;
    private boolean final;

    @NotNull
    private final BufferedSource source;

    public CipherSource(@NotNull BufferedSource source, @NotNull Cipher cipher) {
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(cipher, "cipher");
        this.source = source;
        this.cipher = cipher;
        int blockSize = cipher.getBlockSize();
        this.blockSize = blockSize;
        this.buffer = new Buffer();
        if (blockSize > 0) {
            return;
        }
        throw new IllegalArgumentException(("Block cipher required " + cipher).toString());
    }

    private final void doFinal() throws BadPaddingException, IllegalBlockSizeException, ShortBufferException {
        int outputSize = this.cipher.getOutputSize(0);
        if (outputSize == 0) {
            return;
        }
        Segment segmentWritableSegment$okio = this.buffer.writableSegment$okio(outputSize);
        int iDoFinal = this.cipher.doFinal(segmentWritableSegment$okio.data, segmentWritableSegment$okio.pos);
        segmentWritableSegment$okio.limit += iDoFinal;
        Buffer buffer = this.buffer;
        buffer.setSize$okio(buffer.size() + ((long) iDoFinal));
        if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
            this.buffer.head = segmentWritableSegment$okio.pop();
            SegmentPool.recycle(segmentWritableSegment$okio);
        }
    }

    private final void refill() throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
        while (this.buffer.size() == 0 && !this.final) {
            if (this.source.exhausted()) {
                this.final = true;
                doFinal();
                return;
            }
            update();
        }
    }

    private final void update() throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
        Segment segment = this.source.getBuffer().head;
        Intrinsics.checkNotNull(segment);
        int i10 = segment.limit - segment.pos;
        int outputSize = this.cipher.getOutputSize(i10);
        int i11 = i10;
        while (outputSize > 8192) {
            int i12 = this.blockSize;
            if (i11 <= i12) {
                this.final = true;
                Buffer buffer = this.buffer;
                byte[] bArrDoFinal = this.cipher.doFinal(this.source.readByteArray());
                Intrinsics.checkNotNullExpressionValue(bArrDoFinal, "doFinal(...)");
                buffer.write(bArrDoFinal);
                return;
            }
            i11 -= i12;
            outputSize = this.cipher.getOutputSize(i11);
        }
        Segment segmentWritableSegment$okio = this.buffer.writableSegment$okio(outputSize);
        int iUpdate = this.cipher.update(segment.data, segment.pos, i11, segmentWritableSegment$okio.data, segmentWritableSegment$okio.pos);
        this.source.skip(i11);
        segmentWritableSegment$okio.limit += iUpdate;
        Buffer buffer2 = this.buffer;
        buffer2.setSize$okio(buffer2.size() + ((long) iUpdate));
        if (segmentWritableSegment$okio.pos == segmentWritableSegment$okio.limit) {
            this.buffer.head = segmentWritableSegment$okio.pop();
            SegmentPool.recycle(segmentWritableSegment$okio);
        }
    }

    @Override // com.applovin.shadow.okio.Source, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.closed = true;
        this.source.close();
    }

    @NotNull
    public final Cipher getCipher() {
        return this.cipher;
    }

    @Override // com.applovin.shadow.okio.Source
    public long read(@NotNull Buffer sink, long byteCount) throws BadPaddingException, IllegalBlockSizeException, IOException, ShortBufferException {
        Intrinsics.checkNotNullParameter(sink, "sink");
        if (byteCount < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + byteCount).toString());
        }
        if (this.closed) {
            throw new IllegalStateException("closed");
        }
        if (byteCount == 0) {
            return 0L;
        }
        refill();
        return this.buffer.read(sink, byteCount);
    }

    @Override // com.applovin.shadow.okio.Source
    @NotNull
    /* JADX INFO: renamed from: timeout */
    public Timeout getTimeout() {
        return this.source.getTimeout();
    }
}
