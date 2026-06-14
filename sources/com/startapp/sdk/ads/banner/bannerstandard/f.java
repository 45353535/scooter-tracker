package com.startapp.sdk.ads.banner.bannerstandard;

/* JADX INFO: loaded from: classes11.dex */
public final class f implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ CloseableLayout f63736a;

    public f(CloseableLayout closeableLayout) {
        this.f63736a = closeableLayout;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f63736a.a(false);
    }
}
