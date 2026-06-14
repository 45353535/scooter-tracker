package com.google.gson.internal;

import j$.util.Objects;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes9.dex */
public class NonNullElementWrapperList<E> extends AbstractList<E> implements RandomAccess {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList f33587b;

    public NonNullElementWrapperList(ArrayList<E> arrayList) {
        Objects.requireNonNull(arrayList);
        this.f33587b = arrayList;
    }

    private Object a(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("Element must be non-null");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public void add(int i10, E e10) {
        this.f33587b.add(i10, a(e10));
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        this.f33587b.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return this.f33587b.contains(obj);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        return this.f33587b.equals(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public E get(int i10) {
        return (E) this.f33587b.get(i10);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        return this.f33587b.hashCode();
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        return this.f33587b.indexOf(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        return this.f33587b.lastIndexOf(obj);
    }

    @Override // java.util.AbstractList, java.util.List
    public E remove(int i10) {
        return (E) this.f33587b.remove(i10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean removeAll(Collection<?> collection) {
        return this.f33587b.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean retainAll(Collection<?> collection) {
        return this.f33587b.retainAll(collection);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractList, java.util.List
    public E set(int i10, E e10) {
        return (E) this.f33587b.set(i10, a(e10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f33587b.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        return this.f33587b.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        return this.f33587b.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public <T> T[] toArray(T[] tArr) {
        return (T[]) this.f33587b.toArray(tArr);
    }
}
