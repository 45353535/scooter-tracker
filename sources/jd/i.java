package jd;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.Window;
import id.u0;
import kotlin.jvm.internal.Intrinsics;
import pd.i0;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public static final void a(Activity activity, View contentView, boolean z10) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        Intrinsics.checkNotNullParameter(contentView, "contentView");
        if (Build.VERSION.SDK_INT >= 35) {
            Window window = activity.getWindow();
            View decorView = window != null ? window.getDecorView() : null;
            if (decorView == null) {
                decorView = contentView;
            }
            contentView.setPadding(0, 0, 0, 0);
            i0.l(decorView);
            if (z10) {
                decorView.requestApplyInsets();
            }
        }
    }

    public static final void b(Activity activity, u0 u0Var) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        activity.setRequestedOrientation(u0Var != null ? u0Var.g() : 4);
    }
}
