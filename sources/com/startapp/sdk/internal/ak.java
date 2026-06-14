package com.startapp.sdk.internal;

/* JADX INFO: loaded from: classes11.dex */
public final class ak implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ bk f64286a;

    public ak(bk bkVar) {
        this.f64286a = bkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.startapp.sdk.ads.video.c cVar = this.f64286a.f64325b;
        int i10 = com.startapp.sdk.ads.video.c.f63865t0;
        cVar.j();
        this.f64286a.f64325b.t();
    }
}
