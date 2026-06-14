package yads;

import kotlin.Unit;

/* JADX INFO: loaded from: classes4.dex */
public abstract class y13 {
    public static z13 a() {
        if (z13.f118512b == null) {
            synchronized (z13.f118513c) {
                try {
                    if (z13.f118512b == null) {
                        z13.f118512b = new z13();
                    }
                    Unit unit = Unit.f93236a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
        z13 z13Var = z13.f118512b;
        if (z13Var != null) {
            return z13Var;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
