package yads;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class np2 {
    public static op2 a() {
        if (op2.f114385d == null) {
            synchronized (op2.f114384c) {
                try {
                    if (op2.f114385d == null) {
                        op2.f114385d = new op2(new fg2(), new ax0());
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        op2 op2Var = op2.f114385d;
        if (op2Var != null) {
            return op2Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
