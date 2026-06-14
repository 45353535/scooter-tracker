package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.primitives.Ints;
import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
final class RegularImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final long[] f30171j = {0};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final ImmutableSortedMultiset f30172k = new RegularImmutableSortedMultiset(Ordering.natural());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient RegularImmutableSortedSet f30173f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final transient long[] f30174g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final transient int f30175h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final transient int f30176i;

    RegularImmutableSortedMultiset(Comparator comparator) {
        this.f30173f = ImmutableSortedSet.u(comparator);
        this.f30174g = f30171j;
        this.f30175h = 0;
        this.f30176i = 0;
    }

    private int B(int i10) {
        long[] jArr = this.f30174g;
        int i11 = this.f30175h;
        return (int) (jArr[(i11 + i10) + 1] - jArr[i11 + i10]);
    }

    ImmutableSortedMultiset C(int i10, int i11) {
        Preconditions.checkPositionIndexes(i10, i11, this.f30176i);
        return i10 == i11 ? ImmutableSortedMultiset.x(comparator()) : (i10 == 0 && i11 == this.f30176i) ? this : new RegularImmutableSortedMultiset(this.f30173f.D(i10, i11), this.f30174g, this.f30175h + i10, i11 - i10);
    }

    @Override // com.google.common.collect.Multiset
    public int count(Object obj) {
        int iIndexOf = this.f30173f.indexOf(obj);
        if (iIndexOf >= 0) {
            return B(iIndexOf);
        }
        return 0;
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> firstEntry() {
        if (isEmpty()) {
            return null;
        }
        return o(0);
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return this.f30175h > 0 || this.f30176i < this.f30174g.length - 1;
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> lastEntry() {
        if (isEmpty()) {
            return null;
        }
        return o(this.f30176i - 1);
    }

    @Override // com.google.common.collect.ImmutableMultiset
    Multiset.Entry o(int i10) {
        return Multisets.immutableEntry(this.f30173f.asList().get(i10), B(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        long[] jArr = this.f30174g;
        int i10 = this.f30175h;
        return Ints.saturatedCast(jArr[this.f30176i + i10] - jArr[i10]);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public ImmutableSortedMultiset<E> headMultiset(E e10, BoundType boundType) {
        return C(0, this.f30173f.E(e10, Preconditions.checkNotNull(boundType) == BoundType.CLOSED));
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public ImmutableSortedMultiset<E> tailMultiset(E e10, BoundType boundType) {
        return C(this.f30173f.F(e10, Preconditions.checkNotNull(boundType) == BoundType.CLOSED), this.f30176i);
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public ImmutableSortedSet<E> elementSet() {
        return this.f30173f;
    }

    RegularImmutableSortedMultiset(RegularImmutableSortedSet regularImmutableSortedSet, long[] jArr, int i10, int i11) {
        this.f30173f = regularImmutableSortedSet;
        this.f30174g = jArr;
        this.f30175h = i10;
        this.f30176i = i11;
    }
}
