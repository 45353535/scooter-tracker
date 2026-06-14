package com.applovin.impl;

import java.util.Timer;
import java.util.TimerTask;

/* JADX INFO: loaded from: classes6.dex */
public class g7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f8911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Timer f8912b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f8913c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f8914d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f8915e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f8916f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Runnable f8917g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f8918h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Object f8919i = new Object();

    class a extends TimerTask {
        a() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public void run() {
            try {
                g7.this.f8917g.run();
                synchronized (g7.this.f8919i) {
                    try {
                        if (g7.this.f8916f) {
                            g7.this.f8913c = System.currentTimeMillis();
                            g7 g7Var = g7.this;
                            g7Var.f8914d = g7Var.f8915e;
                        } else {
                            g7.this.f8912b = null;
                        }
                    } finally {
                    }
                }
            } catch (Throwable th2) {
                try {
                    if (g7.this.f8911a != null) {
                        g7.this.f8911a.O();
                        if (com.applovin.impl.sdk.o.a()) {
                            g7.this.f8911a.O().a("Timer", "Encountered error while executing timed task", th2);
                        }
                        g7.this.f8911a.D().a("Timer", "executingTimedTask", th2);
                    }
                    synchronized (g7.this.f8919i) {
                        try {
                            if (g7.this.f8916f) {
                                g7.this.f8913c = System.currentTimeMillis();
                                g7 g7Var2 = g7.this;
                                g7Var2.f8914d = g7Var2.f8915e;
                            } else {
                                g7.this.f8912b = null;
                            }
                        } finally {
                        }
                    }
                } catch (Throwable th3) {
                    synchronized (g7.this.f8919i) {
                        try {
                            if (g7.this.f8916f) {
                                g7.this.f8913c = System.currentTimeMillis();
                                g7 g7Var3 = g7.this;
                                g7Var3.f8914d = g7Var3.f8915e;
                            } else {
                                g7.this.f8912b = null;
                            }
                            throw th3;
                        } finally {
                        }
                    }
                }
            }
        }
    }

    private g7(com.applovin.impl.sdk.k kVar, Runnable runnable) {
        this.f8911a = kVar;
        this.f8917g = runnable;
    }

    public long c() {
        if (this.f8912b == null) {
            return this.f8914d - this.f8918h;
        }
        return this.f8914d - (System.currentTimeMillis() - this.f8913c);
    }

    public void d() {
        synchronized (this.f8919i) {
            Timer timer = this.f8912b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f8918h = Math.max(1L, System.currentTimeMillis() - this.f8913c);
                } catch (Throwable th2) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.f8911a;
                        if (kVar != null) {
                            kVar.O();
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f8911a.O();
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f8911a.O().a("Timer", "Encountered error while pausing timer", th2);
                                }
                            }
                        }
                        this.f8912b = null;
                    } finally {
                        this.f8912b = null;
                    }
                }
            }
        }
    }

    public void e() {
        g7 g7Var;
        synchronized (this.f8919i) {
            try {
                try {
                    long j10 = this.f8918h;
                    if (j10 > 0) {
                        try {
                            long j11 = this.f8914d - j10;
                            this.f8914d = j11;
                            if (j11 < 0) {
                                this.f8914d = 0L;
                            }
                            this.f8912b = new Timer();
                            g7Var = this;
                            try {
                                g7Var.a(b(), this.f8914d, this.f8916f, this.f8915e);
                                g7Var.f8913c = System.currentTimeMillis();
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    com.applovin.impl.sdk.k kVar = g7Var.f8911a;
                                    if (kVar != null) {
                                        kVar.O();
                                        if (com.applovin.impl.sdk.o.a()) {
                                            g7Var.f8911a.O();
                                            if (com.applovin.impl.sdk.o.a()) {
                                                g7Var.f8911a.O().a("Timer", "Encountered error while resuming timer", th);
                                            }
                                        }
                                    }
                                    g7Var.f8918h = 0L;
                                } finally {
                                    g7Var.f8918h = 0L;
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            g7Var = this;
                        }
                    }
                } catch (Throwable th4) {
                    th = th4;
                    throw th;
                }
            } catch (Throwable th5) {
                th = th5;
                throw th;
            }
        }
    }

    private TimerTask b() {
        return new a();
    }

    public static g7 a(long j10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        return a(j10, false, kVar, runnable);
    }

    public static g7 a(long j10, boolean z10, com.applovin.impl.sdk.k kVar, Runnable runnable) {
        if (j10 < 0) {
            throw new IllegalArgumentException("Cannot create a scheduled timer. Invalid fire time passed in: " + j10 + ".");
        }
        if (runnable != null) {
            g7 g7Var = new g7(kVar, runnable);
            g7Var.f8913c = System.currentTimeMillis();
            g7Var.f8914d = j10;
            g7Var.f8916f = z10;
            g7Var.f8915e = j10;
            try {
                g7Var.f8912b = new Timer();
                g7Var.a(g7Var.b(), j10, z10, g7Var.f8915e);
                return g7Var;
            } catch (OutOfMemoryError e10) {
                kVar.O();
                if (com.applovin.impl.sdk.o.a()) {
                    kVar.O().a("Timer", "Failed to create timer due to OOM error", e10);
                }
                return g7Var;
            }
        }
        throw new IllegalArgumentException("Cannot create a scheduled timer. Runnable is null.");
    }

    public void a() {
        synchronized (this.f8919i) {
            Timer timer = this.f8912b;
            if (timer != null) {
                try {
                    timer.cancel();
                    this.f8912b = null;
                } catch (Throwable th2) {
                    try {
                        com.applovin.impl.sdk.k kVar = this.f8911a;
                        if (kVar != null) {
                            kVar.O();
                            if (com.applovin.impl.sdk.o.a()) {
                                this.f8911a.O();
                                if (com.applovin.impl.sdk.o.a()) {
                                    this.f8911a.O().a("Timer", "Encountered error while cancelling timer", th2);
                                }
                            }
                        }
                        this.f8912b = null;
                    } catch (Throwable th3) {
                        this.f8912b = null;
                        this.f8918h = 0L;
                        throw th3;
                    }
                }
                this.f8918h = 0L;
            }
        }
    }

    private void a(TimerTask timerTask, long j10, boolean z10, long j11) {
        if (z10) {
            this.f8912b.schedule(timerTask, j10, j11);
        } else {
            this.f8912b.schedule(timerTask, j10);
        }
    }
}
