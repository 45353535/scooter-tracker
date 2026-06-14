package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Supplier;
import com.google.common.collect.Maps;
import java.util.Comparator;
import java.util.Map;
import java.util.SortedMap;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
class StandardRowSortedTable<R, C, V> extends StandardTable<R, C, V> implements RowSortedTable<R, C, V> {

    private class RowSortedMap extends StandardTable<R, C, V>.RowMap implements SortedMap<R, Map<C, V>> {
        private RowSortedMap() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public SortedSet createKeySet() {
            return new Maps.SortedKeySet(this);
        }

        @Override // java.util.SortedMap
        public Comparator<? super R> comparator() {
            return StandardRowSortedTable.this.v().comparator();
        }

        @Override // java.util.SortedMap
        public R firstKey() {
            return (R) StandardRowSortedTable.this.v().firstKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> headMap(R r10) {
            Preconditions.checkNotNull(r10);
            return new StandardRowSortedTable(StandardRowSortedTable.this.v().headMap(r10), StandardRowSortedTable.this.f30238e).rowMap();
        }

        @Override // java.util.SortedMap
        public R lastKey() {
            return (R) StandardRowSortedTable.this.v().lastKey();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> subMap(R r10, R r11) {
            Preconditions.checkNotNull(r10);
            Preconditions.checkNotNull(r11);
            return new StandardRowSortedTable(StandardRowSortedTable.this.v().subMap(r10, r11), StandardRowSortedTable.this.f30238e).rowMap();
        }

        @Override // java.util.SortedMap
        public SortedMap<R, Map<C, V>> tailMap(R r10) {
            Preconditions.checkNotNull(r10);
            return new StandardRowSortedTable(StandardRowSortedTable.this.v().tailMap(r10), StandardRowSortedTable.this.f30238e).rowMap();
        }

        @Override // com.google.common.collect.Maps.ViewCachingAbstractMap, java.util.AbstractMap, java.util.Map
        public SortedSet<R> keySet() {
            return (SortedSet) super.keySet();
        }
    }

    StandardRowSortedTable(SortedMap sortedMap, Supplier supplier) {
        super(sortedMap, supplier);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public SortedMap v() {
        return (SortedMap) this.f30237d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.StandardTable
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public SortedMap o() {
        return new RowSortedMap();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public SortedSet<R> rowKeySet() {
        return (SortedSet) rowMap().keySet();
    }

    @Override // com.google.common.collect.StandardTable, com.google.common.collect.Table
    public SortedMap<R, Map<C, V>> rowMap() {
        return (SortedMap) super.rowMap();
    }
}
