package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class r41 implements nu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long[] f115295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f115296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f115297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f115298d;

    public r41(long j10, long[] jArr, long[] jArr2) {
        fi.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z10 = length > 0;
        this.f115298d = z10;
        if (!z10 || jArr2[0] <= 0) {
            this.f115295a = jArr;
            this.f115296b = jArr2;
        } else {
            int i10 = length + 1;
            long[] jArr3 = new long[i10];
            this.f115295a = jArr3;
            long[] jArr4 = new long[i10];
            this.f115296b = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, jArr4, 1, length);
        }
        this.f115297c = j10;
    }

    @Override // yads.nu2
    public final lu2 b(long j10) {
        if (!this.f115298d) {
            pu2 pu2Var = pu2.f114788c;
            return new lu2(pu2Var, pu2Var);
        }
        int iB = w83.b(this.f115296b, j10, true);
        long[] jArr = this.f115296b;
        long j11 = jArr[iB];
        long[] jArr2 = this.f115295a;
        pu2 pu2Var2 = new pu2(j11, jArr2[iB]);
        if (j11 == j10 || iB == jArr.length - 1) {
            return new lu2(pu2Var2, pu2Var2);
        }
        int i10 = iB + 1;
        return new lu2(pu2Var2, new pu2(jArr[i10], jArr2[i10]));
    }

    @Override // yads.nu2
    public final long c() {
        return this.f115297c;
    }

    @Override // yads.nu2
    public final boolean b() {
        return this.f115298d;
    }
}
