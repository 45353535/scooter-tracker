package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.errorprone.annotations.Immutable;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Comparator;
import java.util.Iterator;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes9.dex */
@Immutable(containerOf = {"C"})
@GwtCompatible
@ElementTypesAreNonnullByDefault
public final class Range<C extends Comparable> extends RangeGwtSerializationDependencies implements Predicate<C>, Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Range f30119d = new Range(Cut.h(), Cut.d());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final Cut f30120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Cut f30121c;

    /* JADX INFO: renamed from: com.google.common.collect.Range$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f30122a;

        static {
            int[] iArr = new int[BoundType.values().length];
            f30122a = iArr;
            try {
                iArr[BoundType.OPEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f30122a[BoundType.CLOSED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    private static class RangeLexOrdering extends Ordering<Range<?>> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final Ordering f30123b = new RangeLexOrdering();

        private RangeLexOrdering() {
        }

        @Override // com.google.common.collect.Ordering, java.util.Comparator
        public int compare(Range<?> range, Range<?> range2) {
            return ComparisonChain.start().compare(range.f30120b, range2.f30120b).compare(range.f30121c, range2.f30121c).result();
        }
    }

    private Range(Cut cut, Cut cut2) {
        this.f30120b = (Cut) Preconditions.checkNotNull(cut);
        this.f30121c = (Cut) Preconditions.checkNotNull(cut2);
        if (cut.compareTo(cut2) > 0 || cut == Cut.d() || cut2 == Cut.h()) {
            throw new IllegalArgumentException("Invalid range: " + h(cut, cut2));
        }
    }

    static int a(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    public static <C extends Comparable<?>> Range<C> all() {
        return f30119d;
    }

    public static <C extends Comparable<?>> Range<C> atLeast(C c10) {
        return b(Cut.i(c10), Cut.d());
    }

    public static <C extends Comparable<?>> Range<C> atMost(C c10) {
        return b(Cut.h(), Cut.g(c10));
    }

    static Range b(Cut cut, Cut cut2) {
        return new Range(cut, cut2);
    }

    public static <C extends Comparable<?>> Range<C> closed(C c10, C c11) {
        return b(Cut.i(c10), Cut.g(c11));
    }

    public static <C extends Comparable<?>> Range<C> closedOpen(C c10, C c11) {
        return b(Cut.i(c10), Cut.i(c11));
    }

    public static <C extends Comparable<?>> Range<C> downTo(C c10, BoundType boundType) {
        int i10 = AnonymousClass1.f30122a[boundType.ordinal()];
        if (i10 == 1) {
            return greaterThan(c10);
        }
        if (i10 == 2) {
            return atLeast(c10);
        }
        throw new AssertionError();
    }

    public static <C extends Comparable<?>> Range<C> encloseAll(Iterable<C> iterable) {
        Preconditions.checkNotNull(iterable);
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            Comparator comparator = sortedSet.comparator();
            if (Ordering.natural().equals(comparator) || comparator == null) {
                return closed((Comparable) sortedSet.first(), (Comparable) sortedSet.last());
            }
        }
        Iterator<C> it = iterable.iterator();
        Comparable comparable = (Comparable) Preconditions.checkNotNull(it.next());
        Comparable comparable2 = comparable;
        while (it.hasNext()) {
            Comparable comparable3 = (Comparable) Preconditions.checkNotNull(it.next());
            comparable = (Comparable) Ordering.natural().min(comparable, comparable3);
            comparable2 = (Comparable) Ordering.natural().max(comparable2, comparable3);
        }
        return closed(comparable, comparable2);
    }

    static Ordering g() {
        return RangeLexOrdering.f30123b;
    }

    public static <C extends Comparable<?>> Range<C> greaterThan(C c10) {
        return b(Cut.g(c10), Cut.d());
    }

    private static String h(Cut cut, Cut cut2) {
        StringBuilder sb2 = new StringBuilder(16);
        cut.k(sb2);
        sb2.append("..");
        cut2.l(sb2);
        return sb2.toString();
    }

    public static <C extends Comparable<?>> Range<C> lessThan(C c10) {
        return b(Cut.h(), Cut.i(c10));
    }

    public static <C extends Comparable<?>> Range<C> open(C c10, C c11) {
        return b(Cut.g(c10), Cut.i(c11));
    }

    public static <C extends Comparable<?>> Range<C> openClosed(C c10, C c11) {
        return b(Cut.g(c10), Cut.g(c11));
    }

    public static <C extends Comparable<?>> Range<C> range(C c10, BoundType boundType, C c11, BoundType boundType2) {
        Preconditions.checkNotNull(boundType);
        Preconditions.checkNotNull(boundType2);
        BoundType boundType3 = BoundType.OPEN;
        return b(boundType == boundType3 ? Cut.g(c10) : Cut.i(c10), boundType2 == boundType3 ? Cut.i(c11) : Cut.g(c11));
    }

    public static <C extends Comparable<?>> Range<C> singleton(C c10) {
        return closed(c10, c10);
    }

    public static <C extends Comparable<?>> Range<C> upTo(C c10, BoundType boundType) {
        int i10 = AnonymousClass1.f30122a[boundType.ordinal()];
        if (i10 == 1) {
            return lessThan(c10);
        }
        if (i10 == 2) {
            return atMost(c10);
        }
        throw new AssertionError();
    }

    public Range<C> canonical(DiscreteDomain<C> discreteDomain) {
        Preconditions.checkNotNull(discreteDomain);
        Cut cutJ = this.f30120b.j(discreteDomain);
        Cut cutJ2 = this.f30121c.j(discreteDomain);
        return (cutJ == this.f30120b && cutJ2 == this.f30121c) ? this : b(cutJ, cutJ2);
    }

    public boolean contains(C c10) {
        Preconditions.checkNotNull(c10);
        return this.f30120b.o(c10) && !this.f30121c.o(c10);
    }

    public boolean containsAll(Iterable<? extends C> iterable) {
        if (Iterables.isEmpty(iterable)) {
            return true;
        }
        if (iterable instanceof SortedSet) {
            SortedSet sortedSet = (SortedSet) iterable;
            Comparator comparator = sortedSet.comparator();
            if (Ordering.natural().equals(comparator) || comparator == null) {
                return contains((Comparable) sortedSet.first()) && contains((Comparable) sortedSet.last());
            }
        }
        Iterator<? extends C> it = iterable.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    Cut d() {
        return this.f30120b;
    }

    public boolean encloses(Range<C> range) {
        return this.f30120b.compareTo((Cut) range.f30120b) <= 0 && this.f30121c.compareTo((Cut) range.f30121c) >= 0;
    }

    @Override // com.google.common.base.Predicate
    public boolean equals(Object obj) {
        if (obj instanceof Range) {
            Range range = (Range) obj;
            if (this.f30120b.equals(range.f30120b) && this.f30121c.equals(range.f30121c)) {
                return true;
            }
        }
        return false;
    }

    public Range<C> gap(Range<C> range) {
        if (this.f30120b.compareTo((Cut) range.f30121c) >= 0 || range.f30120b.compareTo((Cut) this.f30121c) >= 0) {
            boolean z10 = this.f30120b.compareTo((Cut) range.f30120b) < 0;
            Range<C> range2 = z10 ? this : range;
            if (!z10) {
                range = this;
            }
            return b(range2.f30121c, range.f30120b);
        }
        throw new IllegalArgumentException("Ranges have a nonempty intersection: " + this + ", " + range);
    }

    public boolean hasLowerBound() {
        return this.f30120b != Cut.h();
    }

    public boolean hasUpperBound() {
        return this.f30121c != Cut.d();
    }

    public int hashCode() {
        return (this.f30120b.hashCode() * 31) + this.f30121c.hashCode();
    }

    Cut i() {
        return this.f30121c;
    }

    public Range<C> intersection(Range<C> range) {
        int iCompareTo = this.f30120b.compareTo((Cut) range.f30120b);
        int iCompareTo2 = this.f30121c.compareTo((Cut) range.f30121c);
        if (iCompareTo >= 0 && iCompareTo2 <= 0) {
            return this;
        }
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return range;
        }
        Cut cut = iCompareTo >= 0 ? this.f30120b : range.f30120b;
        Cut<C> cut2 = iCompareTo2 <= 0 ? this.f30121c : range.f30121c;
        Preconditions.checkArgument(cut.compareTo((Cut) cut2) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, range);
        return b(cut, cut2);
    }

    public boolean isConnected(Range<C> range) {
        return this.f30120b.compareTo((Cut) range.f30121c) <= 0 && range.f30120b.compareTo((Cut) this.f30121c) <= 0;
    }

    public boolean isEmpty() {
        return this.f30120b.equals(this.f30121c);
    }

    public BoundType lowerBoundType() {
        return this.f30120b.r();
    }

    public C lowerEndpoint() {
        return (C) this.f30120b.m();
    }

    Object readResolve() {
        return equals(f30119d) ? all() : this;
    }

    public Range<C> span(Range<C> range) {
        int iCompareTo = this.f30120b.compareTo((Cut) range.f30120b);
        int iCompareTo2 = this.f30121c.compareTo((Cut) range.f30121c);
        if (iCompareTo <= 0 && iCompareTo2 >= 0) {
            return this;
        }
        if (iCompareTo < 0 || iCompareTo2 > 0) {
            return b(iCompareTo <= 0 ? this.f30120b : range.f30120b, iCompareTo2 >= 0 ? this.f30121c : range.f30121c);
        }
        return range;
    }

    public String toString() {
        return h(this.f30120b, this.f30121c);
    }

    public BoundType upperBoundType() {
        return this.f30121c.s();
    }

    public C upperEndpoint() {
        return (C) this.f30121c.m();
    }

    @Override // com.google.common.base.Predicate
    @Deprecated
    public boolean apply(C c10) {
        return contains(c10);
    }
}
