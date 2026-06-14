package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public interface ListMultimap<K, V> extends Multimap<K, V> {
    Map<K, Collection<V>> asMap();

    boolean equals(Object obj);

    /* bridge */ /* synthetic */ Collection get(@ParametricNullness Object obj);

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    List<V> get(@ParametricNullness K k10);

    @CanIgnoreReturnValue
    /* bridge */ /* synthetic */ Collection removeAll(Object obj);

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    List<V> removeAll(Object obj);

    @CanIgnoreReturnValue
    /* bridge */ /* synthetic */ Collection replaceValues(@ParametricNullness Object obj, Iterable iterable);

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    List<V> replaceValues(@ParametricNullness K k10, Iterable<? extends V> iterable);
}
