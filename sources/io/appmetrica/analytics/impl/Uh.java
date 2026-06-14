package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* JADX INFO: loaded from: classes12.dex */
public final class Uh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f76565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5252li f76566b;

    public Uh(C5252li c5252li, AdRevenue adRevenue) {
        this.f76566b = c5252li;
        this.f76565a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5252li c5252li = this.f76566b;
        C5252li.a(c5252li.f77709a, c5252li.f77712d, c5252li.f77713e).reportAdRevenue(this.f76565a);
    }
}
