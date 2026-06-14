package yads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class j02 implements wb {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z32 f112213a;

    public j02(z32 z32Var) {
        this.f112213a = z32Var;
    }

    @Override // yads.wb
    public final boolean a() {
        View viewA;
        yz1 yz1Var = ((xz1) this.f112213a).f118038d;
        return (yz1Var == null || (viewA = yz1Var.f118468b.a()) == null || qi3.f115019a.a(viewA).f109937a < 1) ? false : true;
    }
}
