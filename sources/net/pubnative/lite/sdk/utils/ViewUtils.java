package net.pubnative.lite.sdk.utils;

import android.content.Context;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public class ViewUtils {
    private static final AtomicInteger nextGeneratedId = new AtomicInteger(1);

    public static /* synthetic */ WindowInsets a(View view, View view2, WindowInsets windowInsets) {
        view.setPadding(0, windowInsets.getSystemWindowInsetTop(), 0, windowInsets.getSystemWindowInsetBottom());
        return windowInsets;
    }

    public static void applyWindowInsets(final View view) {
        if (view != null) {
            view.setOnApplyWindowInsetsListener(new View.OnApplyWindowInsetsListener() { // from class: net.pubnative.lite.sdk.utils.i
                @Override // android.view.View.OnApplyWindowInsetsListener
                public final WindowInsets onApplyWindowInsets(View view2, WindowInsets windowInsets) {
                    return ViewUtils.a(view, view2, windowInsets);
                }
            });
            view.setSystemUiVisibility(com.google.android.material.internal.ViewUtils.EDGE_TO_EDGE_FLAGS);
        }
    }

    public static float asFloatPixels(float f10, Context context) {
        return TypedValue.applyDimension(1, f10, context.getResources().getDisplayMetrics());
    }

    public static int asIntPixels(float f10, Context context) {
        return (int) (asFloatPixels(f10, context) + 0.5f);
    }

    public static float convertDpToPixel(float f10, Context context) {
        return f10 * (context.getResources().getDisplayMetrics().densityDpi / 160.0f);
    }

    public static float convertPixelsToDp(float f10, Context context) {
        return f10 / (context.getResources().getDisplayMetrics().densityDpi / 160.0f);
    }

    public static int generateViewId() {
        return View.generateViewId();
    }

    public static void removeFromParent(View view) {
        if (view == null || view.getParent() == null || !(view.getParent() instanceof ViewGroup)) {
            return;
        }
        ((ViewGroup) view.getParent()).removeView(view);
    }
}
