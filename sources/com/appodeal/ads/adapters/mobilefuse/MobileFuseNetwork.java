package com.appodeal.ads.adapters.mobilefuse;

import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkInitializationListener;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mobilefuse.sdk.MobileFuse;
import com.mobilefuse.sdk.MobileFuseSettings;
import com.mobilefuse.sdk.SdkInitListener;
import com.mobilefuse.sdk.privacy.MobileFusePrivacyPreferences;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0005B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\u0004\u0018\u00010\u00022\b\u0010 \u001a\u0004\u0018\u00010\u001fH\u0016¢\u0006\u0004\b!\u0010\"J/\u0010*\u001a\u00020\n2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020\u00022\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\u00032\u0006\u0010$\u001a\u00020#2\u0006\u0010-\u001a\u00020,2\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b.\u0010/R\u0014\u0010\u001d\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00101R\u001a\u00103\u001a\u0002028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u00107\u001a\u0002028\u0016X\u0096D¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b8\u00106¨\u00069"}, d2 = {"Lcom/appodeal/ads/adapters/mobilefuse/MobileFuseNetwork;", "Lcom/appodeal/ads/AdNetwork;", "Lcom/appodeal/ads/adapters/mobilefuse/b;", "Lcom/appodeal/ads/adapters/mobilefuse/a;", "Lcom/appodeal/ads/AdNetworkBuilder;", "builder", "<init>", "(Lcom/appodeal/ads/AdNetworkBuilder;)V", "Lcom/appodeal/ads/RestrictedData;", "restrictedData", "", "updateConsent", "(Lcom/appodeal/ads/RestrictedData;)V", "Lcom/appodeal/ads/adapters/mobilefuse/banner/c;", "createBanner", "()Lcom/appodeal/ads/adapters/mobilefuse/banner/c;", "Lcom/appodeal/ads/adapters/mobilefuse/mrec/c;", "createMrec", "()Lcom/appodeal/ads/adapters/mobilefuse/mrec/c;", "Lcom/appodeal/ads/adapters/mobilefuse/interstitial/c;", "createInterstitial", "()Lcom/appodeal/ads/adapters/mobilefuse/interstitial/c;", "Lcom/appodeal/ads/adapters/mobilefuse/rewarded/c;", "createRewarded", "()Lcom/appodeal/ads/adapters/mobilefuse/rewarded/c;", "Lcom/appodeal/ads/adapters/mobilefuse/native_ad/c;", "createNativeAd", "()Lcom/appodeal/ads/adapters/mobilefuse/native_ad/c;", "", "isInitialized", "()Z", "Lorg/json/JSONObject;", "jsonObject", "getInitializeParams", "(Lorg/json/JSONObject;)Lcom/appodeal/ads/adapters/mobilefuse/b;", "Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;", "contextProvider", "initParams", "Lcom/appodeal/ads/AdNetworkMediationParams;", "mediationParams", "Lcom/appodeal/ads/AdNetworkInitializationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, MobileAdsBridgeBase.initializeMethodName, "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/adapters/mobilefuse/b;Lcom/appodeal/ads/AdNetworkMediationParams;Lcom/appodeal/ads/AdNetworkInitializationListener;)V", "Lcom/appodeal/ads/AdUnit;", "adUnit", "getAdUnitParams", "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/AdUnit;Lcom/appodeal/ads/AdNetworkMediationParams;)Lcom/appodeal/ads/adapters/mobilefuse/a;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "", "version", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "recommendedVersion", "getRecommendedVersion", "mobilefuse_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MobileFuseNetwork extends AdNetwork<b, a> {

    @NotNull
    private final AtomicBoolean isInitialized;

    @NotNull
    private final String recommendedVersion;

    @NotNull
    private final String version;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/appodeal/ads/adapters/mobilefuse/MobileFuseNetwork$builder;", "Lcom/appodeal/ads/AdNetworkBuilder;", "<init>", "()V", "adActivities", "", "", "getAdActivities", "()Ljava/util/List;", "build", "Lcom/appodeal/ads/adapters/mobilefuse/MobileFuseNetwork;", "mobilefuse_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class builder extends AdNetworkBuilder {
        public builder() {
            super("mobilefuse", "0");
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public List<String> getAdActivities() {
            return CollectionsKt.arrayListOf("com.mobilefuse.sdk.MobileFuseFullscreenActivity", "com.mobilefuse.sdk.MobileFuseFullscreenTransparentActivity", "com.mobilefuse.sdk.experimental.NativeInterstitialActivity");
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public MobileFuseNetwork build() {
            return new MobileFuseNetwork(this, null);
        }
    }

    public /* synthetic */ MobileFuseNetwork(AdNetworkBuilder adNetworkBuilder, DefaultConstructorMarker defaultConstructorMarker) {
        this(adNetworkBuilder);
    }

    private final void updateConsent(RestrictedData restrictedData) {
        MobileFusePrivacyPreferences.Builder builder2 = new MobileFusePrivacyPreferences.Builder();
        if (restrictedData.isUserInGdprScope()) {
            builder2.setGppConsentString(restrictedData.getIabConsentString());
        } else if (restrictedData.isUserInCcpaScope()) {
            builder2.setUsPrivacyConsentString(restrictedData.getUSPrivacyString());
        }
        builder2.setSubjectToCoppa(restrictedData.isUserAgeRestricted());
        MobileFuse.setPrivacyPreferences(builder2.build());
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public String getRecommendedVersion() {
        return this.recommendedVersion;
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public String getVersion() {
        return this.version;
    }

    @Override // com.appodeal.ads.AdNetwork
    public void initialize(@NotNull ContextProvider contextProvider, @NotNull b initParams, @NotNull AdNetworkMediationParams mediationParams, @NotNull final AdNetworkInitializationListener listener) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(initParams, "initParams");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        Intrinsics.checkNotNullParameter(listener, "listener");
        int i10 = initParams.f12516a;
        int i11 = initParams.f12517b;
        if (i10 == 0 || i11 == 0) {
            listener.onInitializationFailed(LoadingError.IncorrectAdunit);
            return;
        }
        MobileFuseSettings.setTestMode(mediationParams.isTestMode());
        updateConsent(mediationParams.getRestrictedData());
        if (this.isInitialized.get()) {
            listener.onInitializationFinished();
        } else {
            MobileFuse.init(contextProvider.getApplicationContext(), i10, i11, new SdkInitListener() { // from class: com.appodeal.ads.adapters.mobilefuse.MobileFuseNetwork.initialize.1
                @Override // com.mobilefuse.sdk.SdkInitListener
                public void onInitError() {
                    listener.onInitializationFailed(LoadingError.InternalError);
                }

                @Override // com.mobilefuse.sdk.SdkInitListener
                public void onInitSuccess() {
                    MobileFuseNetwork.this.isInitialized.set(true);
                    listener.onInitializationFinished();
                }
            });
        }
    }

    @Override // com.appodeal.ads.AdNetwork
    public boolean isInitialized() {
        return this.isInitialized.get();
    }

    private MobileFuseNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
        this.isInitialized = new AtomicBoolean(false);
        String sdkVersion = MobileFuse.getSdkVersion();
        Intrinsics.checkNotNullExpressionValue(sdkVersion, "getSdkVersion(...)");
        this.version = sdkVersion;
        this.recommendedVersion = "1.9.3";
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.mobilefuse.banner.c createBanner() {
        return new com.appodeal.ads.adapters.mobilefuse.banner.c();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.mobilefuse.interstitial.c createInterstitial() {
        return new com.appodeal.ads.adapters.mobilefuse.interstitial.c();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.mobilefuse.mrec.c createMrec() {
        return new com.appodeal.ads.adapters.mobilefuse.mrec.c();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.mobilefuse.native_ad.c createNativeAd() {
        return new com.appodeal.ads.adapters.mobilefuse.native_ad.c();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.mobilefuse.rewarded.c createRewarded() {
        return new com.appodeal.ads.adapters.mobilefuse.rewarded.c();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public a getAdUnitParams(@NotNull ContextProvider contextProvider, @NotNull AdUnit adUnit, @NotNull AdNetworkMediationParams mediationParams) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        MobileFuseSettings.setTestMode(mediationParams.isTestMode());
        updateConsent(mediationParams.getRestrictedData());
        String strOptString = adUnit.getJsonData().optString(Reporting.Key.PLACEMENT_ID);
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        return new a(strOptString, Intrinsics.areEqual(adUnit.isMuted(), Boolean.TRUE));
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public b getInitializeParams(@Nullable JSONObject jsonObject) {
        Object objB;
        try {
            Result.Companion companion = Result.f93230c;
            objB = Result.b(new b(jsonObject != null ? jsonObject.optInt("publisher_id") : 0, jsonObject != null ? jsonObject.optInt("app_id") : 0));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        return (b) objB;
    }
}
