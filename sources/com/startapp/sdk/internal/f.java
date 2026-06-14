package com.startapp.sdk.internal;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Printer;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: loaded from: classes11.dex */
public final class f extends Thread implements Handler.Callback, Printer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public d f64469a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public e f64470b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c f64471c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y3 f64472d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Handler f64473e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AtomicLong f64474f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f64475g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AtomicReference f64476h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f64477i;

    public f(long j10, boolean z10) {
        super("startapp-anr");
        this.f64469a = new a();
        this.f64470b = new b();
        this.f64471c = new c();
        this.f64473e = new Handler(Looper.getMainLooper(), this);
        this.f64474f = new AtomicLong(0L);
        this.f64476h = new AtomicReference("");
        this.f64475g = j10;
        this.f64477i = z10;
    }

    public final void a() {
        long jA = this.f64475g;
        boolean zA = false;
        boolean z10 = true;
        while (!isInterrupted()) {
            if (this.f64474f.getAndAdd(jA) == 0) {
                if (zA && !a((String) this.f64476h.get())) {
                    this.f64469a.remove();
                    zA = false;
                }
                this.f64473e.sendEmptyMessage(101);
                z10 = true;
            }
            try {
                synchronized (this) {
                    wait(jA);
                }
                long j10 = this.f64474f.get();
                String str = (String) this.f64476h.get();
                if (j10 > 0 && !zA && (z10 || a(str))) {
                    if (Debug.isDebuggerConnected() || Debug.waitingForDebugger()) {
                        zA = true;
                    } else {
                        jA = this.f64470b.a(j10);
                        if (jA > 0) {
                            z10 = false;
                        } else {
                            zA = this.f64469a.a(str, j10);
                            jA = this.f64475g;
                        }
                    }
                }
            } catch (InterruptedException unused) {
                this.f64471c.getClass();
                return;
            } catch (Throwable unused2) {
                return;
            }
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        this.f64474f.set(0L);
        return true;
    }

    @Override // android.util.Printer
    public final void println(String str) {
        if (str.startsWith(">>>>>")) {
            this.f64476h.set(str);
        } else if (str.startsWith("<<<<<")) {
            this.f64476h.set("");
            this.f64474f.set(0L);
        }
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            a();
        } catch (Throwable unused) {
        }
    }

    @Override // java.lang.Thread
    public final void start() {
        this.f64469a.a();
        this.f64469a.remove();
        if (this.f64477i) {
            Looper.getMainLooper().setMessageLogging(this);
        }
        super.start();
    }

    public final boolean a(String str) {
        boolean z10 = (this.f64477i && TextUtils.isEmpty(str)) ? false : true;
        y3 y3Var = this.f64472d;
        return z10 && (y3Var == null || !vi.c(y3Var.f65596a.f65370a));
    }
}
