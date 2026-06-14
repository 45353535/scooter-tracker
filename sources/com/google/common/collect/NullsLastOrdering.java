package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
final class NullsLastOrdering<T> extends Ordering<T> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Ordering f30100b;

    NullsLastOrdering(Ordering ordering) {
        this.f30100b = ordering;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(T t10, T t11) {
        if (t10 == t11) {
            return 0;
        }
        if (t10 == null) {
            return 1;
        }
        if (t11 == null) {
            return -1;
        }
        return this.f30100b.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof NullsLastOrdering) {
            return this.f30100b.equals(((NullsLastOrdering) obj).f30100b);
        }
        return false;
    }

    public int hashCode() {
        return this.f30100b.hashCode() ^ (-921210296);
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> Ordering<S> nullsFirst() {
        return this.f30100b.nullsFirst();
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> Ordering<S> nullsLast() {
        return this;
    }

    @Override // com.google.common.collect.Ordering
    public <S extends T> Ordering<S> reverse() {
        return this.f30100b.reverse().nullsFirst();
    }

    public String toString() {
        return this.f30100b + ".nullsLast()";
    }
}
