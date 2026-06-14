package com.appodeal.ads.adapters.admob.unified;

import android.content.Context;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkInitializationListener;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.google.android.gms.ads.AbstractAdRequestBuilder;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public abstract class UnifiedAdmobNetwork<AdRequestType extends AdRequest, AdRequestBuilderType extends AbstractAdRequestBuilder<AdRequestBuilderType>> extends AdNetwork<UnifiedAdmobInitParams, UnifiedAdmobAdUnitParams<AdRequestType>> {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final AtomicBoolean isInitialized = new AtomicBoolean(false);

    public static abstract class builder extends AdNetworkBuilder {
        public builder(@NonNull String str, @NonNull String str2) {
            super(str, str2);
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NonNull
        public List<String> getAdActivities() {
            return new a();
        }
    }

    public UnifiedAdmobNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
    }

    public static /* synthetic */ void a(AdNetworkInitializationListener adNetworkInitializationListener, InitializationStatus initializationStatus) {
        isInitialized.set(true);
        adNetworkInitializationListener.onInitializationFinished();
    }

    public static <AdRequestType extends AdRequest> LoadingError mapError(@Nullable LoadAdError loadAdError) {
        if (loadAdError == null) {
            return null;
        }
        int code = loadAdError.getCode();
        if (code != 0) {
            if (code == 1) {
                return LoadingError.IncorrectAdunit;
            }
            if (code == 2) {
                return LoadingError.ConnectionError;
            }
            if (code != 3) {
                return null;
            }
        }
        return LoadingError.NoFill;
    }

    private void setMediatorName(@NonNull AdRequestBuilderType adrequestbuildertype, @Nullable String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        adrequestbuildertype.setRequestAgent(str);
    }

    private void setTargeting(@NonNull Context context, @NonNull RequestConfiguration.Builder builder2, @NonNull AdNetworkMediationParams adNetworkMediationParams) {
        builder2.setTagForChildDirectedTreatment(adNetworkMediationParams.getRestrictedData().isUserAgeRestricted() ? 1 : 0);
        if (adNetworkMediationParams.isTestMode()) {
            builder2.setTestDeviceIds(Collections.singletonList(AdRequest.DEVICE_ID_EMULATOR));
        }
    }

    public AdRequestType configureAdRequest(@NonNull Context context, @NonNull AdUnit adUnit, @NonNull AdNetworkMediationParams adNetworkMediationParams) {
        AbstractAdRequestBuilder abstractAdRequestBuilderCreateAdRequestBuilder = createAdRequestBuilder(adUnit.getJsonData());
        RequestConfiguration.Builder builder2 = MobileAds.getRequestConfiguration().toBuilder();
        setMediatorName(abstractAdRequestBuilderCreateAdRequestBuilder, adUnit.getMediatorName());
        setTargeting(context, builder2, adNetworkMediationParams);
        MobileAds.setRequestConfiguration(builder2.build());
        return (AdRequestType) createAdRequest(abstractAdRequestBuilderCreateAdRequestBuilder);
    }

    @NonNull
    public abstract AdRequestType createAdRequest(@NonNull AdRequestBuilderType adrequestbuildertype);

    @NonNull
    public abstract AdRequestBuilderType createAdRequestBuilder(@NonNull JSONObject jSONObject);

    @Override // com.appodeal.ads.AdNetwork
    @NonNull
    public String getRecommendedVersion() {
        return BuildConfig.ADAPTER_SDK_VERSION;
    }

    @Override // com.appodeal.ads.AdNetwork
    @NonNull
    public String getVersion() {
        return MobileAds.getVersion().toString();
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
    @NonNull
    public UnifiedAdmobAdUnitParams<AdRequestType> getAdUnitParams(@NonNull ContextProvider contextProvider, @NonNull AdUnit adUnit, @NonNull AdNetworkMediationParams adNetworkMediationParams) throws JSONException {
        JSONObject jsonData = adUnit.getJsonData();
        String string = jsonData.getString("admob_key");
        boolean zOptBoolean = jsonData.optBoolean("use_adaptive_banner", false);
        boolean zOptBoolean2 = jsonData.optBoolean("use_smart_banner", false);
        Boolean boolIsMuted = adUnit.isMuted();
        AdRequest adRequestConfigureAdRequest = configureAdRequest(contextProvider.getApplicationContext(), adUnit, adNetworkMediationParams);
        boolean z10 = false;
        if (boolIsMuted == null || boolIsMuted.booleanValue()) {
            z10 = true;
        }
        return new UnifiedAdmobAdUnitParams<>(adRequestConfigureAdRequest, string, z10, zOptBoolean, zOptBoolean2);
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public UnifiedAdmobInitParams getInitializeParams(@Nullable JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        return new UnifiedAdmobInitParams(jSONObject.optBoolean("disable_mediation_initialization"));
    }

    @Override // com.appodeal.ads.AdNetwork
    public void initialize(@NonNull ContextProvider contextProvider, @NonNull UnifiedAdmobInitParams unifiedAdmobInitParams, @NonNull AdNetworkMediationParams adNetworkMediationParams, @NonNull final AdNetworkInitializationListener adNetworkInitializationListener) {
        if (unifiedAdmobInitParams.getIsDisableMediationInit()) {
            MobileAds.disableMediationAdapterInitialization(contextProvider.getApplicationContext());
        }
        MobileAds.initialize(contextProvider.getApplicationContext(), new OnInitializationCompleteListener() { // from class: com.appodeal.ads.adapters.admob.unified.b
            @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
            public final void onInitializationComplete(InitializationStatus initializationStatus) {
                UnifiedAdmobNetwork.a(adNetworkInitializationListener, initializationStatus);
            }
        });
    }
}
