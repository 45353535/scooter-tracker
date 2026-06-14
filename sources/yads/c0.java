package yads;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public class c0 extends fw1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ e0 f109166b;

    public c0(a0 a0Var) {
        this.f109166b = a0Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        a0 a0Var = (a0) this.f109166b;
        a0Var.getClass();
        return new k(a0Var);
    }
}
