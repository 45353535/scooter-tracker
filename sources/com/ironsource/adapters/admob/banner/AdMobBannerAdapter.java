package com.ironsource.adapters.admob.banner;

import android.os.Bundle;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdLoader;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.VideoOptions;
import com.google.android.gms.ads.nativead.NativeAd;
import com.google.android.gms.ads.nativead.NativeAdOptions;
import com.ironsource.adapters.admob.AdMobAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.adapter.AbstractBannerAdapter;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.unity3d.mediation.LevelPlayAdSize;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class AdMobBannerAdapter extends AbstractBannerAdapter<AdMobAdapter> {
    private final String IS_NATIVE;
    private final ConcurrentHashMap<String, AdView> mAdUnitIdToBannerAd;
    private final ConcurrentHashMap<String, BannerSmashListener> mAdUnitIdToListener;
    public final ConcurrentHashMap<String, NativeAd> mAdUnitIdToNativeBannerAd;

    public AdMobBannerAdapter(AdMobAdapter adMobAdapter) {
        super(adMobAdapter);
        this.IS_NATIVE = "isNative";
        this.mAdUnitIdToListener = new ConcurrentHashMap<>();
        this.mAdUnitIdToBannerAd = new ConcurrentHashMap<>();
        this.mAdUnitIdToNativeBannerAd = new ConcurrentHashMap<>();
    }

    private NativeAdOptions createNativeAdOptions(NativeTemplateType nativeTemplateType) {
        NativeAdOptions.Builder builder = new NativeAdOptions.Builder();
        builder.setVideoOptions(new VideoOptions.Builder().setStartMuted(true).build());
        builder.setAdChoicesPlacement(nativeTemplateType.getAdChoicesPlacement());
        builder.setMediaAspectRatio(nativeTemplateType.getMediaAspectRatio());
        return builder.build();
    }

    @NotNull
    private static AdSize getAdaptiveBannerSize(int i10) {
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(ContextProvider.getInstance().getApplicationContext(), i10);
    }

    private void initBannersInternal(@NonNull JSONObject jSONObject, @NonNull BannerSmashListener bannerSmashListener) {
        String adUnitIdKey = getAdapter().getAdUnitIdKey();
        String configStringValueFromKey = getConfigStringValueFromKey(jSONObject, adUnitIdKey);
        if (TextUtils.isEmpty(configStringValueFromKey)) {
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(adUnitIdKey), "Banner"));
            return;
        }
        IronLog.ADAPTER_API.verbose("adUnitId = " + configStringValueFromKey);
        this.mAdUnitIdToListener.put(configStringValueFromKey, bannerSmashListener);
        if (getAdapter().getInitState() == AdMobAdapter.InitState.INIT_STATE_SUCCESS) {
            IronLog.INTERNAL.verbose("onBannerInitSuccess - adUnitId = " + configStringValueFromKey);
            bannerSmashListener.onBannerInitSuccess();
            return;
        }
        if (getAdapter().getInitState() != AdMobAdapter.InitState.INIT_STATE_FAILED) {
            getAdapter().initSDK(jSONObject);
            return;
        }
        IronLog.INTERNAL.verbose("onBannerInitFailed - adUnitId = " + configStringValueFromKey);
        bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("AdMob sdk init failed", "Banner"));
    }

    private boolean isNativeBannerSizeSupported(ISBannerSize iSBannerSize, boolean z10) {
        String description = iSBannerSize.getDescription();
        description.getClass();
        switch (description) {
            case "RECTANGLE":
            case "LARGE":
            case "BANNER":
                return true;
            case "SMART":
                return !z10;
            default:
                return false;
        }
    }

    private void loadBannerInternal(@NonNull final JSONObject jSONObject, final JSONObject jSONObject2, final String str, @NonNull final ISBannerSize iSBannerSize, @NonNull final BannerSmashListener bannerSmashListener) {
        final String configStringValueFromKey = getConfigStringValueFromKey(jSONObject, getAdapter().getAdUnitIdKey());
        IronLog.ADAPTER_API.verbose("adUnitId = " + configStringValueFromKey);
        if (iSBannerSize == null) {
            IronLog.INTERNAL.error("banner size is null");
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildNoConfigurationAvailableError("banner size is null"));
        } else {
            final boolean z10 = Boolean.parseBoolean(getConfigStringValueFromKey(jSONObject, "isNative"));
            postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.admob.banner.AdMobBannerAdapter.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        AdRequest adRequestCreateAdRequest = AdMobBannerAdapter.this.getAdapter().createAdRequest(jSONObject2, str);
                        if (z10) {
                            AdMobBannerAdapter.this.loadNativeBanner(iSBannerSize, bannerSmashListener, configStringValueFromKey, adRequestCreateAdRequest, jSONObject);
                            return;
                        }
                        ISBannerSize iSBannerSize2 = iSBannerSize;
                        if (iSBannerSize2 == null) {
                            IronLog.INTERNAL.verbose("banner size is null");
                            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(AdMobBannerAdapter.this.getAdapter().getProviderName()));
                            return;
                        }
                        AdSize adSize = AdMobBannerAdapter.this.getAdSize(iSBannerSize2, AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()));
                        if (adSize == null) {
                            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(AdMobBannerAdapter.this.getAdapter().getProviderName()));
                            return;
                        }
                        AdView adView = new AdView(ContextProvider.getInstance().getApplicationContext());
                        adView.setAdSize(adSize);
                        adView.setAdUnitId(configStringValueFromKey);
                        adView.setDescendantFocusability(393216);
                        adView.setAdListener(new AdMobBannerAdListener(bannerSmashListener, configStringValueFromKey, adView));
                        AdMobBannerAdapter.this.mAdUnitIdToBannerAd.put(configStringValueFromKey, adView);
                        IronLog.ADAPTER_API.verbose("loadAd");
                        adView.loadAd(adRequestCreateAdRequest);
                    } catch (Exception e10) {
                        bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("AdMobAdapter loadBanner exception " + e10.getMessage()));
                    }
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadNativeBanner(ISBannerSize iSBannerSize, BannerSmashListener bannerSmashListener, String str, AdRequest adRequest, JSONObject jSONObject) {
        if (!isNativeBannerSizeSupported(iSBannerSize, AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()))) {
            IronLog.INTERNAL.error("size not supported, size = " + iSBannerSize.getDescription());
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getAdapter().getProviderName()));
            return;
        }
        IronLog.ADAPTER_API.verbose("adUnitId = " + str);
        NativeTemplateType nativeTemplateTypeCreateTemplateType = NativeTemplateType.createTemplateType(jSONObject, iSBannerSize);
        AdMobNativeBannerAdListener adMobNativeBannerAdListener = new AdMobNativeBannerAdListener(this, bannerSmashListener, str, iSBannerSize, nativeTemplateTypeCreateTemplateType);
        new AdLoader.Builder(ContextProvider.getInstance().getApplicationContext(), str).forNativeAd(adMobNativeBannerAdListener).withNativeAdOptions(createNativeAdOptions(nativeTemplateTypeCreateTemplateType)).withAdListener(adMobNativeBannerAdListener).build().loadAd(adRequest);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void collectBannerBiddingData(@NonNull JSONObject jSONObject, JSONObject jSONObject2, @NotNull BiddingDataCallback biddingDataCallback) {
        ISBannerSize iSBannerSize;
        Bundle bundle = new Bundle();
        if (jSONObject2 != null && (iSBannerSize = (ISBannerSize) jSONObject2.opt("bannerSize")) != null && iSBannerSize.isAdaptive()) {
            AdSize adSize = getAdSize(iSBannerSize, AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()));
            bundle.putInt("adaptive_banner_w", adSize.getWidth());
            bundle.putInt("adaptive_banner_h", adSize.getHeight());
            IronLog.ADAPTER_API.verbose("adaptive banner width = " + adSize.getWidth() + ", height = " + adSize.getHeight());
        }
        getAdapter().collectBiddingData(biddingDataCallback, AdFormat.BANNER, bundle);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void destroyBanner(@NonNull final JSONObject jSONObject) {
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.admob.banner.AdMobBannerAdapter.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    AdMobBannerAdapter adMobBannerAdapter = AdMobBannerAdapter.this;
                    String configStringValueFromKey = adMobBannerAdapter.getConfigStringValueFromKey(jSONObject, adMobBannerAdapter.getAdapter().getAdUnitIdKey());
                    IronLog.ADAPTER_API.verbose("adUnitId = " + configStringValueFromKey);
                    if (AdMobBannerAdapter.this.mAdUnitIdToBannerAd.containsKey(configStringValueFromKey)) {
                        AdView adView = (AdView) AdMobBannerAdapter.this.mAdUnitIdToBannerAd.get(configStringValueFromKey);
                        if (adView != null) {
                            adView.destroy();
                        }
                        AdMobBannerAdapter.this.mAdUnitIdToBannerAd.remove(configStringValueFromKey);
                    }
                    if (AdMobBannerAdapter.this.mAdUnitIdToNativeBannerAd.containsKey(configStringValueFromKey)) {
                        NativeAd nativeAd = AdMobBannerAdapter.this.mAdUnitIdToNativeBannerAd.get(configStringValueFromKey);
                        if (nativeAd != null) {
                            nativeAd.destroy();
                        }
                        AdMobBannerAdapter.this.mAdUnitIdToNativeBannerAd.remove(configStringValueFromKey);
                    }
                } catch (Exception e10) {
                    IronLog.ADAPTER_API.error("e = " + e10);
                }
            }
        });
    }

    public AdSize getAdSize(ISBannerSize iSBannerSize, boolean z10) {
        AdSize adSize;
        String description = iSBannerSize.getDescription();
        description.getClass();
        switch (description) {
            case "RECTANGLE":
                adSize = AdSize.MEDIUM_RECTANGLE;
                break;
            case "LARGE":
                adSize = AdSize.LARGE_BANNER;
                break;
            case "SMART":
                if (!z10) {
                    adSize = AdSize.BANNER;
                    break;
                } else {
                    adSize = AdSize.LEADERBOARD;
                    break;
                }
                break;
            case "BANNER":
                adSize = AdSize.BANNER;
                break;
            case "CUSTOM":
                adSize = new AdSize(iSBannerSize.getWidth(), iSBannerSize.getHeight());
                break;
            default:
                adSize = null;
                break;
        }
        if (!iSBannerSize.isAdaptive() || adSize == null) {
            return adSize;
        }
        LevelPlayAdSize levelPlayAdSize = iSBannerSize.toLevelPlayAdSize(ContextProvider.getInstance().getApplicationContext());
        AdSize adaptiveBannerSize = getAdaptiveBannerSize(levelPlayAdSize.getWidth());
        IronLog.INTERNAL.verbose("default height - " + adSize.getHeight() + " adMobAdaptive height - " + adaptiveBannerSize.getHeight() + " levelPlayAdaptive height - " + levelPlayAdSize.getHeight() + " default width - " + adSize.getWidth() + " levelPlayAdaptive width - " + levelPlayAdSize.getWidth());
        return adaptiveBannerSize;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public int getAdaptiveHeight(int i10) {
        int height = getAdaptiveBannerSize(i10).getHeight();
        IronLog.ADAPTER_API.verbose("height - " + height + " for width - " + i10);
        return height;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBannerForBidding(String str, String str2, @NonNull JSONObject jSONObject, @NonNull BannerSmashListener bannerSmashListener) {
        initBannersInternal(jSONObject, bannerSmashListener);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBanners(String str, String str2, @NonNull JSONObject jSONObject, @NonNull BannerSmashListener bannerSmashListener) {
        initBannersInternal(jSONObject, bannerSmashListener);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBanner(@NonNull JSONObject jSONObject, JSONObject jSONObject2, @NonNull ISBannerSize iSBannerSize, @NonNull BannerSmashListener bannerSmashListener) {
        loadBannerInternal(jSONObject, jSONObject2, null, iSBannerSize, bannerSmashListener);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForBidding(@NonNull JSONObject jSONObject, JSONObject jSONObject2, String str, @NonNull ISBannerSize iSBannerSize, @NonNull BannerSmashListener bannerSmashListener) {
        loadBannerInternal(jSONObject, jSONObject2, str, iSBannerSize, bannerSmashListener);
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(String str) {
        Iterator<BannerSmashListener> it = this.mAdUnitIdToListener.values().iterator();
        while (it.hasNext()) {
            it.next().onBannerInitFailed(ErrorBuilder.buildInitFailedError(str, "Banner"));
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        Iterator<BannerSmashListener> it = this.mAdUnitIdToListener.values().iterator();
        while (it.hasNext()) {
            it.next().onBannerInitSuccess();
        }
    }
}
