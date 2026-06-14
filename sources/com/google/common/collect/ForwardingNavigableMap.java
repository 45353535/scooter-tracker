package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Maps;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes9.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingNavigableMap<K, V> extends ForwardingSortedMap<K, V> implements NavigableMap<K, V> {

    protected class StandardDescendingMap extends Maps.DescendingMap<K, V> {
        public StandardDescendingMap() {
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        protected Iterator i() {
            return new Iterator<Map.Entry<K, V>>() { // from class: com.google.common.collect.ForwardingNavigableMap.StandardDescendingMap.1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private Map.Entry f29496b = null;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private Map.Entry f29497c;

                {
                    this.f29497c = StandardDescendingMap.this.j().lastEntry();
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.f29497c != null;
                }

                @Override // java.util.Iterator
                public void remove() {
                    if (this.f29496b == null) {
                        throw new IllegalStateException("no calls to next() since the last call to remove()");
                    }
                    StandardDescendingMap.this.j().remove(this.f29496b.getKey());
                    this.f29496b = null;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Iterator
                public Map.Entry<K, V> next() {
                    Map.Entry<K, V> entry = this.f29497c;
                    if (entry == null) {
                        throw new NoSuchElementException();
                    }
                    this.f29496b = entry;
                    this.f29497c = StandardDescendingMap.this.j().lowerEntry(this.f29497c.getKey());
                    return entry;
                }
            };
        }

        @Override // com.google.common.collect.Maps.DescendingMap
        NavigableMap j() {
            return ForwardingNavigableMap.this;
        }
    }

    protected class StandardNavigableKeySet extends Maps.NavigableKeySet<K, V> {
        public StandardNavigableKeySet() {
            super(ForwardingNavigableMap.this);
        }
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> ceilingEntry(@ParametricNullness K k10) {
        return n().ceilingEntry(k10);
    }

    @Override // java.util.NavigableMap
    public K ceilingKey(@ParametricNullness K k10) {
        return (K) n().ceilingKey(k10);
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> descendingKeySet() {
        return n().descendingKeySet();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> descendingMap() {
        return n().descendingMap();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> firstEntry() {
        return n().firstEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> floorEntry(@ParametricNullness K k10) {
        return n().floorEntry(k10);
    }

    @Override // java.util.NavigableMap
    public K floorKey(@ParametricNullness K k10) {
        return (K) n().floorKey(k10);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> headMap(@ParametricNullness K k10, boolean z10) {
        return n().headMap(k10, z10);
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> higherEntry(@ParametricNullness K k10) {
        return n().higherEntry(k10);
    }

    @Override // java.util.NavigableMap
    public K higherKey(@ParametricNullness K k10) {
        return (K) n().higherKey(k10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingSortedMap
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public abstract NavigableMap n();

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lastEntry() {
        return n().lastEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> lowerEntry(@ParametricNullness K k10) {
        return n().lowerEntry(k10);
    }

    @Override // java.util.NavigableMap
    public K lowerKey(@ParametricNullness K k10) {
        return (K) n().lowerKey(k10);
    }

    @Override // java.util.NavigableMap
    public NavigableSet<K> navigableKeySet() {
        return n().navigableKeySet();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> pollFirstEntry() {
        return n().pollFirstEntry();
    }

    @Override // java.util.NavigableMap
    public Map.Entry<K, V> pollLastEntry() {
        return n().pollLastEntry();
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> subMap(@ParametricNullness K k10, boolean z10, @ParametricNullness K k11, boolean z11) {
        return n().subMap(k10, z10, k11, z11);
    }

    @Override // java.util.NavigableMap
    public NavigableMap<K, V> tailMap(@ParametricNullness K k10, boolean z10) {
        return n().tailMap(k10, z10);
    }
}
