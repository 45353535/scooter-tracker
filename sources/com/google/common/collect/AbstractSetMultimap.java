package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.AbstractMapBasedMultimap;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.DesugarCollections;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractSetMultimap<K, V> extends AbstractMapBasedMultimap<K, V> implements SetMultimap<K, V> {
    protected AbstractSetMultimap(Map map) {
        super(map);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    Collection H(Collection collection) {
        return DesugarCollections.unmodifiableSet((Set) collection);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap
    Collection I(Object obj, Collection collection) {
        return new AbstractMapBasedMultimap.WrappedSet(obj, (Set) collection);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: K, reason: merged with bridge method [inline-methods] */
    public abstract Set v();

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMapBasedMultimap
    /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
    public Set C() {
        return Collections.EMPTY_SET;
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

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap
    public Set<Map.Entry<K, V>> entries() {
        return (Set) super.entries();
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Set<V> get(@ParametricNullness K k10) {
        return (Set) super.get((Object) k10);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public Set<V> removeAll(Object obj) {
        return (Set) super.removeAll(obj);
    }

    @Override // com.google.common.collect.AbstractMapBasedMultimap, com.google.common.collect.AbstractMultimap, com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    @CanIgnoreReturnValue
    public Set<V> replaceValues(@ParametricNullness K k10, Iterable<? extends V> iterable) {
        return (Set) super.replaceValues((Object) k10, (Iterable) iterable);
    }
}
