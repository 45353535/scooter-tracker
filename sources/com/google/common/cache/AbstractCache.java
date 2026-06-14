package com.google.common.cache;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutionException;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
@GwtCompatible
public abstract class AbstractCache<K, V> implements Cache<K, V> {

    public static final class SimpleStatsCounter implements StatsCounter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final LongAddable f28993a = LongAddables.create();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final LongAddable f28994b = LongAddables.create();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final LongAddable f28995c = LongAddables.create();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final LongAddable f28996d = LongAddables.create();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final LongAddable f28997e = LongAddables.create();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final LongAddable f28998f = LongAddables.create();

        private static long a(long j10) {
            if (j10 >= 0) {
                return j10;
            }
            return Long.MAX_VALUE;
        }

        public void incrementBy(StatsCounter statsCounter) {
            CacheStats cacheStatsSnapshot = statsCounter.snapshot();
            this.f28993a.add(cacheStatsSnapshot.hitCount());
            this.f28994b.add(cacheStatsSnapshot.missCount());
            this.f28995c.add(cacheStatsSnapshot.loadSuccessCount());
            this.f28996d.add(cacheStatsSnapshot.loadExceptionCount());
            this.f28997e.add(cacheStatsSnapshot.totalLoadTime());
            this.f28998f.add(cacheStatsSnapshot.evictionCount());
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordEviction() {
            this.f28998f.increment();
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordHits(int i10) {
            this.f28993a.add(i10);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordLoadException(long j10) {
            this.f28996d.increment();
            this.f28997e.add(j10);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordLoadSuccess(long j10) {
            this.f28995c.increment();
            this.f28997e.add(j10);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public void recordMisses(int i10) {
            this.f28994b.add(i10);
        }

        @Override // com.google.common.cache.AbstractCache.StatsCounter
        public CacheStats snapshot() {
            return new CacheStats(a(this.f28993a.sum()), a(this.f28994b.sum()), a(this.f28995c.sum()), a(this.f28996d.sum()), a(this.f28997e.sum()), a(this.f28998f.sum()));
        }
    }

    public interface StatsCounter {
        void recordEviction();

        void recordHits(int i10);

        void recordLoadException(long j10);

        void recordLoadSuccess(long j10);

        void recordMisses(int i10);

        CacheStats snapshot();
    }

    @Override // com.google.common.cache.Cache
    public ConcurrentMap<K, V> asMap() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public void cleanUp() {
    }

    @Override // com.google.common.cache.Cache
    public V get(K k10, Callable<? extends V> callable) throws ExecutionException {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public ImmutableMap<K, V> getAllPresent(Iterable<? extends Object> iterable) {
        V ifPresent;
        LinkedHashMap linkedHashMapNewLinkedHashMap = Maps.newLinkedHashMap();
        for (Object obj : iterable) {
            if (!linkedHashMapNewLinkedHashMap.containsKey(obj) && (ifPresent = getIfPresent(obj)) != null) {
                linkedHashMapNewLinkedHashMap.put(obj, ifPresent);
            }
        }
        return ImmutableMap.copyOf((Map) linkedHashMapNewLinkedHashMap);
    }

    @Override // com.google.common.cache.Cache
    public void invalidate(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public void invalidateAll(Iterable<? extends Object> iterable) {
        Iterator<? extends Object> it = iterable.iterator();
        while (it.hasNext()) {
            invalidate(it.next());
        }
    }

    @Override // com.google.common.cache.Cache
    public void put(K k10, V v10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // com.google.common.cache.Cache
    public long size() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public CacheStats stats() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.cache.Cache
    public void invalidateAll() {
        throw new UnsupportedOperationException();
    }
}
