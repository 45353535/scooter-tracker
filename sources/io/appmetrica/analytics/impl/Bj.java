package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* JADX INFO: loaded from: classes12.dex */
public final class Bj implements Xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f75598a;

    public Bj(Revenue revenue) {
        this.f75598a = revenue;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya2) {
        ya2.reportRevenue(this.f75598a);
    }
}
