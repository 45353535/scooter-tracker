package com.appodeal.ads.adapters.notsy;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobAdUnitParams;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.adapters.notsy.banner.a;
import com.appodeal.ads.adapters.notsy.interstitial.b;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import java.util.Iterator;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class NotsyNetwork extends UnifiedAdmobNetwork<AdManagerAdRequest, AdManagerAdRequest.Builder> {

    public static class builder extends UnifiedAdmobNetwork.builder {
        public builder() {
            super("notsy", "0");
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NonNull
        public NotsyNetwork build() {
            return new NotsyNetwork(this);
        }
    }

    public NotsyNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedBanner<UnifiedAdmobAdUnitParams<AdManagerAdRequest>> createBanner() {
        return new a();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedInterstitial<UnifiedAdmobAdUnitParams<AdManagerAdRequest>> createInterstitial() {
        return new b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedMrec<UnifiedAdmobAdUnitParams<AdManagerAdRequest>> createMrec() {
        return new com.appodeal.ads.adapters.notsy.mrec.a();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedNative<UnifiedAdmobAdUnitParams<AdManagerAdRequest>> createNativeAd() {
        return new com.appodeal.ads.adapters.notsy.native_ad.a();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedRewarded<UnifiedAdmobAdUnitParams<AdManagerAdRequest>> createRewarded() {
        return new com.appodeal.ads.adapters.notsy.rewarded_video.a();
    }

    @Override // com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork
    @NonNull
    public AdManagerAdRequest createAdRequest(@NonNull AdManagerAdRequest.Builder builder2) {
        return builder2.build();
    }

    @Override // com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork
    @NonNull
    public AdManagerAdRequest.Builder createAdRequestBuilder(@NonNull JSONObject jSONObject) {
        AdManagerAdRequest.Builder builder2 = new AdManagerAdRequest.Builder();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("targeting");
        if (jSONObjectOptJSONObject != null) {
            Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                builder2.addCustomTargeting(next, jSONObjectOptJSONObject.optString(next));
            }
        }
        return builder2;
    }
}
