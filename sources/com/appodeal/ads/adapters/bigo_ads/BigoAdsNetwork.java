package com.appodeal.ads.adapters.bigo_ads;

import android.content.Context;
import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkInitializationListener;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
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
import sg.bigo.ads.BigoAdSdk;
import sg.bigo.ads.ConsentOptions;
import sg.bigo.ads.api.AdConfig;
import sg.bigo.ads.api.AdError;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u0000 92\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u00059B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u001b\u0010#\u001a\u0004\u0018\u00010\u00022\b\u0010\"\u001a\u0004\u0018\u00010!H\u0016¢\u0006\u0004\b#\u0010$J/\u0010,\u001a\u00020\f2\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00022\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b,\u0010-J'\u00100\u001a\u00020\u00032\u0006\u0010&\u001a\u00020%2\u0006\u0010/\u001a\u00020.2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b0\u00101R\u001a\u00103\u001a\u0002028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001a\u00107\u001a\u0002028\u0016X\u0096D¢\u0006\f\n\u0004\b7\u00104\u001a\u0004\b8\u00106¨\u0006:"}, d2 = {"Lcom/appodeal/ads/adapters/bigo_ads/BigoAdsNetwork;", "Lcom/appodeal/ads/AdNetwork;", "Lcom/appodeal/ads/adapters/bigo_ads/c;", "Lcom/appodeal/ads/adapters/bigo_ads/b;", "Lcom/appodeal/ads/AdNetworkBuilder;", "builder", "<init>", "(Lcom/appodeal/ads/AdNetworkBuilder;)V", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/appodeal/ads/RestrictedData;", "restrictedData", "", "updateConsent", "(Landroid/content/Context;Lcom/appodeal/ads/RestrictedData;)V", "Lcom/appodeal/ads/adapters/bigo_ads/banner/b;", "createBanner", "()Lcom/appodeal/ads/adapters/bigo_ads/banner/b;", "Lcom/appodeal/ads/adapters/bigo_ads/mrec/b;", "createMrec", "()Lcom/appodeal/ads/adapters/bigo_ads/mrec/b;", "Lcom/appodeal/ads/adapters/bigo_ads/interstitial/b;", "createInterstitial", "()Lcom/appodeal/ads/adapters/bigo_ads/interstitial/b;", "Lcom/appodeal/ads/adapters/bigo_ads/rewarded/b;", "createRewarded", "()Lcom/appodeal/ads/adapters/bigo_ads/rewarded/b;", "Lcom/appodeal/ads/adapters/bigo_ads/native_ad/b;", "createNativeAd", "()Lcom/appodeal/ads/adapters/bigo_ads/native_ad/b;", "", "isInitialized", "()Z", "Lorg/json/JSONObject;", "jsonObject", "getInitializeParams", "(Lorg/json/JSONObject;)Lcom/appodeal/ads/adapters/bigo_ads/c;", "Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;", "contextProvider", "initParams", "Lcom/appodeal/ads/AdNetworkMediationParams;", "mediationParams", "Lcom/appodeal/ads/AdNetworkInitializationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, MobileAdsBridgeBase.initializeMethodName, "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/adapters/bigo_ads/c;Lcom/appodeal/ads/AdNetworkMediationParams;Lcom/appodeal/ads/AdNetworkInitializationListener;)V", "Lcom/appodeal/ads/AdUnit;", "adUnit", "getAdUnitParams", "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/AdUnit;Lcom/appodeal/ads/AdNetworkMediationParams;)Lcom/appodeal/ads/adapters/bigo_ads/b;", "", "version", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "recommendedVersion", "getRecommendedVersion", y.f66058y, "bigo_ads_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BigoAdsNetwork extends AdNetwork<c, b> {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String recommendedVersion;

    @NotNull
    private final String version;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/appodeal/ads/adapters/bigo_ads/BigoAdsNetwork$Companion;", "", "<init>", "()V", "mapError", "Lcom/appodeal/ads/networking/LoadingError;", "adError", "Lsg/bigo/ads/api/AdError;", "bigo_ads_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final LoadingError mapError(@NotNull AdError adError) {
            Intrinsics.checkNotNullParameter(adError, "adError");
            int code = adError.getCode();
            if (code == 1001) {
                return LoadingError.RequestError;
            }
            if (code == 1006) {
                return LoadingError.InvalidAssets;
            }
            if (code == 1003) {
                return LoadingError.ConnectionError;
            }
            if (code == 1004) {
                return LoadingError.NoFill;
            }
            switch (code) {
                case 2001:
                case 2002:
                case 2003:
                case 2004:
                case 2005:
                    return LoadingError.ShowFailed;
                default:
                    return LoadingError.InternalError;
            }
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/appodeal/ads/adapters/bigo_ads/BigoAdsNetwork$builder;", "Lcom/appodeal/ads/AdNetworkBuilder;", "<init>", "()V", "adActivities", "", "", "getAdActivities", "()Ljava/util/List;", "build", "Lcom/appodeal/ads/adapters/bigo_ads/BigoAdsNetwork;", "bigo_ads_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class builder extends AdNetworkBuilder {
        public builder() {
            super("bigo_ads", "0");
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public List<String> getAdActivities() {
            return CollectionsKt.listOf((Object[]) new String[]{"sg.bigo.ads.api.AdActivity", "sg.bigo.ads.core.mraid.MraidVideoActivity"});
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public BigoAdsNetwork build() {
            return new BigoAdsNetwork(this, null);
        }
    }

    public /* synthetic */ BigoAdsNetwork(AdNetworkBuilder adNetworkBuilder, DefaultConstructorMarker defaultConstructorMarker) {
        this(adNetworkBuilder);
    }

    private final void updateConsent(Context context, RestrictedData restrictedData) {
        if (restrictedData.isUserInGdprScope()) {
            BigoAdSdk.setUserConsent(context, ConsentOptions.GDPR, restrictedData.isUserHasConsent());
        } else if (restrictedData.isUserInCcpaScope()) {
            BigoAdSdk.setUserConsent(context, ConsentOptions.CCPA, restrictedData.isUserHasConsent());
        }
        BigoAdSdk.setUserConsent(context, ConsentOptions.COPPA, !restrictedData.isUserAgeRestricted());
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
    public void initialize(@NotNull ContextProvider contextProvider, @NotNull c initParams, @NotNull AdNetworkMediationParams mediationParams, @NotNull final AdNetworkInitializationListener listener) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(initParams, "initParams");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String str = initParams.f12161a;
        if (str.length() == 0) {
            listener.onInitializationFailed(LoadingError.IncorrectAdunit);
            return;
        }
        Context applicationContext = contextProvider.getApplicationContext();
        updateConsent(applicationContext, mediationParams.getRestrictedData());
        AdConfig.Builder debug = new AdConfig.Builder().setAppId(str).setDebug(mediationParams.isTestMode());
        String str2 = initParams.f12162b;
        if (str2.length() > 0) {
            debug.setChannel(str2);
        }
        BigoAdSdk.initialize(applicationContext, debug.build(), new BigoAdSdk.InitListener() { // from class: com.appodeal.ads.adapters.bigo_ads.a
            @Override // sg.bigo.ads.BigoAdSdk.InitListener
            public final void onInitialized() {
                listener.onInitializationFinished();
            }
        });
    }

    @Override // com.appodeal.ads.AdNetwork
    public boolean isInitialized() {
        return BigoAdSdk.isInitialized();
    }

    private BigoAdsNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
        String sDKVersionName = BigoAdSdk.getSDKVersionName();
        Intrinsics.checkNotNullExpressionValue(sDKVersionName, "getSDKVersionName(...)");
        this.version = sDKVersionName;
        this.recommendedVersion = "5.6.2";
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.bigo_ads.banner.b createBanner() {
        return new com.appodeal.ads.adapters.bigo_ads.banner.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.bigo_ads.interstitial.b createInterstitial() {
        return new com.appodeal.ads.adapters.bigo_ads.interstitial.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.bigo_ads.mrec.b createMrec() {
        return new com.appodeal.ads.adapters.bigo_ads.mrec.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.bigo_ads.native_ad.b createNativeAd() {
        return new com.appodeal.ads.adapters.bigo_ads.native_ad.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.bigo_ads.rewarded.b createRewarded() {
        return new com.appodeal.ads.adapters.bigo_ads.rewarded.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public b getAdUnitParams(@NotNull ContextProvider contextProvider, @NotNull AdUnit adUnit, @NotNull AdNetworkMediationParams mediationParams) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        updateConsent(contextProvider.getApplicationContext(), mediationParams.getRestrictedData());
        String strOptString = adUnit.getJsonData().optString("slot_id");
        Intrinsics.checkNotNull(strOptString);
        return new b(strOptString);
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
            if (jsonObject != null && (strOptString2 = jsonObject.optString("app_channel")) != null) {
                str = strOptString2;
            }
            objB = Result.b(new c(strOptString, str));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(d.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        return (c) objB;
    }
}
