package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.ImmutableCollection;
import com.google.common.collect.Multiset;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import com.google.errorprone.annotations.DoNotCall;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.function.Function$CC;
import j$.util.stream.Collector;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Set;
import java.util.function.Function;
import java.util.function.ToIntFunction;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
public abstract class ImmutableMultiset<E> extends ImmutableMultisetGwtSerializationDependencies<E> implements Multiset<E>, Collection {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient ImmutableList f29622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private transient ImmutableSet f29623d;

    public static class Builder<E> extends ImmutableCollection.Builder<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ObjectCountHashMap f29628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f29629b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f29630c;

        public Builder() {
            this(4);
        }

        static ObjectCountHashMap b(Iterable iterable) {
            if (iterable instanceof RegularImmutableMultiset) {
                return ((RegularImmutableMultiset) iterable).f30158e;
            }
            if (iterable instanceof AbstractMapBasedMultiset) {
                return ((AbstractMapBasedMultiset) iterable).f29268d;
            }
            return null;
        }

        @CanIgnoreReturnValue
        public Builder<E> addCopies(E e10, int i10) {
            Objects.requireNonNull(this.f29628a);
            if (i10 == 0) {
                return this;
            }
            if (this.f29629b) {
                this.f29628a = new ObjectCountHashMap(this.f29628a);
                this.f29630c = false;
            }
            this.f29629b = false;
            Preconditions.checkNotNull(e10);
            ObjectCountHashMap objectCountHashMap = this.f29628a;
            objectCountHashMap.put(e10, i10 + objectCountHashMap.get(e10));
            return this;
        }

        @CanIgnoreReturnValue
        public Builder<E> setCount(E e10, int i10) {
            Objects.requireNonNull(this.f29628a);
            if (i10 == 0 && !this.f29630c) {
                this.f29628a = new ObjectCountLinkedHashMap(this.f29628a);
                this.f29630c = true;
            } else if (this.f29629b) {
                this.f29628a = new ObjectCountHashMap(this.f29628a);
                this.f29630c = false;
            }
            this.f29629b = false;
            Preconditions.checkNotNull(e10);
            if (i10 == 0) {
                this.f29628a.remove(e10);
                return this;
            }
            this.f29628a.put(Preconditions.checkNotNull(e10), i10);
            return this;
        }

