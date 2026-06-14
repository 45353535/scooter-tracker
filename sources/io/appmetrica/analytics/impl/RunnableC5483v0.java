package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.v0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class RunnableC5483v0 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C5508w0 f78407a;

    public RunnableC5483v0(C5508w0 c5508w0) {
        this.f78407a = c5508w0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5186j4.l().f77467c.a().executeDelayed(new RunnableC5459u1(this.f78407a.f78476a), TimeUnit.SECONDS.toMillis(5L));
    }
}
