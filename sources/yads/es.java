package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class es implements i00 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e9 f110454a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gs f110455b;

    public es(gs gsVar, e9 e9Var) {
        this.f110455b = gsVar;
        this.f110454a = e9Var;
    }

    @Override // yads.i00
    public final void a(k4 k4Var) {
    }

    @Override // yads.i00
    public final void a(ub1 ub1Var) {
        bc1 bc1Var = this.f110455b.f111322e;
        e9 e9Var = this.f110454a;
        synchronized (bc1Var) {
            fg2 fg2Var = bc1Var.f108965a;
            bc1Var.f108966b.getClass();
            fg2Var.a(ax0.a(e9Var), ub1Var);
        }
    }
}
