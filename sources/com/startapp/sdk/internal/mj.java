package com.startapp.sdk.internal;

import android.os.Handler;
import android.os.Looper;
import android.webkit.JavascriptInterface;
import com.startapp.sdk.ads.interstitials.OverlayActivity;
import com.startapp.sdk.adsbase.commontracking.TrackingParams;

/* JADX INFO: loaded from: classes11.dex */
public final class mj extends fb {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final tj f64942h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.startapp.sdk.ads.video.a f64943i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final sj f64944j;

    public mj(OverlayActivity overlayActivity, oa oaVar, oa oaVar2, tj tjVar, com.startapp.sdk.ads.video.a aVar, sj sjVar, TrackingParams trackingParams, boolean z10) {
        super(overlayActivity, oaVar, trackingParams);
        this.f64497d = oaVar2;
        this.f64942h = tjVar;
        this.f64943i = aVar;
        this.f64944j = sjVar;
        this.f64495b = z10;
    }

    @JavascriptInterface
    public void replayVideo() {
        new Handler(Looper.getMainLooper()).post(this.f64942h);
    }

    @JavascriptInterface
    public void skipVideo() {
        new Handler(Looper.getMainLooper()).post(this.f64943i);
    }

    @JavascriptInterface
    public void toggleSound() {
        new Handler(Looper.getMainLooper()).post(this.f64944j);
    }
}
