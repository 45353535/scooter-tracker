package com.startapp.sdk.ads.banner;

import com.startapp.sdk.ads.banner.BannerRequest;
import com.startapp.sdk.adsbase.Ad;
import com.startapp.sdk.adsbase.adlisteners.AdEventListener;
import com.startapp.sdk.adsbase.model.AdPreferences;
import com.startapp.sdk.internal.r1;

/* JADX INFO: loaded from: classes11.dex */
public final class c implements AdEventListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BannerRequest.Callback f63753a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ BannerFormat f63754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ AdPreferences f63755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r1 f63756d;

    public c(BannerRequest.Callback callback, BannerFormat bannerFormat, AdPreferences adPreferences, r1 r1Var) {
        this.f63753a = callback;
        this.f63754b = bannerFormat;
        this.f63755c = adPreferences;
        this.f63756d = r1Var;
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onFailedToReceiveAd(Ad ad2) {
        this.f63753a.onFinished(null, String.valueOf(this.f63756d.getErrorMessage()));
    }

    @Override // com.startapp.sdk.adsbase.adlisteners.AdEventListener
    public final void onReceiveAd(Ad ad2) {
        this.f63753a.onFinished(new b(this), null);
    }
}
