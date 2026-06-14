package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.Objects;
import j$.util.stream.Collector;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.SortedSet;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public abstract class ImmutableSet<E> extends ImmutableCollection<E> implements Set<E>, j$.util.Set {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient ImmutableList f29670c;

    public static class Builder<E> extends ImmutableCollection.ArrayBasedBuilder<E> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object[] f29671d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int f29672e;

        public Builder() {
            super(4);
        }

        private void d(Object obj) {
            Objects.requireNonNull(this.f29671d);
            int length = this.f29671d.length - 1;
            int iHashCode = obj.hashCode();
            int iC = Hashing.c(iHashCode);
            while (true) {
                int i10 = iC & length;
                Object[] objArr = this.f29671d;
                Object obj2 = objArr[i10];
                if (obj2 == null) {
                    objArr[i10] = obj;
                    this.f29672e += iHashCode;
                    super.add(obj);
                    return;
                } else if (obj2.equals(obj)) {
                    return;
                } else {
                    iC = i10 + 1;
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        Builder e(Builder builder) {
            if (this.f29671d == null) {
                b(builder.f29551a, builder.f29552b);
                return this;
            }
            for (int i10 = 0; i10 < builder.f29552b; i10++) {
                Object obj = builder.f29551a[i10];
                Objects.requireNonNull(obj);
                add(obj);
            }
            return this;
        }

        Builder(int i10, boolean z10) {
            super(i10);
            if (z10) {
                this.f29671d = new Object[ImmutableSet.m(i10)];
            }
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public ImmutableSet<E> build() {
            ImmutableSet<E> immutableSetN;
            int i10 = this.f29552b;
            if (i10 == 0) {
                return ImmutableSet.of();
            }
            if (i10 == 1) {
                Object obj = this.f29551a[0];
                Objects.requireNonNull(obj);
                return ImmutableSet.of(obj);
            }
            if (this.f29671d == null || ImmutableSet.m(i10) != this.f29671d.length) {
                immutableSetN = ImmutableSet.n(this.f29552b, this.f29551a);
                this.f29552b = immutableSetN.size();
            } else {
                Object[] objArrCopyOf = ImmutableSet.r(this.f29552b, this.f29551a.length) ? Arrays.copyOf(this.f29551a, this.f29552b) : this.f29551a;
                immutableSetN = new RegularImmutableSet<>(objArrCopyOf, this.f29672e, this.f29671d, r5.length - 1, this.f29552b);
            }
            this.f29553c = true;
            this.f29671d = null;
            return immutableSetN;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            Preconditions.checkNotNull(iterable);
            if (this.f29671d != null) {
                Iterator<? extends E> it = iterable.iterator();
                while (it.hasNext()) {
                    add((Object) it.next());
                }
                return this;
            }
            super.addAll((Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E e10) {
            Preconditions.checkNotNull(e10);
            if (this.f29671d != null && ImmutableSet.m(this.f29552b) <= this.f29671d.length) {
                d(e10);
                return this;
            }
            this.f29671d = null;
            super.add((Object) e10);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterator<? extends E> it) {
            Preconditions.checkNotNull(it);
            while (it.hasNext()) {
                add((Object) it.next());
            }
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.ArrayBasedBuilder, com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
            if (this.f29671d != null) {
                for (E e10 : eArr) {
                    add((Object) e10);
                }
                return this;
            }
            super.add((Object[]) eArr);
            return this;
        }
    }

    @J2ktIncompatible
    private static class SerializedForm implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final Object[] f29673b;

        SerializedForm(Object[] objArr) {
            this.f29673b = objArr;
        }

        Object readResolve() {
            return ImmutableSet.copyOf(this.f29673b);
        }
    }

    ImmutableSet() {
    }

    public static <E> Builder<E> builder() {
        return new Builder<>();
    }

    public static <E> Builder<E> builderWithExpectedSize(int i10) {
        CollectPreconditions.b(i10, "expectedSize");
        return new Builder<>(i10, true);
    }

    public static <E> ImmutableSet<E> copyOf(Collection<? extends E> collection) {
        if ((collection instanceof ImmutableSet) && !(collection instanceof SortedSet)) {
            ImmutableSet<E> immutableSet = (ImmutableSet) collection;
            if (!immutableSet.isPartialView()) {
                return immutableSet;
            }
        }
        Object[] array = collection.toArray();
        return n(array.length, array);
    }

    static int m(int i10) {
        int iMax = Math.max(i10, 2);
        if (iMax >= 751619276) {
            Preconditions.checkArgument(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (((double) iHighestOneBit) * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static ImmutableSet n(int i10, Object... objArr) {
        if (i10 == 0) {
            return of();
        }
        if (i10 == 1) {
            Object obj = objArr[0];
            Objects.requireNonNull(obj);
            return of(obj);
        }
        int iM = m(i10);
        Object[] objArr2 = new Object[iM];
        int i11 = iM - 1;
        int i12 = 0;
        int i13 = 0;
        for (int i14 = 0; i14 < i10; i14++) {
            Object objA = ObjectArrays.a(objArr[i14], i14);
            int iHashCode = objA.hashCode();
            int iC = Hashing.c(iHashCode);
            while (true) {
                int i15 = iC & i11;
                Object obj2 = objArr2[i15];
                if (obj2 == null) {
                    objArr[i13] = objA;
                    objArr2[i15] = objA;
                    i12 += iHashCode;
                    i13++;
                    break;
                }
                if (obj2.equals(objA)) {
                    break;
                }
                iC++;
            }
        }
        Arrays.fill(objArr, i13, i10, (Object) null);
        if (i13 == 1) {
            Object obj3 = objArr[0];
            Objects.requireNonNull(obj3);
            return new SingletonImmutableSet(obj3);
        }
        if (m(i13) < iM / 2) {
            return n(i13, objArr);
        }
        if (r(i13, objArr.length)) {
            objArr = Arrays.copyOf(objArr, i13);
        }
        return new RegularImmutableSet(objArr, i12, objArr2, i11, i13);
    }

    public static <E> ImmutableSet<E> of() {
        return RegularImmutableSet.f30165j;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean r(int i10, int i11) {
        return i10 < (i11 >> 1) + (i11 >> 2);
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @IgnoreJRERequirement
    public static <E> Collector<E, ?, ImmutableSet<E>> toImmutableSet() {
        return CollectCollectors.S();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.f29670c;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> immutableListO = o();
        this.f29670c = immutableListO;
        return immutableListO;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof ImmutableSet) && q() && ((ImmutableSet) obj).q() && hashCode() != obj.hashCode()) {
            return false;
        }
        return Sets.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return Sets.b(this);
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public abstract UnmodifiableIterator<E> iterator();

    ImmutableList o() {
        return ImmutableList.k(toArray());
    }

    boolean q() {
        return false;
    }

    @Override // com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    Object writeReplace() {
        return new SerializedForm(toArray());
    }

    public static <E> ImmutableSet<E> of(E e10) {
        return new SingletonImmutableSet(e10);
    }

    public static <E> ImmutableSet<E> of(E e10, E e11) {
        return n(2, e10, e11);
    }

    public static <E> ImmutableSet<E> of(E e10, E e11, E e12) {
        return n(3, e10, e11, e12);
    }

    public static <E> ImmutableSet<E> of(E e10, E e11, E e12, E e13) {
        return n(4, e10, e11, e12, e13);
    }

    public static <E> ImmutableSet<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof Collection) {
            return copyOf((Collection) iterable);
        }
        return copyOf(iterable.iterator());
    }

    public static <E> ImmutableSet<E> of(E e10, E e11, E e12, E e13, E e14) {
        return n(5, e10, e11, e12, e13, e14);
    }

    @SafeVarargs
    public static <E> ImmutableSet<E> of(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        Preconditions.checkArgument(eArr.length <= 2147483641, "the total number of elements must fit in an int");
        int length = eArr.length + 6;
        Object[] objArr = new Object[length];
        objArr[0] = e10;
        objArr[1] = e11;
        objArr[2] = e12;
        objArr[3] = e13;
        objArr[4] = e14;
        objArr[5] = e15;
        System.arraycopy(eArr, 0, objArr, 6, eArr.length);
        return n(length, objArr);
    }

    public static <E> ImmutableSet<E> copyOf(Iterator<? extends E> it) {
        if (!it.hasNext()) {
            return of();
        }
        E next = it.next();
        if (!it.hasNext()) {
            return of((Object) next);
        }
        return new Builder().add((Object) next).addAll((Iterator) it).build();
    }

    public static <E> ImmutableSet<E> copyOf(E[] eArr) {
        int length = eArr.length;
        if (length == 0) {
            return of();
        }
        if (length != 1) {
            return n(eArr.length, (Object[]) eArr.clone());
        }
        return of((Object) eArr[0]);
    }
}
