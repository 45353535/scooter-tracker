package com.mbridge.msdk.thrid.okio;

import android.support.v4.media.session.PlaybackStateCompat;
import androidx.collection.SieveCacheKt;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes10.dex */
final class n implements e, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f51761a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final s f51762b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f51763c;

    n(s sVar) {
        if (sVar == null) {
            throw new NullPointerException("source == null");
        }
        this.f51762b = sVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.e, com.mbridge.msdk.thrid.okio.d
    public c a() {
        return this.f51761a;
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public long b(c cVar, long j10) throws IOException {
        if (cVar == null) {
            throw new IllegalArgumentException("sink == null");
        }
        if (j10 < 0) {
            throw new IllegalArgumentException("byteCount < 0: " + j10);
        }
        if (this.f51763c) {
            throw new IllegalStateException("closed");
        }
        c cVar2 = this.f51761a;
        if (cVar2.f51733b == 0 && this.f51762b.b(cVar2, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1L;
        }
        return this.f51761a.b(cVar, Math.min(j10, this.f51761a.f51733b));
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public byte[] c(long j10) throws IOException {
        e(j10);
        return this.f51761a.c(j10);
    }

    @Override // com.mbridge.msdk.thrid.okio.s, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        if (this.f51763c) {
            return;
        }
        this.f51763c = true;
        this.f51762b.close();
        this.f51761a.k();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String d(long j10) throws IOException {
        if (j10 < 0) {
            throw new IllegalArgumentException("limit < 0: " + j10);
        }
        long j11 = j10 == Long.MAX_VALUE ? Long.MAX_VALUE : j10 + 1;
        long jA = a((byte) 10, 0L, j11);
        if (jA != -1) {
            return this.f51761a.h(jA);
        }
        if (j11 < Long.MAX_VALUE && f(j11) && this.f51761a.f(j11 - 1) == 13 && f(j11 + 1) && this.f51761a.f(j11) == 10) {
            return this.f51761a.h(j11);
        }
        c cVar = new c();
        c cVar2 = this.f51761a;
        cVar2.a(cVar, 0L, Math.min(32L, cVar2.size()));
        throw new EOFException("\\n not found: limit=" + Math.min(this.f51761a.size(), j10) + " content=" + cVar.o().g() + (char) 8230);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void e(long j10) throws IOException {
        if (!f(j10)) {
            throw new EOFException();
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public boolean f() throws IOException {
        if (this.f51763c) {
            throw new IllegalStateException("closed");
        }
        return this.f51761a.f() && this.f51762b.b(this.f51761a, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public short g() throws IOException {
        e(2L);
        return this.f51761a.g();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public long i() throws IOException {
        byte bF;
        e(1L);
        int i10 = 0;
        while (true) {
            int i11 = i10 + 1;
            if (!f(i11)) {
                break;
            }
            bF = this.f51761a.f(i10);
            if ((bF < 48 || bF > 57) && ((bF < 97 || bF > 102) && (bF < 65 || bF > 70))) {
                break;
            }
            i10 = i11;
        }
        if (i10 == 0) {
            throw new NumberFormatException(String.format("Expected leading [0-9a-fA-F] character but was %#x", Byte.valueOf(bF)));
        }
        return this.f51761a.i();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f51763c;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public InputStream j() {
        return new a();
    }

    @Override // java.nio.channels.ReadableByteChannel
    public int read(ByteBuffer byteBuffer) throws IOException {
        c cVar = this.f51761a;
        if (cVar.f51733b == 0 && this.f51762b.b(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
            return -1;
        }
        return this.f51761a.read(byteBuffer);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public byte readByte() throws IOException {
        e(1L);
        return this.f51761a.readByte();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void readFully(byte[] bArr) throws IOException {
        try {
            e(bArr.length);
            this.f51761a.readFully(bArr);
        } catch (EOFException e10) {
            int i10 = 0;
            while (true) {
                c cVar = this.f51761a;
                long j10 = cVar.f51733b;
                if (j10 <= 0) {
                    throw e10;
                }
                int i11 = cVar.read(bArr, i10, (int) j10);
                if (i11 == -1) {
                    throw new AssertionError();
                }
                i10 += i11;
            }
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public int readInt() throws IOException {
        e(4L);
        return this.f51761a.readInt();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public short readShort() throws IOException {
        e(2L);
        return this.f51761a.readShort();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public void skip(long j10) throws IOException {
        if (this.f51763c) {
            throw new IllegalStateException("closed");
        }
        while (j10 > 0) {
            c cVar = this.f51761a;
            if (cVar.f51733b == 0 && this.f51762b.b(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                throw new EOFException();
            }
            long jMin = Math.min(j10, this.f51761a.size());
            this.f51761a.skip(jMin);
            j10 -= jMin;
        }
    }

    public String toString() {
        return "buffer(" + this.f51762b + ")";
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String a(Charset charset) throws IOException {
        if (charset == null) {
            throw new IllegalArgumentException("charset == null");
        }
        this.f51761a.a(this.f51762b);
        return this.f51761a.a(charset);
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public int e() throws IOException {
        e(4L);
        return this.f51761a.e();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public String c() throws IOException {
        return d(Long.MAX_VALUE);
    }

    public boolean f(long j10) throws IOException {
        c cVar;
        if (j10 >= 0) {
            if (this.f51763c) {
                throw new IllegalStateException("closed");
            }
            do {
                cVar = this.f51761a;
                if (cVar.f51733b >= j10) {
                    return true;
                }
            } while (this.f51762b.b(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) != -1);
            return false;
        }
        throw new IllegalArgumentException("byteCount < 0: " + j10);
    }

    class a extends InputStream implements AutoCloseable {
        a() {
        }

        @Override // java.io.InputStream
        public int available() throws IOException {
            n nVar = n.this;
            if (nVar.f51763c) {
                throw new IOException("closed");
            }
            return (int) Math.min(nVar.f51761a.f51733b, SieveCacheKt.NodeLinkMask);
        }

        @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            n.this.close();
        }

        @Override // java.io.InputStream
        public int read() throws IOException {
            n nVar = n.this;
            if (nVar.f51763c) {
                throw new IOException("closed");
            }
            c cVar = nVar.f51761a;
            if (cVar.f51733b == 0 && nVar.f51762b.b(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                return -1;
            }
            return n.this.f51761a.readByte() & 255;
        }

        public String toString() {
            return n.this + ".inputStream()";
        }

        @Override // java.io.InputStream
        public int read(byte[] bArr, int i10, int i11) throws IOException {
            if (!n.this.f51763c) {
                u.a(bArr.length, i10, i11);
                n nVar = n.this;
                c cVar = nVar.f51761a;
                if (cVar.f51733b == 0 && nVar.f51762b.b(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                    return -1;
                }
                return n.this.f51761a.read(bArr, i10, i11);
            }
            throw new IOException("closed");
        }
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public long a(byte b10) throws IOException {
        return a(b10, 0L, Long.MAX_VALUE);
    }

    public long a(byte b10, long j10, long j11) throws IOException {
        if (this.f51763c) {
            throw new IllegalStateException("closed");
        }
        if (j10 < 0 || j11 < j10) {
            throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", Long.valueOf(j10), Long.valueOf(j11)));
        }
        long jMax = j10;
        while (jMax < j11) {
            byte b11 = b10;
            long j12 = j11;
            long jA = this.f51761a.a(b11, jMax, j12);
            if (jA != -1) {
                return jA;
            }
            c cVar = this.f51761a;
            long j13 = cVar.f51733b;
            if (j13 >= j12 || this.f51762b.b(cVar, PlaybackStateCompat.ACTION_PLAY_FROM_URI) == -1) {
                break;
            }
            jMax = Math.max(jMax, j13);
            b10 = b11;
            j11 = j12;
        }
        return -1L;
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public f b(long j10) throws IOException {
        e(j10);
        return this.f51761a.b(j10);
    }

    @Override // com.mbridge.msdk.thrid.okio.s
    public t b() {
        return this.f51762b.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.e
    public boolean a(long j10, f fVar) throws IOException {
        return a(j10, fVar, 0, fVar.j());
    }

    public boolean a(long j10, f fVar, int i10, int i11) throws IOException {
        if (!this.f51763c) {
            if (j10 < 0 || i10 < 0 || i11 < 0 || fVar.j() - i10 < i11) {
                return false;
            }
            for (int i12 = 0; i12 < i11; i12++) {
                long j11 = ((long) i12) + j10;
                if (!f(1 + j11) || this.f51761a.f(j11) != fVar.a(i10 + i12)) {
                    return false;
                }
            }
            return true;
        }
        throw new IllegalStateException("closed");
    }
}
