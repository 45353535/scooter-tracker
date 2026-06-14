package yads;

import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public abstract class vw extends AbstractCollection {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Collection f117211b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final je2 f117212c;

    public vw(Collection collection, je2 je2Var) {
        this.f117211b = collection;
        this.f117212c = je2Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        if (this.f117212c.apply(obj)) {
            return this.f117211b.add(obj);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!this.f117212c.apply(it.next())) {
                throw new IllegalArgumentException();
            }
        }
        return this.f117211b.addAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        Collection collection = this.f117211b;
        je2 je2Var = this.f117212c;
        if (!(collection instanceof RandomAccess) || !(collection instanceof List)) {
            Iterator it = collection.iterator();
            je2Var.getClass();
            while (it.hasNext()) {
                if (je2Var.apply(it.next())) {
                    it.remove();
                }
            }
            return;
        }
        List list = (List) collection;
        je2Var.getClass();
        int i10 = 0;
        for (int i11 = 0; i11 < list.size(); i11++) {
            Object obj = list.get(i11);
            if (!je2Var.apply(obj)) {
                if (i11 > i10) {
                    try {
                        list.set(i10, obj);
                    } catch (IllegalArgumentException unused) {
                        for (int size = list.size() - 1; size > i11; size--) {
                            if (je2Var.apply(list.get(size))) {
                                list.remove(size);
                            }
                        }
                        for (int i12 = i11 - 1; i12 >= i10; i12--) {
                            list.remove(i12);
                        }
                        return;
                    } catch (UnsupportedOperationException unused2) {
                        for (int size2 = list.size() - 1; size2 > i11; size2--) {
                            if (je2Var.apply(list.get(size2))) {
                                list.remove(size2);
                            }
                        }
                        for (int i13 = i11 - 1; i13 >= i10; i13--) {
                            list.remove(i13);
                        }
                        return;
                    }
                }
                i10++;
            }
        }
        list.subList(i10, list.size()).clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        Collection collection = this.f117211b;
        collection.getClass();
        try {
            if (collection.contains(obj)) {
                return this.f117212c.apply(obj);
            }
            return false;
        } catch (ClassCastException | NullPointerException unused) {
            return false;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean containsAll(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean isEmpty() {
        Collection collection = this.f117211b;
        je2 je2Var = this.f117212c;
        Iterator it = collection.iterator();
        if (je2Var == null) {
            throw new NullPointerException("predicate");
        }
        boolean z10 = false;
        int i10 = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            if (!je2Var.apply(it.next())) {
                i10++;
            } else if (i10 != -1) {
                z10 = true;
            }
        }
        return !z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        Iterator it = this.f117211b.iterator();
        je2 je2Var = this.f117212c;
        it.getClass();
        je2Var.getClass();
        return new hc1(it, je2Var);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        return contains(obj) && this.f117211b.remove(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        Iterator it = this.f117211b.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f117212c.apply(next) && collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        Iterator it = this.f117211b.iterator();
        boolean z10 = false;
        while (it.hasNext()) {
            Object next = it.next();
            if (this.f117212c.apply(next) && !collection.contains(next)) {
                it.remove();
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final int size() {
        Iterator it = this.f117211b.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (this.f117212c.apply(it.next())) {
                i10++;
            }
        }
        return i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        hc1 hc1Var = (hc1) iterator();
        ArrayList arrayList = new ArrayList();
        while (hc1Var.hasNext()) {
            arrayList.add(hc1Var.next());
        }
        return arrayList.toArray();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        hc1 hc1Var = (hc1) iterator();
        ArrayList arrayList = new ArrayList();
        while (hc1Var.hasNext()) {
            arrayList.add(hc1Var.next());
        }
        return arrayList.toArray(objArr);
    }
}
