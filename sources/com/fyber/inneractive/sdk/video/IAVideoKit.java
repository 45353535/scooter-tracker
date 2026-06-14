package com.fyber.inneractive.sdk.video;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.factories.h;
import com.fyber.inneractive.sdk.player.cache.n;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.s;
import com.fyber.inneractive.sdk.util.w;

/* JADX INFO: loaded from: classes7.dex */
public class IAVideoKit extends BroadcastReceiver {
    private static final w sProvider = new a();

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        w wVar = sProvider;
        IAConfigManager.O.J.put(wVar.getType(), wVar);
        n nVar = n.f21474f;
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            nVar.getClass();
            IAlog.f("context is null, would not start the video cache.", new Object[0]);
        } else if (!nVar.f21477c || !s.a()) {
            nVar.f21475a = applicationContext;
            new Thread(nVar.f21479e, "VideoCache").start();
        }
        IAlog.a("IAVideoKit: onReceive in package: %s", context.getApplicationContext().getPackageName());
        com.fyber.inneractive.sdk.factories.d.f20613a.a(com.fyber.inneractive.sdk.response.a.RETURNED_ADTYPE_VAST, new b());
        h.f20615a.f20616a.add(new c());
        com.fyber.inneractive.sdk.factories.b.f20611a.f20612a.add(new d());
    }
}
