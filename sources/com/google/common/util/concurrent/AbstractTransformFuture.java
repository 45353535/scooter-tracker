package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.FluentFuture;
import com.ironsource.C4240b4;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
abstract class AbstractTransformFuture<I, O, F, T> extends FluentFuture.TrustedFuture<O> implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ListenableFuture f31330i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Object f31331j;

    private static final class AsyncTransformFuture<I, O> extends AbstractTransformFuture<I, O, AsyncFunction<? super I, ? extends O>, ListenableFuture<? extends O>> {
        AsyncTransformFuture(ListenableFuture listenableFuture, AsyncFunction asyncFunction) {
            super(listenableFuture, asyncFunction);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public ListenableFuture F(AsyncFunction asyncFunction, Object obj) throws Exception {
            ListenableFuture<O> listenableFutureApply = asyncFunction.apply(obj);
            Preconditions.checkNotNull(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", asyncFunction);
            return listenableFutureApply;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public void G(ListenableFuture listenableFuture) {
            setFuture(listenableFuture);
        }
    }

    private static final class TransformFuture<I, O> extends AbstractTransformFuture<I, O, Function<? super I, ? extends O>, O> {
        TransformFuture(ListenableFuture listenableFuture, Function function) {
            super(listenableFuture, function);
        }

        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        void G(Object obj) {
            set(obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.AbstractTransformFuture
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public Object F(Function function, Object obj) {
            return function.apply(obj);
        }
    }

    AbstractTransformFuture(ListenableFuture listenableFuture, Object obj) {
        this.f31330i = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
        this.f31331j = Preconditions.checkNotNull(obj);
    }

    static ListenableFuture D(ListenableFuture listenableFuture, Function function, Executor executor) {
        Preconditions.checkNotNull(function);
        TransformFuture transformFuture = new TransformFuture(listenableFuture, function);
        listenableFuture.addListener(transformFuture, MoreExecutors.d(executor, transformFuture));
        return transformFuture;
    }

    static ListenableFuture E(ListenableFuture listenableFuture, AsyncFunction asyncFunction, Executor executor) {
        Preconditions.checkNotNull(executor);
        AsyncTransformFuture asyncTransformFuture = new AsyncTransformFuture(listenableFuture, asyncFunction);
        listenableFuture.addListener(asyncTransformFuture, MoreExecutors.d(executor, asyncTransformFuture));
        return asyncTransformFuture;
    }

    abstract Object F(Object obj, Object obj2);

    abstract void G(Object obj);

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected final void n() {
        y(this.f31330i);
        this.f31330i = null;
        this.f31331j = null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.f31330i;
        Object obj = this.f31331j;
        if ((isCancelled() | (listenableFuture == null)) || (obj == null)) {
            return;
        }
        this.f31330i = null;
        if (listenableFuture.isCancelled()) {
            setFuture(listenableFuture);
            return;
        }
        try {
            try {
                Object objF = F(obj, Futures.getDone(listenableFuture));
                this.f31331j = null;
                G(objF);
            } catch (Throwable th2) {
                try {
                    Platform.b(th2);
                    setException(th2);
                } finally {
                    this.f31331j = null;
                }
            }
        } catch (Error e10) {
            setException(e10);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (ExecutionException e11) {
            setException(e11.getCause());
        } catch (Exception e12) {
            setException(e12);
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected String z() {
        String str;
        ListenableFuture listenableFuture = this.f31330i;
        Object obj = this.f31331j;
        String strZ = super.z();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (obj != null) {
            return str + "function=[" + obj + C4240b4.j.f42674e;
        }
        if (strZ == null) {
            return null;
        }
        return str + strZ;
    }
}
