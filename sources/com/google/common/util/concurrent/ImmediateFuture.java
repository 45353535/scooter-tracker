package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.AbstractFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
class ImmediateFuture<V> implements ListenableFuture<V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final ListenableFuture f31494c = new ImmediateFuture(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final LazyLogger f31495d = new LazyLogger(ImmediateFuture.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f31496b;

    static final class ImmediateCancelledFuture<V> extends AbstractFuture.TrustedFuture<V> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        static final ImmediateCancelledFuture f31497i;

        static {
            f31497i = AbstractFuture.f31237e ? null : new ImmediateCancelledFuture();
        }

        ImmediateCancelledFuture() {
            cancel(false);
        }
    }

    static final class ImmediateFailedFuture<V> extends AbstractFuture.TrustedFuture<V> {
        ImmediateFailedFuture(Throwable th2) {
            setException(th2);
        }
    }

    ImmediateFuture(Object obj) {
        this.f31496b = obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public void addListener(Runnable runnable, Executor executor) {
        Preconditions.checkNotNull(runnable, "Runnable was null.");
        Preconditions.checkNotNull(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (Exception e10) {
            f31495d.a().log(Level.SEVERE, "RuntimeException while executing runnable " + runnable + " with executor " + executor, (Throwable) e10);
        }
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    @ParametricNullness
    public V get() {
        return (V) this.f31496b;
    }

    @Override // java.util.concurrent.Future
    public boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public boolean isDone() {
        return true;
    }

    public String toString() {
        return super.toString() + "[status=SUCCESS, result=[" + this.f31496b + "]]";
    }

    @Override // java.util.concurrent.Future
    @ParametricNullness
    public V get(long j10, TimeUnit timeUnit) throws ExecutionException {
        Preconditions.checkNotNull(timeUnit);
        return get();
    }
}
