package com.explorestack.protobuf;

import com.explorestack.protobuf.j0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes7.dex */
final class i0 extends c implements j0.g, RandomAccess, q1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final i0 f19124e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int[] f19125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19126d;

    static {
        i0 i0Var = new i0(new int[0], 0);
        f19124e = i0Var;
        i0Var.makeImmutable();
    }

    i0() {
        this(new int[10], 0);
    }

    private void i(int i10, int i11) {
        int i12;
        e();
        if (i10 < 0 || i10 > (i12 = this.f19126d)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        int[] iArr = this.f19125c;
        if (i12 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i12 - i10);
        } else {
            int[] iArr2 = new int[((i12 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f19125c, i10, iArr2, i10 + 1, this.f19126d - i10);
            this.f19125c = iArr2;
        }
        this.f19125c[i10] = i11;
        this.f19126d++;
        ((AbstractList) this).modCount++;
    }

    public static i0 j() {
        return f19124e;
    }

    private void k(int i10) {
        if (i10 < 0 || i10 >= this.f19126d) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    private String m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f19126d;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        e();
        j0.a(collection);
        if (!(collection instanceof i0)) {
            return super.addAll(collection);
        }
        i0 i0Var = (i0) collection;
        int i10 = i0Var.f19126d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f19126d;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f19125c;
        if (i12 > iArr.length) {
            this.f19125c = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(i0Var.f19125c, 0, this.f19125c, this.f19126d, i0Var.f19126d);
        this.f19126d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.explorestack.protobuf.j0.g
    public void addInt(int i10) {
        e();
        int i11 = this.f19126d;
        int[] iArr = this.f19125c;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f19125c = iArr2;
        }
        int[] iArr3 = this.f19125c;
        int i12 = this.f19126d;
        this.f19126d = i12 + 1;
        iArr3[i12] = i10;
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
        if (!(obj instanceof i0)) {
            return super.equals(obj);
        }
        i0 i0Var = (i0) obj;
        if (this.f19126d != i0Var.f19126d) {
            return false;
        }
        int[] iArr = i0Var.f19125c;
        for (int i10 = 0; i10 < this.f19126d; i10++) {
            if (this.f19125c[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Integer num) {
        i(i10, num.intValue());
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Integer num) {
        addInt(num.intValue());
        return true;
    }

    @Override // com.explorestack.protobuf.j0.g
    public int getInt(int i10) {
        k(i10);
        return this.f19125c[i10];
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f19126d; i11++) {
            i10 = (i10 * 31) + this.f19125c[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f19125c[i10] == iIntValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Integer get(int i10) {
        return Integer.valueOf(getInt(i10));
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Integer remove(int i10) {
        e();
        k(i10);
        int[] iArr = this.f19125c;
        int i11 = iArr[i10];
        if (i10 < this.f19126d - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f19126d--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Integer set(int i10, Integer num) {
        return Integer.valueOf(setInt(i10, num.intValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        e();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f19125c;
        System.arraycopy(iArr, i11, iArr, i10, this.f19126d - i11);
        this.f19126d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.explorestack.protobuf.j0.g
    public int setInt(int i10, int i11) {
        e();
        k(i10);
        int[] iArr = this.f19125c;
        int i12 = iArr[i10];
        iArr[i10] = i11;
        return i12;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19126d;
    }

    private i0(int[] iArr, int i10) {
        this.f19125c = iArr;
        this.f19126d = i10;
    }

    @Override // com.explorestack.protobuf.j0.j, com.explorestack.protobuf.j0.f
    public j0.g mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f19126d) {
            return new i0(Arrays.copyOf(this.f19125c, i10), this.f19126d);
        }
        throw new IllegalArgumentException();
    }
}
