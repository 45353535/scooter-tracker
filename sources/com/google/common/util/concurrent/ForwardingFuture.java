package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ForwardingObject;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public abstract class ForwardingFuture<V> extends ForwardingObject implements Future<V> {

    public static abstract class SimpleForwardingFuture<V> extends ForwardingFuture<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Future f31472b;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.util.concurrent.ForwardingFuture, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Future n() {
            return this.f31472b;
        }
    }

    protected ForwardingFuture() {
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    public boolean cancel(boolean z10) {
        return n().cancel(z10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: g */
    public abstract Future n();

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    @ParametricNullness
    public V get() throws ExecutionException, InterruptedException {
        return (V) n().get();
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return n().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return n().isDone();
    }

    @Override // java.util.concurrent.Future
    @CanIgnoreReturnValue
    @ParametricNullness
    public V get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        return (V) n().get(j10, timeUnit);
    }
}
