package com.mbridge.msdk.thrid.okio;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes10.dex */
final class m implements d, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f51758a = new c();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f51759b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f51760c;

    m(r rVar) {
        if (rVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.f51759b = rVar;
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public c a() {
        return this.f51758a;
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public t b() {
        return this.f51759b.b();
    }

    @Override // com.mbridge.msdk.thrid.okio.r, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f51760c) {
            return;
        }
        try {
            c cVar = this.f51758a;
            long j10 = cVar.f51733b;
            if (j10 > 0) {
                this.f51759b.a(cVar, j10);
            }
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f51759b.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.f51760c = true;
        if (th != null) {
            u.a(th);
        }
    }

    public d d() throws IOException {
        if (this.f51760c) {
            throw new IllegalStateException("closed");
        }
        long jM = this.f51758a.m();
        if (jM > 0) {
            this.f51759b.a(this.f51758a, jM);
        }
        return this;
    }

    @Override // com.mbridge.msdk.thrid.okio.d, com.mbridge.msdk.thrid.okio.r, java.io.Flushable
    public void flush() throws IOException {
        if (this.f51760c) {
            throw new IllegalStateException("closed");
        }
        c cVar = this.f51758a;
        long j10 = cVar.f51733b;
        if (j10 > 0) {
            this.f51759b.a(cVar, j10);
        }
        this.f51759b.flush();
    }

    @Override // java.nio.channels.Channel
    public boolean isOpen() {
        return !this.f51760c;
    }

    public String toString() {
        return "buffer(" + this.f51759b + ")";
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d write(byte[] bArr) throws IOException {
        if (this.f51760c) {
            throw new IllegalStateException("closed");
        }
        this.f51758a.write(bArr);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeByte(int i10) throws IOException {
        if (this.f51760c) {
            throw new IllegalStateException("closed");
        }
        this.f51758a.writeByte(i10);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeInt(int i10) throws IOException {
        if (this.f51760c) {
            throw new IllegalStateException("closed");
        }
        this.f51758a.writeInt(i10);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d writeShort(int i10) throws IOException {
        if (this.f51760c) {
            throw new IllegalStateException("closed");
        }
        this.f51758a.writeShort(i10);
        return d();
    }

    @Override // com.mbridge.msdk.thrid.okio.r
    public void a(c cVar, long j10) throws IOException {
        if (this.f51760c) {
            throw new IllegalStateException("closed");
        }
        this.f51758a.a(cVar, j10);
        d();
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d write(byte[] bArr, int i10, int i11) throws IOException {
        if (!this.f51760c) {
            this.f51758a.write(bArr, i10, i11);
            return d();
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d a(String str) throws IOException {
        if (!this.f51760c) {
            this.f51758a.a(str);
            return d();
        }
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.WritableByteChannel
    public int write(ByteBuffer byteBuffer) throws IOException {
        if (!this.f51760c) {
            int iWrite = this.f51758a.write(byteBuffer);
            d();
            return iWrite;
        }
        throw new IllegalStateException("closed");
    }

    @Override // com.mbridge.msdk.thrid.okio.d
    public d a(long j10) throws IOException {
        if (!this.f51760c) {
            this.f51758a.a(j10);
            return d();
        }
        throw new IllegalStateException("closed");
    }
}
