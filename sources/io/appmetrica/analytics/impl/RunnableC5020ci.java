package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.ci, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5020ci implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f76974a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f76975b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C5252li f76976c;

    public RunnableC5020ci(C5252li c5252li, AdRevenue adRevenue, boolean z10) {
        this.f76976c = c5252li;
        this.f76974a = adRevenue;
        this.f76975b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5252li c5252li = this.f76976c;
        C5252li.a(c5252li.f77709a, c5252li.f77712d, c5252li.f77713e).reportAdRevenue(this.f76974a, this.f76975b);
    }
}
