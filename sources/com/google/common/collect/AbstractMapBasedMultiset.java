package com.google.common.collect;

import androidx.collection.SieveCacheKt;
import com.google.common.annotations.GwtCompatible;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.collect.Multiset;
import com.google.common.primitives.Ints;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true)
@ElementTypesAreNonnullByDefault
abstract class AbstractMapBasedMultiset<E> extends AbstractMultiset<E> implements Serializable {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    transient ObjectCountHashMap f29268d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    transient long f29269e;

    abstract class Itr<T> implements Iterator<T> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f29272b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f29273c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f29274d;

        Itr() {
            this.f29272b = AbstractMapBasedMultiset.this.f29268d.d();
            this.f29274d = AbstractMapBasedMultiset.this.f29268d.f30104d;
        }

        private void a() {
            if (AbstractMapBasedMultiset.this.f29268d.f30104d != this.f29274d) {
                throw new ConcurrentModificationException();
            }
        }

        abstract Object b(int i10);

        @Override // java.util.Iterator
        public boolean hasNext() {
            a();
            return this.f29272b >= 0;
        }

        @Override // java.util.Iterator
        @ParametricNullness
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t10 = (T) b(this.f29272b);
            int i10 = this.f29272b;
            this.f29273c = i10;
            this.f29272b = AbstractMapBasedMultiset.this.f29268d.q(i10);
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            a();
            CollectPreconditions.e(this.f29273c != -1);
            AbstractMapBasedMultiset abstractMapBasedMultiset = AbstractMapBasedMultiset.this;
            abstractMapBasedMultiset.f29269e -= (long) abstractMapBasedMultiset.f29268d.t(this.f29273c);
            this.f29272b = AbstractMapBasedMultiset.this.f29268d.r(this.f29272b, this.f29273c);
            this.f29273c = -1;
            this.f29274d = AbstractMapBasedMultiset.this.f29268d.f30104d;
        }
    }

    AbstractMapBasedMultiset(int i10) {
        this.f29268d = m(i10);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void readObject(ObjectInputStream objectInputStream) throws ClassNotFoundException, IOException {
        objectInputStream.defaultReadObject();
        int iH = Serialization.h(objectInputStream);
        this.f29268d = m(3);
        Serialization.g(this, objectInputStream, iH);
    }

    @J2ktIncompatible
    @GwtIncompatible
    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        Serialization.k(this, objectOutputStream);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int add(@ParametricNullness E e10, int i10) {
        if (i10 == 0) {
            return count(e10);
        }
        Preconditions.checkArgument(i10 > 0, "occurrences cannot be negative: %s", i10);
        int iK = this.f29268d.k(e10);
        if (iK == -1) {
            this.f29268d.put(e10, i10);
            this.f29269e += (long) i10;
            return 0;
        }
        int i11 = this.f29268d.i(iK);
        long j10 = i10;
        long j11 = ((long) i11) + j10;
        Preconditions.checkArgument(j11 <= SieveCacheKt.NodeLinkMask, "too many occurrences: %s", j11);
        this.f29268d.x(iK, (int) j11);
        this.f29269e += j10;
        return i11;
    }

    @Override // com.google.common.collect.AbstractMultiset, java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        this.f29268d.clear();
        this.f29269e = 0L;
    }

    @Override // com.google.common.collect.Multiset
    public final int count(Object obj) {
        return this.f29268d.get(obj);
    }

    @Override // com.google.common.collect.AbstractMultiset
    final int i() {
        return this.f29268d.y();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, com.google.common.collect.Multiset
    public final Iterator<E> iterator() {
        return Multisets.h(this);
    }

    @Override // com.google.common.collect.AbstractMultiset
    final Iterator j() {
        return new AbstractMapBasedMultiset<E>.Itr<E>() { // from class: com.google.common.collect.AbstractMapBasedMultiset.1
            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            Object b(int i10) {
                return AbstractMapBasedMultiset.this.f29268d.g(i10);
            }
        };
    }

    @Override // com.google.common.collect.AbstractMultiset
    final Iterator k() {
        return new AbstractMapBasedMultiset<E>.Itr<Multiset.Entry<E>>() { // from class: com.google.common.collect.AbstractMapBasedMultiset.2
            /* JADX INFO: Access modifiers changed from: package-private */
            @Override // com.google.common.collect.AbstractMapBasedMultiset.Itr
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Multiset.Entry b(int i10) {
                return AbstractMapBasedMultiset.this.f29268d.e(i10);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    void l(Multiset multiset) {
        Preconditions.checkNotNull(multiset);
        int iD = this.f29268d.d();
        while (iD >= 0) {
            multiset.add(this.f29268d.g(iD), this.f29268d.i(iD));
            iD = this.f29268d.q(iD);
        }
    }

    abstract ObjectCountHashMap m(int i10);

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int remove(Object obj, int i10) {
        if (i10 == 0) {
            return count(obj);
        }
        Preconditions.checkArgument(i10 > 0, "occurrences cannot be negative: %s", i10);
        int iK = this.f29268d.k(obj);
        if (iK == -1) {
            return 0;
        }
        int i11 = this.f29268d.i(iK);
        if (i11 > i10) {
            this.f29268d.x(iK, i11 - i10);
        } else {
            this.f29268d.t(iK);
            i10 = i11;
        }
        this.f29269e -= (long) i10;
        return i11;
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final int setCount(@ParametricNullness E e10, int i10) {
        CollectPreconditions.b(i10, "count");
        ObjectCountHashMap objectCountHashMap = this.f29268d;
        int iRemove = i10 == 0 ? objectCountHashMap.remove(e10) : objectCountHashMap.put(e10, i10);
        this.f29269e += (long) (i10 - iRemove);
        return iRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public final int size() {
        return Ints.saturatedCast(this.f29269e);
    }

    @Override // com.google.common.collect.AbstractMultiset, com.google.common.collect.Multiset
    public final boolean setCount(@ParametricNullness E e10, int i10, int i11) {
        CollectPreconditions.b(i10, "oldCount");
        CollectPreconditions.b(i11, "newCount");
        int iK = this.f29268d.k(e10);
        if (iK == -1) {
            if (i10 != 0) {
                return false;
            }
            if (i11 > 0) {
                this.f29268d.put(e10, i11);
                this.f29269e += (long) i11;
            }
            return true;
        }
        if (this.f29268d.i(iK) != i10) {
            return false;
        }
        if (i11 == 0) {
            this.f29268d.t(iK);
            this.f29269e -= (long) i10;
        } else {
            this.f29268d.x(iK, i11);
            this.f29269e += (long) (i11 - i10);
        }
        return true;
    }
}
