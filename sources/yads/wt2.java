package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class wt2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final gg1 f117588a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final es2 f117589b;

    public wt2(gg1 gg1Var, es2 es2Var) {
        this.f117588a = gg1Var;
        this.f117589b = es2Var;
    }

    public final void a(Context context) {
        this.f117588a.getClass();
        Boolean bool = (Boolean) gg1.a(context, hg1.f111575c.f111583b);
        if (bool == null || bool.booleanValue()) {
            es2 es2Var = this.f117589b;
            xz xzVar = new xz() { // from class: yads.xt0
                @Override // yads.xz
                public final void onInitializationCompleted() {
                    wt2.a();
                }
            };
            new wp0(new bg1()).a(new ct1(context, es2Var, xzVar), new dt1(context, es2Var, xzVar));
        }
    }

    public static final void a() {
        boolean z10 = lb1.f113032a;
    }
}
