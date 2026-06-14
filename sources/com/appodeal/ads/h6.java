package com.appodeal.ads;

/* JADX INFO: loaded from: classes6.dex */
public abstract class h6 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static z5 f13387a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m6 f13388b = new m6();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static v5 f13389c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static q3 f13390d;

    public static v5 a() {
        v5 v5Var;
        v5 v5Var2 = f13389c;
        if (v5Var2 != null) {
            return v5Var2;
        }
        synchronized (l0.class) {
            try {
                v5Var = f13389c;
                if (v5Var == null) {
                    v5Var = new v5(b());
                    f13389c = v5Var;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return v5Var;
    }

    public static z5 b() {
        if (f13387a == null) {
            f13387a = new z5();
        }
        return f13387a;
    }
}
