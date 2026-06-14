package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Table;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class RegularImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {

    private final class CellSet extends IndexedImmutableSet<Table.Cell<R, C, V>> {
        private CellSet() {
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Table.Cell) {
                Table.Cell cell = (Table.Cell) obj;
                Object obj2 = RegularImmutableTable.this.get(cell.getRowKey(), cell.getColumnKey());
                if (obj2 != null && obj2.equals(cell.getValue())) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return false;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.IndexedImmutableSet
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public Table.Cell get(int i10) {
            return RegularImmutableTable.this.u(i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return RegularImmutableTable.this.size();
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    private final class Values extends ImmutableList<V> {
        private Values() {
        }

        @Override // java.util.List
        public V get(int i10) {
            return (V) RegularImmutableTable.this.v(i10);
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return RegularImmutableTable.this.size();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    RegularImmutableTable() {
    }

    public static /* synthetic */ int o(Comparator comparator, Comparator comparator2, Table.Cell cell, Table.Cell cell2) {
        int iCompare = comparator == null ? 0 : comparator.compare(cell.getRowKey(), cell2.getRowKey());
        if (iCompare != 0) {
            return iCompare;
        }
        if (comparator2 == null) {
            return 0;
        }
        return comparator2.compare(cell.getColumnKey(), cell2.getColumnKey());
    }

    static RegularImmutableTable r(List list, final Comparator comparator, final Comparator comparator2) {
        Preconditions.checkNotNull(list);
        if (comparator != null || comparator2 != null) {
            Collections.sort(list, new Comparator() { // from class: com.google.common.collect.a3
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return RegularImmutableTable.o(comparator, comparator2, (Table.Cell) obj, (Table.Cell) obj2);
                }
            });
        }
        return s(list, comparator, comparator2);
    }

    private static RegularImmutableTable s(Iterable iterable, Comparator comparator, Comparator comparator2) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        ImmutableList immutableListCopyOf = ImmutableList.copyOf(iterable);
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            Table.Cell cell = (Table.Cell) it.next();
            linkedHashSet.add(cell.getRowKey());
            linkedHashSet2.add(cell.getColumnKey());
        }
        return t(immutableListCopyOf, comparator == null ? ImmutableSet.copyOf((Collection) linkedHashSet) : ImmutableSet.copyOf((Collection) ImmutableList.sortedCopyOf(comparator, linkedHashSet)), comparator2 == null ? ImmutableSet.copyOf((Collection) linkedHashSet2) : ImmutableSet.copyOf((Collection) ImmutableList.sortedCopyOf(comparator2, linkedHashSet2)));
    }

    static RegularImmutableTable t(ImmutableList immutableList, ImmutableSet immutableSet, ImmutableSet immutableSet2) {
        return ((long) immutableList.size()) > (((long) immutableSet.size()) * ((long) immutableSet2.size())) / 2 ? new DenseImmutableTable(immutableList, immutableSet, immutableSet2) : new SparseImmutableTable(immutableList, immutableSet, immutableSet2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public final ImmutableSet g() {
        return isEmpty() ? ImmutableSet.of() : new CellSet();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public final ImmutableCollection h() {
        return isEmpty() ? ImmutableList.of() : new Values();
    }

    final void q(Object obj, Object obj2, Object obj3, Object obj4) {
        Preconditions.checkArgument(obj3 == null, "Duplicate key: (row=%s, column=%s), values: [%s, %s].", obj, obj2, obj4, obj3);
    }

    abstract Table.Cell u(int i10);

    abstract Object v(int i10);

    @Override // com.google.common.collect.ImmutableTable
    @J2ktIncompatible
    @GwtIncompatible
    abstract Object writeReplace();
}
