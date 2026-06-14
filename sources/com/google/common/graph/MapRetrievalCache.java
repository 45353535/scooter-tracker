package com.google.common.graph;

import com.google.common.base.Preconditions;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
final class MapRetrievalCache<K, V> extends MapIteratorCache<K, V> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile transient CacheEntry f30632c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile transient CacheEntry f30633d;

    private static final class CacheEntry<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Object f30634a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f30635b;

        CacheEntry(Object obj, Object obj2) {
            this.f30634a = obj;
            this.f30635b = obj2;
        }
    }

    MapRetrievalCache(Map map) {
        super(map);
    }

    private void k(CacheEntry cacheEntry) {
        this.f30633d = this.f30632c;
        this.f30632c = cacheEntry;
    }

    private void l(Object obj, Object obj2) {
        k(new CacheEntry(obj, obj2));
    }

    @Override // com.google.common.graph.MapIteratorCache
    void c() {
        super.c();
        this.f30632c = null;
        this.f30633d = null;
    }

    @Override // com.google.common.graph.MapIteratorCache
    Object e(Object obj) {
        Preconditions.checkNotNull(obj);
        Object objF = f(obj);
        if (objF != null) {
            return objF;
        }
        Object objG = g(obj);
        if (objG != null) {
            l(obj, objG);
        }
        return objG;
    }

    @Override // com.google.common.graph.MapIteratorCache
    Object f(Object obj) {
        Object objF = super.f(obj);
        if (objF != null) {
            return objF;
        }
        CacheEntry cacheEntry = this.f30632c;
        if (cacheEntry != null && cacheEntry.f30634a == obj) {
            return cacheEntry.f30635b;
        }
        CacheEntry cacheEntry2 = this.f30633d;
        if (cacheEntry2 == null || cacheEntry2.f30634a != obj) {
            return null;
        }
        k(cacheEntry2);
        return cacheEntry2.f30635b;
    }
}
