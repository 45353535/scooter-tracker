package org.bidon.sdk.ads.banner;

import android.app.Activity;
import com.ironsource.Df;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.ads.Ad;
import org.bidon.sdk.ads.AuctionInfo;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.analytic.AdValue;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u001a\u0010\b\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0018\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\nH\u0016¨\u0006\u0012"}, d2 = {"org/bidon/sdk/ads/banner/BannerManager$showAd$1$1", "Lorg/bidon/sdk/ads/banner/BannerListener;", "onAdLoaded", "", "ad", "Lorg/bidon/sdk/ads/Ad;", "auctionInfo", "Lorg/bidon/sdk/ads/AuctionInfo;", Df.f40641b, "cause", "Lorg/bidon/sdk/config/BidonError;", "onAdShown", Df.f40645f, "onAdExpired", "onRevenuePaid", "adValue", "Lorg/bidon/sdk/logs/analytic/AdValue;", Df.f40644e, "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BannerManager$showAd$1$1 implements BannerListener {
    final /* synthetic */ Activity $activity;
    final /* synthetic */ BannerManager this$0;

    BannerManager$showAd$1$1(Activity activity, BannerManager bannerManager) {
        this.$activity = activity;
        this.this$0 = bannerManager;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAdClicked$lambda$1(BannerManager bannerManager, Ad ad2) {
        BannerListener bannerListener = bannerManager.publisherListener;
        if (bannerListener != null) {
            bannerListener.onAdClicked(ad2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAdExpired$lambda$2(BannerManager bannerManager, Ad ad2) {
        BannerListener bannerListener = bannerManager.publisherListener;
        if (bannerListener != null) {
            bannerListener.onAdExpired(ad2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAdShowFailed$lambda$4(BannerManager bannerManager, BidonError bidonError) {
        BannerListener bannerListener = bannerManager.publisherListener;
        if (bannerListener != null) {
            bannerListener.onAdShowFailed(bidonError);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onAdShown$lambda$0(BannerManager bannerManager, Ad ad2) {
        BannerListener bannerListener = bannerManager.publisherListener;
        if (bannerListener != null) {
            bannerListener.onAdShown(ad2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onRevenuePaid$lambda$3(BannerManager bannerManager, Ad ad2, AdValue adValue) {
        BannerListener bannerListener = bannerManager.publisherListener;
        if (bannerListener != null) {
            bannerListener.onRevenuePaid(ad2, adValue);
        }
    }

    @Override // org.bidon.sdk.ads.AdListener
    public void onAdClicked(final Ad ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Activity activity = this.$activity;
        final BannerManager bannerManager = this.this$0;
        activity.runOnUiThread(new Runnable() { // from class: org.bidon.sdk.ads.banner.j
            @Override // java.lang.Runnable
            public final void run() {
                BannerManager$showAd$1$1.onAdClicked$lambda$1(bannerManager, ad2);
            }
        });
    }

    @Override // org.bidon.sdk.ads.AdListener
    public void onAdExpired(final Ad ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Activity activity = this.$activity;
        final BannerManager bannerManager = this.this$0;
        activity.runOnUiThread(new Runnable() { // from class: org.bidon.sdk.ads.banner.i
            @Override // java.lang.Runnable
            public final void run() {
                BannerManager$showAd$1$1.onAdExpired$lambda$2(bannerManager, ad2);
            }
        });
    }

    @Override // org.bidon.sdk.ads.AdListener
    public void onAdLoadFailed(AuctionInfo auctionInfo, BidonError cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
    }

    @Override // org.bidon.sdk.ads.AdListener
    public void onAdLoaded(Ad ad2, AuctionInfo auctionInfo) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(auctionInfo, "auctionInfo");
    }

    @Override // org.bidon.sdk.ads.AdListener
    public void onAdShowFailed(final BidonError cause) {
        Intrinsics.checkNotNullParameter(cause, "cause");
        Activity activity = this.$activity;
        final BannerManager bannerManager = this.this$0;
        activity.runOnUiThread(new Runnable() { // from class: org.bidon.sdk.ads.banner.k
            @Override // java.lang.Runnable
            public final void run() {
                BannerManager$showAd$1$1.onAdShowFailed$lambda$4(bannerManager, cause);
            }
        });
    }

    @Override // org.bidon.sdk.ads.AdListener
    public void onAdShown(final Ad ad2) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Activity activity = this.$activity;
        final BannerManager bannerManager = this.this$0;
        activity.runOnUiThread(new Runnable() { // from class: org.bidon.sdk.ads.banner.m
            @Override // java.lang.Runnable
            public final void run() {
                BannerManager$showAd$1$1.onAdShown$lambda$0(bannerManager, ad2);
            }
        });
    }

    @Override // org.bidon.sdk.logs.analytic.AdRevenueListener
    public void onRevenuePaid(final Ad ad2, final AdValue adValue) {
        Intrinsics.checkNotNullParameter(ad2, "ad");
        Intrinsics.checkNotNullParameter(adValue, "adValue");
        Activity activity = this.$activity;
        final BannerManager bannerManager = this.this$0;
        activity.runOnUiThread(new Runnable() { // from class: org.bidon.sdk.ads.banner.l
            @Override // java.lang.Runnable
            public final void run() {
                BannerManager$showAd$1$1.onRevenuePaid$lambda$3(bannerManager, ad2, adValue);
            }
        });
    }
}
