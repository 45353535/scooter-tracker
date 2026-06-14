package yads;

import j$.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class rk2 extends y31 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object[] f115480d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient int f115481e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final transient int f115482f;

    public rk2(Object[] objArr, int i10, int i11) {
        this.f115480d = objArr;
        this.f115481e = i10;
        this.f115482f = i11;
    }

    @Override // yads.s31
    public final boolean e() {
        return true;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        ie2.a(i10, this.f115482f);
        Object obj = this.f115480d[(i10 * 2) + this.f115481e];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f115482f;
    }
}
