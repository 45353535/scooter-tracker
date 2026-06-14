package com.appodeal.ads.adapters.dtexchange;

import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkInitializationListener;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.Appodeal;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.fyber.inneractive.sdk.external.InneractiveAdManager;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0005B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\u0004\u0018\u00010\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J/\u0010*\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#2\u0006\u0010-\u001a\u00020,2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u00103\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u00102R\u0014\u00105\u001a\u0002008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00102¨\u00066"}, d2 = {"Lcom/appodeal/ads/adapters/dtexchange/DTExchangeNetwork;", "Lcom/appodeal/ads/AdNetwork;", "Lcom/appodeal/ads/adapters/dtexchange/c;", "Lcom/appodeal/ads/adapters/dtexchange/b;", "Lcom/appodeal/ads/AdNetworkBuilder;", "builder", "<init>", "(Lcom/appodeal/ads/AdNetworkBuilder;)V", "Lcom/appodeal/ads/RestrictedData;", "restrictedData", "", "updateConsent", "(Lcom/appodeal/ads/RestrictedData;)V", "Lcom/appodeal/ads/adapters/dtexchange/banner/b;", "createBanner", "()Lcom/appodeal/ads/adapters/dtexchange/banner/b;", "Lcom/appodeal/ads/adapters/dtexchange/mrec/b;", "createMrec", "()Lcom/appodeal/ads/adapters/dtexchange/mrec/b;", "Lcom/appodeal/ads/adapters/dtexchange/interstitial/a;", "createInterstitial", "()Lcom/appodeal/ads/adapters/dtexchange/interstitial/a;", "Lcom/appodeal/ads/adapters/dtexchange/rewarded/a;", "createRewarded", "()Lcom/appodeal/ads/adapters/dtexchange/rewarded/a;", "", "enabled", "setLogging", "(Z)V", "isInitialized", "()Z", "Lorg/json/JSONObject;", "jsonObject", "getInitializeParams", "(Lorg/json/JSONObject;)Lcom/appodeal/ads/adapters/dtexchange/c;", "Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;", "contextProvider", "initParams", "Lcom/appodeal/ads/AdNetworkMediationParams;", "mediationParams", "Lcom/appodeal/ads/AdNetworkInitializationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, MobileAdsBridgeBase.initializeMethodName, "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/adapters/dtexchange/c;Lcom/appodeal/ads/AdNetworkMediationParams;Lcom/appodeal/ads/AdNetworkInitializationListener;)V", "Lcom/appodeal/ads/AdUnit;", "adUnit", "getAdUnitParams", "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/AdUnit;Lcom/appodeal/ads/AdNetworkMediationParams;)Lcom/appodeal/ads/adapters/dtexchange/b;", "", "getVersion", "()Ljava/lang/String;", "version", "getRecommendedVersion", "recommendedVersion", "dt_exchange_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DTExchangeNetwork extends AdNetwork<c, b> {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/appodeal/ads/adapters/dtexchange/DTExchangeNetwork$builder;", "Lcom/appodeal/ads/AdNetworkBuilder;", "<init>", "()V", "adActivities", "", "", "getAdActivities", "()Ljava/util/List;", "build", "Lcom/appodeal/ads/adapters/dtexchange/DTExchangeNetwork;", "dt_exchange_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class builder extends AdNetworkBuilder {
        public builder() {
            super("dt_exchange", "0");
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public List<String> getAdActivities() {
            return CollectionsKt.listOf((Object[]) new String[]{"com.fyber.inneractive.sdk.activities.InneractiveInternalBrowserActivity", "com.fyber.inneractive.sdk.activities.InneractiveFullscreenAdActivity", "com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore"});
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public DTExchangeNetwork build() {
            return new DTExchangeNetwork(this, null);
        }
    }

    public /* synthetic */ DTExchangeNetwork(AdNetworkBuilder adNetworkBuilder, DefaultConstructorMarker defaultConstructorMarker) {
        this(adNetworkBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$1(AdNetworkInitializationListener adNetworkInitializationListener, OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
        if (fyberInitStatus == OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
            adNetworkInitializationListener.onInitializationFinished();
        } else {
            adNetworkInitializationListener.onInitializationFailed(LoadingError.InternalError);
        }
    }

    private final void updateConsent(RestrictedData restrictedData) {
        if (restrictedData.isUserInGdprScope()) {
            String iabConsentString = restrictedData.getIabConsentString();
            if (iabConsentString == null || iabConsentString.length() == 0) {
                InneractiveAdManager.setGdprConsent(restrictedData.isUserHasConsent());
            } else {
                InneractiveAdManager.setGdprConsentString(restrictedData.getIabConsentString());
            }
        } else {
            InneractiveAdManager.clearGdprConsentData();
        }
        if (restrictedData.isUserInCcpaScope()) {
            String uSPrivacyString = restrictedData.getUSPrivacyString();
            if (uSPrivacyString != null && uSPrivacyString.length() != 0) {
                InneractiveAdManager.setUSPrivacyString(restrictedData.getUSPrivacyString());
            }
        } else {
            InneractiveAdManager.clearUSPrivacyString();
        }
        if (restrictedData.isUserAgeRestricted()) {
            InneractiveAdManager.currentAudienceAppliesToCoppa();
        }
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public String getRecommendedVersion() {
        return "8.4.1";
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public String getVersion() {
        String version = InneractiveAdManager.getVersion();
        Intrinsics.checkNotNullExpressionValue(version, "getVersion(...)");
        return version;
    }

    @Override // com.appodeal.ads.AdNetwork
    public void initialize(@NotNull ContextProvider contextProvider, @NotNull c initParams, @NotNull AdNetworkMediationParams mediationParams, @NotNull final AdNetworkInitializationListener listener) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(initParams, "initParams");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String str = initParams.f12190a;
        if (str.length() == 0) {
            listener.onInitializationFailed(LoadingError.IncorrectAdunit);
            return;
        }
        String str2 = initParams.f12191b;
        if (str2.length() > 0) {
            InneractiveAdManager.setUserId(str2);
        }
        Boolean bool = initParams.f12192c;
        if (bool != null) {
            InneractiveAdManager.setMuteVideo(bool.booleanValue());
        }
        updateConsent(mediationParams.getRestrictedData());
        InneractiveAdManager.initialize(contextProvider.getApplicationContext(), str, new OnFyberMarketplaceInitializedListener() { // from class: com.appodeal.ads.adapters.dtexchange.a
            @Override // com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener
            public final void onFyberMarketplaceInitialized(OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus) {
                DTExchangeNetwork.initialize$lambda$1(listener, fyberInitStatus);
            }
        });
    }

    @Override // com.appodeal.ads.AdNetwork
    public boolean isInitialized() {
        return InneractiveAdManager.wasInitialized();
    }

    @Override // com.appodeal.ads.AdNetwork
    public void setLogging(boolean enabled) {
        InneractiveAdManager.setLogLevel(enabled ? 2 : Integer.MAX_VALUE);
    }

    private DTExchangeNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.dtexchange.banner.b createBanner() {
        return new com.appodeal.ads.adapters.dtexchange.banner.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.dtexchange.interstitial.a createInterstitial() {
        return new com.appodeal.ads.adapters.dtexchange.interstitial.a();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.dtexchange.mrec.b createMrec() {
        return new com.appodeal.ads.adapters.dtexchange.mrec.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.dtexchange.rewarded.a createRewarded() {
        return new com.appodeal.ads.adapters.dtexchange.rewarded.a();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public b getAdUnitParams(@NotNull ContextProvider contextProvider, @NotNull AdUnit adUnit, @NotNull AdNetworkMediationParams mediationParams) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        String strOptString = adUnit.getJsonData().optString("spot_id");
        updateConsent(mediationParams.getRestrictedData());
        String mediatorName = adUnit.getMediatorName();
        String version = Appodeal.getVersion();
        Boolean boolIsMuted = adUnit.isMuted();
        Intrinsics.checkNotNull(strOptString);
        return new b(mediatorName, version, boolIsMuted, strOptString);
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public c getInitializeParams(@Nullable JSONObject jsonObject) {
        Object objB;
        String strOptString;
        String strOptString2;
        try {
            Result.Companion companion = Result.f93230c;
            String str = "";
            if (jsonObject == null || (strOptString = jsonObject.optString("app_id")) == null) {
                strOptString = "";
            }
            if (jsonObject != null && (strOptString2 = jsonObject.optString("publisher_id")) != null) {
                str = strOptString2;
            }
            objB = Result.b(new c(strOptString, str, jsonObject != null ? Boolean.valueOf(jsonObject.optBoolean("mute")) : null));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        return (c) (Result.i(objB) ? null : objB);
    }
}
