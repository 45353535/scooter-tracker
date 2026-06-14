package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Table;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractTable<R, C, V> implements Table<R, C, V> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Set f29293b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Collection f29294c;

    class CellSet extends AbstractSet<Table.Cell<R, C, V>> {
        CellSet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            AbstractTable.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Table.Cell) {
                Table.Cell cell = (Table.Cell) obj;
                Map map = (Map) Maps.G(AbstractTable.this.rowMap(), cell.getRowKey());
                if (map != null && Collections2.f(map.entrySet(), Maps.immutableEntry(cell.getColumnKey(), cell.getValue()))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Table.Cell<R, C, V>> iterator() {
            return AbstractTable.this.d();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            if (obj instanceof Table.Cell) {
                Table.Cell cell = (Table.Cell) obj;
                Map map = (Map) Maps.G(AbstractTable.this.rowMap(), cell.getRowKey());
                if (map != null && Collections2.g(map.entrySet(), Maps.immutableEntry(cell.getColumnKey(), cell.getValue()))) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractTable.this.size();
        }
    }

    class Values extends AbstractCollection<V> {
        Values() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public void clear() {
            AbstractTable.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public boolean contains(Object obj) {
            return AbstractTable.this.containsValue(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
        public Iterator<V> iterator() {
            return AbstractTable.this.i();
        }

        @Override // java.util.AbstractCollection, java.util.Collection
        public int size() {
            return AbstractTable.this.size();
        }
    }

    AbstractTable() {
    }

    @Override // com.google.common.collect.Table
    public Set<Table.Cell<R, C, V>> cellSet() {
        Set<Table.Cell<R, C, V>> set = this.f29293b;
        if (set != null) {
            return set;
        }
        Set<Table.Cell<R, C, V>> setG = g();
        this.f29293b = setG;
        return setG;
    }

    @Override // com.google.common.collect.Table
    public void clear() {
        Iterators.b(cellSet().iterator());
    }

    @Override // com.google.common.collect.Table
    public Set<C> columnKeySet() {
        return columnMap().keySet();
    }

    @Override // com.google.common.collect.Table
    public boolean contains(Object obj, Object obj2) {
        Map map = (Map) Maps.G(rowMap(), obj);
        return map != null && Maps.F(map, obj2);
    }

    @Override // com.google.common.collect.Table
    public boolean containsColumn(Object obj) {
        return Maps.F(columnMap(), obj);
    }

    @Override // com.google.common.collect.Table
    public boolean containsRow(Object obj) {
        return Maps.F(rowMap(), obj);
    }

    @Override // com.google.common.collect.Table
    public boolean containsValue(Object obj) {
        Iterator<Map<C, V>> it = rowMap().values().iterator();
        while (it.hasNext()) {
            if (it.next().containsValue(obj)) {
                return true;
            }
        }
        return false;
    }

    abstract Iterator d();

    @Override // com.google.common.collect.Table
    public boolean equals(Object obj) {
        return Tables.c(this, obj);
    }

    Set g() {
        return new CellSet();
    }

    @Override // com.google.common.collect.Table
    public V get(Object obj, Object obj2) {
        Map map = (Map) Maps.G(rowMap(), obj);
        if (map == null) {
            return null;
        }
        return (V) Maps.G(map, obj2);
    }

    Collection h() {
        return new Values();
    }

    @Override // com.google.common.collect.Table
    public int hashCode() {
        return cellSet().hashCode();
    }

    Iterator i() {
        return new TransformedIterator<Table.Cell<R, C, V>, V>(cellSet().iterator()) { // from class: com.google.common.collect.AbstractTable.1
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.TransformedIterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Object a(Table.Cell cell) {
                return cell.getValue();
            }
        };
    }

    @Override // com.google.common.collect.Table
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // com.google.common.collect.Table
    @CanIgnoreReturnValue
    public V put(@ParametricNullness R r10, @ParametricNullness C c10, @ParametricNullness V v10) {
        return row(r10).put(c10, v10);
    }

    @Override // com.google.common.collect.Table
    public void putAll(Table<? extends R, ? extends C, ? extends V> table) {
        for (Table.Cell<? extends R, ? extends C, ? extends V> cell : table.cellSet()) {
            put(cell.getRowKey(), cell.getColumnKey(), cell.getValue());
        }
    }

    @Override // com.google.common.collect.Table
    @CanIgnoreReturnValue
    public V remove(Object obj, Object obj2) {
        Map map = (Map) Maps.G(rowMap(), obj);
        if (map == null) {
            return null;
        }
        return (V) Maps.H(map, obj2);
    }

    @Override // com.google.common.collect.Table
    public Set<R> rowKeySet() {
        return rowMap().keySet();
    }

    public String toString() {
        return rowMap().toString();
    }

    @Override // com.google.common.collect.Table
    public Collection<V> values() {
        Collection<V> collection = this.f29294c;
        if (collection != null) {
            return collection;
        }
        Collection<V> collectionH = h();
        this.f29294c = collectionH;
        return collectionH;
    }
}
