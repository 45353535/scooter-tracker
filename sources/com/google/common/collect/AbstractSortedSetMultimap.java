package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Map;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractSortedSetMultimap<K, V> extends AbstractSetMultimap<K, V> implements SortedSetMultimap<K, V> {
    protected AbstractSortedSetMultimap(Map map) {
        super(map);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    Collection I(Object obj, Collection collection) {
        return collection instanceof NavigableSet ? new AbstractMapBasedMultimap.WrappedNavigableSet(obj, (NavigableSet) collection, null) : new AbstractMapBasedMultimap.WrappedSortedSet(obj, (SortedSet) collection, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: M */
    public abstract SortedSet v();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractSetMultimap
    /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
    public SortedSet C() {
        return H(v());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public SortedSet H(Collection collection) {
        return collection instanceof NavigableSet ? Sets.unmodifiableNavigableSet((NavigableSet) collection) : DesugarCollections.unmodifiableSortedSet((SortedSet) collection);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Collection<V> values() {
        return super.values();
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public SortedSet<V> get(@ParametricNullness K k10) {
        return (SortedSet) super.get((Object) k10);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public SortedSet<V> removeAll(Object obj) {
        return (SortedSet) super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractSetMultimap, com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public SortedSet<V> replaceValues(@ParametricNullness K k10, Iterable<? extends V> iterable) {
        return (SortedSet) super.replaceValues((Object) k10, (Iterable) iterable);
    }
}
