package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public abstract class ForwardingListenableFuture<V> extends ForwardingFuture<V> implements ListenableFuture<V> {

    public static abstract class SimpleForwardingListenableFuture<V> extends ForwardingListenableFuture<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ListenableFuture f31473b;

        protected SimpleForwardingListenableFuture(ListenableFuture listenableFuture) {
            this.f31473b = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.ForwardingListenableFuture, com.google.common.util.concurrent.ForwardingFuture
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final ListenableFuture n() {
            return this.f31473b;
        }
    }

    protected ForwardingListenableFuture() {
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        n().addListener(runnable, executor);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.util.concurrent.ForwardingFuture
    /* JADX INFO: renamed from: i */
    public abstract ListenableFuture n();
}
