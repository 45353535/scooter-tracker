package yads;

import com.ironsource.C4240b4;

/* JADX INFO: loaded from: classes4.dex */
public final class jx2 extends d41 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final transient Object f112502d;

    public jx2(Object obj) {
        this.f112502d = ie2.a(obj);
    }

    @Override // yads.d41, yads.s31
    public final y31 a() {
        return y31.a(this.f112502d);
    }

    @Override // yads.s31, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return this.f112502d.equals(obj);
    }

    @Override // yads.s31
    public final boolean e() {
        return false;
    }

    @Override // yads.d41, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f112502d.hashCode();
    }

    @Override // yads.s31, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final w73 iterator() {
        return new ic1(this.f112502d);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return C4240b4.j.f42672d + this.f112502d.toString() + ']';
    }

    @Override // yads.s31
    public final int a(int i10, Object[] objArr) {
        objArr[i10] = this.f112502d;
        return i10 + 1;
    }
}
