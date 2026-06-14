package io.appmetrica.analytics.impl;

import android.app.UiModeManager;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.services.SafePackageManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* JADX INFO: loaded from: classes12.dex */
public abstract class T7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SafePackageManager f76489a = new SafePackageManager();

    public static boolean a(Context context) {
        Object systemService = context.getSystemService("uimode");
        Integer num = (Integer) SystemServiceUtils.accessSystemServiceSafelyOrDefault(systemService instanceof UiModeManager ? (UiModeManager) systemService : null, "getting current mode type", "UiModeManager", null, new FunctionWithThrowable() { // from class: io.appmetrica.analytics.impl.sp
            @Override // io.appmetrica.analytics.coreapi.internal.backport.FunctionWithThrowable
            public final Object apply(Object obj) {
                return T7.a((UiModeManager) obj);
            }
        });
        boolean z10 = num != null && num.intValue() == 4;
        SafePackageManager safePackageManager = f76489a;
        return z10 || safePackageManager.hasSystemFeature(context, "android.software.leanback") || (AndroidUtils.isApiAchieved(26) ? safePackageManager.hasSystemFeature(context, "android.software.leanback_only") : false);
    }

    public static final Integer a(UiModeManager uiModeManager) {
        return Integer.valueOf(uiModeManager.getCurrentModeType());
    }
}
