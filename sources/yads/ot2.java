package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class ot2 implements h32 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ pt2 f114416a;

    public ot2(pt2 pt2Var) {
        this.f114416a = pt2Var;
    }

    @Override // yads.h32
    public final void a(k4 k4Var) {
        pt2 pt2Var = this.f114416a;
        if (pt2Var.f114781k) {
            return;
        }
        pt2Var.f114780j = null;
        pt2Var.f114771a.b(k4Var);
    }

    @Override // yads.h32
    public final void a(jz1 jz1Var) {
        pt2 pt2Var = this.f114416a;
        if (pt2Var.f114781k) {
            return;
        }
        pt2Var.f114780j = jz1Var;
        pt2Var.f114771a.l();
    }
}
