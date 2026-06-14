package com.ironsource.adapters.unityads;

import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.N6;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.bidding.BiddingDataCallback;
import com.ironsource.mediationsdk.l;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.unity3d.ads.AdFormat;
import com.unity3d.ads.IUnityAdsInitializationListener;
import com.unity3d.ads.IUnityAdsTokenListener;
import com.unity3d.ads.TokenConfiguration;
import com.unity3d.ads.UnityAds;
import com.unity3d.ads.UnityAdsLoadOptions;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.metadata.MediationMetaData;
import com.unity3d.ads.metadata.MetaData;
import com.unity3d.ads.metadata.PlayerMetaData;
import com.unity3d.mediation.LevelPlay;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.b1;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000Ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u0086\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0086\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0013J)\u0010\u0019\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ!\u0010!\u001a\u0004\u0018\u00010 2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b!\u0010\"J)\u0010(\u001a\u00020'2\u0006\u0010#\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020\u00042\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b(\u0010)J\u0019\u0010-\u001a\u00020,2\b\u0010+\u001a\u0004\u0018\u00010*H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0004H\u0016¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0004H\u0016¢\u0006\u0004\b1\u00100J\u0017\u00103\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u000202H\u0016¢\u0006\u0004\b3\u00104J\u000f\u00105\u001a\u00020\nH\u0016¢\u0006\u0004\b5\u00106J#\u00108\u001a\u00020\n2\b\u0010+\u001a\u0004\u0018\u00010*2\b\u00107\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b8\u00109J\u000f\u0010:\u001a\u00020\nH\u0016¢\u0006\u0004\b:\u00106J\u0017\u0010;\u001a\u00020\n2\u0006\u0010+\u001a\u00020\u0004H\u0016¢\u0006\u0004\b;\u0010\u0007J7\u0010?\u001a\u00020\n2\b\u0010<\u001a\u0004\u0018\u00010\u00042\b\u0010=\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010&\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\b?\u0010@J7\u0010C\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010A\u001a\u0004\u0018\u00010\b2\b\u0010B\u001a\u0004\u0018\u00010\u00042\b\u0010&\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\bC\u0010DJ#\u0010E\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010&\u001a\u0004\u0018\u00010>H\u0016¢\u0006\u0004\bE\u0010FJ\u0019\u0010G\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\bG\u0010HJ+\u0010I\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010A\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010M\u001a\u00020L2\u0006\u0010K\u001a\u00020\bH\u0016¢\u0006\u0004\bM\u0010NJ7\u0010P\u001a\u00020\n2\b\u0010<\u001a\u0004\u0018\u00010\u00042\b\u0010=\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010&\u001a\u0004\u0018\u00010OH\u0016¢\u0006\u0004\bP\u0010QJ7\u0010R\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010A\u001a\u0004\u0018\u00010\b2\b\u0010B\u001a\u0004\u0018\u00010\u00042\b\u0010&\u001a\u0004\u0018\u00010OH\u0016¢\u0006\u0004\bR\u0010SJ#\u0010T\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010&\u001a\u0004\u0018\u00010OH\u0016¢\u0006\u0004\bT\u0010UJ\u0019\u0010V\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\bV\u0010HJ+\u0010W\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010A\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\bW\u0010JJ7\u0010X\u001a\u00020\n2\b\u0010<\u001a\u0004\u0018\u00010\u00042\b\u0010=\u001a\u0004\u0018\u00010\u00042\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\bX\u0010YJA\u0010Z\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010A\u001a\u0004\u0018\u00010\b2\b\u0010B\u001a\u0004\u0018\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\u001b2\b\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\bZ\u0010[J\u0019\u0010\\\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\\\u0010\fJ+\u0010]\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010A\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b]\u0010JJ\u0017\u0010_\u001a\u00020\n2\u0006\u0010^\u001a\u00020\u000eH\u0014¢\u0006\u0004\b_\u0010\u0013J%\u0010b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00042\f\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00040`H\u0014¢\u0006\u0004\bb\u0010cJ\u0015\u0010e\u001a\u00020d2\u0006\u0010\u001c\u001a\u00020 ¢\u0006\u0004\be\u0010fJ\u0015\u0010h\u001a\u00020,2\u0006\u0010+\u001a\u00020g¢\u0006\u0004\bh\u0010iJ\u0015\u0010k\u001a\u00020,2\u0006\u0010+\u001a\u00020j¢\u0006\u0004\bk\u0010lJ\u001f\u0010o\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010m\u001a\u00020\u000eH\u0000¢\u0006\u0004\bn\u0010\u0011J\u001f\u0010q\u001a\u00020\n2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010m\u001a\u00020\u000eH\u0000¢\u0006\u0004\bp\u0010\u0011R \u0010t\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020s0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR \u0010v\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010uR \u0010w\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010uR \u0010y\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020x0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010uR \u0010z\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010uR \u0010{\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010uR \u0010}\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020|0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010uR\"\u0010~\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010'0r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010uR(\u0010\u0081\u0001\u001a\u0013\u0012\u0004\u0012\u00020\u00030\u007fj\t\u0012\u0004\u0012\u00020\u0003`\u0080\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0018\u0010\u0084\u0001\u001a\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001¨\u0006\u0087\u0001"}, d2 = {"Lcom/ironsource/adapters/unityads/UnityAdsAdapter;", "Lcom/ironsource/mediationsdk/AbstractAdapter;", "Lcom/unity3d/ads/IUnityAdsInitializationListener;", "Lcom/ironsource/mediationsdk/INetworkInitCallbackListener;", "", "providerName", "<init>", "(Ljava/lang/String;)V", "Lorg/json/JSONObject;", "config", "", "initSDK", "(Lorg/json/JSONObject;)V", C4240b4.i.W, "", "value", "setUnityAdsMetaData", "(Ljava/lang/String;Z)V", "setCOPPAValue", "(Z)V", "setCCPAValue", "Lcom/unity3d/ads/AdFormat;", "adFormat", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", "biddingDataCallback", "collectBiddingData", "(Lcom/unity3d/ads/AdFormat;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;)V", "Lcom/ironsource/mediationsdk/ISBannerSize;", "size", "isBannerSizeSupported", "(Lcom/ironsource/mediationsdk/ISBannerSize;)Z", "isLargeScreen", "Lcom/unity3d/services/banners/UnityBannerSize;", "getBannerSize", "(Lcom/ironsource/mediationsdk/ISBannerSize;Z)Lcom/unity3d/services/banners/UnityBannerSize;", "bannerSize", "placementId", "Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "Lcom/unity3d/services/banners/BannerView;", "getBannerView", "(Lcom/ironsource/mediationsdk/ISBannerSize;Ljava/lang/String;Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;)Lcom/unity3d/services/banners/BannerView;", "Lcom/unity3d/ads/UnityAds$UnityAdsInitializationError;", "error", "", "getUnityAdsInitializationErrorCode", "(Lcom/unity3d/ads/UnityAds$UnityAdsInitializationError;)I", "getVersion", "()Ljava/lang/String;", "getCoreSDKVersion", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "isUsingActivityBeforeImpression", "(Lcom/unity3d/mediation/LevelPlay$AdFormat;)Z", "onInitializationComplete", "()V", PglCryptUtils.KEY_MESSAGE, "onInitializationFailed", "(Lcom/unity3d/ads/UnityAds$UnityAdsInitializationError;Ljava/lang/String;)V", "onNetworkInitCallbackSuccess", "onNetworkInitCallbackFailed", "appKey", "userId", "Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;", "initRewardedVideoWithCallback", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V", "adData", C4424m2.f43620s, "loadRewardedVideoForBidding", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V", C4240b4.h.f42594i, "(Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V", "isRewardedVideoAvailable", "(Lorg/json/JSONObject;)Z", "collectRewardedVideoBiddingData", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;)V", "mAdUnitSettings", "Lcom/ironsource/mediationsdk/LoadWhileShowSupportState;", "getLoadWhileShowSupportState", "(Lorg/json/JSONObject;)Lcom/ironsource/mediationsdk/LoadWhileShowSupportState;", "Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;", "initInterstitialForBidding", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;)V", "loadInterstitialForBidding", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;)V", C4240b4.h.H, "(Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;)V", "isInterstitialReady", "collectInterstitialBiddingData", "initBannerForBidding", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;)V", "loadBannerForBidding", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Lcom/ironsource/mediationsdk/ISBannerSize;Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;)V", C4240b4.h.S, "collectBannerBiddingData", C4240b4.j.f42669b0, "setConsent", "", "values", "setMetaData", "(Ljava/lang/String;Ljava/util/List;)V", "Landroid/widget/FrameLayout$LayoutParams;", "createLayoutParams", "(Lcom/unity3d/services/banners/UnityBannerSize;)Landroid/widget/FrameLayout$LayoutParams;", "Lcom/unity3d/ads/UnityAds$UnityAdsLoadError;", "getUnityAdsLoadErrorCode", "(Lcom/unity3d/ads/UnityAds$UnityAdsLoadError;)I", "Lcom/unity3d/ads/UnityAds$UnityAdsShowError;", "getUnityAdsShowErrorCode", "(Lcom/unity3d/ads/UnityAds$UnityAdsShowError;)I", "isAvailable", "setRewardedVideoAdAvailability$unityadsadapter_release", "setRewardedVideoAdAvailability", "setInterstitialAdAvailability$unityadsadapter_release", "setInterstitialAdAvailability", "j$/util/concurrent/ConcurrentHashMap", "Lcom/ironsource/adapters/unityads/UnityAdsRewardedVideoAdListener;", "placementIdToRewardedVideoAdListener", "Lj$/util/concurrent/ConcurrentHashMap;", "rewardedVideoPlacementIdToLoadedAdObjectId", "placementIdToRewardedVideoAdAvailability", "Lcom/ironsource/adapters/unityads/UnityAdsInterstitialAdListener;", "placementIdToInterstitialAdListener", "interstitialPlacementIdToLoadedAdObjectId", "placementIdToInterstitialAdAvailability", "Lcom/ironsource/adapters/unityads/UnityAdsBannerAdListener;", "placementIdToBannerAdListener", "placementIdToBannerAd", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "initCallbackListeners", "Ljava/util/HashSet;", "", "unityAdsStorageLock", "Ljava/lang/Object;", y.f66058y, "unityadsadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class UnityAdsAdapter extends AbstractAdapter implements IUnityAdsInitializationListener, INetworkInitCallbackListener {

    @NotNull
    private static final String ADAPTER_VERSION_KEY = "adapter_version";

    @NotNull
    private static final String CONSENT_CCPA = "privacy.consent";

    @NotNull
    private static final String CONSENT_GDPR = "gdpr.consent";

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final String GAME_DESIGNATION = "mode";

    @NotNull
    private static final String GAME_ID = "sourceId";

    @NotNull
    private static final String GitHash = "a394c60";

    @NotNull
    private static final String LWS_SUPPORT_STATE = "isSupportedLWS";

    @NotNull
    private static final String MEDIATION_NAME = "ironSource";

    @NotNull
    private static final String MIXED_AUDIENCE = "mixed";

    @NotNull
    private static final String PLACEMENT_ID = "zoneId";

    @NotNull
    private static final String UADS_INIT_BLOB = "uads_init_blob";

    @NotNull
    private static final String UADS_TRAITS = "traits";

    @NotNull
    private static final String UNITYADS_COPPA = "user.nonBehavioral";

    @NotNull
    private static final String UNITYADS_METADATA_COPPA_KEY = "unityads_coppa";

    @NotNull
    private static final String VERSION = "5.3.0";

    @NotNull
    private final HashSet<INetworkInitCallbackListener> initCallbackListeners;

    @NotNull
    private final ConcurrentHashMap<String, String> interstitialPlacementIdToLoadedAdObjectId;

    @NotNull
    private final ConcurrentHashMap<String, BannerView> placementIdToBannerAd;

    @NotNull
    private final ConcurrentHashMap<String, UnityAdsBannerAdListener> placementIdToBannerAdListener;

    @NotNull
    private final ConcurrentHashMap<String, Boolean> placementIdToInterstitialAdAvailability;

    @NotNull
    private final ConcurrentHashMap<String, UnityAdsInterstitialAdListener> placementIdToInterstitialAdListener;

    @NotNull
    private final ConcurrentHashMap<String, Boolean> placementIdToRewardedVideoAdAvailability;

    @NotNull
    private final ConcurrentHashMap<String, UnityAdsRewardedVideoAdListener> placementIdToRewardedVideoAdListener;

    @NotNull
    private final ConcurrentHashMap<String, String> rewardedVideoPlacementIdToLoadedAdObjectId;

    @NotNull
    private final Object unityAdsStorageLock;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u0013\u001a\u00020\u0004H\u0007J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0007J\u0010\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lcom/ironsource/adapters/unityads/UnityAdsAdapter$Companion;", "", "()V", "ADAPTER_VERSION_KEY", "", "CONSENT_CCPA", "CONSENT_GDPR", "GAME_DESIGNATION", "GAME_ID", "GitHash", "LWS_SUPPORT_STATE", "MEDIATION_NAME", "MIXED_AUDIENCE", "PLACEMENT_ID", "UADS_INIT_BLOB", "UADS_TRAITS", "UNITYADS_COPPA", "UNITYADS_METADATA_COPPA_KEY", "VERSION", "getAdapterSDKVersion", "getIntegrationData", "Lcom/ironsource/mediationsdk/IntegrationData;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", IronSourceConstants.START_ADAPTER, "Lcom/ironsource/adapters/unityads/UnityAdsAdapter;", "providerName", "unityadsadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getAdapterSDKVersion() {
            return UnityAds.getVersion();
        }

        @NotNull
        public final IntegrationData getIntegrationData(@Nullable Context context) {
            return new IntegrationData(N6.H1, "5.3.0");
        }

        @NotNull
        public final UnityAdsAdapter startAdapter(@NotNull String providerName) {
            Intrinsics.checkNotNullParameter(providerName, "providerName");
            return new UnityAdsAdapter(providerName);
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UnityAdsAdapter(@NotNull String providerName) {
        super(providerName);
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        this.placementIdToRewardedVideoAdListener = new ConcurrentHashMap<>();
        this.rewardedVideoPlacementIdToLoadedAdObjectId = new ConcurrentHashMap<>();
        this.placementIdToRewardedVideoAdAvailability = new ConcurrentHashMap<>();
        this.placementIdToInterstitialAdListener = new ConcurrentHashMap<>();
        this.interstitialPlacementIdToLoadedAdObjectId = new ConcurrentHashMap<>();
        this.placementIdToInterstitialAdAvailability = new ConcurrentHashMap<>();
        this.placementIdToBannerAdListener = new ConcurrentHashMap<>();
        this.placementIdToBannerAd = new ConcurrentHashMap<>();
        this.initCallbackListeners = new HashSet<>();
        this.unityAdsStorageLock = new Object();
    }

    private final void collectBiddingData(AdFormat adFormat, JSONObject config, final BiddingDataCallback biddingDataCallback) {
        UnityAds.getToken(new TokenConfiguration(adFormat, null, 2, null), new IUnityAdsTokenListener() { // from class: com.ironsource.adapters.unityads.a
            @Override // com.unity3d.ads.IUnityAdsTokenListener
            public final void onUnityAdsTokenReady(String str) {
                UnityAdsAdapter.collectBiddingData$lambda$7(biddingDataCallback, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collectBiddingData$lambda$7(BiddingDataCallback biddingDataCallback, String bidToken) {
        Intrinsics.checkNotNullParameter(biddingDataCallback, "$biddingDataCallback");
        if (bidToken == null || bidToken.length() == 0) {
            biddingDataCallback.onFailure("Failed to receive token - UnityAds");
            return;
        }
        IronLog.ADAPTER_API.verbose("token = " + bidToken);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Intrinsics.checkNotNullExpressionValue(bidToken, "bidToken");
        linkedHashMap.put("token", bidToken);
        biddingDataCallback.onSuccess(linkedHashMap);
    }

    @NotNull
    public static final String getAdapterSDKVersion() {
        return INSTANCE.getAdapterSDKVersion();
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final UnityBannerSize getBannerSize(ISBannerSize size, boolean isLargeScreen) {
        String description = size.getDescription();
        if (description == null) {
            return null;
        }
        switch (description.hashCode()) {
            case -387072689:
                if (description.equals(l.f44063c)) {
                    return new UnityBannerSize(300, 250);
                }
                return null;
            case 72205083:
                if (!description.equals(l.f44062b)) {
                    return null;
                }
                break;
            case 79011241:
                if (description.equals(l.f44065e)) {
                    return isLargeScreen ? new UnityBannerSize(728, 90) : new UnityBannerSize(320, 50);
                }
                return null;
            case 1951953708:
                if (!description.equals("BANNER")) {
                    return null;
                }
                break;
            default:
                return null;
        }
        return new UnityBannerSize(320, 50);
    }

    private final BannerView getBannerView(ISBannerSize bannerSize, String placementId, BannerSmashListener listener) {
        if (this.placementIdToBannerAd.get(placementId) != null) {
            BannerView bannerView = this.placementIdToBannerAd.get(placementId);
            if (bannerView != null) {
                bannerView.destroy();
            }
            this.placementIdToBannerAd.remove(placementId);
        }
        BannerView bannerView2 = new BannerView(ContextProvider.getInstance().getCurrentActiveActivity(), placementId, getBannerSize(bannerSize, AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext())));
        UnityAdsBannerAdListener unityAdsBannerAdListener = new UnityAdsBannerAdListener(listener, new WeakReference(this), placementId);
        this.placementIdToBannerAdListener.put(placementId, unityAdsBannerAdListener);
        bannerView2.setListener(unityAdsBannerAdListener);
        this.placementIdToBannerAd.put(placementId, bannerView2);
        return bannerView2;
    }

    @NotNull
    public static final IntegrationData getIntegrationData(@Nullable Context context) {
        return INSTANCE.getIntegrationData(context);
    }

    private final int getUnityAdsInitializationErrorCode(UnityAds.UnityAdsInitializationError error) {
        if (error == null) {
            return 510;
        }
        for (UnityAds.UnityAdsInitializationError unityAdsInitializationError : UnityAds.UnityAdsInitializationError.values()) {
            if (StringsKt.N(unityAdsInitializationError.name(), error.toString(), true)) {
                return UnityAds.UnityAdsInitializationError.valueOf(error.toString()).ordinal();
            }
        }
        return 510;
    }

    private final void initSDK(JSONObject config) {
        String strOptString = config.optString("sourceId");
        IronLog.ADAPTER_API.verbose("gameId = " + strOptString);
        if (!UnityAds.isInitialized()) {
            this.initCallbackListeners.add(this);
        }
        synchronized (this.unityAdsStorageLock) {
            try {
                MediationMetaData mediationMetaData = new MediationMetaData(ContextProvider.getInstance().getApplicationContext());
                mediationMetaData.setName(MEDIATION_NAME);
                mediationMetaData.setVersion(LevelPlay.getSdkVersion());
                mediationMetaData.set(ADAPTER_VERSION_KEY, "5.3.0");
                if (config.has(UADS_INIT_BLOB)) {
                    mediationMetaData.set(UADS_INIT_BLOB, config.optString(UADS_INIT_BLOB));
                }
                if (config.has("traits")) {
                    mediationMetaData.set("traits", config.optJSONObject("traits"));
                }
                mediationMetaData.commit();
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        UnityAds.setDebugMode(isAdaptersDebugEnabled());
        UnityAds.initialize(ContextProvider.getInstance().getApplicationContext(), strOptString, false, this);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final boolean isBannerSizeSupported(ISBannerSize size) {
        String description = size.getDescription();
        if (description == null) {
            return false;
        }
        switch (description.hashCode()) {
            case -387072689:
                return description.equals(l.f44063c);
            case 72205083:
                return description.equals(l.f44062b);
            case 79011241:
                return description.equals(l.f44065e);
            case 1951953708:
                return description.equals("BANNER");
            default:
                return false;
        }
    }

    private final void setCCPAValue(boolean value) {
        IronLog.ADAPTER_API.verbose("value = " + value);
        setUnityAdsMetaData(CONSENT_CCPA, value ^ true);
    }

    private final void setCOPPAValue(boolean value) {
        IronLog.ADAPTER_API.verbose("value = " + value);
        setUnityAdsMetaData("user.nonBehavioral", value);
    }

    private final void setUnityAdsMetaData(String key, boolean value) {
        IronLog.INTERNAL.verbose("key = " + key + ", value = " + value);
        synchronized (this.unityAdsStorageLock) {
            try {
                MetaData metaData = new MetaData(ContextProvider.getInstance().getApplicationContext());
                metaData.set(key, Boolean.valueOf(value));
                if (Intrinsics.areEqual(key, "user.nonBehavioral")) {
                    metaData.set("mode", MIXED_AUDIENCE);
                }
                metaData.commit();
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NotNull
    public static final UnityAdsAdapter startAdapter(@NotNull String str) {
        return INSTANCE.startAdapter(str);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void collectBannerBiddingData(@Nullable JSONObject config, @Nullable JSONObject adData, @NotNull BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        collectBiddingData(AdFormat.BANNER, config, biddingDataCallback);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void collectInterstitialBiddingData(@Nullable JSONObject config, @Nullable JSONObject adData, @NotNull BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        collectBiddingData(AdFormat.INTERSTITIAL, config, biddingDataCallback);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void collectRewardedVideoBiddingData(@Nullable JSONObject config, @Nullable JSONObject adData, @NotNull BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        collectBiddingData(AdFormat.REWARDED, config, biddingDataCallback);
    }

    @NotNull
    public final FrameLayout.LayoutParams createLayoutParams(@NotNull UnityBannerSize size) {
        Intrinsics.checkNotNullParameter(size, "size");
        return new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(ContextProvider.getInstance().getApplicationContext(), size.getWidth()), -2, 17);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void destroyBanner(@Nullable JSONObject config) {
        String strOptString = config != null ? config.optString(PLACEMENT_ID) : null;
        IronLog.ADAPTER_API.verbose("placementId = " + strOptString);
        if (this.placementIdToBannerAd.get(strOptString) != null) {
            BannerView bannerView = this.placementIdToBannerAd.get(strOptString);
            if (bannerView != null) {
                bannerView.destroy();
            }
            b1.d(this.placementIdToBannerAd).remove(strOptString);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    @NotNull
    public String getCoreSDKVersion() {
        return INSTANCE.getAdapterSDKVersion();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    @NotNull
    public LoadWhileShowSupportState getLoadWhileShowSupportState(@NotNull JSONObject mAdUnitSettings) {
        Intrinsics.checkNotNullParameter(mAdUnitSettings, "mAdUnitSettings");
        return !mAdUnitSettings.optBoolean(LWS_SUPPORT_STATE, true) ? LoadWhileShowSupportState.NONE : LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    public final int getUnityAdsLoadErrorCode(@NotNull UnityAds.UnityAdsLoadError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        for (UnityAds.UnityAdsLoadError unityAdsLoadError : UnityAds.UnityAdsLoadError.values()) {
            if (StringsKt.N(unityAdsLoadError.name(), error.toString(), true)) {
                return UnityAds.UnityAdsLoadError.valueOf(error.toString()).ordinal();
            }
        }
        return 510;
    }

    public final int getUnityAdsShowErrorCode(@NotNull UnityAds.UnityAdsShowError error) {
        Intrinsics.checkNotNullParameter(error, "error");
        for (UnityAds.UnityAdsShowError unityAdsShowError : UnityAds.UnityAdsShowError.values()) {
            if (StringsKt.N(unityAdsShowError.name(), error.toString(), true)) {
                return UnityAds.UnityAdsShowError.valueOf(error.toString()).ordinal();
            }
        }
        return 510;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    @NotNull
    public String getVersion() {
        return "5.3.0";
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBannerForBidding(@Nullable String appKey, @Nullable String userId, @Nullable JSONObject config, @Nullable BannerSmashListener listener) {
        String strOptString = config != null ? config.optString(PLACEMENT_ID) : null;
        String strOptString2 = config != null ? config.optString("sourceId") : null;
        if (strOptString == null || strOptString.length() == 0) {
            IronLog.ADAPTER_API.error("Missing param - zoneId");
            if (listener != null) {
                listener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing params - zoneId", "Banner"));
                return;
            }
            return;
        }
        if (strOptString2 == null || strOptString2.length() == 0) {
            IronLog.ADAPTER_API.error("Missing param - sourceId");
            if (listener != null) {
                listener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing params - sourceId", "Banner"));
                return;
            }
            return;
        }
        IronLog.ADAPTER_API.verbose("placementId = " + strOptString);
        if (!UnityAds.isInitialized()) {
            initSDK(config);
        }
        if (listener != null) {
            listener.onBannerInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitialForBidding(@Nullable String appKey, @Nullable String userId, @Nullable JSONObject config, @Nullable InterstitialSmashListener listener) {
        String strOptString = config != null ? config.optString(PLACEMENT_ID) : null;
        String strOptString2 = config != null ? config.optString("sourceId") : null;
        if (strOptString == null || strOptString.length() == 0) {
            IronLog.ADAPTER_API.error("Missing param - zoneId");
            if (listener != null) {
                listener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing params - zoneId", "Interstitial"));
                return;
            }
            return;
        }
        if (strOptString2 == null || strOptString2.length() == 0) {
            IronLog.ADAPTER_API.error("Missing param - sourceId");
            if (listener != null) {
                listener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing params - sourceId", "Interstitial"));
                return;
            }
            return;
        }
        IronLog.ADAPTER_API.verbose("placementId = " + strOptString);
        if (!UnityAds.isInitialized()) {
            initSDK(config);
        }
        if (listener != null) {
            listener.onInterstitialInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(@Nullable String appKey, @Nullable String userId, @Nullable JSONObject config, @Nullable RewardedVideoSmashListener listener) {
        String strOptString = config != null ? config.optString(PLACEMENT_ID) : null;
        String strOptString2 = config != null ? config.optString("sourceId") : null;
        if (strOptString == null || strOptString.length() == 0) {
            IronLog.ADAPTER_API.error("Missing param - zoneId");
            if (listener != null) {
                listener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing params - zoneId", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            return;
        }
        if (strOptString2 == null || strOptString2.length() == 0) {
            IronLog.ADAPTER_API.error("Missing param - sourceId");
            if (listener != null) {
                listener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing params - sourceId", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            return;
        }
        IronLog.ADAPTER_API.verbose("placementId = " + strOptString);
        if (!UnityAds.isInitialized()) {
            initSDK(config);
        }
        if (listener != null) {
            listener.onRewardedVideoInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public boolean isInterstitialReady(@Nullable JSONObject config) {
        String strOptString = config != null ? config.optString(PLACEMENT_ID) : null;
        IronLog.ADAPTER_API.verbose("placementId = " + strOptString);
        return strOptString != null && strOptString.length() != 0 && this.placementIdToInterstitialAdAvailability.containsKey(strOptString) && Intrinsics.areEqual(this.placementIdToInterstitialAdAvailability.get(strOptString), Boolean.TRUE);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(@Nullable JSONObject config) {
        String strOptString = config != null ? config.optString(PLACEMENT_ID) : null;
        IronLog.ADAPTER_API.verbose("placementId = " + strOptString);
        return strOptString != null && strOptString.length() != 0 && this.placementIdToRewardedVideoAdAvailability.containsKey(strOptString) && Intrinsics.areEqual(this.placementIdToRewardedVideoAdAvailability.get(strOptString), Boolean.TRUE);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public boolean isUsingActivityBeforeImpression(@NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        return false;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForBidding(@Nullable JSONObject config, @Nullable JSONObject adData, @Nullable String serverData, @Nullable ISBannerSize bannerSize, @Nullable BannerSmashListener listener) {
        String strOptString = config != null ? config.optString(PLACEMENT_ID) : null;
        if (strOptString == null || strOptString.length() == 0) {
            IronLog.ADAPTER_API.error("Missing param - zoneId");
            if (listener != null) {
                listener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Banner", getProviderName(), "Missing params - zoneId"));
                return;
            }
            return;
        }
        if (bannerSize == null || !isBannerSizeSupported(bannerSize)) {
            IronLog.ADAPTER_API.error("size not supported, size = " + (bannerSize != null ? bannerSize.getDescription() : null));
            if (listener != null) {
                listener.onBannerAdLoadFailed(ErrorBuilder.unsupportedBannerSize(getProviderName()));
                return;
            }
            return;
        }
        IronLog.ADAPTER_API.verbose("placementId = " + strOptString);
        BannerView bannerView = getBannerView(bannerSize, strOptString, listener);
        UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        unityAdsLoadOptions.setObjectId(string);
        if (serverData != null && serverData.length() != 0) {
            unityAdsLoadOptions.setAdMarkup(serverData);
        }
        bannerView.load(unityAdsLoadOptions);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitialForBidding(@Nullable JSONObject config, @Nullable JSONObject adData, @Nullable String serverData, @Nullable InterstitialSmashListener listener) {
        String strOptString = config != null ? config.optString(PLACEMENT_ID) : null;
        if (strOptString == null || strOptString.length() == 0) {
            IronLog.ADAPTER_API.error("Missing param - zoneId");
            if (listener != null) {
                listener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError("Interstitial", getProviderName(), "Missing params - zoneId"));
                return;
            }
            return;
        }
        IronLog.ADAPTER_API.verbose("placementId = " + strOptString);
        setInterstitialAdAvailability$unityadsadapter_release(strOptString, false);
        UnityAdsInterstitialAdListener unityAdsInterstitialAdListener = new UnityAdsInterstitialAdListener(listener, new WeakReference(this), strOptString);
        this.placementIdToInterstitialAdListener.put(strOptString, unityAdsInterstitialAdListener);
        UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        unityAdsLoadOptions.setObjectId(string);
        if (serverData != null && serverData.length() != 0) {
            unityAdsLoadOptions.setAdMarkup(serverData);
        }
        this.interstitialPlacementIdToLoadedAdObjectId.put(strOptString, string);
        UnityAds.load(strOptString, unityAdsLoadOptions, unityAdsInterstitialAdListener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(@Nullable JSONObject config, @Nullable JSONObject adData, @Nullable String serverData, @Nullable RewardedVideoSmashListener listener) {
        String strOptString = config != null ? config.optString(PLACEMENT_ID) : null;
        if (strOptString == null || strOptString.length() == 0) {
            IronLog.ADAPTER_API.error("Missing param - zoneId");
            if (listener != null) {
                listener.onRewardedVideoLoadFailed(ErrorBuilder.buildLoadFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, getProviderName(), "Missing params - zoneId"));
                return;
            }
            return;
        }
        IronLog.ADAPTER_API.verbose("placementId = " + strOptString);
        setRewardedVideoAdAvailability$unityadsadapter_release(strOptString, false);
        UnityAdsRewardedVideoAdListener unityAdsRewardedVideoAdListener = new UnityAdsRewardedVideoAdListener(listener, new WeakReference(this), strOptString);
        this.placementIdToRewardedVideoAdListener.put(strOptString, unityAdsRewardedVideoAdListener);
        UnityAdsLoadOptions unityAdsLoadOptions = new UnityAdsLoadOptions();
        String string = UUID.randomUUID().toString();
        Intrinsics.checkNotNullExpressionValue(string, "randomUUID().toString()");
        unityAdsLoadOptions.setObjectId(string);
        if (serverData != null && serverData.length() != 0) {
            unityAdsLoadOptions.setAdMarkup(serverData);
        }
        this.rewardedVideoPlacementIdToLoadedAdObjectId.put(strOptString, string);
        UnityAds.load(strOptString, unityAdsLoadOptions, unityAdsRewardedVideoAdListener);
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public void onInitializationComplete() {
        IronLog.ADAPTER_CALLBACK.verbose();
        Iterator<T> it = this.initCallbackListeners.iterator();
        while (it.hasNext()) {
            ((INetworkInitCallbackListener) it.next()).onNetworkInitCallbackSuccess();
        }
        this.initCallbackListeners.clear();
    }

    @Override // com.unity3d.ads.IUnityAdsInitializationListener
    public void onInitializationFailed(@Nullable UnityAds.UnityAdsInitializationError error, @Nullable String message) {
        String str = getUnityAdsInitializationErrorCode(error) + message;
        IronLog.ADAPTER_CALLBACK.verbose("initError = " + str);
        Iterator<T> it = this.initCallbackListeners.iterator();
        while (it.hasNext()) {
            ((INetworkInitCallbackListener) it.next()).onNetworkInitCallbackFailed(str);
        }
        this.initCallbackListeners.clear();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(@NotNull String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    protected void setConsent(boolean consent) {
        IronLog.ADAPTER_API.verbose("setConsent = " + consent);
        setUnityAdsMetaData(CONSENT_GDPR, consent);
    }

    public final void setInterstitialAdAvailability$unityadsadapter_release(@NotNull String placementId, boolean isAvailable) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.placementIdToInterstitialAdAvailability.put(placementId, Boolean.valueOf(isAvailable));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    protected void setMetaData(@NotNull String key, @NotNull List<String> values) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(values, "values");
        if (values.isEmpty()) {
            return;
        }
        String str = values.get(0);
        IronLog.ADAPTER_API.verbose("key = " + key + ", value = " + str);
        if (MetaDataUtils.isValidCCPAMetaData(key, str)) {
            setCCPAValue(MetaDataUtils.getMetaDataBooleanValue(str));
            return;
        }
        String valueForType = MetaDataUtils.formatValueForType(str, MetaData.MetaDataValueTypes.META_DATA_VALUE_BOOLEAN);
        if (MetaDataUtils.isValidMetaData(key, UNITYADS_METADATA_COPPA_KEY, valueForType)) {
            setCOPPAValue(MetaDataUtils.getMetaDataBooleanValue(valueForType));
        }
    }

    public final void setRewardedVideoAdAvailability$unityadsadapter_release(@NotNull String placementId, boolean isAvailable) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        this.placementIdToRewardedVideoAdAvailability.put(placementId, Boolean.valueOf(isAvailable));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void showInterstitial(@Nullable JSONObject config, @Nullable InterstitialSmashListener listener) {
        String strOptString = config != null ? config.optString(PLACEMENT_ID) : null;
        if (strOptString == null || strOptString.length() == 0) {
            IronLog.ADAPTER_API.error("Missing param - zoneId");
            if (listener != null) {
                listener.onInterstitialAdShowFailed(ErrorBuilder.buildShowFailedError("Interstitial", "Missing params - zoneId"));
                return;
            }
            return;
        }
        IronLog.ADAPTER_API.verbose("placementId = " + strOptString);
        if (isInterstitialReady(config)) {
            UnityAdsInterstitialAdListener unityAdsInterstitialAdListener = this.placementIdToInterstitialAdListener.get(strOptString);
            String str = this.interstitialPlacementIdToLoadedAdObjectId.get(strOptString);
            UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
            unityAdsShowOptions.setObjectId(str);
            UnityAds.show(ContextProvider.getInstance().getCurrentActiveActivity(), strOptString, unityAdsShowOptions, unityAdsInterstitialAdListener);
        } else if (listener != null) {
            listener.onInterstitialAdShowFailed(ErrorBuilder.buildNoAdsToShowError("Interstitial"));
        }
        setInterstitialAdAvailability$unityadsadapter_release(strOptString, false);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(@Nullable JSONObject config, @Nullable RewardedVideoSmashListener listener) {
        String strOptString = config != null ? config.optString(PLACEMENT_ID) : null;
        if (strOptString == null || strOptString.length() == 0) {
            IronLog.ADAPTER_API.error("Missing param - zoneId");
            if (listener != null) {
                listener.onRewardedVideoAdShowFailed(ErrorBuilder.buildShowFailedError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT, "Missing params - zoneId"));
                return;
            }
            return;
        }
        IronLog.ADAPTER_API.verbose("placementId = " + strOptString);
        if (isRewardedVideoAvailable(config)) {
            String dynamicUserId = getDynamicUserId();
            if (dynamicUserId != null && dynamicUserId.length() != 0) {
                synchronized (this.unityAdsStorageLock) {
                    PlayerMetaData playerMetaData = new PlayerMetaData(ContextProvider.getInstance().getApplicationContext());
                    playerMetaData.setServerId(getDynamicUserId());
                    playerMetaData.commit();
                    Unit unit = Unit.f93236a;
                }
            }
            UnityAdsRewardedVideoAdListener unityAdsRewardedVideoAdListener = this.placementIdToRewardedVideoAdListener.get(strOptString);
            String str = this.rewardedVideoPlacementIdToLoadedAdObjectId.get(strOptString);
            UnityAdsShowOptions unityAdsShowOptions = new UnityAdsShowOptions();
            unityAdsShowOptions.setObjectId(str);
            UnityAds.show(ContextProvider.getInstance().getCurrentActiveActivity(), strOptString, unityAdsShowOptions, unityAdsRewardedVideoAdListener);
        } else if (listener != null) {
            listener.onRewardedVideoAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        setRewardedVideoAdAvailability$unityadsadapter_release(strOptString, false);
    }
}
