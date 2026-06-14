package com.appodeal.ads.adapters.bidon.mrec;

import com.appodeal.ads.ShowError;
import com.appodeal.ads.adapters.bidon.ext.f;
import com.appodeal.ads.modules.common.internal.adunit.ImpressionLevelData;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.ads.Ad;
import org.bidon.sdk.ads.AuctionInfo;
import org.bidon.sdk.ads.banner.BannerListener;
import org.bidon.sdk.ads.banner.BannerView;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.analytic.AdValue;

/* JADX INFO: loaded from: classes6.dex */
public final class a implements BannerListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b f12134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ UnifiedMrecCallback f12135b;

    public a(b bVar, UnifiedMrecCallback unifiedMrecCallback) {
        this.f12134a = bVar;
        this.f12135b = unifiedMrecCallback;
    }

    @Override // org.bidon.sdk.ads.AdListener
    public final void onAdClicked(Ad ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        this.f12135b.onAdClicked();
    }

    @Override // org.bidon.sdk.ads.AdListener
    public final void onAdExpired(Ad ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        this.f12135b.onAdExpired();
    }

    @Override // org.bidon.sdk.ads.AdListener
    public final void onAdLoadFailed(AuctionInfo auctionInfo, BidonError cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        if (auctionInfo != null) {
            this.f12135b.onAdditionalInfoLoaded(f.c(auctionInfo));
        }
        this.f12135b.onAdLoadFailed(f.b(cause));
    }

    @Override // org.bidon.sdk.ads.AdListener
    public final void onAdLoaded(Ad ad2, AuctionInfo auctionInfo) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(auctionInfo, "auctionInfo");
        BannerView bannerView = this.f12134a.f12136a;
        if (bannerView == null) {
            return;
        }
        String strC = f.c(auctionInfo);
        ImpressionLevelData impressionLevelDataA = f.a(ad2, null, false);
        this.f12135b.onAdditionalInfoLoaded(strC);
        this.f12135b.onAdLoaded(bannerView, impressionLevelDataA);
    }

    @Override // org.bidon.sdk.ads.AdListener
    public final void onAdShowFailed(BidonError cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        this.f12135b.onAdShowFailed(new ShowError.NetworkShowError.ErrorOnCallback(cause.toString(), null, 2, null));
    }

    @Override // org.bidon.sdk.ads.AdListener
    public final void onAdShown(Ad ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
    }

    @Override // org.bidon.sdk.logs.analytic.AdRevenueListener
    public final void onRevenuePaid(Ad ad2, AdValue adValue) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(adValue, "adValue");
        this.f12135b.onAdRevenueReceived(f.a(ad2, adValue, true));
    }
}
