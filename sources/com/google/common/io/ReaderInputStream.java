package com.google.common.io;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.UnsignedBytes;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetEncoder;
import java.nio.charset.CodingErrorAction;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@J2ktIncompatible
@GwtIncompatible
final class ReaderInputStream extends InputStream implements AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Reader f30952b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final CharsetEncoder f30953c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f30954d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private CharBuffer f30955e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private ByteBuffer f30956f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f30957g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f30958h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f30959i;

    /* JADX WARN: Illegal instructions before constructor call */
    ReaderInputStream(Reader reader, Charset charset, int i10) {
        CharsetEncoder charsetEncoderNewEncoder = charset.newEncoder();
        CodingErrorAction codingErrorAction = CodingErrorAction.REPLACE;
        this(reader, charsetEncoderNewEncoder.onMalformedInput(codingErrorAction).onUnmappableCharacter(codingErrorAction), i10);
    }

    private static int c(Buffer buffer) {
        return buffer.capacity() - buffer.limit();
    }

    private int d(byte[] bArr, int i10, int i11) {
        int iMin = Math.min(i11, this.f30956f.remaining());
        this.f30956f.get(bArr, i10, iMin);
        return iMin;
    }

    private static CharBuffer e(CharBuffer charBuffer) {
        CharBuffer charBufferWrap = CharBuffer.wrap(Arrays.copyOf(charBuffer.array(), charBuffer.capacity() * 2));
        Java8Compatibility.d(charBufferWrap, charBuffer.position());
        Java8Compatibility.c(charBufferWrap, charBuffer.limit());
        return charBufferWrap;
    }

    private void m() throws IOException {
        if (c(this.f30955e) == 0) {
            if (this.f30955e.position() > 0) {
                Java8Compatibility.b(this.f30955e.compact());
            } else {
                this.f30955e = e(this.f30955e);
            }
        }
        int iLimit = this.f30955e.limit();
        int i10 = this.f30952b.read(this.f30955e.array(), iLimit, c(this.f30955e));
        if (i10 == -1) {
            this.f30957g = true;
        } else {
            Java8Compatibility.c(this.f30955e, iLimit + i10);
        }
    }

    private void n(boolean z10) {
        Java8Compatibility.b(this.f30956f);
        if (z10 && this.f30956f.remaining() == 0) {
            this.f30956f = ByteBuffer.allocate(this.f30956f.capacity() * 2);
        } else {
            this.f30958h = true;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f30952b.close();
    }

    @Override // java.io.InputStream
    public int read() throws IOException {
        if (read(this.f30954d) == 1) {
            return UnsignedBytes.toInt(this.f30954d[0]);
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r2 <= 0) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
    
        return -1;
     */
    @Override // java.io.InputStream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public int read(byte[] r8, int r9, int r10) throws java.io.IOException {
        /*
            r7 = this;
            int r0 = r9 + r10
            int r1 = r8.length
            com.google.common.base.Preconditions.checkPositionIndexes(r9, r0, r1)
            r0 = 0
            if (r10 != 0) goto La
            return r0
        La:
            boolean r1 = r7.f30957g
            r2 = r0
        Ld:
            boolean r3 = r7.f30958h
            if (r3 == 0) goto L2e
            int r3 = r9 + r2
            int r4 = r10 - r2
            int r3 = r7.d(r8, r3, r4)
            int r2 = r2 + r3
            if (r2 == r10) goto L29
            boolean r3 = r7.f30959i
            if (r3 == 0) goto L21
            goto L29
        L21:
            r7.f30958h = r0
            java.nio.ByteBuffer r3 = r7.f30956f
            com.google.common.io.Java8Compatibility.a(r3)
            goto L2e
        L29:
            if (r2 <= 0) goto L2c
            return r2
        L2c:
            r8 = -1
            return r8
        L2e:
            boolean r3 = r7.f30959i
            if (r3 == 0) goto L35
            java.nio.charset.CoderResult r3 = java.nio.charset.CoderResult.UNDERFLOW
            goto L4c
        L35:
            if (r1 == 0) goto L40
            java.nio.charset.CharsetEncoder r3 = r7.f30953c
            java.nio.ByteBuffer r4 = r7.f30956f
            java.nio.charset.CoderResult r3 = r3.flush(r4)
            goto L4c
        L40:
            java.nio.charset.CharsetEncoder r3 = r7.f30953c
            java.nio.CharBuffer r4 = r7.f30955e
            java.nio.ByteBuffer r5 = r7.f30956f
            boolean r6 = r7.f30957g
            java.nio.charset.CoderResult r3 = r3.encode(r4, r5, r6)
        L4c:
            boolean r4 = r3.isOverflow()
            r5 = 1
            if (r4 == 0) goto L57
            r7.n(r5)
            goto Ld
        L57:
            boolean r4 = r3.isUnderflow()
            if (r4 == 0) goto L6f
            if (r1 == 0) goto L65
            r7.f30959i = r5
            r7.n(r0)
            goto Ld
        L65:
            boolean r3 = r7.f30957g
            if (r3 == 0) goto L6b
            r1 = r5
            goto L2e
        L6b:
            r7.m()
            goto L2e
        L6f:
            boolean r4 = r3.isError()
            if (r4 == 0) goto L2e
            r3.throwException()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.io.ReaderInputStream.read(byte[], int, int):int");
    }

    ReaderInputStream(Reader reader, CharsetEncoder charsetEncoder, int i10) {
        this.f30954d = new byte[1];
        this.f30952b = (Reader) Preconditions.checkNotNull(reader);
        this.f30953c = (CharsetEncoder) Preconditions.checkNotNull(charsetEncoder);
        Preconditions.checkArgument(i10 > 0, "bufferSize must be positive: %s", i10);
        charsetEncoder.reset();
        CharBuffer charBufferAllocate = CharBuffer.allocate(i10);
        this.f30955e = charBufferAllocate;
        Java8Compatibility.b(charBufferAllocate);
        this.f30956f = ByteBuffer.allocate(i10);
    }
}
