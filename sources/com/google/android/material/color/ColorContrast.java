package com.google.android.material.color;

import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.app.UiModeManager$ContrastChangeListener;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.core.content.ContextCompat;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
public class ColorContrast {

    @RequiresApi(34)
    private static class ColorContrastActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set f26015b = new LinkedHashSet();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final ColorContrastOptions f26016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private UiModeManager$ContrastChangeListener f26017d;

        ColorContrastActivityLifecycleCallbacks(ColorContrastOptions colorContrastOptions) {
            this.f26016c = colorContrastOptions;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
            this.f26015b.remove(activity);
            UiModeManager uiModeManager = (UiModeManager) activity.getSystemService("uimode");
            if (uiModeManager == null || this.f26017d == null || !this.f26015b.isEmpty()) {
                return;
            }
            uiModeManager.removeContrastChangeListener(this.f26017d);
            this.f26017d = null;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
            UiModeManager uiModeManager = (UiModeManager) activity.getSystemService("uimode");
            if (uiModeManager != null && this.f26015b.isEmpty() && this.f26017d == null) {
                this.f26017d = new UiModeManager$ContrastChangeListener() { // from class: com.google.android.material.color.ColorContrast.ColorContrastActivityLifecycleCallbacks.1
                    public void onContrastChanged(float f10) {
                        Iterator it = ColorContrastActivityLifecycleCallbacks.this.f26015b.iterator();
                        while (it.hasNext()) {
                            ((Activity) it.next()).recreate();
                        }
                    }
                };
                uiModeManager.addContrastChangeListener(ContextCompat.getMainExecutor(activity.getApplicationContext()), this.f26017d);
            }
            this.f26015b.add(activity);
            if (uiModeManager != null) {
                ColorContrast.applyToActivityIfAvailable(activity, this.f26016c);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivitySaveInstanceState(@NonNull Activity activity, @NonNull Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStarted(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityStopped(@NonNull Activity activity) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0031 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0032 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(android.content.Context r3, com.google.android.material.color.ColorContrastOptions r4) {
        /*
            java.lang.String r0 = "uimode"
            java.lang.Object r3 = r3.getSystemService(r0)
            android.app.UiModeManager r3 = (android.app.UiModeManager) r3
            boolean r0 = isContrastAvailable()
            r1 = 0
            if (r0 == 0) goto L33
            if (r3 != 0) goto L12
            goto L33
        L12:
            float r3 = com.google.android.material.color.a.a(r3)
            int r0 = r4.getMediumContrastThemeOverlay()
            int r4 = r4.getHighContrastThemeOverlay()
            r2 = 1059760811(0x3f2aaaab, float:0.6666667)
            int r2 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r2 < 0) goto L28
            if (r4 != 0) goto L31
            goto L32
        L28:
            r2 = 1051372203(0x3eaaaaab, float:0.33333334)
            int r3 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r3 < 0) goto L33
            if (r0 != 0) goto L32
        L31:
            return r4
        L32:
            return r0
        L33:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.color.ColorContrast.a(android.content.Context, com.google.android.material.color.ColorContrastOptions):int");
    }

    public static void applyToActivitiesIfAvailable(@NonNull Application application, @NonNull ColorContrastOptions colorContrastOptions) {
        if (isContrastAvailable()) {
            application.registerActivityLifecycleCallbacks(new ColorContrastActivityLifecycleCallbacks(colorContrastOptions));
        }
    }

    public static void applyToActivityIfAvailable(@NonNull Activity activity, @NonNull ColorContrastOptions colorContrastOptions) {
        int iA;
        if (isContrastAvailable() && (iA = a(activity, colorContrastOptions)) != 0) {
            ThemeUtils.applyThemeOverlay(activity, iA);
        }
    }

    @ChecksSdkIntAtLeast(api = 34)
    public static boolean isContrastAvailable() {
        return Build.VERSION.SDK_INT >= 34;
    }

    @NonNull
    public static Context wrapContextIfAvailable(@NonNull Context context, @NonNull ColorContrastOptions colorContrastOptions) {
        int iA;
        return (isContrastAvailable() && (iA = a(context, colorContrastOptions)) != 0) ? new ContextThemeWrapper(context, iA) : context;
    }
}
