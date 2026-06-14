package com.google.common.collect;

import androidx.collection.SieveCacheKt;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
final class RegularContiguousSet<C extends Comparable> extends ContiguousSet<C> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Range f30124g;

    @GwtIncompatible
    @J2ktIncompatible
    private static final class SerializedForm<C extends Comparable> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Range f30130b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final DiscreteDomain f30131c;

        private Object readResolve() {
            return new RegularContiguousSet(this.f30130b, this.f30131c);
        }

        private SerializedForm(Range range, DiscreteDomain discreteDomain) {
            this.f30130b = range;
            this.f30131c = discreteDomain;
        }
    }

    RegularContiguousSet(Range range, DiscreteDomain discreteDomain) {
        super(discreteDomain);
        this.f30124g = range;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean H(Comparable comparable, Comparable comparable2) {
        return comparable2 != null && Range.a(comparable, comparable2) == 0;
    }

    private ContiguousSet I(Range range) {
        return this.f30124g.isConnected(range) ? ContiguousSet.create(this.f30124g.intersection(range), this.f29409f) : new EmptyContiguousSet(this.f29409f);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: D */
    public ContiguousSet v(Comparable comparable, boolean z10) {
        return I(Range.upTo(comparable, BoundType.g(z10)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: E */
    public ContiguousSet x(Comparable comparable, boolean z10, Comparable comparable2, boolean z11) {
        return (comparable.compareTo(comparable2) != 0 || z10 || z11) ? I(Range.range(comparable, BoundType.g(z10), comparable2, BoundType.g(z11))) : new EmptyContiguousSet(this.f29409f);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: F */
    public ContiguousSet A(Comparable comparable, boolean z10) {
        return I(Range.downTo(comparable, BoundType.g(z10)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            return this.f30124g.contains((Comparable) obj);
        } catch (ClassCastException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        return Collections2.b(this, collection);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof RegularContiguousSet) {
            RegularContiguousSet regularContiguousSet = (RegularContiguousSet) obj;
            if (this.f29409f.equals(regularContiguousSet.f29409f)) {
                return first().equals(regularContiguousSet.first()) && last().equals(regularContiguousSet.last());
            }
        }
        return super.equals(obj);
    }

    @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.b(this);
    }

    @Override // com.google.common.collect.ContiguousSet
    public ContiguousSet<C> intersection(ContiguousSet<C> contiguousSet) {
        Preconditions.checkNotNull(contiguousSet);
        Preconditions.checkArgument(this.f29409f.equals(contiguousSet.f29409f));
        if (contiguousSet.isEmpty()) {
            return contiguousSet;
        }
        Comparable comparable = (Comparable) Ordering.natural().max(first(), contiguousSet.first());
        Comparable comparable2 = (Comparable) Ordering.natural().min(last(), contiguousSet.last());
        return comparable.compareTo(comparable2) <= 0 ? ContiguousSet.create(Range.closed(comparable, comparable2), this.f29409f) : new EmptyContiguousSet(this.f29409f);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    boolean isPartialView() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableSet
    ImmutableList o() {
        return this.f29409f.f29440b ? new ImmutableAsList<C>() { // from class: com.google.common.collect.RegularContiguousSet.3
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.ImmutableAsList
            /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
            public ImmutableSortedSet o() {
                return RegularContiguousSet.this;
            }

            @Override // com.google.common.collect.ImmutableAsList, com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            @J2ktIncompatible
            @GwtIncompatible
            Object writeReplace() {
                return super.writeReplace();
            }

            @Override // java.util.List
            public C get(int i10) {
                Preconditions.checkElementIndex(i10, size());
                RegularContiguousSet regularContiguousSet = RegularContiguousSet.this;
                return (C) regularContiguousSet.f29409f.a(regularContiguousSet.first(), i10);
            }
        } : super.o();
    }

    @Override // com.google.common.collect.ContiguousSet
    public Range<C> range() {
        BoundType boundType = BoundType.CLOSED;
        return range(boundType, boundType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        long jDistance = this.f29409f.distance(first(), last());
        if (jDistance >= SieveCacheKt.NodeLinkMask) {
            return Integer.MAX_VALUE;
        }
        return ((int) jDistance) + 1;
    }

    @Override // com.google.common.collect.ContiguousSet, com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    @GwtIncompatible
    Object writeReplace() {
        return new SerializedForm(this.f30124g, this.f29409f);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public UnmodifiableIterator<C> descendingIterator() {
        return new AbstractSequentialIterator<C>(last()) { // from class: com.google.common.collect.RegularContiguousSet.2

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final Comparable f30127c;

            {
                this.f30127c = RegularContiguousSet.this.first();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractSequentialIterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Comparable a(Comparable comparable) {
                if (RegularContiguousSet.H(comparable, this.f30127c)) {
                    return null;
                }
                return RegularContiguousSet.this.f29409f.previous(comparable);
            }
        };
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public C first() {
        Comparable comparableQ = this.f30124g.f30120b.q(this.f29409f);
        Objects.requireNonNull(comparableQ);
        return (C) comparableQ;
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<C> iterator() {
        return new AbstractSequentialIterator<C>(first()) { // from class: com.google.common.collect.RegularContiguousSet.1

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final Comparable f30125c;

            {
                this.f30125c = RegularContiguousSet.this.last();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractSequentialIterator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public Comparable a(Comparable comparable) {
                if (RegularContiguousSet.H(comparable, this.f30125c)) {
                    return null;
                }
                return RegularContiguousSet.this.f29409f.next(comparable);
            }
        };
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.SortedSet
    public C last() {
        Comparable comparableN = this.f30124g.f30121c.n(this.f29409f);
        Objects.requireNonNull(comparableN);
        return (C) comparableN;
    }

    @Override // com.google.common.collect.ContiguousSet
    public Range<C> range(BoundType boundType, BoundType boundType2) {
        return Range.b(this.f30124g.f30120b.t(boundType, this.f29409f), this.f30124g.f30121c.u(boundType2, this.f29409f));
    }
}
