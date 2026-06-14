package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.FluentFuture;
import com.ironsource.C4240b4;
import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
class TrustedListenableFutureTask<V> extends FluentFuture.TrustedFuture<V> implements RunnableFuture<V> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private volatile InterruptibleTask f31623i;

    private final class TrustedFutureInterruptibleAsyncTask extends InterruptibleTask<ListenableFuture<V>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final AsyncCallable f31624d;

        TrustedFutureInterruptibleAsyncTask(AsyncCallable asyncCallable) {
            this.f31624d = (AsyncCallable) Preconditions.checkNotNull(asyncCallable);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        void a(Throwable th2) {
            TrustedListenableFutureTask.this.setException(th2);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final boolean g() {
            return TrustedListenableFutureTask.this.isDone();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        String i() {
            return this.f31624d.toString();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public void b(ListenableFuture listenableFuture) {
            TrustedListenableFutureTask.this.setFuture(listenableFuture);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.InterruptibleTask
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
        public ListenableFuture h() {
            return (ListenableFuture) Preconditions.checkNotNull(this.f31624d.call(), "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.f31624d);
        }
    }

    private final class TrustedFutureInterruptibleTask extends InterruptibleTask<V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Callable f31626d;

        TrustedFutureInterruptibleTask(Callable callable) {
            this.f31626d = (Callable) Preconditions.checkNotNull(callable);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        void a(Throwable th2) {
            TrustedListenableFutureTask.this.setException(th2);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        void b(Object obj) {
            TrustedListenableFutureTask.this.set(obj);
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        final boolean g() {
            return TrustedListenableFutureTask.this.isDone();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        Object h() {
            return this.f31626d.call();
        }

        @Override // com.google.common.util.concurrent.InterruptibleTask
        String i() {
            return this.f31626d.toString();
        }
    }

    TrustedListenableFutureTask(Callable callable) {
        this.f31623i = new TrustedFutureInterruptibleTask(callable);
    }

    static TrustedListenableFutureTask D(AsyncCallable asyncCallable) {
        return new TrustedListenableFutureTask(asyncCallable);
    }

    static TrustedListenableFutureTask E(Runnable runnable, Object obj) {
        return new TrustedListenableFutureTask(Executors.callable(runnable, obj));
    }

    static TrustedListenableFutureTask F(Callable callable) {
        return new TrustedListenableFutureTask(callable);
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected void n() {
        InterruptibleTask interruptibleTask;
        super.n();
        if (C() && (interruptibleTask = this.f31623i) != null) {
            interruptibleTask.d();
        }
        this.f31623i = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public void run() {
        InterruptibleTask interruptibleTask = this.f31623i;
        if (interruptibleTask != null) {
            interruptibleTask.run();
        }
        this.f31623i = null;
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected String z() {
        InterruptibleTask interruptibleTask = this.f31623i;
        if (interruptibleTask == null) {
            return super.z();
        }
        return "task=[" + interruptibleTask + C4240b4.j.f42674e;
    }

    TrustedListenableFutureTask(AsyncCallable asyncCallable) {
        this.f31623i = new TrustedFutureInterruptibleAsyncTask(asyncCallable);
    }
}
