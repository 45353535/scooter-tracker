package com.ironsource.adapters.ironsource;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.A5;
import com.ironsource.C4270d0;
import com.ironsource.C4312f8;
import com.ironsource.C4400kc;
import com.ironsource.C4417lc;
import com.ironsource.C4462o4;
import com.ironsource.C4516r8;
import com.ironsource.C4649z5;
import com.ironsource.Ib;
import com.ironsource.Jc;
import com.ironsource.L9;
import com.ironsource.M8;
import com.ironsource.M9;
import com.ironsource.adapters.ironsource.IronSourceLoadParameters;
import com.ironsource.adapters.ironsource.nativeAd.IronSourceNativeAdAdapter;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyBannerLayout;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.r;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import com.ironsource.sdk.IronSourceNetwork;
import com.ironsource.sdk.utils.SDKUtils;
import com.unity3d.mediation.LevelPlay;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public class IronSourceAdapter extends AbstractAdapter implements ContextProvider.a {
    public static final String IRONSOURCE_BIDDING_TOKEN_KEY = "token";
    public static final String IRONSOURCE_ONE_FLOW_KEY = "isOneFlow";
    private static final int IS_LOAD_EXCEPTION = 1000;
    private static final int IS_SHOW_EXCEPTION = 1001;
    private static final int RV_LOAD_EXCEPTION = 1002;
    private static final int RV_SHOW_EXCEPTION = 1003;
    private static final String VERSION = "9.1.0";
    public final String ADM_KEY;
    private final String DEMAND_SOURCE_NAME;
    private final String DYNAMIC_CONTROLLER_CONFIG;
    private final String DYNAMIC_CONTROLLER_DEBUG_MODE;
    private final String DYNAMIC_CONTROLLER_URL;
    private final String LWS_SUPPORT_STATE;
    private final String SDK_PLUGIN_TYPE;
    private final String SESSION_ID;
    private long initDuration;
    ConcurrentHashMap<String, ArrayList<L9>> mDemandSourceToBnAd;
    ConcurrentHashMap<String, L9> mDemandSourceToISAd;
    ConcurrentHashMap<String, L9> mDemandSourceToRvAd;
    private final C4417lc mNetworkGlobalDataWriter;
    private final M8 sessionDepthService;
    private static AtomicBoolean mDidInitSdk = new AtomicBoolean(false);
    private static C4270d0 mBaseAdPlayerExtraParams = new C4270d0();

    private IronSourceAdapter(String str) {
        super(str);
        this.DYNAMIC_CONTROLLER_URL = "controllerUrl";
        this.DYNAMIC_CONTROLLER_DEBUG_MODE = "debugMode";
        this.DYNAMIC_CONTROLLER_CONFIG = "controllerConfig";
        this.SESSION_ID = "sessionid";
        this.SDK_PLUGIN_TYPE = C4400kc.a.f43469b;
        this.ADM_KEY = "adm";
        this.DEMAND_SOURCE_NAME = "demandSourceName";
        this.LWS_SUPPORT_STATE = "isSupportedLWS";
        this.mNetworkGlobalDataWriter = new C4417lc();
        this.initDuration = 0L;
        this.sessionDepthService = Ib.U().s();
        this.mDemandSourceToRvAd = new ConcurrentHashMap<>();
        this.mDemandSourceToISAd = new ConcurrentHashMap<>();
        this.mDemandSourceToBnAd = new ConcurrentHashMap<>();
        setNativeAdAdapter(new IronSourceNativeAdAdapter(this));
        ContextProvider.getInstance().registerLifeCycleListener(this);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005c A[PHI: r4
  0x005c: PHI (r4v5 int) = (r4v0 int), (r4v3 int) binds: [B:25:0x004d, B:36:0x0066] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.ironsource.C4312f8 convertBannerSize(android.content.Context r8, com.ironsource.mediationsdk.ISBannerSize r9) {
        /*
            r7 = this;
            java.lang.String r0 = r9.getDescription()
            r0.getClass()
            r1 = 0
            r2 = 90
            r3 = 50
            r4 = 320(0x140, float:4.48E-43)
            r5 = -1
            int r6 = r0.hashCode()
            switch(r6) {
                case -387072689: goto L43;
                case 72205083: goto L38;
                case 79011241: goto L2d;
                case 1951953708: goto L22;
                case 1999208305: goto L17;
                default: goto L16;
            }
        L16:
            goto L4d
        L17:
            java.lang.String r6 = "CUSTOM"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L20
            goto L4d
        L20:
            r5 = 4
            goto L4d
        L22:
            java.lang.String r6 = "BANNER"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L2b
            goto L4d
        L2b:
            r5 = 3
            goto L4d
        L2d:
            java.lang.String r6 = "SMART"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L36
            goto L4d
        L36:
            r5 = 2
            goto L4d
        L38:
            java.lang.String r6 = "LARGE"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L41
            goto L4d
        L41:
            r5 = 1
            goto L4d
        L43:
            java.lang.String r6 = "RECTANGLE"
            boolean r6 = r0.equals(r6)
            if (r6 != 0) goto L4c
            goto L4d
        L4c:
            r5 = 0
        L4d:
            switch(r5) {
                case 0: goto L69;
                case 1: goto L6d;
                case 2: goto L5e;
                case 3: goto L5c;
                case 4: goto L51;
                default: goto L50;
            }
        L50:
            return r1
        L51:
            int r9 = r9.getHeight()
            if (r9 == r3) goto L5a
            if (r9 == r2) goto L5a
            return r1
        L5a:
            r2 = r9
            goto L6d
        L5c:
            r2 = r3
            goto L6d
        L5e:
            boolean r9 = com.ironsource.mediationsdk.AdapterUtils.isLargeScreen(r8)
            if (r9 == 0) goto L66
            r4 = 728(0x2d8, float:1.02E-42)
        L66:
            if (r9 == 0) goto L5c
            goto L6d
        L69:
            r4 = 300(0x12c, float:4.2E-43)
            r2 = 250(0xfa, float:3.5E-43)
        L6d:
            int r9 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r8, r4)
            int r8 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r8, r2)
            com.ironsource.f8 r1 = new com.ironsource.f8
            r1.<init>(r9, r8, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adapters.ironsource.IronSourceAdapter.convertBannerSize(android.content.Context, com.ironsource.mediationsdk.ISBannerSize):com.ironsource.f8");
    }

    private L9 createBannerAdInstance(String str, C4312f8 c4312f8, JSONObject jSONObject, LoadAdData loadAdData, BannerSmashListener bannerSmashListener) {
        IronLog.ADAPTER_API.verbose("creating banner ad instance for " + str);
        return new M9(str, new IronSourceBannerListener(this, bannerSmashListener, str)).a(mBaseAdPlayerExtraParams.a()).a(jSONObject.optInt("instanceType", 2) == 2).c(jSONObject.optBoolean("isOneFlow")).a(c4312f8).b(loadAdData.isMultipleAdObjectsFlow()).b(loadAdData.adUnitId()).a();
    }

    private L9 createInterstitialAdInstance(String str, JSONObject jSONObject, LoadAdData loadAdData, InterstitialSmashListener interstitialSmashListener) {
        boolean zOptBoolean = jSONObject.optBoolean("isOneFlow");
        boolean z10 = jSONObject.optInt("instanceType", 2) == 2;
        IronLog.ADAPTER_API.verbose("creating ad instance for " + str + " isBidder=" + z10);
        return new M9(str, new IronSourceInterstitialListener(interstitialSmashListener, str)).a(mBaseAdPlayerExtraParams.a()).c(zOptBoolean).a(z10).b(loadAdData.isMultipleAdObjectsFlow()).b(loadAdData.adUnitId()).a();
    }

    private L9 createRewardedVideoAdInstance(String str, boolean z10, JSONObject jSONObject, LoadAdData loadAdData, RewardedVideoSmashListener rewardedVideoSmashListener) {
        boolean zOptBoolean = jSONObject.optBoolean("isOneFlow");
        boolean z11 = jSONObject.optInt("instanceType", 2) == 2;
        IronLog.ADAPTER_API.verbose("creating ad instance for " + str + " isDemandOnly=" + z10 + " isBidder=" + z11);
        return new M9(str, new IronSourceRewardedVideoListener(rewardedVideoSmashListener, str, z10)).a(mBaseAdPlayerExtraParams.a()).c().c(zOptBoolean).b(loadAdData.isMultipleAdObjectsFlow()).a(z11).b(loadAdData.adUnitId()).a();
    }

    public static String getAdapterSDKVersion() {
        return SDKUtils.getSDKVersion();
    }

    public static IntegrationData getIntegrationData(Context context) {
        return new IntegrationData("IronSource", "9.1.0");
    }

    private void initInterstitialInternal(String str, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener, String str2) {
        initSDK(str, jSONObject);
        interstitialSmashListener.onInterstitialInitSuccess();
    }

    private void initRewardedVideoInternal(String str, JSONObject jSONObject) {
        initSDK(str, jSONObject);
    }

    private boolean isMultipleAdObjectsFlow(JSONObject jSONObject) {
        if (jSONObject == null) {
            return false;
        }
        return jSONObject.optBoolean("isMultipleAdUnits", false);
    }

    private void loadBannerInternal(Activity activity, ISBannerSize iSBannerSize, JSONObject jSONObject, BannerSmashListener bannerSmashListener, String str, LoadAdData loadAdData) {
        BannerSmashListener bannerSmashListener2;
        Exception exc;
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            C4312f8 c4312f8ConvertBannerSize = convertBannerSize(ContextProvider.getInstance().getApplicationContext(), iSBannerSize);
            if (c4312f8ConvertBannerSize == null) {
                try {
                    bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getProviderName()));
                    return;
                } catch (Exception e10) {
                    exc = e10;
                    bannerSmashListener2 = bannerSmashListener;
                }
            } else {
                bannerSmashListener2 = bannerSmashListener;
                try {
                    IronSourceNetwork.loadAdView(activity, createBannerAdInstance(demandSourceName, c4312f8ConvertBannerSize, jSONObject, loadAdData, bannerSmashListener2), new IronSourceLoadParameters.WithLog(new IronSourceLoadParameters.Base(jSONObject, str)).value());
                    return;
                } catch (Exception e11) {
                    e = e11;
                }
            }
        } catch (Exception e12) {
            e = e12;
            bannerSmashListener2 = bannerSmashListener;
        }
        exc = e;
        C4462o4.d().a(exc);
        bannerSmashListener2.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - " + exc.getMessage()));
    }

    private void loadInterstitialAdInternal(String str, String str2, JSONObject jSONObject, LoadAdData loadAdData, InterstitialSmashListener interstitialSmashListener) throws Exception {
        IronSourceLoadParameters.WithLog withLog = new IronSourceLoadParameters.WithLog(new IronSourceLoadParameters.Base(jSONObject, str2));
        L9 l9CreateInterstitialAdInstance = this.mDemandSourceToISAd.get(str);
        if (l9CreateInterstitialAdInstance == null) {
            l9CreateInterstitialAdInstance = createInterstitialAdInstance(str, jSONObject, loadAdData, interstitialSmashListener);
            this.mDemandSourceToISAd.put(str, l9CreateInterstitialAdInstance);
        }
        IronSourceNetwork.loadAd(l9CreateInterstitialAdInstance, withLog.value());
    }

    private void loadRewardedVideoAdInternal(JSONObject jSONObject, String str, String str2, LoadAdData loadAdData, RewardedVideoSmashListener rewardedVideoSmashListener) throws Exception {
        IronSourceLoadParameters.WithLog withLog = new IronSourceLoadParameters.WithLog(new IronSourceLoadParameters.Base(jSONObject, str2));
        L9 l9CreateRewardedVideoAdInstance = this.mDemandSourceToRvAd.get(str);
        if (l9CreateRewardedVideoAdInstance == null) {
            l9CreateRewardedVideoAdInstance = createRewardedVideoAdInstance(str, withLog.demandOnly(), jSONObject, loadAdData, rewardedVideoSmashListener);
            this.mDemandSourceToRvAd.put(str, l9CreateRewardedVideoAdInstance);
        }
        IronSourceNetwork.loadAd(l9CreateRewardedVideoAdInstance, withLog.value());
    }

    private void showAdInternal(L9 l92, IronSource.a aVar) throws Exception {
        int iA = this.sessionDepthService.a(aVar);
        HashMap map = new HashMap();
        map.put("sessionDepth", String.valueOf(iA));
        IronLog.ADAPTER_API.verbose("demandSourceName=" + l92.g() + " showParams=" + map);
        IronSourceNetwork.showAd(ContextProvider.getInstance().getCurrentActiveActivity(), l92, map);
    }

    public static IronSourceAdapter startAdapter(String str) {
        return new IronSourceAdapter(str);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void destroyBanner(JSONObject jSONObject) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose(demandSourceName + ": destroyBanner()");
        ArrayList<L9> arrayList = this.mDemandSourceToBnAd.get(demandSourceName);
        if (arrayList != null) {
            try {
                Iterator<L9> it = arrayList.iterator();
                while (it.hasNext()) {
                    IronSourceNetwork.destroyAd(it.next());
                }
                this.mDemandSourceToBnAd.remove(demandSourceName);
            } catch (Exception e10) {
                C4462o4.d().a(e10);
                IronLog.ADAPTER_API.verbose("destroyBanner failed: " + e10.getMessage());
            }
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public void earlyInit(String str, String str2, JSONObject jSONObject) {
        if (r.m().n() == null) {
            IronLog.ADAPTER_API.error("Appkey is null for early init");
            return;
        }
        IronSourceUtils.i(getDemandSourceName(jSONObject) + ": earlyInit");
        initSDK(r.m().n(), jSONObject);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public Map<String, Object> getBannerBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return new HashMap();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getCoreSDKVersion() {
        return SDKUtils.getSDKVersion();
    }

    public String getDemandSourceName(JSONObject jSONObject) {
        return !TextUtils.isEmpty(jSONObject.optString("demandSourceName")) ? jSONObject.optString("demandSourceName") : getProviderName();
    }

    public HashMap<String, String> getInitParams() {
        HashMap<String, String> map = new HashMap<>();
        String pluginType = getPluginType();
        if (!TextUtils.isEmpty(pluginType)) {
            map.put(C4400kc.a.f43469b, pluginType);
        }
        if (!TextUtils.isEmpty(r.m().t())) {
            map.put("sessionid", r.m().t());
        }
        return map;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public Map<String, Object> getInterstitialBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return new HashMap();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public LoadWhileShowSupportState getLoadWhileShowSupportState(JSONObject jSONObject) {
        return (jSONObject == null || !jSONObject.optBoolean("isSupportedLWS")) ? this.mLWSSupportState : LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public Map<String, Object> getRewardedVideoBiddingData(JSONObject jSONObject, JSONObject jSONObject2) {
        return new HashMap();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public String getVersion() {
        return "9.1.0";
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initAndLoadRewardedVideo(String str, String str2, JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initRewardedVideoInternal(str, jSONObject);
        loadRewardedVideo(jSONObject, jSONObject2, rewardedVideoSmashListener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBannerForBidding(String str, String str2, JSONObject jSONObject, BannerSmashListener bannerSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        initSDK(str, jSONObject);
        bannerSmashListener.onBannerInitSuccess();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitial(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initInterstitialInternal(str, jSONObject, interstitialSmashListener, demandSourceName);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitialForBidding(String str, String str2, JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initInterstitialInternal(str, jSONObject, interstitialSmashListener, demandSourceName);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoForDemandOnly(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initRewardedVideoInternal(str, jSONObject);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(String str, String str2, JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.INTERNAL.verbose("demandSourceName: " + demandSourceName);
        initRewardedVideoInternal(str, jSONObject);
        rewardedVideoSmashListener.onRewardedVideoInitSuccess();
    }

    public void initSDK(String str, JSONObject jSONObject) {
        if (mDidInitSdk.compareAndSet(false, true)) {
            String strC = IronSourceUtils.c();
            int iOptInt = jSONObject.optInt("debugMode", 0);
            if (isAdaptersDebugEnabled()) {
                iOptInt = 3;
            }
            IronLog ironLog = IronLog.ADAPTER_API;
            ironLog.verbose("setting debug mode to " + iOptInt);
            SDKUtils.setDebugMode(iOptInt);
            SDKUtils.setControllerUrl(jSONObject.optString("controllerUrl"));
            ironLog.verbose("IronSourceNetwork setting controller url to " + jSONObject.optString("controllerUrl"));
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("controllerConfig");
            String string = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : "";
            SDKUtils.setControllerConfig(string);
            ironLog.verbose("IronSourceNetwork setting controller config to " + string);
            HashMap<String, String> initParams = getInitParams();
            mBaseAdPlayerExtraParams.a(initParams);
            String strN = r.m().n();
            ironLog.verbose("with appKey=" + strN + " userId=" + strC + " parameters " + initParams);
            IronSourceNetwork.addInitListener(new Jc() { // from class: com.ironsource.adapters.ironsource.IronSourceAdapter.1
                @Override // com.ironsource.Jc
                public void onFail(C4516r8 c4516r8) {
                    IronLog.ADAPTER_API.verbose("OnNetworkSDKInitListener fail - code:" + c4516r8.a() + " message:" + c4516r8.b());
                    try {
                        IronSourceAdapter.this.initDuration = System.currentTimeMillis() - IronSourceAdapter.this.initDuration;
                        Ib.U().q().a(new C4649z5(A5.IADS_INIT_FAIL, new JSONObject().put("reason", c4516r8.b()).put("duration", IronSourceAdapter.this.initDuration)));
                    } catch (Exception e10) {
                        IronLog.INTERNAL.error(e10.getMessage());
                    }
                }

                @Override // com.ironsource.Jc
                public void onSuccess() {
                    IronLog.ADAPTER_API.verbose("OnNetworkSDKInitListener success");
                    try {
                        IronSourceAdapter.this.initDuration = System.currentTimeMillis() - IronSourceAdapter.this.initDuration;
                        Ib.U().q().a(new C4649z5(A5.IADS_INIT_SUCCESS, new JSONObject().put("duration", IronSourceAdapter.this.initDuration)));
                    } catch (Exception unused) {
                    }
                }
            });
            try {
                this.initDuration = System.currentTimeMillis();
                Ib.U().q().a(new C4649z5(A5.IADS_INIT, new JSONObject()));
            } catch (Exception unused) {
            }
            IronSourceNetwork.initSDK(ContextProvider.getInstance().getApplicationContext(), strN, strC, initParams);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public boolean isInterstitialReady(JSONObject jSONObject) {
        L9 l92 = this.mDemandSourceToISAd.get(getDemandSourceName(jSONObject));
        return l92 != null && IronSourceNetwork.isAdAvailableForInstance(l92);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(JSONObject jSONObject) {
        L9 l92 = this.mDemandSourceToRvAd.get(getDemandSourceName(jSONObject));
        return l92 != null && IronSourceNetwork.isAdAvailableForInstance(l92);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public boolean isUsingActivityBeforeImpression(@NotNull LevelPlay.AdFormat adFormat) {
        return false;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, ISBannerSize iSBannerSize, BannerSmashListener bannerSmashListener) {
        if (iSBannerSize != null) {
            loadBannerInternal(ContextProvider.getInstance().getCurrentActiveActivity(), iSBannerSize, jSONObject, bannerSmashListener, str, new LoadAdData(jSONObject2));
            return;
        }
        bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - banner size is null"));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForDemandOnlyForBidding(JSONObject jSONObject, String str, ISDemandOnlyBannerLayout iSDemandOnlyBannerLayout, BannerSmashListener bannerSmashListener) {
        if (iSDemandOnlyBannerLayout != null) {
            loadBannerInternal(iSDemandOnlyBannerLayout.getActivity(), iSDemandOnlyBannerLayout.getSize(), jSONObject, bannerSmashListener, str, new LoadAdData());
            return;
        }
        bannerSmashListener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Banner Load Fail, " + getProviderName() + " - banner is null"));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitial(JSONObject jSONObject, JSONObject jSONObject2, InterstitialSmashListener interstitialSmashListener) {
        InterstitialSmashListener interstitialSmashListener2;
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            interstitialSmashListener2 = interstitialSmashListener;
            try {
                loadInterstitialAdInternal(demandSourceName, null, jSONObject, new LoadAdData(jSONObject2), interstitialSmashListener2);
            } catch (Exception e10) {
                e = e10;
                Exception exc = e;
                C4462o4.d().a(exc);
                IronLog.ADAPTER_API.error("exception " + exc.getMessage());
                interstitialSmashListener2.onInterstitialAdLoadFailed(new IronSourceError(1000, exc.getMessage()));
            }
        } catch (Exception e11) {
            e = e11;
            interstitialSmashListener2 = interstitialSmashListener;
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitialForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, InterstitialSmashListener interstitialSmashListener) {
        InterstitialSmashListener interstitialSmashListener2;
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            interstitialSmashListener2 = interstitialSmashListener;
            try {
                loadInterstitialAdInternal(demandSourceName, str, jSONObject, new LoadAdData(jSONObject2), interstitialSmashListener2);
            } catch (Exception e10) {
                e = e10;
                Exception exc = e;
                C4462o4.d().a(exc);
                IronLog.ADAPTER_API.error("for bidding exception " + exc.getMessage());
                interstitialSmashListener2.onInterstitialAdLoadFailed(new IronSourceError(1000, exc.getMessage()));
            }
        } catch (Exception e11) {
            e = e11;
            interstitialSmashListener2 = interstitialSmashListener;
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideo(JSONObject jSONObject, JSONObject jSONObject2, RewardedVideoSmashListener rewardedVideoSmashListener) {
        RewardedVideoSmashListener rewardedVideoSmashListener2;
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            rewardedVideoSmashListener2 = rewardedVideoSmashListener;
            try {
                loadRewardedVideoAdInternal(jSONObject, demandSourceName, null, new LoadAdData(jSONObject2), rewardedVideoSmashListener2);
            } catch (Exception e10) {
                e = e10;
                Exception exc = e;
                C4462o4.d().a(exc);
                IronLog.ADAPTER_API.error("exception " + exc.getMessage());
                rewardedVideoSmashListener2.onRewardedVideoAvailabilityChanged(false);
                rewardedVideoSmashListener2.onRewardedVideoLoadFailed(new IronSourceError(1002, exc.getMessage()));
            }
        } catch (Exception e11) {
            e = e11;
            rewardedVideoSmashListener2 = rewardedVideoSmashListener;
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(JSONObject jSONObject, JSONObject jSONObject2, String str, RewardedVideoSmashListener rewardedVideoSmashListener) {
        RewardedVideoSmashListener rewardedVideoSmashListener2;
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            rewardedVideoSmashListener2 = rewardedVideoSmashListener;
            try {
                loadRewardedVideoAdInternal(jSONObject, demandSourceName, str, new LoadAdData(jSONObject2), rewardedVideoSmashListener2);
            } catch (Exception e10) {
                e = e10;
                Exception exc = e;
                C4462o4.d().a(exc);
                IronLog.ADAPTER_API.error("exception " + exc.getMessage());
                rewardedVideoSmashListener2.onRewardedVideoAvailabilityChanged(false);
                rewardedVideoSmashListener2.onRewardedVideoLoadFailed(new IronSourceError(1002, exc.getMessage()));
            }
        } catch (Exception e11) {
            e = e11;
            rewardedVideoSmashListener2 = rewardedVideoSmashListener;
        }
    }

    @Override // com.ironsource.environment.ContextProvider.a
    public void onPause(Activity activity) {
        IronLog.ADAPTER_API.verbose("IronSourceNetwork.onPause");
        IronSourceNetwork.onPause(activity);
    }

    @Override // com.ironsource.environment.ContextProvider.a
    public void onResume(Activity activity) {
        IronLog.ADAPTER_API.verbose("IronSourceNetwork.onResume");
        IronSourceNetwork.onResume(activity);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    protected void setConsent(boolean z10) {
        IronLog ironLog = IronLog.ADAPTER_API;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(");
        sb2.append(z10 ? "true" : "false");
        sb2.append(")");
        ironLog.verbose(sb2.toString());
        this.mNetworkGlobalDataWriter.a(z10);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    protected void setMetaData(String str, List<String> list) {
        if (list.isEmpty()) {
            return;
        }
        mBaseAdPlayerExtraParams.b(str, list.get(0));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void showInterstitial(JSONObject jSONObject, InterstitialSmashListener interstitialSmashListener) {
        String demandSourceName = getDemandSourceName(jSONObject);
        IronLog.ADAPTER_API.verbose("demandSourceName: " + demandSourceName);
        try {
            showAdInternal(this.mDemandSourceToISAd.get(demandSourceName), IronSource.a.INTERSTITIAL);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.ADAPTER_API.error("exception " + e10.getMessage());
            interstitialSmashListener.onInterstitialAdShowFailed(new IronSourceError(1001, e10.getMessage()));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(JSONObject jSONObject, RewardedVideoSmashListener rewardedVideoSmashListener) {
        try {
            showAdInternal(this.mDemandSourceToRvAd.get(getDemandSourceName(jSONObject)), IronSource.a.REWARDED_VIDEO);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.ADAPTER_API.error("exception " + e10.getMessage());
            rewardedVideoSmashListener.onRewardedVideoAdShowFailed(new IronSourceError(1003, e10.getMessage()));
        }
    }
}
