package com.bytedance.sdk.openadsdk.utils;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.SystemClock;
import android.util.Log;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes6.dex */
public class wd {
    private static long lnr = 0;
    static int qdl = -1;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    static float f17892ud;

    public static class qdl {
        public final int qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        public final float f17893ud;

        public qdl(int i10, float f10) {
            this.qdl = i10;
            this.f17893ud = f10;
        }
    }

    private static void qdl(Intent intent) {
        if (intent.getIntExtra("status", -1) == 2) {
            qdl = 1;
        } else {
            qdl = 0;
        }
        f17892ud = (intent.getIntExtra("level", -1) * 100) / intent.getIntExtra("scale", -1);
    }

    @NonNull
    public static qdl qdl() {
        if (lnr == 0 || SystemClock.elapsedRealtime() - lnr > 60000) {
            Intent intentRegisterReceiver = com.bytedance.sdk.openadsdk.core.yt.qdl().registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            Log.d("BatteryDataWatcher", "obtainCurrentState: registerReceiver result is ".concat(String.valueOf(intentRegisterReceiver)));
            if (intentRegisterReceiver != null) {
                qdl(intentRegisterReceiver);
                lnr = SystemClock.elapsedRealtime();
            }
        }
        return new qdl(qdl, f17892ud);
    }
}
