package yads;

import java.io.InputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class e30 extends InputStream implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c30 f110164a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final h30 f110165b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f110167d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f110168e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f110166c = new byte[1];

    public e30(d13 d13Var, h30 h30Var) {
        this.f110164a = d13Var;
        this.f110165b = h30Var;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f110168e) {
            return;
        }
        this.f110164a.close();
        this.f110168e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f110166c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return this.f110166c[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        if (!this.f110168e) {
            if (!this.f110167d) {
                this.f110164a.a(this.f110165b);
                this.f110167d = true;
            }
            int iC = this.f110164a.c(bArr, i10, i11);
            if (iC == -1) {
                return -1;
            }
            return iC;
        }
        throw new IllegalStateException();
    }
}
