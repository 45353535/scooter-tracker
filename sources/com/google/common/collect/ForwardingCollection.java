package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible
@ElementTypesAreNonnullByDefault
public abstract class ForwardingCollection<E> extends ForwardingObject implements Collection<E> {
    protected ForwardingCollection() {
    }

    @CanIgnoreReturnValue
    public boolean add(@ParametricNullness E e10) {
        return n().add(e10);
    }

    @CanIgnoreReturnValue
    public boolean addAll(Collection<? extends E> collection) {
        return n().addAll(collection);
    }

    public void clear() {
        n().clear();
    }

    public boolean contains(Object obj) {
        return n().contains(obj);
    }

    public boolean containsAll(Collection<?> collection) {
        return n().containsAll(collection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.google.common.collect.ForwardingObject
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public abstract Collection n();

    protected boolean i(Collection collection) {
        return Iterators.addAll(this, collection.iterator());
    }

    @Override // java.util.Collection
    public boolean isEmpty() {
        return n().isEmpty();
    }

    public Iterator<E> iterator() {
        return n().iterator();
    }

    protected boolean j(Collection collection) {
        return Collections2.b(this, collection);
    }

    protected boolean k(Collection collection) {
        return Iterators.retainAll(iterator(), collection);
    }

    protected Object[] l() {
        return toArray(new Object[size()]);
    }

    protected Object[] m(Object[] objArr) {
        return ObjectArrays.f(this, objArr);
    }

    @CanIgnoreReturnValue
    public boolean remove(Object obj) {
        return n().remove(obj);
    }

    @CanIgnoreReturnValue
    public boolean removeAll(Collection<?> collection) {
        return n().removeAll(collection);
    }

    @CanIgnoreReturnValue
    public boolean retainAll(Collection<?> collection) {
        return n().retainAll(collection);
    }

    @Override // java.util.Collection
    public int size() {
        return n().size();
    }

    protected String standardToString() {
        return Collections2.h(this);
    }

    public Object[] toArray() {
        return n().toArray();
    }

    @CanIgnoreReturnValue
    public <T> T[] toArray(T[] tArr) {
        return (T[]) n().toArray(tArr);
    }
}
