package com.appodeal.ads;

import com.appodeal.ads.AdUnitParams;
import com.appodeal.ads.InitializeParams;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAppStateChangeListener;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4574uf;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u0002*\b\b\u0001\u0010\u0003*\u00020\u00042\u00020\u0005B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010%\u001a\u00020\u0015H&J\u0019\u0010&\u001a\u0004\u0018\u00018\u00002\b\u0010'\u001a\u0004\u0018\u00010(H&¢\u0006\u0002\u0010)J-\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00028\u00002\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202H&¢\u0006\u0002\u00103J%\u00104\u001a\u00028\u00012\u0006\u0010,\u001a\u00020-2\u0006\u00105\u001a\u0002062\u0006\u0010/\u001a\u000200H&¢\u0006\u0002\u00107J\u0010\u00108\u001a\u00020+2\u0006\u00109\u001a\u00020\u0015H\u0016J\u0012\u0010:\u001a\u0004\u0018\u00010;2\u0006\u0010<\u001a\u00020=H\u0016J\u0010\u0010>\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010?H\u0016J\u0010\u0010@\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010AH\u0016J\u0010\u0010B\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010CH\u0016J\u0010\u0010D\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010EH\u0016J\u0010\u0010F\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010GH\u0016J\b\u0010H\u001a\u00020\u0015H\u0016J\b\u0010I\u001a\u00020\u0015H\u0016J\b\u0010J\u001a\u00020\u0015H\u0016R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u000e\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R$\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0015@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019R\u0012\u0010\u001c\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\rR\u0012\u0010\u001e\u001a\u00020\u000bX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010\rR\u0014\u0010 \u001a\u00020\u0015X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0017R\u0016\u0010!\u001a\u0004\u0018\u00010\"X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u0006K"}, d2 = {"Lcom/appodeal/ads/AdNetwork;", "InitParams", "Lcom/appodeal/ads/InitializeParams;", "AdParams", "Lcom/appodeal/ads/AdUnitParams;", "", "builder", "Lcom/appodeal/ads/AdNetworkBuilder;", "<init>", "(Lcom/appodeal/ads/AdNetworkBuilder;)V", "name", "", "getName", "()Ljava/lang/String;", C4574uf.f45563b, "getAdapterVersion", "adActivities", "", "getAdActivities", "()Ljava/util/List;", "isShowing", "", "isInterstitialShowing", "()Z", "setInterstitialShowing", "(Z)V", "isRewardedShowing", "setRewardedShowing", "version", "getVersion", "recommendedVersion", "getRecommendedVersion", "isSupportSmartBanners", "appStateChangeListener", "Lcom/appodeal/ads/unified/UnifiedAppStateChangeListener;", "getAppStateChangeListener", "()Lcom/appodeal/ads/unified/UnifiedAppStateChangeListener;", "isInitialized", "getInitializeParams", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)Lcom/appodeal/ads/InitializeParams;", MobileAdsBridgeBase.initializeMethodName, "", "contextProvider", "Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;", "initParams", "mediationParams", "Lcom/appodeal/ads/AdNetworkMediationParams;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/appodeal/ads/AdNetworkInitializationListener;", "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/InitializeParams;Lcom/appodeal/ads/AdNetworkMediationParams;Lcom/appodeal/ads/AdNetworkInitializationListener;)V", "getAdUnitParams", "adUnit", "Lcom/appodeal/ads/AdUnit;", "(Lcom/appodeal/ads/modules/common/internal/context/ContextProvider;Lcom/appodeal/ads/AdUnit;Lcom/appodeal/ads/AdNetworkMediationParams;)Lcom/appodeal/ads/AdUnitParams;", "setLogging", "enabled", "verifyLoadAvailability", "Lcom/appodeal/ads/networking/LoadingError;", "adType", "Lcom/appodeal/ads/modules/common/internal/adtype/AdType;", "createBanner", "Lcom/appodeal/ads/unified/UnifiedBanner;", "createMrec", "Lcom/appodeal/ads/unified/UnifiedMrec;", "createInterstitial", "Lcom/appodeal/ads/unified/UnifiedInterstitial;", "createRewarded", "Lcom/appodeal/ads/unified/UnifiedRewarded;", "createNativeAd", "Lcom/appodeal/ads/unified/UnifiedNative;", "canLoadInterstitialWhenDisplaying", "canLoadVideoWhenDisplaying", "canLoadRewardedWhenDisplaying", "core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class AdNetwork<InitParams extends InitializeParams, AdParams extends AdUnitParams> {

    @NotNull
    private final List<String> adActivities;

    @NotNull
    private final String adapterVersion;

    @Nullable
    private final UnifiedAppStateChangeListener appStateChangeListener;
    private boolean isInterstitialShowing;
    private boolean isRewardedShowing;
    private final boolean isSupportSmartBanners;

    @NotNull
    private final String name;

    public AdNetwork(@NotNull AdNetworkBuilder builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.name = builder.getAdapterName();
        this.adapterVersion = builder.getAdapterVersion();
        this.adActivities = builder.getAdActivities();
    }

    public boolean canLoadInterstitialWhenDisplaying() {
        return true;
    }

    public boolean canLoadRewardedWhenDisplaying() {
        return true;
    }

    public boolean canLoadVideoWhenDisplaying() {
        return true;
    }

    @Nullable
    public UnifiedBanner<AdParams> createBanner() {
        return null;
    }

    @Nullable
    public UnifiedInterstitial<AdParams> createInterstitial() {
        return null;
    }

    @Nullable
    public UnifiedMrec<AdParams> createMrec() {
        return null;
    }

    @Nullable
    public UnifiedNative<AdParams> createNativeAd() {
        return null;
    }

    @Nullable
    public UnifiedRewarded<AdParams> createRewarded() {
        return null;
    }

    @NotNull
    public final List<String> getAdActivities() {
        return this.adActivities;
    }

    @NotNull
    public abstract AdParams getAdUnitParams(@NotNull ContextProvider contextProvider, @NotNull AdUnit adUnit, @NotNull AdNetworkMediationParams mediationParams);

    @NotNull
    public final String getAdapterVersion() {
        return this.adapterVersion;
    }

    @Nullable
    public UnifiedAppStateChangeListener getAppStateChangeListener() {
        return this.appStateChangeListener;
    }

    @Nullable
    public abstract InitParams getInitializeParams(@Nullable JSONObject jsonObject);

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public abstract String getRecommendedVersion();

    @NotNull
    public abstract String getVersion();

    public abstract void initialize(@NotNull ContextProvider contextProvider, @NotNull InitParams initParams, @NotNull AdNetworkMediationParams mediationParams, @NotNull AdNetworkInitializationListener listener);

    public abstract boolean isInitialized();

    /* JADX INFO: renamed from: isInterstitialShowing, reason: from getter */
    public final boolean getIsInterstitialShowing() {
        return this.isInterstitialShowing;
    }

    /* JADX INFO: renamed from: isRewardedShowing, reason: from getter */
    public final boolean getIsRewardedShowing() {
        return this.isRewardedShowing;
    }

    /* JADX INFO: renamed from: isSupportSmartBanners, reason: from getter */
    public boolean getIsSupportSmartBanners() {
        return this.isSupportSmartBanners;
    }

    public final void setInterstitialShowing(boolean z10) {
        if (canLoadInterstitialWhenDisplaying()) {
            return;
        }
        this.isInterstitialShowing = z10;
    }

    public void setLogging(boolean enabled) {
    }

    public final void setRewardedShowing(boolean z10) {
        if (canLoadRewardedWhenDisplaying()) {
            return;
        }
        this.isRewardedShowing = z10;
    }

    @Nullable
    public LoadingError verifyLoadAvailability(@NotNull AdType adType) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        return null;
    }
}
