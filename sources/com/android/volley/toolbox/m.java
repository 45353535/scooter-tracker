package com.android.volley.toolbox;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes5.dex */
public class m extends ByteArrayOutputStream implements AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c f7585b;

    public m(c cVar, int i10) {
        this.f7585b = cVar;
        ((ByteArrayOutputStream) this).buf = cVar.a(Math.max(i10, 256));
    }

    private void c(int i10) {
        int i11 = ((ByteArrayOutputStream) this).count;
        if (i11 + i10 <= ((ByteArrayOutputStream) this).buf.length) {
            return;
        }
        byte[] bArrA = this.f7585b.a((i11 + i10) * 2);
        System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrA, 0, ((ByteArrayOutputStream) this).count);
        this.f7585b.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = bArrA;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.f7585b.b(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public void finalize() {
        this.f7585b.b(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(byte[] bArr, int i10, int i11) {
        c(i11);
        super.write(bArr, i10, i11);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public synchronized void write(int i10) {
        c(1);
        super.write(i10);
    }
}
