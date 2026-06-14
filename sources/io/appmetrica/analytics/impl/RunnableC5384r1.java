package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.r1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5384r1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f78107a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5409s1 f78108b;

    public RunnableC5384r1(C5409s1 c5409s1, Throwable th2) {
        this.f78108b = c5409s1;
        this.f78107a = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5409s1.a(this.f78108b).reportUnhandledException(this.f78107a);
    }
}
