package com.explorestack.protobuf;

import com.explorestack.protobuf.j0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes7.dex */
final class e0 extends c implements j0.f, RandomAccess, q1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final e0 f18980e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private float[] f18981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f18982d;

    static {
        e0 e0Var = new e0(new float[0], 0);
        f18980e = e0Var;
        e0Var.makeImmutable();
    }

    e0() {
        this(new float[10], 0);
    }

    private void i(int i10, float f10) {
        int i11;
        e();
        if (i10 < 0 || i10 > (i11 = this.f18982d)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        float[] fArr = this.f18981c;
        if (i11 < fArr.length) {
            System.arraycopy(fArr, i10, fArr, i10 + 1, i11 - i10);
        } else {
            float[] fArr2 = new float[((i11 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            System.arraycopy(this.f18981c, i10, fArr2, i10 + 1, this.f18982d - i10);
            this.f18981c = fArr2;
        }
        this.f18981c[i10] = f10;
        this.f18982d++;
        ((AbstractList) this).modCount++;
    }

    public static e0 j() {
        return f18980e;
    }

    private void k(int i10) {
        if (i10 < 0 || i10 >= this.f18982d) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    private String m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f18982d;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        e();
        j0.a(collection);
        if (!(collection instanceof e0)) {
            return super.addAll(collection);
        }
        e0 e0Var = (e0) collection;
        int i10 = e0Var.f18982d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f18982d;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        float[] fArr = this.f18981c;
        if (i12 > fArr.length) {
            this.f18981c = Arrays.copyOf(fArr, i12);
        }
        System.arraycopy(e0Var.f18981c, 0, this.f18981c, this.f18982d, e0Var.f18982d);
        this.f18982d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public void addFloat(float f10) {
        e();
        int i10 = this.f18982d;
        float[] fArr = this.f18981c;
        if (i10 == fArr.length) {
            float[] fArr2 = new float[((i10 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i10);
            this.f18981c = fArr2;
        }
        float[] fArr3 = this.f18981c;
        int i11 = this.f18982d;
        this.f18982d = i11 + 1;
        fArr3[i11] = f10;
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
        if (!(obj instanceof e0)) {
            return super.equals(obj);
        }
        e0 e0Var = (e0) obj;
        if (this.f18982d != e0Var.f18982d) {
            return false;
        }
        float[] fArr = e0Var.f18981c;
        for (int i10 = 0; i10 < this.f18982d; i10++) {
            if (Float.floatToIntBits(this.f18981c[i10]) != Float.floatToIntBits(fArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Float f10) {
        i(i10, f10.floatValue());
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Float f10) {
        addFloat(f10.floatValue());
        return true;
    }

    public float getFloat(int i10) {
        k(i10);
        return this.f18981c[i10];
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int iFloatToIntBits = 1;
        for (int i10 = 0; i10 < this.f18982d; i10++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f18981c[i10]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f18981c[i10] == fFloatValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Float get(int i10) {
        return Float.valueOf(getFloat(i10));
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Float remove(int i10) {
        e();
        k(i10);
        float[] fArr = this.f18981c;
        float f10 = fArr[i10];
        if (i10 < this.f18982d - 1) {
            System.arraycopy(fArr, i10 + 1, fArr, i10, (r2 - i10) - 1);
        }
        this.f18982d--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Float set(int i10, Float f10) {
        return Float.valueOf(setFloat(i10, f10.floatValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        e();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f18981c;
        System.arraycopy(fArr, i11, fArr, i10, this.f18982d - i11);
        this.f18982d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    public float setFloat(int i10, float f10) {
        e();
        k(i10);
        float[] fArr = this.f18981c;
        float f11 = fArr[i10];
        fArr[i10] = f10;
        return f11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f18982d;
    }

    private e0(float[] fArr, int i10) {
        this.f18981c = fArr;
        this.f18982d = i10;
    }

    @Override // com.explorestack.protobuf.j0.j, com.explorestack.protobuf.j0.f
    public j0.f mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f18982d) {
            return new e0(Arrays.copyOf(this.f18981c, i10), this.f18982d);
        }
        throw new IllegalArgumentException();
    }
}
