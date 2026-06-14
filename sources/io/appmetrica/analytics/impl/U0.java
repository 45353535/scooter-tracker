package io.appmetrica.analytics.impl;

/* JADX INFO: loaded from: classes12.dex */
public final class U0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5409s1 f76543a;

    public U0(C5409s1 c5409s1) {
        this.f76543a = c5409s1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5409s1.a(this.f76543a).sendEventsBuffer();
    }
}
