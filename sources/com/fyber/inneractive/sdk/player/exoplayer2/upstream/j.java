package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class j extends InputStream implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f23030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k f23031b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f23035f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f23033d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f23034e = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final byte[] f23032c = new byte[1];

    public j(h hVar, k kVar) {
        this.f23030a = hVar;
        this.f23031b = kVar;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f23034e) {
            return;
        }
        this.f23030a.close();
        this.f23034e = true;
    }

    @Override // java.io.InputStream
    public final int read() {
        byte[] bArr = this.f23032c;
        if (read(bArr, 0, bArr.length) == -1) {
            return -1;
        }
        return this.f23032c[0] & 255;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) {
        if (!this.f23034e) {
            if (!this.f23033d) {
                this.f23030a.a(this.f23031b);
                this.f23033d = true;
            }
            int i12 = this.f23030a.read(bArr, i10, i11);
            if (i12 == -1) {
                return -1;
            }
            this.f23035f += (long) i12;
            return i12;
        }
        throw new IllegalStateException();
    }
}
