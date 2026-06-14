package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Queue;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingQueue<E> extends ForwardingCollection<E> implements Queue<E> {
    protected ForwardingQueue() {
    }

    @Override // java.util.Queue
    @ParametricNullness
    public E element() {
        return (E) n().element();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingCollection
    public abstract Queue n();

    @CanIgnoreReturnValue
    public boolean offer(@ParametricNullness E e10) {
        return n().offer(e10);
    }

    @Override // java.util.Queue
    public E peek() {
        return (E) n().peek();
    }

    @Override // java.util.Queue
    @CanIgnoreReturnValue
    public E poll() {
        return (E) n().poll();
    }

    @Override // java.util.Queue
    @ParametricNullness
    @CanIgnoreReturnValue
    public E remove() {
        return (E) n().remove();
    }
}
