package io.sentry.transport;

import io.sentry.ILogger;
import io.sentry.g7;
import io.sentry.s5;
import io.sentry.t5;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes3.dex */
final class x extends ThreadPoolExecutor {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final long f84250g = io.sentry.l.i(2000);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f84251b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private s5 f84252c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ILogger f84253d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final t5 f84254e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c0 f84255f;

    static final class a implements Future {
        a() {
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

    public x(int i10, int i11, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler, ILogger iLogger, t5 t5Var) {
        super(i10, i10, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler);
        this.f84252c = null;
        this.f84255f = new c0();
        this.f84251b = i11;
        this.f84253d = iLogger;
        this.f84254e = t5Var;
    }

    public boolean a() {
        s5 s5Var = this.f84252c;
        return s5Var != null && this.f84254e.a().c(s5Var) < f84250g;
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected void afterExecute(Runnable runnable, Throwable th2) {
        try {
            super.afterExecute(runnable, th2);
        } finally {
            this.f84255f.a();
        }
    }

    public boolean b() {
        return this.f84255f.b() < this.f84251b;
    }

    void c(long j10) {
        try {
            this.f84255f.d(j10, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e10) {
            this.f84253d.a(g7.ERROR, "Failed to wait till idle", e10);
            Thread.currentThread().interrupt();
        }
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable) {
        if (!b()) {
            this.f84252c = this.f84254e.a();
            this.f84253d.c(g7.WARNING, "Submit cancelled", new Object[0]);
            return new a();
        }
        this.f84255f.c();
        try {
            return super.submit(runnable);
        } catch (RejectedExecutionException e10) {
            this.f84255f.a();
            this.f84252c = this.f84254e.a();
            this.f84253d.a(g7.WARNING, "Submit rejected by thread pool executor", e10);
            return new a();
        }
    }
}
