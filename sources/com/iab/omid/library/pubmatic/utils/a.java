package com.iab.omid.library.pubmatic.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.pubmatic.adsession.DeviceCategory;

/* JADX INFO: loaded from: classes9.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static UiModeManager f35765a;

    public static DeviceCategory a() {
        UiModeManager uiModeManager = f35765a;
        if (uiModeManager == null) {
            return DeviceCategory.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
    }

    public static void a(Context context) {
        if (context != null) {
            f35765a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
