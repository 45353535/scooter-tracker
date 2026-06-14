package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class P0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f76211a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5409s1 f76212b;

    public P0(C5409s1 c5409s1, boolean z10) {
        this.f76212b = c5409s1;
        this.f76211a = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5533x0 c5533x0 = this.f76212b.f78196a;
        boolean z10 = this.f76211a;
        c5533x0.getClass();
        C5508w0.c().a(z10);
    }
}
