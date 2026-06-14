package com.bytedance.adsdk.ud;

import com.applovin.impl.sdk.utils.JsonUtils;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes6.dex */
public final class qdl<E> implements Collection<E>, Set<E> {
    private static int jpc;
    private static final int[] lnr = new int[0];
    private static final Object[] mml = new Object[0];
    private static int mo;
    private static Object[] mzz;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private static Object[] f16076wd;
    Object[] qdl;
    private bjy<E, E> to;
    private int[] tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    int f16077ud;

    public qdl() {
        this(0);
    }

    private void mml(int i10) {
        if (i10 == 8) {
            synchronized (qdl.class) {
                Object[] objArr = f16076wd;
                if (objArr != null) {
                    this.qdl = objArr;
                    f16076wd = (Object[]) objArr[0];
                    this.tvp = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    jpc--;
                    return;
                }
            }
        } else if (i10 == 4) {
            synchronized (qdl.class) {
                Object[] objArr2 = mzz;
                if (objArr2 != null) {
                    this.qdl = objArr2;
                    mzz = (Object[]) objArr2[0];
                    this.tvp = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    mo--;
                    return;
                }
            }
        }
        this.tvp = new int[i10];
        this.qdl = new Object[i10];
    }

    private int qdl(Object obj, int i10) {
        int i11 = this.f16077ud;
        if (i11 == 0) {
            return -1;
        }
        int iQdl = ud.qdl(this.tvp, i11, i10);
        if (iQdl < 0 || obj.equals(this.qdl[iQdl])) {
            return iQdl;
        }
        int i12 = iQdl + 1;
        while (i12 < i11 && this.tvp[i12] == i10) {
            if (obj.equals(this.qdl[i12])) {
                return i12;
            }
            i12++;
        }
        for (int i13 = iQdl - 1; i13 >= 0 && this.tvp[i13] == i10; i13--) {
            if (obj.equals(this.qdl[i13])) {
                return i13;
            }
        }
        return ~i12;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean add(E e10) {
        int i10;
        int iQdl;
        if (e10 == null) {
            iQdl = qdl();
            i10 = 0;
        } else {
            int iHashCode = e10.hashCode();
            i10 = iHashCode;
            iQdl = qdl(e10, iHashCode);
        }
        if (iQdl >= 0) {
            return false;
        }
        int i11 = ~iQdl;
        int i12 = this.f16077ud;
        int[] iArr = this.tvp;
        if (i12 >= iArr.length) {
            int i13 = 8;
            if (i12 >= 8) {
                i13 = (i12 >> 1) + i12;
            } else if (i12 < 4) {
                i13 = 4;
            }
            Object[] objArr = this.qdl;
            mml(i13);
            int[] iArr2 = this.tvp;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.qdl, 0, objArr.length);
            }
            qdl(iArr, objArr, this.f16077ud);
        }
        int i14 = this.f16077ud;
        if (i11 < i14) {
            int[] iArr3 = this.tvp;
            int i15 = i11 + 1;
            System.arraycopy(iArr3, i11, iArr3, i15, i14 - i11);
            Object[] objArr2 = this.qdl;
            System.arraycopy(objArr2, i11, objArr2, i15, this.f16077ud - i11);
        }
        this.tvp[i11] = i10;
        this.qdl[i11] = e10;
        this.f16077ud++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        qdl(this.f16077ud + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    @Override // java.util.Collection, java.util.Set
    public void clear() {
        int i10 = this.f16077ud;
        if (i10 != 0) {
            qdl(this.tvp, this.qdl, i10);
            this.tvp = lnr;
            this.qdl = mml;
            this.f16077ud = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return qdl(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i10 = 0; i10 < this.f16077ud; i10++) {
                try {
                    if (!set.contains(ud(i10))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        int[] iArr = this.tvp;
        int i10 = this.f16077ud;
        int i11 = 0;
        for (int i12 = 0; i12 < i10; i12++) {
            i11 += iArr[i12];
        }
        return i11;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean isEmpty() {
        return this.f16077ud <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set
    public Iterator<E> iterator() {
        return ud().mml().iterator();
    }

    public E lnr(int i10) {
        Object[] objArr = this.qdl;
        E e10 = (E) objArr[i10];
        int i11 = this.f16077ud;
        if (i11 <= 1) {
            qdl(this.tvp, objArr, i11);
            this.tvp = lnr;
            this.qdl = mml;
            this.f16077ud = 0;
            return e10;
        }
        int[] iArr = this.tvp;
        if (iArr.length <= 8 || i11 >= iArr.length / 3) {
            int i12 = i11 - 1;
            this.f16077ud = i12;
            if (i10 < i12) {
                int i13 = i10 + 1;
                System.arraycopy(iArr, i13, iArr, i10, i12 - i10);
                Object[] objArr2 = this.qdl;
                System.arraycopy(objArr2, i13, objArr2, i10, this.f16077ud - i10);
            }
            this.qdl[this.f16077ud] = null;
            return e10;
        }
        mml(i11 > 8 ? i11 + (i11 >> 1) : 8);
        this.f16077ud--;
        if (i10 > 0) {
            System.arraycopy(iArr, 0, this.tvp, 0, i10);
            System.arraycopy(objArr, 0, this.qdl, 0, i10);
        }
        int i14 = this.f16077ud;
        if (i10 < i14) {
            int i15 = i10 + 1;
            System.arraycopy(iArr, i15, this.tvp, i10, i14 - i10);
            System.arraycopy(objArr, i15, this.qdl, i10, this.f16077ud - i10);
        }
        return e10;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean remove(Object obj) {
        int iQdl = qdl(obj);
        if (iQdl < 0) {
            return false;
        }
        lnr(iQdl);
        return true;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // java.util.Collection, java.util.Set
    public boolean retainAll(Collection<?> collection) {
        boolean z10 = false;
        for (int i10 = this.f16077ud - 1; i10 >= 0; i10--) {
            if (!collection.contains(this.qdl[i10])) {
                lnr(i10);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // java.util.Collection, java.util.Set
    public int size() {
        return this.f16077ud;
    }

    @Override // java.util.Collection, java.util.Set
    public Object[] toArray() {
        int i10 = this.f16077ud;
        Object[] objArr = new Object[i10];
        System.arraycopy(this.qdl, 0, objArr, 0, i10);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return JsonUtils.EMPTY_JSON;
        }
        StringBuilder sb2 = new StringBuilder(this.f16077ud * 14);
        sb2.append('{');
        for (int i10 = 0; i10 < this.f16077ud; i10++) {
            if (i10 > 0) {
                sb2.append(", ");
            }
            E eUd = ud(i10);
            if (eUd != this) {
                sb2.append(eUd);
            } else {
                sb2.append("(this Set)");
            }
        }
        sb2.append('}');
        return sb2.toString();
    }

    public E ud(int i10) {
        return (E) this.qdl[i10];
    }

    public qdl(int i10) {
        if (i10 == 0) {
            this.tvp = lnr;
            this.qdl = mml;
        } else {
            mml(i10);
        }
        this.f16077ud = 0;
    }

    private bjy<E, E> ud() {
        if (this.to == null) {
            this.to = new bjy<E, E>() { // from class: com.bytedance.adsdk.ud.qdl.1
                @Override // com.bytedance.adsdk.ud.bjy
                protected void lnr() {
                    qdl.this.clear();
                }

                @Override // com.bytedance.adsdk.ud.bjy
                protected int qdl() {
                    return qdl.this.f16077ud;
                }

                @Override // com.bytedance.adsdk.ud.bjy
                protected Map<E, E> ud() {
                    throw new UnsupportedOperationException("not a map");
                }

                @Override // com.bytedance.adsdk.ud.bjy
                protected Object qdl(int i10, int i11) {
                    return qdl.this.qdl[i10];
                }

                @Override // com.bytedance.adsdk.ud.bjy
                protected int qdl(Object obj) {
                    return qdl.this.qdl(obj);
                }

                @Override // com.bytedance.adsdk.ud.bjy
                protected void qdl(int i10) {
                    qdl.this.lnr(i10);
                }
            };
        }
        return this.to;
    }

    @Override // java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f16077ud) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f16077ud));
        }
        System.arraycopy(this.qdl, 0, tArr, 0, this.f16077ud);
        int length = tArr.length;
        int i10 = this.f16077ud;
        if (length > i10) {
            tArr[i10] = null;
        }
        return tArr;
    }

    private int qdl() {
        int i10 = this.f16077ud;
        if (i10 == 0) {
            return -1;
        }
        int iQdl = ud.qdl(this.tvp, i10, 0);
        if (iQdl < 0 || this.qdl[iQdl] == null) {
            return iQdl;
        }
        int i11 = iQdl + 1;
        while (i11 < i10 && this.tvp[i11] == 0) {
            if (this.qdl[i11] == null) {
                return i11;
            }
            i11++;
        }
        for (int i12 = iQdl - 1; i12 >= 0 && this.tvp[i12] == 0; i12--) {
            if (this.qdl[i12] == null) {
                return i12;
            }
        }
        return ~i11;
    }

    private static void qdl(int[] iArr, Object[] objArr, int i10) {
        if (iArr.length == 8) {
            synchronized (qdl.class) {
                try {
                    if (jpc < 10) {
                        objArr[0] = f16076wd;
                        objArr[1] = iArr;
                        for (int i11 = i10 - 1; i11 >= 2; i11--) {
                            objArr[i11] = null;
                        }
                        f16076wd = objArr;
                        jpc++;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (qdl.class) {
                try {
                    if (mo < 10) {
                        objArr[0] = mzz;
                        objArr[1] = iArr;
                        for (int i12 = i10 - 1; i12 >= 2; i12--) {
                            objArr[i12] = null;
                        }
                        mzz = objArr;
                        mo++;
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
    }

    public void qdl(int i10) {
        int[] iArr = this.tvp;
        if (iArr.length < i10) {
            Object[] objArr = this.qdl;
            mml(i10);
            int i11 = this.f16077ud;
            if (i11 > 0) {
                System.arraycopy(iArr, 0, this.tvp, 0, i11);
                System.arraycopy(objArr, 0, this.qdl, 0, this.f16077ud);
            }
            qdl(iArr, objArr, this.f16077ud);
        }
    }

    public int qdl(Object obj) {
        return obj == null ? qdl() : qdl(obj, obj.hashCode());
    }
}