        Builder(int i10) {
            this.f29629b = false;
            this.f29630c = false;
            this.f29628a = ObjectCountHashMap.b(i10);
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        public ImmutableMultiset<E> build() {
            Objects.requireNonNull(this.f29628a);
            if (this.f29628a.y() == 0) {
                return ImmutableMultiset.of();
            }
            if (this.f29630c) {
                this.f29628a = new ObjectCountHashMap(this.f29628a);
                this.f29630c = false;
            }
            this.f29629b = true;
            return new RegularImmutableMultiset(this.f29628a);
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E e10) {
            return addCopies(e10, 1);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterable<? extends E> iterable) {
            Objects.requireNonNull(this.f29628a);
            if (iterable instanceof Multiset) {
                Multiset multisetD = Multisets.d(iterable);
                ObjectCountHashMap objectCountHashMapB = b(multisetD);
                if (objectCountHashMapB != null) {
                    ObjectCountHashMap objectCountHashMap = this.f29628a;
                    objectCountHashMap.c(Math.max(objectCountHashMap.y(), objectCountHashMapB.y()));
                    for (int iD = objectCountHashMapB.d(); iD >= 0; iD = objectCountHashMapB.q(iD)) {
                        addCopies(objectCountHashMapB.g(iD), objectCountHashMapB.i(iD));
                    }
                } else {
                    Set<Multiset.Entry<E>> setEntrySet = multisetD.entrySet();
                    ObjectCountHashMap objectCountHashMap2 = this.f29628a;
                    objectCountHashMap2.c(Math.max(objectCountHashMap2.y(), setEntrySet.size()));
                    for (Multiset.Entry<E> entry : multisetD.entrySet()) {
                        addCopies(entry.getElement(), entry.getCount());
                    }
                }
                return this;
            }
            super.addAll((Iterable) iterable);
            return this;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> add(E... eArr) {
            super.add((Object[]) eArr);
            return this;
        }

        Builder(boolean z10) {
            this.f29629b = false;
            this.f29630c = false;
            this.f29628a = null;
        }

        @Override // com.google.common.collect.ImmutableCollection.Builder
        @CanIgnoreReturnValue
        public Builder<E> addAll(Iterator<? extends E> it) {
            super.addAll((Iterator) it);
            return this;
        }
    }

    private final class EntrySet extends IndexedImmutableSet<Multiset.Entry<E>> {
        private EntrySet() {
        }

        @J2ktIncompatible
        @GwtIncompatible
        private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
            throw new InvalidObjectException("Use EntrySetSerializedForm");
        }

        @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            if (obj instanceof Multiset.Entry) {
                Multiset.Entry entry = (Multiset.Entry) obj;
                if (entry.getCount() > 0 && ImmutableMultiset.this.count(entry.getElement()) == entry.getCount()) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.common.collect.ImmutableSet, java.util.Collection, java.util.Set
        public int hashCode() {
            return ImmutableMultiset.this.hashCode();
        }

        @Override // com.google.common.collect.ImmutableCollection
        boolean isPartialView() {
            return ImmutableMultiset.this.isPartialView();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.IndexedImmutableSet
        /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
        public Multiset.Entry get(int i10) {
            return ImmutableMultiset.this.o(i10);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return ImmutableMultiset.this.elementSet().size();
        }

        @Override // com.google.common.collect.IndexedImmutableSet, com.google.common.collect.ImmutableSet, com.google.common.collect.ImmutableCollection
        @J2ktIncompatible
        @GwtIncompatible
        Object writeReplace() {
            return new EntrySetSerializedForm(ImmutableMultiset.this);
        }
    }

    @GwtIncompatible
    @J2ktIncompatible
    static class EntrySetSerializedForm<E> implements Serializable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ImmutableMultiset f29632b;

        EntrySetSerializedForm(ImmutableMultiset immutableMultiset) {
            this.f29632b = immutableMultiset;
        }

        Object readResolve() {
            return this.f29632b.entrySet();
        }
    }

    ImmutableMultiset() {
    }

    public static <E> Builder<E> builder() {
        return new Builder<>();
    }

    public static <E> ImmutableMultiset<E> copyOf(E[] eArr) {
        return l(eArr);
    }

    public static /* synthetic */ int k(Object obj) {
        return 1;
    }

    private static ImmutableMultiset l(Object... objArr) {
        return new Builder().add(objArr).build();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Multi-variable type inference failed */
    public static ImmutableMultiset m(java.util.Collection collection) {
        Builder builder = new Builder(collection.size());
        Iterator<E> it = collection.iterator();
        while (it.hasNext()) {
            Multiset.Entry entry = (Multiset.Entry) it.next();
            builder.addCopies(entry.getElement(), entry.getCount());
        }
        return builder.build();
    }

    private ImmutableSet n() {
        return isEmpty() ? ImmutableSet.of() : new EntrySet();
    }

    public static <E> ImmutableMultiset<E> of() {
        return RegularImmutableMultiset.f30157h;
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @IgnoreJRERequirement
    public static <E> Collector<E, ?, ImmutableMultiset<E>> toImmutableMultiset() {
        return CollectCollectors.P(Function$CC.identity(), new ToIntFunction() { // from class: com.google.common.collect.g2
            @Override // java.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ImmutableMultiset.k(obj);
            }
        });
    }

    @Override // com.google.common.collect.ImmutableCollection
    int a(Object[] objArr, int i10) {
        UnmodifiableIterator<Multiset.Entry<E>> it = entrySet().iterator();
        while (it.hasNext()) {
            Multiset.Entry<E> next = it.next();
            Arrays.fill(objArr, i10, next.getCount() + i10, next.getElement());
            i10 += next.getCount();
        }
        return i10;
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final int add(E e10, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.ImmutableCollection
    public ImmutableList<E> asList() {
        ImmutableList<E> immutableList = this.f29622c;
        if (immutableList != null) {
            return immutableList;
        }
        ImmutableList<E> immutableListAsList = super.asList();
        this.f29622c = immutableListAsList;
        return immutableListAsList;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return count(obj) > 0;
    }

    @Override // com.google.common.collect.Multiset
    public abstract ImmutableSet<E> elementSet();

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public boolean equals(Object obj) {
        return Multisets.f(this, obj);
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public int hashCode() {
        return Sets.b(entrySet());
    }

    abstract Multiset.Entry o(int i10);

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final int remove(Object obj, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final int setCount(E e10, int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.Multiset
    public String toString() {
        return entrySet().toString();
    }

    @Override // com.google.common.collect.ImmutableCollection
    @J2ktIncompatible
    @GwtIncompatible
    abstract Object writeReplace();

    public static <E> ImmutableMultiset<E> copyOf(Iterable<? extends E> iterable) {
        if (iterable instanceof ImmutableMultiset) {
            ImmutableMultiset<E> immutableMultiset = (ImmutableMultiset) iterable;
            if (!immutableMultiset.isPartialView()) {
                return immutableMultiset;
            }
        }
        Builder builder = new Builder(Multisets.g(iterable));
        builder.addAll((Iterable) iterable);
        return builder.build();
    }

    public static <E> ImmutableMultiset<E> of(E e10) {
        return l(e10);
    }

    @IgnoreJRERequirement
    public static <T, E> Collector<T, ?, ImmutableMultiset<E>> toImmutableMultiset(Function<? super T, ? extends E> function, ToIntFunction<? super T> toIntFunction) {
        return CollectCollectors.P(function, toIntFunction);
    }

    @Override // com.google.common.collect.Multiset
    public ImmutableSet<Multiset.Entry<E>> entrySet() {
        ImmutableSet<Multiset.Entry<E>> immutableSet = this.f29623d;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Multiset.Entry<E>> immutableSetN = n();
        this.f29623d = immutableSetN;
        return immutableSetN;
    }

    @Override // com.google.common.collect.ImmutableCollection, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, java.util.NavigableSet, com.google.common.collect.SortedIterable
    public UnmodifiableIterator<E> iterator() {
        final UnmodifiableIterator<Multiset.Entry<E>> it = entrySet().iterator();
        return new UnmodifiableIterator<E>(this) { // from class: com.google.common.collect.ImmutableMultiset.1

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            int f29624b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            Object f29625c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ ImmutableMultiset f29627e;

            {
                this.f29627e = this;
            }

            @Override // java.util.Iterator
            public boolean hasNext() {
                return this.f29624b > 0 || it.hasNext();
            }

            @Override // java.util.Iterator
            public E next() {
                if (this.f29624b <= 0) {
                    Multiset.Entry entry = (Multiset.Entry) it.next();
                    this.f29625c = entry.getElement();
                    this.f29624b = entry.getCount();
                }
                this.f29624b--;
                E e10 = (E) this.f29625c;
                Objects.requireNonNull(e10);
                return e10;
            }
        };
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    @DoNotCall("Always throws UnsupportedOperationException")
    @Deprecated
    public final boolean setCount(E e10, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    public static <E> ImmutableMultiset<E> of(E e10, E e11) {
        return l(e10, e11);
    }

    public static <E> ImmutableMultiset<E> of(E e10, E e11, E e12) {
        return l(e10, e11, e12);
    }

    public static <E> ImmutableMultiset<E> of(E e10, E e11, E e12, E e13) {
        return l(e10, e11, e12, e13);
    }

    public static <E> ImmutableMultiset<E> of(E e10, E e11, E e12, E e13, E e14) {
        return l(e10, e11, e12, e13, e14);
    }

    public static <E> ImmutableMultiset<E> of(E e10, E e11, E e12, E e13, E e14, E e15, E... eArr) {
        return new Builder().add((Object) e10).add((Object) e11).add((Object) e12).add((Object) e13).add((Object) e14).add((Object) e15).add((Object[]) eArr).build();
    }

    public static <E> ImmutableMultiset<E> copyOf(Iterator<? extends E> it) {
        return new Builder().addAll((Iterator) it).build();
    }
}
