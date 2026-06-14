package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.SortedMultisets;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
abstract class DescendingMultiset<E> extends ForwardingMultiset<E> implements SortedMultiset<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Comparator f29436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient NavigableSet f29437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient Set f29438d;

    DescendingMultiset() {
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public Comparator<? super E> comparator() {
        Comparator<? super E> comparator = this.f29436b;
        if (comparator != null) {
            return comparator;
        }
        Ordering orderingReverse = Ordering.from(r().comparator()).reverse();
        this.f29436b = orderingReverse;
        return orderingReverse;
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> descendingMultiset() {
        return r();
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public Set<Multiset.Entry<E>> entrySet() {
        Set<Multiset.Entry<E>> set = this.f29438d;
        if (set != null) {
            return set;
        }
        Set<Multiset.Entry<E>> setO = o();
        this.f29438d = setO;
        return setO;
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> firstEntry() {
        return r().lastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> headMultiset(@ParametricNullness E e10, BoundType boundType) {
        return r().tailMultiset(e10, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return Multisets.h(this);
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> lastEntry() {
        return r().firstEntry();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.ForwardingCollection
    public Multiset n() {
        return r();
    }

    Set o() {
        return new Multisets.EntrySet<E>() { // from class: com.google.common.collect.DescendingMultiset.1EntrySetImpl
            @Override // com.google.common.collect.Multisets.EntrySet
            Multiset e() {
                return DescendingMultiset.this;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public Iterator<Multiset.Entry<E>> iterator() {
                return DescendingMultiset.this.q();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                return DescendingMultiset.this.r().entrySet().size();
            }
        };
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> pollFirstEntry() {
        return r().pollLastEntry();
    }

    @Override // com.google.common.collect.SortedMultiset
    public Multiset.Entry<E> pollLastEntry() {
        return r().pollFirstEntry();
    }

    abstract Iterator q();

    abstract SortedMultiset r();

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> subMultiset(@ParametricNullness E e10, BoundType boundType, @ParametricNullness E e11, BoundType boundType2) {
        return r().subMultiset(e11, boundType2, e10, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.SortedMultiset
    public SortedMultiset<E> tailMultiset(@ParametricNullness E e10, BoundType boundType) {
        return r().headMultiset(e10, boundType).descendingMultiset();
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return l();
    }

    @Override // com.google.common.collect.ForwardingObject
    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) m(tArr);
    }

    @Override // com.google.common.collect.ForwardingMultiset, com.google.common.collect.Multiset
    public NavigableSet<E> elementSet() {
        NavigableSet<E> navigableSet = this.f29437c;
        if (navigableSet != null) {
            return navigableSet;
        }
        SortedMultisets.NavigableElementSet navigableElementSet = new SortedMultisets.NavigableElementSet(this);
        this.f29437c = navigableElementSet;
        return navigableElementSet;
    }
}
