package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.base.Supplier;
import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.common.collect.AbstractMultimap;
import com.google.common.collect.ImmutableListMultimap;
import com.google.common.collect.Maps;
import com.google.common.collect.Multimaps;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.Sets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.DesugarCollections;
import j$.util.Objects;
import j$.util.stream.Collector;
import j$.util.stream.Stream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Multimaps {

    static final class AsMap<K, V> extends Maps.ViewCachingAbstractMap<K, Collection<V>> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final Multimap f30032e;

        class EntrySet extends Maps.EntrySet<K, Collection<V>> {
            EntrySet() {
            }

            @Override // com.google.common.collect.Maps.EntrySet
            Map e() {
                return AsMap.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Map.Entry<K, Collection<V>>> iterator() {
                return Maps.i(AsMap.this.f30032e.keySet(), new Function() { // from class: com.google.common.collect.x2
                    @Override // com.google.common.base.Function
                    public final Object apply(Object obj) {
                        return Multimaps.AsMap.this.f30032e.get(obj);
                    }
                });
            }

            @Override // com.google.common.collect.Maps.EntrySet, java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                if (!contains(obj)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                Objects.requireNonNull(entry);
                AsMap.this.c(entry.getKey());
                return true;
            }
        }

        AsMap(Multimap multimap) {
            this.f30032e = (Multimap) Preconditions.checkNotNull(multimap);
        }

        void c(Object obj) {
            this.f30032e.keySet().remove(obj);
        }

        @Override // java.util.AbstractMap, java.util.Map
        public void clear() {
            this.f30032e.clear();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f30032e.containsKey(obj);
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        protected Set createEntrySet() {
            return new EntrySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f30032e.isEmpty();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f30032e.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f30032e.keySet().size();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> get(Object obj) {
            if (containsKey(obj)) {
                return this.f30032e.get(obj);
            }
            return null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Collection<V> remove(Object obj) {
            if (containsKey(obj)) {
                return this.f30032e.removeAll(obj);
            }
            return null;
        }
    }

    private static class CustomListMultimap<K, V> extends AbstractListMultimap<K, V> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        transient Supplier f30034i;

        CustomListMultimap(Map map, Supplier supplier) {
            super(map);
            this.f30034i = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @J2ktIncompatible
        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            this.f30034i = (Supplier) object;
            Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            G((Map) object2);
        }

        @J2ktIncompatible
        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f30034i);
            objectOutputStream.writeObject(u());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractListMultimap, com.google.common.collect.AbstractMapBasedMultimap
        /* JADX INFO: renamed from: K */
        public List v() {
            return (List) this.f30034i.get();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        Map d() {
            return A();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        Set h() {
            return B();
        }
    }

    private static class CustomMultimap<K, V> extends AbstractMapBasedMultimap<K, V> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        transient Supplier f30035i;

        CustomMultimap(Map map, Supplier supplier) {
            super(map);
            this.f30035i = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @J2ktIncompatible
        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            this.f30035i = (Supplier) object;
            Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            G((Map) object2);
        }

        @J2ktIncompatible
        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f30035i);
            objectOutputStream.writeObject(u());
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        Collection H(Collection collection) {
            return collection instanceof NavigableSet ? Sets.unmodifiableNavigableSet((NavigableSet) collection) : collection instanceof SortedSet ? DesugarCollections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? DesugarCollections.unmodifiableSet((Set) collection) : collection instanceof List ? DesugarCollections.unmodifiableList((List) collection) : DesugarCollections.unmodifiableCollection(collection);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        Collection I(Object obj, Collection collection) {
            return collection instanceof List ? J(obj, (List) collection, null) : collection instanceof NavigableSet ? new AbstractMapBasedMultimap.WrappedNavigableSet(obj, (NavigableSet) collection, null) : collection instanceof SortedSet ? new AbstractMapBasedMultimap.WrappedSortedSet(obj, (SortedSet) collection, null) : collection instanceof Set ? new AbstractMapBasedMultimap.WrappedSet(obj, (Set) collection) : new AbstractMapBasedMultimap.WrappedCollection(obj, collection, null);
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        Map d() {
            return A();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        Set h() {
            return B();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap
        protected Collection v() {
            return (Collection) this.f30035i.get();
        }
    }

    private static class CustomSetMultimap<K, V> extends AbstractSetMultimap<K, V> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        transient Supplier f30036i;

        CustomSetMultimap(Map map, Supplier supplier) {
            super(map);
            this.f30036i = (Supplier) Preconditions.checkNotNull(supplier);
        }

        @J2ktIncompatible
        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            this.f30036i = (Supplier) object;
            Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            G((Map) object2);
        }

        @J2ktIncompatible
        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f30036i);
            objectOutputStream.writeObject(u());
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        Collection H(Collection collection) {
            return collection instanceof NavigableSet ? Sets.unmodifiableNavigableSet((NavigableSet) collection) : collection instanceof SortedSet ? DesugarCollections.unmodifiableSortedSet((SortedSet) collection) : DesugarCollections.unmodifiableSet((Set) collection);
        }

        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        Collection I(Object obj, Collection collection) {
            return collection instanceof NavigableSet ? new AbstractMapBasedMultimap.WrappedNavigableSet(obj, (NavigableSet) collection, null) : collection instanceof SortedSet ? new AbstractMapBasedMultimap.WrappedSortedSet(obj, (SortedSet) collection, null) : new AbstractMapBasedMultimap.WrappedSet(obj, (Set) collection);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        /* JADX INFO: renamed from: K */
        public Set v() {
            return (Set) this.f30036i.get();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        Map d() {
            return A();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        Set h() {
            return B();
        }
    }

    private static class CustomSortedSetMultimap<K, V> extends AbstractSortedSetMultimap<K, V> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        transient Supplier f30037i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        transient Comparator f30038j;

        CustomSortedSetMultimap(Map map, Supplier supplier) {
            super(map);
            this.f30037i = (Supplier) Preconditions.checkNotNull(supplier);
            this.f30038j = ((SortedSet) supplier.get()).comparator();
        }

        @J2ktIncompatible
        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
            objectInputStream.defaultReadObject();
            Object object = objectInputStream.readObject();
            Objects.requireNonNull(object);
            Supplier supplier = (Supplier) object;
            this.f30037i = supplier;
            this.f30038j = ((SortedSet) supplier.get()).comparator();
            Object object2 = objectInputStream.readObject();
            Objects.requireNonNull(object2);
            G((Map) object2);
        }

        @J2ktIncompatible
        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            objectOutputStream.defaultWriteObject();
            objectOutputStream.writeObject(this.f30037i);
            objectOutputStream.writeObject(u());
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.AbstractSortedSetMultimap, com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public SortedSet v() {
            return (SortedSet) this.f30037i.get();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        Map d() {
            return A();
        }

        @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap
        Set h() {
            return B();
        }

        @Override // com.google.common.collect.SortedSetMultimap
        public Comparator<? super V> valueComparator() {
            return this.f30038j;
        }
    }

    static abstract class Entries<K, V> extends AbstractCollection<Map.Entry<K, V>> {
        Entries() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            e().clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return e().containsEntry(entry.getKey(), entry.getValue());
        }

        abstract Multimap e();

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean remove(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return e().remove(entry.getKey(), entry.getValue());
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return e().size();
        }
    }

    static class Keys<K, V> extends AbstractMultiset<K> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Multimap f30039d;

        Keys(Multimap multimap) {
            this.f30039d = multimap;
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
        public void clear() {
            this.f30039d.clear();
        }

        @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public boolean contains(Object obj) {
            return this.f30039d.containsKey(obj);
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
            Collection collection = (Collection) Maps.G(this.f30039d.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            return collection.size();
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public Set<K> elementSet() {
            return this.f30039d.keySet();
        }

        @Override // com.google.common.collect.AbstractMultiset
        int i() {
            return this.f30039d.asMap().size();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
        public Iterator<K> iterator() {
            return Maps.w(this.f30039d.entries().iterator());
        }

        @Override // com.google.common.collect.AbstractMultiset
        Iterator j() {
            throw new AssertionError("should never be called");
        }

        @Override // com.google.common.collect.AbstractMultiset
        Iterator k() {
            return new TransformedIterator<Map.Entry<K, Collection<V>>, Multiset.Entry<K>>(this.f30039d.asMap().entrySet().iterator()) { // from class: com.google.common.collect.Multimaps.Keys.1
                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // com.google.common.collect.TransformedIterator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public Multiset.Entry a(final Map.Entry entry) {
                    return new Multisets.AbstractEntry<K>(this) { // from class: com.google.common.collect.Multimaps.Keys.1.1

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f30042c;

                        {
                            this.f30042c = this;
                        }

                        @Override // com.google.common.collect.Multiset.Entry
                        public int getCount() {
                            return ((Collection) entry.getValue()).size();
                        }

                        @Override // com.google.common.collect.Multiset.Entry
                        @ParametricNullness
                        public K getElement() {
                            return (K) entry.getKey();
                        }
                    };
                }
            };
        }

        @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
        public int remove(Object obj, int i10) {
            CollectPreconditions.b(i10, "occurrences");
            if (i10 == 0) {
                return count(obj);
            }
            Collection collection = (Collection) Maps.G(this.f30039d.asMap(), obj);
            if (collection == null) {
                return 0;
            }
            int size = collection.size();
            if (i10 >= size) {
                collection.clear();
                return size;
            }
            Iterator it = collection.iterator();
            for (int i11 = 0; i11 < i10; i11++) {
                it.next();
                it.remove();
            }
            return size;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
        public int size() {
            return this.f30039d.size();
        }
    }

    private static class MapMultimap<K, V> extends AbstractMultimap<K, V> implements SetMultimap<K, V>, Serializable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Map f30043g;

        MapMultimap(Map map) {
            this.f30043g = (Map) Preconditions.checkNotNull(map);
        }

        @Override // com.google.common.collect.Multimap
        public void clear() {
            this.f30043g.clear();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean containsEntry(Object obj, Object obj2) {
            return this.f30043g.entrySet().contains(Maps.immutableEntry(obj, obj2));
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsKey(Object obj) {
            return this.f30043g.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean containsValue(Object obj) {
            return this.f30043g.containsValue(obj);
        }

        @Override // com.google.common.collect.AbstractMultimap
        Map d() {
            return new AsMap(this);
        }

        @Override // com.google.common.collect.AbstractMultimap
        Collection g() {
            throw new AssertionError("unreachable");
        }

        @Override // com.google.common.collect.AbstractMultimap
        Set h() {
            return this.f30043g.keySet();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public int hashCode() {
            return this.f30043g.hashCode();
        }

        @Override // com.google.common.collect.AbstractMultimap
        Multiset i() {
            return new Keys(this);
        }

        @Override // com.google.common.collect.AbstractMultimap
        Collection j() {
            return this.f30043g.values();
        }

        @Override // com.google.common.collect.AbstractMultimap
        Iterator k() {
            return this.f30043g.entrySet().iterator();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean put(@ParametricNullness K k10, @ParametricNullness V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean putAll(@ParametricNullness K k10, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean remove(Object obj, Object obj2) {
            return this.f30043g.entrySet().remove(Maps.immutableEntry(obj, obj2));
        }

        @Override // com.google.common.collect.Multimap
        public int size() {
            return this.f30043g.size();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public Set<Map.Entry<K, V>> entries() {
            return this.f30043g.entrySet();
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set<V> get(@ParametricNullness final K k10) {
            return new Sets.ImprovedAbstractSet<V>(this) { // from class: com.google.common.collect.Multimaps.MapMultimap.1

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ MapMultimap f30045c;

                {
                    this.f30045c = this;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                public Iterator<V> iterator() {
                    return new Iterator<V>() { // from class: com.google.common.collect.Multimaps.MapMultimap.1.1

                        /* JADX INFO: renamed from: b, reason: collision with root package name */
                        int f30046b;

                        @Override // java.util.Iterator
                        public boolean hasNext() {
                            if (this.f30046b != 0) {
                                return false;
                            }
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            return anonymousClass1.f30045c.f30043g.containsKey(k10);
                        }

                        @Override // java.util.Iterator
                        @ParametricNullness
                        public V next() {
                            if (!hasNext()) {
                                throw new NoSuchElementException();
                            }
                            this.f30046b++;
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            return (V) NullnessCasts.a(anonymousClass1.f30045c.f30043g.get(k10));
                        }

                        @Override // java.util.Iterator
                        public void remove() {
                            CollectPreconditions.e(this.f30046b == 1);
                            this.f30046b = -1;
                            AnonymousClass1 anonymousClass1 = AnonymousClass1.this;
                            anonymousClass1.f30045c.f30043g.remove(k10);
                        }
                    };
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                public int size() {
                    return this.f30045c.f30043g.containsKey(k10) ? 1 : 0;
                }
            };
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean putAll(Multimap<? extends K, ? extends V> multimap) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set<V> removeAll(Object obj) {
            HashSet hashSet = new HashSet(2);
            if (!this.f30043g.containsKey(obj)) {
                return hashSet;
            }
            hashSet.add(this.f30043g.remove(obj));
            return hashSet;
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set<V> replaceValues(@ParametricNullness K k10, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    private static final class TransformedEntriesListMultimap<K, V1, V2> extends TransformedEntriesMultimap<K, V1, V2> implements ListMultimap<K, V2> {
        TransformedEntriesListMultimap(ListMultimap listMultimap, Maps.EntryTransformer entryTransformer) {
            super(listMultimap, entryTransformer);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public List n(Object obj, Collection collection) {
            return Lists.transform((List) collection, Maps.j(this.f30049h, obj));
        }

        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public List<V2> get(@ParametricNullness K k10) {
            return n(k10, this.f30048g.get(k10));
        }

        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public List<V2> removeAll(Object obj) {
            return n(obj, this.f30048g.removeAll(obj));
        }

        @Override // com.google.common.collect.Multimaps.TransformedEntriesMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public List<V2> replaceValues(@ParametricNullness K k10, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class TransformedEntriesMultimap<K, V1, V2> extends AbstractMultimap<K, V2> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final Multimap f30048g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final Maps.EntryTransformer f30049h;

        TransformedEntriesMultimap(Multimap multimap, Maps.EntryTransformer entryTransformer) {
            this.f30048g = (Multimap) Preconditions.checkNotNull(multimap);
            this.f30049h = (Maps.EntryTransformer) Preconditions.checkNotNull(entryTransformer);
        }

        @Override // com.google.common.collect.Multimap
        public void clear() {
            this.f30048g.clear();
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsKey(Object obj) {
            return this.f30048g.containsKey(obj);
        }

        @Override // com.google.common.collect.AbstractMultimap
        Map d() {
            return Maps.transformEntries(this.f30048g.asMap(), new Maps.EntryTransformer() { // from class: com.google.common.collect.y2
                @Override // com.google.common.collect.Maps.EntryTransformer
                public final Object transformEntry(Object obj, Object obj2) {
                    return this.f30486a.n(obj, (Collection) obj2);
                }
            });
        }

        @Override // com.google.common.collect.AbstractMultimap
        Collection g() {
            return new AbstractMultimap.Entries();
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Collection<V2> get(@ParametricNullness K k10) {
            return n(k10, this.f30048g.get(k10));
        }

        @Override // com.google.common.collect.AbstractMultimap
        Set h() {
            return this.f30048g.keySet();
        }

        @Override // com.google.common.collect.AbstractMultimap
        Multiset i() {
            return this.f30048g.keys();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean isEmpty() {
            return this.f30048g.isEmpty();
        }

        @Override // com.google.common.collect.AbstractMultimap
        Collection j() {
            return Collections2.transform(this.f30048g.entries(), Maps.g(this.f30049h));
        }

        @Override // com.google.common.collect.AbstractMultimap
        Iterator k() {
            return Iterators.transform(this.f30048g.entries().iterator(), Maps.f(this.f30049h));
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public Collection n(Object obj, Collection collection) {
            Function functionJ = Maps.j(this.f30049h, obj);
            return collection instanceof List ? Lists.transform((List) collection, functionJ) : Collections2.transform(collection, functionJ);
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean put(@ParametricNullness K k10, @ParametricNullness V2 v22) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean putAll(@ParametricNullness K k10, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean remove(Object obj, Object obj2) {
            return get(obj).remove(obj2);
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Collection<V2> removeAll(Object obj) {
            return n(obj, this.f30048g.removeAll(obj));
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Collection<V2> replaceValues(@ParametricNullness K k10, Iterable<? extends V2> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimap
        public int size() {
            return this.f30048g.size();
        }

        @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
        public boolean putAll(Multimap<? extends K, ? extends V2> multimap) {
            throw new UnsupportedOperationException();
        }
    }

    private static class UnmodifiableListMultimap<K, V> extends UnmodifiableMultimap<K, V> implements ListMultimap<K, V> {
        UnmodifiableListMultimap(ListMultimap listMultimap) {
            super(listMultimap);
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public List<V> get(@ParametricNullness K k10) {
            return DesugarCollections.unmodifiableList(n().get((Object) k10));
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public List<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public List<V> replaceValues(@ParametricNullness K k10, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: delegate */
        public ListMultimap<K, V> n() {
            return (ListMultimap) super.n();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class UnmodifiableMultimap<K, V> extends ForwardingMultimap<K, V> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Multimap f30050b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        transient Collection f30051c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        transient Multiset f30052d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        transient Set f30053e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        transient Collection f30054f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        transient Map f30055g;

        UnmodifiableMultimap(Multimap multimap) {
            this.f30050b = (Multimap) Preconditions.checkNotNull(multimap);
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Map<K, Collection<V>> asMap() {
            Map<K, Collection<V>> map = this.f30055g;
            if (map != null) {
                return map;
            }
            Map<K, Collection<V>> mapUnmodifiableMap = DesugarCollections.unmodifiableMap(Maps.transformValues(this.f30050b.asMap(), new Function() { // from class: com.google.common.collect.z2
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return Multimaps.g((Collection) obj);
                }
            }));
            this.f30055g = mapUnmodifiableMap;
            return mapUnmodifiableMap;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Collection<Map.Entry<K, V>> entries() {
            Collection<Map.Entry<K, V>> collection = this.f30051c;
            if (collection != null) {
                return collection;
            }
            Collection<Map.Entry<K, V>> collectionF = Multimaps.f(this.f30050b.entries());
            this.f30051c = collectionF;
            return collectionF;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Collection<V> get(@ParametricNullness K k10) {
            return Multimaps.g(this.f30050b.get(k10));
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Set<K> keySet() {
            Set<K> set = this.f30053e;
            if (set != null) {
                return set;
            }
            Set<K> setUnmodifiableSet = DesugarCollections.unmodifiableSet(this.f30050b.keySet());
            this.f30053e = setUnmodifiableSet;
            return setUnmodifiableSet;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Multiset<K> keys() {
            Multiset<K> multiset = this.f30052d;
            if (multiset != null) {
                return multiset;
            }
            Multiset<K> multisetUnmodifiableMultiset = Multisets.unmodifiableMultiset(this.f30050b.keys());
            this.f30052d = multisetUnmodifiableMultiset;
            return multisetUnmodifiableMultiset;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public boolean put(@ParametricNullness K k10, @ParametricNullness V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public boolean putAll(@ParametricNullness K k10, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public boolean remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Collection<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Collection<V> replaceValues(@ParametricNullness K k10, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Collection<V> values() {
            Collection<V> collection = this.f30054f;
            if (collection != null) {
                return collection;
            }
            Collection<V> collectionUnmodifiableCollection = DesugarCollections.unmodifiableCollection(this.f30050b.values());
            this.f30054f = collectionUnmodifiableCollection;
            return collectionUnmodifiableCollection;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: delegate */
        public Multimap n() {
            return this.f30050b;
        }

        @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public boolean putAll(Multimap<? extends K, ? extends V> multimap) {
            throw new UnsupportedOperationException();
        }
    }

    private static class UnmodifiableSetMultimap<K, V> extends UnmodifiableMultimap<K, V> implements SetMultimap<K, V> {
        UnmodifiableSetMultimap(SetMultimap setMultimap) {
            super(setMultimap);
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap
        public Set<Map.Entry<K, V>> entries() {
            return Maps.N(n().entries());
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set<V> get(@ParametricNullness K k10) {
            return DesugarCollections.unmodifiableSet(n().get((Object) k10));
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set<V> replaceValues(@ParametricNullness K k10, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: delegate */
        public SetMultimap<K, V> n() {
            return (SetMultimap) super.n();
        }
    }

    public static <K, V> Map<K, List<V>> asMap(ListMultimap<K, V> listMultimap) {
        return listMultimap.asMap();
    }

    static boolean c(Multimap multimap, Object obj) {
        if (obj == multimap) {
            return true;
        }
        if (obj instanceof Multimap) {
            return multimap.asMap().equals(((Multimap) obj).asMap());
        }
        return false;
    }

    private static Multimap d(FilteredMultimap filteredMultimap, Predicate predicate) {
        return new FilteredEntryMultimap(filteredMultimap.unfiltered(), Predicates.and(filteredMultimap.entryPredicate(), predicate));
    }

    private static SetMultimap e(FilteredSetMultimap filteredSetMultimap, Predicate predicate) {
        return new FilteredEntrySetMultimap(filteredSetMultimap.unfiltered(), Predicates.and(filteredSetMultimap.entryPredicate(), predicate));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Collection f(Collection collection) {
        return collection instanceof Set ? Maps.N((Set) collection) : new Maps.UnmodifiableEntries(DesugarCollections.unmodifiableCollection(collection));
    }

    public static <K, V> Multimap<K, V> filterEntries(Multimap<K, V> multimap, Predicate<? super Map.Entry<K, V>> predicate) {
        Preconditions.checkNotNull(predicate);
        return multimap instanceof SetMultimap ? filterEntries((SetMultimap) multimap, (Predicate) predicate) : multimap instanceof FilteredMultimap ? d((FilteredMultimap) multimap, predicate) : new FilteredEntryMultimap((Multimap) Preconditions.checkNotNull(multimap), predicate);
    }

    public static <K, V> Multimap<K, V> filterKeys(Multimap<K, V> multimap, Predicate<? super K> predicate) {
        if (multimap instanceof SetMultimap) {
            return filterKeys((SetMultimap) multimap, (Predicate) predicate);
        }
        if (multimap instanceof ListMultimap) {
            return filterKeys((ListMultimap) multimap, (Predicate) predicate);
        }
        if (!(multimap instanceof FilteredKeyMultimap)) {
            return multimap instanceof FilteredMultimap ? d((FilteredMultimap) multimap, Maps.y(predicate)) : new FilteredKeyMultimap(multimap, predicate);
        }
        FilteredKeyMultimap filteredKeyMultimap = (FilteredKeyMultimap) multimap;
        return new FilteredKeyMultimap(filteredKeyMultimap.f29479g, Predicates.and(filteredKeyMultimap.f29480h, predicate));
    }

    public static <K, V> Multimap<K, V> filterValues(Multimap<K, V> multimap, Predicate<? super V> predicate) {
        return filterEntries(multimap, Maps.T(predicate));
    }

    @IgnoreJRERequirement
    public static <T, K, V, M extends Multimap<K, V>> Collector<T, ?, M> flatteningToMultimap(java.util.function.Function<? super T, ? extends K> function, java.util.function.Function<? super T, ? extends Stream<? extends V>> function2, java.util.function.Supplier<M> supplier) {
        return CollectCollectors.F(function, function2, supplier);
    }

    public static <K, V> SetMultimap<K, V> forMap(Map<K, V> map) {
        return new MapMultimap(map);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Collection g(Collection collection) {
        return collection instanceof SortedSet ? DesugarCollections.unmodifiableSortedSet((SortedSet) collection) : collection instanceof Set ? DesugarCollections.unmodifiableSet((Set) collection) : collection instanceof List ? DesugarCollections.unmodifiableList((List) collection) : DesugarCollections.unmodifiableCollection(collection);
    }

    public static <K, V> ImmutableListMultimap<K, V> index(Iterable<V> iterable, Function<? super V, K> function) {
        return index(iterable.iterator(), function);
    }

    @CanIgnoreReturnValue
    public static <K, V, M extends Multimap<K, V>> M invertFrom(Multimap<? extends V, ? extends K> multimap, M m10) {
        Preconditions.checkNotNull(m10);
        for (Map.Entry<? extends V, ? extends K> entry : multimap.entries()) {
            m10.put(entry.getValue(), entry.getKey());
        }
        return m10;
    }

    public static <K, V> ListMultimap<K, V> newListMultimap(Map<K, Collection<V>> map, Supplier<? extends List<V>> supplier) {
        return new CustomListMultimap(map, supplier);
    }

    public static <K, V> Multimap<K, V> newMultimap(Map<K, Collection<V>> map, Supplier<? extends Collection<V>> supplier) {
        return new CustomMultimap(map, supplier);
    }

    public static <K, V> SetMultimap<K, V> newSetMultimap(Map<K, Collection<V>> map, Supplier<? extends Set<V>> supplier) {
        return new CustomSetMultimap(map, supplier);
    }

    public static <K, V> SortedSetMultimap<K, V> newSortedSetMultimap(Map<K, Collection<V>> map, Supplier<? extends SortedSet<V>> supplier) {
        return new CustomSortedSetMultimap(map, supplier);
    }

    @J2ktIncompatible
    public static <K, V> ListMultimap<K, V> synchronizedListMultimap(ListMultimap<K, V> listMultimap) {
        return Synchronized.k(listMultimap, null);
    }

    @J2ktIncompatible
    public static <K, V> Multimap<K, V> synchronizedMultimap(Multimap<K, V> multimap) {
        return Synchronized.m(multimap, null);
    }

    @J2ktIncompatible
    public static <K, V> SetMultimap<K, V> synchronizedSetMultimap(SetMultimap<K, V> setMultimap) {
        return Synchronized.v(setMultimap, null);
    }

    @J2ktIncompatible
    public static <K, V> SortedSetMultimap<K, V> synchronizedSortedSetMultimap(SortedSetMultimap<K, V> sortedSetMultimap) {
        return Synchronized.y(sortedSetMultimap, null);
    }

    @IgnoreJRERequirement
    public static <T, K, V, M extends Multimap<K, V>> Collector<T, ?, M> toMultimap(java.util.function.Function<? super T, ? extends K> function, java.util.function.Function<? super T, ? extends V> function2, java.util.function.Supplier<M> supplier) {
        return CollectCollectors.X(function, function2, supplier);
    }

    public static <K, V1, V2> Multimap<K, V2> transformEntries(Multimap<K, V1> multimap, Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new TransformedEntriesMultimap(multimap, entryTransformer);
    }

    public static <K, V1, V2> Multimap<K, V2> transformValues(Multimap<K, V1> multimap, Function<? super V1, V2> function) {
        Preconditions.checkNotNull(function);
        return transformEntries(multimap, Maps.h(function));
    }

    public static <K, V> ListMultimap<K, V> unmodifiableListMultimap(ListMultimap<K, V> listMultimap) {
        return ((listMultimap instanceof UnmodifiableListMultimap) || (listMultimap instanceof ImmutableListMultimap)) ? listMultimap : new UnmodifiableListMultimap(listMultimap);
    }

    public static <K, V> Multimap<K, V> unmodifiableMultimap(Multimap<K, V> multimap) {
        return ((multimap instanceof UnmodifiableMultimap) || (multimap instanceof ImmutableMultimap)) ? multimap : new UnmodifiableMultimap(multimap);
    }

    public static <K, V> SetMultimap<K, V> unmodifiableSetMultimap(SetMultimap<K, V> setMultimap) {
        return ((setMultimap instanceof UnmodifiableSetMultimap) || (setMultimap instanceof ImmutableSetMultimap)) ? setMultimap : new UnmodifiableSetMultimap(setMultimap);
    }

    public static <K, V> SortedSetMultimap<K, V> unmodifiableSortedSetMultimap(SortedSetMultimap<K, V> sortedSetMultimap) {
        return sortedSetMultimap instanceof UnmodifiableSortedSetMultimap ? sortedSetMultimap : new UnmodifiableSortedSetMultimap(sortedSetMultimap);
    }

    private static class UnmodifiableSortedSetMultimap<K, V> extends UnmodifiableSetMultimap<K, V> implements SortedSetMultimap<K, V> {
        UnmodifiableSortedSetMultimap(SortedSetMultimap sortedSetMultimap) {
            super(sortedSetMultimap);
        }

        @Override // com.google.common.collect.SortedSetMultimap
        public Comparator<? super V> valueComparator() {
            return n().valueComparator();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public SortedSet<V> get(@ParametricNullness K k10) {
            return DesugarCollections.unmodifiableSortedSet(n().get((Object) k10));
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public SortedSet<V> removeAll(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public SortedSet<V> replaceValues(@ParametricNullness K k10, Iterable<? extends V> iterable) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Multimaps.UnmodifiableSetMultimap, com.google.common.collect.Multimaps.UnmodifiableMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: delegate */
        public SortedSetMultimap<K, V> n() {
            return (SortedSetMultimap) super.n();
        }
    }

    public static <K, V> Map<K, Set<V>> asMap(SetMultimap<K, V> setMultimap) {
        return setMultimap.asMap();
    }

    public static <K, V> SetMultimap<K, V> filterValues(SetMultimap<K, V> setMultimap, Predicate<? super V> predicate) {
        return filterEntries((SetMultimap) setMultimap, Maps.T(predicate));
    }

    public static <K, V> ImmutableListMultimap<K, V> index(Iterator<V> it, Function<? super V, K> function) {
        Preconditions.checkNotNull(function);
        ImmutableListMultimap.Builder builder = ImmutableListMultimap.builder();
        while (it.hasNext()) {
            V next = it.next();
            Preconditions.checkNotNull(next, it);
            builder.put((Object) function.apply(next), (Object) next);
        }
        return builder.build();
    }

    public static <K, V1, V2> ListMultimap<K, V2> transformEntries(ListMultimap<K, V1> listMultimap, Maps.EntryTransformer<? super K, ? super V1, V2> entryTransformer) {
        return new TransformedEntriesListMultimap(listMultimap, entryTransformer);
    }

    public static <K, V> Map<K, SortedSet<V>> asMap(SortedSetMultimap<K, V> sortedSetMultimap) {
        return sortedSetMultimap.asMap();
    }

    @Deprecated
    public static <K, V> ListMultimap<K, V> unmodifiableListMultimap(ImmutableListMultimap<K, V> immutableListMultimap) {
        return (ListMultimap) Preconditions.checkNotNull(immutableListMultimap);
    }

    @Deprecated
    public static <K, V> Multimap<K, V> unmodifiableMultimap(ImmutableMultimap<K, V> immutableMultimap) {
        return (Multimap) Preconditions.checkNotNull(immutableMultimap);
    }

    @Deprecated
    public static <K, V> SetMultimap<K, V> unmodifiableSetMultimap(ImmutableSetMultimap<K, V> immutableSetMultimap) {
        return (SetMultimap) Preconditions.checkNotNull(immutableSetMultimap);
    }

    public static <K, V> Map<K, Collection<V>> asMap(Multimap<K, V> multimap) {
        return multimap.asMap();
    }

    public static <K, V1, V2> ListMultimap<K, V2> transformValues(ListMultimap<K, V1> listMultimap, Function<? super V1, V2> function) {
        Preconditions.checkNotNull(function);
        return transformEntries((ListMultimap) listMultimap, Maps.h(function));
    }

    public static <K, V> SetMultimap<K, V> filterEntries(SetMultimap<K, V> setMultimap, Predicate<? super Map.Entry<K, V>> predicate) {
        Preconditions.checkNotNull(predicate);
        if (setMultimap instanceof FilteredSetMultimap) {
            return e((FilteredSetMultimap) setMultimap, predicate);
        }
        return new FilteredEntrySetMultimap((SetMultimap) Preconditions.checkNotNull(setMultimap), predicate);
    }

    public static <K, V> SetMultimap<K, V> filterKeys(SetMultimap<K, V> setMultimap, Predicate<? super K> predicate) {
        if (setMultimap instanceof FilteredKeySetMultimap) {
            FilteredKeySetMultimap filteredKeySetMultimap = (FilteredKeySetMultimap) setMultimap;
            return new FilteredKeySetMultimap(filteredKeySetMultimap.unfiltered(), Predicates.and(filteredKeySetMultimap.f29480h, predicate));
        }
        if (setMultimap instanceof FilteredSetMultimap) {
            return e((FilteredSetMultimap) setMultimap, Maps.y(predicate));
        }
        return new FilteredKeySetMultimap(setMultimap, predicate);
    }

    public static <K, V> ListMultimap<K, V> filterKeys(ListMultimap<K, V> listMultimap, Predicate<? super K> predicate) {
        if (listMultimap instanceof FilteredKeyListMultimap) {
            FilteredKeyListMultimap filteredKeyListMultimap = (FilteredKeyListMultimap) listMultimap;
            return new FilteredKeyListMultimap(filteredKeyListMultimap.unfiltered(), Predicates.and(filteredKeyListMultimap.f29480h, predicate));
        }
        return new FilteredKeyListMultimap(listMultimap, predicate);
    }
}
