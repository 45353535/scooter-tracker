package io.sentry.util;

import io.sentry.d9;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a0 {
    public static d9 a(d9 d9Var) {
        if (d9Var.c() != null) {
            return d9Var;
        }
        return new d9(d9Var.e(), d9Var.d(), b(null, d9Var.d(), d9Var.e()), d9Var.b(), d9Var.a());
    }

    public static Double b(Double d10, Double d11, Boolean bool) {
        if (d10 != null) {
            return d10;
        }
        double dH = b0.a().h();
        return (d11 == null || bool == null) ? Double.valueOf(dH) : bool.booleanValue() ? Double.valueOf(dH * d11.doubleValue()) : Double.valueOf(d11.doubleValue() + (dH * (1.0d - d11.doubleValue())));
    }

    public static boolean c(Double d10) {
        return e(d10, true);
    }

    public static boolean d(Double d10) {
        return e(d10, true);
    }

    private static boolean e(Double d10, boolean z10) {
        return d10 == null ? z10 : !d10.isNaN() && d10.doubleValue() >= 0.0d && d10.doubleValue() <= 1.0d;
    }

    public static boolean f(Double d10) {
        return e(d10, true);
    }

    public static boolean g(Double d10) {
        return h(d10, true);
    }

    public static boolean h(Double d10, boolean z10) {
        return e(d10, z10);
    }
}
