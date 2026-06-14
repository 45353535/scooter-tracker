package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class ng implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Runnable f64965a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ og f64966b;

    public ng(og ogVar, Runnable runnable) {
        this.f64966b = ogVar;
        this.f64965a = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f64965a.run();
        } finally {
            this.f64966b.a();
        }
    }
}
