package com.google.firebase.encoders.proto;

import androidx.annotation.NonNull;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes9.dex */
final class LengthCountingOutputStream extends OutputStream {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f32778b = 0;

    LengthCountingOutputStream() {
    }

    long m() {
        return this.f32778b;
    }

    @Override // java.io.OutputStream
    public void write(int i10) {
        this.f32778b++;
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        this.f32778b += (long) bArr.length;
    }

    @Override // java.io.OutputStream
    public void write(@NonNull byte[] bArr, int i10, int i11) {
        int i12;
        if (i10 >= 0 && i10 <= bArr.length && i11 >= 0 && (i12 = i10 + i11) <= bArr.length && i12 >= 0) {
            this.f32778b += (long) i11;
            return;
        }
        throw new IndexOutOfBoundsException();
    }
}
