package com.my.tracker.obfuscated;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes11.dex */
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    int f61756a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    int f61757b = -1;

    public o a(Context context) {
        Intent intentRegisterReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver == null) {
            return null;
        }
        int intExtra = intentRegisterReceiver.getIntExtra("status", 1);
        int i10 = -1;
        int intExtra2 = intentRegisterReceiver.getIntExtra("level", -1);
        int intExtra3 = intentRegisterReceiver.getIntExtra("scale", -1);
        if (intExtra2 >= 0 && intExtra3 > 0) {
            i10 = (intExtra2 * 100) / intExtra3;
        }
        return new o(intExtra, i10);
    }
}
