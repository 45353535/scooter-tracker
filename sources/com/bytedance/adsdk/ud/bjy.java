package com.bytedance.adsdk.ud;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
abstract class bjy<K, V> {

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    bjy<K, V>.ud f15980ud;

    final class qdl<T> implements Iterator<T> {
        int lnr;
        boolean mml = false;
        final int qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        int f15981ud;

        qdl(int i10) {
            this.qdl = i10;
            this.f15981ud = bjy.this.qdl();
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.lnr < this.f15981ud;
        }

        @Override // java.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t10 = (T) bjy.this.qdl(this.lnr, this.qdl);
            this.lnr++;
            this.mml = true;
            return t10;
        }

        @Override // java.util.Iterator
        public void remove() {
            if (!this.mml) {
                throw new IllegalStateException();
            }
            int i10 = this.lnr - 1;
            this.lnr = i10;
            this.f15981ud--;
            this.mml = false;
            bjy.this.qdl(i10);
        }
    }

    final class ud implements Set<K> {
        ud() {
        }

        @Override // java.util.Set, java.util.Collection
        public boolean add(K k10) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection
        public void clear() {
            bjy.this.lnr();
        }

        @Override // java.util.Set, java.util.Collection
        public boolean contains(Object obj) {
            return bjy.this.qdl(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean containsAll(Collection<?> collection) {
            return bjy.qdl(bjy.this.ud(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean equals(Object obj) {
            return bjy.qdl(this, obj);
        }

        @Override // java.util.Set, java.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iQdl = bjy.this.qdl() - 1; iQdl >= 0; iQdl--) {
                Object objQdl = bjy.this.qdl(iQdl, 0);
                iHashCode += objQdl == null ? 0 : objQdl.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean isEmpty() {
            return bjy.this.qdl() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable
        public Iterator<K> iterator() {
            return new qdl(0);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean remove(Object obj) {
            int iQdl = bjy.this.qdl(obj);
            if (iQdl < 0) {
                return false;
            }
            bjy.this.qdl(iQdl);
            return true;
        }

        @Override // java.util.Set, java.util.Collection
        public boolean removeAll(Collection<?> collection) {
            return bjy.ud(bjy.this.ud(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public boolean retainAll(Collection<?> collection) {
            return bjy.lnr(bjy.this.ud(), collection);
        }

        @Override // java.util.Set, java.util.Collection
        public int size() {
            return bjy.this.qdl();
        }

        @Override // java.util.Set, java.util.Collection
        public Object[] toArray() {
            return bjy.this.ud(0);
        }

        @Override // java.util.Set, java.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) bjy.this.qdl(tArr, 0);
        }
    }

    bjy() {
    }

    public static <K, V> boolean lnr(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    public static <K, V> boolean qdl(Map<K, V> map, Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <K, V> boolean ud(Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    protected abstract void lnr();

    public Set<K> mml() {
        if (this.f15980ud == null) {
            this.f15980ud = new ud();
        }
        return this.f15980ud;
    }

    protected abstract int qdl();

    protected abstract int qdl(Object obj);

    protected abstract Object qdl(int i10, int i11);

    protected abstract void qdl(int i10);

    protected abstract Map<K, V> ud();

    public <T> T[] qdl(T[] tArr, int i10) {
        int iQdl = qdl();
        if (tArr.length < iQdl) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iQdl));
        }
        for (int i11 = 0; i11 < iQdl; i11++) {
            tArr[i11] = qdl(i11, i10);
        }
        if (tArr.length > iQdl) {
            tArr[iQdl] = null;
        }
        return tArr;
    }

    public Object[] ud(int i10) {
        int iQdl = qdl();
        Object[] objArr = new Object[iQdl];
        for (int i11 = 0; i11 < iQdl; i11++) {
            objArr[i11] = qdl(i11, i10);
        }
        return objArr;
    }

    public static <T> boolean qdl(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }
}
