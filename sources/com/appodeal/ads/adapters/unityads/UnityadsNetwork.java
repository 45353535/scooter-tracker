package com.appodeal.ads.adapters.unityads;

import android.content.Context;
import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkInitializationListener;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.utils.EventsTracker;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.unity3d.ads.UnityAds;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import eg.o0;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0005B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00030\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00030\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u00022\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010'\u001a\u00020\n2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u00022\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%H\u0016¢\u0006\u0004\b'\u0010(J'\u0010+\u001a\u00020\u00032\u0006\u0010!\u001a\u00020 2\u0006\u0010*\u001a\u00020)2\u0006\u0010$\u001a\u00020#H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u00100\u001a\u00020-8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00104\u001a\u0002018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00108\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010:\u001a\u0002058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b9\u00107¨\u0006;"}, d2 = {"Lcom/appodeal/ads/adapters/unityads/UnityadsNetwork;", "Lcom/appodeal/ads/AdNetwork;", "Lcom/appodeal/ads/adapters/unityads/f;", "Lcom/appodeal/ads/adapters/unityads/e;", "Lcom/appodeal/ads/AdNetworkBuilder;", "builder", "<init>", "(Lcom/appodeal/ads/AdNetworkBuilder;)V", "Landroid/content/Context;", "applicationContext", "", "subscribeOnImpressionEvents", "(Landroid/content/Context;)V", "Lcom/appodeal/ads/unified/UnifiedBanner;", "createBanner", "()Lcom/appodeal/ads/unified/UnifiedBanner;", "Lcom/appodeal/ads/unified/UnifiedRewarded;", "createRewarded", "()Lcom/appodeal/ads/unified/UnifiedRewarded;", "Lcom/appodeal/ads/unified/UnifiedInterstitial;", "createInterstitial", "()Lcom/appodeal/ads/unified/UnifiedInterstitial;", "", "enabled", "setLogging", "(Z)V", "isInitialized", "()Z", "Lorg/json/JSONObject;", "jsonObject", "getInitializeParams", "(Lorg/json/JSONObject;)Lcom/appodeal/ads/adapters/unityads/f;", "Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;", "contextProvider", "initParams", "Lcom/appodeal/ads/AdNetworkMediationParams;", "mediationParams", "Lcom/appodeal/ads/AdNetworkInitializationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, MobileAdsBridgeBase.initializeMethodName, "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/adapters/unityads/f;Lcom/appodeal/ads/AdNetworkMediationParams;Lcom/appodeal/ads/AdNetworkInitializationListener;)V", "Lcom/appodeal/ads/AdUnit;", "adUnit", "getAdUnitParams", "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/AdUnit;Lcom/appodeal/ads/AdNetworkMediationParams;)Lcom/appodeal/ads/adapters/unityads/e;", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope", "Lcom/appodeal/ads/adapters/unityads/j;", "getUnityMetaData", "()Lcom/appodeal/ads/adapters/unityads/j;", "unityMetaData", "", "getVersion", "()Ljava/lang/String;", "version", "getRecommendedVersion", "recommendedVersion", "unity_ads_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class UnityadsNetwork extends AdNetwork<f, e> {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/appodeal/ads/adapters/unityads/UnityadsNetwork$builder;", "Lcom/appodeal/ads/AdNetworkBuilder;", "<init>", "()V", "adActivities", "", "", "getAdActivities", "()Ljava/util/List;", "build", "Lcom/appodeal/ads/adapters/unityads/UnityadsNetwork;", "unity_ads_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class builder extends AdNetworkBuilder {
        private final List<String> adActivities;

        public builder() {
            super("unity_ads", "0");
            List listCreateListBuilder = CollectionsKt.createListBuilder();
            listCreateListBuilder.add("com.unity3d.services.ads.adunit.AdUnitActivity");
            listCreateListBuilder.add("com.unity3d.services.ads.adunit.AdUnitTransparentActivity");
            listCreateListBuilder.add("com.unity3d.services.ads.adunit.AdUnitTransparentSoftwareActivity");
            listCreateListBuilder.add("com.unity3d.services.ads.adunit.AdUnitSoftwareActivity");
            this.adActivities = CollectionsKt.build(listCreateListBuilder);
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        public List<String> getAdActivities() {
            return this.adActivities;
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        public UnityadsNetwork build() {
            return new UnityadsNetwork(this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityadsNetwork(AdNetworkBuilder builder2) {
        super(builder2);
        Intrinsics.checkNotNullParameter(builder2, "builder");
    }

    private final CoroutineScope getScope() {
        return kotlinx.coroutines.i.a(o0.c());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j getUnityMetaData() {
        return j.f12574a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void subscribeOnImpressionEvents(final Context applicationContext) {
        EventsTracker.get().subscribeEventsListener(getName(), new EventsTracker.EventsListener() { // from class: com.appodeal.ads.adapters.unityads.a
            @Override // com.appodeal.ads.utils.EventsTracker.EventsListener
            public final void onImpressionStored(AdType adType, String str) {
                UnityadsNetwork.subscribeOnImpressionEvents$lambda$1(this.f12556a, applicationContext, adType, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void subscribeOnImpressionEvents$lambda$1(UnityadsNetwork unityadsNetwork, Context context, AdType adType, String str) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        if (Intrinsics.areEqual(unityadsNetwork.getName(), str)) {
            eg.i.d(unityadsNetwork.getScope(), null, null, new n(unityadsNetwork, context, null), 3, null);
        } else if (ArraysKt.contains(new AdType[]{AdType.Banner, AdType.Interstitial, AdType.Rewarded}, adType)) {
            eg.i.d(unityadsNetwork.getScope(), null, null, new m(unityadsNetwork, context, null), 3, null);
        }
    }

    @Override // com.appodeal.ads.AdNetwork
    public UnifiedBanner<e> createBanner() {
        return new com.appodeal.ads.adapters.unityads.banner.a();
    }

    @Override // com.appodeal.ads.AdNetwork
    public UnifiedInterstitial<e> createInterstitial() {
        return new com.appodeal.ads.adapters.unityads.interstitial.a();
    }

    @Override // com.appodeal.ads.AdNetwork
    public UnifiedRewarded<e> createRewarded() {
        return new com.appodeal.ads.adapters.unityads.rewarded_video.a();
    }

    @Override // com.appodeal.ads.AdNetwork
    public String getRecommendedVersion() {
        return "4.16.4";
    }

    @Override // com.appodeal.ads.AdNetwork
    public String getVersion() {
        return UnityAds.getVersion();
    }

    @Override // com.appodeal.ads.AdNetwork
    public boolean isInitialized() {
        return UnityAds.isInitialized();
    }

    @Override // com.appodeal.ads.AdNetwork
    public void setLogging(boolean enabled) {
        UnityAds.setDebugMode(enabled);
    }

    @Override // com.appodeal.ads.AdNetwork
    public e getAdUnitParams(ContextProvider contextProvider, AdUnit adUnit, AdNetworkMediationParams mediationParams) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        eg.i.d(getScope(), null, null, new k(contextProvider, adUnit, this, mediationParams, null), 3, null);
        String strOptString = adUnit.getJsonData().optString(Reporting.Key.ZONE_ID);
        Intrinsics.checkNotNullExpressionValue(strOptString, "optString(...)");
        return new e(strOptString);
    }

    @Override // com.appodeal.ads.AdNetwork
    public f getInitializeParams(JSONObject jsonObject) {
        Object objB;
        String strOptString;
        String strOptString2;
        try {
            Result.Companion companion = Result.f93230c;
            String str = "";
            if (jsonObject == null || (strOptString = jsonObject.optString("app_id")) == null) {
                strOptString = "";
            }
            if (jsonObject != null && (strOptString2 = jsonObject.optString("mediator")) != null) {
                str = strOptString2;
            }
            objB = Result.b(new f(strOptString, str));
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            objB = Result.b(kotlin.d.a(th2));
        }
        if (Result.i(objB)) {
            objB = null;
        }
        return (f) objB;
    }

    @Override // com.appodeal.ads.AdNetwork
    public void initialize(ContextProvider contextProvider, f initParams, AdNetworkMediationParams mediationParams, AdNetworkInitializationListener listener) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(initParams, "initParams");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        Intrinsics.checkNotNullParameter(listener, "listener");
        eg.i.d(getScope(), null, null, new l(initParams, listener, contextProvider, this, mediationParams, null), 3, null);
    }
}
