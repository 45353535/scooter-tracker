package yads;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ac1 {
    public static bc1 a() {
        if (bc1.f108964d == null) {
            synchronized (bc1.f108963c) {
                try {
                    if (bc1.f108964d == null) {
                        bc1.f108964d = new bc1(new fg2(), new ax0());
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        bc1 bc1Var = bc1.f108964d;
        if (bc1Var != null) {
            return bc1Var;
        }
        throw new IllegalArgumentException("Required value was null.");
    }
}
