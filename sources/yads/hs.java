package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class hs implements c10 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e9 f111769a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ks f111770b;

    public hs(ks ksVar, e9 e9Var) {
        this.f111770b = ksVar;
        this.f111769a = e9Var;
    }

    @Override // yads.c10
    public final void a(k4 k4Var) {
    }

    @Override // yads.c10
    public final void a(yo2 yo2Var) {
        op2 op2Var = this.f111770b.f112833e;
        e9 e9Var = this.f111769a;
        synchronized (op2Var) {
            fg2 fg2Var = op2Var.f114386a;
            op2Var.f114387b.getClass();
            fg2Var.a(ax0.a(e9Var), yo2Var);
        }
    }
}
