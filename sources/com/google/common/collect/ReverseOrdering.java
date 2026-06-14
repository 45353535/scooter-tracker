package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
final class ReverseOrdering<T> extends Ordering<T> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Ordering f30182b;

    ReverseOrdering(Ordering ordering) {
        this.f30182b = (Ordering) Preconditions.checkNotNull(ordering);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@ParametricNullness T t10, @ParametricNullness T t11) {
        return this.f30182b.compare(t11, t10);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ReverseOrdering) {
            return this.f30182b.equals(((ReverseOrdering) obj).f30182b);
        }
        return false;
    }

    public int hashCode() {
        return -this.f30182b.hashCode();
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(@ParametricNullness E e10, @ParametricNullness E e11) {
        return (E) this.f30182b.min(e10, e11);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(@ParametricNullness E e10, @ParametricNullness E e11) {
        return (E) this.f30182b.max(e10, e11);
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> Ordering<S> reverse() {
        return this.f30182b;
    }

    public String toString() {
        return this.f30182b + ".reverse()";
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(@ParametricNullness E e10, @ParametricNullness E e11, @ParametricNullness E e12, E... eArr) {
        return (E) this.f30182b.min(e10, e11, e12, eArr);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(@ParametricNullness E e10, @ParametricNullness E e11, @ParametricNullness E e12, E... eArr) {
        return (E) this.f30182b.max(e10, e11, e12, eArr);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(Iterator<E> it) {
        return (E) this.f30182b.min(it);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(Iterator<E> it) {
        return (E) this.f30182b.max(it);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E max(Iterable<E> iterable) {
        return (E) this.f30182b.min(iterable);
    }

    @Override // com.google.common.collect.Ordering
    public <E extends T> E min(Iterable<E> iterable) {
        return (E) this.f30182b.max(iterable);
    }
}
