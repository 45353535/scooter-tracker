package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.q1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5360q1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f78019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f78020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f78021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C5409s1 f78022d;

    public RunnableC5360q1(C5409s1 c5409s1, String str, String str2, Throwable th2) {
        this.f78022d = c5409s1;
        this.f78019a = str;
        this.f78020b = str2;
        this.f78021c = th2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5409s1.a(this.f78022d).reportError(this.f78019a, this.f78020b, this.f78021c);
    }
}
