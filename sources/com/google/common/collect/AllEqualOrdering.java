package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.io.Serializable;
import java.util.List;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
final class AllEqualOrdering extends Ordering<Object> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final AllEqualOrdering f29298b = new AllEqualOrdering();

    AllEqualOrdering() {
    }

    private Object readResolve() {
        return f29298b;
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(Object obj, Object obj2) {
        return 0;
    }

    @Override // com.google.common.collect.Ordering
    public <E> ImmutableList<E> immutableSortedCopy(Iterable<E> iterable) {
        return ImmutableList.copyOf(iterable);
    }

    @Override // com.google.common.collect.Ordering
    public <S> Ordering<S> reverse() {
        return this;
    }

    @Override // com.google.common.collect.Ordering
    public <E> List<E> sortedCopy(Iterable<E> iterable) {
        return Lists.newArrayList(iterable);
    }

    public String toString() {
        return "Ordering.allEqual()";
    }
}
