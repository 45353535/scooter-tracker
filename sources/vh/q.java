package vh;

import java.io.IOException;
import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes12.dex */
public final class q implements j0, AutoCloseable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0 f106892b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Deflater f106893c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final i f106894d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f106895e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CRC32 f106896f;

    public q(j0 sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        e0 e0Var = new e0(sink);
        this.f106892b = e0Var;
        Deflater deflater = new Deflater(-1, true);
        this.f106893c = deflater;
        this.f106894d = new i(e0Var, deflater);
        this.f106896f = new CRC32();
        e eVar = e0Var.f106825c;
        eVar.writeShort(8075);
        eVar.writeByte(8);
        eVar.writeByte(0);
        eVar.writeInt(0);
        eVar.writeByte(0);
        eVar.writeByte(0);
    }

    private final void c(e eVar, long j10) {
        g0 g0Var = eVar.f106814b;
        Intrinsics.checkNotNull(g0Var);
        while (j10 > 0) {
            int iMin = (int) Math.min(j10, g0Var.f106835c - g0Var.f106834b);
            this.f106896f.update(g0Var.f106833a, g0Var.f106834b, iMin);
            j10 -= (long) iMin;
            g0Var = g0Var.f106838f;
            Intrinsics.checkNotNull(g0Var);
        }
    }

    private final void m() {
        this.f106892b.c((int) this.f106896f.getValue());
        this.f106892b.c((int) this.f106893c.getBytesRead());
    }

    @Override // vh.j0
    public void H(e source, long j10) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        if (j10 < 0) {
            throw new IllegalArgumentException(("byteCount < 0: " + j10).toString());
        }
        if (j10 == 0) {
            return;
        }
        c(source, j10);
        this.f106894d.H(source, j10);
    }

    @Override // vh.j0, java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Throwable {
        if (this.f106895e) {
            return;
        }
        try {
            this.f106894d.m();
            m();
            th = null;
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.f106893c.end();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        try {
            this.f106892b.close();
        } catch (Throwable th4) {
            if (th == null) {
                th = th4;
            }
        }
        this.f106895e = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // vh.j0, java.io.Flushable
    public void flush() throws IOException {
        this.f106894d.flush();
    }

    @Override // vh.j0
    public m0 timeout() {
        return this.f106892b.timeout();
    }
}
