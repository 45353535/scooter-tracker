package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public class g0 implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Set f8886c = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g7 f8887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8888b;

    private g0(long j10, final boolean z10, com.applovin.impl.sdk.k kVar, final Runnable runnable) {
        this.f8887a = g7.a(j10, z10, kVar, new Runnable() { // from class: com.applovin.impl.ta
            @Override // java.lang.Runnable
            public final void run() {
                this.f11025b.a(z10, runnable);
            }
        });
        this.f8888b = kVar;
        f8886c.add(this);
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
        AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
    }

    public long b() {
        return this.f8887a.c();
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            this.f8887a.d();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            this.f8887a.e();
        }
    }

    public static g0 a(long j10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return a(j10, false, kVar, runnable);
    }

    public static g0 a(long j10, boolean z10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return new g0(j10, z10, kVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void a(boolean z10, Runnable runnable) {
        if (!z10) {
            a();
        }
        if (runnable != null) {
            runnable.run();
        }
    }

    public void a() {
        this.f8887a.a();
        AppLovinBroadcastManager.unregisterReceiver(this);
        f8886c.remove(this);
    }
}
