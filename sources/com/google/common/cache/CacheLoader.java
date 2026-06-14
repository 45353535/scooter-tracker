package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.util.concurrent.Futures;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.common.util.concurrent.ListenableFutureTask;
import java.io.Serializable;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible(emulated = true)
public abstract class CacheLoader<K, V> {

    /* JADX INFO: renamed from: com.google.common.cache.CacheLoader$1, reason: invalid class name */
    class AnonymousClass1 extends CacheLoader<K, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Executor f29043c;

        AnonymousClass1(Executor executor) {
            this.f29043c = executor;
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(K k10) throws Exception {
            return (V) CacheLoader.this.load(k10);
        }

        @Override // com.google.common.cache.CacheLoader
        public Map<K, V> loadAll(Iterable<? extends K> iterable) throws Exception {
            return CacheLoader.this.loadAll(iterable);
        }

        @Override // com.google.common.cache.CacheLoader
        public ListenableFuture<V> reload(final K k10, final V v10) {
            final CacheLoader cacheLoader = CacheLoader.this;
            ListenableFutureTask listenableFutureTaskCreate = ListenableFutureTask.create(new Callable() { // from class: com.google.common.cache.a
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return cacheLoader.reload(k10, v10).get();
                }
            });
            this.f29043c.execute(listenableFutureTaskCreate);
            return listenableFutureTaskCreate;
        }
    }

    private static final class FunctionToCacheLoader<K, V> extends CacheLoader<K, V> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Function f29044b;

        public FunctionToCacheLoader(Function<K, V> function) {
            this.f29044b = (Function) Preconditions.checkNotNull(function);
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(K k10) {
            return (V) this.f29044b.apply(Preconditions.checkNotNull(k10));
        }
    }

    public static final class InvalidCacheLoadException extends RuntimeException {
        public InvalidCacheLoadException(String str) {
            super(str);
        }
    }

    private static final class SupplierToCacheLoader<V> extends CacheLoader<Object, V> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Supplier f29045b;

        public SupplierToCacheLoader(Supplier<V> supplier) {
            this.f29045b = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @Override // com.google.common.cache.CacheLoader
        public V load(Object obj) {
            Preconditions.checkNotNull(obj);
            return (V) this.f29045b.get();
        }
    }

    public static final class UnsupportedLoadingOperationException extends UnsupportedOperationException {
        UnsupportedLoadingOperationException() {
        }
    }

    protected CacheLoader() {
    }

    @GwtIncompatible
    public static <K, V> CacheLoader<K, V> asyncReloading(CacheLoader<K, V> cacheLoader, Executor executor) {
        Preconditions.checkNotNull(cacheLoader);
        Preconditions.checkNotNull(executor);
        return cacheLoader.new AnonymousClass1(executor);
    }

    public static <K, V> CacheLoader<K, V> from(Function<K, V> function) {
        return new FunctionToCacheLoader(function);
    }

    public abstract V load(K k10) throws Exception;

    public Map<K, V> loadAll(Iterable<? extends K> iterable) throws Exception {
        throw new UnsupportedLoadingOperationException();
    }

    @GwtIncompatible
    public ListenableFuture<V> reload(K k10, V v10) throws Exception {
        Preconditions.checkNotNull(k10);
        Preconditions.checkNotNull(v10);
        return Futures.immediateFuture(load(k10));
    }

    public static <V> CacheLoader<Object, V> from(Supplier<V> supplier) {
        return new SupplierToCacheLoader(supplier);
    }
}
