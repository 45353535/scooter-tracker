package org.bidon.sdk.ads.rewarded;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.bidon.sdk.ads.Ad;
import org.bidon.sdk.ads.AdListener;
import org.bidon.sdk.ads.FullscreenAdListener;
import org.bidon.sdk.ads.rewarded.RewardedAdListener;
import org.bidon.sdk.config.BidonError;
import org.bidon.sdk.logs.analytic.AdRevenueListener;
import org.bidon.sdk.logs.analytic.AdValue;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lorg/bidon/sdk/ads/rewarded/RewardedListener;", "Lorg/bidon/sdk/ads/AdListener;", "Lorg/bidon/sdk/logs/analytic/AdRevenueListener;", "Lorg/bidon/sdk/ads/FullscreenAdListener;", "Lorg/bidon/sdk/ads/rewarded/RewardedAdListener;", "bidon_productionRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface RewardedListener extends AdListener, AdRevenueListener, FullscreenAdListener, RewardedAdListener {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final class DefaultImpls {
        public static void onAdClicked(@NotNull RewardedListener rewardedListener, @NotNull Ad ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            AdListener.DefaultImpls.onAdClicked(rewardedListener, ad2);
        }

        public static void onAdClosed(@NotNull RewardedListener rewardedListener, @NotNull Ad ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            FullscreenAdListener.DefaultImpls.onAdClosed(rewardedListener, ad2);
        }

        public static void onAdExpired(@NotNull RewardedListener rewardedListener, @NotNull Ad ad2) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            AdListener.DefaultImpls.onAdExpired(rewardedListener, ad2);
        }

        public static void onAdShowFailed(@NotNull RewardedListener rewardedListener, @NotNull BidonError cause) {
            Intrinsics.checkNotNullParameter(cause, "cause");
            AdListener.DefaultImpls.onAdShowFailed(rewardedListener, cause);
        }

        public static void onRevenuePaid(@NotNull RewardedListener rewardedListener, @NotNull Ad ad2, @NotNull AdValue adValue) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            Intrinsics.checkNotNullParameter(adValue, "adValue");
            AdRevenueListener.DefaultImpls.onRevenuePaid(rewardedListener, ad2, adValue);
        }

        public static void onUserRewarded(@NotNull RewardedListener rewardedListener, @NotNull Ad ad2, @Nullable Reward reward) {
            Intrinsics.checkNotNullParameter(ad2, "ad");
            RewardedAdListener.DefaultImpls.onUserRewarded(rewardedListener, ad2, reward);
        }
    }
}
