package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableList;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import com.google.errorprone.annotations.DoNotMock;
import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.Spliterators;
import j$.util.stream.Stream;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@DoNotMock("Use ImmutableList.of or another implementation")
@ElementTypesAreNonnullByDefault
public abstract class ImmutableCollection<E> extends AbstractCollection<E> implements Serializable, Collection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final Object[] f29550b = new Object[0];

    static abstract class ArrayBasedBuilder<E> extends Builder<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object[] f29551a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f29552b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f29553c;

        ArrayBasedBuilder(int i10) {
            CollectPreconditions.b(i10, "initialCapacity");
            this.f29551a = new Object[i10];
            this.f29552b = 0;
        }

        private void c(int i10) {
            Object[] objArr = this.f29551a;
            int iA = Builder.a(objArr.length, this.f29552b + i10);
            if (iA > objArr.length || this.f29553c) {
                this.f29551a = Arrays.copyOf(this.f29551a, iA);
                this.f29553c = false;
            }
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            if (iterable instanceof java.util.Collection) {
                java.util.Collection collection = (java.util.Collection) iterable;
                c(collection.size());
                if (collection instanceof ImmutableCollection) {
                    this.f29552b = ((ImmutableCollection) collection).a(this.f29551a, this.f29552b);
                    return this;
                }
            }
            super.addAll(iterable);
            return this;
        }

        final void b(Object[] objArr, int i10) {
            ObjectArrays.c(objArr, i10);
            c(i10);
            System.arraycopy(objArr, 0, this.f29551a, this.f29552b, i10);
            this.f29552b += i10;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public ArrayBasedBuilder<E> add(E e10) {
            Preconditions.checkNotNull(e10);
            c(1);
            Object[] objArr = this.f29551a;
            int i10 = this.f29552b;
            this.f29552b = i10 + 1;
            objArr[i10] = e10;
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
            b(eArr, eArr.length);
            return this;
        }
    }

    ImmutableCollection() {
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    int a(Object[] objArr, int i10) {
        UnmodifiableIterator<E> it = iterator();
        while (it.hasNext()) {
            objArr[i10] = it.next();
            i10++;
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean add(E e10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean addAll(java.util.Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public ImmutableList<E> asList() {
        return isEmpty() ? ImmutableList.of() : ImmutableList.k(toArray());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    Object[] g() {
        return null;
    }

    int i() {
        throw new UnsupportedOperationException();
    }

    abstract boolean isPartialView();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public abstract UnmodifiableIterator<E> iterator();

    int j() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean removeAll(java.util.Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean retainAll(java.util.Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(stream());
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return toArray((Object[]) intFunction.apply(0));
    }

    @J2ktIncompatible
    @GwtIncompatible
    Object writeReplace() {
        return new ImmutableList.SerializedForm(toArray());
    }

    @DoNotMock
    public static abstract class Builder<E> {
        Builder() {
        }

        static int a(int i10, int i11) {
            if (i11 < 0) {
                throw new IllegalArgumentException("cannot store more than MAX_VALUE elements");
            }
            if (i11 <= i10) {
                return i10;
            }
            int iHighestOneBit = i10 + (i10 >> 1) + 1;
            if (iHighestOneBit < i11) {
                iHighestOneBit = Integer.highestOneBit(i11 - 1) << 1;
            }
            if (iHighestOneBit < 0) {
                return Integer.MAX_VALUE;
            }
            return iHighestOneBit;
        }

        @CanIgnoreReturnValue
        public abstract Builder<E> add(E e10);

        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
            for (E e10 : eArr) {
                add(e10);
            }
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            Iterator<? extends E> it = iterable.iterator();
            while (it.hasNext()) {
                add(it.next());
            }
            return this;
        }

        public abstract ImmutableCollection<E> build();

        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterator<? extends E> it) {
            while (it.hasNext()) {
                add(it.next());
            }
            return this;
        }
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection
    @IgnoreJRERequirement
    public j$.util.Spliterator<E> spliterator() {
        return Spliterators.spliterator(this, 1296);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ j$.util.stream.Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @J2ktIncompatible
    public final Object[] toArray() {
        return toArray(f29550b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final <T> T[] toArray(T[] tArr) {
        Preconditions.checkNotNull(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrG = g();
            if (objArrG != null) {
                return (T[]) Platform.a(objArrG, j(), i(), tArr);
            }
            tArr = (T[]) ObjectArrays.newArray(tArr, size);
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(tArr, 0);
        return tArr;
    }
}
