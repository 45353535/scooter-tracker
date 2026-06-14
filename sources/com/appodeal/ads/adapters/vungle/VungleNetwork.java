package com.appodeal.ads.adapters.vungle;

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
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.vungle.ads.InitializationListener;
import com.vungle.ads.VungleAds;
import com.vungle.ads.VungleError;
import com.vungle.ads.VunglePrivacySettings;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010'\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J'\u0010+\u001a\u00020\u00032\u0006\u0010!\u001a\u00020 2\u0006\u0010*\u001a\u00020)2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b+\u0010,R\u001a\u0010.\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u001a\u00102\u001a\u00020-8\u0016X\u0096D¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u00101¨\u00064"}, d2 = {"Lcom/appodeal/ads/adapters/vungle/VungleNetwork;", "Lcom/appodeal/ads/AdNetwork;", "Lcom/appodeal/ads/adapters/vungle/b;", "Lcom/appodeal/ads/adapters/vungle/a;", "Lcom/appodeal/ads/AdNetworkBuilder;", "builder", "<init>", "(Lcom/appodeal/ads/AdNetworkBuilder;)V", "Lcom/appodeal/ads/RestrictedData;", "restrictedData", "", "updateConsent", "(Lcom/appodeal/ads/RestrictedData;)V", "Lcom/appodeal/ads/adapters/vungle/rewarded_video/b;", "createRewarded", "()Lcom/appodeal/ads/adapters/vungle/rewarded_video/b;", "Lcom/appodeal/ads/adapters/vungle/interstitial/a;", "createInterstitial", "()Lcom/appodeal/ads/adapters/vungle/interstitial/a;", "Lcom/appodeal/ads/adapters/vungle/banner/b;", "createBanner", "()Lcom/appodeal/ads/adapters/vungle/banner/b;", "Lcom/appodeal/ads/adapters/vungle/mrec/b;", "createMrec", "()Lcom/appodeal/ads/adapters/vungle/mrec/b;", "", "isInitialized", "()Z", "Lorg/json/JSONObject;", "jsonObject", "getInitializeParams", "(Lorg/json/JSONObject;)Lcom/appodeal/ads/adapters/vungle/b;", "Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;", "contextProvider", "initParams", "Lcom/appodeal/ads/AdNetworkMediationParams;", "mediationParams", "Lcom/appodeal/ads/AdNetworkInitializationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, MobileAdsBridgeBase.initializeMethodName, "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/adapters/vungle/b;Lcom/appodeal/ads/AdNetworkMediationParams;Lcom/appodeal/ads/AdNetworkInitializationListener;)V", "Lcom/appodeal/ads/AdUnit;", "adUnit", "getAdUnitParams", "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/AdUnit;Lcom/appodeal/ads/AdNetworkMediationParams;)Lcom/appodeal/ads/adapters/vungle/a;", "", "version", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "recommendedVersion", "getRecommendedVersion", "vungle_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class VungleNetwork extends AdNetwork<b, a> {

    @NotNull
    private final String recommendedVersion;

    @NotNull
    private final String version;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/appodeal/ads/adapters/vungle/VungleNetwork$builder;", "Lcom/appodeal/ads/AdNetworkBuilder;", "<init>", "()V", "adActivities", "", "", "getAdActivities", "()Ljava/util/List;", "build", "Lcom/appodeal/ads/adapters/vungle/VungleNetwork;", "vungle_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class builder extends AdNetworkBuilder {

        @NotNull
        private final List<String> adActivities;

        public builder() {
            super("vungle", "0");
            this.adActivities = CollectionsKt.listOf("com.vungle.ads.internal.ui.VungleActivity");
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public List<String> getAdActivities() {
            return this.adActivities;
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public VungleNetwork build() {
            return new VungleNetwork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VungleNetwork(@NotNull AdNetworkBuilder builder2) {
        super(builder2);
        Intrinsics.checkNotNullParameter(builder2, "builder");
        this.version = VungleAds.INSTANCE.getSdkVersion();
        this.recommendedVersion = "0";
    }

    private final void updateConsent(RestrictedData restrictedData) {
        if (restrictedData.isUserInGdprScope()) {
            VunglePrivacySettings.setGDPRStatus(restrictedData.isUserHasConsent(), null);
        }
        if (restrictedData.isUserInCcpaScope()) {
            VunglePrivacySettings.setCCPAStatus(restrictedData.isUserHasConsent());
        }
        VunglePrivacySettings.setCOPPAStatus(restrictedData.isUserAgeRestricted());
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
        String str = initParams.f12596a;
        if (str.length() == 0) {
            listener.onInitializationFailed(LoadingError.IncorrectAdunit);
            return;
        }
        Context applicationContext = contextProvider.getApplicationContext();
        updateConsent(mediationParams.getRestrictedData());
        VungleAds.Companion companion = VungleAds.INSTANCE;
        if (companion.isInitialized()) {
            listener.onInitializationFinished();
        } else {
            companion.init(applicationContext, str, new InitializationListener() { // from class: com.appodeal.ads.adapters.vungle.VungleNetwork.initialize.1
                @Override // com.vungle.ads.InitializationListener
                public void onError(VungleError vungleError) {
                    Intrinsics.checkNotNullParameter(vungleError, "vungleError");
                    LogExtKt.logInternal("Vungle init", vungleError.getErrorMessage(), vungleError);
                    listener.onInitializationFailed(LoadingError.InternalError);
                }

                @Override // com.vungle.ads.InitializationListener
                public void onSuccess() {
                    listener.onInitializationFinished();
                }
            });
        }
    }

    @Override // com.appodeal.ads.AdNetwork
    public boolean isInitialized() {
        return VungleAds.INSTANCE.isInitialized();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.vungle.banner.b createBanner() {
        return new com.appodeal.ads.adapters.vungle.banner.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.vungle.interstitial.a createInterstitial() {
        return new com.appodeal.ads.adapters.vungle.interstitial.a();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.vungle.mrec.b createMrec() {
        return new com.appodeal.ads.adapters.vungle.mrec.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.vungle.rewarded_video.b createRewarded() {
        return new com.appodeal.ads.adapters.vungle.rewarded_video.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public a getAdUnitParams(@NotNull ContextProvider contextProvider, @NotNull AdUnit adUnit, @NotNull AdNetworkMediationParams mediationParams) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        updateConsent(mediationParams.getRestrictedData());
        String strOptString = adUnit.getJsonData().optString(Reporting.Key.PLACEMENT_ID);
        Intrinsics.checkNotNull(strOptString);
        return new a(strOptString);
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
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        return (b) objB;
    }
}
