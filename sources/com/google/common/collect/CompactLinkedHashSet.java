package com.google.common.collect;

import com.google.common.annotations.GwtIncompatible;
import j$.util.Objects;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: classes9.dex */
@GwtIncompatible
@ElementTypesAreNonnullByDefault
class CompactLinkedHashSet<E> extends CompactHashSet<E> {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private transient int[] f29388g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private transient int[] f29389h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private transient int f29390i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private transient int f29391j;

    CompactLinkedHashSet() {
    }

    private int J(int i10) {
        return K()[i10] - 1;
    }

    private int[] K() {
        int[] iArr = this.f29388g;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private int[] L() {
        int[] iArr = this.f29389h;
        Objects.requireNonNull(iArr);
        return iArr;
    }

    private void M(int i10, int i11) {
        K()[i10] = i11 + 1;
    }

    private void N(int i10, int i11) {
        if (i10 == -2) {
            this.f29390i = i11;
        } else {
            O(i10, i11);
        }
        if (i11 == -2) {
            this.f29391j = i10;
        } else {
            M(i11, i10);
        }
    }

    private void O(int i10, int i11) {
        L()[i10] = i11 + 1;
    }

    public static <E> CompactLinkedHashSet<E> create() {
        return new CompactLinkedHashSet<>();
    }

    public static <E> CompactLinkedHashSet<E> createWithExpectedSize(int i10) {
        return new CompactLinkedHashSet<>(i10);
    }

    @Override // com.google.common.collect.CompactHashSet
    void D(int i10) {
        super.D(i10);
        this.f29388g = Arrays.copyOf(K(), i10);
        this.f29389h = Arrays.copyOf(L(), i10);
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public void clear() {
        if (x()) {
            return;
        }
        this.f29390i = -2;
        this.f29391j = -2;
        int[] iArr = this.f29388g;
        if (iArr != null && this.f29389h != null) {
            Arrays.fill(iArr, 0, size(), 0);
            Arrays.fill(this.f29389h, 0, size(), 0);
        }
        super.clear();
    }

    @Override // com.google.common.collect.CompactHashSet
    int g(int i10, int i11) {
        return i10 >= size() ? i11 : i10;
    }

    @Override // com.google.common.collect.CompactHashSet
    int i() {
        int i10 = super.i();
        this.f29388g = new int[i10];
        this.f29389h = new int[i10];
        return i10;
    }

    @Override // com.google.common.collect.CompactHashSet
    Set j() {
        Set setJ = super.j();
        this.f29388g = null;
        this.f29389h = null;
        return setJ;
    }

    @Override // com.google.common.collect.CompactHashSet
    int o() {
        return this.f29390i;
    }

    @Override // com.google.common.collect.CompactHashSet
    int q(int i10) {
        return L()[i10] - 1;
    }

    @Override // com.google.common.collect.CompactHashSet
    void t(int i10) {
        super.t(i10);
        this.f29390i = -2;
        this.f29391j = -2;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public Object[] toArray() {
        return ObjectArrays.e(this);
    }

    @Override // com.google.common.collect.CompactHashSet
    void u(int i10, Object obj, int i11, int i12) {
        super.u(i10, obj, i11, i12);
        N(this.f29391j, i10);
        N(i10, -2);
    }

    @Override // com.google.common.collect.CompactHashSet
    void v(int i10, int i11) {
        int size = size() - 1;
        super.v(i10, i11);
        N(J(i10), q(i10));
        if (i10 < size) {
            N(J(size), i10);
            N(i10, q(size));
        }
        K()[size] = 0;
        L()[size] = 0;
    }

    CompactLinkedHashSet(int i10) {
        super(i10);
    }

    public static <E> CompactLinkedHashSet<E> create(Collection<? extends E> collection) {
        CompactLinkedHashSet<E> compactLinkedHashSetCreateWithExpectedSize = createWithExpectedSize(collection.size());
        compactLinkedHashSetCreateWithExpectedSize.addAll(collection);
        return compactLinkedHashSetCreateWithExpectedSize;
    }

    @Override // com.google.common.collect.CompactHashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) ObjectArrays.f(this, tArr);
    }

    @SafeVarargs
    public static <E> CompactLinkedHashSet<E> create(E... eArr) {
        CompactLinkedHashSet<E> compactLinkedHashSetCreateWithExpectedSize = createWithExpectedSize(eArr.length);
        Collections.addAll(compactLinkedHashSetCreateWithExpectedSize, eArr);
        return compactLinkedHashSetCreateWithExpectedSize;
    }
}
