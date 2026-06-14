package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.Multiset;
import com.google.common.math.IntMath;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import j$.util.Collection;
import j$.util.function.BiConsumer$CC;
import j$.util.function.BiFunction$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;

/* JADX INFO: loaded from: classes9.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
public abstract class ImmutableSortedMultiset<E> extends ImmutableMultiset<E> implements SortedMultiset<E>, Collection {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    transient ImmutableSortedMultiset f29690e;

    public static class Builder<E> extends ImmutableMultiset.Builder<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final Comparator f29691d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object[] f29692e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int[] f29693f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f29694g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f29695h;

        public Builder(Comparator<? super E> comparator) {
            super(true);
            this.f29691d = (Comparator) Preconditions.checkNotNull(comparator);
            this.f29692e = new Object[4];
            this.f29693f = new int[4];
        }

        private void c(boolean z10) {
            int i10 = this.f29694g;
            if (i10 == 0) {
                return;
            }
            Object[] objArrCopyOf = Arrays.copyOf(this.f29692e, i10);
            Arrays.sort(objArrCopyOf, this.f29691d);
            int i11 = 1;
            for (int i12 = 1; i12 < objArrCopyOf.length; i12++) {
                if (this.f29691d.compare(objArrCopyOf[i11 - 1], objArrCopyOf[i12]) < 0) {
                    objArrCopyOf[i11] = objArrCopyOf[i12];
                    i11++;
                }
            }
            Arrays.fill(objArrCopyOf, i11, this.f29694g, (Object) null);
            if (z10) {
                int i13 = i11 * 4;
                int i14 = this.f29694g;
                if (i13 > i14 * 3) {
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, IntMath.saturatedAdd(i14, (i14 / 2) + 1));
                }
            }
            int[] iArr = new int[objArrCopyOf.length];
            for (int i15 = 0; i15 < this.f29694g; i15++) {
                int iBinarySearch = Arrays.binarySearch(objArrCopyOf, 0, i11, this.f29692e[i15], this.f29691d);
                int i16 = this.f29693f[i15];
                if (i16 >= 0) {
                    iArr[iBinarySearch] = iArr[iBinarySearch] + i16;
                } else {
                    iArr[iBinarySearch] = ~i16;
                }
            }
            this.f29692e = objArrCopyOf;
            this.f29693f = iArr;
            this.f29694g = i11;
        }

        private void d() {
            c(false);
            int i10 = 0;
            int i11 = 0;
            while (true) {
                int i12 = this.f29694g;
                if (i10 >= i12) {
                    Arrays.fill(this.f29692e, i11, i12, (Object) null);
                    Arrays.fill(this.f29693f, i11, this.f29694g, 0);
                    this.f29694g = i11;
                    return;
                }
                int[] iArr = this.f29693f;
                int i13 = iArr[i10];
                if (i13 > 0) {
                    Object[] objArr = this.f29692e;
                    objArr[i11] = objArr[i10];
                    iArr[i11] = i13;
                    i11++;
                }
                i10++;
            }
        }

        private void e() {
            int i10 = this.f29694g;
            Object[] objArr = this.f29692e;
            if (i10 == objArr.length) {
                c(true);
            } else if (this.f29695h) {
                this.f29692e = Arrays.copyOf(objArr, objArr.length);
            }
            this.f29695h = false;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder
        @CanIgnoreReturnValue
        public Builder<E> addCopies(E e10, int i10) {
            Preconditions.checkNotNull(e10);
            CollectPreconditions.b(i10, "occurrences");
            if (i10 == 0) {
                return this;
            }
            e();
            Object[] objArr = this.f29692e;
            int i11 = this.f29694g;
            objArr[i11] = e10;
            this.f29693f[i11] = i10;
            this.f29694g = i11 + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder
        @CanIgnoreReturnValue
        public Builder<E> setCount(E e10, int i10) {
            Preconditions.checkNotNull(e10);
            CollectPreconditions.b(i10, "count");
            e();
            Object[] objArr = this.f29692e;
            int i11 = this.f29694g;
            objArr[i11] = e10;
            this.f29693f[i11] = ~i10;
            this.f29694g = i11 + 1;
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        public ImmutableSortedMultiset<E> build() {
            d();
            int i10 = this.f29694g;
            if (i10 == 0) {
                return ImmutableSortedMultiset.x(this.f29691d);
            }
            RegularImmutableSortedSet regularImmutableSortedSet = (RegularImmutableSortedSet) ImmutableSortedSet.s(this.f29691d, i10, this.f29692e);
            long[] jArr = new long[this.f29694g + 1];
            int i11 = 0;
            while (i11 < this.f29694g) {
                int i12 = i11 + 1;
                jArr[i12] = jArr[i11] + ((long) this.f29693f[i11]);
                i11 = i12;
            }
            this.f29695h = true;
            return new RegularImmutableSortedMultiset(regularImmutableSortedSet, jArr, 0, this.f29694g);
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E e10) {
            return addCopies((Object) e10, 1);
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            if (iterable instanceof Multiset) {
                for (Multiset.Entry<E> entry : ((Multiset) iterable).entrySet()) {
                    addCopies((Object) entry.getElement(), entry.getCount());
                }
            } else {
                Iterator<? extends E> it = iterable.iterator();
                while (it.hasNext()) {
                    add((Object) it.next());
                }
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
            for (E e10 : eArr) {
                add((Object) e10);
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableMultiset.Builder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterator<? extends E> it) {
            while (it.hasNext()) {
                add((Object) it.next());
            }
            return this;
        }
    }

    @J2ktIncompatible
    private static final class SerializedForm<E> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Comparator f29696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final Object[] f29697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int[] f29698d;

        SerializedForm(SortedMultiset sortedMultiset) {
            this.f29696b = sortedMultiset.comparator();
            int size = sortedMultiset.entrySet().size();
            this.f29697c = new Object[size];
            this.f29698d = new int[size];
            int i10 = 0;
            for (Multiset.Entry<E> entry : sortedMultiset.entrySet()) {
                this.f29697c[i10] = entry.getElement();
                this.f29698d[i10] = entry.getCount();
                i10++;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        Object readResolve() {
            int length = this.f29697c.length;
            Builder builder = new Builder(this.f29696b);
            for (int i10 = 0; i10 < length; i10++) {
                builder.addCopies(this.f29697c[i10], this.f29698d[i10]);
            }
            return builder.build();
        }
    }

    ImmutableSortedMultiset() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static void A(Object obj, Multiset multiset, Function function, ToIntFunction toIntFunction) {
        multiset.add(Preconditions.checkNotNull(function.apply(obj)), toIntFunction.applyAsInt(obj));
    }

    @DoNotCall("Use naturalOrder.")
    @Deprecated
    public static <E> Builder<E> builder() {
        throw new UnsupportedOperationException();
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>([TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset copyOf(Comparable[] comparableArr) {
        return copyOf(Ordering.natural(), Arrays.asList(comparableArr));
    }

    public static <E> ImmutableSortedMultiset<E> copyOfSorted(SortedMultiset<E> sortedMultiset) {
        return v(sortedMultiset.comparator(), Lists.newArrayList(sortedMultiset.entrySet()));
    }

    public static <E extends Comparable<?>> Builder<E> naturalOrder() {
        return new Builder<>(Ordering.natural());
    }

    public static <E> ImmutableSortedMultiset<E> of() {
        return RegularImmutableSortedMultiset.f30172k;
    }

    public static <E> Builder<E> orderedBy(Comparator<E> comparator) {
        return new Builder<>(comparator);
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    public static <E extends Comparable<?>> Builder<E> reverseOrder() {
        return new Builder<>(Ordering.natural().reverse());
    }

    public static /* synthetic */ int s(Object obj) {
        return 1;
    }

    @IgnoreJRERequirement
    @DoNotCall("Use toImmutableSortedMultiset.")
    @Deprecated
    public static <E> Collector<E, ?, ImmutableMultiset<E>> toImmutableMultiset() {
        throw new UnsupportedOperationException();
    }

    @IgnoreJRERequirement
    public static <E> Collector<E, ?, ImmutableSortedMultiset<E>> toImmutableSortedMultiset(Comparator<? super E> comparator) {
        return toImmutableSortedMultiset(comparator, Function$CC.identity(), new ToIntFunction() { // from class: com.google.common.collect.o2
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ImmutableSortedMultiset.s(obj);
            }
        });
    }

    public static /* synthetic */ Multiset u(Multiset multiset, Multiset multiset2) {
        multiset.addAll(multiset2);
        return multiset;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static ImmutableSortedMultiset v(Comparator comparator, java.util.Collection collection) {
        if (collection.isEmpty()) {
            return x(comparator);
        }
        ImmutableList.Builder builder = new ImmutableList.Builder(collection.size());
        long[] jArr = new long[collection.size() + 1];
        Iterator<E> it = collection.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            Multiset.Entry entry = (Multiset.Entry) it.next();
            builder.add(entry.getElement());
            int i11 = i10 + 1;
            jArr[i11] = jArr[i10] + ((long) entry.getCount());
            i10 = i11;
        }
        return new RegularImmutableSortedMultiset(new RegularImmutableSortedSet(builder.build(), comparator), jArr, 0, collection.size());
    }

    static ImmutableSortedMultiset x(Comparator comparator) {
        return Ordering.natural().equals(comparator) ? RegularImmutableSortedMultiset.f30172k : new RegularImmutableSortedMultiset(comparator);
    }

    @Override // com.google.common.collect.SortedMultiset, com.google.common.collect.SortedIterable
    public final Comparator<? super E> comparator() {
        return elementSet().comparator();
    }

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.Multiset
    public abstract ImmutableSortedSet<E> elementSet();

    public abstract ImmutableSortedMultiset<E> headMultiset(E e10, BoundType boundType);

    @Override // com.google.common.collect.SortedMultiset
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final Multiset.Entry<E> pollFirstEntry() {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.SortedMultiset
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final Multiset.Entry<E> pollLastEntry() {
        throw new UnsupportedOperationException();
    }

    public abstract ImmutableSortedMultiset<E> tailMultiset(E e10, BoundType boundType);

    @Override // com.google.common.collect.ImmutableMultiset, com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    Object writeReplace() {
        return new SerializedForm(this);
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Iterable<? extends E> iterable) {
        return copyOf(Ordering.natural(), iterable);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable comparable) {
        return new RegularImmutableSortedMultiset((RegularImmutableSortedSet) ImmutableSortedSet.of(comparable), new long[]{0, 1}, 0, 1);
    }

    @IgnoreJRERequirement
    @DoNotCall("Use toImmutableSortedMultiset.")
    @Deprecated
    public static <T, E> Collector<T, ?, ImmutableMultiset<E>> toImmutableMultiset(Function<? super T, ? extends E> function, ToIntFunction<? super T> toIntFunction) {
        throw new UnsupportedOperationException();
    }

    @IgnoreJRERequirement
    public static <T, E> Collector<T, ?, ImmutableSortedMultiset<E>> toImmutableSortedMultiset(final Comparator<? super E> comparator, final Function<? super T, ? extends E> function, final ToIntFunction<? super T> toIntFunction) {
        Preconditions.checkNotNull(comparator);
        Preconditions.checkNotNull(function);
        Preconditions.checkNotNull(toIntFunction);
        return Collector.CC.of(new Supplier() { // from class: com.google.common.collect.k2
            @Override // java.util.function.Supplier
            public final Object get() {
                return TreeMultiset.create(comparator);
            }
        }, new BiConsumer() { // from class: com.google.common.collect.l2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ImmutableSortedMultiset.A(obj2, (Multiset) obj, function, toIntFunction);
            }

            public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
                return BiConsumer$CC.$default$andThen(this, biConsumer);
            }
        }, new BinaryOperator() { // from class: com.google.common.collect.m2
            public /* synthetic */ BiFunction andThen(Function function2) {
                return BiFunction$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return ImmutableSortedMultiset.u((Multiset) obj, (Multiset) obj2);
            }
        }, new Function() { // from class: com.google.common.collect.n2
            @Override // java.util.function.Function
            /* JADX INFO: renamed from: andThen */
            public /* synthetic */ Function mo7820andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ImmutableSortedMultiset.v(comparator, ((Multiset) obj).entrySet());
            }

            public /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        }, new Collector.Characteristics[0]);
    }

    @Override // com.google.common.collect.SortedMultiset
    public ImmutableSortedMultiset<E> descendingMultiset() {
        ImmutableSortedMultiset<E> immutableSortedMultisetX = this.f29690e;
        if (immutableSortedMultisetX == null) {
            immutableSortedMultisetX = isEmpty() ? x(Ordering.from(comparator()).reverse()) : new DescendingImmutableSortedMultiset<>(this);
            this.f29690e = immutableSortedMultisetX;
        }
        return immutableSortedMultisetX;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.common.collect.SortedMultiset
    public ImmutableSortedMultiset<E> subMultiset(E e10, BoundType boundType, E e11, BoundType boundType2) {
        Preconditions.checkArgument(comparator().compare(e10, e11) <= 0, "Expected lowerBound <= upperBound but %s > %s", e10, e11);
        return tailMultiset((Object) e10, boundType).headMultiset((Object) e11, boundType2);
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Iterator<? extends E> it) {
        return copyOf(Ordering.natural(), it);
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable comparable, Comparable comparable2) {
        return copyOf(Ordering.natural(), Arrays.asList(comparable, comparable2));
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Comparator<? super E> comparator, Iterator<? extends E> it) {
        Preconditions.checkNotNull(comparator);
        return new Builder(comparator).addAll((Iterator) it).build();
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable comparable, Comparable comparable2, Comparable comparable3) {
        return copyOf(Ordering.natural(), Arrays.asList(comparable, comparable2, comparable3));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4) {
        return copyOf(Ordering.natural(), Arrays.asList(comparable, comparable2, comparable3, comparable4));
    }

    public static <E> ImmutableSortedMultiset<E> copyOf(Comparator<? super E> comparator, Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableSortedMultiset) {
            ImmutableSortedMultiset<E> immutableSortedMultiset = (ImmutableSortedMultiset) iterable;
            if (comparator.equals(immutableSortedMultiset.comparator())) {
                return immutableSortedMultiset.isPartialView() ? v(comparator, immutableSortedMultiset.entrySet().asList()) : immutableSortedMultiset;
            }
        }
        return new Builder(comparator).addAll((Iterable) iterable).build();
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5) {
        return copyOf(Ordering.natural(), Arrays.asList(comparable, comparable2, comparable3, comparable4, comparable5));
    }

    /* JADX WARN: Incorrect types in method signature: <E::Ljava/lang/Comparable<-TE;>;>(TE;TE;TE;TE;TE;TE;[TE;)Lcom/google/common/collect/ImmutableSortedMultiset<TE;>; */
    public static ImmutableSortedMultiset of(Comparable comparable, Comparable comparable2, Comparable comparable3, Comparable comparable4, Comparable comparable5, Comparable comparable6, Comparable... comparableArr) {
        ArrayList arrayListNewArrayListWithCapacity = Lists.newArrayListWithCapacity(comparableArr.length + 6);
        Collections.addAll(arrayListNewArrayListWithCapacity, comparable, comparable2, comparable3, comparable4, comparable5, comparable6);
        Collections.addAll(arrayListNewArrayListWithCapacity, comparableArr);
        return copyOf(Ordering.natural(), arrayListNewArrayListWithCapacity);
    }

    @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static <Z> ImmutableSortedMultiset<Z> copyOf(Z[] zArr) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static <E> ImmutableSortedMultiset<E> of(E e10) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static <E> ImmutableSortedMultiset<E> of(E e10, E e11) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static <E> ImmutableSortedMultiset<E> of(E e10, E e11, E e12) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static <E> ImmutableSortedMultiset<E> of(E e10, E e11, E e12, E e13) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static <E> ImmutableSortedMultiset<E> of(E e10, E e11, E e12, E e13, E e14) {
        throw new UnsupportedOperationException();
    }

    @DoNotCall("Elements must be Comparable. (Or, pass a Comparator to orderedBy or copyOf.)")
    @Deprecated
    public static <E> ImmutableSortedMultiset<E> of(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        throw new UnsupportedOperationException();
    }
}
