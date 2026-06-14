package com.iab.omid.library.appodeal.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.appodeal.adsession.DeviceCategory;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static UiModeManager f34438a;

    public static DeviceCategory a() {
        UiModeManager uiModeManager = f34438a;
        if (uiModeManager == null) {
            return DeviceCategory.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
    }

    public static void a(Context context) {
        if (context != null) {
            f34438a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
