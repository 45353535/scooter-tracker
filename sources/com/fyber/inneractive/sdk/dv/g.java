package com.fyber.inneractive.sdk.dv;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.util.IAlog;

/* JADX INFO: loaded from: classes7.dex */
public final class g extends BroadcastReceiver {
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        IAlog.a("DVKit: onReceive in package: %s", context.getApplicationContext().getPackageName());
        com.fyber.inneractive.sdk.factories.d.f20613a.a(com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_MOBILE_ADS, new d());
        com.fyber.inneractive.sdk.factories.h.f20615a.f20616a.add(new e());
        com.fyber.inneractive.sdk.factories.b.f20611a.f20612a.add(new f(this));
    }
}
