package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import com.applovin.impl.g7;
import com.applovin.impl.r3;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import java.lang.ref.WeakReference;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes6.dex */
public class f implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private g7 f10611a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f10612b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f10613c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f10614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final k f10615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final WeakReference f10616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f10617g;

    public interface a {
        void onAdRefresh();
    }

    public f(k kVar, a aVar) {
        this.f10616f = new WeakReference(aVar);
        this.f10615e = kVar;
    }

    private void e() {
        if (((Boolean) this.f10615e.a(r3.D7)).booleanValue()) {
            k();
        }
    }

    private void f() {
        if (((Boolean) this.f10615e.a(r3.D7)).booleanValue()) {
            synchronized (this.f10612b) {
                try {
                    if (this.f10614d) {
                        this.f10615e.O();
                        if (o.a()) {
                            this.f10615e.O().a("AdRefreshManager", "Fullscreen ad dismissed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                        }
                    } else if (this.f10615e.m0().isApplicationPaused()) {
                        this.f10615e.O();
                        if (o.a()) {
                            this.f10615e.O().a("AdRefreshManager", "Waiting for the application to enter foreground to resume the timer.");
                        }
                    } else {
                        g7 g7Var = this.f10611a;
                        if (g7Var != null) {
                            g7Var.e();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void i() {
        l();
        a aVar = (a) this.f10616f.get();
        if (aVar != null) {
            aVar.onAdRefresh();
        }
    }

    private void k() {
        synchronized (this.f10612b) {
            try {
                g7 g7Var = this.f10611a;
                if (g7Var != null) {
                    g7Var.d();
                } else {
                    this.f10615e.O();
                    if (o.a()) {
                        this.f10615e.O().a("AdRefreshManager", "An ad load is in progress. Will pause refresh once the ad finishes loading.");
                    }
                    this.f10613c.set(true);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void l() {
        synchronized (this.f10612b) {
            try {
                this.f10611a = null;
                if (!((Boolean) this.f10615e.a(r3.E7)).booleanValue()) {
                    AppLovinBroadcastManager.unregisterReceiver(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void n() {
        synchronized (this.f10612b) {
            try {
                g7 g7Var = this.f10611a;
                if (g7Var != null) {
                    g7Var.e();
                } else {
                    this.f10613c.set(false);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public long b() {
        long jC;
        synchronized (this.f10612b) {
            try {
                g7 g7Var = this.f10611a;
                jC = g7Var != null ? g7Var.c() : -1L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return jC;
    }

    public void c() {
        if (((Boolean) this.f10615e.a(r3.C7)).booleanValue()) {
            k();
        }
    }

    public void d() {
        boolean z10;
        a aVar;
        if (((Boolean) this.f10615e.a(r3.C7)).booleanValue()) {
            synchronized (this.f10612b) {
                try {
                    if (this.f10614d) {
                        this.f10615e.O();
                        if (o.a()) {
                            this.f10615e.O().a("AdRefreshManager", "Application resumed but banner ad refresh paused by publisher. Waiting for publisher to resume banner ad refresh.");
                        }
                        return;
                    }
                    if (this.f10615e.H().d()) {
                        this.f10615e.O();
                        if (o.a()) {
                            this.f10615e.O().a("AdRefreshManager", "Waiting for the full screen ad to be dismissed to resume the timer.");
                        }
                        return;
                    }
                    if (this.f10611a != null) {
                        long jB = this.f10617g - b();
                        long jLongValue = ((Long) this.f10615e.a(r3.B7)).longValue();
                        if (jLongValue < 0 || jB <= jLongValue) {
                            this.f10611a.e();
                            z10 = false;
                        } else {
                            a();
                            z10 = true;
                        }
                    } else {
                        z10 = false;
                    }
                    if (!z10 || (aVar = (a) this.f10616f.get()) == null) {
                        return;
                    }
                    aVar.onAdRefresh();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public boolean g() {
        return this.f10614d;
    }

    public boolean h() {
        boolean z10;
        synchronized (this.f10612b) {
            z10 = this.f10611a != null;
        }
        return z10;
    }

    public void j() {
        synchronized (this.f10612b) {
            k();
            this.f10614d = true;
        }
    }

    public void m() {
        synchronized (this.f10612b) {
            n();
            this.f10614d = false;
        }
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            c();
            return;
        }
        if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            d();
        } else if ("com.applovin.fullscreen_ad_displayed".equals(action)) {
            e();
        } else if ("com.applovin.fullscreen_ad_hidden".equals(action)) {
            f();
        }
    }

    public void a(long j10) {
        synchronized (this.f10612b) {
            try {
                a();
                this.f10617g = j10;
                this.f10611a = g7.a(j10, this.f10615e, new Runnable() { // from class: com.applovin.impl.sdk.g0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f10645b.i();
                    }
                });
                if (!((Boolean) this.f10615e.a(r3.E7)).booleanValue()) {
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_displayed"));
                    AppLovinBroadcastManager.registerReceiver(this, new IntentFilter("com.applovin.fullscreen_ad_hidden"));
                }
                if (((Boolean) this.f10615e.a(r3.D7)).booleanValue() && (this.f10615e.H().d() || this.f10615e.m0().isApplicationPaused())) {
                    this.f10611a.d();
                }
                if (this.f10613c.compareAndSet(true, false) && ((Boolean) this.f10615e.a(r3.F7)).booleanValue()) {
                    this.f10615e.O();
                    if (o.a()) {
                        this.f10615e.O().a("AdRefreshManager", "Pausing refresh for a previous request.");
                    }
                    this.f10611a.d();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void a() {
        synchronized (this.f10612b) {
            try {
                g7 g7Var = this.f10611a;
                if (g7Var != null) {
                    g7Var.a();
                    l();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
