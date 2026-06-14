package yads;

import android.view.TextureView;

/* JADX INFO: loaded from: classes4.dex */
public final class ul2 implements yc3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ vl2 f116708a;

    public ul2(vl2 vl2Var) {
        this.f116708a = vl2Var;
    }

    @Override // yads.yc3
    public final void a() {
    }

    @Override // yads.yc3
    public final void b() {
    }

    @Override // yads.yc3
    public final void c() {
        jd3 jd3Var = this.f116708a.f117078c;
        if (!jd3Var.f112327d) {
            jd3Var.f112327d = true;
            jd3Var.f112325b.a();
            jd3Var.f112326c.post(new id3(jd3Var));
        }
        sc3 sc3Var = this.f116708a.f117080e;
        if (sc3Var != null) {
            sc3Var.c();
        }
    }

    @Override // yads.yc3
    public final void d() {
        this.f116708a.f117078c.a();
        vl2 vl2Var = this.f116708a;
        ((do0) vl2Var.f117076a).f110000k = null;
        sc3 sc3Var = vl2Var.f117080e;
        if (sc3Var != null) {
            sc3Var.b();
        }
    }

    @Override // yads.yc3
    public final void e() {
        this.f116708a.f117078c.a();
        ((do0) this.f116708a.f117076a).f110000k = null;
    }

    @Override // yads.yc3
    public final void f() {
    }

    @Override // yads.yc3
    public final void h() {
        do0 do0Var = (do0) this.f116708a.f117076a;
        if (!do0Var.f110002m) {
            ((vm0) do0Var.f109990a).a(true);
        }
        if (!do0Var.f110003n || do0Var.f110002m) {
            return;
        }
        ((vm0) do0Var.f109990a).a(false);
    }

    @Override // yads.yc3
    public final void i() {
    }

    @Override // yads.yc3
    public final void onVolumeChanged(float f10) {
    }

    @Override // yads.yc3
    public final void a(xc3 xc3Var) {
        this.f116708a.f117078c.a();
        do0 do0Var = (do0) this.f116708a.f117076a;
        do0Var.f110000k = null;
        if (do0Var.f110002m) {
            return;
        }
        do0Var.f110002m = true;
        do0Var.f110003n = false;
        ((ma2) do0Var.f109996g.f112398b).a();
        ((vm0) do0Var.f109990a).a((TextureView) null);
        mg3 mg3Var = do0Var.f109994e;
        mg3Var.f113467c = null;
        mg3Var.b();
        ((vm0) do0Var.f109990a).d(do0Var.f109995f);
        ((vm0) do0Var.f109990a).d(do0Var.f109994e);
        ((vm0) do0Var.f109990a).p();
    }
}
