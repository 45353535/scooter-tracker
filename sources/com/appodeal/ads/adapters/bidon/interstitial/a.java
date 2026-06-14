package com.appodeal.ads.adapters.bidon.interstitial;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.adapters.bidon.ext.f;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.ads.Ad;
import org.bidon.sdk.ads.AuctionInfo;
import org.bidon.sdk.ads.interstitial.InterstitialListener;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.analytic.AdValue;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements InterstitialListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ UnifiedInterstitialCallback f12132a;

    public a(UnifiedInterstitialCallback unifiedInterstitialCallback) {
        this.f12132a = unifiedInterstitialCallback;
    }

    @Override // org.bidon.sdk.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        this.f12132a.onAdClicked();
    }

    @Override // org.bidon.sdk.ads.FullscreenAdListener
    public final void onAdClosed(Ad ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        this.f12132a.onAdClosed();
    }

    @Override // org.bidon.sdk.ads.AdListener
    public final void onAdExpired(Ad ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        this.f12132a.onAdExpired();
    }

    @Override // org.bidon.sdk.ads.AdListener
    public final void onAdLoadFailed(AuctionInfo auctionInfo, BidonError cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        if (auctionInfo != null) {
            this.f12132a.onAdditionalInfoLoaded(f.c(auctionInfo));
        }
        this.f12132a.onAdLoadFailed(f.b(cause));
    }

    @Override // org.bidon.sdk.ads.AdListener
    public final void onAdLoaded(Ad ad2, AuctionInfo auctionInfo) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(auctionInfo, "auctionInfo");
        String strC = f.c(auctionInfo);
        ImpressionLevelData impressionLevelDataA = f.a(ad2, null, false);
        this.f12132a.onAdditionalInfoLoaded(strC);
        this.f12132a.onAdLoaded(impressionLevelDataA);
    }

    @Override // org.bidon.sdk.ads.AdListener
    public final void onAdShowFailed(BidonError cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f12132a.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(cause.toString(), null, 2, null));
    }

    @Override // org.bidon.sdk.ads.AdListener
    public final void onAdShown(Ad ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        this.f12132a.onAdShown();
    }

    @Override // org.bidon.sdk.logs.analytic.AdRevenueListener
    public final void onRevenuePaid(Ad ad2, AdValue adValue) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(adValue, "adValue");
        this.f12132a.onAdRevenueReceived(f.a(ad2, adValue, true));
    }
}
