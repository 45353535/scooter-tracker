package yads;

import android.view.TextureView;
import java.util.Map;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class x42 implements oc3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ y42 f117700a;

    public x42(y42 y42Var) {
        this.f117700a = y42Var;
    }

    @Override // yads.oc3
    public final void a(xb3 xb3Var, float f10) {
    }

    @Override // yads.oc3
    public final void b(xb3 xb3Var) {
        pc3 pc3Var = this.f117700a.f118077c;
        pc3Var.getClass();
        xl2 xl2Var = xl2.f117866c;
        am2 am2VarA = pc3Var.f114619a.a();
        Map map = am2VarA.f108722a;
        pc3Var.f114620b.a(new zl2("video_ad_start", MapsKt.toMutableMap(map), am2VarA.f108723b));
        sc3 sc3Var = this.f117700a.f118079e;
        if (sc3Var != null) {
            sc3Var.c();
        }
    }

    @Override // yads.oc3
    public final void c(xb3 xb3Var) {
        pc3 pc3Var = this.f117700a.f118077c;
        pc3Var.getClass();
        xl2 xl2Var = xl2.f117866c;
        am2 am2VarA = pc3Var.f114619a.a();
        Map map = am2VarA.f108722a;
        pc3Var.f114620b.a(new zl2("video_ad_complete", MapsKt.toMutableMap(map), am2VarA.f108723b));
        sc3 sc3Var = this.f117700a.f118079e;
        if (sc3Var != null) {
            sc3Var.b();
        }
    }

    @Override // yads.oc3
    public final void d(xb3 xb3Var) {
    }

    @Override // yads.oc3
    public final void f(xb3 xb3Var) {
    }

    @Override // yads.oc3
    public final void g(xb3 xb3Var) {
    }

    @Override // yads.oc3
    public final void h(xb3 xb3Var) {
        sc3 sc3Var = this.f117700a.f118079e;
        if (sc3Var != null) {
            sc3Var.b();
        }
    }

    @Override // yads.oc3
    public final void i(xb3 xb3Var) {
        this.f117700a.f118076b.h();
    }

    @Override // yads.oc3
    public final void j(xb3 xb3Var) {
        this.f117700a.f118078d.f114232a.d();
    }

    @Override // yads.oc3
    public final void k(xb3 xb3Var) {
    }

    @Override // yads.oc3
    public final void a(xb3 xb3Var, xc3 xc3Var) {
        do0 do0Var = (do0) this.f117700a.f118075a;
        if (!do0Var.f110002m) {
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
        sc3 sc3Var = this.f117700a.f118079e;
        if (sc3Var != null) {
            sc3Var.a();
        }
    }

    @Override // yads.oc3
    public final void a(xb3 xb3Var) {
        this.f117700a.f118076b.d();
    }
}
