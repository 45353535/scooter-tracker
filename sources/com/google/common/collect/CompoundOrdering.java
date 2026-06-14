package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
final class CompoundOrdering<T> extends Ordering<T> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Comparator[] f29397b;

    CompoundOrdering(Comparator comparator, Comparator comparator2) {
        this.f29397b = new Comparator[]{comparator, comparator2};
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(@ParametricNullness T t10, @ParametricNullness T t11) {
        int i10 = 0;
        while (true) {
            Comparator[] comparatorArr = this.f29397b;
            if (i10 >= comparatorArr.length) {
                return 0;
            }
            int iCompare = comparatorArr[i10].compare(t10, t11);
            if (iCompare != 0) {
                return iCompare;
            }
            i10++;
        }
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof CompoundOrdering) {
            return Arrays.equals(this.f29397b, ((CompoundOrdering) obj).f29397b);
        }
        return false;
    }

    public int hashCode() {
        return Arrays.hashCode(this.f29397b);
    }

    public String toString() {
        return "Ordering.compound(" + Arrays.toString(this.f29397b) + ")";
    }

    CompoundOrdering(Iterable iterable) {
        this.f29397b = (Comparator[]) Iterables.g(iterable, new Comparator[0]);
    }
}
