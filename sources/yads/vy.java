package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class vy extends bo {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f117226o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final long f117227p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final wt f117228q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f117229r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile boolean f117230s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f117231t;

    public vy(c30 c30Var, h30 h30Var, yv0 yv0Var, int i10, Object obj, long j10, long j11, long j12, long j13, long j14, int i11, long j15, wt wtVar) {
        super(c30Var, h30Var, yv0Var, i10, obj, j10, j11, j12, j13, j14);
        this.f117226o = i11;
        this.f117227p = j15;
        this.f117228q = wtVar;
    }

    @Override // yads.me1
    public final void a() {
        if (this.f117229r == 0) {
            Cdo cdo = this.f109069m;
            if (cdo == null) {
                throw new IllegalStateException();
            }
            long j10 = this.f117227p;
            for (hq2 hq2Var : cdo.f109989b) {
                if (hq2Var.E != j10) {
                    hq2Var.E = j10;
                    hq2Var.f111705z = true;
                }
            }
            wt wtVar = this.f117228q;
            long j11 = this.f109067k;
            long j12 = j11 == -9223372036854775807L ? -9223372036854775807L : j11 - this.f117227p;
            long j13 = this.f109068l;
            ((rq) wtVar).a(cdo, j12, j13 != -9223372036854775807L ? j13 - this.f117227p : -9223372036854775807L);
        }
        try {
            h30 h30Var = this.f116364b;
            long j14 = this.f117229r;
            long j15 = h30Var.f111458g;
            long j16 = j15 != -1 ? j15 - j14 : -1L;
            if (j14 != 0 || j15 != j16) {
                h30Var = new h30(h30Var.f111452a, h30Var.f111453b, h30Var.f111454c, h30Var.f111455d, h30Var.f111456e, h30Var.f111457f + j14, j16, h30Var.f111459h, h30Var.f111460i, h30Var.f111461j);
            }
            d13 d13Var = this.f116371i;
            yc0 yc0Var = new yc0(d13Var, h30Var.f111457f, d13Var.a(h30Var));
            while (!this.f117230s) {
                try {
                    int iA = ((rq) this.f117228q).f115546b.a(yc0Var, rq.f115545l);
                    if (iA == 1) {
                        throw new IllegalStateException();
                    }
                    if (iA != 0) {
                        break;
                    }
                } finally {
                    this.f117229r = yc0Var.f118152d - this.f116364b.f111457f;
                }
            }
            f30.a(this.f116371i);
            this.f117231t = !this.f117230s;
        } catch (Throwable th2) {
            f30.a(this.f116371i);
            throw th2;
        }
    }

    @Override // yads.me1
    public final void b() {
        this.f117230s = true;
    }

    @Override // yads.bo
    public final long c() {
        return this.f109066j + ((long) this.f117226o);
    }

    @Override // yads.bo
    public final boolean d() {
        return this.f117231t;
    }
}
