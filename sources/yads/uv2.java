package yads;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class uv2 extends AbstractSet {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Set f116791b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Set f116792c;

    public uv2(d41 d41Var, d41 d41Var2) {
        this.f116791b = d41Var;
        this.f116792c = d41Var2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f116791b.contains(obj) && this.f116792c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean containsAll(Collection collection) {
        return this.f116791b.containsAll(collection) && this.f116792c.containsAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        return Collections.disjoint(this.f116792c, this.f116791b);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new tv2(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        Iterator it = this.f116791b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f116792c.contains(it.next())) {
                i10++;
            }
        }
        return i10;
    }
}
