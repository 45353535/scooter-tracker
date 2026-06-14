package com.appodeal.ads.adapters.inmobi;

import android.app.Activity;
import android.content.Context;
import android.location.Location;
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
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.inmobi.sdk.InMobiSdk;
import com.inmobi.sdk.SdkInitializationListener;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0005B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030 H\u0016¢\u0006\u0004\b!\u0010\"J\u0017\u0010%\u001a\u00020\n2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020#H\u0016¢\u0006\u0004\b'\u0010(J\u001b\u0010*\u001a\u0004\u0018\u00010\u00022\b\u0010)\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b*\u0010+J/\u00103\u001a\u00020\n2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\u00022\u0006\u00100\u001a\u00020/2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J'\u00107\u001a\u00020\u00032\u0006\u0010-\u001a\u00020,2\u0006\u00106\u001a\u0002052\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\b7\u00108R\u001a\u0010:\u001a\u0002098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=R\u001a\u0010>\u001a\u0002098\u0016X\u0096D¢\u0006\f\n\u0004\b>\u0010;\u001a\u0004\b?\u0010=¨\u0006@"}, d2 = {"Lcom/appodeal/ads/adapters/inmobi/InmobiNetwork;", "Lcom/appodeal/ads/AdNetwork;", "Lcom/appodeal/ads/adapters/inmobi/c;", "Lcom/appodeal/ads/adapters/inmobi/b;", "Lcom/appodeal/ads/AdNetworkBuilder;", "builder", "<init>", "(Lcom/appodeal/ads/AdNetworkBuilder;)V", "Lcom/appodeal/ads/RestrictedData;", "restrictedData", "", "updateConsent", "(Lcom/appodeal/ads/RestrictedData;)V", "Lorg/json/JSONObject;", "getConsentJson", "(Lcom/appodeal/ads/RestrictedData;)Lorg/json/JSONObject;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "setTargeting", "(Landroid/content/Context;Lcom/appodeal/ads/RestrictedData;)V", "Lcom/appodeal/ads/unified/UnifiedBanner;", "createBanner", "()Lcom/appodeal/ads/unified/UnifiedBanner;", "Lcom/appodeal/ads/unified/UnifiedMrec;", "createMrec", "()Lcom/appodeal/ads/unified/UnifiedMrec;", "Lcom/appodeal/ads/unified/UnifiedInterstitial;", "createInterstitial", "()Lcom/appodeal/ads/unified/UnifiedInterstitial;", "Lcom/appodeal/ads/unified/UnifiedRewarded;", "createRewarded", "()Lcom/appodeal/ads/unified/UnifiedRewarded;", "Lcom/appodeal/ads/unified/UnifiedNative;", "createNativeAd", "()Lcom/appodeal/ads/unified/UnifiedNative;", "", "enabled", "setLogging", "(Z)V", "isInitialized", "()Z", "jsonObject", "getInitializeParams", "(Lorg/json/JSONObject;)Lcom/appodeal/ads/adapters/inmobi/c;", "Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;", "contextProvider", "initParams", "Lcom/appodeal/ads/AdNetworkMediationParams;", "mediationParams", "Lcom/appodeal/ads/AdNetworkInitializationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, MobileAdsBridgeBase.initializeMethodName, "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/adapters/inmobi/c;Lcom/appodeal/ads/AdNetworkMediationParams;Lcom/appodeal/ads/AdNetworkInitializationListener;)V", "Lcom/appodeal/ads/AdUnit;", "adUnit", "getAdUnitParams", "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/AdUnit;Lcom/appodeal/ads/AdNetworkMediationParams;)Lcom/appodeal/ads/adapters/inmobi/b;", "", "version", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "recommendedVersion", "getRecommendedVersion", "inmobi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class InmobiNetwork extends AdNetwork<c, b> {

    @NotNull
    private final String recommendedVersion;

    @NotNull
    private final String version;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/appodeal/ads/adapters/inmobi/InmobiNetwork$builder;", "Lcom/appodeal/ads/AdNetworkBuilder;", "<init>", "()V", "adActivities", "", "", "getAdActivities", "()Ljava/util/List;", "build", "Lcom/appodeal/ads/adapters/inmobi/InmobiNetwork;", "inmobi_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class builder extends AdNetworkBuilder {
        public builder() {
            super("inmobi", "0");
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public List<String> getAdActivities() {
            return CollectionsKt.listOf("com.inmobi.ads.rendering.InMobiAdActivity");
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public InmobiNetwork build() {
            return new InmobiNetwork(this, null);
        }
    }

    public /* synthetic */ InmobiNetwork(AdNetworkBuilder adNetworkBuilder, DefaultConstructorMarker defaultConstructorMarker) {
        this(adNetworkBuilder);
    }

    private final JSONObject getConsentJson(RestrictedData restrictedData) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(InMobiSdk.IM_GDPR_CONSENT_AVAILABLE, restrictedData.isUserHasConsent());
        jSONObject.put("gdpr", restrictedData.isUserInGdprScope() ? "1" : "0");
        String iabConsentString = restrictedData.getIabConsentString();
        if (iabConsentString != null && iabConsentString.length() != 0) {
            jSONObject.put(InMobiSdk.IM_GDPR_CONSENT_IAB, restrictedData.getIabConsentString());
        }
        return jSONObject;
    }

    private final void setTargeting(Context context, RestrictedData restrictedData) {
        Location deviceLocation = restrictedData.getLocation(context).getDeviceLocation();
        if (deviceLocation != null) {
            InMobiSdk.setLocation(deviceLocation);
        }
    }

    private final void updateConsent(RestrictedData restrictedData) {
        if (restrictedData.isUserInGdprScope()) {
            InMobiSdk.updateGDPRConsent(getConsentJson(restrictedData));
        }
        InMobiSdk.setIsAgeRestricted(restrictedData.isUserAgeRestricted());
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public UnifiedBanner<b> createBanner() {
        return new com.appodeal.ads.adapters.inmobi.banner.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public UnifiedInterstitial<b> createInterstitial() {
        return new com.appodeal.ads.adapters.inmobi.interstitial.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public UnifiedMrec<b> createMrec() {
        return new com.appodeal.ads.adapters.inmobi.mrec.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public UnifiedNative<b> createNativeAd() {
        return new com.appodeal.ads.adapters.inmobi.native_ad.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public UnifiedRewarded<b> createRewarded() {
        return new com.appodeal.ads.adapters.inmobi.rewarded.b();
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
    public boolean isInitialized() {
        return InMobiSdk.isSDKInitialized();
    }

    @Override // com.appodeal.ads.AdNetwork
    public void setLogging(boolean enabled) {
        if (enabled) {
            InMobiSdk.setLogLevel(InMobiSdk.LogLevel.DEBUG);
        } else {
            InMobiSdk.setLogLevel(InMobiSdk.LogLevel.NONE);
        }
    }

    private InmobiNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
        this.version = InMobiSdk.getVersion();
        this.recommendedVersion = "11.1.0";
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public b getAdUnitParams(@NotNull ContextProvider contextProvider, @NotNull AdUnit adUnit, @NotNull AdNetworkMediationParams mediationParams) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        Boolean boolIsMuted = adUnit.isMuted();
        if (boolIsMuted != null) {
            InMobiSdk.setApplicationMuted(boolIsMuted.booleanValue());
        }
        Context applicationContext = contextProvider.getApplicationContext();
        RestrictedData restrictedData = mediationParams.getRestrictedData();
        setTargeting(applicationContext, restrictedData);
        updateConsent(restrictedData);
        return new b(adUnit.getJsonData().optLong(Reporting.Key.PLACEMENT_ID));
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public c getInitializeParams(@Nullable JSONObject jsonObject) {
        Object objB;
        String strOptString;
        try {
            Result.Companion companion = Result.f93230c;
            if (jsonObject == null || (strOptString = jsonObject.optString("acc_id")) == null) {
                strOptString = "";
            }
            objB = Result.b(new c(strOptString, jsonObject != null ? Boolean.valueOf(jsonObject.optBoolean("mute")) : null));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        return (c) (Result.i(objB) ? null : objB);
    }

    @Override // com.appodeal.ads.AdNetwork
    public void initialize(@NotNull ContextProvider contextProvider, @NotNull c initParams, @NotNull AdNetworkMediationParams mediationParams, @NotNull final AdNetworkInitializationListener listener) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(initParams, "initParams");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Activity resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity == null) {
            listener.onInitializationFailed(LoadingError.InternalError);
            return;
        }
        String str = initParams.f12354a;
        if (str.length() == 0) {
            listener.onInitializationFailed(LoadingError.IncorrectAdunit);
            return;
        }
        RestrictedData restrictedData = mediationParams.getRestrictedData();
        setTargeting(resumedActivity, restrictedData);
        updateConsent(restrictedData);
        Boolean bool = initParams.f12355b;
        if (bool != null) {
            InMobiSdk.setApplicationMuted(bool.booleanValue());
        }
        if (InMobiSdk.isSDKInitialized()) {
            listener.onInitializationFinished();
        } else {
            InMobiSdk.init(resumedActivity, str, getConsentJson(restrictedData), new SdkInitializationListener() { // from class: com.appodeal.ads.adapters.inmobi.InmobiNetwork.initialize.1
                @Override // com.inmobi.sdk.SdkInitializationListener
                public void onInitializationComplete(Error error) {
                    if (error != null) {
                        listener.onInitializationFailed(LoadingError.InternalError);
                    } else {
                        listener.onInitializationFinished();
                    }
                }
            });
        }
    }
}
