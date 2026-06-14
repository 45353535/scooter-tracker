package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import androidx.core.content.ContextCompat;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class z implements y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f58899a;

    public z(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f58899a = context;
    }

    public final DisplayMetrics a(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
        return displayMetrics;
    }

    public final DisplayMetrics b(WindowManager windowManager) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        displayMetrics.density = this.f58899a.getResources().getDisplayMetrics().density;
        displayMetrics.densityDpi = this.f58899a.getResources().getDisplayMetrics().densityDpi;
        displayMetrics.widthPixels = windowManager.getCurrentWindowMetrics().getBounds().width();
        displayMetrics.heightPixels = windowManager.getCurrentWindowMetrics().getBounds().height();
        return displayMetrics;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y
    public com.moloco.sdk.common_adapter_internal.b invoke() {
        WindowManager windowManager = (WindowManager) ContextCompat.getSystemService(this.f58899a, WindowManager.class);
        if (windowManager == null) {
            return new com.moloco.sdk.common_adapter_internal.b(0, 0, 0.0f, 0.0f, 0, 0.0f);
        }
        DisplayMetrics displayMetricsB = Build.VERSION.SDK_INT >= 30 ? b(windowManager) : a(windowManager);
        int i10 = displayMetricsB.widthPixels;
        return new com.moloco.sdk.common_adapter_internal.b(i10, displayMetricsB.heightPixels, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b.a(i10, displayMetricsB.density), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b.a(displayMetricsB.heightPixels, displayMetricsB.density), displayMetricsB.densityDpi, displayMetricsB.density);
    }
}
