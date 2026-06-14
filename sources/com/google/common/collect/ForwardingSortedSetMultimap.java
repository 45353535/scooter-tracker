package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedSetMultimap<K, V> extends ForwardingSetMultimap<K, V> implements SortedSetMultimap<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: delegate */
    public abstract SortedSetMultimap n();

    @Override // com.google.common.collect.SortedSetMultimap
    public Comparator<? super V> valueComparator() {
        return n().valueComparator();
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public SortedSet<V> get(@ParametricNullness K k10) {
        return n().get((Object) k10);
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public SortedSet<V> removeAll(Object obj) {
        return n().removeAll(obj);
    }

    @Override // com.google.common.collect.ForwardingSetMultimap, com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public SortedSet<V> replaceValues(@ParametricNullness K k10, Iterable<? extends V> iterable) {
        return n().replaceValues((Object) k10, (Iterable) iterable);
    }
}
