package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class qb1 extends rw0 {
    public final oi2 F;

    public qb1(Context context, es2 es2Var, q5 q5Var, e9 e9Var, v5 v5Var, c4 c4Var, vz1 vz1Var, ob1 ob1Var, oi2 oi2Var) {
        super(context, c4Var, es2Var, oi2Var, v5Var, ob1Var, vz1Var);
        this.F = oi2Var;
        c4Var.a(e9Var);
        oi2Var.a(new pb1(q5Var, this));
        oi2Var.a(c4Var);
        oi2Var.a(vz1Var);
    }

    @Override // yads.rw0
    public final nw0 a(ow0 ow0Var) {
        return ow0Var.c(this);
    }

    public final void a(i00 i00Var) {
        oi2 oi2Var = this.F;
        oi2Var.f114336d = i00Var;
        oi2Var.f114335c.a(i00Var);
    }
}
