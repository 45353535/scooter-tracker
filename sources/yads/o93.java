package yads;

import android.content.Context;
import android.view.View;

/* JADX INFO: loaded from: classes4.dex */
public final class o93 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final vc3 f114232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final kh3 f114233b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final xb3 f114234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final xd3 f114235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final eh3 f114236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final v5 f114237f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final md3 f114238g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final jd3 f114239h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final nc3 f114240i;

    public o93(Context context, es2 es2Var, vc3 vc3Var, kh3 kh3Var, xb3 xb3Var, jg3 jg3Var, xd3 xd3Var, fh3 fh3Var, fd3 fd3Var, oc3 oc3Var, t9 t9Var, boolean z10) {
        this.f114232a = vc3Var;
        this.f114233b = kh3Var;
        this.f114234c = xb3Var;
        this.f114235d = xd3Var;
        this.f114236e = fh3Var;
        v5 v5Var = new v5();
        this.f114237f = v5Var;
        md3 md3Var = new md3(context, es2Var, t9Var, xb3Var, v5Var, xd3Var, kh3Var, jg3Var, fh3Var);
        this.f114238g = md3Var;
        jd3 jd3Var = new jd3(vc3Var, fd3Var);
        this.f114239h = jd3Var;
        Object obj = vt2.f117186j;
        ut2.a();
        context.getApplicationContext();
        this.f114240i = new nc3(xb3Var, vc3Var, jd3Var, md3Var, xd3Var, v5Var, fh3Var, oc3Var, z10);
        new hd3(context, xb3Var, kh3Var, xd3Var, fh3Var, vc3Var, oc3Var).a(fd3Var, z10);
    }

    public final void a() {
        this.f114232a.a(this.f114240i);
        this.f114232a.a(this.f114234c);
        this.f114237f.a(u5.f116518v, null);
        View view = this.f114233b.getView();
        if (view != null) {
            this.f114236e.a(view, this.f114233b.a());
        }
        sd3 sd3Var = this.f114238g.f113439d;
        if (!sd3Var.f115767e && !sd3Var.f115766d) {
            sd3Var.f115767e = true;
            sd3Var.f115765c.post(new rd3(sd3Var));
        }
        this.f114235d.a(vd3.f116979c);
    }

    public final void a(od3 od3Var) {
        md3 md3Var = this.f114238g;
        md3Var.f113444i.setValue(md3Var, md3.f113434k[0], od3Var);
    }
}
