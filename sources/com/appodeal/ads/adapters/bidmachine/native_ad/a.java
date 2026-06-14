package com.appodeal.ads.adapters.bidmachine.native_ad;

import ac.k;
import com.appodeal.ads.ShowError;
import com.appodeal.ads.adapters.bidmachine.BidMachineNetwork;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import io.bidmachine.IAd;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UnifiedNativeCallback f12101a;

    public a(UnifiedNativeCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f12101a = callback;
    }

    @Override // io.bidmachine.AdListener
    public final void onAdClicked(IAd iAd) {
        ac.b nativeAd = (ac.b) iAd;
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        this.f12101a.onAdClicked();
    }

    @Override // io.bidmachine.AdListener
    public final void onAdExpired(IAd iAd) {
        ac.b nativeAd = (ac.b) iAd;
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        this.f12101a.onAdExpired();
    }

    @Override // io.bidmachine.AdListener
    public final void onAdImpression(IAd iAd) {
        ac.b nativeAd = (ac.b) iAd;
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
    }

    @Override // io.bidmachine.AdListener
    public final void onAdLoadFailed(IAd iAd, ae.a bmError) {
        ac.b nativeAd = (ac.b) iAd;
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        Intrinsics.checkNotNullParameter(bmError, "bmError");
        this.f12101a.onAdLoadFailed(BidMachineNetwork.mapBidMachineError(bmError));
    }

    @Override // io.bidmachine.AdListener
    public final void onAdLoaded(IAd iAd) {
        ac.b nativeAd = (ac.b) iAd;
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        ImpressionLevelData impressionLevelDataA = com.appodeal.ads.adapters.bidmachine.k.a(nativeAd.getAuctionResult());
        this.f12101a.onAdRevenueReceived(impressionLevelDataA);
        UnifiedNativeCallback unifiedNativeCallback = this.f12101a;
        Intrinsics.checkNotNullParameter(nativeAd, "<this>");
        String strH = nativeAd.h();
        if (strH == null) {
            strH = "";
        }
        String strE = nativeAd.e();
        if (strE == null) {
            strE = "";
        }
        String strD = nativeAd.d();
        if (strD == null) {
            strD = "";
        }
        unifiedNativeCallback.onAdLoaded(new c(nativeAd, strH, strE, strD, nativeAd.g()), impressionLevelDataA);
    }

    @Override // io.bidmachine.AdListener
    public final void onAdShowFailed(IAd iAd, ae.a bmError) {
        ac.b nativeAd = (ac.b) iAd;
        Intrinsics.checkNotNullParameter(nativeAd, "nativeAd");
        Intrinsics.checkNotNullParameter(bmError, "bmError");
        BidMachineNetwork.printError(this.f12101a, bmError);
        UnifiedNativeCallback unifiedNativeCallback = this.f12101a;
        String strG = bmError.g();
        Intrinsics.checkNotNullExpressionValue(strG, "getMessage(...)");
        unifiedNativeCallback.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(strG, Integer.valueOf(bmError.e())));
    }
}
