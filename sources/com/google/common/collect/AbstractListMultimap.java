package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractListMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements ListMultimap<K, V> {
    protected AbstractListMultimap(Map map) {
        super(map);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    Collection H(Collection collection) {
        return DesugarCollections.unmodifiableList((List) collection);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    Collection I(Object obj, Collection collection) {
        return J(obj, (List) collection, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public abstract List v();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public List C() {
        return Collections.EMPTY_LIST;
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Map<K, Collection<V>> asMap() {
        return super.asMap();
    }

    @Override // com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean put(@ParametricNullness K k10, @ParametricNullness V v10) {
        return super.put(k10, v10);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public List<V> get(@ParametricNullness K k10) {
        return (List) super.get((Object) k10);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public List<V> removeAll(Object obj) {
        return (List) super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public List<V> replaceValues(@ParametricNullness K k10, Iterable<? extends V> iterable) {
        return (List) super.replaceValues((Object) k10, (Iterable) iterable);
    }
}
