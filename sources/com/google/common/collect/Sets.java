package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Collections2;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import j$.util.DesugarCollections;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.stream.Collector;
import java.io.Serializable;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.concurrent.CopyOnWriteArraySet;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
public final class Sets {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* JADX INFO: renamed from: com.google.common.collect.Sets$5, reason: invalid class name */
    class AnonymousClass5<E> extends AbstractSet<Set<E>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f30202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ ImmutableMap f30203c;

        /* JADX INFO: renamed from: com.google.common.collect.Sets$5$1, reason: invalid class name */
        class AnonymousClass1 extends AbstractIterator<Set<E>> {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final BitSet f30204d;

            AnonymousClass1() {
                this.f30204d = new BitSet(AnonymousClass5.this.f30203c.size());
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Set computeNext() {
                if (this.f30204d.isEmpty()) {
                    this.f30204d.set(0, AnonymousClass5.this.f30202b);
                } else {
                    int iNextSetBit = this.f30204d.nextSetBit(0);
                    int iNextClearBit = this.f30204d.nextClearBit(iNextSetBit);
                    if (iNextClearBit == AnonymousClass5.this.f30203c.size()) {
                        return (Set) a();
                    }
                    int i10 = (iNextClearBit - iNextSetBit) - 1;
                    this.f30204d.set(0, i10);
                    this.f30204d.clear(i10, iNextClearBit);
                    this.f30204d.set(iNextClearBit);
                }
                final BitSet bitSet = (BitSet) this.f30204d.clone();
                return new AbstractSet<E>(this) { // from class: com.google.common.collect.Sets.5.1.1

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ AnonymousClass1 f30207c;

                    {
                        this.f30207c = this;
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public boolean contains(Object obj) {
                        Integer num = (Integer) AnonymousClass5.this.f30203c.get(obj);
                        return num != null && bitSet.get(num.intValue());
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
                    public Iterator<E> iterator() {
                        return new AbstractIterator<E>() { // from class: com.google.common.collect.Sets.5.1.1.1

                            /* JADX INFO: renamed from: d, reason: collision with root package name */
                            int f30208d = -1;

                            @Override // com.google.common.collect.AbstractIterator
                            protected Object computeNext() {
                                int iNextSetBit2 = bitSet.nextSetBit(this.f30208d + 1);
                                this.f30208d = iNextSetBit2;
                                return iNextSetBit2 == -1 ? a() : AnonymousClass5.this.f30203c.keySet().asList().get(this.f30208d);
                            }
                        };
                    }

                    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
                    public int size() {
                        return AnonymousClass5.this.f30202b;
                    }
                };
            }
        }

        AnonymousClass5(int i10, ImmutableMap immutableMap) {
            this.f30202b = i10;
            this.f30203c = immutableMap;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Set) {
                Set set = (Set) obj;
                if (set.size() == this.f30202b && this.f30203c.keySet().containsAll(set)) {
                    return true;
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
            return new AnonymousClass1();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return IntMath.binomial(this.f30203c.size(), this.f30202b);
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "Sets.combinations(" + this.f30203c.keySet() + ", " + this.f30202b + ")";
        }
    }

    private static final class CartesianSet<E> extends ForwardingCollection<List<E>> implements Set<List<E>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final transient ImmutableList f30210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final transient CartesianList f30211c;

        private CartesianSet(ImmutableList immutableList, CartesianList cartesianList) {
            this.f30210b = immutableList;
            this.f30211c = cartesianList;
        }

        static Set n(List list) {
            ImmutableList.Builder builder = new ImmutableList.Builder(list.size());
            Iterator<E> it = list.iterator();
            while (it.hasNext()) {
                ImmutableSet immutableSetCopyOf = ImmutableSet.copyOf((Collection) it.next());
                if (immutableSetCopyOf.isEmpty()) {
                    return ImmutableSet.of();
                }
                builder.add(immutableSetCopyOf);
            }
            final ImmutableList<E> immutableListBuild = builder.build();
            return new CartesianSet(immutableListBuild, new CartesianList(new ImmutableList<List<Object>>() { // from class: com.google.common.collect.Sets.CartesianSet.1
                @Override // com.google.common.collect.ImmutableCollection
                boolean isPartialView() {
                    return true;
                }

                @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
                public int size() {
                    return immutableListBuild.size();
                }

                @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
                @J2ktIncompatible
                @GwtIncompatible
                Object writeReplace() {
                    return super.writeReplace();
                }

                @Override // java.util.List
                public List<Object> get(int i10) {
                    return ((ImmutableSet) immutableListBuild.get(i10)).asList();
                }
            }));
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof List)) {
                return false;
            }
            List list = (List) obj;
            if (list.size() != this.f30210b.size()) {
                return false;
            }
            Iterator<E> it = list.iterator();
            int i10 = 0;
            while (it.hasNext()) {
                if (!((ImmutableSet) this.f30210b.get(i10)).contains(it.next())) {
                    return false;
                }
                i10++;
            }
            return true;
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            if (obj instanceof CartesianSet) {
                return this.f30210b.equals(((CartesianSet) obj).f30210b);
            }
            if (obj instanceof Set) {
                Set set = (Set) obj;
                if (size() == set.size() && containsAll(set)) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingCollection, com.google.common.collect.ForwardingObject
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public Collection n() {
            return this.f30211c;
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            int i10 = 1;
            int size = size() - 1;
            for (int i11 = 0; i11 < this.f30210b.size(); i11++) {
                size = ~(~(size * 31));
            }
            UnmodifiableIterator<E> it = this.f30210b.iterator();
            while (it.hasNext()) {
                Set set = (Set) it.next();
                i10 = ~(~((i10 * 31) + ((size() / set.size()) * set.hashCode())));
            }
            return ~(~(i10 + size));
        }
    }

    @GwtIncompatible
    static class DescendingSet<E> extends ForwardingNavigableSet<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final NavigableSet f30213b;

        DescendingSet(NavigableSet navigableSet) {
            this.f30213b = navigableSet;
        }

        private static Ordering v(Comparator comparator) {
            return Ordering.from(comparator).reverse();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E ceiling(@ParametricNullness E e10) {
            return (E) this.f30213b.floor(e10);
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public Comparator<? super E> comparator() {
            Comparator<? super E> comparator = this.f30213b.comparator();
            return comparator == null ? Ordering.natural().reverse() : v(comparator);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return this.f30213b.iterator();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return this.f30213b;
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        @ParametricNullness
        public E first() {
            return (E) this.f30213b.last();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E floor(@ParametricNullness E e10) {
            return (E) this.f30213b.ceiling(e10);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> headSet(@ParametricNullness E e10, boolean z10) {
            return this.f30213b.tailSet(e10, z10).descendingSet();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E higher(@ParametricNullness E e10) {
            return (E) this.f30213b.lower(e10);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return this.f30213b.descendingIterator();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        @ParametricNullness
        public E last() {
            return (E) this.f30213b.first();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E lower(@ParametricNullness E e10) {
            return (E) this.f30213b.higher(e10);
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E pollFirst() {
            return (E) this.f30213b.pollLast();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public E pollLast() {
            return (E) this.f30213b.pollFirst();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingNavigableSet, com.google.common.collect.ForwardingSortedSet
        /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public NavigableSet n() {
            return this.f30213b;
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> subSet(@ParametricNullness E e10, boolean z10, @ParametricNullness E e11, boolean z11) {
            return this.f30213b.subSet(e11, z11, e10, z10).descendingSet();
        }

        @Override // com.google.common.collect.ForwardingNavigableSet, java.util.NavigableSet
        public NavigableSet<E> tailSet(@ParametricNullness E e10, boolean z10) {
            return this.f30213b.headSet(e10, z10).descendingSet();
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return l();
        }

        @Override // com.google.common.collect.ForwardingObject
        public String toString() {
            return standardToString();
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> headSet(@ParametricNullness E e10) {
            return s(e10);
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> subSet(@ParametricNullness E e10, @ParametricNullness E e11) {
            return t(e10, e11);
        }

        @Override // com.google.common.collect.ForwardingSortedSet, java.util.SortedSet
        public SortedSet<E> tailSet(@ParametricNullness E e10) {
            return u(e10);
        }

        @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) m(tArr);
        }
    }

    @GwtIncompatible
    private static class FilteredNavigableSet<E> extends FilteredSortedSet<E> implements NavigableSet<E> {
        FilteredNavigableSet(NavigableSet navigableSet, Predicate predicate) {
            super(navigableSet, predicate);
        }

        @Override // java.util.NavigableSet
        public E ceiling(@ParametricNullness E e10) {
            return (E) Iterables.find(e().tailSet(e10, true), this.f29339c, null);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return Iterators.filter(e().descendingIterator(), this.f29339c);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            return Sets.filter((NavigableSet) e().descendingSet(), this.f29339c);
        }

        NavigableSet e() {
            return (NavigableSet) this.f29338b;
        }

        @Override // java.util.NavigableSet
        public E floor(@ParametricNullness E e10) {
            return (E) Iterators.find(e().headSet(e10, true).descendingIterator(), this.f29339c, null);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@ParametricNullness E e10, boolean z10) {
            return Sets.filter((NavigableSet) e().headSet(e10, z10), this.f29339c);
        }

        @Override // java.util.NavigableSet
        public E higher(@ParametricNullness E e10) {
            return (E) Iterables.find(e().tailSet(e10, false), this.f29339c, null);
        }

        @Override // com.google.common.collect.Sets.FilteredSortedSet, java.util.SortedSet
        @ParametricNullness
        public E last() {
            return (E) Iterators.find(e().descendingIterator(), this.f29339c);
        }

        @Override // java.util.NavigableSet
        public E lower(@ParametricNullness E e10) {
            return (E) Iterators.find(e().headSet(e10, false).descendingIterator(), this.f29339c, null);
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            return (E) Iterables.c(e(), this.f29339c);
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            return (E) Iterables.c(e().descendingSet(), this.f29339c);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@ParametricNullness E e10, boolean z10, @ParametricNullness E e11, boolean z11) {
            return Sets.filter((NavigableSet) e().subSet(e10, z10, e11, z11), this.f29339c);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@ParametricNullness E e10, boolean z10) {
            return Sets.filter((NavigableSet) e().tailSet(e10, z10), this.f29339c);
        }
    }

    private static class FilteredSet<E> extends Collections2.FilteredCollection<E> implements Set<E> {
        FilteredSet(Set set, Predicate predicate) {
            super(set, predicate);
        }

        @Override // java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return Sets.a(this, obj);
        }

        @Override // java.util.Collection, java.util.Set
        public int hashCode() {
            return Sets.b(this);
        }
    }

    private static class FilteredSortedSet<E> extends FilteredSet<E> implements SortedSet<E> {
        FilteredSortedSet(SortedSet sortedSet, Predicate predicate) {
            super(sortedSet, predicate);
        }

        @Override // java.util.SortedSet
        public Comparator<? super E> comparator() {
            return ((SortedSet) this.f29338b).comparator();
        }

        @Override // java.util.SortedSet
        @ParametricNullness
        public E first() {
            return (E) Iterators.find(this.f29338b.iterator(), this.f29339c);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> headSet(@ParametricNullness E e10) {
            return new FilteredSortedSet(((SortedSet) this.f29338b).headSet(e10), this.f29339c);
        }

        @ParametricNullness
        public E last() {
            SortedSet sortedSetHeadSet = (SortedSet) this.f29338b;
            while (true) {
                E e10 = (E) sortedSetHeadSet.last();
                if (this.f29339c.apply(e10)) {
                    return e10;
                }
                sortedSetHeadSet = sortedSetHeadSet.headSet(e10);
            }
        }

        @Override // java.util.SortedSet
        public SortedSet<E> subSet(@ParametricNullness E e10, @ParametricNullness E e11) {
            return new FilteredSortedSet(((SortedSet) this.f29338b).subSet(e10, e11), this.f29339c);
        }

        @Override // java.util.SortedSet
        public SortedSet<E> tailSet(@ParametricNullness E e10) {
            return new FilteredSortedSet(((SortedSet) this.f29338b).tailSet(e10), this.f29339c);
        }
    }

    static abstract class ImprovedAbstractSet<E> extends AbstractSet<E> {
        ImprovedAbstractSet() {
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean removeAll(Collection<?> collection) {
            return Sets.d(this, collection);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean retainAll(Collection<?> collection) {
            return super.retainAll((Collection) Preconditions.checkNotNull(collection));
        }
    }

    private static final class PowerSet<E> extends AbstractSet<Set<E>> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ImmutableMap f30214b;

        PowerSet(Set set) {
            Preconditions.checkArgument(set.size() <= 30, "Too many elements to create power set: %s > 30", set.size());
            this.f30214b = Maps.u(set);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (!(obj instanceof Set)) {
                return false;
            }
            return this.f30214b.keySet().containsAll((Set) obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public boolean equals(Object obj) {
            return obj instanceof PowerSet ? this.f30214b.keySet().equals(((PowerSet) obj).f30214b.keySet()) : super.equals(obj);
        }

        @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return this.f30214b.keySet().hashCode() << (this.f30214b.size() - 1);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean isEmpty() {
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Set<E>> iterator() {
            return new AbstractIndexedListIterator<Set<E>>(size()) { // from class: com.google.common.collect.Sets.PowerSet.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // com.google.common.collect.AbstractIndexedListIterator
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public Set get(int i10) {
                    return new SubSet(PowerSet.this.f30214b, i10);
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return 1 << this.f30214b.size();
        }

        @Override // java.util.AbstractCollection
        public String toString() {
            return "powerSet(" + this.f30214b + ")";
        }
    }

    public static abstract class SetView<E> extends AbstractSet<E> {
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean add(@ParametricNullness E e10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final void clear() {
            throw new UnsupportedOperationException();
        }

        @CanIgnoreReturnValue
        public <S extends Set<E>> S copyInto(S s10) {
            s10.addAll(this);
            return s10;
        }

        public ImmutableSet<E> immutableCopy() {
            return ImmutableSet.copyOf((Collection) this);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public abstract UnmodifiableIterator<E> iterator();

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        @CanIgnoreReturnValue
        @DoNotCall("Always throws UnsupportedOperationException")
        @Deprecated
        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        private SetView() {
        }
    }

    private static final class SubSet<E> extends AbstractSet<E> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ImmutableMap f30216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f30217c;

        SubSet(ImmutableMap immutableMap, int i10) {
            this.f30216b = immutableMap;
            this.f30217c = i10;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            Integer num = (Integer) this.f30216b.get(obj);
            if (num != null) {
                return ((1 << num.intValue()) & this.f30217c) != 0;
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return new UnmodifiableIterator<E>() { // from class: com.google.common.collect.Sets.SubSet.1

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final ImmutableList f30218b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                int f30219c;

                {
                    this.f30218b = SubSet.this.f30216b.keySet().asList();
                    this.f30219c = SubSet.this.f30217c;
                }

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.f30219c != 0;
                }

                @Override // java.util.Iterator
                public E next() {
                    int iNumberOfTrailingZeros = Integer.numberOfTrailingZeros(this.f30219c);
                    if (iNumberOfTrailingZeros == 32) {
                        throw new NoSuchElementException();
                    }
                    this.f30219c &= ~(1 << iNumberOfTrailingZeros);
                    return this.f30218b.get(iNumberOfTrailingZeros);
                }
            };
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return Integer.bitCount(this.f30217c);
        }
    }

    static final class UnmodifiableNavigableSet<E> extends ForwardingSortedSet<E> implements NavigableSet<E>, Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final NavigableSet f30221b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final SortedSet f30222c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private transient UnmodifiableNavigableSet f30223d;

        UnmodifiableNavigableSet(NavigableSet navigableSet) {
            this.f30221b = (NavigableSet) Preconditions.checkNotNull(navigableSet);
            this.f30222c = DesugarCollections.unmodifiableSortedSet(navigableSet);
        }

        @Override // java.util.NavigableSet
        public E ceiling(@ParametricNullness E e10) {
            return (E) this.f30221b.ceiling(e10);
        }

        @Override // java.util.NavigableSet
        public Iterator<E> descendingIterator() {
            return Iterators.unmodifiableIterator(this.f30221b.descendingIterator());
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> descendingSet() {
            UnmodifiableNavigableSet unmodifiableNavigableSet = this.f30223d;
            if (unmodifiableNavigableSet != null) {
                return unmodifiableNavigableSet;
            }
            UnmodifiableNavigableSet unmodifiableNavigableSet2 = new UnmodifiableNavigableSet(this.f30221b.descendingSet());
            this.f30223d = unmodifiableNavigableSet2;
            unmodifiableNavigableSet2.f30223d = this;
            return unmodifiableNavigableSet2;
        }

        @Override // java.util.NavigableSet
        public E floor(@ParametricNullness E e10) {
            return (E) this.f30221b.floor(e10);
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> headSet(@ParametricNullness E e10, boolean z10) {
            return Sets.unmodifiableNavigableSet(this.f30221b.headSet(e10, z10));
        }

        @Override // java.util.NavigableSet
        public E higher(@ParametricNullness E e10) {
            return (E) this.f30221b.higher(e10);
        }

        @Override // java.util.NavigableSet
        public E lower(@ParametricNullness E e10) {
            return (E) this.f30221b.lower(e10);
        }

        @Override // java.util.NavigableSet
        public E pollFirst() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.NavigableSet
        public E pollLast() {
            throw new UnsupportedOperationException();
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.common.collect.ForwardingSortedSet, com.google.common.collect.ForwardingSet
        /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public SortedSet n() {
            return this.f30222c;
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> subSet(@ParametricNullness E e10, boolean z10, @ParametricNullness E e11, boolean z11) {
            return Sets.unmodifiableNavigableSet(this.f30221b.subSet(e10, z10, e11, z11));
        }

        @Override // java.util.NavigableSet
        public NavigableSet<E> tailSet(@ParametricNullness E e10, boolean z10) {
            return Sets.unmodifiableNavigableSet(this.f30221b.tailSet(e10, z10));
        }
    }

    static boolean a(Set set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    static int b(Set set) {
        Iterator it = set.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i10 = ~(~(i10 + (next != null ? next.hashCode() : 0)));
        }
        return i10;
    }

    private static EnumSet c(Collection collection, Class cls) {
        EnumSet enumSetAllOf = EnumSet.allOf(cls);
        enumSetAllOf.removeAll(collection);
        return enumSetAllOf;
    }

    public static <B> Set<List<B>> cartesianProduct(List<? extends Set<? extends B>> list) {
        return CartesianSet.n(list);
    }

    public static <E> Set<Set<E>> combinations(Set<E> set, int i10) {
        ImmutableMap immutableMapU = Maps.u(set);
        CollectPreconditions.b(i10, "size");
        Preconditions.checkArgument(i10 <= immutableMapU.size(), "size (%s) must be <= set.size() (%s)", i10, immutableMapU.size());
        return i10 == 0 ? ImmutableSet.of(ImmutableSet.of()) : i10 == immutableMapU.size() ? ImmutableSet.of(immutableMapU.keySet()) : new AnonymousClass5(i10, immutableMapU);
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> collection) {
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        Preconditions.checkArgument(!collection.isEmpty(), "collection is empty; use the other version of this method");
        return c(collection, collection.iterator().next().getDeclaringClass());
    }

    static boolean d(Set set, Collection collection) {
        Preconditions.checkNotNull(collection);
        if (collection instanceof Multiset) {
            collection = ((Multiset) collection).elementSet();
        }
        return (!(collection instanceof Set) || collection.size() <= set.size()) ? e(set, collection.iterator()) : Iterators.removeAll(set.iterator(), collection);
    }

    public static <E> SetView<E> difference(final Set<E> set, final Set<?> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new SetView<E>() { // from class: com.google.common.collect.Sets.3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return set.contains(obj) && !set2.contains(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return set2.containsAll(set);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator<E> it = set.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    if (!set2.contains(it.next())) {
                        i10++;
                    }
                }
                return i10;
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<E> iterator() {
                return new AbstractIterator<E>() { // from class: com.google.common.collect.Sets.3.1

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final Iterator f30195d;

                    {
                        this.f30195d = set.iterator();
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    protected Object computeNext() {
                        while (this.f30195d.hasNext()) {
                            Object next = this.f30195d.next();
                            if (!set2.contains(next)) {
                                return next;
                            }
                        }
                        return a();
                    }
                };
            }
        };
    }

    static boolean e(Set set, Iterator it) {
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= set.remove(it.next());
        }
        return zRemove;
    }

    public static <E> Set<E> filter(Set<E> set, Predicate<? super E> predicate) {
        if (set instanceof SortedSet) {
            return filter((SortedSet) set, (Predicate) predicate);
        }
        if (!(set instanceof FilteredSet)) {
            return new FilteredSet((Set) Preconditions.checkNotNull(set), (Predicate) Preconditions.checkNotNull(predicate));
        }
        FilteredSet filteredSet = (FilteredSet) set;
        return new FilteredSet((Set) filteredSet.f29338b, Predicates.and(filteredSet.f29339c, predicate));
    }

    @GwtCompatible(serializable = true)
    public static <E extends Enum<E>> ImmutableSet<E> immutableEnumSet(E e10, E... eArr) {
        return ImmutableEnumSet.s(EnumSet.of((Enum) e10, (Enum[]) eArr));
    }

    public static <E> SetView<E> intersection(final Set<E> set, final Set<?> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new SetView<E>() { // from class: com.google.common.collect.Sets.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return set.contains(obj) && set2.contains(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean containsAll(Collection<?> collection) {
                return set.containsAll(collection) && set2.containsAll(collection);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return Collections.disjoint(set2, set);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator<E> it = set.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    if (set2.contains(it.next())) {
                        i10++;
                    }
                }
                return i10;
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<E> iterator() {
                return new AbstractIterator<E>() { // from class: com.google.common.collect.Sets.2.1

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final Iterator f30191d;

                    {
                        this.f30191d = set.iterator();
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    protected Object computeNext() {
                        while (this.f30191d.hasNext()) {
                            Object next = this.f30191d.next();
                            if (set2.contains(next)) {
                                return next;
                            }
                        }
                        return a();
                    }
                };
            }
        };
    }

    public static <E> Set<E> newConcurrentHashSet() {
        return Collections.newSetFromMap(new ConcurrentHashMap());
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet() {
        return new CopyOnWriteArraySet<>();
    }

    public static <E extends Enum<E>> EnumSet<E> newEnumSet(Iterable<E> iterable, Class<E> cls) {
        EnumSet<E> enumSetNoneOf = EnumSet.noneOf(cls);
        Iterables.addAll(enumSetNoneOf, iterable);
        return enumSetNoneOf;
    }

    public static <E> HashSet<E> newHashSet() {
        return new HashSet<>();
    }

    public static <E> HashSet<E> newHashSetWithExpectedSize(int i10) {
        return new HashSet<>(Maps.k(i10));
    }

    public static <E> Set<E> newIdentityHashSet() {
        return Collections.newSetFromMap(Maps.newIdentityHashMap());
    }

    public static <E> LinkedHashSet<E> newLinkedHashSet() {
        return new LinkedHashSet<>();
    }

    public static <E> LinkedHashSet<E> newLinkedHashSetWithExpectedSize(int i10) {
        return new LinkedHashSet<>(Maps.k(i10));
    }

    @Deprecated
    public static <E> Set<E> newSetFromMap(Map<E, Boolean> map) {
        return Collections.newSetFromMap(map);
    }

    public static <E extends Comparable> TreeSet<E> newTreeSet() {
        return new TreeSet<>();
    }

    @GwtCompatible(serializable = false)
    public static <E> Set<Set<E>> powerSet(Set<E> set) {
        return new PowerSet(set);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    public static <K extends Comparable<? super K>> NavigableSet<K> subSet(NavigableSet<K> navigableSet, Range<K> range) {
        if (navigableSet.comparator() != null && navigableSet.comparator() != Ordering.natural() && range.hasLowerBound() && range.hasUpperBound()) {
            Preconditions.checkArgument(navigableSet.comparator().compare(range.lowerEndpoint(), range.upperEndpoint()) <= 0, "set is using a custom comparator which is inconsistent with the natural ordering.");
        }
        if (range.hasLowerBound() && range.hasUpperBound()) {
            Comparable comparableLowerEndpoint = range.lowerEndpoint();
            BoundType boundTypeLowerBoundType = range.lowerBoundType();
            BoundType boundType = BoundType.CLOSED;
            return navigableSet.subSet(comparableLowerEndpoint, boundTypeLowerBoundType == boundType, range.upperEndpoint(), range.upperBoundType() == boundType);
        }
        if (range.hasLowerBound()) {
            return navigableSet.tailSet(range.lowerEndpoint(), range.lowerBoundType() == BoundType.CLOSED);
        }
        if (range.hasUpperBound()) {
            return navigableSet.headSet(range.upperEndpoint(), range.upperBoundType() == BoundType.CLOSED);
        }
        return (NavigableSet) Preconditions.checkNotNull(navigableSet);
    }

    public static <E> SetView<E> symmetricDifference(final Set<? extends E> set, final Set<? extends E> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new SetView<E>() { // from class: com.google.common.collect.Sets.4
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return set2.contains(obj) ^ set.contains(obj);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return set.equals(set2);
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                Iterator<E> it = set.iterator();
                int i10 = 0;
                while (it.hasNext()) {
                    if (!set2.contains(it.next())) {
                        i10++;
                    }
                }
                Iterator<E> it2 = set2.iterator();
                while (it2.hasNext()) {
                    if (!set.contains(it2.next())) {
                        i10++;
                    }
                }
                return i10;
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<E> iterator() {
                final Iterator<E> it = set.iterator();
                final Iterator<E> it2 = set2.iterator();
                return new AbstractIterator<E>(this) { // from class: com.google.common.collect.Sets.4.1

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    final /* synthetic */ AnonymousClass4 f30201f;

                    {
                        this.f30201f = this;
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    public E computeNext() {
                        while (it.hasNext()) {
                            E e10 = (E) it.next();
                            if (!set2.contains(e10)) {
                                return e10;
                            }
                        }
                        while (it2.hasNext()) {
                            E e11 = (E) it2.next();
                            if (!set.contains(e11)) {
                                return e11;
                            }
                        }
                        return (E) a();
                    }
                };
            }
        };
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E> NavigableSet<E> synchronizedNavigableSet(NavigableSet<E> navigableSet) {
        return Synchronized.q(navigableSet);
    }

    @IgnoreJRERequirement
    public static <E extends Enum<E>> Collector<E, ?, ImmutableSet<E>> toImmutableEnumSet() {
        return CollectCollectors.J();
    }

    public static <E> SetView<E> union(final Set<? extends E> set, final Set<? extends E> set2) {
        Preconditions.checkNotNull(set, "set1");
        Preconditions.checkNotNull(set2, "set2");
        return new SetView<E>() { // from class: com.google.common.collect.Sets.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return set.contains(obj) || set2.contains(obj);
            }

            @Override // com.google.common.collect.Sets.SetView
            public <S extends Set<E>> S copyInto(S s10) {
                s10.addAll(set);
                s10.addAll(set2);
                return s10;
            }

            @Override // com.google.common.collect.Sets.SetView
            public ImmutableSet<E> immutableCopy() {
                return new ImmutableSet.Builder().addAll((Iterable) set).addAll((Iterable) set2).build();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public boolean isEmpty() {
                return set.isEmpty() && set2.isEmpty();
            }

            @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
            public int size() {
                int size = set.size();
                Iterator<E> it = set2.iterator();
                while (it.hasNext()) {
                    if (!set.contains(it.next())) {
                        size++;
                    }
                }
                return size;
            }

            @Override // com.google.common.collect.Sets.SetView, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
            public UnmodifiableIterator<E> iterator() {
                return new AbstractIterator<E>() { // from class: com.google.common.collect.Sets.1.1

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    final Iterator f30186d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    final Iterator f30187e;

                    {
                        this.f30186d = set.iterator();
                        this.f30187e = set2.iterator();
                    }

                    @Override // com.google.common.collect.AbstractIterator
                    protected Object computeNext() {
                        if (this.f30186d.hasNext()) {
                            return this.f30186d.next();
                        }
                        while (this.f30187e.hasNext()) {
                            Object next = this.f30187e.next();
                            if (!set.contains(next)) {
                                return next;
                            }
                        }
                        return a();
                    }
                };
            }
        };
    }

    public static <E> NavigableSet<E> unmodifiableNavigableSet(NavigableSet<E> navigableSet) {
        return ((navigableSet instanceof ImmutableCollection) || (navigableSet instanceof UnmodifiableNavigableSet)) ? navigableSet : new UnmodifiableNavigableSet(navigableSet);
    }

    @SafeVarargs
    public static <B> Set<List<B>> cartesianProduct(Set<? extends B>... setArr) {
        return cartesianProduct(Arrays.asList(setArr));
    }

    @GwtCompatible(serializable = true)
    public static <E extends Enum<E>> ImmutableSet<E> immutableEnumSet(Iterable<E> iterable) {
        if (iterable instanceof ImmutableEnumSet) {
            return (ImmutableEnumSet) iterable;
        }
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            return collection.isEmpty() ? ImmutableSet.of() : ImmutableEnumSet.s(EnumSet.copyOf(collection));
        }
        Iterator<E> it = iterable.iterator();
        if (!it.hasNext()) {
            return ImmutableSet.of();
        }
        EnumSet enumSetOf = EnumSet.of((Enum) it.next());
        Iterators.addAll(enumSetOf, it);
        return ImmutableEnumSet.s(enumSetOf);
    }

    public static <E> Set<E> newConcurrentHashSet(Iterable<? extends E> iterable) {
        Set<E> setNewConcurrentHashSet = newConcurrentHashSet();
        Iterables.addAll(setNewConcurrentHashSet, iterable);
        return setNewConcurrentHashSet;
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E> CopyOnWriteArraySet<E> newCopyOnWriteArraySet(Iterable<? extends E> iterable) {
        return new CopyOnWriteArraySet<>(iterable instanceof Collection ? (Collection) iterable : Lists.newArrayList(iterable));
    }

    public static <E> HashSet<E> newHashSet(E... eArr) {
        HashSet<E> hashSetNewHashSetWithExpectedSize = newHashSetWithExpectedSize(eArr.length);
        Collections.addAll(hashSetNewHashSetWithExpectedSize, eArr);
        return hashSetNewHashSetWithExpectedSize;
    }

    public static <E> LinkedHashSet<E> newLinkedHashSet(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new LinkedHashSet<>((Collection) iterable);
        }
        LinkedHashSet<E> linkedHashSetNewLinkedHashSet = newLinkedHashSet();
        Iterables.addAll(linkedHashSetNewLinkedHashSet, iterable);
        return linkedHashSetNewLinkedHashSet;
    }

    public static <E extends Comparable> TreeSet<E> newTreeSet(Iterable<? extends E> iterable) {
        TreeSet<E> treeSetNewTreeSet = newTreeSet();
        Iterables.addAll(treeSetNewTreeSet, iterable);
        return treeSetNewTreeSet;
    }

    public static <E> HashSet<E> newHashSet(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return new HashSet<>((Collection) iterable);
        }
        return newHashSet(iterable.iterator());
    }

    public static <E> TreeSet<E> newTreeSet(Comparator<? super E> comparator) {
        return new TreeSet<>((Comparator) Preconditions.checkNotNull(comparator));
    }

    @J2ktIncompatible
    @GwtIncompatible
    public static <E extends Enum<E>> EnumSet<E> complementOf(Collection<E> collection, Class<E> cls) {
        Preconditions.checkNotNull(collection);
        if (collection instanceof EnumSet) {
            return EnumSet.complementOf((EnumSet) collection);
        }
        return c(collection, cls);
    }

    public static <E> HashSet<E> newHashSet(Iterator<? extends E> it) {
        HashSet<E> hashSetNewHashSet = newHashSet();
        Iterators.addAll(hashSetNewHashSet, it);
        return hashSetNewHashSet;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> SortedSet<E> filter(SortedSet<E> sortedSet, Predicate<? super E> predicate) {
        if (sortedSet instanceof FilteredSet) {
            FilteredSet filteredSet = (FilteredSet) sortedSet;
            return new FilteredSortedSet((SortedSet) filteredSet.f29338b, Predicates.and(filteredSet.f29339c, predicate));
        }
        return new FilteredSortedSet((SortedSet) Preconditions.checkNotNull(sortedSet), (Predicate) Preconditions.checkNotNull(predicate));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @GwtIncompatible
    public static <E> NavigableSet<E> filter(NavigableSet<E> navigableSet, Predicate<? super E> predicate) {
        if (navigableSet instanceof FilteredSet) {
            FilteredSet filteredSet = (FilteredSet) navigableSet;
            return new FilteredNavigableSet((NavigableSet) filteredSet.f29338b, Predicates.and(filteredSet.f29339c, predicate));
        }
        return new FilteredNavigableSet((NavigableSet) Preconditions.checkNotNull(navigableSet), (Predicate) Preconditions.checkNotNull(predicate));
    }
}
