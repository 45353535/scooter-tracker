package com.google.common.collect;

import androidx.collection.SieveCacheKt;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.SortedLists;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import j$.util.stream.Collector;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes9.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public final class ImmutableRangeSet<C extends Comparable> extends AbstractRangeSet<C> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final ImmutableRangeSet f29645d = new ImmutableRangeSet(ImmutableList.of());

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ImmutableRangeSet f29646e = new ImmutableRangeSet(ImmutableList.of(Range.all()));

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final transient ImmutableList f29647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient ImmutableRangeSet f29648c;

    private final class AsSet extends ImmutableSortedSet<C> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final DiscreteDomain f29653f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private transient Integer f29654g;

        AsSet(DiscreteDomain discreteDomain) {
            super(Ordering.natural());
            this.f29653f = discreteDomain;
        }

        @J2ktIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use SerializedForm");
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableSortedSet
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedSet v(Comparable comparable, boolean z10) {
            return F(Range.upTo(comparable, BoundType.g(z10)));
        }

        ImmutableSortedSet F(Range range) {
            return ImmutableRangeSet.this.subRangeSet(range).asSet(this.f29653f);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableSortedSet
        /* JADX INFO: renamed from: G, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedSet x(Comparable comparable, boolean z10, Comparable comparable2, boolean z11) {
            return (z10 || z11 || Range.a(comparable, comparable2) != 0) ? F(Range.range(comparable, BoundType.g(z10), comparable2, BoundType.g(z11))) : ImmutableSortedSet.of();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableSortedSet
        /* JADX INFO: renamed from: H, reason: merged with bridge method [inline-methods] */
        public ImmutableSortedSet A(Comparable comparable, boolean z10) {
            return F(Range.downTo(comparable, BoundType.g(z10)));
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj == null) {
                return false;
            }
            try {
                return ImmutableRangeSet.this.contains((Comparable) obj);
            } catch (ClassCastException unused) {
                return false;
            }
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return ImmutableRangeSet.this.f29647b.isPartialView();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            Integer numValueOf = this.f29654g;
            if (numValueOf == null) {
                UnmodifiableIterator it = ImmutableRangeSet.this.f29647b.iterator();
                long size = 0;
                while (it.hasNext()) {
                    size += (long) ContiguousSet.create((Range) it.next(), this.f29653f).size();
                    if (size >= SieveCacheKt.NodeLinkMask) {
                        break;
                    }
                }
                numValueOf = Integer.valueOf(Ints.saturatedCast(size));
                this.f29654g = numValueOf;
            }
            return numValueOf.intValue();
        }

        @Override // com.google.common.collect.ImmutableSortedSet
        ImmutableSortedSet t() {
            return new DescendingImmutableSortedSet(this);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return ImmutableRangeSet.this.f29647b.toString();
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        Object writeReplace() {
            return new AsSetSerializedForm(ImmutableRangeSet.this.f29647b, this.f29653f);
        }

        @Override // com.google.common.collect.ImmutableSortedSet, java.util.NavigableSet
        @GwtIncompatible("NavigableSet")
        public UnmodifiableIterator<C> descendingIterator() {
            return new AbstractIterator<C>() { // from class: com.google.common.collect.ImmutableRangeSet.AsSet.2

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final Iterator f29659d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Iterator f29660e = Iterators.e();

                {
                    this.f29659d = ImmutableRangeSet.this.f29647b.reverse().iterator();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public Comparable computeNext() {
                    while (!this.f29660e.hasNext()) {
                        if (!this.f29659d.hasNext()) {
                            return (Comparable) a();
                        }
                        this.f29660e = ContiguousSet.create((Range) this.f29659d.next(), AsSet.this.f29653f).descendingIterator();
                    }
                    return (Comparable) this.f29660e.next();
                }
            };
        }

        @Override // com.google.common.collect.ImmutableSortedSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public UnmodifiableIterator<C> iterator() {
            return new AbstractIterator<C>() { // from class: com.google.common.collect.ImmutableRangeSet.AsSet.1

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                final Iterator f29656d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Iterator f29657e = Iterators.e();

                {
                    this.f29656d = ImmutableRangeSet.this.f29647b.iterator();
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public Comparable computeNext() {
                    while (!this.f29657e.hasNext()) {
                        if (!this.f29656d.hasNext()) {
                            return (Comparable) a();
                        }
                        this.f29657e = ContiguousSet.create((Range) this.f29656d.next(), AsSet.this.f29653f).iterator();
                    }
                    return (Comparable) this.f29657e.next();
                }
            };
        }
    }

    private static class AsSetSerializedForm<C extends Comparable> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImmutableList f29662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final DiscreteDomain f29663c;

        AsSetSerializedForm(ImmutableList immutableList, DiscreteDomain discreteDomain) {
            this.f29662b = immutableList;
            this.f29663c = discreteDomain;
        }

        Object readResolve() {
            return new ImmutableRangeSet(this.f29662b).asSet(this.f29663c);
        }
    }

    public static class Builder<C extends Comparable<?>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f29664a = Lists.newArrayList();

        Builder a(Builder builder) {
            addAll(builder.f29664a);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<C> add(Range<C> range) {
            Preconditions.checkArgument(!range.isEmpty(), "range must not be empty, but was %s", range);
            this.f29664a.add(range);
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<C> addAll(RangeSet<C> rangeSet) {
            return addAll(rangeSet.asRanges());
        }

        public ImmutableRangeSet<C> build() {
            ImmutableList.Builder builder = new ImmutableList.Builder(this.f29664a.size());
            Collections.sort(this.f29664a, Range.g());
            PeekingIterator peekingIterator = Iterators.peekingIterator(this.f29664a.iterator());
            while (peekingIterator.hasNext()) {
                Range rangeSpan = (Range) peekingIterator.next();
                while (peekingIterator.hasNext()) {
                    Range<C> range = (Range) peekingIterator.peek();
                    if (rangeSpan.isConnected(range)) {
                        Preconditions.checkArgument(rangeSpan.intersection(range).isEmpty(), "Overlapping ranges not permitted but found %s overlapping %s", rangeSpan, range);
                        rangeSpan = rangeSpan.span((Range) peekingIterator.next());
                    }
                }
                builder.add(rangeSpan);
            }
            ImmutableList immutableListBuild = builder.build();
            return immutableListBuild.isEmpty() ? ImmutableRangeSet.of() : (immutableListBuild.size() == 1 && ((Range) Iterables.getOnlyElement(immutableListBuild)).equals(Range.all())) ? ImmutableRangeSet.d() : new ImmutableRangeSet<>(immutableListBuild);
        }

        @CanIgnoreReturnValue
        public Builder<C> addAll(Iterable<Range<C>> iterable) {
            Iterator<Range<C>> it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
            return this;
        }
    }

    private final class ComplementRanges extends ImmutableList<Range<C>> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final boolean f29665d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final boolean f29666e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f29667f;

        /* JADX WARN: Multi-variable type inference failed */
        ComplementRanges() {
            boolean zHasLowerBound = ((Range) ImmutableRangeSet.this.f29647b.get(0)).hasLowerBound();
            this.f29665d = zHasLowerBound;
            boolean zHasUpperBound = ((Range) Iterables.getLast(ImmutableRangeSet.this.f29647b)).hasUpperBound();
            this.f29666e = zHasUpperBound;
            int size = ImmutableRangeSet.this.f29647b.size();
            size = zHasLowerBound ? size : size - 1;
            this.f29667f = zHasUpperBound ? size + 1 : size;
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return true;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f29667f;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        Object writeReplace() {
            return super.writeReplace();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.List
        public Range<C> get(int i10) {
            Preconditions.checkElementIndex(i10, this.f29667f);
            return Range.b(this.f29665d ? i10 == 0 ? Cut.h() : ((Range) ImmutableRangeSet.this.f29647b.get(i10 - 1)).f30121c : ((Range) ImmutableRangeSet.this.f29647b.get(i10)).f30121c, (this.f29666e && i10 == this.f29667f + (-1)) ? Cut.d() : ((Range) ImmutableRangeSet.this.f29647b.get(i10 + (!this.f29665d ? 1 : 0))).f30120b);
        }
    }

    private static final class SerializedForm<C extends Comparable> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImmutableList f29669b;

        SerializedForm(ImmutableList immutableList) {
            this.f29669b = immutableList;
        }

        Object readResolve() {
            return this.f29669b.isEmpty() ? ImmutableRangeSet.of() : this.f29669b.equals(ImmutableList.of(Range.all())) ? ImmutableRangeSet.d() : new ImmutableRangeSet(this.f29669b);
        }
    }

    ImmutableRangeSet(ImmutableList immutableList) {
        this.f29647b = immutableList;
    }

    public static <C extends Comparable<?>> Builder<C> builder() {
        return new Builder<>();
    }

    public static <C extends Comparable> ImmutableRangeSet<C> copyOf(RangeSet<C> rangeSet) {
        Preconditions.checkNotNull(rangeSet);
        if (rangeSet.isEmpty()) {
            return of();
        }
        if (rangeSet.encloses(Range.all())) {
            return d();
        }
        if (rangeSet instanceof ImmutableRangeSet) {
            ImmutableRangeSet<C> immutableRangeSet = (ImmutableRangeSet) rangeSet;
            if (!immutableRangeSet.h()) {
                return immutableRangeSet;
            }
        }
        return new ImmutableRangeSet<>(ImmutableList.copyOf((Collection) rangeSet.asRanges()));
    }

    static ImmutableRangeSet d() {
        return f29646e;
    }

    private ImmutableList g(final Range range) {
        if (this.f29647b.isEmpty() || range.isEmpty()) {
            return ImmutableList.of();
        }
        if (range.encloses(span())) {
            return this.f29647b;
        }
        final int iBinarySearch = range.hasLowerBound() ? SortedLists.binarySearch(this.f29647b, new h2(), range.f30120b, SortedLists.KeyPresentBehavior.FIRST_AFTER, SortedLists.KeyAbsentBehavior.NEXT_HIGHER) : 0;
        final int iBinarySearch2 = (range.hasUpperBound() ? SortedLists.binarySearch(this.f29647b, new i2(), range.f30121c, SortedLists.KeyPresentBehavior.FIRST_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_HIGHER) : this.f29647b.size()) - iBinarySearch;
        return iBinarySearch2 == 0 ? ImmutableList.of() : new ImmutableList<Range<C>>(this) { // from class: com.google.common.collect.ImmutableRangeSet.1

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ ImmutableRangeSet f29652g;

            {
                this.f29652g = this;
            }

            @Override // com.google.common.collect.ImmutableCollection
            boolean isPartialView() {
                return true;
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
            public int size() {
                return iBinarySearch2;
            }

            @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
            @J2ktIncompatible
            @GwtIncompatible
            Object writeReplace() {
                return super.writeReplace();
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.List
            public Range<C> get(int i10) {
                Preconditions.checkElementIndex(i10, iBinarySearch2);
                return (i10 == 0 || i10 == iBinarySearch2 + (-1)) ? ((Range) this.f29652g.f29647b.get(i10 + iBinarySearch)).intersection(range) : (Range) this.f29652g.f29647b.get(i10 + iBinarySearch);
            }
        };
    }

    public static <C extends Comparable> ImmutableRangeSet<C> of() {
        return f29645d;
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @IgnoreJRERequirement
    public static <E extends Comparable<? super E>> Collector<Range<E>, ?, ImmutableRangeSet<E>> toImmutableRangeSet() {
        return CollectCollectors.R();
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> unionOf(Iterable<Range<C>> iterable) {
        return copyOf(TreeRangeSet.create(iterable));
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void add(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void addAll(RangeSet<C> rangeSet) {
        throw new UnsupportedOperationException();
    }

    public ImmutableSortedSet<C> asSet(DiscreteDomain<C> discreteDomain) {
        Preconditions.checkNotNull(discreteDomain);
        if (isEmpty()) {
            return ImmutableSortedSet.of();
        }
        Range<C> rangeCanonical = span().canonical(discreteDomain);
        if (!rangeCanonical.hasLowerBound()) {
            throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded below");
        }
        if (!rangeCanonical.hasUpperBound()) {
            try {
                discreteDomain.maxValue();
            } catch (NoSuchElementException unused) {
                throw new IllegalArgumentException("Neither the DiscreteDomain nor this range set are bounded above");
            }
        }
        return new AsSet(discreteDomain);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    public ImmutableRangeSet<C> difference(RangeSet<C> rangeSet) {
        TreeRangeSet treeRangeSetCreate = TreeRangeSet.create(this);
        treeRangeSetCreate.removeAll(rangeSet);
        return copyOf(treeRangeSetCreate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean encloses(Range<C> range) {
        int iBinarySearch = SortedLists.binarySearch(this.f29647b, new i2(), range.f30120b, Ordering.natural(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        return iBinarySearch != -1 && ((Range) this.f29647b.get(iBinarySearch)).encloses(range);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(RangeSet rangeSet) {
        return super.enclosesAll(rangeSet);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    boolean h() {
        return this.f29647b.isPartialView();
    }

    public ImmutableRangeSet<C> intersection(RangeSet<C> rangeSet) {
        TreeRangeSet treeRangeSetCreate = TreeRangeSet.create(this);
        treeRangeSetCreate.removeAll(rangeSet.complement());
        return copyOf(treeRangeSetCreate);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean intersects(Range<C> range) {
        int iBinarySearch = SortedLists.binarySearch(this.f29647b, new i2(), range.f30120b, Ordering.natural(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_HIGHER);
        if (iBinarySearch < this.f29647b.size() && ((Range) this.f29647b.get(iBinarySearch)).isConnected(range) && !((Range) this.f29647b.get(iBinarySearch)).intersection(range).isEmpty()) {
            return true;
        }
        if (iBinarySearch <= 0) {
            return false;
        }
        int i10 = iBinarySearch - 1;
        return ((Range) this.f29647b.get(i10)).isConnected(range) && !((Range) this.f29647b.get(i10)).intersection(range).isEmpty();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean isEmpty() {
        return this.f29647b.isEmpty();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public Range<C> rangeContaining(C c10) {
        int iBinarySearch = SortedLists.binarySearch(this.f29647b, new i2(), Cut.i(c10), Ordering.natural(), SortedLists.KeyPresentBehavior.ANY_PRESENT, SortedLists.KeyAbsentBehavior.NEXT_LOWER);
        if (iBinarySearch != -1) {
            Range<C> range = (Range) this.f29647b.get(iBinarySearch);
            if (range.contains(c10)) {
                return range;
            }
        }
        return null;
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void remove(Range<C> range) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void removeAll(RangeSet<C> rangeSet) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.RangeSet
    public Range<C> span() {
        if (this.f29647b.isEmpty()) {
            throw new NoSuchElementException();
        }
        return Range.b(((Range) this.f29647b.get(0)).f30120b, ((Range) this.f29647b.get(r1.size() - 1)).f30121c);
    }

    public ImmutableRangeSet<C> union(RangeSet<C> rangeSet) {
        return unionOf(Iterables.concat(asRanges(), rangeSet.asRanges()));
    }

    @J2ktIncompatible
    Object writeReplace() {
        return new SerializedForm(this.f29647b);
    }

    public static <C extends Comparable> ImmutableRangeSet<C> of(Range<C> range) {
        Preconditions.checkNotNull(range);
        return range.isEmpty() ? of() : range.equals(Range.all()) ? d() : new ImmutableRangeSet<>(ImmutableList.of(range));
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void addAll(Iterable<Range<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeSet
    public ImmutableSet<Range<C>> asDescendingSetOfRanges() {
        return this.f29647b.isEmpty() ? ImmutableSet.of() : new RegularImmutableSortedSet(this.f29647b.reverse(), Range.g().reverse());
    }

    @Override // com.google.common.collect.RangeSet
    public ImmutableSet<Range<C>> asRanges() {
        return this.f29647b.isEmpty() ? ImmutableSet.of() : new RegularImmutableSortedSet(this.f29647b, Range.g());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.RangeSet
    public ImmutableRangeSet<C> complement() {
        ImmutableRangeSet<C> immutableRangeSet = this.f29648c;
        if (immutableRangeSet != null) {
            return immutableRangeSet;
        }
        if (this.f29647b.isEmpty()) {
            ImmutableRangeSet<C> immutableRangeSetD = d();
            this.f29648c = immutableRangeSetD;
            return immutableRangeSetD;
        }
        if (this.f29647b.size() == 1 && ((Range) this.f29647b.get(0)).equals(Range.all())) {
            ImmutableRangeSet<C> immutableRangeSetOf = of();
            this.f29648c = immutableRangeSetOf;
            return immutableRangeSetOf;
        }
        ImmutableRangeSet<C> immutableRangeSet2 = new ImmutableRangeSet<>(new ComplementRanges(), this);
        this.f29648c = immutableRangeSet2;
        return immutableRangeSet2;
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
        return super.enclosesAll(iterable);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public void removeAll(Iterable<Range<C>> iterable) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.RangeSet
    public ImmutableRangeSet<C> subRangeSet(Range<C> range) {
        if (!isEmpty()) {
            Range<C> rangeSpan = span();
            if (range.encloses(rangeSpan)) {
                return this;
            }
            if (range.isConnected(rangeSpan)) {
                return new ImmutableRangeSet<>(g(range));
            }
        }
        return of();
    }

    private ImmutableRangeSet(ImmutableList immutableList, ImmutableRangeSet immutableRangeSet) {
        this.f29647b = immutableList;
        this.f29648c = immutableRangeSet;
    }

    public static <C extends Comparable<?>> ImmutableRangeSet<C> copyOf(Iterable<Range<C>> iterable) {
        return new Builder().addAll(iterable).build();
    }
}
