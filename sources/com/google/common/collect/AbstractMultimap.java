package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multimaps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractMultimap<K, V> implements Multimap<K, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Collection f29276b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Set f29277c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient Multiset f29278d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient Collection f29279e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private transient Map f29280f;

    class Entries extends Multimaps.Entries<K, V> {
        Entries() {
        }

        @Override // com.google.common.collect.Multimaps.Entries
        Multimap e() {
            return AbstractMultimap.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return AbstractMultimap.this.k();
        }
    }

    class EntrySet extends AbstractMultimap<K, V>.Entries implements Set<Map.Entry<K, V>> {
        EntrySet() {
            super();
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.b(this);
        }
    }

    class Values extends AbstractCollection<V> {
        Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractMultimap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractMultimap.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return AbstractMultimap.this.l();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractMultimap.this.size();
        }
    }

    AbstractMultimap() {
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Map<K, Collection<V>> asMap() {
        Map<K, Collection<V>> map = this.f29280f;
        if (map != null) {
            return map;
        }
        Map<K, Collection<V>> mapD = d();
        this.f29280f = mapD;
        return mapD;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsEntry(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        return collection != null && collection.contains(obj2);
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsValue(Object obj) {
        Iterator<Collection<V>> it = asMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().contains(obj)) {
                return true;
            }
        }
        return false;
    }

    abstract Map d();

    @Override // com.google.common.collect.Multimap
    public Collection<Map.Entry<K, V>> entries() {
        Collection<Map.Entry<K, V>> collection = this.f29276b;
        if (collection != null) {
            return collection;
        }
        Collection<Map.Entry<K, V>> collectionG = g();
        this.f29276b = collectionG;
        return collectionG;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public boolean equals(Object obj) {
        return Multimaps.c(this, obj);
    }

    abstract Collection g();

    abstract Set h();

    @Override // com.google.common.collect.Multimap
    public int hashCode() {
        return asMap().hashCode();
    }

    abstract Multiset i();

    @Override // com.google.common.collect.Multimap
    public boolean isEmpty() {
        return size() == 0;
    }

    abstract Collection j();

    abstract Iterator k();

    @Override // com.google.common.collect.Multimap
    public Set<K> keySet() {
        Set<K> set = this.f29277c;
        if (set != null) {
            return set;
        }
        Set<K> setH = h();
        this.f29277c = setH;
        return setH;
    }

    @Override // com.google.common.collect.Multimap
    public Multiset<K> keys() {
        Multiset<K> multiset = this.f29278d;
        if (multiset != null) {
            return multiset;
        }
        Multiset<K> multisetI = i();
        this.f29278d = multisetI;
        return multisetI;
    }

    Iterator l() {
        return Maps.R(entries().iterator());
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean put(@ParametricNullness K k10, @ParametricNullness V v10) {
        return get(k10).add(v10);
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean putAll(@ParametricNullness K k10, Iterable<? extends V> iterable) {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof Collection) {
            Collection<? extends V> collection = (Collection) iterable;
            return !collection.isEmpty() && get(k10).addAll(collection);
        }
        Iterator<? extends V> it = iterable.iterator();
        return it.hasNext() && Iterators.addAll(get(k10), it);
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean remove(Object obj, Object obj2) {
        Collection<V> collection = asMap().get(obj);
        return collection != null && collection.remove(obj2);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public Collection<V> replaceValues(@ParametricNullness K k10, Iterable<? extends V> iterable) {
        Preconditions.checkNotNull(iterable);
        Collection<V> collectionRemoveAll = removeAll(k10);
        putAll(k10, iterable);
        return collectionRemoveAll;
    }

    public String toString() {
        return asMap().toString();
    }

    @Override // com.google.common.collect.Multimap
    public Collection<V> values() {
        Collection<V> collection = this.f29279e;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionJ = j();
        this.f29279e = collectionJ;
        return collectionJ;
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean putAll(Multimap<? extends K, ? extends V> multimap) {
        boolean zPut = false;
        for (Map.Entry<? extends K, ? extends V> entry : multimap.entries()) {
            zPut |= put(entry.getKey(), entry.getValue());
        }
        return zPut;
    }
}
