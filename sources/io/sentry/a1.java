package io.sentry;

/* JADX INFO: loaded from: classes3.dex */
public abstract /* synthetic */ class a1 {
    public static io.sentry.protocol.x a(b1 b1Var, u5 u5Var) {
        return b1Var.w(u5Var, new i0());
    }

    public static io.sentry.protocol.x b(b1 b1Var, Throwable th2) {
        return b1Var.J(th2, new i0());
    }

    public static io.sentry.protocol.x c(b1 b1Var, io.sentry.protocol.e0 e0Var, b9 b9Var, i0 i0Var) {
        return b1Var.C(e0Var, b9Var, i0Var, null);
    }

    public static void d(b1 b1Var, j4 j4Var) {
        b1Var.F(null, j4Var);
    }

    public static boolean e(b1 b1Var) {
        return false;
    }
}
