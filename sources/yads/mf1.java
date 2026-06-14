package yads;

import android.content.Context;
import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class mf1 {
    public static nf1 a(Context context) {
        if (nf1.f113853g == null) {
            synchronized (nf1.f113852f) {
                try {
                    if (nf1.f113853g == null) {
                        qf1 qf1Var = new qf1();
                        pf1 pf1Var = new pf1();
                        Object obj = vt2.f117186j;
                        nf1.f113853g = new nf1(context, qf1Var, pf1Var, ut2.a(), new bv2());
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        nf1 nf1Var = nf1.f113853g;
        if (nf1Var != null) {
            return nf1Var;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
