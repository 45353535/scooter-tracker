package io.bidmachine.ads.networks.gam;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.ads.networks.gam.versions.VersionWrapper;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
class GAMNetwork {

    @NonNull
    private final GAMLoader gamLoader;

    @NonNull
    private final AtomicBoolean isInitialized = new AtomicBoolean(false);
    private final boolean overrideCallbacks;

    @NonNull
    private final ae.k tag;

    @NonNull
    private final VersionWrapper versionWrapper;

    GAMNetwork(@NonNull Context context, @NonNull VersionWrapper versionWrapper, @NonNull String str, @NonNull Map<AdsFormat, GAMTypeConfig> map, @Nullable String str2, long j10, boolean z10) {
        this.tag = new ae.k(str + "Network");
        this.versionWrapper = versionWrapper;
        this.gamLoader = new GAMLoader(context, versionWrapper, str, map, str2, j10);
        this.overrideCallbacks = z10;
    }

    private void onAdLoadFailed(@NonNull InternalGAMAdLoadListener<?> internalGAMAdLoadListener, @Nullable InternalGAMAd internalGAMAd, @Nullable ae.a aVar) {
        if (internalGAMAd != null) {
            try {
                internalGAMAd.destroy();
            } catch (Throwable unused) {
            }
        }
        if (aVar == null) {
            aVar = ae.a.f4247q;
        }
        internalGAMAdLoadListener.onAdLoadFailed(aVar);
    }

    void cache() {
        this.gamLoader.load();
    }

    @NonNull
    public GAMLoader getGAMLoader() {
        return this.gamLoader;
    }

    @Nullable
    public String getVersion() {
        try {
            ge.a version = this.versionWrapper.getVersion();
            if (version != null) {
                return version.toString();
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    @SuppressLint({"MissingPermission"})
    void init(@NonNull Context context) {
        if (this.isInitialized.getAndSet(true)) {
            return;
        }
        try {
            this.versionWrapper.initialize(context);
        } catch (Throwable unused) {
        }
    }

    boolean isInitialized() {
        return this.isInitialized.get();
    }

    public boolean isOverrideCallbacks() {
        return this.overrideCallbacks;
    }

    void loadBanner(@NonNull final NetworkAdUnit networkAdUnit, @NonNull InternalGAMBannerAdListener internalGAMBannerAdListener) {
        InternalGAMAd reservedGAMAd = this.gamLoader.getReservedGAMAd(networkAdUnit);
        if (reservedGAMAd == null) {
            io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam.i
                @Override // ce.b
                public final Object get() {
                    return String.format("Fail to load banner (Can't find reserved GAMAd by network ad unit id - %s)", networkAdUnit.getId());
                }
            });
            onAdLoadFailed(internalGAMBannerAdListener, null, ae.a.i("Can't find reserved GAMAd by NetworkAdUnit"));
        } else if (!(reservedGAMAd instanceof InternalGAMBannerAd)) {
            onAdLoadFailed(internalGAMBannerAdListener, reservedGAMAd, ae.a.i("InternalGAM object has an incompatible ad type"));
        } else {
            reservedGAMAd.setAdPresentListener(internalGAMBannerAdListener);
            internalGAMBannerAdListener.onAdLoaded((InternalGAMBannerAd) reservedGAMAd);
        }
    }

    void loadInterstitial(@NonNull final NetworkAdUnit networkAdUnit, @NonNull InternalGAMInterstitialAdListener internalGAMInterstitialAdListener) {
        InternalGAMAd reservedGAMAd = this.gamLoader.getReservedGAMAd(networkAdUnit);
        if (reservedGAMAd == null) {
            io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam.h
                @Override // ce.b
                public final Object get() {
                    return String.format("Fail to load interstitial (Can't find reserved GAMAd by network ad unit id - %s)", networkAdUnit.getId());
                }
            });
            onAdLoadFailed(internalGAMInterstitialAdListener, null, ae.a.i("Can't find reserved GAMAd by NetworkAdUnit"));
        } else if (!(reservedGAMAd instanceof InternalGAMInterstitialAd)) {
            onAdLoadFailed(internalGAMInterstitialAdListener, reservedGAMAd, ae.a.i("InternalGAM object has an incompatible ad type"));
        } else {
            reservedGAMAd.setAdPresentListener(internalGAMInterstitialAdListener);
            internalGAMInterstitialAdListener.onAdLoaded((InternalGAMInterstitialAd) reservedGAMAd);
        }
    }

    void loadRewarded(@NonNull final NetworkAdUnit networkAdUnit, @NonNull InternalGAMRewardedAdListener internalGAMRewardedAdListener) {
        InternalGAMAd reservedGAMAd = this.gamLoader.getReservedGAMAd(networkAdUnit);
        if (reservedGAMAd == null) {
            io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam.g
                @Override // ce.b
                public final Object get() {
                    return String.format("Fail to load rewarded (Can't find reserved GAMAd by network ad unit id - %s)", networkAdUnit.getId());
                }
            });
            onAdLoadFailed(internalGAMRewardedAdListener, null, ae.a.i("Can't find reserved GAMAd by NetworkAdUnit"));
        } else if (!(reservedGAMAd instanceof InternalGAMRewardedAd)) {
            onAdLoadFailed(internalGAMRewardedAdListener, reservedGAMAd, ae.a.i("InternalGAM object has an incompatible ad type"));
        } else {
            reservedGAMAd.setAdPresentListener(internalGAMRewardedAdListener);
            internalGAMRewardedAdListener.onAdLoaded((InternalGAMRewardedAd) reservedGAMAd);
        }
    }

    @Nullable
    GAMUnitData reserveMostExpensiveGAMAd(@NonNull NetworkAdUnit networkAdUnit, @NonNull String str) {
        return this.gamLoader.reserveMostExpensiveGAMAd(networkAdUnit, str);
    }

    void unReserveGAMAd(@NonNull NetworkAdUnit networkAdUnit) {
        this.gamLoader.unReserveGAMAd(networkAdUnit);
    }

    void cache(@NonNull AdsFormat adsFormat) {
        AdsFormat parent;
        if (this.gamLoader.load(adsFormat) || (parent = adsFormat.getParent()) == null) {
            return;
        }
        this.gamLoader.load(parent);
    }
}
