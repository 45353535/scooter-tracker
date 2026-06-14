package com.ironsource.adapters.mytarget;

import android.content.Context;
import android.text.TextUtils;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.ironsource.adapters.bigo.BigoAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.my.target.ads.InterstitialAd;
import com.my.target.ads.MyTargetView;
import com.my.target.ads.RewardedAd;
import com.my.target.common.BaseAd;
import com.my.target.common.MyTargetManager;
import com.my.target.common.MyTargetPrivacy;
import com.unity3d.mediation.LevelPlay;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class MyTargetAdapter extends AbstractAdapter implements INetworkInitCallbackListener {
    private static final String GitHash = "8cbe4c7";
    private static final String NETWORK_NAME = "MyTarget";
    private static final String VERSION = "5.2.0";
    private final String IRONSOURCE_MEDIATION;
    private final String SLOT_ID;
    private MyTargetBannerListener mAdListener;
    private MyTargetView mBannerAdView;
    private BannerSmashListener mBannerSmashListener;
    protected ConcurrentHashMap<String, Boolean> mInterstitialAdsAvailability;
    protected ConcurrentHashMap<String, InterstitialAd> mInterstitialSlotIdToAd;
    private final ConcurrentHashMap<String, InterstitialSmashListener> mInterstitialSlotIdToSmashListener;
    protected ConcurrentHashMap<String, Boolean> mRewardedVideoAdsAvailability;
    protected ConcurrentHashMap<String, RewardedAd> mRewardedVideoSlotIdToAd;
    private final ConcurrentHashMap<String, RewardedVideoSmashListener> mRewardedVideoSlotIdToSmashListener;
    protected CopyOnWriteArraySet<String> mRewardedVideoSlotIdsForInitCallbacks;
    private static AtomicBoolean mWasInitCalled = new AtomicBoolean(false);
    protected static InitState mInitState = InitState.INIT_STATE_NONE;
    protected static HashSet<INetworkInitCallbackListener> initCallbackListeners = new HashSet<>();

    /* JADX INFO: renamed from: com.ironsource.adapters.mytarget.MyTargetAdapter$4, reason: invalid class name */
    static /* synthetic */ class AnonymousClass4 {
        static final /* synthetic */ int[] $SwitchMap$com$ironsource$adapters$mytarget$MyTargetAdapter$InitState;

        static {
            int[] iArr = new int[InitState.values().length];
            $SwitchMap$com$ironsource$adapters$mytarget$MyTargetAdapter$InitState = iArr;
            try {
                iArr[InitState.INIT_STATE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$ironsource$adapters$mytarget$MyTargetAdapter$InitState[InitState.INIT_STATE_IN_PROGRESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$ironsource$adapters$mytarget$MyTargetAdapter$InitState[InitState.INIT_STATE_SUCCESS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public enum InitState {
        INIT_STATE_NONE,
        INIT_STATE_IN_PROGRESS,
        INIT_STATE_SUCCESS
    }

    private interface ResultListener {
        void onFail(IronSourceError ironSourceError);

        void onSuccess();
    }

    private MyTargetAdapter(String str) {
        super(str);
        this.SLOT_ID = BigoAdapter.SLOT_ID;
        this.IRONSOURCE_MEDIATION = "8";
        IronLog.INTERNAL.verbose();
        this.mRewardedVideoSlotIdToSmashListener = new ConcurrentHashMap<>();
        this.mRewardedVideoSlotIdToAd = new ConcurrentHashMap<>();
        this.mRewardedVideoAdsAvailability = new ConcurrentHashMap<>();
        this.mRewardedVideoSlotIdsForInitCallbacks = new CopyOnWriteArraySet<>();
        this.mInterstitialSlotIdToSmashListener = new ConcurrentHashMap<>();
        this.mInterstitialSlotIdToAd = new ConcurrentHashMap<>();
        this.mInterstitialAdsAvailability = new ConcurrentHashMap<>();
        this.mLWSSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    private void addCustomParams(BaseAd baseAd) {
        baseAd.getCustomParams().setCustomParam("mediation", "8");
    }

    private void debugModeCapability() {
        boolean zIsAdaptersDebugEnabled;
        try {
            zIsAdaptersDebugEnabled = isAdaptersDebugEnabled();
        } catch (NoSuchMethodError unused) {
            zIsAdaptersDebugEnabled = false;
        }
        MyTargetManager.setDebugMode(zIsAdaptersDebugEnabled);
    }

    public static String getAdapterSDKVersion() {
        return "5.27.4";
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
        }
        layoutParams.gravity = 17;
        return layoutParams;
    }

    private MyTargetView.AdSize getBannerSize(ISBannerSize iSBannerSize) {
        if (iSBannerSize == null) {
            IronLog.INTERNAL.verbose("Banner size is null");
            return null;
        }
        String description = iSBannerSize.getDescription();
        description.getClass();
        switch (description) {
            case "SMART":
                if (!AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext())) {
                    break;
                } else {
                    break;
                }
                break;
        }
        return null;
    }

    public static IntegrationData getIntegrationData(Context context) {
        return new IntegrationData(NETWORK_NAME, "5.2.0");
    }

    private void initInterstitialInternal(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String strOptString = jSONObject.optString(BigoAdapter.SLOT_ID);
        if (TextUtils.isEmpty(strOptString)) {
            IronLog.INTERNAL.error("error - missing param = slotId");
            interstitialSmashListener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("missing param - slotId", "Interstitial"));
            return;
        }
        int i10 = AnonymousClass4.$SwitchMap$com$ironsource$adapters$mytarget$MyTargetAdapter$InitState[mInitState.ordinal()];
        if (i10 == 1 || i10 == 2) {
            initSDK(strOptString);
        } else {
            if (i10 != 3) {
                return;
            }
            interstitialSmashListener.onInterstitialInitSuccess();
        }
    }

    private void initRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener, ResultListener resultListener) {
        String strOptString = jSONObject.optString(BigoAdapter.SLOT_ID);
        if (TextUtils.isEmpty(strOptString)) {
            IronLog.INTERNAL.error("error - missing param = slotId");
            rewardedVideoSmashListener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("missing param - slotId", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        IronLog.ADAPTER_API.verbose("slotId = " + strOptString);
        this.mRewardedVideoSlotIdToSmashListener.put(strOptString, rewardedVideoSmashListener);
        int i10 = AnonymousClass4.$SwitchMap$com$ironsource$adapters$mytarget$MyTargetAdapter$InitState[mInitState.ordinal()];
        if (i10 == 1 || i10 == 2) {
            initSDK(strOptString);
        } else {
            if (i10 != 3) {
                return;
            }
            rewardedVideoSmashListener.onRewardedVideoInitSuccess();
        }
    }

    private void initSDK(String str) {
        if (mInitState == InitState.INIT_STATE_NONE || mInitState == InitState.INIT_STATE_IN_PROGRESS) {
            initCallbackListeners.add(this);
        }
        if (mWasInitCalled.compareAndSet(false, true)) {
            IronLog.ADAPTER_API.verbose("slotId = " + str);
            mInitState = InitState.INIT_STATE_IN_PROGRESS;
            debugModeCapability();
            MyTargetManager.initSdk(ContextProvider.getInstance().getApplicationContext());
            initializationSuccess();
        }
    }

    private void initializationSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        mInitState = InitState.INIT_STATE_SUCCESS;
        Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackSuccess();
        }
        initCallbackListeners.clear();
    }

    private void loadInterstitialInternal(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener, String str) {
        String strOptString = jSONObject.optString(BigoAdapter.SLOT_ID);
        if (interstitialSmashListener == null) {
            IronLog.INTERNAL.error("listener is null");
            return;
        }
        if (TextUtils.isEmpty(strOptString)) {
            IronLog.INTERNAL.error("error - missing param = slotId");
            interstitialSmashListener.onInterstitialAdLoadFailed(ErrorBuilder.buildInitFailedError("Missing slotId", "Interstitial"));
            return;
        }
        IronLog.ADAPTER_API.verbose("slotId = " + strOptString);
        this.mInterstitialAdsAvailability.put(strOptString, Boolean.FALSE);
        try {
            InterstitialAd interstitialAd = new InterstitialAd(Integer.parseInt(strOptString), ContextProvider.getInstance().getApplicationContext());
            interstitialAd.setListener(new MyTargetInterstitialListener(this, interstitialSmashListener, strOptString));
            addCustomParams(interstitialAd);
            interstitialAd.loadFromBid(str);
        } catch (NumberFormatException unused) {
            IronLog.INTERNAL.error("error parsing placement");
            interstitialSmashListener.onInterstitialAdLoadFailed(ErrorBuilder.buildInitFailedError("error parsing placement", "Interstitial"));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void loadRewardedVideoInternal(String str, RewardedVideoSmashListener rewardedVideoSmashListener, String str2) {
        if (rewardedVideoSmashListener == null) {
            IronLog.INTERNAL.error("listener is null");
            return;
        }
        if (TextUtils.isEmpty(str)) {
            IronLog.INTERNAL.error("error - missing param = slotId");
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            return;
        }
        IronLog.ADAPTER_API.verbose("slotId = " + str);
        this.mRewardedVideoAdsAvailability.put(str, Boolean.FALSE);
        try {
            RewardedAd rewardedAd = new RewardedAd(Integer.parseInt(str), ContextProvider.getInstance().getApplicationContext());
            rewardedAd.setListener(new MyTargetRewardedVideoListener(this, rewardedVideoSmashListener, str));
            addCustomParams(rewardedAd);
            if (str2 != null) {
                rewardedAd.loadFromBid(str2);
            } else {
                rewardedAd.load();
            }
        } catch (NumberFormatException unused) {
            IronLog.INTERNAL.error("error parsing placement");
            rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
        }
    }

    public static MyTargetAdapter startAdapter(String str) {
        return new MyTargetAdapter(str);
    }

    private void validateParams(JSONObject jSONObject, String str, ResultListener resultListener) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose();
        if (!TextUtils.isEmpty(jSONObject.optString(BigoAdapter.SLOT_ID))) {
            resultListener.onSuccess();
        } else {
            ironLog.error("error - missing param = slotId");
            resultListener.onFail(ErrorBuilder.buildInitFailedError("missing param = slotId", str));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void collectBannerBiddingData(JSONObject jSONObject, JSONObject jSONObject2, @NonNull BiddingDataCallback biddingDataCallback) {
        collectBiddingData(biddingDataCallback);
    }

    public void collectBiddingData(BiddingDataCallback biddingDataCallback) {
        String bidderToken = MyTargetManager.getBidderToken(ContextProvider.getInstance().getApplicationContext());
        if (TextUtils.isEmpty(bidderToken)) {
            IronLog.INTERNAL.verbose("returning null as token since init hasn't started");
            biddingDataCallback.onFailure("returning null as token since init hasn't started - MyTarget");
            return;
        }
        IronLog.ADAPTER_API.verbose("token = " + bidderToken);
        Map<String, Object> map = new HashMap<>();
        map.put("token", bidderToken);
        biddingDataCallback.onSuccess(map);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void collectInterstitialBiddingData(JSONObject jSONObject, JSONObject jSONObject2, @NonNull BiddingDataCallback biddingDataCallback) {
        collectBiddingData(biddingDataCallback);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void collectRewardedVideoBiddingData(JSONObject jSONObject, JSONObject jSONObject2, @NonNull BiddingDataCallback biddingDataCallback) {
        collectBiddingData(biddingDataCallback);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void destroyBanner(JSONObject jSONObject) {
        AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.mytarget.MyTargetAdapter.3
            @Override // java.lang.Runnable
            public void run() {
                IronLog.ADAPTER_API.verbose();
                if (MyTargetAdapter.this.mBannerAdView != null) {
                    MyTargetAdapter.this.mBannerAdView.destroy();
                    MyTargetAdapter.this.mBannerAdView = null;
                }
            }
        });
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getCoreSDKVersion() {
        return getAdapterSDKVersion();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getVersion() {
        return "5.2.0";
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initAndLoadRewardedVideo(String str, String str2, final JSONObject jSONObject, JSONObject jSONObject2, final RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog.ADAPTER_API.verbose();
        initRewardedVideo(jSONObject, rewardedVideoSmashListener, new ResultListener() { // from class: com.ironsource.adapters.mytarget.MyTargetAdapter.2
            @Override // com.ironsource.adapters.mytarget.MyTargetAdapter.ResultListener
            public void onFail(IronSourceError ironSourceError) {
                rewardedVideoSmashListener.onRewardedVideoAvailabilityChanged(false);
            }

            @Override // com.ironsource.adapters.mytarget.MyTargetAdapter.ResultListener
            public void onSuccess() {
                MyTargetAdapter.this.loadRewardedVideoInternal(jSONObject.optString(BigoAdapter.SLOT_ID), rewardedVideoSmashListener, null);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBannerForBidding(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        IronLog.ADAPTER_API.verbose();
        String strOptString = jSONObject.optString(BigoAdapter.SLOT_ID);
        if (TextUtils.isEmpty(strOptString)) {
            IronLog.INTERNAL.error("error - missing param = slotId");
            bannerSmashListener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("missing param - slotId", "Banner"));
            return;
        }
        this.mBannerSmashListener = bannerSmashListener;
        int i10 = AnonymousClass4.$SwitchMap$com$ironsource$adapters$mytarget$MyTargetAdapter$InitState[mInitState.ordinal()];
        if (i10 == 1 || i10 == 2) {
            initSDK(strOptString);
        } else {
            if (i10 != 3) {
                return;
            }
            bannerSmashListener.onBannerInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        IronLog.ADAPTER_API.verbose();
        initInterstitialInternal(jSONObject, interstitialSmashListener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitialForBidding(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        IronLog.ADAPTER_API.verbose();
        initInterstitialInternal(jSONObject, interstitialSmashListener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, final RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog.ADAPTER_API.verbose();
        initRewardedVideo(jSONObject, rewardedVideoSmashListener, new ResultListener() { // from class: com.ironsource.adapters.mytarget.MyTargetAdapter.1
            @Override // com.ironsource.adapters.mytarget.MyTargetAdapter.ResultListener
            public void onFail(IronSourceError ironSourceError) {
                rewardedVideoSmashListener.onRewardedVideoInitFailed(ironSourceError);
            }

            @Override // com.ironsource.adapters.mytarget.MyTargetAdapter.ResultListener
            public void onSuccess() {
                rewardedVideoSmashListener.onRewardedVideoInitSuccess();
            }
        });
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public boolean isInterstitialReady(JSONObject jSONObject) {
        String strOptString = jSONObject.optString(BigoAdapter.SLOT_ID);
        return this.mInterstitialAdsAvailability.containsKey(strOptString) && this.mInterstitialAdsAvailability.get(strOptString).booleanValue();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        String strOptString = jSONObject.optString(BigoAdapter.SLOT_ID);
        return this.mRewardedVideoAdsAvailability.containsKey(strOptString) && this.mRewardedVideoAdsAvailability.get(strOptString).booleanValue();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public boolean isUsingActivityBeforeImpression(@NotNull LevelPlay.AdFormat adFormat) {
        return false;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, ISBannerSize iSBannerSize, BannerSmashListener bannerSmashListener) {
        String strOptString = jSONObject.optString(BigoAdapter.SLOT_ID);
        IronLog.ADAPTER_API.verbose("slotId = " + strOptString);
        if (iSBannerSize == null) {
            IronLog.INTERNAL.error("banner size is null");
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getProviderName()));
            return;
        }
        try {
            int i10 = Integer.parseInt(strOptString);
            MyTargetView.AdSize bannerSize = getBannerSize(iSBannerSize);
            if (bannerSize == null) {
                bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getProviderName()));
                return;
            }
            if (str != null && !str.isEmpty()) {
                MyTargetView myTargetView = new MyTargetView(ContextProvider.getInstance().getApplicationContext());
                this.mBannerAdView = myTargetView;
                myTargetView.setSlotId(i10);
                this.mBannerAdView.setAdSize(bannerSize);
                MyTargetBannerListener myTargetBannerListener = new MyTargetBannerListener(this, bannerSmashListener, strOptString, getBannerLayoutParams(iSBannerSize));
                this.mAdListener = myTargetBannerListener;
                this.mBannerAdView.setListener(myTargetBannerListener);
                this.mBannerAdView.loadFromBid(str);
                return;
            }
            IronLog.INTERNAL.error("serverData is empty");
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("serverData is empty"));
        } catch (NumberFormatException unused) {
            IronLog.INTERNAL.error("error parsing placement");
            bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildInitFailedError("error parsing placement", "Interstitial"));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitialForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, InterstitialSmashListener interstitialSmashListener) {
        IronLog.ADAPTER_API.verbose();
        loadInterstitialInternal(jSONObject, interstitialSmashListener, str);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideo(JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog.ADAPTER_API.verbose();
        loadRewardedVideoInternal(jSONObject.optString(BigoAdapter.SLOT_ID), rewardedVideoSmashListener, null);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, RewardedVideoSmashListener rewardedVideoSmashListener) {
        IronLog.ADAPTER_API.verbose();
        loadRewardedVideoInternal(jSONObject.optString(BigoAdapter.SLOT_ID), rewardedVideoSmashListener, str);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        for (String str : this.mRewardedVideoSlotIdToSmashListener.keySet()) {
            RewardedVideoSmashListener rewardedVideoSmashListener = this.mRewardedVideoSlotIdToSmashListener.get(str);
            if (this.mRewardedVideoSlotIdsForInitCallbacks.contains(str)) {
                rewardedVideoSmashListener.onRewardedVideoInitSuccess();
            } else {
                loadRewardedVideoInternal(str, rewardedVideoSmashListener, null);
            }
        }
        Iterator<InterstitialSmashListener> it = this.mInterstitialSlotIdToSmashListener.values().iterator();
        while (it.hasNext()) {
            it.next().onInterstitialInitSuccess();
        }
        BannerSmashListener bannerSmashListener = this.mBannerSmashListener;
        if (bannerSmashListener != null) {
            bannerSmashListener.onBannerInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    protected void setConsent(boolean z10) {
        IronLog.ADAPTER_API.verbose("setConsent=" + z10);
        MyTargetPrivacy.setUserConsent(z10);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String strOptString = jSONObject.optString(BigoAdapter.SLOT_ID);
        if (TextUtils.isEmpty(strOptString)) {
            IronLog.INTERNAL.error("error - missing param = slotId");
            interstitialSmashListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError("Interstitial", "MyTarget - show failed placement is empty"));
            return;
        }
        IronLog.ADAPTER_API.verbose("slotId = " + strOptString);
        InterstitialAd interstitialAd = this.mInterstitialSlotIdToAd.get(strOptString);
        if (interstitialAd == null || !isInterstitialReady(jSONObject)) {
            interstitialSmashListener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError("Interstitial", "MyTarget - show failed no ad for placement = " + strOptString));
        } else {
            interstitialAd.show();
        }
        this.mInterstitialAdsAvailability.put(strOptString, Boolean.FALSE);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String strOptString = jSONObject.optString(BigoAdapter.SLOT_ID);
        if (TextUtils.isEmpty(strOptString)) {
            IronLog.INTERNAL.error("error - missing param = slotId");
            rewardedVideoSmashListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, "MyTarget - show failed placement is empty"));
            return;
        }
        IronLog.ADAPTER_API.verbose("slotId = " + strOptString);
        RewardedAd rewardedAd = this.mRewardedVideoSlotIdToAd.get(strOptString);
        if (rewardedAd == null || !isRewardedVideoAvailable(jSONObject)) {
            rewardedVideoSmashListener.onRewardedVideoAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, "MyTarget - show failed no ad for placement = " + strOptString));
        } else {
            rewardedAd.show();
        }
        this.mRewardedVideoAdsAvailability.put(strOptString, Boolean.FALSE);
    }
}
