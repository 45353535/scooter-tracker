package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class cz1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final dz1 f109668a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final zy1 f109669b;

    public cz1(Context context, es2 es2Var, nz1 nz1Var, bz1 bz1Var, v5 v5Var, c4 c4Var, xy1 xy1Var, az1 az1Var) {
        this.f109668a = bz1Var;
        xy1Var.getClass();
        iz1 iz1VarA = xy1.a(context, c4Var, es2Var, v5Var, this);
        az1Var.getClass();
        zy1 zy1VarA = az1.a(context, es2Var, nz1Var, c4Var, iz1VarA, v5Var);
        this.f109669b = zy1VarA;
        iz1VarA.a(zy1VarA.e());
    }

    public final void a() {
        zy1 zy1Var = this.f109669b;
        nz1 nz1Var = zy1Var.f118873w;
        e9 e9Var = nz1Var.f114134a;
        if (!nz1Var.f114137d.a()) {
            zy1Var.b(f9.f110647h);
            return;
        }
        zy1Var.f115506b.a(u5.f116501e, null);
        zy1Var.A.b(tc1.f116191b, zy1Var);
        zy1Var.f115507c.f109204k = Integer.valueOf(zy1Var.f118873w.f114138e);
        zy1Var.f115507c.a(e9Var.f110252a);
        c4 c4Var = zy1Var.f115507c;
        nz1 nz1Var2 = zy1Var.f118873w;
        c4Var.f109200g = nz1Var2.f114135b;
        c4Var.f109207n = e9Var.f110262k;
        c4Var.f109199f = nz1Var2.f114136c;
        synchronized (zy1Var) {
            zy1Var.c(e9Var);
        }
    }

    public /* synthetic */ cz1(Context context, es2 es2Var, nz1 nz1Var, bz1 bz1Var, qz qzVar, int i10) {
        this(context, es2Var, nz1Var, bz1Var, new v5(), new c4((i10 & 32) != 0 ? qz.f115224g : qzVar), new xy1(), new az1());
    }
}
