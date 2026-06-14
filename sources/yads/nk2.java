package yads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class nk2 extends y31 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final nk2 f113952f = new nk2(0, new Object[0]);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f113953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f113954e;

    public nk2(int i10, Object[] objArr) {
        this.f113953d = objArr;
        this.f113954e = i10;
    }

    @Override // yads.y31, yads.s31
    public final int a(int i10, Object[] objArr) {
        System.arraycopy(this.f113953d, 0, objArr, i10, this.f113954e);
        return i10 + this.f113954e;
    }

    @Override // yads.s31
    public final Object[] b() {
        return this.f113953d;
    }

    @Override // yads.s31
    public final int c() {
        return this.f113954e;
    }

    @Override // yads.s31
    public final int d() {
        return 0;
    }

    @Override // yads.s31
    public final boolean e() {
        return false;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ie2.a(i10, this.f113954e);
        Object obj = this.f113953d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f113954e;
    }
}
