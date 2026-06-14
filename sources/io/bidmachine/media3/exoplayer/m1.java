package io.bidmachine.media3.exoplayer;

import ga.c0;
import ga.f0;
import java.io.IOException;

/* JADX INFO: loaded from: classes12.dex */
final class m1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ga.c0 f81204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f81205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ga.c1[] f81206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f81207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f81208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f81209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f81210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public n1 f81211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f81212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final boolean[] f81213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final j2[] f81214k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final ja.w f81215l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final e2 f81216m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private m1 f81217n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private ga.m1 f81218o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private ja.x f81219p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private long f81220q;

    interface a {
        m1 a(n1 n1Var, long j10);
    }

    public m1(j2[] j2VarArr, long j10, ja.w wVar, ka.b bVar, e2 e2Var, n1 n1Var, ja.x xVar, long j11) {
        this.f81214k = j2VarArr;
        this.f81220q = j10;
        this.f81215l = wVar;
        this.f81216m = e2Var;
        f0.b bVar2 = n1Var.f81227a;
        this.f81205b = bVar2.f72270a;
        this.f81211h = n1Var;
        this.f81207d = j11;
        this.f81218o = ga.m1.f72378d;
        this.f81219p = xVar;
        this.f81206c = new ga.c1[j2VarArr.length];
        this.f81213j = new boolean[j2VarArr.length];
        this.f81204a = f(bVar2, e2Var, bVar, n1Var.f81228b, n1Var.f81230d, n1Var.f81232f);
    }

    private void c(ga.c1[] c1VarArr) {
        int i10 = 0;
        while (true) {
            j2[] j2VarArr = this.f81214k;
            if (i10 >= j2VarArr.length) {
                return;
            }
            if (j2VarArr[i10].getTrackType() == -2 && this.f81219p.c(i10)) {
                c1VarArr[i10] = new ga.s();
            }
            i10++;
        }
    }

    private static ga.c0 f(f0.b bVar, e2 e2Var, ka.b bVar2, long j10, long j11, boolean z10) {
        ga.c0 c0VarH = e2Var.h(bVar, bVar2, j10);
        return j11 != -9223372036854775807L ? new ga.e(c0VarH, !z10, 0L, j11) : c0VarH;
    }

    private void g() {
        if (!u()) {
            return;
        }
        int i10 = 0;
        while (true) {
            ja.x xVar = this.f81219p;
            if (i10 >= xVar.f85695a) {
                return;
            }
            boolean zC = xVar.c(i10);
            ja.r rVar = this.f81219p.f85697c[i10];
            if (zC && rVar != null) {
                rVar.disable();
            }
            i10++;
        }
    }

    private void h(ga.c1[] c1VarArr) {
        int i10 = 0;
        while (true) {
            j2[] j2VarArr = this.f81214k;
            if (i10 >= j2VarArr.length) {
                return;
            }
            if (j2VarArr[i10].getTrackType() == -2) {
                c1VarArr[i10] = null;
            }
            i10++;
        }
    }

    private void i() {
        if (!u()) {
            return;
        }
        int i10 = 0;
        while (true) {
            ja.x xVar = this.f81219p;
            if (i10 >= xVar.f85695a) {
                return;
            }
            boolean zC = xVar.c(i10);
            ja.r rVar = this.f81219p.f85697c[i10];
            if (zC && rVar != null) {
                rVar.enable();
            }
            i10++;
        }
    }

    private boolean u() {
        return this.f81217n == null;
    }

    private static void y(e2 e2Var, ga.c0 c0Var) {
        try {
            if (c0Var instanceof ga.e) {
                e2Var.y(((ga.e) c0Var).f72232b);
            } else {
                e2Var.y(c0Var);
            }
        } catch (RuntimeException e10) {
            q9.u.d("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public void A(m1 m1Var) {
        if (m1Var == this.f81217n) {
            return;
        }
        g();
        this.f81217n = m1Var;
        i();
    }

    public void B(long j10) {
        this.f81220q = j10;
    }

    public long C(long j10) {
        return j10 - m();
    }

    public long D(long j10) {
        return j10 + m();
    }

    public void E() {
        ga.c0 c0Var = this.f81204a;
        if (c0Var instanceof ga.e) {
            long j10 = this.f81211h.f81230d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((ga.e) c0Var).m(0L, j10);
        }
    }

    public long a(ja.x xVar, long j10, boolean z10) {
        return b(xVar, j10, z10, new boolean[this.f81214k.length]);
    }

    public long b(ja.x xVar, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= xVar.f85695a) {
                break;
            }
            boolean[] zArr2 = this.f81213j;
            if (z10 || !xVar.b(this.f81219p, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        h(this.f81206c);
        g();
        this.f81219p = xVar;
        i();
        long j11 = this.f81204a.j(xVar.f85697c, this.f81213j, this.f81206c, zArr, j10);
        c(this.f81206c);
        this.f81210g = false;
        int i11 = 0;
        while (true) {
            ga.c1[] c1VarArr = this.f81206c;
            if (i11 >= c1VarArr.length) {
                return j11;
            }
            if (c1VarArr[i11] != null) {
                q9.a.g(xVar.c(i11));
                if (this.f81214k[i11].getTrackType() != -2) {
                    this.f81210g = true;
                }
            } else {
                q9.a.g(xVar.f85697c[i11] == null);
            }
            i11++;
        }
    }

    public boolean d(n1 n1Var) {
        if (!p1.e(this.f81211h.f81231e, n1Var.f81231e)) {
            return false;
        }
        n1 n1Var2 = this.f81211h;
        return n1Var2.f81228b == n1Var.f81228b && n1Var2.f81227a.equals(n1Var.f81227a);
    }

    public void e(l1 l1Var) {
        q9.a.g(u());
        this.f81204a.a(l1Var);
    }

    public long j() {
        if (!this.f81209f) {
            return this.f81211h.f81228b;
        }
        long bufferedPositionUs = this.f81210g ? this.f81204a.getBufferedPositionUs() : Long.MIN_VALUE;
        return bufferedPositionUs == Long.MIN_VALUE ? this.f81211h.f81231e : bufferedPositionUs;
    }

    public m1 k() {
        return this.f81217n;
    }

    public long l() {
        if (this.f81209f) {
            return this.f81204a.getNextLoadPositionUs();
        }
        return 0L;
    }

    public long m() {
        return this.f81220q;
    }

    public long n() {
        return this.f81211h.f81228b + this.f81220q;
    }

    public ga.m1 o() {
        return this.f81218o;
    }

    public ja.x p() {
        return this.f81219p;
    }

    public void q(float f10, n9.e0 e0Var, boolean z10) {
        this.f81209f = true;
        this.f81218o = this.f81204a.getTrackGroups();
        ja.x xVarZ = z(f10, e0Var, z10);
        n1 n1Var = this.f81211h;
        long jMax = n1Var.f81228b;
        long j10 = n1Var.f81231e;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jA = a(xVarZ, jMax, false);
        long j11 = this.f81220q;
        n1 n1Var2 = this.f81211h;
        this.f81220q = j11 + (n1Var2.f81228b - jA);
        this.f81211h = n1Var2.b(jA);
    }

    public boolean r() {
        try {
            if (this.f81209f) {
                for (ga.c1 c1Var : this.f81206c) {
                    if (c1Var != null) {
                        c1Var.maybeThrowError();
                    }
                }
            } else {
                this.f81204a.maybeThrowPrepareError();
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    public boolean s() {
        if (this.f81209f) {
            return !this.f81210g || this.f81204a.getBufferedPositionUs() == Long.MIN_VALUE;
        }
        return false;
    }

    public boolean t() {
        if (this.f81209f) {
            return s() || j() - this.f81211h.f81228b >= this.f81207d;
        }
        return false;
    }

    public void v(c0.a aVar, long j10) {
        this.f81208e = true;
        this.f81204a.c(aVar, j10);
    }

    public void w(long j10) {
        q9.a.g(u());
        if (this.f81209f) {
            this.f81204a.reevaluateBuffer(C(j10));
        }
    }

    public void x() {
        g();
        y(this.f81216m, this.f81204a);
    }

    public ja.x z(float f10, n9.e0 e0Var, boolean z10) {
        ja.x xVarK = this.f81215l.k(this.f81214k, o(), this.f81211h.f81227a, e0Var);
        for (int i10 = 0; i10 < xVarK.f85695a; i10++) {
            if (xVarK.c(i10)) {
                if (xVarK.f85697c[i10] == null && this.f81214k[i10].getTrackType() != -2) {
                    z = false;
                }
                q9.a.g(z);
            } else {
                q9.a.g(xVarK.f85697c[i10] == null);
            }
        }
        for (ja.r rVar : xVarK.f85697c) {
            if (rVar != null) {
                rVar.onPlaybackSpeed(f10);
                rVar.onPlayWhenReadyChanged(z10);
            }
        }
        return xVarK;
    }
}
