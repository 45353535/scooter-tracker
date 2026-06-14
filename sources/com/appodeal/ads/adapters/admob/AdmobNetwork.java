package com.appodeal.ads.adapters.admob;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.adapters.admob.banner.AdmobBanner;
import com.appodeal.ads.adapters.admob.interstitial.AdmobInterstitial;
import com.appodeal.ads.adapters.admob.mrec.AdmobMrec;
import com.appodeal.ads.adapters.admob.native_ad.AdmobNative;
import com.appodeal.ads.adapters.admob.rewarded_video.AdmobRewarded;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobAdUnitParams;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.google.android.gms.ads.AdRequest;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class AdmobNetwork extends UnifiedAdmobNetwork<AdRequest, AdRequest.Builder> {

    public static class builder extends UnifiedAdmobNetwork.builder {
        public builder() {
            super("admob", "0");
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NonNull
        public AdmobNetwork build() {
            return new AdmobNetwork(this);
        }
    }

    public AdmobNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedBanner<UnifiedAdmobAdUnitParams<AdRequest>> createBanner() {
        return new AdmobBanner();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedInterstitial<UnifiedAdmobAdUnitParams<AdRequest>> createInterstitial() {
        return new AdmobInterstitial();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedMrec<UnifiedAdmobAdUnitParams<AdRequest>> createMrec() {
        return new AdmobMrec();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedNative<UnifiedAdmobAdUnitParams<AdRequest>> createNativeAd() {
        return new AdmobNative();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedRewarded<UnifiedAdmobAdUnitParams<AdRequest>> createRewarded() {
        return new AdmobRewarded();
    }

    @Override // com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork
    @NonNull
    public AdRequest createAdRequest(@NonNull AdRequest.Builder builder2) {
        return builder2.build();
    }

    @Override // com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork
    @NonNull
    public AdRequest.Builder createAdRequestBuilder(@NonNull JSONObject jSONObject) {
        return new AdRequest.Builder();
    }
}
