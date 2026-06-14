package com.google.common.util.concurrent;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Function;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.util.concurrent.AbstractFuture;
import com.google.common.util.concurrent.CollectionFuture;
import com.google.common.util.concurrent.ImmediateFuture;
import com.google.common.util.concurrent.Partially;
import com.google.common.util.concurrent.internal.InternalFutureFailureAccess;
import com.google.common.util.concurrent.internal.InternalFutures;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.ironsource.C4240b4;
import j$.util.Objects;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public final class Futures extends GwtFuturesCatchingSpecialization {

    private static final class CallbackListener<V> implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Future f31476b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final FutureCallback f31477c;

        CallbackListener(Future future, FutureCallback futureCallback) {
            this.f31476b = future;
            this.f31477c = futureCallback;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        public void run() {
            Throwable thTryInternalFastPathGetFailure;
            Object obj = this.f31476b;
            if ((obj instanceof InternalFutureFailureAccess) && (thTryInternalFastPathGetFailure = InternalFutures.tryInternalFastPathGetFailure((InternalFutureFailureAccess) obj)) != null) {
                this.f31477c.onFailure(thTryInternalFastPathGetFailure);
                return;
            }
            try {
                this.f31477c.onSuccess(Futures.getDone(this.f31476b));
            } catch (ExecutionException e10) {
                this.f31477c.onFailure(e10.getCause());
            } catch (Throwable th2) {
                this.f31477c.onFailure(th2);
            }
        }

        public String toString() {
            return MoreObjects.toStringHelper(this).addValue(this.f31477c).toString();
        }
    }

    @GwtCompatible
    public static final class FutureCombiner<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final boolean f31478a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImmutableList f31479b;

        public <C> ListenableFuture<C> call(Callable<C> callable, Executor executor) {
            return new CombinedFuture(this.f31479b, this.f31478a, executor, callable);
        }

        public <C> ListenableFuture<C> callAsync(AsyncCallable<C> asyncCallable, Executor executor) {
            return new CombinedFuture(this.f31479b, this.f31478a, executor, asyncCallable);
        }

        public ListenableFuture<?> run(final Runnable runnable, Executor executor) {
            return call(new Callable<Void>(this) { // from class: com.google.common.util.concurrent.Futures.FutureCombiner.1

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ FutureCombiner f31481c;

                {
                    this.f31481c = this;
                }

                @Override // java.util.concurrent.Callable
                public Void call() throws Exception {
                    runnable.run();
                    return null;
                }
            }, executor);
        }

        private FutureCombiner(boolean z10, ImmutableList immutableList) {
            this.f31478a = z10;
            this.f31479b = immutableList;
        }
    }

    private static final class InCompletionOrderFuture<T> extends AbstractFuture<T> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private InCompletionOrderState f31482i;

        @Override // com.google.common.util.concurrent.AbstractFuture, java.util.concurrent.Future
        public boolean cancel(boolean z10) {
            InCompletionOrderState inCompletionOrderState = this.f31482i;
            if (!super.cancel(z10)) {
                return false;
            }
            Objects.requireNonNull(inCompletionOrderState);
            inCompletionOrderState.g(z10);
            return true;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        protected void n() {
            this.f31482i = null;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        protected String z() {
            InCompletionOrderState inCompletionOrderState = this.f31482i;
            if (inCompletionOrderState == null) {
                return null;
            }
            return "inputCount=[" + inCompletionOrderState.f31486d.length + "], remaining=[" + inCompletionOrderState.f31485c.get() + C4240b4.j.f42674e;
        }

        private InCompletionOrderFuture(InCompletionOrderState inCompletionOrderState) {
            this.f31482i = inCompletionOrderState;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class InCompletionOrderState<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f31483a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f31484b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final AtomicInteger f31485c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ListenableFuture[] f31486d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private volatile int f31487e;

        private void e() {
            if (this.f31485c.decrementAndGet() == 0 && this.f31483a) {
                for (ListenableFuture listenableFuture : this.f31486d) {
                    if (listenableFuture != null) {
                        listenableFuture.cancel(this.f31484b);
                    }
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public void f(ImmutableList immutableList, int i10) {
            ListenableFuture listenableFuture = this.f31486d[i10];
            Objects.requireNonNull(listenableFuture);
            ListenableFuture listenableFuture2 = listenableFuture;
            this.f31486d[i10] = null;
            for (int i11 = this.f31487e; i11 < immutableList.size(); i11++) {
                if (((AbstractFuture) immutableList.get(i11)).setFuture(listenableFuture2)) {
                    e();
                    this.f31487e = i11 + 1;
                    return;
                }
            }
            this.f31487e = immutableList.size();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void g(boolean z10) {
            this.f31483a = true;
            if (!z10) {
                this.f31484b = false;
            }
            e();
        }

        private InCompletionOrderState(ListenableFuture[] listenableFutureArr) {
            this.f31483a = false;
            this.f31484b = true;
            this.f31487e = 0;
            this.f31486d = listenableFutureArr;
            this.f31485c = new AtomicInteger(listenableFutureArr.length);
        }
    }

    private static final class NonCancellationPropagatingFuture<V> extends AbstractFuture.TrustedFuture<V> implements Runnable {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private ListenableFuture f31488i;

        NonCancellationPropagatingFuture(ListenableFuture listenableFuture) {
            this.f31488i = listenableFuture;
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        protected void n() {
            this.f31488i = null;
        }

        @Override // java.lang.Runnable
        public void run() {
            ListenableFuture listenableFuture = this.f31488i;
            if (listenableFuture != null) {
                setFuture(listenableFuture);
            }
        }

        @Override // com.google.common.util.concurrent.AbstractFuture
        protected String z() {
            ListenableFuture listenableFuture = this.f31488i;
            if (listenableFuture == null) {
                return null;
            }
            return "delegate=[" + listenableFuture + C4240b4.j.f42674e;
        }
    }

    public static <V> void addCallback(ListenableFuture<V> listenableFuture, FutureCallback<? super V> futureCallback, Executor executor) {
        Preconditions.checkNotNull(futureCallback);
        listenableFuture.addListener(new CallbackListener(listenableFuture, futureCallback), executor);
    }

    @SafeVarargs
    public static <V> ListenableFuture<List<V>> allAsList(ListenableFuture<? extends V>... listenableFutureArr) {
        return new CollectionFuture.ListFuture(ImmutableList.copyOf(listenableFutureArr), true);
    }

    private static ListenableFuture[] c(Iterable iterable) {
        return (ListenableFuture[]) (iterable instanceof Collection ? (Collection) iterable : ImmutableList.copyOf(iterable)).toArray(new ListenableFuture[0]);
    }

    @Partially.GwtIncompatible("AVAILABLE but requires exceptionType to be Throwable.class")
    @J2ktIncompatible
    public static <V, X extends Throwable> ListenableFuture<V> catching(ListenableFuture<? extends V> listenableFuture, Class<X> cls, Function<? super X, ? extends V> function, Executor executor) {
        return AbstractCatchingFuture.D(listenableFuture, cls, function, executor);
    }

    @Partially.GwtIncompatible("AVAILABLE but requires exceptionType to be Throwable.class")
    @J2ktIncompatible
    public static <V, X extends Throwable> ListenableFuture<V> catchingAsync(ListenableFuture<? extends V> listenableFuture, Class<X> cls, AsyncFunction<? super X, ? extends V> asyncFunction, Executor executor) {
        return AbstractCatchingFuture.E(listenableFuture, cls, asyncFunction, executor);
    }

    private static void d(Throwable th2) {
        if (!(th2 instanceof Error)) {
            throw new UncheckedExecutionException(th2);
        }
        throw new ExecutionError((Error) th2);
    }

    @GwtIncompatible
    @CanIgnoreReturnValue
    @J2ktIncompatible
    @ParametricNullness
    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls) throws Exception {
        return (V) FuturesGetChecked.g(future, cls);
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public static <V> V getDone(Future<V> future) throws ExecutionException {
        Preconditions.checkState(future.isDone(), "Future was expected to be done: %s", future);
        return (V) Uninterruptibles.getUninterruptibly(future);
    }

    @CanIgnoreReturnValue
    @ParametricNullness
    public static <V> V getUnchecked(Future<V> future) {
        Preconditions.checkNotNull(future);
        try {
            return (V) Uninterruptibles.getUninterruptibly(future);
        } catch (ExecutionException e10) {
            d(e10.getCause());
            throw new AssertionError();
        }
    }

    public static <V> ListenableFuture<V> immediateCancelledFuture() {
        ImmediateFuture.ImmediateCancelledFuture immediateCancelledFuture = ImmediateFuture.ImmediateCancelledFuture.f31497i;
        return immediateCancelledFuture != null ? immediateCancelledFuture : new ImmediateFuture.ImmediateCancelledFuture();
    }

    public static <V> ListenableFuture<V> immediateFailedFuture(Throwable th2) {
        Preconditions.checkNotNull(th2);
        return new ImmediateFuture.ImmediateFailedFuture(th2);
    }

    public static <V> ListenableFuture<V> immediateFuture(@ParametricNullness V v10) {
        return v10 == null ? ImmediateFuture.f31494c : new ImmediateFuture(v10);
    }

    public static ListenableFuture<Void> immediateVoidFuture() {
        return ImmediateFuture.f31494c;
    }

    public static <T> ImmutableList<ListenableFuture<T>> inCompletionOrder(Iterable<? extends ListenableFuture<? extends T>> iterable) {
        ListenableFuture[] listenableFutureArrC = c(iterable);
        final InCompletionOrderState inCompletionOrderState = new InCompletionOrderState(listenableFutureArrC);
        ImmutableList.Builder builderBuilderWithExpectedSize = ImmutableList.builderWithExpectedSize(listenableFutureArrC.length);
        for (int i10 = 0; i10 < listenableFutureArrC.length; i10++) {
            builderBuilderWithExpectedSize.add(new InCompletionOrderFuture(inCompletionOrderState));
        }
        final ImmutableList<ListenableFuture<T>> immutableListBuild = builderBuilderWithExpectedSize.build();
        for (final int i11 = 0; i11 < listenableFutureArrC.length; i11++) {
            listenableFutureArrC[i11].addListener(new Runnable() { // from class: com.google.common.util.concurrent.s
                @Override // java.lang.Runnable
                public final void run() {
                    inCompletionOrderState.f(immutableListBuild, i11);
                }
            }, MoreExecutors.directExecutor());
        }
        return immutableListBuild;
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <I, O> Future<O> lazyTransform(final Future<I> future, final Function<? super I, ? extends O> function) {
        Preconditions.checkNotNull(future);
        Preconditions.checkNotNull(function);
        return new Future<O>() { // from class: com.google.common.util.concurrent.Futures.1
            private Object a(Object obj) throws ExecutionException {
                try {
                    return function.apply(obj);
                } catch (Throwable th2) {
                    throw new ExecutionException(th2);
                }
            }

            @Override // java.util.concurrent.Future
            public boolean cancel(boolean z10) {
                return future.cancel(z10);
            }

            @Override // java.util.concurrent.Future
            public O get() throws ExecutionException, InterruptedException {
                return (O) a(future.get());
            }

            @Override // java.util.concurrent.Future
            public boolean isCancelled() {
                return future.isCancelled();
            }

            @Override // java.util.concurrent.Future
            public boolean isDone() {
                return future.isDone();
            }

            @Override // java.util.concurrent.Future
            public O get(long j10, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
                return (O) a(future.get(j10, timeUnit));
            }
        };
    }

    public static <V> ListenableFuture<V> nonCancellationPropagating(ListenableFuture<V> listenableFuture) {
        if (listenableFuture.isDone()) {
            return listenableFuture;
        }
        NonCancellationPropagatingFuture nonCancellationPropagatingFuture = new NonCancellationPropagatingFuture(listenableFuture);
        listenableFuture.addListener(nonCancellationPropagatingFuture, MoreExecutors.directExecutor());
        return nonCancellationPropagatingFuture;
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <O> ListenableFuture<O> scheduleAsync(AsyncCallable<O> asyncCallable, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        TrustedListenableFutureTask trustedListenableFutureTaskD = TrustedListenableFutureTask.D(asyncCallable);
        final ScheduledFuture<?> scheduledFutureSchedule = scheduledExecutorService.schedule(trustedListenableFutureTaskD, j10, timeUnit);
        trustedListenableFutureTaskD.addListener(new Runnable() { // from class: com.google.common.util.concurrent.t
            @Override // java.lang.Runnable
            public final void run() {
                scheduledFutureSchedule.cancel(false);
            }
        }, MoreExecutors.directExecutor());
        return trustedListenableFutureTaskD;
    }

    public static <O> ListenableFuture<O> submit(Callable<O> callable, Executor executor) {
        TrustedListenableFutureTask trustedListenableFutureTaskF = TrustedListenableFutureTask.F(callable);
        executor.execute(trustedListenableFutureTaskF);
        return trustedListenableFutureTaskF;
    }

    public static <O> ListenableFuture<O> submitAsync(AsyncCallable<O> asyncCallable, Executor executor) {
        TrustedListenableFutureTask trustedListenableFutureTaskD = TrustedListenableFutureTask.D(asyncCallable);
        executor.execute(trustedListenableFutureTaskD);
        return trustedListenableFutureTaskD;
    }

    @SafeVarargs
    public static <V> ListenableFuture<List<V>> successfulAsList(ListenableFuture<? extends V>... listenableFutureArr) {
        return new CollectionFuture.ListFuture(ImmutableList.copyOf(listenableFutureArr), false);
    }

    public static <I, O> ListenableFuture<O> transform(ListenableFuture<I> listenableFuture, Function<? super I, ? extends O> function, Executor executor) {
        return AbstractTransformFuture.D(listenableFuture, function, executor);
    }

    public static <I, O> ListenableFuture<O> transformAsync(ListenableFuture<I> listenableFuture, AsyncFunction<? super I, ? extends O> asyncFunction, Executor executor) {
        return AbstractTransformFuture.E(listenableFuture, asyncFunction, executor);
    }

    @SafeVarargs
    public static <V> FutureCombiner<V> whenAllComplete(ListenableFuture<? extends V>... listenableFutureArr) {
        return new FutureCombiner<>(false, ImmutableList.copyOf(listenableFutureArr));
    }

    @SafeVarargs
    public static <V> FutureCombiner<V> whenAllSucceed(ListenableFuture<? extends V>... listenableFutureArr) {
        return new FutureCombiner<>(true, ImmutableList.copyOf(listenableFutureArr));
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <V> ListenableFuture<V> withTimeout(ListenableFuture<V> listenableFuture, long j10, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return listenableFuture.isDone() ? listenableFuture : TimeoutFuture.G(listenableFuture, j10, timeUnit, scheduledExecutorService);
    }

    @GwtIncompatible
    @CanIgnoreReturnValue
    @J2ktIncompatible
    @ParametricNullness
    public static <V, X extends Exception> V getChecked(Future<V> future, Class<X> cls, long j10, TimeUnit timeUnit) throws Exception {
        return (V) FuturesGetChecked.h(future, cls, j10, timeUnit);
    }

    public static <V> ListenableFuture<List<V>> successfulAsList(Iterable<? extends ListenableFuture<? extends V>> iterable) {
        return new CollectionFuture.ListFuture(ImmutableList.copyOf(iterable), false);
    }

    public static <V> FutureCombiner<V> whenAllComplete(Iterable<? extends ListenableFuture<? extends V>> iterable) {
        return new FutureCombiner<>(false, ImmutableList.copyOf(iterable));
    }

    public static <V> FutureCombiner<V> whenAllSucceed(Iterable<? extends ListenableFuture<? extends V>> iterable) {
        return new FutureCombiner<>(true, ImmutableList.copyOf(iterable));
    }

    public static <V> ListenableFuture<List<V>> allAsList(Iterable<? extends ListenableFuture<? extends V>> iterable) {
        return new CollectionFuture.ListFuture(ImmutableList.copyOf(iterable), true);
    }

    public static ListenableFuture<Void> submit(Runnable runnable, Executor executor) {
        TrustedListenableFutureTask trustedListenableFutureTaskE = TrustedListenableFutureTask.E(runnable, null);
        executor.execute(trustedListenableFutureTaskE);
        return trustedListenableFutureTaskE;
    }
}
