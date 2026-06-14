package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.collect.ForwardingQueue;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
@GwtIncompatible
public abstract class ForwardingBlockingQueue<E> extends ForwardingQueue<E> implements BlockingQueue<E> {
    @Override // java.util.concurrent.BlockingQueue
    @CanIgnoreReturnValue
    public int drainTo(Collection<? super E> collection, int i10) {
        return n().drainTo(collection, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingQueue
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public abstract BlockingQueue n();

    @Override // java.util.concurrent.BlockingQueue
    @CanIgnoreReturnValue
    public boolean offer(E e10, long j10, TimeUnit timeUnit) throws InterruptedException {
        return n().offer(e10, j10, timeUnit);
    }

    @Override // java.util.concurrent.BlockingQueue
    @CanIgnoreReturnValue
    public E poll(long j10, TimeUnit timeUnit) throws InterruptedException {
        return (E) n().poll(j10, timeUnit);
    }

    @Override // java.util.concurrent.BlockingQueue
    public void put(E e10) throws InterruptedException {
        n().put(e10);
    }

    @Override // java.util.concurrent.BlockingQueue
    public int remainingCapacity() {
        return n().remainingCapacity();
    }

    @Override // java.util.concurrent.BlockingQueue
    @CanIgnoreReturnValue
    public E take() throws InterruptedException {
        return (E) n().take();
    }

    @Override // java.util.concurrent.BlockingQueue
    @CanIgnoreReturnValue
    public int drainTo(Collection<? super E> collection) {
        return n().drainTo(collection);
    }
}
