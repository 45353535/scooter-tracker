package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class fx0 implements bx0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final id1 f110956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final wy f110957b;

    public fx0(id1 id1Var, wy wyVar) {
        this.f110956a = id1Var;
        this.f110957b = wyVar;
    }

    @Override // yads.bx0
    public final void c() {
        if (this.f110956a.a()) {
            return;
        }
        this.f110957b.e();
    }

    @Override // yads.bx0
    public final void invalidate() {
        this.f110956a.b();
    }
}
