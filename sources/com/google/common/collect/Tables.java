package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Function;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.Table;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import j$.util.DesugarCollections;
import j$.util.stream.Collector;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.function.BinaryOperator;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Tables {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Function f30307a = new Function<Map<Object, Object>, Map<Object, Object>>() { // from class: com.google.common.collect.Tables.1
        @Override // com.google.common.base.Function
        public Map<Object, Object> apply(Map<Object, Object> map) {
            return DesugarCollections.unmodifiableMap(map);
        }
    };

    static abstract class AbstractCell<R, C, V> implements Table.Cell<R, C, V> {
        AbstractCell() {
        }

        @Override // com.google.common.collect.Table.Cell
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (obj instanceof Table.Cell) {
                Table.Cell cell = (Table.Cell) obj;
                if (Objects.equal(getRowKey(), cell.getRowKey()) && Objects.equal(getColumnKey(), cell.getColumnKey()) && Objects.equal(getValue(), cell.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.Table.Cell
        public int hashCode() {
            return Objects.hashCode(getRowKey(), getColumnKey(), getValue());
        }

        public String toString() {
            return "(" + getRowKey() + StringUtils.COMMA + getColumnKey() + ")=" + getValue();
        }
    }

    static final class ImmutableCell<R, C, V> extends AbstractCell<R, C, V> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Object f30308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Object f30309c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Object f30310d;

        ImmutableCell(Object obj, Object obj2, Object obj3) {
            this.f30308b = obj;
            this.f30309c = obj2;
            this.f30310d = obj3;
        }

        @Override // com.google.common.collect.Table.Cell
        @ParametricNullness
        public C getColumnKey() {
            return (C) this.f30309c;
        }

        @Override // com.google.common.collect.Table.Cell
        @ParametricNullness
        public R getRowKey() {
            return (R) this.f30308b;
        }

        @Override // com.google.common.collect.Table.Cell
        @ParametricNullness
        public V getValue() {
            return (V) this.f30310d;
        }
    }

    private static class TransformedTable<R, C, V1, V2> extends AbstractTable<R, C, V2> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Table f30311d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Function f30312e;

        TransformedTable(Table table, Function function) {
            this.f30311d = (Table) Preconditions.checkNotNull(table);
            this.f30312e = (Function) Preconditions.checkNotNull(function);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void clear() {
            this.f30311d.clear();
        }

        @Override // com.google.common.collect.Table
        public Map<R, V2> column(@ParametricNullness C c10) {
            return Maps.transformValues(this.f30311d.column(c10), this.f30312e);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public Set<C> columnKeySet() {
            return this.f30311d.columnKeySet();
        }

        @Override // com.google.common.collect.Table
        public Map<C, Map<R, V2>> columnMap() {
            return Maps.transformValues(this.f30311d.columnMap(), new Function<Map<R, V1>, Map<R, V2>>() { // from class: com.google.common.collect.Tables.TransformedTable.3
                @Override // com.google.common.base.Function
                public Map<R, V2> apply(Map<R, V1> map) {
                    return Maps.transformValues(map, TransformedTable.this.f30312e);
                }
            });
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public boolean contains(Object obj, Object obj2) {
            return this.f30311d.contains(obj, obj2);
        }

        @Override // com.google.common.collect.AbstractTable
        Iterator d() {
            return Iterators.transform(this.f30311d.cellSet().iterator(), j());
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V2 get(Object obj, Object obj2) {
            if (contains(obj, obj2)) {
                return (V2) this.f30312e.apply(NullnessCasts.a(this.f30311d.get(obj, obj2)));
            }
            return null;
        }

        @Override // com.google.common.collect.AbstractTable
        Collection h() {
            return Collections2.transform(this.f30311d.values(), this.f30312e);
        }

        Function j() {
            return new Function<Table.Cell<R, C, V1>, Table.Cell<R, C, V2>>() { // from class: com.google.common.collect.Tables.TransformedTable.1
                @Override // com.google.common.base.Function
                public Table.Cell<R, C, V2> apply(Table.Cell<R, C, V1> cell) {
                    return Tables.immutableCell(cell.getRowKey(), cell.getColumnKey(), TransformedTable.this.f30312e.apply(cell.getValue()));
                }
            };
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V2 put(@ParametricNullness R r10, @ParametricNullness C c10, @ParametricNullness V2 v22) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void putAll(Table<? extends R, ? extends C, ? extends V2> table) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V2 remove(Object obj, Object obj2) {
            if (contains(obj, obj2)) {
                return (V2) this.f30312e.apply(NullnessCasts.a(this.f30311d.remove(obj, obj2)));
            }
            return null;
        }

        @Override // com.google.common.collect.Table
        public Map<C, V2> row(@ParametricNullness R r10) {
            return Maps.transformValues(this.f30311d.row(r10), this.f30312e);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public Set<R> rowKeySet() {
            return this.f30311d.rowKeySet();
        }

        @Override // com.google.common.collect.Table
        public Map<R, Map<C, V2>> rowMap() {
            return Maps.transformValues(this.f30311d.rowMap(), new Function<Map<C, V1>, Map<C, V2>>() { // from class: com.google.common.collect.Tables.TransformedTable.2
                @Override // com.google.common.base.Function
                public Map<C, V2> apply(Map<C, V1> map) {
                    return Maps.transformValues(map, TransformedTable.this.f30312e);
                }
            });
        }

        @Override // com.google.common.collect.Table
        public int size() {
            return this.f30311d.size();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class TransposeTable<C, R, V> extends AbstractTable<C, R, V> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final Table f30316d;

        TransposeTable(Table table) {
            this.f30316d = (Table) Preconditions.checkNotNull(table);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void clear() {
            this.f30316d.clear();
        }

        @Override // com.google.common.collect.Table
        public Map<C, V> column(@ParametricNullness R r10) {
            return this.f30316d.row(r10);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public Set<R> columnKeySet() {
            return this.f30316d.rowKeySet();
        }

        @Override // com.google.common.collect.Table
        public Map<R, Map<C, V>> columnMap() {
            return this.f30316d.rowMap();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public boolean contains(Object obj, Object obj2) {
            return this.f30316d.contains(obj2, obj);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public boolean containsColumn(Object obj) {
            return this.f30316d.containsRow(obj);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public boolean containsRow(Object obj) {
            return this.f30316d.containsColumn(obj);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public boolean containsValue(Object obj) {
            return this.f30316d.containsValue(obj);
        }

        @Override // com.google.common.collect.AbstractTable
        Iterator d() {
            return Iterators.transform(this.f30316d.cellSet().iterator(), new Function() { // from class: com.google.common.collect.s3
                @Override // com.google.common.base.Function
                public final Object apply(Object obj) {
                    return Tables.d((Table.Cell) obj);
                }
            });
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V get(Object obj, Object obj2) {
            return (V) this.f30316d.get(obj2, obj);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V put(@ParametricNullness C c10, @ParametricNullness R r10, @ParametricNullness V v10) {
            return (V) this.f30316d.put(r10, c10, v10);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public void putAll(Table<? extends C, ? extends R, ? extends V> table) {
            this.f30316d.putAll(Tables.transpose(table));
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public V remove(Object obj, Object obj2) {
            return (V) this.f30316d.remove(obj2, obj);
        }

        @Override // com.google.common.collect.Table
        public Map<R, V> row(@ParametricNullness C c10) {
            return this.f30316d.column(c10);
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public Set<C> rowKeySet() {
            return this.f30316d.columnKeySet();
        }

        @Override // com.google.common.collect.Table
        public Map<C, Map<R, V>> rowMap() {
            return this.f30316d.columnMap();
        }

        @Override // com.google.common.collect.Table
        public int size() {
            return this.f30316d.size();
        }

        @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
        public Collection<V> values() {
            return this.f30316d.values();
        }
    }

    private static final class UnmodifiableRowSortedMap<R, C, V> extends UnmodifiableTable<R, C, V> implements RowSortedTable<R, C, V> {
        public UnmodifiableRowSortedMap(RowSortedTable<R, ? extends C, ? extends V> rowSortedTable) {
            super(rowSortedTable);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public RowSortedTable n() {
            return (RowSortedTable) super.n();
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public SortedSet<R> rowKeySet() {
            return DesugarCollections.unmodifiableSortedSet(n().rowKeySet());
        }

        @Override // com.google.common.collect.Tables.UnmodifiableTable, com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public SortedMap<R, Map<C, V>> rowMap() {
            return DesugarCollections.unmodifiableSortedMap(Maps.transformValues((SortedMap) n().rowMap(), Tables.e()));
        }
    }

    private static class UnmodifiableTable<R, C, V> extends ForwardingTable<R, C, V> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Table f30317b;

        UnmodifiableTable(Table table) {
            this.f30317b = (Table) Preconditions.checkNotNull(table);
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Set<Table.Cell<R, C, V>> cellSet() {
            return DesugarCollections.unmodifiableSet(super.cellSet());
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Map<R, V> column(@ParametricNullness C c10) {
            return DesugarCollections.unmodifiableMap(super.column(c10));
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Set<C> columnKeySet() {
            return DesugarCollections.unmodifiableSet(super.columnKeySet());
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Map<C, Map<R, V>> columnMap() {
            return DesugarCollections.unmodifiableMap(Maps.transformValues(super.columnMap(), Tables.e()));
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: g */
        public Table n() {
            return this.f30317b;
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public V put(@ParametricNullness R r10, @ParametricNullness C c10, @ParametricNullness V v10) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public void putAll(Table<? extends R, ? extends C, ? extends V> table) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public V remove(Object obj, Object obj2) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Map<C, V> row(@ParametricNullness R r10) {
            return DesugarCollections.unmodifiableMap(super.row(r10));
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Set<R> rowKeySet() {
            return DesugarCollections.unmodifiableSet(super.rowKeySet());
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Map<R, Map<C, V>> rowMap() {
            return DesugarCollections.unmodifiableMap(Maps.transformValues(super.rowMap(), Tables.e()));
        }

        @Override // com.google.common.collect.ForwardingTable, com.google.common.collect.Table
        public Collection<V> values() {
            return DesugarCollections.unmodifiableCollection(super.values());
        }
    }

    static boolean c(Table table, Object obj) {
        if (obj == table) {
            return true;
        }
        if (obj instanceof Table) {
            return table.cellSet().equals(((Table) obj).cellSet());
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Table.Cell d(Table.Cell cell) {
        return immutableCell(cell.getColumnKey(), cell.getRowKey(), cell.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Function e() {
        return f30307a;
    }

    public static <R, C, V> Table.Cell<R, C, V> immutableCell(@ParametricNullness R r10, @ParametricNullness C c10, @ParametricNullness V v10) {
        return new ImmutableCell(r10, c10, v10);
    }

    public static <R, C, V> Table<R, C, V> newCustomTable(Map<R, Map<C, V>> map, Supplier<? extends Map<C, V>> supplier) {
        Preconditions.checkArgument(map.isEmpty());
        Preconditions.checkNotNull(supplier);
        return new StandardTable(map, supplier);
    }

    @J2ktIncompatible
    public static <R, C, V> Table<R, C, V> synchronizedTable(Table<R, C, V> table) {
        return Synchronized.z(table, null);
    }

    @IgnoreJRERequirement
    public static <T, R, C, V, I extends Table<R, C, V>> Collector<T, ?, I> toTable(java.util.function.Function<? super T, ? extends R> function, java.util.function.Function<? super T, ? extends C> function2, java.util.function.Function<? super T, ? extends V> function3, java.util.function.Supplier<I> supplier) {
        return TableCollectors.m(function, function2, function3, supplier);
    }

    public static <R, C, V1, V2> Table<R, C, V2> transformValues(Table<R, C, V1> table, Function<? super V1, V2> function) {
        return new TransformedTable(table, function);
    }

    public static <R, C, V> Table<C, R, V> transpose(Table<R, C, V> table) {
        return table instanceof TransposeTable ? ((TransposeTable) table).f30316d : new TransposeTable(table);
    }

    public static <R, C, V> RowSortedTable<R, C, V> unmodifiableRowSortedTable(RowSortedTable<R, ? extends C, ? extends V> rowSortedTable) {
        return new UnmodifiableRowSortedMap(rowSortedTable);
    }

    public static <R, C, V> Table<R, C, V> unmodifiableTable(Table<? extends R, ? extends C, ? extends V> table) {
        return new UnmodifiableTable(table);
    }

    @IgnoreJRERequirement
    public static <T, R, C, V, I extends Table<R, C, V>> Collector<T, ?, I> toTable(java.util.function.Function<? super T, ? extends R> function, java.util.function.Function<? super T, ? extends C> function2, java.util.function.Function<? super T, ? extends V> function3, BinaryOperator<V> binaryOperator, java.util.function.Supplier<I> supplier) {
        return TableCollectors.l(function, function2, function3, binaryOperator, supplier);
    }
}
