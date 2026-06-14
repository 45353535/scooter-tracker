package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class z03 implements nu2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nu2 f118485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ a13 f118486b;

    public z03(a13 a13Var, nu2 nu2Var) {
        this.f118486b = a13Var;
        this.f118485a = nu2Var;
    }

    @Override // yads.nu2
    public final lu2 b(long j10) {
        lu2 lu2VarB = this.f118485a.b(j10);
        pu2 pu2Var = lu2VarB.f113228a;
        long j11 = pu2Var.f114789a;
        long j12 = pu2Var.f114790b;
        long j13 = this.f118486b.f108516b;
        pu2 pu2Var2 = new pu2(j11, j12 + j13);
        pu2 pu2Var3 = lu2VarB.f113229b;
        return new lu2(pu2Var2, new pu2(pu2Var3.f114789a, pu2Var3.f114790b + j13));
    }

    @Override // yads.nu2
    public final long c() {
        return this.f118485a.c();
    }

    @Override // yads.nu2
    public final boolean b() {
        return this.f118485a.b();
    }
}
