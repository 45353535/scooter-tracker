package com.ironsource.adapters.mintegral;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.widget.FrameLayout;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.X1;
import com.ironsource.environment.ContextProvider;
import com.ironsource.mediationsdk.AbstractAdapter;
import com.ironsource.mediationsdk.AdapterUtils;
import com.ironsource.mediationsdk.INetworkInitCallbackListener;
import com.ironsource.mediationsdk.ISBannerSize;
import com.ironsource.mediationsdk.IntegrationData;
import com.ironsource.mediationsdk.LoadWhileShowSupportState;
import com.ironsource.mediationsdk.l;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.metadata.MetaData;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.same.net.Aa;
import com.mbridge.msdk.mbbid.out.BidConstants;
import com.mbridge.msdk.mbbid.out.BidManager;
import com.mbridge.msdk.newinterstitial.out.MBBidNewInterstitialHandler;
import com.mbridge.msdk.out.BannerSize;
import com.mbridge.msdk.out.MBBannerView;
import com.mbridge.msdk.out.MBBidRewardVideoHandler;
import com.mbridge.msdk.out.MBConfiguration;
import com.mbridge.msdk.out.MBridgeSDKFactory;
import com.mbridge.msdk.out.SDKInitStatusListener;
import com.mbridge.msdk.system.MBridgeSDKImpl;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.unity3d.mediation.LevelPlay;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import net.pubnative.lite.sdk.models.RemoteConfigFeature;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010\u0000\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \u0086\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0086\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0018\u0010\u0013J\u001f\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010 \u001a\u00020\u001bH\u0002¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\u00042\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J-\u0010-\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020,\u0018\u00010+2\u0006\u0010)\u001a\u00020(2\u0006\u0010*\u001a\u00020\u0004H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\nH\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0004H\u0016¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0004H\u0016¢\u0006\u0004\b3\u00102J\u0017\u00105\u001a\u00020\u000e2\u0006\u00104\u001a\u00020$H\u0016¢\u0006\u0004\b5\u00106J\u0017\u00108\u001a\u00020\n2\u0006\u00107\u001a\u00020\u0004H\u0016¢\u0006\u0004\b8\u0010\u0007J\u000f\u00109\u001a\u00020\nH\u0016¢\u0006\u0004\b9\u00100J\u0019\u0010;\u001a\u00020\n2\b\u0010:\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b;\u0010\u0007J\u000f\u0010<\u001a\u00020\nH\u0016¢\u0006\u0004\b<\u00100J3\u0010A\u001a\u00020\n2\b\u0010=\u001a\u0004\u0018\u00010\u00042\b\u0010>\u001a\u0004\u0018\u00010\u00042\u0006\u0010)\u001a\u00020(2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bA\u0010BJ3\u0010E\u001a\u00020\n2\u0006\u0010)\u001a\u00020(2\b\u0010C\u001a\u0004\u0018\u00010(2\b\u0010D\u001a\u0004\u0018\u00010\u00042\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bE\u0010FJ\u001f\u0010G\u001a\u00020\n2\u0006\u0010)\u001a\u00020(2\u0006\u0010@\u001a\u00020?H\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\bI\u0010JJ\u0017\u0010K\u001a\u00020\n2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010N\u001a\u0004\u0018\u00010M¢\u0006\u0004\bN\u0010OJ/\u0010P\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020,\u0018\u00010+2\u0006\u0010)\u001a\u00020(2\b\u0010C\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\bP\u0010QJ3\u0010S\u001a\u00020\n2\b\u0010=\u001a\u0004\u0018\u00010\u00042\b\u0010>\u001a\u0004\u0018\u00010\u00042\u0006\u0010)\u001a\u00020(2\u0006\u0010@\u001a\u00020RH\u0016¢\u0006\u0004\bS\u0010TJ3\u0010U\u001a\u00020\n2\u0006\u0010)\u001a\u00020(2\b\u0010C\u001a\u0004\u0018\u00010(2\b\u0010D\u001a\u0004\u0018\u00010\u00042\u0006\u0010@\u001a\u00020RH\u0016¢\u0006\u0004\bU\u0010VJ\u001f\u0010W\u001a\u00020\n2\u0006\u0010)\u001a\u00020(2\u0006\u0010@\u001a\u00020RH\u0016¢\u0006\u0004\bW\u0010XJ\u0019\u0010Y\u001a\u00020\n2\b\u0010)\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\bY\u0010LJ\u0017\u0010Z\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\bZ\u0010JJ\u000f\u0010\\\u001a\u0004\u0018\u00010[¢\u0006\u0004\b\\\u0010]J/\u0010^\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020,\u0018\u00010+2\u0006\u0010)\u001a\u00020(2\b\u0010C\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\b^\u0010QJ3\u0010`\u001a\u00020\n2\b\u0010=\u001a\u0004\u0018\u00010\u00042\b\u0010>\u001a\u0004\u0018\u00010\u00042\u0006\u0010)\u001a\u00020(2\u0006\u0010@\u001a\u00020_H\u0016¢\u0006\u0004\b`\u0010aJ=\u0010b\u001a\u00020\n2\u0006\u0010)\u001a\u00020(2\b\u0010C\u001a\u0004\u0018\u00010(2\b\u0010D\u001a\u0004\u0018\u00010\u00042\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010@\u001a\u00020_H\u0016¢\u0006\u0004\bb\u0010cJ\u0017\u0010d\u001a\u00020\n2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\bd\u0010LJ/\u0010e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020,\u0018\u00010+2\u0006\u0010)\u001a\u00020(2\b\u0010C\u001a\u0004\u0018\u00010(H\u0016¢\u0006\u0004\be\u0010QJ\u0017\u0010g\u001a\u00020\n2\u0006\u0010f\u001a\u00020\u000eH\u0014¢\u0006\u0004\bg\u0010\u0013J%\u0010j\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u00042\f\u0010i\u001a\b\u0012\u0004\u0012\u00020\u00040hH\u0014¢\u0006\u0004\bj\u0010kJ\u0017\u0010m\u001a\u0004\u0018\u00010l2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\bm\u0010nJ\u0017\u0010o\u001a\u0004\u0018\u00010!2\u0006\u0010\r\u001a\u00020\u0004¢\u0006\u0004\bo\u0010pR\"\u0010r\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020?0q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR \u0010u\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020t0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010sR\u0018\u0010v\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bv\u0010wR\"\u0010x\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020R0q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bx\u0010sR \u0010z\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020y0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010sR\u0018\u0010{\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b{\u0010|R\"\u0010}\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020_0q8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010sR \u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020~0q8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u007f\u0010sR\"\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020l0q8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010sR\"\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020!0q8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010sR\u001b\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0083\u0001R\u001b\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0001\u0010\u0083\u0001¨\u0006\u0087\u0001"}, d2 = {"Lcom/ironsource/adapters/mintegral/MintegralAdapter;", "Lcom/ironsource/mediationsdk/AbstractAdapter;", "Lcom/ironsource/mediationsdk/INetworkInitCallbackListener;", "Lcom/mbridge/msdk/out/SDKInitStatusListener;", "", "providerName", "<init>", "(Ljava/lang/String;)V", "appId", "appKey", "", "initSdk", "(Ljava/lang/String;Ljava/lang/String;)V", "placementId", "", "isInterstitialPlacementIdExist", "(Ljava/lang/String;)Z", RemoteConfigFeature.UserConsent.CCPA, "setCCPAValue", "(Z)V", C4240b4.i.W, "value", "isCOPPAMetaData", "(Ljava/lang/String;Ljava/lang/String;)Z", "setCOPPAValue", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/ironsource/mediationsdk/ISBannerSize;", "bannerSize", "Lcom/mbridge/msdk/out/BannerSize;", "createBannerSize", "(Landroid/content/Context;Lcom/ironsource/mediationsdk/ISBannerSize;)Lcom/mbridge/msdk/out/BannerSize;", "size", "Landroid/widget/FrameLayout$LayoutParams;", "createBannerLayoutParams", "(Landroid/content/Context;Lcom/ironsource/mediationsdk/ISBannerSize;)Landroid/widget/FrameLayout$LayoutParams;", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "adUnit", "mapToMintegralType", "(Lcom/unity3d/mediation/LevelPlay$AdFormat;)Ljava/lang/String;", "Lorg/json/JSONObject;", "config", "adType", "", "", "getBiddingData", "(Lorg/json/JSONObject;Ljava/lang/String;)Ljava/util/Map;", "setChannelCode", "()V", "getVersion", "()Ljava/lang/String;", "getCoreSDKVersion", "adFormat", "isUsingActivityBeforeImpression", "(Lcom/unity3d/mediation/LevelPlay$AdFormat;)Z", "errorMsg", "onInitFail", "onInitSuccess", "error", "onNetworkInitCallbackFailed", "onNetworkInitCallbackSuccess", "ironsourceAppKey", "userId", "Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "initRewardedVideoWithCallback", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V", "adData", C4424m2.f43620s, "loadRewardedVideoForBidding", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V", C4240b4.h.f42594i, "(Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V", "isRewardedVideoAvailable", "(Lorg/json/JSONObject;)Z", "destroyRewardedVideoAd", "(Lorg/json/JSONObject;)V", "Lcom/mbridge/msdk/out/MBBidRewardVideoHandler;", "getRewardedVideoHandler", "()Lcom/mbridge/msdk/out/MBBidRewardVideoHandler;", "getRewardedVideoBiddingData", "(Lorg/json/JSONObject;Lorg/json/JSONObject;)Ljava/util/Map;", "Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;", "initInterstitialForBidding", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;)V", "loadInterstitialForBidding", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;)V", C4240b4.h.H, "(Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;)V", "destroyInterstitialAd", "isInterstitialReady", "Lcom/mbridge/msdk/newinterstitial/out/MBBidNewInterstitialHandler;", "getInterstitialHandler", "()Lcom/mbridge/msdk/newinterstitial/out/MBBidNewInterstitialHandler;", "getInterstitialBiddingData", "Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;", "initBannerForBidding", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;)V", "loadBannerForBidding", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Lcom/ironsource/mediationsdk/ISBannerSize;Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;)V", C4240b4.h.S, "getBannerBiddingData", C4240b4.j.f42669b0, "setConsent", "", "values", "setMetaData", "(Ljava/lang/String;Ljava/util/List;)V", "Lcom/mbridge/msdk/out/MBBannerView;", "getBannerView", "(Ljava/lang/String;)Lcom/mbridge/msdk/out/MBBannerView;", "getBannerLayoutParams", "(Ljava/lang/String;)Landroid/widget/FrameLayout$LayoutParams;", "j$/util/concurrent/ConcurrentHashMap", "mRewardedVideoPlacementIdToSmashListener", "Lj$/util/concurrent/ConcurrentHashMap;", "Lcom/ironsource/adapters/mintegral/MintegralRewardedVideoListener;", "mRewardedVideoPlacementIdToAdListener", "mRewardedVideoAd", "Lcom/mbridge/msdk/out/MBBidRewardVideoHandler;", "mInterstitialPlacementIdToSmashListener", "Lcom/ironsource/adapters/mintegral/MintegralInterstitialListener;", "mInterstitialPlacementIdToAdListener", "mInterstitialPlacementId", "Ljava/lang/String;", "mBannerPlacementIdToSmashListener", "Lcom/ironsource/adapters/mintegral/MintegralBannerListener;", "mBannerPlacementIdToAdListener", "mBannerPlacementIdToAdView", "mBannerPlacementIdToLayout", "consentCollectingUserData", "Ljava/lang/Boolean;", "doNotSellCollectingUserData", "coppaUserData", y.f66058y, "mintegraladapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class MintegralAdapter extends AbstractAdapter implements INetworkInitCallbackListener, SDKInitStatusListener {

    @NotNull
    private static final String APP_ID_KEY = "appId";

    @NotNull
    private static final String APP_KEY = "appKey";

    @NotNull
    public static final String CREATIVE_ID_KEY = "creativeId";

    @NotNull
    private static final String GitHash = "2bd1ff5";

    @NotNull
    private static final String META_DATA_MINTEGRAL_COPPA_KEY = "Mintegral_COPPA";
    public static final int MINTEGRAL_NO_FILL_ERROR_CODE = 708;

    @NotNull
    private static final String NETWORK_NAME = "Mintegral";

    @NotNull
    private static final String PLACEMENT_ID_KEY = "placementId";

    @NotNull
    private static final String UNIT_ID_KEY = "unitId";

    @NotNull
    private static final String VERSION = "5.3.0";

    @Nullable
    private Boolean consentCollectingUserData;

    @Nullable
    private Boolean coppaUserData;

    @Nullable
    private Boolean doNotSellCollectingUserData;

    @NotNull
    private final ConcurrentHashMap<String, MintegralBannerListener> mBannerPlacementIdToAdListener;

    @NotNull
    private final ConcurrentHashMap<String, MBBannerView> mBannerPlacementIdToAdView;

    @NotNull
    private final ConcurrentHashMap<String, FrameLayout.LayoutParams> mBannerPlacementIdToLayout;

    @NotNull
    private ConcurrentHashMap<String, BannerSmashListener> mBannerPlacementIdToSmashListener;

    @Nullable
    private String mInterstitialPlacementId;

    @NotNull
    private final ConcurrentHashMap<String, MintegralInterstitialListener> mInterstitialPlacementIdToAdListener;

    @NotNull
    private ConcurrentHashMap<String, InterstitialSmashListener> mInterstitialPlacementIdToSmashListener;

    @Nullable
    private MBBidRewardVideoHandler mRewardedVideoAd;

    @NotNull
    private final ConcurrentHashMap<String, MintegralRewardedVideoListener> mRewardedVideoPlacementIdToAdListener;

    @NotNull
    private ConcurrentHashMap<String, RewardedVideoSmashListener> mRewardedVideoPlacementIdToSmashListener;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final AtomicBoolean mDidCallInit = new AtomicBoolean(false);

    @NotNull
    private static Companion.EInitState mInitState = Companion.EInitState.NOT_INIT;

    @NotNull
    private static final HashSet<INetworkInitCallbackListener> initCallbackListeners = new HashSet<>();

    @NotNull
    private static MintegralAdHolder<MBBidNewInterstitialHandler> mInterstitialAds = new MintegralAdHolder<>();

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\"B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\u001a\u001a\u00020\u0004H\u0007J\u0012\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0007J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u00110\u0010j\b\u0012\u0004\u0012\u00020\u0011`\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00190\u0018X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/ironsource/adapters/mintegral/MintegralAdapter$Companion;", "", "()V", "APP_ID_KEY", "", "APP_KEY", "CREATIVE_ID_KEY", "GitHash", "META_DATA_MINTEGRAL_COPPA_KEY", "MINTEGRAL_NO_FILL_ERROR_CODE", "", "NETWORK_NAME", "PLACEMENT_ID_KEY", "UNIT_ID_KEY", "VERSION", "initCallbackListeners", "Ljava/util/HashSet;", "Lcom/ironsource/mediationsdk/INetworkInitCallbackListener;", "Lkotlin/collections/HashSet;", "mDidCallInit", "Ljava/util/concurrent/atomic/AtomicBoolean;", "mInitState", "Lcom/ironsource/adapters/mintegral/MintegralAdapter$Companion$EInitState;", "mInterstitialAds", "Lcom/ironsource/adapters/mintegral/MintegralAdHolder;", "Lcom/mbridge/msdk/newinterstitial/out/MBBidNewInterstitialHandler;", "getAdapterSDKVersion", "getIntegrationData", "Lcom/ironsource/mediationsdk/IntegrationData;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", IronSourceConstants.START_ADAPTER, "Lcom/ironsource/adapters/mintegral/MintegralAdapter;", "providerName", "EInitState", "mintegraladapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ironsource/adapters/mintegral/MintegralAdapter$Companion$EInitState;", "", "(Ljava/lang/String;I)V", "NOT_INIT", "INIT_IN_PROGRESS", "INIT_SUCCESS", "INIT_FAIL", "mintegraladapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        private enum EInitState {
            NOT_INIT,
            INIT_IN_PROGRESS,
            INIT_SUCCESS,
            INIT_FAIL
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getAdapterSDKVersion() {
            return MBConfiguration.SDK_VERSION;
        }

        @NotNull
        public final IntegrationData getIntegrationData(@Nullable Context context) {
            return new IntegrationData(MintegralAdapter.NETWORK_NAME, "5.3.0");
        }

        @NotNull
        public final MintegralAdapter startAdapter(@NotNull String providerName) {
            Intrinsics.checkNotNullParameter(providerName, "providerName");
            return new MintegralAdapter(providerName);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[Companion.EInitState.values().length];
            try {
                iArr[Companion.EInitState.INIT_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Companion.EInitState.INIT_FAIL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Companion.EInitState.NOT_INIT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Companion.EInitState.INIT_IN_PROGRESS.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[LevelPlay.AdFormat.values().length];
            try {
                iArr2[LevelPlay.AdFormat.REWARDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[LevelPlay.AdFormat.INTERSTITIAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[LevelPlay.AdFormat.BANNER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MintegralAdapter(@NotNull String providerName) {
        super(providerName);
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        this.mRewardedVideoPlacementIdToSmashListener = new ConcurrentHashMap<>();
        this.mRewardedVideoPlacementIdToAdListener = new ConcurrentHashMap<>();
        this.mInterstitialPlacementIdToSmashListener = new ConcurrentHashMap<>();
        this.mInterstitialPlacementIdToAdListener = new ConcurrentHashMap<>();
        this.mBannerPlacementIdToSmashListener = new ConcurrentHashMap<>();
        this.mBannerPlacementIdToAdListener = new ConcurrentHashMap<>();
        this.mBannerPlacementIdToAdView = new ConcurrentHashMap<>();
        this.mBannerPlacementIdToLayout = new ConcurrentHashMap<>();
        this.mLWSSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final FrameLayout.LayoutParams createBannerLayoutParams(Context context, ISBannerSize size) {
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(0, 0);
        String description = size.getDescription();
        if (description != null) {
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals(l.f44063c)) {
                        layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, 300), AdapterUtils.dpToPixels(context, 250));
                    }
                    break;
                case 72205083:
                    if (description.equals(l.f44062b)) {
                        layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, 320), AdapterUtils.dpToPixels(context, 90));
                    }
                    break;
                case 79011241:
                    if (description.equals(l.f44065e)) {
                        layoutParams = AdapterUtils.isLargeScreen(context) ? new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, 728), AdapterUtils.dpToPixels(context, 90)) : new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, 320), AdapterUtils.dpToPixels(context, 50));
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, 320), AdapterUtils.dpToPixels(context, 50));
                    }
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        layoutParams = new FrameLayout.LayoutParams(AdapterUtils.dpToPixels(context, size.getWidth()), AdapterUtils.dpToPixels(context, size.getHeight()));
                    }
                    break;
            }
        }
        layoutParams.gravity = 17;
        return layoutParams;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    private final BannerSize createBannerSize(Context context, ISBannerSize bannerSize) {
        String description = bannerSize.getDescription();
        if (description != null) {
            switch (description.hashCode()) {
                case -387072689:
                    if (description.equals(l.f44063c)) {
                        return new BannerSize(2, 300, 250);
                    }
                    break;
                case 72205083:
                    if (description.equals(l.f44062b)) {
                        return new BannerSize(1, 320, 90);
                    }
                    break;
                case 79011241:
                    if (description.equals(l.f44065e)) {
                        return AdapterUtils.isLargeScreen(context) ? new BannerSize(3, 728, 90) : new BannerSize(4, 320, 50);
                    }
                    break;
                case 1951953708:
                    if (description.equals("BANNER")) {
                        return new BannerSize(4, 320, 50);
                    }
                    break;
                case 1999208305:
                    if (description.equals("CUSTOM")) {
                        return new BannerSize(5, bannerSize.getWidth(), bannerSize.getHeight());
                    }
                    break;
            }
        }
        return new BannerSize(5, bannerSize.getWidth(), bannerSize.getHeight());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroyBanner$lambda$6(String str, MintegralAdapter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        IronLog.ADAPTER_API.verbose("release banner placementId = " + str);
        MBBannerView mBBannerView = this$0.mBannerPlacementIdToAdView.get(str);
        if (mBBannerView != null) {
            mBBannerView.release();
        }
        this$0.mBannerPlacementIdToAdView.remove(str);
    }

    @NotNull
    public static final String getAdapterSDKVersion() {
        return INSTANCE.getAdapterSDKVersion();
    }

    private final Map<String, Object> getBiddingData(JSONObject config, String adType) {
        if (mInitState != Companion.EInitState.INIT_SUCCESS) {
            IronLog.INTERNAL.verbose("returning null as token since init is not successful");
            return null;
        }
        HashMap map = new HashMap();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String BID_FILTER_KEY_PLACEMENT_ID = BidConstants.BID_FILTER_KEY_PLACEMENT_ID;
        Intrinsics.checkNotNullExpressionValue(BID_FILTER_KEY_PLACEMENT_ID, "BID_FILTER_KEY_PLACEMENT_ID");
        String strOptString = config.optString("placementId");
        Intrinsics.checkNotNullExpressionValue(strOptString, "config.optString(PLACEMENT_ID_KEY)");
        linkedHashMap.put(BID_FILTER_KEY_PLACEMENT_ID, strOptString);
        String BID_FILTER_KEY_UNIT_ID = BidConstants.BID_FILTER_KEY_UNIT_ID;
        Intrinsics.checkNotNullExpressionValue(BID_FILTER_KEY_UNIT_ID, "BID_FILTER_KEY_UNIT_ID");
        String strOptString2 = config.optString("unitId");
        Intrinsics.checkNotNullExpressionValue(strOptString2, "config.optString(UNIT_ID_KEY)");
        linkedHashMap.put(BID_FILTER_KEY_UNIT_ID, strOptString2);
        String BID_FILTER_KEY_AD_TYPE = BidConstants.BID_FILTER_KEY_AD_TYPE;
        Intrinsics.checkNotNullExpressionValue(BID_FILTER_KEY_AD_TYPE, "BID_FILTER_KEY_AD_TYPE");
        linkedHashMap.put(BID_FILTER_KEY_AD_TYPE, adType);
        String buyerUid = BidManager.getBuyerUid(ContextProvider.getInstance().getApplicationContext(), linkedHashMap);
        if (buyerUid == null) {
            buyerUid = "";
        }
        IronLog.ADAPTER_API.verbose("token = " + buyerUid);
        map.put("token", buyerUid);
        return map;
    }

    @NotNull
    public static final IntegrationData getIntegrationData(@Nullable Context context) {
        return INSTANCE.getIntegrationData(context);
    }

    private final void initSdk(String appId, String appKey) {
        Unit unit;
        Application application;
        if (mInitState == Companion.EInitState.NOT_INIT || mInitState == Companion.EInitState.INIT_IN_PROGRESS) {
            initCallbackListeners.add(this);
        }
        if (mDidCallInit.compareAndSet(false, true)) {
            mInitState = Companion.EInitState.INIT_IN_PROGRESS;
            if (isAdaptersDebugEnabled()) {
                MBridgeConstans.DEBUG = true;
            }
            MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
            Intrinsics.checkNotNullExpressionValue(mBridgeSDK, "getMBridgeSDK()");
            Map<String, String> mBConfigurationMap = mBridgeSDK.getMBConfigurationMap(appId, appKey);
            setChannelCode();
            Boolean bool = this.consentCollectingUserData;
            if (bool != null) {
                setConsent(bool.booleanValue());
            }
            Boolean bool2 = this.doNotSellCollectingUserData;
            if (bool2 != null) {
                setCCPAValue(bool2.booleanValue());
            }
            IronLog.ADAPTER_API.verbose(getProviderName() + " initSDK with appId=" + appId + " and appKey=" + appKey);
            Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
            if (currentActiveActivity == null || (application = currentActiveActivity.getApplication()) == null) {
                unit = null;
            } else {
                mBridgeSDK.init(mBConfigurationMap, application, (SDKInitStatusListener) this);
                unit = Unit.f93236a;
            }
            if (unit == null) {
                mBridgeSDK.init(mBConfigurationMap, ContextProvider.getInstance().getApplicationContext(), this);
            }
        }
    }

    private final boolean isCOPPAMetaData(String key, String value) {
        return StringsKt.N(key, META_DATA_MINTEGRAL_COPPA_KEY, true) && value.length() > 0;
    }

    private final boolean isInterstitialPlacementIdExist(String placementId) {
        Set<MintegralAdapter> adapters = mInterstitialAds.getAdapters();
        if ((adapters instanceof Collection) && adapters.isEmpty()) {
            return false;
        }
        Iterator<T> it = adapters.iterator();
        while (it.hasNext()) {
            if (Intrinsics.areEqual(((MintegralAdapter) it.next()).mInterstitialPlacementId, placementId)) {
                return true;
            }
        }
        return false;
    }

    private final String mapToMintegralType(LevelPlay.AdFormat adUnit) {
        int i10 = WhenMappings.$EnumSwitchMapping$1[adUnit.ordinal()];
        if (i10 == 1) {
            String BID_FILTER_VALUE_AD_TYPE_REWARD_VIDEO = BidConstants.BID_FILTER_VALUE_AD_TYPE_REWARD_VIDEO;
            Intrinsics.checkNotNullExpressionValue(BID_FILTER_VALUE_AD_TYPE_REWARD_VIDEO, "BID_FILTER_VALUE_AD_TYPE_REWARD_VIDEO");
            return BID_FILTER_VALUE_AD_TYPE_REWARD_VIDEO;
        }
        if (i10 == 2) {
            String BID_FILTER_VALUE_AD_TYPE_INTERSTITIAL_VIDEO = BidConstants.BID_FILTER_VALUE_AD_TYPE_INTERSTITIAL_VIDEO;
            Intrinsics.checkNotNullExpressionValue(BID_FILTER_VALUE_AD_TYPE_INTERSTITIAL_VIDEO, "BID_FILTER_VALUE_AD_TYPE_INTERSTITIAL_VIDEO");
            return BID_FILTER_VALUE_AD_TYPE_INTERSTITIAL_VIDEO;
        }
        if (i10 != 3) {
            return X1.f42014f;
        }
        String BID_FILTER_VALUE_AD_TYPE_BANNER = BidConstants.BID_FILTER_VALUE_AD_TYPE_BANNER;
        Intrinsics.checkNotNullExpressionValue(BID_FILTER_VALUE_AD_TYPE_BANNER, "BID_FILTER_VALUE_AD_TYPE_BANNER");
        return BID_FILTER_VALUE_AD_TYPE_BANNER;
    }

    private final void setCCPAValue(boolean ccpa) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[mInitState.ordinal()];
        if (i10 == 3) {
            this.doNotSellCollectingUserData = Boolean.valueOf(ccpa);
            return;
        }
        if (i10 != 4) {
            return;
        }
        MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
        Intrinsics.checkNotNullExpressionValue(mBridgeSDK, "getMBridgeSDK()");
        IronLog.ADAPTER_API.verbose("setDoNotTrackStatus with ccpa = " + ccpa);
        mBridgeSDK.setDoNotTrackStatus(ContextProvider.getInstance().getApplicationContext(), ccpa);
    }

    private final void setCOPPAValue(boolean value) {
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("value = " + value);
        if (WhenMappings.$EnumSwitchMapping$0[mInitState.ordinal()] != 1) {
            this.coppaUserData = Boolean.valueOf(value);
            return;
        }
        MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
        Intrinsics.checkNotNullExpressionValue(mBridgeSDK, "getMBridgeSDK()");
        ironLog.verbose("set coppa value = " + value);
        mBridgeSDK.setCoppaStatus(ContextProvider.getInstance().getApplicationContext(), value);
    }

    private final void setChannelCode() {
        try {
            Method declaredMethod = Aa.class.getDeclaredMethod("b", String.class);
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(Aa.class, "Y+H6DFttYrPQYcIb+F2F+F5/Hv==");
        } catch (Throwable th2) {
            th2.printStackTrace();
            IronLog.INTERNAL.error("Error setting channel code " + th2);
        }
    }

    @NotNull
    public static final MintegralAdapter startAdapter(@NotNull String str) {
        return INSTANCE.startAdapter(str);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void destroyBanner(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        final String strOptString = config.optString("placementId");
        if (strOptString == null || strOptString.length() == 0) {
            return;
        }
        AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.mintegral.a
            @Override // java.lang.Runnable
            public final void run() {
                MintegralAdapter.destroyBanner$lambda$6(strOptString, this);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void destroyInterstitialAd(@Nullable JSONObject config) {
        IronLog.ADAPTER_API.verbose("Dispose interstitial ad of " + getProviderName() + ", placementId = " + (config != null ? config.optString("placementId") : null));
        mInterstitialAds.removeAd(this);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void destroyRewardedVideoAd(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        String strOptString = config.optString("placementId");
        IronLog.ADAPTER_API.verbose("Destroy rewarded video ad of " + getProviderName() + ", placementId = " + strOptString);
        this.mRewardedVideoPlacementIdToSmashListener.clear();
        this.mRewardedVideoPlacementIdToAdListener.clear();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    @Nullable
    public Map<String, Object> getBannerBiddingData(@NotNull JSONObject config, @Nullable JSONObject adData) {
        Intrinsics.checkNotNullParameter(config, "config");
        return getBiddingData(config, mapToMintegralType(LevelPlay.AdFormat.BANNER));
    }

    @Nullable
    public final FrameLayout.LayoutParams getBannerLayoutParams(@NotNull String placementId) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        return this.mBannerPlacementIdToLayout.get(placementId);
    }

    @Nullable
    public final MBBannerView getBannerView(@NotNull String placementId) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        return this.mBannerPlacementIdToAdView.get(placementId);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    @NotNull
    public String getCoreSDKVersion() {
        return INSTANCE.getAdapterSDKVersion();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    @Nullable
    public Map<String, Object> getInterstitialBiddingData(@NotNull JSONObject config, @Nullable JSONObject adData) {
        Intrinsics.checkNotNullParameter(config, "config");
        return getBiddingData(config, mapToMintegralType(LevelPlay.AdFormat.INTERSTITIAL));
    }

    @Nullable
    public final MBBidNewInterstitialHandler getInterstitialHandler() {
        return mInterstitialAds.retrieveAd(this);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    @Nullable
    public Map<String, Object> getRewardedVideoBiddingData(@NotNull JSONObject config, @Nullable JSONObject adData) {
        Intrinsics.checkNotNullParameter(config, "config");
        return getBiddingData(config, mapToMintegralType(LevelPlay.AdFormat.REWARDED));
    }

    @Nullable
    /* JADX INFO: renamed from: getRewardedVideoHandler, reason: from getter */
    public final MBBidRewardVideoHandler getMRewardedVideoAd() {
        return this.mRewardedVideoAd;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    @NotNull
    public String getVersion() {
        return "5.3.0";
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBannerForBidding(@Nullable String ironsourceAppKey, @Nullable String userId, @NotNull JSONObject config, @NotNull BannerSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String appId = config.optString("appId");
        String appKey = config.optString("appKey");
        String placementId = config.optString("placementId");
        if (appId == null || appId.length() == 0) {
            IronLog.INTERNAL.error("Missing appId");
            listener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing params: appId", "Banner"));
            return;
        }
        if (appKey == null || appKey.length() == 0) {
            IronLog.INTERNAL.error("Missing appKey");
            listener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing params: appKey", "Banner"));
            return;
        }
        if (placementId == null || placementId.length() == 0) {
            IronLog.INTERNAL.error("Missing placementId");
            listener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing params: placementId", "Banner"));
            return;
        }
        ConcurrentHashMap<String, BannerSmashListener> concurrentHashMap = this.mBannerPlacementIdToSmashListener;
        Intrinsics.checkNotNullExpressionValue(placementId, "placementId");
        concurrentHashMap.put(placementId, listener);
        int i10 = WhenMappings.$EnumSwitchMapping$0[mInitState.ordinal()];
        if (i10 == 1) {
            listener.onBannerInitSuccess();
        } else {
            if (i10 == 2) {
                listener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("SDK failed to init.", "Banner"));
                return;
            }
            Intrinsics.checkNotNullExpressionValue(appId, "appId");
            Intrinsics.checkNotNullExpressionValue(appKey, "appKey");
            initSdk(appId, appKey);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitialForBidding(@Nullable String ironsourceAppKey, @Nullable String userId, @NotNull JSONObject config, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String appId = config.optString("appId");
        String appKey = config.optString("appKey");
        String placementId = config.optString("placementId");
        if (appId == null || appId.length() == 0) {
            IronLog.INTERNAL.error("Missing appId");
            listener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing params: appId", "Interstitial"));
            return;
        }
        if (appKey == null || appKey.length() == 0) {
            IronLog.INTERNAL.error("Missing appKey");
            listener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing params: appKey", "Interstitial"));
            return;
        }
        if (placementId == null || placementId.length() == 0) {
            IronLog.INTERNAL.error("Missing placementId");
            listener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing params: placementId", "Interstitial"));
            return;
        }
        ConcurrentHashMap<String, InterstitialSmashListener> concurrentHashMap = this.mInterstitialPlacementIdToSmashListener;
        Intrinsics.checkNotNullExpressionValue(placementId, "placementId");
        concurrentHashMap.put(placementId, listener);
        int i10 = WhenMappings.$EnumSwitchMapping$0[mInitState.ordinal()];
        if (i10 == 1) {
            listener.onInterstitialInitSuccess();
        } else {
            if (i10 == 2) {
                listener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("SDK failed to init.", "Interstitial"));
                return;
            }
            Intrinsics.checkNotNullExpressionValue(appId, "appId");
            Intrinsics.checkNotNullExpressionValue(appKey, "appKey");
            initSdk(appId, appKey);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(@Nullable String ironsourceAppKey, @Nullable String userId, @NotNull JSONObject config, @NotNull RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String appId = config.optString("appId");
        String appKey = config.optString("appKey");
        String placementId = config.optString("placementId");
        if (appId == null || appId.length() == 0) {
            IronLog.INTERNAL.error("Missing appId");
            listener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing params: appId", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        if (appKey == null || appKey.length() == 0) {
            IronLog.INTERNAL.error("Missing appKey");
            listener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing params: appKey", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        if (placementId == null || placementId.length() == 0) {
            IronLog.INTERNAL.error("Missing placementId");
            listener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing params: placementId", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        ConcurrentHashMap<String, RewardedVideoSmashListener> concurrentHashMap = this.mRewardedVideoPlacementIdToSmashListener;
        Intrinsics.checkNotNullExpressionValue(placementId, "placementId");
        concurrentHashMap.put(placementId, listener);
        int i10 = WhenMappings.$EnumSwitchMapping$0[mInitState.ordinal()];
        if (i10 == 1) {
            listener.onRewardedVideoInitSuccess();
        } else {
            if (i10 == 2) {
                listener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("SDK failed to init.", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
                return;
            }
            Intrinsics.checkNotNullExpressionValue(appId, "appId");
            Intrinsics.checkNotNullExpressionValue(appKey, "appKey");
            initSdk(appId, appKey);
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public boolean isInterstitialReady(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        String placementId = config.optString("placementId");
        MBBidNewInterstitialHandler mBBidNewInterstitialHandlerRetrieveAd = mInterstitialAds.retrieveAd(this);
        if (mBBidNewInterstitialHandlerRetrieveAd == null || !mBBidNewInterstitialHandlerRetrieveAd.isBidReady()) {
            return false;
        }
        Intrinsics.checkNotNullExpressionValue(placementId, "placementId");
        return isInterstitialPlacementIdExist(placementId);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        MBBidRewardVideoHandler mBBidRewardVideoHandler = this.mRewardedVideoAd;
        return mBBidRewardVideoHandler != null && mBBidRewardVideoHandler.isBidReady();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public boolean isUsingActivityBeforeImpression(@NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        return false;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForBidding(@NotNull JSONObject config, @Nullable JSONObject adData, @Nullable String serverData, @Nullable ISBannerSize bannerSize, @NotNull BannerSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String placementId = config.optString("placementId");
        String strOptString = config.optString("unitId");
        if (strOptString == null || strOptString.length() == 0) {
            IronLog.INTERNAL.error("Missing unitId");
            listener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("Missing params: unitId"));
            return;
        }
        if (bannerSize == null) {
            IronLog.INTERNAL.error("banner size is null");
            listener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError("banner size is null"));
            return;
        }
        Context context = ContextProvider.getInstance().getApplicationContext();
        MBBannerView mBBannerView = new MBBannerView(ContextProvider.getInstance().getApplicationContext());
        ConcurrentHashMap<String, MBBannerView> concurrentHashMap = this.mBannerPlacementIdToAdView;
        Intrinsics.checkNotNullExpressionValue(placementId, "placementId");
        concurrentHashMap.put(placementId, mBBannerView);
        ConcurrentHashMap<String, FrameLayout.LayoutParams> concurrentHashMap2 = this.mBannerPlacementIdToLayout;
        Intrinsics.checkNotNullExpressionValue(context, "context");
        concurrentHashMap2.put(placementId, createBannerLayoutParams(context, bannerSize));
        mBBannerView.init(createBannerSize(context, bannerSize), placementId, strOptString);
        mBBannerView.setRefreshTime(0);
        mBBannerView.setAllowShowCloseBtn(false);
        MintegralBannerListener mintegralBannerListener = new MintegralBannerListener(placementId, new WeakReference(listener), new WeakReference(this));
        this.mBannerPlacementIdToAdListener.put(placementId, mintegralBannerListener);
        mBBannerView.setBannerAdListener(mintegralBannerListener);
        IronLog.ADAPTER_API.verbose("load banner with size " + bannerSize.getWidth() + "X" + bannerSize.getHeight() + " placementId=" + placementId + " unitId=" + strOptString + " serverData=" + serverData);
        mBBannerView.loadFromBid(serverData);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitialForBidding(@NotNull JSONObject config, @Nullable JSONObject adData, @Nullable String serverData, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String placementId = config.optString("placementId");
        String strOptString = config.optString("unitId");
        if (strOptString == null || strOptString.length() == 0) {
            IronLog.INTERNAL.error("Missing unitId");
            listener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError("Missing params: unitId"));
            return;
        }
        Intrinsics.checkNotNullExpressionValue(placementId, "placementId");
        if (isInterstitialPlacementIdExist(placementId)) {
            IronLog.INTERNAL.info("Interstitial load request skipped. An interstitial ad with the same configuration is currently in use.");
            listener.onInterstitialAdLoadFailed(ErrorBuilder.buildLoadFailedError("Interstitial load request skipped. An interstitial ad with the same configuration is currently in use."));
            return;
        }
        MBBidNewInterstitialHandler mBBidNewInterstitialHandler = new MBBidNewInterstitialHandler(ContextProvider.getInstance().getApplicationContext(), placementId, strOptString);
        MintegralInterstitialListener mintegralInterstitialListener = new MintegralInterstitialListener(placementId, new WeakReference(listener), new WeakReference(this));
        this.mInterstitialPlacementIdToAdListener.put(placementId, mintegralInterstitialListener);
        mBBidNewInterstitialHandler.setInterstitialVideoListener(mintegralInterstitialListener);
        this.mInterstitialPlacementId = placementId;
        mInterstitialAds.storeAd(this, mBBidNewInterstitialHandler);
        IronLog.ADAPTER_API.verbose("load interstitial with placementId=" + placementId + " unitId=" + strOptString + " serverData=" + serverData);
        mBBidNewInterstitialHandler.loadFromBid(serverData);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(@NotNull JSONObject config, @Nullable JSONObject adData, @Nullable String serverData, @NotNull RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String placementId = config.optString("placementId");
        String strOptString = config.optString("unitId");
        if (strOptString == null || strOptString.length() == 0) {
            IronLog.INTERNAL.error("Missing unitId");
            listener.onRewardedVideoAvailabilityChanged(false);
            return;
        }
        MBBidRewardVideoHandler mBBidRewardVideoHandler = new MBBidRewardVideoHandler(ContextProvider.getInstance().getApplicationContext(), placementId, strOptString);
        Intrinsics.checkNotNullExpressionValue(placementId, "placementId");
        MintegralRewardedVideoListener mintegralRewardedVideoListener = new MintegralRewardedVideoListener(placementId, new WeakReference(listener), new WeakReference(this));
        this.mRewardedVideoPlacementIdToAdListener.put(placementId, mintegralRewardedVideoListener);
        mBBidRewardVideoHandler.setRewardVideoListener(mintegralRewardedVideoListener);
        this.mRewardedVideoAd = mBBidRewardVideoHandler;
        IronLog.ADAPTER_API.verbose("load rewarded video with placementId=" + placementId + " unitId=" + strOptString + " serverData=" + serverData);
        mBBidRewardVideoHandler.loadFromBid(serverData);
    }

    @Override // com.mbridge.msdk.out.SDKInitStatusListener
    public void onInitFail(@NotNull String errorMsg) {
        Intrinsics.checkNotNullParameter(errorMsg, "errorMsg");
        IronLog.ADAPTER_CALLBACK.verbose("error= " + errorMsg);
        mInitState = Companion.EInitState.INIT_FAIL;
        for (INetworkInitCallbackListener initCallbackListeners2 : initCallbackListeners) {
            Intrinsics.checkNotNullExpressionValue(initCallbackListeners2, "initCallbackListeners");
            initCallbackListeners2.onNetworkInitCallbackFailed("SDK failed to init.");
        }
        initCallbackListeners.clear();
    }

    @Override // com.mbridge.msdk.out.SDKInitStatusListener
    public void onInitSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        mInitState = Companion.EInitState.INIT_SUCCESS;
        Boolean bool = this.coppaUserData;
        if (bool != null) {
            setCOPPAValue(bool.booleanValue());
        }
        for (INetworkInitCallbackListener initCallbackListeners2 : initCallbackListeners) {
            Intrinsics.checkNotNullExpressionValue(initCallbackListeners2, "initCallbackListeners");
            initCallbackListeners2.onNetworkInitCallbackSuccess();
        }
        initCallbackListeners.clear();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(@Nullable String error) {
        for (Map.Entry<String, RewardedVideoSmashListener> entry : this.mRewardedVideoPlacementIdToSmashListener.entrySet()) {
            Intrinsics.checkNotNullExpressionValue(entry, "mRewardedVideoPlacementIdToSmashListener.entries");
            entry.getValue().onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("failed to init: " + error, IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        for (Map.Entry<String, InterstitialSmashListener> entry2 : this.mInterstitialPlacementIdToSmashListener.entrySet()) {
            Intrinsics.checkNotNullExpressionValue(entry2, "mInterstitialPlacementIdToSmashListener.entries");
            entry2.getValue().onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("failed to init: " + error, "Interstitial"));
        }
        for (Map.Entry<String, BannerSmashListener> entry3 : this.mBannerPlacementIdToSmashListener.entrySet()) {
            Intrinsics.checkNotNullExpressionValue(entry3, "mBannerPlacementIdToSmashListener.entries");
            entry3.getValue().onBannerInitFailed(ErrorBuilder.buildInitFailedError("failed to init: " + error, "Banner"));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        for (Map.Entry<String, RewardedVideoSmashListener> entry : this.mRewardedVideoPlacementIdToSmashListener.entrySet()) {
            Intrinsics.checkNotNullExpressionValue(entry, "mRewardedVideoPlacementIdToSmashListener.entries");
            entry.getValue().onRewardedVideoInitSuccess();
        }
        for (Map.Entry<String, InterstitialSmashListener> entry2 : this.mInterstitialPlacementIdToSmashListener.entrySet()) {
            Intrinsics.checkNotNullExpressionValue(entry2, "mInterstitialPlacementIdToSmashListener.entries");
            entry2.getValue().onInterstitialInitSuccess();
        }
        for (Map.Entry<String, BannerSmashListener> entry3 : this.mBannerPlacementIdToSmashListener.entrySet()) {
            Intrinsics.checkNotNullExpressionValue(entry3, "mBannerPlacementIdToSmashListener.entries");
            entry3.getValue().onBannerInitSuccess();
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    protected void setConsent(boolean consent) {
        int i10 = WhenMappings.$EnumSwitchMapping$0[mInitState.ordinal()];
        if (i10 == 3) {
            this.consentCollectingUserData = Boolean.valueOf(consent);
            return;
        }
        if (i10 != 4) {
            return;
        }
        MBridgeSDKImpl mBridgeSDK = MBridgeSDKFactory.getMBridgeSDK();
        Intrinsics.checkNotNullExpressionValue(mBridgeSDK, "getMBridgeSDK()");
        IronLog.ADAPTER_API.verbose("setConsentStatus consentStatus = " + (consent ? 1 : 0));
        mBridgeSDK.setConsentStatus(ContextProvider.getInstance().getApplicationContext(), consent ? 1 : 0);
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
        Intrinsics.checkNotNullExpressionValue(valueForType, "formatValueForType(value….META_DATA_VALUE_BOOLEAN)");
        if (isCOPPAMetaData(key, valueForType)) {
            setCOPPAValue(MetaDataUtils.getMetaDataBooleanValue(valueForType));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void showInterstitial(@NotNull JSONObject config, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String strOptString = config.optString("placementId");
        if (!isInterstitialReady(config)) {
            listener.onInterstitialAdShowFailed(ErrorBuilder.buildNoAdsToShowError("Interstitial"));
            return;
        }
        IronLog.ADAPTER_API.verbose("show interstitial with placementId = " + strOptString);
        MBBidNewInterstitialHandler mBBidNewInterstitialHandlerRetrieveAd = mInterstitialAds.retrieveAd(this);
        if (mBBidNewInterstitialHandlerRetrieveAd != null) {
            mBBidNewInterstitialHandlerRetrieveAd.showFromBid();
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(@NotNull JSONObject config, @NotNull RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String strOptString = config.optString("placementId");
        if (!isRewardedVideoAvailable(config)) {
            listener.onRewardedVideoAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        IronLog.ADAPTER_API.verbose("show rewarded video with placementId = " + strOptString);
        MBBidRewardVideoHandler mBBidRewardVideoHandler = this.mRewardedVideoAd;
        if (mBBidRewardVideoHandler != null) {
            mBBidRewardVideoHandler.showFromBid();
        }
    }
}
