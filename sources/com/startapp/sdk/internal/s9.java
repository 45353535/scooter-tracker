package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class s9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g9 f65251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j9 f65252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w9 f65253c;

    public s9(w9 w9Var, g9 g9Var, j9 j9Var) {
        this.f65253c = w9Var;
        this.f65251a = g9Var;
        this.f65252b = j9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w9 w9Var = this.f65253c;
        g9 g9Var = this.f65251a;
        j9 j9Var = this.f65252b;
        w9Var.getClass();
        try {
            w9Var.f65455a.a(g9Var, j9Var);
        } catch (Throwable unused) {
        }
    }
}
