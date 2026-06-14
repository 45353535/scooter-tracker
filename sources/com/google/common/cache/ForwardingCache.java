package com.google.common.cache;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.ForwardingObject;
import com.google.common.collect.ImmutableMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class ForwardingCache<K, V> extends ForwardingObject implements Cache<K, V> {

    public static abstract class SimpleForwardingCache<K, V> extends ForwardingCache<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Cache f29052b;

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.cache.ForwardingCache, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Cache n() {
            return this.f29052b;
        }
    }

    protected ForwardingCache() {
    }

    @Override // com.google.common.cache.Cache
    public ConcurrentMap<K, V> asMap() {
        return n().asMap();
    }

    @Override // com.google.common.cache.Cache
    public void cleanUp() {
        n().cleanUp();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: g */
    public abstract Cache n();

    @Override // com.google.common.cache.Cache
    public V get(K k10, Callable<? extends V> callable) throws ExecutionException {
        return (V) n().get(k10, callable);
    }

    @Override // com.google.common.cache.Cache
    public ImmutableMap<K, V> getAllPresent(Iterable<? extends Object> iterable) {
        return n().getAllPresent(iterable);
    }

    @Override // com.google.common.cache.Cache
    public V getIfPresent(Object obj) {
        return (V) n().getIfPresent(obj);
    }

    @Override // com.google.common.cache.Cache
    public void invalidate(Object obj) {
        n().invalidate(obj);
    }

    @Override // com.google.common.cache.Cache
    public void invalidateAll(Iterable<? extends Object> iterable) {
        n().invalidateAll(iterable);
    }

    @Override // com.google.common.cache.Cache
    public void put(K k10, V v10) {
        n().put(k10, v10);
    }

    @Override // com.google.common.cache.Cache
    public void putAll(Map<? extends K, ? extends V> map) {
        n().putAll(map);
    }

    @Override // com.google.common.cache.Cache
    public long size() {
        return n().size();
    }

    @Override // com.google.common.cache.Cache
    public CacheStats stats() {
        return n().stats();
    }

    @Override // com.google.common.cache.Cache
    public void invalidateAll() {
        n().invalidateAll();
    }
}
