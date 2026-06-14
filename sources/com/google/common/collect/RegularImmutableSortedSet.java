package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
final class RegularImmutableSortedSet<E> extends ImmutableSortedSet<E> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final RegularImmutableSortedSet f30177g = new RegularImmutableSortedSet(ImmutableList.of(), Ordering.natural());

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final transient ImmutableList f30178f;

    RegularImmutableSortedSet(ImmutableList immutableList, Comparator comparator) {
        super(comparator);
        this.f30178f = immutableList;
    }

    private int G(Object obj) {
        return Collections.binarySearch(this.f30178f, obj, H());
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    ImmutableSortedSet A(Object obj, boolean z10) {
        return D(F(obj, z10), size());
    }

    RegularImmutableSortedSet D(int i10, int i11) {
        return (i10 == 0 && i11 == size()) ? this : i10 < i11 ? new RegularImmutableSortedSet(this.f30178f.subList(i10, i11), this.f29699d) : ImmutableSortedSet.u(this.f29699d);
    }

    int E(Object obj, boolean z10) {
        int iBinarySearch = Collections.binarySearch(this.f30178f, Preconditions.checkNotNull(obj), comparator());
        return iBinarySearch >= 0 ? z10 ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    int F(Object obj, boolean z10) {
        int iBinarySearch = Collections.binarySearch(this.f30178f, Preconditions.checkNotNull(obj), comparator());
        return iBinarySearch >= 0 ? z10 ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    Comparator H() {
        return this.f29699d;
    }

    @Override // com.google.common.collect.ImmutableCollection
    int a(Object[] objArr, int i10) {
        return this.f30178f.a(objArr, i10);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        return this.f30178f;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E ceiling(E e10) {
        int iF = F(e10, true);
        if (iF == size()) {
            return null;
        }
        return this.f30178f.get(iF);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (G(obj) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).elementSet();
        }
        if (!SortedIterables.hasSameComparator(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        UnmodifiableIterator<E> it = iterator();
        Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int iB = B(next2, next);
                if (iB < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (iB == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iB > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!SortedIterables.hasSameComparator(this.f29699d, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            UnmodifiableIterator<E> it2 = iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                E next2 = it.next();
                if (next2 == null || B(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public E first() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f30178f.get(0);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E floor(E e10) {
        int iE = E(e10, true) - 1;
        if (iE == -1) {
            return null;
        }
        return this.f30178f.get(iE);
    }

    @Override // com.google.common.collect.ImmutableCollection
    Object[] g() {
        return this.f30178f.g();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E higher(E e10) {
        int iF = F(e10, false);
        if (iF == size()) {
            return null;
        }
        return this.f30178f.get(iF);
    }

    @Override // com.google.common.collect.ImmutableCollection
    int i() {
        return this.f30178f.i();
    }

    int indexOf(Object obj) {
        int iBinarySearch;
        if (obj == null) {
            return -1;
        }
        try {
            iBinarySearch = Collections.binarySearch(this.f30178f, obj, H());
        } catch (ClassCastException unused) {
        }
        if (iBinarySearch >= 0) {
            return iBinarySearch;
        }
        return -1;
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return this.f30178f.isPartialView();
    }

    @Override // com.google.common.collect.ImmutableCollection
    int j() {
        return this.f30178f.j();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public E last() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.f30178f.get(size() - 1);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    public E lower(E e10) {
        int iE = E(e10, false) - 1;
        if (iE == -1) {
            return null;
        }
        return this.f30178f.get(iE);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f30178f.size();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    ImmutableSortedSet t() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f29699d);
        return isEmpty() ? ImmutableSortedSet.u(comparatorReverseOrder) : new RegularImmutableSortedSet(this.f30178f.reverse(), comparatorReverseOrder);
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    ImmutableSortedSet v(Object obj, boolean z10) {
        return D(0, E(obj, z10));
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    @GwtIncompatible
    Object writeReplace() {
        return super.writeReplace();
    }

    @Override // com.google.common.collect.ImmutableSortedSet
    ImmutableSortedSet x(Object obj, boolean z10, Object obj2, boolean z11) {
        return A(obj, z10).v(obj2, z11);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public UnmodifiableIterator<E> descendingIterator() {
        return this.f30178f.reverse().iterator();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
        return this.f30178f.iterator();
    }
}
