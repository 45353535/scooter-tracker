package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
class FilteredEntryMultimap<K, V> extends AbstractMultimap<K, V> implements FilteredMultimap<K, V> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Multimap f29467g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Predicate f29468h;

    class AsMap extends Maps.ViewCachingAbstractMap<K, Collection<V>> {
        AsMap() {
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Collection a() {
            return new Maps.Values<K, Collection<V>>() { // from class: com.google.common.collect.FilteredEntryMultimap.AsMap.1ValuesImpl
                @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                public boolean remove(Object obj) {
                    if (!(obj instanceof Collection)) {
                        return false;
                    }
                    Collection collection = (Collection) obj;
                    Iterator<Map.Entry<K, Collection<V>>> it = FilteredEntryMultimap.this.f29467g.asMap().entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<K, Collection<V>> next = it.next();
                        Collection collectionN = FilteredEntryMultimap.n(next.getValue(), new ValuePredicate(next.getKey()));
                        if (!collectionN.isEmpty() && collection.equals(collectionN)) {
                            if (collectionN.size() == next.getValue().size()) {
                                it.remove();
                                return true;
                            }
                            collectionN.clear();
                            return true;
                        }
                    }
                    return false;
                }

                @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                public boolean removeAll(Collection<?> collection) {
                    return FilteredEntryMultimap.this.o(Maps.T(Predicates.in(collection)));
                }

                @Override // com.google.common.collect.Maps.Values, java.util.AbstractCollection, java.util.Collection
                public boolean retainAll(Collection<?> collection) {
                    return FilteredEntryMultimap.this.o(Maps.T(Predicates.not(Predicates.in(collection))));
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            FilteredEntryMultimap.this.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Set createEntrySet() {
            return new Maps.EntrySet<K, Collection<V>>() { // from class: com.google.common.collect.FilteredEntryMultimap.AsMap.1EntrySetImpl
                @Override // com.google.common.collect.Maps.EntrySet
                Map e() {
                    return AsMap.this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                    return new AbstractIterator<Map.Entry<K, Collection<V>>>() { // from class: com.google.common.collect.FilteredEntryMultimap.AsMap.1EntrySetImpl.1

                        /* JADX INFO: renamed from: d, reason: collision with root package name */
                        final Iterator f29471d;

                        {
                            this.f29471d = FilteredEntryMultimap.this.f29467g.asMap().entrySet().iterator();
                        }

                        /* JADX INFO: Access modifiers changed from: protected */
                        @Override // com.google.common.collect.AbstractIterator
                        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                        public Map.Entry computeNext() {
                            while (this.f29471d.hasNext()) {
                                Map.Entry entry = (Map.Entry) this.f29471d.next();
                                Object key = entry.getKey();
                                Collection collectionN = FilteredEntryMultimap.n((Collection) entry.getValue(), new ValuePredicate(key));
                                if (!collectionN.isEmpty()) {
                                    return Maps.immutableEntry(key, collectionN);
                                }
                            }
                            return (Map.Entry) a();
                        }
                    };
                }

                @Override // com.google.common.collect.Maps.EntrySet, com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean removeAll(Collection<?> collection) {
                    return FilteredEntryMultimap.this.o(Predicates.in(collection));
                }

                @Override // com.google.common.collect.Maps.EntrySet, com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> collection) {
                    return FilteredEntryMultimap.this.o(Predicates.not(Predicates.in(collection)));
                }

                @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return Iterators.size(iterator());
                }
            };
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        Set createKeySet() {
            return new Maps.KeySet<K, Collection<V>>() { // from class: com.google.common.collect.FilteredEntryMultimap.AsMap.1KeySetImpl
                @Override // com.google.common.collect.Maps.KeySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean remove(Object obj) {
                    return AsMap.this.remove(obj) != null;
                }

                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean removeAll(Collection<?> collection) {
                    return FilteredEntryMultimap.this.o(Maps.y(Predicates.in(collection)));
                }

                @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
                public boolean retainAll(Collection<?> collection) {
                    return FilteredEntryMultimap.this.o(Maps.y(Predicates.not(Predicates.in(collection))));
                }
            };
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> get(Object obj) {
            Collection<V> collection = FilteredEntryMultimap.this.f29467g.asMap().get(obj);
            if (collection == null) {
                return null;
            }
            Collection<V> collectionN = FilteredEntryMultimap.n(collection, new ValuePredicate(obj));
            if (collectionN.isEmpty()) {
                return null;
            }
            return collectionN;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> remove(Object obj) {
            Collection<V> collection = FilteredEntryMultimap.this.f29467g.asMap().get(obj);
            if (collection == null) {
                return null;
            }
            ArrayList arrayListNewArrayList = Lists.newArrayList();
            Iterator<V> it = collection.iterator();
            while (it.hasNext()) {
                V next = it.next();
                if (FilteredEntryMultimap.this.q(obj, next)) {
                    it.remove();
                    arrayListNewArrayList.add(next);
                }
            }
            if (arrayListNewArrayList.isEmpty()) {
                return null;
            }
            return FilteredEntryMultimap.this.f29467g instanceof SetMultimap ? DesugarCollections.unmodifiableSet(Sets.newLinkedHashSet(arrayListNewArrayList)) : DesugarCollections.unmodifiableList(arrayListNewArrayList);
        }
    }

    class Keys extends Multimaps.Keys<K, V> {

        /* JADX INFO: renamed from: com.google.common.collect.FilteredEntryMultimap$Keys$1, reason: invalid class name */
        class AnonymousClass1 extends Multisets.EntrySet<K> {
            AnonymousClass1() {
            }

            private boolean g(final Predicate predicate) {
                return FilteredEntryMultimap.this.o(new Predicate() { // from class: com.google.common.collect.d2
                    @Override // com.google.common.base.Predicate
                    public final boolean apply(Object obj) {
                        Map.Entry entry = (Map.Entry) obj;
                        return predicate.apply(Multisets.immutableEntry(entry.getKey(), ((Collection) entry.getValue()).size()));
                    }
                });
            }

            @Override // com.google.common.collect.Multisets.EntrySet
            Multiset e() {
                return Keys.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Multiset.Entry<K>> iterator() {
                return Keys.this.k();
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return g(Predicates.in(collection));
            }

            @Override // com.google.common.collect.Sets.ImprovedAbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean retainAll(Collection<?> collection) {
                return g(Predicates.not(Predicates.in(collection)));
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return FilteredEntryMultimap.this.keySet().size();
            }
        }

        Keys() {
            super(FilteredEntryMultimap.this);
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public Set<Multiset.Entry<K>> entrySet() {
            return new AnonymousClass1();
        }

        @Override // com.google.common.collect.Multimaps.Keys, com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int remove(Object obj, int i10) {
            CollectPreconditions.b(i10, "occurrences");
            if (i10 == 0) {
                return count(obj);
            }
            Collection<V> collection = FilteredEntryMultimap.this.f29467g.asMap().get(obj);
            int i11 = 0;
            if (collection == null) {
                return 0;
            }
            Iterator<V> it = collection.iterator();
            while (it.hasNext()) {
                if (FilteredEntryMultimap.this.q(obj, it.next()) && (i11 = i11 + 1) <= i10) {
                    it.remove();
                }
            }
            return i11;
        }
    }

    final class ValuePredicate implements Predicate<V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f29477b;

        ValuePredicate(Object obj) {
            this.f29477b = obj;
        }

        @Override // com.google.common.base.Predicate
        public boolean apply(@ParametricNullness V v10) {
            return FilteredEntryMultimap.this.q(this.f29477b, v10);
        }
    }

    FilteredEntryMultimap(Multimap multimap, Predicate predicate) {
        this.f29467g = (Multimap) Preconditions.checkNotNull(multimap);
        this.f29468h = (Predicate) Preconditions.checkNotNull(predicate);
    }

    static Collection n(Collection collection, Predicate predicate) {
        return collection instanceof Set ? Sets.filter((Set) collection, predicate) : Collections2.filter(collection, predicate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean q(Object obj, Object obj2) {
        return this.f29468h.apply(Maps.immutableEntry(obj, obj2));
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        entries().clear();
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(Object obj) {
        return asMap().get(obj) != null;
    }

    @Override // com.google.common.collect.AbstractMultimap
    Map d() {
        return new AsMap();
    }

    @Override // com.google.common.collect.FilteredMultimap
    public Predicate<? super Map.Entry<K, V>> entryPredicate() {
        return this.f29468h;
    }

    @Override // com.google.common.collect.AbstractMultimap
    Collection g() {
        return n(this.f29467g.entries(), this.f29468h);
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection<V> get(@ParametricNullness K k10) {
        return n(this.f29467g.get(k10), new ValuePredicate(k10));
    }

    @Override // com.google.common.collect.AbstractMultimap
    Set h() {
        return asMap().keySet();
    }

    @Override // com.google.common.collect.AbstractMultimap
    Multiset i() {
        return new Keys();
    }

    @Override // com.google.common.collect.AbstractMultimap
    Collection j() {
        return new FilteredMultimapValues(this);
    }

    @Override // com.google.common.collect.AbstractMultimap
    Iterator k() {
        throw new AssertionError("should never be called");
    }

    boolean o(Predicate predicate) {
        Iterator<Map.Entry<K, Collection<V>>> it = this.f29467g.asMap().entrySet().iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Map.Entry<K, Collection<V>> next = it.next();
            K key = next.getKey();
            Collection collectionN = n(next.getValue(), new ValuePredicate(key));
            if (!collectionN.isEmpty() && predicate.apply(Maps.immutableEntry(key, collectionN))) {
                if (collectionN.size() == next.getValue().size()) {
                    it.remove();
                } else {
                    collectionN.clear();
                }
                z10 = true;
            }
        }
        return z10;
    }

    Collection r() {
        return this.f29467g instanceof SetMultimap ? Collections.EMPTY_SET : Collections.EMPTY_LIST;
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Collection<V> removeAll(Object obj) {
        return (Collection) MoreObjects.firstNonNull(asMap().remove(obj), r());
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return entries().size();
    }

    @Override // com.google.common.collect.FilteredMultimap
    public Multimap<K, V> unfiltered() {
        return this.f29467g;
    }
}
