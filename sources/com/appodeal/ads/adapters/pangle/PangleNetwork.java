package com.appodeal.ads.adapters.pangle;

import android.content.Context;
import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkInitializationListener;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
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
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0005B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001b\u0010\u000b\u001a\u00020\b*\u00020\b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0016\u001a\u0004\u0018\u00010\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J/\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 J'\u0010#\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b#\u0010$R\"\u0010'\u001a\n &*\u0004\u0018\u00010%0%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u001a\u0010+\u001a\u00020%8\u0016X\u0096D¢\u0006\f\n\u0004\b+\u0010(\u001a\u0004\b,\u0010*¨\u0006-"}, d2 = {"Lcom/appodeal/ads/adapters/pangle/PangleNetwork;", "Lcom/appodeal/ads/AdNetwork;", "Lcom/appodeal/ads/adapters/pangle/b;", "Lcom/appodeal/ads/adapters/pangle/a;", "Lcom/appodeal/ads/AdNetworkBuilder;", "builder", "<init>", "(Lcom/appodeal/ads/AdNetworkBuilder;)V", "Lcom/bytedance/sdk/openadsdk/api/init/PAGConfig$Builder;", "Lcom/appodeal/ads/RestrictedData;", "restrictedData", "updateConsent", "(Lcom/bytedance/sdk/openadsdk/api/init/PAGConfig$Builder;Lcom/appodeal/ads/RestrictedData;)Lcom/bytedance/sdk/openadsdk/api/init/PAGConfig$Builder;", "", "enabled", "", "setLogging", "(Z)V", "isInitialized", "()Z", "Lorg/json/JSONObject;", "jsonObject", "getInitializeParams", "(Lorg/json/JSONObject;)Lcom/appodeal/ads/adapters/pangle/b;", "Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;", "contextProvider", "initParams", "Lcom/appodeal/ads/AdNetworkMediationParams;", "mediationParams", "Lcom/appodeal/ads/AdNetworkInitializationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, MobileAdsBridgeBase.initializeMethodName, "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/adapters/pangle/b;Lcom/appodeal/ads/AdNetworkMediationParams;Lcom/appodeal/ads/AdNetworkInitializationListener;)V", "Lcom/appodeal/ads/AdUnit;", "adUnit", "getAdUnitParams", "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/AdUnit;Lcom/appodeal/ads/AdNetworkMediationParams;)Lcom/appodeal/ads/adapters/pangle/a;", "", "kotlin.jvm.PlatformType", "version", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "recommendedVersion", "getRecommendedVersion", "pangle_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PangleNetwork extends AdNetwork<b, a> {

    @NotNull
    private final String recommendedVersion;
    private final String version;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/appodeal/ads/adapters/pangle/PangleNetwork$builder;", "Lcom/appodeal/ads/AdNetworkBuilder;", "<init>", "()V", "adActivities", "", "", "getAdActivities", "()Ljava/util/List;", "build", "Lcom/appodeal/ads/adapters/pangle/PangleNetwork;", "pangle_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class builder extends AdNetworkBuilder {

        @NotNull
        private final List<String> adActivities;

        public builder() {
            super("pangle", "0");
            this.adActivities = CollectionsKt.listOf((Object[]) new String[]{"com.bytedance.sdk.openadsdk.activity.TTLandingPageActivity", "com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity", "com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageActivity", "com.bytedance.sdk.openadsdk.activity.TTVideoLandingPageLink2Activity", "com.bytedance.sdk.openadsdk.activity.TTRewardVideoActivity", "com.bytedance.sdk.openadsdk.activity.TTRewardExpressVideoActivity", "com.bytedance.sdk.openadsdk.activity.TTFullScreenVideoActivity", "com.bytedance.sdk.openadsdk.activity.TTFullScreenExpressVideoActivity", "com.bytedance.sdk.openadsdk.activity.TTInterstitialActivity", "com.bytedance.sdk.openadsdk.activity.TTInterstitialExpressActivity", "com.bytedance.sdk.openadsdk.activity.TTDelegateActivity", "com.bytedance.sdk.openadsdk.activity.TTWebsiteActivity", "com.bytedance.sdk.openadsdk.activity.TTAppOpenAdActivity", "com.bytedance.sdk.openadsdk.adapter.PangleAdInterstitialActivity"});
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public List<String> getAdActivities() {
            return this.adActivities;
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public PangleNetwork build() {
            return new PangleNetwork(this, null);
        }
    }

    public /* synthetic */ PangleNetwork(AdNetworkBuilder adNetworkBuilder, DefaultConstructorMarker defaultConstructorMarker) {
        this(adNetworkBuilder);
    }

    private final PAGConfig.Builder updateConsent(PAGConfig.Builder builder2, RestrictedData restrictedData) {
        boolean zIsUserHasConsent = restrictedData.isUserHasConsent();
        if (restrictedData.isUserInGdprScope()) {
            if (zIsUserHasConsent) {
                builder2.setGDPRConsent(1);
                return builder2;
            }
            builder2.setGDPRConsent(0);
        }
        return builder2;
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public String getRecommendedVersion() {
        return this.recommendedVersion;
    }

    @Override // com.appodeal.ads.AdNetwork
    public String getVersion() {
        return this.version;
    }

    @Override // com.appodeal.ads.AdNetwork
    public void initialize(@NotNull ContextProvider contextProvider, @NotNull b initParams, @NotNull AdNetworkMediationParams mediationParams, @NotNull final AdNetworkInitializationListener listener) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(initParams, "initParams");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String str = initParams.f12555a;
        if (str.length() == 0) {
            LogExtKt.logInternal$default("Pangle init", "AppId was not provided", null, 4, null);
            listener.onInitializationFailed(LoadingError.InternalError);
        } else {
            Context applicationContext = contextProvider.getApplicationContext();
            PAGConfig.Builder builderSupportMultiProcess = new PAGConfig.Builder().appId(str).supportMultiProcess(false);
            Intrinsics.checkNotNullExpressionValue(builderSupportMultiProcess, "supportMultiProcess(...)");
            PAGSdk.init(applicationContext, updateConsent(builderSupportMultiProcess, mediationParams.getRestrictedData()).build(), new PAGSdk.PAGInitCallback() { // from class: com.appodeal.ads.adapters.pangle.PangleNetwork.initialize.1
                @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
                public void fail(int code, String message) {
                    listener.onInitializationFailed(LoadingError.InternalError);
                    LogExtKt.logInternal$default(null, "Pangle init error: " + code + ". " + message, null, 5, null);
                }

                @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
                public void success() {
                    listener.onInitializationFinished();
                }
            });
        }
    }

    @Override // com.appodeal.ads.AdNetwork
    public boolean isInitialized() {
        return PAGSdk.isInitSuccess();
    }

    @Override // com.appodeal.ads.AdNetwork
    public void setLogging(boolean enabled) {
        PAGConfig.debugLog(enabled);
    }

    private PangleNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
        this.version = PAGSdk.getSDKVersion();
        this.recommendedVersion = BuildConfig.VERSION_NAME;
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public a getAdUnitParams(@NotNull ContextProvider contextProvider, @NotNull AdUnit adUnit, @NotNull AdNetworkMediationParams mediationParams) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        return new a();
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public b getInitializeParams(@Nullable JSONObject jsonObject) {
        Object objB;
        String strOptString;
        try {
            Result.Companion companion = Result.f93230c;
            if (jsonObject == null || (strOptString = jsonObject.optString("app_id")) == null) {
                strOptString = "";
            }
            objB = Result.b(new b(strOptString));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        return (b) objB;
    }
}
