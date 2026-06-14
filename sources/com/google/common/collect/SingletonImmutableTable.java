package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableTable;
import com.google.common.collect.Table;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
class SingletonImmutableTable<R, C, V> extends ImmutableTable<R, C, V> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Object f30225d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final Object f30226e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final Object f30227f;

    SingletonImmutableTable(Object obj, Object obj2, Object obj3) {
        this.f30225d = Preconditions.checkNotNull(obj);
        this.f30226e = Preconditions.checkNotNull(obj2);
        this.f30227f = Preconditions.checkNotNull(obj3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    /* JADX INFO: renamed from: m */
    public ImmutableSet g() {
        return ImmutableSet.of(ImmutableTable.k(this.f30225d, this.f30226e, this.f30227f));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.AbstractTable
    /* JADX INFO: renamed from: n */
    public ImmutableCollection h() {
        return ImmutableSet.of(this.f30227f);
    }

    @Override // com.google.common.collect.Table
    public int size() {
        return 1;
    }

    @Override // com.google.common.collect.ImmutableTable
    @J2ktIncompatible
    @GwtIncompatible
    Object writeReplace() {
        return ImmutableTable.SerializedForm.a(this, new int[]{0}, new int[]{0});
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<R, V> column(C c10) {
        Preconditions.checkNotNull(c10);
        return containsColumn(c10) ? ImmutableMap.of(this.f30225d, this.f30227f) : ImmutableMap.of();
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.of(this.f30226e, ImmutableMap.of(this.f30225d, this.f30227f));
    }

    @Override // com.google.common.collect.ImmutableTable, com.google.common.collect.Table
    public ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.of(this.f30225d, ImmutableMap.of(this.f30226e, this.f30227f));
    }

    SingletonImmutableTable(Table.Cell cell) {
        this(cell.getRowKey(), cell.getColumnKey(), cell.getValue());
    }
}
