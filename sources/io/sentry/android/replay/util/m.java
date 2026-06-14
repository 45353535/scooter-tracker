package io.sentry.android.replay.util;

import io.sentry.ILogger;
import io.sentry.g7;
import io.sentry.v7;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes3.dex */
public final class m implements ScheduledExecutorService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f83168b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final v7 f83169c;

    public m(ScheduledExecutorService delegate, v7 options) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(options, "options");
        this.f83168b = delegate;
        this.f83169c = options;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(Runnable runnable, m mVar) {
        try {
            runnable.run();
        } catch (Throwable th2) {
            ILogger logger = mVar.f83169c.getLogger();
            g7 g7Var = g7.ERROR;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to execute task ");
            sb2.append(runnable instanceof n ? ((n) runnable).a() : "");
            logger.a(g7Var, sb2.toString(), th2);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) {
        return this.f83168b.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f83168b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection) {
        return this.f83168b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection) {
        return this.f83168b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f83168b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f83168b.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Runnable runnable, long j10, TimeUnit timeUnit) {
        return this.f83168b.schedule(runnable, j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return this.f83168b.scheduleAtFixedRate(runnable, j10, j11, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j10, long j11, TimeUnit timeUnit) {
        return this.f83168b.scheduleWithFixedDelay(runnable, j10, j11, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        synchronized (this) {
            if (!isShutdown()) {
                this.f83168b.shutdown();
            }
            try {
            } catch (InterruptedException unused) {
                shutdownNow();
                Thread.currentThread().interrupt();
            }
            if (awaitTermination(this.f83169c.getShutdownTimeoutMillis(), TimeUnit.MILLISECONDS)) {
                Unit unit = Unit.f93236a;
            } else {
                shutdownNow();
                Unit unit2 = Unit.f93236a;
            }
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public List shutdownNow() {
        return this.f83168b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Runnable runnable, Object obj) {
        return this.f83168b.submit(runnable, obj);
    }

    @Override // java.util.concurrent.ExecutorService
    public List invokeAll(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f83168b.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Object invokeAny(Collection collection, long j10, TimeUnit timeUnit) {
        return this.f83168b.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture schedule(Callable callable, long j10, TimeUnit timeUnit) {
        return this.f83168b.schedule(callable, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(Callable callable) {
        return this.f83168b.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future submit(final Runnable task) {
        Intrinsics.checkNotNullParameter(task, "task");
        String name = Thread.currentThread().getName();
        Intrinsics.checkNotNullExpressionValue(name, "getName(...)");
        if (StringsKt.a0(name, "SentryReplayIntegration", false, 2, null)) {
            task.run();
            return null;
        }
        try {
            return this.f83168b.submit(new Runnable() { // from class: io.sentry.android.replay.util.l
                @Override // java.lang.Runnable
                public final void run() {
                    m.b(task, this);
                }
            });
        } catch (Throwable th2) {
            ILogger logger = this.f83169c.getLogger();
            g7 g7Var = g7.ERROR;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Failed to submit task ");
            sb2.append(task instanceof n ? ((n) task).a() : "");
            sb2.append(" to executor");
            logger.a(g7Var, sb2.toString(), th2);
            return null;
        }
    }
}
