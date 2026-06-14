package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Table;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.Queue;
import java.util.RandomAccess;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
final class Synchronized {

    static final class SynchronizedAsMap<K, V> extends SynchronizedMap<K, Collection<V>> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        transient Set f30275g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        transient Collection f30276h;

        SynchronizedAsMap(Map map, Object obj) {
            super(map, obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public boolean containsValue(Object obj) {
            return values().contains(obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Set<Map.Entry<K, Collection<V>>> entrySet() {
            Set<Map.Entry<K, Collection<V>>> set;
            synchronized (this.f30298c) {
                try {
                    if (this.f30275g == null) {
                        this.f30275g = new SynchronizedAsMapEntries(j().entrySet(), this.f30298c);
                    }
                    set = this.f30275g;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Collection<Collection<V>> values() {
            Collection<Collection<V>> collection;
            synchronized (this.f30298c) {
                try {
                    if (this.f30276h == null) {
                        this.f30276h = new SynchronizedAsMapValues(j().values(), this.f30298c);
                    }
                    collection = this.f30276h;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return collection;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Collection<V> get(Object obj) {
            Collection<V> collectionA;
            synchronized (this.f30298c) {
                Collection collection = (Collection) super.get(obj);
                collectionA = collection == null ? null : Synchronized.A(collection, this.f30298c);
            }
            return collectionA;
        }
    }

    static final class SynchronizedAsMapValues<V> extends SynchronizedCollection<Collection<V>> {
        SynchronizedAsMapValues(Collection collection, Object obj) {
            super(collection, obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Collection<V>> iterator() {
            return new TransformedIterator<Collection<V>, Collection<V>>(super.iterator()) { // from class: com.google.common.collect.Synchronized.SynchronizedAsMapValues.1
                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // com.google.common.collect.TransformedIterator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public Collection a(Collection collection) {
                    return Synchronized.A(collection, SynchronizedAsMapValues.this.f30298c);
                }
            };
        }
    }

    static final class SynchronizedBiMap<K, V> extends SynchronizedMap<K, V> implements BiMap<K, V>, Serializable {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private transient Set f30281g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private transient BiMap f30282h;

        @Override // com.google.common.collect.BiMap
        public V forcePut(@ParametricNullness K k10, @ParametricNullness V v10) {
            V v11;
            synchronized (this.f30298c) {
                v11 = (V) i().forcePut(k10, v10);
            }
            return v11;
        }

        @Override // com.google.common.collect.BiMap
        public BiMap<V, K> inverse() {
            BiMap<V, K> biMap;
            synchronized (this.f30298c) {
                try {
                    if (this.f30282h == null) {
                        this.f30282h = new SynchronizedBiMap(i().inverse(), this.f30298c, this);
                    }
                    biMap = this.f30282h;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return biMap;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedMap
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public BiMap j() {
            return (BiMap) super.j();
        }

        private SynchronizedBiMap(BiMap biMap, Object obj, BiMap biMap2) {
            super(biMap, obj);
            this.f30282h = biMap2;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Set<V> values() {
            Set<V> set;
            synchronized (this.f30298c) {
                try {
                    if (this.f30281g == null) {
                        this.f30281g = Synchronized.u(i().values(), this.f30298c);
                    }
                    set = this.f30281g;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }
    }

    @VisibleForTesting
    static class SynchronizedCollection<E> extends SynchronizedObject implements Collection<E> {
        @Override // java.util.Collection
        public boolean add(E e10) {
            boolean zAdd;
            synchronized (this.f30298c) {
                zAdd = j().add(e10);
            }
            return zAdd;
        }

        @Override // java.util.Collection
        public boolean addAll(Collection<? extends E> collection) {
            boolean zAddAll;
            synchronized (this.f30298c) {
                zAddAll = j().addAll(collection);
            }
            return zAddAll;
        }

        @Override // java.util.Collection
        public void clear() {
            synchronized (this.f30298c) {
                j().clear();
            }
        }

        public boolean contains(Object obj) {
            boolean zContains;
            synchronized (this.f30298c) {
                zContains = j().contains(obj);
            }
            return zContains;
        }

        public boolean containsAll(Collection<?> collection) {
            boolean zContainsAll;
            synchronized (this.f30298c) {
                zContainsAll = j().containsAll(collection);
            }
            return zContainsAll;
        }

        /* JADX INFO: renamed from: i */
        Collection j() {
            return (Collection) super.g();
        }

        @Override // java.util.Collection
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f30298c) {
                zIsEmpty = j().isEmpty();
            }
            return zIsEmpty;
        }

        public Iterator<E> iterator() {
            return j().iterator();
        }

        public boolean remove(Object obj) {
            boolean zRemove;
            synchronized (this.f30298c) {
                zRemove = j().remove(obj);
            }
            return zRemove;
        }

        public boolean removeAll(Collection<?> collection) {
            boolean zRemoveAll;
            synchronized (this.f30298c) {
                zRemoveAll = j().removeAll(collection);
            }
            return zRemoveAll;
        }

        public boolean retainAll(Collection<?> collection) {
            boolean zRetainAll;
            synchronized (this.f30298c) {
                zRetainAll = j().retainAll(collection);
            }
            return zRetainAll;
        }

        @Override // java.util.Collection
        public int size() {
            int size;
            synchronized (this.f30298c) {
                size = j().size();
            }
            return size;
        }

        public Object[] toArray() {
            Object[] array;
            synchronized (this.f30298c) {
                array = j().toArray();
            }
            return array;
        }

        private SynchronizedCollection(Collection collection, Object obj) {
            super(collection, obj);
        }

        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.f30298c) {
                tArr2 = (T[]) j().toArray(tArr);
            }
            return tArr2;
        }
    }

    static final class SynchronizedDeque<E> extends SynchronizedQueue<E> implements Deque<E> {
        SynchronizedDeque(Deque deque, Object obj) {
            super(deque, obj);
        }

        @Override // java.util.Deque
        public void addFirst(E e10) {
            synchronized (this.f30298c) {
                i().addFirst(e10);
            }
        }

        @Override // java.util.Deque
        public void addLast(E e10) {
            synchronized (this.f30298c) {
                i().addLast(e10);
            }
        }

        @Override // java.util.Deque
        public Iterator<E> descendingIterator() {
            Iterator<E> itDescendingIterator;
            synchronized (this.f30298c) {
                itDescendingIterator = i().descendingIterator();
            }
            return itDescendingIterator;
        }

        @Override // java.util.Deque
        public E getFirst() {
            E e10;
            synchronized (this.f30298c) {
                e10 = (E) i().getFirst();
            }
            return e10;
        }

        @Override // java.util.Deque
        public E getLast() {
            E e10;
            synchronized (this.f30298c) {
                e10 = (E) i().getLast();
            }
            return e10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedQueue
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public Deque j() {
            return (Deque) super.j();
        }

        @Override // java.util.Deque
        public boolean offerFirst(E e10) {
            boolean zOfferFirst;
            synchronized (this.f30298c) {
                zOfferFirst = i().offerFirst(e10);
            }
            return zOfferFirst;
        }

        @Override // java.util.Deque
        public boolean offerLast(E e10) {
            boolean zOfferLast;
            synchronized (this.f30298c) {
                zOfferLast = i().offerLast(e10);
            }
            return zOfferLast;
        }

        @Override // java.util.Deque
        public E peekFirst() {
            E e10;
            synchronized (this.f30298c) {
                e10 = (E) i().peekFirst();
            }
            return e10;
        }

        @Override // java.util.Deque
        public E peekLast() {
            E e10;
            synchronized (this.f30298c) {
                e10 = (E) i().peekLast();
            }
            return e10;
        }

        @Override // java.util.Deque
        public E pollFirst() {
            E e10;
            synchronized (this.f30298c) {
                e10 = (E) i().pollFirst();
            }
            return e10;
        }

        @Override // java.util.Deque
        public E pollLast() {
            E e10;
            synchronized (this.f30298c) {
                e10 = (E) i().pollLast();
            }
            return e10;
        }

        @Override // java.util.Deque
        public E pop() {
            E e10;
            synchronized (this.f30298c) {
                e10 = (E) i().pop();
            }
            return e10;
        }

        @Override // java.util.Deque
        public void push(E e10) {
            synchronized (this.f30298c) {
                i().push(e10);
            }
        }

        @Override // java.util.Deque
        public E removeFirst() {
            E e10;
            synchronized (this.f30298c) {
                e10 = (E) i().removeFirst();
            }
            return e10;
        }

        @Override // java.util.Deque
        public boolean removeFirstOccurrence(Object obj) {
            boolean zRemoveFirstOccurrence;
            synchronized (this.f30298c) {
                zRemoveFirstOccurrence = i().removeFirstOccurrence(obj);
            }
            return zRemoveFirstOccurrence;
        }

        @Override // java.util.Deque
        public E removeLast() {
            E e10;
            synchronized (this.f30298c) {
                e10 = (E) i().removeLast();
            }
            return e10;
        }

        @Override // java.util.Deque
        public boolean removeLastOccurrence(Object obj) {
            boolean zRemoveLastOccurrence;
            synchronized (this.f30298c) {
                zRemoveLastOccurrence = i().removeLastOccurrence(obj);
            }
            return zRemoveLastOccurrence;
        }
    }

    @GwtIncompatible
    static final class SynchronizedEntry<K, V> extends SynchronizedObject implements Map.Entry<K, V> {
        SynchronizedEntry(Map.Entry entry, Object obj) {
            super(entry, obj);
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            boolean zEquals;
            synchronized (this.f30298c) {
                zEquals = i().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            K k10;
            synchronized (this.f30298c) {
                k10 = (K) i().getKey();
            }
            return k10;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            V v10;
            synchronized (this.f30298c) {
                v10 = (V) i().getValue();
            }
            return v10;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            int iHashCode;
            synchronized (this.f30298c) {
                iHashCode = i().hashCode();
            }
            return iHashCode;
        }

        Map.Entry i() {
            return (Map.Entry) super.g();
        }

        @Override // java.util.Map.Entry
        public V setValue(V v10) {
            V v11;
            synchronized (this.f30298c) {
                v11 = (V) i().setValue(v10);
            }
            return v11;
        }
    }

    static class SynchronizedList<E> extends SynchronizedCollection<E> implements List<E> {
        SynchronizedList(List list, Object obj) {
            super(list, obj);
        }

        @Override // java.util.List
        public void add(int i10, E e10) {
            synchronized (this.f30298c) {
                j().add(i10, e10);
            }
        }

        @Override // java.util.List
        public boolean addAll(int i10, Collection<? extends E> collection) {
            boolean zAddAll;
            synchronized (this.f30298c) {
                zAddAll = j().addAll(i10, collection);
            }
            return zAddAll;
        }

        @Override // java.util.Collection, java.util.List
        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f30298c) {
                zEquals = j().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.List
        public E get(int i10) {
            E e10;
            synchronized (this.f30298c) {
                e10 = (E) j().get(i10);
            }
            return e10;
        }

        @Override // java.util.Collection, java.util.List
        public int hashCode() {
            int iHashCode;
            synchronized (this.f30298c) {
                iHashCode = j().hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.List
        public int indexOf(Object obj) {
            int iIndexOf;
            synchronized (this.f30298c) {
                iIndexOf = j().indexOf(obj);
            }
            return iIndexOf;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedCollection
        public List j() {
            return (List) super.j();
        }

        @Override // java.util.List
        public int lastIndexOf(Object obj) {
            int iLastIndexOf;
            synchronized (this.f30298c) {
                iLastIndexOf = j().lastIndexOf(obj);
            }
            return iLastIndexOf;
        }

        @Override // java.util.List
        public ListIterator<E> listIterator() {
            return j().listIterator();
        }

        @Override // java.util.List
        public E remove(int i10) {
            E e10;
            synchronized (this.f30298c) {
                e10 = (E) j().remove(i10);
            }
            return e10;
        }

        @Override // java.util.List
        public E set(int i10, E e10) {
            E e11;
            synchronized (this.f30298c) {
                e11 = (E) j().set(i10, e10);
            }
            return e11;
        }

        @Override // java.util.List
        public List<E> subList(int i10, int i11) {
            List<E> listJ;
            synchronized (this.f30298c) {
                listJ = Synchronized.j(j().subList(i10, i11), this.f30298c);
            }
            return listJ;
        }

        @Override // java.util.List
        public ListIterator<E> listIterator(int i10) {
            return j().listIterator(i10);
        }
    }

    static final class SynchronizedListMultimap<K, V> extends SynchronizedMultimap<K, V> implements ListMultimap<K, V> {
        SynchronizedListMultimap(ListMultimap listMultimap, Object obj) {
            super(listMultimap, obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public ListMultimap i() {
            return (ListMultimap) super.i();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public List<V> get(K k10) {
            List<V> listJ;
            synchronized (this.f30298c) {
                listJ = Synchronized.j(i().get((Object) k10), this.f30298c);
            }
            return listJ;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public List<V> removeAll(Object obj) {
            List<V> listRemoveAll;
            synchronized (this.f30298c) {
                listRemoveAll = i().removeAll(obj);
            }
            return listRemoveAll;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public List<V> replaceValues(K k10, Iterable<? extends V> iterable) {
            List<V> listReplaceValues;
            synchronized (this.f30298c) {
                listReplaceValues = i().replaceValues((Object) k10, (Iterable) iterable);
            }
            return listReplaceValues;
        }
    }

    static class SynchronizedMap<K, V> extends SynchronizedObject implements Map<K, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        transient Set f30283d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        transient Collection f30284e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        transient Set f30285f;

        SynchronizedMap(Map map, Object obj) {
            super(map, obj);
        }

        @Override // java.util.Map
        public void clear() {
            synchronized (this.f30298c) {
                j().clear();
            }
        }

        @Override // java.util.Map
        public boolean containsKey(Object obj) {
            boolean zContainsKey;
            synchronized (this.f30298c) {
                zContainsKey = j().containsKey(obj);
            }
            return zContainsKey;
        }

        public boolean containsValue(Object obj) {
            boolean zContainsValue;
            synchronized (this.f30298c) {
                zContainsValue = j().containsValue(obj);
            }
            return zContainsValue;
        }

        public Set<Map.Entry<K, V>> entrySet() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.f30298c) {
                try {
                    if (this.f30285f == null) {
                        this.f30285f = Synchronized.u(j().entrySet(), this.f30298c);
                    }
                    set = this.f30285f;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // java.util.Map
        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f30298c) {
                zEquals = j().equals(obj);
            }
            return zEquals;
        }

        public V get(Object obj) {
            V v10;
            synchronized (this.f30298c) {
                v10 = (V) j().get(obj);
            }
            return v10;
        }

        @Override // java.util.Map
        public int hashCode() {
            int iHashCode;
            synchronized (this.f30298c) {
                iHashCode = j().hashCode();
            }
            return iHashCode;
        }

        /* JADX INFO: renamed from: i */
        Map j() {
            return (Map) super.g();
        }

        @Override // java.util.Map
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f30298c) {
                zIsEmpty = j().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // java.util.Map
        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.f30298c) {
                try {
                    if (this.f30283d == null) {
                        this.f30283d = Synchronized.u(j().keySet(), this.f30298c);
                    }
                    set = this.f30283d;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // java.util.Map
        public V put(K k10, V v10) {
            V v11;
            synchronized (this.f30298c) {
                v11 = (V) j().put(k10, v10);
            }
            return v11;
        }

        @Override // java.util.Map
        public void putAll(Map<? extends K, ? extends V> map) {
            synchronized (this.f30298c) {
                j().putAll(map);
            }
        }

        @Override // java.util.Map
        public V remove(Object obj) {
            V v10;
            synchronized (this.f30298c) {
                v10 = (V) j().remove(obj);
            }
            return v10;
        }

        @Override // java.util.Map
        public int size() {
            int size;
            synchronized (this.f30298c) {
                size = j().size();
            }
            return size;
        }

        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.f30298c) {
                try {
                    if (this.f30284e == null) {
                        this.f30284e = Synchronized.h(j().values(), this.f30298c);
                    }
                    collection = this.f30284e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return collection;
        }
    }

    static class SynchronizedObject implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object f30297b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Object f30298c;

        SynchronizedObject(Object obj, Object obj2) {
            this.f30297b = Preconditions.checkNotNull(obj);
            this.f30298c = obj2 == null ? this : obj2;
        }

        @J2ktIncompatible
        @GwtIncompatible
        private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
            synchronized (this.f30298c) {
                objectOutputStream.defaultWriteObject();
            }
        }

        Object g() {
            return this.f30297b;
        }

        public String toString() {
            String string;
            synchronized (this.f30298c) {
                string = this.f30297b.toString();
            }
            return string;
        }
    }

    static class SynchronizedQueue<E> extends SynchronizedCollection<E> implements Queue<E> {
        SynchronizedQueue(Queue queue, Object obj) {
            super(queue, obj);
        }

        @Override // java.util.Queue
        public E element() {
            E e10;
            synchronized (this.f30298c) {
                e10 = (E) j().element();
            }
            return e10;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedCollection
        public Queue j() {
            return (Queue) super.j();
        }

        @Override // java.util.Queue
        public boolean offer(E e10) {
            boolean zOffer;
            synchronized (this.f30298c) {
                zOffer = j().offer(e10);
            }
            return zOffer;
        }

        @Override // java.util.Queue
        public E peek() {
            E e10;
            synchronized (this.f30298c) {
                e10 = (E) j().peek();
            }
            return e10;
        }

        @Override // java.util.Queue
        public E poll() {
            E e10;
            synchronized (this.f30298c) {
                e10 = (E) j().poll();
            }
            return e10;
        }

        @Override // java.util.Queue
        public E remove() {
            E e10;
            synchronized (this.f30298c) {
                e10 = (E) j().remove();
            }
            return e10;
        }
    }

    static final class SynchronizedRandomAccessList<E> extends SynchronizedList<E> implements RandomAccess {
        SynchronizedRandomAccessList(List list, Object obj) {
            super(list, obj);
        }
    }

    static class SynchronizedSet<E> extends SynchronizedCollection<E> implements Set<E> {
        SynchronizedSet(Set set, Object obj) {
            super(set, obj);
        }

        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f30298c) {
                zEquals = j().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int iHashCode;
            synchronized (this.f30298c) {
                iHashCode = j().hashCode();
            }
            return iHashCode;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedCollection
        public Set j() {
            return (Set) super.j();
        }
    }

    static class SynchronizedSetMultimap<K, V> extends SynchronizedMultimap<K, V> implements SetMultimap<K, V> {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        transient Set f30299i;

        SynchronizedSetMultimap(SetMultimap setMultimap, Object obj) {
            super(setMultimap, obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public SetMultimap i() {
            return (SetMultimap) super.i();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap
        public Set<Map.Entry<K, V>> entries() {
            Set<Map.Entry<K, V>> set;
            synchronized (this.f30298c) {
                try {
                    if (this.f30299i == null) {
                        this.f30299i = Synchronized.u(i().entries(), this.f30298c);
                    }
                    set = this.f30299i;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set<V> get(K k10) {
            Set<V> setU;
            synchronized (this.f30298c) {
                setU = Synchronized.u(i().get((Object) k10), this.f30298c);
            }
            return setU;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set<V> removeAll(Object obj) {
            Set<V> setRemoveAll;
            synchronized (this.f30298c) {
                setRemoveAll = i().removeAll(obj);
            }
            return setRemoveAll;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Set<V> replaceValues(K k10, Iterable<? extends V> iterable) {
            Set<V> setReplaceValues;
            synchronized (this.f30298c) {
                setReplaceValues = i().replaceValues((Object) k10, (Iterable) iterable);
            }
            return setReplaceValues;
        }
    }

    static class SynchronizedSortedMap<K, V> extends SynchronizedMap<K, V> implements SortedMap<K, V> {
        SynchronizedSortedMap(SortedMap sortedMap, Object obj) {
            super(sortedMap, obj);
        }

        @Override // java.util.SortedMap
        public Comparator<? super K> comparator() {
            Comparator<? super K> comparator;
            synchronized (this.f30298c) {
                comparator = j().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedMap
        public K firstKey() {
            K k10;
            synchronized (this.f30298c) {
                k10 = (K) j().firstKey();
            }
            return k10;
        }

        public SortedMap<K, V> headMap(K k10) {
            SortedMap<K, V> sortedMapW;
            synchronized (this.f30298c) {
                sortedMapW = Synchronized.w(j().headMap(k10), this.f30298c);
            }
            return sortedMapW;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedMap
        public SortedMap j() {
            return (SortedMap) super.j();
        }

        @Override // java.util.SortedMap
        public K lastKey() {
            K k10;
            synchronized (this.f30298c) {
                k10 = (K) j().lastKey();
            }
            return k10;
        }

        public SortedMap<K, V> subMap(K k10, K k11) {
            SortedMap<K, V> sortedMapW;
            synchronized (this.f30298c) {
                sortedMapW = Synchronized.w(j().subMap(k10, k11), this.f30298c);
            }
            return sortedMapW;
        }

        public SortedMap<K, V> tailMap(K k10) {
            SortedMap<K, V> sortedMapW;
            synchronized (this.f30298c) {
                sortedMapW = Synchronized.w(j().tailMap(k10), this.f30298c);
            }
            return sortedMapW;
        }
    }

    static class SynchronizedSortedSet<E> extends SynchronizedSet<E> implements SortedSet<E> {
        SynchronizedSortedSet(SortedSet sortedSet, Object obj) {
            super(sortedSet, obj);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            Comparator<? super E> comparator;
            synchronized (this.f30298c) {
                comparator = j().comparator();
            }
            return comparator;
        }

        @Override // java.util.SortedSet
        public E first() {
            E e10;
            synchronized (this.f30298c) {
                e10 = (E) j().first();
            }
            return e10;
        }

        public SortedSet<E> headSet(E e10) {
            SortedSet<E> sortedSetX;
            synchronized (this.f30298c) {
                sortedSetX = Synchronized.x(j().headSet(e10), this.f30298c);
            }
            return sortedSetX;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedSet
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public SortedSet j() {
            return (SortedSet) super.j();
        }

        @Override // java.util.SortedSet
        public E last() {
            E e10;
            synchronized (this.f30298c) {
                e10 = (E) j().last();
            }
            return e10;
        }

        public SortedSet<E> subSet(E e10, E e11) {
            SortedSet<E> sortedSetX;
            synchronized (this.f30298c) {
                sortedSetX = Synchronized.x(j().subSet(e10, e11), this.f30298c);
            }
            return sortedSetX;
        }

        public SortedSet<E> tailSet(E e10) {
            SortedSet<E> sortedSetX;
            synchronized (this.f30298c) {
                sortedSetX = Synchronized.x(j().tailSet(e10), this.f30298c);
            }
            return sortedSetX;
        }
    }

    static final class SynchronizedTable<R, C, V> extends SynchronizedObject implements Table<R, C, V> {
        SynchronizedTable(Table table, Object obj) {
            super(table, obj);
        }

        @Override // com.google.common.collect.Table
        public Set<Table.Cell<R, C, V>> cellSet() {
            Set<Table.Cell<R, C, V>> setU;
            synchronized (this.f30298c) {
                setU = Synchronized.u(i().cellSet(), this.f30298c);
            }
            return setU;
        }

        @Override // com.google.common.collect.Table
        public void clear() {
            synchronized (this.f30298c) {
                i().clear();
            }
        }

        @Override // com.google.common.collect.Table
        public Map<R, V> column(@ParametricNullness C c10) {
            Map<R, V> mapL;
            synchronized (this.f30298c) {
                mapL = Synchronized.l(i().column(c10), this.f30298c);
            }
            return mapL;
        }

        @Override // com.google.common.collect.Table
        public Set<C> columnKeySet() {
            Set<C> setU;
            synchronized (this.f30298c) {
                setU = Synchronized.u(i().columnKeySet(), this.f30298c);
            }
            return setU;
        }

        @Override // com.google.common.collect.Table
        public Map<C, Map<R, V>> columnMap() {
            Map<C, Map<R, V>> mapL;
            synchronized (this.f30298c) {
                mapL = Synchronized.l(Maps.transformValues(i().columnMap(), new Function<Map<R, V>, Map<R, V>>() { // from class: com.google.common.collect.Synchronized.SynchronizedTable.2
                    @Override // com.google.common.base.Function
                    public Map<R, V> apply(Map<R, V> map) {
                        return Synchronized.l(map, SynchronizedTable.this.f30298c);
                    }
                }), this.f30298c);
            }
            return mapL;
        }

        @Override // com.google.common.collect.Table
        public boolean contains(Object obj, Object obj2) {
            boolean zContains;
            synchronized (this.f30298c) {
                zContains = i().contains(obj, obj2);
            }
            return zContains;
        }

        @Override // com.google.common.collect.Table
        public boolean containsColumn(Object obj) {
            boolean zContainsColumn;
            synchronized (this.f30298c) {
                zContainsColumn = i().containsColumn(obj);
            }
            return zContainsColumn;
        }

        @Override // com.google.common.collect.Table
        public boolean containsRow(Object obj) {
            boolean zContainsRow;
            synchronized (this.f30298c) {
                zContainsRow = i().containsRow(obj);
            }
            return zContainsRow;
        }

        @Override // com.google.common.collect.Table
        public boolean containsValue(Object obj) {
            boolean zContainsValue;
            synchronized (this.f30298c) {
                zContainsValue = i().containsValue(obj);
            }
            return zContainsValue;
        }

        @Override // com.google.common.collect.Table
        public boolean equals(Object obj) {
            boolean zEquals;
            if (this == obj) {
                return true;
            }
            synchronized (this.f30298c) {
                zEquals = i().equals(obj);
            }
            return zEquals;
        }

        @Override // com.google.common.collect.Table
        public V get(Object obj, Object obj2) {
            V v10;
            synchronized (this.f30298c) {
                v10 = (V) i().get(obj, obj2);
            }
            return v10;
        }

        @Override // com.google.common.collect.Table
        public int hashCode() {
            int iHashCode;
            synchronized (this.f30298c) {
                iHashCode = i().hashCode();
            }
            return iHashCode;
        }

        Table i() {
            return (Table) super.g();
        }

        @Override // com.google.common.collect.Table
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f30298c) {
                zIsEmpty = i().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // com.google.common.collect.Table
        public V put(@ParametricNullness R r10, @ParametricNullness C c10, @ParametricNullness V v10) {
            V v11;
            synchronized (this.f30298c) {
                v11 = (V) i().put(r10, c10, v10);
            }
            return v11;
        }

        @Override // com.google.common.collect.Table
        public void putAll(Table<? extends R, ? extends C, ? extends V> table) {
            synchronized (this.f30298c) {
                i().putAll(table);
            }
        }

        @Override // com.google.common.collect.Table
        public V remove(Object obj, Object obj2) {
            V v10;
            synchronized (this.f30298c) {
                v10 = (V) i().remove(obj, obj2);
            }
            return v10;
        }

        @Override // com.google.common.collect.Table
        public Map<C, V> row(@ParametricNullness R r10) {
            Map<C, V> mapL;
            synchronized (this.f30298c) {
                mapL = Synchronized.l(i().row(r10), this.f30298c);
            }
            return mapL;
        }

        @Override // com.google.common.collect.Table
        public Set<R> rowKeySet() {
            Set<R> setU;
            synchronized (this.f30298c) {
                setU = Synchronized.u(i().rowKeySet(), this.f30298c);
            }
            return setU;
        }

        @Override // com.google.common.collect.Table
        public Map<R, Map<C, V>> rowMap() {
            Map<R, Map<C, V>> mapL;
            synchronized (this.f30298c) {
                mapL = Synchronized.l(Maps.transformValues(i().rowMap(), new Function<Map<C, V>, Map<C, V>>() { // from class: com.google.common.collect.Synchronized.SynchronizedTable.1
                    @Override // com.google.common.base.Function
                    public Map<C, V> apply(Map<C, V> map) {
                        return Synchronized.l(map, SynchronizedTable.this.f30298c);
                    }
                }), this.f30298c);
            }
            return mapL;
        }

        @Override // com.google.common.collect.Table
        public int size() {
            int size;
            synchronized (this.f30298c) {
                size = i().size();
            }
            return size;
        }

        @Override // com.google.common.collect.Table
        public Collection<V> values() {
            Collection<V> collectionH;
            synchronized (this.f30298c) {
                collectionH = Synchronized.h(i().values(), this.f30298c);
            }
            return collectionH;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Collection A(Collection collection, Object obj) {
        return collection instanceof SortedSet ? x((SortedSet) collection, obj) : collection instanceof Set ? u((Set) collection, obj) : collection instanceof List ? j((List) collection, obj) : h(collection, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Set B(Set set, Object obj) {
        return set instanceof SortedSet ? x((SortedSet) set, obj) : u(set, obj);
    }

    static BiMap g(BiMap biMap, Object obj) {
        return ((biMap instanceof SynchronizedBiMap) || (biMap instanceof ImmutableBiMap)) ? biMap : new SynchronizedBiMap(biMap, obj, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Collection h(Collection collection, Object obj) {
        return new SynchronizedCollection(collection, obj);
    }

    static Deque i(Deque deque, Object obj) {
        return new SynchronizedDeque(deque, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static List j(List list, Object obj) {
        return list instanceof RandomAccess ? new SynchronizedRandomAccessList(list, obj) : new SynchronizedList(list, obj);
    }

    static ListMultimap k(ListMultimap listMultimap, Object obj) {
        return ((listMultimap instanceof SynchronizedListMultimap) || (listMultimap instanceof BaseImmutableMultimap)) ? listMultimap : new SynchronizedListMultimap(listMultimap, obj);
    }

    static Map l(Map map, Object obj) {
        return new SynchronizedMap(map, obj);
    }

    static Multimap m(Multimap multimap, Object obj) {
        return ((multimap instanceof SynchronizedMultimap) || (multimap instanceof BaseImmutableMultimap)) ? multimap : new SynchronizedMultimap(multimap, obj);
    }

    static Multiset n(Multiset multiset, Object obj) {
        return ((multiset instanceof SynchronizedMultiset) || (multiset instanceof ImmutableMultiset)) ? multiset : new SynchronizedMultiset(multiset, obj);
    }

    static NavigableMap o(NavigableMap navigableMap) {
        return p(navigableMap, null);
    }

    static NavigableMap p(NavigableMap navigableMap, Object obj) {
        return new SynchronizedNavigableMap(navigableMap, obj);
    }

    static NavigableSet q(NavigableSet navigableSet) {
        return r(navigableSet, null);
    }

    static NavigableSet r(NavigableSet navigableSet, Object obj) {
        return new SynchronizedNavigableSet(navigableSet, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Map.Entry s(Map.Entry entry, Object obj) {
        if (entry == null) {
            return null;
        }
        return new SynchronizedEntry(entry, obj);
    }

    static Queue t(Queue queue, Object obj) {
        return queue instanceof SynchronizedQueue ? queue : new SynchronizedQueue(queue, obj);
    }

    static Set u(Set set, Object obj) {
        return new SynchronizedSet(set, obj);
    }

    static SetMultimap v(SetMultimap setMultimap, Object obj) {
        return ((setMultimap instanceof SynchronizedSetMultimap) || (setMultimap instanceof BaseImmutableMultimap)) ? setMultimap : new SynchronizedSetMultimap(setMultimap, obj);
    }

    static SortedMap w(SortedMap sortedMap, Object obj) {
        return new SynchronizedSortedMap(sortedMap, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static SortedSet x(SortedSet sortedSet, Object obj) {
        return new SynchronizedSortedSet(sortedSet, obj);
    }

    static SortedSetMultimap y(SortedSetMultimap sortedSetMultimap, Object obj) {
        return sortedSetMultimap instanceof SynchronizedSortedSetMultimap ? sortedSetMultimap : new SynchronizedSortedSetMultimap(sortedSetMultimap, obj);
    }

    static Table z(Table table, Object obj) {
        return new SynchronizedTable(table, obj);
    }

    static final class SynchronizedSortedSetMultimap<K, V> extends SynchronizedSetMultimap<K, V> implements SortedSetMultimap<K, V> {
        SynchronizedSortedSetMultimap(SortedSetMultimap sortedSetMultimap, Object obj) {
            super(sortedSetMultimap, obj);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public SortedSetMultimap i() {
            return (SortedSetMultimap) super.i();
        }

        @Override // com.google.common.collect.SortedSetMultimap
        public Comparator<? super V> valueComparator() {
            Comparator<? super V> comparatorValueComparator;
            synchronized (this.f30298c) {
                comparatorValueComparator = i().valueComparator();
            }
            return comparatorValueComparator;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public SortedSet<V> get(K k10) {
            SortedSet<V> sortedSetX;
            synchronized (this.f30298c) {
                sortedSetX = Synchronized.x(i().get((Object) k10), this.f30298c);
            }
            return sortedSetX;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public SortedSet<V> removeAll(Object obj) {
            SortedSet<V> sortedSetRemoveAll;
            synchronized (this.f30298c) {
                sortedSetRemoveAll = i().removeAll(obj);
            }
            return sortedSetRemoveAll;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSetMultimap, com.google.common.collect.Synchronized.SynchronizedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public SortedSet<V> replaceValues(K k10, Iterable<? extends V> iterable) {
            SortedSet<V> sortedSetReplaceValues;
            synchronized (this.f30298c) {
                sortedSetReplaceValues = i().replaceValues((Object) k10, (Iterable) iterable);
            }
            return sortedSetReplaceValues;
        }
    }

    static final class SynchronizedAsMapEntries<K, V> extends SynchronizedSet<Map.Entry<K, Collection<V>>> {
        SynchronizedAsMapEntries(Set set, Object obj) {
            super(set, obj);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            boolean zL;
            synchronized (this.f30298c) {
                zL = Maps.l(j(), obj);
            }
            return zL;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean containsAll(Collection<?> collection) {
            boolean zB;
            synchronized (this.f30298c) {
                zB = Collections2.b(j(), collection);
            }
            return zB;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            boolean zA;
            if (obj == this) {
                return true;
            }
            synchronized (this.f30298c) {
                zA = Sets.a(j(), obj);
            }
            return zA;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, Collection<V>>> iterator() {
            return new TransformedIterator<Map.Entry<K, Collection<V>>, Map.Entry<K, Collection<V>>>(super.iterator()) { // from class: com.google.common.collect.Synchronized.SynchronizedAsMapEntries.1
                /* JADX INFO: Access modifiers changed from: package-private */
                @Override // com.google.common.collect.TransformedIterator
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public Map.Entry a(final Map.Entry entry) {
                    return new ForwardingMapEntry<K, Collection<V>>(this) { // from class: com.google.common.collect.Synchronized.SynchronizedAsMapEntries.1.1

                        /* JADX INFO: renamed from: c, reason: collision with root package name */
                        final /* synthetic */ AnonymousClass1 f30279c;

                        {
                            this.f30279c = this;
                        }

                        /* JADX INFO: Access modifiers changed from: protected */
                        @Override // com.google.common.collect.ForwardingMapEntry, com.google.common.collect.ForwardingObject
                        /* JADX INFO: renamed from: g */
                        public Map.Entry n() {
                            return entry;
                        }

                        @Override // com.google.common.collect.ForwardingMapEntry, java.util.Map.Entry
                        public Collection<V> getValue() {
                            return Synchronized.A((Collection) entry.getValue(), SynchronizedAsMapEntries.this.f30298c);
                        }
                    };
                }
            };
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            boolean zB;
            synchronized (this.f30298c) {
                zB = Maps.B(j(), obj);
            }
            return zB;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            boolean zRemoveAll;
            synchronized (this.f30298c) {
                zRemoveAll = Iterators.removeAll(j().iterator(), collection);
            }
            return zRemoveAll;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            boolean zRetainAll;
            synchronized (this.f30298c) {
                zRetainAll = Iterators.retainAll(j().iterator(), collection);
            }
            return zRetainAll;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            Object[] objArrE;
            synchronized (this.f30298c) {
                objArrE = ObjectArrays.e(j());
            }
            return objArrE;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            T[] tArr2;
            synchronized (this.f30298c) {
                tArr2 = (T[]) ObjectArrays.f(j(), tArr);
            }
            return tArr2;
        }
    }

    static class SynchronizedMultimap<K, V> extends SynchronizedObject implements Multimap<K, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        transient Set f30286d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        transient Collection f30287e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        transient Collection f30288f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        transient Map f30289g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        transient Multiset f30290h;

        SynchronizedMultimap(Multimap multimap, Object obj) {
            super(multimap, obj);
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public Map<K, Collection<V>> asMap() {
            Map<K, Collection<V>> map;
            synchronized (this.f30298c) {
                try {
                    if (this.f30289g == null) {
                        this.f30289g = new SynchronizedAsMap(i().asMap(), this.f30298c);
                    }
                    map = this.f30289g;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return map;
        }

        @Override // com.google.common.collect.Multimap
        public void clear() {
            synchronized (this.f30298c) {
                i().clear();
            }
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsEntry(Object obj, Object obj2) {
            boolean zContainsEntry;
            synchronized (this.f30298c) {
                zContainsEntry = i().containsEntry(obj, obj2);
            }
            return zContainsEntry;
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsKey(Object obj) {
            boolean zContainsKey;
            synchronized (this.f30298c) {
                zContainsKey = i().containsKey(obj);
            }
            return zContainsKey;
        }

        @Override // com.google.common.collect.Multimap
        public boolean containsValue(Object obj) {
            boolean zContainsValue;
            synchronized (this.f30298c) {
                zContainsValue = i().containsValue(obj);
            }
            return zContainsValue;
        }

        @Override // com.google.common.collect.Multimap
        public Collection<Map.Entry<K, V>> entries() {
            Collection<Map.Entry<K, V>> collection;
            synchronized (this.f30298c) {
                try {
                    if (this.f30288f == null) {
                        this.f30288f = Synchronized.A(i().entries(), this.f30298c);
                    }
                    collection = this.f30288f;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return collection;
        }

        @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f30298c) {
                zEquals = i().equals(obj);
            }
            return zEquals;
        }

        public Collection<V> get(@ParametricNullness K k10) {
            Collection<V> collectionA;
            synchronized (this.f30298c) {
                collectionA = Synchronized.A(i().get(k10), this.f30298c);
            }
            return collectionA;
        }

        @Override // com.google.common.collect.Multimap
        public int hashCode() {
            int iHashCode;
            synchronized (this.f30298c) {
                iHashCode = i().hashCode();
            }
            return iHashCode;
        }

        Multimap i() {
            return (Multimap) super.g();
        }

        @Override // com.google.common.collect.Multimap
        public boolean isEmpty() {
            boolean zIsEmpty;
            synchronized (this.f30298c) {
                zIsEmpty = i().isEmpty();
            }
            return zIsEmpty;
        }

        @Override // com.google.common.collect.Multimap
        public Set<K> keySet() {
            Set<K> set;
            synchronized (this.f30298c) {
                try {
                    if (this.f30286d == null) {
                        this.f30286d = Synchronized.B(i().keySet(), this.f30298c);
                    }
                    set = this.f30286d;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // com.google.common.collect.Multimap
        public Multiset<K> keys() {
            Multiset<K> multiset;
            synchronized (this.f30298c) {
                try {
                    if (this.f30290h == null) {
                        this.f30290h = Synchronized.n(i().keys(), this.f30298c);
                    }
                    multiset = this.f30290h;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return multiset;
        }

        @Override // com.google.common.collect.Multimap
        public boolean put(@ParametricNullness K k10, @ParametricNullness V v10) {
            boolean zPut;
            synchronized (this.f30298c) {
                zPut = i().put(k10, v10);
            }
            return zPut;
        }

        @Override // com.google.common.collect.Multimap
        public boolean putAll(@ParametricNullness K k10, Iterable<? extends V> iterable) {
            boolean zPutAll;
            synchronized (this.f30298c) {
                zPutAll = i().putAll(k10, iterable);
            }
            return zPutAll;
        }

        @Override // com.google.common.collect.Multimap
        public boolean remove(Object obj, Object obj2) {
            boolean zRemove;
            synchronized (this.f30298c) {
                zRemove = i().remove(obj, obj2);
            }
            return zRemove;
        }

        public Collection<V> removeAll(Object obj) {
            Collection<V> collectionRemoveAll;
            synchronized (this.f30298c) {
                collectionRemoveAll = i().removeAll(obj);
            }
            return collectionRemoveAll;
        }

        public Collection<V> replaceValues(@ParametricNullness K k10, Iterable<? extends V> iterable) {
            Collection<V> collectionReplaceValues;
            synchronized (this.f30298c) {
                collectionReplaceValues = i().replaceValues(k10, iterable);
            }
            return collectionReplaceValues;
        }

        @Override // com.google.common.collect.Multimap
        public int size() {
            int size;
            synchronized (this.f30298c) {
                size = i().size();
            }
            return size;
        }

        @Override // com.google.common.collect.Multimap
        public Collection<V> values() {
            Collection<V> collection;
            synchronized (this.f30298c) {
                try {
                    if (this.f30287e == null) {
                        this.f30287e = Synchronized.h(i().values(), this.f30298c);
                    }
                    collection = this.f30287e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return collection;
        }

        @Override // com.google.common.collect.Multimap
        public boolean putAll(Multimap<? extends K, ? extends V> multimap) {
            boolean zPutAll;
            synchronized (this.f30298c) {
                zPutAll = i().putAll(multimap);
            }
            return zPutAll;
        }
    }

    static final class SynchronizedMultiset<E> extends SynchronizedCollection<E> implements Multiset<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        transient Set f30291d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        transient Set f30292e;

        SynchronizedMultiset(Multiset multiset, Object obj) {
            super(multiset, obj);
        }

        @Override // com.google.common.collect.Multiset
        public int add(@ParametricNullness E e10, int i10) {
            int iAdd;
            synchronized (this.f30298c) {
                iAdd = j().add(e10, i10);
            }
            return iAdd;
        }

        @Override // com.google.common.collect.Multiset
        public int count(Object obj) {
            int iCount;
            synchronized (this.f30298c) {
                iCount = j().count(obj);
            }
            return iCount;
        }

        @Override // com.google.common.collect.Multiset
        public Set<E> elementSet() {
            Set<E> set;
            synchronized (this.f30298c) {
                try {
                    if (this.f30291d == null) {
                        this.f30291d = Synchronized.B(j().elementSet(), this.f30298c);
                    }
                    set = this.f30291d;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // com.google.common.collect.Multiset
        public Set<Multiset.Entry<E>> entrySet() {
            Set<Multiset.Entry<E>> set;
            synchronized (this.f30298c) {
                try {
                    if (this.f30292e == null) {
                        this.f30292e = Synchronized.B(j().entrySet(), this.f30298c);
                    }
                    set = this.f30292e;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return set;
        }

        @Override // java.util.Collection, com.google.common.collect.Multiset
        public boolean equals(Object obj) {
            boolean zEquals;
            if (obj == this) {
                return true;
            }
            synchronized (this.f30298c) {
                zEquals = j().equals(obj);
            }
            return zEquals;
        }

        @Override // java.util.Collection, com.google.common.collect.Multiset
        public int hashCode() {
            int iHashCode;
            synchronized (this.f30298c) {
                iHashCode = j().hashCode();
            }
            return iHashCode;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedCollection
        public Multiset j() {
            return (Multiset) super.j();
        }

        @Override // com.google.common.collect.Multiset
        public int remove(Object obj, int i10) {
            int iRemove;
            synchronized (this.f30298c) {
                iRemove = j().remove(obj, i10);
            }
            return iRemove;
        }

        @Override // com.google.common.collect.Multiset
        public int setCount(@ParametricNullness E e10, int i10) {
            int count;
            synchronized (this.f30298c) {
                count = j().setCount(e10, i10);
            }
            return count;
        }

        @Override // com.google.common.collect.Multiset
        public boolean setCount(@ParametricNullness E e10, int i10, int i11) {
            boolean count;
            synchronized (this.f30298c) {
                count = j().setCount(e10, i10, i11);
            }
            return count;
        }
    }

    @GwtIncompatible
    @VisibleForTesting
    static final class SynchronizedNavigableMap<K, V> extends SynchronizedSortedMap<K, V> implements NavigableMap<K, V> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        transient NavigableSet f30293g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        transient NavigableMap f30294h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        transient NavigableSet f30295i;

        SynchronizedNavigableMap(NavigableMap navigableMap, Object obj) {
            super(navigableMap, obj);
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> ceilingEntry(K k10) {
            Map.Entry<K, V> entryS;
            synchronized (this.f30298c) {
                entryS = Synchronized.s(i().ceilingEntry(k10), this.f30298c);
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        public K ceilingKey(K k10) {
            K k11;
            synchronized (this.f30298c) {
                k11 = (K) i().ceilingKey(k10);
            }
            return k11;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> descendingKeySet() {
            synchronized (this.f30298c) {
                try {
                    NavigableSet<K> navigableSet = this.f30293g;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    NavigableSet<K> navigableSetR = Synchronized.r(i().descendingKeySet(), this.f30298c);
                    this.f30293g = navigableSetR;
                    return navigableSetR;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> descendingMap() {
            synchronized (this.f30298c) {
                try {
                    NavigableMap<K, V> navigableMap = this.f30294h;
                    if (navigableMap != null) {
                        return navigableMap;
                    }
                    NavigableMap<K, V> navigableMapP = Synchronized.p(i().descendingMap(), this.f30298c);
                    this.f30294h = navigableMapP;
                    return navigableMapP;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> firstEntry() {
            Map.Entry<K, V> entryS;
            synchronized (this.f30298c) {
                entryS = Synchronized.s(i().firstEntry(), this.f30298c);
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> floorEntry(K k10) {
            Map.Entry<K, V> entryS;
            synchronized (this.f30298c) {
                entryS = Synchronized.s(i().floorEntry(k10), this.f30298c);
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        public K floorKey(K k10) {
            K k11;
            synchronized (this.f30298c) {
                k11 = (K) i().floorKey(k10);
            }
            return k11;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> headMap(K k10, boolean z10) {
            NavigableMap<K, V> navigableMapP;
            synchronized (this.f30298c) {
                navigableMapP = Synchronized.p(i().headMap(k10, z10), this.f30298c);
            }
            return navigableMapP;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> higherEntry(K k10) {
            Map.Entry<K, V> entryS;
            synchronized (this.f30298c) {
                entryS = Synchronized.s(i().higherEntry(k10), this.f30298c);
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        public K higherKey(K k10) {
            K k11;
            synchronized (this.f30298c) {
                k11 = (K) i().higherKey(k10);
            }
            return k11;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableMap j() {
            return (NavigableMap) super.j();
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedMap, java.util.Map
        public Set<K> keySet() {
            return navigableKeySet();
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lastEntry() {
            Map.Entry<K, V> entryS;
            synchronized (this.f30298c) {
                entryS = Synchronized.s(i().lastEntry(), this.f30298c);
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> lowerEntry(K k10) {
            Map.Entry<K, V> entryS;
            synchronized (this.f30298c) {
                entryS = Synchronized.s(i().lowerEntry(k10), this.f30298c);
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        public K lowerKey(K k10) {
            K k11;
            synchronized (this.f30298c) {
                k11 = (K) i().lowerKey(k10);
            }
            return k11;
        }

        @Override // java.util.NavigableMap
        public NavigableSet<K> navigableKeySet() {
            synchronized (this.f30298c) {
                try {
                    NavigableSet<K> navigableSet = this.f30295i;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    NavigableSet<K> navigableSetR = Synchronized.r(i().navigableKeySet(), this.f30298c);
                    this.f30295i = navigableSetR;
                    return navigableSetR;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollFirstEntry() {
            Map.Entry<K, V> entryS;
            synchronized (this.f30298c) {
                entryS = Synchronized.s(i().pollFirstEntry(), this.f30298c);
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        public Map.Entry<K, V> pollLastEntry() {
            Map.Entry<K, V> entryS;
            synchronized (this.f30298c) {
                entryS = Synchronized.s(i().pollLastEntry(), this.f30298c);
            }
            return entryS;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> subMap(K k10, boolean z10, K k11, boolean z11) {
            NavigableMap<K, V> navigableMapP;
            synchronized (this.f30298c) {
                navigableMapP = Synchronized.p(i().subMap(k10, z10, k11, z11), this.f30298c);
            }
            return navigableMapP;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<K, V> tailMap(K k10, boolean z10) {
            NavigableMap<K, V> navigableMapP;
            synchronized (this.f30298c) {
                navigableMapP = Synchronized.p(i().tailMap(k10, z10), this.f30298c);
            }
            return navigableMapP;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> headMap(K k10) {
            return headMap(k10, false);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> subMap(K k10, K k11) {
            return subMap(k10, true, k11, false);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedMap, java.util.SortedMap, java.util.NavigableMap
        public SortedMap<K, V> tailMap(K k10) {
            return tailMap(k10, true);
        }
    }

    @GwtIncompatible
    @VisibleForTesting
    static final class SynchronizedNavigableSet<E> extends SynchronizedSortedSet<E> implements NavigableSet<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        transient NavigableSet f30296d;

        SynchronizedNavigableSet(NavigableSet navigableSet, Object obj) {
            super(navigableSet, obj);
        }

        @Override // java.util.NavigableSet
        public E ceiling(E e10) {
            E e11;
            synchronized (this.f30298c) {
                e11 = (E) j().ceiling(e10);
            }
            return e11;
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return j().descendingIterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            synchronized (this.f30298c) {
                try {
                    NavigableSet<E> navigableSet = this.f30296d;
                    if (navigableSet != null) {
                        return navigableSet;
                    }
                    NavigableSet<E> navigableSetR = Synchronized.r(j().descendingSet(), this.f30298c);
                    this.f30296d = navigableSetR;
                    return navigableSetR;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.util.NavigableSet
        public E floor(E e10) {
            E e11;
            synchronized (this.f30298c) {
                e11 = (E) j().floor(e10);
            }
            return e11;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(E e10, boolean z10) {
            NavigableSet<E> navigableSetR;
            synchronized (this.f30298c) {
                navigableSetR = Synchronized.r(j().headSet(e10, z10), this.f30298c);
            }
            return navigableSetR;
        }

        @Override // java.util.NavigableSet
        public E higher(E e10) {
            E e11;
            synchronized (this.f30298c) {
                e11 = (E) j().higher(e10);
            }
            return e11;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet
        /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet j() {
            return (NavigableSet) super.j();
        }

        @Override // java.util.NavigableSet
        public E lower(E e10) {
            E e11;
            synchronized (this.f30298c) {
                e11 = (E) j().lower(e10);
            }
            return e11;
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            E e10;
            synchronized (this.f30298c) {
                e10 = (E) j().pollFirst();
            }
            return e10;
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            E e10;
            synchronized (this.f30298c) {
                e10 = (E) j().pollLast();
            }
            return e10;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(E e10, boolean z10, E e11, boolean z11) {
            NavigableSet<E> navigableSetR;
            synchronized (this.f30298c) {
                navigableSetR = Synchronized.r(j().subSet(e10, z10, e11, z11), this.f30298c);
            }
            return navigableSetR;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(E e10, boolean z10) {
            NavigableSet<E> navigableSetR;
            synchronized (this.f30298c) {
                navigableSetR = Synchronized.r(j().tailSet(e10, z10), this.f30298c);
            }
            return navigableSetR;
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> headSet(E e10) {
            return headSet(e10, false);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> tailSet(E e10) {
            return tailSet(e10, true);
        }

        @Override // com.google.common.collect.Synchronized.SynchronizedSortedSet, java.util.SortedSet, java.util.NavigableSet
        public SortedSet<E> subSet(E e10, E e11) {
            return subSet(e10, true, e11, false);
        }
    }
}
