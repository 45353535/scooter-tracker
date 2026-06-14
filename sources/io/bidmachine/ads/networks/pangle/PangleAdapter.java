package io.bidmachine.ads.networks.pangle;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import io.bidmachine.AdsType;
import io.bidmachine.BidMachine;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import java.util.HashMap;
import od.e;
import od.h;
import org.json.JSONArray;
import org.json.JSONObject;
import zb.d;

/* JADX INFO: loaded from: classes12.dex */
class PangleAdapter extends HeaderBiddingAdapter {
    PangleAdapter() {
        super("", BuildConfig.ADAPTER_SDK_VERSION_NAME, BuildConfig.ADAPTER_VERSION_NAME, 1, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    public static /* synthetic */ void a(PangleAdapter pangleAdapter, Context context, PAGConfig pAGConfig, final NetworkInitializationCallback networkInitializationCallback) {
        pangleAdapter.getClass();
        try {
            PAGSdk.init(context, pAGConfig, new PAGSdk.PAGInitCallback() { // from class: io.bidmachine.ads.networks.pangle.PangleAdapter.1
                @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
                public void fail(int i10, String str) {
                    networkInitializationCallback.onFail(str);
                }

                @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
                public void success() {
                    networkInitializationCallback.onSuccess();
                }
            });
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
        }
    }

    private void configure(@NonNull d dVar) {
        PAGConfig.setGDPRConsent(toPangleGDPR(dVar));
        PAGConfig.setPAConsent(toPangleConsent(dVar));
    }

    @Nullable
    private String createPangleData() {
        try {
            return new JSONArray().put(new JSONObject().put("name", "mediation").put("value", BidMachine.NAME)).put(new JSONObject().put("name", "adapter_version").put("value", "3.5.0")).toString();
        } catch (Throwable unused) {
            return null;
        }
    }

    private int toPangleConsent(@NonNull d dVar) {
        if (dVar.isUserAgeRestricted()) {
            return 0;
        }
        if (dVar.isUserInCcpaScope()) {
            return dVar.a() ? 1 : 0;
        }
        if (dVar.isUserInGdprScope()) {
            return dVar.isUserHasConsent() ? 1 : 0;
        }
        return 1;
    }

    private int toPangleGDPR(@NonNull d dVar) {
        return !dVar.b() ? 1 : 0;
    }

    @Override // io.bidmachine.NetworkAdapter
    public e createBanner() {
        return new PangleBannerAd();
    }

    @Override // io.bidmachine.NetworkAdapter
    public h createInterstitial() {
        return new PangleInterstitialAd();
    }

    @Override // io.bidmachine.NetworkAdapter
    public h createRewarded() {
        return new PangleRewardedAd();
    }

    @Override // io.bidmachine.NetworkAdapter
    @Nullable
    public String getNetworkSdkVersion() throws Throwable {
        return PAGSdk.getSDKVersion();
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitializationStatusCheckSupported() {
        return true;
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitialized(@NonNull ContextProvider contextProvider) throws Throwable {
        return PAGSdk.isInitSuccess();
    }

    @Override // io.bidmachine.HeaderBiddingAdapter
    @WorkerThread
    protected void onCollectHeaderBiddingParams(@NonNull ContextProvider contextProvider, @NonNull od.d dVar, @NonNull NetworkAdUnit networkAdUnit, @NonNull HeaderBiddingAdRequestParams headerBiddingAdRequestParams, @NonNull HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        String mediationParameter = networkAdUnit.getMediationParameter("app_id");
        if (TextUtils.isEmpty(mediationParameter)) {
            headerBiddingCollectParamsCallback.onCollectFail(ae.a.b("app_id"));
            return;
        }
        String mediationParameter2 = networkAdUnit.getMediationParameter("slot_id");
        if (TextUtils.isEmpty(mediationParameter2)) {
            headerBiddingCollectParamsCallback.onCollectFail(ae.a.b("slot_id"));
            return;
        }
        configure(dVar.getDataRestrictions());
        String biddingToken = PAGSdk.getBiddingToken();
        if (TextUtils.isEmpty(biddingToken)) {
            headerBiddingCollectParamsCallback.onCollectFail(ae.a.b("network_bid_token"));
            return;
        }
        HashMap map = new HashMap();
        map.put("app_id", mediationParameter);
        map.put("slot_id", mediationParameter2);
        map.put("network_bid_token", biddingToken);
        headerBiddingCollectParamsCallback.onCollectFinished(map);
    }

    @Override // io.bidmachine.NetworkAdapter
    @WorkerThread
    protected void onNetworkInitialize(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull NetworkConfigParams networkConfigParams, @NonNull final NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        String str = networkConfigParams.obtainNetworkParams().get("app_id");
        if (TextUtils.isEmpty(str)) {
            networkInitializationCallback.onFail("app_id not provided");
            return;
        }
        d dataRestrictions = initializationParams.getDataRestrictions();
        final Context applicationContext = contextProvider.getApplicationContext();
        final PAGConfig pAGConfigBuild = new PAGConfig.Builder().appId(str).debugLog(initializationParams.isTestMode()).setPAConsent(toPangleConsent(dataRestrictions)).setGDPRConsent(toPangleGDPR(dataRestrictions)).setUserData(createPangleData()).supportMultiProcess(false).build();
        io.bidmachine.core.h.U(new Runnable() { // from class: io.bidmachine.ads.networks.pangle.a
            @Override // java.lang.Runnable
            public final void run() {
                PangleAdapter.a(this.f79432b, applicationContext, pAGConfigBuild, networkInitializationCallback);
            }
        });
    }

    @Override // io.bidmachine.NetworkAdapter
    public void setLogging(boolean z10) throws Throwable {
        PAGConfig.debugLog(z10);
    }
}
