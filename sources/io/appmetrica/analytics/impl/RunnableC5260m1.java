package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.m1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5260m1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f77728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5409s1 f77729b;

    public RunnableC5260m1(C5409s1 c5409s1, String str) {
        this.f77729b = c5409s1;
        this.f77728a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5409s1.a(this.f77729b).reportEvent(this.f77728a);
    }
}
