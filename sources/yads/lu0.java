package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class lu0 implements nu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nu0 f113225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f113226b;

    public lu0(nu0 nu0Var, long j10) {
        this.f113225a = nu0Var;
        this.f113226b = j10;
    }

    @Override // yads.nu2
    public final boolean b() {
        return true;
    }

    @Override // yads.nu2
    public final long c() {
        return this.f113225a.b();
    }

    @Override // yads.nu2
    public final lu2 b(long j10) {
        nu0 nu0Var = this.f113225a;
        mu0 mu0Var = nu0Var.f114044k;
        if (mu0Var == null) {
            throw new IllegalStateException();
        }
        long[] jArr = mu0Var.f113609a;
        long[] jArr2 = mu0Var.f113610b;
        int iB = w83.b(jArr, nu0Var.a(j10), false);
        long j11 = iB == -1 ? 0L : jArr[iB];
        long j12 = iB != -1 ? jArr2[iB] : 0L;
        long j13 = this.f113225a.f114038e;
        long j14 = (j11 * 1000000) / j13;
        long j15 = this.f113226b;
        pu2 pu2Var = new pu2(j14, j12 + j15);
        if (j14 == j10 || iB == jArr.length - 1) {
            return new lu2(pu2Var, pu2Var);
        }
        int i10 = iB + 1;
        return new lu2(pu2Var, new pu2((jArr[i10] * 1000000) / j13, j15 + jArr2[i10]));
    }
}
