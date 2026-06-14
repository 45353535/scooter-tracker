package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes7.dex */
public final class d0 extends c implements c1, RandomAccess, n2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final d0 f23454d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double[] f23455b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23456c;

    static {
        d0 d0Var = new d0(new double[0], 0);
        f23454d = d0Var;
        d0Var.f23446a = false;
    }

    public d0() {
        this.f23455b = new double[10];
        this.f23456c = 0;
    }

    public final void a(double d10) {
        c();
        int i10 = this.f23456c;
        double[] dArr = this.f23455b;
        if (i10 == dArr.length) {
            double[] dArr2 = new double[((i10 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            this.f23455b = dArr2;
        }
        double[] dArr3 = this.f23455b;
        int i11 = this.f23456c;
        this.f23456c = i11 + 1;
        dArr3[i11] = d10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f23456c)) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
            sbA.append(this.f23456c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        double[] dArr = this.f23455b;
        if (i11 < dArr.length) {
            System.arraycopy(dArr, i10, dArr, i10 + 1, i11 - i10);
        } else {
            double[] dArr2 = new double[((i11 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i10);
            System.arraycopy(this.f23455b, i10, dArr2, i10 + 1, this.f23456c - i10);
            this.f23455b = dArr2;
        }
        this.f23455b[i10] = dDoubleValue;
        this.f23456c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = l1.f23521a;
        collection.getClass();
        if (!(collection instanceof d0)) {
            return super.addAll(collection);
        }
        d0 d0Var = (d0) collection;
        int i10 = d0Var.f23456c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f23456c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        double[] dArr = this.f23455b;
        if (i12 > dArr.length) {
            this.f23455b = Arrays.copyOf(dArr, i12);
        }
        System.arraycopy(d0Var.f23455b, 0, this.f23455b, this.f23456c, d0Var.f23456c);
        this.f23456c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final d0 b(int i10) {
        if (i10 >= this.f23456c) {
            return new d0(Arrays.copyOf(this.f23455b, i10), this.f23456c);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d0)) {
            return super.equals(obj);
        }
        d0 d0Var = (d0) obj;
        if (this.f23456c != d0Var.f23456c) {
            return false;
        }
        double[] dArr = d0Var.f23455b;
        for (int i10 = 0; i10 < this.f23456c; i10++) {
            if (Double.doubleToLongBits(this.f23455b[i10]) != Double.doubleToLongBits(dArr[i10])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        if (i10 >= 0 && i10 < this.f23456c) {
            return Double.valueOf(this.f23455b[i10]);
        }
        StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
        sbA.append(this.f23456c);
        throw new IndexOutOfBoundsException(sbA.toString());
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f23456c; i11++) {
            long jDoubleToLongBits = Double.doubleToLongBits(this.f23455b[i11]);
            Charset charset = l1.f23521a;
            i10 = (i10 * 31) + ((int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i10 = this.f23456c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f23455b[i11] == dDoubleValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        int i11;
        c();
        if (i10 < 0 || i10 >= (i11 = this.f23456c)) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
            sbA.append(this.f23456c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        double[] dArr = this.f23455b;
        double d10 = dArr[i10];
        if (i10 < i11 - 1) {
            System.arraycopy(dArr, i10 + 1, dArr, i10, (i11 - i10) - 1);
        }
        this.f23456c--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f23455b;
        System.arraycopy(dArr, i11, dArr, i10, this.f23456c - i11);
        this.f23456c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        c();
        if (i10 < 0 || i10 >= this.f23456c) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
            sbA.append(this.f23456c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        double[] dArr = this.f23455b;
        double d10 = dArr[i10];
        dArr[i10] = dDoubleValue;
        return Double.valueOf(d10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23456c;
    }

    public d0(double[] dArr, int i10) {
        this.f23455b = dArr;
        this.f23456c = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a(((Double) obj).doubleValue());
        return true;
    }
}
