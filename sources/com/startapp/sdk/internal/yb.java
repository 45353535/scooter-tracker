package com.startapp.sdk.internal;

import android.content.BroadcastReceiver;
import android.content.IntentFilter;

/* JADX INFO: loaded from: classes11.dex */
public final class yb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final IntentFilter f65600a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final BroadcastReceiver f65601b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f65602c;

    public yb(BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        this.f65600a = intentFilter;
        this.f65601b = broadcastReceiver;
    }
}
