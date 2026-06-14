package com.appodeal.ads.adapters.applovin_max;

import android.content.Context;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdk;
import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkInitializationListener;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.ext.JsonExtKt;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010!\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\u0004\u0018\u00010\u00022\b\u0010%\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b&\u0010'J/\u0010/\u001a\u00020\f2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u00022\u0006\u0010,\u001a\u00020+2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b/\u00100J'\u00103\u001a\u00020\u00032\u0006\u0010)\u001a\u00020(2\u0006\u00102\u001a\u0002012\u0006\u0010,\u001a\u00020+H\u0016¢\u0006\u0004\b3\u00104R\u001a\u00106\u001a\u0002058\u0016X\u0096D¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u001a\u0010:\u001a\u0002058\u0016X\u0096D¢\u0006\f\n\u0004\b:\u00107\u001a\u0004\b;\u00109R\u001a\u0010<\u001a\u00020\u001e8\u0016X\u0096D¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b<\u0010 R\u001b\u0010C\u001a\u00020>8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B¨\u0006D"}, d2 = {"Lcom/appodeal/ads/adapters/applovin_max/ApplovinMaxNetwork;", "Lcom/appodeal/ads/AdNetwork;", "Lcom/appodeal/ads/adapters/applovin_max/c;", "Lcom/appodeal/ads/adapters/applovin_max/b;", "Lcom/appodeal/ads/AdNetworkBuilder;", "builder", "<init>", "(Lcom/appodeal/ads/AdNetworkBuilder;)V", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/appodeal/ads/RestrictedData;", "restrictedData", "", "updateConsent", "(Landroid/content/Context;Lcom/appodeal/ads/RestrictedData;)V", "Lcom/appodeal/ads/adapters/applovin_max/banner/c;", "createBanner", "()Lcom/appodeal/ads/adapters/applovin_max/banner/c;", "Lcom/appodeal/ads/adapters/applovin_max/mrec/c;", "createMrec", "()Lcom/appodeal/ads/adapters/applovin_max/mrec/c;", "Lcom/appodeal/ads/adapters/applovin_max/interstitial/b;", "createInterstitial", "()Lcom/appodeal/ads/adapters/applovin_max/interstitial/b;", "Lcom/appodeal/ads/adapters/applovin_max/rewarded_video/c;", "createRewarded", "()Lcom/appodeal/ads/adapters/applovin_max/rewarded_video/c;", "Lcom/appodeal/ads/adapters/applovin_max/native_ad/b;", "createNativeAd", "()Lcom/appodeal/ads/adapters/applovin_max/native_ad/b;", "", "isInitialized", "()Z", "enabled", "setLogging", "(Z)V", "Lorg/json/JSONObject;", "jsonObject", "getInitializeParams", "(Lorg/json/JSONObject;)Lcom/appodeal/ads/adapters/applovin_max/c;", "Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;", "contextProvider", "initParams", "Lcom/appodeal/ads/AdNetworkMediationParams;", "mediationParams", "Lcom/appodeal/ads/AdNetworkInitializationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, MobileAdsBridgeBase.initializeMethodName, "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/adapters/applovin_max/c;Lcom/appodeal/ads/AdNetworkMediationParams;Lcom/appodeal/ads/AdNetworkInitializationListener;)V", "Lcom/appodeal/ads/AdUnit;", "adUnit", "getAdUnitParams", "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/AdUnit;Lcom/appodeal/ads/AdNetworkMediationParams;)Lcom/appodeal/ads/adapters/applovin_max/b;", "", "version", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "recommendedVersion", "getRecommendedVersion", "isSupportSmartBanners", "Z", "Lcom/appodeal/ads/adapters/applovin_max/f;", "initializer$delegate", "Lkotlin/Lazy;", "getInitializer", "()Lcom/appodeal/ads/adapters/applovin_max/f;", "initializer", "applovin_max_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ApplovinMaxNetwork extends AdNetwork<c, b> {

    /* JADX INFO: renamed from: initializer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy initializer;
    private final boolean isSupportSmartBanners;

    @NotNull
    private final String recommendedVersion;

    @NotNull
    private final String version;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/appodeal/ads/adapters/applovin_max/ApplovinMaxNetwork$builder;", "Lcom/appodeal/ads/AdNetworkBuilder;", "<init>", "()V", "adActivities", "", "", "getAdActivities", "()Ljava/util/List;", "build", "Lcom/appodeal/ads/adapters/applovin_max/ApplovinMaxNetwork;", "applovin_max_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class builder extends AdNetworkBuilder {

        @NotNull
        private final List<String> adActivities;

        public builder() {
            super("max", "0");
            this.adActivities = CollectionsKt.listOf((Object[]) new String[]{"com.applovin.adview.AppLovinFullscreenActivity", "com.applovin.adview.AppLovinFullscreenThemedActivity", "com.applovin.sdk.AppLovinWebViewActivity", "com.applovin.mediation.hybridAds.MaxHybridMRecAdActivity", "com.applovin.mediation.hybridAds.MaxHybridNativeAdActivity"});
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public List<String> getAdActivities() {
            return this.adActivities;
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public ApplovinMaxNetwork build() {
            return new ApplovinMaxNetwork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ApplovinMaxNetwork(@NotNull AdNetworkBuilder builder2) {
        super(builder2);
        Intrinsics.checkNotNullParameter(builder2, "builder");
        String VERSION = AppLovinSdk.VERSION;
        Intrinsics.checkNotNullExpressionValue(VERSION, "VERSION");
        this.version = VERSION;
        this.recommendedVersion = "13.5.1";
        this.isSupportSmartBanners = true;
        this.initializer = lf.i.a(new Function0() { // from class: com.appodeal.ads.adapters.applovin_max.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ApplovinMaxNetwork.initializer_delegate$lambda$0();
            }
        });
    }

    private final f getInitializer() {
        return (f) this.initializer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f initializer_delegate$lambda$0() {
        return new f();
    }

    private final void updateConsent(Context context, RestrictedData restrictedData) {
        boolean zIsUserHasConsent = restrictedData.isUserHasConsent();
        if (restrictedData.isUserInGdprScope() && AppLovinPrivacySettings.hasUserConsent(context) != zIsUserHasConsent) {
            AppLovinPrivacySettings.setHasUserConsent(zIsUserHasConsent, context);
        }
        if (restrictedData.isUserInCcpaScope() && AppLovinPrivacySettings.isDoNotSell(context) == zIsUserHasConsent) {
            AppLovinPrivacySettings.setDoNotSell(!zIsUserHasConsent, context);
        }
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
        return getInitializer().f12007c.get();
    }

    @Override // com.appodeal.ads.AdNetwork
    /* JADX INFO: renamed from: isSupportSmartBanners, reason: from getter */
    public boolean getIsSupportSmartBanners() {
        return this.isSupportSmartBanners;
    }

    @Override // com.appodeal.ads.AdNetwork
    public void setLogging(boolean enabled) {
        getInitializer().f12008d = enabled;
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.applovin_max.banner.c createBanner() {
        return new com.appodeal.ads.adapters.applovin_max.banner.c();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.applovin_max.interstitial.b createInterstitial() {
        return new com.appodeal.ads.adapters.applovin_max.interstitial.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.applovin_max.mrec.c createMrec() {
        return new com.appodeal.ads.adapters.applovin_max.mrec.c();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.applovin_max.native_ad.b createNativeAd() {
        return new com.appodeal.ads.adapters.applovin_max.native_ad.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.applovin_max.rewarded_video.c createRewarded() {
        return new com.appodeal.ads.adapters.applovin_max.rewarded_video.c();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public b getAdUnitParams(@NotNull ContextProvider contextProvider, @NotNull AdUnit adUnit, @NotNull AdNetworkMediationParams mediationParams) throws JSONException {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        updateConsent(contextProvider.getApplicationContext(), mediationParams.getRestrictedData());
        String strOptString = adUnit.getJsonData().optString("ad_unit_id");
        JSONObject jsonData = adUnit.getJsonData();
        Map map = JsonExtKt.toMap(jsonData != null ? jsonData.optJSONObject("ext") : null);
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = adUnit.getJsonData().optJSONArray("mediation_config");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i10);
                if (Intrinsics.areEqual(jSONObject.getString("ad_network"), "amazon")) {
                    String strOptString2 = jSONObject.optString("slot_uuid");
                    Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
                    arrayList.add(new com.appodeal.ads.adapters.applovin_max.mediation.a(strOptString2, jSONObject.optLong("tmax", 15000L), jSONObject.optString("interstitial_type")));
                }
            }
        }
        Intrinsics.checkNotNull(strOptString);
        return new b(strOptString, arrayList, map);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x003f  */
    @Override // com.appodeal.ads.AdNetwork
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.appodeal.ads.adapters.applovin_max.c getInitializeParams(@org.jetbrains.annotations.Nullable org.json.JSONObject r9) {
        /*
            r8 = this;
            r1 = 0
            kotlin.Result$Companion r0 = kotlin.Result.f93230c     // Catch: java.lang.Throwable -> L12
            com.appodeal.ads.adapters.applovin_max.c r2 = new com.appodeal.ads.adapters.applovin_max.c     // Catch: java.lang.Throwable -> L12
            if (r9 == 0) goto L15
            java.lang.String r0 = "sdk_key"
            java.lang.String r0 = r9.optString(r0)     // Catch: java.lang.Throwable -> L12
            if (r0 != 0) goto L10
            goto L15
        L10:
            r3 = r0
            goto L18
        L12:
            r0 = move-exception
            r9 = r0
            goto L52
        L15:
            java.lang.String r0 = ""
            goto L10
        L18:
            if (r9 == 0) goto L21
            java.lang.String r0 = "ad_unit_ids"
            org.json.JSONArray r0 = r9.optJSONArray(r0)     // Catch: java.lang.Throwable -> L12
            goto L22
        L21:
            r0 = r1
        L22:
            java.util.List r4 = com.appodeal.ads.ext.JsonExtKt.asList(r0)     // Catch: java.lang.Throwable -> L12
            java.lang.String r0 = "max"
            if (r9 == 0) goto L32
            java.lang.String r5 = "mediator"
            java.lang.String r5 = r9.optString(r5, r0)     // Catch: java.lang.Throwable -> L12
            if (r5 != 0) goto L33
        L32:
            r5 = r0
        L33:
            if (r9 == 0) goto L3f
            java.lang.String r0 = "mute"
            boolean r0 = r9.optBoolean(r0)     // Catch: java.lang.Throwable -> L12
            r6 = 1
            if (r0 != r6) goto L3f
            goto L40
        L3f:
            r6 = 0
        L40:
            if (r9 == 0) goto L49
            java.lang.String r0 = "ext"
            org.json.JSONObject r9 = r9.optJSONObject(r0)     // Catch: java.lang.Throwable -> L12
            goto L4a
        L49:
            r9 = r1
        L4a:
            java.util.Map r7 = com.appodeal.ads.ext.JsonExtKt.toMap(r9)     // Catch: java.lang.Throwable -> L12
            r2.<init>(r3, r4, r5, r6, r7)     // Catch: java.lang.Throwable -> L12
            return r2
        L52:
            kotlin.Result$Companion r0 = kotlin.Result.f93230c
            java.lang.Object r9 = kotlin.d.a(r9)
            java.lang.Object r9 = kotlin.Result.b(r9)
            boolean r0 = kotlin.Result.i(r9)
            if (r0 == 0) goto L63
            goto L64
        L63:
            r1 = r9
        L64:
            com.appodeal.ads.adapters.applovin_max.c r1 = (com.appodeal.ads.adapters.applovin_max.c) r1
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.adapters.applovin_max.ApplovinMaxNetwork.getInitializeParams(org.json.JSONObject):com.appodeal.ads.adapters.applovin_max.c");
    }

    @Override // com.appodeal.ads.AdNetwork
    public void initialize(@NotNull ContextProvider contextProvider, @NotNull c initParams, @NotNull AdNetworkMediationParams mediationParams, @NotNull AdNetworkInitializationListener listener) {
        Object value;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(initParams, "initParams");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        Intrinsics.checkNotNullParameter(listener, "listener");
        if (getInitializer().f12007c.get()) {
            listener.onInitializationFinished();
            return;
        }
        if (initParams.f11989a.length() == 0) {
            listener.onInitializationFailed(LoadingError.IncorrectAdunit);
            return;
        }
        Context context = contextProvider.getApplicationContext();
        updateConsent(context, mediationParams.getRestrictedData());
        f initializer = getInitializer();
        g listener2 = new g(listener);
        initializer.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initParams, "initParams");
        Intrinsics.checkNotNullParameter(listener2, "listener");
        if (initializer.f12007c.get()) {
            listener.onInitializationFinished();
            return;
        }
        MutableStateFlow mutableStateFlow = initializer.f12005a;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.b(value, CollectionsKt.plus((Collection<? extends g>) value, listener2)));
        if (initializer.f12006b.getAndSet(true)) {
            return;
        }
        initializer.b(context, initParams);
    }
}
