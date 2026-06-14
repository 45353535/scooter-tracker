package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class fp2 implements c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hp2 f110828a;

    public fp2(hp2 hp2Var) {
        this.f110828a = hp2Var;
    }

    @Override // yads.c2
    public final void a() {
        mw0 mw0Var = this.f110828a.f111676i;
        if (mw0Var != null) {
            mw0Var.resume();
        }
    }

    @Override // yads.c2
    public final void b() {
        mw0 mw0Var = this.f110828a.f111676i;
        if (mw0Var != null) {
            mw0Var.pause();
        }
    }
}
