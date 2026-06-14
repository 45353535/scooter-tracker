package com.google.android.material.color;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.annotation.ChecksSdkIntAtLeast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleRes;
import androidx.core.os.BuildCompat;
import com.adjust.sdk.Constants;
import com.google.android.material.R;
import com.google.android.material.color.DynamicColorsOptions;
import com.google.android.material.color.utilities.Hct;
import com.google.android.material.color.utilities.SchemeContent;
import j$.util.DesugarCollections;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
public class DynamicColors {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int[] f26076a = {R.attr.dynamicColorThemeOverlay};

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final DeviceSupportCondition f26077b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final DeviceSupportCondition f26078c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map f26079d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Map f26080e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f26081f;

    private interface DeviceSupportCondition {
        boolean isSupported();
    }

    private static class DynamicColorsActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final DynamicColorsOptions f26083b;

        DynamicColorsActivityLifecycleCallbacks(DynamicColorsOptions dynamicColorsOptions) {
            this.f26083b = dynamicColorsOptions;
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityDestroyed(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPaused(@NonNull Activity activity) {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public void onActivityPreCreated(@NonNull Activity activity, @Nullable Bundle bundle) {
            DynamicColors.applyToActivityIfAvailable(activity, this.f26083b);
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

    public interface OnAppliedCallback {
        void onApplied(@NonNull Activity activity);
    }

    public interface Precondition {
        boolean shouldApplyDynamicColors(@NonNull Activity activity, @StyleRes int i10);
    }

    static {
        DeviceSupportCondition deviceSupportCondition = new DeviceSupportCondition() { // from class: com.google.android.material.color.DynamicColors.1
            @Override // com.google.android.material.color.DynamicColors.DeviceSupportCondition
            public boolean isSupported() {
                return true;
            }
        };
        f26077b = deviceSupportCondition;
        DeviceSupportCondition deviceSupportCondition2 = new DeviceSupportCondition() { // from class: com.google.android.material.color.DynamicColors.2

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private Long f26082a;

            @Override // com.google.android.material.color.DynamicColors.DeviceSupportCondition
            public boolean isSupported() {
                if (this.f26082a == null) {
                    try {
                        Method declaredMethod = Build.class.getDeclaredMethod("getLong", String.class);
                        declaredMethod.setAccessible(true);
                        Long l10 = (Long) declaredMethod.invoke(null, "ro.build.version.oneui");
                        l10.longValue();
                        this.f26082a = l10;
                    } catch (Exception unused) {
                        this.f26082a = -1L;
                    }
                }
                return this.f26082a.longValue() >= 40100;
            }
        };
        f26078c = deviceSupportCondition2;
        HashMap map = new HashMap();
        map.put("fcnt", deviceSupportCondition);
        map.put("google", deviceSupportCondition);
        map.put("hmd global", deviceSupportCondition);
        map.put("infinix", deviceSupportCondition);
        map.put("infinix mobility limited", deviceSupportCondition);
        map.put("itel", deviceSupportCondition);
        map.put("kyocera", deviceSupportCondition);
        map.put("lenovo", deviceSupportCondition);
        map.put("lge", deviceSupportCondition);
        map.put("meizu", deviceSupportCondition);
        map.put("motorola", deviceSupportCondition);
        map.put("nothing", deviceSupportCondition);
        map.put("oneplus", deviceSupportCondition);
        map.put("oppo", deviceSupportCondition);
        map.put("realme", deviceSupportCondition);
        map.put("robolectric", deviceSupportCondition);
        map.put(Constants.REFERRER_API_SAMSUNG, deviceSupportCondition2);
        map.put("sharp", deviceSupportCondition);
        map.put("shift", deviceSupportCondition);
        map.put("sony", deviceSupportCondition);
        map.put("tcl", deviceSupportCondition);
        map.put("tecno", deviceSupportCondition);
        map.put("tecno mobile limited", deviceSupportCondition);
        map.put(Constants.REFERRER_API_VIVO, deviceSupportCondition);
        map.put("wingtech", deviceSupportCondition);
        map.put(Constants.REFERRER_API_XIAOMI, deviceSupportCondition);
        f26079d = DesugarCollections.unmodifiableMap(map);
        HashMap map2 = new HashMap();
        map2.put("asus", deviceSupportCondition);
        map2.put("jio", deviceSupportCondition);
        f26080e = DesugarCollections.unmodifiableMap(map2);
        f26081f = DynamicColors.class.getSimpleName();
    }

    private static int a(Context context, int[] iArr) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(iArr);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    @Deprecated
    public static void applyIfAvailable(@NonNull Activity activity) {
        applyToActivityIfAvailable(activity);
    }

    public static void applyToActivitiesIfAvailable(@NonNull Application application) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().build());
    }

    public static void applyToActivityIfAvailable(@NonNull Activity activity) {
        applyToActivityIfAvailable(activity, new DynamicColorsOptions.Builder().build());
    }

    private static float b(Context context) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (uiModeManager == null || Build.VERSION.SDK_INT < 34) {
            return 0.0f;
        }
        return uiModeManager.getContrast();
    }

    @ChecksSdkIntAtLeast(api = 31)
    @SuppressLint({"DefaultLocale"})
    public static boolean isDynamicColorAvailable() {
        if (Build.VERSION.SDK_INT < 31) {
            return false;
        }
        if (BuildCompat.isAtLeastT()) {
            return true;
        }
        Map map = f26079d;
        String str = Build.MANUFACTURER;
        Locale locale = Locale.ROOT;
        DeviceSupportCondition deviceSupportCondition = (DeviceSupportCondition) map.get(str.toLowerCase(locale));
        if (deviceSupportCondition == null) {
            deviceSupportCondition = (DeviceSupportCondition) f26080e.get(Build.BRAND.toLowerCase(locale));
        }
        return deviceSupportCondition != null && deviceSupportCondition.isSupported();
    }

    @NonNull
    public static Context wrapContextIfAvailable(@NonNull Context context) {
        return wrapContextIfAvailable(context, 0);
    }

    @Deprecated
    public static void applyIfAvailable(@NonNull Activity activity, @StyleRes int i10) {
        applyToActivityIfAvailable(activity, new DynamicColorsOptions.Builder().setThemeOverlay(i10).build());
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(@NonNull Application application, @StyleRes int i10) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().setThemeOverlay(i10).build());
    }

