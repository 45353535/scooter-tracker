package com.google.common.collect;

import com.google.common.annotations.GwtCompatible;
import java.util.Arrays;

/* JADX INFO: loaded from: classes9.dex */
@GwtCompatible(emulated = true, serializable = true)
@ElementTypesAreNonnullByDefault
class ObjectCountLinkedHashMap<K> extends ObjectCountHashMap<K> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    transient long[] f30112i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private transient int f30113j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private transient int f30114k;

    ObjectCountLinkedHashMap(int i10) {
        this(i10, 1.0f);
    }

    private int A(int i10) {
        return (int) (this.f30112i[i10] >>> 32);
    }

    private int B(int i10) {
        return (int) this.f30112i[i10];
    }

    private void C(int i10, int i11) {
        long[] jArr = this.f30112i;
        jArr[i10] = (jArr[i10] & 4294967295L) | (((long) i11) << 32);
    }

    private void D(int i10, int i11) {
        if (i10 == -2) {
            this.f30113j = i11;
        } else {
            E(i10, i11);
        }
        if (i11 == -2) {
            this.f30114k = i10;
        } else {
            C(i11, i10);
        }
    }

    private void E(int i10, int i11) {
        long[] jArr = this.f30112i;
        jArr[i10] = (jArr[i10] & (-4294967296L)) | (((long) i11) & 4294967295L);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    public void clear() {
        super.clear();
        this.f30113j = -2;
        this.f30114k = -2;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    int d() {
        int i10 = this.f30113j;
        if (i10 == -2) {
            return -1;
        }
        return i10;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    void l(int i10, float f10) {
        super.l(i10, f10);
        this.f30113j = -2;
        this.f30114k = -2;
        long[] jArr = new long[i10];
        this.f30112i = jArr;
        Arrays.fill(jArr, -1L);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    void m(int i10, Object obj, int i11, int i12) {
        super.m(i10, obj, i11, i12);
        D(this.f30114k, i10);
        D(i10, -2);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    void n(int i10) {
        int iY = y() - 1;
        D(A(i10), B(i10));
        if (i10 < iY) {
            D(A(iY), i10);
            D(i10, B(iY));
        }
        super.n(i10);
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    int q(int i10) {
        int iB = B(i10);
        if (iB == -2) {
            return -1;
        }
        return iB;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    int r(int i10, int i11) {
        return i10 == y() ? i11 : i10;
    }

    @Override // com.google.common.collect.ObjectCountHashMap
    void u(int i10) {
        super.u(i10);
        long[] jArr = this.f30112i;
        int length = jArr.length;
        long[] jArrCopyOf = Arrays.copyOf(jArr, i10);
        this.f30112i = jArrCopyOf;
        Arrays.fill(jArrCopyOf, length, i10, -1L);
    }

    ObjectCountLinkedHashMap(int i10, float f10) {
        super(i10, f10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    ObjectCountLinkedHashMap(ObjectCountHashMap objectCountHashMap) {
        l(objectCountHashMap.y(), 1.0f);
        int iD = objectCountHashMap.d();
        while (iD != -1) {
            put(objectCountHashMap.g(iD), objectCountHashMap.i(iD));
            iD = objectCountHashMap.q(iD);
        }
    }
}
