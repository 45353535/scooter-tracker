package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.J2ktIncompatible;
import j$.util.Objects;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes9.dex */
@J2ktIncompatible
@GwtIncompatible
@ElementTypesAreNonnullByDefault
class CompactLinkedHashMap<K, V> extends CompactHashMap<K, V> {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    transient long[] f29384l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private transient int f29385m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private transient int f29386n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f29387o;

    CompactLinkedHashMap() {
        this(3);
    }

    public static <K, V> CompactLinkedHashMap<K, V> create() {
        return new CompactLinkedHashMap<>();
    }

    public static <K, V> CompactLinkedHashMap<K, V> createWithExpectedSize(int i10) {
        return new CompactLinkedHashMap<>(i10);
    }

    private int e0(int i10) {
        return ((int) (f0(i10) >>> 32)) - 1;
    }

    private long f0(int i10) {
        return g0()[i10];
    }

    private long[] g0() {
        long[] jArr = this.f29384l;
        Objects.requireNonNull(jArr);
        return jArr;
    }

    private void h0(int i10, long j10) {
        g0()[i10] = j10;
    }

    private void i0(int i10, int i11) {
        h0(i10, (f0(i10) & 4294967295L) | (((long) (i11 + 1)) << 32));
    }

    private void j0(int i10, int i11) {
        if (i10 == -2) {
            this.f29385m = i11;
        } else {
            k0(i10, i11);
        }
        if (i11 == -2) {
            this.f29386n = i10;
        } else {
            i0(i11, i10);
        }
    }

    private void k0(int i10, int i11) {
        h0(i10, (f0(i10) & (-4294967296L)) | (((long) (i11 + 1)) & 4294967295L));
    }

    @Override // com.google.common.collect.CompactHashMap
    int E() {
        return this.f29385m;
    }

    @Override // com.google.common.collect.CompactHashMap
    int F(int i10) {
        return ((int) f0(i10)) - 1;
    }

    @Override // com.google.common.collect.CompactHashMap
    void J(int i10) {
        super.J(i10);
        this.f29385m = -2;
        this.f29386n = -2;
    }

    @Override // com.google.common.collect.CompactHashMap
    void K(int i10, Object obj, Object obj2, int i11, int i12) {
        super.K(i10, obj, obj2, i11, i12);
        j0(this.f29386n, i10);
        j0(i10, -2);
    }

    @Override // com.google.common.collect.CompactHashMap
    void N(int i10, int i11) {
        int size = size() - 1;
        super.N(i10, i11);
        j0(e0(i10), F(i10));
        if (i10 < size) {
            j0(e0(size), i10);
            j0(i10, F(size));
        }
        h0(size, 0L);
    }

    @Override // com.google.common.collect.CompactHashMap
    void V(int i10) {
        super.V(i10);
        this.f29384l = Arrays.copyOf(g0(), i10);
    }

    @Override // com.google.common.collect.CompactHashMap, java.util.AbstractMap, java.util.Map
    public void clear() {
        if (O()) {
            return;
        }
        this.f29385m = -2;
        this.f29386n = -2;
        long[] jArr = this.f29384l;
        if (jArr != null) {
            Arrays.fill(jArr, 0, size(), 0L);
        }
        super.clear();
    }

    @Override // com.google.common.collect.CompactHashMap
    void q(int i10) {
        if (this.f29387o) {
            j0(e0(i10), F(i10));
            j0(this.f29386n, i10);
            j0(i10, -2);
            H();
        }
    }

    @Override // com.google.common.collect.CompactHashMap
    int r(int i10, int i11) {
        return i10 >= size() ? i11 : i10;
    }

    @Override // com.google.common.collect.CompactHashMap
    int s() {
        int iS = super.s();
        this.f29384l = new long[iS];
        return iS;
    }

    @Override // com.google.common.collect.CompactHashMap
    Map t() {
        Map mapT = super.t();
        this.f29384l = null;
        return mapT;
    }

    @Override // com.google.common.collect.CompactHashMap
    Map v(int i10) {
        return new LinkedHashMap(i10, 1.0f, this.f29387o);
    }

    CompactLinkedHashMap(int i10) {
        this(i10, false);
    }

    CompactLinkedHashMap(int i10, boolean z10) {
        super(i10);
        this.f29387o = z10;
    }
}
