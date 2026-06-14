package com.google.android.material.color;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.view.Window;
import androidx.annotation.NonNull;
import androidx.annotation.RestrictTo;
import androidx.annotation.StyleRes;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public final class ThemeUtils {
    private static Resources.Theme a(Activity activity) {
        View viewPeekDecorView;
        Context context;
        Window window = activity.getWindow();
        if (window == null || (viewPeekDecorView = window.peekDecorView()) == null || (context = viewPeekDecorView.getContext()) == null) {
            return null;
        }
        return context.getTheme();
    }

    public static void applyThemeOverlay(@NonNull Context context, @StyleRes int i10) {
        Resources.Theme themeA;
        context.getTheme().applyStyle(i10, true);
        if (!(context instanceof Activity) || (themeA = a((Activity) context)) == null) {
            return;
        }
        themeA.applyStyle(i10, true);
    }
}
