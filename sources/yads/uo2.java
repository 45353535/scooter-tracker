package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class uo2 extends rw0 {
    public final qi2 F;
    public final no2 G;

    public uo2(Context context, es2 es2Var, q5 q5Var, e9 e9Var, c4 c4Var, v5 v5Var, vz1 vz1Var, so2 so2Var, qi2 qi2Var, no2 no2Var) {
        super(context, c4Var, es2Var, qi2Var, v5Var, so2Var, vz1Var);
        this.F = qi2Var;
        this.G = no2Var;
        c4Var.a(e9Var);
        qi2Var.a(new to2(q5Var, this));
        qi2Var.a(c4Var);
        qi2Var.a(vz1Var);
    }

    @Override // yads.rw0
    public final nw0 a(ow0 ow0Var) {
        return ow0Var.b(this);
    }

    @Override // yads.rw0, yads.pn2
    public final void a(t9 t9Var) {
        lo2 lo2Var = t9Var.f116125r;
        this.G.getClass();
        if (lo2Var != null && (!lo2Var.f113179b ? lo2Var.f113180c != null : lo2Var.f113181d != null)) {
            super.a(t9Var);
        } else {
            b(f9.f110642c);
        }
    }

    public final void a(c10 c10Var) {
        qi2 qi2Var = this.F;
        qi2Var.f115017e = c10Var;
        qi2Var.f115015c.a(c10Var);
    }
}
