package com.appodeal.ads.adapters.bigo_ads.unified;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.adapters.bigo_ads.BigoAdsNetwork;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import kotlin.jvm.internal.Intrinsics;
import sg.bigo.ads.api.Ad;
import sg.bigo.ads.api.AdError;
import sg.bigo.ads.api.AdInteractionListener;
import sg.bigo.ads.api.AdLoadListener;
import sg.bigo.ads.api.RewardAdInteractionListener;

/* JADX INFO: loaded from: classes6.dex */
public abstract class b implements AdLoadListener, AdInteractionListener, RewardAdInteractionListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedFullscreenAdCallback f12179a;

    public b(UnifiedFullscreenAdCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12179a = callback;
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClicked() {
        this.f12179a.onAdClicked();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdClosed() {
        this.f12179a.onAdClosed();
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdError(AdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        this.f12179a.printError(adError.getMessage(), Integer.valueOf(adError.getCode()));
        UnifiedFullscreenAdCallback unifiedFullscreenAdCallback = this.f12179a;
        String message = adError.getMessage();
        Intrinsics.checkNotNullExpressionValue(message, "getMessage(...)");
        unifiedFullscreenAdCallback.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(message, Integer.valueOf(adError.getCode())));
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdImpression() {
        this.f12179a.onAdShown();
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public void onAdLoaded(Ad ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        ImpressionLevelData impressionLevelDataA = a.a(ad2.getBid());
        this.f12179a.onAdRevenueReceived(impressionLevelDataA);
        this.f12179a.onAdLoaded(impressionLevelDataA);
    }

    @Override // sg.bigo.ads.api.AdInteractionListener
    public final void onAdOpened() {
    }

    @Override // sg.bigo.ads.api.RewardAdInteractionListener
    public final void onAdRewarded() {
        this.f12179a.onAdFinished();
    }

    @Override // sg.bigo.ads.api.AdLoadListener
    public final void onError(AdError adError) {
        Intrinsics.checkNotNullParameter(adError, "adError");
        this.f12179a.printError(adError.getMessage(), Integer.valueOf(adError.getCode()));
        this.f12179a.onAdLoadFailed(BigoAdsNetwork.INSTANCE.mapError(adError));
    }
}
