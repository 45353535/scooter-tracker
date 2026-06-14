package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.Multiset;

/* JADX INFO: loaded from: classes9.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
final class DescendingImmutableSortedMultiset<E> extends ImmutableSortedMultiset<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final transient ImmutableSortedMultiset f29434f;

    DescendingImmutableSortedMultiset(ImmutableSortedMultiset immutableSortedMultiset) {
        this.f29434f = immutableSortedMultiset;
    }

    @Override // com.google.common.collect.Multiset
    public int count(Object obj) {
        return this.f29434f.count(obj);
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> firstEntry() {
        return this.f29434f.lastEntry();
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return this.f29434f.isPartialView();
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> lastEntry() {
        return this.f29434f.firstEntry();
    }

    @Override // com.google.common.collect.ImmutableMultiset
    Multiset.Entry o(int i10) {
        return this.f29434f.entrySet().asList().reverse().get(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        return this.f29434f.size();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public ImmutableSortedMultiset<E> descendingMultiset() {
        return this.f29434f;
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public ImmutableSortedMultiset<E> headMultiset(E e10, BoundType boundType) {
        return this.f29434f.tailMultiset((Object) e10, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.SortedMultiset
    public ImmutableSortedMultiset<E> tailMultiset(E e10, BoundType boundType) {
        return this.f29434f.headMultiset((Object) e10, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.ImmutableSortedMultiset, com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public ImmutableSortedSet<E> elementSet() {
        return this.f29434f.elementSet().descendingSet();
    }
}
