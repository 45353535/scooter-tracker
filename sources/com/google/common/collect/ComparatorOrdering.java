package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
final class ComparatorOrdering<T> extends Ordering<T> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Comparator f29392b;

    ComparatorOrdering(Comparator comparator) {
        this.f29392b = (Comparator) Preconditions.checkNotNull(comparator);
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@ParametricNullness T t10, @ParametricNullness T t11) {
        return this.f29392b.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ComparatorOrdering) {
            return this.f29392b.equals(((ComparatorOrdering) obj).f29392b);
        }
        return false;
    }

    public int hashCode() {
        return this.f29392b.hashCode();
    }

    public String toString() {
        return this.f29392b.toString();
    }
}
