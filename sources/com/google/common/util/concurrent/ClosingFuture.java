package com.google.common.util.concurrent;

import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Functions;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.collect.FluentIterable;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.util.concurrent.Futures;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotMock;
import java.io.Closeable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@DoNotMock("Use ClosingFuture.from(Futures.immediate*Future)")
@J2ktIncompatible
public final class ClosingFuture<V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final LazyLogger f31348d = new LazyLogger(ClosingFuture.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AtomicReference f31349a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CloseableList f31350b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final FluentFuture f31351c;

    public interface AsyncClosingCallable<V> {
        ClosingFuture<V> call(DeferredCloser deferredCloser) throws Exception;
    }

    public interface AsyncClosingFunction<T, U> {
        ClosingFuture<U> apply(DeferredCloser deferredCloser, @ParametricNullness T t10) throws Exception;
    }

    private static final class CloseableList extends IdentityHashMap<AutoCloseable, Executor> implements Closeable, AutoCloseable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final DeferredCloser f31370b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private volatile boolean f31371c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private volatile CountDownLatch f31372d;

        private CloseableList() {
            this.f31370b = new DeferredCloser(this);
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f31371c) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f31371c) {
                        return;
                    }
                    this.f31371c = true;
                    for (Map.Entry<AutoCloseable, Executor> entry : entrySet()) {
                        ClosingFuture.n(entry.getKey(), entry.getValue());
                    }
                    clear();
                    if (this.f31372d != null) {
                        this.f31372d.countDown();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        void d(AutoCloseable autoCloseable, Executor executor) {
            Preconditions.checkNotNull(executor);
            if (autoCloseable == null) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f31371c) {
                        ClosingFuture.n(autoCloseable, executor);
                    } else {
                        put(autoCloseable, executor);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        FluentFuture h(AsyncClosingFunction asyncClosingFunction, Object obj) {
            CloseableList closeableList = new CloseableList();
            try {
                ClosingFuture closingFutureApply = asyncClosingFunction.apply(closeableList.f31370b, obj);
                closingFutureApply.i(closeableList);
                return closingFutureApply.f31351c;
            } finally {
                d(closeableList, MoreExecutors.directExecutor());
            }
        }

        ListenableFuture n(ClosingFunction closingFunction, Object obj) {
            CloseableList closeableList = new CloseableList();
            try {
                return Futures.immediateFuture(closingFunction.apply(closeableList.f31370b, obj));
            } finally {
                d(closeableList, MoreExecutors.directExecutor());
            }
        }
    }

    public interface ClosingCallable<V> {
        @ParametricNullness
        V call(DeferredCloser deferredCloser) throws Exception;
    }

    public interface ClosingFunction<T, U> {
        @ParametricNullness
        U apply(DeferredCloser deferredCloser, @ParametricNullness T t10) throws Exception;
    }

    @DoNotMock("Use ClosingFuture.whenAllSucceed() or .whenAllComplete() instead.")
    public static class Combiner {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CloseableList f31373a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final boolean f31374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected final ImmutableList f31375c;

        public interface AsyncCombiningCallable<V> {
            ClosingFuture<V> call(DeferredCloser deferredCloser, Peeker peeker) throws Exception;
        }

        public interface CombiningCallable<V> {
            @ParametricNullness
            V call(DeferredCloser deferredCloser, Peeker peeker) throws Exception;
        }

        private Futures.FutureCombiner c() {
            return this.f31374b ? Futures.whenAllSucceed(d()) : Futures.whenAllComplete(d());
        }

        private ImmutableList d() {
            return FluentIterable.from(this.f31375c).transform(new Function() { // from class: com.google.common.util.concurrent.q
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return ((ClosingFuture) obj).f31351c;
                }
            }).toList();
        }

        public <V> ClosingFuture<V> call(final CombiningCallable<V> combiningCallable, Executor executor) {
            ClosingFuture<V> closingFuture = new ClosingFuture<>(c().call(new Callable<V>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner.1

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ Combiner f31377c;

                {
                    this.f31377c = this;
                }

                @Override // java.util.concurrent.Callable
                @ParametricNullness
                public V call() throws Exception {
                    return (V) new Peeker(this.f31377c.f31375c).c(combiningCallable, this.f31377c.f31373a);
                }

                public String toString() {
                    return combiningCallable.toString();
                }
            }, executor));
            ((ClosingFuture) closingFuture).f31350b.d(this.f31373a, MoreExecutors.directExecutor());
            return closingFuture;
        }

        public <V> ClosingFuture<V> callAsync(final AsyncCombiningCallable<V> asyncCombiningCallable, Executor executor) {
            ClosingFuture<V> closingFuture = new ClosingFuture<>(c().callAsync(new AsyncCallable<V>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner.2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Combiner f31379b;

                {
                    this.f31379b = this;
                }

                @Override // com.google.common.util.concurrent.AsyncCallable
                public ListenableFuture<V> call() throws Exception {
                    return new Peeker(this.f31379b.f31375c).d(asyncCombiningCallable, this.f31379b.f31373a);
                }

                public String toString() {
                    return asyncCombiningCallable.toString();
                }
            }, executor));
            ((ClosingFuture) closingFuture).f31350b.d(this.f31373a, MoreExecutors.directExecutor());
            return closingFuture;
        }

        private Combiner(boolean z10, Iterable iterable) {
            this.f31373a = new CloseableList();
            this.f31374b = z10;
            this.f31375c = ImmutableList.copyOf(iterable);
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                ((ClosingFuture) it.next()).i(this.f31373a);
            }
        }
    }

    public static final class Combiner2<V1, V2> extends Combiner {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ClosingFuture f31380d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ClosingFuture f31381e;

        public interface AsyncClosingFunction2<V1, V2, U> {
            ClosingFuture<U> apply(DeferredCloser deferredCloser, @ParametricNullness V1 v12, @ParametricNullness V2 v22) throws Exception;
        }

        public interface ClosingFunction2<V1, V2, U> {
            @ParametricNullness
            U apply(DeferredCloser deferredCloser, @ParametricNullness V1 v12, @ParametricNullness V2 v22) throws Exception;
        }

        public <U> ClosingFuture<U> call(final ClosingFunction2<V1, V2, U> closingFunction2, Executor executor) {
            return call(new Combiner.CombiningCallable<U>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner2.1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Combiner2 f31383b;

                {
                    this.f31383b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
                @ParametricNullness
                public U call(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
                    return (U) closingFunction2.apply(deferredCloser, peeker.getDone(this.f31383b.f31380d), peeker.getDone(this.f31383b.f31381e));
                }

                public String toString() {
                    return closingFunction2.toString();
                }
            }, executor);
        }

        public <U> ClosingFuture<U> callAsync(final AsyncClosingFunction2<V1, V2, U> asyncClosingFunction2, Executor executor) {
            return callAsync(new Combiner.AsyncCombiningCallable<U>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner2.2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Combiner2 f31385b;

                {
                    this.f31385b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
                public ClosingFuture<U> call(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
                    return asyncClosingFunction2.apply(deferredCloser, peeker.getDone(this.f31385b.f31380d), peeker.getDone(this.f31385b.f31381e));
                }

                public String toString() {
                    return asyncClosingFunction2.toString();
                }
            }, executor);
        }

        private Combiner2(ClosingFuture closingFuture, ClosingFuture closingFuture2) {
            super(true, ImmutableList.of(closingFuture, closingFuture2));
            this.f31380d = closingFuture;
            this.f31381e = closingFuture2;
        }
    }

    public static final class Combiner3<V1, V2, V3> extends Combiner {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ClosingFuture f31386d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ClosingFuture f31387e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ClosingFuture f31388f;

        public interface AsyncClosingFunction3<V1, V2, V3, U> {
            ClosingFuture<U> apply(DeferredCloser deferredCloser, @ParametricNullness V1 v12, @ParametricNullness V2 v22, @ParametricNullness V3 v32) throws Exception;
        }

        public interface ClosingFunction3<V1, V2, V3, U> {
            @ParametricNullness
            U apply(DeferredCloser deferredCloser, @ParametricNullness V1 v12, @ParametricNullness V2 v22, @ParametricNullness V3 v32) throws Exception;
        }

        public <U> ClosingFuture<U> call(final ClosingFunction3<V1, V2, V3, U> closingFunction3, Executor executor) {
            return call(new Combiner.CombiningCallable<U>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner3.1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Combiner3 f31390b;

                {
                    this.f31390b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
                @ParametricNullness
                public U call(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
                    return (U) closingFunction3.apply(deferredCloser, peeker.getDone(this.f31390b.f31386d), peeker.getDone(this.f31390b.f31387e), peeker.getDone(this.f31390b.f31388f));
                }

                public String toString() {
                    return closingFunction3.toString();
                }
            }, executor);
        }

        public <U> ClosingFuture<U> callAsync(final AsyncClosingFunction3<V1, V2, V3, U> asyncClosingFunction3, Executor executor) {
            return callAsync(new Combiner.AsyncCombiningCallable<U>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner3.2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Combiner3 f31392b;

                {
                    this.f31392b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
                public ClosingFuture<U> call(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
                    return asyncClosingFunction3.apply(deferredCloser, peeker.getDone(this.f31392b.f31386d), peeker.getDone(this.f31392b.f31387e), peeker.getDone(this.f31392b.f31388f));
                }

                public String toString() {
                    return asyncClosingFunction3.toString();
                }
            }, executor);
        }

        private Combiner3(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3) {
            super(true, ImmutableList.of(closingFuture, closingFuture2, closingFuture3));
            this.f31386d = closingFuture;
            this.f31387e = closingFuture2;
            this.f31388f = closingFuture3;
        }
    }

    public static final class Combiner4<V1, V2, V3, V4> extends Combiner {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ClosingFuture f31393d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ClosingFuture f31394e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ClosingFuture f31395f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ClosingFuture f31396g;

        public interface AsyncClosingFunction4<V1, V2, V3, V4, U> {
            ClosingFuture<U> apply(DeferredCloser deferredCloser, @ParametricNullness V1 v12, @ParametricNullness V2 v22, @ParametricNullness V3 v32, @ParametricNullness V4 v42) throws Exception;
        }

        public interface ClosingFunction4<V1, V2, V3, V4, U> {
            @ParametricNullness
            U apply(DeferredCloser deferredCloser, @ParametricNullness V1 v12, @ParametricNullness V2 v22, @ParametricNullness V3 v32, @ParametricNullness V4 v42) throws Exception;
        }

        public <U> ClosingFuture<U> call(final ClosingFunction4<V1, V2, V3, V4, U> closingFunction4, Executor executor) {
            return call(new Combiner.CombiningCallable<U>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner4.1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Combiner4 f31398b;

                {
                    this.f31398b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
                @ParametricNullness
                public U call(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
                    return (U) closingFunction4.apply(deferredCloser, peeker.getDone(this.f31398b.f31393d), peeker.getDone(this.f31398b.f31394e), peeker.getDone(this.f31398b.f31395f), peeker.getDone(this.f31398b.f31396g));
                }

                public String toString() {
                    return closingFunction4.toString();
                }
            }, executor);
        }

        public <U> ClosingFuture<U> callAsync(final AsyncClosingFunction4<V1, V2, V3, V4, U> asyncClosingFunction4, Executor executor) {
            return callAsync(new Combiner.AsyncCombiningCallable<U>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner4.2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Combiner4 f31400b;

                {
                    this.f31400b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
                public ClosingFuture<U> call(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
                    return asyncClosingFunction4.apply(deferredCloser, peeker.getDone(this.f31400b.f31393d), peeker.getDone(this.f31400b.f31394e), peeker.getDone(this.f31400b.f31395f), peeker.getDone(this.f31400b.f31396g));
                }

                public String toString() {
                    return asyncClosingFunction4.toString();
                }
            }, executor);
        }

        private Combiner4(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3, ClosingFuture closingFuture4) {
            super(true, ImmutableList.of(closingFuture, closingFuture2, closingFuture3, closingFuture4));
            this.f31393d = closingFuture;
            this.f31394e = closingFuture2;
            this.f31395f = closingFuture3;
            this.f31396g = closingFuture4;
        }
    }

    public static final class Combiner5<V1, V2, V3, V4, V5> extends Combiner {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ClosingFuture f31401d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final ClosingFuture f31402e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final ClosingFuture f31403f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final ClosingFuture f31404g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final ClosingFuture f31405h;

        public interface AsyncClosingFunction5<V1, V2, V3, V4, V5, U> {
            ClosingFuture<U> apply(DeferredCloser deferredCloser, @ParametricNullness V1 v12, @ParametricNullness V2 v22, @ParametricNullness V3 v32, @ParametricNullness V4 v42, @ParametricNullness V5 v52) throws Exception;
        }

        public interface ClosingFunction5<V1, V2, V3, V4, V5, U> {
            @ParametricNullness
            U apply(DeferredCloser deferredCloser, @ParametricNullness V1 v12, @ParametricNullness V2 v22, @ParametricNullness V3 v32, @ParametricNullness V4 v42, @ParametricNullness V5 v52) throws Exception;
        }

        public <U> ClosingFuture<U> call(final ClosingFunction5<V1, V2, V3, V4, V5, U> closingFunction5, Executor executor) {
            return call(new Combiner.CombiningCallable<U>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner5.1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Combiner5 f31407b;

                {
                    this.f31407b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.CombiningCallable
                @ParametricNullness
                public U call(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
                    return (U) closingFunction5.apply(deferredCloser, peeker.getDone(this.f31407b.f31401d), peeker.getDone(this.f31407b.f31402e), peeker.getDone(this.f31407b.f31403f), peeker.getDone(this.f31407b.f31404g), peeker.getDone(this.f31407b.f31405h));
                }

                public String toString() {
                    return closingFunction5.toString();
                }
            }, executor);
        }

        public <U> ClosingFuture<U> callAsync(final AsyncClosingFunction5<V1, V2, V3, V4, V5, U> asyncClosingFunction5, Executor executor) {
            return callAsync(new Combiner.AsyncCombiningCallable<U>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.Combiner5.2

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ Combiner5 f31409b;

                {
                    this.f31409b = this;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // com.google.common.util.concurrent.ClosingFuture.Combiner.AsyncCombiningCallable
                public ClosingFuture<U> call(DeferredCloser deferredCloser, Peeker peeker) throws Exception {
                    return asyncClosingFunction5.apply(deferredCloser, peeker.getDone(this.f31409b.f31401d), peeker.getDone(this.f31409b.f31402e), peeker.getDone(this.f31409b.f31403f), peeker.getDone(this.f31409b.f31404g), peeker.getDone(this.f31409b.f31405h));
                }

                public String toString() {
                    return asyncClosingFunction5.toString();
                }
            }, executor);
        }

        private Combiner5(ClosingFuture closingFuture, ClosingFuture closingFuture2, ClosingFuture closingFuture3, ClosingFuture closingFuture4, ClosingFuture closingFuture5) {
            super(true, ImmutableList.of(closingFuture, closingFuture2, closingFuture3, closingFuture4, closingFuture5));
            this.f31401d = closingFuture;
            this.f31402e = closingFuture2;
            this.f31403f = closingFuture3;
            this.f31404g = closingFuture4;
            this.f31405h = closingFuture5;
        }
    }

    public static final class DeferredCloser {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CloseableList f31410a;

        DeferredCloser(CloseableList closeableList) {
            this.f31410a = closeableList;
        }

        @CanIgnoreReturnValue
        @ParametricNullness
        public <C extends AutoCloseable> C eventuallyClose(@ParametricNullness C c10, Executor executor) {
            Preconditions.checkNotNull(executor);
            if (c10 != null) {
                this.f31410a.d(c10, executor);
            }
            return c10;
        }
    }

    public static final class Peeker {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ImmutableList f31411a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile boolean f31412b;

        /* JADX INFO: Access modifiers changed from: private */
        public Object c(Combiner.CombiningCallable combiningCallable, CloseableList closeableList) {
            this.f31412b = true;
            CloseableList closeableList2 = new CloseableList();
            try {
                return combiningCallable.call(closeableList2.f31370b, this);
            } finally {
                closeableList.d(closeableList2, MoreExecutors.directExecutor());
                this.f31412b = false;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public FluentFuture d(Combiner.AsyncCombiningCallable asyncCombiningCallable, CloseableList closeableList) {
            this.f31412b = true;
            CloseableList closeableList2 = new CloseableList();
            try {
                ClosingFuture<V> closingFutureCall = asyncCombiningCallable.call(closeableList2.f31370b, this);
                closingFutureCall.i(closeableList);
                return ((ClosingFuture) closingFutureCall).f31351c;
            } finally {
                closeableList.d(closeableList2, MoreExecutors.directExecutor());
                this.f31412b = false;
            }
        }

        @ParametricNullness
        public final <D> D getDone(ClosingFuture<D> closingFuture) throws ExecutionException {
            Preconditions.checkState(this.f31412b);
            Preconditions.checkArgument(this.f31411a.contains(closingFuture));
            return (D) Futures.getDone(((ClosingFuture) closingFuture).f31351c);
        }

        private Peeker(ImmutableList immutableList) {
            this.f31411a = (ImmutableList) Preconditions.checkNotNull(immutableList);
        }
    }

    enum State {
        OPEN,
        SUBSUMED,
        WILL_CLOSE,
        CLOSING,
        CLOSED,
        WILL_CREATE_VALUE_AND_CLOSER
    }

    public static final class ValueAndCloser<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final ClosingFuture f31414a;

        ValueAndCloser(ClosingFuture closingFuture) {
            this.f31414a = (ClosingFuture) Preconditions.checkNotNull(closingFuture);
        }

        public void closeAsync() {
            this.f31414a.m();
        }

        @ParametricNullness
        public V get() throws ExecutionException {
            return (V) Futures.getDone(this.f31414a.f31351c);
        }
    }

    public interface ValueAndCloserConsumer<V> {
        void accept(ValueAndCloser<V> valueAndCloser);
    }

    public static /* synthetic */ void a(AutoCloseable autoCloseable) {
        try {
            androidx.core.provider.c.a(autoCloseable);
        } catch (Exception e10) {
            Platform.b(e10);
            f31348d.a().log(Level.WARNING, "thrown by close()", (Throwable) e10);
        }
    }

    @Deprecated
    public static <C extends AutoCloseable> ClosingFuture<C> eventuallyClosing(ListenableFuture<C> listenableFuture, final Executor executor) {
        Preconditions.checkNotNull(executor);
        ClosingFuture<C> closingFuture = new ClosingFuture<>(Futures.nonCancellationPropagating(listenableFuture));
        Futures.addCallback(listenableFuture, new FutureCallback<AutoCloseable>() { // from class: com.google.common.util.concurrent.ClosingFuture.3
            @Override // com.google.common.util.concurrent.FutureCallback
            public void onFailure(Throwable th2) {
            }

            @Override // com.google.common.util.concurrent.FutureCallback
            public void onSuccess(AutoCloseable autoCloseable) {
                ClosingFuture.this.f31350b.f31370b.eventuallyClose(autoCloseable, executor);
            }
        }, MoreExecutors.directExecutor());
        return closingFuture;
    }

    public static <V> ClosingFuture<V> from(ListenableFuture<V> listenableFuture) {
        return new ClosingFuture<>(listenableFuture);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i(CloseableList closeableList) {
        l(State.OPEN, State.SUBSUMED);
        closeableList.d(this.f31350b, MoreExecutors.directExecutor());
    }

    private ClosingFuture j(Class cls, final AsyncClosingFunction asyncClosingFunction, Executor executor) {
        Preconditions.checkNotNull(asyncClosingFunction);
        return p(this.f31351c.catchingAsync(cls, new AsyncFunction<Throwable, Object>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.8

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ClosingFuture f31368b;

            {
                this.f31368b = this;
            }

            public String toString() {
                return asyncClosingFunction.toString();
            }

            @Override // com.google.common.util.concurrent.AsyncFunction
            public ListenableFuture<Object> apply(Throwable th2) throws Exception {
                return this.f31368b.f31350b.h(asyncClosingFunction, th2);
            }
        }, executor));
    }

    private ClosingFuture k(Class cls, final ClosingFunction closingFunction, Executor executor) {
        Preconditions.checkNotNull(closingFunction);
        return p(this.f31351c.catchingAsync(cls, new AsyncFunction<Throwable, Object>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.7

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ClosingFuture f31366b;

            {
                this.f31366b = this;
            }

            public String toString() {
                return closingFunction.toString();
            }

            @Override // com.google.common.util.concurrent.AsyncFunction
            public ListenableFuture<Object> apply(Throwable th2) throws Exception {
                return this.f31366b.f31350b.n(closingFunction, th2);
            }
        }, executor));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l(State state, State state2) {
        Preconditions.checkState(o(state, state2), "Expected state to be %s, but it was %s", state, state2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void m() {
        f31348d.a().log(Level.FINER, "closing {0}", this);
        this.f31350b.close();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void n(final AutoCloseable autoCloseable, Executor executor) {
        if (autoCloseable == null) {
            return;
        }
        try {
            executor.execute(new Runnable() { // from class: com.google.common.util.concurrent.p
                @Override // java.lang.Runnable
                public final void run() {
                    ClosingFuture.a(autoCloseable);
                }
            });
        } catch (RejectedExecutionException e10) {
            LazyLogger lazyLogger = f31348d;
            Logger loggerA = lazyLogger.a();
            Level level = Level.WARNING;
            if (loggerA.isLoggable(level)) {
                lazyLogger.a().log(level, String.format("while submitting close to %s; will close inline", executor), (Throwable) e10);
            }
            n(autoCloseable, MoreExecutors.directExecutor());
        }
    }

    private boolean o(State state, State state2) {
        return androidx.compose.animation.core.c.a(this.f31349a, state, state2);
    }

    private ClosingFuture p(FluentFuture fluentFuture) {
        ClosingFuture closingFuture = new ClosingFuture(fluentFuture);
        i(closingFuture.f31350b);
        return closingFuture;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(ValueAndCloserConsumer valueAndCloserConsumer, ClosingFuture closingFuture) {
        valueAndCloserConsumer.accept(new ValueAndCloser<>(closingFuture));
    }

    public static <V> ClosingFuture<V> submit(final ClosingCallable<V> closingCallable, Executor executor) {
        Preconditions.checkNotNull(closingCallable);
        final CloseableList closeableList = new CloseableList();
        TrustedListenableFutureTask trustedListenableFutureTaskF = TrustedListenableFutureTask.F(new Callable<V>() { // from class: com.google.common.util.concurrent.ClosingFuture.1
            @Override // java.util.concurrent.Callable
            @ParametricNullness
            public V call() throws Exception {
                return (V) closingCallable.call(closeableList.f31370b);
            }

            public String toString() {
                return closingCallable.toString();
            }
        });
        executor.execute(trustedListenableFutureTaskF);
        return new ClosingFuture<>(trustedListenableFutureTaskF, closeableList);
    }

    public static <V> ClosingFuture<V> submitAsync(final AsyncClosingCallable<V> asyncClosingCallable, Executor executor) {
        Preconditions.checkNotNull(asyncClosingCallable);
        final CloseableList closeableList = new CloseableList();
        TrustedListenableFutureTask trustedListenableFutureTaskD = TrustedListenableFutureTask.D(new AsyncCallable<V>() { // from class: com.google.common.util.concurrent.ClosingFuture.2
            @Override // com.google.common.util.concurrent.AsyncCallable
            public ListenableFuture<V> call() throws Exception {
                CloseableList closeableList2 = new CloseableList();
                try {
                    ClosingFuture<V> closingFutureCall = asyncClosingCallable.call(closeableList2.f31370b);
                    closingFutureCall.i(closeableList);
                    return ((ClosingFuture) closingFutureCall).f31351c;
                } finally {
                    closeableList.d(closeableList2, MoreExecutors.directExecutor());
                }
            }

            public String toString() {
                return asyncClosingCallable.toString();
            }
        });
        executor.execute(trustedListenableFutureTaskD);
        return new ClosingFuture<>(trustedListenableFutureTaskD, closeableList);
    }

    public static Combiner whenAllComplete(Iterable<? extends ClosingFuture<?>> iterable) {
        return new Combiner(false, iterable);
    }

    public static Combiner whenAllSucceed(Iterable<? extends ClosingFuture<?>> iterable) {
        return new Combiner(true, iterable);
    }

    public static <V, U> AsyncClosingFunction<V, U> withoutCloser(final AsyncFunction<V, U> asyncFunction) {
        Preconditions.checkNotNull(asyncFunction);
        return new AsyncClosingFunction<V, U>() { // from class: com.google.common.util.concurrent.ClosingFuture.6
            @Override // com.google.common.util.concurrent.ClosingFuture.AsyncClosingFunction
            public ClosingFuture<U> apply(DeferredCloser deferredCloser, V v10) throws Exception {
                return ClosingFuture.from(asyncFunction.apply(v10));
            }
        };
    }

    @CanIgnoreReturnValue
    public boolean cancel(boolean z10) {
        f31348d.a().log(Level.FINER, "cancelling {0}", this);
        boolean zCancel = this.f31351c.cancel(z10);
        if (zCancel) {
            m();
        }
        return zCancel;
    }

    public <X extends Throwable> ClosingFuture<V> catching(Class<X> cls, ClosingFunction<? super X, ? extends V> closingFunction, Executor executor) {
        return k(cls, closingFunction, executor);
    }

    public <X extends Throwable> ClosingFuture<V> catchingAsync(Class<X> cls, AsyncClosingFunction<? super X, ? extends V> asyncClosingFunction, Executor executor) {
        return j(cls, asyncClosingFunction, executor);
    }

    protected void finalize() {
        if (((State) this.f31349a.get()).equals(State.OPEN)) {
            f31348d.a().log(Level.SEVERE, "Uh oh! An open ClosingFuture has leaked and will close: {0}", this);
            finishToFuture();
        }
    }

    public FluentFuture<V> finishToFuture() {
        if (o(State.OPEN, State.WILL_CLOSE)) {
            f31348d.a().log(Level.FINER, "will close {0}", this);
            this.f31351c.addListener(new Runnable() { // from class: com.google.common.util.concurrent.ClosingFuture.9
                @Override // java.lang.Runnable
                public void run() {
                    ClosingFuture closingFuture = ClosingFuture.this;
                    State state = State.WILL_CLOSE;
                    State state2 = State.CLOSING;
                    closingFuture.l(state, state2);
                    ClosingFuture.this.m();
                    ClosingFuture.this.l(state2, State.CLOSED);
                }
            }, MoreExecutors.directExecutor());
        } else {
            int iOrdinal = ((State) this.f31349a.get()).ordinal();
            if (iOrdinal == 0) {
                throw new AssertionError();
            }
            if (iOrdinal == 1) {
                throw new IllegalStateException("Cannot call finishToFuture() after deriving another step");
            }
            if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
                throw new IllegalStateException("Cannot call finishToFuture() twice");
            }
            if (iOrdinal == 5) {
                throw new IllegalStateException("Cannot call finishToFuture() after calling finishToValueAndCloser()");
            }
        }
        return this.f31351c;
    }

    public void finishToValueAndCloser(final ValueAndCloserConsumer<? super V> valueAndCloserConsumer, Executor executor) {
        Preconditions.checkNotNull(valueAndCloserConsumer);
        if (o(State.OPEN, State.WILL_CREATE_VALUE_AND_CLOSER)) {
            this.f31351c.addListener(new Runnable(this) { // from class: com.google.common.util.concurrent.ClosingFuture.10

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ ClosingFuture f31355c;

                {
                    this.f31355c = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    ClosingFuture.q(valueAndCloserConsumer, this.f31355c);
                }
            }, executor);
            return;
        }
        int iOrdinal = ((State) this.f31349a.get()).ordinal();
        if (iOrdinal == 1) {
            throw new IllegalStateException("Cannot call finishToValueAndCloser() after deriving another step");
        }
        if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
            throw new IllegalStateException("Cannot call finishToValueAndCloser() after calling finishToFuture()");
        }
        if (iOrdinal == 5) {
            throw new IllegalStateException("Cannot call finishToValueAndCloser() twice");
        }
        throw new AssertionError(this.f31349a);
    }

    public ListenableFuture<?> statusFuture() {
        return Futures.nonCancellationPropagating(this.f31351c.transform(Functions.constant(null), MoreExecutors.directExecutor()));
    }

    public String toString() {
        return MoreObjects.toStringHelper(this).add("state", this.f31349a.get()).addValue(this.f31351c).toString();
    }

    public <U> ClosingFuture<U> transform(final ClosingFunction<? super V, U> closingFunction, Executor executor) {
        Preconditions.checkNotNull(closingFunction);
        return p(this.f31351c.transformAsync(new AsyncFunction<V, U>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.4

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ClosingFuture f31361b;

            {
                this.f31361b = this;
            }

            @Override // com.google.common.util.concurrent.AsyncFunction
            public ListenableFuture<U> apply(V v10) throws Exception {
                return this.f31361b.f31350b.n(closingFunction, v10);
            }

            public String toString() {
                return closingFunction.toString();
            }
        }, executor));
    }

    public <U> ClosingFuture<U> transformAsync(final AsyncClosingFunction<? super V, U> asyncClosingFunction, Executor executor) {
        Preconditions.checkNotNull(asyncClosingFunction);
        return p(this.f31351c.transformAsync(new AsyncFunction<V, U>(this) { // from class: com.google.common.util.concurrent.ClosingFuture.5

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ClosingFuture f31363b;

            {
                this.f31363b = this;
            }

            @Override // com.google.common.util.concurrent.AsyncFunction
            public ListenableFuture<U> apply(V v10) throws Exception {
                return this.f31363b.f31350b.h(asyncClosingFunction, v10);
            }

            public String toString() {
                return asyncClosingFunction.toString();
            }
        }, executor));
    }

    private ClosingFuture(ListenableFuture listenableFuture) {
        this(listenableFuture, new CloseableList());
    }

    public static Combiner whenAllComplete(ClosingFuture<?> closingFuture, ClosingFuture<?>... closingFutureArr) {
        return whenAllComplete(Lists.asList(closingFuture, closingFutureArr));
    }

    public static <V1, V2> Combiner2<V1, V2> whenAllSucceed(ClosingFuture<V1> closingFuture, ClosingFuture<V2> closingFuture2) {
        return new Combiner2<>(closingFuture2);
    }

    private ClosingFuture(ListenableFuture listenableFuture, CloseableList closeableList) {
        this.f31349a = new AtomicReference(State.OPEN);
        this.f31351c = FluentFuture.from(listenableFuture);
        this.f31350b = closeableList;
    }

    public static <V1, V2, V3> Combiner3<V1, V2, V3> whenAllSucceed(ClosingFuture<V1> closingFuture, ClosingFuture<V2> closingFuture2, ClosingFuture<V3> closingFuture3) {
        return new Combiner3<>(closingFuture2, closingFuture3);
    }

    public static <V1, V2, V3, V4> Combiner4<V1, V2, V3, V4> whenAllSucceed(ClosingFuture<V1> closingFuture, ClosingFuture<V2> closingFuture2, ClosingFuture<V3> closingFuture3, ClosingFuture<V4> closingFuture4) {
        return new Combiner4<>(closingFuture2, closingFuture3, closingFuture4);
    }

    public static <V1, V2, V3, V4, V5> Combiner5<V1, V2, V3, V4, V5> whenAllSucceed(ClosingFuture<V1> closingFuture, ClosingFuture<V2> closingFuture2, ClosingFuture<V3> closingFuture3, ClosingFuture<V4> closingFuture4, ClosingFuture<V5> closingFuture5) {
        return new Combiner5<>(closingFuture2, closingFuture3, closingFuture4, closingFuture5);
    }

    public static Combiner whenAllSucceed(ClosingFuture<?> closingFuture, ClosingFuture<?> closingFuture2, ClosingFuture<?> closingFuture3, ClosingFuture<?> closingFuture4, ClosingFuture<?> closingFuture5, ClosingFuture<?> closingFuture6, ClosingFuture<?>... closingFutureArr) {
        return whenAllSucceed(FluentIterable.of(closingFuture, closingFuture2, closingFuture3, closingFuture4, closingFuture5, closingFuture6).append(closingFutureArr));
    }
}
