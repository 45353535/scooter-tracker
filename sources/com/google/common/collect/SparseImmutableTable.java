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
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@Immutable(containerOf = {"R", "C", ExifInterface.GPS_MEASUREMENT_INTERRUPTED})
@GwtCompatible
@ElementTypesAreNonnullByDefault
final class SparseImmutableTable<R, C, V> extends RegularImmutableTable<R, C, V> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    static final ImmutableTable f30231h = new SparseImmutableTable(ImmutableList.of(), ImmutableSet.of(), ImmutableSet.of());

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ImmutableMap f30232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ImmutableMap f30233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f30234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f30235g;

    /* JADX WARN: Multi-variable type inference failed */
    SparseImmutableTable(ImmutableList immutableList, ImmutableSet immutableSet, ImmutableSet immutableSet2) {
        ImmutableMap immutableMapU = Maps.u(immutableSet);
        LinkedHashMap linkedHashMapNewLinkedHashMap = Maps.newLinkedHashMap();
        UnmodifiableIterator it = immutableSet.iterator();
        while (it.hasNext()) {
            linkedHashMapNewLinkedHashMap.put(it.next(), new LinkedHashMap());
        }
        LinkedHashMap linkedHashMapNewLinkedHashMap2 = Maps.newLinkedHashMap();
        UnmodifiableIterator it2 = immutableSet2.iterator();
        while (it2.hasNext()) {
            linkedHashMapNewLinkedHashMap2.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        for (int i10 = 0; i10 < immutableList.size(); i10++) {
            Table.Cell cell = (Table.Cell) immutableList.get(i10);
            Object rowKey = cell.getRowKey();
            Object columnKey = cell.getColumnKey();
            Object value = cell.getValue();
            Integer num = (Integer) immutableMapU.get(rowKey);
            Objects.requireNonNull(num);
            iArr[i10] = num.intValue();
            Map map = (Map) linkedHashMapNewLinkedHashMap.get(rowKey);
            Objects.requireNonNull(map);
            Map map2 = map;
            iArr2[i10] = map2.size();
            q(rowKey, columnKey, map2.put(columnKey, value), value);
            Map map3 = (Map) linkedHashMapNewLinkedHashMap2.get(columnKey);
            Objects.requireNonNull(map3);
            map3.put(rowKey, value);
        }
        this.f30234f = iArr;
        this.f30235g = iArr2;
        ImmutableMap.Builder builder = new ImmutableMap.Builder(linkedHashMapNewLinkedHashMap.size());
        for (Map.Entry entry : linkedHashMapNewLinkedHashMap.entrySet()) {
            builder.put(entry.getKey(), ImmutableMap.copyOf((Map) entry.getValue()));
        }
        this.f30232d = builder.buildOrThrow();
        ImmutableMap.Builder builder2 = new ImmutableMap.Builder(linkedHashMapNewLinkedHashMap2.size());
        for (Map.Entry entry2 : linkedHashMapNewLinkedHashMap2.entrySet()) {
            builder2.put(entry2.getKey(), ImmutableMap.copyOf((Map) entry2.getValue()));
        }
        this.f30233e = builder2.buildOrThrow();
    }

    @Override // com.google.common.collect.Table
    public int size() {
        return this.f30234f.length;
    }

    @Override // com.google.common.collect.RegularImmutableTable
    Table.Cell u(int i10) {
        Map.Entry entry = (Map.Entry) this.f30232d.entrySet().asList().get(this.f30234f[i10]);
        ImmutableMap immutableMap = (ImmutableMap) entry.getValue();
        Map.Entry entry2 = (Map.Entry) immutableMap.entrySet().asList().get(this.f30235g[i10]);
        return ImmutableTable.k(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    @Override // com.google.common.collect.RegularImmutableTable
    Object v(int i10) {
        ImmutableMap immutableMap = (ImmutableMap) this.f30232d.values().asList().get(this.f30234f[i10]);
        return immutableMap.values().asList().get(this.f30235g[i10]);
    }

    @Override // com.google.common.collect.RegularImmutableTable, com.google.common.collect.ImmutableTable
    @J2ktIncompatible
    @GwtIncompatible
    Object writeReplace() {
        ImmutableMap immutableMapU = Maps.u(columnKeySet());
        int[] iArr = new int[cellSet().size()];
        UnmodifiableIterator<Table.Cell<R, C, V>> it = cellSet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Integer num = (Integer) immutableMapU.get(it.next().getColumnKey());
            Objects.requireNonNull(num);
            iArr[i10] = num.intValue();
            i10++;
        }
        return ImmutableTable.SerializedForm.a(this, this.f30234f, iArr);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.copyOf((Map) this.f30233e);
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.copyOf((Map) this.f30232d);
    }
}
