package com.appodeal.ads;

import android.app.Activity;

/* JADX INFO: loaded from: classes6.dex */
public abstract class gd extends a4 {
    public gd(ka kaVar) {
        super(kaVar);
    }

    @Override // com.appodeal.ads.i2
    public final void X(te teVar, uc ucVar) {
        s7 s7Var = (s7) ucVar;
        super.X((tc) teVar, s7Var);
        Activity resumedActivity = com.appodeal.ads.context.o.f13205b.getResumedActivity();
        if (resumedActivity != null) {
            ac acVarN0 = n0();
            l0 l0Var = this.f13410c;
            ja jaVarO = acVarN0.o(resumedActivity);
            if ((jaVarO.f13516b == f3.VISIBLE || jaVarO.f13515a != null) && l0Var.f13572l && !s7Var.l() && acVarN0.l(l0Var, (tc) l0Var.f13582v) <= 0 && !com.appodeal.ads.utils.c.c(resumedActivity)) {
                ac acVarN02 = n0();
                t7 t7Var = acVarN02.o(resumedActivity).f13515a;
                if (t7Var == null && (t7Var = acVarN02.f11900g) == null) {
                    t7Var = acVarN02.f11899f;
                }
                n0().z(resumedActivity, new ic(this.f13410c.y(), t7Var, true, false), this.f13410c);
            }
        }
    }

    @Override // com.appodeal.ads.i2
    public final void d0(te teVar, uc ucVar) {
        tc tcVar;
        tc tcVar2 = (tc) teVar;
        l0 l0Var = this.f13410c;
        if (l0Var.f13572l) {
            if (!tcVar2.f14895g && ((tcVar = (tc) l0Var.A()) == null || tcVar.h())) {
                this.f13410c.t(com.appodeal.ads.context.o.f13205b.f13206a.getApplicationContext());
            }
            ac acVarN0 = n0();
            Activity resumedActivity = com.appodeal.ads.context.o.f13205b.getResumedActivity();
            l0 l0Var2 = this.f13410c;
            acVarN0.s(resumedActivity, l0Var2, acVarN0.l(l0Var2, tcVar2));
        }
    }

    public abstract ac n0();
}
