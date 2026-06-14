package com.ironsource.adapters.facebook.banner;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.facebook.ads.AdSize;
import com.facebook.ads.AdView;
import com.ironsource.adapters.facebook.FacebookAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.adapter.AbstractBannerAdapter;
import com.ironsource.mediationsdk.l;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class FacebookBannerAdapter extends AbstractBannerAdapter<FacebookAdapter> {
    protected ConcurrentHashMap<String, AdView> mPlacementIdToAd;
    private final ConcurrentHashMap<String, BannerSmashListener> mPlacementIdToSmashListener;

    public FacebookBannerAdapter(FacebookAdapter facebookAdapter) {
        super(facebookAdapter);
        this.mPlacementIdToSmashListener = new ConcurrentHashMap<>();
        this.mPlacementIdToAd = new ConcurrentHashMap<>();
    }

    private AdSize calculateBannerSize(ISBannerSize iSBannerSize, Context context) {
        String description = iSBannerSize.getDescription();
        description.getClass();
        switch (description) {
            case "RECTANGLE":
                return AdSize.RECTANGLE_HEIGHT_250;
            case "LARGE":
                return AdSize.BANNER_HEIGHT_90;
            case "SMART":
                return AdapterUtils.isLargeScreen(context) ? AdSize.BANNER_HEIGHT_90 : AdSize.BANNER_HEIGHT_50;
            case "BANNER":
                return AdSize.BANNER_HEIGHT_50;
            case "CUSTOM":
                if (iSBannerSize.getHeight() == 50) {
                    return AdSize.BANNER_HEIGHT_50;
                }
                if (iSBannerSize.getHeight() == 90) {
                    return AdSize.BANNER_HEIGHT_90;
                }
                if (iSBannerSize.getHeight() == 250) {
                    return AdSize.RECTANGLE_HEIGHT_250;
                }
                return null;
            default:
                return null;
        }
    }

    protected FrameLayout.LayoutParams calcLayoutParams(ISBannerSize iSBannerSize, Context context) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, iSBannerSize.getDescription().equals(l.f44063c) ? 300 : (iSBannerSize.getDescription().equals(l.f44065e) && AdapterUtils.isLargeScreen(context)) ? 728 : 320), -2);
        layoutParams.gravity = 17;
        return layoutParams;
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void destroyBanner(@NonNull JSONObject jSONObject) {
        final String configStringValueFromKey = getConfigStringValueFromKey(jSONObject, getAdapter().getPlacementIdKey());
        IronLog.ADAPTER_API.verbose("placementId = " + configStringValueFromKey);
        postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.facebook.banner.FacebookBannerAdapter.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    if (FacebookBannerAdapter.this.mPlacementIdToAd.containsKey(configStringValueFromKey)) {
                        FacebookBannerAdapter.this.mPlacementIdToAd.get(configStringValueFromKey).destroy();
                        FacebookBannerAdapter.this.mPlacementIdToAd.remove(configStringValueFromKey);
                    }
                } catch (Exception e10) {
                    IronLog.INTERNAL.error("destroyBanner failed for placementId - " + configStringValueFromKey + " with an exception = " + e10);
                }
            }
        });
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public Map<String, Object> getBannerBiddingData(@NonNull JSONObject jSONObject, JSONObject jSONObject2) {
        return getAdapter().getBiddingData();
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBannerForBidding(String str, String str2, @NonNull JSONObject jSONObject, @NonNull BannerSmashListener bannerSmashListener) {
        String placementIdKey = getAdapter().getPlacementIdKey();
        String allPlacementIdsKey = getAdapter().getAllPlacementIdsKey();
        String configStringValueFromKey = getConfigStringValueFromKey(jSONObject, placementIdKey);
        String configStringValueFromKey2 = getConfigStringValueFromKey(jSONObject, allPlacementIdsKey);
        if (TextUtils.isEmpty(configStringValueFromKey)) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(placementIdKey));
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(placementIdKey), "Banner"));
            return;
        }
        if (TextUtils.isEmpty(configStringValueFromKey2)) {
            IronLog.INTERNAL.error(getAdUnitIdMissingErrorString(allPlacementIdsKey));
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError(getAdUnitIdMissingErrorString(allPlacementIdsKey), "Banner"));
            return;
        }
        IronLog.ADAPTER_API.verbose("placementId = " + configStringValueFromKey);
        this.mPlacementIdToSmashListener.put(configStringValueFromKey, bannerSmashListener);
        if (getAdapter().getInitState() == FacebookAdapter.InitState.INIT_STATE_SUCCESS) {
            IronLog.INTERNAL.verbose("onBannerInitSuccess - placementId = " + configStringValueFromKey);
            bannerSmashListener.onBannerInitSuccess();
            return;
        }
        if (getAdapter().getInitState() != FacebookAdapter.InitState.INIT_STATE_FAILED) {
            getAdapter().initSDK(configStringValueFromKey2);
            return;
        }
        IronLog.INTERNAL.verbose("onBannerInitFailed - placementId = " + configStringValueFromKey);
        bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Meta SDK init failed", "Banner"));
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractBannerAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForBidding(@NonNull JSONObject jSONObject, JSONObject jSONObject2, final String str, @NonNull final ISBannerSize iSBannerSize, @NonNull final BannerSmashListener bannerSmashListener) {
        final String configStringValueFromKey = getConfigStringValueFromKey(jSONObject, getAdapter().getPlacementIdKey());
        IronLog.ADAPTER_API.verbose("placementId = " + configStringValueFromKey);
        if (iSBannerSize == null) {
            IronLog.INTERNAL.error("banner size is null");
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildNoConfigurationAvailableError("banner size is null"));
            return;
        }
        final Context applicationContext = ContextProvider.getInstance().getApplicationContext();
        final AdSize adSizeCalculateBannerSize = calculateBannerSize(iSBannerSize, applicationContext);
        if (adSizeCalculateBannerSize != null) {
            postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.facebook.banner.FacebookBannerAdapter.1
                @Override // java.lang.Runnable
                public void run() {
                    if (adSizeCalculateBannerSize == null) {
                        IronLog.INTERNAL.error("size not supported, size = " + iSBannerSize.getDescription());
                        bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(FacebookBannerAdapter.this.getAdapter().getProviderName()));
                        return;
                    }
                    try {
                        AdView adView = new AdView(applicationContext, configStringValueFromKey, adSizeCalculateBannerSize);
                        FacebookBannerAdListener facebookBannerAdListener = new FacebookBannerAdListener(FacebookBannerAdapter.this, FacebookBannerAdapter.this.calcLayoutParams(iSBannerSize, applicationContext), configStringValueFromKey, bannerSmashListener);
                        AdView.AdViewLoadConfigBuilder adViewLoadConfigBuilderBuildLoadAdConfig = adView.buildLoadAdConfig();
                        adViewLoadConfigBuilderBuildLoadAdConfig.withAdListener(facebookBannerAdListener);
                        String str2 = str;
                        if (str2 != null) {
                            adViewLoadConfigBuilderBuildLoadAdConfig.withBid(str2);
                        }
                        FacebookBannerAdapter.this.mPlacementIdToAd.put(configStringValueFromKey, adView);
                        adView.loadAd(adViewLoadConfigBuilderBuildLoadAdConfig.build());
                    } catch (Exception e10) {
                        bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Meta loadBanner exception " + e10.getMessage()));
                    }
                }
            });
            return;
        }
        IronLog.INTERNAL.error("size not supported, size = " + iSBannerSize.getDescription());
        bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getAdapter().getProviderName()));
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(String str) {
        Iterator<BannerSmashListener> it = this.mPlacementIdToSmashListener.values().iterator();
        while (it.hasNext()) {
            it.next().onBannerInitFailed(ErrorBuilder.buildInitFailedError(str, "Banner"));
        }
    }

    @Override // com.ironsource.mediationsdk.adapter.AbstractAdUnitAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        Iterator<BannerSmashListener> it = this.mPlacementIdToSmashListener.values().iterator();
        while (it.hasNext()) {
            it.next().onBannerInitSuccess();
        }
    }
}
