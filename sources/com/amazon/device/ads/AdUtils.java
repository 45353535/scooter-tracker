package com.amazon.device.ads;

import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.util.HashSet;

/* JADX INFO: loaded from: classes5.dex */
class AdUtils {
    public static final String REQUIRED_ACTIVITY = "com.amazon.device.ads.AdActivity";
    private static AdUtilsExecutor executor = new AdUtilsExecutor();

    static class AdUtilsExecutor {
        private boolean hasRequiredActivities;
        private final HashSet<String> requiredActivities;

        AdUtilsExecutor() {
            HashSet<String> hashSet = new HashSet<>();
            this.requiredActivities = hashSet;
            this.hasRequiredActivities = false;
            hashSet.add(AdUtils.REQUIRED_ACTIVITY);
        }

        double calculateScalingMultiplier(int i10, int i11, int i12, int i13) {
            double d10 = ((double) i12) / ((double) i10);
            double d11 = ((double) i13) / ((double) i11);
            if ((d11 < d10 || d10 == 0.0d) && d11 != 0.0d) {
                d10 = d11;
            }
            if (d10 == 0.0d) {
                return 1.0d;
            }
            return d10;
        }

        int deviceIndependentPixelToPixel(int i10) {
            return (int) (i10 == -1 ? i10 : i10 * getScalingFactorAsFloat());
        }

        float getScalingFactorAsFloat() {
            WindowManager windowManager = (WindowManager) AdRegistration.getContext().getSystemService("window");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            return displayMetrics.scaledDensity;
        }

        int pixelToDeviceIndependentPixel(int i10) {
            return (int) (i10 / getScalingFactorAsFloat());
        }
    }

    private AdUtils() {
    }

    public static double calculateScalingMultiplier(int i10, int i11, int i12, int i13) {
        return executor.calculateScalingMultiplier(i10, i11, i12, i13);
    }

    public static int deviceIndependentPixelToPixel(int i10) {
        return executor.deviceIndependentPixelToPixel(i10);
    }

    public static float getScalingFactorAsFloat() {
        return executor.getScalingFactorAsFloat();
    }

    public static int pixelToDeviceIndependentPixel(int i10) {
        return executor.pixelToDeviceIndependentPixel(i10);
    }
}
