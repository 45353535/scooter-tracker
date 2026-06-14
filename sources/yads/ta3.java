package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class ta3 implements ru2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f116146a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f116147b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f116148c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f116149d;

    public ta3(long[] jArr, long[] jArr2, long j10, long j11) {
        this.f116146a = jArr;
        this.f116147b = jArr2;
        this.f116148c = j10;
        this.f116149d = j11;
    }

    @Override // yads.ru2
    public final long a() {
        return this.f116149d;
    }

    @Override // yads.nu2
    public final boolean b() {
        return true;
    }

    @Override // yads.nu2
    public final long c() {
        return this.f116148c;
    }

    @Override // yads.ru2
    public final long a(long j10) {
        return this.f116146a[w83.b(this.f116147b, j10, true)];
    }

    @Override // yads.nu2
    public final lu2 b(long j10) {
        int iB = w83.b(this.f116146a, j10, true);
        long[] jArr = this.f116146a;
        long j11 = jArr[iB];
        long[] jArr2 = this.f116147b;
        pu2 pu2Var = new pu2(j11, jArr2[iB]);
        if (j11 >= j10 || iB == jArr.length - 1) {
            return new lu2(pu2Var, pu2Var);
        }
        int i10 = iB + 1;
        return new lu2(pu2Var, new pu2(jArr[i10], jArr2[i10]));
    }
}
