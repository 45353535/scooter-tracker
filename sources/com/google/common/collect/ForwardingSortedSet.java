package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Comparator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingSortedSet<E> extends ForwardingSet<E> implements SortedSet<E> {
    protected ForwardingSortedSet() {
    }

    @Override // java.util.SortedSet
    public Comparator<? super E> comparator() {
        return n().comparator();
    }

    @Override // java.util.SortedSet
    @ParametricNullness
    public E first() {
        return (E) n().first();
    }

    @Override // java.util.SortedSet
    public SortedSet<E> headSet(@ParametricNullness E e10) {
        return n().headSet(e10);
    }

    @Override // java.util.SortedSet
    @ParametricNullness
    public E last() {
        return (E) n().last();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingSet
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public abstract SortedSet n();

    @Override // java.util.SortedSet
    public SortedSet<E> subSet(@ParametricNullness E e10, @ParametricNullness E e11) {
        return n().subSet(e10, e11);
    }

    @Override // java.util.SortedSet
    public SortedSet<E> tailSet(@ParametricNullness E e10) {
        return n().tailSet(e10);
    }
}
