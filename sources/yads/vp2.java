package yads;

import android.os.SystemClock;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vp2 implements RunnableFuture {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final hy f117142b = new hy();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final hy f117143c = new hy();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f117144d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Exception f117145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Thread f117146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f117147g;

    public abstract void a();

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        synchronized (this.f117144d) {
            try {
                if (!this.f117147g && !this.f117143c.c()) {
                    this.f117147g = true;
                    ((rh2) this).f115451h.f115809d.f115911j = true;
                    Thread thread = this.f117146f;
                    if (thread == null) {
                        this.f117142b.d();
                        this.f117143c.d();
                    } else if (z10) {
                        thread.interrupt();
                    }
                    return true;
                }
                return false;
            } finally {
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get() throws ExecutionException {
        this.f117143c.a();
        if (this.f117147g) {
            throw new CancellationException();
        }
        if (this.f117145e == null) {
            return null;
        }
        throw new ExecutionException(this.f117145e);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f117147g;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        boolean z10;
        hy hyVar = this.f117143c;
        synchronized (hyVar) {
            z10 = hyVar.f111800a;
        }
        return z10;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        synchronized (this.f117144d) {
            try {
                if (this.f117147g) {
                    return;
                }
                this.f117146f = Thread.currentThread();
                this.f117142b.d();
                try {
                    try {
                        a();
                        synchronized (this.f117144d) {
                            this.f117143c.d();
                            this.f117146f = null;
                            Thread.interrupted();
                        }
                    } catch (Throwable th2) {
                        synchronized (this.f117144d) {
                            this.f117143c.d();
                            this.f117146f = null;
                            Thread.interrupted();
                            throw th2;
                        }
                    }
                } catch (Exception e10) {
                    this.f117145e = e10;
                    synchronized (this.f117144d) {
                        this.f117143c.d();
                        this.f117146f = null;
                        Thread.interrupted();
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j10, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        boolean z10;
        long jConvert = TimeUnit.MILLISECONDS.convert(j10, timeUnit);
        hy hyVar = this.f117143c;
        synchronized (hyVar) {
            if (jConvert <= 0) {
                z10 = hyVar.f111800a;
            } else {
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                long j11 = jConvert + jElapsedRealtime;
                if (j11 < jElapsedRealtime) {
                    hyVar.a();
                } else {
                    while (!hyVar.f111800a && jElapsedRealtime < j11) {
                        hyVar.wait(j11 - jElapsedRealtime);
                        jElapsedRealtime = SystemClock.elapsedRealtime();
                    }
                }
                z10 = hyVar.f111800a;
            }
        }
        if (z10) {
            if (!this.f117147g) {
                if (this.f117145e == null) {
                    return null;
                }
                throw new ExecutionException(this.f117145e);
            }
            throw new CancellationException();
        }
        throw new TimeoutException();
    }
}
