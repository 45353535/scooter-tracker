package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.collect.Serialization;
import com.google.common.math.IntMath;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes9.dex */
@GwtIncompatible
@J2ktIncompatible
@ElementTypesAreNonnullByDefault
public final class ConcurrentHashMultiset<E> extends AbstractMultiset<E> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final transient ConcurrentMap f29398d;

    private class EntrySet extends AbstractMultiset<E>.EntrySet {
        private EntrySet() {
            super();
        }

        private List g() {
            ArrayList arrayListNewArrayListWithExpectedSize = Lists.newArrayListWithExpectedSize(size());
            Iterators.addAll(arrayListNewArrayListWithExpectedSize, iterator());
            return arrayListNewArrayListWithExpectedSize;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.common.collect.AbstractMultiset.EntrySet, com.google.common.collect.Multisets.EntrySet
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public ConcurrentHashMultiset e() {
            return ConcurrentHashMultiset.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public Object[] toArray() {
            return g().toArray();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) g().toArray(tArr);
        }
    }

    private static class FieldSettersHolder {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final Serialization.FieldSetter f29407a = Serialization.a(ConcurrentHashMultiset.class, "countMap");
    }

    ConcurrentHashMultiset(ConcurrentMap concurrentMap) {
        Preconditions.checkArgument(concurrentMap.isEmpty(), "the backing map (%s) must be empty", concurrentMap);
        this.f29398d = concurrentMap;
    }

    public static <E> ConcurrentHashMultiset<E> create() {
        return new ConcurrentHashMultiset<>(new ConcurrentHashMap());
    }

    /* JADX WARN: Multi-variable type inference failed */
    private List m() {
        ArrayList arrayListNewArrayListWithExpectedSize = Lists.newArrayListWithExpectedSize(size());
        for (Multiset.Entry entry : entrySet()) {
            Object element = entry.getElement();
            for (int count = entry.getCount(); count > 0; count--) {
                arrayListNewArrayListWithExpectedSize.add(element);
            }
        }
        return arrayListNewArrayListWithExpectedSize;
    }

    @J2ktIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        Object object = objectInputStream.readObject();
        Objects.requireNonNull(object);
        FieldSettersHolder.f29407a.b(this, (ConcurrentMap) object);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.f29398d);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int add(E e10, int i10) {
        AtomicInteger atomicInteger;
        int i11;
        AtomicInteger atomicInteger2;
        Preconditions.checkNotNull(e10);
        if (i10 == 0) {
            return count(e10);
        }
        CollectPreconditions.d(i10, "occurrences");
        do {
            atomicInteger = (AtomicInteger) Maps.G(this.f29398d, e10);
            if (atomicInteger == null && (atomicInteger = (AtomicInteger) this.f29398d.putIfAbsent(e10, new AtomicInteger(i10))) == null) {
                return 0;
            }
            do {
                i11 = atomicInteger.get();
                if (i11 == 0) {
                    atomicInteger2 = new AtomicInteger(i10);
                    if (this.f29398d.putIfAbsent(e10, atomicInteger2) == null) {
                        break;
                    }
                } else {
                    try {
                    } catch (ArithmeticException unused) {
                        throw new IllegalArgumentException("Overflow adding " + i10 + " occurrences to a count of " + i11);
                    }
                }
            } while (!atomicInteger.compareAndSet(i11, IntMath.checkedAdd(i11, i10)));
            return i11;
        } while (!this.f29398d.replace(e10, atomicInteger, atomicInteger2));
        return 0;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public void clear() {
        this.f29398d.clear();
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    @Override // com.google.common.collect.Multiset
    public int count(Object obj) {
        AtomicInteger atomicInteger = (AtomicInteger) Maps.G(this.f29398d, obj);
        if (atomicInteger == null) {
            return 0;
        }
        return atomicInteger.get();
    }

    @Override // com.google.common.collect.AbstractMultiset
    @Deprecated
    public Set<Multiset.Entry<E>> createEntrySet() {
        return new EntrySet();
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set elementSet() {
        return super.elementSet();
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    @Override // com.google.common.collect.AbstractMultiset
    Set g() {
        final Set setKeySet = this.f29398d.keySet();
        return new ForwardingSet<E>(this) { // from class: com.google.common.collect.ConcurrentHashMultiset.1

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ ConcurrentHashMultiset f29400c;

            {
                this.f29400c = this;
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public boolean contains(Object obj) {
                return obj != null && Collections2.f(setKeySet, obj);
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public boolean containsAll(Collection<?> collection) {
                return j(collection);
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.ForwardingSet, com.google.common.collect.ForwardingCollection
            public Set n() {
                return setKeySet;
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public boolean remove(Object obj) {
                return obj != null && Collections2.g(setKeySet, obj);
            }

            @Override // com.google.common.collect.ForwardingCollection, java.util.Collection, java.util.Set
            public boolean removeAll(Collection<?> collection) {
                return o(collection);
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset
    int i() {
        return this.f29398d.size();
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f29398d.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public Iterator<E> iterator() {
        return Multisets.h(this);
    }

    @Override // com.google.common.collect.AbstractMultiset
    Iterator j() {
        throw new AssertionError("should never be called");
    }

    @Override // com.google.common.collect.AbstractMultiset
    Iterator k() {
        final AbstractIterator<Multiset.Entry<E>> abstractIterator = new AbstractIterator<Multiset.Entry<E>>() { // from class: com.google.common.collect.ConcurrentHashMultiset.2

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            private final Iterator f29401d;

            {
                this.f29401d = ConcurrentHashMultiset.this.f29398d.entrySet().iterator();
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.AbstractIterator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Multiset.Entry computeNext() {
                while (this.f29401d.hasNext()) {
                    Map.Entry entry = (Map.Entry) this.f29401d.next();
                    int i10 = ((AtomicInteger) entry.getValue()).get();
                    if (i10 != 0) {
                        return Multisets.immutableEntry(entry.getKey(), i10);
                    }
                }
                return (Multiset.Entry) a();
            }
        };
        return new ForwardingIterator<Multiset.Entry<E>>(this) { // from class: com.google.common.collect.ConcurrentHashMultiset.3

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private Multiset.Entry f29403b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ConcurrentHashMultiset f29405d;

            {
                this.f29405d = this;
            }

            /* JADX INFO: Access modifiers changed from: protected */
            @Override // com.google.common.collect.ForwardingIterator, com.google.common.collect.ForwardingObject
            /* JADX INFO: renamed from: g */
            public Iterator n() {
                return abstractIterator;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.google.common.collect.ForwardingIterator, java.util.Iterator
            public void remove() {
                Preconditions.checkState(this.f29403b != null, "no calls to next() since the last call to remove()");
                this.f29405d.setCount(this.f29403b.getElement(), 0);
                this.f29403b = null;
            }

            @Override // com.google.common.collect.ForwardingIterator, java.util.Iterator
            public Multiset.Entry<E> next() {
                Multiset.Entry<E> entry = (Multiset.Entry) super.next();
                this.f29403b = entry;
                return entry;
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int remove(Object obj, int i10) {
        int i11;
        int iMax;
        if (i10 == 0) {
            return count(obj);
        }
        CollectPreconditions.d(i10, "occurrences");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.G(this.f29398d, obj);
        if (atomicInteger == null) {
            return 0;
        }
        do {
            i11 = atomicInteger.get();
            if (i11 == 0) {
                return 0;
            }
            iMax = Math.max(0, i11 - i10);
        } while (!atomicInteger.compareAndSet(i11, iMax));
        if (iMax == 0) {
            this.f29398d.remove(obj, atomicInteger);
        }
        return i11;
    }

    @CanIgnoreReturnValue
    public boolean removeExactly(Object obj, int i10) {
        int i11;
        int i12;
        if (i10 == 0) {
            return true;
        }
        CollectPreconditions.d(i10, "occurrences");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.G(this.f29398d, obj);
        if (atomicInteger == null) {
            return false;
        }
        do {
            i11 = atomicInteger.get();
            if (i11 < i10) {
                return false;
            }
            i12 = i11 - i10;
        } while (!atomicInteger.compareAndSet(i11, i12));
        if (i12 == 0) {
            this.f29398d.remove(obj, atomicInteger);
        }
        return true;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int setCount(E e10, int i10) {
        AtomicInteger atomicInteger;
        int i11;
        AtomicInteger atomicInteger2;
        Preconditions.checkNotNull(e10);
        CollectPreconditions.b(i10, "count");
        do {
            atomicInteger = (AtomicInteger) Maps.G(this.f29398d, e10);
            if (atomicInteger == null && (i10 == 0 || (atomicInteger = (AtomicInteger) this.f29398d.putIfAbsent(e10, new AtomicInteger(i10))) == null)) {
                return 0;
            }
            do {
                i11 = atomicInteger.get();
                if (i11 == 0) {
                    if (i10 != 0) {
                        atomicInteger2 = new AtomicInteger(i10);
                        if (this.f29398d.putIfAbsent(e10, atomicInteger2) == null) {
                            break;
                        }
                    } else {
                        return 0;
                    }
                }
            } while (!atomicInteger.compareAndSet(i11, i10));
            if (i10 == 0) {
                this.f29398d.remove(e10, atomicInteger);
            }
            return i11;
        } while (!this.f29398d.replace(e10, atomicInteger, atomicInteger2));
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public int size() {
        Iterator<E> it = this.f29398d.values().iterator();
        long j10 = 0;
        while (it.hasNext()) {
            j10 += (long) ((AtomicInteger) it.next()).get();
        }
        return Ints.saturatedCast(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return m().toArray();
    }

    public static <E> ConcurrentHashMultiset<E> create(Iterable<? extends E> iterable) {
        ConcurrentHashMultiset<E> concurrentHashMultisetCreate = create();
        Iterables.addAll(concurrentHashMultisetCreate, iterable);
        return concurrentHashMultisetCreate;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) m().toArray(tArr);
    }

    public static <E> ConcurrentHashMultiset<E> create(ConcurrentMap<E, AtomicInteger> concurrentMap) {
        return new ConcurrentHashMultiset<>(concurrentMap);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public boolean setCount(E e10, int i10, int i11) {
        Preconditions.checkNotNull(e10);
        CollectPreconditions.b(i10, "oldCount");
        CollectPreconditions.b(i11, "newCount");
        AtomicInteger atomicInteger = (AtomicInteger) Maps.G(this.f29398d, e10);
        if (atomicInteger == null) {
            if (i10 != 0) {
                return false;
            }
            return i11 == 0 || this.f29398d.putIfAbsent(e10, new AtomicInteger(i11)) == null;
        }
        int i12 = atomicInteger.get();
        if (i12 == i10) {
            if (i12 == 0) {
                if (i11 == 0) {
                    this.f29398d.remove(e10, atomicInteger);
                    return true;
                }
                AtomicInteger atomicInteger2 = new AtomicInteger(i11);
                return this.f29398d.putIfAbsent(e10, atomicInteger2) == null || this.f29398d.replace(e10, atomicInteger, atomicInteger2);
            }
            if (atomicInteger.compareAndSet(i12, i11)) {
                if (i11 == 0) {
                    this.f29398d.remove(e10, atomicInteger);
                }
                return true;
            }
        }
        return false;
    }
}
