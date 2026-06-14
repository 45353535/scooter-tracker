package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class o9 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w9 f65012a;

    public o9(w9 w9Var) {
        this.f65012a = w9Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f65012a.b();
        } catch (Throwable unused) {
        }
    }
}