    public static void applyToActivityIfAvailable(@NonNull Activity activity, @NonNull DynamicColorsOptions dynamicColorsOptions) {
        if (isDynamicColorAvailable()) {
            int iA = dynamicColorsOptions.getContentBasedSeedColor() == null ? dynamicColorsOptions.getThemeOverlay() == 0 ? a(activity, f26076a) : dynamicColorsOptions.getThemeOverlay() : 0;
            if (dynamicColorsOptions.getPrecondition().shouldApplyDynamicColors(activity, iA)) {
                if (dynamicColorsOptions.getContentBasedSeedColor() != null) {
                    SchemeContent schemeContent = new SchemeContent(Hct.fromInt(dynamicColorsOptions.getContentBasedSeedColor().intValue()), !MaterialColors.c(activity), b(activity));
                    ColorResourcesOverride colorResourcesOverrideA = i.a();
                    if (colorResourcesOverrideA == null || !colorResourcesOverrideA.applyIfPossible(activity, MaterialColorUtilitiesHelper.createColorResourcesIdsToColorValues(schemeContent))) {
                        return;
                    }
                } else {
                    ThemeUtils.applyThemeOverlay(activity, iA);
                }
                dynamicColorsOptions.getOnAppliedCallback().onApplied(activity);
            }
        }
    }

    @NonNull
    public static Context wrapContextIfAvailable(@NonNull Context context, @StyleRes int i10) {
        return wrapContextIfAvailable(context, new DynamicColorsOptions.Builder().setThemeOverlay(i10).build());
    }

    @Deprecated
    public static void applyIfAvailable(@NonNull Activity activity, @NonNull Precondition precondition) {
        applyToActivityIfAvailable(activity, new DynamicColorsOptions.Builder().setPrecondition(precondition).build());
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(@NonNull Application application, @NonNull Precondition precondition) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().setPrecondition(precondition).build());
    }

    @NonNull
    public static Context wrapContextIfAvailable(@NonNull Context context, @NonNull DynamicColorsOptions dynamicColorsOptions) {
        if (isDynamicColorAvailable()) {
            int themeOverlay = dynamicColorsOptions.getThemeOverlay();
            if (themeOverlay == 0) {
                themeOverlay = a(context, f26076a);
            }
            if (themeOverlay != 0) {
                if (dynamicColorsOptions.getContentBasedSeedColor() != null) {
                    SchemeContent schemeContent = new SchemeContent(Hct.fromInt(dynamicColorsOptions.getContentBasedSeedColor().intValue()), !MaterialColors.c(context), b(context));
                    ColorResourcesOverride colorResourcesOverrideA = i.a();
                    if (colorResourcesOverrideA != null) {
                        return colorResourcesOverrideA.wrapContextIfPossible(context, MaterialColorUtilitiesHelper.createColorResourcesIdsToColorValues(schemeContent));
                    }
                }
                return new ContextThemeWrapper(context, themeOverlay);
            }
        }
        return context;
    }

    @Deprecated
    public static void applyToActivitiesIfAvailable(@NonNull Application application, @StyleRes int i10, @NonNull Precondition precondition) {
        applyToActivitiesIfAvailable(application, new DynamicColorsOptions.Builder().setThemeOverlay(i10).setPrecondition(precondition).build());
    }

    public static void applyToActivitiesIfAvailable(@NonNull Application application, @NonNull DynamicColorsOptions dynamicColorsOptions) {
        application.registerActivityLifecycleCallbacks(new DynamicColorsActivityLifecycleCallbacks(dynamicColorsOptions));
    }
}
