package com.appodeal.ads.utils;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.Nullable;
import com.appodeal.ads.storage.e0;

/* JADX INFO: loaded from: classes6.dex */
public class InstallTrackingHelper {
    private static final com.appodeal.ads.storage.c keyValueStorage = e0.f14799b;

    public static void addPackageToTrackingList(@Nullable String str, long j10) {
        if (str == null || TextUtils.isEmpty(str)) {
            return;
        }
        if (j10 == 0) {
            j10 = 180;
        }
        keyValueStorage.a(str, System.currentTimeMillis() + (j10 * 60000));
        clearUnusedData();
    }

    private static void clearUnusedData() {
        keyValueStorage.a(System.currentTimeMillis());
    }

    public static boolean packageInTrackingList(Context context, String str) {
        com.appodeal.ads.storage.c cVar;
        Long lE;
        if (context != null && !str.isEmpty() && (lE = (cVar = keyValueStorage).e(str)) != null) {
            if (lE.longValue() > System.currentTimeMillis()) {
                return true;
            }
            cVar.a(str);
        }
        return false;
    }
}
