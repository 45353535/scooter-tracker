package org.bidon.sdk.ads.banner;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.ads.Ad;
import org.bidon.sdk.ads.AdListener;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.analytic.AdRevenueListener;
import org.bidon.sdk.logs.analytic.AdValue;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lorg/bidon/sdk/ads/banner/BannerListener;", "Lorg/bidon/sdk/ads/AdListener;", "Lorg/bidon/sdk/logs/analytic/AdRevenueListener;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface BannerListener extends AdListener, AdRevenueListener {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onAdClicked(@NotNull BannerListener bannerListener, @NotNull Ad ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            AdListener.DefaultImpls.onAdClicked(bannerListener, ad2);
        }

        public static void onAdExpired(@NotNull BannerListener bannerListener, @NotNull Ad ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            AdListener.DefaultImpls.onAdExpired(bannerListener, ad2);
        }

        public static void onAdShowFailed(@NotNull BannerListener bannerListener, @NotNull BidonError cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            AdListener.DefaultImpls.onAdShowFailed(bannerListener, cause);
        }

        public static void onRevenuePaid(@NotNull BannerListener bannerListener, @NotNull Ad ad2, @NotNull AdValue adValue) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            Intrinsics.checkNotNullParameter(adValue, "adValue");
            AdRevenueListener.DefaultImpls.onRevenuePaid(bannerListener, ad2, adValue);
        }
    }
}
