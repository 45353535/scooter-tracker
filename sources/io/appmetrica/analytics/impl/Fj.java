package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* JADX INFO: loaded from: classes12.dex */
public final class Fj implements Xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f75782a;

    public Fj(AdRevenue adRevenue) {
        this.f75782a = adRevenue;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya2) {
        ya2.reportAdRevenue(this.f75782a);
    }
}
