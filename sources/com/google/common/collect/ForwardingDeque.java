package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Deque;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingDeque<E> extends ForwardingQueue<E> implements Deque<E> {
    @Override // java.util.Deque
    public void addFirst(@ParametricNullness E e10) {
        n().addFirst(e10);
    }

    @Override // java.util.Deque
    public void addLast(@ParametricNullness E e10) {
        n().addLast(e10);
    }

    @Override // java.util.Deque
    public Iterator<E> descendingIterator() {
        return n().descendingIterator();
    }

    @Override // java.util.Deque
    @ParametricNullness
    public E getFirst() {
        return (E) n().getFirst();
    }

    @Override // java.util.Deque
    @ParametricNullness
    public E getLast() {
        return (E) n().getLast();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingQueue
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public abstract Deque n();

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean offerFirst(@ParametricNullness E e10) {
        return n().offerFirst(e10);
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean offerLast(@ParametricNullness E e10) {
        return n().offerLast(e10);
    }

    @Override // java.util.Deque
    public E peekFirst() {
        return (E) n().peekFirst();
    }

    @Override // java.util.Deque
    public E peekLast() {
        return (E) n().peekLast();
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public E pollFirst() {
        return (E) n().pollFirst();
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public E pollLast() {
        return (E) n().pollLast();
    }

    @Override // java.util.Deque
    @ParametricNullness
    @CanIgnoreReturnValue
    public E pop() {
        return (E) n().pop();
    }

    @Override // java.util.Deque
    public void push(@ParametricNullness E e10) {
        n().push(e10);
    }

    @Override // java.util.Deque
    @ParametricNullness
    @CanIgnoreReturnValue
    public E removeFirst() {
        return (E) n().removeFirst();
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean removeFirstOccurrence(Object obj) {
        return n().removeFirstOccurrence(obj);
    }

    @Override // java.util.Deque
    @ParametricNullness
    @CanIgnoreReturnValue
    public E removeLast() {
        return (E) n().removeLast();
    }

    @Override // java.util.Deque
    @CanIgnoreReturnValue
    public boolean removeLastOccurrence(Object obj) {
        return n().removeLastOccurrence(obj);
    }
}
