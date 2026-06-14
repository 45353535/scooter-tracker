package com.appodeal.ads.adapters.level_play;

import android.app.Activity;
import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkInitializationListener;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.adapters.custom.bmwf.BMConstants;
import com.ironsource.mediationsdk.IronSource;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.mediation.LevelPlayInitRequest;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.MutableStateFlow;
import lf.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0005B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u0004\u0018\u00010\u00022\b\u0010!\u001a\u0004\u0018\u00010 H\u0016¢\u0006\u0004\b\"\u0010#J/\u0010+\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00022\u0006\u0010(\u001a\u00020'2\u0006\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b+\u0010,J'\u0010/\u001a\u00020\u00032\u0006\u0010%\u001a\u00020$2\u0006\u0010.\u001a\u00020-2\u0006\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b/\u00100R\u001a\u00101\u001a\u00020\u00198\u0016X\u0096D¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u0010\u001bR\u001a\u00104\u001a\u0002038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001a\u00108\u001a\u0002038\u0016X\u0096D¢\u0006\f\n\u0004\b8\u00105\u001a\u0004\b9\u00107R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lcom/appodeal/ads/adapters/level_play/LevelPlayNetwork;", "Lcom/appodeal/ads/AdNetwork;", "Lcom/appodeal/ads/adapters/level_play/c;", "Lcom/appodeal/ads/adapters/level_play/b;", "Lcom/appodeal/ads/AdNetworkBuilder;", "builder", "<init>", "(Lcom/appodeal/ads/AdNetworkBuilder;)V", "Lcom/appodeal/ads/adapters/level_play/banner/c;", "createBanner", "()Lcom/appodeal/ads/adapters/level_play/banner/c;", "Lcom/appodeal/ads/adapters/level_play/mrec/c;", "createMrec", "()Lcom/appodeal/ads/adapters/level_play/mrec/c;", "Lcom/appodeal/ads/adapters/level_play/interstitial/c;", "createInterstitial", "()Lcom/appodeal/ads/adapters/level_play/interstitial/c;", "Lcom/appodeal/ads/adapters/level_play/rewarded_video/c;", "createRewarded", "()Lcom/appodeal/ads/adapters/level_play/rewarded_video/c;", "Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "adType", "Lcom/appodeal/ads/networking/LoadingError;", "verifyLoadAvailability", "(Lcom/appodeal/ads/modules/common/internal/adtype/AdType;)Lcom/appodeal/ads/networking/LoadingError;", "", "isInitialized", "()Z", "enabled", "", "setLogging", "(Z)V", "Lorg/json/JSONObject;", "jsonObject", "getInitializeParams", "(Lorg/json/JSONObject;)Lcom/appodeal/ads/adapters/level_play/c;", "Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;", "contextProvider", "initParams", "Lcom/appodeal/ads/AdNetworkMediationParams;", "mediationParams", "Lcom/appodeal/ads/AdNetworkInitializationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, MobileAdsBridgeBase.initializeMethodName, "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/adapters/level_play/c;Lcom/appodeal/ads/AdNetworkMediationParams;Lcom/appodeal/ads/AdNetworkInitializationListener;)V", "Lcom/appodeal/ads/AdUnit;", "adUnit", "getAdUnitParams", "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/AdUnit;Lcom/appodeal/ads/AdNetworkMediationParams;)Lcom/appodeal/ads/adapters/level_play/b;", "isSupportSmartBanners", "Z", "", "version", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "recommendedVersion", "getRecommendedVersion", "Lcom/appodeal/ads/adapters/level_play/f;", "initializer$delegate", "Lkotlin/Lazy;", "getInitializer", "()Lcom/appodeal/ads/adapters/level_play/f;", "initializer", "level_play_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LevelPlayNetwork extends AdNetwork<c, b> {

    /* JADX INFO: renamed from: initializer$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy initializer;
    private final boolean isSupportSmartBanners;

    @NotNull
    private final String recommendedVersion;

    @NotNull
    private final String version;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/appodeal/ads/adapters/level_play/LevelPlayNetwork$builder;", "Lcom/appodeal/ads/AdNetworkBuilder;", "<init>", "()V", "adActivities", "", "", "getAdActivities", "()Ljava/util/List;", "build", "Lcom/appodeal/ads/adapters/level_play/LevelPlayNetwork;", "level_play_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class builder extends AdNetworkBuilder {

        @NotNull
        private final List<String> adActivities;

        public builder() {
            super("level_play", "0");
            this.adActivities = CollectionsKt.listOf((Object[]) new String[]{"com.ironsource.sdk.controller.ControllerActivity", "com.ironsource.sdk.controller.InterstitialActivity", "com.ironsource.sdk.controller.OpenUrlActivity"});
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public List<String> getAdActivities() {
            return this.adActivities;
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public LevelPlayNetwork build() {
            return new LevelPlayNetwork(this, null);
        }
    }

    public /* synthetic */ LevelPlayNetwork(AdNetworkBuilder adNetworkBuilder, DefaultConstructorMarker defaultConstructorMarker) {
        this(adNetworkBuilder);
    }

    private final f getInitializer() {
        return (f) this.initializer.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f initializer_delegate$lambda$0() {
        return new f();
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
        return getInitializer().f12402c.get();
    }

    @Override // com.appodeal.ads.AdNetwork
    /* JADX INFO: renamed from: isSupportSmartBanners, reason: from getter */
    public boolean getIsSupportSmartBanners() {
        return this.isSupportSmartBanners;
    }

    @Override // com.appodeal.ads.AdNetwork
    public void setLogging(boolean enabled) {
        getInitializer().f12403d = enabled;
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public LoadingError verifyLoadAvailability(@NotNull AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        return (adType == AdType.Interstitial && getIsInterstitialShowing()) ? LoadingError.Canceled : (adType == AdType.Rewarded && getIsRewardedShowing()) ? LoadingError.Canceled : super.verifyLoadAvailability(adType);
    }

    private LevelPlayNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
        this.isSupportSmartBanners = true;
        String sdkVersion = LevelPlay.getSdkVersion();
        Intrinsics.checkNotNullExpressionValue(sdkVersion, "getSdkVersion(...)");
        this.version = sdkVersion;
        this.recommendedVersion = "9.1.0";
        this.initializer = i.a(new Function0() { // from class: com.appodeal.ads.adapters.level_play.a
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return LevelPlayNetwork.initializer_delegate$lambda$0();
            }
        });
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.level_play.banner.c createBanner() {
        return new com.appodeal.ads.adapters.level_play.banner.c();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.level_play.interstitial.c createInterstitial() {
        return new com.appodeal.ads.adapters.level_play.interstitial.c();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.level_play.mrec.c createMrec() {
        return new com.appodeal.ads.adapters.level_play.mrec.c();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.level_play.rewarded_video.c createRewarded() {
        return new com.appodeal.ads.adapters.level_play.rewarded_video.c();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public b getAdUnitParams(@NotNull ContextProvider contextProvider, @NotNull AdUnit adUnit, @NotNull AdNetworkMediationParams mediationParams) throws JSONException {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        String strOptString = adUnit.getJsonData().optString("ad_unit_id");
        boolean zOptBoolean = adUnit.getJsonData().optBoolean("network_auto_refresh", false);
        double dOptDouble = adUnit.getJsonData().optDouble("bid_floor", 0.0d);
        Double dValueOf = Double.valueOf(dOptDouble);
        if (dOptDouble <= 0.0d) {
            dValueOf = null;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayOptJSONArray = adUnit.getJsonData().optJSONArray("mediation_config");
        if (jSONArrayOptJSONArray != null) {
            int length = jSONArrayOptJSONArray.length();
            for (int i10 = 0; i10 < length; i10++) {
                JSONObject jSONObject = jSONArrayOptJSONArray.getJSONObject(i10);
                if (Intrinsics.areEqual(jSONObject.getString("ad_network"), "amazon")) {
                    String strOptString2 = jSONObject.optString("slot_uuid");
                    Intrinsics.checkNotNullExpressionValue(strOptString2, "optString(...)");
                    arrayList.add(new com.appodeal.ads.adapters.level_play.mediation.b(strOptString2, jSONObject.optLong("tmax", 15000L), jSONObject.optString("interstitial_type")));
                }
            }
        }
        Intrinsics.checkNotNull(strOptString);
        return new b(strOptString, zOptBoolean, arrayList, dValueOf);
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public c getInitializeParams(@Nullable JSONObject jsonObject) {
        Object objB;
        c cVar;
        try {
            Result.Companion companion = Result.f93230c;
            if (jsonObject != null) {
                String strOptString = jsonObject.optString(MBridgeConstans.APP_KEY);
                String strOptString2 = jsonObject.optString("mediator");
                Intrinsics.checkNotNull(strOptString);
                Intrinsics.checkNotNull(strOptString2);
                cVar = new c(strOptString, strOptString2);
            } else {
                cVar = null;
            }
            objB = Result.b(cVar);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        return (c) (Result.i(objB) ? null : objB);
    }

    @Override // com.appodeal.ads.AdNetwork
    public void initialize(@NotNull ContextProvider contextProvider, @NotNull c initParams, @NotNull AdNetworkMediationParams mediationParams, @NotNull AdNetworkInitializationListener listener) {
        Object value;
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(initParams, "initParams");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        Intrinsics.checkNotNullParameter(listener, "listener");
        Activity context = contextProvider.getResumedActivity();
        if (getInitializer().f12402c.get()) {
            listener.onInitializationFinished();
            return;
        }
        if (initParams.f12393a.length() == 0) {
            listener.onInitializationFailed(LoadingError.IncorrectAdunit);
            return;
        }
        if (context == null) {
            listener.onInitializationFailed(LoadingError.IncorrectAdunit);
            return;
        }
        f initializer = getInitializer();
        g listener2 = new g(listener);
        initializer.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(initParams, "initParams");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        Intrinsics.checkNotNullParameter(listener2, "listener");
        if (initializer.f12402c.get()) {
            listener.onInitializationFinished();
            return;
        }
        MutableStateFlow mutableStateFlow = initializer.f12400a;
        do {
            value = mutableStateFlow.getValue();
        } while (!mutableStateFlow.b(value, CollectionsKt.plus((Collection<? extends g>) value, listener2)));
        if (initializer.f12401b.getAndSet(true)) {
            return;
        }
        RestrictedData restrictedData = mediationParams.getRestrictedData();
        if (restrictedData.isUserInGdprScope()) {
            LevelPlay.setConsent(restrictedData.isUserHasConsent());
        }
        if (restrictedData.isUserInCcpaScope()) {
            LevelPlay.setMetaData("do_not_sell", String.valueOf(!restrictedData.isUserHasConsent()));
        }
        String strValueOf = String.valueOf(restrictedData.isUserAgeRestricted());
        LevelPlay.setMetaData("AppLovin_AgeRestrictedUser", strValueOf);
        LevelPlay.setMetaData(BMConstants.BM_COPPA, strValueOf);
        LevelPlay.setMetaData("AdMob_TFCD", strValueOf);
        LevelPlay.setMetaData("AdMob_TFUA", strValueOf);
        LevelPlay.setMetaData("DT_COPPA", strValueOf);
        LevelPlay.setMetaData("InMobi_AgeRestricted", strValueOf);
        LevelPlay.setMetaData("Vungle_coppa", strValueOf);
        LevelPlay.setMetaData("Mintegral_COPPA", strValueOf);
        LevelPlay.setMetaData("LevelPlay_ChildDirected", strValueOf);
        LevelPlay.setMetaData("Moloco_COPPA", strValueOf);
        String str = restrictedData.isUserAgeRestricted() ? "1" : null;
        if (str == null) {
            str = "0";
        }
        LevelPlay.setMetaData("Pangle_COPPA", str);
        LevelPlay.setMetaData("UnityAds_coppa", strValueOf);
        LevelPlay.setMetaData("Yandex_COPPA", strValueOf);
        LevelPlay.setMetaData(com.ironsource.mediationsdk.metadata.a.f44104c, strValueOf);
        LevelPlay.setMetaData("is_child_directed", strValueOf);
        LevelPlay.setMetaData("Google_Family_Self_Certified_SDKS", strValueOf);
        String str2 = initParams.f12394b;
        if (str2 != null) {
            if (str2.length() <= 0) {
                str2 = null;
            }
            if (str2 != null) {
                IronSource.setMediationType(str2);
            }
        }
        LevelPlay.setAdaptersDebug(initializer.f12403d);
        LevelPlay.validateIntegration(context);
        LevelPlay.setMetaData(com.ironsource.mediationsdk.metadata.a.f44107f, com.ironsource.mediationsdk.metadata.a.f44111j);
        LevelPlayInitRequest.Builder builder2 = new LevelPlayInitRequest.Builder(initParams.f12393a);
        String userId = restrictedData.getUserId();
        if (userId != null) {
            String str3 = userId.length() > 0 ? userId : null;
            if (str3 != null) {
                builder2.withUserId(str3);
            }
        }
        LevelPlay.setMetaData("Meta_IS_CacheFlag", "ALL");
        LevelPlay.init(context, builder2.build(), new d(initializer));
    }
}
