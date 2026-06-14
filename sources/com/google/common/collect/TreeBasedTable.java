package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Function;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.Maps;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.Objects;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
public class TreeBasedTable<R, C, V> extends StandardRowSortedTable<R, C, V> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Comparator f30324i;

    private static class Factory<C, V> implements Supplier<Map<C, V>>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Comparator f30329b;

        Factory(Comparator comparator) {
            this.f30329b = comparator;
        }

        @Override // com.google.common.base.Supplier
        public Map<C, V> get() {
            return new TreeMap(this.f30329b);
        }
    }

    private class TreeRow extends StandardTable<R, C, V>.Row implements SortedMap<C, V> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final Object f30330e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final Object f30331f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        transient SortedMap f30332g;

        TreeRow(TreeBasedTable treeBasedTable, Object obj) {
            this(obj, null, null);
        }

        @Override // com.google.common.collect.StandardTable.Row
        void c() {
            i();
            SortedMap sortedMap = this.f30332g;
            if (sortedMap == null || !sortedMap.isEmpty()) {
                return;
            }
            TreeBasedTable.this.f30237d.remove(this.f30264b);
            this.f30332g = null;
            this.f30265c = null;
        }

        @Override // java.util.SortedMap
        public Comparator<? super C> comparator() {
            return TreeBasedTable.this.columnComparator();
        }

        @Override // com.google.common.collect.StandardTable.Row, java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return h(obj) && super.containsKey(obj);
        }

        int f(Object obj, Object obj2) {
            return comparator().compare(obj, obj2);
        }

        @Override // java.util.SortedMap
        public C firstKey() {
            d();
            Map map = this.f30265c;
            if (map != null) {
                return (C) ((SortedMap) map).firstKey();
            }
            throw new NoSuchElementException();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.StandardTable.Row
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public SortedMap b() {
            i();
            SortedMap sortedMapTailMap = this.f30332g;
            if (sortedMapTailMap == null) {
                return null;
            }
            Object obj = this.f30330e;
            if (obj != null) {
                sortedMapTailMap = sortedMapTailMap.tailMap(obj);
            }
            Object obj2 = this.f30331f;
            return obj2 != null ? sortedMapTailMap.headMap(obj2) : sortedMapTailMap;
        }

        boolean h(Object obj) {
            if (obj == null) {
                return false;
            }
            Object obj2 = this.f30330e;
            if (obj2 != null && f(obj2, obj) > 0) {
                return false;
            }
            Object obj3 = this.f30331f;
            return obj3 == null || f(obj3, obj) > 0;
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> headMap(C c10) {
            Preconditions.checkArgument(h(Preconditions.checkNotNull(c10)));
            return new TreeRow(this.f30264b, this.f30330e, c10);
        }

        void i() {
            SortedMap sortedMap = this.f30332g;
            if (sortedMap == null || (sortedMap.isEmpty() && TreeBasedTable.this.f30237d.containsKey(this.f30264b))) {
                this.f30332g = (SortedMap) TreeBasedTable.this.f30237d.get(this.f30264b);
            }
        }

        @Override // java.util.SortedMap
        public C lastKey() {
            d();
            Map map = this.f30265c;
            if (map != null) {
                return (C) ((SortedMap) map).lastKey();
            }
            throw new NoSuchElementException();
        }

        @Override // com.google.common.collect.StandardTable.Row, java.util.AbstractMap, java.util.Map
        public V put(C c10, V v10) {
            Preconditions.checkArgument(h(Preconditions.checkNotNull(c10)));
            return (V) super.put(c10, v10);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> subMap(C c10, C c11) {
            Preconditions.checkArgument(h(Preconditions.checkNotNull(c10)) && h(Preconditions.checkNotNull(c11)));
            return new TreeRow(this.f30264b, c10, c11);
        }

        @Override // java.util.SortedMap
        public SortedMap<C, V> tailMap(C c10) {
            Preconditions.checkArgument(h(Preconditions.checkNotNull(c10)));
            return new TreeRow(this.f30264b, c10, this.f30331f);
        }

        TreeRow(Object obj, Object obj2, Object obj3) {
            super(obj);
            this.f30330e = obj2;
            this.f30331f = obj3;
            Preconditions.checkArgument(obj2 == null || obj3 == null || f(obj2, obj3) <= 0);
        }

        @Override // java.util.AbstractMap, java.util.Map, java.util.SortedMap
        public SortedSet<C> keySet() {
            return new Maps.SortedKeySet(this);
        }
    }

    TreeBasedTable(Comparator comparator, Comparator comparator2) {
        super(new TreeMap(comparator), new Factory(comparator2));
        this.f30324i = comparator2;
    }

    public static <R extends Comparable, C extends Comparable, V> TreeBasedTable<R, C, V> create() {
        return new TreeBasedTable<>(Ordering.natural(), Ordering.natural());
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Set cellSet() {
        return super.cellSet();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Map column(Object obj) {
        return super.column(obj);
    }

    @Deprecated
    public Comparator<? super C> columnComparator() {
        return this.f30324i;
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Set columnKeySet() {
        return super.columnKeySet();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Map columnMap() {
        return super.columnMap();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean contains(Object obj, Object obj2) {
        return super.contains(obj, obj2);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsColumn(Object obj) {
        return super.containsColumn(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsRow(Object obj) {
        return super.containsRow(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean containsValue(Object obj) {
        return super.containsValue(obj);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Object get(Object obj, Object obj2) {
        return super.get(obj, obj2);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.StandardTable
    Iterator n() {
        final Comparator<? super C> comparatorColumnComparator = columnComparator();
        final UnmodifiableIterator unmodifiableIteratorMergeSorted = Iterators.mergeSorted(Iterables.transform(this.f30237d.values(), new Function() { // from class: com.google.common.collect.t3
            @Override // com.google.common.base.Function
            public final Object apply(Object obj) {
                return ((Map) obj).keySet().iterator();
            }
        }), comparatorColumnComparator);
        return new AbstractIterator<C>(this) { // from class: com.google.common.collect.TreeBasedTable.1

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f30325d;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ TreeBasedTable f30328g;

            {
                this.f30328g = this;
            }

            @Override // com.google.common.collect.AbstractIterator
            protected Object computeNext() {
                while (unmodifiableIteratorMergeSorted.hasNext()) {
                    Object next = unmodifiableIteratorMergeSorted.next();
                    Object obj = this.f30325d;
                    if (obj == null || comparatorColumnComparator.compare(next, obj) != 0) {
                        this.f30325d = next;
                        return next;
                    }
                }
                this.f30325d = null;
                return a();
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2, Object obj3) {
        return super.put(obj, obj2, obj3);
    }

    @Override // com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ void putAll(Table table) {
        super.putAll(table);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    @CanIgnoreReturnValue
    public /* bridge */ /* synthetic */ Object remove(Object obj, Object obj2) {
        return super.remove(obj, obj2);
    }

    @Deprecated
    public Comparator<? super R> rowComparator() {
        Comparator<? super R> comparator = rowKeySet().comparator();
        Objects.requireNonNull(comparator);
        return comparator;
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ int size() {
        return super.size();
    }

    @Override // com.google.common.collect.AbstractTable
    public /* bridge */ /* synthetic */ String toString() {
        return super.toString();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public /* bridge */ /* synthetic */ Collection values() {
        return super.values();
    }

    public static <R, C, V> TreeBasedTable<R, C, V> create(Comparator<? super R> comparator, Comparator<? super C> comparator2) {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(comparator2);
        return new TreeBasedTable<>(comparator, comparator2);
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public SortedMap<C, V> row(R r10) {
        return new TreeRow(this, r10);
    }

    @Override // com.google.common.collect.StandardRowSortedTable, com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public SortedSet<R> rowKeySet() {
        return super.rowKeySet();
    }

    @Override // com.google.common.collect.StandardRowSortedTable, com.google.common.collect.StandardTable, com.google.common.collect.Table
    public SortedMap<R, Map<C, V>> rowMap() {
        return super.rowMap();
    }

    public static <R, C, V> TreeBasedTable<R, C, V> create(TreeBasedTable<R, C, ? extends V> treeBasedTable) {
        TreeBasedTable<R, C, V> treeBasedTable2 = new TreeBasedTable<>(treeBasedTable.rowComparator(), treeBasedTable.columnComparator());
        treeBasedTable2.putAll(treeBasedTable);
        return treeBasedTable2;
    }
}
