package com.explorestack.protobuf;

import com.explorestack.protobuf.j0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes7.dex */
final class h extends c implements j0.a, RandomAccess, q1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final h f19048e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean[] f19049c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19050d;

    static {
        h hVar = new h(new boolean[0], 0);
        f19048e = hVar;
        hVar.makeImmutable();
    }

    h() {
        this(new boolean[10], 0);
    }

    private void i(int i10, boolean z10) {
        int i11;
        e();
        if (i10 < 0 || i10 > (i11 = this.f19050d)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        boolean[] zArr = this.f19049c;
        if (i11 < zArr.length) {
            System.arraycopy(zArr, i10, zArr, i10 + 1, i11 - i10);
        } else {
            boolean[] zArr2 = new boolean[((i11 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            System.arraycopy(this.f19049c, i10, zArr2, i10 + 1, this.f19050d - i10);
            this.f19049c = zArr2;
        }
        this.f19049c[i10] = z10;
        this.f19050d++;
        ((AbstractList) this).modCount++;
    }

    public static h j() {
        return f19048e;
    }

    private void k(int i10) {
        if (i10 < 0 || i10 >= this.f19050d) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    private String m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f19050d;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        e();
        j0.a(collection);
        if (!(collection instanceof h)) {
            return super.addAll(collection);
        }
        h hVar = (h) collection;
        int i10 = hVar.f19050d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f19050d;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        boolean[] zArr = this.f19049c;
        if (i12 > zArr.length) {
            this.f19049c = Arrays.copyOf(zArr, i12);
        }
        System.arraycopy(hVar.f19049c, 0, this.f19049c, this.f19050d, hVar.f19050d);
        this.f19050d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void addBoolean(boolean z10) {
        e();
        int i10 = this.f19050d;
        boolean[] zArr = this.f19049c;
        if (i10 == zArr.length) {
            boolean[] zArr2 = new boolean[((i10 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i10);
            this.f19049c = zArr2;
        }
        boolean[] zArr3 = this.f19049c;
        int i11 = this.f19050d;
        this.f19050d = i11 + 1;
        zArr3[i11] = z10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return super.equals(obj);
        }
        h hVar = (h) obj;
        if (this.f19050d != hVar.f19050d) {
            return false;
        }
        boolean[] zArr = hVar.f19049c;
        for (int i10 = 0; i10 < this.f19050d; i10++) {
            if (this.f19049c[i10] != zArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Boolean bool) {
        i(i10, bool.booleanValue());
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Boolean bool) {
        addBoolean(bool.booleanValue());
        return true;
    }

    public boolean getBoolean(int i10) {
        k(i10);
        return this.f19049c[i10];
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iD = 1;
        for (int i10 = 0; i10 < this.f19050d; i10++) {
            iD = (iD * 31) + j0.d(this.f19049c[i10]);
        }
        return iD;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f19049c[i10] == zBooleanValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Boolean get(int i10) {
        return Boolean.valueOf(getBoolean(i10));
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Boolean remove(int i10) {
        e();
        k(i10);
        boolean[] zArr = this.f19049c;
        boolean z10 = zArr[i10];
        if (i10 < this.f19050d - 1) {
            System.arraycopy(zArr, i10 + 1, zArr, i10, (r2 - i10) - 1);
        }
        this.f19050d--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Boolean set(int i10, Boolean bool) {
        return Boolean.valueOf(setBoolean(i10, bool.booleanValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        e();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f19049c;
        System.arraycopy(zArr, i11, zArr, i10, this.f19050d - i11);
        this.f19050d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    public boolean setBoolean(int i10, boolean z10) {
        e();
        k(i10);
        boolean[] zArr = this.f19049c;
        boolean z11 = zArr[i10];
        zArr[i10] = z10;
        return z11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19050d;
    }

    private h(boolean[] zArr, int i10) {
        this.f19049c = zArr;
        this.f19050d = i10;
    }

    @Override // com.explorestack.protobuf.j0.j, com.explorestack.protobuf.j0.f
    public j0.a mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f19050d) {
            return new h(Arrays.copyOf(this.f19049c, i10), this.f19050d);
        }
        throw new IllegalArgumentException();
    }
}
