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
final class PausableExecutorServiceImpl implements PausableExecutorService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f31865b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final PausableExecutor f31866c;

    PausableExecutorServiceImpl(boolean z10, ExecutorService executorService) {
        this.f31865b = executorService;
        this.f31866c = new PausableExecutorImpl(z10, executorService);
    }

    public static /* synthetic */ Object a(Runnable runnable) {
        runnable.run();
        return null;
    }

    public static /* synthetic */ Object b(Runnable runnable, Object obj) {
        runnable.run();
        return obj;
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f31865b.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f31866c.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f31865b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f31865b.invokeAny(collection);
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public boolean isPaused() {
        return this.f31866c.isPaused();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f31865b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f31865b.isTerminated();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void pause() {
        this.f31866c.pause();
    }

    @Override // com.google.firebase.concurrent.PausableExecutor
    public void resume() {
        this.f31866c.resume();
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
        return this.f31865b.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f31865b.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(final Runnable runnable, final T t10) {
        return submit(new Callable() { // from class: com.google.firebase.concurrent.a0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return PausableExecutorServiceImpl.b(runnable, t10);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(final Runnable runnable) {
        return submit(new Callable() { // from class: com.google.firebase.concurrent.z
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return PausableExecutorServiceImpl.a(runnable);
            }
        });
    }
}
