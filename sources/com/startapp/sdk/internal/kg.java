package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import j$.util.Objects;

/* JADX INFO: loaded from: classes11.dex */
public final class kg extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ lg f64831a;

    public kg(lg lgVar) {
        this.f64831a = lgVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        if (this.f64831a.f64887o.isInitialStickyBroadcast() && intent.getExtras() != null) {
            int i10 = intent.getExtras().getInt("plugged");
            this.f64831a.f64884l = i10 == 1;
        } else if (Objects.equals(intent.getAction(), "android.intent.action.ACTION_POWER_CONNECTED") || Objects.equals(intent.getAction(), "android.intent.action.ACTION_POWER_DISCONNECTED")) {
            this.f64831a.a(false);
        }
    }
}
