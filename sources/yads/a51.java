package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class a51 extends tt {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final wt f108559j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public vt f108560k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f108561l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public volatile boolean f108562m;

    public a51(c30 c30Var, h30 h30Var, yv0 yv0Var, int i10, Object obj, wt wtVar) {
        super(c30Var, h30Var, 2, yv0Var, i10, obj, -9223372036854775807L, -9223372036854775807L);
        this.f108559j = wtVar;
    }

    @Override // yads.me1
    public final void a() {
        if (this.f108561l == 0) {
            ((rq) this.f108559j).a(this.f108560k, -9223372036854775807L, -9223372036854775807L);
        }
        try {
            h30 h30Var = this.f116364b;
            long j10 = this.f108561l;
            long j11 = h30Var.f111458g;
            long j12 = j11 != -1 ? j11 - j10 : -1L;
            if (j10 != 0 || j11 != j12) {
                h30Var = new h30(h30Var.f111452a, h30Var.f111453b, h30Var.f111454c, h30Var.f111455d, h30Var.f111456e, h30Var.f111457f + j10, j12, h30Var.f111459h, h30Var.f111460i, h30Var.f111461j);
            }
            d13 d13Var = this.f116371i;
            yc0 yc0Var = new yc0(d13Var, h30Var.f111457f, d13Var.a(h30Var));
            while (!this.f108562m) {
                try {
                    int iA = ((rq) this.f108559j).f115546b.a(yc0Var, rq.f115545l);
                    if (iA == 1) {
                        throw new IllegalStateException();
                    }
                    if (iA != 0) {
                        break;
                    }
                } finally {
                    this.f108561l = yc0Var.f118152d - this.f116364b.f111457f;
                }
            }
        } finally {
            f30.a(this.f116371i);
        }
    }

    @Override // yads.me1
    public final void b() {
        this.f108562m = true;
    }
}
