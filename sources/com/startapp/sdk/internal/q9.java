package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class q9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w9 f65150a;

    public q9(w9 w9Var) {
        this.f65150a = w9Var;
    }

    public final void a(g9 g9Var, int i10) {
        try {
            w9 w9Var = this.f65150a;
            w9Var.getClass();
            long jCurrentTimeMillis = System.currentTimeMillis();
            m8 m8Var = w9Var.f65456b;
            m8Var.f64912a.post(new r9(w9Var, g9Var, i10, jCurrentTimeMillis));
        } catch (Throwable unused) {
        }
    }
}
