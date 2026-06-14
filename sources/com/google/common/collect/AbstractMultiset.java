package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
abstract class AbstractMultiset<E> extends AbstractCollection<E> implements Multiset<E> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private transient Set f29284b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private transient Set f29285c;

    class ElementSet extends Multisets.ElementSet<E> {
        ElementSet() {
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        Multiset e() {
            return AbstractMultiset.this;
        }

        @Override // com.google.common.collect.Multisets.ElementSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return AbstractMultiset.this.j();
        }
    }

    class EntrySet extends Multisets.EntrySet<E> {
        EntrySet() {
        }

        @Override // com.google.common.collect.Multisets.EntrySet
        Multiset e() {
            return AbstractMultiset.this;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Multiset.Entry<E>> iterator() {
            return AbstractMultiset.this.k();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return AbstractMultiset.this.i();
        }
    }

    AbstractMultiset() {
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final boolean add(@ParametricNullness E e10) {
        add(e10, 1);
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @CanIgnoreReturnValue
    public final boolean addAll(Collection<? extends E> collection) {
        return Multisets.c(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract void clear();

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    public boolean contains(Object obj) {
        return count(obj) > 0;
    }

    Set createEntrySet() {
        return new EntrySet();
    }

    @Override // com.google.common.collect.Multiset
    public Set<E> elementSet() {
        Set<E> set = this.f29284b;
        if (set != null) {
            return set;
        }
        Set<E> setG = g();
        this.f29284b = setG;
        return setG;
    }

    @Override // com.google.common.collect.Multiset
    public Set<Multiset.Entry<E>> entrySet() {
        Set<Multiset.Entry<E>> set = this.f29285c;
        if (set != null) {
            return set;
        }
        Set<Multiset.Entry<E>> setCreateEntrySet = createEntrySet();
        this.f29285c = setCreateEntrySet;
        return setCreateEntrySet;
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final boolean equals(Object obj) {
        return Multisets.f(this, obj);
    }

    Set g() {
        return new ElementSet();
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public final int hashCode() {
        return entrySet().hashCode();
    }

    abstract int i();

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return entrySet().isEmpty();
    }

    abstract Iterator j();

    abstract Iterator k();

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final boolean remove(Object obj) {
        return remove(obj, 1) > 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final boolean removeAll(Collection<?> collection) {
        return Multisets.j(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public final boolean retainAll(Collection<?> collection) {
        return Multisets.k(this, collection);
    }

    @CanIgnoreReturnValue
    public int setCount(@ParametricNullness E e10, int i10) {
        return Multisets.m(this, e10, i10);
    }

    @Override // java.util.AbstractCollection, com.google.common.collect.Multiset
    public final String toString() {
        return entrySet().toString();
    }

    @CanIgnoreReturnValue
    public int add(@ParametricNullness E e10, int i10) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    public int remove(Object obj, int i10) {
        throw new UnsupportedOperationException();
    }

    @CanIgnoreReturnValue
    public boolean setCount(@ParametricNullness E e10, int i10, int i11) {
        return Multisets.n(this, e10, i10, i11);
    }
}
