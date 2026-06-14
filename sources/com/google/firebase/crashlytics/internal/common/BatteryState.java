package com.google.firebase.crashlytics.internal.common;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.google.firebase.crashlytics.internal.Logger;

/* JADX INFO: loaded from: classes9.dex */
class BatteryState {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Float f31978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f31979b;

    private BatteryState(Float f10, boolean z10) {
        this.f31979b = z10;
        this.f31978a = f10;
    }

    private static Float a(Intent intent) {
        int intExtra = intent.getIntExtra("level", -1);
        int intExtra2 = intent.getIntExtra("scale", -1);
        if (intExtra == -1 || intExtra2 == -1) {
            return null;
        }
        return Float.valueOf(intExtra / intExtra2);
    }

    private static boolean b(Intent intent) {
        int intExtra = intent.getIntExtra("status", -1);
        if (intExtra == -1) {
            return false;
        }
        return intExtra == 2 || intExtra == 5;
    }

    public static BatteryState get(Context context) {
        boolean zB = false;
        Float fA = null;
        try {
            Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            if (intentRegisterReceiver != null) {
                zB = b(intentRegisterReceiver);
                fA = a(intentRegisterReceiver);
            }
        } catch (IllegalStateException e10) {
            Logger.getLogger().e("An error occurred getting battery state.", e10);
        }
        return new BatteryState(fA, zB);
    }

    public Float getBatteryLevel() {
        return this.f31978a;
    }

    public int getBatteryVelocity() {
        Float f10;
        if (!this.f31979b || (f10 = this.f31978a) == null) {
            return 1;
        }
        return ((double) f10.floatValue()) < 0.99d ? 2 : 3;
    }
}
