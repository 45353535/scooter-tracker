package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.Comparator;
import java.util.NavigableSet;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
final class UnmodifiableSortedMultiset<E> extends Multisets.UnmodifiableMultiset<E> implements SortedMultiset<E> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient UnmodifiableSortedMultiset f30426e;

    UnmodifiableSortedMultiset(SortedMultiset sortedMultiset) {
        super(sortedMultiset);
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public Comparator<? super E> comparator() {
        return n().comparator();
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> descendingMultiset() {
        UnmodifiableSortedMultiset unmodifiableSortedMultiset = this.f30426e;
        if (unmodifiableSortedMultiset != null) {
            return unmodifiableSortedMultiset;
        }
        UnmodifiableSortedMultiset unmodifiableSortedMultiset2 = new UnmodifiableSortedMultiset(n().descendingMultiset());
        unmodifiableSortedMultiset2.f30426e = this;
        this.f30426e = unmodifiableSortedMultiset2;
        return unmodifiableSortedMultiset2;
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> firstEntry() {
        return n().firstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> headMultiset(@ParametricNullness E e10, BoundType boundType) {
        return Multisets.unmodifiableSortedMultiset(n().headMultiset(e10, boundType));
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> lastEntry() {
        return n().lastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public NavigableSet o() {
        return Sets.unmodifiableNavigableSet(n().elementSet());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public SortedMultiset n() {
        return (SortedMultiset) super.n();
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> subMultiset(@ParametricNullness E e10, BoundType boundType, @ParametricNullness E e11, BoundType boundType2) {
        return Multisets.unmodifiableSortedMultiset(n().subMultiset(e10, boundType, e11, boundType2));
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> tailMultiset(@ParametricNullness E e10, BoundType boundType) {
        return Multisets.unmodifiableSortedMultiset(n().tailMultiset(e10, boundType));
    }

    @Override // com.google.common.collect.Multisets.UnmodifiableMultiset, com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public NavigableSet<E> elementSet() {
        return (NavigableSet) super.elementSet();
    }
}
