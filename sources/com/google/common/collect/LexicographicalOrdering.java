package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
final class LexicographicalOrdering<T> extends Ordering<Iterable<T>> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Comparator f29767b;

    LexicographicalOrdering(Comparator comparator) {
        this.f29767b = comparator;
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof LexicographicalOrdering) {
            return this.f29767b.equals(((LexicographicalOrdering) obj).f29767b);
        }
        return false;
    }

    public int hashCode() {
        return this.f29767b.hashCode() ^ 2075626741;
    }

    public String toString() {
        return this.f29767b + ".lexicographical()";
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(Iterable<T> iterable, Iterable<T> iterable2) {
        Iterator<T> it = iterable.iterator();
        Iterator<T> it2 = iterable2.iterator();
        while (it.hasNext()) {
            if (!it2.hasNext()) {
                return 1;
            }
            int iCompare = this.f29767b.compare(it.next(), it2.next());
            if (iCompare != 0) {
                return iCompare;
            }
        }
        return it2.hasNext() ? -1 : 0;
    }
}
