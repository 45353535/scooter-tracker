package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* JADX INFO: loaded from: classes12.dex */
public final class Mj implements Xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f76141a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f76142b;

    public Mj(AdRevenue adRevenue, boolean z10) {
        this.f76141a = adRevenue;
        this.f76142b = z10;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya2) {
        ya2.reportAdRevenue(this.f76141a, this.f76142b);
    }
}
