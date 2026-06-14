package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableSet;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import j$.util.SortedSet;
import j$.util.stream.Collector;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public abstract class ImmutableSortedSet<E> extends ImmutableSet<E> implements NavigableSet<E>, SortedIterable<E>, SortedSet {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final transient Comparator f29699d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    transient ImmutableSortedSet f29700e;

    @J2ktIncompatible
    private static class SerializedForm<E> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Comparator f29702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Object[] f29703c;

        public SerializedForm(Comparator<? super E> comparator, Object[] objArr) {
            this.f29702b = comparator;
            this.f29703c = objArr;
        }

        /* JADX WARN: Multi-variable type inference failed */
        Object readResolve() {
            return new Builder(this.f29702b).add(this.f29703c).build();
        }
    }

    ImmutableSortedSet(Comparator comparator) {
        this.f29699d = comparator;
    }

    static int C(Comparator comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    @DoNotCall("Use naturalOrder")
    @Deprecated
    public static <E> Builder<E> builder() {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Use naturalOrder (which does not accept an expected size)")
    @Deprecated
    public static <E> Builder<E> builderWithExpectedSize(int i10) {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet copyOf(Comparable[] comparableArr) {
        return s(Ordering.natural(), comparableArr.length, (Comparable[]) comparableArr.clone());
    }

    public static <E> ImmutableSortedSet<E> copyOfSorted(java.util.SortedSet<E> sortedSet) {
        Comparator comparator = SortedIterables.comparator(sortedSet);
        ImmutableList immutableListCopyOf = ImmutableList.copyOf((Collection) sortedSet);
        return immutableListCopyOf.isEmpty() ? u(comparator) : new RegularImmutableSortedSet(immutableListCopyOf, comparator);
    }

    public static <E extends Comparable<?>> Builder<E> naturalOrder() {
        return new Builder<>(Ordering.natural());
    }

    public static <E> ImmutableSortedSet<E> of() {
        return RegularImmutableSortedSet.f30177g;
    }

    public static <E> Builder<E> orderedBy(Comparator<E> comparator) {
        return new Builder<>(comparator);
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<?>> Builder<E> reverseOrder() {
        return new Builder<>(Collections.reverseOrder());
    }

    static ImmutableSortedSet s(Comparator comparator, int i10, Object... objArr) {
        if (i10 == 0) {
            return u(comparator);
        }
        ObjectArrays.c(objArr, i10);
        Arrays.sort(objArr, 0, i10, comparator);
        int i11 = 1;
        for (int i12 = 1; i12 < i10; i12++) {
            Object obj = objArr[i12];
            if (comparator.compare(obj, objArr[i11 - 1]) != 0) {
                objArr[i11] = obj;
                i11++;
            }
        }
        Arrays.fill(objArr, i11, i10, (Object) null);
        if (i11 < objArr.length / 2) {
            objArr = Arrays.copyOf(objArr, i11);
        }
        return new RegularImmutableSortedSet(ImmutableList.l(objArr, i11), comparator);
    }

    @IgnoreJRERequirement
    @DoNotCall("Use toImmutableSortedSet")
    @Deprecated
    public static <E> Collector<E, ?, ImmutableSet<E>> toImmutableSet() {
        throw new UnsupportedOperationException();
    }

    @IgnoreJRERequirement
    public static <E> Collector<E, ?, ImmutableSortedSet<E>> toImmutableSortedSet(Comparator<? super E> comparator) {
        return CollectCollectors.W(comparator);
    }

    static RegularImmutableSortedSet u(Comparator comparator) {
        return Ordering.natural().equals(comparator) ? RegularImmutableSortedSet.f30177g : new RegularImmutableSortedSet(ImmutableList.of(), comparator);
    }

    abstract ImmutableSortedSet A(Object obj, boolean z10);

    int B(Object obj, Object obj2) {
        return C(this.f29699d, obj, obj2);
    }

    public E ceiling(E e10) {
        return (E) Iterables.getFirst(tailSet((Object) e10, true), null);
    }

    @Override // java.util.SortedSet, com.google.common.collect.SortedIterable
    public Comparator<? super E> comparator() {
        return this.f29699d;
    }

    @Override // java.util.NavigableSet
    @GwtIncompatible
    public abstract UnmodifiableIterator<E> descendingIterator();

    public E first() {
        return iterator().next();
    }

    public E floor(E e10) {
        return (E) Iterators.getNext(headSet((Object) e10, true).descendingIterator(), null);
    }

    @GwtIncompatible
    public E higher(E e10) {
        return (E) Iterables.getFirst(tailSet((Object) e10, false), null);
    }

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public abstract UnmodifiableIterator<E> iterator();

    public E last() {
        return descendingIterator().next();
    }

    @GwtIncompatible
    public E lower(E e10) {
        return (E) Iterators.getNext(headSet((Object) e10, false).descendingIterator(), null);
    }

    @Override // java.util.NavigableSet
    @GwtIncompatible
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @GwtIncompatible
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    @CanIgnoreReturnValue
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    abstract ImmutableSortedSet t();

    abstract ImmutableSortedSet v(Object obj, boolean z10);

    @Override // com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    Object writeReplace() {
        return new SerializedForm(this.f29699d, toArray());
    }

    abstract ImmutableSortedSet x(Object obj, boolean z10, Object obj2, boolean z11);

    public static final class Builder<E> extends ImmutableSet.Builder<E> {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final Comparator f29701f;

        public Builder(Comparator<? super E> comparator) {
            this.f29701f = (Comparator) Preconditions.checkNotNull(comparator);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.ImmutableSet.Builder
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public Builder e(ImmutableSet.Builder builder) {
            super.e(builder);
            return this;
        }

        Builder(Comparator comparator, int i10) {
            super(i10, false);
            this.f29701f = (Comparator) Preconditions.checkNotNull(comparator);
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.Builder
        public ImmutableSortedSet<E> build() {
            ImmutableSortedSet<E> immutableSortedSetS = ImmutableSortedSet.s(this.f29701f, this.f29552b, this.f29551a);
            this.f29552b = immutableSortedSetS.size();
            this.f29553c = true;
            return immutableSortedSetS;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            super.addAll((Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E e10) {
            super.add((Object) e10);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterator<? extends E> it) {
            super.addAll((Iterator) it);
            return this;
        }

        @Override // com.google.common.collect.ImmutableSet.Builder, com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
            super.add((Object[]) eArr);
            return this;
        }
    }

    public static <E> ImmutableSortedSet<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf(Ordering.natural(), iterable);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet of(Comparable comparable) {
        return new RegularImmutableSortedSet(ImmutableList.of(comparable), Ordering.natural());
    }

    @Override // java.util.NavigableSet
    @GwtIncompatible
    public ImmutableSortedSet<E> descendingSet() {
        ImmutableSortedSet<E> immutableSortedSet = this.f29700e;
        if (immutableSortedSet != null) {
            return immutableSortedSet;
        }
        ImmutableSortedSet<E> immutableSortedSetT = t();
        this.f29700e = immutableSortedSetT;
        immutableSortedSetT.f29700e = this;
        return immutableSortedSetT;
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet of(Comparable comparable, Comparable comparable2) {
        return s(Ordering.natural(), 2, comparable, comparable2);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public ImmutableSortedSet<E> headSet(E e10) {
        return headSet((Object) e10, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public ImmutableSortedSet<E> subSet(E e10, E e11) {
        return subSet((Object) e10, true, (Object) e11, false);
    }

    @Override // java.util.NavigableSet, java.util.SortedSet
    public ImmutableSortedSet<E> tailSet(E e10) {
        return tailSet((Object) e10, true);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Collection<? extends E> collection) {
        return copyOf((Comparator) Ordering.natural(), (Collection) collection);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet of(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return s(Ordering.natural(), 3, comparable, comparable2, comparable3);
    }

    @Override // java.util.NavigableSet
    public ImmutableSortedSet<E> headSet(E e10, boolean z10) {
        return v(Preconditions.checkNotNull(e10), z10);
    }

    @Override // java.util.NavigableSet
    @GwtIncompatible
    public ImmutableSortedSet<E> subSet(E e10, boolean z10, E e11, boolean z11) {
        Preconditions.checkNotNull(e10);
        Preconditions.checkNotNull(e11);
        Preconditions.checkArgument(this.f29699d.compare(e10, e11) <= 0);
        return x(e10, z10, e11, z11);
    }

    @Override // java.util.NavigableSet
    public ImmutableSortedSet<E> tailSet(E e10, boolean z10) {
        return A(Preconditions.checkNotNull(e10), z10);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4) {
        return s(Ordering.natural(), 4, comparable, comparable2, comparable3, comparable4);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Iterator<? extends E> it) {
        return copyOf(Ordering.natural(), it);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5) {
        return s(Ordering.natural(), 5, comparable, comparable2, comparable3, comparable4, comparable5);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lcom/google/common/collect/ImmutableSortedSet<TE;>; */
    public static ImmutableSortedSet of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5, Comparable comparable6, Comparable... comparableArr) {
        int length = comparableArr.length + 6;
        Comparable[] comparableArr2 = new Comparable[length];
        comparableArr2[0] = comparable;
        comparableArr2[1] = comparable2;
        comparableArr2[2] = comparable3;
        comparableArr2[3] = comparable4;
        comparableArr2[4] = comparable5;
        comparableArr2[5] = comparable6;
        System.arraycopy(comparableArr, 0, comparableArr2, 6, comparableArr.length);
        return s(Ordering.natural(), length, comparableArr2);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator, Iterator<? extends E> it) {
        return new Builder(comparator).addAll((Iterator) it).build();
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(comparator);
        if (SortedIterables.hasSameComparator(comparator, iterable) && (iterable instanceof ImmutableSortedSet)) {
            ImmutableSortedSet<E> immutableSortedSet = (ImmutableSortedSet) iterable;
            if (!immutableSortedSet.isPartialView()) {
                return immutableSortedSet;
            }
        }
        Object[] objArrF = Iterables.f(iterable);
        return s(comparator, objArrF.length, objArrF);
    }

    public static <E> ImmutableSortedSet<E> copyOf(Comparator<? super E> comparator, Collection<? extends E> collection) {
        return copyOf((Comparator) comparator, (Iterable) collection);
    }

    @DoNotCall("Pass a parameter of type Comparable")
    @Deprecated
    public static <E> ImmutableSortedSet<E> of(E e10) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass parameters of type Comparable")
    @Deprecated
    public static <Z> ImmutableSortedSet<Z> copyOf(Z[] zArr) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass parameters of type Comparable")
    @Deprecated
    public static <E> ImmutableSortedSet<E> of(E e10, E e11) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass parameters of type Comparable")
    @Deprecated
    public static <E> ImmutableSortedSet<E> of(E e10, E e11, E e12) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass parameters of type Comparable")
    @Deprecated
    public static <E> ImmutableSortedSet<E> of(E e10, E e11, E e12, E e13) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass parameters of type Comparable")
    @Deprecated
    public static <E> ImmutableSortedSet<E> of(E e10, E e11, E e12, E e13, E e14) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Pass parameters of type Comparable")
    @Deprecated
    public static <E> ImmutableSortedSet<E> of(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        throw new UnsupportedOperationException();
    }
}
