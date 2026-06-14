package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* JADX INFO: loaded from: classes12.dex */
public final class X0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f76648a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5409s1 f76649b;

    public X0(C5409s1 c5409s1, ECommerceEvent eCommerceEvent) {
        this.f76649b = c5409s1;
        this.f76648a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5409s1.a(this.f76649b).reportECommerce(this.f76648a);
    }
}
