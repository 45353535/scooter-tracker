package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.ForwardingObject;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class ForwardingExecutorService extends ForwardingObject implements ExecutorService {
    @Override // java.util.concurrent.ExecutorService
    @CheckReturnValue
    public boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return n().awaitTermination(j10, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        n().execute(runnable);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract ExecutorService n();

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return n().invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) n().invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return n().isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return n().isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        n().shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @CanIgnoreReturnValue
    public List<Runnable> shutdownNow() {
        return n().shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return n().submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
        return n().invokeAll(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) n().invokeAny(collection, j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return n().submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, @ParametricNullness T t10) {
        return n().submit(runnable, t10);
    }
}
