package com.appodeal.ads.adapters.iab.appodeal;

import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkInitializationListener;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.adapters.iab.appodeal.native_ad.c;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedNative;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J/\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ'\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001a\u0010!\u001a\u00020 8\u0016X\u0096D¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001a\u0010%\u001a\u00020 8\u0016X\u0096D¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b&\u0010$¨\u0006'"}, d2 = {"Lcom/appodeal/ads/adapters/iab/appodeal/AppodealNativeNetwork;", "Lcom/appodeal/ads/AdNetwork;", "Lcom/appodeal/ads/adapters/iab/appodeal/b;", "Lcom/appodeal/ads/adapters/iab/appodeal/a;", "Lcom/appodeal/ads/AdNetworkBuilder;", "builder", "<init>", "(Lcom/appodeal/ads/AdNetworkBuilder;)V", "Lcom/appodeal/ads/unified/UnifiedNative;", "createNativeAd", "()Lcom/appodeal/ads/unified/UnifiedNative;", "", "isInitialized", "()Z", "Lorg/json/JSONObject;", "jsonObject", "getInitializeParams", "(Lorg/json/JSONObject;)Lcom/appodeal/ads/adapters/iab/appodeal/b;", "Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;", "contextProvider", "initParams", "Lcom/appodeal/ads/AdNetworkMediationParams;", "mediationParams", "Lcom/appodeal/ads/AdNetworkInitializationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", MobileAdsBridgeBase.initializeMethodName, "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/adapters/iab/appodeal/b;Lcom/appodeal/ads/AdNetworkMediationParams;Lcom/appodeal/ads/AdNetworkInitializationListener;)V", "Lcom/appodeal/ads/AdUnit;", "adUnit", "getAdUnitParams", "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/AdUnit;Lcom/appodeal/ads/AdNetworkMediationParams;)Lcom/appodeal/ads/adapters/iab/appodeal/a;", "", "version", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "recommendedVersion", "getRecommendedVersion", "iab_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AppodealNativeNetwork extends AdNetwork<b, a> {

    @NotNull
    private final String recommendedVersion;

    @NotNull
    private final String version;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/appodeal/ads/adapters/iab/appodeal/AppodealNativeNetwork$builder;", "Lcom/appodeal/ads/AdNetworkBuilder;", "<init>", "()V", "build", "Lcom/appodeal/ads/adapters/iab/appodeal/AppodealNativeNetwork;", "iab_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class builder extends AdNetworkBuilder {
        public builder() {
            super("appodeal", "0");
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public AppodealNativeNetwork build() {
            return new AppodealNativeNetwork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppodealNativeNetwork(@NotNull AdNetworkBuilder builder2) {
        super(builder2);
        Intrinsics.checkNotNullParameter(builder2, "builder");
        this.version = "1.0.0";
        this.recommendedVersion = "1.0.0";
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public UnifiedNative<a> createNativeAd() {
        return new c();
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
        return true;
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public a getAdUnitParams(@NotNull ContextProvider contextProvider, @NotNull AdUnit adUnit, @NotNull AdNetworkMediationParams mediationParams) throws JSONException {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        JSONObject jSONObject = adUnit.getJsonData().getJSONObject("ad");
        String strOptString = adUnit.getJsonData().optString("package");
        long jOptLong = adUnit.getJsonData().optLong("expiry");
        Intrinsics.checkNotNull(jSONObject);
        Intrinsics.checkNotNull(strOptString);
        return new a(jSONObject, strOptString, jOptLong);
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public b getInitializeParams(@Nullable JSONObject jsonObject) {
        return new b();
    }

    @Override // com.appodeal.ads.AdNetwork
    public void initialize(@NotNull ContextProvider contextProvider, @NotNull b initParams, @NotNull AdNetworkMediationParams mediationParams, @NotNull AdNetworkInitializationListener listener) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(initParams, "initParams");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        Intrinsics.checkNotNullParameter(listener, "listener");
        listener.onInitializationFinished();
    }
}
