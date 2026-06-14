package io.bidmachine.media3.exoplayer;

import ga.f0;
import io.bidmachine.media3.exoplayer.j2;
import j$.util.Objects;

/* JADX INFO: loaded from: classes12.dex */
public abstract class h implements i2, j2 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f80876c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private u9.k0 f80878e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f80879f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private v9.c2 f80880g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private q9.h f80881h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f80882i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private ga.c1 f80883j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private io.bidmachine.media3.common.a[] f80884k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private long f80885l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f80886m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f80888o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private boolean f80889p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private j2.a f80891r;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f80875b = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final u9.d0 f80877d = new u9.d0();

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private long f80887n = Long.MIN_VALUE;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private n9.e0 f80890q = n9.e0.f95245a;

    public h(int i10) {
        this.f80876c = i10;
    }

    private void F(long j10, boolean z10) {
        this.f80888o = false;
        this.f80886m = j10;
        this.f80887n = j10;
        w(j10, z10);
    }

    protected void A() {
    }

    protected void B() {
    }

    protected final int E(u9.d0 d0Var, t9.f fVar, int i10) {
        int iD = ((ga.c1) q9.a.e(this.f80883j)).d(d0Var, fVar, i10);
        if (iD != -4) {
            if (iD == -5) {
                io.bidmachine.media3.common.a aVar = (io.bidmachine.media3.common.a) q9.a.e(d0Var.f105308b);
                if (aVar.f80566t != Long.MAX_VALUE) {
                    d0Var.f105308b = aVar.b().y0(aVar.f80566t + this.f80885l).N();
                }
            }
            return iD;
        }
        if (fVar.f()) {
            this.f80887n = Long.MIN_VALUE;
            return this.f80888o ? -4 : -3;
        }
        long j10 = fVar.f104990g + this.f80885l;
        fVar.f104990g = j10;
        this.f80887n = Math.max(this.f80887n, j10);
        return iD;
    }

    protected int G(long j10) {
        return ((ga.c1) q9.a.e(this.f80883j)).skipData(j10 - this.f80885l);
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public final void c(n9.e0 e0Var) {
        if (Objects.equals(this.f80890q, e0Var)) {
            return;
        }
        this.f80890q = e0Var;
        D(e0Var);
    }

    @Override // io.bidmachine.media3.exoplayer.j2
    public final void clearListener() {
        synchronized (this.f80875b) {
            this.f80891r = null;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public final void d(u9.k0 k0Var, io.bidmachine.media3.common.a[] aVarArr, ga.c1 c1Var, long j10, boolean z10, boolean z11, long j11, long j12, f0.b bVar) {
        q9.a.g(this.f80882i == 0);
        this.f80878e = k0Var;
        this.f80882i = 1;
        u(z10, z11);
        f(aVarArr, c1Var, j11, j12, bVar);
        F(j11, z10);
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public final void disable() {
        q9.a.g(this.f80882i == 1);
        this.f80877d.a();
        this.f80882i = 0;
        this.f80883j = null;
        this.f80884k = null;
        this.f80888o = false;
        t();
    }

    @Override // io.bidmachine.media3.exoplayer.j2
    public final void e(j2.a aVar) {
        synchronized (this.f80875b) {
            this.f80891r = aVar;
        }
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public /* synthetic */ void enableMayRenderStartOfStream() {
        u9.i0.a(this);
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public final void f(io.bidmachine.media3.common.a[] aVarArr, ga.c1 c1Var, long j10, long j11, f0.b bVar) {
        q9.a.g(!this.f80888o);
        this.f80883j = c1Var;
        if (this.f80887n == Long.MIN_VALUE) {
            this.f80887n = j10;
        }
        this.f80884k = aVarArr;
        this.f80885l = j11;
        C(aVarArr, j10, j11, bVar);
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public final void g(int i10, v9.c2 c2Var, q9.h hVar) {
        this.f80879f = i10;
        this.f80880g = c2Var;
        this.f80881h = hVar;
        v();
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public final j2 getCapabilities() {
        return this;
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public /* synthetic */ long getDurationToProgressUs(long j10, long j11) {
        return u9.i0.b(this, j10, j11);
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public u9.g0 getMediaClock() {
        return null;
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public final long getReadingPositionUs() {
        return this.f80887n;
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public final int getState() {
        return this.f80882i;
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public final ga.c1 getStream() {
        return this.f80883j;
    }

    @Override // io.bidmachine.media3.exoplayer.i2, io.bidmachine.media3.exoplayer.j2
    public final int getTrackType() {
        return this.f80876c;
    }

    protected final s h(Throwable th2, io.bidmachine.media3.common.a aVar, int i10) {
        return i(th2, aVar, false, i10);
    }

    @Override // io.bidmachine.media3.exoplayer.g2.b
    public void handleMessage(int i10, Object obj) {
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public final boolean hasReadStreamToEnd() {
        return this.f80887n == Long.MIN_VALUE;
    }

    protected final s i(Throwable th2, io.bidmachine.media3.common.a aVar, boolean z10, int i10) {
        int iH;
        if (aVar == null || this.f80889p) {
            iH = 4;
        } else {
            this.f80889p = true;
            try {
                iH = u9.j0.h(a(aVar));
            } catch (s unused) {
                iH = 4;
            } finally {
                this.f80889p = false;
            }
        }
        return s.b(th2, getName(), m(), aVar, iH, z10, i10);
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public final boolean isCurrentStreamFinal() {
        return this.f80888o;
    }

    protected final q9.h j() {
        return (q9.h) q9.a.e(this.f80881h);
    }

    protected final u9.k0 k() {
        return (u9.k0) q9.a.e(this.f80878e);
    }

    protected final u9.d0 l() {
        this.f80877d.a();
        return this.f80877d;
    }

    protected final int m() {
        return this.f80879f;
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public final void maybeThrowStreamError() {
        ((ga.c1) q9.a.e(this.f80883j)).maybeThrowError();
    }

    protected final long n() {
        return this.f80886m;
    }

    protected final v9.c2 o() {
        return (v9.c2) q9.a.e(this.f80880g);
    }

    protected final io.bidmachine.media3.common.a[] p() {
        return (io.bidmachine.media3.common.a[]) q9.a.e(this.f80884k);
    }

    protected final long q() {
        return this.f80885l;
    }

    protected final n9.e0 r() {
        return this.f80890q;
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public final void release() {
        q9.a.g(this.f80882i == 0);
        x();
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public final void reset() {
        q9.a.g(this.f80882i == 0);
        this.f80877d.a();
        z();
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public final void resetPosition(long j10) {
        F(j10, false);
    }

    protected final boolean s() {
        return hasReadStreamToEnd() ? this.f80888o : ((ga.c1) q9.a.e(this.f80883j)).isReady();
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public final void setCurrentStreamFinal() {
        this.f80888o = true;
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public /* synthetic */ void setPlaybackSpeed(float f10, float f11) {
        u9.i0.c(this, f10, f11);
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public final void start() {
        q9.a.g(this.f80882i == 1);
        this.f80882i = 2;
        A();
    }

    @Override // io.bidmachine.media3.exoplayer.i2
    public final void stop() {
        q9.a.g(this.f80882i == 2);
        this.f80882i = 1;
        B();
    }

    public int supportsMixedMimeTypeAdaptation() {
        return 0;
    }

    protected abstract void t();

    protected void u(boolean z10, boolean z11) {
    }

    protected void v() {
    }

    protected abstract void w(long j10, boolean z10);

    protected void x() {
    }

    protected final void y() {
        j2.a aVar;
        synchronized (this.f80875b) {
            aVar = this.f80891r;
        }
        if (aVar != null) {
            aVar.a(this);
        }
    }

    protected void z() {
    }

    protected void D(n9.e0 e0Var) {
    }

    protected void C(io.bidmachine.media3.common.a[] aVarArr, long j10, long j11, f0.b bVar) {
    }
}
