package com.mbridge.msdk.foundation.tools;

import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import androidx.core.view.InputDeviceCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes10.dex */
public class f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f48990a = new AtomicInteger(1);

    public static void a(View view) {
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
    }

    public static void b(Window window) {
        if (window != null) {
            try {
                window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
            } catch (Throwable th2) {
                q0.b("ViewUtil", th2.getMessage());
            }
        }
    }

    public static void c(Window window) {
        if (window != null) {
            try {
                int i10 = Build.VERSION.SDK_INT;
                if (i10 >= 28) {
                    WindowManager.LayoutParams attributes = window.getAttributes();
                    if (i10 >= 30) {
                        attributes.layoutInDisplayCutoutMode = 3;
                    } else {
                        attributes.layoutInDisplayCutoutMode = 1;
                    }
                    window.setAttributes(attributes);
                }
            } catch (Throwable th2) {
                q0.b("ViewUtil", th2.getMessage());
            }
        }
    }

    public static void d(Window window) {
        if (window != null) {
            try {
                window.requestFeature(1);
                window.setFlags(1024, 1024);
                window.addFlags(512);
            } catch (Throwable th2) {
                q0.b("ViewUtil", th2.getMessage());
            }
        }
    }

    public static void a(Window window) {
        if (window != null) {
            try {
                window.addFlags(AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL);
                window.getDecorView().setSystemUiVisibility(InputDeviceCompat.SOURCE_TOUCHSCREEN);
            } catch (Throwable th2) {
                q0.b("ViewUtil", th2.getMessage());
            }
        }
    }
}
