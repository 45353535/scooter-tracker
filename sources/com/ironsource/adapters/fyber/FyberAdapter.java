package com.ironsource.adapters.fyber;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import com.fyber.inneractive.sdk.external.BidTokenProvider;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveAdSpot;
import com.fyber.inneractive.sdk.external.InneractiveAdSpotManager;
import com.fyber.inneractive.sdk.external.InneractiveAdViewUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenUnitController;
import com.fyber.inneractive.sdk.external.InneractiveFullscreenVideoContentController;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.adapters.custom.bmwf.BMConstants;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.AdapterNetworkData;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.unity3d.mediation.LevelPlay;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class FyberAdapter extends AbstractAdapter implements INetworkInitCallbackListener {
    protected static final String CREATIVE_ID_KEY = "creativeId";
    private static final String GitHash = "555ca1e";
    private static final String META_DATA_DT_COPPA_KEY = "DT_COPPA";
    private static final String META_DATA_DT_IS_CHILD_KEY = "DT_IsChild";
    private static final String NETWORK_DATA_IS_CHILD_KEY = "AudienceIsChild";
    private static final String VERSION = "5.1.0";
    private static Boolean mCCPA;
    private static Boolean mConsent;
    private static Boolean mDTCOPPA;
    private static boolean mDTIsChild;
    private static String mUserId;
    private final String APP_ID;
    private final String MEDIATION_NAME;
    private final String SPOT_ID;
    protected InneractiveAdViewUnitController mInneractiveAdViewUnitController;
    private CopyOnWriteArraySet<String> mRewardedVideoSpotIdsForInitCallbacks;
    private ConcurrentHashMap<String, InneractiveAdSpot> mSpotIdToBannerAd;
    private ConcurrentHashMap<String, FyberBannerAdListener> mSpotIdToBannerFyberAdListener;
    protected ConcurrentHashMap<String, ISBannerSize> mSpotIdToBannerSize;
    private ConcurrentHashMap<String, BannerSmashListener> mSpotIdToBannerSmashListener;
    private ConcurrentHashMap<String, InneractiveAdSpot> mSpotIdToInterstitialAd;
    private ConcurrentHashMap<String, FyberInterstitialAdListener> mSpotIdToInterstitialFyberAdListener;
    private ConcurrentHashMap<String, InterstitialSmashListener> mSpotIdToInterstitialSmashListener;
    private ConcurrentHashMap<String, InneractiveAdSpot> mSpotIdToRewardedVideoAd;
    private ConcurrentHashMap<String, FyberRewardedVideoAdListener> mSpotIdToRewardedVideoFyberAdListener;
    private ConcurrentHashMap<String, RewardedVideoSmashListener> mSpotIdToRewardedVideoSmashListener;
    private static AtomicBoolean mWasInitCalled = new AtomicBoolean(false);
    private static InitState mInitState = InitState.INIT_STATE_NONE;
    private static HashSet<INetworkInitCallbackListener> initCallbackListeners = new HashSet<>();

    /* JADX INFO: renamed from: com.ironsource.adapters.fyber.FyberAdapter$10, reason: invalid class name */
    static /* synthetic */ class AnonymousClass10 {
        static final /* synthetic */ int[] $SwitchMap$com$ironsource$adapters$fyber$FyberAdapter$InitState;

        static {
            int[] iArr = new int[InitState.values().length];
            $SwitchMap$com$ironsource$adapters$fyber$FyberAdapter$InitState = iArr;
            try {
                iArr[InitState.INIT_STATE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ironsource$adapters$fyber$FyberAdapter$InitState[InitState.INIT_STATE_IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ironsource$adapters$fyber$FyberAdapter$InitState[InitState.INIT_STATE_SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$ironsource$adapters$fyber$FyberAdapter$InitState[InitState.INIT_STATE_FAILED.ordinal()] = 4;
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

    private FyberAdapter(String str) {
        super(str);
        this.MEDIATION_NAME = "IronSource";
        this.APP_ID = RemoteConfigConstants.RequestFieldKey.APP_ID;
        this.SPOT_ID = "adSpotId";
        IronLog.INTERNAL.verbose();
        this.mSpotIdToRewardedVideoAd = new ConcurrentHashMap<>();
        this.mSpotIdToRewardedVideoSmashListener = new ConcurrentHashMap<>();
        this.mSpotIdToRewardedVideoFyberAdListener = new ConcurrentHashMap<>();
        this.mRewardedVideoSpotIdsForInitCallbacks = new CopyOnWriteArraySet<>();
        this.mSpotIdToInterstitialAd = new ConcurrentHashMap<>();
        this.mSpotIdToInterstitialSmashListener = new ConcurrentHashMap<>();
        this.mSpotIdToInterstitialFyberAdListener = new ConcurrentHashMap<>();
        this.mSpotIdToBannerAd = new ConcurrentHashMap<>();
        this.mSpotIdToBannerSmashListener = new ConcurrentHashMap<>();
        this.mSpotIdToBannerFyberAdListener = new ConcurrentHashMap<>();
        this.mSpotIdToBannerSize = new ConcurrentHashMap<>();
        this.mLWSSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    public static String getAdapterSDKVersion() {
        return InneractiveAdManager.getVersion();
    }

    private Map<String, Object> getBiddingData() {
        if (mInitState != InitState.INIT_STATE_SUCCESS) {
            IronLog.INTERNAL.verbose("returning null as token since init did not finish");
            return null;
        }
        String bidderToken = BidTokenProvider.getBidderToken();
        if (TextUtils.isEmpty(bidderToken)) {
            bidderToken = "";
        }
        IronLog.ADAPTER_API.verbose("token = " + bidderToken);
        HashMap map = new HashMap();
        map.put("token", bidderToken);
        return map;
    }

    public static IntegrationData getIntegrationData(Context context) {
        return new IntegrationData("Fyber", "5.1.0");
    }

    private <T> T getNetworkDataValueByKey(JSONObject jSONObject, String str, Class<T> cls) {
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next.equalsIgnoreCase(str)) {
                Object objOpt = jSONObject.opt(next);
                if (cls.isInstance(objOpt)) {
                    return cls.cast(objOpt);
                }
            }
        }
        return null;
    }

    private void initSDK(final String str, final String str2) {
        AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.fyber.FyberAdapter.1
            @Override // java.lang.Runnable
            public void run() {
                if (FyberAdapter.mInitState == InitState.INIT_STATE_NONE || FyberAdapter.mInitState == InitState.INIT_STATE_IN_PROGRESS) {
                    FyberAdapter.initCallbackListeners.add(FyberAdapter.this);
                }
                if (FyberAdapter.mWasInitCalled.compareAndSet(false, true)) {
                    IronLog.ADAPTER_API.verbose("appId = " + str);
                    FyberAdapter.mInitState = InitState.INIT_STATE_IN_PROGRESS;
                    FyberAdapter.mUserId = str2;
                    FyberAdapter.this.setIsChildValue(FyberAdapter.mDTIsChild);
                    InneractiveAdManager.initialize(ContextProvider.getInstance().getApplicationContext(), str, new OnFyberMarketplaceInitializedListener() { // from class: com.ironsource.adapters.fyber.FyberAdapter.1.1
                        @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
                        public void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
                            if (fyberInitStatus == OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
                                FyberAdapter.this.initializationSuccess();
                            } else {
                                FyberAdapter.this.initializationFailure();
                            }
                        }
                    });
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initializationFailure() {
        IronLog.ADAPTER_CALLBACK.verbose();
        mInitState = InitState.INIT_STATE_FAILED;
        Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackFailed("Fyber sdk init failed");
        }
        initCallbackListeners.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initializationSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        mInitState = InitState.INIT_STATE_SUCCESS;
        if (!TextUtils.isEmpty(mUserId)) {
            IronLog.INTERNAL.verbose("setUserID to " + mUserId);
            InneractiveAdManager.setUserId(mUserId);
        }
        Boolean bool = mConsent;
        if (bool != null) {
            setConsent(bool.booleanValue());
        }
        Boolean bool2 = mCCPA;
        if (bool2 != null) {
            setCCPAValue(bool2.booleanValue());
        }
        Boolean bool3 = mDTCOPPA;
        if (bool3 != null) {
            setCOPPAValue(bool3.booleanValue());
        }
        Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackSuccess();
        }
        initCallbackListeners.clear();
    }

    private void loadBannerInternal(final String str, final ISBannerSize iSBannerSize, final BannerSmashListener bannerSmashListener, final String str2) {
        IronLog.ADAPTER_API.verbose("spotId = " + str);
        AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.fyber.FyberAdapter.6
            @Override // java.lang.Runnable
            public void run() {
                ISBannerSize iSBannerSize2 = iSBannerSize;
                if (iSBannerSize2 == null) {
                    IronLog.INTERNAL.error("banner size is null");
                    bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildNoConfigurationAvailableError("banner size is null"));
                    return;
                }
                FyberAdapter.this.mSpotIdToBannerSize.put(str, iSBannerSize2);
                InneractiveAdSpot inneractiveAdSpotCreateSpot = InneractiveAdSpotManager.get().createSpot();
                FyberAdapter.this.setMediationData(inneractiveAdSpotCreateSpot);
                FyberAdapter.this.mInneractiveAdViewUnitController = new InneractiveAdViewUnitController();
                inneractiveAdSpotCreateSpot.addUnitController(FyberAdapter.this.mInneractiveAdViewUnitController);
                FyberBannerAdListener fyberBannerAdListener = new FyberBannerAdListener(FyberAdapter.this, bannerSmashListener, str);
                FyberAdapter.this.mSpotIdToBannerFyberAdListener.put(str, fyberBannerAdListener);
                inneractiveAdSpotCreateSpot.setRequestListener(fyberBannerAdListener);
                FyberAdapter.this.mInneractiveAdViewUnitController.setEventsListener(fyberBannerAdListener);
                FyberAdapter.this.mSpotIdToBannerAd.put(str, inneractiveAdSpotCreateSpot);
                String str3 = str2;
                if (str3 == null) {
                    inneractiveAdSpotCreateSpot.requestAd(new InneractiveAdRequest(str));
                } else {
                    inneractiveAdSpotCreateSpot.loadAd(str3);
                }
            }
        });
    }

    private void loadInterstitialInternal(final String str, final String str2, final InterstitialSmashListener interstitialSmashListener) {
        IronLog.ADAPTER_API.verbose("spotId = " + str);
        AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.fyber.FyberAdapter.4
            @Override // java.lang.Runnable
            public void run() {
                InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) FyberAdapter.this.mSpotIdToInterstitialAd.get(str);
                if (inneractiveAdSpot != null) {
                    IronLog.ADAPTER_API.verbose("destroying previous ad with spotId " + str);
                    inneractiveAdSpot.destroy();
                    FyberAdapter.this.mSpotIdToInterstitialAd.remove(str);
                }
                InneractiveAdSpot inneractiveAdSpotCreateSpot = InneractiveAdSpotManager.get().createSpot();
                inneractiveAdSpotCreateSpot.addUnitController(new InneractiveFullscreenUnitController());
                FyberAdapter.this.setMediationData(inneractiveAdSpotCreateSpot);
                FyberInterstitialAdListener fyberInterstitialAdListener = new FyberInterstitialAdListener(interstitialSmashListener, str);
                FyberAdapter.this.mSpotIdToInterstitialFyberAdListener.put(str, fyberInterstitialAdListener);
                inneractiveAdSpotCreateSpot.setRequestListener(fyberInterstitialAdListener);
                FyberAdapter.this.mSpotIdToInterstitialAd.put(str, inneractiveAdSpotCreateSpot);
                String str3 = str2;
                if (str3 == null) {
                    inneractiveAdSpotCreateSpot.requestAd(new InneractiveAdRequest(str));
                } else {
                    inneractiveAdSpotCreateSpot.loadAd(str3);
                }
            }
        });
    }

    private void loadRewardedVideoInternal(final String str, final String str2, final RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog.ADAPTER_API.verbose("spotId = " + str);
        AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.fyber.FyberAdapter.2
            @Override // java.lang.Runnable
            public void run() {
                InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) FyberAdapter.this.mSpotIdToRewardedVideoAd.get(str);
                if (inneractiveAdSpot != null) {
                    inneractiveAdSpot.destroy();
                    FyberAdapter.this.mSpotIdToRewardedVideoAd.remove(str);
                }
                InneractiveAdSpot inneractiveAdSpotCreateSpot = InneractiveAdSpotManager.get().createSpot();
                inneractiveAdSpotCreateSpot.addUnitController(new InneractiveFullscreenUnitController());
                FyberAdapter.this.setMediationData(inneractiveAdSpotCreateSpot);
                FyberRewardedVideoAdListener fyberRewardedVideoAdListener = new FyberRewardedVideoAdListener(rewardedVideoSmashListener, str);
                FyberAdapter.this.mSpotIdToRewardedVideoFyberAdListener.put(str, fyberRewardedVideoAdListener);
                inneractiveAdSpotCreateSpot.setRequestListener(fyberRewardedVideoAdListener);
                FyberAdapter.this.mSpotIdToRewardedVideoAd.put(str, inneractiveAdSpotCreateSpot);
                String str3 = str2;
                if (str3 == null) {
                    inneractiveAdSpotCreateSpot.requestAd(new InneractiveAdRequest(str));
                } else {
                    inneractiveAdSpotCreateSpot.loadAd(str3);
                }
            }
        });
    }

    private void setCCPAValue(final boolean z10) {
        AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.fyber.FyberAdapter.9
            @Override // java.lang.Runnable
            public void run() {
                if (!FyberAdapter.mWasInitCalled.get()) {
                    FyberAdapter.mCCPA = Boolean.valueOf(z10);
                    return;
                }
                IronLog ironLog = IronLog.ADAPTER_API;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("setCCPAValue - value = ");
                boolean z11 = z10;
                String str = BMConstants.BM_CCPA_CONSENT_VALUE;
                sb2.append(z11 ? BMConstants.BM_CCPA_NO_CONSENT_VALUE : BMConstants.BM_CCPA_CONSENT_VALUE);
                ironLog.verbose(sb2.toString());
                if (z10) {
                    str = BMConstants.BM_CCPA_NO_CONSENT_VALUE;
                }
                InneractiveAdManager.setUSPrivacyString(str);
            }
        });
    }

    private void setCOPPAValue(boolean z10) {
        if (z10) {
            if (mInitState != InitState.INIT_STATE_SUCCESS) {
                mDTCOPPA = Boolean.valueOf(z10);
            } else {
                IronLog.ADAPTER_API.verbose("calling InneractiveAdManager.currentAudienceAppliesToCoppa");
                InneractiveAdManager.currentAudienceAppliesToCoppa();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIsChildValue(boolean z10) {
        if (mInitState == InitState.INIT_STATE_NONE) {
            mDTIsChild = z10;
        } else if (mInitState == InitState.INIT_STATE_IN_PROGRESS && z10) {
            IronLog.ADAPTER_API.verbose("calling InneractiveAdManager.currentAudienceIsAChild");
            InneractiveAdManager.currentAudienceIsAChild();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMediationData(InneractiveAdSpot inneractiveAdSpot) {
        inneractiveAdSpot.setMediationName("IronSource");
        inneractiveAdSpot.setMediationVersion("5.1.0");
    }

    public static FyberAdapter startAdapter(String str) {
        return new FyberAdapter(str);
    }

    public FrameLayout.LayoutParams calculateLayoutParams(ISBannerSize iSBannerSize) {
        Context applicationContext;
        FrameLayout.LayoutParams layoutParams;
        if (iSBannerSize == null) {
            IronLog.ADAPTER_API.error("bannerSize is null");
            return null;
        }
        new FrameLayout.LayoutParams(0, 0);
        applicationContext = ContextProvider.getInstance().getApplicationContext();
        String description = iSBannerSize.getDescription();
        description.getClass();
        switch (description) {
            case "RECTANGLE":
                layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(applicationContext, 300), AdapterUtils.dpToPixels(applicationContext, 250));
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
            case "BANNER":
                layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(applicationContext, 320), AdapterUtils.dpToPixels(applicationContext, 50));
                break;
            default:
                return null;
        }
        layoutParams.gravity = 17;
        return layoutParams;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void destroyBanner(JSONObject jSONObject) {
        final String strOptString = jSONObject.optString("adSpotId");
        IronLog.ADAPTER_API.verbose("spotId = " + strOptString);
        AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.fyber.FyberAdapter.7
            @Override // java.lang.Runnable
            public void run() {
                InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) FyberAdapter.this.mSpotIdToBannerAd.get(strOptString);
                if (inneractiveAdSpot != null) {
                    IronLog.ADAPTER_API.verbose("destroying previous ad with spotId " + strOptString);
                    inneractiveAdSpot.destroy();
                    FyberAdapter.this.mSpotIdToBannerAd.remove(strOptString);
                }
            }
        });
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public Map<String, Object> getBannerBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return getBiddingData();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getCoreSDKVersion() {
        return getAdapterSDKVersion();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public Map<String, Object> getInterstitialBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return getBiddingData();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public Map<String, Object> getRewardedVideoBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return getBiddingData();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getVersion() {
        return "5.1.0";
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initAndLoadRewardedVideo(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String strOptString = jSONObject.optString(RemoteConfigConstants.RequestFieldKey.APP_ID);
        String strOptString2 = jSONObject.optString("adSpotId");
        if (TextUtils.isEmpty(strOptString)) {
            IronLog.INTERNAL.error("Missing param - appId");
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            return;
        }
        if (TextUtils.isEmpty(strOptString2)) {
            IronLog.INTERNAL.error("Missing param - adSpotId");
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            return;
        }
        IronLog.ADAPTER_API.verbose("spotId = " + strOptString2);
        this.mSpotIdToRewardedVideoSmashListener.put(strOptString2, rewardedVideoSmashListener);
        int i10 = AnonymousClass10.$SwitchMap$com$ironsource$adapters$fyber$FyberAdapter$InitState[mInitState.ordinal()];
        if (i10 == 1 || i10 == 2) {
            initSDK(strOptString, str2);
            return;
        }
        if (i10 == 3) {
            loadRewardedVideoInternal(strOptString2, null, rewardedVideoSmashListener);
            return;
        }
        if (i10 != 4) {
            return;
        }
        IronLog.INTERNAL.verbose("init failed - spotId = " + strOptString2);
        rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBannerForBidding(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        initBanners(str, str2, jSONObject, bannerSmashListener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBanners(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        String strOptString = jSONObject.optString(RemoteConfigConstants.RequestFieldKey.APP_ID);
        String strOptString2 = jSONObject.optString("adSpotId");
        if (TextUtils.isEmpty(strOptString)) {
            IronLog.INTERNAL.error("missing param - appId");
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing param - appId", "Banner"));
            return;
        }
        if (TextUtils.isEmpty(strOptString2)) {
            IronLog.INTERNAL.error("missing param - adSpotId");
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing params - adSpotId", "Banner"));
            return;
        }
        IronLog.ADAPTER_API.verbose("spotId = " + strOptString2);
        this.mSpotIdToBannerSmashListener.put(strOptString2, bannerSmashListener);
        int i10 = AnonymousClass10.$SwitchMap$com$ironsource$adapters$fyber$FyberAdapter$InitState[mInitState.ordinal()];
        if (i10 == 1 || i10 == 2) {
            initSDK(strOptString, str2);
            return;
        }
        if (i10 == 3) {
            bannerSmashListener.onBannerInitSuccess();
            return;
        }
        if (i10 != 4) {
            return;
        }
        IronLog.INTERNAL.verbose("init failed - spotId = " + strOptString2);
        bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Fyber sdk init failed", "Banner"));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String strOptString = jSONObject.optString(RemoteConfigConstants.RequestFieldKey.APP_ID);
        String strOptString2 = jSONObject.optString("adSpotId");
        if (TextUtils.isEmpty(strOptString)) {
            IronLog.INTERNAL.error("missing param - appId");
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing param - appId", "Interstitial"));
            return;
        }
        if (TextUtils.isEmpty(strOptString2)) {
            IronLog.INTERNAL.error("missing param - adSpotId");
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing params - adSpotId", "Interstitial"));
            return;
        }
        IronLog.ADAPTER_API.verbose("spotId = " + strOptString2);
        this.mSpotIdToInterstitialSmashListener.put(strOptString2, interstitialSmashListener);
        int i10 = AnonymousClass10.$SwitchMap$com$ironsource$adapters$fyber$FyberAdapter$InitState[mInitState.ordinal()];
        if (i10 == 1 || i10 == 2) {
            initSDK(strOptString, str2);
            return;
        }
        if (i10 == 3) {
            interstitialSmashListener.onInterstitialInitSuccess();
            return;
        }
        if (i10 != 4) {
            return;
        }
        IronLog.INTERNAL.verbose("init failed - spotId = " + strOptString2);
        interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Fyber sdk init failed", "Interstitial"));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitialForBidding(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        initInterstitial(str, str2, jSONObject, interstitialSmashListener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String strOptString = jSONObject.optString(RemoteConfigConstants.RequestFieldKey.APP_ID);
        String strOptString2 = jSONObject.optString("adSpotId");
        if (TextUtils.isEmpty(strOptString)) {
            IronLog.INTERNAL.error("Missing param - appId");
            rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing param - appId", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        if (TextUtils.isEmpty(strOptString2)) {
            IronLog.INTERNAL.error("Missing param - adSpotId");
            rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing params - adSpotId", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        IronLog.ADAPTER_API.verbose("spotId = " + strOptString2);
        this.mSpotIdToRewardedVideoSmashListener.put(strOptString2, rewardedVideoSmashListener);
        this.mRewardedVideoSpotIdsForInitCallbacks.add(strOptString2);
        int i10 = AnonymousClass10.$SwitchMap$com$ironsource$adapters$fyber$FyberAdapter$InitState[mInitState.ordinal()];
        if (i10 == 1 || i10 == 2) {
            initSDK(strOptString, str2);
            return;
        }
        if (i10 == 3) {
            rewardedVideoSmashListener.onRewardedVideoInitSuccess();
            return;
        }
        if (i10 != 4) {
            return;
        }
        IronLog.INTERNAL.verbose("init failed - spotId = " + strOptString2);
        rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Fyber sdk init failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public boolean isInterstitialReady(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("adSpotId");
        IronLog.ADAPTER_API.verbose("spotId = " + strOptString);
        InneractiveAdSpot inneractiveAdSpot = this.mSpotIdToInterstitialAd.get(strOptString);
        return inneractiveAdSpot != null && inneractiveAdSpot.isReady();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("adSpotId");
        IronLog.ADAPTER_API.verbose("spotId = " + strOptString);
        InneractiveAdSpot inneractiveAdSpot = this.mSpotIdToRewardedVideoAd.get(strOptString);
        return inneractiveAdSpot != null && inneractiveAdSpot.isReady();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public boolean isUsingActivityBeforeImpression(@NotNull LevelPlay.AdFormat adFormat) {
        return false;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBanner(JSONObject jSONObject, JSONObject jSONObject2, ISBannerSize iSBannerSize, BannerSmashListener bannerSmashListener) {
        loadBannerInternal(jSONObject.optString("adSpotId"), iSBannerSize, bannerSmashListener, null);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, ISBannerSize iSBannerSize, BannerSmashListener bannerSmashListener) {
        loadBannerInternal(jSONObject.optString("adSpotId"), iSBannerSize, bannerSmashListener, str);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitial(JSONObject jSONObject, JSONObject jSONObject2, InterstitialSmashListener interstitialSmashListener) {
        loadInterstitialInternal(jSONObject.optString("adSpotId"), null, interstitialSmashListener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitialForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, InterstitialSmashListener interstitialSmashListener) {
        loadInterstitialInternal(jSONObject.optString("adSpotId"), str, interstitialSmashListener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideo(JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        loadRewardedVideoInternal(jSONObject.optString("adSpotId"), null, rewardedVideoSmashListener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, RewardedVideoSmashListener rewardedVideoSmashListener) {
        loadRewardedVideoInternal(jSONObject.optString("adSpotId"), str, rewardedVideoSmashListener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(String str) {
        for (String str2 : this.mSpotIdToRewardedVideoSmashListener.keySet()) {
            RewardedVideoSmashListener rewardedVideoSmashListener = this.mSpotIdToRewardedVideoSmashListener.get(str2);
            if (this.mRewardedVideoSpotIdsForInitCallbacks.contains(str2)) {
                rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError(str, IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            }
        }
        Iterator<InterstitialSmashListener> it = this.mSpotIdToInterstitialSmashListener.values().iterator();
        while (it.hasNext()) {
            it.next().onInterstitialInitFailed(ErrorBuilder.buildInitFailedError(str, "Interstitial"));
        }
        Iterator<BannerSmashListener> it2 = this.mSpotIdToBannerSmashListener.values().iterator();
        while (it2.hasNext()) {
            it2.next().onBannerInitFailed(ErrorBuilder.buildInitFailedError(str, "Banner"));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        for (String str : this.mSpotIdToRewardedVideoSmashListener.keySet()) {
            RewardedVideoSmashListener rewardedVideoSmashListener = this.mSpotIdToRewardedVideoSmashListener.get(str);
            if (this.mRewardedVideoSpotIdsForInitCallbacks.contains(str)) {
                rewardedVideoSmashListener.onRewardedVideoInitSuccess();
            } else {
                loadRewardedVideoInternal(str, null, rewardedVideoSmashListener);
            }
        }
        Iterator<InterstitialSmashListener> it = this.mSpotIdToInterstitialSmashListener.values().iterator();
        while (it.hasNext()) {
            it.next().onInterstitialInitSuccess();
        }
        Iterator<BannerSmashListener> it2 = this.mSpotIdToBannerSmashListener.values().iterator();
        while (it2.hasNext()) {
            it2.next().onBannerInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    protected void setConsent(final boolean z10) {
        AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.fyber.FyberAdapter.8
            @Override // java.lang.Runnable
            public void run() {
                if (!FyberAdapter.mWasInitCalled.get()) {
                    FyberAdapter.mConsent = Boolean.valueOf(z10);
                    return;
                }
                IronLog.ADAPTER_API.verbose("setConsent - consent = " + z10);
                InneractiveAdManager.setGdprConsent(z10);
            }
        });
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
            return;
        }
        String valueForType = MetaDataUtils.formatValueForType(str2, MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN);
        if (MetaDataUtils.isValidMetaData(str, META_DATA_DT_IS_CHILD_KEY, valueForType)) {
            setIsChildValue(MetaDataUtils.getMetaDataBooleanValue(valueForType));
        } else if (MetaDataUtils.isValidMetaData(str, META_DATA_DT_COPPA_KEY, valueForType)) {
            setCOPPAValue(MetaDataUtils.getMetaDataBooleanValue(valueForType));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.adunit.adapter.internal.AdapterNetworkDataInterface
    public void setNetworkData(@NotNull AdapterNetworkData adapterNetworkData) {
        Boolean bool = (Boolean) getNetworkDataValueByKey(adapterNetworkData.allData(), NETWORK_DATA_IS_CHILD_KEY, Boolean.class);
        if (bool != null) {
            IronLog.ADAPTER_API.verbose("key = AudienceIsChild, value = " + bool);
            setIsChildValue(bool.booleanValue());
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void showInterstitial(final JSONObject jSONObject, final InterstitialSmashListener interstitialSmashListener) {
        final String strOptString = jSONObject.optString("adSpotId");
        IronLog.ADAPTER_API.verbose("spotId = " + strOptString);
        AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.fyber.FyberAdapter.5
            @Override // java.lang.Runnable
            public void run() {
                InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) FyberAdapter.this.mSpotIdToInterstitialAd.get(strOptString);
                if (inneractiveAdSpot == null || !FyberAdapter.this.isInterstitialReady(jSONObject)) {
                    interstitialSmashListener.onInterstitialAdShowFailed(ErrorBuilder.buildNoAdsToShowError("Interstitial"));
                    return;
                }
                InneractiveFullscreenUnitController inneractiveFullscreenUnitController = (InneractiveFullscreenUnitController) inneractiveAdSpot.getSelectedUnitController();
                inneractiveFullscreenUnitController.setEventsListener((FyberInterstitialAdListener) FyberAdapter.this.mSpotIdToInterstitialFyberAdListener.get(strOptString));
                inneractiveFullscreenUnitController.addContentController(new InneractiveFullscreenVideoContentController());
                IronLog.ADAPTER_API.verbose("showInterstitial - show");
                inneractiveFullscreenUnitController.show(ContextProvider.getInstance().getCurrentActiveActivity());
            }
        });
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(final JSONObject jSONObject, final RewardedVideoSmashListener rewardedVideoSmashListener) {
        final String strOptString = jSONObject.optString("adSpotId");
        IronLog.ADAPTER_API.verbose("spotId = " + strOptString);
        AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.fyber.FyberAdapter.3
            @Override // java.lang.Runnable
            public void run() {
                if (!TextUtils.isEmpty(FyberAdapter.this.getDynamicUserId())) {
                    IronLog.INTERNAL.verbose("setUserID to " + FyberAdapter.this.getDynamicUserId());
                    InneractiveAdManager.setUserId(FyberAdapter.this.getDynamicUserId());
                }
                InneractiveAdSpot inneractiveAdSpot = (InneractiveAdSpot) FyberAdapter.this.mSpotIdToRewardedVideoAd.get(strOptString);
                if (inneractiveAdSpot == null || !FyberAdapter.this.isRewardedVideoAvailable(jSONObject)) {
                    rewardedVideoSmashListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                    return;
                }
                InneractiveFullscreenUnitController inneractiveFullscreenUnitController = (InneractiveFullscreenUnitController) inneractiveAdSpot.getSelectedUnitController();
                FyberRewardedVideoAdListener fyberRewardedVideoAdListener = (FyberRewardedVideoAdListener) FyberAdapter.this.mSpotIdToRewardedVideoFyberAdListener.get(strOptString);
                inneractiveFullscreenUnitController.setRewardedListener(fyberRewardedVideoAdListener);
                inneractiveFullscreenUnitController.setEventsListener(fyberRewardedVideoAdListener);
                InneractiveFullscreenVideoContentController inneractiveFullscreenVideoContentController = new InneractiveFullscreenVideoContentController();
                inneractiveFullscreenVideoContentController.setEventsListener(fyberRewardedVideoAdListener);
                inneractiveFullscreenUnitController.addContentController(inneractiveFullscreenVideoContentController);
                inneractiveFullscreenUnitController.show(ContextProvider.getInstance().getCurrentActiveActivity());
            }
        });
    }
}
