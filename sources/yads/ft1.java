package yads;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ft1 {
    public static final void a(boolean z10) {
        lb1.f113032a = z10;
        wa1.f117371c = z10;
        if (z10) {
            return;
        }
        nt1 nt1Var = nt1.f114026b;
        mt1.a().a();
        vs1 vs1Var = vs1.f117164b;
        us1.a().a();
    }

    public static final void b(boolean z10) {
        Object obj = vt2.f117186j;
        vt2 vt2VarA = ut2.a();
        synchronized (vt2.f117186j) {
            vt2VarA.f117190c = Boolean.valueOf(z10);
            Unit unit = Unit.f93236a;
        }
    }
}
