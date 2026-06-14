package io.bidmachine.ads.networks.meta_audience;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.WorkerThread;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BidderTokenProvider;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
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
import od.l;
import zb.d;

/* JADX INFO: loaded from: classes12.dex */
class MetaAudienceAdapter extends HeaderBiddingAdapter {
    MetaAudienceAdapter() {
        super("", BuildConfig.ADAPTER_SDK_VERSION_NAME, BuildConfig.ADAPTER_VERSION_NAME, 1, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded, AdsType.Native});
    }

    private void configure(boolean z10, @NonNull d dVar) {
        AdSettings.setDebugBuild(z10);
        if (z10) {
            AdSettings.setTestAdType(AdSettings.TestAdType.DEFAULT);
        }
        AdSettings.setMediationService(BidMachine.NAME.toLowerCase() + "_3.5.0" + StringUtils.PROCESS_POSTFIX_DELIMITER + getAdapterVersion());
        AdSettings.setMixedAudience(dVar.isUserAgeRestricted());
        if (dVar.isUserInCcpaScope()) {
            if (dVar.a()) {
                AdSettings.setDataProcessingOptions(new String[0]);
            } else {
                AdSettings.setDataProcessingOptions(new String[]{"LDU"}, 0, 0);
            }
        }
    }

    @Override // io.bidmachine.NetworkAdapter
    public e createBanner() {
        return new MetaAudienceBanner();
    }

    @Override // io.bidmachine.NetworkAdapter
    public h createInterstitial() {
        return new MetaAudienceInterstitial();
    }

    @Override // io.bidmachine.NetworkAdapter
    public l createNativeAd() {
        return new MetaAudienceNative();
    }

    @Override // io.bidmachine.NetworkAdapter
    public h createRewarded() {
        return new MetaAudienceRewarded();
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitializationStatusCheckSupported() {
        return true;
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitialized(@NonNull ContextProvider contextProvider) throws Throwable {
        return AudienceNetworkAds.isInitialized(contextProvider.getApplicationContext());
    }

    @Override // io.bidmachine.HeaderBiddingAdapter
    @WorkerThread
    protected void onCollectHeaderBiddingParams(@NonNull ContextProvider contextProvider, @NonNull od.d dVar, @NonNull NetworkAdUnit networkAdUnit, @NonNull HeaderBiddingAdRequestParams headerBiddingAdRequestParams, @NonNull HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        String mediationParameter = networkAdUnit.getMediationParameter("app_id");
        if (TextUtils.isEmpty(mediationParameter)) {
            headerBiddingCollectParamsCallback.onCollectFail(ae.a.b("app_id"));
            return;
        }
        String mediationParameter2 = networkAdUnit.getMediationParameter("meta_key");
        if (TextUtils.isEmpty(mediationParameter2)) {
            headerBiddingCollectParamsCallback.onCollectFail(ae.a.b("meta_key"));
            return;
        }
        configure(dVar.isTestMode(), dVar.getDataRestrictions());
        String bidderToken = BidderTokenProvider.getBidderToken(contextProvider.getApplicationContext());
        if (TextUtils.isEmpty(bidderToken)) {
            headerBiddingCollectParamsCallback.onCollectFail(ae.a.b("token"));
            return;
        }
        HashMap map = new HashMap();
        map.put("app_id", mediationParameter);
        map.put("meta_key", mediationParameter2);
        map.put("token", bidderToken);
        headerBiddingCollectParamsCallback.onCollectFinished(map);
    }

    @Override // io.bidmachine.NetworkAdapter
    @WorkerThread
    protected void onNetworkInitialize(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull NetworkConfigParams networkConfigParams, @NonNull final NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        configure(initializationParams.isTestMode(), initializationParams.getDataRestrictions());
        AudienceNetworkAds.buildInitSettings(contextProvider.getApplicationContext()).withInitListener(new AudienceNetworkAds.InitListener() { // from class: io.bidmachine.ads.networks.meta_audience.a
            @Override // com.facebook.ads.AudienceNetworkAds.InitListener
            public final void onInitialized(AudienceNetworkAds.InitResult initResult) {
                networkInitializationCallback.onSuccess();
            }
        }).initialize();
    }
}
