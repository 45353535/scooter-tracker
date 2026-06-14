package com.appodeal.ads.adapters.bidon;

import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkInitializationListener;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.ext.LogExtKt;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.D5;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.bidon.sdk.BidonSdk;
import org.bidon.sdk.logs.logging.Logger;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u00022\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ/\u0010&\u001a\u00020\u00162\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u00022\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J'\u0010*\u001a\u00020\u00032\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010)\u001a\u00020(2\u0006\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b*\u0010+R\u001a\u0010-\u001a\u00020,8\u0016X\u0096D¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001a\u00101\u001a\u00020,8\u0016X\u0096D¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u00100R\u001a\u00103\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u0010\u001a¨\u00065"}, d2 = {"Lcom/appodeal/ads/adapters/bidon/BidonNetwork;", "Lcom/appodeal/ads/AdNetwork;", "Lcom/appodeal/ads/adapters/bidon/d;", "Lcom/appodeal/ads/adapters/bidon/c;", "Lcom/appodeal/ads/adapters/bidon/BidonNetwork$builder;", "builder", "<init>", "(Lcom/appodeal/ads/adapters/bidon/BidonNetwork$builder;)V", "Lcom/appodeal/ads/unified/UnifiedBanner;", "createBanner", "()Lcom/appodeal/ads/unified/UnifiedBanner;", "Lcom/appodeal/ads/unified/UnifiedMrec;", "createMrec", "()Lcom/appodeal/ads/unified/UnifiedMrec;", "Lcom/appodeal/ads/unified/UnifiedInterstitial;", "createInterstitial", "()Lcom/appodeal/ads/unified/UnifiedInterstitial;", "Lcom/appodeal/ads/unified/UnifiedRewarded;", "createRewarded", "()Lcom/appodeal/ads/unified/UnifiedRewarded;", "", "enabled", "", "setLogging", "(Z)V", "isInitialized", "()Z", "Lorg/json/JSONObject;", "jsonObject", "getInitializeParams", "(Lorg/json/JSONObject;)Lcom/appodeal/ads/adapters/bidon/d;", "Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;", "contextProvider", "initParams", "Lcom/appodeal/ads/AdNetworkMediationParams;", "mediationParams", "Lcom/appodeal/ads/AdNetworkInitializationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, MobileAdsBridgeBase.initializeMethodName, "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/adapters/bidon/d;Lcom/appodeal/ads/AdNetworkMediationParams;Lcom/appodeal/ads/AdNetworkInitializationListener;)V", "Lcom/appodeal/ads/AdUnit;", "adUnit", "getAdUnitParams", "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/AdUnit;Lcom/appodeal/ads/AdNetworkMediationParams;)Lcom/appodeal/ads/adapters/bidon/c;", "", "version", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "recommendedVersion", "getRecommendedVersion", "isSupportSmartBanners", "Z", "bidon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BidonNetwork extends AdNetwork<d, c> {
    private final boolean isSupportSmartBanners;

    @NotNull
    private final String recommendedVersion;

    @NotNull
    private final String version;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"Lcom/appodeal/ads/adapters/bidon/BidonNetwork$builder;", "Lcom/appodeal/ads/AdNetworkBuilder;", "<init>", "()V", "build", "Lcom/appodeal/ads/adapters/bidon/BidonNetwork;", "bidon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class builder extends AdNetworkBuilder {
        public builder() {
            super("bidon", "0");
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public BidonNetwork build() {
            return new BidonNetwork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BidonNetwork(@NotNull builder builder2) {
        super(builder2);
        Intrinsics.checkNotNullParameter(builder2, "builder");
        this.version = "0.13.0";
        this.recommendedVersion = "0.13.0";
        this.isSupportSmartBanners = true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit initialize$lambda$1(AdNetworkInitializationListener adNetworkInitializationListener) {
        adNetworkInitializationListener.onInitializationFinished();
        return Unit.f93236a;
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public UnifiedBanner<c> createBanner() {
        return new com.appodeal.ads.adapters.bidon.banner.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public UnifiedInterstitial<c> createInterstitial() {
        return new com.appodeal.ads.adapters.bidon.interstitial.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public UnifiedMrec<c> createMrec() {
        return new com.appodeal.ads.adapters.bidon.mrec.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public UnifiedRewarded<c> createRewarded() {
        return new com.appodeal.ads.adapters.bidon.rewarded.b();
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
        return g.f12131c.get();
    }

    @Override // com.appodeal.ads.AdNetwork
    /* JADX INFO: renamed from: isSupportSmartBanners, reason: from getter */
    public boolean getIsSupportSmartBanners() {
        return this.isSupportSmartBanners;
    }

    @Override // com.appodeal.ads.AdNetwork
    public void setLogging(boolean enabled) {
        Logger.Level level = enabled ? Logger.Level.Verbose : Logger.Level.Off;
        LogExtKt.logInternal$default("BidonNetwork", "Set logging: " + level, null, 4, null);
        BidonSdk.setLoggerLevel(level);
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public c getAdUnitParams(@NotNull ContextProvider contextProvider, @NotNull AdUnit adUnit, @NotNull AdNetworkMediationParams mediationParams) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        MutableStateFlow mutableStateFlow = g.f12129a;
        g.b(mediationParams.getRestrictedData());
        JSONObject jsonData = adUnit.getJsonData();
        String ifa = mediationParams.getRestrictedData().getIfa();
        Intrinsics.checkNotNullExpressionValue(ifa, "getIfa(...)");
        return new c(jsonData, ifa);
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public d getInitializeParams(@Nullable JSONObject jsonObject) {
        Object objB;
        String strOptString;
        try {
            Result.Companion companion = Result.f93230c;
            if (jsonObject == null || (strOptString = jsonObject.optString(MBridgeConstans.APP_KEY)) == null) {
                strOptString = "";
            }
            objB = Result.b(new d(strOptString, jsonObject != null ? jsonObject.optString(D5.f40571r) : null, jsonObject != null ? jsonObject.optJSONObject("ext") : null));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        return (d) (Result.i(objB) ? null : objB);
    }

    @Override // com.appodeal.ads.AdNetwork
    public void initialize(@NotNull ContextProvider contextProvider, @NotNull d initParams, @NotNull AdNetworkMediationParams mediationParams, @NotNull final AdNetworkInitializationListener listener) {
        Object value;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(initParams, "initParams");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        Intrinsics.checkNotNullParameter(listener, "listener");
        MutableStateFlow mutableStateFlow = g.f12129a;
        g.b(mediationParams.getRestrictedData());
        Function0 onInitialized = new Function0() { // from class: com.appodeal.ads.adapters.bidon.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return BidonNetwork.initialize$lambda$1(listener);
            }
        };
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(initParams, "initializeParams");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        Intrinsics.checkNotNullParameter(onInitialized, "onInitialized");
        if (g.f12131c.get()) {
            onInitialized.invoke();
            return;
        }
        MutableStateFlow mutableStateFlow2 = g.f12129a;
        do {
            value = mutableStateFlow2.getValue();
        } while (!mutableStateFlow2.b(value, CollectionsKt.plus((Collection<? extends Function0>) value, onInitialized)));
        if (g.f12130b.getAndSet(true)) {
            return;
        }
        g.c(contextProvider, initParams, mediationParams);
    }
}
