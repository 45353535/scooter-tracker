package yads;

import android.app.Activity;
import android.content.Intent;
import android.view.Window;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class d2 implements i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final es2 f109699a;

    public d2(es2 es2Var) {
        this.f109699a = es2Var;
    }

    @Override // yads.i2
    public final h2 a(Activity activity, RelativeLayout relativeLayout, q2 q2Var, b2 b2Var, Intent intent, Window window, x1 x1Var) {
        if (x1Var == null) {
            return null;
        }
        t9 t9Var = x1Var.f117670a;
        c4 c4Var = x1Var.f117671b;
        jz1 jz1Var = x1Var.f117674e;
        Object obj = vt2.f117186j;
        hr2 hr2VarA = ut2.a().a(window.getContext());
        if (jz1Var == null) {
            return null;
        }
        return new g2(activity, relativeLayout, window, jz1Var, t9Var, q2Var, b2Var, c4Var, this.f109699a, x1Var.f117675f, hr2VarA, new lw0(activity), new qw0(c4Var.f109194a));
    }
}
