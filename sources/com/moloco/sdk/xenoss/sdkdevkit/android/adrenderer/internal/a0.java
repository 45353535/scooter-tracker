package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.app.Activity;
import android.os.Build;
import android.view.View;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.core.view.WindowInsetsControllerCompat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public abstract class a0 {
    public static final void a(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "<this>");
        View decorView = activity.getWindow().getDecorView();
        if (Build.VERSION.SDK_INT >= 30) {
            c(activity);
        } else {
            Intrinsics.checkNotNull(decorView);
            b(decorView);
        }
    }

    public static final void b(View view) {
        view.setSystemUiVisibility(4102);
    }

    public static final void c(Activity activity) {
        WindowCompat.setDecorFitsSystemWindows(activity.getWindow(), false);
        WindowInsetsControllerCompat windowInsetsControllerCompat = new WindowInsetsControllerCompat(activity.getWindow(), activity.getWindow().getDecorView());
        windowInsetsControllerCompat.hide(WindowInsetsCompat.Type.systemBars());
        windowInsetsControllerCompat.setSystemBarsBehavior(2);
    }
}
