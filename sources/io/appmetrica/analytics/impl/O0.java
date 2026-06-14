package io.appmetrica.analytics.impl;

import android.location.Location;

/* JADX INFO: loaded from: classes12.dex */
public final class O0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Location f76183a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5409s1 f76184b;

    public O0(C5409s1 c5409s1, Location location) {
        this.f76184b = c5409s1;
        this.f76183a = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5533x0 c5533x0 = this.f76184b.f78196a;
        Location location = this.f76183a;
        c5533x0.getClass();
        C5508w0.c().a(location);
    }
}
