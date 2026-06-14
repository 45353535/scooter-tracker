package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
abstract class WrappingExecutorService implements ExecutorService {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutorService f31630b;

    protected WrappingExecutorService(ExecutorService executorService) {
        this.f31630b = (ExecutorService) Preconditions.checkNotNull(executorService);
    }

    public static /* synthetic */ void a(Callable callable) {
        try {
            callable.call();
        } catch (Exception e10) {
            Platform.b(e10);
            Throwables.throwIfUnchecked(e10);
            throw new RuntimeException(e10);
        }
    }

    private ImmutableList d(Collection collection) {
        ImmutableList.Builder builder = ImmutableList.builder();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            builder.add(c((Callable) it.next()));
        }
        return builder.build();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f31630b.awaitTermination(j10, timeUnit);
    }

    protected Runnable b(Runnable runnable) {
        final Callable callableC = c(Executors.callable(runnable, null));
        return new Runnable() { // from class: com.google.common.util.concurrent.i0
            @Override // java.lang.Runnable
            public final void run() {
                WrappingExecutorService.a(callableC);
            }
        };
    }

    protected abstract Callable c(Callable callable);

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.f31630b.execute(b(runnable));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.f31630b.invokeAll(d(collection));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws ExecutionException, InterruptedException {
        return (T) this.f31630b.invokeAny(d(collection));
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.f31630b.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.f31630b.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.f31630b.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    @CanIgnoreReturnValue
    public final List<Runnable> shutdownNow() {
        return this.f31630b.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.f31630b.submit(c((Callable) Preconditions.checkNotNull(callable)));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws InterruptedException {
        return this.f31630b.invokeAll(d(collection), j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (T) this.f31630b.invokeAny(d(collection), j10, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.f31630b.submit(b(runnable));
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, @ParametricNullness T t10) {
        return this.f31630b.submit(b(runnable), t10);
    }
}
