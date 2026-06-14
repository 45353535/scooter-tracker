package yads;

/* JADX INFO: loaded from: classes4.dex */
public class sy implements nu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f115973a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f115974b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f115975c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f115976d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f115977e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f115978f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f115979g;

    public sy(int i10, int i11, long j10, long j11, boolean z10) {
        this.f115973a = j10;
        this.f115974b = j11;
        this.f115975c = i11 == -1 ? 1 : i11;
        this.f115977e = i10;
        this.f115979g = z10;
        if (j10 == -1) {
            this.f115976d = -1L;
            this.f115978f = -9223372036854775807L;
        } else {
            this.f115976d = j10 - j11;
            this.f115978f = a(i10, j10, j11);
        }
    }

    public static long a(int i10, long j10, long j11) {
        return (Math.max(0L, j10 - j11) * 8000000) / ((long) i10);
    }

    @Override // yads.nu2
    public final lu2 b(long j10) {
        long j11 = this.f115976d;
        if (j11 == -1 && !this.f115979g) {
            pu2 pu2Var = new pu2(0L, this.f115974b);
            return new lu2(pu2Var, pu2Var);
        }
        long j12 = (((long) this.f115977e) * j10) / 8000000;
        long j13 = this.f115975c;
        long jMin = (j12 / j13) * j13;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - j13);
        }
        long jMax = Math.max(jMin, 0L);
        long j14 = this.f115974b;
        long j15 = jMax + j14;
        long jA = a(this.f115977e, j15, j14);
        pu2 pu2Var2 = new pu2(jA, j15);
        if (this.f115976d != -1 && jA < j10) {
            long j16 = j15 + ((long) this.f115975c);
            if (j16 < this.f115973a) {
                return new lu2(pu2Var2, new pu2(a(this.f115977e, j16, this.f115974b), j16));
            }
        }
        return new lu2(pu2Var2, pu2Var2);
    }

    @Override // yads.nu2
    public final long c() {
        return this.f115978f;
    }

    @Override // yads.nu2
    public final boolean b() {
        return this.f115976d != -1 || this.f115979g;
    }
}
