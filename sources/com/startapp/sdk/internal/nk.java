package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class nk implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f64970a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ok f64971b;

    public nk(ok okVar, String str) {
        this.f64971b = okVar;
        this.f64970a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f64971b.f65048b.compareAndSet(false, true)) {
            ok okVar = this.f64971b;
            okVar.f65053g.a(okVar.f65049c);
            this.f64971b.f65050d.a(String.valueOf(this.f64970a));
        }
    }
}
