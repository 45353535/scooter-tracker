package com.applovin.impl;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes6.dex */
public class h8 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Set f8991f = new HashSet();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f8992a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8993b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Runnable f8994c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Object f8995d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Timer f8996e;

    class a extends TimerTask {

        /* JADX INFO: renamed from: com.applovin.impl.h8$a$a, reason: collision with other inner class name */
        class C0172a implements AppLovinBroadcastManager.Receiver {
            C0172a() {
            }

            @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
            public void onReceive(Intent intent, Map map) {
                AppLovinBroadcastManager.unregisterReceiver(this);
                h8.this.c();
            }
        }

        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            if (!h8.this.f8993b.m0().isApplicationPaused() || h8.this.f8992a) {
                h8.this.c();
            } else {
                AppLovinBroadcastManager.registerReceiver(new C0172a(), new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
            }
        }
    }

    private h8(long j10, boolean z10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        Timer timer = new Timer();
        this.f8996e = timer;
        if (j10 < 0) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Invalid timer length: " + j10);
        }
        if (kVar == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Sdk is null");
        }
        if (runnable == null) {
            throw new IllegalArgumentException("Cannot create wall clock timer. Runnable is null.");
        }
        this.f8992a = z10;
        this.f8993b = kVar;
        this.f8994c = runnable;
        f8991f.add(this);
        timer.schedule(b(), j10);
    }

    public static h8 a(long j10, boolean z10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return new h8(j10, z10, kVar, runnable);
    }

    private TimerTask b() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c() {
        Runnable runnable = this.f8994c;
        if (runnable != null) {
            runnable.run();
            a();
        }
    }

    public void a() {
        synchronized (this.f8995d) {
            this.f8996e.cancel();
            this.f8994c = null;
            f8991f.remove(this);
        }
    }
}
