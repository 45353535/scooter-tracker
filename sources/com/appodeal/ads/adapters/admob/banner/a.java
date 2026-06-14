package com.appodeal.ads.adapters.admob.banner;

import com.appodeal.ads.adapters.admob.unified.UnifiedAdRevenueListener;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseAdView f11906a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnifiedBannerCallback f11907b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f11908c;

    public a(UnifiedBannerCallback unifiedBannerCallback, BaseAdView baseAdView, int i10) {
        this.f11906a = baseAdView;
        this.f11907b = unifiedBannerCallback;
        this.f11908c = i10;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        super.onAdClicked();
        this.f11907b.onAdClicked();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        super.onAdFailedToLoad(loadAdError);
        this.f11907b.printError(loadAdError.getMessage(), Integer.valueOf(loadAdError.getCode()));
        this.f11907b.onAdLoadFailed(UnifiedAdmobNetwork.mapError(loadAdError));
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        super.onAdLoaded();
        BaseAdView baseAdView = this.f11906a;
        baseAdView.setOnPaidEventListener(new UnifiedAdRevenueListener(this.f11907b, baseAdView.getResponseInfo()));
        this.f11907b.onAdLoaded(this.f11906a, this.f11908c);
    }
}
