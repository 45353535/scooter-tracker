package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class ev extends bw0 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f110467d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f110468e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f110469f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f110470g;

    public ev(f43 f43Var, long j10, long j11) throws fv {
        super(f43Var);
        boolean z10 = false;
        if (f43Var.a() != 1) {
            throw new fv(0);
        }
        e43 e43VarA = f43Var.a(0, new e43());
        long jMax = Math.max(0L, j10);
        if (!e43VarA.f110198m && jMax != 0 && !e43VarA.f110194i) {
            throw new fv(1);
        }
        long jMax2 = j11 == Long.MIN_VALUE ? e43VarA.f110200o : Math.max(0L, j11);
        long j12 = e43VarA.f110200o;
        if (j12 != -9223372036854775807L) {
            jMax2 = jMax2 > j12 ? j12 : jMax2;
            if (jMax > jMax2) {
                throw new fv(2);
            }
        }
        this.f110467d = jMax;
        this.f110468e = jMax2;
        this.f110469f = jMax2 != -9223372036854775807L ? jMax2 - jMax : -9223372036854775807L;
        if (e43VarA.f110195j && (jMax2 == -9223372036854775807L || (j12 != -9223372036854775807L && jMax2 == j12))) {
            z10 = true;
        }
        this.f110470g = z10;
    }

    @Override // yads.f43
    public final c43 a(int i10, c43 c43Var, boolean z10) {
        this.f109134c.a(0, c43Var, z10);
        long j10 = c43Var.f109218f - this.f110467d;
        long j11 = this.f110469f;
        return c43Var.a(c43Var.f109214b, c43Var.f109215c, 0, j11 != -9223372036854775807L ? j11 - j10 : -9223372036854775807L, j10, d6.f109796h, false);
    }

    @Override // yads.bw0, yads.f43
    public final e43 a(int i10, e43 e43Var, long j10) {
        this.f109134c.a(0, e43Var, 0L);
        long j11 = e43Var.f110203r;
        long j12 = this.f110467d;
        e43Var.f110203r = j11 + j12;
        e43Var.f110200o = this.f110469f;
        e43Var.f110195j = this.f110470g;
        long j13 = e43Var.f110199n;
        if (j13 != -9223372036854775807L) {
            long jMax = Math.max(j13, j12);
            e43Var.f110199n = jMax;
            long j14 = this.f110468e;
            if (j14 != -9223372036854775807L) {
                jMax = Math.min(jMax, j14);
            }
            e43Var.f110199n = jMax - this.f110467d;
        }
        long jB = w83.b(this.f110467d);
        long j15 = e43Var.f110191f;
        if (j15 != -9223372036854775807L) {
            e43Var.f110191f = j15 + jB;
        }
        long j16 = e43Var.f110192g;
        if (j16 != -9223372036854775807L) {
            e43Var.f110192g = j16 + jB;
        }
        return e43Var;
    }
}
