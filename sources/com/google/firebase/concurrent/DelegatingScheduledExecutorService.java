package com.google.firebase.concurrent;

import com.google.firebase.concurrent.DelegatingScheduledFuture;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes9.dex */
class DelegatingScheduledExecutorService implements ScheduledExecutorService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f31849b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f31850c;

    DelegatingScheduledExecutorService(ExecutorService executorService, ScheduledExecutorService scheduledExecutorService) {
        this.f31849b = executorService;
        this.f31850c = scheduledExecutorService;
    }

    public static /* synthetic */ void d(Callable callable, DelegatingScheduledFuture.Completer completer) {
        try {
            completer.set(callable.call());
        } catch (Exception e10) {
            completer.setException(e10);
        }
    }

    public static /* synthetic */ void e(Runnable runnable, DelegatingScheduledFuture.Completer completer) throws Exception {
        try {
            runnable.run();
        } catch (Exception e10) {
            completer.setException(e10);
            throw e10;
        }
    }

    public static /* synthetic */ void h(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
        } catch (Exception e10) {
            completer.setException(e10);
        }
    }

    public static /* synthetic */ void j(Runnable runnable, DelegatingScheduledFuture.Completer completer) {
        try {
            runnable.run();
            completer.set(null);
        } catch (Exception e10) {
            completer.setException(e10);
        }
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f31849b.awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f31849b.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f31849b.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f31849b.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f31849b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f31849b.isTerminated();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> schedule(final Runnable runnable, final long j10, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.b
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                DelegatingScheduledExecutorService delegatingScheduledExecutorService = this.f31885a;
                return delegatingScheduledExecutorService.f31850c.schedule(new Runnable() { // from class: com.google.firebase.concurrent.i
                    @Override // java.lang.Runnable
                    public final void run() {
                        delegatingScheduledExecutorService.f31849b.execute(new Runnable() { // from class: com.google.firebase.concurrent.l
                            @Override // java.lang.Runnable
                            public final void run() {
                                DelegatingScheduledExecutorService.j(runnable, completer);
                            }
                        });
                    }
                }, j10, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleAtFixedRate(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.e
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                DelegatingScheduledExecutorService delegatingScheduledExecutorService = this.f31893a;
                return delegatingScheduledExecutorService.f31850c.scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.concurrent.h
                    @Override // java.lang.Runnable
                    public final void run() {
                        delegatingScheduledExecutorService.f31849b.execute(new Runnable() { // from class: com.google.firebase.concurrent.c
                            @Override // java.lang.Runnable
                            public final void run() throws Exception {
                                DelegatingScheduledExecutorService.e(runnable, completer);
                            }
                        });
                    }
                }, j10, j11, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public ScheduledFuture<?> scheduleWithFixedDelay(final Runnable runnable, final long j10, final long j11, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.f
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                DelegatingScheduledExecutorService delegatingScheduledExecutorService = this.f31898a;
                return delegatingScheduledExecutorService.f31850c.scheduleWithFixedDelay(new Runnable() { // from class: com.google.firebase.concurrent.k
                    @Override // java.lang.Runnable
                    public final void run() {
                        delegatingScheduledExecutorService.f31849b.execute(new Runnable() { // from class: com.google.firebase.concurrent.d
                            @Override // java.lang.Runnable
                            public final void run() {
                                DelegatingScheduledExecutorService.h(runnable, completer);
                            }
                        });
                    }
                }, j10, j11, timeUnit);
            }
        });
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
        return this.f31849b.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f31849b.invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f31849b.invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public <V> ScheduledFuture<V> schedule(final Callable<V> callable, final long j10, final TimeUnit timeUnit) {
        return new DelegatingScheduledFuture(new DelegatingScheduledFuture.Resolver() { // from class: com.google.firebase.concurrent.g
            @Override // com.google.firebase.concurrent.DelegatingScheduledFuture.Resolver
            public final ScheduledFuture addCompleter(DelegatingScheduledFuture.Completer completer) {
                DelegatingScheduledExecutorService delegatingScheduledExecutorService = this.f31903a;
                return delegatingScheduledExecutorService.f31850c.schedule(new Callable() { // from class: com.google.firebase.concurrent.j
                    @Override // java.util.concurrent.Callable
                    public final Object call() {
                        return delegatingScheduledExecutorService.f31849b.submit(new Runnable() { // from class: com.google.firebase.concurrent.m
                            @Override // java.lang.Runnable
                            public final void run() {
                                DelegatingScheduledExecutorService.d(callable, completer);
                            }
                        });
                    }
                }, j10, timeUnit);
            }
        });
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t10) {
        return this.f31849b.submit(runnable, t10);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f31849b.submit(runnable);
    }
}
