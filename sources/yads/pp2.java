package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class pp2 implements c2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final n32 f114742a;

    public pp2(n32 n32Var) {
        this.f114742a = n32Var;
    }

    @Override // yads.c2
    public final void a() {
        mw0 mw0Var = this.f114742a.f113715b;
        if (mw0Var != null) {
            mw0Var.resume();
        }
    }

    @Override // yads.c2
    public final void b() {
        mw0 mw0Var = this.f114742a.f113715b;
        if (mw0Var != null) {
            mw0Var.pause();
        }
    }
}
