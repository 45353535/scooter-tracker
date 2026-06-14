package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class fc implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f64501a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gc f64502b;

    public fc(gc gcVar, Runnable runnable) {
        this.f64502b = gcVar;
        this.f64501a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f64502b.a(this.f64501a);
        synchronized (this.f64502b) {
            this.f64502b.f64565c = null;
        }
    }
}
