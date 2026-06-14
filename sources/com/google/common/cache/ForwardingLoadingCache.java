package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ImmutableMap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class ForwardingLoadingCache<K, V> extends ForwardingCache<K, V> implements LoadingCache<K, V> {

    public static abstract class SimpleForwardingLoadingCache<K, V> extends ForwardingLoadingCache<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LoadingCache f29053b;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.cache.ForwardingLoadingCache, com.google.common.cache.ForwardingCache
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public final LoadingCache n() {
            return this.f29053b;
        }
    }

    @Override // com.google.common.cache.LoadingCache, com.google.common.base.Function
    public V apply(K k10) {
        return (V) n().apply(k10);
    }

    @Override // com.google.common.cache.LoadingCache
    @CanIgnoreReturnValue
    public V get(K k10) throws ExecutionException {
        return (V) n().get(k10);
    }

    @Override // com.google.common.cache.LoadingCache
    @CanIgnoreReturnValue
    public ImmutableMap<K, V> getAll(Iterable<? extends K> iterable) throws ExecutionException {
        return n().getAll(iterable);
    }

    @Override // com.google.common.cache.LoadingCache
    @CanIgnoreReturnValue
    public V getUnchecked(K k10) {
        return (V) n().getUnchecked(k10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.cache.ForwardingCache
    /* JADX INFO: renamed from: i */
    public abstract LoadingCache n();

    @Override // com.google.common.cache.LoadingCache
    public void refresh(K k10) {
        n().refresh(k10);
    }
}
