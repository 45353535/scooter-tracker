package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingListMultimap<K, V> extends ForwardingMultimap<K, V> implements ListMultimap<K, V> {
    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: delegate */
    public abstract ListMultimap n();

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public List<V> get(@ParametricNullness K k10) {
        return n().get((Object) k10);
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public List<V> removeAll(Object obj) {
        return n().removeAll(obj);
    }

    @Override // com.google.common.collect.ForwardingMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public List<V> replaceValues(@ParametricNullness K k10, Iterable<? extends V> iterable) {
        return n().replaceValues((Object) k10, (Iterable) iterable);
    }
}
