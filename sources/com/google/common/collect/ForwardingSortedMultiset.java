package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.SortedMultisets;
import java.util.Comparator;
import java.util.NavigableSet;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedMultiset<E> extends ForwardingMultiset<E> implements SortedMultiset<E> {

    protected abstract class StandardDescendingMultiset extends DescendingMultiset<E> {
        public StandardDescendingMultiset() {
        }

        @Override // com.google.common.collect.DescendingMultiset
        SortedMultiset r() {
            return ForwardingSortedMultiset.this;
        }
    }

    protected class StandardElementSet extends SortedMultisets.NavigableElementSet<E> {
        public StandardElementSet() {
            super(ForwardingSortedMultiset.this);
        }
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public Comparator<? super E> comparator() {
        return n().comparator();
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> descendingMultiset() {
        return n().descendingMultiset();
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> firstEntry() {
        return n().firstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> headMultiset(@ParametricNullness E e10, BoundType boundType) {
        return n().headMultiset(e10, boundType);
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> lastEntry() {
        return n().lastEntry();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMultiset
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public abstract SortedMultiset n();

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> pollFirstEntry() {
        return n().pollFirstEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> pollLastEntry() {
        return n().pollLastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> subMultiset(@ParametricNullness E e10, BoundType boundType, @ParametricNullness E e11, BoundType boundType2) {
        return n().subMultiset(e10, boundType, e11, boundType2);
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> tailMultiset(@ParametricNullness E e10, BoundType boundType) {
        return n().tailMultiset(e10, boundType);
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public NavigableSet<E> elementSet() {
        return n().elementSet();
    }
}
