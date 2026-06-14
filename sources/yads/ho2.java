package yads;

import android.app.Dialog;

/* JADX INFO: loaded from: classes4.dex */
public final class ho2 implements t2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dp2 f111650a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io2 f111651b;

    public ho2(dp2 dp2Var, io2 io2Var) {
        this.f111650a = dp2Var;
        this.f111651b = io2Var;
    }

    @Override // yads.t2
    public final void b() {
        dp2 dp2Var = this.f111650a;
        dp2Var.f110014d = true;
        Dialog dialog = ((mh0) dp2Var.f110012b).f113476f;
        if (dialog != null) {
            vf0.a(dialog);
        }
        ((q2) this.f111651b.f112072a).a(13, null);
    }
}
