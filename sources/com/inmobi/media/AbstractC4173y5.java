package com.inmobi.media;

import android.app.ActivityManager;
import android.content.Context;
import android.content.res.Resources;
import com.amazon.device.ads.DtbConstants;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: com.inmobi.media.y5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public abstract class AbstractC4173y5 {
    public static final int a() {
        int i10 = Resources.getSystem().getDisplayMetrics().densityDpi;
        if (640 <= i10 && i10 <= Integer.MAX_VALUE) {
            return 1080;
        }
        if (480 > i10 || i10 >= 640) {
            return (320 > i10 || i10 >= 480) ? (240 > i10 || i10 >= 320) ? 240 : 360 : DtbConstants.DEFAULT_PLAYER_HEIGHT;
        }
        return 720;
    }

    public static final boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Object systemService = context.getSystemService("activity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.ActivityManager");
        ActivityManager activityManager = (ActivityManager) systemService;
        Intrinsics.checkNotNullParameter(activityManager, "<this>");
        C4148x5.f39893a.getClass();
        if (!(C4148x5.u() ? activityManager.isLowRamDevice() : true)) {
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            activityManager.getMemoryInfo(memoryInfo);
            if (memoryInfo.availMem / ((long) 1048576) >= 100) {
                return false;
            }
        }
        return true;
    }
}
