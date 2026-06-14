package com.appodeal.ads.adapters.bidmachine.interstitial;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.adapters.bidmachine.BidMachineNetwork;
import com.appodeal.ads.adapters.bidmachine.k;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import io.bidmachine.IAd;
import l9.c;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedInterstitialCallback f12094a;

    public a(UnifiedInterstitialCallback unifiedInterstitialCallback) {
        this.f12094a = unifiedInterstitialCallback;
    }

    @Override // io.bidmachine.AdListener
    public final void onAdClicked(IAd iAd) {
        this.f12094a.onAdClicked();
    }

    @Override // io.bidmachine.AdFullScreenListener
    public final void onAdClosed(IAd iAd, boolean z10) {
        if (z10) {
            this.f12094a.onAdFinished();
        }
        this.f12094a.onAdClosed();
    }

    @Override // io.bidmachine.AdListener
    public final void onAdExpired(IAd iAd) {
        this.f12094a.onAdExpired();
    }

    @Override // io.bidmachine.AdListener
    public final void onAdImpression(IAd iAd) {
        this.f12094a.onAdShown();
    }

    @Override // io.bidmachine.AdListener
    public final void onAdLoadFailed(IAd iAd, ae.a aVar) {
        BidMachineNetwork.printError(this.f12094a, aVar);
        this.f12094a.onAdLoadFailed(BidMachineNetwork.mapBidMachineError(aVar));
    }

    @Override // io.bidmachine.AdListener
    public final void onAdLoaded(IAd iAd) {
        ImpressionLevelData impressionLevelDataA = k.a(((l9.a) iAd).getAuctionResult());
        this.f12094a.onAdRevenueReceived(impressionLevelDataA);
        this.f12094a.onAdLoaded(impressionLevelDataA);
    }

    @Override // io.bidmachine.AdListener
    public final void onAdShowFailed(IAd iAd, ae.a aVar) {
        BidMachineNetwork.printError(this.f12094a, aVar);
        this.f12094a.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(aVar.g(), Integer.valueOf(aVar.e())));
    }
}
