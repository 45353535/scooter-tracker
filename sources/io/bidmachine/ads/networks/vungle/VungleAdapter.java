package io.bidmachine.ads.networks.vungle;

import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.vungle.ads.BidTokenCallback;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleError;
import com.vungle.ads.VunglePrivacySettings;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import java.util.HashMap;
import net.pubnative.lite.sdk.analytics.Reporting;
import od.e;
import od.h;
import zb.d;

/* JADX INFO: loaded from: classes12.dex */
class VungleAdapter extends HeaderBiddingAdapter {
    VungleAdapter() {
        super("", BuildConfig.ADAPTER_SDK_VERSION_NAME, BuildConfig.ADAPTER_VERSION_NAME, 1, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    private void configure(@NonNull d dVar) {
        VunglePrivacySettings.setCOPPAStatus(dVar.isUserAgeRestricted());
        VunglePrivacySettings.setGDPRStatus(dVar.b(), "");
        VunglePrivacySettings.setCCPAStatus(dVar.a());
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0043  */
    @androidx.annotation.NonNull
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static ae.a mapError(@androidx.annotation.Nullable com.vungle.ads.VungleError r3) {
        /*
            if (r3 != 0) goto L5
            ae.a r3 = ae.a.f4248r
            return r3
        L5:
            int r0 = r3.getCode()
            r1 = 3
            if (r0 == r1) goto L46
            r1 = 6
            if (r0 == r1) goto L46
            r1 = 212(0xd4, float:2.97E-43)
            if (r0 == r1) goto L43
            r1 = 217(0xd9, float:3.04E-43)
            if (r0 == r1) goto L40
            r1 = 304(0x130, float:4.26E-43)
            if (r0 == r1) goto L3d
            r1 = 307(0x133, float:4.3E-43)
            if (r0 == r1) goto L3d
            r1 = 2005(0x7d5, float:2.81E-42)
            if (r0 == r1) goto L3a
            r1 = 20001(0x4e21, float:2.8027E-41)
            if (r0 == r1) goto L3a
            r1 = 220(0xdc, float:3.08E-43)
            if (r0 == r1) goto L3a
            r1 = 221(0xdd, float:3.1E-43)
            if (r0 == r1) goto L3a
            r1 = 10001(0x2711, float:1.4014E-41)
            if (r0 == r1) goto L43
            r1 = 10002(0x2712, float:1.4016E-41)
            if (r0 == r1) goto L43
            ae.a r1 = ae.a.f4248r
            goto L4a
        L3a:
            ae.a r1 = ae.a.f4235e
            goto L4a
        L3d:
            ae.a r1 = ae.a.f4244n
            goto L4a
        L40:
            ae.a r1 = ae.a.f4236f
            goto L4a
        L43:
            ae.a r1 = ae.a.f4247q
            goto L4a
        L46:
            ae.a r1 = ae.a.d()
        L4a:
            ae.a r2 = new ae.a
            java.lang.String r3 = r3.getLocalizedMessage()
            r2.<init>(r1, r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.ads.networks.vungle.VungleAdapter.mapError(com.vungle.ads.VungleError):ae.a");
    }

    @Override // io.bidmachine.NetworkAdapter
    public e createBanner() {
        return new VungleBannerAd();
    }

    @Override // io.bidmachine.NetworkAdapter
    public h createInterstitial() {
        return new VungleInterstitialAd();
    }

    @Override // io.bidmachine.NetworkAdapter
    public h createRewarded() {
        return new VungleRewardedAd();
    }

    @Override // io.bidmachine.NetworkAdapter
    @Nullable
    public String getNetworkSdkVersion() throws Throwable {
        return VungleAds.getSdkVersion();
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitializationStatusCheckSupported() {
        return true;
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitialized(@NonNull ContextProvider contextProvider) throws Throwable {
        return VungleAds.isInitialized();
    }

    @Override // io.bidmachine.HeaderBiddingAdapter
    @WorkerThread
    protected void onCollectHeaderBiddingParams(@NonNull ContextProvider contextProvider, @NonNull od.d dVar, @NonNull final NetworkAdUnit networkAdUnit, @NonNull HeaderBiddingAdRequestParams headerBiddingAdRequestParams, @NonNull final HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        final String mediationParameter = networkAdUnit.getMediationParameter("app_id");
        if (TextUtils.isEmpty(mediationParameter)) {
            headerBiddingCollectParamsCallback.onCollectFail(ae.a.b("app_id"));
            return;
        }
        final String mediationParameter2 = networkAdUnit.getMediationParameter(Reporting.Key.PLACEMENT_ID);
        if (TextUtils.isEmpty(mediationParameter2)) {
            headerBiddingCollectParamsCallback.onCollectFail(ae.a.b(Reporting.Key.PLACEMENT_ID));
        } else {
            configure(dVar.getDataRestrictions());
            VungleAds.getBiddingToken(contextProvider.getApplicationContext(), new BidTokenCallback() { // from class: io.bidmachine.ads.networks.vungle.VungleAdapter.2
                @Override // com.vungle.ads.BidTokenCallback
                public void onBidTokenCollected(@NonNull String str) {
                    String mediationParameter3 = networkAdUnit.getMediationParameter("publisher_id");
                    HashMap map = new HashMap();
                    map.put("app_id", mediationParameter);
                    map.put(Reporting.Key.PLACEMENT_ID, mediationParameter2);
                    map.put("token", str);
                    if (!TextUtils.isEmpty(mediationParameter3)) {
                        map.put("publisher_id", mediationParameter3);
                    }
                    headerBiddingCollectParamsCallback.onCollectFinished(map);
                }

                @Override // com.vungle.ads.BidTokenCallback
                public void onBidTokenError(@NonNull String str) {
                    headerBiddingCollectParamsCallback.onCollectFail(ae.a.b("token"));
                }
            });
        }
    }

    @Override // io.bidmachine.NetworkAdapter
    @WorkerThread
    protected void onNetworkInitialize(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull NetworkConfigParams networkConfigParams, @NonNull final NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        String str = networkConfigParams.obtainNetworkParams().get("app_id");
        if (TextUtils.isEmpty(str)) {
            networkInitializationCallback.onFail("app_id not provided");
        } else {
            configure(initializationParams.getDataRestrictions());
            VungleAds.init(contextProvider.getApplicationContext(), str, new InitializationListener() { // from class: io.bidmachine.ads.networks.vungle.VungleAdapter.1
                @Override // com.vungle.ads.InitializationListener
                public void onError(@NonNull VungleError vungleError) {
                    networkInitializationCallback.onFail(io.bidmachine.core.h.h(vungleError.getLocalizedMessage(), "Unknown error"));
                }

                @Override // com.vungle.ads.InitializationListener
                public void onSuccess() {
                    networkInitializationCallback.onSuccess();
                }
            });
        }
    }
}
