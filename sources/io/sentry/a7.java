package io.sentry;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
public final class a7 implements f1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ScheduledThreadPoolExecutor f82229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.util.a f82230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Runnable f82231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final v7 f82232d;

    private static final class b implements Future {
        private b() {
        }

        @Override // java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            return true;
        }

        @Override // java.util.concurrent.Future
        public Object get() {
            throw new CancellationException();
        }

        @Override // java.util.concurrent.Future
        public boolean isCancelled() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public boolean isDone() {
            return true;
        }

        @Override // java.util.concurrent.Future
        public Object get(long j10, TimeUnit timeUnit) {
            throw new CancellationException();
        }
    }

    private static final class c implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f82233a;

        private c() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("SentryExecutorServiceThreadFactory-");
            int i10 = this.f82233a;
            this.f82233a = i10 + 1;
            sb2.append(i10);
            Thread thread = new Thread(runnable, sb2.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    a7(ScheduledThreadPoolExecutor scheduledThreadPoolExecutor, v7 v7Var) {
        this.f82230b = new io.sentry.util.a();
        this.f82231c = new Runnable() { // from class: io.sentry.y6
            @Override // java.lang.Runnable
            public final void run() {
                a7.d();
            }
        };
        this.f82229a = scheduledThreadPoolExecutor;
        this.f82232d = v7Var;
    }

    public static /* synthetic */ void c(a7 a7Var) {
        a7Var.getClass();
        for (int i10 = 0; i10 < 40; i10++) {
            try {
                a7Var.f82229a.schedule(a7Var.f82231c, 365L, TimeUnit.DAYS).cancel(true);
            } catch (RejectedExecutionException unused) {
                return;
            }
        }
        a7Var.f82229a.purge();
    }

    public static /* synthetic */ void d() {
    }

    private boolean e() {
        if (this.f82229a.getQueue().size() >= 271) {
            this.f82229a.purge();
        }
        return this.f82229a.getQueue().size() < 271;
    }

    @Override // io.sentry.f1
    public void a() {
        try {
            this.f82229a.submit(new Runnable() { // from class: io.sentry.z6
                @Override // java.lang.Runnable
                public final void run() {
                    a7.c(this.f84514b);
                }
            });
        } catch (RejectedExecutionException e10) {
            v7 v7Var = this.f82232d;
            if (v7Var != null) {
                v7Var.getLogger().a(g7.WARNING, "Prewarm task rejected from " + this.f82229a, e10);
            }
        }
    }

    @Override // io.sentry.f1
    public void b(long j10) {
        g1 g1VarD = this.f82230b.d();
        try {
            if (!this.f82229a.isShutdown()) {
                this.f82229a.shutdown();
                try {
                    if (!this.f82229a.awaitTermination(j10, TimeUnit.MILLISECONDS)) {
                        this.f82229a.shutdownNow();
                    }
                } catch (InterruptedException unused) {
                    this.f82229a.shutdownNow();
                    Thread.currentThread().interrupt();
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

    @Override // io.sentry.f1
    public boolean isClosed() {
        g1 g1VarD = this.f82230b.d();
        try {
            boolean zIsShutdown = this.f82229a.isShutdown();
            if (g1VarD != null) {
                g1VarD.close();
            }
            return zIsShutdown;
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

    @Override // io.sentry.f1
    public Future schedule(Runnable runnable, long j10) {
        return this.f82229a.schedule(runnable, j10, TimeUnit.MILLISECONDS);
    }

    @Override // io.sentry.f1
    public Future submit(Runnable runnable) {
        if (e()) {
            return this.f82229a.submit(runnable);
        }
        v7 v7Var = this.f82232d;
        if (v7Var != null) {
            v7Var.getLogger().c(g7.WARNING, "Task " + runnable + " rejected from " + this.f82229a, new Object[0]);
        }
        return new b();
    }

    public a7(v7 v7Var) {
        this(new ScheduledThreadPoolExecutor(1, new c()), v7Var);
    }
}
