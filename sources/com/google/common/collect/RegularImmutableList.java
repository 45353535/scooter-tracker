package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import j$.util.Objects;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
class RegularImmutableList<E> extends ImmutableList<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final ImmutableList f30140f = new RegularImmutableList(new Object[0], 0);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f30141d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f30142e;

    RegularImmutableList(Object[] objArr, int i10) {
        this.f30141d = objArr;
        this.f30142e = i10;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    int a(Object[] objArr, int i10) {
        System.arraycopy(this.f30141d, 0, objArr, i10, this.f30142e);
        return i10 + this.f30142e;
    }

    @Override // com.google.common.collect.ImmutableCollection
    Object[] g() {
        return this.f30141d;
    }

    @Override // java.util.List
    public E get(int i10) {
        Preconditions.checkElementIndex(i10, this.f30142e);
        E e10 = (E) this.f30141d[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // com.google.common.collect.ImmutableCollection
    int i() {
        return this.f30142e;
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    int j() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f30142e;
    }

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    @GwtIncompatible
    Object writeReplace() {
        return super.writeReplace();
    }
}
