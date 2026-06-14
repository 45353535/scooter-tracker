package com.appodeal.ads.adapters.iab.mraid;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import b2.c;
import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkInitializationListener;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.Appodeal;
import com.appodeal.ads.adapters.iab.mraid.banner.b;
import com.appodeal.ads.adapters.iab.mraid.unified.f;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.explorestack.iab.mraid.d;
import com.taurusx.tax.y.z.w.s;
import e2.f;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class MraidNetwork extends AdNetwork<f, com.appodeal.ads.adapters.iab.mraid.unified.a> {

    public static class builder extends AdNetworkBuilder {
        public builder() {
            super("mraid", "0");
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NonNull
        public List<String> getAdActivities() {
            return new a();
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NonNull
        public MraidNetwork build() {
            return new MraidNetwork(this);
        }
    }

    public MraidNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
        c.f5804a = Appodeal.getVersion();
    }

    @Nullable
    private static String obtainScript(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return "window.renderValidationData(" + jSONObject + ");";
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedBanner<com.appodeal.ads.adapters.iab.mraid.unified.a> createBanner() {
        return new b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedInterstitial<com.appodeal.ads.adapters.iab.mraid.unified.a> createInterstitial() {
        return new com.appodeal.ads.adapters.iab.mraid.interstitial.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedMrec<com.appodeal.ads.adapters.iab.mraid.unified.a> createMrec() {
        return new com.appodeal.ads.adapters.iab.mraid.mrec.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedRewarded<com.appodeal.ads.adapters.iab.mraid.unified.a> createRewarded() {
        return new com.appodeal.ads.adapters.iab.mraid.rewarded_video.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NonNull
    public String getRecommendedVersion() {
        return "1.8.1";
    }

    @Override // com.appodeal.ads.AdNetwork
    @NonNull
    public String getVersion() {
        return "1.8.1";
    }

    @Override // com.appodeal.ads.AdNetwork
    public boolean isInitialized() {
        return true;
    }

    @Override // com.appodeal.ads.AdNetwork
    public void setLogging(boolean z10) {
        if (z10) {
            d.h(f.a.debug);
        } else {
            d.h(f.a.none);
        }
    }

    @Override // com.appodeal.ads.AdNetwork
    @NonNull
    public com.appodeal.ads.adapters.iab.mraid.unified.a getAdUnitParams(@NonNull ContextProvider contextProvider, @NonNull AdUnit adUnit, @NonNull AdNetworkMediationParams adNetworkMediationParams) {
        JSONObject jsonData = adUnit.getJsonData();
        String strOptString = jsonData.optString("package");
        String strOptString2 = jsonData.optString("base_url", "");
        long jOptLong = jsonData.optLong("expiry");
        boolean zOptBoolean = jsonData.optBoolean("preload", true);
        boolean zOptBoolean2 = jsonData.optBoolean(s.z.f67720z);
        return new com.appodeal.ads.adapters.iab.mraid.unified.a(adNetworkMediationParams.getRestrictedData(), strOptString, strOptString2, jsonData.optString("html"), jsonData.optString("mraid_url"), adNetworkMediationParams.isTestMode() ? obtainScript(adUnit.getJsonData().optJSONObject("validation_data")) : null, jOptLong, zOptBoolean, zOptBoolean2, Integer.parseInt(jsonData.getString("width")), Integer.parseInt(jsonData.getString("height")), jsonData.optInt("close_time", -1));
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public com.appodeal.ads.adapters.iab.mraid.unified.f getInitializeParams(@Nullable JSONObject jSONObject) {
        return new com.appodeal.ads.adapters.iab.mraid.unified.f();
    }

    @Override // com.appodeal.ads.AdNetwork
    public void initialize(@NonNull ContextProvider contextProvider, @NonNull com.appodeal.ads.adapters.iab.mraid.unified.f fVar, @NonNull AdNetworkMediationParams adNetworkMediationParams, @NonNull AdNetworkInitializationListener adNetworkInitializationListener) {
        adNetworkInitializationListener.onInitializationFinished();
    }
}
