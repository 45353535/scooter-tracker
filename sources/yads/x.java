package yads;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class x extends AbstractCollection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f117657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Collection f117658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f117659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Collection f117660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ a0 f117661f;

    public x(a0 a0Var, Object obj, Collection collection, x xVar) {
        this.f117661f = a0Var;
        this.f117657b = obj;
        this.f117658c = collection;
        this.f117659d = xVar;
        this.f117660e = xVar == null ? null : xVar.b();
    }

    public final void a() {
        x xVar = this.f117659d;
        if (xVar != null) {
            xVar.a();
        } else {
            this.f117661f.f108502f.put(this.f117657b, this.f117658c);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        c();
        boolean zIsEmpty = this.f117658c.isEmpty();
        boolean zAdd = this.f117658c.add(obj);
        if (zAdd) {
            this.f117661f.f108503g++;
            if (zIsEmpty) {
                a();
            }
        }
        return zAdd;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        c();
        int size = this.f117658c.size();
        boolean zAddAll = this.f117658c.addAll(collection);
        if (zAddAll) {
            int size2 = this.f117658c.size();
            a0 a0Var = this.f117661f;
            a0Var.f108503g = (size2 - size) + a0Var.f108503g;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    public final Collection b() {
        return this.f117658c;
    }

    public final void c() {
        Collection collection;
        x xVar = this.f117659d;
        if (xVar != null) {
            xVar.c();
            if (this.f117659d.f117658c != this.f117660e) {
                throw new ConcurrentModificationException();
            }
        } else {
            if (!this.f117658c.isEmpty() || (collection = (Collection) this.f117661f.f108502f.get(this.f117657b)) == null) {
                return;
            }
            this.f117658c = collection;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        c();
        int size = this.f117658c.size();
        if (size == 0) {
            return;
        }
        this.f117658c.clear();
        this.f117661f.f108503g -= size;
        d();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        c();
        return this.f117658c.contains(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        c();
        return this.f117658c.containsAll(collection);
    }

    public final void d() {
        x xVar = this.f117659d;
        if (xVar != null) {
            xVar.d();
        } else if (this.f117658c.isEmpty()) {
            this.f117661f.f108502f.remove(this.f117657b);
        }
    }

    @Override // java.util.Collection
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        c();
        return this.f117658c.equals(obj);
    }

    @Override // java.util.Collection
    public final int hashCode() {
        c();
        return this.f117658c.hashCode();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        c();
        return new w(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        c();
        boolean zRemove = this.f117658c.remove(obj);
        if (zRemove) {
            a0 a0Var = this.f117661f;
            a0Var.f108503g--;
            d();
        }
        return zRemove;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        c();
        int size = this.f117658c.size();
        boolean zRemoveAll = this.f117658c.removeAll(collection);
        if (zRemoveAll) {
            int size2 = this.f117658c.size();
            a0 a0Var = this.f117661f;
            a0Var.f108503g = (size2 - size) + a0Var.f108503g;
            d();
        }
        return zRemoveAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        collection.getClass();
        c();
        int size = this.f117658c.size();
        boolean zRetainAll = this.f117658c.retainAll(collection);
        if (zRetainAll) {
            int size2 = this.f117658c.size();
            a0 a0Var = this.f117661f;
            a0Var.f108503g = (size2 - size) + a0Var.f108503g;
            d();
        }
        return zRetainAll;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        c();
        return this.f117658c.size();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        c();
        return this.f117658c.toString();
    }
}
