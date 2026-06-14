package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.common.collect.Multiset;
import com.google.common.collect.Multisets;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingMultiset<E> extends ForwardingCollection<E> implements Multiset<E> {

    protected class StandardElementSet extends Multisets.ElementSet<E> {
        public StandardElementSet() {
        }

        @Override // com.google.common.collect.Multisets.ElementSet
        Multiset e() {
            return ForwardingMultiset.this;
        }

        @Override // com.google.common.collect.Multisets.ElementSet, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<E> iterator() {
            return Multisets.e(e().entrySet().iterator());
        }
    }

    protected ForwardingMultiset() {
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int add(@ParametricNullness E e10, int i10) {
        return n().add(e10, i10);
    }

    @Override // com.google.common.collect.Multiset
    public int count(Object obj) {
        return n().count(obj);
    }

    public Set<E> elementSet() {
        return n().elementSet();
    }

    public Set<Multiset.Entry<E>> entrySet() {
        return n().entrySet();
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public boolean equals(Object obj) {
        return obj == this || n().equals(obj);
    }

    @Override // java.util.Collection, com.google.common.collect.Multiset
    public int hashCode() {
        return n().hashCode();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingCollection
    public abstract Multiset n();

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int remove(Object obj, int i10) {
        return n().remove(obj, i10);
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public int setCount(@ParametricNullness E e10, int i10) {
        return n().setCount(e10, i10);
    }

    @Override // com.google.common.collect.Multiset
    @CanIgnoreReturnValue
    public boolean setCount(@ParametricNullness E e10, int i10, int i11) {
        return n().setCount(e10, i10, i11);
    }
}
