package com.applovin.impl.sdk;

import android.app.Activity;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import com.applovin.impl.n7;
import com.applovin.impl.x4;
import com.ironsource.C4240b4;
import java.util.Date;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: loaded from: classes6.dex */
public class SessionTracker {
    public static final String ACTION_APPLICATION_PAUSED = "com.applovin.application_paused";
    public static final String ACTION_APPLICATION_RESUMED = "com.applovin.application_resumed";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final k f10484a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f10485b = UUID.randomUUID().toString();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f10486c = new AtomicBoolean();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f10487d = new AtomicBoolean();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicInteger f10488e = new AtomicInteger();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicLong f10489f = new AtomicLong();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicLong f10490g = new AtomicLong();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicLong f10491h = new AtomicLong();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Date f10492i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Date f10493j;

    class a extends com.applovin.impl.b {
        a() {
        }

        @Override // com.applovin.impl.b, android.app.Application.ActivityLifecycleCallbacks
        public void onActivityResumed(Activity activity) {
            super.onActivityResumed(activity);
            SessionTracker.this.b();
        }
    }

    class b implements ComponentCallbacks2 {
        b() {
        }

        @Override // android.content.ComponentCallbacks
        public void onConfigurationChanged(Configuration configuration) {
        }

        @Override // android.content.ComponentCallbacks
        public void onLowMemory() {
        }

        @Override // android.content.ComponentCallbacks2
        public void onTrimMemory(int i10) {
            SessionTracker.this.f10488e.set(i10);
            if (i10 == 20) {
                SessionTracker.this.a();
            }
        }
    }

    class c extends BroadcastReceiver {
        c() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            String action = intent.getAction();
            if ("android.intent.action.USER_PRESENT".equals(action)) {
                if (n7.h()) {
                    SessionTracker.this.b();
                }
            } else if ("android.intent.action.SCREEN_OFF".equals(action)) {
                SessionTracker.this.a();
            }
        }
    }

    static /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f10497a;

        static {
            int[] iArr = new int[e.values().length];
            f10497a = iArr;
            try {
                iArr[e.STARTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f10497a[e.PAUSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f10497a[e.RESUMED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum e {
        STARTED(C4240b4.i.f42621d0),
        PAUSED(C4240b4.i.f42623e0),
        RESUMED("resumed");


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f10502a;

        e(String str) {
            this.f10502a = str;
        }

        public String b() {
            return this.f10502a;
        }
    }

    SessionTracker(k kVar) {
        this.f10484a = kVar;
        Application application = (Application) k.o();
        application.registerActivityLifecycleCallbacks(new a());
        application.registerComponentCallbacks(new b());
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        application.registerReceiver(new c(), intentFilter);
    }

    private void d() {
        this.f10484a.O();
        if (o.a()) {
            this.f10484a.O().a("SessionTracker", "Application Resumed");
        }
        this.f10490g.set(System.currentTimeMillis());
        this.f10491h.addAndGet(this.f10490g.get() - this.f10489f.get());
        boolean zBooleanValue = ((Boolean) this.f10484a.a(x4.f11435u3)).booleanValue();
        long jLongValue = ((Long) this.f10484a.a(x4.f11443v3)).longValue();
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_RESUMED), null);
        if (this.f10486c.getAndSet(false)) {
            return;
        }
        long millis = TimeUnit.MINUTES.toMillis(jLongValue);
        if (this.f10493j == null || System.currentTimeMillis() - this.f10493j.getTime() >= millis) {
            this.f10484a.F().trackEvent("resumed");
            if (zBooleanValue) {
                this.f10493j = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.f10493j = new Date();
    }

    public long getAppEnteredBackgroundTimeMillis() {
        return this.f10489f.get();
    }

    public long getAppEnteredForegroundTimeMillis() {
        return this.f10490g.get();
    }

    public e getCurrentApplicationState() {
        return this.f10487d.get() ? e.PAUSED : this.f10489f.get() != 0 ? e.RESUMED : e.STARTED;
    }

    public long getCurrentApplicationStateDurationMillis() {
        long jN;
        long jCurrentTimeMillis = System.currentTimeMillis();
        int i10 = d.f10497a[getCurrentApplicationState().ordinal()];
        if (i10 == 1) {
            jN = k.n();
        } else if (i10 == 2) {
            jN = this.f10489f.get();
        } else {
            if (i10 != 3) {
                return -1L;
            }
            jN = this.f10490g.get();
        }
        return jCurrentTimeMillis - jN;
    }

    public int getLastTrimMemoryLevel() {
        return this.f10488e.get();
    }

    public String getSessionId() {
        return this.f10485b;
    }

    public long getTotalBackgroundDurationMillis() {
        return getCurrentApplicationState() == e.PAUSED ? this.f10491h.get() + getCurrentApplicationStateDurationMillis() : this.f10491h.get();
    }

    public boolean isApplicationPaused() {
        return this.f10487d.get();
    }

    public void pauseForClick() {
        this.f10486c.set(true);
    }

    public void resumeForClick() {
        this.f10486c.set(false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a() {
        if (this.f10487d.compareAndSet(false, true)) {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        if (this.f10487d.compareAndSet(true, false)) {
            d();
        }
    }

    private void c() {
        this.f10484a.O();
        if (o.a()) {
            this.f10484a.O().a("SessionTracker", "Application Paused");
        }
        this.f10489f.set(System.currentTimeMillis());
        AppLovinBroadcastManager.sendBroadcastSync(new Intent(ACTION_APPLICATION_PAUSED), null);
        if (this.f10486c.get()) {
            return;
        }
        boolean zBooleanValue = ((Boolean) this.f10484a.a(x4.f11435u3)).booleanValue();
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f10484a.a(x4.f11451w3)).longValue());
        if (this.f10492i == null || System.currentTimeMillis() - this.f10492i.getTime() >= millis) {
            this.f10484a.F().trackEvent(C4240b4.i.f42623e0);
            if (zBooleanValue) {
                this.f10492i = new Date();
            }
        }
        if (zBooleanValue) {
            return;
        }
        this.f10492i = new Date();
    }
}
