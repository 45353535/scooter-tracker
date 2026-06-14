package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.DeferredDeeplinkListener;

/* JADX INFO: loaded from: classes12.dex */
public final class Z0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ DeferredDeeplinkListener f76727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C5409s1 f76728b;

    public Z0(C5409s1 c5409s1, DeferredDeeplinkListener deferredDeeplinkListener) {
        this.f76728b = c5409s1;
        this.f76727a = deferredDeeplinkListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f76728b.f78196a.getClass();
        C5508w0 c5508w0 = C5508w0.f78473e;
        c5508w0.f().a(this.f76727a);
    }
}
