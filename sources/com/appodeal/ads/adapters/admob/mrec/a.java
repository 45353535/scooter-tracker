package com.appodeal.ads.adapters.admob.mrec;

import com.appodeal.ads.adapters.admob.unified.UnifiedAdRevenueListener;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.LoadAdError;

/* JADX INFO: loaded from: classes6.dex */
public final class a extends AdListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ BaseAdView f11911a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnifiedMrecCallback f11912b;

    public a(BaseAdView baseAdView, UnifiedMrecCallback unifiedMrecCallback) {
        this.f11911a = baseAdView;
        this.f11912b = unifiedMrecCallback;
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdClicked() {
        super.onAdClicked();
        this.f11912b.onAdClicked();
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        super.onAdFailedToLoad(loadAdError);
        this.f11912b.printError(loadAdError.getMessage(), Integer.valueOf(loadAdError.getCode()));
        this.f11912b.onAdLoadFailed(UnifiedAdmobNetwork.mapError(loadAdError));
    }

    @Override // com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        super.onAdLoaded();
        BaseAdView baseAdView = this.f11911a;
        baseAdView.setOnPaidEventListener(new UnifiedAdRevenueListener(this.f11912b, baseAdView.getResponseInfo()));
        this.f11912b.onAdLoaded(this.f11911a);
    }
}
