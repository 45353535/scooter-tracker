package com.appodeal.ads.adapters.mytarget;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkInitializationListener;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.my.target.common.MyTargetConfig;
import com.my.target.common.MyTargetManager;
import com.my.target.common.MyTargetPrivacy;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class MyTargetNetwork extends AdNetwork<b, a> {
    private static final AtomicBoolean isInitialized = new AtomicBoolean(false);

    public static class builder extends AdNetworkBuilder {
        public builder() {
            super("my_target", "0");
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NonNull
        public List<String> getAdActivities() {
            return new c();
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NonNull
        public MyTargetNetwork build() {
            return new MyTargetNetwork(this);
        }
    }

    public MyTargetNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
    }

    private void configureTestDevice(boolean z10, @NonNull RestrictedData restrictedData) {
        MyTargetConfig.Builder builder2 = new MyTargetConfig.Builder();
        if (z10) {
            builder2.withTestDevices(restrictedData.getIfa());
        }
        MyTargetManager.setSdkConfig(builder2.build());
    }

    private void updateConsent(@NonNull RestrictedData restrictedData) {
        if (restrictedData.isUserInGdprScope()) {
            MyTargetPrivacy.setUserConsent(restrictedData.isUserHasConsent());
        }
        if (restrictedData.isUserInCcpaScope()) {
            MyTargetPrivacy.setCcpaUserConsent(restrictedData.isUserHasConsent());
        }
        MyTargetPrivacy.setUserAgeRestricted(restrictedData.isUserAgeRestricted());
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedBanner<a> createBanner() {
        return new com.appodeal.ads.adapters.mytarget.banner.a();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedInterstitial<a> createInterstitial() {
        return new com.appodeal.ads.adapters.mytarget.interstitial.a();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedMrec<a> createMrec() {
        return new com.appodeal.ads.adapters.mytarget.mrec.a();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedNative<a> createNativeAd() {
        return new com.appodeal.ads.adapters.mytarget.native_ad.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedRewarded<a> createRewarded() {
        return new com.appodeal.ads.adapters.mytarget.rewarded_video.a();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NonNull
    public String getRecommendedVersion() {
        return "5.27.4";
    }

    @Override // com.appodeal.ads.AdNetwork
    @NonNull
    public String getVersion() {
        return "5.27.4";
    }

    @Override // com.appodeal.ads.AdNetwork
    public boolean isInitialized() {
        return isInitialized.get();
    }

    @Override // com.appodeal.ads.AdNetwork
    /* JADX INFO: renamed from: isSupportSmartBanners */
    public boolean getIsSupportSmartBanners() {
        return true;
    }

    @Override // com.appodeal.ads.AdNetwork
    public void setLogging(boolean z10) {
        MyTargetManager.setDebugMode(z10);
    }

    @Override // com.appodeal.ads.AdNetwork
    @NonNull
    public a getAdUnitParams(@NonNull ContextProvider contextProvider, @NonNull AdUnit adUnit, @NonNull AdNetworkMediationParams adNetworkMediationParams) {
        updateConsent(adNetworkMediationParams.getRestrictedData());
        configureTestDevice(adNetworkMediationParams.isTestMode(), adNetworkMediationParams.getRestrictedData());
        return new a(adUnit.getJsonData().getInt("mailru_slot_id"), adUnit.getMediatorName());
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public b getInitializeParams(@Nullable JSONObject jSONObject) {
        return new b();
    }

    @Override // com.appodeal.ads.AdNetwork
    public void initialize(@NonNull ContextProvider contextProvider, @NonNull b bVar, @NonNull AdNetworkMediationParams adNetworkMediationParams, @NonNull AdNetworkInitializationListener adNetworkInitializationListener) {
        updateConsent(adNetworkMediationParams.getRestrictedData());
        configureTestDevice(adNetworkMediationParams.isTestMode(), adNetworkMediationParams.getRestrictedData());
        MyTargetManager.initSdk(contextProvider.getApplicationContext());
        isInitialized.set(true);
        adNetworkInitializationListener.onInitializationFinished();
    }
}
