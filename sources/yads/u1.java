package yads;

import android.app.Activity;
import android.content.Intent;
import android.view.Window;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

/* JADX INFO: loaded from: classes4.dex */
public final class u1 implements i2 {
    @Override // yads.i2
    public final h2 a(Activity activity, RelativeLayout relativeLayout, q2 q2Var, b2 b2Var, Intent intent, Window window, x1 x1Var) {
        String stringExtra = intent.getStringExtra("extra_browser_url");
        if (stringExtra == null || stringExtra.length() <= 0) {
            return null;
        }
        try {
            u3 u3Var = new u3(activity);
            LinearLayout linearLayout = new LinearLayout(activity);
            linearLayout.setId(1);
            linearLayout.setOrientation(0);
            linearLayout.setBackgroundColor(n9.f113760c);
            return new t1(activity, relativeLayout, q2Var, window, stringExtra, u3Var, linearLayout, p9.a(activity), p9.b(activity), new r83(new q83()));
        } catch (dl3 unused) {
            return null;
        }
    }
}
