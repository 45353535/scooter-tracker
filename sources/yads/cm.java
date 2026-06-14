package yads;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: classes4.dex */
public final class cm extends mk2 {
    public final eb1 C;
    public final bm D;
    public final ze3 E;
    public final em F;
    public final dm G;
    public final vz1 H;
    public final zh0 I;
    public mm J;
    public mm K;

    public cm(Context context, eb1 eb1Var, bm bmVar, v5 v5Var, ze3 ze3Var, em emVar, dm dmVar, vz1 vz1Var, zh0 zh0Var) {
        super(context, eb1Var, v5Var);
        this.C = eb1Var;
        this.D = bmVar;
        this.E = ze3Var;
        this.F = emVar;
        this.G = dmVar;
        this.H = vz1Var;
        this.I = zh0Var;
        a(eb1Var);
        bmVar.a(vz1Var);
    }

    public static void a(eb1 eb1Var) {
        eb1Var.setHorizontalScrollBarEnabled(false);
        eb1Var.setVerticalScrollBarEnabled(false);
        eb1Var.setVisibility(8);
        eb1Var.setBackgroundColor(0);
    }

    @Override // yads.mk2, yads.rn
    public final void c() {
        super.c();
        bm bmVar = this.D;
        bmVar.f109048c = null;
        bmVar.f109047b.a(null);
        sh3.a(this.C, true);
        this.C.setVisibility(8);
        qi3.a((ViewGroup) this.C);
    }

    @Override // yads.rn
    public final void d() {
        mm[] mmVarArr = {this.J, this.K};
        for (int i10 = 0; i10 < 2; i10++) {
            mm mmVar = mmVarArr[i10];
            if (mmVar != null) {
                mmVar.a(this.f115505a);
            }
        }
        super.d();
    }

    @Override // yads.rn
    public final void l() {
        super.l();
        mm mmVar = this.J;
        if (mmVar != this.K) {
            mm mmVar2 = new mm[]{mmVar}[0];
            if (mmVar2 != null) {
                mmVar2.a(this.f115505a);
            }
            this.J = this.K;
        }
        mx2 mx2Var = this.f115507c.f109197d.f114071a;
        if (lx2.f113264d != (mx2Var != null ? mx2Var.a() : null) || this.C.getLayoutParams() == null) {
            return;
        }
        this.C.getLayoutParams().height = -2;
    }

    public final eb1 r() {
        return this.C;
    }

    @Override // yads.pn2
    public final void a(Object obj) {
        nm jt2Var;
        t9 t9Var = (t9) obj;
        synchronized (this) {
            this.f115506b.a(u5.f116515s);
            this.f115526v = t9Var;
        }
        this.H.f117258d = t9Var;
        dm dmVar = this.G;
        dmVar.getClass();
        to1 to1Var = t9Var.f116124q;
        if (to1Var != null) {
            jt2Var = new mn1(t9Var, to1Var);
        } else {
            jt2Var = new jt2(dmVar.f109973a);
        }
        mm mmVarA = jt2Var.a(this);
        this.K = mmVarA;
        mmVarA.a(this.f115505a, t9Var);
    }
}
