package yads;

import android.content.Context;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mk2 extends sz0 implements ri3 {
    public boolean A;
    public final lk2 B;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final eb1 f113541y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final vb f113542z;

    public /* synthetic */ mk2(Context context, eb1 eb1Var, v5 v5Var) {
        this(context, eb1Var, v5Var, new vb(eb1Var));
    }

    @Override // yads.rn, yads.ib2
    public final void a(eb2 eb2Var) {
        super.a(eb2Var);
        q();
    }

    @Override // yads.rn
    public final void b(k4 k4Var) {
        super.b(k4Var);
        int i10 = k4Var.f112578a;
        if (5 == i10 || 2 == i10) {
            return;
        }
        q();
    }

    @Override // yads.rn
    public void c() {
        super.c();
        this.f113541y.removeVisibilityChangeListener(this);
        boolean z10 = lb1.f113032a;
        this.A = false;
        this.f115511g.removeCallbacks(this.B);
    }

    @Override // yads.rn
    public final void j() {
        super.j();
        q();
    }

    public final void p() {
        q();
    }

    public final void q() {
        boolean z10 = lb1.f113032a;
        this.f115511g.removeCallbacks(this.B);
        t9 t9Var = this.f115526v;
        if (t9Var != null && t9Var.K && this.A && this.f115520p.a()) {
            gk2 gk2Var = this.f113542z.f116951a;
            KProperty kProperty = vb.f116950b[0];
            eb1 eb1Var = (eb1) gk2Var.f111244a.get();
            if (eb1Var == null || qi3.b(eb1Var)) {
                return;
            }
            this.f115511g.postDelayed(this.B, t9Var.I);
        }
    }

    public mk2(Context context, eb1 eb1Var, v5 v5Var, vb vbVar) {
        super(context, eb1Var.getAdConfiguration$mobileads_externalRelease(), eb1Var.getSdkEnvironmentModule$mobileads_externalRelease(), v5Var);
        this.f113541y = eb1Var;
        this.f113542z = vbVar;
        this.A = true;
        this.B = new lk2(this);
        eb1Var.addVisibilityChangeListener(this);
    }
}
