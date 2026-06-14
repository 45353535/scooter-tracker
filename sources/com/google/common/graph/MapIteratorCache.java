package com.google.common.graph;

import com.google.common.base.Preconditions;
import com.google.common.collect.UnmodifiableIterator;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@ElementTypesAreNonnullByDefault
class MapIteratorCache<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f30627a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile transient Map.Entry f30628b;

    MapIteratorCache(Map map) {
        this.f30627a = (Map) Preconditions.checkNotNull(map);
    }

    void c() {
        this.f30628b = null;
    }

    final boolean d(Object obj) {
        return f(obj) != null || this.f30627a.containsKey(obj);
    }

    Object e(Object obj) {
        Preconditions.checkNotNull(obj);
        Object objF = f(obj);
        return objF == null ? g(obj) : objF;
    }

    Object f(Object obj) {
        Map.Entry entry = this.f30628b;
        if (entry == null || entry.getKey() != obj) {
            return null;
        }
        return entry.getValue();
    }

    final Object g(Object obj) {
        Preconditions.checkNotNull(obj);
        return this.f30627a.get(obj);
    }

    final Object h(Object obj, Object obj2) {
        Preconditions.checkNotNull(obj);
        Preconditions.checkNotNull(obj2);
        c();
        return this.f30627a.put(obj, obj2);
    }

    final Object i(Object obj) {
        Preconditions.checkNotNull(obj);
        c();
        return this.f30627a.remove(obj);
    }

    final Set j() {
        return new AbstractSet<K>() { // from class: com.google.common.graph.MapIteratorCache.1
            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return MapIteratorCache.this.d(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return MapIteratorCache.this.f30627a.size();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<K> iterator() {
                final Iterator<Map.Entry<K, V>> it = MapIteratorCache.this.f30627a.entrySet().iterator();
                return new UnmodifiableIterator<K>(this) { // from class: com.google.common.graph.MapIteratorCache.1.1

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f30631c;

                    {
                        this.f30631c = this;
                    }

                    @Override // java.util.Iterator
                    public boolean hasNext() {
                        return it.hasNext();
                    }

                    @Override // java.util.Iterator
                    public K next() {
                        Map.Entry entry = (Map.Entry) it.next();
                        MapIteratorCache.this.f30628b = entry;
                        return (K) entry.getKey();
                    }
                };
            }
        };
    }
}
