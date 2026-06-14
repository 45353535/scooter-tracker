package io.appmetrica.analytics.impl;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.e1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5054e1 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f77045a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f77046b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5409s1 f77047c;

    public RunnableC5054e1(C5409s1 c5409s1, String str, String str2) {
        this.f77047c = c5409s1;
        this.f77045a = str;
        this.f77046b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5533x0 c5533x0 = this.f77047c.f78196a;
        String str = this.f77045a;
        String str2 = this.f77046b;
        c5533x0.getClass();
        C5508w0.c().putAppEnvironmentValue(str, str2);
    }
}
