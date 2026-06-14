package io.bidmachine.ads.networks.gam_dynamic;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdUnit;

/* JADX INFO: loaded from: classes12.dex */
interface GAMNetwork {
    void cache();

    void cache(@NonNull AdsFormat adsFormat);

    boolean cacheWaterfall(@NonNull AdsFormat adsFormat, boolean z10);

    @Nullable
    String getVersion();

    void init(@NonNull Context context);

    boolean isInitialized();

    void loadBanner(@NonNull NetworkAdUnit networkAdUnit, @NonNull InternalBannerAdListener internalBannerAdListener);

    void loadInterstitial(@NonNull NetworkAdUnit networkAdUnit, @NonNull InternalInterstitialAdListener internalInterstitialAdListener);

    void loadRewarded(@NonNull NetworkAdUnit networkAdUnit, @NonNull InternalRewardedAdListener internalRewardedAdListener);

    @Nullable
    InternalAdData reserveMostExpensiveAd(@NonNull NetworkAdUnit networkAdUnit, @NonNull AdsFormat adsFormat);

    void unReserveAd(@NonNull NetworkAdUnit networkAdUnit);
}
