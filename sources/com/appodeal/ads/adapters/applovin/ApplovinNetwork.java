package com.appodeal.ads.adapters.applovin;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.applovin.sdk.AppLovinSdkInitializationConfiguration;
import com.applovin.sdk.AppLovinSdkSettings;
import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkInitializationListener;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedRewarded;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ApplovinNetwork extends AdNetwork<c, b> {
    private static final AtomicBoolean isInitialized = new AtomicBoolean(false);
    private boolean loggingLevel;

    public static class builder extends AdNetworkBuilder {
        public builder() {
            super("applovin", "0");
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NonNull
        public List<String> getAdActivities() {
            return new d();
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NonNull
        public ApplovinNetwork build() {
            return new ApplovinNetwork(this);
        }
    }

    public ApplovinNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
    }

    public static /* synthetic */ void a(AdNetworkInitializationListener adNetworkInitializationListener, AppLovinSdkConfiguration appLovinSdkConfiguration) {
        isInitialized.set(true);
        adNetworkInitializationListener.onInitializationFinished();
    }

    private void setMediatorName(@NonNull AppLovinSdkInitializationConfiguration.Builder builder2, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        builder2.setMediationProvider(str);
    }

    private void updateConsent(@NonNull Context context, @NonNull RestrictedData restrictedData) {
        boolean zIsUserHasConsent = restrictedData.isUserHasConsent();
        if (restrictedData.isUserInGdprScope() && AppLovinPrivacySettings.hasUserConsent(context) != zIsUserHasConsent) {
            AppLovinPrivacySettings.setHasUserConsent(zIsUserHasConsent, context);
        }
        if (restrictedData.isUserInCcpaScope() && AppLovinPrivacySettings.isDoNotSell(context) == zIsUserHasConsent) {
            AppLovinPrivacySettings.setDoNotSell(!zIsUserHasConsent, context);
        }
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedBanner<b> createBanner() {
        return new com.appodeal.ads.adapters.applovin.banner.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedInterstitial<b> createInterstitial() {
        return new com.appodeal.ads.adapters.applovin.interstitial.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedMrec<b> createMrec() {
        return new com.appodeal.ads.adapters.applovin.mrec.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedRewarded<b> createRewarded() {
        return new com.appodeal.ads.adapters.applovin.rewarded_video.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NonNull
    public String getRecommendedVersion() {
        return "13.5.1";
    }

    @Override // com.appodeal.ads.AdNetwork
    @NonNull
    public String getVersion() {
        return AppLovinSdk.VERSION;
    }

    @Override // com.appodeal.ads.AdNetwork
    public boolean isInitialized() {
        return isInitialized.get();
    }

    @Override // com.appodeal.ads.AdNetwork
    public void setLogging(boolean z10) {
        this.loggingLevel = z10;
    }

    @Override // com.appodeal.ads.AdNetwork
    @NonNull
    public b getAdUnitParams(@NonNull ContextProvider contextProvider, @NonNull AdUnit adUnit, @NonNull AdNetworkMediationParams adNetworkMediationParams) throws Exception {
        String strOptString = adUnit.getJsonData().optString(Reporting.Key.ZONE_ID);
        updateConsent(contextProvider.getApplicationContext(), adNetworkMediationParams.getRestrictedData());
        return new b(strOptString);
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public c getInitializeParams(@Nullable JSONObject jSONObject) throws Exception {
        if (jSONObject == null) {
            return null;
        }
        return new c(jSONObject.getString("applovin_key"), jSONObject.optString("mediator"), jSONObject.optBoolean("mute"));
    }

    @Override // com.appodeal.ads.AdNetwork
    public void initialize(@NonNull ContextProvider contextProvider, @NonNull c cVar, @NonNull AdNetworkMediationParams adNetworkMediationParams, @NonNull final AdNetworkInitializationListener adNetworkInitializationListener) throws Exception {
        Activity resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity == null) {
            adNetworkInitializationListener.onInitializationFailed(LoadingError.InternalError);
            return;
        }
        String str = cVar.f11964a;
        updateConsent(resumedActivity, adNetworkMediationParams.getRestrictedData());
        AppLovinSdk appLovinSdk = AppLovinSdk.getInstance(resumedActivity);
        AppLovinSdkInitializationConfiguration.Builder builder2 = AppLovinSdkInitializationConfiguration.builder(str);
        if (adNetworkMediationParams.isTestMode()) {
            builder2.setTestDeviceAdvertisingIds(Collections.singletonList(adNetworkMediationParams.getRestrictedData().getIfa()));
        } else {
            builder2.setTestDeviceAdvertisingIds(Collections.EMPTY_LIST);
        }
        builder2.setExceptionHandlerEnabled(false);
        AppLovinSdkSettings settings = appLovinSdk.getSettings();
        settings.setVerboseLogging(this.loggingLevel);
        settings.setCreativeDebuggerEnabled(false);
        settings.setMuted(cVar.f11966c);
        setMediatorName(builder2, cVar.f11965b);
        appLovinSdk.initialize(builder2.build(), new AppLovinSdk.SdkInitializationListener() { // from class: com.appodeal.ads.adapters.applovin.a
            @Override // com.applovin.sdk.AppLovinSdk.SdkInitializationListener
            public final void onSdkInitialized(AppLovinSdkConfiguration appLovinSdkConfiguration) {
                ApplovinNetwork.a(adNetworkInitializationListener, appLovinSdkConfiguration);
            }
        });
    }
}
