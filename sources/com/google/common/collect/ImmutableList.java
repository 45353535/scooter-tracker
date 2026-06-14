package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.InlineMe;
import j$.util.List;
import j$.util.stream.Collector;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public abstract class ImmutableList<E> extends ImmutableCollection<E> implements List<E>, RandomAccess, j$.util.List {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final UnmodifiableListIterator f29561c = new Itr(RegularImmutableList.f30140f, 0);

    public static final class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {
        public Builder() {
            this(4);
        }

        ImmutableList d(Comparator comparator) {
            this.f29553c = true;
            Arrays.sort(this.f29551a, 0, this.f29552b, comparator);
            return ImmutableList.l(this.f29551a, this.f29552b);
        }

        Builder e(Builder builder) {
            b(builder.f29551a, builder.f29552b);
            return this;
        }

        Builder(int i10) {
            super(i10);
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public ImmutableList<E> build() {
            this.f29553c = true;
            return ImmutableList.l(this.f29551a, this.f29552b);
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            super.addAll((Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E e10) {
            super.add((Object) e10);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterator<? extends E> it) {
            super.addAll((Iterator) it);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
            super.add((Object[]) eArr);
            return this;
        }
    }

    static class Itr<E> extends AbstractIndexedListIterator<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final ImmutableList f29562d;

        Itr(ImmutableList immutableList, int i10) {
            super(immutableList.size(), i10);
            this.f29562d = immutableList;
        }

        @Override // com.google.common.collect.AbstractIndexedListIterator
        protected Object get(int i10) {
            return this.f29562d.get(i10);
        }
    }

    private static class ReverseImmutableList<E> extends ImmutableList<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final transient ImmutableList f29563d;

        ReverseImmutableList(ImmutableList immutableList) {
            this.f29563d = immutableList;
        }

        private int o(int i10) {
            return (size() - 1) - i10;
        }

        private int q(int i10) {
            return size() - i10;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return this.f29563d.contains(obj);
        }

        @Override // java.util.List
        public E get(int i10) {
            Preconditions.checkElementIndex(i10, size());
            return this.f29563d.get(o(i10));
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int indexOf(Object obj) {
            int iLastIndexOf = this.f29563d.lastIndexOf(obj);
            if (iLastIndexOf >= 0) {
                return o(iLastIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return this.f29563d.isPartialView();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public int lastIndexOf(Object obj) {
            int iIndexOf = this.f29563d.indexOf(obj);
            if (iIndexOf >= 0) {
                return o(iIndexOf);
            }
            return -1;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // com.google.common.collect.ImmutableList
        public ImmutableList<E> reverse() {
            return this.f29563d;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f29563d.size();
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<E> subList(int i10, int i11) {
            Preconditions.checkPositionIndexes(i10, i11, size());
            return this.f29563d.subList(q(i11), q(i10)).reverse();
        }
    }

    @J2ktIncompatible
    static class SerializedForm implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object[] f29564b;

        SerializedForm(Object[] objArr) {
            this.f29564b = objArr;
        }

        Object readResolve() {
            return ImmutableList.copyOf(this.f29564b);
        }
    }

    class SubList extends ImmutableList<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final transient int f29565d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final transient int f29566e;

        SubList(int i10, int i11) {
            this.f29565d = i10;
            this.f29566e = i11;
        }

        @Override // com.google.common.collect.ImmutableCollection
        Object[] g() {
            return ImmutableList.this.g();
        }

        @Override // java.util.List
        public E get(int i10) {
            Preconditions.checkElementIndex(i10, this.f29566e);
            return ImmutableList.this.get(i10 + this.f29565d);
        }

        @Override // com.google.common.collect.ImmutableCollection
        int i() {
            return ImmutableList.this.j() + this.f29565d + this.f29566e;
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return true;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
        public /* bridge */ /* synthetic */ Iterator iterator() {
            return super.iterator();
        }

        @Override // com.google.common.collect.ImmutableCollection
        int j() {
            return ImmutableList.this.j() + this.f29565d;
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator() {
            return super.listIterator();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
        public int size() {
            return this.f29566e;
        }

        @Override // com.google.common.collect.ImmutableList, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        Object writeReplace() {
            return super.writeReplace();
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public /* bridge */ /* synthetic */ ListIterator listIterator(int i10) {
            return super.listIterator(i10);
        }

        @Override // com.google.common.collect.ImmutableList, java.util.List
        public ImmutableList<E> subList(int i10, int i11) {
            Preconditions.checkPositionIndexes(i10, i11, this.f29566e);
            ImmutableList immutableList = ImmutableList.this;
            int i12 = this.f29565d;
            return immutableList.subList(i10 + i12, i11 + i12);
        }
    }

    ImmutableList() {
    }

    public static <E> Builder<E> builder() {
        return new Builder<>();
    }

    public static <E> Builder<E> builderWithExpectedSize(int i10) {
        CollectPreconditions.b(i10, "expectedSize");
        return new Builder<>(i10);
    }

    public static <E> ImmutableList<E> copyOf(Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(iterable);
        return iterable instanceof Collection ? copyOf((Collection) iterable) : copyOf(iterable.iterator());
    }

    static ImmutableList k(Object[] objArr) {
        return l(objArr, objArr.length);
    }

    static ImmutableList l(Object[] objArr, int i10) {
        return i10 == 0 ? of() : new RegularImmutableList(objArr, i10);
    }

    private static ImmutableList m(Object... objArr) {
        return k(ObjectArrays.b(objArr));
    }

    public static <E> ImmutableList<E> of() {
        return RegularImmutableList.f30140f;
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<? super E>> ImmutableList<E> sortedCopyOf(Iterable<? extends E> iterable) {
        Comparable[] comparableArr = (Comparable[]) Iterables.g(iterable, new Comparable[0]);
        ObjectArrays.b(comparableArr);
        Arrays.sort(comparableArr);
        return k(comparableArr);
    }

    @IgnoreJRERequirement
    public static <E> Collector<E, ?, ImmutableList<E>> toImmutableList() {
        return CollectCollectors.L();
    }

    @Override // com.google.common.collect.ImmutableCollection
    int a(Object[] objArr, int i10) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    @Override // java.util.List
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void add(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(int i10, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    @InlineMe(replacement = "this")
    @Deprecated
    public final ImmutableList<E> asList() {
        return this;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return Lists.c(this, obj);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~((i10 * 31) + get(i11).hashCode()));
        }
        return i10;
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return Lists.d(this, obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        return Lists.f(this, obj);
    }

    ImmutableList n(int i10, int i11) {
        return new SubList(i10, i11 - i10);
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final E remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    public ImmutableList<E> reverse() {
        return size() <= 1 ? this : new ReverseImmutableList(this);
    }

    @Override // java.util.List
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final E set(int i10, E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    @GwtIncompatible
    Object writeReplace() {
        return new SerializedForm(toArray());
    }

    public static <E> ImmutableList<E> of(E e10) {
        return m(e10);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
        return listIterator();
    }

    @Override // java.util.List
    public ImmutableList<E> subList(int i10, int i11) {
        Preconditions.checkPositionIndexes(i10, i11, size());
        int i12 = i11 - i10;
        return i12 == size() ? this : i12 == 0 ? of() : n(i10, i11);
    }

    public static <E> ImmutableList<E> of(E e10, E e11) {
        return m(e10, e11);
    }

    @Override // java.util.List
    public UnmodifiableListIterator<E> listIterator() {
        return listIterator(0);
    }

    public static <E> ImmutableList<E> of(E e10, E e11, E e12) {
        return m(e10, e11, e12);
    }

    @Override // java.util.List
    public UnmodifiableListIterator<E> listIterator(int i10) {
        Preconditions.checkPositionIndex(i10, size());
        if (isEmpty()) {
            return f29561c;
        }
        return new Itr(this, i10);
    }

    public static <E> ImmutableList<E> copyOf(Collection<? extends E> collection) {
        if (collection instanceof ImmutableCollection) {
            ImmutableList<E> immutableListAsList = ((ImmutableCollection) collection).asList();
            return immutableListAsList.isPartialView() ? k(immutableListAsList.toArray()) : immutableListAsList;
        }
        return m(collection.toArray());
    }

    public static <E> ImmutableList<E> of(E e10, E e11, E e12, E e13) {
        return m(e10, e11, e12, e13);
    }

    public static <E> ImmutableList<E> sortedCopyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        Preconditions.checkNotNull(comparator);
        Object[] objArrF = Iterables.f(iterable);
        ObjectArrays.b(objArrF);
        Arrays.sort(objArrF, comparator);
        return k(objArrF);
    }

    public static <E> ImmutableList<E> of(E e10, E e11, E e12, E e13, E e14) {
        return m(e10, e11, e12, e13, e14);
    }

    public static <E> ImmutableList<E> of(E e10, E e11, E e12, E e13, E e14, E e15) {
        return m(e10, e11, e12, e13, e14, e15);
    }

    public static <E> ImmutableList<E> of(E e10, E e11, E e12, E e13, E e14, E e15, E e16) {
        return m(e10, e11, e12, e13, e14, e15, e16);
    }

    public static <E> ImmutableList<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return of((Object) next);
        }
        return new Builder().add((Object) next).addAll((Iterator) it).build();
    }

    public static <E> ImmutableList<E> of(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17) {
        return m(e10, e11, e12, e13, e14, e15, e16, e17);
    }

    public static <E> ImmutableList<E> of(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18) {
        return m(e10, e11, e12, e13, e14, e15, e16, e17, e18);
    }

    public static <E> ImmutableList<E> of(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19) {
        return m(e10, e11, e12, e13, e14, e15, e16, e17, e18, e19);
    }

    public static <E> ImmutableList<E> of(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19, E e20) {
        return m(e10, e11, e12, e13, e14, e15, e16, e17, e18, e19, e20);
    }

    @SafeVarargs
    public static <E> ImmutableList<E> of(E e10, E e11, E e12, E e13, E e14, E e15, E e16, E e17, E e18, E e19, E e20, E e21, E... eArr) {
        Preconditions.checkArgument(eArr.length <= 2147483635, "the total number of elements must fit in an int");
        Object[] objArr = new Object[eArr.length + 12];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        objArr[6] = e16;
        objArr[7] = e17;
        objArr[8] = e18;
        objArr[9] = e19;
        objArr[10] = e20;
        objArr[11] = e21;
        System.arraycopy(eArr, 0, objArr, 12, eArr.length);
        return m(objArr);
    }

    public static <E> ImmutableList<E> copyOf(E[] eArr) {
        if (eArr.length == 0) {
            return of();
        }
        return m((Object[]) eArr.clone());
    }
}
