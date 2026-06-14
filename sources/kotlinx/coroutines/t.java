package kotlinx.coroutines;

import eg.o0;
import eg.p0;
import eg.u0;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes3.dex */
public final class t extends s implements k {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Executor f93641c;

    public t(Executor executor) {
        this.f93641c = executor;
        jg.a.a(m());
    }

    private final void p(CoroutineContext coroutineContext, RejectedExecutionException rejectedExecutionException) {
        z.c(coroutineContext, u0.a("The task was rejected", rejectedExecutionException));
    }

    private final ScheduledFuture w(ScheduledExecutorService scheduledExecutorService, Runnable runnable, CoroutineContext coroutineContext, long j10) {
        try {
            return scheduledExecutorService.schedule(runnable, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            p(coroutineContext, e10);
            return null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Executor executorM = m();
        ExecutorService executorService = executorM instanceof ExecutorService ? (ExecutorService) executorM : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public void dispatch(CoroutineContext coroutineContext, Runnable runnable) {
        try {
            Executor executorM = m();
            eg.b.a();
            executorM.execute(runnable);
        } catch (RejectedExecutionException e10) {
            eg.b.a();
            p(coroutineContext, e10);
            o0.b().dispatch(coroutineContext, runnable);
        }
    }

    @Override // kotlinx.coroutines.k
    public void e(long j10, CancellableContinuation cancellableContinuation) {
        long j11;
        Executor executorM = m();
        ScheduledFuture scheduledFutureW = null;
        ScheduledExecutorService scheduledExecutorService = executorM instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorM : null;
        if (scheduledExecutorService != null) {
            j11 = j10;
            scheduledFutureW = w(scheduledExecutorService, new g0(this, cancellableContinuation), cancellableContinuation.getContext(), j11);
        } else {
            j11 = j10;
        }
        if (scheduledFutureW != null) {
            eg.l.c(cancellableContinuation, new c(scheduledFutureW));
        } else {
            j.f93624h.e(j11, cancellableContinuation);
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof t) && ((t) obj).m() == m();
    }

    @Override // kotlinx.coroutines.k
    public p0 f(long j10, Runnable runnable, CoroutineContext coroutineContext) {
        long j11;
        Runnable runnable2;
        CoroutineContext coroutineContext2;
        Executor executorM = m();
        ScheduledFuture scheduledFutureW = null;
        ScheduledExecutorService scheduledExecutorService = executorM instanceof ScheduledExecutorService ? (ScheduledExecutorService) executorM : null;
        if (scheduledExecutorService != null) {
            j11 = j10;
            runnable2 = runnable;
            coroutineContext2 = coroutineContext;
            scheduledFutureW = w(scheduledExecutorService, runnable2, coroutineContext2, j11);
        } else {
            j11 = j10;
            runnable2 = runnable;
            coroutineContext2 = coroutineContext;
        }
        return scheduledFutureW != null ? new n(scheduledFutureW) : j.f93624h.f(j11, runnable2, coroutineContext2);
    }

    public int hashCode() {
        return System.identityHashCode(m());
    }

    @Override // kotlinx.coroutines.s
    public Executor m() {
        return this.f93641c;
    }

    @Override // kotlinx.coroutines.CoroutineDispatcher
    public String toString() {
        return m().toString();
    }
}
