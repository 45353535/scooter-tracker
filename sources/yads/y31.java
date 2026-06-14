package yads;

import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y31 extends s31 implements List, RandomAccess {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v31 f118068c = new v31(0, nk2.f113952f);

    public static nk2 b(int i10, Object[] objArr) {
        return i10 == 0 ? nk2.f113952f : new nk2(i10, objArr);
    }

    public static u31 f() {
        return new u31();
    }

    public static nk2 g() {
        return nk2.f113952f;
    }

    private void readObject(ObjectInputStream objectInputStream) throws InvalidObjectException {
        throw new InvalidObjectException("Use SerializedForm");
    }

    @Override // yads.s31
    public final y31 a() {
        return this;
    }

    @Override // java.util.List
    public final void add(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final boolean addAll(int i10, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // yads.s31, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof List) {
                List list = (List) obj;
                int size = size();
                if (size == list.size()) {
                    if (!(list instanceof RandomAccess)) {
                        Iterator it = iterator();
                        Iterator it2 = list.iterator();
                        while (it.hasNext()) {
                            if (it2.hasNext() && y72.a(it.next(), it2.next())) {
                            }
                        }
                        return !it2.hasNext();
                    }
                    for (int i10 = 0; i10 < size; i10++) {
                        if (y72.a(get(i10), list.get(i10))) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i10 = 1;
        for (int i11 = 0; i11 < size; i11++) {
            i10 = ~(~(get(i11).hashCode() + (i10 * 31)));
        }
        return i10;
    }

    @Override // java.util.List
    public final int indexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (obj.equals(get(i10))) {
                return i10;
            }
        }
        return -1;
    }

    @Override // yads.s31, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    public ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final Object remove(int i10) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    public final Object set(int i10, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // yads.s31
    public Object writeReplace() {
        return new w31(toArray(s31.f115679b));
    }

    public static nk2 a(Object... objArr) {
        int length = objArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (objArr[i10] == null) {
                throw new NullPointerException(he2.a("at index ", i10));
            }
        }
        return b(objArr.length, objArr);
    }

    @Override // yads.s31, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final w73 iterator() {
        return listIterator(0);
    }

    public static nk2 b(Object[] objArr) {
        if (objArr.length == 0) {
            return nk2.f113952f;
        }
        return a((Object[]) objArr.clone());
    }

    @Override // yads.s31
    public int a(int i10, Object[] objArr) {
        int size = size();
        for (int i11 = 0; i11 < size; i11++) {
            objArr[i10 + i11] = get(i11);
        }
        return i10 + size;
    }

    public static y31 a(Collection collection) {
        if (collection instanceof s31) {
            y31 y31VarA = ((s31) collection).a();
            if (!y31VarA.e()) {
                return y31VarA;
            }
            Object[] array = y31VarA.toArray(s31.f115679b);
            return b(array.length, array);
        }
        return a(collection.toArray());
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public final v31 listIterator(int i10) {
        ie2.b(i10, size());
        if (isEmpty()) {
            return f118068c;
        }
        return new v31(i10, this);
    }

    public static nk2 a(Object obj) {
        return a(obj);
    }

    @Override // java.util.List
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public y31 subList(int i10, int i11) {
        ie2.a(i10, i11, size());
        int i12 = i11 - i10;
        if (i12 == size()) {
            return this;
        }
        if (i12 == 0) {
            return nk2.f113952f;
        }
        return new x31(this, i10, i12);
    }
}
