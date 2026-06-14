package yads;

import android.app.Activity;
import android.content.Intent;
import android.view.Window;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class n2 implements i2 {
    @Override // yads.i2
    public final h2 a(Activity activity, RelativeLayout relativeLayout, q2 q2Var, b2 b2Var, Intent intent, Window window, x1 x1Var) {
        if (x1Var == null) {
            return null;
        }
        return new m2(activity, x1Var, new q1(((pr3) x1Var.f117673d).a()));
    }
}
