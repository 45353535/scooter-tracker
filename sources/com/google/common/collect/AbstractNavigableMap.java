package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes9.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractNavigableMap<K, V> extends Maps.IteratorBasedAbstractMap<K, V> implements NavigableMap<K, V> {

    private final class DescendingMap extends Maps.DescendingMap<K, V> {
        private DescendingMap() {
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        Iterator i() {
            return AbstractNavigableMap.this.b();
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        NavigableMap j() {
            return AbstractNavigableMap.this;
        }
    }

    AbstractNavigableMap() {
    }

    abstract Iterator b();

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> ceilingEntry(@ParametricNullness K k10) {
        return tailMap(k10, true).firstEntry();
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(@ParametricNullness K k10) {
        return (K) Maps.x(ceilingEntry(k10));
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
        return descendingMap().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> descendingMap() {
        return new DescendingMap();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> firstEntry() {
        return (Map.Entry) Iterators.getNext(a(), null);
    }

    @Override // java.util.SortedMap
    @ParametricNullness
    public K firstKey() {
        Map.Entry<K, V> entryFirstEntry = firstEntry();
        if (entryFirstEntry != null) {
            return entryFirstEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> floorEntry(@ParametricNullness K k10) {
        return headMap(k10, true).lastEntry();
    }

    @Override // java.util.NavigableMap
    public K floorKey(@ParametricNullness K k10) {
        return (K) Maps.x(floorEntry(k10));
    }

    @Override // java.util.AbstractMap, java.util.Map
    public abstract V get(Object obj);

    @Override // java.util.NavigableMap, java.util.SortedMap
    public SortedMap<K, V> headMap(@ParametricNullness K k10) {
        return headMap(k10, false);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> higherEntry(@ParametricNullness K k10) {
        return tailMap(k10, false).firstEntry();
    }

    @Override // java.util.NavigableMap
    public K higherKey(@ParametricNullness K k10) {
        return (K) Maps.x(higherEntry(k10));
    }

    @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
    public Set<K> keySet() {
        return navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lastEntry() {
        return (Map.Entry) Iterators.getNext(b(), null);
    }

    @Override // java.util.SortedMap
    @ParametricNullness
    public K lastKey() {
        Map.Entry<K, V> entryLastEntry = lastEntry();
        if (entryLastEntry != null) {
            return entryLastEntry.getKey();
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lowerEntry(@ParametricNullness K k10) {
        return headMap(k10, false).lastEntry();
    }

    @Override // java.util.NavigableMap
    public K lowerKey(@ParametricNullness K k10) {
        return (K) Maps.x(lowerEntry(k10));
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> navigableKeySet() {
        return new Maps.NavigableKeySet(this);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> pollFirstEntry() {
        return (Map.Entry) Iterators.j(a());
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> pollLastEntry() {
        return (Map.Entry) Iterators.j(b());
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
