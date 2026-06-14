package io.bidmachine.ads.networks.amazon;

import android.text.TextUtils;
import android.util.DisplayMetrics;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.WorkerThread;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdCallback;
import com.amazon.device.ads.DTBAdNetwork;
import com.amazon.device.ads.DTBAdNetworkInfo;
import com.amazon.device.ads.DTBAdRequest;
import com.amazon.device.ads.DTBAdResponse;
import com.amazon.device.ads.DTBAdSize;
import com.amazon.device.ads.DtbConstants;
import com.amazon.device.ads.MRAIDPolicy;
import com.amazon.device.ads.SDKUtilities;
import com.mbridge.msdk.MBridgeConstans;
import io.bidmachine.AdContentType;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import io.bidmachine.ads.networks.nast.NastAdapter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import od.e;
import od.h;
import zb.d;

/* JADX INFO: loaded from: classes12.dex */
class AmazonAdapter extends HeaderBiddingAdapter {

    /* JADX INFO: renamed from: io.bidmachine.ads.networks.amazon.AmazonAdapter$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$amazon$device$ads$AdError$ErrorCode;

        static {
            int[] iArr = new int[AdError.ErrorCode.values().length];
            $SwitchMap$com$amazon$device$ads$AdError$ErrorCode = iArr;
            try {
                iArr[AdError.ErrorCode.NO_FILL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$AdError$ErrorCode[AdError.ErrorCode.NETWORK_ERROR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$AdError$ErrorCode[AdError.ErrorCode.REQUEST_ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$amazon$device$ads$AdError$ErrorCode[AdError.ErrorCode.NETWORK_TIMEOUT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    private static abstract class AmazonLoader {

        @NonNull
        private final HeaderBiddingCollectParamsCallback collectCallback;

        @Nullable
        private String usPrivacy;

        /* synthetic */ AmazonLoader(HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback, AnonymousClass1 anonymousClass1) {
            this(headerBiddingCollectParamsCallback);
        }

        @NonNull
        static AmazonLoader forDisplay(@NonNull HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) {
            return new DisplayLoader(headerBiddingCollectParamsCallback, null);
        }

        @NonNull
        static AmazonLoader forVideo(@NonNull HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) {
            return new VideoLoader(headerBiddingCollectParamsCallback, null);
        }

        abstract void handleResponse(@NonNull DTBAdResponse dTBAdResponse, @NonNull Map<String, String> map);

        void load(@NonNull DTBAdSize dTBAdSize) {
            DTBAdRequest dTBAdRequest = new DTBAdRequest(new DTBAdNetworkInfo(DTBAdNetwork.CUSTOM_MEDIATION));
            dTBAdRequest.setSizes(dTBAdSize);
            if (!TextUtils.isEmpty(this.usPrivacy)) {
                dTBAdRequest.putCustomTarget(DtbConstants.APS_ADMOB_CONST_CCPA_US_PRIVACY, this.usPrivacy);
            }
            dTBAdRequest.loadAd(new DTBAdCallback() { // from class: io.bidmachine.ads.networks.amazon.AmazonAdapter.AmazonLoader.1
                @Override // com.amazon.device.ads.DTBAdCallback
                public void onFailure(@NonNull AdError adError) {
                    AmazonLoader.this.collectCallback.onCollectFail(AmazonAdapter.mapError(adError, ae.a.f4247q));
                }

                @Override // com.amazon.device.ads.DTBAdCallback
                public void onSuccess(@NonNull DTBAdResponse dTBAdResponse) {
                    HashMap map = new HashMap();
                    AmazonLoader.this.handleResponse(dTBAdResponse, map);
                    if (map.isEmpty()) {
                        AmazonLoader.this.collectCallback.onCollectFail(ae.a.a("Amazon returned empty parameters"));
                        return;
                    }
                    String bidInfo = SDKUtilities.getBidInfo(dTBAdResponse);
                    if (TextUtils.isEmpty(bidInfo)) {
                        AmazonLoader.this.collectCallback.onCollectFail(ae.a.a("Amazon returned empty bidInfo"));
                    } else {
                        map.put("bid_info", bidInfo);
                        AmazonLoader.this.collectCallback.onCollectFinished(map);
                    }
                }
            });
        }

        @NonNull
        AmazonLoader withUsPrivacy(@Nullable String str) {
            this.usPrivacy = str;
            return this;
        }

