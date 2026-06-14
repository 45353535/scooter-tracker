package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* JADX INFO: loaded from: classes12.dex */
public final class Cj implements Xa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f75627a;

    public Cj(ECommerceEvent eCommerceEvent) {
        this.f75627a = eCommerceEvent;
    }

    @Override // io.appmetrica.analytics.impl.Xa
    public final void a(Ya ya2) {
        ya2.reportECommerce(this.f75627a);
    }
}
