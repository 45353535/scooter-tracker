package com.mbridge.msdk.foundation.same.report.crashreport;

import android.annotation.TargetApi;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.util.Log;

/* JADX INFO: loaded from: classes10.dex */
public class c extends Thread {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static volatile c f48784e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f48785a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile b f48786b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.mbridge.msdk.foundation.same.report.crashreport.a f48787c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f48788d;

    private class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f48789a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f48790b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private long f48791c;

        private b() {
            this.f48789a = SystemClock.uptimeMillis();
        }

        void b() {
            this.f48790b = false;
            this.f48791c = SystemClock.uptimeMillis();
            c.this.f48785a.postAtFrontOfQueue(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (c.this) {
                this.f48790b = true;
                this.f48789a = SystemClock.uptimeMillis();
            }
        }

        boolean a() {
            return !this.f48790b || this.f48789a - this.f48791c >= ((long) c.this.f48788d);
        }
    }

    private c() {
        super("AnrMonitor-Thread");
        this.f48785a = new Handler(Looper.getMainLooper());
        this.f48788d = 5000;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    @TargetApi(16)
    public void run() {
        Process.setThreadPriority(10);
        while (true) {
            if (isInterrupted() || !(this.f48786b == null || this.f48786b.f48790b)) {
                try {
                    Thread.sleep(this.f48788d);
                } catch (Exception unused) {
                }
            } else {
                synchronized (this) {
                    try {
                        if (this.f48786b == null) {
                            this.f48786b = new b();
                        }
                        this.f48786b.b();
                        long jUptimeMillis = this.f48788d;
                        long jUptimeMillis2 = SystemClock.uptimeMillis();
                        while (jUptimeMillis > 0) {
                            try {
                                wait(jUptimeMillis);
                            } catch (InterruptedException e10) {
                                Log.w("AnrMonitor", e10.toString());
                            }
                            jUptimeMillis = ((long) this.f48788d) - (SystemClock.uptimeMillis() - jUptimeMillis2);
                        }
                        if (!this.f48786b.a()) {
                            com.mbridge.msdk.foundation.same.report.crashreport.a aVar = this.f48787c;
                            if (aVar != null) {
                                aVar.a();
                            }
                        } else if (!Debug.isDebuggerConnected() && !Debug.waitingForDebugger() && this.f48787c != null) {
                            StackTraceElement[] stackTrace = Looper.getMainLooper().getThread().getStackTrace();
                            this.f48787c.a(d.b(stackTrace), stackTrace);
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
    }

    public static c a() {
        if (f48784e == null) {
            synchronized (c.class) {
                try {
                    if (f48784e == null) {
                        f48784e = new c();
                    }
                } finally {
                }
            }
        }
        return f48784e;
    }

    public c a(int i10, com.mbridge.msdk.foundation.same.report.crashreport.a aVar) {
        this.f48788d = i10;
        this.f48787c = aVar;
        return this;
    }
}
