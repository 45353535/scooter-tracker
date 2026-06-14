package com.google.common.collect;

import androidx.exifinterface.media.ExifInterface;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import com.google.errorprone.annotations.Immutable;
import j$.util.Objects;
import java.lang.reflect.Array;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@Immutable(containerOf = {"R", "C", ExifInterface.GPS_MEASUREMENT_INTERRUPTED})
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class DenseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ImmutableMap f29415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ImmutableMap f29416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ImmutableMap f29417f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final ImmutableMap f29418g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int[] f29419h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f29420i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Object[][] f29421j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int[] f29422k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int[] f29423l;

    private final class Column extends ImmutableArrayMap<R, V> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f29424h;

        Column(int i10) {
            super(DenseImmutableTable.this.f29420i[i10]);
            this.f29424h = i10;
        }

        @Override // com.google.common.collect.ImmutableMap
        boolean k() {
            return true;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        Object o(int i10) {
            return DenseImmutableTable.this.f29421j[i10][this.f29424h];
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        ImmutableMap r() {
            return DenseImmutableTable.this.f29415d;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        @J2ktIncompatible
        @GwtIncompatible
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    private final class ColumnMap extends ImmutableArrayMap<C, ImmutableMap<R, V>> {
        @Override // com.google.common.collect.ImmutableMap
        boolean k() {
            return false;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        ImmutableMap r() {
            return DenseImmutableTable.this.f29416e;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public ImmutableMap o(int i10) {
            return new Column(i10);
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        @J2ktIncompatible
        @GwtIncompatible
        Object writeReplace() {
            return super.writeReplace();
        }

        private ColumnMap() {
            super(DenseImmutableTable.this.f29420i.length);
        }
    }

    private static abstract class ImmutableArrayMap<K, V> extends ImmutableMap.IteratorBasedImmutableMap<K, V> {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private final int f29427g;

        ImmutableArrayMap(int i10) {
            this.f29427g = i10;
        }

        private boolean q() {
            return this.f29427g == r().size();
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        ImmutableSet g() {
            return q() ? r().keySet() : super.g();
        }

        @Override // com.google.common.collect.ImmutableMap, java.util.Map
        public V get(Object obj) {
            Integer num = (Integer) r().get(obj);
            if (num == null) {
                return null;
            }
            return (V) o(num.intValue());
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap
        UnmodifiableIterator m() {
            return new AbstractIterator<Map.Entry<K, V>>() { // from class: com.google.common.collect.DenseImmutableTable.ImmutableArrayMap.1

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                private int f29428d = -1;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                private final int f29429e;

                {
                    this.f29429e = ImmutableArrayMap.this.r().size();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public Map.Entry computeNext() {
                    int i10 = this.f29428d;
                    while (true) {
                        this.f29428d = i10 + 1;
                        int i11 = this.f29428d;
                        if (i11 >= this.f29429e) {
                            return (Map.Entry) a();
                        }
                        Object objO = ImmutableArrayMap.this.o(i11);
                        if (objO != null) {
                            return Maps.immutableEntry(ImmutableArrayMap.this.n(this.f29428d), objO);
                        }
                        i10 = this.f29428d;
                    }
                }
            };
        }

        Object n(int i10) {
            return r().keySet().asList().get(i10);
        }

        abstract Object o(int i10);

        abstract ImmutableMap r();

        @Override // java.util.Map
        public int size() {
            return this.f29427g;
        }

        @Override // com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        @J2ktIncompatible
        @GwtIncompatible
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    private final class Row extends ImmutableArrayMap<C, V> {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private final int f29431h;

        Row(int i10) {
            super(DenseImmutableTable.this.f29419h[i10]);
            this.f29431h = i10;
        }

        @Override // com.google.common.collect.ImmutableMap
        boolean k() {
            return true;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        Object o(int i10) {
            return DenseImmutableTable.this.f29421j[this.f29431h][i10];
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        ImmutableMap r() {
            return DenseImmutableTable.this.f29416e;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        @J2ktIncompatible
        @GwtIncompatible
        Object writeReplace() {
            return super.writeReplace();
        }
    }

    private final class RowMap extends ImmutableArrayMap<R, ImmutableMap<C, V>> {
        @Override // com.google.common.collect.ImmutableMap
        boolean k() {
            return false;
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        ImmutableMap r() {
            return DenseImmutableTable.this.f29415d;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public ImmutableMap o(int i10) {
            return new Row(i10);
        }

        @Override // com.google.common.collect.DenseImmutableTable.ImmutableArrayMap, com.google.common.collect.ImmutableMap.IteratorBasedImmutableMap, com.google.common.collect.ImmutableMap
        @J2ktIncompatible
        @GwtIncompatible
        Object writeReplace() {
            return super.writeReplace();
        }

        private RowMap() {
            super(DenseImmutableTable.this.f29419h.length);
        }
    }

    DenseImmutableTable(ImmutableList immutableList, ImmutableSet immutableSet, ImmutableSet immutableSet2) {
        this.f29421j = (Object[][]) Array.newInstance((Class<?>) Object.class, immutableSet.size(), immutableSet2.size());
        ImmutableMap immutableMapU = Maps.u(immutableSet);
        this.f29415d = immutableMapU;
        ImmutableMap immutableMapU2 = Maps.u(immutableSet2);
        this.f29416e = immutableMapU2;
        this.f29419h = new int[immutableMapU.size()];
        this.f29420i = new int[immutableMapU2.size()];
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i10 = 0; i10 < immutableList.size(); i10++) {
            Table.Cell cell = (Table.Cell) immutableList.get(i10);
            Object rowKey = cell.getRowKey();
            Object columnKey = cell.getColumnKey();
            Integer num = (Integer) this.f29415d.get(rowKey);
            Objects.requireNonNull(num);
            int iIntValue = num.intValue();
            Integer num2 = (Integer) this.f29416e.get(columnKey);
            Objects.requireNonNull(num2);
            int iIntValue2 = num2.intValue();
            q(rowKey, columnKey, this.f29421j[iIntValue][iIntValue2], cell.getValue());
            this.f29421j[iIntValue][iIntValue2] = cell.getValue();
            int[] iArr3 = this.f29419h;
            iArr3[iIntValue] = iArr3[iIntValue] + 1;
            int[] iArr4 = this.f29420i;
            iArr4[iIntValue2] = iArr4[iIntValue2] + 1;
            iArr[i10] = iIntValue;
            iArr2[i10] = iIntValue2;
        }
        this.f29422k = iArr;
        this.f29423l = iArr2;
        this.f29417f = new RowMap();
        this.f29418g = new ColumnMap();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable, com.google.common.collect.Table
    public V get(Object obj, Object obj2) {
        Integer num = (Integer) this.f29415d.get(obj);
        Integer num2 = (Integer) this.f29416e.get(obj2);
        if (num == null || num2 == null) {
            return null;
        }
        return (V) this.f29421j[num.intValue()][num2.intValue()];
    }

    @Override // com.google.common.collect.Table
    public int size() {
        return this.f29422k.length;
    }

    @Override // com.google.common.collect.RegularImmutableTable
    Table.Cell u(int i10) {
        int i11 = this.f29422k[i10];
        int i12 = this.f29423l[i10];
        R r10 = rowKeySet().asList().get(i11);
        C c10 = columnKeySet().asList().get(i12);
        Object obj = this.f29421j[i11][i12];
        Objects.requireNonNull(obj);
        return ImmutableTable.k(r10, c10, obj);
    }

    @Override // com.google.common.collect.RegularImmutableTable
    Object v(int i10) {
        Object obj = this.f29421j[this.f29422k[i10]][this.f29423l[i10]];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.common.collect.RegularImmutableTable, com.google.common.collect.ImmutableTable
    @J2ktIncompatible
    @GwtIncompatible
    Object writeReplace() {
        return ImmutableTable.SerializedForm.a(this, this.f29422k, this.f29423l);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.copyOf((Map) this.f29418g);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.copyOf((Map) this.f29417f);
    }
}
