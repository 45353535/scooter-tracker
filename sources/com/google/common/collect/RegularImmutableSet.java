package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
final class RegularImmutableSet<E> extends ImmutableSet<E> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object[] f30164i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    static final RegularImmutableSet f30165j;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Object[] f30166d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final transient int f30167e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient Object[] f30168f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient int f30169g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient int f30170h;

    static {
        Object[] objArr = new Object[0];
        f30164i = objArr;
        f30165j = new RegularImmutableSet(objArr, 0, objArr, 0, 0);
    }

    RegularImmutableSet(Object[] objArr, int i10, Object[] objArr2, int i11, int i12) {
        this.f30166d = objArr;
        this.f30167e = i10;
        this.f30168f = objArr2;
        this.f30169g = i11;
        this.f30170h = i12;
    }

    @Override // com.google.common.collect.ImmutableCollection
    int a(Object[] objArr, int i10) {
        System.arraycopy(this.f30166d, 0, objArr, i10, this.f30170h);
        return i10 + this.f30170h;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        Object[] objArr = this.f30168f;
        if (obj == null || objArr.length == 0) {
            return false;
        }
        int iD = Hashing.d(obj);
        while (true) {
            int i10 = iD & this.f30169g;
            Object obj2 = objArr[i10];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iD = i10 + 1;
        }
    }

    @Override // com.google.common.collect.ImmutableCollection
    Object[] g() {
        return this.f30166d;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return this.f30167e;
    }

    @Override // com.google.common.collect.ImmutableCollection
    int i() {
        return this.f30170h;
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    int j() {
        return 0;
    }

    @Override // com.google.common.collect.ImmutableSet
    ImmutableList o() {
        return ImmutableList.l(this.f30166d, this.f30170h);
    }

    @Override // com.google.common.collect.ImmutableSet
    boolean q() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f30170h;
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    @GwtIncompatible
    Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
        return asList().iterator();
    }
}
