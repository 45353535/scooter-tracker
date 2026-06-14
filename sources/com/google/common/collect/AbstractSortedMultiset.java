package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.SortedMultisets;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
abstract class AbstractSortedMultiset<E> extends AbstractMultiset<E> implements SortedMultiset<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final Comparator f29290d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient SortedMultiset f29291e;

    AbstractSortedMultiset() {
        this(Ordering.natural());
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public Comparator<? super E> comparator() {
        return this.f29290d;
    }

    Iterator descendingIterator() {
        return Multisets.h(descendingMultiset());
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> descendingMultiset() {
        SortedMultiset<E> sortedMultiset = this.f29291e;
        if (sortedMultiset != null) {
            return sortedMultiset;
        }
        SortedMultiset<E> sortedMultisetL = l();
        this.f29291e = sortedMultisetL;
        return sortedMultisetL;
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> firstEntry() {
        Iterator itK = k();
        if (itK.hasNext()) {
            return (Multiset.Entry) itK.next();
        }
        return null;
    }

    SortedMultiset l() {
        return new DescendingMultiset<E>() { // from class: com.google.common.collect.AbstractSortedMultiset.1DescendingMultisetImpl
            @Override // com.google.common.collect.DescendingMultiset, com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<E> iterator() {
                return AbstractSortedMultiset.this.descendingIterator();
            }

            @Override // com.google.common.collect.DescendingMultiset
            Iterator q() {
                return AbstractSortedMultiset.this.n();
            }

            @Override // com.google.common.collect.DescendingMultiset
            SortedMultiset r() {
                return AbstractSortedMultiset.this;
            }
        };
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> lastEntry() {
        Iterator itN = n();
        if (itN.hasNext()) {
            return (Multiset.Entry) itN.next();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.AbstractMultiset
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public NavigableSet g() {
        return new SortedMultisets.NavigableElementSet(this);
    }

    abstract Iterator n();

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> pollFirstEntry() {
        Iterator itK = k();
        if (!itK.hasNext()) {
            return null;
        }
        Multiset.Entry entry = (Multiset.Entry) itK.next();
        Multiset.Entry<E> entryImmutableEntry = Multisets.immutableEntry(entry.getElement(), entry.getCount());
        itK.remove();
        return entryImmutableEntry;
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> pollLastEntry() {
        Iterator itN = n();
        if (!itN.hasNext()) {
            return null;
        }
        Multiset.Entry entry = (Multiset.Entry) itN.next();
        Multiset.Entry<E> entryImmutableEntry = Multisets.immutableEntry(entry.getElement(), entry.getCount());
        itN.remove();
        return entryImmutableEntry;
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> subMultiset(@ParametricNullness E e10, BoundType boundType, @ParametricNullness E e11, BoundType boundType2) {
        Preconditions.checkNotNull(boundType);
        Preconditions.checkNotNull(boundType2);
        return tailMultiset(e10, boundType).headMultiset(e11, boundType2);
    }

    AbstractSortedMultiset(Comparator comparator) {
        this.f29290d = (Comparator) Preconditions.checkNotNull(comparator);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public NavigableSet<E> elementSet() {
        return (NavigableSet) super.elementSet();
    }
}
