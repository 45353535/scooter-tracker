package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Converter;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.MapDifference;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.ironsource.D5;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Collector;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.AbstractMap;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Properties;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentMap;
import java.util.function.BinaryOperator;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Maps {

    private static abstract class AbstractFilteredMap<K, V> extends ViewCachingAbstractMap<K, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Map f29934e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Predicate f29935f;

        AbstractFilteredMap(Map map, Predicate predicate) {
            this.f29934e = map;
            this.f29935f = predicate;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Collection a() {
            return new FilteredMapValues(this, this.f29934e, this.f29935f);
        }

        boolean b(Object obj, Object obj2) {
            return this.f29935f.apply(Maps.immutableEntry(obj, obj2));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f29934e.containsKey(obj) && b(obj, this.f29934e.get(obj));
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            V v10 = (V) this.f29934e.get(obj);
            if (v10 == null || !b(obj, v10)) {
                return null;
            }
            return v10;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return entrySet().isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(@ParametricNullness K k10, @ParametricNullness V v10) {
            Preconditions.checkArgument(b(k10, v10));
            return (V) this.f29934e.put(k10, v10);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
                Preconditions.checkArgument(b(entry.getKey(), entry.getValue()));
            }
            this.f29934e.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            if (containsKey(obj)) {
                return (V) this.f29934e.remove(obj);
            }
            return null;
        }
    }

    private static class AsMapView<K, V> extends ViewCachingAbstractMap<K, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Set f29936e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Function f29937f;

        AsMapView(Set set, Function function) {
            this.f29936e = (Set) Preconditions.checkNotNull(set);
            this.f29937f = (Function) Preconditions.checkNotNull(function);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Collection a() {
            return Collections2.transform(this.f29936e, this.f29937f);
        }

        Set b() {
            return this.f29936e;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            b().clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return b().contains(obj);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected Set createEntrySet() {
            return new EntrySet<K, V>() { // from class: com.google.common.collect.Maps.AsMapView.1EntrySetImpl
                @Override // com.google.common.collect.Maps.EntrySet
                Map e() {
                    return AsMapView.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Map.Entry<K, V>> iterator() {
                    return Maps.i(AsMapView.this.b(), AsMapView.this.f29937f);
                }
            };
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        public Set<K> createKeySet() {
            return Maps.D(b());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            if (Collections2.f(b(), obj)) {
                return (V) this.f29937f.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            if (b().remove(obj)) {
                return (V) this.f29937f.apply(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return b().size();
        }
    }

    private static final class BiMapConverter<A, B> extends Converter<A, B> implements Serializable {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final BiMap f29939d;

        BiMapConverter(BiMap biMap) {
            this.f29939d = (BiMap) Preconditions.checkNotNull(biMap);
        }

        private static Object j(BiMap biMap, Object obj) {
            V v10 = biMap.get(obj);
            Preconditions.checkArgument(v10 != 0, "No non-null mapping present for input: %s", obj);
            return v10;
        }

        @Override // com.google.common.base.Converter
        protected Object d(Object obj) {
            return j(this.f29939d.inverse(), obj);
        }

        @Override // com.google.common.base.Converter, com.google.common.base.Function
        public boolean equals(Object obj) {
            if (obj instanceof BiMapConverter) {
                return this.f29939d.equals(((BiMapConverter) obj).f29939d);
            }
            return false;
        }

        @Override // com.google.common.base.Converter
        protected Object g(Object obj) {
            return j(this.f29939d, obj);
        }

        public int hashCode() {
            return this.f29939d.hashCode();
        }

        public String toString() {
            return "Maps.asConverter(" + this.f29939d + ")";
        }
    }

    @GwtIncompatible
    static abstract class DescendingMap<K, V> extends ForwardingMap<K, V> implements NavigableMap<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private transient Comparator f29940b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private transient Set f29941c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private transient NavigableSet f29942d;

        DescendingMap() {
        }

        private static Ordering k(Comparator comparator) {
            return Ordering.from(comparator).reverse();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(@ParametricNullness K k10) {
            return j().floorEntry(k10);
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(@ParametricNullness K k10) {
            return (K) j().floorKey(k10);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator = this.f29940b;
            if (comparator != null) {
                return comparator;
            }
            Comparator<? super K> comparator2 = j().comparator();
            if (comparator2 == null) {
                comparator2 = Ordering.natural();
            }
            Ordering orderingK = k(comparator2);
            this.f29940b = orderingK;
            return orderingK;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return j().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return j();
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f29941c;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setG = g();
            this.f29941c = setG;
            return setG;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
            return j().lastEntry();
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K firstKey() {
            return (K) j().lastKey();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(@ParametricNullness K k10) {
            return j().ceilingEntry(k10);
        }

        @Override // java.util.NavigableMap
        public K floorKey(@ParametricNullness K k10) {
            return (K) j().ceilingKey(k10);
        }

        Set g() {
            return new EntrySet<K, V>() { // from class: com.google.common.collect.Maps.DescendingMap.1EntrySetImpl
                @Override // com.google.common.collect.Maps.EntrySet
                Map e() {
                    return DescendingMap.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Map.Entry<K, V>> iterator() {
                    return DescendingMap.this.i();
                }
            };
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@ParametricNullness K k10, boolean z10) {
            return j().tailMap(k10, z10).descendingMap();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(@ParametricNullness K k10) {
            return j().lowerEntry(k10);
        }

        @Override // java.util.NavigableMap
        public K higherKey(@ParametricNullness K k10) {
            return (K) j().lowerKey(k10);
        }

        abstract Iterator i();

        abstract NavigableMap j();

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            return j().firstEntry();
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K lastKey() {
            return (K) j().firstKey();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(@ParametricNullness K k10) {
            return j().higherEntry(k10);
        }

        @Override // java.util.NavigableMap
        public K lowerKey(@ParametricNullness K k10) {
            return (K) j().higherKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            NavigableSet<K> navigableSet = this.f29942d;
            if (navigableSet != null) {
                return navigableSet;
            }
            NavigableKeySet navigableKeySet = new NavigableKeySet(this);
            this.f29942d = navigableKeySet;
            return navigableKeySet;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
            return j().pollLastEntry();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
            return j().pollFirstEntry();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@ParametricNullness K k10, boolean z10, @ParametricNullness K k11, boolean z11) {
            return j().subMap(k11, z11, k10, z10).descendingMap();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@ParametricNullness K k10, boolean z10) {
            return j().headMap(k10, z10).descendingMap();
        }

        @Override // com.google.common.collect.ForwardingObject
        public String toString() {
            return standardToString();
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public Collection<V> values() {
            return new Values(this);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: delegate */
        public final Map n() {
            return j();
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> headMap(@ParametricNullness K k10) {
            return headMap(k10, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> subMap(@ParametricNullness K k10, @ParametricNullness K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // java.util.NavigableMap, java.util.SortedMap
        public SortedMap<K, V> tailMap(@ParametricNullness K k10) {
            return tailMap(k10, true);
        }
    }

    private enum EntryFunction implements Function<Map.Entry<?, ?>, Object> {
        KEY { // from class: com.google.common.collect.Maps.EntryFunction.1
            @Override // com.google.common.base.Function
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getKey();
            }
        },
        VALUE { // from class: com.google.common.collect.Maps.EntryFunction.2
            @Override // com.google.common.base.Function
            public Object apply(Map.Entry<?, ?> entry) {
                return entry.getValue();
            }
        }
    }

    static abstract class EntrySet<K, V> extends Sets.ImprovedAbstractSet<Map.Entry<K, V>> {
        EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object objG = Maps.G(e(), key);
                if (Objects.equal(objG, entry.getValue()) && (objG != null || e().containsKey(key))) {
                    return true;
                }
            }
            return false;
        }

        abstract Map e();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return e().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (contains(obj) && (obj instanceof Map.Entry)) {
                return e().keySet().remove(((Map.Entry) obj).getKey());
            }
            return false;
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                return Sets.e(this, collection.iterator());
            }
        }

        @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetNewHashSetWithExpectedSize = Sets.newHashSetWithExpectedSize(collection.size());
                for (Object obj : collection) {
                    if (contains(obj) && (obj instanceof Map.Entry)) {
                        hashSetNewHashSetWithExpectedSize.add(((Map.Entry) obj).getKey());
                    }
                }
                return e().keySet().retainAll(hashSetNewHashSetWithExpectedSize);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return e().size();
        }
    }

    public interface EntryTransformer<K, V1, V2> {
        @ParametricNullness
        V2 transformEntry(@ParametricNullness K k10, @ParametricNullness V1 v12);
    }

    static final class FilteredEntryBiMap<K, V> extends FilteredEntryMap<K, V> implements BiMap<K, V> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final BiMap f29945h;

        FilteredEntryBiMap(BiMap biMap, Predicate predicate) {
            super(biMap, predicate);
            this.f29945h = new FilteredEntryBiMap(biMap.inverse(), e(predicate), this);
        }

        private static Predicate e(final Predicate predicate) {
            return new Predicate<Map.Entry<Object, Object>>() { // from class: com.google.common.collect.Maps.FilteredEntryBiMap.1
                @Override // com.google.common.base.Predicate
                public boolean apply(Map.Entry<Object, Object> entry) {
                    return predicate.apply(Maps.immutableEntry(entry.getValue(), entry.getKey()));
                }
            };
        }

        BiMap f() {
            return (BiMap) this.f29934e;
        }

        @Override // com.google.common.collect.BiMap
        public V forcePut(@ParametricNullness K k10, @ParametricNullness V v10) {
            Preconditions.checkArgument(b(k10, v10));
            return (V) f().forcePut(k10, v10);
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<V, K> inverse() {
            return this.f29945h;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public Set<V> values() {
            return this.f29945h.keySet();
        }

        private FilteredEntryBiMap(BiMap biMap, Predicate predicate, BiMap biMap2) {
            super(biMap, predicate);
            this.f29945h = biMap2;
        }
    }

    static class FilteredEntryMap<K, V> extends AbstractFilteredMap<K, V> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Set f29947g;

        private class EntrySet extends ForwardingSet<Map.Entry<K, V>> {
            private EntrySet() {
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, V>> iterator() {
                return new TransformedIterator<Map.Entry<K, V>, Map.Entry<K, V>>(FilteredEntryMap.this.f29947g.iterator()) { // from class: com.google.common.collect.Maps.FilteredEntryMap.EntrySet.1
                    /* JADX INFO: Access modifiers changed from: package-private */
                    @Override // com.google.common.collect.TransformedIterator
                    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                    public Map.Entry a(final Map.Entry entry) {
                        return new ForwardingMapEntry<K, V>(this) { // from class: com.google.common.collect.Maps.FilteredEntryMap.EntrySet.1.1

                            /* JADX INFO: renamed from: c, reason: collision with root package name */
                            final /* synthetic */ AnonymousClass1 f29951c;

                            {
                                this.f29951c = this;
                            }

                            /* JADX INFO: Access modifiers changed from: protected */
                            @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                            /* JADX INFO: renamed from: g */
                            public Map.Entry n() {
                                return entry;
                            }

                            @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                            @ParametricNullness
                            public V setValue(@ParametricNullness V v10) {
                                Preconditions.checkArgument(FilteredEntryMap.this.b(getKey(), v10));
                                return (V) super.setValue(v10);
                            }
                        };
                    }
                };
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
            public Set n() {
                return FilteredEntryMap.this.f29947g;
            }
        }

        class KeySet extends KeySet<K, V> {
            KeySet() {
                super(FilteredEntryMap.this);
            }

            @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!FilteredEntryMap.this.containsKey(obj)) {
                    return false;
                }
                FilteredEntryMap.this.f29934e.remove(obj);
                return true;
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                FilteredEntryMap filteredEntryMap = FilteredEntryMap.this;
                return FilteredEntryMap.c(filteredEntryMap.f29934e, filteredEntryMap.f29935f, collection);
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                FilteredEntryMap filteredEntryMap = FilteredEntryMap.this;
                return FilteredEntryMap.d(filteredEntryMap.f29934e, filteredEntryMap.f29935f, collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public Object[] toArray() {
                return Lists.newArrayList(iterator()).toArray();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public <T> T[] toArray(T[] tArr) {
                return (T[]) Lists.newArrayList(iterator()).toArray(tArr);
            }
        }

        FilteredEntryMap(Map map, Predicate predicate) {
            super(map, predicate);
            this.f29947g = Sets.filter(map.entrySet(), this.f29935f);
        }

        static boolean c(Map map, Predicate predicate, Collection collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (predicate.apply(next) && collection.contains(next.getKey())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        static boolean d(Map map, Predicate predicate, Collection collection) {
            Iterator<Map.Entry<K, V>> it = map.entrySet().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (predicate.apply(next) && !collection.contains(next.getKey())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected Set createEntrySet() {
            return new EntrySet();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Set createKeySet() {
            return new KeySet();
        }
    }

    @GwtIncompatible
    private static class FilteredEntryNavigableMap<K, V> extends AbstractNavigableMap<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final NavigableMap f29953b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Predicate f29954c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Map f29955d;

        FilteredEntryNavigableMap(NavigableMap navigableMap, Predicate predicate) {
            this.f29953b = (NavigableMap) Preconditions.checkNotNull(navigableMap);
            this.f29954c = predicate;
            this.f29955d = new FilteredEntryMap(navigableMap, predicate);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        Iterator a() {
            return Iterators.filter(this.f29953b.entrySet().iterator(), this.f29954c);
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        Iterator b() {
            return Iterators.filter(this.f29953b.descendingMap().entrySet().iterator(), this.f29954c);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f29955d.clear();
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return this.f29953b.comparator();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f29955d.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return Maps.filterEntries((NavigableMap) this.f29953b.descendingMap(), this.f29954c);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<Map.Entry<K, V>> entrySet() {
            return this.f29955d.entrySet();
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            return (V) this.f29955d.get(obj);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@ParametricNullness K k10, boolean z10) {
            return Maps.filterEntries((NavigableMap) this.f29953b.headMap(k10, z10), this.f29954c);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return !Iterables.any(this.f29953b.entrySet(), this.f29954c);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return new NavigableKeySet<K, V>(this) { // from class: com.google.common.collect.Maps.FilteredEntryNavigableMap.1
                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean removeAll(Collection<?> collection) {
                    return FilteredEntryMap.c(FilteredEntryNavigableMap.this.f29953b, FilteredEntryNavigableMap.this.f29954c, collection);
                }

                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> collection) {
                    return FilteredEntryMap.d(FilteredEntryNavigableMap.this.f29953b, FilteredEntryNavigableMap.this.f29954c, collection);
                }
            };
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
            return (Map.Entry) Iterables.c(this.f29953b.entrySet(), this.f29954c);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
            return (Map.Entry) Iterables.c(this.f29953b.descendingMap().entrySet(), this.f29954c);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(@ParametricNullness K k10, @ParametricNullness V v10) {
            return (V) this.f29955d.put(k10, v10);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            this.f29955d.putAll(map);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            return (V) this.f29955d.remove(obj);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f29955d.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@ParametricNullness K k10, boolean z10, @ParametricNullness K k11, boolean z11) {
            return Maps.filterEntries((NavigableMap) this.f29953b.subMap(k10, z10, k11, z11), this.f29954c);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@ParametricNullness K k10, boolean z10) {
            return Maps.filterEntries((NavigableMap) this.f29953b.tailMap(k10, z10), this.f29954c);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Collection<V> values() {
            return new FilteredMapValues(this, this.f29953b, this.f29954c);
        }
    }

    private static class FilteredEntrySortedMap<K, V> extends FilteredEntryMap<K, V> implements SortedMap<K, V> {

        class SortedKeySet extends FilteredEntryMap<K, V>.KeySet implements SortedSet<K> {
            SortedKeySet() {
                super();
            }

            @Override // java.util.SortedSet
            public Comparator<? super K> comparator() {
                return FilteredEntrySortedMap.this.f().comparator();
            }

            @Override // java.util.SortedSet
            @ParametricNullness
            public K first() {
                return (K) FilteredEntrySortedMap.this.firstKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> headSet(@ParametricNullness K k10) {
                return (SortedSet) FilteredEntrySortedMap.this.headMap(k10).keySet();
            }

            @Override // java.util.SortedSet
            @ParametricNullness
            public K last() {
                return (K) FilteredEntrySortedMap.this.lastKey();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> subSet(@ParametricNullness K k10, @ParametricNullness K k11) {
                return (SortedSet) FilteredEntrySortedMap.this.subMap(k10, k11).keySet();
            }

            @Override // java.util.SortedSet
            public SortedSet<K> tailSet(@ParametricNullness K k10) {
                return (SortedSet) FilteredEntrySortedMap.this.tailMap(k10).keySet();
            }
        }

        FilteredEntrySortedMap(SortedMap sortedMap, Predicate predicate) {
            super(sortedMap, predicate);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return f().comparator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.FilteredEntryMap, com.google.common.collect.Maps.ViewCachingAbstractMap
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public SortedSet createKeySet() {
            return new SortedKeySet();
        }

        SortedMap f() {
            return (SortedMap) this.f29934e;
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K firstKey() {
            return keySet().iterator().next();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(@ParametricNullness K k10) {
            return new FilteredEntrySortedMap(f().headMap(k10), this.f29935f);
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K lastKey() {
            SortedMap<K, V> sortedMapF = f();
            while (true) {
                K kLastKey = sortedMapF.lastKey();
                if (b(kLastKey, NullnessCasts.a(this.f29934e.get(kLastKey)))) {
                    return kLastKey;
                }
                sortedMapF = f().headMap(kLastKey);
            }
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(@ParametricNullness K k10, @ParametricNullness K k11) {
            return new FilteredEntrySortedMap(f().subMap(k10, k11), this.f29935f);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(@ParametricNullness K k10) {
            return new FilteredEntrySortedMap(f().tailMap(k10), this.f29935f);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public SortedSet<K> keySet() {
            return (SortedSet) super.keySet();
        }
    }

    private static class FilteredKeyMap<K, V> extends AbstractFilteredMap<K, V> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Predicate f29958g;

        FilteredKeyMap(Map map, Predicate predicate, Predicate predicate2) {
            super(map, predicate2);
            this.f29958g = predicate;
        }

        @Override // com.google.common.collect.Maps.AbstractFilteredMap, java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f29934e.containsKey(obj) && this.f29958g.apply(obj);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected Set createEntrySet() {
            return Sets.filter(this.f29934e.entrySet(), this.f29935f);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Set createKeySet() {
            return Sets.filter(this.f29934e.keySet(), this.f29958g);
        }
    }

    private static final class FilteredMapValues<K, V> extends Values<K, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Map f29959c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Predicate f29960d;

        FilteredMapValues(Map map, Map map2, Predicate predicate) {
            super(map);
            this.f29959c = map2;
            this.f29960d = predicate;
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            Iterator<Map.Entry<K, V>> it = this.f29959c.entrySet().iterator();
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f29960d.apply(next) && Objects.equal(next.getValue(), obj)) {
                    it.remove();
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f29959c.entrySet().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f29960d.apply(next) && collection.contains(next.getValue())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            Iterator<Map.Entry<K, V>> it = this.f29959c.entrySet().iterator();
            boolean z10 = false;
            while (it.hasNext()) {
                Map.Entry<K, V> next = it.next();
                if (this.f29960d.apply(next) && !collection.contains(next.getValue())) {
                    it.remove();
                    z10 = true;
                }
            }
            return z10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public Object[] toArray() {
            return Lists.newArrayList(iterator()).toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) Lists.newArrayList(iterator()).toArray(tArr);
        }
    }

    static abstract class IteratorBasedAbstractMap<K, V> extends AbstractMap<K, V> {
        IteratorBasedAbstractMap() {
        }

        abstract Iterator a();

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            Iterators.b(a());
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public Set<Map.Entry<K, V>> entrySet() {
            return new EntrySet<K, V>() { // from class: com.google.common.collect.Maps.IteratorBasedAbstractMap.1
                @Override // com.google.common.collect.Maps.EntrySet
                Map e() {
                    return IteratorBasedAbstractMap.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Map.Entry<K, V>> iterator() {
                    return IteratorBasedAbstractMap.this.a();
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        public abstract int size();
    }

    static class KeySet<K, V> extends Sets.ImprovedAbstractSet<K> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map f29962b;

        KeySet(Map map) {
            this.f29962b = (Map) Preconditions.checkNotNull(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            f().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return f().containsKey(obj);
        }

        /* JADX INFO: renamed from: e */
        Map f() {
            return this.f29962b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return f().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return Maps.w(f().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (!contains(obj)) {
                return false;
            }
            f().remove(obj);
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return f().size();
        }
    }

    static class MapDifferenceImpl<K, V> implements MapDifference<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Map f29963a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map f29964b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Map f29965c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Map f29966d;

        MapDifferenceImpl(Map map, Map map2, Map map3, Map map4) {
            this.f29963a = Maps.O(map);
            this.f29964b = Maps.O(map2);
            this.f29965c = Maps.O(map3);
            this.f29966d = Maps.O(map4);
        }

        @Override // com.google.common.collect.MapDifference
        public boolean areEqual() {
            return this.f29963a.isEmpty() && this.f29964b.isEmpty() && this.f29966d.isEmpty();
        }

        @Override // com.google.common.collect.MapDifference
        public Map<K, MapDifference.ValueDifference<V>> entriesDiffering() {
            return this.f29966d;
        }

        @Override // com.google.common.collect.MapDifference
        public Map<K, V> entriesInCommon() {
            return this.f29965c;
        }

        @Override // com.google.common.collect.MapDifference
        public Map<K, V> entriesOnlyOnLeft() {
            return this.f29963a;
        }

        @Override // com.google.common.collect.MapDifference
        public Map<K, V> entriesOnlyOnRight() {
            return this.f29964b;
        }

        @Override // com.google.common.collect.MapDifference
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof MapDifference) {
                MapDifference mapDifference = (MapDifference) obj;
                if (entriesOnlyOnLeft().equals(mapDifference.entriesOnlyOnLeft()) && entriesOnlyOnRight().equals(mapDifference.entriesOnlyOnRight()) && entriesInCommon().equals(mapDifference.entriesInCommon()) && entriesDiffering().equals(mapDifference.entriesDiffering())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.MapDifference
        public int hashCode() {
            return Objects.hashCode(entriesOnlyOnLeft(), entriesOnlyOnRight(), entriesInCommon(), entriesDiffering());
        }

        public String toString() {
            if (areEqual()) {
                return "equal";
            }
            StringBuilder sb2 = new StringBuilder("not equal");
            if (!this.f29963a.isEmpty()) {
                sb2.append(": only on left=");
                sb2.append(this.f29963a);
            }
            if (!this.f29964b.isEmpty()) {
                sb2.append(": only on right=");
                sb2.append(this.f29964b);
            }
            if (!this.f29966d.isEmpty()) {
                sb2.append(": value differences=");
                sb2.append(this.f29966d);
            }
            return sb2.toString();
        }
    }

    @GwtIncompatible
    private static final class NavigableAsMapView<K, V> extends AbstractNavigableMap<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final NavigableSet f29967b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Function f29968c;

        NavigableAsMapView(NavigableSet navigableSet, Function function) {
            this.f29967b = (NavigableSet) Preconditions.checkNotNull(navigableSet);
            this.f29968c = (Function) Preconditions.checkNotNull(function);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        Iterator a() {
            return Maps.i(this.f29967b, this.f29968c);
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        Iterator b() {
            return descendingMap().entrySet().iterator();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f29967b.clear();
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return this.f29967b.comparator();
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            return Maps.asMap(this.f29967b.descendingSet(), this.f29968c);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            if (Collections2.f(this.f29967b, obj)) {
                return (V) this.f29968c.apply(obj);
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@ParametricNullness K k10, boolean z10) {
            return Maps.asMap(this.f29967b.headSet(k10, z10), this.f29968c);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return Maps.C(this.f29967b);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f29967b.size();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@ParametricNullness K k10, boolean z10, @ParametricNullness K k11, boolean z11) {
            return Maps.asMap(this.f29967b.subSet(k10, z10, k11, z11), this.f29968c);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@ParametricNullness K k10, boolean z10) {
            return Maps.asMap(this.f29967b.tailSet(k10, z10), this.f29968c);
        }
    }

    @GwtIncompatible
    static class NavigableKeySet<K, V> extends SortedKeySet<K, V> implements NavigableSet<K> {
        NavigableKeySet(NavigableMap navigableMap) {
            super(navigableMap);
        }

        @Override // java.util.NavigableSet
        public K ceiling(@ParametricNullness K k10) {
            return (K) e().ceilingKey(k10);
        }

        @Override // java.util.NavigableSet
        public Iterator<K> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> descendingSet() {
            return e().descendingKeySet();
        }

        @Override // java.util.NavigableSet
        public K floor(@ParametricNullness K k10) {
            return (K) e().floorKey(k10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.SortedKeySet
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableMap f() {
            return (NavigableMap) this.f29962b;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> headSet(@ParametricNullness K k10, boolean z10) {
            return e().headMap(k10, z10).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public K higher(@ParametricNullness K k10) {
            return (K) e().higherKey(k10);
        }

        @Override // java.util.NavigableSet
        public K lower(@ParametricNullness K k10) {
            return (K) e().lowerKey(k10);
        }

        @Override // java.util.NavigableSet
        public K pollFirst() {
            return (K) Maps.x(e().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public K pollLast() {
            return (K) Maps.x(e().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> subSet(@ParametricNullness K k10, boolean z10, @ParametricNullness K k11, boolean z11) {
            return e().subMap(k10, z10, k11, z11).navigableKeySet();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<K> tailSet(@ParametricNullness K k10, boolean z10) {
            return e().tailMap(k10, z10).navigableKeySet();
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> headSet(@ParametricNullness K k10) {
            return headSet(k10, false);
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> subSet(@ParametricNullness K k10, @ParametricNullness K k11) {
            return subSet(k10, true, k11, false);
        }

        @Override // com.google.common.collect.Maps.SortedKeySet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<K> tailSet(@ParametricNullness K k10) {
            return tailSet(k10, true);
        }
    }

    private static class SortedAsMapView<K, V> extends AsMapView<K, V> implements SortedMap<K, V> {
        SortedAsMapView(SortedSet sortedSet, Function function) {
            super(sortedSet, function);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.AsMapView
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public SortedSet b() {
            return (SortedSet) super.b();
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K firstKey() {
            return (K) b().first();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> headMap(@ParametricNullness K k10) {
            return Maps.asMap(b().headSet(k10), this.f29937f);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return Maps.E(b());
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K lastKey() {
            return (K) b().last();
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> subMap(@ParametricNullness K k10, @ParametricNullness K k11) {
            return Maps.asMap(b().subSet(k10, k11), this.f29937f);
        }

        @Override // java.util.SortedMap
        public SortedMap<K, V> tailMap(@ParametricNullness K k10) {
            return Maps.asMap(b().tailSet(k10), this.f29937f);
        }
    }

    static class SortedKeySet<K, V> extends KeySet<K, V> implements SortedSet<K> {
        SortedKeySet(SortedMap sortedMap) {
            super(sortedMap);
        }

        @Override // java.util.SortedSet
        public Comparator<? super K> comparator() {
            return f().comparator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.KeySet
        public SortedMap f() {
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

    static class SortedMapDifferenceImpl<K, V> extends MapDifferenceImpl<K, V> implements SortedMapDifference<K, V> {
        SortedMapDifferenceImpl(SortedMap sortedMap, SortedMap sortedMap2, SortedMap sortedMap3, SortedMap sortedMap4) {
            super(sortedMap, sortedMap2, sortedMap3, sortedMap4);
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public SortedMap<K, MapDifference.ValueDifference<V>> entriesDiffering() {
            return (SortedMap) super.entriesDiffering();
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public SortedMap<K, V> entriesInCommon() {
            return (SortedMap) super.entriesInCommon();
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public SortedMap<K, V> entriesOnlyOnLeft() {
            return (SortedMap) super.entriesOnlyOnLeft();
        }

        @Override // com.google.common.collect.Maps.MapDifferenceImpl, com.google.common.collect.MapDifference
        public SortedMap<K, V> entriesOnlyOnRight() {
            return (SortedMap) super.entriesOnlyOnRight();
        }
    }

    static class TransformedEntriesMap<K, V1, V2> extends IteratorBasedAbstractMap<K, V2> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map f29969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final EntryTransformer f29970c;

        TransformedEntriesMap(Map map, EntryTransformer entryTransformer) {
            this.f29969b = (Map) Preconditions.checkNotNull(map);
            this.f29970c = (EntryTransformer) Preconditions.checkNotNull(entryTransformer);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        Iterator a() {
            return Iterators.transform(this.f29969b.entrySet().iterator(), Maps.f(this.f29970c));
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f29969b.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f29969b.containsKey(obj);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractMap, java.util.Map
        public V2 get(Object obj) {
            Object obj2 = this.f29969b.get(obj);
            if (obj2 != null || this.f29969b.containsKey(obj)) {
                return (V2) this.f29970c.transformEntry(obj, NullnessCasts.a(obj2));
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f29969b.keySet();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractMap, java.util.Map
        public V2 remove(Object obj) {
            if (this.f29969b.containsKey(obj)) {
                return (V2) this.f29970c.transformEntry(obj, NullnessCasts.a(this.f29969b.remove(obj)));
            }
            return null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f29969b.size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V2> values() {
            return new Values(this);
        }
    }

    @GwtIncompatible
    private static class TransformedEntriesNavigableMap<K, V1, V2> extends TransformedEntriesSortedMap<K, V1, V2> implements NavigableMap<K, V2> {
        TransformedEntriesNavigableMap(NavigableMap navigableMap, EntryTransformer entryTransformer) {
            super(navigableMap, entryTransformer);
        }

        private Map.Entry d(Map.Entry entry) {
            if (entry == null) {
                return null;
            }
            return Maps.J(this.f29970c, entry);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public NavigableMap b() {
            return (NavigableMap) super.b();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> ceilingEntry(@ParametricNullness K k10) {
            return d(b().ceilingEntry(k10));
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(@ParametricNullness K k10) {
            return (K) b().ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return b().descendingKeySet();
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> descendingMap() {
            return Maps.transformEntries(b().descendingMap(), this.f29970c);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> firstEntry() {
            return d(b().firstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> floorEntry(@ParametricNullness K k10) {
            return d(b().floorEntry(k10));
        }

        @Override // java.util.NavigableMap
        public K floorKey(@ParametricNullness K k10) {
            return (K) b().floorKey(k10);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> higherEntry(@ParametricNullness K k10) {
            return d(b().higherEntry(k10));
        }

        @Override // java.util.NavigableMap
        public K higherKey(@ParametricNullness K k10) {
            return (K) b().higherKey(k10);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> lastEntry() {
            return d(b().lastEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> lowerEntry(@ParametricNullness K k10) {
            return d(b().lowerEntry(k10));
        }

        @Override // java.util.NavigableMap
        public K lowerKey(@ParametricNullness K k10) {
            return (K) b().lowerKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return b().navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> pollFirstEntry() {
            return d(b().pollFirstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V2> pollLastEntry() {
            return d(b().pollLastEntry());
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, V2> headMap(@ParametricNullness K k10) {
            return headMap(k10, false);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> subMap(@ParametricNullness K k10, boolean z10, @ParametricNullness K k11, boolean z11) {
            return Maps.transformEntries(b().subMap(k10, z10, k11, z11), this.f29970c);
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, V2> tailMap(@ParametricNullness K k10) {
            return tailMap(k10, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> headMap(@ParametricNullness K k10, boolean z10) {
            return Maps.transformEntries(b().headMap(k10, z10), this.f29970c);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V2> tailMap(@ParametricNullness K k10, boolean z10) {
            return Maps.transformEntries(b().tailMap(k10, z10), this.f29970c);
        }

        @Override // com.google.common.collect.Maps.TransformedEntriesSortedMap, java.util.SortedMap, java.util.NavigableMap
        public NavigableMap<K, V2> subMap(@ParametricNullness K k10, @ParametricNullness K k11) {
            return subMap(k10, true, k11, false);
        }
    }

    static class TransformedEntriesSortedMap<K, V1, V2> extends TransformedEntriesMap<K, V1, V2> implements SortedMap<K, V2> {
        TransformedEntriesSortedMap(SortedMap sortedMap, EntryTransformer entryTransformer) {
            super(sortedMap, entryTransformer);
        }

        protected SortedMap b() {
            return (SortedMap) this.f29969b;
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            return b().comparator();
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K firstKey() {
            return (K) b().firstKey();
        }

        public SortedMap<K, V2> headMap(@ParametricNullness K k10) {
            return Maps.transformEntries(b().headMap(k10), this.f29970c);
        }

        @Override // java.util.SortedMap
        @ParametricNullness
        public K lastKey() {
            return (K) b().lastKey();
        }

        public SortedMap<K, V2> subMap(@ParametricNullness K k10, @ParametricNullness K k11) {
            return Maps.transformEntries(b().subMap(k10, k11), this.f29970c);
        }

        public SortedMap<K, V2> tailMap(@ParametricNullness K k10) {
            return Maps.transformEntries(b().tailMap(k10), this.f29970c);
        }
    }

    private static class UnmodifiableBiMap<K, V> extends ForwardingMap<K, V> implements BiMap<K, V>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map f29971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final BiMap f29972c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        BiMap f29973d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        transient Set f29974e;

        UnmodifiableBiMap(BiMap biMap, BiMap biMap2) {
            this.f29971b = DesugarCollections.unmodifiableMap(biMap);
            this.f29972c = biMap;
            this.f29973d = biMap2;
        }

        @Override // com.google.common.collect.BiMap
        public V forcePut(@ParametricNullness K k10, @ParametricNullness V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<V, K> inverse() {
            BiMap<V, K> biMap = this.f29973d;
            if (biMap != null) {
                return biMap;
            }
            UnmodifiableBiMap unmodifiableBiMap = new UnmodifiableBiMap(this.f29972c.inverse(), this);
            this.f29973d = unmodifiableBiMap;
            return unmodifiableBiMap;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: delegate */
        public Map n() {
            return this.f29971b;
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map, com.google.common.collect.BiMap
        public Set<V> values() {
            Set<V> set = this.f29974e;
            if (set != null) {
                return set;
            }
            Set<V> setUnmodifiableSet = DesugarCollections.unmodifiableSet(this.f29972c.values());
            this.f29974e = setUnmodifiableSet;
            return setUnmodifiableSet;
        }
    }

    static class UnmodifiableEntries<K, V> extends ForwardingCollection<Map.Entry<K, V>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Collection f29975b;

        UnmodifiableEntries(Collection collection) {
            this.f29975b = collection;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: g */
        public Collection n() {
            return this.f29975b;
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return Maps.M(this.f29975b.iterator());
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return l();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) m(tArr);
        }
    }

    static class UnmodifiableEntrySet<K, V> extends UnmodifiableEntries<K, V> implements Set<Map.Entry<K, V>> {
        UnmodifiableEntrySet(Set set) {
            super(set);
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

    @GwtIncompatible
    static class UnmodifiableNavigableMap<K, V> extends ForwardingSortedMap<K, V> implements NavigableMap<K, V>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final NavigableMap f29976b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private transient UnmodifiableNavigableMap f29977c;

        UnmodifiableNavigableMap(NavigableMap navigableMap) {
            this.f29976b = navigableMap;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(@ParametricNullness K k10) {
            return Maps.P(this.f29976b.ceilingEntry(k10));
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(@ParametricNullness K k10) {
            return (K) this.f29976b.ceilingKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            return Sets.unmodifiableNavigableSet(this.f29976b.descendingKeySet());
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            UnmodifiableNavigableMap unmodifiableNavigableMap = this.f29977c;
            if (unmodifiableNavigableMap != null) {
                return unmodifiableNavigableMap;
            }
            UnmodifiableNavigableMap unmodifiableNavigableMap2 = new UnmodifiableNavigableMap(this.f29976b.descendingMap(), this);
            this.f29977c = unmodifiableNavigableMap2;
            return unmodifiableNavigableMap2;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
            return Maps.P(this.f29976b.firstEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(@ParametricNullness K k10) {
            return Maps.P(this.f29976b.floorEntry(k10));
        }

        @Override // java.util.NavigableMap
        public K floorKey(@ParametricNullness K k10) {
            return (K) this.f29976b.floorKey(k10);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSortedMap, com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public SortedMap n() {
            return DesugarCollections.unmodifiableSortedMap(this.f29976b);
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public SortedMap<K, V> headMap(@ParametricNullness K k10) {
            return headMap(k10, false);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(@ParametricNullness K k10) {
            return Maps.P(this.f29976b.higherEntry(k10));
        }

        @Override // java.util.NavigableMap
        public K higherKey(@ParametricNullness K k10) {
            return (K) this.f29976b.higherKey(k10);
        }

        @Override // com.google.common.collect.ForwardingMap, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            return Maps.P(this.f29976b.lastEntry());
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(@ParametricNullness K k10) {
            return Maps.P(this.f29976b.lowerEntry(k10));
        }

        @Override // java.util.NavigableMap
        public K lowerKey(@ParametricNullness K k10) {
            return (K) this.f29976b.lowerKey(k10);
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            return Sets.unmodifiableNavigableSet(this.f29976b.navigableKeySet());
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, V> pollFirstEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableMap
        public final Map.Entry<K, V> pollLastEntry() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public SortedMap<K, V> subMap(@ParametricNullness K k10, @ParametricNullness K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // com.google.common.collect.ForwardingSortedMap, java.util.SortedMap
        public SortedMap<K, V> tailMap(@ParametricNullness K k10) {
            return tailMap(k10, true);
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(@ParametricNullness K k10, boolean z10) {
            return Maps.unmodifiableNavigableMap(this.f29976b.headMap(k10, z10));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(@ParametricNullness K k10, boolean z10, @ParametricNullness K k11, boolean z11) {
            return Maps.unmodifiableNavigableMap(this.f29976b.subMap(k10, z10, k11, z11));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(@ParametricNullness K k10, boolean z10) {
            return Maps.unmodifiableNavigableMap(this.f29976b.tailMap(k10, z10));
        }

        UnmodifiableNavigableMap(NavigableMap navigableMap, UnmodifiableNavigableMap unmodifiableNavigableMap) {
            this.f29976b = navigableMap;
            this.f29977c = unmodifiableNavigableMap;
        }
    }

    static class ValueDifferenceImpl<V> implements MapDifference.ValueDifference<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f29978a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f29979b;

        private ValueDifferenceImpl(Object obj, Object obj2) {
            this.f29978a = obj;
            this.f29979b = obj2;
        }

        static MapDifference.ValueDifference a(Object obj, Object obj2) {
            return new ValueDifferenceImpl(obj, obj2);
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public boolean equals(Object obj) {
            if (obj instanceof MapDifference.ValueDifference) {
                MapDifference.ValueDifference valueDifference = (MapDifference.ValueDifference) obj;
                if (Objects.equal(this.f29978a, valueDifference.leftValue()) && Objects.equal(this.f29979b, valueDifference.rightValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        public int hashCode() {
            return Objects.hashCode(this.f29978a, this.f29979b);
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        @ParametricNullness
        public V leftValue() {
            return (V) this.f29978a;
        }

        @Override // com.google.common.collect.MapDifference.ValueDifference
        @ParametricNullness
        public V rightValue() {
            return (V) this.f29979b;
        }

        public String toString() {
            return "(" + this.f29978a + ", " + this.f29979b + ")";
        }
    }

    static class Values<K, V> extends AbstractCollection<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Map f29980b;

        Values(Map map) {
            this.f29980b = (Map) Preconditions.checkNotNull(map);
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return e().containsValue(obj);
        }

        final Map e() {
            return this.f29980b;
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean isEmpty() {
            return e().isEmpty();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return Maps.R(e().entrySet().iterator());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            try {
                return super.remove(obj);
            } catch (UnsupportedOperationException unused) {
                for (Map.Entry<K, V> entry : e().entrySet()) {
                    if (Objects.equal(obj, entry.getValue())) {
                        e().remove(entry.getKey());
                        return true;
                    }
                }
                return false;
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            try {
                return super.removeAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetNewHashSet = Sets.newHashSet();
                for (Map.Entry<K, V> entry : e().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetNewHashSet.add(entry.getKey());
                    }
                }
                return e().keySet().removeAll(hashSetNewHashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            try {
                return super.retainAll((Collection) Preconditions.checkNotNull(collection));
            } catch (UnsupportedOperationException unused) {
                HashSet hashSetNewHashSet = Sets.newHashSet();
                for (Map.Entry<K, V> entry : e().entrySet()) {
                    if (collection.contains(entry.getValue())) {
                        hashSetNewHashSet.add(entry.getKey());
                    }
                }
                return e().keySet().retainAll(hashSetNewHashSet);
            }
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return e().size();
        }
    }

    @GwtCompatible
    static abstract class ViewCachingAbstractMap<K, V> extends AbstractMap<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private transient Set f29981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private transient Set f29982c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private transient Collection f29983d;

        ViewCachingAbstractMap() {
        }

        Collection a() {
            return new Values(this);
        }

        abstract Set createEntrySet();

        Set createKeySet() {
            return new KeySet(this);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set = this.f29981b;
            if (set != null) {
                return set;
            }
            Set<Map.Entry<K, V>> setCreateEntrySet = createEntrySet();
            this.f29981b = setCreateEntrySet;
            return setCreateEntrySet;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            Set<K> set = this.f29982c;
            if (set != null) {
                return set;
            }
            Set<K> setCreateKeySet = createKeySet();
            this.f29982c = setCreateKeySet;
            return setCreateKeySet;
        }

        @Override // java.util.AbstractMap, java.util.Map, com.google.common.collect.BiMap
        public Collection<V> values() {
            Collection<V> collection = this.f29983d;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionA = a();
            this.f29983d = collectionA;
            return collectionA;
        }
    }

    static void A(Map map, Map map2) {
        for (Map.Entry entry : map2.entrySet()) {
            map.put(entry.getKey(), entry.getValue());
        }
    }

    static boolean B(Collection collection, Object obj) {
        if (obj instanceof Map.Entry) {
            return collection.remove(L((Map.Entry) obj));
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static NavigableSet C(final NavigableSet navigableSet) {
        return new ForwardingNavigableSet<Object>() { // from class: com.google.common.collect.Maps.6
            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
            public boolean add(@ParametricNullness Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
            public boolean addAll(Collection<Object> collection) {
                throw new UnsupportedOperationException();
            }

            @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
            public NavigableSet<Object> descendingSet() {
                return Maps.C(super.descendingSet());
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public SortedSet<Object> headSet(@ParametricNullness Object obj) {
                return Maps.E(super.headSet(obj));
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet
            /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
            public NavigableSet n() {
                return navigableSet;
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public SortedSet<Object> subSet(@ParametricNullness Object obj, @ParametricNullness Object obj2) {
                return Maps.E(super.subSet(obj, obj2));
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public SortedSet<Object> tailSet(@ParametricNullness Object obj) {
                return Maps.E(super.tailSet(obj));
            }

            @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
            public NavigableSet<Object> headSet(@ParametricNullness Object obj, boolean z10) {
                return Maps.C(super.headSet(obj, z10));
            }

            @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
            public NavigableSet<Object> subSet(@ParametricNullness Object obj, boolean z10, @ParametricNullness Object obj2, boolean z11) {
                return Maps.C(super.subSet(obj, z10, obj2, z11));
            }

            @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
            public NavigableSet<Object> tailSet(@ParametricNullness Object obj, boolean z10) {
                return Maps.C(super.tailSet(obj, z10));
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Set D(final Set set) {
        return new ForwardingSet<Object>() { // from class: com.google.common.collect.Maps.4
            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
            public boolean add(@ParametricNullness Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
            public boolean addAll(Collection<Object> collection) {
                throw new UnsupportedOperationException();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
            public Set n() {
                return set;
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SortedSet E(final SortedSet sortedSet) {
        return new ForwardingSortedSet<Object>() { // from class: com.google.common.collect.Maps.5
            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
            public boolean add(@ParametricNullness Object obj) {
                throw new UnsupportedOperationException();
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
            public boolean addAll(Collection<Object> collection) {
                throw new UnsupportedOperationException();
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public SortedSet<Object> headSet(@ParametricNullness Object obj) {
                return Maps.E(super.headSet(obj));
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet
            /* JADX INFO: renamed from: q */
            public SortedSet n() {
                return sortedSet;
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public SortedSet<Object> subSet(@ParametricNullness Object obj, @ParametricNullness Object obj2) {
                return Maps.E(super.subSet(obj, obj2));
            }

            @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
            public SortedSet<Object> tailSet(@ParametricNullness Object obj) {
                return Maps.E(super.tailSet(obj));
            }
        };
    }

    static boolean F(Map map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.containsKey(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    static Object G(Map map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.get(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static Object H(Map map, Object obj) {
        Preconditions.checkNotNull(map);
        try {
            return map.remove(obj);
        } catch (ClassCastException | NullPointerException unused) {
            return null;
        }
    }

    static String I(Map map) {
        StringBuilder sbE = Collections2.e(map.size());
        sbE.append('{');
        boolean z10 = true;
        for (Map.Entry entry : map.entrySet()) {
            if (!z10) {
                sbE.append(", ");
            }
            sbE.append(entry.getKey());
            sbE.append(D5.T);
            sbE.append(entry.getValue());
            z10 = false;
        }
        sbE.append('}');
        return sbE.toString();
    }

    static Map.Entry J(final EntryTransformer entryTransformer, final Map.Entry entry) {
        Preconditions.checkNotNull(entryTransformer);
        Preconditions.checkNotNull(entry);
        return new AbstractMapEntry<Object, Object>() { // from class: com.google.common.collect.Maps.12
            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            @ParametricNullness
            public Object getKey() {
                return entry.getKey();
            }

            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            @ParametricNullness
            public Object getValue() {
                return entryTransformer.transformEntry(entry.getKey(), entry.getValue());
            }
        };
    }

    private static ImmutableMap K(Iterator it, Function function, ImmutableMap.Builder builder) {
        Preconditions.checkNotNull(function);
        while (it.hasNext()) {
            Object next = it.next();
            builder.put(function.apply(next), next);
        }
        try {
            return builder.buildOrThrow();
        } catch (IllegalArgumentException e10) {
            throw new IllegalArgumentException(e10.getMessage() + ". To index multiple values under a key, use Multimaps.index.");
        }
    }

    static Map.Entry L(final Map.Entry entry) {
        Preconditions.checkNotNull(entry);
        return new AbstractMapEntry<Object, Object>() { // from class: com.google.common.collect.Maps.7
            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            @ParametricNullness
            public Object getKey() {
                return entry.getKey();
            }

            @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
            @ParametricNullness
            public Object getValue() {
                return entry.getValue();
            }
        };
    }

    static UnmodifiableIterator M(final Iterator it) {
        return new UnmodifiableIterator<Map.Entry<Object, Object>>() { // from class: com.google.common.collect.Maps.8
            @Override // java.util.Iterator
            public boolean hasNext() {
                return it.hasNext();
            }

            @Override // java.util.Iterator
            public Map.Entry<Object, Object> next() {
                return Maps.L((Map.Entry) it.next());
            }
        };
    }

    static Set N(Set set) {
        return new UnmodifiableEntrySet(DesugarCollections.unmodifiableSet(set));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map O(Map map) {
        return map instanceof SortedMap ? DesugarCollections.unmodifiableSortedMap((SortedMap) map) : DesugarCollections.unmodifiableMap(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map.Entry P(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return L(entry);
    }

    static Function Q() {
        return EntryFunction.VALUE;
    }

    static Iterator R(Iterator it) {
        return new TransformedIterator<Map.Entry<Object, Object>, Object>(it) { // from class: com.google.common.collect.Maps.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.TransformedIterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object a(Map.Entry entry) {
                return entry.getValue();
            }
        };
    }

    static Object S(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getValue();
    }

    static Predicate T(Predicate predicate) {
        return Predicates.compose(predicate, Q());
    }

    public static <A, B> Converter<A, B> asConverter(BiMap<A, B> biMap) {
        return new BiMapConverter(biMap);
    }

    public static <K, V> Map<K, V> asMap(Set<K> set, Function<? super K, V> function) {
        return new AsMapView(set, function);
    }

    public static <K, V> MapDifference<K, V> difference(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2) {
        return map instanceof SortedMap ? difference((SortedMap) map, (Map) map2) : difference(map, map2, Equivalence.equals());
    }

    static Function f(final EntryTransformer entryTransformer) {
        Preconditions.checkNotNull(entryTransformer);
        return new Function<Map.Entry<Object, Object>, Map.Entry<Object, Object>>() { // from class: com.google.common.collect.Maps.13
            @Override // com.google.common.base.Function
            public Map.Entry<Object, Object> apply(Map.Entry<Object, Object> entry) {
                return Maps.J(entryTransformer, entry);
            }
        };
    }

    public static <K, V> Map<K, V> filterEntries(Map<K, V> map, Predicate<? super Map.Entry<K, V>> predicate) {
        Preconditions.checkNotNull(predicate);
        return map instanceof AbstractFilteredMap ? r((AbstractFilteredMap) map, predicate) : new FilteredEntryMap((Map) Preconditions.checkNotNull(map), predicate);
    }

    public static <K, V> Map<K, V> filterKeys(Map<K, V> map, Predicate<? super K> predicate) {
        Preconditions.checkNotNull(predicate);
        Predicate predicateY = y(predicate);
        return map instanceof AbstractFilteredMap ? r((AbstractFilteredMap) map, predicateY) : new FilteredKeyMap((Map) Preconditions.checkNotNull(map), predicate, predicateY);
    }

    public static <K, V> Map<K, V> filterValues(Map<K, V> map, Predicate<? super V> predicate) {
        return filterEntries(map, T(predicate));
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static ImmutableMap<String, String> fromProperties(Properties properties) {
        ImmutableMap.Builder builder = ImmutableMap.builder();
        Enumeration<?> enumerationPropertyNames = properties.propertyNames();
        while (enumerationPropertyNames.hasMoreElements()) {
            Object objNextElement = enumerationPropertyNames.nextElement();
            j$.util.Objects.requireNonNull(objNextElement);
            String str = (String) objNextElement;
            String property = properties.getProperty(str);
            j$.util.Objects.requireNonNull(property);
            builder.put(str, property);
        }
        return builder.buildOrThrow();
    }

    static Function g(final EntryTransformer entryTransformer) {
        Preconditions.checkNotNull(entryTransformer);
        return new Function<Map.Entry<Object, Object>, Object>() { // from class: com.google.common.collect.Maps.11
            @Override // com.google.common.base.Function
            @ParametricNullness
            public Object apply(Map.Entry<Object, Object> entry) {
                return entryTransformer.transformEntry(entry.getKey(), entry.getValue());
            }
        };
    }

    static EntryTransformer h(final Function function) {
        Preconditions.checkNotNull(function);
        return new EntryTransformer<Object, Object, Object>() { // from class: com.google.common.collect.Maps.9
            @Override // com.google.common.collect.Maps.EntryTransformer
            @ParametricNullness
            public Object transformEntry(@ParametricNullness Object obj, @ParametricNullness Object obj2) {
                return function.apply(obj2);
            }
        };
    }

    static Iterator i(Set set, final Function function) {
        return new TransformedIterator<Object, Map.Entry<Object, Object>>(set.iterator()) { // from class: com.google.common.collect.Maps.3
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.TransformedIterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry a(Object obj) {
                return Maps.immutableEntry(obj, function.apply(obj));
            }
        };
    }

    @GwtCompatible(serializable = true)
    public static <K, V> Map.Entry<K, V> immutableEntry(@ParametricNullness K k10, @ParametricNullness V v10) {
        return new ImmutableEntry(k10, v10);
    }

    @GwtCompatible(serializable = true)
    public static <K extends Enum<K>, V> ImmutableMap<K, V> immutableEnumMap(Map<K, ? extends V> map) {
        if (map instanceof ImmutableEnumMap) {
            return (ImmutableEnumMap) map;
        }
        Iterator<Map.Entry<K, ? extends V>> it = map.entrySet().iterator();
        if (!it.hasNext()) {
            return ImmutableMap.of();
        }
        Map.Entry<K, ? extends V> next = it.next();
        K key = next.getKey();
        V value = next.getValue();
        CollectPreconditions.a(key, value);
        EnumMap enumMap = new EnumMap(Collections.singletonMap(key, value));
        while (it.hasNext()) {
            Map.Entry<K, ? extends V> next2 = it.next();
            K key2 = next2.getKey();
            V value2 = next2.getValue();
            CollectPreconditions.a(key2, value2);
            enumMap.put((Enum) key2, (Object) value2);
        }
        return ImmutableEnumMap.n(enumMap);
    }

    static Function j(final EntryTransformer entryTransformer, final Object obj) {
        Preconditions.checkNotNull(entryTransformer);
        return new Function<Object, Object>() { // from class: com.google.common.collect.Maps.10
            @Override // com.google.common.base.Function
            @ParametricNullness
            public Object apply(@ParametricNullness Object obj2) {
                return entryTransformer.transformEntry(obj, obj2);
            }
        };
    }

    static int k(int i10) {
        if (i10 < 3) {
            CollectPreconditions.b(i10, "expectedSize");
            return i10 + 1;
        }
        if (i10 < 1073741824) {
            return (int) Math.ceil(((double) i10) / 0.75d);
        }
        return Integer.MAX_VALUE;
    }

    static boolean l(Collection collection, Object obj) {
        if (obj instanceof Map.Entry) {
            return collection.contains(L((Map.Entry) obj));
        }
        return false;
    }

    static boolean m(Map map, Object obj) {
        return Iterators.contains(w(map.entrySet().iterator()), obj);
    }

    static boolean n(Map map, Object obj) {
        return Iterators.contains(R(map.entrySet().iterator()), obj);
    }

    public static <K, V> ConcurrentMap<K, V> newConcurrentMap() {
        return new ConcurrentHashMap();
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> newEnumMap(Class<K> cls) {
        return new EnumMap<>((Class) Preconditions.checkNotNull(cls));
    }

    public static <K, V> HashMap<K, V> newHashMap() {
        return new HashMap<>();
    }

    public static <K, V> HashMap<K, V> newHashMapWithExpectedSize(int i10) {
        return new HashMap<>(k(i10));
    }

    public static <K, V> IdentityHashMap<K, V> newIdentityHashMap() {
        return new IdentityHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap() {
        return new LinkedHashMap<>();
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMapWithExpectedSize(int i10) {
        return new LinkedHashMap<>(k(i10));
    }

    public static <K extends Comparable, V> TreeMap<K, V> newTreeMap() {
        return new TreeMap<>();
    }

    private static void o(Map map, Map map2, Equivalence equivalence, Map map3, Map map4, Map map5, Map map6) {
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (map2.containsKey(key)) {
                Object objA = NullnessCasts.a(map4.remove(key));
                if (equivalence.equivalent(value, objA)) {
                    map5.put(key, value);
                } else {
                    map6.put(key, ValueDifferenceImpl.a(value, objA));
                }
            } else {
                map3.put(key, value);
            }
        }
    }

    static boolean p(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    private static BiMap q(FilteredEntryBiMap filteredEntryBiMap, Predicate predicate) {
        return new FilteredEntryBiMap(filteredEntryBiMap.f(), Predicates.and(filteredEntryBiMap.f29935f, predicate));
    }

    private static Map r(AbstractFilteredMap abstractFilteredMap, Predicate predicate) {
        return new FilteredEntryMap(abstractFilteredMap.f29934e, Predicates.and(abstractFilteredMap.f29935f, predicate));
    }

    private static NavigableMap s(FilteredEntryNavigableMap filteredEntryNavigableMap, Predicate predicate) {
        return new FilteredEntryNavigableMap(filteredEntryNavigableMap.f29953b, Predicates.and(filteredEntryNavigableMap.f29954c, predicate));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    public static <K extends Comparable<? super K>, V> NavigableMap<K, V> subMap(NavigableMap<K, V> navigableMap, Range<K> range) {
        if (navigableMap.comparator() != null && navigableMap.comparator() != Ordering.natural() && range.hasLowerBound() && range.hasUpperBound()) {
            Preconditions.checkArgument(navigableMap.comparator().compare(range.lowerEndpoint(), range.upperEndpoint()) <= 0, "map is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (range.hasLowerBound() && range.hasUpperBound()) {
            Comparable comparableLowerEndpoint = range.lowerEndpoint();
            BoundType boundTypeLowerBoundType = range.lowerBoundType();
            BoundType boundType = BoundType.CLOSED;
            return navigableMap.subMap(comparableLowerEndpoint, boundTypeLowerBoundType == boundType, range.upperEndpoint(), range.upperBoundType() == boundType);
        }
        if (range.hasLowerBound()) {
            return navigableMap.tailMap(range.lowerEndpoint(), range.lowerBoundType() == BoundType.CLOSED);
        }
        if (range.hasUpperBound()) {
            return navigableMap.headMap(range.upperEndpoint(), range.upperBoundType() == BoundType.CLOSED);
        }
        return (NavigableMap) Preconditions.checkNotNull(navigableMap);
    }

    @J2ktIncompatible
    public static <K, V> BiMap<K, V> synchronizedBiMap(BiMap<K, V> biMap) {
        return Synchronized.g(biMap, null);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> synchronizedNavigableMap(NavigableMap<K, V> navigableMap) {
        return Synchronized.o(navigableMap);
    }

    private static SortedMap t(FilteredEntrySortedMap filteredEntrySortedMap, Predicate predicate) {
        return new FilteredEntrySortedMap(filteredEntrySortedMap.f(), Predicates.and(filteredEntrySortedMap.f29935f, predicate));
    }

    @IgnoreJRERequirement
    public static <T, K extends Enum<K>, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableEnumMap(java.util.function.Function<? super T, ? extends K> function, java.util.function.Function<? super T, ? extends V> function2) {
        return CollectCollectors.H(function, function2);
    }

    public static <K, V> ImmutableMap<K, V> toMap(Iterable<K> iterable, Function<? super K, V> function) {
        return toMap(iterable.iterator(), function);
    }

    public static <K, V1, V2> Map<K, V2> transformEntries(Map<K, V1> map, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new TransformedEntriesMap(map, entryTransformer);
    }

    public static <K, V1, V2> Map<K, V2> transformValues(Map<K, V1> map, Function<? super V1, V2> function) {
        return transformEntries(map, h(function));
    }

    static ImmutableMap u(Collection collection) {
        ImmutableMap.Builder builder = new ImmutableMap.Builder(collection.size());
        Iterator it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            builder.put(it.next(), Integer.valueOf(i10));
            i10++;
        }
        return builder.buildOrThrow();
    }

    @CanIgnoreReturnValue
    public static <K, V> ImmutableMap<K, V> uniqueIndex(Iterable<V> iterable, Function<? super V, K> function) {
        return iterable instanceof Collection ? K(iterable.iterator(), function, ImmutableMap.builderWithExpectedSize(((Collection) iterable).size())) : uniqueIndex(iterable.iterator(), function);
    }

    public static <K, V> BiMap<K, V> unmodifiableBiMap(BiMap<? extends K, ? extends V> biMap) {
        return new UnmodifiableBiMap(biMap, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> unmodifiableNavigableMap(NavigableMap<K, ? extends V> navigableMap) {
        Preconditions.checkNotNull(navigableMap);
        return navigableMap instanceof UnmodifiableNavigableMap ? navigableMap : new UnmodifiableNavigableMap(navigableMap);
    }

    static Function v() {
        return EntryFunction.KEY;
    }

    static Iterator w(Iterator it) {
        return new TransformedIterator<Map.Entry<Object, Object>, Object>(it) { // from class: com.google.common.collect.Maps.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.TransformedIterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object a(Map.Entry entry) {
                return entry.getKey();
            }
        };
    }

    static Object x(Map.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getKey();
    }

    static Predicate y(Predicate predicate) {
        return Predicates.compose(predicate, v());
    }

    static Comparator z(Comparator comparator) {
        return comparator != null ? comparator : Ordering.natural();
    }

    public static <K, V> SortedMap<K, V> asMap(SortedSet<K> sortedSet, Function<? super K, V> function) {
        return new SortedAsMapView(sortedSet, function);
    }

    public static <K, V> SortedMap<K, V> filterValues(SortedMap<K, V> sortedMap, Predicate<? super V> predicate) {
        return filterEntries((SortedMap) sortedMap, T(predicate));
    }

    public static <K extends Enum<K>, V> EnumMap<K, V> newEnumMap(Map<K, ? extends V> map) {
        return new EnumMap<>(map);
    }

    public static <K, V> HashMap<K, V> newHashMap(Map<? extends K, ? extends V> map) {
        return new HashMap<>(map);
    }

    public static <K, V> LinkedHashMap<K, V> newLinkedHashMap(Map<? extends K, ? extends V> map) {
        return new LinkedHashMap<>(map);
    }

    public static <K, V> TreeMap<K, V> newTreeMap(SortedMap<K, ? extends V> sortedMap) {
        return new TreeMap<>((SortedMap) sortedMap);
    }

    @IgnoreJRERequirement
    public static <T, K extends Enum<K>, V> Collector<T, ?, ImmutableMap<K, V>> toImmutableEnumMap(java.util.function.Function<? super T, ? extends K> function, java.util.function.Function<? super T, ? extends V> function2, BinaryOperator<V> binaryOperator) {
        return CollectCollectors.I(function, function2, binaryOperator);
    }

    public static <K, V> ImmutableMap<K, V> toMap(Iterator<K> it, Function<? super K, V> function) {
        Preconditions.checkNotNull(function);
        ImmutableMap.Builder builder = ImmutableMap.builder();
        while (it.hasNext()) {
            K next = it.next();
            builder.put(next, function.apply(next));
        }
        return builder.buildKeepingLast();
    }

    public static <K, V1, V2> SortedMap<K, V2> transformEntries(SortedMap<K, V1> sortedMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new TransformedEntriesSortedMap(sortedMap, entryTransformer);
    }

    public static <K, V1, V2> SortedMap<K, V2> transformValues(SortedMap<K, V1> sortedMap, Function<? super V1, V2> function) {
        return transformEntries((SortedMap) sortedMap, h(function));
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> asMap(NavigableSet<K> navigableSet, Function<? super K, V> function) {
        return new NavigableAsMapView(navigableSet, function);
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> filterValues(NavigableMap<K, V> navigableMap, Predicate<? super V> predicate) {
        return filterEntries((NavigableMap) navigableMap, T(predicate));
    }

    public static <C, K extends C, V> TreeMap<K, V> newTreeMap(Comparator<C> comparator) {
        return new TreeMap<>(comparator);
    }

    @GwtIncompatible
    public static <K, V1, V2> NavigableMap<K, V2> transformEntries(NavigableMap<K, V1> navigableMap, EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new TransformedEntriesNavigableMap(navigableMap, entryTransformer);
    }

    @GwtIncompatible
    public static <K, V1, V2> NavigableMap<K, V2> transformValues(NavigableMap<K, V1> navigableMap, Function<? super V1, V2> function) {
        return transformEntries((NavigableMap) navigableMap, h(function));
    }

    public static <K, V> BiMap<K, V> filterValues(BiMap<K, V> biMap, Predicate<? super V> predicate) {
        return filterEntries((BiMap) biMap, T(predicate));
    }

    public static <K, V> MapDifference<K, V> difference(Map<? extends K, ? extends V> map, Map<? extends K, ? extends V> map2, Equivalence<? super V> equivalence) {
        Preconditions.checkNotNull(equivalence);
        LinkedHashMap linkedHashMapNewLinkedHashMap = newLinkedHashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap(map2);
        LinkedHashMap linkedHashMapNewLinkedHashMap2 = newLinkedHashMap();
        LinkedHashMap linkedHashMapNewLinkedHashMap3 = newLinkedHashMap();
        o(map, map2, equivalence, linkedHashMapNewLinkedHashMap, linkedHashMap, linkedHashMapNewLinkedHashMap2, linkedHashMapNewLinkedHashMap3);
        return new MapDifferenceImpl(linkedHashMapNewLinkedHashMap, linkedHashMap, linkedHashMapNewLinkedHashMap2, linkedHashMapNewLinkedHashMap3);
    }

    public static <K, V> SortedMap<K, V> filterEntries(SortedMap<K, V> sortedMap, Predicate<? super Map.Entry<K, V>> predicate) {
        Preconditions.checkNotNull(predicate);
        if (sortedMap instanceof FilteredEntrySortedMap) {
            return t((FilteredEntrySortedMap) sortedMap, predicate);
        }
        return new FilteredEntrySortedMap((SortedMap) Preconditions.checkNotNull(sortedMap), predicate);
    }

    public static <K, V> SortedMap<K, V> filterKeys(SortedMap<K, V> sortedMap, Predicate<? super K> predicate) {
        return filterEntries((SortedMap) sortedMap, y(predicate));
    }

    @CanIgnoreReturnValue
    public static <K, V> ImmutableMap<K, V> uniqueIndex(Iterator<V> it, Function<? super V, K> function) {
        return K(it, function, ImmutableMap.builder());
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> filterKeys(NavigableMap<K, V> navigableMap, Predicate<? super K> predicate) {
        return filterEntries((NavigableMap) navigableMap, y(predicate));
    }

    public static <K, V> BiMap<K, V> filterKeys(BiMap<K, V> biMap, Predicate<? super K> predicate) {
        Preconditions.checkNotNull(predicate);
        return filterEntries((BiMap) biMap, y(predicate));
    }

    @GwtIncompatible
    public static <K, V> NavigableMap<K, V> filterEntries(NavigableMap<K, V> navigableMap, Predicate<? super Map.Entry<K, V>> predicate) {
        Preconditions.checkNotNull(predicate);
        if (navigableMap instanceof FilteredEntryNavigableMap) {
            return s((FilteredEntryNavigableMap) navigableMap, predicate);
        }
        return new FilteredEntryNavigableMap((NavigableMap) Preconditions.checkNotNull(navigableMap), predicate);
    }

    public static <K, V> SortedMapDifference<K, V> difference(SortedMap<K, ? extends V> sortedMap, Map<? extends K, ? extends V> map) {
        Preconditions.checkNotNull(sortedMap);
        Preconditions.checkNotNull(map);
        Comparator comparatorZ = z(sortedMap.comparator());
        TreeMap treeMapNewTreeMap = newTreeMap(comparatorZ);
        TreeMap treeMapNewTreeMap2 = newTreeMap(comparatorZ);
        treeMapNewTreeMap2.putAll(map);
        TreeMap treeMapNewTreeMap3 = newTreeMap(comparatorZ);
        TreeMap treeMapNewTreeMap4 = newTreeMap(comparatorZ);
        o(sortedMap, map, Equivalence.equals(), treeMapNewTreeMap, treeMapNewTreeMap2, treeMapNewTreeMap3, treeMapNewTreeMap4);
        return new SortedMapDifferenceImpl(treeMapNewTreeMap, treeMapNewTreeMap2, treeMapNewTreeMap3, treeMapNewTreeMap4);
    }

    public static <K, V> BiMap<K, V> filterEntries(BiMap<K, V> biMap, Predicate<? super Map.Entry<K, V>> predicate) {
        Preconditions.checkNotNull(biMap);
        Preconditions.checkNotNull(predicate);
        if (biMap instanceof FilteredEntryBiMap) {
            return q((FilteredEntryBiMap) biMap, predicate);
        }
        return new FilteredEntryBiMap(biMap, predicate);
    }
}
