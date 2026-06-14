package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes7.dex */
public final class a1 extends c implements g1, RandomAccess, n2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a1 f23433d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f23434b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23435c;

    static {
        a1 a1Var = new a1(new int[0], 0);
        f23433d = a1Var;
        a1Var.f23446a = false;
    }

    public a1() {
        this.f23434b = new int[10];
        this.f23435c = 0;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        int iIntValue = ((Integer) obj).intValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f23435c)) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
            sbA.append(this.f23435c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        int[] iArr = this.f23434b;
        if (i11 < iArr.length) {
            System.arraycopy(iArr, i10, iArr, i10 + 1, i11 - i10);
        } else {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            System.arraycopy(this.f23434b, i10, iArr2, i10 + 1, this.f23435c - i10);
            this.f23434b = iArr2;
        }
        this.f23434b[i10] = iIntValue;
        this.f23435c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = l1.f23521a;
        collection.getClass();
        if (!(collection instanceof a1)) {
            return super.addAll(collection);
        }
        a1 a1Var = (a1) collection;
        int i10 = a1Var.f23435c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f23435c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        int[] iArr = this.f23434b;
        if (i12 > iArr.length) {
            this.f23434b = Arrays.copyOf(iArr, i12);
        }
        System.arraycopy(a1Var.f23434b, 0, this.f23434b, this.f23435c, a1Var.f23435c);
        this.f23435c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(int i10) {
        c();
        int i11 = this.f23435c;
        int[] iArr = this.f23434b;
        if (i11 == iArr.length) {
            int[] iArr2 = new int[((i11 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i11);
            this.f23434b = iArr2;
        }
        int[] iArr3 = this.f23434b;
        int i12 = this.f23435c;
        this.f23435c = i12 + 1;
        iArr3[i12] = i10;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final void d(int i10) {
        if (i10 < 0 || i10 >= this.f23435c) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
            sbA.append(this.f23435c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public final a1 b(int i10) {
        if (i10 >= this.f23435c) {
            return new a1(Arrays.copyOf(this.f23434b, i10), this.f23435c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a1)) {
            return super.equals(obj);
        }
        a1 a1Var = (a1) obj;
        if (this.f23435c != a1Var.f23435c) {
            return false;
        }
        int[] iArr = a1Var.f23434b;
        for (int i10 = 0; i10 < this.f23435c; i10++) {
            if (this.f23434b[i10] != iArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        d(i10);
        return Integer.valueOf(this.f23434b[i10]);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f23435c; i11++) {
            i10 = (i10 * 31) + this.f23434b[i11];
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i10 = this.f23435c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f23434b[i11] == iIntValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        c();
        d(i10);
        int[] iArr = this.f23434b;
        int i11 = iArr[i10];
        if (i10 < this.f23435c - 1) {
            System.arraycopy(iArr, i10 + 1, iArr, i10, (r2 - i10) - 1);
        }
        this.f23435c--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f23434b;
        System.arraycopy(iArr, i11, iArr, i10, this.f23435c - i11);
        this.f23435c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        c();
        d(i10);
        int[] iArr = this.f23434b;
        int i11 = iArr[i10];
        iArr[i10] = iIntValue;
        return Integer.valueOf(i11);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23435c;
    }

    public a1(int[] iArr, int i10) {
        this.f23434b = iArr;
        this.f23435c = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        c(((Integer) obj).intValue());
        return true;
    }
}
