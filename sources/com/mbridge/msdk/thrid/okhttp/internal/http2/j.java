package com.mbridge.msdk.thrid.okhttp.internal.http2;

import androidx.collection.SieveCacheKt;
import com.mbridge.msdk.thrid.okhttp.internal.http2.d;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes10.dex */
final class j implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Logger f51502g = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okio.d f51503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f51504b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.mbridge.msdk.thrid.okio.c f51505c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f51506d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f51507e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final d.b f51508f;

    j(com.mbridge.msdk.thrid.okio.d dVar, boolean z10) {
        this.f51503a = dVar;
        this.f51504b = z10;
        com.mbridge.msdk.thrid.okio.c cVar = new com.mbridge.msdk.thrid.okio.c();
        this.f51505c = cVar;
        this.f51508f = new d.b(cVar);
        this.f51506d = 16384;
    }

    public synchronized void a(m mVar) throws IOException {
        try {
            if (this.f51507e) {
                throw new IOException("closed");
            }
            this.f51506d = mVar.c(this.f51506d);
            if (mVar.b() != -1) {
                this.f51508f.b(mVar.b());
            }
            a(0, 0, (byte) 4, (byte) 1);
            this.f51503a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void b(m mVar) throws IOException {
        try {
            if (this.f51507e) {
                throw new IOException("closed");
            }
            int i10 = 0;
            a(0, mVar.d() * 6, (byte) 4, (byte) 0);
            while (i10 < 10) {
                if (mVar.d(i10)) {
                    this.f51503a.writeShort(i10 == 4 ? 3 : i10 == 7 ? 4 : i10);
                    this.f51503a.writeInt(mVar.a(i10));
                }
                i10++;
            }
            this.f51503a.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() throws IOException {
        this.f51507e = true;
        this.f51503a.close();
    }

    public synchronized void d() throws IOException {
        try {
            if (this.f51507e) {
                throw new IOException("closed");
            }
            if (this.f51504b) {
                Logger logger = f51502g;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(com.mbridge.msdk.thrid.okhttp.internal.c.a(">> CONNECTION %s", e.f51382a.g()));
                }
                this.f51503a.write(e.f51382a.l());
                this.f51503a.flush();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void flush() throws IOException {
        if (this.f51507e) {
            throw new IOException("closed");
        }
        this.f51503a.flush();
    }

    public int h() {
        return this.f51506d;
    }

    public synchronized void a(int i10, int i11, List<c> list) throws IOException {
        if (!this.f51507e) {
            this.f51508f.a(list);
            long size = this.f51505c.size();
            int iMin = (int) Math.min(this.f51506d - 4, size);
            long j10 = iMin;
            a(i10, iMin + 4, (byte) 5, size == j10 ? (byte) 4 : (byte) 0);
            this.f51503a.writeInt(i11 & Integer.MAX_VALUE);
            this.f51503a.a(this.f51505c, j10);
            if (size > j10) {
                b(i10, size - j10);
            }
        } else {
            throw new IOException("closed");
        }
    }

    private void b(int i10, long j10) throws IOException {
        while (j10 > 0) {
            int iMin = (int) Math.min(this.f51506d, j10);
            long j11 = iMin;
            j10 -= j11;
            a(i10, iMin, (byte) 9, j10 == 0 ? (byte) 4 : (byte) 0);
            this.f51503a.a(this.f51505c, j11);
        }
    }

    public synchronized void a(boolean z10, int i10, int i11, List<c> list) throws IOException {
        if (!this.f51507e) {
            a(z10, i10, list);
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(int i10, b bVar) throws IOException {
        if (!this.f51507e) {
            if (bVar.f51352a != -1) {
                a(i10, 4, (byte) 3, (byte) 0);
                this.f51503a.writeInt(bVar.f51352a);
                this.f51503a.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(boolean z10, int i10, com.mbridge.msdk.thrid.okio.c cVar, int i11) throws IOException {
        if (!this.f51507e) {
            a(i10, z10 ? (byte) 1 : (byte) 0, cVar, i11);
        } else {
            throw new IOException("closed");
        }
    }

    void a(int i10, byte b10, com.mbridge.msdk.thrid.okio.c cVar, int i11) throws IOException {
        a(i10, i11, (byte) 0, b10);
        if (i11 > 0) {
            this.f51503a.a(cVar, i11);
        }
    }

    public synchronized void a(boolean z10, int i10, int i11) throws IOException {
        if (!this.f51507e) {
            a(0, 8, (byte) 6, z10 ? (byte) 1 : (byte) 0);
            this.f51503a.writeInt(i10);
            this.f51503a.writeInt(i11);
            this.f51503a.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public synchronized void a(int i10, b bVar, byte[] bArr) throws IOException {
        try {
            if (!this.f51507e) {
                if (bVar.f51352a != -1) {
                    a(0, bArr.length + 8, (byte) 7, (byte) 0);
                    this.f51503a.writeInt(i10);
                    this.f51503a.writeInt(bVar.f51352a);
                    if (bArr.length > 0) {
                        this.f51503a.write(bArr);
                    }
                    this.f51503a.flush();
                } else {
                    throw e.a("errorCode.httpCode == -1", new Object[0]);
                }
            } else {
                throw new IOException("closed");
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public synchronized void a(int i10, long j10) throws IOException {
        if (this.f51507e) {
            throw new IOException("closed");
        }
        if (j10 != 0 && j10 <= SieveCacheKt.NodeLinkMask) {
            a(i10, 4, (byte) 8, (byte) 0);
            this.f51503a.writeInt((int) j10);
            this.f51503a.flush();
        } else {
            throw e.a("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", Long.valueOf(j10));
        }
    }

    public void a(int i10, int i11, byte b10, byte b11) throws IOException {
        Logger logger = f51502g;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(e.a(false, i10, i11, b10, b11));
        }
        int i12 = this.f51506d;
        if (i11 > i12) {
            throw e.a("FRAME_SIZE_ERROR length > %d: %d", Integer.valueOf(i12), Integer.valueOf(i11));
        }
        if ((Integer.MIN_VALUE & i10) != 0) {
            throw e.a("reserved bit set: %s", Integer.valueOf(i10));
        }
        a(this.f51503a, i11);
        this.f51503a.writeByte(b10 & 255);
        this.f51503a.writeByte(b11 & 255);
        this.f51503a.writeInt(i10 & Integer.MAX_VALUE);
    }

    private static void a(com.mbridge.msdk.thrid.okio.d dVar, int i10) throws IOException {
        dVar.writeByte((i10 >>> 16) & 255);
        dVar.writeByte((i10 >>> 8) & 255);
        dVar.writeByte(i10 & 255);
    }

    void a(boolean z10, int i10, List<c> list) throws IOException {
        if (!this.f51507e) {
            this.f51508f.a(list);
            long size = this.f51505c.size();
            int iMin = (int) Math.min(this.f51506d, size);
            long j10 = iMin;
            byte b10 = size == j10 ? (byte) 4 : (byte) 0;
            if (z10) {
                b10 = (byte) (b10 | 1);
            }
            a(i10, iMin, (byte) 1, b10);
            this.f51503a.a(this.f51505c, j10);
            if (size > j10) {
                b(i10, size - j10);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }
}
