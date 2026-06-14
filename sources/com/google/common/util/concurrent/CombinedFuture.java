package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.util.concurrent.AggregateFuture;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
final class CombinedFuture<V> extends AggregateFuture<Object, V> {

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private CombinedFutureInterruptibleTask f31417q;

    private final class AsyncCallableInterruptibleTask extends CombinedFuture<V>.CombinedFutureInterruptibleTask<ListenableFuture<V>> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final AsyncCallable f31418f;

        AsyncCallableInterruptibleTask(AsyncCallable asyncCallable, Executor executor) {
            super(executor);
            this.f31418f = (AsyncCallable) Preconditions.checkNotNull(asyncCallable);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        String i() {
            return this.f31418f.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public ListenableFuture h() {
            return (ListenableFuture) Preconditions.checkNotNull(this.f31418f.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f31418f);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.CombinedFuture.CombinedFutureInterruptibleTask
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void l(ListenableFuture listenableFuture) {
            CombinedFuture.this.setFuture(listenableFuture);
        }
    }

    private final class CallableInterruptibleTask extends CombinedFuture<V>.CombinedFutureInterruptibleTask<V> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Callable f31420f;

        CallableInterruptibleTask(Callable callable, Executor executor) {
            super(executor);
            this.f31420f = (Callable) Preconditions.checkNotNull(callable);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        Object h() {
            return this.f31420f.call();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        String i() {
            return this.f31420f.toString();
        }

        @Override // com.google.common.util.concurrent.CombinedFuture.CombinedFutureInterruptibleTask
        void l(Object obj) {
            CombinedFuture.this.set(obj);
        }
    }

    private abstract class CombinedFutureInterruptibleTask<T> extends InterruptibleTask<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Executor f31422d;

        CombinedFutureInterruptibleTask(Executor executor) {
            this.f31422d = (Executor) Preconditions.checkNotNull(executor);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final void a(Throwable th2) {
            CombinedFuture.this.f31417q = null;
            if (th2 instanceof ExecutionException) {
                CombinedFuture.this.setException(((ExecutionException) th2).getCause());
            } else if (th2 instanceof CancellationException) {
                CombinedFuture.this.cancel(false);
            } else {
                CombinedFuture.this.setException(th2);
            }
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final void b(Object obj) {
            CombinedFuture.this.f31417q = null;
            l(obj);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final boolean g() {
            return CombinedFuture.this.isDone();
        }

        final void k() {
            try {
                this.f31422d.execute(this);
            } catch (RejectedExecutionException e10) {
                CombinedFuture.this.setException(e10);
            }
        }

        abstract void l(Object obj);
    }

    CombinedFuture(ImmutableCollection immutableCollection, boolean z10, Executor executor, AsyncCallable asyncCallable) {
        super(immutableCollection, z10, false);
        this.f31417q = new AsyncCallableInterruptibleTask(asyncCallable, executor);
        S();
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    void N(int i10, Object obj) {
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    void Q() {
        CombinedFutureInterruptibleTask combinedFutureInterruptibleTask = this.f31417q;
        if (combinedFutureInterruptibleTask != null) {
            combinedFutureInterruptibleTask.k();
        }
    }

    @Override // com.google.common.util.concurrent.AggregateFuture
    void W(AggregateFuture.ReleaseResourcesReason releaseResourcesReason) {
        super.W(releaseResourcesReason);
        if (releaseResourcesReason == AggregateFuture.ReleaseResourcesReason.OUTPUT_FUTURE_DONE) {
            this.f31417q = null;
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected void x() {
        CombinedFutureInterruptibleTask combinedFutureInterruptibleTask = this.f31417q;
        if (combinedFutureInterruptibleTask != null) {
            combinedFutureInterruptibleTask.d();
        }
    }

    CombinedFuture(ImmutableCollection immutableCollection, boolean z10, Executor executor, Callable callable) {
        super(immutableCollection, z10, false);
        this.f31417q = new CallableInterruptibleTask(callable, executor);
        S();
    }
}
