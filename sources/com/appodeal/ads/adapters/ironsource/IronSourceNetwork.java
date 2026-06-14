package com.appodeal.ads.adapters.ironsource;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkInitializationListener;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.ironsource.mediationsdk.IronSource;
import com.ironsource.mediationsdk.demandOnly.ISDemandOnlyInterstitialListener;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.ironsourceads.InitRequest;
import com.unity3d.ironsourceads.IronSourceAds;
import com.unity3d.ironsourceads.LogLevel;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class IronSourceNetwork extends AdNetwork<f, e> {
    private static final String DEFAULT_INSTANCE = "0";
    private static final AtomicBoolean isInitialized = new AtomicBoolean(false);
    private static final Map<String, ISDemandOnlyInterstitialListener> interstitialListeners = new HashMap();
    private static final Queue<String> instancesList = new LinkedList();
    private static boolean instanceInProgress = false;

    public static class builder extends AdNetworkBuilder {
        public builder() {
            super("ironsource", "0");
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NonNull
        public List<String> getAdActivities() {
            return new d();
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NonNull
        public IronSourceNetwork build() {
            return new IronSourceNetwork(this);
        }
    }

    public static boolean canLoadInstance(@NonNull String str) {
        return !instanceInProgress && str.equals(instancesList.peek());
    }

    public static boolean isInstanceInProgress() {
        return instanceInProgress;
    }

    public static LoadingError mapError(int i10) {
        if (i10 != 501) {
            if (i10 == 520) {
                return LoadingError.ConnectionError;
            }
            if (i10 != 1037 && i10 != 505 && i10 != 506) {
                switch (i10) {
                    case 508:
                        break;
                    case 509:
                    case 510:
                        return LoadingError.NoFill;
                    default:
                        return null;
                }
            }
        }
        return LoadingError.InternalError;
    }

    public static void prepareInstance() {
        instanceInProgress = false;
        instancesList.poll();
    }

    public static void registerInterstitialInstances(@Nullable JSONArray jSONArray) {
        if (instancesList.isEmpty()) {
            if (jSONArray == null || jSONArray.length() == 0) {
                jSONArray = new JSONArray();
                jSONArray.put("0");
            }
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                instancesList.add(jSONArray.optString(i10));
            }
        }
    }

    public static void setInProgressInstance(boolean z10) {
        instanceInProgress = z10;
    }

    private void setMediatorName(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        IronSource.setMediationType(str);
    }

    public static void subscribeInterstitialListener(String str, ISDemandOnlyInterstitialListener iSDemandOnlyInterstitialListener) {
        interstitialListeners.put(str, iSDemandOnlyInterstitialListener);
    }

    public static void unsubscribeInterstitialListener(String str) {
        interstitialListeners.remove(str);
    }

    private void updateConsent(@NonNull RestrictedData restrictedData) {
        if (restrictedData.isUserInGdprScope()) {
            IronSourceAds.setConsent(restrictedData.isUserHasConsent());
        }
        if (restrictedData.isUserInCcpaScope()) {
            IronSourceAds.setMetaData("do_not_sell", String.valueOf(!restrictedData.isUserHasConsent()));
        }
        IronSourceAds.setMetaData("is_child_directed", String.valueOf(restrictedData.isUserAgeRestricted()));
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedInterstitial<e> createInterstitial() {
        return new com.appodeal.ads.adapters.ironsource.interstitial.a();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedRewarded<e> createRewarded() {
        return new com.appodeal.ads.adapters.ironsource.rewarded_video.a();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NonNull
    public String getRecommendedVersion() {
        return "9.1.0";
    }

    @Override // com.appodeal.ads.AdNetwork
    @NonNull
    public String getVersion() {
        return IronSourceAds.getSdkVersion();
    }

    @Override // com.appodeal.ads.AdNetwork
    public void initialize(@NonNull ContextProvider contextProvider, @NonNull f fVar, @NonNull AdNetworkMediationParams adNetworkMediationParams, @NonNull AdNetworkInitializationListener adNetworkInitializationListener) {
        String str = fVar.f12369a;
        updateConsent(adNetworkMediationParams.getRestrictedData());
        setMediatorName(fVar.f12370b);
        if (isInitialized.get()) {
            adNetworkInitializationListener.onInitializationFinished();
            return;
        }
        IronSource.setISDemandOnlyInterstitialListener(new c());
        IronSourceAds.enableDebugMode(adNetworkMediationParams.isTestMode());
        IronSourceAds.init(contextProvider.getApplicationContext(), new InitRequest.Builder(str).withLogLevel(LogLevel.VERBOSE).withLegacyAdFormats(Arrays.asList(IronSourceAds.AdFormat.INTERSTITIAL, IronSourceAds.AdFormat.REWARDED)).build(), new b(adNetworkInitializationListener));
    }

    @Override // com.appodeal.ads.AdNetwork
    public boolean isInitialized() {
        return isInitialized.get();
    }

    @Override // com.appodeal.ads.AdNetwork
    public LoadingError verifyLoadAvailability(@NonNull AdType adType) {
        return (adType == AdType.Interstitial && getIsInterstitialShowing()) ? LoadingError.Canceled : (adType == AdType.Rewarded && getIsRewardedShowing()) ? LoadingError.Canceled : super.verifyLoadAvailability(adType);
    }

    private IronSourceNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
    }

    @Override // com.appodeal.ads.AdNetwork
    @NonNull
    public e getAdUnitParams(@NonNull ContextProvider contextProvider, @NonNull AdUnit adUnit, @NonNull AdNetworkMediationParams adNetworkMediationParams) {
        String strOptString = adUnit.getJsonData().optString("instance_id", "0");
        JSONArray jSONArrayOptJSONArray = adUnit.getJsonData().optJSONArray(com.ironsource.mediationsdk.d.f43822k);
        updateConsent(adNetworkMediationParams.getRestrictedData());
        setMediatorName(adUnit.getMediatorName());
        return new e(strOptString, jSONArrayOptJSONArray);
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public f getInitializeParams(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new f(jSONObject.getString(MBridgeConstans.APP_KEY), jSONObject.optString("mediator"));
    }
}
