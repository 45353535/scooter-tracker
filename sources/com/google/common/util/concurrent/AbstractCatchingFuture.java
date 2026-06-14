package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.util.concurrent.FluentFuture;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.google.common.util.concurrent.internal.InternalFutures;
import com.ironsource.C4240b4;
import java.lang.Throwable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
abstract class AbstractCatchingFuture<V, X extends Throwable, F, T> extends FluentFuture.TrustedFuture<V> implements Runnable {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    ListenableFuture f31231i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    Class f31232j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    Object f31233k;

    private static final class AsyncCatchingFuture<V, X extends Throwable> extends AbstractCatchingFuture<V, X, AsyncFunction<? super X, ? extends V>, ListenableFuture<? extends V>> {
        AsyncCatchingFuture(ListenableFuture listenableFuture, Class cls, AsyncFunction asyncFunction) {
            super(listenableFuture, cls, asyncFunction);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public ListenableFuture F(AsyncFunction asyncFunction, Throwable th2) throws Exception {
            ListenableFuture listenableFutureApply = asyncFunction.apply(th2);
            Preconditions.checkNotNull(listenableFutureApply, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", asyncFunction);
            return listenableFutureApply;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
        public void G(ListenableFuture listenableFuture) {
            setFuture(listenableFuture);
        }
    }

    private static final class CatchingFuture<V, X extends Throwable> extends AbstractCatchingFuture<V, X, Function<? super X, ? extends V>, V> {
        CatchingFuture(ListenableFuture listenableFuture, Class cls, Function function) {
            super(listenableFuture, cls, function);
        }

        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        void G(Object obj) {
            set(obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.util.concurrent.AbstractCatchingFuture
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public Object F(Function function, Throwable th2) {
            return function.apply(th2);
        }
    }

    AbstractCatchingFuture(ListenableFuture listenableFuture, Class cls, Object obj) {
        this.f31231i = (ListenableFuture) Preconditions.checkNotNull(listenableFuture);
        this.f31232j = (Class) Preconditions.checkNotNull(cls);
        this.f31233k = Preconditions.checkNotNull(obj);
    }

    static ListenableFuture D(ListenableFuture listenableFuture, Class cls, Function function, Executor executor) {
        CatchingFuture catchingFuture = new CatchingFuture(listenableFuture, cls, function);
        listenableFuture.addListener(catchingFuture, MoreExecutors.d(executor, catchingFuture));
        return catchingFuture;
    }

    static ListenableFuture E(ListenableFuture listenableFuture, Class cls, AsyncFunction asyncFunction, Executor executor) {
        AsyncCatchingFuture asyncCatchingFuture = new AsyncCatchingFuture(listenableFuture, cls, asyncFunction);
        listenableFuture.addListener(asyncCatchingFuture, MoreExecutors.d(executor, asyncCatchingFuture));
        return asyncCatchingFuture;
    }

    abstract Object F(Object obj, Throwable th2);

    abstract void G(Object obj);

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected final void n() {
        y(this.f31231i);
        this.f31231i = null;
        this.f31232j = null;
        this.f31233k = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture listenableFuture = this.f31231i;
        Class cls = this.f31232j;
        Object obj = this.f31233k;
        if (((obj == null) || ((listenableFuture == 0) | (cls == null))) || isCancelled()) {
            return;
        }
        this.f31231i = null;
        try {
            th = listenableFuture instanceof InternalFutureFailureAccess ? InternalFutures.tryInternalFastPathGetFailure((InternalFutureFailureAccess) listenableFuture) : null;
        } catch (ExecutionException e10) {
            Throwable cause = e10.getCause();
            if (cause == null) {
                cause = new NullPointerException("Future type " + listenableFuture.getClass() + " threw " + e10.getClass() + " without a cause");
            }
            th = cause;
        } catch (Throwable th2) {
            th = th2;
        }
        Object done = th == null ? Futures.getDone(listenableFuture) : null;
        if (th == null) {
            set(NullnessCasts.a(done));
            return;
        }
        if (!Platform.a(th, cls)) {
            setFuture(listenableFuture);
            return;
        }
        try {
            Object objF = F(obj, th);
            this.f31232j = null;
            this.f31233k = null;
            G(objF);
        } catch (Throwable th3) {
            try {
                Platform.b(th3);
                setException(th3);
            } finally {
                this.f31232j = null;
                this.f31233k = null;
            }
        }
    }

    @Override // com.google.common.util.concurrent.AbstractFuture
    protected String z() {
        String str;
        ListenableFuture listenableFuture = this.f31231i;
        Class cls = this.f31232j;
        Object obj = this.f31233k;
        String strZ = super.z();
        if (listenableFuture != null) {
            str = "inputFuture=[" + listenableFuture + "], ";
        } else {
            str = "";
        }
        if (cls == null || obj == null) {
            if (strZ == null) {
                return null;
            }
            return str + strZ;
        }
        return str + "exceptionType=[" + cls + "], fallback=[" + obj + C4240b4.j.f42674e;
    }
}
