package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public abstract class rw0 extends sz0 {
    public final vz1 A;
    public final pw0 B;
    public nw0 C;
    public nw0 D;
    public cx0 E;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final sw0 f115621y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final xw0 f115622z;

    public /* synthetic */ rw0(Context context, c4 c4Var, es2 es2Var, sw0 sw0Var, v5 v5Var, xw0 xw0Var, vz1 vz1Var) {
        this(context, c4Var, es2Var, sw0Var, v5Var, xw0Var, vz1Var, new pw0(es2Var));
    }

    public abstract nw0 a(ow0 ow0Var);

    @Override // yads.rn
    public final void a(k4 k4Var) {
        this.f115621y.a(k4Var);
    }

    @Override // yads.rn
    public final void i() {
        this.f115621y.a(f9.f110647h);
    }

    @Override // yads.rn
    public final void j() {
        cx0 cx0Var = this.E;
        if (cx0Var != null) {
            this.f115621y.a(cx0Var);
        } else {
            this.f115621y.a(f9.f110641b);
        }
    }

    public rw0(Context context, c4 c4Var, es2 es2Var, sw0 sw0Var, v5 v5Var, xw0 xw0Var, vz1 vz1Var, pw0 pw0Var) {
        super(context, c4Var, es2Var, v5Var);
        this.f115621y = sw0Var;
        this.f115622z = xw0Var;
        this.A = vz1Var;
        this.B = pw0Var;
        a(ka.f112658a.a());
    }

    @Override // yads.pn2
    public void a(t9 t9Var) {
        ow0 mt2Var;
        synchronized (this) {
            this.f115506b.a(u5.f116515s);
            this.f115526v = t9Var;
        }
        this.A.f117258d = t9Var;
        pw0 pw0Var = this.B;
        pw0Var.getClass();
        to1 to1Var = t9Var.f116124q;
        if (to1Var != null) {
            mt2Var = new rn1(t9Var, to1Var);
        } else {
            mt2Var = new mt2(pw0Var.f114800a);
        }
        nw0 nw0VarA = a(mt2Var);
        this.D = this.C;
        this.C = nw0VarA;
        this.E = this.f115622z.a(t9Var, this.f115507c, nw0VarA);
        Context contextA = j1.a();
        if (contextA != null) {
            boolean z10 = lb1.f113032a;
        }
        if (contextA == null) {
            contextA = this.f115505a;
        }
        nw0VarA.a(contextA, t9Var);
    }
}
