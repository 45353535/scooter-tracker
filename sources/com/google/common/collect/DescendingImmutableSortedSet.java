package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;

/* JADX INFO: loaded from: classes9.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
final class DescendingImmutableSortedSet<E> extends ImmutableSortedSet<E> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final ImmutableSortedSet f29435f;

    DescendingImmutableSortedSet(ImmutableSortedSet immutableSortedSet) {
        super(Ordering.from(immutableSortedSet.comparator()).reverse());
        this.f29435f = immutableSortedSet;
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    ImmutableSortedSet A(Object obj, boolean z10) {
        return this.f29435f.headSet(obj, z10).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E ceiling(E e10) {
        return (E) this.f29435f.floor(e10);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f29435f.contains(obj);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E floor(E e10) {
        return (E) this.f29435f.ceiling(e10);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E higher(E e10) {
        return (E) this.f29435f.lower(e10);
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return this.f29435f.isPartialView();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E lower(E e10) {
        return (E) this.f29435f.higher(e10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f29435f.size();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    ImmutableSortedSet t() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    ImmutableSortedSet v(Object obj, boolean z10) {
        return this.f29435f.tailSet(obj, z10).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    ImmutableSortedSet x(Object obj, boolean z10, Object obj2, boolean z11) {
        return this.f29435f.subSet(obj2, z11, obj, z10).descendingSet();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible("NavigableSet")
    public UnmodifiableIterator<E> descendingIterator() {
        return this.f29435f.iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible("NavigableSet")
    public ImmutableSortedSet<E> descendingSet() {
        return this.f29435f;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
        return this.f29435f.descendingIterator();
    }
}
