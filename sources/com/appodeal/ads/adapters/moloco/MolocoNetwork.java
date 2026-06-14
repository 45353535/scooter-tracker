package com.appodeal.ads.adapters.moloco;

import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkInitializationListener;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.moloco.sdk.BuildConfig;
import com.moloco.sdk.publisher.Moloco;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0005B\u0011\b\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J/\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u001d8\u0016X\u0096D¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u001d8\u0016X\u0096D¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!¨\u0006$"}, d2 = {"Lcom/appodeal/ads/adapters/moloco/MolocoNetwork;", "Lcom/appodeal/ads/AdNetwork;", "Lcom/appodeal/ads/adapters/moloco/b;", "Lcom/appodeal/ads/adapters/moloco/a;", "Lcom/appodeal/ads/AdNetworkBuilder;", "builder", "<init>", "(Lcom/appodeal/ads/AdNetworkBuilder;)V", "", "isInitialized", "()Z", "Lorg/json/JSONObject;", "jsonObject", "getInitializeParams", "(Lorg/json/JSONObject;)Lcom/appodeal/ads/adapters/moloco/b;", "Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;", "contextProvider", "Lcom/appodeal/ads/AdUnit;", "adUnit", "Lcom/appodeal/ads/AdNetworkMediationParams;", "mediationParams", "getAdUnitParams", "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/AdUnit;Lcom/appodeal/ads/AdNetworkMediationParams;)Lcom/appodeal/ads/adapters/moloco/a;", "initParams", "Lcom/appodeal/ads/AdNetworkInitializationListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "", MobileAdsBridgeBase.initializeMethodName, "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/adapters/moloco/b;Lcom/appodeal/ads/AdNetworkMediationParams;Lcom/appodeal/ads/AdNetworkInitializationListener;)V", "", "version", "Ljava/lang/String;", "getVersion", "()Ljava/lang/String;", "recommendedVersion", "getRecommendedVersion", "moloco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class MolocoNetwork extends AdNetwork<b, a> {
    private final String recommendedVersion;
    private final String version;

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u000b"}, d2 = {"Lcom/appodeal/ads/adapters/moloco/MolocoNetwork$builder;", "Lcom/appodeal/ads/AdNetworkBuilder;", "<init>", "()V", "adActivities", "", "", "getAdActivities", "()Ljava/util/List;", "build", "Lcom/appodeal/ads/adapters/moloco/MolocoNetwork;", "moloco_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class builder extends AdNetworkBuilder {
        private final List<String> adActivities;

        public builder() {
            super("moloco", "0");
            this.adActivities = CollectionsKt.listOf((Object[]) new String[]{"com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity", "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.StaticAdActivity", "com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity"});
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        public List<String> getAdActivities() {
            return this.adActivities;
        }

        @Override // com.appodeal.ads.AdNetworkBuilder
        public MolocoNetwork build() {
            return new MolocoNetwork(this, null);
        }
    }

    public /* synthetic */ MolocoNetwork(AdNetworkBuilder adNetworkBuilder, DefaultConstructorMarker defaultConstructorMarker) {
        this(adNetworkBuilder);
    }

    @Override // com.appodeal.ads.AdNetwork
    public String getRecommendedVersion() {
        return this.recommendedVersion;
    }

    @Override // com.appodeal.ads.AdNetwork
    public String getVersion() {
        return this.version;
    }

    @Override // com.appodeal.ads.AdNetwork
    public void initialize(ContextProvider contextProvider, b initParams, AdNetworkMediationParams mediationParams, AdNetworkInitializationListener listener) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(initParams, "initParams");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        Intrinsics.checkNotNullParameter(listener, "listener");
    }

    @Override // com.appodeal.ads.AdNetwork
    public boolean isInitialized() {
        return Moloco.isInitialized();
    }

    private MolocoNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
        this.version = BuildConfig.SDK_VERSION_NAME;
        this.recommendedVersion = BuildConfig.SDK_VERSION_NAME;
    }

    @Override // com.appodeal.ads.AdNetwork
    public a getAdUnitParams(ContextProvider contextProvider, AdUnit adUnit, AdNetworkMediationParams mediationParams) {
        Intrinsics.checkNotNullParameter(contextProvider, "contextProvider");
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(mediationParams, "mediationParams");
        return new a();
    }

    @Override // com.appodeal.ads.AdNetwork
    public b getInitializeParams(JSONObject jsonObject) {
        return new b();
    }
}
