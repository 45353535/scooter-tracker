package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkParametersListener;

/* JADX INFO: loaded from: classes12.dex */
public final class Y0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeferredDeeplinkParametersListener f76684a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5409s1 f76685b;

    public Y0(C5409s1 c5409s1, DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        this.f76685b = c5409s1;
        this.f76684a = deferredDeeplinkParametersListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76685b.f78196a.getClass();
        C5508w0 c5508w0 = C5508w0.f78473e;
        c5508w0.f().a(this.f76684a);
    }
}
