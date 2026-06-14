package com.appodeal.ads.adapters.bidmachine.banner;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.adapters.bidmachine.BidMachineNetwork;
import com.appodeal.ads.adapters.bidmachine.k;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import io.bidmachine.IAd;
import u8.c;
import u8.e;
import u8.f;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedBannerCallback f12077a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f12078b;

    public a(UnifiedBannerCallback unifiedBannerCallback, e eVar) {
        this.f12077a = unifiedBannerCallback;
        this.f12078b = eVar;
    }

    @Override // io.bidmachine.AdListener
    public final void onAdClicked(IAd iAd) {
        this.f12077a.onAdClicked();
    }

    @Override // io.bidmachine.AdListener
    public final void onAdExpired(IAd iAd) {
        this.f12077a.onAdExpired();
    }

    @Override // io.bidmachine.AdListener
    public final /* bridge */ /* synthetic */ void onAdImpression(IAd iAd) {
    }

    @Override // io.bidmachine.AdListener
    public final void onAdLoadFailed(IAd iAd, ae.a aVar) {
        BidMachineNetwork.printError(this.f12077a, aVar);
        this.f12077a.onAdLoadFailed(BidMachineNetwork.mapBidMachineError(aVar));
    }

    @Override // io.bidmachine.AdListener
    public final void onAdLoaded(IAd iAd) {
        f fVar = (f) iAd;
        ImpressionLevelData impressionLevelDataA = k.a(fVar.getAuctionResult());
        this.f12077a.onAdRevenueReceived(impressionLevelDataA);
        this.f12077a.onAdLoaded(fVar, this.f12078b.f105273c, impressionLevelDataA);
    }

    @Override // io.bidmachine.AdListener
    public final void onAdShowFailed(IAd iAd, ae.a aVar) {
        BidMachineNetwork.printError(this.f12077a, aVar);
        this.f12077a.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(aVar.g(), Integer.valueOf(aVar.e())));
    }
}
