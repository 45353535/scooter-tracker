package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Objects;
import com.google.common.base.Preconditions;
import com.google.common.collect.Maps;
import com.google.common.collect.Table;
import com.google.common.collect.Tables;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class ArrayTable<R, C, V> extends AbstractTable<R, C, V> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ImmutableList f29300d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ImmutableList f29301e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ImmutableMap f29302f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ImmutableMap f29303g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final Object[][] f29304h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private transient ColumnMap f29305i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private transient RowMap f29306j;

    private static abstract class ArrayMap<K, V> extends Maps.IteratorBasedAbstractMap<K, V> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImmutableMap f29313b;

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        Iterator a() {
            return new AbstractIndexedListIterator<Map.Entry<K, V>>(size()) { // from class: com.google.common.collect.ArrayTable.ArrayMap.2
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIndexedListIterator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Map.Entry get(int i10) {
                    return ArrayMap.this.b(i10);
                }
            };
        }

        Map.Entry b(final int i10) {
            Preconditions.checkElementIndex(i10, size());
            return new AbstractMapEntry<K, V>(this) { // from class: com.google.common.collect.ArrayTable.ArrayMap.1

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                final /* synthetic */ ArrayMap f29315c;

                {
                    this.f29315c = this;
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                public K getKey() {
                    return (K) this.f29315c.c(i10);
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                @ParametricNullness
                public V getValue() {
                    return (V) this.f29315c.e(i10);
                }

                @Override // com.google.common.collect.AbstractMapEntry, java.util.Map.Entry
                @ParametricNullness
                public V setValue(@ParametricNullness V v10) {
                    return (V) this.f29315c.f(i10, v10);
                }
            };
        }

        Object c(int i10) {
            return this.f29313b.keySet().asList().get(i10);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public void clear() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return this.f29313b.containsKey(obj);
        }

        abstract String d();

        abstract Object e(int i10);

        abstract Object f(int i10, Object obj);

        @Override // java.util.AbstractMap, java.util.Map
        public V get(Object obj) {
            Integer num = (Integer) this.f29313b.get(obj);
            if (num == null) {
                return null;
            }
            return (V) e(num.intValue());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f29313b.isEmpty();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public Set<K> keySet() {
            return this.f29313b.keySet();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V put(K k10, @ParametricNullness V v10) {
            Integer num = (Integer) this.f29313b.get(k10);
            if (num != null) {
                return (V) f(num.intValue(), v10);
            }
            throw new IllegalArgumentException(d() + " " + k10 + " not in " + this.f29313b.keySet());
        }

        @Override // java.util.AbstractMap, java.util.Map
        public V remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f29313b.size();
        }

        private ArrayMap(ImmutableMap immutableMap) {
            this.f29313b = immutableMap;
        }
    }

    private class Column extends ArrayMap<R, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f29317c;

        Column(int i10) {
            super(ArrayTable.this.f29302f);
            this.f29317c = i10;
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        String d() {
            return "Row";
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        Object e(int i10) {
            return ArrayTable.this.at(i10, this.f29317c);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        Object f(int i10, Object obj) {
            return ArrayTable.this.set(i10, this.f29317c, obj);
        }
    }

    private class ColumnMap extends ArrayMap<C, Map<R, V>> {
        @Override // com.google.common.collect.ArrayTable.ArrayMap
        String d() {
            return "Column";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ArrayTable.ArrayMap
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Map e(int i10) {
            return new Column(i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ArrayTable.ArrayMap
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Map f(int i10, Map map) {
            throw new UnsupportedOperationException();
        }

        private ColumnMap() {
            super(ArrayTable.this.f29303g);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap, java.util.AbstractMap, java.util.Map
        public Map<R, V> put(C c10, Map<R, V> map) {
            throw new UnsupportedOperationException();
        }
    }

    private class Row extends ArrayMap<C, V> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f29320c;

        Row(int i10) {
            super(ArrayTable.this.f29303g);
            this.f29320c = i10;
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        String d() {
            return "Column";
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        Object e(int i10) {
            return ArrayTable.this.at(this.f29320c, i10);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap
        Object f(int i10, Object obj) {
            return ArrayTable.this.set(this.f29320c, i10, obj);
        }
    }

    private class RowMap extends ArrayMap<R, Map<C, V>> {
        @Override // com.google.common.collect.ArrayTable.ArrayMap
        String d() {
            return "Row";
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ArrayTable.ArrayMap
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Map e(int i10) {
            return new Row(i10);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ArrayTable.ArrayMap
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Map f(int i10, Map map) {
            throw new UnsupportedOperationException();
        }

        private RowMap() {
            super(ArrayTable.this.f29302f);
        }

        @Override // com.google.common.collect.ArrayTable.ArrayMap, java.util.AbstractMap, java.util.Map
        public Map<C, V> put(R r10, Map<C, V> map) {
            throw new UnsupportedOperationException();
        }
    }

    private ArrayTable(Iterable iterable, Iterable iterable2) {
        ImmutableList immutableListCopyOf = ImmutableList.copyOf(iterable);
        this.f29300d = immutableListCopyOf;
        ImmutableList immutableListCopyOf2 = ImmutableList.copyOf(iterable2);
        this.f29301e = immutableListCopyOf2;
        Preconditions.checkArgument(immutableListCopyOf.isEmpty() == immutableListCopyOf2.isEmpty());
        this.f29302f = Maps.u(immutableListCopyOf);
        this.f29303g = Maps.u(immutableListCopyOf2);
        this.f29304h = (Object[][]) Array.newInstance((Class<?>) Object.class, immutableListCopyOf.size(), immutableListCopyOf2.size());
        eraseAll();
    }

    public static <R, C, V> ArrayTable<R, C, V> create(Iterable<? extends R> iterable, Iterable<? extends C> iterable2) {
        return new ArrayTable<>(iterable, iterable2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Table.Cell q(int i10) {
        return new Tables.AbstractCell<R, C, V>(this, i10) { // from class: com.google.common.collect.ArrayTable.2

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final int f29308b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final int f29309c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ int f29310d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ ArrayTable f29311e;

            {
                this.f29310d = i10;
                this.f29311e = this;
                this.f29308b = i10 / this.f29301e.size();
                this.f29309c = i10 % this.f29301e.size();
            }

            @Override // com.google.common.collect.Table.Cell
            public C getColumnKey() {
                return (C) this.f29311e.f29301e.get(this.f29309c);
            }

            @Override // com.google.common.collect.Table.Cell
            public R getRowKey() {
                return (R) this.f29311e.f29300d.get(this.f29308b);
            }

            @Override // com.google.common.collect.Table.Cell
            public V getValue() {
                return (V) this.f29311e.at(this.f29308b, this.f29309c);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Object r(int i10) {
        return at(i10 / this.f29301e.size(), i10 % this.f29301e.size());
    }

    public V at(int i10, int i11) {
        Preconditions.checkElementIndex(i10, this.f29300d.size());
        Preconditions.checkElementIndex(i11, this.f29301e.size());
        return (V) this.f29304h[i10][i11];
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Set<Table.Cell<R, C, V>> cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Table
    public Map<R, V> column(C c10) {
        Preconditions.checkNotNull(c10);
        Integer num = (Integer) this.f29303g.get(c10);
        return num == null ? Collections.EMPTY_MAP : new Column(num.intValue());
    }

    public ImmutableList<C> columnKeyList() {
        return this.f29301e;
    }

    @Override // com.google.common.collect.Table
    public Map<C, Map<R, V>> columnMap() {
        ColumnMap columnMap = this.f29305i;
        if (columnMap != null) {
            return columnMap;
        }
        ColumnMap columnMap2 = new ColumnMap();
        this.f29305i = columnMap2;
        return columnMap2;
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean contains(Object obj, Object obj2) {
        return containsRow(obj) && containsColumn(obj2);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsColumn(Object obj) {
        return this.f29303g.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsRow(Object obj) {
        return this.f29302f.containsKey(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean containsValue(Object obj) {
        for (Object[] objArr : this.f29304h) {
            for (Object obj2 : objArr) {
                if (Objects.equal(obj, obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.common.collect.AbstractTable
    Iterator d() {
        return new AbstractIndexedListIterator<Table.Cell<R, C, V>>(size()) { // from class: com.google.common.collect.ArrayTable.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIndexedListIterator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public Table.Cell get(int i10) {
                return ArrayTable.this.q(i10);
            }
        };
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @CanIgnoreReturnValue
    public V erase(Object obj, Object obj2) {
        Integer num = (Integer) this.f29302f.get(obj);
        Integer num2 = (Integer) this.f29303g.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return set(num.intValue(), num2.intValue(), null);
    }

    public void eraseAll() {
        for (Object[] objArr : this.f29304h) {
            Arrays.fill(objArr, (Object) null);
        }
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public V get(Object obj, Object obj2) {
        Integer num = (Integer) this.f29302f.get(obj);
        Integer num2 = (Integer) this.f29303g.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return at(num.intValue(), num2.intValue());
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.AbstractTable
    Iterator i() {
        return new AbstractIndexedListIterator<V>(size()) { // from class: com.google.common.collect.ArrayTable.3
            @Override // com.google.common.collect.AbstractIndexedListIterator
            protected Object get(int i10) {
                return ArrayTable.this.r(i10);
            }
        };
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public boolean isEmpty() {
        return this.f29300d.isEmpty() || this.f29301e.isEmpty();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CanIgnoreReturnValue
    public V put(R r10, C c10, V v10) {
        Preconditions.checkNotNull(r10);
        Preconditions.checkNotNull(c10);
        Integer num = (Integer) this.f29302f.get(r10);
        Preconditions.checkArgument(num != null, "Row %s not in %s", r10, this.f29300d);
        Integer num2 = (Integer) this.f29303g.get(c10);
        Preconditions.checkArgument(num2 != null, "Column %s not in %s", c10, this.f29301e);
        return set(num.intValue(), num2.intValue(), v10);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public void putAll(Table<? extends R, ? extends C, ? extends V> table) {
        super.putAll(table);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public V remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Table
    public Map<C, V> row(R r10) {
        Preconditions.checkNotNull(r10);
        Integer num = (Integer) this.f29302f.get(r10);
        return num == null ? Collections.EMPTY_MAP : new Row(num.intValue());
    }

    public ImmutableList<R> rowKeyList() {
        return this.f29300d;
    }

    @Override // com.google.common.collect.Table
    public Map<R, Map<C, V>> rowMap() {
        RowMap rowMap = this.f29306j;
        if (rowMap != null) {
            return rowMap;
        }
        RowMap rowMap2 = new RowMap();
        this.f29306j = rowMap2;
        return rowMap2;
    }

    @CanIgnoreReturnValue
    public V set(int i10, int i11, V v10) {
        Preconditions.checkElementIndex(i10, this.f29300d.size());
        Preconditions.checkElementIndex(i11, this.f29301e.size());
        Object[] objArr = this.f29304h[i10];
        V v11 = (V) objArr[i11];
        objArr[i11] = v10;
        return v11;
    }

    @Override // com.google.common.collect.Table
    public int size() {
        return this.f29300d.size() * this.f29301e.size();
    }

    @GwtIncompatible
    public V[][] toArray(Class<V> cls) {
        V[][] vArr = (V[][]) ((Object[][]) Array.newInstance((Class<?>) cls, this.f29300d.size(), this.f29301e.size()));
        for (int i10 = 0; i10 < this.f29300d.size(); i10++) {
            Object[] objArr = this.f29304h[i10];
            System.arraycopy(objArr, 0, vArr[i10], 0, objArr.length);
        }
        return vArr;
    }

    @Override // com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public Collection<V> values() {
        return super.values();
    }

    public static <R, C, V> ArrayTable<R, C, V> create(Table<R, C, ? extends V> table) {
        return table instanceof ArrayTable ? new ArrayTable<>((ArrayTable) table) : new ArrayTable<>(table);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public ImmutableSet<C> columnKeySet() {
        return this.f29303g.keySet();
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public ImmutableSet<R> rowKeySet() {
        return this.f29302f.keySet();
    }

    private ArrayTable(Table table) {
        this(table.rowKeySet(), table.columnKeySet());
        putAll(table);
    }

    private ArrayTable(ArrayTable arrayTable) {
        ImmutableList immutableList = arrayTable.f29300d;
        this.f29300d = immutableList;
        ImmutableList immutableList2 = arrayTable.f29301e;
        this.f29301e = immutableList2;
        this.f29302f = arrayTable.f29302f;
        this.f29303g = arrayTable.f29303g;
        Object[][] objArr = (Object[][]) Array.newInstance((Class<?>) Object.class, immutableList.size(), immutableList2.size());
        this.f29304h = objArr;
        for (int i10 = 0; i10 < this.f29300d.size(); i10++) {
            Object[] objArr2 = arrayTable.f29304h[i10];
            System.arraycopy(objArr2, 0, objArr[i10], 0, objArr2.length);
        }
    }
}
