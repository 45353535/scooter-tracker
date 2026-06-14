package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Table;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingTable<R, C, V> extends ForwardingObject implements Table<R, C, V> {
    protected ForwardingTable() {
    }

    @Override // com.google.common.collect.Table
    public Set<Table.Cell<R, C, V>> cellSet() {
        return n().cellSet();
    }

    @Override // com.google.common.collect.Table
    public void clear() {
        n().clear();
    }

    @Override // com.google.common.collect.Table
    public Map<R, V> column(@ParametricNullness C c10) {
        return n().column(c10);
    }

    @Override // com.google.common.collect.Table
    public Set<C> columnKeySet() {
        return n().columnKeySet();
    }

    @Override // com.google.common.collect.Table
    public Map<C, Map<R, V>> columnMap() {
        return n().columnMap();
    }

    @Override // com.google.common.collect.Table
    public boolean contains(Object obj, Object obj2) {
        return n().contains(obj, obj2);
    }

    @Override // com.google.common.collect.Table
    public boolean containsColumn(Object obj) {
        return n().containsColumn(obj);
    }

    @Override // com.google.common.collect.Table
    public boolean containsRow(Object obj) {
        return n().containsRow(obj);
    }

    @Override // com.google.common.collect.Table
    public boolean containsValue(Object obj) {
        return n().containsValue(obj);
    }

    @Override // com.google.common.collect.Table
    public boolean equals(Object obj) {
        return obj == this || n().equals(obj);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract Table n();

    @Override // com.google.common.collect.Table
    public V get(Object obj, Object obj2) {
        return (V) n().get(obj, obj2);
    }

    @Override // com.google.common.collect.Table
    public int hashCode() {
        return n().hashCode();
    }

    @Override // com.google.common.collect.Table
    public boolean isEmpty() {
        return n().isEmpty();
    }

    @Override // com.google.common.collect.Table
    @CanIgnoreReturnValue
    public V put(@ParametricNullness R r10, @ParametricNullness C c10, @ParametricNullness V v10) {
        return (V) n().put(r10, c10, v10);
    }

    @Override // com.google.common.collect.Table
    public void putAll(Table<? extends R, ? extends C, ? extends V> table) {
        n().putAll(table);
    }

    @Override // com.google.common.collect.Table
    @CanIgnoreReturnValue
    public V remove(Object obj, Object obj2) {
        return (V) n().remove(obj, obj2);
    }

    @Override // com.google.common.collect.Table
    public Map<C, V> row(@ParametricNullness R r10) {
        return n().row(r10);
    }

    @Override // com.google.common.collect.Table
    public Set<R> rowKeySet() {
        return n().rowKeySet();
    }

    @Override // com.google.common.collect.Table
    public Map<R, Map<C, V>> rowMap() {
        return n().rowMap();
    }

    @Override // com.google.common.collect.Table
    public int size() {
        return n().size();
    }

    @Override // com.google.common.collect.Table
    public Collection<V> values() {
        return n().values();
    }
}
