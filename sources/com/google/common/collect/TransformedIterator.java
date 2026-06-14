package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class TransformedIterator<F, T> implements Iterator<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Iterator f30323b;

    TransformedIterator(Iterator it) {
        this.f30323b = (Iterator) Preconditions.checkNotNull(it);
    }

    abstract Object a(Object obj);

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f30323b.hasNext();
    }

    @Override // java.util.Iterator
    @ParametricNullness
    public final T next() {
        return (T) a(this.f30323b.next());
    }

    @Override // java.util.Iterator
    public final void remove() {
        this.f30323b.remove();
    }
}
