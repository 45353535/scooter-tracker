package com.fyber.inneractive.sdk.web;

/* JADX INFO: loaded from: classes7.dex */
public final class a1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b1 f23929a;

    public a1(b1 b1Var) {
        this.f23929a = b1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f23929a.f23932a.evictAll();
        } catch (Throwable unused) {
        }
    }
}
