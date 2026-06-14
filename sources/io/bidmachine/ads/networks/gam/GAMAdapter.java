package io.bidmachine.ads.networks.gam;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.firebase.analytics.FirebaseAnalytics;
import io.bidmachine.AdsFormat;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import io.bidmachine.ads.networks.gam.versions.VersionWrapper;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes12.dex */
public class GAMAdapter extends HeaderBiddingAdapter {
    private static final int DEFAULT_EXPIRATION_TIME_SEC = 3600;

    @NonNull
    private static final String GAM_NETWORK_ERROR = "GAMNetwork is null";

    @NonNull
    private static final String NETWORK_NAME = "GAM";

    @Nullable
    private GAMNetwork gamNetwork;

    GAMAdapter() {
        this(BuildConfig.ADAPTER_NAME, "null", BuildConfig.ADAPTER_VERSION_NAME, 16);
    }

    @Nullable
    private Map<AdsFormat, GAMTypeConfig> toGAMTypeConfigMap(@NonNull String str) {
        GAMTypeConfig gAMTypeConfigCreate;
        HashMap map = new HashMap();
        try {
            JSONArray jSONArray = new JSONArray(str);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null && (gAMTypeConfigCreate = GAMTypeConfigFactory.create(jSONObjectOptJSONObject)) != null) {
                    map.put(gAMTypeConfigCreate.getAdsFormat(), gAMTypeConfigCreate);
                }
            }
            return map;
        } catch (Throwable unused) {
            return null;
        }
    }

    @Override // io.bidmachine.NetworkAdapter
    public void clearAuction(@NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        GAMNetwork gAMNetwork = this.gamNetwork;
        if (gAMNetwork != null) {
            gAMNetwork.unReserveGAMAd(networkAdUnit);
        }
    }

    @Override // io.bidmachine.NetworkAdapter
    public od.e createBanner() {
        if (this.gamNetwork != null) {
            return new GAMBanner(this.gamNetwork);
        }
        throw new IllegalArgumentException(GAM_NETWORK_ERROR);
    }

    @Override // io.bidmachine.NetworkAdapter
    public od.h createInterstitial() {
        if (this.gamNetwork != null) {
            return new GAMInterstitial(this.gamNetwork);
        }
        throw new IllegalArgumentException(GAM_NETWORK_ERROR);
    }

    @Override // io.bidmachine.NetworkAdapter
    public od.h createRewarded() {
        if (this.gamNetwork != null) {
            return new GAMRewarded(this.gamNetwork);
        }
        throw new IllegalArgumentException(GAM_NETWORK_ERROR);
    }

    @NonNull
    public String getNetworkName() {
        return NETWORK_NAME;
    }

    @Override // io.bidmachine.NetworkAdapter
    @Nullable
    public String getNetworkSdkVersion() throws Throwable {
        GAMNetwork gAMNetwork = this.gamNetwork;
        if (gAMNetwork != null) {
            return gAMNetwork.getVersion();
        }
        return null;
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitializationStatusCheckSupported() {
        return true;
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitialized(@NonNull ContextProvider contextProvider) throws Throwable {
        GAMNetwork gAMNetwork = this.gamNetwork;
        return gAMNetwork != null && gAMNetwork.isInitialized();
    }

    @Override // io.bidmachine.HeaderBiddingAdapter
    protected void onCollectHeaderBiddingParams(@NonNull ContextProvider contextProvider, @NonNull od.d dVar, @NonNull NetworkAdUnit networkAdUnit, @NonNull HeaderBiddingAdRequestParams headerBiddingAdRequestParams, @NonNull HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        String mediationParameter = networkAdUnit.getMediationParameter("ad_unit_id");
        if (TextUtils.isEmpty(mediationParameter)) {
            headerBiddingCollectParamsCallback.onCollectFail(ae.a.b("ad_unit_id"));
            return;
        }
        GAMNetwork gAMNetwork = this.gamNetwork;
        if (gAMNetwork == null) {
            headerBiddingCollectParamsCallback.onCollectFail(ae.a.a("GAM network is null"));
            return;
        }
        GAMUnitData gAMUnitDataReserveMostExpensiveGAMAd = gAMNetwork.reserveMostExpensiveGAMAd(networkAdUnit, mediationParameter);
        this.gamNetwork.cache(dVar.getAdRequestParameters().getAdsFormat());
        if (gAMUnitDataReserveMostExpensiveGAMAd == null) {
            headerBiddingCollectParamsCallback.onCollectFail(ae.a.a("Can't find idle ad"));
            return;
        }
        HashMap map = new HashMap();
        map.put("ad_unit_id", gAMUnitDataReserveMostExpensiveGAMAd.getAdUnitId());
        map.put(FirebaseAnalytics.Param.SCORE, String.valueOf(gAMUnitDataReserveMostExpensiveGAMAd.getScore()));
        map.put("price", String.valueOf(gAMUnitDataReserveMostExpensiveGAMAd.getPrice()));
        headerBiddingCollectParamsCallback.onCollectFinished(map);
    }

    @Override // io.bidmachine.NetworkAdapter
    public void onLossAuction(@NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        GAMNetwork gAMNetwork = this.gamNetwork;
        if (gAMNetwork != null) {
            gAMNetwork.unReserveGAMAd(networkAdUnit);
        }
    }

    @Override // io.bidmachine.NetworkAdapter
    protected void onNetworkInitialize(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull NetworkConfigParams networkConfigParams, @NonNull NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        String strRemoveFromNetworkParams = networkConfigParams.removeFromNetworkParams("supported_versions_range");
        if (TextUtils.isEmpty(strRemoveFromNetworkParams)) {
            networkInitializationCallback.onFail("supported_versions_range not provided");
            return;
        }
        VersionWrapper versionWrapperFindVersionWrapper = VersionManager.findVersionWrapper(strRemoveFromNetworkParams);
        if (versionWrapperFindVersionWrapper == null) {
            networkInitializationCallback.onFail("Unsupported GAM version (VersionWrapper not found)");
            return;
        }
        Context applicationContext = contextProvider.getApplicationContext();
        if (!versionWrapperFindVersionWrapper.isGAMPresent(applicationContext)) {
            networkInitializationCallback.onFail("GAM is absent or used unsupported version");
            return;
        }
        String strRemoveFromNetworkParams2 = networkConfigParams.removeFromNetworkParams("waterfall_configurations");
        if (TextUtils.isEmpty(strRemoveFromNetworkParams2)) {
            networkInitializationCallback.onFail("waterfall_configurations not provided");
            return;
        }
        Map<AdsFormat, GAMTypeConfig> gAMTypeConfigMap = toGAMTypeConfigMap(strRemoveFromNetworkParams2);
        if (gAMTypeConfigMap == null || gAMTypeConfigMap.isEmpty()) {
            networkInitializationCallback.onFail("waterfall_configurations is empty");
            return;
        }
        GAMNetwork gAMNetwork = new GAMNetwork(applicationContext, versionWrapperFindVersionWrapper, getNetworkName(), gAMTypeConfigMap, networkConfigParams.removeFromNetworkParams("request_agent"), TimeUnit.SECONDS.toMillis(io.bidmachine.core.h.a0(networkConfigParams.removeFromNetworkParams("expiration_time"), DEFAULT_EXPIRATION_TIME_SEC)), Boolean.parseBoolean(networkConfigParams.removeFromNetworkParams("override_callbacks")));
        this.gamNetwork = gAMNetwork;
        gAMNetwork.init(applicationContext);
        this.gamNetwork.cache();
        networkInitializationCallback.onSuccess();
    }

    protected GAMAdapter(@NonNull String str, @NonNull String str2, @NonNull String str3, int i10) {
        this(str, str2, str3, i10, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    protected GAMAdapter(@NonNull String str, @NonNull String str2, @NonNull String str3, int i10, @NonNull AdsType[] adsTypeArr) {
        super(str, str2, str3, i10, adsTypeArr);
    }
}
