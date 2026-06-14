package yads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class lh3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final kh3 f113096a;

    public lh3(kh3 kh3Var) {
        this.f113096a = kh3Var;
    }

    public final boolean a() {
        View view = this.f113096a.getView();
        return (view == null || qi3.b(view) || qi3.f115019a.a(view).f109937a < 1) ? false : true;
    }
}
