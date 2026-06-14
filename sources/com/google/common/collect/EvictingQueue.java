package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.Serializable;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.Queue;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class EvictingQueue<E> extends ForwardingQueue<E> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Queue f29464b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f29465c;

    private EvictingQueue(int i10) {
        Preconditions.checkArgument(i10 >= 0, "maxSize (%s) must >= 0", i10);
        this.f29464b = new ArrayDeque(i10);
        this.f29465c = i10;
    }

    public static <E> EvictingQueue<E> create(int i10) {
        return new EvictingQueue<>(i10);
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Queue
    @CanIgnoreReturnValue
    public boolean add(E e10) {
        Preconditions.checkNotNull(e10);
        if (this.f29465c == 0) {
            return true;
        }
        if (size() == this.f29465c) {
            this.f29464b.remove();
        }
        this.f29464b.add(e10);
        return true;
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection
    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
        int size = collection.size();
        if (size < this.f29465c) {
            return i(collection);
        }
        clear();
        return Iterables.addAll(this, Iterables.skip(collection, size - this.f29465c));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingQueue, com.google.common.collect.ForwardingCollection
    public Queue n() {
        return this.f29464b;
    }

    @Override // com.google.common.collect.ForwardingQueue, java.util.Queue
    @CanIgnoreReturnValue
    public boolean offer(E e10) {
        return add(e10);
    }

    public int remainingCapacity() {
        return this.f29465c - size();
    }

    @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
    @J2ktIncompatible
    public Object[] toArray() {
        return super.toArray();
    }
}
