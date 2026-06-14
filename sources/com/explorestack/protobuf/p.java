package com.explorestack.protobuf;

import com.explorestack.protobuf.j0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes7.dex */
final class p extends c implements j0.b, RandomAccess, q1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final p f19300e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private double[] f19301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19302d;

    static {
        p pVar = new p(new double[0], 0);
        f19300e = pVar;
        pVar.makeImmutable();
    }

    p() {
        this(new double[10], 0);
    }

    private void i(int i10, double d10) {
        int i11;
        e();
        if (i10 < 0 || i10 > (i11 = this.f19302d)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        double[] dArr = this.f19301c;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f19301c, i10, dArr2, i10 + 1, this.f19302d - i10);
            this.f19301c = dArr2;
        }
        this.f19301c[i10] = d10;
        this.f19302d++;
        ((AbstractList) this).modCount++;
    }

    public static p j() {
        return f19300e;
    }

    private void k(int i10) {
        if (i10 < 0 || i10 >= this.f19302d) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    private String m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f19302d;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        e();
        j0.a(collection);
        if (!(collection instanceof p)) {
            return super.addAll(collection);
        }
        p pVar = (p) collection;
        int i10 = pVar.f19302d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f19302d;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f19301c;
        if (i12 > dArr.length) {
            this.f19301c = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(pVar.f19301c, 0, this.f19301c, this.f19302d, pVar.f19302d);
        this.f19302d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.explorestack.protobuf.j0.b
    public void addDouble(double d10) {
        e();
        int i10 = this.f19302d;
        double[] dArr = this.f19301c;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f19301c = dArr2;
        }
        double[] dArr3 = this.f19301c;
        int i11 = this.f19302d;
        this.f19302d = i11 + 1;
        dArr3[i11] = d10;
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
        if (!(obj instanceof p)) {
            return super.equals(obj);
        }
        p pVar = (p) obj;
        if (this.f19302d != pVar.f19302d) {
            return false;
        }
        double[] dArr = pVar.f19301c;
        for (int i10 = 0; i10 < this.f19302d; i10++) {
            if (Double.doubleToLongBits(this.f19301c[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Double d10) {
        i(i10, d10.doubleValue());
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Double d10) {
        addDouble(d10.doubleValue());
        return true;
    }

    @Override // com.explorestack.protobuf.j0.b
    public double getDouble(int i10) {
        k(i10);
        return this.f19301c[i10];
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f19302d; i11++) {
            i10 = (i10 * 31) + j0.i(Double.doubleToLongBits(this.f19301c[i11]));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f19301c[i10] == dDoubleValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Double get(int i10) {
        return Double.valueOf(getDouble(i10));
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Double remove(int i10) {
        e();
        k(i10);
        double[] dArr = this.f19301c;
        double d10 = dArr[i10];
        if (i10 < this.f19302d - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (r3 - i10) - 1);
        }
        this.f19302d--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Double set(int i10, Double d10) {
        return Double.valueOf(setDouble(i10, d10.doubleValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        e();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f19301c;
        System.arraycopy(dArr, i11, dArr, i10, this.f19302d - i11);
        this.f19302d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.explorestack.protobuf.j0.b
    public double setDouble(int i10, double d10) {
        e();
        k(i10);
        double[] dArr = this.f19301c;
        double d11 = dArr[i10];
        dArr[i10] = d10;
        return d11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19302d;
    }

    private p(double[] dArr, int i10) {
        this.f19301c = dArr;
        this.f19302d = i10;
    }

    @Override // com.explorestack.protobuf.j0.j, com.explorestack.protobuf.j0.f
    public j0.b mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f19302d) {
            return new p(Arrays.copyOf(this.f19301c, i10), this.f19302d);
        }
        throw new IllegalArgumentException();
    }
}
