package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* JADX INFO: loaded from: classes12.dex */
public final class W0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f76608a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5409s1 f76609b;

    public W0(C5409s1 c5409s1, AdRevenue adRevenue) {
        this.f76609b = c5409s1;
        this.f76608a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5409s1.a(this.f76609b).reportAdRevenue(this.f76608a);
    }
}
