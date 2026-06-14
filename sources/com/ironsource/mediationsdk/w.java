package com.ironsource.mediationsdk;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import com.ironsource.C4365ia;
import com.ironsource.InterfaceC4630y3;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.ads.nativead.AdapterNativeAdData;
import com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener;
import com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface;
import com.ironsource.mediationsdk.adunit.adapter.internal.nativead.AdapterNativeAdViewBinder;
import com.ironsource.mediationsdk.adunit.adapter.listener.NetworkInitializationListener;
import com.ironsource.mediationsdk.adunit.adapter.utility.AdData;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.config.ConfigFile;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerAdapterInterface;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.unity3d.mediation.LevelPlay;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class w implements AdapterAPSDataInterface, AdapterBaseInterface, AdapterConsentInterface, AdapterDebugInterface, AdapterMetaDataInterface, AdapterSettingsInterface, BannerSmashListener, InterfaceC4630y3, InterstitialSmashListener, NativeAdSmashListener, RewardedVideoSmashListener, AdapterNetworkDataInterface {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final AbstractAdapter f44338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private WeakReference<NetworkInitializationListener> f44339b;

    public w(AbstractAdapter abstractAdapter) {
        this.f44338a = abstractAdapter;
    }

    void a() {
        String pluginType = ConfigFile.getConfigFile().getPluginType();
        if (TextUtils.isEmpty(pluginType)) {
            return;
        }
        this.f44338a.setPluginData(pluginType);
    }

    @Override // com.ironsource.InterfaceC4630y3
    public void collectBiddingData(AdData adData, @NotNull Context context, @NotNull BiddingDataCallback biddingDataCallback) {
        JSONObject jSONObjectA = C4365ia.a(adData.getConfiguration());
        JSONObject jSONObjectA2 = C4365ia.a(adData.getAdUnitData());
        IronSource.a aVar = (IronSource.a) adData.getAdUnitData().get("adUnit");
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            this.f44338a.collectRewardedVideoBiddingData(jSONObjectA, jSONObjectA2, biddingDataCallback);
            return;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            this.f44338a.collectInterstitialBiddingData(jSONObjectA, jSONObjectA2, biddingDataCallback);
            return;
        }
        if (aVar == IronSource.a.BANNER) {
            this.f44338a.collectBannerBiddingData(jSONObjectA, jSONObjectA2, biddingDataCallback);
            return;
        }
        if (aVar == IronSource.a.NATIVE_AD) {
            this.f44338a.collectNativeAdBiddingData(jSONObjectA, jSONObjectA2, biddingDataCallback);
            return;
        }
        IronLog.INTERNAL.error("ad unit not supported - " + aVar);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    @NotNull
    public String getAdapterVersion() {
        return this.f44338a.getVersion();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    @Nullable
    public String getNetworkSDKVersion() {
        return this.f44338a.getCoreSDKVersion();
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterBaseInterface
    public void init(@NotNull AdData adData, @NotNull Context context, @Nullable NetworkInitializationListener networkInitializationListener) {
        this.f44339b = new WeakReference<>(networkInitializationListener);
        String str = (String) adData.getAdUnitData().get("userId");
        IronSource.a aVar = (IronSource.a) adData.getAdUnitData().get("adUnit");
        a();
        JSONObject jSONObjectA = C4365ia.a(adData.getConfiguration());
        if (aVar == IronSource.a.REWARDED_VIDEO) {
            this.f44338a.initRewardedVideoWithCallback("", str, jSONObjectA, this);
            return;
        }
        if (aVar == IronSource.a.INTERSTITIAL) {
            Integer num = adData.getInt("instanceType");
            if (num == null || num.intValue() != 1) {
                this.f44338a.initInterstitialForBidding("", str, jSONObjectA, this);
                return;
            } else {
                this.f44338a.initInterstitial("", str, jSONObjectA, this);
                return;
            }
        }
        if (aVar == IronSource.a.BANNER) {
            Integer num2 = adData.getInt("instanceType");
            if (num2 == null || num2.intValue() != 1) {
                this.f44338a.initBannerForBidding("", str, jSONObjectA, this);
                return;
            } else {
                this.f44338a.initBanners("", str, jSONObjectA, this);
                return;
            }
        }
        if (aVar != IronSource.a.NATIVE_AD) {
            IronLog.INTERNAL.error("ad unit not supported - " + aVar);
            return;
        }
        Integer num3 = adData.getInt("instanceType");
        if (num3 == null || num3.intValue() != 1) {
            this.f44338a.initNativeAdForBidding("", str, jSONObjectA, this);
        } else {
            this.f44338a.initNativeAds("", str, jSONObjectA, this);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterSettingsInterface
    public boolean isUsingActivityBeforeImpression(@NotNull LevelPlay.AdFormat adFormat) {
        return this.f44338a.isUsingActivityBeforeImpression(adFormat);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdClicked() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLeftApplication() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoadFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams) {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenDismissed() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdScreenPresented() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerAdShown() {
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerInitFailed(IronSourceError ironSourceError, Map map) {
        r4.a.h(this, ironSourceError, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerInitSuccess(Map map) {
        r4.a.i(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClicked() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdClosed() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdLoadFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdOpened() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdReady() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdShowSucceeded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialAdVisible() {
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialInitFailed(IronSourceError ironSourceError, Map map) {
        r4.b.i(this, ironSourceError, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialInitSuccess(Map map) {
        r4.b.j(this, map);
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdClicked() {
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdInitFailed(@Nullable IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.f44339b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.f44339b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdLoadFailed(@Nullable IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdLoaded(@Nullable AdapterNativeAdData adapterNativeAdData, @Nullable AdapterNativeAdViewBinder adapterNativeAdViewBinder) {
    }

    @Override // com.ironsource.mediationsdk.ads.nativead.interfaces.NativeAdSmashListener
    public void onNativeAdShown() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClicked() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdClosed() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdEnded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdOpened() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdRewarded() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdShowFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdStarted() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAdVisible() {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoAvailabilityChanged(boolean z10) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoInitFailed(IronSourceError ironSourceError, Map map) {
        r4.c.j(this, ironSourceError, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoInitSuccess(Map map) {
        r4.c.k(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadFailed(IronSourceError ironSourceError) {
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoLoadSuccess() {
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterAPSDataInterface
    public void setAPSData(LevelPlay.AdFormat adFormat, JSONObject jSONObject) {
        BannerAdapterInterface bannerAdapterInterface = this.f44338a;
        if (bannerAdapterInterface instanceof SetAPSInterface) {
            ((SetAPSInterface) bannerAdapterInterface).setAPSData(adFormat, jSONObject);
        }
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.AdapterDebugInterface
    public void setAdapterDebug(boolean z10) {
        this.f44338a.setAdapterDebug(Boolean.valueOf(z10));
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterConsentInterface
    public void setConsent(boolean z10) {
        this.f44338a.setConsent(z10);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterMetaDataInterface
    public void setMetaData(String str, List<String> list) {
        this.f44338a.setMetaData(str, list);
    }

    @Override // com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface
    public void setNetworkData(@NotNull AdapterNetworkData adapterNetworkData) {
        this.f44338a.setNetworkData(adapterNetworkData);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdClicked(Map map) {
        r4.a.a(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdLeftApplication(Map map) {
        r4.a.b(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdLoadFailed(IronSourceError ironSourceError, Map map) {
        r4.a.c(this, ironSourceError, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdLoaded(View view, FrameLayout.LayoutParams layoutParams, Map map) {
        r4.a.d(this, view, layoutParams, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdScreenDismissed(Map map) {
        r4.a.e(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdScreenPresented(Map map) {
        r4.a.f(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public /* synthetic */ void onBannerAdShown(Map map) {
        r4.a.g(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.f44339b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.BannerSmashListener
    public void onBannerInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.f44339b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdClicked(Map map) {
        r4.b.a(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdClosed(Map map) {
        r4.b.b(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdLoadFailed(IronSourceError ironSourceError, Map map) {
        r4.b.c(this, ironSourceError, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdOpened(Map map) {
        r4.b.d(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdReady(Map map) {
        r4.b.e(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdShowFailed(IronSourceError ironSourceError, Map map) {
        r4.b.f(this, ironSourceError, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdShowSucceeded(Map map) {
        r4.b.g(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public /* synthetic */ void onInterstitialAdVisible(Map map) {
        r4.b.h(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.f44339b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.InterstitialSmashListener
    public void onInterstitialInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.f44339b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdClicked(Map map) {
        r4.c.a(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdClosed(Map map) {
        r4.c.b(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdEnded(Map map) {
        r4.c.c(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdOpened(Map map) {
        r4.c.d(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdRewarded(Map map) {
        r4.c.e(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdShowFailed(IronSourceError ironSourceError, Map map) {
        r4.c.f(this, ironSourceError, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdStarted(Map map) {
        r4.c.g(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAdVisible(Map map) {
        r4.c.h(this, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoAvailabilityChanged(boolean z10, Map map) {
        r4.c.i(this, z10, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitFailed(IronSourceError ironSourceError) {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.f44339b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitFailed(ironSourceError.getErrorCode(), ironSourceError.getErrorMessage());
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public void onRewardedVideoInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        NetworkInitializationListener networkInitializationListener = this.f44339b.get();
        if (networkInitializationListener != null) {
            networkInitializationListener.onInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoLoadFailed(IronSourceError ironSourceError, Map map) {
        r4.c.l(this, ironSourceError, map);
    }

    @Override // com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener
    public /* synthetic */ void onRewardedVideoLoadSuccess(Map map) {
        r4.c.m(this, map);
    }
}
