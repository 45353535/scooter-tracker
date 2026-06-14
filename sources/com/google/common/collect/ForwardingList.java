package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingList<E> extends ForwardingCollection<E> implements List<E> {
    protected ForwardingList() {
    }

    public void add(int i10, @ParametricNullness E e10) {
        n().add(i10, e10);
    }

    @CanIgnoreReturnValue
    public boolean addAll(int i10, Collection<? extends E> collection) {
        return n().addAll(i10, collection);
    }

    @Override // java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return obj == this || n().equals(obj);
    }

    @Override // java.util.List
    @ParametricNullness
    public E get(int i10) {
        return (E) n().get(i10);
    }

    @Override // java.util.Collection, java.util.List
    public int hashCode() {
        return n().hashCode();
    }

    @Override // java.util.List
    public int indexOf(Object obj) {
        return n().indexOf(obj);
    }

    @Override // java.util.List
    public int lastIndexOf(Object obj) {
        return n().lastIndexOf(obj);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator() {
        return n().listIterator();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingCollection
    public abstract List n();

    @Override // java.util.List
    @ParametricNullness
    @CanIgnoreReturnValue
    public E remove(int i10) {
        return (E) n().remove(i10);
    }

    @Override // java.util.List
    @ParametricNullness
    @CanIgnoreReturnValue
    public E set(int i10, @ParametricNullness E e10) {
        return (E) n().set(i10, e10);
    }

    @Override // java.util.List
    public List<E> subList(int i10, int i11) {
        return n().subList(i10, i11);
    }

    @Override // java.util.List
    public ListIterator<E> listIterator(int i10) {
        return n().listIterator(i10);
    }
}
