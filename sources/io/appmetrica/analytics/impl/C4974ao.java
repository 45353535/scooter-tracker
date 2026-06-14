package io.appmetrica.analytics.impl;

import android.content.Context;
import android.os.Build;
import android.os.UserManager;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ao, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C4974ao {
    public static boolean a(Context context) {
        if (Build.VERSION.SDK_INT >= 24) {
            return ((Boolean) SystemServiceUtils.accessSystemServiceSafelyOrDefault((UserManager) context.getSystemService(UserManager.class), "detect unlocked user state", "User manager", Boolean.TRUE, new Zn())).booleanValue();
        }
        return true;
    }
}
