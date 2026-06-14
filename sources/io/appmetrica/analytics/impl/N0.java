package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class N0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f76148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5409s1 f76149b;

    public N0(C5409s1 c5409s1, String str) {
        this.f76149b = c5409s1;
        this.f76148a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5409s1.a(this.f76149b).c(this.f76148a);
    }
}
