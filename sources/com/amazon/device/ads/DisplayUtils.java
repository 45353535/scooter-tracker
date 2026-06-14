package com.amazon.device.ads;

import android.content.Context;
import android.provider.Settings;
import android.view.WindowManager;

/* JADX INFO: loaded from: classes5.dex */
class DisplayUtils {
    private static final int[][] rotationArray = {new int[]{1, 0, 9, 8}, new int[]{0, 9, 8, 1}};

    DisplayUtils() {
    }

    public static int determineCanonicalScreenOrientation() {
        Context context = AdRegistration.getContext();
        int rotation = ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getRotation();
        int i10 = context.getResources().getConfiguration().orientation;
        char c10 = 0;
        if (i10 != 1 ? i10 != 2 || rotation == 1 || rotation == 3 : rotation == 0 || rotation == 2) {
            c10 = 1;
        }
        return rotationArray[c10 ^ 1][rotation];
    }

    static int determineSimpleOrientation() {
        int i10 = AdRegistration.getContext().getResources().getConfiguration().orientation;
        if (i10 == 1) {
            return 1;
        }
        return i10 == 2 ? 2 : 0;
    }

    static boolean isRotationLocked() {
        boolean z10 = false;
        try {
            if (Settings.System.getInt(AdRegistration.getContext().getContentResolver(), "accelerometer_rotation") == 1) {
                z10 = true;
            }
        } catch (Settings.SettingNotFoundException unused) {
        }
        return !z10;
    }
}
