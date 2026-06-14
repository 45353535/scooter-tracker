package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingIterator<T> extends ForwardingObject implements Iterator<T> {
    protected ForwardingIterator() {
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract Iterator n();

    @Override // java.util.Iterator
    public boolean hasNext() {
        return n().hasNext();
    }

    @ParametricNullness
    @CanIgnoreReturnValue
    public T next() {
        return (T) n().next();
    }

    public void remove() {
        n().remove();
    }
}
