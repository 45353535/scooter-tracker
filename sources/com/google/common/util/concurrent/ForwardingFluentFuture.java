package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
final class ForwardingFluentFuture<V> extends FluentFuture<V> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final ListenableFuture f31471i;

    ForwardingFluentFuture(ListenableFuture listenableFuture) {
        this.f31471i = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        this.f31471i.addListener(runnable, executor);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return this.f31471i.cancel(z10);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    @ParametricNullness
    public V get() throws ExecutionException, InterruptedException {
        return this.f31471i.get();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public boolean isCancelled() {
        return this.f31471i.isCancelled();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    public boolean isDone() {
        return this.f31471i.isDone();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    public String toString() {
        return this.f31471i.toString();
    }

    @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
    @ParametricNullness
    public V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return this.f31471i.get(j10, timeUnit);
    }
}
