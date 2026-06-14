package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Pair;

/* JADX INFO: loaded from: classes11.dex */
public final class bf extends BroadcastReceiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ hf f64317a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ cf f64318b;

    public bf(cf cfVar, hf hfVar) {
        this.f64318b = cfVar;
        this.f64317a = hfVar;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        this.f64317a.a(new Pair(this.f64318b, intent));
    }
}
