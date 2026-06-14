package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import java.io.Serializable;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(serializable = true)
@ElementTypesAreNonnullByDefault
final class NaturalOrdering extends Ordering<Comparable<?>> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    static final NaturalOrdering f30096d = new NaturalOrdering();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Ordering f30097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Ordering f30098c;

    private NaturalOrdering() {
    }

    private Object readResolve() {
        return f30096d;
    }

    @Override // com.google.common.collect.Ordering
    public <S extends Comparable<?>> Ordering<S> nullsFirst() {
        Ordering<S> ordering = this.f30097b;
        if (ordering != null) {
            return ordering;
        }
        Ordering<S> orderingNullsFirst = super.nullsFirst();
        this.f30097b = orderingNullsFirst;
        return orderingNullsFirst;
    }

    @Override // com.google.common.collect.Ordering
    public <S extends Comparable<?>> Ordering<S> nullsLast() {
        Ordering<S> ordering = this.f30098c;
        if (ordering != null) {
            return ordering;
        }
        Ordering<S> orderingNullsLast = super.nullsLast();
        this.f30098c = orderingNullsLast;
        return orderingNullsLast;
    }

    @Override // com.google.common.collect.Ordering
    public <S extends Comparable<?>> Ordering<S> reverse() {
        return ReverseNaturalOrdering.f30181b;
    }

    public String toString() {
        return "Ordering.natural()";
    }

    @Override // com.google.common.collect.Ordering, java.util.Comparator
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        Preconditions.checkNotNull(comparable);
        Preconditions.checkNotNull(comparable2);
        return comparable.compareTo(comparable2);
    }
}
