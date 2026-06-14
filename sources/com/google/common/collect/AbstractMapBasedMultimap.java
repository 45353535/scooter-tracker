package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.AbstractMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractMapBasedMultimap<K, V> extends AbstractMultimap<K, V> implements Serializable {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient Map f29230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient int f29231h;

    private class AsMap extends Maps.ViewCachingAbstractMap<K, Collection<V>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final transient Map f29234e;

        class AsMapEntries extends Maps.EntrySet<K, Collection<V>> {
            AsMapEntries() {
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return Collections2.f(AsMap.this.f29234e.entrySet(), obj);
            }

            @Override // com.google.common.collect.Maps.EntrySet
            Map e() {
                return AsMap.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return AsMap.this.new AsMapIterator();
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AbstractMapBasedMultimap.this.F(entry.getKey());
                return true;
            }
        }

        class AsMapIterator implements Iterator<Map.Entry<K, Collection<V>>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final Iterator f29237b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Collection f29238c;

            AsMapIterator() {
                this.f29237b = AsMap.this.f29234e.entrySet().iterator();
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f29237b.hasNext();
            }

            @Override // java.util.Iterator
            public void remove() {
                Preconditions.checkState(this.f29238c != null, "no calls to next() since the last call to remove()");
                this.f29237b.remove();
                AbstractMapBasedMultimap.s(AbstractMapBasedMultimap.this, this.f29238c.size());
                this.f29238c.clear();
                this.f29238c = null;
            }

            @Override // java.util.Iterator
            public Map.Entry<K, Collection<V>> next() {
                Map.Entry entry = (Map.Entry) this.f29237b.next();
                this.f29238c = (Collection) entry.getValue();
                return AsMap.this.b(entry);
            }
        }

        AsMap(Map map) {
            this.f29234e = map;
        }

        Map.Entry b(Map.Entry entry) {
            Object key = entry.getKey();
            return Maps.immutableEntry(key, AbstractMapBasedMultimap.this.I(key, (Collection) entry.getValue()));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            if (this.f29234e == AbstractMapBasedMultimap.this.f29230g) {
                AbstractMapBasedMultimap.this.clear();
            } else {
                Iterators.b(new AsMapIterator());
            }
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return Maps.F(this.f29234e, obj);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected Set createEntrySet() {
            return new AsMapEntries();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean equals(Object obj) {
            return this == obj || this.f29234e.equals(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int hashCode() {
            return this.f29234e.hashCode();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return AbstractMapBasedMultimap.this.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f29234e.size();
        }

        @Override // java.util.AbstractMap
        public String toString() {
            return this.f29234e.toString();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> get(Object obj) {
            Collection collection = (Collection) Maps.G(this.f29234e, obj);
            if (collection == null) {
                return null;
            }
            return AbstractMapBasedMultimap.this.I(obj, collection);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> remove(Object obj) {
            Collection<? extends V> collection = (Collection) this.f29234e.remove(obj);
            if (collection == null) {
                return null;
            }
            Collection<V> collectionV = AbstractMapBasedMultimap.this.v();
            collectionV.addAll(collection);
            AbstractMapBasedMultimap.s(AbstractMapBasedMultimap.this, collection.size());
            collection.clear();
            return collectionV;
        }
    }

    private abstract class Itr<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Iterator f29240b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f29241c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Collection f29242d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Iterator f29243e = Iterators.g();

        Itr() {
            this.f29240b = AbstractMapBasedMultimap.this.f29230g.entrySet().iterator();
        }

        abstract Object a(Object obj, Object obj2);

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f29240b.hasNext() || this.f29243e.hasNext();
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            if (!this.f29243e.hasNext()) {
                Map.Entry entry = (Map.Entry) this.f29240b.next();
                this.f29241c = entry.getKey();
                Collection collection = (Collection) entry.getValue();
                this.f29242d = collection;
                this.f29243e = collection.iterator();
            }
            return (T) a(NullnessCasts.a(this.f29241c), this.f29243e.next());
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f29243e.remove();
            Collection collection = this.f29242d;
            Objects.requireNonNull(collection);
            if (collection.isEmpty()) {
                this.f29240b.remove();
            }
            AbstractMapBasedMultimap.q(AbstractMapBasedMultimap.this);
        }
    }

    private class KeySet extends Maps.KeySet<K, Collection<V>> {
        KeySet(Map map) {
            super(map);
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            Iterators.b(iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            return f().keySet().containsAll(collection);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return this == obj || f().keySet().equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return f().keySet().hashCode();
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            final Iterator<Map.Entry<K, V>> it = f().entrySet().iterator();
            return new Iterator<K>(this) { // from class: com.google.common.collect.AbstractMapBasedMultimap.KeySet.1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                Map.Entry f29246b;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final /* synthetic */ KeySet f29248d;

                {
                    this.f29248d = this;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return it.hasNext();
                }

                @Override // java.util.Iterator
                @ParametricNullness
                public K next() {
                    Map.Entry entry = (Map.Entry) it.next();
                    this.f29246b = entry;
                    return (K) entry.getKey();
                }

                @Override // java.util.Iterator
                public void remove() {
                    Preconditions.checkState(this.f29246b != null, "no calls to next() since the last call to remove()");
                    Collection collection = (Collection) this.f29246b.getValue();
                    it.remove();
                    AbstractMapBasedMultimap.s(AbstractMapBasedMultimap.this, collection.size());
                    collection.clear();
                    this.f29246b = null;
                }
            };
        }

        @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            int size;
            Collection collection = (Collection) f().remove(obj);
            if (collection != null) {
                size = collection.size();
                collection.clear();
                AbstractMapBasedMultimap.s(AbstractMapBasedMultimap.this, size);
            } else {
                size = 0;
            }
            return size > 0;
        }
    }

    private final class NavigableAsMap extends AbstractMapBasedMultimap<K, V>.SortedAsMap implements NavigableMap<K, Collection<V>> {
        NavigableAsMap(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> ceilingEntry(@ParametricNullness K k10) {
            Map.Entry<K, V> entryCeilingEntry = d().ceilingEntry(k10);
            if (entryCeilingEntry == null) {
                return null;
            }
            return b(entryCeilingEntry);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(@ParametricNullness K k10) {
            return (K) d().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return descendingMap().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> descendingMap() {
            return new NavigableAsMap(d().descendingMap());
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet createKeySet() {
            return new NavigableKeySet(d());
        }

        Map.Entry f(Iterator it) {
            if (!it.hasNext()) {
                return null;
            }
            Map.Entry entry = (Map.Entry) it.next();
            Collection collectionV = AbstractMapBasedMultimap.this.v();
            collectionV.addAll((Collection) entry.getValue());
            it.remove();
            return Maps.immutableEntry(entry.getKey(), AbstractMapBasedMultimap.this.H(collectionV));
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> firstEntry() {
            Map.Entry<K, V> entryFirstEntry = d().firstEntry();
            if (entryFirstEntry == null) {
                return null;
            }
            return b(entryFirstEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> floorEntry(@ParametricNullness K k10) {
            Map.Entry<K, V> entryFloorEntry = d().floorEntry(k10);
            if (entryFloorEntry == null) {
                return null;
            }
            return b(entryFloorEntry);
        }

        @Override // java.util.NavigableMap
        public K floorKey(@ParametricNullness K k10) {
            return (K) d().floorKey(k10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap d() {
            return (NavigableMap) super.d();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> higherEntry(@ParametricNullness K k10) {
            Map.Entry<K, V> entryHigherEntry = d().higherEntry(k10);
            if (entryHigherEntry == null) {
                return null;
            }
            return b(entryHigherEntry);
        }

        @Override // java.util.NavigableMap
        public K higherKey(@ParametricNullness K k10) {
            return (K) d().higherKey(k10);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lastEntry() {
            Map.Entry<K, V> entryLastEntry = d().lastEntry();
            if (entryLastEntry == null) {
                return null;
            }
            return b(entryLastEntry);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> lowerEntry(@ParametricNullness K k10) {
            Map.Entry<K, V> entryLowerEntry = d().lowerEntry(k10);
            if (entryLowerEntry == null) {
                return null;
            }
            return b(entryLowerEntry);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(@ParametricNullness K k10) {
            return (K) d().lowerKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return keySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollFirstEntry() {
            return f(entrySet().iterator());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, Collection<V>> pollLastEntry() {
            return f(descendingMap().entrySet().iterator());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(@ParametricNullness K k10) {
            return headMap(k10, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(@ParametricNullness K k10, @ParametricNullness K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(@ParametricNullness K k10) {
            return tailMap(k10, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> headMap(@ParametricNullness K k10, boolean z10) {
            return new NavigableAsMap(d().headMap(k10, z10));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedAsMap, com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public NavigableSet<K> keySet() {
            return (NavigableSet) super.keySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> subMap(@ParametricNullness K k10, boolean z10, @ParametricNullness K k11, boolean z11) {
            return new NavigableAsMap(d().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, Collection<V>> tailMap(@ParametricNullness K k10, boolean z10) {
            return new NavigableAsMap(d().tailMap(k10, z10));
        }
    }

    private final class NavigableKeySet extends AbstractMapBasedMultimap<K, V>.SortedKeySet implements NavigableSet<K> {
        NavigableKeySet(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(@ParametricNullness K k10) {
            return (K) f().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return new NavigableKeySet(f().descendingMap());
        }

        @Override // java.util.NavigableSet
        public K floor(@ParametricNullness K k10) {
            return (K) f().floorKey(k10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public NavigableMap f() {
            return (NavigableMap) super.f();
        }

        @Override // java.util.NavigableSet
        public K higher(@ParametricNullness K k10) {
            return (K) f().higherKey(k10);
        }

        @Override // java.util.NavigableSet
        public K lower(@ParametricNullness K k10) {
            return (K) f().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) Iterators.j(iterator());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) Iterators.j(descendingIterator());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet<K> headSet(@ParametricNullness K k10) {
            return headSet(k10, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet<K> subSet(@ParametricNullness K k10, @ParametricNullness K k11) {
            return subSet(k10, true, k11, false);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public NavigableSet<K> tailSet(@ParametricNullness K k10) {
            return tailSet(k10, true);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(@ParametricNullness K k10, boolean z10) {
            return new NavigableKeySet(f().headMap(k10, z10));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(@ParametricNullness K k10, boolean z10, @ParametricNullness K k11, boolean z11) {
            return new NavigableKeySet(f().subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(@ParametricNullness K k10, boolean z10) {
            return new NavigableKeySet(f().tailMap(k10, z10));
        }
    }

    private class RandomAccessWrappedList extends AbstractMapBasedMultimap<K, V>.WrappedList implements RandomAccess {
        RandomAccessWrappedList(Object obj, List list, WrappedCollection wrappedCollection) {
            super(obj, list, wrappedCollection);
        }
    }

    private class SortedAsMap extends AbstractMapBasedMultimap<K, V>.AsMap implements SortedMap<K, Collection<V>> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        SortedSet f29252g;

        SortedAsMap(SortedMap sortedMap) {
            super(sortedMap);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* JADX INFO: renamed from: c */
        public SortedSet createKeySet() {
            return new SortedKeySet(d());
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return d().comparator();
        }

        SortedMap d() {
            return (SortedMap) this.f29234e;
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K firstKey() {
            return (K) d().firstKey();
        }

        public SortedMap<K, Collection<V>> headMap(@ParametricNullness K k10) {
            return new SortedAsMap(d().headMap(k10));
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K lastKey() {
            return (K) d().lastKey();
        }

        public SortedMap<K, Collection<V>> subMap(@ParametricNullness K k10, @ParametricNullness K k11) {
            return new SortedAsMap(d().subMap(k10, k11));
        }

        public SortedMap<K, Collection<V>> tailMap(@ParametricNullness K k10) {
            return new SortedAsMap(d().tailMap(k10));
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.AsMap, com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public SortedSet<K> keySet() {
            SortedSet<K> sortedSet = this.f29252g;
            if (sortedSet != null) {
                return sortedSet;
            }
            SortedSet<K> sortedSetCreateKeySet = createKeySet();
            this.f29252g = sortedSetCreateKeySet;
            return sortedSetCreateKeySet;
        }
    }

    private class SortedKeySet extends AbstractMapBasedMultimap<K, V>.KeySet implements SortedSet<K> {
        SortedKeySet(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return f().comparator();
        }

        SortedMap f() {
            return (SortedMap) super.f();
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public K first() {
            return (K) f().firstKey();
        }

        public SortedSet<K> headSet(@ParametricNullness K k10) {
            return new SortedKeySet(f().headMap(k10));
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public K last() {
            return (K) f().lastKey();
        }

        public SortedSet<K> subSet(@ParametricNullness K k10, @ParametricNullness K k11) {
            return new SortedKeySet(f().subMap(k10, k11));
        }

        public SortedSet<K> tailSet(@ParametricNullness K k10) {
            return new SortedKeySet(f().tailMap(k10));
        }
    }

    class WrappedNavigableSet extends AbstractMapBasedMultimap<K, V>.WrappedSortedSet implements NavigableSet<V> {
        WrappedNavigableSet(Object obj, NavigableSet navigableSet, WrappedCollection wrappedCollection) {
            super(obj, navigableSet, wrappedCollection);
        }

        private NavigableSet n(NavigableSet navigableSet) {
            return new WrappedNavigableSet(this.f29255b, navigableSet, f() == null ? this : f());
        }

        @Override // java.util.NavigableSet
        public V ceiling(@ParametricNullness V v10) {
            return (V) l().ceiling(v10);
        }

        @Override // java.util.NavigableSet
        public Iterator<V> descendingIterator() {
            return new WrappedCollection.WrappedIterator(l().descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> descendingSet() {
            return n(l().descendingSet());
        }

        @Override // java.util.NavigableSet
        public V floor(@ParametricNullness V v10) {
            return (V) l().floor(v10);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> headSet(@ParametricNullness V v10, boolean z10) {
            return n(l().headSet(v10, z10));
        }

        @Override // java.util.NavigableSet
        public V higher(@ParametricNullness V v10) {
            return (V) l().higher(v10);
        }

        @Override // java.util.NavigableSet
        public V lower(@ParametricNullness V v10) {
            return (V) l().lower(v10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedSortedSet
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public NavigableSet l() {
            return (NavigableSet) super.l();
        }

        @Override // java.util.NavigableSet
        public V pollFirst() {
            return (V) Iterators.j(iterator());
        }

        @Override // java.util.NavigableSet
        public V pollLast() {
            return (V) Iterators.j(descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> subSet(@ParametricNullness V v10, boolean z10, @ParametricNullness V v11, boolean z11) {
            return n(l().subSet(v10, z10, v11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<V> tailSet(@ParametricNullness V v10, boolean z10) {
            return n(l().tailSet(v10, z10));
        }
    }

    class WrappedSet extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements Set<V> {
        WrappedSet(Object obj, Set set) {
            super(obj, set, null);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap.WrappedCollection, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zD = Sets.d((Set) this.f29256c, collection);
            if (zD) {
                AbstractMapBasedMultimap.r(AbstractMapBasedMultimap.this, this.f29256c.size() - size);
                k();
            }
            return zD;
        }
    }

    class WrappedSortedSet extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements SortedSet<V> {
        WrappedSortedSet(Object obj, SortedSet sortedSet, WrappedCollection wrappedCollection) {
            super(obj, sortedSet, wrappedCollection);
        }

        @Override // java.util.SortedSet
        public Comparator<? super V> comparator() {
            return l().comparator();
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public V first() {
            j();
            return (V) l().first();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> headSet(@ParametricNullness V v10) {
            j();
            return new WrappedSortedSet(i(), l().headSet(v10), f() == null ? this : f());
        }

        SortedSet l() {
            return (SortedSet) g();
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public V last() {
            j();
            return (V) l().last();
        }

        @Override // java.util.SortedSet
        public SortedSet<V> subSet(@ParametricNullness V v10, @ParametricNullness V v11) {
            j();
            return new WrappedSortedSet(i(), l().subSet(v10, v11), f() == null ? this : f());
        }

        @Override // java.util.SortedSet
        public SortedSet<V> tailSet(@ParametricNullness V v10) {
            j();
            return new WrappedSortedSet(i(), l().tailSet(v10), f() == null ? this : f());
        }
    }

    protected AbstractMapBasedMultimap(Map map) {
        Preconditions.checkArgument(map.isEmpty());
        this.f29230g = map;
    }

    private Collection D(Object obj) {
        Collection collection = (Collection) this.f29230g.get(obj);
        if (collection != null) {
            return collection;
        }
        Collection collectionX = x(obj);
        this.f29230g.put(obj, collectionX);
        return collectionX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Iterator E(Collection collection) {
        return collection instanceof List ? ((List) collection).listIterator() : collection.iterator();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void F(Object obj) {
        Collection collection = (Collection) Maps.H(this.f29230g, obj);
        if (collection != null) {
            int size = collection.size();
            collection.clear();
            this.f29231h -= size;
        }
    }

    static /* synthetic */ int o(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i10 = abstractMapBasedMultimap.f29231h;
        abstractMapBasedMultimap.f29231h = i10 + 1;
        return i10;
    }

    static /* synthetic */ int q(AbstractMapBasedMultimap abstractMapBasedMultimap) {
        int i10 = abstractMapBasedMultimap.f29231h;
        abstractMapBasedMultimap.f29231h = i10 - 1;
        return i10;
    }

    static /* synthetic */ int r(AbstractMapBasedMultimap abstractMapBasedMultimap, int i10) {
        int i11 = abstractMapBasedMultimap.f29231h + i10;
        abstractMapBasedMultimap.f29231h = i11;
        return i11;
    }

    static /* synthetic */ int s(AbstractMapBasedMultimap abstractMapBasedMultimap, int i10) {
        int i11 = abstractMapBasedMultimap.f29231h - i10;
        abstractMapBasedMultimap.f29231h = i11;
        return i11;
    }

    final Map A() {
        Map map = this.f29230g;
        return map instanceof NavigableMap ? new NavigableAsMap((NavigableMap) this.f29230g) : map instanceof SortedMap ? new SortedAsMap((SortedMap) this.f29230g) : new AsMap(this.f29230g);
    }

    final Set B() {
        Map map = this.f29230g;
        return map instanceof NavigableMap ? new NavigableKeySet((NavigableMap) this.f29230g) : map instanceof SortedMap ? new SortedKeySet((SortedMap) this.f29230g) : new KeySet(this.f29230g);
    }

    Collection C() {
        return H(v());
    }

    final void G(Map map) {
        this.f29230g = map;
        this.f29231h = 0;
        for (V v10 : map.values()) {
            Preconditions.checkArgument(!v10.isEmpty());
            this.f29231h += v10.size();
        }
    }

    Collection H(Collection collection) {
        return DesugarCollections.unmodifiableCollection(collection);
    }

    Collection I(Object obj, Collection collection) {
        return new WrappedCollection(obj, collection, null);
    }

    final List J(Object obj, List list, WrappedCollection wrappedCollection) {
        return list instanceof RandomAccess ? new RandomAccessWrappedList(obj, list, wrappedCollection) : new WrappedList(obj, list, wrappedCollection);
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        Iterator<V> it = this.f29230g.values().iterator();
        while (it.hasNext()) {
            ((Collection) it.next()).clear();
        }
        this.f29230g.clear();
        this.f29231h = 0;
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(Object obj) {
        return this.f29230g.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractMultimap
    Map d() {
        return new AsMap(this.f29230g);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Collection<Map.Entry<K, V>> entries() {
        return super.entries();
    }

    @Override // com.google.common.collect.AbstractMultimap
    Collection g() {
        return this instanceof SetMultimap ? new AbstractMultimap.EntrySet() : new AbstractMultimap.Entries();
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection<V> get(@ParametricNullness K k10) {
        Collection collectionX = (Collection) this.f29230g.get(k10);
        if (collectionX == null) {
            collectionX = x(k10);
        }
        return I(k10, collectionX);
    }

    @Override // com.google.common.collect.AbstractMultimap
    Set h() {
        return new KeySet(this.f29230g);
    }

    @Override // com.google.common.collect.AbstractMultimap
    Multiset i() {
        return new Multimaps.Keys(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    Collection j() {
        return new AbstractMultimap.Values();
    }

    @Override // com.google.common.collect.AbstractMultimap
    Iterator k() {
        return new AbstractMapBasedMultimap<K, V>.Itr<Map.Entry<K, V>>() { // from class: com.google.common.collect.AbstractMapBasedMultimap.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry a(Object obj, Object obj2) {
                return Maps.immutableEntry(obj, obj2);
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap
    Iterator l() {
        return new AbstractMapBasedMultimap<K, V>.Itr<V>() { // from class: com.google.common.collect.AbstractMapBasedMultimap.1
            @Override // com.google.common.collect.AbstractMapBasedMultimap.Itr
            Object a(Object obj, Object obj2) {
                return obj2;
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public boolean put(@ParametricNullness K k10, @ParametricNullness V v10) {
        Collection collection = (Collection) this.f29230g.get(k10);
        if (collection != null) {
            if (!collection.add(v10)) {
                return false;
            }
            this.f29231h++;
            return true;
        }
        Collection collectionX = x(k10);
        if (!collectionX.add(v10)) {
            throw new AssertionError("New Collection violated the Collection spec");
        }
        this.f29231h++;
        this.f29230g.put(k10, collectionX);
        return true;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection<V> removeAll(Object obj) {
        Collection collection = (Collection) this.f29230g.remove(obj);
        if (collection == null) {
            return C();
        }
        Collection collectionV = v();
        collectionV.addAll(collection);
        this.f29231h -= collection.size();
        collection.clear();
        return H(collectionV);
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection<V> replaceValues(@ParametricNullness K k10, Iterable<? extends V> iterable) {
        Iterator<? extends V> it = iterable.iterator();
        if (!it.hasNext()) {
            return removeAll(k10);
        }
        Collection collectionD = D(k10);
        Collection collectionV = v();
        collectionV.addAll(collectionD);
        this.f29231h -= collectionD.size();
        collectionD.clear();
        while (it.hasNext()) {
            if (collectionD.add(it.next())) {
                this.f29231h++;
            }
        }
        return H(collectionV);
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return this.f29231h;
    }

    Map u() {
        return this.f29230g;
    }

    abstract Collection v();

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Collection<V> values() {
        return super.values();
    }

    Collection x(Object obj) {
        return v();
    }

    class WrappedCollection extends AbstractCollection<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f29255b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Collection f29256c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final WrappedCollection f29257d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Collection f29258e;

        WrappedCollection(Object obj, Collection collection, WrappedCollection wrappedCollection) {
            this.f29255b = obj;
            this.f29256c = collection;
            this.f29257d = wrappedCollection;
            this.f29258e = wrappedCollection == null ? null : wrappedCollection.g();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean add(@ParametricNullness V v10) {
            j();
            boolean zIsEmpty = this.f29256c.isEmpty();
            boolean zAdd = this.f29256c.add(v10);
            if (zAdd) {
                AbstractMapBasedMultimap.o(AbstractMapBasedMultimap.this);
                if (zIsEmpty) {
                    e();
                }
            }
            return zAdd;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean addAll(Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = this.f29256c.addAll(collection);
            if (zAddAll) {
                AbstractMapBasedMultimap.r(AbstractMapBasedMultimap.this, this.f29256c.size() - size);
                if (size == 0) {
                    e();
                }
            }
            return zAddAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            int size = size();
            if (size == 0) {
                return;
            }
            this.f29256c.clear();
            AbstractMapBasedMultimap.s(AbstractMapBasedMultimap.this, size);
            k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            j();
            return this.f29256c.contains(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            j();
            return this.f29256c.containsAll(collection);
        }

        /* JADX WARN: Multi-variable type inference failed */
        void e() {
            WrappedCollection wrappedCollection = this.f29257d;
            if (wrappedCollection != null) {
                wrappedCollection.e();
            } else {
                AbstractMapBasedMultimap.this.f29230g.put(this.f29255b, this.f29256c);
            }
        }

        @Override // java.util.Collection
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            j();
            return this.f29256c.equals(obj);
        }

        WrappedCollection f() {
            return this.f29257d;
        }

        Collection g() {
            return this.f29256c;
        }

        @Override // java.util.Collection
        public int hashCode() {
            j();
            return this.f29256c.hashCode();
        }

        Object i() {
            return this.f29255b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            j();
            return new WrappedIterator();
        }

        void j() {
            Collection collection;
            WrappedCollection wrappedCollection = this.f29257d;
            if (wrappedCollection != null) {
                wrappedCollection.j();
                if (this.f29257d.g() != this.f29258e) {
                    throw new ConcurrentModificationException();
                }
            } else {
                if (!this.f29256c.isEmpty() || (collection = (Collection) AbstractMapBasedMultimap.this.f29230g.get(this.f29255b)) == null) {
                    return;
                }
                this.f29256c = collection;
            }
        }

        void k() {
            WrappedCollection wrappedCollection = this.f29257d;
            if (wrappedCollection != null) {
                wrappedCollection.k();
            } else if (this.f29256c.isEmpty()) {
                AbstractMapBasedMultimap.this.f29230g.remove(this.f29255b);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            j();
            boolean zRemove = this.f29256c.remove(obj);
            if (zRemove) {
                AbstractMapBasedMultimap.q(AbstractMapBasedMultimap.this);
                k();
            }
            return zRemove;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zRemoveAll = this.f29256c.removeAll(collection);
            if (zRemoveAll) {
                AbstractMapBasedMultimap.r(AbstractMapBasedMultimap.this, this.f29256c.size() - size);
                k();
            }
            return zRemoveAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Preconditions.checkNotNull(collection);
            int size = size();
            boolean zRetainAll = this.f29256c.retainAll(collection);
            if (zRetainAll) {
                AbstractMapBasedMultimap.r(AbstractMapBasedMultimap.this, this.f29256c.size() - size);
                k();
            }
            return zRetainAll;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            j();
            return this.f29256c.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            j();
            return this.f29256c.toString();
        }

        class WrappedIterator implements Iterator<V> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final Iterator f29260b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final Collection f29261c;

            WrappedIterator() {
                Collection collection = WrappedCollection.this.f29256c;
                this.f29261c = collection;
                this.f29260b = AbstractMapBasedMultimap.E(collection);
            }

            Iterator a() {
                b();
                return this.f29260b;
            }

            void b() {
                WrappedCollection.this.j();
                if (WrappedCollection.this.f29256c != this.f29261c) {
                    throw new ConcurrentModificationException();
                }
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                b();
                return this.f29260b.hasNext();
            }

            @Override // java.util.Iterator
            @ParametricNullness
            public V next() {
                b();
                return (V) this.f29260b.next();
            }

            @Override // java.util.Iterator
            public void remove() {
                this.f29260b.remove();
                AbstractMapBasedMultimap.q(AbstractMapBasedMultimap.this);
                WrappedCollection.this.k();
            }

            WrappedIterator(Iterator it) {
                this.f29261c = WrappedCollection.this.f29256c;
                this.f29260b = it;
            }
        }
    }

    class WrappedList extends AbstractMapBasedMultimap<K, V>.WrappedCollection implements List<V> {

        private class WrappedListIterator extends AbstractMapBasedMultimap<K, V>.WrappedCollection.WrappedIterator implements ListIterator<V> {
            WrappedListIterator() {
                super();
            }

            private ListIterator c() {
                return (ListIterator) a();
            }

            @Override // java.util.ListIterator
            public void add(@ParametricNullness V v10) {
                boolean zIsEmpty = WrappedList.this.isEmpty();
                c().add(v10);
                AbstractMapBasedMultimap.o(AbstractMapBasedMultimap.this);
                if (zIsEmpty) {
                    WrappedList.this.e();
                }
            }

            @Override // java.util.ListIterator
            public boolean hasPrevious() {
                return c().hasPrevious();
            }

            @Override // java.util.ListIterator
            public int nextIndex() {
                return c().nextIndex();
            }

            @Override // java.util.ListIterator
            @ParametricNullness
            public V previous() {
                return (V) c().previous();
            }

            @Override // java.util.ListIterator
            public int previousIndex() {
                return c().previousIndex();
            }

            @Override // java.util.ListIterator
            public void set(@ParametricNullness V v10) {
                c().set(v10);
            }

            public WrappedListIterator(int i10) {
                super(WrappedList.this.l().listIterator(i10));
            }
        }

        WrappedList(Object obj, List list, WrappedCollection wrappedCollection) {
            super(obj, list, wrappedCollection);
        }

        @Override // java.util.List
        public void add(int i10, @ParametricNullness V v10) {
            j();
            boolean zIsEmpty = g().isEmpty();
            l().add(i10, v10);
            AbstractMapBasedMultimap.o(AbstractMapBasedMultimap.this);
            if (zIsEmpty) {
                e();
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends V> collection) {
            if (collection.isEmpty()) {
                return false;
            }
            int size = size();
            boolean zAddAll = l().addAll(i10, collection);
            if (zAddAll) {
                AbstractMapBasedMultimap.r(AbstractMapBasedMultimap.this, g().size() - size);
                if (size == 0) {
                    e();
                }
            }
            return zAddAll;
        }

        @Override // java.util.List
        @ParametricNullness
        public V get(int i10) {
            j();
            return (V) l().get(i10);
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            j();
            return l().indexOf(obj);
        }

        List l() {
            return (List) g();
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            j();
            return l().lastIndexOf(obj);
        }

        @Override // java.util.List
        public ListIterator<V> listIterator() {
            j();
            return new WrappedListIterator();
        }

        @Override // java.util.List
        @ParametricNullness
        public V remove(int i10) {
            j();
            V v10 = (V) l().remove(i10);
            AbstractMapBasedMultimap.q(AbstractMapBasedMultimap.this);
            k();
            return v10;
        }

        @Override // java.util.List
        @ParametricNullness
        public V set(int i10, @ParametricNullness V v10) {
            j();
            return (V) l().set(i10, v10);
        }

        @Override // java.util.List
        public List<V> subList(int i10, int i11) {
            j();
            return AbstractMapBasedMultimap.this.J(i(), l().subList(i10, i11), f() == null ? this : f());
        }

        @Override // java.util.List
        public ListIterator<V> listIterator(int i10) {
            j();
            return new WrappedListIterator(i10);
        }
    }
}
