package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class S0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f76381a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5409s1 f76382b;

    public S0(C5409s1 c5409s1, String str) {
        this.f76382b = c5409s1;
        this.f76381a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5533x0 c5533x0 = this.f76382b.f78196a;
        String str = this.f76381a;
        c5533x0.getClass();
        C5508w0.c().setUserProfileID(str);
    }
}
