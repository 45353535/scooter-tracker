package io.bidmachine.ads.networks.gam_dynamic;

import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper;
import io.bidmachine.protobuf.Waterfall;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes12.dex */
class GAMNetworkImpl implements GAMNetwork {

    @NonNull
    private static final Map<String, GAMAdManager> GAM_AD_MANAGER_MAP = new HashMap();

    @NonNull
    private static final Object GAM_AD_MANAGER_MAP_LOCK = new Object();

    @NonNull
    @VisibleForTesting
    final GAMAdManager gamAdManager;

    @NonNull
    private final AtomicBoolean isInitialized;

    @NonNull
    private final ae.k tag;

    @NonNull
    private final VersionWrapper versionWrapper;

    @NonNull
    @VisibleForTesting
    final Map<AdsFormat, WaterfallController> waterfallControllerMap;

    GAMNetworkImpl(@NonNull Context context, @NonNull NetworkParams networkParams, @NonNull Waterfall.Context context2, @NonNull VersionWrapper versionWrapper) {
        this(context, networkParams, context2, versionWrapper, obtainGamAdManager(networkParams.getNetworkKey()));
    }

    @VisibleForTesting
    static void clear() {
        GAM_AD_MANAGER_MAP.clear();
    }

    @NonNull
    private static GAMAdManager obtainGamAdManager(@NonNull String str) {
        Map<String, GAMAdManager> map = GAM_AD_MANAGER_MAP;
        GAMAdManager gAMAdManager = map.get(str);
        if (gAMAdManager != null) {
            return gAMAdManager;
        }
        synchronized (GAM_AD_MANAGER_MAP_LOCK) {
            try {
                GAMAdManager gAMAdManager2 = map.get(str);
                if (gAMAdManager2 != null) {
                    return gAMAdManager2;
                }
                GAMAdManager gAMAdManager3 = new GAMAdManager(str);
                map.put(str, gAMAdManager3);
                return gAMAdManager3;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMNetwork
    public void cache() {
        for (AdsFormat adsFormat : AdsFormat.values()) {
            cacheWaterfall(adsFormat, false);
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMNetwork
    public boolean cacheWaterfall(@NonNull AdsFormat adsFormat, boolean z10) {
        WaterfallController waterfallController = this.waterfallControllerMap.get(adsFormat);
        if (waterfallController == null) {
            return false;
        }
        waterfallController.load(z10);
        return true;
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMNetwork
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

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMNetwork
    @SuppressLint({"MissingPermission"})
    public void init(@NonNull Context context) {
        if (this.isInitialized.getAndSet(true)) {
            return;
        }
        try {
            this.versionWrapper.initialize(context);
        } catch (Throwable unused) {
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMNetwork
    public boolean isInitialized() {
        return this.isInitialized.get();
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMNetwork
    public void loadBanner(@NonNull final NetworkAdUnit networkAdUnit, @NonNull InternalBannerAdListener internalBannerAdListener) {
        InternalAd reservedAd = this.gamAdManager.getReservedAd(networkAdUnit);
        if (reservedAd == null) {
            io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.h
                @Override // ce.b
                public final Object get() {
                    return String.format("Fail to load banner (Can't find reserved ad by network ad unit id - %s)", networkAdUnit.getId());
                }
            });
            onAdLoadFailed(internalBannerAdListener, null, ae.a.i("Can't find reserved InternalAd by NetworkAdUnit"));
        } else if (!(reservedAd instanceof InternalBannerAd)) {
            onAdLoadFailed(internalBannerAdListener, reservedAd, ae.a.i("InternalAd object has an incompatible ad type"));
        } else {
            reservedAd.setAdPresentListener(internalBannerAdListener);
            internalBannerAdListener.onAdLoaded((InternalBannerAd) reservedAd);
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMNetwork
    public void loadInterstitial(@NonNull final NetworkAdUnit networkAdUnit, @NonNull InternalInterstitialAdListener internalInterstitialAdListener) {
        InternalAd reservedAd = this.gamAdManager.getReservedAd(networkAdUnit);
        if (reservedAd == null) {
            io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.g
                @Override // ce.b
                public final Object get() {
                    return String.format("Fail to load interstitial (Can't find reserved ad by network ad unit id - %s)", networkAdUnit.getId());
                }
            });
            onAdLoadFailed(internalInterstitialAdListener, null, ae.a.i("Can't find reserved InternalAd by NetworkAdUnit"));
        } else if (!(reservedAd instanceof InternalInterstitialAd)) {
            onAdLoadFailed(internalInterstitialAdListener, reservedAd, ae.a.i("InternalAd object has an incompatible ad type"));
        } else {
            reservedAd.setAdPresentListener(internalInterstitialAdListener);
            internalInterstitialAdListener.onAdLoaded((InternalInterstitialAd) reservedAd);
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMNetwork
    public void loadRewarded(@NonNull final NetworkAdUnit networkAdUnit, @NonNull InternalRewardedAdListener internalRewardedAdListener) {
        InternalAd reservedAd = this.gamAdManager.getReservedAd(networkAdUnit);
        if (reservedAd == null) {
            io.bidmachine.core.a.b(this.tag, new ce.b() { // from class: io.bidmachine.ads.networks.gam_dynamic.i
                @Override // ce.b
                public final Object get() {
                    return String.format("Fail to load rewarded (Can't find reserved ad by network ad unit id - %s)", networkAdUnit.getId());
                }
            });
            onAdLoadFailed(internalRewardedAdListener, null, ae.a.i("Can't find reserved InternalAd by NetworkAdUnit"));
        } else if (!(reservedAd instanceof InternalRewardedAd)) {
            onAdLoadFailed(internalRewardedAdListener, reservedAd, ae.a.i("InternalAd object has an incompatible ad type"));
        } else {
            reservedAd.setAdPresentListener(internalRewardedAdListener);
            internalRewardedAdListener.onAdLoaded((InternalRewardedAd) reservedAd);
        }
    }

    @VisibleForTesting
    void onAdLoadFailed(@NonNull InternalAdLoadListener<?> internalAdLoadListener, @Nullable InternalAd internalAd, @Nullable ae.a aVar) {
        if (internalAd != null) {
            internalAd.destroy();
        }
        if (aVar == null) {
            aVar = ae.a.f4247q;
        }
        internalAdLoadListener.onAdLoadFailed(aVar);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMNetwork
    @Nullable
    public InternalAdData reserveMostExpensiveAd(@NonNull NetworkAdUnit networkAdUnit, @NonNull AdsFormat adsFormat) {
        AdsFormat parent;
        InternalAdData internalAdDataReserveMostExpensiveAd = this.gamAdManager.reserveMostExpensiveAd(networkAdUnit, adsFormat);
        return (internalAdDataReserveMostExpensiveAd != null || (parent = adsFormat.getParent()) == null) ? internalAdDataReserveMostExpensiveAd : this.gamAdManager.reserveMostExpensiveAd(networkAdUnit, parent);
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMNetwork
    public void unReserveAd(@NonNull NetworkAdUnit networkAdUnit) {
        this.gamAdManager.unReserveAd(networkAdUnit);
    }

    GAMNetworkImpl(@NonNull Context context, @NonNull NetworkParams networkParams, @NonNull Waterfall.Context context2, @NonNull VersionWrapper versionWrapper, @NonNull GAMAdManager gAMAdManager) {
        this.tag = new ae.k(networkParams.getNetworkName() + "Network");
        this.isInitialized = new AtomicBoolean(false);
        VersionWrapper versionWrapper2 = versionWrapper;
        this.versionWrapper = versionWrapper2;
        GAMAdManager gAMAdManager2 = gAMAdManager;
        this.gamAdManager = gAMAdManager2;
        this.waterfallControllerMap = new EnumMap(AdsFormat.class);
        GAMEventTrackerImpl gAMEventTrackerImpl = new GAMEventTrackerImpl(context2.getEventConfig());
        TaskExecutorImpl taskExecutorImpl = new TaskExecutorImpl();
        for (Waterfall.Configuration configuration : context2.getConfigurationsList()) {
            AdsFormat adsFormatByRemoteName = AdsFormat.byRemoteName(configuration.getFormat());
            if (adsFormatByRemoteName != null) {
                this.waterfallControllerMap.put(adsFormatByRemoteName, new WaterfallController(context, networkParams, adsFormatByRemoteName, configuration, versionWrapper2, this, gAMAdManager2, gAMEventTrackerImpl, taskExecutorImpl));
                versionWrapper2 = versionWrapper;
                gAMAdManager2 = gAMAdManager;
            }
        }
    }

    @Override // io.bidmachine.ads.networks.gam_dynamic.GAMNetwork
    public void cache(@NonNull AdsFormat adsFormat) {
        AdsFormat parent;
        if (cacheWaterfall(adsFormat, false) || (parent = adsFormat.getParent()) == null) {
            return;
        }
        cacheWaterfall(parent, false);
    }
}
