package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import java.util.Collection;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
@GwtIncompatible
@Deprecated
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingBlockingDeque<E> extends ForwardingDeque<E> implements BlockingDeque<E> {
    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection) {
        return n().drainTo(collection);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public boolean offer(E e10, long j10, TimeUnit timeUnit) throws InterruptedException {
        return n().offer(e10, j10, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerFirst(E e10, long j10, TimeUnit timeUnit) throws InterruptedException {
        return n().offerFirst(e10, j10, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public boolean offerLast(E e10, long j10, TimeUnit timeUnit) throws InterruptedException {
        return n().offerLast(e10, j10, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public E poll(long j10, TimeUnit timeUnit) throws InterruptedException {
        return (E) n().poll(j10, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public E pollFirst(long j10, TimeUnit timeUnit) throws InterruptedException {
        return (E) n().pollFirst(j10, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque
    public E pollLast(long j10, TimeUnit timeUnit) throws InterruptedException {
        return (E) n().pollLast(j10, timeUnit);
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public void put(E e10) throws InterruptedException {
        n().put(e10);
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putFirst(E e10) throws InterruptedException {
        n().putFirst(e10);
    }

    @Override // java.util.concurrent.BlockingDeque
    public void putLast(E e10) throws InterruptedException {
        n().putLast(e10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingDeque
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public abstract BlockingDeque n();

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return n().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingDeque, java.util.concurrent.BlockingQueue
    public E take() throws InterruptedException {
        return (E) n().take();
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeFirst() throws InterruptedException {
        return (E) n().takeFirst();
    }

    @Override // java.util.concurrent.BlockingDeque
    public E takeLast() throws InterruptedException {
        return (E) n().takeLast();
    }

    @Override // java.util.concurrent.BlockingQueue
    public int drainTo(Collection<? super E> collection, int i10) {
        return n().drainTo(collection, i10);
    }
}
