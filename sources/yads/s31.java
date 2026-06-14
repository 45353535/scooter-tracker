package yads;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Collection;

/* JADX INFO: loaded from: classes4.dex */
public abstract class s31 extends AbstractCollection implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Object[] f115679b = new Object[0];

    public abstract int a(int i10, Object[] objArr);

    public abstract y31 a();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    public Object[] b() {
        return null;
    }

    public int c() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public abstract boolean contains(Object obj);

    public int d() {
        throw new UnsupportedOperationException();
    }

    public abstract boolean e();

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public abstract w73 iterator();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(f115679b);
    }

    public Object writeReplace() {
        return new w31(toArray(f115679b));
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray(Object[] objArr) {
        objArr.getClass();
        int size = size();
        if (objArr.length < size) {
            Object[] objArrB = b();
            if (objArrB != null) {
                return wb2.a(objArrB, d(), c(), objArr);
            }
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        } else if (objArr.length > size) {
            objArr[size] = null;
        }
        a(0, objArr);
        return objArr;
    }
}
