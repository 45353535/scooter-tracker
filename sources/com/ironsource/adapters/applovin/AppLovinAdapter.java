package com.ironsource.adapters.applovin;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlay;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
public class AppLovinAdapter extends AbstractAdapter implements INetworkInitCallbackListener {
    private static final String GitHash = "9281ef5";
    private static final String SDK_KEY = "sdkKey";
    private static final String VERSION = "5.2.0";
    private static final String ZONE_ID = "zoneId";
    private static AppLovinSdk mAppLovinSdk;
    private static AppLovinSdkSettings mAppLovinSettings;
    private AppLovinRewardedVideoListener mAppLovinRewardedVideoListener;
    private String mInterstitialZoneId;
    private AppLovinAd mRewardedAppLovinAd;
    private AppLovinIncentivizedInterstitial mRewardedVideoAd;
    private RewardedVideoSmashListener mRewardedVideoSmashListener;
    private String mRewardedVideoZoneId;
    private boolean mShouldNotifyOnRewardedVideoInitCallback;
    protected final ConcurrentHashMap<String, AppLovinBannerListener> mZoneIdToAppLovinBannerListener;
    protected final ConcurrentHashMap<String, AppLovinInterstitialListener> mZoneIdToAppLovinInterstitialListener;
    protected final ConcurrentHashMap<String, AppLovinAdView> mZoneIdToBannerAd;
    protected final ConcurrentHashMap<String, FrameLayout.LayoutParams> mZoneIdToBannerLayout;
    protected final ConcurrentHashMap<String, AppLovinAdSize> mZoneIdToBannerSize;
    protected final ConcurrentHashMap<String, BannerSmashListener> mZoneIdToBannerSmashListener;
    private final ConcurrentHashMap<String, Boolean> mZoneIdToInterstitialAdReadyStatus;
    protected final ConcurrentHashMap<String, InterstitialSmashListener> mZoneIdToInterstitialSmashListener;
    private static final AppLovinAdHolder<AppLovinAd> mInterstitialAds = new AppLovinAdHolder<>();
    private static final AtomicBoolean mWasInitCalled = new AtomicBoolean(false);
    private static InitState mInitState = InitState.INIT_STATE_NONE;
    private static final HashSet<INetworkInitCallbackListener> initCallbackListeners = new HashSet<>();

