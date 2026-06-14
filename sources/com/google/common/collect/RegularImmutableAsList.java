package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
class RegularImmutableAsList<E> extends ImmutableAsList<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final ImmutableCollection f30132d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ImmutableList f30133e;

    @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    int a(Object[] objArr, int i10) {
        return this.f30133e.a(objArr, i10);
    }

    @Override // com.google.common.collect.ImmutableCollection
    Object[] g() {
        return this.f30133e.g();
    }

    @Override // java.util.List
    public E get(int i10) {
        return this.f30133e.get(i10);
    }

    @Override // com.google.common.collect.ImmutableCollection
    int i() {
        return this.f30133e.i();
    }

    @Override // com.google.common.collect.ImmutableCollection
    int j() {
        return this.f30133e.j();
    }

    @Override // com.google.common.collect.ImmutableAsList
    ImmutableCollection o() {
        return this.f30132d;
    }

    @Override // com.google.common.collect.ImmutableAsList, com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    @GwtIncompatible
    Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableList, java.util.List
    public UnmodifiableListIterator<E> listIterator(int i10) {
        return this.f30133e.listIterator(i10);
    }
}
