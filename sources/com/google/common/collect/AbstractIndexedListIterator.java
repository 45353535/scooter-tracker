package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractIndexedListIterator<E> extends UnmodifiableListIterator<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f29225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f29226c;

    protected AbstractIndexedListIterator(int i10) {
        this(i10, 0);
    }

    protected abstract Object get(int i10);

    @Override // java.util.Iterator, java.util.ListIterator
    public final boolean hasNext() {
        return this.f29226c < this.f29225b;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f29226c > 0;
    }

    @Override // java.util.Iterator, java.util.ListIterator
    @ParametricNullness
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f29226c;
        this.f29226c = i10 + 1;
        return (E) get(i10);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f29226c;
    }

    @Override // java.util.ListIterator
    @ParametricNullness
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i10 = this.f29226c - 1;
        this.f29226c = i10;
        return (E) get(i10);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f29226c - 1;
    }

    protected AbstractIndexedListIterator(int i10, int i11) {
        Preconditions.checkPositionIndex(i11, i10);
        this.f29225b = i10;
        this.f29226c = i11;
    }
}
