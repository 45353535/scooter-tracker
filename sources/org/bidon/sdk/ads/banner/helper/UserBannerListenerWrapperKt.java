package org.bidon.sdk.ads.banner.helper;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.ads.Ad;
import org.bidon.sdk.ads.AuctionInfo;
import org.bidon.sdk.ads.banner.BannerListener;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.analytic.AdValue;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003H\u0000¨\u0006\u0004"}, d2 = {"wrapUserBannerListener", "Lorg/bidon/sdk/ads/banner/BannerListener;", "userListener", "Lkotlin/Function0;", "bidon_productionRelease"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UserBannerListenerWrapperKt {
    @NotNull
    public static final BannerListener wrapUserBannerListener(@NotNull final Function0<? extends BannerListener> userListener) {
        Intrinsics.checkNotNullParameter(userListener, "userListener");
        return new BannerListener() { // from class: org.bidon.sdk.ads.banner.helper.UserBannerListenerWrapperKt.wrapUserBannerListener.1
            @Override // org.bidon.sdk.ads.AdListener
            public void onAdClicked(Ad ad2) {
                Intrinsics.checkNotNullParameter(ad2, "ad");
                BannerListener bannerListenerInvoke = userListener.invoke();
                if (bannerListenerInvoke != null) {
                    bannerListenerInvoke.onAdClicked(ad2);
                }
            }

            @Override // org.bidon.sdk.ads.AdListener
            public void onAdExpired(Ad ad2) {
                Intrinsics.checkNotNullParameter(ad2, "ad");
                BannerListener bannerListenerInvoke = userListener.invoke();
                if (bannerListenerInvoke != null) {
                    bannerListenerInvoke.onAdExpired(ad2);
                }
            }

            @Override // org.bidon.sdk.ads.AdListener
            public void onAdLoadFailed(AuctionInfo auctionInfo, BidonError cause) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                BannerListener bannerListenerInvoke = userListener.invoke();
                if (bannerListenerInvoke != null) {
                    bannerListenerInvoke.onAdLoadFailed(auctionInfo, cause);
                }
            }

            @Override // org.bidon.sdk.ads.AdListener
            public void onAdLoaded(Ad ad2, AuctionInfo auctionInfo) {
                Intrinsics.checkNotNullParameter(ad2, "ad");
                Intrinsics.checkNotNullParameter(auctionInfo, "auctionInfo");
                BannerListener bannerListenerInvoke = userListener.invoke();
                if (bannerListenerInvoke != null) {
                    bannerListenerInvoke.onAdLoaded(ad2, auctionInfo);
                }
            }

            @Override // org.bidon.sdk.ads.AdListener
            public void onAdShowFailed(BidonError cause) {
                Intrinsics.checkNotNullParameter(cause, "cause");
                BannerListener bannerListenerInvoke = userListener.invoke();
                if (bannerListenerInvoke != null) {
                    bannerListenerInvoke.onAdShowFailed(cause);
                }
            }

            @Override // org.bidon.sdk.ads.AdListener
            public void onAdShown(Ad ad2) {
                Intrinsics.checkNotNullParameter(ad2, "ad");
                BannerListener bannerListenerInvoke = userListener.invoke();
                if (bannerListenerInvoke != null) {
                    bannerListenerInvoke.onAdShown(ad2);
                }
            }

            @Override // org.bidon.sdk.logs.analytic.AdRevenueListener
            public void onRevenuePaid(Ad ad2, AdValue adValue) {
                Intrinsics.checkNotNullParameter(ad2, "ad");
                Intrinsics.checkNotNullParameter(adValue, "adValue");
                BannerListener bannerListenerInvoke = userListener.invoke();
                if (bannerListenerInvoke != null) {
                    bannerListenerInvoke.onRevenuePaid(ad2, adValue);
                }
            }
        };
    }
}
