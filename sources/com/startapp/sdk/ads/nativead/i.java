package com.startapp.sdk.ads.nativead;

import com.startapp.sdk.adsbase.adlisteners.AdEventListener;

/* JADX INFO: loaded from: classes11.dex */
public final class i implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f63842a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f63843b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdEventListener f63844c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ StartAppNativeAd f63845d;

    public i(StartAppNativeAd startAppNativeAd, int i10, AdEventListener adEventListener) {
        this.f63845d = startAppNativeAd;
        this.f63843b = i10;
        this.f63844c = adEventListener;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f63842a + 1;
        this.f63842a = i10;
        if (i10 == this.f63843b) {
            this.f63845d.onReceiveAd(this.f63844c);
        }
    }
}
