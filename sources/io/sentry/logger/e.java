package io.sentry.logger;

import io.sentry.a7;
import io.sentry.e1;
import io.sentry.f1;
import io.sentry.g1;
import io.sentry.g7;
import io.sentry.i7;
import io.sentry.k7;
import io.sentry.transport.c0;
import io.sentry.v7;
import java.util.ArrayList;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements io.sentry.logger.b {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final io.sentry.util.a f83715h = new io.sentry.util.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final v7 f83716a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e1 f83717b;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f1 f83719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile Future f83720e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile boolean f83721f = false;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final c0 f83722g = new c0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Queue f83718c = new ConcurrentLinkedQueue();

    private class b implements Runnable {
        private b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            e.this.d();
        }
    }

    public e(v7 v7Var, e1 e1Var) {
        this.f83716a = v7Var;
        this.f83717b = e1Var;
        this.f83719d = new a7(v7Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d() {
        f();
        g1 g1VarD = f83715h.d();
        try {
            if (this.f83718c.isEmpty()) {
                this.f83721f = false;
            } else {
                g(true, false);
            }
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

    private void e() {
        ArrayList arrayList = new ArrayList(100);
        do {
            i7 i7Var = (i7) this.f83718c.poll();
            if (i7Var != null) {
                arrayList.add(i7Var);
            }
            if (this.f83718c.isEmpty()) {
                break;
            }
        } while (arrayList.size() < 100);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f83717b.f(new k7(arrayList));
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            this.f83722g.a();
        }
    }

    private void f() {
        do {
            e();
        } while (this.f83718c.size() >= 100);
    }

    private void g(boolean z10, boolean z11) {
        if (!this.f83721f || z10) {
            g1 g1VarD = f83715h.d();
            try {
                Future future = this.f83720e;
                if (z10 || future == null || future.isDone() || future.isCancelled()) {
                    this.f83721f = true;
                    try {
                        this.f83720e = this.f83719d.schedule(new b(), z11 ? 0 : 5000);
                    } catch (RejectedExecutionException e10) {
                        this.f83721f = false;
                        this.f83716a.getLogger().a(g7.WARNING, "Logs batch processor flush task rejected", e10);
                    }
                }
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

    @Override // io.sentry.logger.b
    public void b(boolean z10) {
        if (z10) {
            g(true, true);
            this.f83719d.submit(new Runnable() { // from class: io.sentry.logger.d
                @Override // java.lang.Runnable
                public final void run() {
                    e eVar = this.f83714b;
                    eVar.f83719d.b(eVar.f83716a.getShutdownTimeoutMillis());
                }
            });
        } else {
            this.f83719d.b(this.f83716a.getShutdownTimeoutMillis());
            while (!this.f83718c.isEmpty()) {
                e();
            }
        }
    }

    @Override // io.sentry.logger.b
    public void j(long j10) {
        g(true, true);
        try {
            this.f83722g.d(j10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            this.f83716a.getLogger().a(g7.ERROR, "Failed to flush log events", e10);
            Thread.currentThread().interrupt();
        }
    }
}
