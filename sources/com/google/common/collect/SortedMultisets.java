package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
final class SortedMultisets {

    static class ElementSet<E> extends Multisets.ElementSet<E> implements SortedSet<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final SortedMultiset f30230b;

        ElementSet(SortedMultiset sortedMultiset) {
            this.f30230b = sortedMultiset;
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return e().comparator();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.Multisets.ElementSet
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final SortedMultiset e() {
            return this.f30230b;
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public E first() {
            return (E) SortedMultisets.d(e().firstEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(@ParametricNullness E e10) {
            return e().headMultiset(e10, BoundType.OPEN).elementSet();
        }

        @Override // com.google.common.collect.Multisets.ElementSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return Multisets.e(e().entrySet().iterator());
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public E last() {
            return (E) SortedMultisets.d(e().lastEntry());
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(@ParametricNullness E e10, @ParametricNullness E e11) {
            return e().subMultiset(e10, BoundType.CLOSED, e11, BoundType.OPEN).elementSet();
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(@ParametricNullness E e10) {
            return e().tailMultiset(e10, BoundType.CLOSED).elementSet();
        }
    }

    @GwtIncompatible
    static class NavigableElementSet<E> extends ElementSet<E> implements NavigableSet<E> {
        NavigableElementSet(SortedMultiset sortedMultiset) {
            super(sortedMultiset);
        }

        @Override // java.util.NavigableSet
        public E ceiling(@ParametricNullness E e10) {
            return (E) SortedMultisets.c(e().tailMultiset(e10, BoundType.CLOSED).firstEntry());
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return descendingSet().iterator();
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return new NavigableElementSet(e().descendingMultiset());
        }

        @Override // java.util.NavigableSet
        public E floor(@ParametricNullness E e10) {
            return (E) SortedMultisets.c(e().headMultiset(e10, BoundType.CLOSED).lastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@ParametricNullness E e10, boolean z10) {
            return new NavigableElementSet(e().headMultiset(e10, BoundType.g(z10)));
        }

        @Override // java.util.NavigableSet
        public E higher(@ParametricNullness E e10) {
            return (E) SortedMultisets.c(e().tailMultiset(e10, BoundType.OPEN).firstEntry());
        }

        @Override // java.util.NavigableSet
        public E lower(@ParametricNullness E e10) {
            return (E) SortedMultisets.c(e().headMultiset(e10, BoundType.OPEN).lastEntry());
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            return (E) SortedMultisets.c(e().pollFirstEntry());
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            return (E) SortedMultisets.c(e().pollLastEntry());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@ParametricNullness E e10, boolean z10, @ParametricNullness E e11, boolean z11) {
            return new NavigableElementSet(e().subMultiset(e10, BoundType.g(z10), e11, BoundType.g(z11)));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@ParametricNullness E e10, boolean z10) {
            return new NavigableElementSet(e().tailMultiset(e10, BoundType.g(z10)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object c(Multiset.Entry entry) {
        if (entry == null) {
            return null;
        }
        return entry.getElement();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Object d(Multiset.Entry entry) {
        if (entry != null) {
            return entry.getElement();
        }
        throw new NoSuchElementException();
    }
}
