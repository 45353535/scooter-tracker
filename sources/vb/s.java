package vb;

import io.bidmachine.media3.common.a;
import java.util.Collections;
import oa.a;
import oa.s0;
import vb.l0;

/* JADX INFO: loaded from: classes12.dex */
public final class s implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f106387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f106388b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f106389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q9.d0 f106390d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q9.c0 f106391e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private s0 f106392f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f106393g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private io.bidmachine.media3.common.a f106394h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f106395i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f106396j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f106397k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f106398l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f106399m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f106400n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f106401o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f106402p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private int f106403q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f106404r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private long f106405s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f106406t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f106407u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f106408v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private String f106409w;

    public s(String str, int i10, String str2) {
        this.f106387a = str;
        this.f106388b = i10;
        this.f106389c = str2;
        q9.d0 d0Var = new q9.d0(1024);
        this.f106390d = d0Var;
        this.f106391e = new q9.c0(d0Var.e());
        this.f106399m = -9223372036854775807L;
    }

    private static long c(q9.c0 c0Var) {
        return c0Var.h((c0Var.h(2) + 1) * 8);
    }

    private void d(q9.c0 c0Var) throws n9.x {
        if (!c0Var.g()) {
            this.f106400n = true;
            i(c0Var);
        } else if (!this.f106400n) {
            return;
        }
        if (this.f106401o != 0) {
            throw n9.x.a(null, null);
        }
        if (this.f106402p != 0) {
            throw n9.x.a(null, null);
        }
        h(c0Var, g(c0Var));
        if (this.f106404r) {
            c0Var.r((int) this.f106405s);
        }
    }

    private int e(q9.c0 c0Var) throws n9.x {
        int iB = c0Var.b();
        a.b bVarD = oa.a.d(c0Var, true);
        this.f106409w = bVarD.f96448c;
        this.f106406t = bVarD.f96446a;
        this.f106408v = bVarD.f96447b;
        return iB - c0Var.b();
    }

    private void f(q9.c0 c0Var) {
        int iH = c0Var.h(3);
        this.f106403q = iH;
        if (iH == 0) {
            c0Var.r(8);
            return;
        }
        if (iH == 1) {
            c0Var.r(9);
            return;
        }
        if (iH == 3 || iH == 4 || iH == 5) {
            c0Var.r(6);
        } else {
            if (iH != 6 && iH != 7) {
                throw new IllegalStateException();
            }
            c0Var.r(1);
        }
    }

    private int g(q9.c0 c0Var) throws n9.x {
        int iH;
        if (this.f106403q != 0) {
            throw n9.x.a(null, null);
        }
        int i10 = 0;
        do {
            iH = c0Var.h(8);
            i10 += iH;
        } while (iH == 255);
        return i10;
    }

    private void h(q9.c0 c0Var, int i10) {
        int iE = c0Var.e();
        if ((iE & 7) == 0) {
            this.f106390d.W(iE >> 3);
        } else {
            c0Var.i(this.f106390d.e(), 0, i10 * 8);
            this.f106390d.W(0);
        }
        this.f106392f.c(this.f106390d, i10);
        q9.a.g(this.f106399m != -9223372036854775807L);
        this.f106392f.e(this.f106399m, 1, i10, 0, null);
        this.f106399m += this.f106407u;
    }

    private void i(q9.c0 c0Var) throws n9.x {
        boolean zG;
        int iH = c0Var.h(1);
        int iH2 = iH == 1 ? c0Var.h(1) : 0;
        this.f106401o = iH2;
        if (iH2 != 0) {
            throw n9.x.a(null, null);
        }
        if (iH == 1) {
            c(c0Var);
        }
        if (!c0Var.g()) {
            throw n9.x.a(null, null);
        }
        this.f106402p = c0Var.h(6);
        int iH3 = c0Var.h(4);
        int iH4 = c0Var.h(3);
        if (iH3 != 0 || iH4 != 0) {
            throw n9.x.a(null, null);
        }
        if (iH == 0) {
            int iE = c0Var.e();
            int iE2 = e(c0Var);
            c0Var.p(iE);
            byte[] bArr = new byte[(iE2 + 7) / 8];
            c0Var.i(bArr, 0, iE2);
            io.bidmachine.media3.common.a aVarN = new a.b().f0(this.f106393g).U(this.f106389c).u0("audio/mp4a-latm").S(this.f106409w).R(this.f106408v).v0(this.f106406t).g0(Collections.singletonList(bArr)).j0(this.f106387a).s0(this.f106388b).N();
            if (!aVarN.equals(this.f106394h)) {
                this.f106394h = aVarN;
                this.f106407u = 1024000000 / ((long) aVarN.F);
                this.f106392f.f(aVarN);
            }
        } else {
            c0Var.r(((int) c(c0Var)) - e(c0Var));
        }
        f(c0Var);
        boolean zG2 = c0Var.g();
        this.f106404r = zG2;
        this.f106405s = 0L;
        if (zG2) {
            if (iH == 1) {
                this.f106405s = c(c0Var);
            } else {
                do {
                    zG = c0Var.g();
                    this.f106405s = (this.f106405s << 8) + ((long) c0Var.h(8));
                } while (zG);
            }
        }
        if (c0Var.g()) {
            c0Var.r(8);
        }
    }

    private void j(int i10) {
        this.f106390d.S(i10);
        this.f106391e.n(this.f106390d.e());
    }

    @Override // vb.m
    public void a(q9.d0 d0Var) throws n9.x {
        q9.a.i(this.f106392f);
        while (d0Var.a() > 0) {
            int i10 = this.f106395i;
            if (i10 != 0) {
                if (i10 == 1) {
                    int iH = d0Var.H();
                    if ((iH & 224) == 224) {
                        this.f106398l = iH;
                        this.f106395i = 2;
                    } else if (iH != 86) {
                        this.f106395i = 0;
                    }
                } else if (i10 == 2) {
                    int iH2 = ((this.f106398l & (-225)) << 8) | d0Var.H();
                    this.f106397k = iH2;
                    if (iH2 > this.f106390d.e().length) {
                        j(this.f106397k);
                    }
                    this.f106396j = 0;
                    this.f106395i = 3;
                } else {
                    if (i10 != 3) {
                        throw new IllegalStateException();
                    }
                    int iMin = Math.min(d0Var.a(), this.f106397k - this.f106396j);
                    d0Var.l(this.f106391e.f98765a, this.f106396j, iMin);
                    int i11 = this.f106396j + iMin;
                    this.f106396j = i11;
                    if (i11 == this.f106397k) {
                        this.f106391e.p(0);
                        d(this.f106391e);
                        this.f106395i = 0;
                    }
                }
            } else if (d0Var.H() == 86) {
                this.f106395i = 1;
            }
        }
    }

    @Override // vb.m
    public void b(oa.t tVar, l0.d dVar) {
        dVar.a();
        this.f106392f = tVar.track(dVar.c(), 1);
        this.f106393g = dVar.b();
    }

    @Override // vb.m
    public void packetStarted(long j10, int i10) {
        this.f106399m = j10;
    }

    @Override // vb.m
    public void seek() {
        this.f106395i = 0;
        this.f106399m = -9223372036854775807L;
        this.f106400n = false;
    }

    @Override // vb.m
    public void packetFinished(boolean z10) {
    }
}
