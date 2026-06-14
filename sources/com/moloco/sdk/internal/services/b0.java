package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 implements a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f55285a;

    public b0(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f55285a = context;
    }

    @Override // com.moloco.sdk.internal.services.a0
    public int a() {
        Intent intentRegisterReceiver = this.f55285a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return intentRegisterReceiver.getIntExtra("status", 1);
        }
        return 1;
    }

    @Override // com.moloco.sdk.internal.services.a0
    public int b() {
        Intent intentRegisterReceiver = this.f55285a.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (intentRegisterReceiver != null) {
            return intentRegisterReceiver.getIntExtra("scale", -1);
        }
        return -1;
    }

    @Override // com.moloco.sdk.internal.services.a0
    public boolean c() {
        Object systemService = this.f55285a.getSystemService("power");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.PowerManager");
        return ((PowerManager) systemService).isPowerSaveMode();
    }
}
