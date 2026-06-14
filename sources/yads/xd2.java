package yads;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class xd2 extends ByteArrayOutputStream implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final xq f117803a;

    public xd2(xq xqVar, int i10) {
        this.f117803a = xqVar;
        ((ByteArrayOutputStream) this).buf = xqVar.a(Math.max(i10, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f117803a.a(((ByteArrayOutputStream) this).buf);
        ((ByteArrayOutputStream) this).buf = null;
        super.close();
    }

    public final void finalize() {
        this.f117803a.a(((ByteArrayOutputStream) this).buf);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i10) {
        int i11 = ((ByteArrayOutputStream) this).count + 1;
        if (i11 > ((ByteArrayOutputStream) this).buf.length) {
            byte[] bArrA = this.f117803a.a(i11 * 2);
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrA, 0, ((ByteArrayOutputStream) this).count);
            this.f117803a.a(((ByteArrayOutputStream) this).buf);
            ((ByteArrayOutputStream) this).buf = bArrA;
        }
        super.write(i10);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i10, int i11) {
        int i12 = ((ByteArrayOutputStream) this).count + i11;
        if (i12 > ((ByteArrayOutputStream) this).buf.length) {
            byte[] bArrA = this.f117803a.a(i12 * 2);
            System.arraycopy(((ByteArrayOutputStream) this).buf, 0, bArrA, 0, ((ByteArrayOutputStream) this).count);
            this.f117803a.a(((ByteArrayOutputStream) this).buf);
            ((ByteArrayOutputStream) this).buf = bArrA;
        }
        super.write(bArr, i10, i11);
    }
}
