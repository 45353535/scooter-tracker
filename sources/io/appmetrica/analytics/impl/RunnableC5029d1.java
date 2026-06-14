package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.d1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5029d1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f76997a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5409s1 f76998b;

    public RunnableC5029d1(C5409s1 c5409s1, String str) {
        this.f76998b = c5409s1;
        this.f76997a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5409s1.a(this.f76998b).b(this.f76997a);
    }
}
