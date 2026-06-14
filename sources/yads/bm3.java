package yads;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.view.DisplayCutout;
import android.view.WindowInsets;
import android.view.WindowManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bm3 {
    public static dg0 a(Context context) {
        if (sb.a(30)) {
            Object systemService = context.getSystemService("window");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            WindowInsets windowInsets = ((WindowManager) systemService).getCurrentWindowMetrics().getWindowInsets();
            Insets insetsIgnoringVisibility = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
            Insets insetsIgnoringVisibility2 = windowInsets.getInsetsIgnoringVisibility(WindowInsets.Type.displayCutout());
            cj3 cj3Var = qi3.f115019a;
            float f10 = context.getResources().getDisplayMetrics().density;
            return new dg0(qi3.b(insetsIgnoringVisibility.left, f10), qi3.b(insetsIgnoringVisibility.top, f10), qi3.b(insetsIgnoringVisibility.right, f10), qi3.b(insetsIgnoringVisibility.bottom, f10), qi3.b(insetsIgnoringVisibility2.top, f10), qi3.b(insetsIgnoringVisibility2.bottom, f10));
        }
        if (!sb.a(28)) {
            return dg0.f109913g;
        }
        Activity activityA = j1.a();
        if (activityA == null) {
            return dg0.f109913g;
        }
        WindowInsets rootWindowInsets = activityA.getWindow().getDecorView().getRootWindowInsets();
        if (rootWindowInsets == null) {
            return dg0.f109913g;
        }
        cj3 cj3Var2 = qi3.f115019a;
        float f11 = context.getResources().getDisplayMetrics().density;
        DisplayCutout displayCutout = rootWindowInsets.getDisplayCutout();
        return new dg0(qi3.b(rootWindowInsets.getSystemWindowInsetLeft(), f11), qi3.b(rootWindowInsets.getSystemWindowInsetTop(), f11), qi3.b(rootWindowInsets.getSystemWindowInsetRight(), f11), qi3.b(rootWindowInsets.getSystemWindowInsetBottom(), f11), qi3.b(displayCutout != null ? displayCutout.getSafeInsetTop() : 0, f11), qi3.b(displayCutout != null ? displayCutout.getSafeInsetBottom() : 0, f11));
    }

    public static final dg0 b(Context context) {
        try {
            return a(context);
        } catch (Throwable unused) {
            boolean z10 = lb1.f113032a;
            return dg0.f109913g;
        }
    }
}
