package com.appodeal.ads.adapters.yandex;

import android.content.Context;
import android.location.Location;
import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkInitializationListener;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.Appodeal;
import com.appodeal.ads.LocationData;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.yandex.mobile.ads.common.InitializationListener;
import com.yandex.mobile.ads.common.MobileAds;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J!\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030 H\u0016¢\u0006\u0004\b!\u0010\"J\u0015\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030#H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\u00142\u0006\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020&H\u0016¢\u0006\u0004\b*\u0010+J\u0019\u0010.\u001a\u00020\u00022\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b.\u0010/J/\u00107\u001a\u00020\u00142\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020\u00022\u0006\u00104\u001a\u0002032\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J'\u0010;\u001a\u00020\u00032\u0006\u00101\u001a\u0002002\u0006\u0010:\u001a\u0002092\u0006\u00104\u001a\u000203H\u0016¢\u0006\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020&8\u0016X\u0096D¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b=\u0010+R\u0014\u0010A\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u0014\u0010C\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010@¨\u0006D"}, d2 = {"Lcom/appodeal/ads/adapters/yandex/YandexNetwork;", "Lcom/appodeal/ads/AdNetwork;", "Lcom/appodeal/ads/adapters/yandex/d;", "Lcom/appodeal/ads/adapters/yandex/c;", "Lcom/appodeal/ads/AdNetworkBuilder;", "builder", "<init>", "(Lcom/appodeal/ads/AdNetworkBuilder;)V", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/appodeal/ads/RestrictedData;", "restrictedData", "Landroid/location/Location;", "getDeviceLocation", "(Landroid/content/Context;Lcom/appodeal/ads/RestrictedData;)Landroid/location/Location;", "", "mediatorName", "", "getMediatorParameters", "(Ljava/lang/String;)Ljava/util/Map;", "", "updateConsent", "(Lcom/appodeal/ads/RestrictedData;)V", "Lcom/appodeal/ads/unified/UnifiedBanner;", "createBanner", "()Lcom/appodeal/ads/unified/UnifiedBanner;", "Lcom/appodeal/ads/unified/UnifiedMrec;", "createMrec", "()Lcom/appodeal/ads/unified/UnifiedMrec;", "Lcom/appodeal/ads/unified/UnifiedInterstitial;", "createInterstitial", "()Lcom/appodeal/ads/unified/UnifiedInterstitial;", "Lcom/appodeal/ads/unified/UnifiedRewarded;", "createRewarded", "()Lcom/appodeal/ads/unified/UnifiedRewarded;", "Lcom/appodeal/ads/unified/UnifiedNative;", "createNativeAd", "()Lcom/appodeal/ads/unified/UnifiedNative;", "", "enabled", "setLogging", "(Z)V", "isInitialized", "()Z", "Lorg/json/JSONObject;", "jsonObject", "getInitializeParams", "(Lorg/json/JSONObject;)Lcom/appodeal/ads/adapters/yandex/d;", "Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;", "contextProvider", "initParams", "Lcom/appodeal/ads/AdNetworkMediationParams;", "mediationParams", "Lcom/appodeal/ads/AdNetworkInitializationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, MobileAdsBridgeBase.initializeMethodName, "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/adapters/yandex/d;Lcom/appodeal/ads/AdNetworkMediationParams;Lcom/appodeal/ads/AdNetworkInitializationListener;)V", "Lcom/appodeal/ads/AdUnit;", "adUnit", "getAdUnitParams", "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/AdUnit;Lcom/appodeal/ads/AdNetworkMediationParams;)Lcom/appodeal/ads/adapters/yandex/c;", "isSupportSmartBanners", "Z", "getVersion", "()Ljava/lang/String;", "version", "getRecommendedVersion", "recommendedVersion", "yandex_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class YandexNetwork extends AdNetwork<d, c> {
    private final boolean isSupportSmartBanners;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/appodeal/ads/adapters/yandex/YandexNetwork$builder;", "Lcom/appodeal/ads/AdNetworkBuilder;", "<init>", "()V", "adActivities", "", "", "getAdActivities", "()Ljava/util/List;", "build", "Lcom/appodeal/ads/adapters/yandex/YandexNetwork;", "yandex_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class builder extends AdNetworkBuilder {
        public builder() {
            super("yandex", "0");
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public List<String> getAdActivities() {
            return CollectionsKt.listOf("com.yandex.mobile.ads.common.AdActivity");
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public YandexNetwork build() {
            return new YandexNetwork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public YandexNetwork(@NotNull AdNetworkBuilder builder2) {
        super(builder2);
        Intrinsics.checkNotNullParameter(builder2, "builder");
        this.isSupportSmartBanners = true;
    }

    private final Location getDeviceLocation(Context context, RestrictedData restrictedData) {
        LocationData location;
        if (!restrictedData.canSendLocation()) {
            restrictedData = null;
        }
        if (restrictedData == null || (location = restrictedData.getLocation(context)) == null) {
            return null;
        }
        return location.getDeviceLocation();
    }

    private final Map<String, String> getMediatorParameters(String mediatorName) {
        if (mediatorName != null) {
            if ((mediatorName.length() > 0 ? mediatorName : null) != null) {
                return MapsKt.mapOf(TuplesKt.to("adapter_network_name", mediatorName), TuplesKt.to("adapter_version", getVersion()), TuplesKt.to("adapter_network_sdk_version", Appodeal.getVersion()));
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initialize$lambda$0(AdNetworkInitializationListener adNetworkInitializationListener) {
        l.f12627a.set(true);
        adNetworkInitializationListener.onInitializationFinished();
    }

    private final void updateConsent(RestrictedData restrictedData) {
        if (restrictedData.isUserInGdprScope()) {
            MobileAds.setUserConsent(restrictedData.isUserHasConsent());
        }
        MobileAds.setAgeRestrictedUser(restrictedData.isUserAgeRestricted());
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public UnifiedBanner<c> createBanner() {
        return new com.appodeal.ads.adapters.yandex.banner.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public UnifiedInterstitial<c> createInterstitial() {
        return new com.appodeal.ads.adapters.yandex.interstitial.c();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public UnifiedMrec<c> createMrec() {
        return new com.appodeal.ads.adapters.yandex.mrec.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public UnifiedNative<c> createNativeAd() {
        return new com.appodeal.ads.adapters.yandex.native_ad.d();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public UnifiedRewarded<c> createRewarded() {
        return new com.appodeal.ads.adapters.yandex.rewarded_video.c();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public String getRecommendedVersion() {
        return "7.17.0";
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public String getVersion() {
        return MobileAds.getLibraryVersion();
    }

    @Override // com.appodeal.ads.AdNetwork
    public boolean isInitialized() {
        return l.f12627a.get();
    }

    @Override // com.appodeal.ads.AdNetwork
    /* JADX INFO: renamed from: isSupportSmartBanners, reason: from getter */
    public boolean getIsSupportSmartBanners() {
        return this.isSupportSmartBanners;
    }

    @Override // com.appodeal.ads.AdNetwork
    public void setLogging(boolean enabled) {
        MobileAds.enableLogging(enabled);
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public c getAdUnitParams(@NotNull ContextProvider contextProvider, @NotNull AdUnit adUnit, @NotNull AdNetworkMediationParams mediationParams) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        RestrictedData restrictedData = mediationParams.getRestrictedData();
        updateConsent(restrictedData);
        String strOptString = adUnit.getJsonData().optString("block_id");
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        return new c(strOptString, getDeviceLocation(contextProvider.getApplicationContext(), restrictedData), getMediatorParameters(adUnit.getMediatorName()));
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public d getInitializeParams(@Nullable JSONObject jsonObject) {
        return new d();
    }

    @Override // com.appodeal.ads.AdNetwork
    public void initialize(@NotNull ContextProvider contextProvider, @NotNull d initParams, @NotNull AdNetworkMediationParams mediationParams, @NotNull final AdNetworkInitializationListener listener) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(initParams, "initParams");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        Intrinsics.checkNotNullParameter(listener, "listener");
        updateConsent(mediationParams.getRestrictedData());
        MobileAds.initialize(contextProvider.getApplicationContext(), new InitializationListener() { // from class: com.appodeal.ads.adapters.yandex.a
            @Override // com.yandex.mobile.ads.common.InitializationListener
            public final void onInitializationCompleted() {
                YandexNetwork.initialize$lambda$0(listener);
            }
        });
    }
}
