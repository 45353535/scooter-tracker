package com.applovin.impl.sdk;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import com.applovin.impl.n7;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.SessionTracker;
import com.applovin.impl.x4;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes6.dex */
public class h implements AppLovinBroadcastManager.Receiver {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final k f10648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final AtomicReference f10649b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Handler f10650c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Handler f10651d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final AtomicLong f10652e = new AtomicLong(0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f10653f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f10654g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f10655h;

    private enum b {
        INELIGIBLE,
        IDLE,
        MONITORING
    }

    private class c implements Runnable {
        private c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            String str;
            if (h.this.f10649b.get() != b.MONITORING) {
                return;
            }
            long jCurrentTimeMillis = System.currentTimeMillis() - h.this.f10652e.get();
            if (jCurrentTimeMillis >= 0 && jCurrentTimeMillis <= h.this.f10653f) {
                h.this.f10651d.postDelayed(this, h.this.f10655h);
                return;
            }
            h.this.f10649b.set(b.INELIGIBLE);
            AppLovinBroadcastManager.unregisterReceiver(h.this);
            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
            if (stackTrace.length > 0) {
                StackTraceElement stackTraceElement = stackTrace[0];
                str = stackTraceElement.getClassName() + "." + stackTraceElement.getMethodName();
            } else {
                str = "None";
            }
            long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - k.n());
            HashMap map = new HashMap(3);
            map.put("top_main_method", str);
            map.put("source", h.this.f10648a.z0() ? "non_first_session" : "first_session");
            map.put("details", "seconds_since_app_launch=" + seconds);
            h.this.f10648a.D().d(com.applovin.impl.d2.F0, map);
        }
    }

    private class d implements Runnable {
        private d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.f10649b.get() != b.MONITORING) {
                return;
            }
            h.this.f10652e.set(System.currentTimeMillis());
            h.this.f10650c.postDelayed(this, h.this.f10654g);
        }
    }

    public h(k kVar) {
        this.f10648a = kVar;
        this.f10649b = new AtomicReference(!n7.c(kVar) ? b.IDLE : b.INELIGIBLE);
        this.f10650c = new Handler(k.o().getMainLooper());
        HandlerThread handlerThread = new HandlerThread("AppLovinSdk:anr_detector");
        handlerThread.start();
        this.f10651d = new Handler(handlerThread.getLooper());
    }

    @Override // com.applovin.impl.sdk.AppLovinBroadcastManager.Receiver
    public void onReceive(Intent intent, Map map) {
        String action = intent.getAction();
        if (SessionTracker.ACTION_APPLICATION_PAUSED.equals(action)) {
            b();
        } else if (SessionTracker.ACTION_APPLICATION_RESUMED.equals(action)) {
            c();
        }
    }

    private void b() {
        if (androidx.compose.animation.core.c.a(this.f10649b, b.MONITORING, b.IDLE)) {
            this.f10650c.removeCallbacksAndMessages(null);
            this.f10651d.removeCallbacksAndMessages(null);
        }
    }

    private void c() {
        if (!(((Boolean) this.f10648a.a(x4.f11311f6)).booleanValue() && this.f10648a.m0().getCurrentApplicationState() == SessionTracker.e.PAUSED) && androidx.compose.animation.core.c.a(this.f10649b, b.IDLE, b.MONITORING)) {
            this.f10650c.post(new d());
            this.f10651d.postDelayed(new c(), this.f10655h / 2);
        }
    }

    private void d() {
        AppLovinBroadcastManager.unregisterReceiver(this);
        this.f10653f = ((Long) this.f10648a.a(x4.f11284c6)).longValue();
        this.f10654g = ((Long) this.f10648a.a(x4.f11293d6)).longValue();
        this.f10655h = ((Long) this.f10648a.a(x4.f11302e6)).longValue();
        if (((Boolean) this.f10648a.a(x4.f11311f6)).booleanValue()) {
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_PAUSED));
            AppLovinBroadcastManager.registerReceiver(this, new IntentFilter(SessionTracker.ACTION_APPLICATION_RESUMED));
        }
    }

    public void a() {
        if (this.f10649b.get() == b.INELIGIBLE) {
            return;
        }
        if (!((Boolean) this.f10648a.a(x4.f11275b6)).booleanValue()) {
            b();
        } else {
            d();
            c();
        }
    }
}
