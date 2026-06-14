package ph;

import androidx.collection.SieveCacheKt;
import java.io.Closeable;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import ph.d;

/* JADX INFO: loaded from: classes10.dex */
public final class j implements Closeable, AutoCloseable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final a f98528h = new a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Logger f98529i = Logger.getLogger(e.class.getName());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final vh.f f98530b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f98531c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final vh.e f98532d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f98533e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f98534f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final d.b f98535g;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    public j(vh.f sink, boolean z10) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        this.f98530b = sink;
        this.f98531c = z10;
        vh.e eVar = new vh.e();
        this.f98532d = eVar;
        this.f98533e = 16384;
        this.f98535g = new d.b(0, false, eVar, 3, null);
    }

    private final void V(int i10, long j10) {
        while (j10 > 0) {
            long jMin = Math.min(this.f98533e, j10);
            j10 -= jMin;
            p(i10, (int) jMin, 9, j10 == 0 ? 4 : 0);
            this.f98530b.H(this.f98532d, jMin);
        }
    }

    public final synchronized void M(int i10, b errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        if (this.f98534f) {
            throw new IOException("closed");
        }
        if (errorCode.g() == -1) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        p(i10, 4, 3, 0);
        this.f98530b.writeInt(errorCode.g());
        this.f98530b.flush();
    }

    public final synchronized void R(m settings) {
        try {
            Intrinsics.checkNotNullParameter(settings, "settings");
            if (this.f98534f) {
                throw new IOException("closed");
            }
            int i10 = 0;
            p(0, settings.i() * 6, 4, 0);
            while (i10 < 10) {
                if (settings.f(i10)) {
                    this.f98530b.writeShort(i10 != 4 ? i10 != 7 ? i10 : 4 : 3);
                    this.f98530b.writeInt(settings.a(i10));
                }
                i10++;
            }
            this.f98530b.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void U(int i10, long j10) {
        if (this.f98534f) {
            throw new IOException("closed");
        }
        if (j10 == 0 || j10 > SieveCacheKt.NodeLinkMask) {
            throw new IllegalArgumentException(("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: " + j10).toString());
        }
        p(i10, 4, 8, 0);
        this.f98530b.writeInt((int) j10);
        this.f98530b.flush();
    }

    public final synchronized void c(m peerSettings) {
        try {
            Intrinsics.checkNotNullParameter(peerSettings, "peerSettings");
            if (this.f98534f) {
                throw new IOException("closed");
            }
            this.f98533e = peerSettings.e(this.f98533e);
            if (peerSettings.b() != -1) {
                this.f98535g.e(peerSettings.b());
            }
            p(0, 0, 4, 1);
            this.f98530b.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public synchronized void close() {
        this.f98534f = true;
        this.f98530b.close();
    }

    public final synchronized void flush() {
        if (this.f98534f) {
            throw new IOException("closed");
        }
        this.f98530b.flush();
    }

    public final synchronized void m() {
        try {
            if (this.f98534f) {
                throw new IOException("closed");
            }
            if (this.f98531c) {
                Logger logger = f98529i;
                if (logger.isLoggable(Level.FINE)) {
                    logger.fine(ih.d.t(">> CONNECTION " + e.f98403b.r(), new Object[0]));
                }
                this.f98530b.r(e.f98403b);
                this.f98530b.flush();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void n(boolean z10, int i10, vh.e eVar, int i11) {
        if (this.f98534f) {
            throw new IOException("closed");
        }
        o(i10, z10 ? 1 : 0, eVar, i11);
    }

    public final void o(int i10, int i11, vh.e eVar, int i12) {
        p(i10, i12, 0, i11);
        if (i12 > 0) {
            vh.f fVar = this.f98530b;
            Intrinsics.checkNotNull(eVar);
            fVar.H(eVar, i12);
        }
    }

    public final void p(int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        Logger logger = f98529i;
        if (logger.isLoggable(Level.FINE)) {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
            logger.fine(e.f98402a.c(false, i14, i15, i16, i17));
        } else {
            i14 = i10;
            i15 = i11;
            i16 = i12;
            i17 = i13;
        }
        if (i15 > this.f98533e) {
            throw new IllegalArgumentException(("FRAME_SIZE_ERROR length > " + this.f98533e + ": " + i15).toString());
        }
        if ((Integer.MIN_VALUE & i14) != 0) {
            throw new IllegalArgumentException(("reserved bit set: " + i14).toString());
        }
        ih.d.a0(this.f98530b, i15);
        this.f98530b.writeByte(i16 & 255);
        this.f98530b.writeByte(i17 & 255);
        this.f98530b.writeInt(Integer.MAX_VALUE & i14);
    }

    public final synchronized void q(int i10, b errorCode, byte[] debugData) {
        try {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            if (this.f98534f) {
                throw new IOException("closed");
            }
            if (errorCode.g() == -1) {
                throw new IllegalArgumentException("errorCode.httpCode == -1");
            }
            p(0, debugData.length + 8, 7, 0);
            this.f98530b.writeInt(i10);
            this.f98530b.writeInt(errorCode.g());
            if (!(debugData.length == 0)) {
                this.f98530b.write(debugData);
            }
            this.f98530b.flush();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void s(boolean z10, int i10, List headerBlock) {
        Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
        if (this.f98534f) {
            throw new IOException("closed");
        }
        this.f98535g.g(headerBlock);
        long jE0 = this.f98532d.e0();
        long jMin = Math.min(this.f98533e, jE0);
        int i11 = jE0 == jMin ? 4 : 0;
        if (z10) {
            i11 |= 1;
        }
        p(i10, (int) jMin, 1, i11);
        this.f98530b.H(this.f98532d, jMin);
        if (jE0 > jMin) {
            V(i10, jE0 - jMin);
        }
    }

    public final int w() {
        return this.f98533e;
    }

    public final synchronized void y(boolean z10, int i10, int i11) {
        if (this.f98534f) {
            throw new IOException("closed");
        }
        p(0, 8, 6, z10 ? 1 : 0);
        this.f98530b.writeInt(i10);
        this.f98530b.writeInt(i11);
        this.f98530b.flush();
    }

    public final synchronized void z(int i10, int i11, List requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        if (this.f98534f) {
            throw new IOException("closed");
        }
        this.f98535g.g(requestHeaders);
        long jE0 = this.f98532d.e0();
        int iMin = (int) Math.min(((long) this.f98533e) - 4, jE0);
        long j10 = iMin;
        p(i10, iMin + 4, 5, jE0 == j10 ? 4 : 0);
        this.f98530b.writeInt(i11 & Integer.MAX_VALUE);
        this.f98530b.H(this.f98532d, j10);
        if (jE0 > j10) {
            V(i10, jE0 - j10);
        }
    }
}
