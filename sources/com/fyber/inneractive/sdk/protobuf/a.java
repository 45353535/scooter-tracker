package com.fyber.inneractive.sdk.protobuf;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes7.dex */
public final class a extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f23428a;

    public a(InputStream inputStream, int i10) {
        super(inputStream);
        this.f23428a = i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(super.available(), this.f23428a);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        if (this.f23428a <= 0) {
            return -1;
        }
        int i10 = super.read();
        if (i10 >= 0) {
            this.f23428a--;
        }
        return i10;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j10) throws IOException {
        long jSkip = super.skip(Math.min(j10, this.f23428a));
        if (jSkip >= 0) {
            this.f23428a = (int) (((long) this.f23428a) - jSkip);
        }
        return jSkip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f23428a;
        if (i12 <= 0) {
            return -1;
        }
        int i13 = super.read(bArr, i10, Math.min(i11, i12));
        if (i13 >= 0) {
            this.f23428a -= i13;
        }
        return i13;
    }
}
