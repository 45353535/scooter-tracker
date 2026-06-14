package j$.util;

import j$.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.function.UnaryOperator;

/* JADX INFO: renamed from: j$.util.h, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C5656h extends C5655g implements java.util.List, List {
    private static final long serialVersionUID = -7754090372962971524L;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final java.util.List f84939c;

    public C5656h(java.util.List list) {
        super(list);
        this.f84939c = list;
    }

    public C5656h(java.util.List list, Object obj) {
        super(list, obj);
        this.f84939c = list;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f84935b) {
            zEquals = this.f84939c.equals(obj);
        }
        return zEquals;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int iHashCode;
        synchronized (this.f84935b) {
            iHashCode = this.f84939c.hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        Object obj;
        synchronized (this.f84935b) {
            obj = this.f84939c.get(i10);
        }
        return obj;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        Object obj2;
        synchronized (this.f84935b) {
            obj2 = this.f84939c.set(i10, obj);
        }
        return obj2;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        synchronized (this.f84935b) {
            this.f84939c.add(i10, obj);
        }
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        Object objRemove;
        synchronized (this.f84935b) {
            objRemove = this.f84939c.remove(i10);
        }
        return objRemove;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        int iIndexOf;
        synchronized (this.f84935b) {
            iIndexOf = this.f84939c.indexOf(obj);
        }
        return iIndexOf;
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        int iLastIndexOf;
        synchronized (this.f84935b) {
            iLastIndexOf = this.f84939c.lastIndexOf(obj);
        }
        return iLastIndexOf;
    }

    @Override // java.util.List
    public final boolean addAll(int i10, java.util.Collection collection) {
        boolean zAddAll;
        synchronized (this.f84935b) {
            zAddAll = this.f84939c.addAll(i10, collection);
        }
        return zAddAll;
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        return this.f84939c.listIterator();
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        return this.f84939c.listIterator(i10);
    }

    @Override // java.util.List
    public java.util.List subList(int i10, int i11) {
        C5656h c5656h;
        synchronized (this.f84935b) {
            c5656h = new C5656h(this.f84939c.subList(i10, i11), this.f84935b);
        }
        return c5656h;
    }

    @Override // java.util.List, j$.util.List
    public final void replaceAll(UnaryOperator unaryOperator) {
        synchronized (this.f84935b) {
            java.util.List list = this.f84939c;
            if (list instanceof List) {
                ((List) list).replaceAll(unaryOperator);
            } else {
                List.CC.$default$replaceAll(list, unaryOperator);
            }
        }
    }

    @Override // java.util.List, j$.util.List
    public final void sort(java.util.Comparator comparator) {
        synchronized (this.f84935b) {
            List.EL.sort(this.f84939c, comparator);
        }
    }

    private Object readResolve() {
        java.util.List list = this.f84939c;
        return list instanceof RandomAccess ? new C5658j(list) : this;
    }
}
