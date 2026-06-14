package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public class ListenableFutureTask<V> extends FutureTask<V> implements ListenableFuture<V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ExecutionList f31510b;

    ListenableFutureTask(Callable callable) {
        super(callable);
        this.f31510b = new ExecutionList();
    }

    public static <V> ListenableFutureTask<V> create(Callable<V> callable) {
        return new ListenableFutureTask<>(callable);
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        this.f31510b.add(runnable, executor);
    }

    @Override // java.util.concurrent.FutureTask
    protected void done() {
        this.f31510b.execute();
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    @CanIgnoreReturnValue
    @ParametricNullness
    public V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        long nanos = timeUnit.toNanos(j10);
        return nanos <= 2147483647999999999L ? (V) super.get(j10, timeUnit) : (V) super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }

    public static <V> ListenableFutureTask<V> create(Runnable runnable, @ParametricNullness V v10) {
        return new ListenableFutureTask<>(runnable, v10);
    }

    ListenableFutureTask(Runnable runnable, Object obj) {
        super(runnable, obj);
        this.f31510b = new ExecutionList();
    }
}
