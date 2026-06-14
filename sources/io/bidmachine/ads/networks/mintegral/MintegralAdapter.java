package io.bidmachine.ads.networks.mintegral;

import android.app.Application;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.MBridgeSDK;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.mbbid.out.BidManager;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.out.SDKInitStatusListener;
import com.mbridge.msdk.system.MBridgeSDKImpl;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import net.pubnative.lite.sdk.analytics.Reporting;
import od.e;
import od.h;
import zb.d;

/* JADX INFO: loaded from: classes12.dex */
class MintegralAdapter extends HeaderBiddingAdapter {
    MintegralAdapter() {
        super("", BuildConfig.ADAPTER_SDK_VERSION_NAME, BuildConfig.ADAPTER_VERSION_NAME, 1, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    public static /* synthetic */ void a(MintegralAdapter mintegralAdapter, MBridgeSDK mBridgeSDK, Map map, Context context, final NetworkInitializationCallback networkInitializationCallback) {
        mintegralAdapter.getClass();
        try {
            mBridgeSDK.init((Map<String, String>) map, (Application) context, new SDKInitStatusListener() { // from class: io.bidmachine.ads.networks.mintegral.MintegralAdapter.1
                @Override // com.mbridge.msdk.out.SDKInitStatusListener
                public void onInitFail(String str) {
                    NetworkInitializationCallback networkInitializationCallback2 = networkInitializationCallback;
                    if (str == null) {
                        str = "Unknown error";
                    }
                    networkInitializationCallback2.onFail(str);
                }

                @Override // com.mbridge.msdk.out.SDKInitStatusListener
                public void onInitSuccess() {
                    networkInitializationCallback.onSuccess();
                }
            });
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
        }
    }

    private void configure(@NonNull Context context, @NonNull MBridgeSDK mBridgeSDK, @NonNull d dVar) {
        if (dVar.isUserInGdprScope()) {
            boolean zIsUserHasConsent = dVar.isUserHasConsent();
            mBridgeSDK.setUserPrivateInfoType(context, MBridgeConstans.AUTHORITY_ALL_INFO, zIsUserHasConsent ? 1 : 0);
            mBridgeSDK.setConsentStatus(context, zIsUserHasConsent ? 1 : 0);
        }
        if (dVar.isUserInCcpaScope()) {
            mBridgeSDK.setDoNotTrackStatus(context, !dVar.a());
        }
        mBridgeSDK.setCoppaStatus(context, dVar.isUserAgeRestricted());
    }

    @NonNull
    static ae.a mapError(@NonNull ae.a aVar, @Nullable String str) {
        return TextUtils.isEmpty(str) ? aVar : new ae.a(aVar, -1, str);
    }

    private void markTraffic(@NonNull String str) {
        try {
            Method declaredMethod = Aa.class.getDeclaredMethod("b", String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(Aa.class, str);
        } catch (Throwable th2) {
            io.bidmachine.core.a.p(th2);
        }
    }

    @Override // io.bidmachine.NetworkAdapter
    public e createBanner() {
        return new MintegralBannerAd();
    }

    @Override // io.bidmachine.NetworkAdapter
    public h createInterstitial() {
        return new MintegralInterstitialAd();
    }

    @Override // io.bidmachine.NetworkAdapter
    public h createRewarded() {
        return new MintegralRewardedAd();
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitializationStatusCheckSupported() {
        return true;
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitialized(@NonNull ContextProvider contextProvider) throws Throwable {
        return MBridgeSDKFactory.getMBridgeSDK().getStatus() == MBridgeSDK.PLUGIN_LOAD_STATUS.COMPLETED;
    }

    @Override // io.bidmachine.HeaderBiddingAdapter
    protected void onCollectHeaderBiddingParams(@NonNull ContextProvider contextProvider, @NonNull od.d dVar, @NonNull NetworkAdUnit networkAdUnit, @NonNull HeaderBiddingAdRequestParams headerBiddingAdRequestParams, @NonNull HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        String mediationParameter = networkAdUnit.getMediationParameter("app_id");
        if (TextUtils.isEmpty(mediationParameter)) {
            headerBiddingCollectParamsCallback.onCollectFail(ae.a.b("app_id"));
            return;
        }
        String mediationParameter2 = networkAdUnit.getMediationParameter(MBridgeConstans.APP_KEY);
        if (TextUtils.isEmpty(mediationParameter2)) {
            headerBiddingCollectParamsCallback.onCollectFail(ae.a.b(MBridgeConstans.APP_KEY));
            return;
        }
        String mediationParameter3 = networkAdUnit.getMediationParameter("ad_unit_id");
        if (TextUtils.isEmpty(mediationParameter3)) {
            headerBiddingCollectParamsCallback.onCollectFail(ae.a.b("ad_unit_id"));
            return;
        }
        String buyerUid = BidManager.getBuyerUid(contextProvider.getApplicationContext());
        if (TextUtils.isEmpty(buyerUid)) {
            headerBiddingCollectParamsCallback.onCollectFail(ae.a.b("buyer_uid"));
            return;
        }
        String mediationParameter4 = networkAdUnit.getMediationParameter(Reporting.Key.PLACEMENT_ID);
        HashMap map = new HashMap();
        map.put("app_id", mediationParameter);
        map.put(MBridgeConstans.APP_KEY, mediationParameter2);
        map.put("ad_unit_id", mediationParameter3);
        map.put("buyer_uid", buyerUid);
        if (!TextUtils.isEmpty(mediationParameter4)) {
            map.put(Reporting.Key.PLACEMENT_ID, mediationParameter4);
        }
        headerBiddingCollectParamsCallback.onCollectFinished(map);
    }

    @Override // io.bidmachine.NetworkAdapter
    protected void onNetworkInitialize(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull NetworkConfigParams networkConfigParams, @NonNull final NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        Map<String, String> mapObtainNetworkParams = networkConfigParams.obtainNetworkParams();
        String str = mapObtainNetworkParams.get("app_id");
        if (TextUtils.isEmpty(str)) {
            networkInitializationCallback.onFail("app_id not provided");
            return;
        }
        String str2 = mapObtainNetworkParams.get(MBridgeConstans.APP_KEY);
        if (TextUtils.isEmpty(str2)) {
            networkInitializationCallback.onFail("app_key not provided");
            return;
        }
        final Context applicationContext = contextProvider.getApplicationContext();
        final MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
        configure(applicationContext, mBridgeSDK, initializationParams.getDataRestrictions());
        markTraffic("Y+H6DFttYrPQYcIP+F2F+F5/Hv==");
        final Map<String, String> mBConfigurationMap = mBridgeSDK.getMBConfigurationMap(str, str2);
        io.bidmachine.core.h.U(new Runnable() { // from class: io.bidmachine.ads.networks.mintegral.a
            @Override // java.lang.Runnable
            public final void run() {
                MintegralAdapter.a(this.f79417b, mBridgeSDK, mBConfigurationMap, applicationContext, networkInitializationCallback);
            }
        });
    }
}
