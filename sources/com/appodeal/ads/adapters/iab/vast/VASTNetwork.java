package com.appodeal.ads.adapters.iab.vast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkInitializationListener;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.Appodeal;
import com.appodeal.ads.adapters.iab.vast.interstitial.b;
import com.appodeal.ads.adapters.iab.vast.unified.c;
import com.appodeal.ads.adapters.iab.vast.unified.e;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedRewarded;
import e2.f;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class VASTNetwork extends AdNetwork<c, e> {

    public static class builder extends AdNetworkBuilder {
        public builder() {
            super("vast", "0");
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NonNull
        public List<String> getAdActivities() {
            return new a();
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NonNull
        public VASTNetwork build() {
            return new VASTNetwork(this);
        }
    }

    public VASTNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
        b2.c.f5804a = Appodeal.getVersion();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedInterstitial<e> createInterstitial() {
        return new b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedRewarded<e> createRewarded() {
        return new com.appodeal.ads.adapters.iab.vast.rewarded_video.b();
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
            f2.c.d(f.a.debug);
        } else {
            f2.c.d(f.a.none);
        }
    }

    @Override // com.appodeal.ads.AdNetwork
    @NonNull
    public e getAdUnitParams(@NonNull ContextProvider contextProvider, @NonNull AdUnit adUnit, @NonNull AdNetworkMediationParams adNetworkMediationParams) {
        JSONObject jsonData = adUnit.getJsonData();
        String strOptString = jsonData.optString("package");
        int iOptInt = jsonData.optInt("close_time", 0);
        long jOptLong = jsonData.optLong("expiry");
        return new e(adNetworkMediationParams.getRestrictedData(), jsonData.optString("vast_xml"), jsonData.optString("vast_url"), strOptString, iOptInt, jOptLong, jsonData.optBoolean("video_auto_close", false));
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public c getInitializeParams(@Nullable JSONObject jSONObject) {
        return new c();
    }

    @Override // com.appodeal.ads.AdNetwork
    public void initialize(@NonNull ContextProvider contextProvider, @NonNull c cVar, @NonNull AdNetworkMediationParams adNetworkMediationParams, @NonNull AdNetworkInitializationListener adNetworkInitializationListener) {
        adNetworkInitializationListener.onInitializationFinished();
    }
}
