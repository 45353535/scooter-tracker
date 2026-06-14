package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingMultimap<K, V> extends ForwardingObject implements Multimap<K, V> {
    protected ForwardingMultimap() {
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public Map<K, Collection<V>> asMap() {
        return n().asMap();
    }

    @Override // com.google.common.collect.Multimap
    public void clear() {
        n().clear();
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsEntry(Object obj, Object obj2) {
        return n().containsEntry(obj, obj2);
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsKey(Object obj) {
        return n().containsKey(obj);
    }

    @Override // com.google.common.collect.Multimap
    public boolean containsValue(Object obj) {
        return n().containsValue(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: delegate */
    public abstract Multimap n();

    @Override // com.google.common.collect.Multimap
    public Collection<Map.Entry<K, V>> entries() {
        return n().entries();
    }

    @Override // com.google.common.collect.Multimap, com.google.common.collect.ListMultimap
    public boolean equals(Object obj) {
        return obj == this || n().equals(obj);
    }

    public Collection<V> get(@ParametricNullness K k10) {
        return n().get(k10);
    }

    @Override // com.google.common.collect.Multimap
    public int hashCode() {
        return n().hashCode();
    }

    @Override // com.google.common.collect.Multimap
    public boolean isEmpty() {
        return n().isEmpty();
    }

    @Override // com.google.common.collect.Multimap
    public Set<K> keySet() {
        return n().keySet();
    }

    @Override // com.google.common.collect.Multimap
    public Multiset<K> keys() {
        return n().keys();
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean put(@ParametricNullness K k10, @ParametricNullness V v10) {
        return n().put(k10, v10);
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean putAll(@ParametricNullness K k10, Iterable<? extends V> iterable) {
        return n().putAll(k10, iterable);
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean remove(Object obj, Object obj2) {
        return n().remove(obj, obj2);
    }

    @CanIgnoreReturnValue
    public Collection<V> removeAll(Object obj) {
        return n().removeAll(obj);
    }

    @CanIgnoreReturnValue
    public Collection<V> replaceValues(@ParametricNullness K k10, Iterable<? extends V> iterable) {
        return n().replaceValues(k10, iterable);
    }

    @Override // com.google.common.collect.Multimap
    public int size() {
        return n().size();
    }

    @Override // com.google.common.collect.Multimap
    public Collection<V> values() {
        return n().values();
    }

    @Override // com.google.common.collect.Multimap
    @CanIgnoreReturnValue
    public boolean putAll(Multimap<? extends K, ? extends V> multimap) {
        return n().putAll(multimap);
    }
}
