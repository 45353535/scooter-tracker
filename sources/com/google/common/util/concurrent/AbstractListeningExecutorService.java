package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.CheckReturnValue;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@CheckReturnValue
@GwtIncompatible
@J2ktIncompatible
public abstract class AbstractListeningExecutorService extends AbstractExecutorService implements ListeningExecutorService {
    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return TrustedListenableFutureTask.E(runnable, obj);
    }

    @Override // java.util.concurrent.AbstractExecutorService
    protected final RunnableFuture newTaskFor(Callable callable) {
        return TrustedListenableFutureTask.F(callable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.ListeningExecutorService
    @CanIgnoreReturnValue
    public ListenableFuture<?> submit(Runnable runnable) {
        return (ListenableFuture) super.submit(runnable);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.ListeningExecutorService
    @CanIgnoreReturnValue
    public <T> ListenableFuture<T> submit(Runnable runnable, @ParametricNullness T t10) {
        return (ListenableFuture) super.submit(runnable, (Object) t10);
    }

    @Override // java.util.concurrent.AbstractExecutorService, java.util.concurrent.ExecutorService, com.google.common.util.concurrent.ListeningExecutorService
    @CanIgnoreReturnValue
    public <T> ListenableFuture<T> submit(Callable<T> callable) {
        return (ListenableFuture) super.submit((Callable) callable);
    }
}
