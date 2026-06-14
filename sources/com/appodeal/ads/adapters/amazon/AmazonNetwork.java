package com.appodeal.ads.adapters.amazon;

import android.content.Context;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DtbConstants;
import com.amazon.device.ads.MRAIDPolicy;
import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkInitializationListener;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.mbridge.msdk.MBridgeConstans;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import io.bidmachine.ads.networks.nast.NastAdapter;
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
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0005B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001c\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010 \u001a\u00020\u00032\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\"8\u0016X\u0096D¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010'\u001a\u00020\"8\u0016X\u0096D¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b(\u0010&¨\u0006)"}, d2 = {"Lcom/appodeal/ads/adapters/amazon/AmazonNetwork;", "Lcom/appodeal/ads/AdNetwork;", "Lcom/appodeal/ads/adapters/amazon/b;", "Lcom/appodeal/ads/adapters/amazon/a;", "Lcom/appodeal/ads/AdNetworkBuilder;", "builder", "<init>", "(Lcom/appodeal/ads/AdNetworkBuilder;)V", "Lcom/appodeal/ads/AdNetworkMediationParams;", "mediationParams", "", "configureAdRegistration", "(Lcom/appodeal/ads/AdNetworkMediationParams;)V", "", "enabled", "setLogging", "(Z)V", "isInitialized", "()Z", "Lorg/json/JSONObject;", "jsonObject", "getInitializeParams", "(Lorg/json/JSONObject;)Lcom/appodeal/ads/adapters/amazon/b;", "Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;", "contextProvider", "initParams", "Lcom/appodeal/ads/AdNetworkInitializationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, MobileAdsBridgeBase.initializeMethodName, "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/adapters/amazon/b;Lcom/appodeal/ads/AdNetworkMediationParams;Lcom/appodeal/ads/AdNetworkInitializationListener;)V", "Lcom/appodeal/ads/AdUnit;", "adUnit", "getAdUnitParams", "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/AdUnit;Lcom/appodeal/ads/AdNetworkMediationParams;)Lcom/appodeal/ads/adapters/amazon/a;", "", "version", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "recommendedVersion", "getRecommendedVersion", "amazon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AmazonNetwork extends AdNetwork<b, a> {

    @NotNull
    private final String recommendedVersion;

    @NotNull
    private final String version;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/appodeal/ads/adapters/amazon/AmazonNetwork$builder;", "Lcom/appodeal/ads/AdNetworkBuilder;", "<init>", "()V", "adActivities", "", "", "getAdActivities", "()Ljava/util/List;", "build", "Lcom/appodeal/ads/adapters/amazon/AmazonNetwork;", "amazon_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class builder extends AdNetworkBuilder {
        public builder() {
            super("amazon", "0");
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public List<String> getAdActivities() {
            return CollectionsKt.listOf((Object[]) new String[]{"com.amazon.aps.ads.activity.ApsInterstitialActivity", "com.amazon.device.ads.DTBInterstitialActivity"});
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        @NotNull
        public AmazonNetwork build() {
            return new AmazonNetwork(this, null);
        }
    }

    public /* synthetic */ AmazonNetwork(AdNetworkBuilder adNetworkBuilder, DefaultConstructorMarker defaultConstructorMarker) {
        this(adNetworkBuilder);
    }

    private final void configureAdRegistration(AdNetworkMediationParams mediationParams) {
        AdRegistration.setMRAIDSupportedVersions(new String[]{NastAdapter.ADAPTER_SDK_VERSION_NAME, "2.0", "3.0"});
        AdRegistration.setMRAIDPolicy(MRAIDPolicy.CUSTOM);
        AdRegistration.enableTesting(mediationParams.isTestMode());
        AdRegistration.useGeoLocation(mediationParams.getRestrictedData().canSendLocation());
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
        return AdRegistration.isInitialized();
    }

    @Override // com.appodeal.ads.AdNetwork
    public void setLogging(boolean enabled) {
        AdRegistration.enableLogging(enabled);
    }

    private AmazonNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
        this.version = DtbConstants.SDK_VERSION;
        this.recommendedVersion = DtbConstants.SDK_VERSION;
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
        String strOptString;
        try {
            Result.Companion companion = Result.f93230c;
            if (jsonObject == null || (strOptString = jsonObject.optString(MBridgeConstans.APP_KEY)) == null) {
                strOptString = "";
            }
            return new b(strOptString);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            Object objB = Result.b(d.a(th2));
            if (Result.i(objB)) {
                objB = null;
            }
            return (b) objB;
        }
    }

    @Override // com.appodeal.ads.AdNetwork
    public void initialize(@NotNull ContextProvider contextProvider, @NotNull b initParams, @NotNull AdNetworkMediationParams mediationParams, @NotNull AdNetworkInitializationListener listener) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(initParams, "initParams");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        Intrinsics.checkNotNullParameter(listener, "listener");
        configureAdRegistration(mediationParams);
        String str = initParams.f11959a;
        Context resumedActivity = contextProvider.getResumedActivity();
        if (resumedActivity == null) {
            resumedActivity = contextProvider.getApplicationContext();
        }
        AdRegistration.getInstance(str, resumedActivity);
        listener.onInitializationFinished();
    }
}
