package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.collect.Sets;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes9.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E> {

    protected class StandardDescendingSet extends Sets.DescendingSet<E> {
        public StandardDescendingSet() {
            super(ForwardingNavigableSet.this);
        }
    }

    protected ForwardingNavigableSet() {
    }

    @Override // java.util.NavigableSet
    public E ceiling(@ParametricNullness E e10) {
        return (E) n().ceiling(e10);
    }

    @Override // java.util.NavigableSet
    public Iterator<E> descendingIterator() {
        return n().descendingIterator();
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> descendingSet() {
        return n().descendingSet();
    }

    @Override // java.util.NavigableSet
    public E floor(@ParametricNullness E e10) {
        return (E) n().floor(e10);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> headSet(@ParametricNullness E e10, boolean z10) {
        return n().headSet(e10, z10);
    }

    @Override // java.util.NavigableSet
    public E higher(@ParametricNullness E e10) {
        return (E) n().higher(e10);
    }

    @Override // java.util.NavigableSet
    public E lower(@ParametricNullness E e10) {
        return (E) n().lower(e10);
    }

    @Override // java.util.NavigableSet
    public E pollFirst() {
        return (E) n().pollFirst();
    }

    @Override // java.util.NavigableSet
    public E pollLast() {
        return (E) n().pollLast();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingSortedSet
    /* JADX INFO: renamed from: r */
    public abstract NavigableSet n();

    /* JADX WARN: Multi-variable type inference failed */
    protected SortedSet s(Object obj) {
        return headSet(obj, false);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> subSet(@ParametricNullness E e10, boolean z10, @ParametricNullness E e11, boolean z11) {
        return n().subSet(e10, z10, e11, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected SortedSet t(Object obj, Object obj2) {
        return subSet(obj, true, obj2, false);
    }

    @Override // java.util.NavigableSet
    public NavigableSet<E> tailSet(@ParametricNullness E e10, boolean z10) {
        return n().tailSet(e10, z10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected SortedSet u(Object obj) {
        return tailSet(obj, true);
    }
}
