package yads;

import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public class ya0 implements hi {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final nh3 f118123a;

    public ya0(nh3 nh3Var) {
        this.f118123a = nh3Var;
    }

    @Override // yads.hi
    public final void a() {
        View viewB = this.f118123a.b();
        if (viewB == null) {
            return;
        }
        this.f118123a.a(viewB);
    }

    @Override // yads.hi
    public final boolean b() {
        return this.f118123a.b() != null;
    }

    @Override // yads.hi
    public final fi3 c() {
        View viewB = this.f118123a.b();
        if (viewB != null) {
            return new fi3(viewB.getWidth(), viewB.getHeight());
        }
        return null;
    }

    @Override // yads.hi
    public final boolean d() {
        return qi3.a(this.f118123a.b()) >= 100;
    }

    @Override // yads.hi
    public final void destroy() {
    }

    @Override // yads.hi
    public final boolean e() {
        return this.f118123a.c();
    }

    @Override // yads.hi
    public final void a(gi giVar, qh3 qh3Var) {
        this.f118123a.a(giVar, qh3Var, giVar.f111215c);
    }

    public void b(Object obj) {
        c(obj);
    }

    @Override // yads.hi
    public final void c(Object obj) {
        View viewB = this.f118123a.b();
        if (viewB == null) {
            return;
        }
        this.f118123a.b(viewB, obj);
        viewB.setVisibility(0);
    }

    @Override // yads.hi
    public final boolean a(Object obj) {
        View viewB = this.f118123a.b();
        return viewB != null && this.f118123a.a(viewB, obj);
    }
}
