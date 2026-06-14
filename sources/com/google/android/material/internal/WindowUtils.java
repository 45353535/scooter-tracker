package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.view.Display;
import android.view.WindowManager;
import androidx.annotation.NonNull;
import androidx.annotation.RequiresApi;
import androidx.annotation.RestrictTo;

/* JADX INFO: loaded from: classes9.dex */
@RestrictTo({RestrictTo.Scope.LIBRARY_GROUP})
public class WindowUtils {

    private static class Api17Impl {
        static Rect a(WindowManager windowManager) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            Rect rect = new Rect();
            rect.right = point.x;
            rect.bottom = point.y;
            return rect;
        }
    }

    @RequiresApi(api = 30)
    private static class Api30Impl {
        static Rect a(WindowManager windowManager) {
            return windowManager.getCurrentWindowMetrics().getBounds();
        }
    }

    @NonNull
    public static Rect getCurrentWindowBounds(@NonNull Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        return Build.VERSION.SDK_INT >= 30 ? Api30Impl.a(windowManager) : Api17Impl.a(windowManager);
    }
}
