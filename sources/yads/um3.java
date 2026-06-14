package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class um3 implements ru2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f116715a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116716b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f116717c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f116718d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f116719e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f116720f;

    public um3(long j10, int i10, long j11, long j12, long[] jArr) {
        this.f116715a = j10;
        this.f116716b = i10;
        this.f116717c = j11;
        this.f116720f = jArr;
        this.f116718d = j12;
        this.f116719e = j12 != -1 ? j10 + j12 : -1L;
    }

    @Override // yads.ru2
    public final long a() {
        return this.f116719e;
    }

    @Override // yads.nu2
    public final lu2 b(long j10) {
        if (!b()) {
            pu2 pu2Var = new pu2(0L, this.f116715a + ((long) this.f116716b));
            return new lu2(pu2Var, pu2Var);
        }
        long j11 = this.f116717c;
        int i10 = w83.f117341a;
        long jMax = Math.max(0L, Math.min(j10, j11));
        double d10 = (jMax * 100.0d) / this.f116717c;
        double d11 = 0.0d;
        if (d10 > 0.0d) {
            if (d10 >= 100.0d) {
                d11 = 256.0d;
            } else {
                int i11 = (int) d10;
                long[] jArr = this.f116720f;
                if (jArr == null) {
                    throw new IllegalStateException();
                }
                double d12 = jArr[i11];
                d11 = d12 + (((i11 == 99 ? 256.0d : jArr[i11 + 1]) - d12) * (d10 - ((double) i11)));
            }
        }
        pu2 pu2Var2 = new pu2(jMax, this.f116715a + Math.max(this.f116716b, Math.min(Math.round((d11 / 256.0d) * this.f116718d), this.f116718d - 1)));
        return new lu2(pu2Var2, pu2Var2);
    }

    @Override // yads.nu2
    public final long c() {
        return this.f116717c;
    }

    @Override // yads.ru2
    public final long a(long j10) {
        long j11 = j10 - this.f116715a;
        if (!b() || j11 <= this.f116716b) {
            return 0L;
        }
        long[] jArr = this.f116720f;
        if (jArr == null) {
            throw new IllegalStateException();
        }
        double d10 = (j11 * 256.0d) / this.f116718d;
        int iB = w83.b(jArr, (long) d10, true);
        long j12 = this.f116717c;
        long j13 = (((long) iB) * j12) / 100;
        long j14 = jArr[iB];
        int i10 = iB + 1;
        long j15 = (j12 * ((long) i10)) / 100;
        return Math.round((j14 == (iB == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j14) / (r0 - j14)) * (j15 - j13)) + j13;
    }

    @Override // yads.nu2
    public final boolean b() {
        return this.f116720f != null;
    }
}