    /* JADX INFO: renamed from: com.ironsource.adapters.applovin.AppLovinAdapter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$ironsource$adapters$applovin$AppLovinAdapter$InitState;

        static {
            int[] iArr = new int[InitState.values().length];
            $SwitchMap$com$ironsource$adapters$applovin$AppLovinAdapter$InitState = iArr;
            try {
                iArr[InitState.INIT_STATE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ironsource$adapters$applovin$AppLovinAdapter$InitState[InitState.INIT_STATE_IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ironsource$adapters$applovin$AppLovinAdapter$InitState[InitState.INIT_STATE_SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ironsource$adapters$applovin$AppLovinAdapter$InitState[InitState.INIT_STATE_FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private enum InitState {
        INIT_STATE_NONE,
        INIT_STATE_IN_PROGRESS,
        INIT_STATE_SUCCESS,
        INIT_STATE_FAILED
    }

    private AppLovinAdapter(String str) {
        super(str);
        this.mShouldNotifyOnRewardedVideoInitCallback = false;
        IronLog.INTERNAL.verbose();
        this.mZoneIdToAppLovinInterstitialListener = new ConcurrentHashMap<>();
        this.mZoneIdToInterstitialSmashListener = new ConcurrentHashMap<>();
        this.mZoneIdToInterstitialAdReadyStatus = new ConcurrentHashMap<>();
        this.mZoneIdToAppLovinBannerListener = new ConcurrentHashMap<>();
        this.mZoneIdToBannerSmashListener = new ConcurrentHashMap<>();
        this.mZoneIdToBannerLayout = new ConcurrentHashMap<>();
        this.mZoneIdToBannerAd = new ConcurrentHashMap<>();
        this.mZoneIdToBannerSize = new ConcurrentHashMap<>();
        this.mLWSSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    private AppLovinAdSize calculateBannerSize(ISBannerSize iSBannerSize, boolean z10) {
        if (iSBannerSize == null) {
            IronLog.ADAPTER_API.error(getProviderName() + " calculateLayoutParams - bannerSize is null");
            return null;
        }
        String description = iSBannerSize.getDescription();
        description.getClass();
        switch (description) {
            case "RECTANGLE":
                return AppLovinAdSize.MREC;
            case "LARGE":
            case "BANNER":
                return AppLovinAdSize.BANNER;
            case "SMART":
                return z10 ? AppLovinAdSize.LEADER : AppLovinAdSize.BANNER;
            case "CUSTOM":
                if (iSBannerSize.getHeight() >= 40 && iSBannerSize.getHeight() <= 60) {
                    return AppLovinAdSize.BANNER;
                }
            default:
                return null;
        }
    }

    public static String getAdapterSDKVersion() {
        return AppLovinSdk.VERSION;
    }

    private FrameLayout.LayoutParams getBannerLayoutParams(ISBannerSize iSBannerSize) {
        FrameLayout.LayoutParams layoutParams;
        Context applicationContext;
        layoutParams = new FrameLayout.LayoutParams(0, 0);
        applicationContext = ContextProvider.getInstance().getApplicationContext();
        String description = iSBannerSize.getDescription();
        description.getClass();
        switch (description) {
            case "RECTANGLE":
                layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(applicationContext, 300), AdapterUtils.dpToPixels(applicationContext, 250));
                break;
            case "LARGE":
            case "BANNER":
                layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(applicationContext, 320), AdapterUtils.dpToPixels(applicationContext, 50));
                break;
            case "SMART":
                if (!AdapterUtils.isLargeScreen(applicationContext)) {
                    layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(applicationContext, 320), AdapterUtils.dpToPixels(applicationContext, 50));
                    break;
                } else {
                    layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(applicationContext, 728), AdapterUtils.dpToPixels(applicationContext, 90));
                    break;
                }
                break;
            case "CUSTOM":
                if (iSBannerSize.getHeight() >= 40 && iSBannerSize.getHeight() <= 60) {
                    layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(applicationContext, 320), AdapterUtils.dpToPixels(applicationContext, 50));
                    break;
                }
                break;
        }
        layoutParams.gravity = 17;
        return layoutParams;
    }

    public static IntegrationData getIntegrationData(Context context) {
        return new IntegrationData("AppLovin", "5.2.0");
    }

    private String getInterstitialZoneId() {
        return this.mInterstitialZoneId;
    }

    private String getZoneId(JSONObject jSONObject) {
        return jSONObject.optString(ZONE_ID);
    }

    public static /* synthetic */ void h(AppLovinAdapter appLovinAdapter, AppLovinAdView appLovinAdView, String str) {
        if (appLovinAdView != null) {
            appLovinAdapter.getClass();
            appLovinAdView.destroy();
        }
        appLovinAdapter.mZoneIdToBannerAd.remove(str);
        appLovinAdapter.mZoneIdToBannerLayout.remove(str);
        appLovinAdapter.mZoneIdToAppLovinBannerListener.remove(str);
        appLovinAdapter.mZoneIdToBannerSize.remove(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initSdk(String str, String str2) {
        if (mInitState == InitState.INIT_STATE_NONE || mInitState == InitState.INIT_STATE_IN_PROGRESS) {
            initCallbackListeners.add(this);
        }
        if (mWasInitCalled.compareAndSet(false, true)) {
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("sdkKey = " + str);
            Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            mInitState = InitState.INIT_STATE_IN_PROGRESS;
            try {
                AppLovinSdkInitializationConfiguration appLovinSdkInitializationConfigurationBuild = AppLovinSdkInitializationConfiguration.builder(str).setMediationProvider("ironsource").build();
                AppLovinSdk appLovinSdk = AppLovinSdk.getInstance(applicationContext);
                mAppLovinSdk = appLovinSdk;
                AppLovinSdkSettings settings = appLovinSdk.getSettings();
                settings.setVerboseLogging(isAdaptersDebugEnabled());
                if (!TextUtils.isEmpty(str2)) {
                    ironLog.verbose("setUserIdentifier to " + str2);
                    settings.setUserIdentifier(str2);
                }
                mAppLovinSettings = settings;
                mAppLovinSdk.initialize(appLovinSdkInitializationConfigurationBuild, new AppLovinSdk.SdkInitializationListener() { // from class: com.ironsource.adapters.applovin.g
                    @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
                    public final void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
                        this.f42374a.initializationSuccess();
                    }
                });
            } catch (Throwable th2) {
                initializationFailure(th2.getMessage());
            }
        }
    }

    private void initializationFailure(String str) {
        IronLog.ADAPTER_CALLBACK.verbose();
        mInitState = InitState.INIT_STATE_FAILED;
        Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackFailed("AppLovin sdk init failed - " + str);
        }
        initCallbackListeners.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initializationSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        mInitState = InitState.INIT_STATE_SUCCESS;
        Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackSuccess();
        }
        initCallbackListeners.clear();
    }

    private boolean isInterstitialZoneIdExist(String str) {
        AppLovinAdHolder<AppLovinAd> appLovinAdHolder = mInterstitialAds;
        if (appLovinAdHolder == null) {
            IronLog.INTERNAL.error("mInterstitialAds is null in isInterstitialZoneIdExist");
            return false;
        }
        Iterator<AppLovinAdapter> it = appLovinAdHolder.getAdapters().iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().getInterstitialZoneId())) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ void j(AppLovinAdapter appLovinAdapter, ISBannerSize iSBannerSize, BannerSmashListener bannerSmashListener, String str, AppLovinAdSize appLovinAdSize) {
        appLovinAdapter.getClass();
        try {
            if (iSBannerSize == null) {
                IronLog.INTERNAL.verbose("banner size is null");
                bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(appLovinAdapter.getProviderName()));
                return;
            }
            FrameLayout.LayoutParams bannerLayoutParams = appLovinAdapter.getBannerLayoutParams(iSBannerSize);
            AppLovinBannerListener appLovinBannerListener = new AppLovinBannerListener(appLovinAdapter, bannerSmashListener, str, bannerLayoutParams);
            AppLovinAdView appLovinAdView = new AppLovinAdView(appLovinAdSize);
            appLovinAdView.setAdDisplayListener(appLovinBannerListener);
            appLovinAdView.setAdClickListener(appLovinBannerListener);
            appLovinAdView.setAdViewEventListener(appLovinBannerListener);
            appLovinAdapter.mZoneIdToBannerAd.put(str, appLovinAdView);
            appLovinAdapter.mZoneIdToBannerLayout.put(str, bannerLayoutParams);
            appLovinAdapter.mZoneIdToAppLovinBannerListener.put(str, appLovinBannerListener);
            appLovinAdapter.mZoneIdToBannerSize.put(str, appLovinAdSize);
            mAppLovinSdk.getAdService().loadNextAdForZoneId(str, appLovinBannerListener);
        } catch (Exception e10) {
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError(appLovinAdapter.getProviderName() + " loadBanner exception " + e10.getMessage()));
        }
    }

    private void loadRewardedVideoInternal(String str, RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog.ADAPTER_API.verbose("zoneId = " + str);
        this.mRewardedVideoZoneId = str;
        this.mRewardedVideoSmashListener = rewardedVideoSmashListener;
        this.mRewardedVideoAd = new AppLovinIncentivizedInterstitial(str);
        this.mAppLovinRewardedVideoListener = new AppLovinRewardedVideoListener(this, rewardedVideoSmashListener, str);
        mAppLovinSdk.getAdService().loadNextAdForZoneId(str, this.mAppLovinRewardedVideoListener);
    }

    private void setCCPAValue(boolean z10) {
        IronLog.ADAPTER_API.verbose("value = " + z10);
        AppLovinPrivacySettings.setDoNotSell(z10);
    }

    public static AppLovinAdapter startAdapter(String str) {
        return new AppLovinAdapter(str);
    }

    void addAdToInterstitialAdapter(AppLovinAd appLovinAd) {
        mInterstitialAds.storeAd(this, appLovinAd);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void destroyBanner(JSONObject jSONObject) {
        final String zoneId = getZoneId(jSONObject);
        final AppLovinAdView appLovinAdView = this.mZoneIdToBannerAd.get(zoneId);
        AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.applovin.d
            @Override // java.lang.Runnable
            public final void run() {
                AppLovinAdapter.h(this.f42363b, appLovinAdView, zoneId);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void destroyInterstitialAd(JSONObject jSONObject) {
        String strOptString = jSONObject != null ? jSONObject.optString(ZONE_ID) : "";
        IronLog.ADAPTER_API.verbose("Dispose interstitial ad of " + getProviderName() + ", zoneId = " + strOptString);
        mInterstitialAds.removeAd(this);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getCoreSDKVersion() {
        return getAdapterSDKVersion();
    }

    protected String getErrorString(int i10) {
        if (i10 == -1009) {
            return "The device had no network connectivity at the time of an ad request, either due to airplane mode or no service.";
        }
        if (i10 == -900) {
            return "A postback URL you attempted to dispatch was empty or nil.";
        }
        if (i10 == -800) {
            return "The AppLovin servers have returned an invalid response";
        }
        if (i10 == -600) {
            return "The user exited out of the ad early. You may or may not wish to grant a reward depending on your preference.";
        }
        if (i10 == -500) {
            return "A reward validation requested timed out (usually due to poor connectivity).";
        }
        if (i10 == -400) {
            return "An unknown server-side error occurred.";
        }
        if (i10 == -300) {
            return "The developer called for a rewarded video before one was available.";
        }
        if (i10 == -22) {
            return "The SDK is currently disabled.";
        }
        if (i10 == -1) {
            return "The system is in unexpected state.";
        }
        if (i10 == 204) {
            return "No ads are currently eligible for your device.";
        }
        if (i10 == -1001) {
            return "The network conditions prevented the SDK from receiving an ad.";
        }
        if (i10 == -1000) {
            return "The request body sent to the server was malformed or invalid.";
        }
        if (i10 == -8) {
            return "The provided ad token is invalid; ad token must be returned from AppLovin S2S integration.";
        }
        if (i10 == -7) {
            return "The zone provided is invalid; the zone needs to be added to your AppLovin account or may still be propagating to our servers.";
        }
        if (i10 == -6) {
            return "There has been a failure to render an ad on screen.";
        }
        switch (i10) {
            case AppLovinErrorCodes.UNABLE_TO_PRECACHE_HTML_RESOURCES /* -203 */:
                return "An attempt to cache HTML content failed; the device may be out of space or the resource was malformed.";
            case AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES /* -202 */:
                return "An attempt to cache a video resource to the filesystem failed; the device may be out of space.";
            case AppLovinErrorCodes.UNABLE_TO_PRECACHE_IMAGE_RESOURCES /* -201 */:
                return "An attempt to cache an image resource to the filesystem failed; the device may be out of space.";
            case AppLovinErrorCodes.UNABLE_TO_PRECACHE_RESOURCES /* -200 */:
                return "An attempt to cache a resource to the filesystem failed; the device may be out of space.";
            default:
                return "Unknown error";
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getVersion() {
        return "5.2.0";
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initAndLoadRewardedVideo(String str, final String str2, JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String zoneId = getZoneId(jSONObject);
        final String strOptString = jSONObject.optString(SDK_KEY);
        if (TextUtils.isEmpty(strOptString)) {
            IronLog.INTERNAL.error("Missing param - sdkKey");
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            return;
        }
        if (TextUtils.isEmpty(zoneId)) {
            IronLog.INTERNAL.error("Missing param - zoneId");
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            return;
        }
        IronLog.ADAPTER_API.verbose("zoneId = " + zoneId);
        this.mRewardedVideoSmashListener = rewardedVideoSmashListener;
        this.mRewardedVideoZoneId = zoneId;
        int i10 = AnonymousClass1.$SwitchMap$com$ironsource$adapters$applovin$AppLovinAdapter$InitState[mInitState.ordinal()];
        if (i10 == 1 || i10 == 2) {
            AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.applovin.a
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42354b.initSdk(strOptString, str2);
                }
            });
            return;
        }
        if (i10 == 3) {
            loadRewardedVideoInternal(zoneId, rewardedVideoSmashListener);
            return;
        }
        if (i10 != 4) {
            return;
        }
        IronLog.INTERNAL.verbose("init failed - zoneId = " + zoneId);
        rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBanners(String str, final String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        String zoneId = getZoneId(jSONObject);
        final String strOptString = jSONObject.optString(SDK_KEY);
        if (TextUtils.isEmpty(strOptString)) {
            IronLog.INTERNAL.error("Missing param - sdkKey");
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing param - sdkKey", "Banner"));
            return;
        }
        if (TextUtils.isEmpty(zoneId)) {
            IronLog.INTERNAL.error("Missing param - zoneId");
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing param - zoneId", "Banner"));
            return;
        }
        IronLog.ADAPTER_API.verbose("zoneId = " + zoneId);
        this.mZoneIdToBannerSmashListener.put(zoneId, bannerSmashListener);
        int i10 = AnonymousClass1.$SwitchMap$com$ironsource$adapters$applovin$AppLovinAdapter$InitState[mInitState.ordinal()];
        if (i10 == 1 || i10 == 2) {
            AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.applovin.b
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42357b.initSdk(strOptString, str2);
                }
            });
            return;
        }
        if (i10 == 3) {
            bannerSmashListener.onBannerInitSuccess();
            return;
        }
        if (i10 != 4) {
            return;
        }
        IronLog.INTERNAL.verbose("init failed - zoneId = " + zoneId);
        bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("AppLovin sdk init failed", "Banner"));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitial(String str, final String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String zoneId = getZoneId(jSONObject);
        final String strOptString = jSONObject.optString(SDK_KEY);
        if (TextUtils.isEmpty(strOptString)) {
            IronLog.INTERNAL.error("Missing param - sdkKey");
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing param - sdkKey", "Interstitial"));
            return;
        }
        if (TextUtils.isEmpty(zoneId)) {
            IronLog.INTERNAL.error("Missing param - zoneId");
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing param - zoneId", "Interstitial"));
            return;
        }
        IronLog.ADAPTER_API.verbose("zoneId = " + zoneId);
        this.mZoneIdToInterstitialSmashListener.put(zoneId, interstitialSmashListener);
        int i10 = AnonymousClass1.$SwitchMap$com$ironsource$adapters$applovin$AppLovinAdapter$InitState[mInitState.ordinal()];
        if (i10 == 1 || i10 == 2) {
            AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.applovin.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42360b.initSdk(strOptString, str2);
                }
            });
            return;
        }
        if (i10 == 3) {
            interstitialSmashListener.onInterstitialInitSuccess();
            return;
        }
        if (i10 != 4) {
            return;
        }
        IronLog.INTERNAL.verbose("init failed - zoneId = " + zoneId);
        interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("AppLovin sdk init failed", "Interstitial"));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(String str, final String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String zoneId = getZoneId(jSONObject);
        final String strOptString = jSONObject.optString(SDK_KEY);
        if (TextUtils.isEmpty(strOptString)) {
            IronLog.INTERNAL.error("error - missing param - sdkKey");
            rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing param - sdkKey", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        if (TextUtils.isEmpty(zoneId)) {
            IronLog.INTERNAL.error("Missing param - zoneId");
            rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing param - zoneId", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        IronLog.ADAPTER_API.verbose("zoneId = " + zoneId);
        this.mRewardedVideoSmashListener = rewardedVideoSmashListener;
        this.mShouldNotifyOnRewardedVideoInitCallback = true;
        int i10 = AnonymousClass1.$SwitchMap$com$ironsource$adapters$applovin$AppLovinAdapter$InitState[mInitState.ordinal()];
        if (i10 == 1 || i10 == 2) {
            AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.applovin.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f42366b.initSdk(strOptString, str2);
                }
            });
            return;
        }
        if (i10 == 3) {
            rewardedVideoSmashListener.onRewardedVideoInitSuccess();
            return;
        }
        if (i10 != 4) {
            return;
        }
        IronLog.INTERNAL.verbose("init failed - zoneId = " + zoneId);
        rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("AppLovin sdk init failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public boolean isInterstitialReady(JSONObject jSONObject) {
        AppLovinAdHolder<AppLovinAd> appLovinAdHolder = mInterstitialAds;
        if (appLovinAdHolder == null) {
            IronLog.INTERNAL.verbose("mInterstitialAds is null");
            return false;
        }
        String zoneId = getZoneId(jSONObject);
        return appLovinAdHolder.retrieveAd(this) != null && this.mZoneIdToInterstitialAdReadyStatus.containsKey(zoneId) && Boolean.TRUE.equals(this.mZoneIdToInterstitialAdReadyStatus.get(zoneId)) && isInterstitialZoneIdExist(zoneId);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        return this.mRewardedVideoAd != null;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public boolean isUsingActivityBeforeImpression(@NotNull LevelPlay.AdFormat adFormat) {
        return false;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBanner(JSONObject jSONObject, JSONObject jSONObject2, final ISBannerSize iSBannerSize, final BannerSmashListener bannerSmashListener) {
        final String zoneId = getZoneId(jSONObject);
        IronLog.ADAPTER_API.verbose("zoneId = " + zoneId);
        if (iSBannerSize == null) {
            IronLog.INTERNAL.error("banner size is null");
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getProviderName()));
            return;
        }
        final AppLovinAdSize appLovinAdSizeCalculateBannerSize = calculateBannerSize(iSBannerSize, AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()));
        if (appLovinAdSizeCalculateBannerSize != null) {
            AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.applovin.f
                @Override // java.lang.Runnable
                public final void run() {
                    AppLovinAdapter.j(this.f42369b, iSBannerSize, bannerSmashListener, zoneId, appLovinAdSizeCalculateBannerSize);
                }
            });
        } else {
            IronLog.INTERNAL.error("size not supported, size is null");
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getProviderName()));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitial(JSONObject jSONObject, JSONObject jSONObject2, InterstitialSmashListener interstitialSmashListener) {
        String zoneId = getZoneId(jSONObject);
        IronLog.ADAPTER_API.verbose("zoneId = " + zoneId);
        AppLovinInterstitialListener appLovinInterstitialListener = new AppLovinInterstitialListener(this, interstitialSmashListener, zoneId);
        this.mZoneIdToAppLovinInterstitialListener.put(zoneId, appLovinInterstitialListener);
        if (isInterstitialZoneIdExist(zoneId)) {
            IronLog.INTERNAL.info("Interstitial load request skipped. An interstitial ad with the same configuration is currently in use");
            interstitialSmashListener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError("Interstitial load request skipped. An interstitial ad with the same configuration is currently in use"));
        } else {
            this.mInterstitialZoneId = zoneId;
            mAppLovinSdk.getAdService().loadNextAdForZoneId(zoneId, appLovinInterstitialListener);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideo(JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        loadRewardedVideoInternal(getZoneId(jSONObject), rewardedVideoSmashListener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(String str) {
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mRewardedVideoSmashListener;
        if (rewardedVideoSmashListener != null) {
            if (this.mShouldNotifyOnRewardedVideoInitCallback) {
                rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError(str, IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            }
        }
        Iterator<InterstitialSmashListener> it = this.mZoneIdToInterstitialSmashListener.values().iterator();
        while (it.hasNext()) {
            it.next().onInterstitialInitFailed(ErrorBuilder.buildInitFailedError(str, "Interstitial"));
        }
        Iterator<BannerSmashListener> it2 = this.mZoneIdToBannerSmashListener.values().iterator();
        while (it2.hasNext()) {
            it2.next().onBannerInitFailed(ErrorBuilder.buildInitFailedError(str, "Banner"));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        RewardedVideoSmashListener rewardedVideoSmashListener = this.mRewardedVideoSmashListener;
        if (rewardedVideoSmashListener != null) {
            if (this.mShouldNotifyOnRewardedVideoInitCallback) {
                rewardedVideoSmashListener.onRewardedVideoInitSuccess();
            } else {
                loadRewardedVideoInternal(this.mRewardedVideoZoneId, rewardedVideoSmashListener);
            }
        }
        Iterator<InterstitialSmashListener> it = this.mZoneIdToInterstitialSmashListener.values().iterator();
        while (it.hasNext()) {
            it.next().onInterstitialInitSuccess();
        }
        Iterator<BannerSmashListener> it2 = this.mZoneIdToBannerSmashListener.values().iterator();
        while (it2.hasNext()) {
            it2.next().onBannerInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    protected void setConsent(boolean z10) {
        IronLog.ADAPTER_API.verbose("consent = " + z10);
        AppLovinPrivacySettings.setHasUserConsent(z10);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    protected void setMetaData(String str, List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        String str2 = list.get(0);
        IronLog.ADAPTER_API.verbose("key = " + str + ", value = " + str2);
        if (MetaDataUtils.isValidCCPAMetaData(str, str2)) {
            setCCPAValue(MetaDataUtils.getMetaDataBooleanValue(str2));
        }
    }

    public void setRewardedVideoAd(AppLovinAd appLovinAd) {
        this.mRewardedAppLovinAd = appLovinAd;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String zoneId = getZoneId(jSONObject);
        IronLog.ADAPTER_API.verbose("zoneId = " + zoneId);
        if (isInterstitialReady(jSONObject)) {
            AppLovinAd appLovinAdRetrieveAd = mInterstitialAds.retrieveAd(this);
            AppLovinInterstitialListener appLovinInterstitialListener = this.mZoneIdToAppLovinInterstitialListener.get(zoneId);
            AppLovinInterstitialAdDialog appLovinInterstitialAdDialogCreate = AppLovinInterstitialAd.create();
            appLovinInterstitialAdDialogCreate.setAdClickListener(appLovinInterstitialListener);
            appLovinInterstitialAdDialogCreate.setAdDisplayListener(appLovinInterstitialListener);
            appLovinInterstitialAdDialogCreate.setAdVideoPlaybackListener(appLovinInterstitialListener);
            appLovinInterstitialAdDialogCreate.showAndRender(appLovinAdRetrieveAd);
        } else {
            AppLovinAdHolder<AppLovinAd> appLovinAdHolder = mInterstitialAds;
            if (appLovinAdHolder != null) {
                appLovinAdHolder.removeAd(this);
            }
            interstitialSmashListener.onInterstitialAdShowFailed(ErrorBuilder.buildNoAdsToShowError("Interstitial"));
        }
        updateInterstitialAvailability(zoneId, false);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String zoneId = getZoneId(jSONObject);
        IronLog.ADAPTER_API.verbose("zoneId = " + zoneId);
        if (!isRewardedVideoAvailable(jSONObject)) {
            rewardedVideoSmashListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        if (!TextUtils.isEmpty(getDynamicUserId())) {
            mAppLovinSettings.setUserIdentifier(getDynamicUserId());
        }
        AppLovinIncentivizedInterstitial appLovinIncentivizedInterstitial = this.mRewardedVideoAd;
        AppLovinAd appLovinAd = this.mRewardedAppLovinAd;
        AppLovinRewardedVideoListener appLovinRewardedVideoListener = this.mAppLovinRewardedVideoListener;
        appLovinIncentivizedInterstitial.show(appLovinAd, appLovinRewardedVideoListener, appLovinRewardedVideoListener, appLovinRewardedVideoListener, appLovinRewardedVideoListener);
    }

    void updateInterstitialAvailability(String str, boolean z10) {
        this.mZoneIdToInterstitialAdReadyStatus.put(str, Boolean.valueOf(z10));
    }
}
