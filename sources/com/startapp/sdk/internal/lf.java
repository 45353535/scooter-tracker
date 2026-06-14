package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class lf implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ sf f64872a;

    public lf(sf sfVar) {
        this.f64872a = sfVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f64872a.c();
        } catch (Throwable th2) {
            g9.a(th2);
        }
    }
}
