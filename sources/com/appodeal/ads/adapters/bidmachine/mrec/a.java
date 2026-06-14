package com.appodeal.ads.adapters.bidmachine.mrec;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.adapters.bidmachine.BidMachineNetwork;
import com.appodeal.ads.adapters.bidmachine.k;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import io.bidmachine.IAd;
import u8.c;
import u8.f;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedMrecCallback f12098a;

    public a(UnifiedMrecCallback unifiedMrecCallback) {
        this.f12098a = unifiedMrecCallback;
    }

    @Override // io.bidmachine.AdListener
    public final void onAdClicked(IAd iAd) {
        this.f12098a.onAdClicked();
    }

    @Override // io.bidmachine.AdListener
    public final void onAdExpired(IAd iAd) {
        this.f12098a.onAdExpired();
    }

    @Override // io.bidmachine.AdListener
    public final /* bridge */ /* synthetic */ void onAdImpression(IAd iAd) {
    }

    @Override // io.bidmachine.AdListener
    public final void onAdLoadFailed(IAd iAd, ae.a aVar) {
        BidMachineNetwork.printError(this.f12098a, aVar);
        this.f12098a.onAdLoadFailed(BidMachineNetwork.mapBidMachineError(aVar));
    }

    @Override // io.bidmachine.AdListener
    public final void onAdLoaded(IAd iAd) {
        f fVar = (f) iAd;
        ImpressionLevelData impressionLevelDataA = k.a(fVar.getAuctionResult());
        this.f12098a.onAdRevenueReceived(impressionLevelDataA);
        this.f12098a.onAdLoaded(fVar, impressionLevelDataA);
    }

    @Override // io.bidmachine.AdListener
    public final void onAdShowFailed(IAd iAd, ae.a aVar) {
        BidMachineNetwork.printError(this.f12098a, aVar);
        this.f12098a.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(aVar.g(), Integer.valueOf(aVar.e())));
    }
}
