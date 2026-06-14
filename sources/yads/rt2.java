package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class rt2 implements h32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ st2 f115593a;

    public rt2(st2 st2Var) {
        this.f115593a = st2Var;
    }

    @Override // yads.h32
    public final void a(k4 k4Var) {
        st2 st2Var = this.f115593a;
        if (st2Var.f115943k) {
            return;
        }
        st2Var.f115942j = null;
        st2Var.f115933a.b(k4Var);
    }

    @Override // yads.h32
    public final void a(jz1 jz1Var) {
        st2 st2Var = this.f115593a;
        if (st2Var.f115943k) {
            return;
        }
        st2Var.f115942j = jz1Var;
        st2Var.f115933a.l();
    }
}
