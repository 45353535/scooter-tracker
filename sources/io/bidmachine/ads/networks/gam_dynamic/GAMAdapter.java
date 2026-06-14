package io.bidmachine.ads.networks.gam_dynamic;

import android.content.Context;
import android.text.TextUtils;
import android.util.Base64;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.VisibleForTesting;
import com.explorestack.protobuf.Struct;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.ExtraParamsManager;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import io.bidmachine.ads.networks.gam_dynamic.versions.VersionWrapper;
import io.bidmachine.protobuf.Waterfall;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes12.dex */
public class GAMAdapter extends HeaderBiddingAdapter {

    @NonNull
    private static final String GAM_NETWORK_ERROR = "GAMNetwork is null";

    @NonNull
    private static final String NETWORK_NAME = "GAMDynamic";

    @Nullable
    @VisibleForTesting
    GAMNetwork gamNetwork;

    @VisibleForTesting
    static class GAMNetworkParams extends NetworkParamsImpl {
        public GAMNetworkParams(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // io.bidmachine.ads.networks.gam_dynamic.NetworkParams
        @Nullable
        public Struct getExt(@NonNull Context context) {
            return ExtraParamsManager.get().getPrivateStruct(context);
        }
    }

    GAMAdapter(@NonNull String str) {
        this(str, "null", "3.5.0.0", 16);
    }

    @Override // io.bidmachine.NetworkAdapter
    public void clearAuction(@NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        GAMNetwork gAMNetwork = this.gamNetwork;
        if (gAMNetwork != null) {
            gAMNetwork.unReserveAd(networkAdUnit);
        }
    }

    @Override // io.bidmachine.NetworkAdapter
    public od.e createBanner() {
        GAMNetwork gAMNetwork = this.gamNetwork;
        if (gAMNetwork != null) {
            return new GAMBannerAd(gAMNetwork);
        }
        throw new IllegalArgumentException(GAM_NETWORK_ERROR);
    }

    @Override // io.bidmachine.NetworkAdapter
    public od.h createInterstitial() {
        GAMNetwork gAMNetwork = this.gamNetwork;
        if (gAMNetwork != null) {
            return new GAMInterstitialAd(gAMNetwork);
        }
        throw new IllegalArgumentException(GAM_NETWORK_ERROR);
    }

    @Override // io.bidmachine.NetworkAdapter
    public od.h createRewarded() {
        GAMNetwork gAMNetwork = this.gamNetwork;
        if (gAMNetwork != null) {
            return new GAMRewardedAd(gAMNetwork);
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
        GAMNetwork gAMNetwork = this.gamNetwork;
        if (gAMNetwork == null) {
            headerBiddingCollectParamsCallback.onCollectFail(ae.a.a("GAM network is null"));
            return;
        }
        InternalAdData internalAdDataReserveMostExpensiveAd = gAMNetwork.reserveMostExpensiveAd(networkAdUnit, networkAdUnit.getAdFormat());
        if (internalAdDataReserveMostExpensiveAd == null) {
            headerBiddingCollectParamsCallback.onCollectFail(ae.a.a("Can't find idle ad"));
            return;
        }
        HashMap map = new HashMap();
        map.put("ad_unit_id", internalAdDataReserveMostExpensiveAd.getAdUnitId());
        map.put("price", String.valueOf(internalAdDataReserveMostExpensiveAd.getPrice()));
        for (Map.Entry<String, Object> entry : internalAdDataReserveMostExpensiveAd.getCustomParamsMap().entrySet()) {
            String key = entry.getKey();
            Object value = entry.getValue();
            if (!TextUtils.isEmpty(key) && value != null) {
                map.put(key, String.valueOf(value));
            }
        }
        headerBiddingCollectParamsCallback.onCollectFinished(map);
    }

    @Override // io.bidmachine.NetworkAdapter
    public void onLossAuction(@NonNull NetworkAdUnit networkAdUnit) throws Throwable {
        GAMNetwork gAMNetwork = this.gamNetwork;
        if (gAMNetwork != null) {
            gAMNetwork.unReserveAd(networkAdUnit);
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
        String strRemoveFromNetworkParams2 = networkConfigParams.removeFromNetworkParams(POBCoreNativeConstants.NATIVE_CONTEXT);
        if (TextUtils.isEmpty(strRemoveFromNetworkParams2)) {
            networkInitializationCallback.onFail("context not provided");
            return;
        }
        Waterfall.Context waterfallContext = parseWaterfallContext(strRemoveFromNetworkParams2);
        if (waterfallContext == null) {
            networkInitializationCallback.onFail("context can't transform to model");
            return;
        }
        GAMNetworkImpl gAMNetworkImpl = new GAMNetworkImpl(applicationContext, new GAMNetworkParams(getKey(), getNetworkName()), waterfallContext, versionWrapperFindVersionWrapper);
        this.gamNetwork = gAMNetworkImpl;
        gAMNetworkImpl.init(applicationContext);
        this.gamNetwork.cache();
        networkInitializationCallback.onSuccess();
    }

    @Nullable
    @VisibleForTesting
    Waterfall.Context parseWaterfallContext(@NonNull String str) {
        try {
            return Waterfall.Context.parseFrom(Base64.decode(str, 0));
        } catch (Throwable unused) {
            return null;
        }
    }

    protected GAMAdapter(@NonNull String str, @NonNull String str2, @NonNull String str3, int i10) {
        this(str, str2, str3, i10, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    protected GAMAdapter(@NonNull String str, @NonNull String str2, @NonNull String str3, int i10, @NonNull AdsType[] adsTypeArr) {
        super(str, str2, str3, i10, adsTypeArr);
    }
}
