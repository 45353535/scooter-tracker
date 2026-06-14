package com.google.firebase.concurrent;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes9.dex */
final class LimitedConcurrencyExecutorService extends LimitedConcurrencyExecutor implements ExecutorService {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ExecutorService f31861e;

    LimitedConcurrencyExecutorService(ExecutorService executorService, int i10) {
        super(executorService, i10);
        this.f31861e = executorService;
    }

    public static /* synthetic */ Object d(Runnable runnable, Object obj) {
        runnable.run();
        return obj;
    }

    public static /* synthetic */ Object e(Runnable runnable) {
        runnable.run();
        return null;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f31861e.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f31861e.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f31861e.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f31861e.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f31861e.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        throw new UnsupportedOperationException("Shutting down is not allowed.");
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        execute(futureTask);
        return futureTask;
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f31861e.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f31861e.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(final Runnable runnable, final T t10) {
        return submit(new Callable() { // from class: com.google.firebase.concurrent.y
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LimitedConcurrencyExecutorService.d(runnable, t10);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(final Runnable runnable) {
        return submit(new Callable() { // from class: com.google.firebase.concurrent.x
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return LimitedConcurrencyExecutorService.e(runnable);
            }
        });
    }
}
