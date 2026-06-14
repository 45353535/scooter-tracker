package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.annotation.ColorInt;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;
import androidx.core.graphics.ColorUtils;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import com.google.android.material.color.MaterialColors;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class EdgeToEdgeUtils {
    private static int a(Context context, boolean z10) {
        if (z10 && Build.VERSION.SDK_INT < 27) {
            return ColorUtils.setAlphaComponent(MaterialColors.getColor(context, R.attr.navigationBarColor, ViewCompat.MEASURED_STATE_MASK), 128);
        }
        if (z10) {
            return 0;
        }
        return MaterialColors.getColor(context, R.attr.navigationBarColor, ViewCompat.MEASURED_STATE_MASK);
    }

    public static void applyEdgeToEdge(@NonNull Window window, boolean z10) {
        applyEdgeToEdge(window, z10, null, null);
    }

    private static int b(Context context, boolean z10) {
        if (z10) {
            return 0;
        }
        return MaterialColors.getColor(context, R.attr.statusBarColor, ViewCompat.MEASURED_STATE_MASK);
    }

    private static boolean c(int i10, boolean z10) {
        if (MaterialColors.isColorLight(i10)) {
            return true;
        }
        return i10 == 0 && z10;
    }

    public static void setLightNavigationBar(@NonNull Window window, boolean z10) {
        WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightNavigationBars(z10);
    }

    public static void setLightStatusBar(@NonNull Window window, boolean z10) {
        WindowCompat.getInsetsController(window, window.getDecorView()).setAppearanceLightStatusBars(z10);
    }

    public static void applyEdgeToEdge(@NonNull Window window, boolean z10, @Nullable @ColorInt Integer num, @Nullable @ColorInt Integer num2) {
        boolean z11 = num == null || num.intValue() == 0;
        boolean z12 = num2 == null || num2.intValue() == 0;
        if (z11 || z12) {
            int color = MaterialColors.getColor(window.getContext(), R.attr.colorBackground, ViewCompat.MEASURED_STATE_MASK);
            if (z11) {
                num = Integer.valueOf(color);
            }
            if (z12) {
                num2 = Integer.valueOf(color);
            }
        }
        WindowCompat.setDecorFitsSystemWindows(window, !z10);
        int iB = b(window.getContext(), z10);
        int iA = a(window.getContext(), z10);
        window.setStatusBarColor(iB);
        window.setNavigationBarColor(iA);
        setLightStatusBar(window, c(iB, MaterialColors.isColorLight(num.intValue())));
        setLightNavigationBar(window, c(iA, MaterialColors.isColorLight(num2.intValue())));
    }
}