        private AmazonLoader(@NonNull HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) {
            this.collectCallback = headerBiddingCollectParamsCallback;
        }
    }

    private static class DisplayLoader extends AmazonLoader {
        /* synthetic */ DisplayLoader(HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback, AnonymousClass1 anonymousClass1) {
            this(headerBiddingCollectParamsCallback);
        }

        @Override // io.bidmachine.ads.networks.amazon.AmazonAdapter.AmazonLoader
        void handleResponse(@NonNull DTBAdResponse dTBAdResponse, @NonNull Map<String, String> map) {
            String str;
            for (Map.Entry<String, List<String>> entry : dTBAdResponse.getDefaultDisplayAdsRequestCustomParams().entrySet()) {
                List<String> value = entry.getValue();
                if (value != null && (str = value.get(0)) != null) {
                    map.put(entry.getKey(), str);
                }
            }
        }

        private DisplayLoader(@NonNull HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) {
            super(headerBiddingCollectParamsCallback, null);
        }
    }

    private static class VideoLoader extends AmazonLoader {
        /* synthetic */ VideoLoader(HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback, AnonymousClass1 anonymousClass1) {
            this(headerBiddingCollectParamsCallback);
        }

        @Override // io.bidmachine.ads.networks.amazon.AmazonAdapter.AmazonLoader
        void handleResponse(@NonNull DTBAdResponse dTBAdResponse, @NonNull Map<String, String> map) {
            for (Map.Entry<String, String> entry : dTBAdResponse.getDefaultVideoAdsRequestCustomParams().entrySet()) {
                String value = entry.getValue();
                if (value != null) {
                    map.put(entry.getKey(), value);
                }
            }
        }

        private VideoLoader(@NonNull HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) {
            super(headerBiddingCollectParamsCallback, null);
        }
    }

    AmazonAdapter() {
        super("", BuildConfig.ADAPTER_SDK_VERSION_NAME, BuildConfig.ADAPTER_VERSION_NAME, 1, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded});
    }

    private static void configure(boolean z10, @NonNull d dVar) {
        AdRegistration.enableTesting(z10);
        AdRegistration.useGeoLocation(dVar.f());
    }

    @NonNull
    static ae.a mapError(@Nullable AdError adError, @NonNull ae.a aVar) {
        if (adError == null) {
            return aVar;
        }
        int i10 = AnonymousClass1.$SwitchMap$com$amazon$device$ads$AdError$ErrorCode[adError.getCode().ordinal()];
        if (i10 == 1) {
            aVar = ae.a.f4247q;
        } else if (i10 == 2) {
            aVar = ae.a.f4235e;
        } else if (i10 == 3) {
            aVar = ae.a.f4237g;
        } else if (i10 == 4) {
            aVar = ae.a.f4236f;
        }
        String message = adError.getMessage();
        return TextUtils.isEmpty(message) ? aVar : new ae.a(aVar, -1, message);
    }

    @Override // io.bidmachine.NetworkAdapter
    public e createBanner() {
        return new AmazonBannerAd();
    }

    @Override // io.bidmachine.NetworkAdapter
    public h createInterstitial() {
        return new AmazonFullscreenAd();
    }

    @Override // io.bidmachine.NetworkAdapter
    public h createRewarded() {
        return new AmazonFullscreenAd();
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitializationStatusCheckSupported() {
        return true;
    }

    @Override // io.bidmachine.NetworkAdapter
    protected boolean isNetworkInitialized(@NonNull ContextProvider contextProvider) throws Throwable {
        return AdRegistration.isInitialized();
    }

    @Override // io.bidmachine.HeaderBiddingAdapter
    @WorkerThread
    protected void onCollectHeaderBiddingParams(@NonNull ContextProvider contextProvider, @NonNull od.d dVar, @NonNull NetworkAdUnit networkAdUnit, @NonNull HeaderBiddingAdRequestParams headerBiddingAdRequestParams, @NonNull HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        String mediationParameter = networkAdUnit.getMediationParameter("slot_uuid");
        if (TextUtils.isEmpty(mediationParameter)) {
            headerBiddingCollectParamsCallback.onCollectFail(ae.a.b("slot_uuid"));
            return;
        }
        if (TextUtils.isEmpty(networkAdUnit.getMediationParameter(MBridgeConstans.APP_KEY))) {
            headerBiddingCollectParamsCallback.onCollectFail(ae.a.b(MBridgeConstans.APP_KEY));
            return;
        }
        configure(dVar.isTestMode(), dVar.getDataRestrictions());
        AdsType adsType = headerBiddingAdRequestParams.getAdsType();
        String uSPrivacyString = dVar.getDataRestrictions().getUSPrivacyString();
        if (adsType == AdsType.Banner) {
            u8.e eVarB = ((u8.b) dVar.getAdRequestParameters()).b();
            AmazonLoader.forDisplay(headerBiddingCollectParamsCallback).withUsPrivacy(uSPrivacyString).load(new DTBAdSize(eVarB.f105272b, eVarB.f105273c, mediationParameter));
            return;
        }
        if (adsType != AdsType.Interstitial && adsType != AdsType.Rewarded) {
            headerBiddingCollectParamsCallback.onCollectFail(ae.a.a("This AdsType is not supported by Amazon - " + adsType));
            return;
        }
        if (headerBiddingAdRequestParams.getAdContentType() != AdContentType.Video) {
            AmazonLoader.forDisplay(headerBiddingCollectParamsCallback).withUsPrivacy(uSPrivacyString).load(new DTBAdSize.DTBInterstitialAdSize(mediationParameter));
        } else {
            DisplayMetrics displayMetrics = contextProvider.getContext().getResources().getDisplayMetrics();
            AmazonLoader.forVideo(headerBiddingCollectParamsCallback).withUsPrivacy(uSPrivacyString).load(new DTBAdSize.DTBVideo(displayMetrics.widthPixels, displayMetrics.heightPixels, mediationParameter));
        }
    }

    @Override // io.bidmachine.NetworkAdapter
    @WorkerThread
    protected void onNetworkInitialize(@NonNull ContextProvider contextProvider, @NonNull InitializationParams initializationParams, @NonNull NetworkConfigParams networkConfigParams, @NonNull NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        String str = networkConfigParams.obtainNetworkParams().get(MBridgeConstans.APP_KEY);
        if (TextUtils.isEmpty(str)) {
            networkInitializationCallback.onFail("app_key not provided");
            return;
        }
        AdRegistration.getInstance(str, contextProvider.getContext().getApplicationContext());
        AdRegistration.setMRAIDSupportedVersions(new String[]{NastAdapter.ADAPTER_SDK_VERSION_NAME, "2.0", "3.0"});
        AdRegistration.setMRAIDPolicy(MRAIDPolicy.CUSTOM);
        configure(initializationParams.isTestMode(), initializationParams.getDataRestrictions());
        networkInitializationCallback.onSuccess();
    }

    @Override // io.bidmachine.NetworkAdapter
    public void setLogging(boolean z10) throws Throwable {
        AdRegistration.enableLogging(z10);
    }
}
