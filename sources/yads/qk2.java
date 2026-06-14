package yads;

/* JADX INFO: loaded from: classes4.dex */
public final class qk2 extends d41 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient b41 f115044d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final transient y31 f115045e;

    public qk2(b41 b41Var, rk2 rk2Var) {
        this.f115044d = b41Var;
        this.f115045e = rk2Var;
    }

    @Override // yads.d41, yads.s31
    public final y31 a() {
        return this.f115045e;
    }

    @Override // yads.s31, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f115044d.get(obj) != null;
    }

    @Override // yads.s31
    public final boolean e() {
        return true;
    }

    @Override // yads.s31, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final w73 iterator() {
        return this.f115045e.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return ((sk2) this.f115044d).f115843g;
    }

    @Override // yads.s31
    public final int a(int i10, Object[] objArr) {
        return this.f115045e.a(i10, objArr);
    }
}
