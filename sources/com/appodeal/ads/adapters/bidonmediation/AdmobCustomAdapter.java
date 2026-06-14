package com.appodeal.ads.adapters.bidonmediation;

import android.content.Context;
import com.appodeal.ads.adapters.bidonmediation.banner.AdmobBannerImpl;
import com.appodeal.ads.adapters.bidonmediation.ext.ExtKt;
import com.appodeal.ads.adapters.bidonmediation.interstitial.AdmobInterstitialImpl;
import com.appodeal.ads.adapters.bidonmediation.rewarded.AdmobRewardedImpl;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.g;
import kotlin.jvm.internal.Intrinsics;
import of.e;
import org.bidon.sdk.adapter.AdProvider;
import org.bidon.sdk.adapter.AdSource;
import org.bidon.sdk.adapter.Adapter;
import org.bidon.sdk.adapter.AdapterInfo;
import org.bidon.sdk.adapter.DemandId;
import org.bidon.sdk.adapter.Initializable;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0000\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00050\u00042\b\u0012\u0004\u0012\u00020\u00070\u00062\b\u0012\u0004\u0012\u00020\u00070\bB\u0007¢\u0006\u0004\b\t\u0010\nJ\u001e\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0003H\u0096@¢\u0006\u0002\u0010\u0018J\u000e\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u001aH\u0016J\u000e\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00070\u001cH\u0016J\u000e\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00050\u001eH\u0016J\u0010\u0010\u001f\u001a\u00020\u00032\u0006\u0010 \u001a\u00020!H\u0016R\u0014\u0010\u000b\u001a\u00020\fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\""}, d2 = {"Lcom/appodeal/ads/adapters/bidonmediation/AdmobCustomAdapter;", "Lorg/bidon/sdk/adapter/Adapter$Network;", "Lorg/bidon/sdk/adapter/Initializable;", "Lcom/appodeal/ads/adapters/bidonmediation/AdmobInitParameters;", "Lorg/bidon/sdk/adapter/AdProvider$Banner;", "Lcom/appodeal/ads/adapters/bidonmediation/AdmobBannerAuctionParams;", "Lorg/bidon/sdk/adapter/AdProvider$Rewarded;", "Lcom/appodeal/ads/adapters/bidonmediation/AdmobFullscreenAdAuctionParams;", "Lorg/bidon/sdk/adapter/AdProvider$Interstitial;", "<init>", "()V", "demandId", "Lorg/bidon/sdk/adapter/DemandId;", "getDemandId", "()Lorg/bidon/sdk/adapter/DemandId;", "adapterInfo", "Lorg/bidon/sdk/adapter/AdapterInfo;", "getAdapterInfo", "()Lorg/bidon/sdk/adapter/AdapterInfo;", "init", "", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", "configParams", "(Landroid/content/Context;Lcom/appodeal/ads/adapters/bidonmediation/AdmobInitParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "interstitial", "Lorg/bidon/sdk/adapter/AdSource$Interstitial;", "rewarded", "Lorg/bidon/sdk/adapter/AdSource$Rewarded;", "banner", "Lorg/bidon/sdk/adapter/AdSource$Banner;", "parseConfigParam", "json", "", "admob_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class AdmobCustomAdapter implements Adapter.Network, Initializable<AdmobInitParameters>, AdProvider.Banner<AdmobBannerAuctionParams>, AdProvider.Rewarded<AdmobFullscreenAdAuctionParams>, AdProvider.Interstitial<AdmobFullscreenAdAuctionParams> {

    @NotNull
    private final DemandId demandId = AdmobCustomAdapterKt.getAdmobDemandId();

    @NotNull
    private final AdapterInfo adapterInfo = new AdapterInfo(ExtKt.getAdapterVersion(), ExtKt.getSdkVersion());

    @Override // org.bidon.sdk.adapter.AdProvider.Banner
    @NotNull
    public AdSource.Banner<AdmobBannerAuctionParams> banner() {
        return new AdmobBannerImpl(null, null, 3, null);
    }

    @Override // org.bidon.sdk.adapter.Adapter
    @NotNull
    public AdapterInfo getAdapterInfo() {
        return this.adapterInfo;
    }

    @Override // org.bidon.sdk.adapter.Adapter
    @NotNull
    public DemandId getDemandId() {
        return this.demandId;
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Interstitial
    @NotNull
    public AdSource.Interstitial<AdmobFullscreenAdAuctionParams> interstitial() {
        return new AdmobInterstitialImpl(null, null, null, 7, null);
    }

    @Override // org.bidon.sdk.adapter.AdProvider.Rewarded
    @NotNull
    public AdSource.Rewarded<AdmobFullscreenAdAuctionParams> rewarded() {
        return new AdmobRewardedImpl(null, null, null, 7, null);
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @Nullable
    public Object init(@NotNull Context context, @NotNull AdmobInitParameters admobInitParameters, @NotNull Continuation continuation) throws Throwable {
        final e eVar = new e(b.d(continuation));
        MobileAds.initialize(context, new OnInitializationCompleteListener() { // from class: com.appodeal.ads.adapters.bidonmediation.AdmobCustomAdapter$init$2$1
            @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
            public final void onInitializationComplete(InitializationStatus it) {
                Intrinsics.checkNotNullParameter(it, "it");
                Continuation continuation2 = eVar;
                Result.Companion companion = Result.f93230c;
                continuation2.resumeWith(Result.b(Unit.f93236a));
            }
        });
        Object objB = eVar.b();
        if (objB == b.g()) {
            g.c(continuation);
        }
        return objB == b.g() ? objB : Unit.f93236a;
    }

    @Override // org.bidon.sdk.adapter.Initializable
    @NotNull
    public AdmobInitParameters parseConfigParam(@NotNull String json) {
        Intrinsics.checkNotNullParameter(json, "json");
        return new AdmobInitParameters();
    }
}
