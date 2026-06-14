package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: loaded from: classes11.dex */
public final class vj extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.startapp.sdk.ads.video.c f65413a;

    public vj(com.startapp.sdk.ads.video.c cVar) {
        this.f65413a = cVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        if (this.f65413a.f63884s0.isInitialStickyBroadcast()) {
            return;
        }
        com.startapp.sdk.ads.video.c cVar = this.f65413a;
        cVar.S = !cVar.S;
        cVar.F();
        com.startapp.sdk.ads.video.c cVar2 = this.f65413a;
        cVar2.a(cVar2.S);
    }
}
