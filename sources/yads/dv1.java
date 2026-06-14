package yads;

import android.content.Context;

/* JADX INFO: loaded from: classes4.dex */
public final class dv1 {
    public final ev1 a(Context context) {
        ev1 ev1Var;
        ev1 ev1Var2 = ev1.f110477d;
        if (ev1Var2 != null) {
            return ev1Var2;
        }
        synchronized (this) {
            try {
                ev1Var = ev1.f110477d;
                if (ev1Var == null) {
                    Object obj = vt2.f117186j;
                    hr2 hr2VarA = ut2.a().a(context);
                    ev1Var = new ev1(hr2VarA != null ? hr2VarA.f111717b : 0);
                    ev1.f110477d = ev1Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return ev1Var;
    }
}
