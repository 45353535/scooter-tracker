package io.sentry.util;

/* JADX INFO: loaded from: classes3.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static boolean f84321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static boolean f84322b;

    static {
        try {
            f84321a = "The Android Project".equals(System.getProperty("java.vendor"));
        } catch (Throwable unused) {
            f84321a = false;
        }
        try {
            String property = System.getProperty("java.specification.version");
            if (property != null) {
                f84322b = Double.valueOf(property).doubleValue() >= 9.0d;
            } else {
                f84322b = false;
            }
        } catch (Throwable unused2) {
            f84322b = false;
        }
    }

    public static boolean a() {
        return f84321a;
    }

    public static boolean b() {
        return f84322b;
    }

    public static boolean c() {
        return !f84321a;
    }
}
