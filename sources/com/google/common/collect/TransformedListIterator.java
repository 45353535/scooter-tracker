package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class TransformedListIterator<F, T> extends TransformedIterator<F, T> implements ListIterator<T> {
    TransformedListIterator(ListIterator listIterator) {
        super(listIterator);
    }

    private ListIterator b() {
        return (ListIterator) this.f30323b;
    }

    @Override // java.util.ListIterator
    public void add(@ParametricNullness T t10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return b().hasPrevious();
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return b().nextIndex();
    }

    @Override // java.util.ListIterator
    @ParametricNullness
    public final T previous() {
        return (T) a(b().previous());
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return b().previousIndex();
    }

    public void set(@ParametricNullness T t10) {
        throw new UnsupportedOperationException();
    }
}
