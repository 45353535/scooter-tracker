package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.MoreObjects;
import com.google.common.base.Preconditions;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.NavigableMap;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes9.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public class TreeRangeSet<C extends Comparable<?>> extends AbstractRangeSet<C> implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final NavigableMap f30376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Set f30377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient Set f30378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private transient RangeSet f30379e;

    final class AsRanges extends ForwardingCollection<Range<C>> implements Set<Range<C>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Collection f30380b;

        AsRanges(Collection collection) {
            this.f30380b = collection;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.a(this, obj);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: g */
        public Collection n() {
            return this.f30380b;
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.b(this);
        }
    }

    private final class Complement extends TreeRangeSet<C> {
        Complement() {
            super(new ComplementRangesByLowerBound(TreeRangeSet.this.f30376b));
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void add(Range<C> range) {
            TreeRangeSet.this.remove(range);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.RangeSet
        public RangeSet<C> complement() {
            return TreeRangeSet.this;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public boolean contains(C c10) {
            return !TreeRangeSet.this.contains(c10);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void remove(Range<C> range) {
            TreeRangeSet.this.add(range);
        }
    }

    private static final class ComplementRangesByLowerBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final NavigableMap f30383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final NavigableMap f30384c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Range f30385d;

        ComplementRangesByLowerBound(NavigableMap navigableMap) {
            this(navigableMap, Range.all());
        }

        private NavigableMap d(Range range) {
            if (!this.f30385d.isConnected(range)) {
                return ImmutableSortedMap.of();
            }
            return new ComplementRangesByLowerBound(this.f30383b, range.intersection(this.f30385d));
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        Iterator a() {
            Collection collectionValues;
            Cut cutH;
            if (this.f30385d.hasLowerBound()) {
                collectionValues = this.f30384c.tailMap((Cut) this.f30385d.lowerEndpoint(), this.f30385d.lowerBoundType() == BoundType.CLOSED).values();
            } else {
                collectionValues = this.f30384c.values();
            }
            PeekingIterator peekingIterator = Iterators.peekingIterator(collectionValues.iterator());
            if (this.f30385d.contains(Cut.h()) && (!peekingIterator.hasNext() || ((Range) peekingIterator.peek()).f30120b != Cut.h())) {
                cutH = Cut.h();
            } else {
                if (!peekingIterator.hasNext()) {
                    return Iterators.e();
                }
                cutH = ((Range) peekingIterator.next()).f30121c;
            }
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>(this, cutH, peekingIterator) { // from class: com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound.1

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Cut f30386d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ Cut f30387e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ PeekingIterator f30388f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ ComplementRangesByLowerBound f30389g;

                {
                    this.f30387e = cutH;
                    this.f30388f = peekingIterator;
                    this.f30389g = this;
                    this.f30386d = cutH;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public Map.Entry computeNext() {
                    Range rangeB;
                    if (this.f30389g.f30385d.f30121c.o(this.f30386d) || this.f30386d == Cut.d()) {
                        return (Map.Entry) a();
                    }
                    if (this.f30388f.hasNext()) {
                        Range range = (Range) this.f30388f.next();
                        rangeB = Range.b(this.f30386d, range.f30120b);
                        this.f30386d = range.f30121c;
                    } else {
                        rangeB = Range.b(this.f30386d, Cut.d());
                        this.f30386d = Cut.d();
                    }
                    return Maps.immutableEntry(rangeB.f30120b, rangeB);
                }
            };
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        Iterator b() {
            Cut cut;
            PeekingIterator peekingIterator = Iterators.peekingIterator(this.f30384c.headMap(this.f30385d.hasUpperBound() ? (Cut) this.f30385d.upperEndpoint() : Cut.d(), this.f30385d.hasUpperBound() && this.f30385d.upperBoundType() == BoundType.CLOSED).descendingMap().values().iterator());
            if (peekingIterator.hasNext()) {
                cut = ((Range) peekingIterator.peek()).f30121c == Cut.d() ? ((Range) peekingIterator.next()).f30120b : (Cut) this.f30383b.higherKey(((Range) peekingIterator.peek()).f30121c);
            } else {
                if (!this.f30385d.contains(Cut.h()) || this.f30383b.containsKey(Cut.h())) {
                    return Iterators.e();
                }
                cut = (Cut) this.f30383b.higherKey(Cut.h());
            }
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>(this, (Cut) MoreObjects.firstNonNull(cut, Cut.d()), peekingIterator) { // from class: com.google.common.collect.TreeRangeSet.ComplementRangesByLowerBound.2

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Cut f30390d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ Cut f30391e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ PeekingIterator f30392f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ ComplementRangesByLowerBound f30393g;

                {
                    this.f30391e = cut;
                    this.f30392f = peekingIterator;
                    this.f30393g = this;
                    this.f30390d = cut;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public Map.Entry computeNext() {
                    if (this.f30390d == Cut.h()) {
                        return (Map.Entry) a();
                    }
                    if (this.f30392f.hasNext()) {
                        Range range = (Range) this.f30392f.next();
                        Range rangeB = Range.b(range.f30121c, this.f30390d);
                        this.f30390d = range.f30120b;
                        if (this.f30393g.f30385d.f30120b.o(rangeB.f30120b)) {
                            return Maps.immutableEntry(rangeB.f30120b, rangeB);
                        }
                    } else if (this.f30393g.f30385d.f30120b.o(Cut.h())) {
                        Range rangeB2 = Range.b(Cut.h(), this.f30390d);
                        this.f30390d = Cut.h();
                        return Maps.immutableEntry(Cut.h(), rangeB2);
                    }
                    return (Map.Entry) a();
                }
            };
        }

        @Override // java.util.SortedMap
        public Comparator<? super Cut<C>> comparator() {
            return Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return Iterators.size(a());
        }

        private ComplementRangesByLowerBound(NavigableMap navigableMap, Range range) {
            this.f30383b = navigableMap;
            this.f30384c = new RangesByUpperBound(navigableMap);
            this.f30385d = range;
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        public Range<C> get(Object obj) {
            if (obj instanceof Cut) {
                try {
                    Cut<C> cut = (Cut) obj;
                    Map.Entry<Cut<C>, Range<C>> entryFirstEntry = tailMap((Cut) cut, true).firstEntry();
                    if (entryFirstEntry != null && entryFirstEntry.getKey().equals(cut)) {
                        return entryFirstEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Cut<C>, Range<C>> headMap(Cut<C> cut, boolean z10) {
            return d(Range.upTo(cut, BoundType.g(z10)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> cut, boolean z10, Cut<C> cut2, boolean z11) {
            return d(Range.range(cut, BoundType.g(z10), cut2, BoundType.g(z11)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> cut, boolean z10) {
            return d(Range.downTo(cut, BoundType.g(z10)));
        }
    }

    @VisibleForTesting
    static final class RangesByUpperBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final NavigableMap f30394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Range f30395c;

        RangesByUpperBound(NavigableMap navigableMap) {
            this.f30394b = navigableMap;
            this.f30395c = Range.all();
        }

        private NavigableMap d(Range range) {
            return range.isConnected(this.f30395c) ? new RangesByUpperBound(this.f30394b, range.intersection(this.f30395c)) : ImmutableSortedMap.of();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        Iterator a() {
            Map.Entry entryLowerEntry;
            final Iterator it = (this.f30395c.hasLowerBound() && (entryLowerEntry = this.f30394b.lowerEntry((Cut) this.f30395c.lowerEndpoint())) != null) ? this.f30395c.f30120b.o(((Range) entryLowerEntry.getValue()).f30121c) ? this.f30394b.tailMap((Cut) entryLowerEntry.getKey(), true).values().iterator() : this.f30394b.tailMap((Cut) this.f30395c.lowerEndpoint(), true).values().iterator() : this.f30394b.values().iterator();
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>(this) { // from class: com.google.common.collect.TreeRangeSet.RangesByUpperBound.1

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ RangesByUpperBound f30397e;

                {
                    this.f30397e = this;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public Map.Entry computeNext() {
                    if (!it.hasNext()) {
                        return (Map.Entry) a();
                    }
                    Range range = (Range) it.next();
                    return this.f30397e.f30395c.f30121c.o(range.f30121c) ? (Map.Entry) a() : Maps.immutableEntry(range.f30121c, range);
                }
            };
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        Iterator b() {
            final PeekingIterator peekingIterator = Iterators.peekingIterator((this.f30395c.hasUpperBound() ? this.f30394b.headMap((Cut) this.f30395c.upperEndpoint(), false).descendingMap().values() : this.f30394b.descendingMap().values()).iterator());
            if (peekingIterator.hasNext() && this.f30395c.f30121c.o(((Range) peekingIterator.peek()).f30121c)) {
                peekingIterator.next();
            }
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>(this) { // from class: com.google.common.collect.TreeRangeSet.RangesByUpperBound.2

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ RangesByUpperBound f30399e;

                {
                    this.f30399e = this;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public Map.Entry computeNext() {
                    if (!peekingIterator.hasNext()) {
                        return (Map.Entry) a();
                    }
                    Range range = (Range) peekingIterator.next();
                    return this.f30399e.f30395c.f30120b.o(range.f30121c) ? Maps.immutableEntry(range.f30121c, range) : (Map.Entry) a();
                }
            };
        }

        @Override // java.util.SortedMap
        public Comparator<? super Cut<C>> comparator() {
            return Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean isEmpty() {
            return this.f30395c.equals(Range.all()) ? this.f30394b.isEmpty() : !a().hasNext();
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return this.f30395c.equals(Range.all()) ? this.f30394b.size() : Iterators.size(a());
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        public Range<C> get(Object obj) {
            Map.Entry entryLowerEntry;
            if (obj instanceof Cut) {
                try {
                    Cut cut = (Cut) obj;
                    if (this.f30395c.contains(cut) && (entryLowerEntry = this.f30394b.lowerEntry(cut)) != null && ((Range) entryLowerEntry.getValue()).f30121c.equals(cut)) {
                        return (Range) entryLowerEntry.getValue();
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Cut<C>, Range<C>> headMap(Cut<C> cut, boolean z10) {
            return d(Range.upTo(cut, BoundType.g(z10)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> cut, boolean z10, Cut<C> cut2, boolean z11) {
            return d(Range.range(cut, BoundType.g(z10), cut2, BoundType.g(z11)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> cut, boolean z10) {
            return d(Range.downTo(cut, BoundType.g(z10)));
        }

        private RangesByUpperBound(NavigableMap navigableMap, Range range) {
            this.f30394b = navigableMap;
            this.f30395c = range;
        }
    }

    private final class SubRangeSet extends TreeRangeSet<C> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Range f30400f;

        /* JADX WARN: Illegal instructions before constructor call */
        SubRangeSet(Range range) {
            super(new SubRangeSetRangesByLowerBound(Range.all(), range, TreeRangeSet.this.f30376b));
            this.f30400f = range;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void add(Range<C> range) {
            Preconditions.checkArgument(this.f30400f.encloses(range), "Cannot add range %s to subRangeSet(%s)", range, this.f30400f);
            TreeRangeSet.this.add(range);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void clear() {
            TreeRangeSet.this.remove(this.f30400f);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public boolean contains(C c10) {
            return this.f30400f.contains(c10) && TreeRangeSet.this.contains(c10);
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public boolean encloses(Range<C> range) {
            Range rangeB;
            return (this.f30400f.isEmpty() || !this.f30400f.encloses(range) || (rangeB = TreeRangeSet.this.b(range)) == null || rangeB.intersection(this.f30400f).isEmpty()) ? false : true;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public Range<C> rangeContaining(C c10) {
            Range<C> rangeRangeContaining;
            if (this.f30400f.contains(c10) && (rangeRangeContaining = TreeRangeSet.this.rangeContaining(c10)) != null) {
                return rangeRangeContaining.intersection(this.f30400f);
            }
            return null;
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
        public void remove(Range<C> range) {
            if (range.isConnected(this.f30400f)) {
                TreeRangeSet.this.remove(range.intersection(this.f30400f));
            }
        }

        @Override // com.google.common.collect.TreeRangeSet, com.google.common.collect.RangeSet
        public RangeSet<C> subRangeSet(Range<C> range) {
            return range.encloses(this.f30400f) ? this : range.isConnected(this.f30400f) ? new SubRangeSet(this.f30400f.intersection(range)) : ImmutableRangeSet.of();
        }
    }

    private static final class SubRangeSetRangesByLowerBound<C extends Comparable<?>> extends AbstractNavigableMap<Cut<C>, Range<C>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Range f30402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Range f30403c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final NavigableMap f30404d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final NavigableMap f30405e;

        private NavigableMap e(Range range) {
            return !range.isConnected(this.f30402b) ? ImmutableSortedMap.of() : new SubRangeSetRangesByLowerBound(this.f30402b.intersection(range), this.f30403c, this.f30404d);
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap
        Iterator a() {
            final Iterator it;
            if (this.f30403c.isEmpty()) {
                return Iterators.e();
            }
            if (this.f30402b.f30121c.o(this.f30403c.f30120b)) {
                return Iterators.e();
            }
            if (this.f30402b.f30120b.o(this.f30403c.f30120b)) {
                it = this.f30405e.tailMap(this.f30403c.f30120b, false).values().iterator();
            } else {
                it = this.f30404d.tailMap((Cut) this.f30402b.f30120b.m(), this.f30402b.lowerBoundType() == BoundType.CLOSED).values().iterator();
            }
            final Cut cut = (Cut) Ordering.natural().min(this.f30402b.f30121c, Cut.i(this.f30403c.f30121c));
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>(this) { // from class: com.google.common.collect.TreeRangeSet.SubRangeSetRangesByLowerBound.1

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ SubRangeSetRangesByLowerBound f30408f;

                {
                    this.f30408f = this;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public Map.Entry computeNext() {
                    if (!it.hasNext()) {
                        return (Map.Entry) a();
                    }
                    Range range = (Range) it.next();
                    if (cut.o(range.f30120b)) {
                        return (Map.Entry) a();
                    }
                    Range rangeIntersection = range.intersection(this.f30408f.f30403c);
                    return Maps.immutableEntry(rangeIntersection.f30120b, rangeIntersection);
                }
            };
        }

        @Override // com.google.common.collect.AbstractNavigableMap
        Iterator b() {
            if (this.f30403c.isEmpty()) {
                return Iterators.e();
            }
            Cut cut = (Cut) Ordering.natural().min(this.f30402b.f30121c, Cut.i(this.f30403c.f30121c));
            final Iterator it = this.f30404d.headMap((Cut) cut.m(), cut.s() == BoundType.CLOSED).descendingMap().values().iterator();
            return new AbstractIterator<Map.Entry<Cut<C>, Range<C>>>(this) { // from class: com.google.common.collect.TreeRangeSet.SubRangeSetRangesByLowerBound.2

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                final /* synthetic */ SubRangeSetRangesByLowerBound f30410e;

                {
                    this.f30410e = this;
                }

                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIterator
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public Map.Entry computeNext() {
                    if (!it.hasNext()) {
                        return (Map.Entry) a();
                    }
                    Range range = (Range) it.next();
                    if (this.f30410e.f30403c.f30120b.compareTo(range.f30121c) >= 0) {
                        return (Map.Entry) a();
                    }
                    Range rangeIntersection = range.intersection(this.f30410e.f30403c);
                    return this.f30410e.f30402b.contains(rangeIntersection.f30120b) ? Maps.immutableEntry(rangeIntersection.f30120b, rangeIntersection) : (Map.Entry) a();
                }
            };
        }

        @Override // java.util.SortedMap
        public Comparator<? super Cut<C>> comparator() {
            return Ordering.natural();
        }

        @Override // java.util.AbstractMap, java.util.Map
        public boolean containsKey(Object obj) {
            return get(obj) != null;
        }

        @Override // com.google.common.collect.Maps.IteratorBasedAbstractMap, java.util.AbstractMap, java.util.Map
        public int size() {
            return Iterators.size(a());
        }

        private SubRangeSetRangesByLowerBound(Range range, Range range2, NavigableMap navigableMap) {
            this.f30402b = (Range) Preconditions.checkNotNull(range);
            this.f30403c = (Range) Preconditions.checkNotNull(range2);
            this.f30404d = (NavigableMap) Preconditions.checkNotNull(navigableMap);
            this.f30405e = new RangesByUpperBound(navigableMap);
        }

        @Override // com.google.common.collect.AbstractNavigableMap, java.util.AbstractMap, java.util.Map
        public Range<C> get(Object obj) {
            if (obj instanceof Cut) {
                try {
                    Cut cut = (Cut) obj;
                    if (this.f30402b.contains(cut) && cut.compareTo(this.f30403c.f30120b) >= 0 && cut.compareTo(this.f30403c.f30121c) < 0) {
                        if (cut.equals(this.f30403c.f30120b)) {
                            Range range = (Range) Maps.S(this.f30404d.floorEntry(cut));
                            if (range != null && range.f30121c.compareTo(this.f30403c.f30120b) > 0) {
                                return range.intersection(this.f30403c);
                            }
                        } else {
                            Range range2 = (Range) this.f30404d.get(cut);
                            if (range2 != null) {
                                return range2.intersection(this.f30403c);
                            }
                        }
                    }
                } catch (ClassCastException unused) {
                }
            }
            return null;
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Cut<C>, Range<C>> headMap(Cut<C> cut, boolean z10) {
            return e(Range.upTo(cut, BoundType.g(z10)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Cut<C>, Range<C>> subMap(Cut<C> cut, boolean z10, Cut<C> cut2, boolean z11) {
            return e(Range.range(cut, BoundType.g(z10), cut2, BoundType.g(z11)));
        }

        @Override // java.util.NavigableMap
        public NavigableMap<Cut<C>, Range<C>> tailMap(Cut<C> cut, boolean z10) {
            return e(Range.downTo(cut, BoundType.g(z10)));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Range b(Range range) {
        Preconditions.checkNotNull(range);
        Map.Entry entryFloorEntry = this.f30376b.floorEntry(range.f30120b);
        if (entryFloorEntry == null || !((Range) entryFloorEntry.getValue()).encloses(range)) {
            return null;
        }
        return (Range) entryFloorEntry.getValue();
    }

    private void c(Range range) {
        if (range.isEmpty()) {
            this.f30376b.remove(range.f30120b);
        } else {
            this.f30376b.put(range.f30120b, range);
        }
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create() {
        return new TreeRangeSet<>(new TreeMap());
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public void add(Range<C> range) {
        Preconditions.checkNotNull(range);
        if (range.isEmpty()) {
            return;
        }
        Cut cut = range.f30120b;
        Cut cut2 = range.f30121c;
        Map.Entry entryLowerEntry = this.f30376b.lowerEntry(cut);
        if (entryLowerEntry != null) {
            Range range2 = (Range) entryLowerEntry.getValue();
            if (range2.f30121c.compareTo(cut) >= 0) {
                if (range2.f30121c.compareTo(cut2) >= 0) {
                    cut2 = range2.f30121c;
                }
                cut = range2.f30120b;
            }
        }
        Map.Entry entryFloorEntry = this.f30376b.floorEntry(cut2);
        if (entryFloorEntry != null) {
            Range range3 = (Range) entryFloorEntry.getValue();
            if (range3.f30121c.compareTo(cut2) >= 0) {
                cut2 = range3.f30121c;
            }
        }
        this.f30376b.subMap(cut, cut2).clear();
        c(Range.b(cut, cut2));
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void addAll(RangeSet rangeSet) {
        super.addAll(rangeSet);
    }

    @Override // com.google.common.collect.RangeSet
    public Set<Range<C>> asDescendingSetOfRanges() {
        Set<Range<C>> set = this.f30378d;
        if (set != null) {
            return set;
        }
        AsRanges asRanges = new AsRanges(this.f30376b.descendingMap().values());
        this.f30378d = asRanges;
        return asRanges;
    }

    @Override // com.google.common.collect.RangeSet
    public Set<Range<C>> asRanges() {
        Set<Range<C>> set = this.f30377c;
        if (set != null) {
            return set;
        }
        AsRanges asRanges = new AsRanges(this.f30376b.values());
        this.f30377c = asRanges;
        return asRanges;
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void clear() {
        super.clear();
    }

    @Override // com.google.common.collect.RangeSet
    public RangeSet<C> complement() {
        RangeSet<C> rangeSet = this.f30379e;
        if (rangeSet != null) {
            return rangeSet;
        }
        Complement complement = new Complement();
        this.f30379e = complement;
        return complement;
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean contains(Comparable comparable) {
        return super.contains(comparable);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean encloses(Range<C> range) {
        Preconditions.checkNotNull(range);
        Map.Entry entryFloorEntry = this.f30376b.floorEntry(range.f30120b);
        return entryFloorEntry != null && ((Range) entryFloorEntry.getValue()).encloses(range);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(RangeSet rangeSet) {
        return super.enclosesAll(rangeSet);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public boolean intersects(Range<C> range) {
        Preconditions.checkNotNull(range);
        Map.Entry entryCeilingEntry = this.f30376b.ceilingEntry(range.f30120b);
        if (entryCeilingEntry != null && ((Range) entryCeilingEntry.getValue()).isConnected(range) && !((Range) entryCeilingEntry.getValue()).intersection(range).isEmpty()) {
            return true;
        }
        Map.Entry entryLowerEntry = this.f30376b.lowerEntry(range.f30120b);
        return (entryLowerEntry == null || !((Range) entryLowerEntry.getValue()).isConnected(range) || ((Range) entryLowerEntry.getValue()).intersection(range).isEmpty()) ? false : true;
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public Range<C> rangeContaining(C c10) {
        Preconditions.checkNotNull(c10);
        Map.Entry entryFloorEntry = this.f30376b.floorEntry(Cut.i(c10));
        if (entryFloorEntry == null || !((Range) entryFloorEntry.getValue()).contains(c10)) {
            return null;
        }
        return (Range) entryFloorEntry.getValue();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public void remove(Range<C> range) {
        Preconditions.checkNotNull(range);
        if (range.isEmpty()) {
            return;
        }
        Map.Entry entryLowerEntry = this.f30376b.lowerEntry(range.f30120b);
        if (entryLowerEntry != null) {
            Range range2 = (Range) entryLowerEntry.getValue();
            if (range2.f30121c.compareTo(range.f30120b) >= 0) {
                if (range.hasUpperBound() && range2.f30121c.compareTo(range.f30121c) >= 0) {
                    c(Range.b(range.f30121c, range2.f30121c));
                }
                c(Range.b(range2.f30120b, range.f30120b));
            }
        }
        Map.Entry entryFloorEntry = this.f30376b.floorEntry(range.f30121c);
        if (entryFloorEntry != null) {
            Range range3 = (Range) entryFloorEntry.getValue();
            if (range.hasUpperBound() && range3.f30121c.compareTo(range.f30121c) >= 0) {
                c(Range.b(range.f30121c, range3.f30121c));
            }
        }
        this.f30376b.subMap(range.f30120b, range.f30121c).clear();
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void removeAll(RangeSet rangeSet) {
        super.removeAll(rangeSet);
    }

    @Override // com.google.common.collect.RangeSet
    public Range<C> span() {
        Map.Entry entryFirstEntry = this.f30376b.firstEntry();
        Map.Entry entryLastEntry = this.f30376b.lastEntry();
        if (entryFirstEntry == null || entryLastEntry == null) {
            throw new NoSuchElementException();
        }
        return Range.b(((Range) entryFirstEntry.getValue()).f30120b, ((Range) entryLastEntry.getValue()).f30121c);
    }

    @Override // com.google.common.collect.RangeSet
    public RangeSet<C> subRangeSet(Range<C> range) {
        return range.equals(Range.all()) ? this : new SubRangeSet(range);
    }

    private TreeRangeSet(NavigableMap navigableMap) {
        this.f30376b = navigableMap;
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(RangeSet<C> rangeSet) {
        TreeRangeSet<C> treeRangeSetCreate = create();
        treeRangeSetCreate.addAll(rangeSet);
        return treeRangeSetCreate;
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void addAll(Iterable iterable) {
        super.addAll(iterable);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ boolean enclosesAll(Iterable iterable) {
        return super.enclosesAll(iterable);
    }

    @Override // com.google.common.collect.AbstractRangeSet, com.google.common.collect.RangeSet
    public /* bridge */ /* synthetic */ void removeAll(Iterable iterable) {
        super.removeAll(iterable);
    }

    public static <C extends Comparable<?>> TreeRangeSet<C> create(Iterable<Range<C>> iterable) {
        TreeRangeSet<C> treeRangeSetCreate = create();
        treeRangeSetCreate.addAll(iterable);
        return treeRangeSetCreate;
    }
}
