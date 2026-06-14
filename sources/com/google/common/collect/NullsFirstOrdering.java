package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
final class NullsFirstOrdering<T> extends Ordering<T> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Ordering f30099b;

    NullsFirstOrdering(Ordering ordering) {
        this.f30099b = ordering;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(T t10, T t11) {
        if (t10 == t11) {
            return 0;
        }
        if (t10 == null) {
            return -1;
        }
        if (t11 == null) {
            return 1;
        }
        return this.f30099b.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NullsFirstOrdering) {
            return this.f30099b.equals(((NullsFirstOrdering) obj).f30099b);
        }
        return false;
    }

    public int hashCode() {
        return this.f30099b.hashCode() ^ 957692532;
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> Ordering<S> nullsFirst() {
        return this;
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> Ordering<S> nullsLast() {
        return this.f30099b.nullsLast();
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> Ordering<S> reverse() {
        return this.f30099b.reverse().nullsLast();
    }

    public String toString() {
        return this.f30099b + ".nullsFirst()";
    }
}
