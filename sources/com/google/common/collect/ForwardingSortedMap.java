package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.SortedMap;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedMap<K, V> extends ForwardingMap<K, V> implements SortedMap<K, V> {

    protected class StandardKeySet extends Maps.SortedKeySet<K, V> {
        public StandardKeySet() {
            super(ForwardingSortedMap.this);
        }
    }

    protected ForwardingSortedMap() {
    }

    static int i(Comparator comparator, Object obj, Object obj2) {
        return comparator == null ? ((Comparable) obj).compareTo(obj2) : comparator.compare(obj, obj2);
    }

    @Override // java.util.SortedMap
    public Comparator<? super K> comparator() {
        return n().comparator();
    }

    @Override // java.util.SortedMap
    @ParametricNullness
    public K firstKey() {
        return (K) n().firstKey();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMap, com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: g */
    public abstract SortedMap n();

    @Override // java.util.SortedMap
    public SortedMap<K, V> headMap(@ParametricNullness K k10) {
        return n().headMap(k10);
    }

    @Override // java.util.SortedMap
    @ParametricNullness
    public K lastKey() {
        return (K) n().lastKey();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ForwardingMap
    protected boolean standardContainsKey(Object obj) {
        return i(comparator(), tailMap(obj).firstKey(), obj) == 0;
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> subMap(@ParametricNullness K k10, @ParametricNullness K k11) {
        return n().subMap(k10, k11);
    }

    @Override // java.util.SortedMap
    public SortedMap<K, V> tailMap(@ParametricNullness K k10) {
        return n().tailMap(k10);
    }
}
