package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes11.dex */
public final class gc {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final AtomicInteger f64562g = new AtomicInteger();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Handler f64563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Handler f64564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Thread f64565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public volatile boolean f64566d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f64567e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f64568f;

    public gc(Looper looper) {
        this.f64563a = new Handler(looper, new ec(this));
        this.f64564b = new Handler(looper);
    }

    public final void a(Runnable runnable) {
        boolean z10;
        while (!Thread.currentThread().isInterrupted()) {
            try {
                long j10 = -SystemClock.elapsedRealtime();
                synchronized (this) {
                    this.f64566d = false;
                    this.f64563a.sendEmptyMessage(0);
                    wait(2000L);
                    z10 = this.f64566d;
                }
                long jElapsedRealtime = j10 + SystemClock.elapsedRealtime();
                int i10 = this.f64568f;
                if (i10 < 8) {
                    this.f64568f = i10 + 1;
                    this.f64567e += jElapsedRealtime;
                } else {
                    long j11 = this.f64567e;
                    this.f64567e = (jElapsedRealtime - (j11 / ((long) i10))) + j11;
                }
                if (!z10) {
                    this.f64567e = 0L;
                    this.f64568f = 0;
                    synchronized (this) {
                        wait(5000L);
                    }
                } else {
                    if (this.f64567e < 160) {
                        this.f64564b.post(runnable);
                        this.f64567e = 0L;
                        this.f64568f = 0;
                        return;
                    }
                    synchronized (this) {
                        wait(200L);
                    }
                }
            } catch (InterruptedException unused) {
                return;
            } catch (Throwable th2) {
                g9.a(th2);
                return;
            }
        }
    }
}
