package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSortedSet;
import com.google.errorprone.annotations.DoNotCall;
import j$.util.Objects;
import java.lang.Comparable;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public abstract class ContiguousSet<C extends Comparable> extends ImmutableSortedSet<C> {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final DiscreteDomain f29409f;

    ContiguousSet(DiscreteDomain discreteDomain) {
        super(Ordering.natural());
        this.f29409f = discreteDomain;
    }

    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public static <E> ImmutableSortedSet.Builder<E> builder() {
        throw new UnsupportedOperationException();
    }

    public static ContiguousSet<Integer> closed(int i10, int i11) {
        return create(Range.closed(Integer.valueOf(i10), Integer.valueOf(i11)), DiscreteDomain.integers());
    }

    public static ContiguousSet<Integer> closedOpen(int i10, int i11) {
        return create(Range.closedOpen(Integer.valueOf(i10), Integer.valueOf(i11)), DiscreteDomain.integers());
    }

    public static <C extends Comparable> ContiguousSet<C> create(Range<C> range, DiscreteDomain<C> discreteDomain) {
        Preconditions.checkNotNull(range);
        Preconditions.checkNotNull(discreteDomain);
        try {
            Range<C> rangeIntersection = !range.hasLowerBound() ? range.intersection(Range.atLeast(discreteDomain.minValue())) : range;
            if (!range.hasUpperBound()) {
                rangeIntersection = rangeIntersection.intersection(Range.atMost(discreteDomain.maxValue()));
            }
            if (!rangeIntersection.isEmpty()) {
                Comparable comparableQ = range.f30120b.q(discreteDomain);
                Objects.requireNonNull(comparableQ);
                Comparable comparableN = range.f30121c.n(discreteDomain);
                Objects.requireNonNull(comparableN);
                if (Range.a(comparableQ, comparableN) <= 0) {
                    return new RegularContiguousSet(rangeIntersection, discreteDomain);
                }
            }
            return new EmptyContiguousSet(discreteDomain);
        } catch (NoSuchElementException e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public abstract ContiguousSet v(Comparable comparable, boolean z10);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
    public abstract ContiguousSet x(Comparable comparable, boolean z10, Comparable comparable2, boolean z11);

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.common.collect.ImmutableSortedSet
    /* JADX INFO: renamed from: F, reason: merged with bridge method [inline-methods] */
    public abstract ContiguousSet A(Comparable comparable, boolean z10);

    public abstract ContiguousSet<C> intersection(ContiguousSet<C> contiguousSet);

    public abstract Range<C> range();

    public abstract Range<C> range(BoundType boundType, BoundType boundType2);

    @Override // com.google.common.collect.ImmutableSortedSet
    ImmutableSortedSet t() {
        return new DescendingImmutableSortedSet(this);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return range().toString();
    }

    @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    @GwtIncompatible
    Object writeReplace() {
        return super.writeReplace();
    }

    public static ContiguousSet<Long> closed(long j10, long j11) {
        return create(Range.closed(Long.valueOf(j10), Long.valueOf(j11)), DiscreteDomain.longs());
    }

    public static ContiguousSet<Long> closedOpen(long j10, long j11) {
        return create(Range.closedOpen(Long.valueOf(j10), Long.valueOf(j11)), DiscreteDomain.longs());
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public ContiguousSet<C> headSet(C c10) {
        return v((Comparable) Preconditions.checkNotNull(c10), false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public ContiguousSet<C> subSet(C c10, C c11) {
        Preconditions.checkNotNull(c10);
        Preconditions.checkNotNull(c11);
        Preconditions.checkArgument(comparator().compare(c10, c11) <= 0);
        return x(c10, true, c11, false);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet, java.util.SortedSet
    public ContiguousSet<C> tailSet(C c10) {
        return A((Comparable) Preconditions.checkNotNull(c10), true);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public ContiguousSet<C> headSet(C c10, boolean z10) {
        return v((Comparable) Preconditions.checkNotNull(c10), z10);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public ContiguousSet<C> tailSet(C c10, boolean z10) {
        return A((Comparable) Preconditions.checkNotNull(c10), z10);
    }

    @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
    @GwtIncompatible
    public ContiguousSet<C> subSet(C c10, boolean z10, C c11, boolean z11) {
        Preconditions.checkNotNull(c10);
        Preconditions.checkNotNull(c11);
        Preconditions.checkArgument(comparator().compare(c10, c11) <= 0);
        return x(c10, z10, c11, z11);
    }
}
