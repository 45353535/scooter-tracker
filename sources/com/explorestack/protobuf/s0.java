package com.explorestack.protobuf;

import com.explorestack.protobuf.j0;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* JADX INFO: loaded from: classes7.dex */
final class s0 extends c implements j0.i, RandomAccess, q1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final s0 f19334e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long[] f19335c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19336d;

    static {
        s0 s0Var = new s0(new long[0], 0);
        f19334e = s0Var;
        s0Var.makeImmutable();
    }

    s0() {
        this(new long[10], 0);
    }

    private void i(int i10, long j10) {
        int i11;
        e();
        if (i10 < 0 || i10 > (i11 = this.f19336d)) {
            throw new IndexOutOfBoundsException(m(i10));
        }
        long[] jArr = this.f19335c;
        if (i11 < jArr.length) {
            System.arraycopy(jArr, i10, jArr, i10 + 1, i11 - i10);
        } else {
            long[] jArr2 = new long[((i11 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            System.arraycopy(this.f19335c, i10, jArr2, i10 + 1, this.f19336d - i10);
            this.f19335c = jArr2;
        }
        this.f19335c[i10] = j10;
        this.f19336d++;
        ((AbstractList) this).modCount++;
    }

    public static s0 j() {
        return f19334e;
    }

    private void k(int i10) {
        if (i10 < 0 || i10 >= this.f19336d) {
            throw new IndexOutOfBoundsException(m(i10));
        }
    }

    private String m(int i10) {
        return "Index:" + i10 + ", Size:" + this.f19336d;
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        e();
        j0.a(collection);
        if (!(collection instanceof s0)) {
            return super.addAll(collection);
        }
        s0 s0Var = (s0) collection;
        int i10 = s0Var.f19336d;
        if (i10 == 0) {
            return false;
        }
        int i11 = this.f19336d;
        if (Integer.MAX_VALUE - i11 < i10) {
            throw new OutOfMemoryError();
        }
        int i12 = i11 + i10;
        long[] jArr = this.f19335c;
        if (i12 > jArr.length) {
            this.f19335c = Arrays.copyOf(jArr, i12);
        }
        System.arraycopy(s0Var.f19335c, 0, this.f19335c, this.f19336d, s0Var.f19336d);
        this.f19336d = i12;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // com.explorestack.protobuf.j0.i
    public void addLong(long j10) {
        e();
        int i10 = this.f19336d;
        long[] jArr = this.f19335c;
        if (i10 == jArr.length) {
            long[] jArr2 = new long[((i10 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i10);
            this.f19335c = jArr2;
        }
        long[] jArr3 = this.f19335c;
        int i11 = this.f19336d;
        this.f19336d = i11 + 1;
        jArr3[i11] = j10;
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
        if (!(obj instanceof s0)) {
            return super.equals(obj);
        }
        s0 s0Var = (s0) obj;
        if (this.f19336d != s0Var.f19336d) {
            return false;
        }
        long[] jArr = s0Var.f19335c;
        for (int i10 = 0; i10 < this.f19336d; i10++) {
            if (this.f19335c[i10] != jArr[i10]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public void add(int i10, Long l10) {
        i(i10, l10.longValue());
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public boolean add(Long l10) {
        addLong(l10.longValue());
        return true;
    }

    @Override // com.explorestack.protobuf.j0.i
    public long getLong(int i10) {
        k(i10);
        return this.f19335c[i10];
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        int i10 = 1;
        for (int i11 = 0; i11 < this.f19336d; i11++) {
            i10 = (i10 * 31) + j0.i(this.f19335c[i11]);
        }
        return i10;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i10 = 0; i10 < size; i10++) {
            if (this.f19335c[i10] == jLongValue) {
                return i10;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public Long get(int i10) {
        return Long.valueOf(getLong(i10));
    }

    @Override // com.explorestack.protobuf.c, java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public Long remove(int i10) {
        e();
        k(i10);
        long[] jArr = this.f19335c;
        long j10 = jArr[i10];
        if (i10 < this.f19336d - 1) {
            System.arraycopy(jArr, i10 + 1, jArr, i10, (r3 - i10) - 1);
        }
        this.f19336d--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j10);
    }

    @Override // java.util.AbstractList, java.util.List
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public Long set(int i10, Long l10) {
        return Long.valueOf(setLong(i10, l10.longValue()));
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i10, int i11) {
        e();
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f19335c;
        System.arraycopy(jArr, i11, jArr, i10, this.f19336d - i11);
        this.f19336d -= i11 - i10;
        ((AbstractList) this).modCount++;
    }

    @Override // com.explorestack.protobuf.j0.i
    public long setLong(int i10, long j10) {
        e();
        k(i10);
        long[] jArr = this.f19335c;
        long j11 = jArr[i10];
        jArr[i10] = j10;
        return j11;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f19336d;
    }

    private s0(long[] jArr, int i10) {
        this.f19335c = jArr;
        this.f19336d = i10;
    }

    @Override // com.explorestack.protobuf.j0.j, com.explorestack.protobuf.j0.f
    public j0.i mutableCopyWithCapacity(int i10) {
        if (i10 >= this.f19336d) {
            return new s0(Arrays.copyOf(this.f19335c, i10), this.f19336d);
        }
        throw new IllegalArgumentException();
    }
}
