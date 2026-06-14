package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* JADX INFO: loaded from: classes12.dex */
public final class V0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f76577a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5409s1 f76578b;

    public V0(C5409s1 c5409s1, Revenue revenue) {
        this.f76578b = c5409s1;
        this.f76577a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5409s1.a(this.f76578b).reportRevenue(this.f76577a);
    }
}
