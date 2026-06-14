package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class uj implements sj {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f116670a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f116671b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final w92 f116672c;

    public uj(oj ojVar, yv0 yv0Var) {
        w92 w92Var = ojVar.f114339b;
        this.f116672c = w92Var;
        w92Var.e(12);
        int iP = w92Var.p();
        if ("audio/raw".equals(yv0Var.f118398m)) {
            int iB = w83.b(yv0Var.B, yv0Var.f118411z);
            if (iP == 0 || iP % iB != 0) {
                uf1.d("AtomParsers", "Audio sample size mismatch. stsd sample size: " + iB + ", stsz sample size: " + iP);
                iP = iB;
            }
        }
        this.f116670a = iP == 0 ? -1 : iP;
        this.f116671b = w92Var.p();
    }

    @Override // yads.sj
    public final int a() {
        return this.f116670a;
    }

    @Override // yads.sj
    public final int b() {
        return this.f116671b;
    }

    @Override // yads.sj
    public final int c() {
        int i10 = this.f116670a;
        return i10 == -1 ? this.f116672c.p() : i10;
    }
}
