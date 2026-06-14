package yads;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class es1 {
    public static gs1 a(es2 es2Var) {
        if (gs1.f111328g == null) {
            synchronized (gs1.f111327f) {
                try {
                    if (gs1.f111328g == null) {
                        gs1.f111328g = new gs1(new zr1(new as1()), new ds1(), new ms2(), es2Var, fs1.f110844b);
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        gs1 gs1Var = gs1.f111328g;
        if (gs1Var != null) {
            return gs1Var;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
