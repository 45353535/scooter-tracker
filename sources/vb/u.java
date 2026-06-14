package vb;

import com.google.common.collect.ImmutableList;
import io.bidmachine.media3.common.a;
import oa.s0;
import q9.o0;
import vb.l0;
import vb.v;

/* JADX INFO: loaded from: classes12.dex */
public final class u implements m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f106424a;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f106429f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private s0 f106430g;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f106433j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f106435l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f106436m;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f106438o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private int f106439p;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f106443t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f106445v;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f106428e = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final q9.d0 f106425b = new q9.d0(new byte[15], 2);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final q9.c0 f106426c = new q9.c0();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final q9.d0 f106427d = new q9.d0();

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private v.b f106440q = new v.b();

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private int f106441r = -2147483647;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f106442s = -1;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private long f106444u = -1;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f106434k = true;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f106437n = true;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private double f106431h = -9.223372036854776E18d;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private double f106432i = -9.223372036854776E18d;

    public u(String str) {
        this.f106424a = str;
    }

    private void c(q9.d0 d0Var, q9.d0 d0Var2, boolean z10) {
        int iF = d0Var.f();
        int iMin = Math.min(d0Var.a(), d0Var2.a());
        d0Var.l(d0Var2.e(), d0Var2.f(), iMin);
        d0Var2.X(iMin);
        if (z10) {
            d0Var.W(iF);
        }
    }

    private void d() {
        int i10;
        if (this.f106445v) {
            this.f106434k = false;
            i10 = 1;
        } else {
            i10 = 0;
        }
        double d10 = (((double) (this.f106442s - this.f106443t)) * 1000000.0d) / ((double) this.f106441r);
        long jRound = Math.round(this.f106431h);
        if (this.f106433j) {
            this.f106433j = false;
            this.f106431h = this.f106432i;
        } else {
            this.f106431h += d10;
        }
        this.f106430g.e(jRound, i10, this.f106439p, 0, null);
        this.f106445v = false;
        this.f106443t = 0;
        this.f106439p = 0;
    }

    private void e(q9.c0 c0Var) throws n9.x {
        v.c cVarH = v.h(c0Var);
        this.f106441r = cVarH.f106450b;
        this.f106442s = cVarH.f106451c;
        long j10 = this.f106444u;
        long j11 = this.f106440q.f106447b;
        if (j10 != j11) {
            this.f106444u = j11;
            String str = "mhm1";
            if (cVarH.f106449a != -1) {
                str = "mhm1" + String.format(".%02X", Integer.valueOf(cVarH.f106449a));
            }
            byte[] bArr = cVarH.f106452d;
            this.f106430g.f(new a.b().f0(this.f106429f).U(this.f106424a).u0("audio/mhm1").v0(this.f106441r).S(str).g0((bArr == null || bArr.length <= 0) ? null : ImmutableList.of(o0.f98842f, bArr)).N());
        }
        this.f106445v = true;
    }

    private boolean f() throws n9.x {
        int iG = this.f106425b.g();
        this.f106426c.o(this.f106425b.e(), iG);
        boolean zG = v.g(this.f106426c, this.f106440q);
        if (zG) {
            this.f106438o = 0;
            this.f106439p += this.f106440q.f106448c + iG;
        }
        return zG;
    }

    private boolean g(int i10) {
        return i10 == 1 || i10 == 17;
    }

    private boolean h(q9.d0 d0Var) {
        int i10 = this.f106435l;
        if ((i10 & 2) == 0) {
            d0Var.W(d0Var.g());
            return false;
        }
        if ((i10 & 4) != 0) {
            return true;
        }
        while (d0Var.a() > 0) {
            int i11 = this.f106436m << 8;
            this.f106436m = i11;
            int iH = i11 | d0Var.H();
            this.f106436m = iH;
            if (v.e(iH)) {
                d0Var.W(d0Var.f() - 3);
                this.f106436m = 0;
                return true;
            }
        }
        return false;
    }

    private void i(q9.d0 d0Var) {
        int iMin = Math.min(d0Var.a(), this.f106440q.f106448c - this.f106438o);
        this.f106430g.c(d0Var, iMin);
        this.f106438o += iMin;
    }

    @Override // vb.m
    public void a(q9.d0 d0Var) throws n9.x {
        q9.a.i(this.f106430g);
        while (d0Var.a() > 0) {
            int i10 = this.f106428e;
            if (i10 != 0) {
                if (i10 == 1) {
                    c(d0Var, this.f106425b, false);
                    if (this.f106425b.a() != 0) {
                        this.f106437n = false;
                    } else if (f()) {
                        this.f106425b.W(0);
                        s0 s0Var = this.f106430g;
                        q9.d0 d0Var2 = this.f106425b;
                        s0Var.c(d0Var2, d0Var2.g());
                        this.f106425b.S(2);
                        this.f106427d.S(this.f106440q.f106448c);
                        this.f106437n = true;
                        this.f106428e = 2;
                    } else if (this.f106425b.g() < 15) {
                        q9.d0 d0Var3 = this.f106425b;
                        d0Var3.V(d0Var3.g() + 1);
                        this.f106437n = false;
                    }
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException();
                    }
                    if (g(this.f106440q.f106446a)) {
                        c(d0Var, this.f106427d, true);
                    }
                    i(d0Var);
                    int i11 = this.f106438o;
                    v.b bVar = this.f106440q;
                    if (i11 == bVar.f106448c) {
                        int i12 = bVar.f106446a;
                        if (i12 == 1) {
                            e(new q9.c0(this.f106427d.e()));
                        } else if (i12 == 17) {
                            this.f106443t = v.f(new q9.c0(this.f106427d.e()));
                        } else if (i12 == 2) {
                            d();
                        }
                        this.f106428e = 1;
                    }
                }
            } else if (h(d0Var)) {
                this.f106428e = 1;
            }
        }
    }

    @Override // vb.m
    public void b(oa.t tVar, l0.d dVar) {
        dVar.a();
        this.f106429f = dVar.b();
        this.f106430g = tVar.track(dVar.c(), 1);
    }

    @Override // vb.m
    public void packetStarted(long j10, int i10) {
        this.f106435l = i10;
        if (!this.f106434k && (this.f106439p != 0 || !this.f106437n)) {
            this.f106433j = true;
        }
        if (j10 != -9223372036854775807L) {
            if (this.f106433j) {
                this.f106432i = j10;
            } else {
                this.f106431h = j10;
            }
        }
    }

    @Override // vb.m
    public void seek() {
        this.f106428e = 0;
        this.f106436m = 0;
        this.f106425b.S(2);
        this.f106438o = 0;
        this.f106439p = 0;
        this.f106441r = -2147483647;
        this.f106442s = -1;
        this.f106443t = 0;
        this.f106444u = -1L;
        this.f106445v = false;
        this.f106433j = false;
        this.f106437n = true;
        this.f106434k = true;
        this.f106431h = -9.223372036854776E18d;
        this.f106432i = -9.223372036854776E18d;
    }

    @Override // vb.m
    public void packetFinished(boolean z10) {
    }
}
