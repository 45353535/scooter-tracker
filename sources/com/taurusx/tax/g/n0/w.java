package com.taurusx.tax.g.n0;

import com.taurusx.tax.g.n;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes11.dex */
public class w implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte f66185a = 10;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final byte f66186s = 13;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f66187c;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f66188o;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Charset f66189w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public byte[] f66190y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final InputStream f66191z;

    public class z extends ByteArrayOutputStream {
        public z(int i10) {
            super(i10);
        }

        @Override // java.io.ByteArrayOutputStream
        public String toString() {
            int i10 = ((ByteArrayOutputStream) this).count;
            if (i10 > 0) {
                int i11 = i10 - 1;
                if (((ByteArrayOutputStream) this).buf[i11] == 13) {
                    i10 = i11;
                }
            }
            try {
                return new String(((ByteArrayOutputStream) this).buf, 0, i10, w.this.f66189w.name());
            } catch (UnsupportedEncodingException e10) {
                throw new AssertionError(e10);
            }
        }
    }

    public w(InputStream inputStream, Charset charset) {
        this(inputStream, 8192, charset);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        synchronized (this.f66191z) {
            try {
                if (this.f66190y != null) {
                    this.f66190y = null;
                    this.f66191z.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.String w() throws java.io.IOException {
        /*
            r7 = this;
            java.io.InputStream r0 = r7.f66191z
            monitor-enter(r0)
            byte[] r1 = r7.f66190y     // Catch: java.lang.Throwable -> L11
            if (r1 == 0) goto L83
            int r1 = r7.f66187c     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f66188o     // Catch: java.lang.Throwable -> L11
            if (r1 < r2) goto L14
            r7.z()     // Catch: java.lang.Throwable -> L11
            goto L14
        L11:
            r1 = move-exception
            goto L8b
        L14:
            int r1 = r7.f66187c     // Catch: java.lang.Throwable -> L11
        L16:
            int r2 = r7.f66188o     // Catch: java.lang.Throwable -> L11
            r3 = 10
            if (r1 == r2) goto L45
            byte[] r2 = r7.f66190y     // Catch: java.lang.Throwable -> L11
            r4 = r2[r1]     // Catch: java.lang.Throwable -> L11
            if (r4 != r3) goto L42
            int r3 = r7.f66187c     // Catch: java.lang.Throwable -> L11
            if (r1 == r3) goto L2f
            int r4 = r1 + (-1)
            r5 = r2[r4]     // Catch: java.lang.Throwable -> L11
            r6 = 13
            if (r5 != r6) goto L2f
            goto L30
        L2f:
            r4 = r1
        L30:
            java.lang.String r5 = new java.lang.String     // Catch: java.lang.Throwable -> L11
            int r4 = r4 - r3
            java.nio.charset.Charset r6 = r7.f66189w     // Catch: java.lang.Throwable -> L11
            java.lang.String r6 = r6.name()     // Catch: java.lang.Throwable -> L11
            r5.<init>(r2, r3, r4, r6)     // Catch: java.lang.Throwable -> L11
            int r1 = r1 + 1
            r7.f66187c = r1     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r5
        L42:
            int r1 = r1 + 1
            goto L16
        L45:
            com.taurusx.tax.g.n0.w$z r1 = new com.taurusx.tax.g.n0.w$z     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f66188o     // Catch: java.lang.Throwable -> L11
            int r4 = r7.f66187c     // Catch: java.lang.Throwable -> L11
            int r2 = r2 - r4
            int r2 = r2 + 80
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
        L51:
            byte[] r2 = r7.f66190y     // Catch: java.lang.Throwable -> L11
            int r4 = r7.f66187c     // Catch: java.lang.Throwable -> L11
            int r5 = r7.f66188o     // Catch: java.lang.Throwable -> L11
            int r5 = r5 - r4
            r1.write(r2, r4, r5)     // Catch: java.lang.Throwable -> L11
            r2 = -1
            r7.f66188o = r2     // Catch: java.lang.Throwable -> L11
            r7.z()     // Catch: java.lang.Throwable -> L11
            int r2 = r7.f66187c     // Catch: java.lang.Throwable -> L11
        L63:
            int r4 = r7.f66188o     // Catch: java.lang.Throwable -> L11
            if (r2 == r4) goto L51
            byte[] r4 = r7.f66190y     // Catch: java.lang.Throwable -> L11
            r5 = r4[r2]     // Catch: java.lang.Throwable -> L11
            if (r5 != r3) goto L80
            int r3 = r7.f66187c     // Catch: java.lang.Throwable -> L11
            if (r2 == r3) goto L76
            int r5 = r2 - r3
            r1.write(r4, r3, r5)     // Catch: java.lang.Throwable -> L11
        L76:
            int r2 = r2 + 1
            r7.f66187c = r2     // Catch: java.lang.Throwable -> L11
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L11
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            return r1
        L80:
            int r2 = r2 + 1
            goto L63
        L83:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> L11
            java.lang.String r2 = "LineReader is closed"
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L11
            throw r1     // Catch: java.lang.Throwable -> L11
        L8b:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L11
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.taurusx.tax.g.n0.w.w():java.lang.String");
    }

    public w(InputStream inputStream, int i10, Charset charset) {
        if (inputStream == null || charset == null) {
            throw null;
        }
        if (i10 < 0) {
            throw new IllegalArgumentException("capacity <= 0");
        }
        if (!charset.equals(n.f66182z)) {
            throw new IllegalArgumentException("Unsupported encoding");
        }
        this.f66191z = inputStream;
        this.f66189w = charset;
        this.f66190y = new byte[i10];
    }

    private void z() throws IOException {
        InputStream inputStream = this.f66191z;
        byte[] bArr = this.f66190y;
        int i10 = inputStream.read(bArr, 0, bArr.length);
        if (i10 == -1) {
            throw new EOFException();
        }
        this.f66187c = 0;
        this.f66188o = i10;
    }
}
