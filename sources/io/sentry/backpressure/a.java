package io.sentry.backpressure;

import io.sentry.b1;
import io.sentry.f1;
import io.sentry.g1;
import io.sentry.g7;
import io.sentry.v7;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes3.dex */
public final class a implements b, Runnable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final v7 f83297b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b1 f83298c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f83299d = 0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Future f83300e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final io.sentry.util.a f83301f = new io.sentry.util.a();

    public a(v7 v7Var, b1 b1Var) {
        this.f83297b = v7Var;
        this.f83298c = b1Var;
    }

    private boolean d() {
        return this.f83298c.u();
    }

    private void e(int i10) {
        f1 executorService = this.f83297b.getExecutorService();
        if (executorService.isClosed()) {
            return;
        }
        g1 g1VarD = this.f83301f.d();
        try {
            try {
                this.f83300e = executorService.schedule(this, i10);
            } catch (Throwable th2) {
                if (g1VarD != null) {
                    try {
                        g1VarD.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        } catch (RejectedExecutionException e10) {
            this.f83297b.getLogger().a(g7.WARNING, "Backpressure monitor reschedule task rejected", e10);
        }
        if (g1VarD != null) {
            g1VarD.close();
        }
    }

    @Override // io.sentry.backpressure.b
    public int a() {
        return this.f83299d;
    }

    void b() {
        if (d()) {
            if (this.f83299d > 0) {
                this.f83297b.getLogger().c(g7.DEBUG, "Health check positive, reverting to normal sampling.", new Object[0]);
            }
            this.f83299d = 0;
        } else {
            int i10 = this.f83299d;
            if (i10 < 10) {
                this.f83299d = i10 + 1;
                this.f83297b.getLogger().c(g7.DEBUG, "Health check negative, downsampling with a factor of %d", Integer.valueOf(this.f83299d));
            }
        }
    }

    @Override // io.sentry.backpressure.b
    public void close() {
        Future future = this.f83300e;
        if (future != null) {
            g1 g1VarD = this.f83301f.d();
            try {
                future.cancel(true);
                if (g1VarD != null) {
                    g1VarD.close();
                }
            } catch (Throwable th2) {
                if (g1VarD != null) {
                    try {
                        g1VarD.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                }
                throw th2;
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        b();
        e(10000);
    }

    @Override // io.sentry.backpressure.b
    public void start() {
        e(500);
    }
}
