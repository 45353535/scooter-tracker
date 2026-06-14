package yads;

import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public class z extends x implements List {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ a0 f118473g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(a0 a0Var, Object obj, List list, x xVar) {
        super(a0Var, obj, list, xVar);
        this.f118473g = a0Var;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        c();
        boolean zIsEmpty = this.f117658c.isEmpty();
        ((List) this.f117658c).add(i10, obj);
        this.f118473g.f108503g++;
        if (zIsEmpty) {
            a();
        }
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        if (collection.isEmpty()) {
            return false;
        }
        c();
        int size = this.f117658c.size();
        boolean zAddAll = ((List) this.f117658c).addAll(i10, collection);
        if (zAddAll) {
            int size2 = this.f117658c.size();
            a0 a0Var = this.f118473g;
            a0Var.f108503g = (size2 - size) + a0Var.f108503g;
            if (size == 0) {
                a();
            }
        }
        return zAddAll;
    }

    public final List e() {
        return (List) this.f117658c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        c();
        return ((List) this.f117658c).get(i10);
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        c();
        return ((List) this.f117658c).indexOf(obj);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        c();
        return ((List) this.f117658c).lastIndexOf(obj);
    }

    @Override // java.util.List
    public final ListIterator listIterator() {
        c();
        return new y(this);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        c();
        Object objRemove = ((List) this.f117658c).remove(i10);
        a0 a0Var = this.f118473g;
        a0Var.f108503g--;
        d();
        return objRemove;
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        c();
        return ((List) this.f117658c).set(i10, obj);
    }

    @Override // java.util.List
    public final List subList(int i10, int i11) {
        c();
        a0 a0Var = this.f118473g;
        Object obj = this.f117657b;
        List listSubList = ((List) this.f117658c).subList(i10, i11);
        x xVar = this.f117659d;
        if (xVar == null) {
            xVar = this;
        }
        a0Var.getClass();
        return listSubList instanceof RandomAccess ? new t(a0Var, obj, listSubList, xVar) : new z(a0Var, obj, listSubList, xVar);
    }

    @Override // java.util.List
    public final ListIterator listIterator(int i10) {
        c();
        return new y(this, i10);
    }
}
