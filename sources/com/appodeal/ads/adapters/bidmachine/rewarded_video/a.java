package com.appodeal.ads.adapters.bidmachine.rewarded_video;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.adapters.bidmachine.BidMachineNetwork;
import com.appodeal.ads.adapters.bidmachine.k;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import io.bidmachine.IAd;
import md.c;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedRewardedCallback f12108a;

    public a(UnifiedRewardedCallback unifiedRewardedCallback) {
        this.f12108a = unifiedRewardedCallback;
    }

    @Override // io.bidmachine.AdListener
    public final void onAdClicked(IAd iAd) {
        this.f12108a.onAdClicked();
    }

    @Override // io.bidmachine.AdFullScreenListener
    public final void onAdClosed(IAd iAd, boolean z10) {
        this.f12108a.onAdClosed();
    }

    @Override // io.bidmachine.AdListener
    public final void onAdExpired(IAd iAd) {
        this.f12108a.onAdExpired();
    }

    @Override // io.bidmachine.AdListener
    public final void onAdImpression(IAd iAd) {
        this.f12108a.onAdShown();
    }

    @Override // io.bidmachine.AdListener
    public final void onAdLoadFailed(IAd iAd, ae.a aVar) {
        BidMachineNetwork.printError(this.f12108a, aVar);
        this.f12108a.onAdLoadFailed(BidMachineNetwork.mapBidMachineError(aVar));
    }

    @Override // io.bidmachine.AdListener
    public final void onAdLoaded(IAd iAd) {
        ImpressionLevelData impressionLevelDataA = k.a(((md.a) iAd).getAuctionResult());
        this.f12108a.onAdRevenueReceived(impressionLevelDataA);
        this.f12108a.onAdLoaded(impressionLevelDataA);
    }

    @Override // io.bidmachine.AdRewardedListener
    public final void onAdRewarded(IAd iAd) {
        this.f12108a.onAdFinished();
    }

    @Override // io.bidmachine.AdListener
    public final void onAdShowFailed(IAd iAd, ae.a aVar) {
        BidMachineNetwork.printError(this.f12108a, aVar);
        this.f12108a.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(aVar.g(), Integer.valueOf(aVar.e())));
    }
}
