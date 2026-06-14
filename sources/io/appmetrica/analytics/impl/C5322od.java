package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.od, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C5322od extends SafeRunnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5471ud f77896a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f77897b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f77898c;

    public C5322od(C5471ud c5471ud, AdRevenue adRevenue, boolean z10) {
        this.f77896a = c5471ud;
        this.f77897b = adRevenue;
        this.f77898c = z10;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        C5471ud.a(this.f77896a).reportAdRevenue(this.f77897b, this.f77898c);
    }
}
