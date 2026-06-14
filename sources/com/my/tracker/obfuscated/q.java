package com.my.tracker.obfuscated;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: loaded from: classes11.dex */
public final class q extends r1 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f61787c;

    private static class a extends ByteArrayOutputStream {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f61788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f61789b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f61790c;

        public a(int i10) {
            super(i10);
            this.f61788a = i10;
            this.f61789b = Integer.MAX_VALUE;
            this.f61790c = -1;
        }

        public synchronized void m() {
            try {
                reset();
                if (x2.a()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("SimpleByteArrayOutputStream: minSize=");
                    int i10 = this.f61789b;
                    if (i10 == Integer.MAX_VALUE) {
                        i10 = 0;
                    }
                    sb2.append(i10);
                    sb2.append(", maxSize=");
                    sb2.append(this.f61790c);
                    sb2.append(", truncate=");
                    sb2.append(this.f61788a);
                    x2.a(sb2.toString());
                }
                this.f61789b = Integer.MAX_VALUE;
                this.f61790c = -1;
                int length = ((ByteArrayOutputStream) this).buf.length;
                int i11 = this.f61788a;
                if (length > i11) {
                    ((ByteArrayOutputStream) this).buf = new byte[i11];
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @Override // java.io.ByteArrayOutputStream
        public synchronized void reset() {
            try {
                int i10 = ((ByteArrayOutputStream) this).count;
                if (i10 > 0) {
                    this.f61789b = Math.min(this.f61789b, i10);
                }
                this.f61790c = Math.max(((ByteArrayOutputStream) this).count, this.f61790c);
                super.reset();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public q(int i10) {
        super(new a(i10));
        this.f61787c = (a) this.f61812a;
    }

    public void a() {
        this.f61787c.reset();
    }

    public int b() {
        return this.f61787c.size();
    }

    public byte[] c() {
        return this.f61787c.toByteArray();
    }

    public void d() {
        this.f61787c.m();
    }

    public void a(OutputStream outputStream) throws IOException {
        this.f61787c.writeTo(outputStream);
    }
}
