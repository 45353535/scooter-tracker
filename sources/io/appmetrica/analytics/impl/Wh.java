package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* JADX INFO: loaded from: classes12.dex */
public final class Wh implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f76637a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5252li f76638b;

    public Wh(C5252li c5252li, ECommerceEvent eCommerceEvent) {
        this.f76638b = c5252li;
        this.f76637a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5252li c5252li = this.f76638b;
        C5252li.a(c5252li.f77709a, c5252li.f77712d, c5252li.f77713e).reportECommerce(this.f76637a);
    }
}
