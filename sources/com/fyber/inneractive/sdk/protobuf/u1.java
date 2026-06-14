package com.fyber.inneractive.sdk.protobuf;

import java.nio.charset.Charset;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes7.dex */
public final class u1 extends c implements j1, RandomAccess, n2 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final u1 f23587d;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f23588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f23589c;

    static {
        u1 u1Var = new u1(new long[0], 0);
        f23587d = u1Var;
        u1Var.f23446a = false;
    }

    public u1() {
        this.f23588b = new long[10];
        this.f23589c = 0;
    }

    public final void a(long j10) {
        c();
        int i10 = this.f23589c;
        long[] jArr = this.f23588b;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f23588b = jArr2;
        }
        long[] jArr3 = this.f23588b;
        int i11 = this.f23589c;
        this.f23589c = i11 + 1;
        jArr3[i11] = j10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i10, Object obj) {
        int i11;
        long jLongValue = ((Long) obj).longValue();
        c();
        if (i10 < 0 || i10 > (i11 = this.f23589c)) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
            sbA.append(this.f23589c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
        long[] jArr = this.f23588b;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f23588b, i10, jArr2, i10 + 1, this.f23589c - i10);
            this.f23588b = jArr2;
        }
        this.f23588b[i10] = jLongValue;
        this.f23589c++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection collection) {
        c();
        Charset charset = l1.f23521a;
        collection.getClass();
        if (!(collection instanceof u1)) {
            return super.addAll(collection);
        }
        u1 u1Var = (u1) collection;
        int i10 = u1Var.f23589c;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f23589c;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f23588b;
        if (i12 > jArr.length) {
            this.f23588b = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(u1Var.f23588b, 0, this.f23588b, this.f23589c, u1Var.f23589c);
        this.f23589c = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(int i10) {
        if (i10 < 0 || i10 >= this.f23589c) {
            StringBuilder sbA = com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.l.a("Index:", i10, ", Size:");
            sbA.append(this.f23589c);
            throw new IndexOutOfBoundsException(sbA.toString());
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.k1
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final u1 b(int i10) {
        if (i10 >= this.f23589c) {
            return new u1(Arrays.copyOf(this.f23588b, i10), this.f23589c);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1)) {
            return super.equals(obj);
        }
        u1 u1Var = (u1) obj;
        if (this.f23589c != u1Var.f23589c) {
            return false;
        }
        long[] jArr = u1Var.f23588b;
        for (int i10 = 0; i10 < this.f23589c; i10++) {
            if (this.f23588b[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i10) {
        c(i10);
        return Long.valueOf(this.f23588b[i10]);
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f23589c; i11++) {
            long j10 = this.f23588b[i11];
            Charset charset = l1.f23521a;
            i10 = (i10 * 31) + ((int) (j10 ^ (j10 >>> 32)));
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i10 = this.f23589c;
        for (int i11 = 0; i11 < i10; i11++) {
            if (this.f23588b[i11] == jLongValue) {
                return i11;
            }
        }
        return -1;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.List
    public final Object remove(int i10) {
        c();
        c(i10);
        long[] jArr = this.f23588b;
        long j10 = jArr[i10];
        if (i10 < this.f23589c - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f23589c--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList
    public final void removeRange(int i10, int i11) {
        c();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f23588b;
        System.arraycopy(jArr, i11, jArr, i10, this.f23589c - i11);
        this.f23589c -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i10, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        c();
        c(i10);
        long[] jArr = this.f23588b;
        long j10 = jArr[i10];
        jArr[i10] = jLongValue;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f23589c;
    }

    public u1(long[] jArr, int i10) {
        this.f23588b = jArr;
        this.f23589c = i10;
    }

    @Override // com.fyber.inneractive.sdk.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        a(((Long) obj).longValue());
        return true;
    }
}
