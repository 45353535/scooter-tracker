package pd;

import android.app.Activity;
import android.graphics.drawable.ColorDrawable;
import android.os.Build;
import android.view.View;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.inputmethod.InputMethodManager;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public abstract class d0 {
    public static final void a(Activity activity, boolean z10) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        activity.requestWindowFeature(1);
        Window window = activity.getWindow();
        if (window != null) {
            window.addFlags(128);
            c(window, z10);
        }
        f(activity);
    }

    public static /* synthetic */ void b(Activity activity, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = true;
        }
        a(activity, z10);
    }

    public static final void c(Window window, boolean z10) {
        int i10;
        Intrinsics.checkNotNullParameter(window, "<this>");
        if (Build.VERSION.SDK_INT >= 30) {
            WindowInsetsController windowInsetsController = window.getDecorView().getWindowInsetsController();
            if (windowInsetsController != null) {
                windowInsetsController.setSystemBarsBehavior(2);
                if (z10) {
                    windowInsetsController.hide(WindowInsets.Type.statusBars());
                    return;
                }
                return;
            }
            return;
        }
        if (z10) {
            window.setFlags(1024, 1024);
            i10 = 4;
        } else {
            i10 = 0;
        }
        if (i10 > 0) {
            window.getDecorView().setSystemUiVisibility(i10);
        }
    }

    public static final void d(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        activity.finish();
        h(activity);
    }

    public static final void e(Activity activity) {
        if (activity == null) {
            return;
        }
        try {
            d(activity);
            Unit unit = Unit.f93236a;
        } catch (Throwable unused) {
        }
    }

    public static final Boolean f(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        InputMethodManager inputMethodManagerT = g0.t(activity);
        if (inputMethodManagerT == null) {
            return null;
        }
        View currentFocus = activity.getCurrentFocus();
        if (currentFocus == null) {
            currentFocus = new View(activity);
        }
        return Boolean.valueOf(inputMethodManagerT.hideSoftInputFromWindow(currentFocus.getWindowToken(), 0));
    }

    public static final Unit g(Activity activity, int i10) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        return b0.c(activity.getWindow(), i10);
    }

    public static final void h(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        if (Build.VERSION.SDK_INT >= 34) {
            try {
                activity.overrideActivityTransition(0, 0, 0, 0);
                activity.overrideActivityTransition(1, 0, 0, 0);
                return;
            } catch (Throwable unused) {
            }
        }
        try {
            activity.overridePendingTransition(0, 0);
            Unit unit = Unit.f93236a;
        } catch (Throwable unused2) {
        }
    }

    public static final Unit i(Window window, int i10) {
        if (window == null) {
            return null;
        }
        window.setBackgroundDrawable(new ColorDrawable(i10));
        return Unit.f93236a;
    }
}
