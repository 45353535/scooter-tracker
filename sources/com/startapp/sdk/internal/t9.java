package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class t9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ g9 f65302a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ j9 f65303b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ w9 f65304c;

    public t9(w9 w9Var, g9 g9Var, j9 j9Var) {
        this.f65304c = w9Var;
        this.f65302a = g9Var;
        this.f65303b = j9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w9 w9Var = this.f65304c;
        Runnable runnable = (Runnable) w9Var.f65460f.a(this.f65302a, this.f65303b, null);
        if (runnable != null) {
            w9Var.f65457c.execute(runnable);
        }
    }
}
