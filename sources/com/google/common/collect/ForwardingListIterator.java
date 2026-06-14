package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingListIterator<E> extends ForwardingIterator<E> implements ListIterator<E> {
    @Override // java.util.ListIterator
    public void add(@ParametricNullness E e10) {
        n().add(e10);
    }

    @Override // java.util.ListIterator
    public boolean hasPrevious() {
        return n().hasPrevious();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingIterator
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public abstract ListIterator n();

    @Override // java.util.ListIterator
    public int nextIndex() {
        return n().nextIndex();
    }

    @Override // java.util.ListIterator
    @ParametricNullness
    @CanIgnoreReturnValue
    public E previous() {
        return (E) n().previous();
    }

    @Override // java.util.ListIterator
    public int previousIndex() {
        return n().previousIndex();
    }

    @Override // java.util.ListIterator
    public void set(@ParametricNullness E e10) {
        n().set(e10);
    }
}
