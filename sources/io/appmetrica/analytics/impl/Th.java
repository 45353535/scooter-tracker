package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* JADX INFO: loaded from: classes12.dex */
public final class Th implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f76512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5252li f76513b;

    public Th(C5252li c5252li, Revenue revenue) {
        this.f76513b = c5252li;
        this.f76512a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5252li c5252li = this.f76513b;
        C5252li.a(c5252li.f77709a, c5252li.f77712d, c5252li.f77713e).reportRevenue(this.f76512a);
    }
}
