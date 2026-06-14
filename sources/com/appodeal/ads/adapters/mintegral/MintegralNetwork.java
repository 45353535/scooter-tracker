package com.appodeal.ads.adapters.mintegral;

import android.content.Context;
import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkInitializationListener;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.utils.Log;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.out.SDKInitStatusListener;
import com.mbridge.msdk.system.MBridgeSDKImpl;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.lang.reflect.Method;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.collections.CollectionsKt;
import kotlin.d;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import net.pubnative.lite.sdk.analytics.Reporting;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0005B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u001b\u0010'\u001a\u0004\u0018\u00010\u00022\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b'\u0010(J/\u00100\u001a\u00020\f2\u0006\u0010*\u001a\u00020)2\u0006\u0010+\u001a\u00020\u00022\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J'\u00104\u001a\u00020\u00032\u0006\u0010*\u001a\u00020)2\u0006\u00103\u001a\u0002022\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b4\u00105R\u0014\u0010#\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00107R\u0014\u00108\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u001a\u00109\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R\u001a\u0010=\u001a\u00020\u000f8\u0016X\u0096D¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b>\u0010<¨\u0006?"}, d2 = {"Lcom/appodeal/ads/adapters/mintegral/MintegralNetwork;", "Lcom/appodeal/ads/AdNetwork;", "Lcom/appodeal/ads/adapters/mintegral/b;", "Lcom/appodeal/ads/adapters/mintegral/a;", "Lcom/appodeal/ads/AdNetworkBuilder;", "builder", "<init>", "(Lcom/appodeal/ads/AdNetworkBuilder;)V", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/appodeal/ads/RestrictedData;", "restrictedData", "", "updateConsent", "(Landroid/content/Context;Lcom/appodeal/ads/RestrictedData;)V", "", "mediatorName", "setMediator", "(Ljava/lang/String;)V", "Lcom/appodeal/ads/adapters/mintegral/banner/b;", "createBanner", "()Lcom/appodeal/ads/adapters/mintegral/banner/b;", "Lcom/appodeal/ads/adapters/mintegral/mrec/b;", "createMrec", "()Lcom/appodeal/ads/adapters/mintegral/mrec/b;", "Lcom/appodeal/ads/adapters/mintegral/interstitial/b;", "createInterstitial", "()Lcom/appodeal/ads/adapters/mintegral/interstitial/b;", "Lcom/appodeal/ads/adapters/mintegral/rewarded/b;", "createRewarded", "()Lcom/appodeal/ads/adapters/mintegral/rewarded/b;", "Lcom/appodeal/ads/adapters/mintegral/native_ad/b;", "createNativeAd", "()Lcom/appodeal/ads/adapters/mintegral/native_ad/b;", "", "isInitialized", "()Z", "Lorg/json/JSONObject;", "jsonObject", "getInitializeParams", "(Lorg/json/JSONObject;)Lcom/appodeal/ads/adapters/mintegral/b;", "Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;", "contextProvider", "initParams", "Lcom/appodeal/ads/AdNetworkMediationParams;", "mediationParams", "Lcom/appodeal/ads/AdNetworkInitializationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, MobileAdsBridgeBase.initializeMethodName, "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/adapters/mintegral/b;Lcom/appodeal/ads/AdNetworkMediationParams;Lcom/appodeal/ads/AdNetworkInitializationListener;)V", "Lcom/appodeal/ads/AdUnit;", "adUnit", "getAdUnitParams", "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/AdUnit;Lcom/appodeal/ads/AdNetworkMediationParams;)Lcom/appodeal/ads/adapters/mintegral/a;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isMediatorInitialized", "version", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "recommendedVersion", "getRecommendedVersion", "mintegral_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MintegralNetwork extends AdNetwork<b, a> {

    @NotNull
    private final AtomicBoolean isInitialized;

    @NotNull
    private final AtomicBoolean isMediatorInitialized;

    @NotNull
    private final String recommendedVersion;

    @NotNull
    private final String version;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/appodeal/ads/adapters/mintegral/MintegralNetwork$builder;", "Lcom/appodeal/ads/AdNetworkBuilder;", "<init>", "()V", "adActivities", "", "", "getAdActivities", "()Ljava/util/List;", "build", "Lcom/appodeal/ads/adapters/mintegral/MintegralNetwork;", "mintegral_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class builder extends AdNetworkBuilder {
        public builder() {
            super("mintegral", "0");
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public List<String> getAdActivities() {
            return CollectionsKt.listOf((Object[]) new String[]{"com.mbridge.msdk.activity.MBCommonActivity", "com.mbridge.msdk.reward.player.MBRewardVideoActivity", "com.mbridge.msdk.interstitial.view.MBInterstitialActivity", "com.mbridge.msdk.interactiveads.activity.InteractiveShowActivity"});
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public MintegralNetwork build() {
            return new MintegralNetwork(this, null);
        }
    }

    public /* synthetic */ MintegralNetwork(AdNetworkBuilder adNetworkBuilder, DefaultConstructorMarker defaultConstructorMarker) {
        this(adNetworkBuilder);
    }

    private final void setMediator(String mediatorName) {
        try {
            if (this.isMediatorInitialized.getAndSet(true)) {
                return;
            }
            Aa aa2 = new Aa();
            Method declaredMethod = Aa.class.getDeclaredMethod("b", String.class);
            Intrinsics.checkNotNullExpressionValue(declaredMethod, "getDeclaredMethod(...)");
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(aa2, mediatorName);
        } catch (Exception e10) {
            Log.log(e10);
        }
    }

    private final void updateConsent(Context context, RestrictedData restrictedData) {
        MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
        if (restrictedData.isUserInGdprScope()) {
            mBridgeSDK.setUserPrivateInfoType(context, MBridgeConstans.AUTHORITY_ALL_INFO, restrictedData.isUserHasConsent() ? 1 : 0);
        }
        if (restrictedData.isUserInCcpaScope()) {
            mBridgeSDK.setDoNotTrackStatus(context, !restrictedData.isUserHasConsent());
        }
        mBridgeSDK.setCoppaStatus(context, restrictedData.isUserAgeRestricted());
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
        String str = initParams.f12494a;
        String str2 = initParams.f12495b;
        if (str.length() == 0 || str2.length() == 0) {
            listener.onInitializationFailed(LoadingError.IncorrectAdunit);
            return;
        }
        Context applicationContext = contextProvider.getApplicationContext();
        updateConsent(applicationContext, mediationParams.getRestrictedData());
        setMediator(initParams.f12496c);
        if (this.isInitialized.get()) {
            listener.onInitializationFinished();
            return;
        }
        MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
        Intrinsics.checkNotNullExpressionValue(mBridgeSDK, "getMBridgeSDK(...)");
        mBridgeSDK.init(mBridgeSDK.getMBConfigurationMap(str, str2), applicationContext, new SDKInitStatusListener() { // from class: com.appodeal.ads.adapters.mintegral.MintegralNetwork.initialize.1
            @Override // com.mbridge.msdk.out.SDKInitStatusListener
            public void onInitFail(String errorMsg) {
                Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
                listener.onInitializationFailed(LoadingError.InternalError);
            }

            @Override // com.mbridge.msdk.out.SDKInitStatusListener
            public void onInitSuccess() {
                MintegralNetwork.this.isInitialized.set(true);
                listener.onInitializationFinished();
            }
        });
    }

    @Override // com.appodeal.ads.AdNetwork
    public boolean isInitialized() {
        return this.isInitialized.get();
    }

    private MintegralNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
        this.isInitialized = new AtomicBoolean(false);
        this.isMediatorInitialized = new AtomicBoolean(false);
        this.version = MBConfiguration.SDK_VERSION;
        this.recommendedVersion = "17.0.31";
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.mintegral.banner.b createBanner() {
        return new com.appodeal.ads.adapters.mintegral.banner.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.mintegral.interstitial.b createInterstitial() {
        return new com.appodeal.ads.adapters.mintegral.interstitial.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.mintegral.mrec.b createMrec() {
        return new com.appodeal.ads.adapters.mintegral.mrec.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.mintegral.native_ad.b createNativeAd() {
        return new com.appodeal.ads.adapters.mintegral.native_ad.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public com.appodeal.ads.adapters.mintegral.rewarded.b createRewarded() {
        return new com.appodeal.ads.adapters.mintegral.rewarded.b();
    }

    @Override // com.appodeal.ads.AdNetwork
    @NotNull
    public a getAdUnitParams(@NotNull ContextProvider contextProvider, @NotNull AdUnit adUnit, @NotNull AdNetworkMediationParams mediationParams) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        Context applicationContext = contextProvider.getApplicationContext();
        RestrictedData restrictedData = mediationParams.getRestrictedData();
        boolean zAreEqual = Intrinsics.areEqual(adUnit.isMuted(), Boolean.TRUE);
        String strOptString = adUnit.getJsonData().optString(MBridgeConstans.PROPERTIES_UNIT_ID);
        String strOptString2 = adUnit.getJsonData().optString(Reporting.Key.PLACEMENT_ID);
        updateConsent(applicationContext, restrictedData);
        Intrinsics.checkNotNull(strOptString);
        Intrinsics.checkNotNull(strOptString2);
        return new a(strOptString, strOptString2, zAreEqual);
    }

    @Override // com.appodeal.ads.AdNetwork
    @Nullable
    public b getInitializeParams(@Nullable JSONObject jsonObject) {
        Object objB;
        String strOptString;
        String strOptString2;
        String strOptString3;
        try {
            Result.Companion companion = Result.f93230c;
            String str = "";
            if (jsonObject == null || (strOptString = jsonObject.optString("app_id")) == null) {
                strOptString = "";
            }
            if (jsonObject == null || (strOptString2 = jsonObject.optString("api_key")) == null) {
                strOptString2 = "";
            }
            if (jsonObject != null && (strOptString3 = jsonObject.optString("mediator")) != null) {
                str = strOptString3;
            }
            objB = Result.b(new b(strOptString, strOptString2, str));
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
