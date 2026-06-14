package com.ironsource.adapters.pangle;

import android.app.Activity;
import android.content.Context;
import android.widget.FrameLayout;
import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerAd;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerRequest;
import com.bytedance.sdk.openadsdk.api.banner.PAGBannerSize;
import com.bytedance.sdk.openadsdk.api.bidding.PAGBiddingRequest;
import com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback;
import com.bytedance.sdk.openadsdk.api.init.PAGConfig;
import com.bytedance.sdk.openadsdk.api.init.PAGSdk;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialAd;
import com.bytedance.sdk.openadsdk.api.interstitial.PAGInterstitialRequest;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedAd;
import com.bytedance.sdk.openadsdk.api.reward.PAGRewardedRequest;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.firebase.remoteconfig.RemoteConfigConstants;
import com.ironsource.C4240b4;
import com.ironsource.C4424m2;
import com.ironsource.adapters.bigo.BigoAdapter;
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
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.MetaDataUtils;
import com.ironsource.mediationsdk.sdk.BannerSmashListener;
import com.ironsource.mediationsdk.sdk.InterstitialSmashListener;
import com.ironsource.mediationsdk.sdk.RewardedVideoSmashListener;
import com.ironsource.mediationsdk.utils.ErrorBuilder;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.unity3d.mediation.LevelPlay;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000´\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\"\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u008f\u00012\u00020\u00012\u00020\u0002:\u0002\u008f\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\u0006J\u000f\u0010\n\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J)\u0010\u0018\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u001f\u0010\u0006J\u000f\u0010 \u001a\u00020\u001aH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010%\u001a\u00020$2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010)\u001a\u00020(2\u0006\u0010'\u001a\u00020\"H\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0003H\u0002¢\u0006\u0004\b+\u0010,J\u001f\u00101\u001a\u00020\b2\u0006\u0010.\u001a\u00020-2\u0006\u00100\u001a\u00020/H\u0002¢\u0006\u0004\b1\u00102J\u000f\u00103\u001a\u00020\u0003H\u0016¢\u0006\u0004\b3\u0010,J\u000f\u00104\u001a\u00020\u0003H\u0016¢\u0006\u0004\b4\u0010,J\u0017\u00107\u001a\u00020\u001a2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\bH\u0016¢\u0006\u0004\b9\u0010\u000bJ\u0017\u0010;\u001a\u00020\b2\u0006\u0010:\u001a\u00020\u0003H\u0016¢\u0006\u0004\b;\u0010\u0006J5\u0010>\u001a\u00020\b2\b\u0010<\u001a\u0004\u0018\u00010\u00032\b\u0010=\u001a\u0004\u0018\u00010\u00032\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b>\u0010?J?\u0010A\u001a\u00020\b2\b\u0010<\u001a\u0004\u0018\u00010\u00032\b\u0010=\u001a\u0004\u0018\u00010\u00032\b\u00100\u001a\u0004\u0018\u00010/2\b\u0010@\u001a\u0004\u0018\u00010/2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bA\u0010BJ3\u0010C\u001a\u00020\b2\u0006\u00100\u001a\u00020/2\b\u0010@\u001a\u0004\u0018\u00010/2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bC\u0010DJ)\u0010E\u001a\u00020\b2\u0006\u00100\u001a\u00020/2\b\u0010@\u001a\u0004\u0018\u00010/2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bE\u0010FJ\u001f\u0010G\u001a\u00020\b2\u0006\u00100\u001a\u00020/2\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bG\u0010HJ\u0017\u0010I\u001a\u00020\u001a2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\bI\u0010JJ)\u0010K\u001a\u00020\b2\u0006\u00100\u001a\u00020/2\b\u0010@\u001a\u0004\u0018\u00010/2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\bK\u0010LJ5\u0010M\u001a\u00020\b2\b\u0010<\u001a\u0004\u0018\u00010\u00032\b\u0010=\u001a\u0004\u0018\u00010\u00032\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010\u0014\u001a\u00020\u0017H\u0016¢\u0006\u0004\bM\u0010NJ5\u0010O\u001a\u00020\b2\b\u0010<\u001a\u0004\u0018\u00010\u00032\b\u0010=\u001a\u0004\u0018\u00010\u00032\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010\u0014\u001a\u00020\u0017H\u0016¢\u0006\u0004\bO\u0010NJ3\u0010P\u001a\u00020\b2\u0006\u00100\u001a\u00020/2\b\u0010@\u001a\u0004\u0018\u00010/2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0014\u001a\u00020\u0017H\u0016¢\u0006\u0004\bP\u0010QJ)\u0010R\u001a\u00020\b2\u0006\u00100\u001a\u00020/2\b\u0010@\u001a\u0004\u0018\u00010/2\u0006\u0010\u0014\u001a\u00020\u0017H\u0016¢\u0006\u0004\bR\u0010SJ\u001f\u0010T\u001a\u00020\b2\u0006\u00100\u001a\u00020/2\u0006\u0010\u0014\u001a\u00020\u0017H\u0016¢\u0006\u0004\bT\u0010UJ\u0017\u0010V\u001a\u00020\u001a2\u0006\u00100\u001a\u00020/H\u0016¢\u0006\u0004\bV\u0010JJ)\u0010W\u001a\u00020\b2\u0006\u00100\u001a\u00020/2\b\u0010@\u001a\u0004\u0018\u00010/2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\bW\u0010LJ5\u0010Y\u001a\u00020\b2\b\u0010<\u001a\u0004\u0018\u00010\u00032\b\u0010=\u001a\u0004\u0018\u00010\u00032\b\u00100\u001a\u0004\u0018\u00010/2\u0006\u0010\u0014\u001a\u00020XH\u0016¢\u0006\u0004\bY\u0010ZJ=\u0010[\u001a\u00020\b2\u0006\u00100\u001a\u00020/2\b\u0010@\u001a\u0004\u0018\u00010/2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00032\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0014\u001a\u00020XH\u0016¢\u0006\u0004\b[\u0010\\J\u0019\u0010]\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u00010/H\u0016¢\u0006\u0004\b]\u0010^J)\u0010_\u001a\u00020\b2\u0006\u00100\u001a\u00020/2\b\u0010@\u001a\u0004\u0018\u00010/2\u0006\u0010.\u001a\u00020-H\u0016¢\u0006\u0004\b_\u0010LJ%\u0010c\u001a\u00020\b2\u0006\u0010`\u001a\u00020\u00032\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00030aH\u0014¢\u0006\u0004\bc\u0010dJ\u0017\u0010f\u001a\u00020\b2\u0006\u0010e\u001a\u00020\u001aH\u0014¢\u0006\u0004\bf\u0010\u001dJ!\u0010k\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010h\u001a\u0004\u0018\u00010gH\u0000¢\u0006\u0004\bi\u0010jJ\u001f\u0010o\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010l\u001a\u00020\u001aH\u0000¢\u0006\u0004\bm\u0010nJ!\u0010t\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010q\u001a\u0004\u0018\u00010pH\u0000¢\u0006\u0004\br\u0010sJ\u001f\u0010v\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00032\u0006\u0010l\u001a\u00020\u001aH\u0000¢\u0006\u0004\bu\u0010nJ!\u0010{\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\u00032\b\u0010x\u001a\u0004\u0018\u00010wH\u0000¢\u0006\u0004\by\u0010zR\"\u0010}\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00130|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R$\u0010\u0080\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u007f0|8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010~R$\u0010\u0081\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020g0|8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0081\u0001\u0010~R\"\u0010\u0082\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a0|8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0082\u0001\u0010~R\u001e\u0010\u0084\u0001\u001a\t\u0012\u0004\u0012\u00020\u00030\u0083\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R$\u0010\u0086\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00170|8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010~R%\u0010\u0088\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0012\u0005\u0012\u00030\u0087\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010~R$\u0010\u0089\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020p0|8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0089\u0001\u0010~R\"\u0010\u008a\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a0|8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u008a\u0001\u0010~R$\u0010\u008b\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020X0|8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008b\u0001\u0010~R%\u0010\u008d\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0003\u0012\u0005\u0012\u00030\u008c\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008d\u0001\u0010~R$\u0010\u008e\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020w0|8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u008e\u0001\u0010~¨\u0006\u0090\u0001"}, d2 = {"Lcom/ironsource/adapters/pangle/PangleAdapter;", "Lcom/ironsource/mediationsdk/AbstractAdapter;", "Lcom/ironsource/mediationsdk/INetworkInitCallbackListener;", "", "providerName", "<init>", "(Ljava/lang/String;)V", RemoteConfigConstants.RequestFieldKey.APP_ID, "", "initSdk", "initializationSuccess", "()V", "", "code", PglCryptUtils.KEY_MESSAGE, "initializationFailure", "(ILjava/lang/String;)V", BigoAdapter.SLOT_ID, C4424m2.f43620s, "Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "loadRewardedVideoInternal", "(Ljava/lang/String;Ljava/lang/String;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V", "Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;", "loadInterstitialInternal", "(Ljava/lang/String;Ljava/lang/String;Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;)V", "", "doNotSell", "setCCPAValue", "(Z)V", "value", "setCOPPAValue", "isCoppaChildUser", "()Z", "Lcom/ironsource/mediationsdk/ISBannerSize;", "bannerSize", "Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerSize;", "getBannerSize", "(Lcom/ironsource/mediationsdk/ISBannerSize;)Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerSize;", "size", "Landroid/widget/FrameLayout$LayoutParams;", "getBannerLayoutParams", "(Lcom/ironsource/mediationsdk/ISBannerSize;)Landroid/widget/FrameLayout$LayoutParams;", "getMediationInfo", "()Ljava/lang/String;", "Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;", "biddingDataCallback", "Lorg/json/JSONObject;", "config", "collectBiddingData", "(Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;Lorg/json/JSONObject;)V", "getVersion", "getCoreSDKVersion", "Lcom/unity3d/mediation/LevelPlay$AdFormat;", "adFormat", "isUsingActivityBeforeImpression", "(Lcom/unity3d/mediation/LevelPlay$AdFormat;)Z", "onNetworkInitCallbackSuccess", "error", "onNetworkInitCallbackFailed", "appKey", "userId", "initRewardedVideoWithCallback", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V", "adData", "initAndLoadRewardedVideo", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V", "loadRewardedVideoForBidding", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V", "loadRewardedVideo", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V", C4240b4.h.f42594i, "(Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/RewardedVideoSmashListener;)V", "isRewardedVideoAvailable", "(Lorg/json/JSONObject;)Z", "collectRewardedVideoBiddingData", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/bidding/BiddingDataCallback;)V", "initInterstitialForBidding", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;)V", C4240b4.h.B, "loadInterstitialForBidding", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;)V", C4240b4.h.E, "(Lorg/json/JSONObject;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;)V", C4240b4.h.H, "(Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/InterstitialSmashListener;)V", "isInterstitialReady", "collectInterstitialBiddingData", "Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;", "initBannerForBidding", "(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;)V", "loadBannerForBidding", "(Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;Lcom/ironsource/mediationsdk/ISBannerSize;Lcom/ironsource/mediationsdk/sdk/BannerSmashListener;)V", C4240b4.h.S, "(Lorg/json/JSONObject;)V", "collectBannerBiddingData", C4240b4.i.W, "", "values", "setMetaData", "(Ljava/lang/String;Ljava/util/List;)V", C4240b4.j.f42669b0, "setConsent", "Lcom/bytedance/sdk/openadsdk/api/reward/PAGRewardedAd;", "rewardedVideoAd", "setRewardedVideoAd$pangleadapter_release", "(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/api/reward/PAGRewardedAd;)V", "setRewardedVideoAd", "isAvailable", "setRewardedVideoAdAvailability$pangleadapter_release", "(Ljava/lang/String;Z)V", "setRewardedVideoAdAvailability", "Lcom/bytedance/sdk/openadsdk/api/interstitial/PAGInterstitialAd;", "interstitialAd", "setInterstitialAd$pangleadapter_release", "(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/api/interstitial/PAGInterstitialAd;)V", "setInterstitialAd", "setInterstitialAdAvailability$pangleadapter_release", "setInterstitialAdAvailability", "Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAd;", "bannerAd", "setBannerAd$pangleadapter_release", "(Ljava/lang/String;Lcom/bytedance/sdk/openadsdk/api/banner/PAGBannerAd;)V", "setBannerAd", "j$/util/concurrent/ConcurrentHashMap", "mSlotIdToRewardedVideoListener", "Lj$/util/concurrent/ConcurrentHashMap;", "Lcom/ironsource/adapters/pangle/PangleRewardedVideoAdListener;", "mSlotIdToRewardedVideoAdListener", "mSlotIdToRewardedVideoAd", "mSlotIdToRewardedVideoAdAvailability", "Ljava/util/concurrent/CopyOnWriteArraySet;", "mRewardedVideoSlotIdsForInitCallbacks", "Ljava/util/concurrent/CopyOnWriteArraySet;", "mSlotIdToInterstitialListener", "Lcom/ironsource/adapters/pangle/PangleInterstitialAdListener;", "mSlotIdToInterstitialAdListener", "mSlotIdToInterstitialAd", "mSlotIdToInterstitialAdAvailability", "mSlotIdToBannerListener", "Lcom/ironsource/adapters/pangle/PangleBannerAdListener;", "mSlotIdToBannerAdListener", "mSlotIdToBannerView", y.f66058y, "pangleadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class PangleAdapter extends AbstractAdapter implements INetworkInitCallbackListener {

    @NotNull
    private static final String ADAPTER_VERSION_KEY = "adapter_version";

    @NotNull
    private static final String APP_ID_KEY = "appID";

    @NotNull
    private static final String BANNER_SIZE_IS_NULL_ERROR_MSG = "banner size is null, banner has been destroyed";

    @NotNull
    private static final String GitHash = "f18efe2";

    @NotNull
    private static final String LEVELPLAY_ADXID = "33";

    @NotNull
    private static final String MEDIATION_NAME = "Ironsource";

    @NotNull
    private static final String MEDIATION_NAME_KEY = "mediation";

    @NotNull
    private static final String META_DATA_PANGLE_COPPA_KEY = "Pangle_COPPA";

    @NotNull
    private static final String NAME_KEY = "name";
    private static final int PANGLE_CHILD_DIRECTED_TYPE_CHILD = 1;
    private static final int PANGLE_CHILD_DIRECTED_TYPE_DEFAULT = -1;
    private static final int PANGLE_CHILD_DIRECTED_TYPE_NON_CHILD = 0;
    public static final int PANGLE_NOT_ALLOW_CHILD_ERROR_CODE = 20002;

    @NotNull
    public static final String PANGLE_NOT_ALLOW_CHILD_ERROR_MSG = "Pangle_COPPA indicates the user is a child. Pangle SDK V71 or higher does not support child users.";
    public static final int PANGLE_NO_FILL_ERROR_CODE = 20001;

    @NotNull
    private static final String SLOT_ID_KEY = "slotID";

    @NotNull
    private static final String VALUE_KEY = "value";

    @NotNull
    private static final String VERSION = "5.3.0";

    @NotNull
    private final CopyOnWriteArraySet<String> mRewardedVideoSlotIdsForInitCallbacks;

    @NotNull
    private ConcurrentHashMap<String, PangleBannerAdListener> mSlotIdToBannerAdListener;

    @NotNull
    private ConcurrentHashMap<String, BannerSmashListener> mSlotIdToBannerListener;

    @NotNull
    private ConcurrentHashMap<String, PAGBannerAd> mSlotIdToBannerView;

    @NotNull
    private ConcurrentHashMap<String, PAGInterstitialAd> mSlotIdToInterstitialAd;

    @NotNull
    private final ConcurrentHashMap<String, Boolean> mSlotIdToInterstitialAdAvailability;

    @NotNull
    private ConcurrentHashMap<String, PangleInterstitialAdListener> mSlotIdToInterstitialAdListener;

    @NotNull
    private ConcurrentHashMap<String, InterstitialSmashListener> mSlotIdToInterstitialListener;

    @NotNull
    private ConcurrentHashMap<String, PAGRewardedAd> mSlotIdToRewardedVideoAd;

    @NotNull
    private final ConcurrentHashMap<String, Boolean> mSlotIdToRewardedVideoAdAvailability;

    @NotNull
    private ConcurrentHashMap<String, PangleRewardedVideoAdListener> mSlotIdToRewardedVideoAdListener;

    @NotNull
    private ConcurrentHashMap<String, RewardedVideoSmashListener> mSlotIdToRewardedVideoListener;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private static int mChildDirected = -1;

    @NotNull
    private static final PAGConfig.Builder mPAGConfigBuilder = new PAGConfig.Builder();

    @NotNull
    private static final AtomicBoolean mWasInitCalled = new AtomicBoolean(false);

    @NotNull
    private static Companion.InitState mInitState = Companion.InitState.INIT_STATE_NONE;

    @NotNull
    private static final HashSet<INetworkInitCallbackListener> initCallbackListeners = new HashSet<>();

    @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001*B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\b\u0010\"\u001a\u00020\u0004H\u0007J\u0012\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010&H\u0007J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u000eX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u001e\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u00190\u0018j\b\u0012\u0004\u0012\u00020\u0019`\u001aX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Lcom/ironsource/adapters/pangle/PangleAdapter$Companion;", "", "()V", "ADAPTER_VERSION_KEY", "", "APP_ID_KEY", "BANNER_SIZE_IS_NULL_ERROR_MSG", "GitHash", "LEVELPLAY_ADXID", "MEDIATION_NAME", "MEDIATION_NAME_KEY", "META_DATA_PANGLE_COPPA_KEY", "NAME_KEY", "PANGLE_CHILD_DIRECTED_TYPE_CHILD", "", "PANGLE_CHILD_DIRECTED_TYPE_DEFAULT", "PANGLE_CHILD_DIRECTED_TYPE_NON_CHILD", "PANGLE_NOT_ALLOW_CHILD_ERROR_CODE", "PANGLE_NOT_ALLOW_CHILD_ERROR_MSG", "PANGLE_NO_FILL_ERROR_CODE", "SLOT_ID_KEY", "VALUE_KEY", "VERSION", "initCallbackListeners", "Ljava/util/HashSet;", "Lcom/ironsource/mediationsdk/INetworkInitCallbackListener;", "Lkotlin/collections/HashSet;", "mChildDirected", "mInitState", "Lcom/ironsource/adapters/pangle/PangleAdapter$Companion$InitState;", "mPAGConfigBuilder", "Lcom/bytedance/sdk/openadsdk/api/init/PAGConfig$Builder;", "mWasInitCalled", "Ljava/util/concurrent/atomic/AtomicBoolean;", "getAdapterSDKVersion", "getIntegrationData", "Lcom/ironsource/mediationsdk/IntegrationData;", POBCoreNativeConstants.NATIVE_CONTEXT, "Landroid/content/Context;", IronSourceConstants.START_ADAPTER, "Lcom/ironsource/adapters/pangle/PangleAdapter;", "providerName", "InitState", "pangleadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/ironsource/adapters/pangle/PangleAdapter$Companion$InitState;", "", "(Ljava/lang/String;I)V", "INIT_STATE_NONE", "INIT_STATE_IN_PROGRESS", "INIT_STATE_SUCCESS", "INIT_STATE_FAILED", "pangleadapter_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        private enum InitState {
            INIT_STATE_NONE,
            INIT_STATE_IN_PROGRESS,
            INIT_STATE_SUCCESS,
            INIT_STATE_FAILED
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String getAdapterSDKVersion() {
            String sDKVersion = PAGSdk.getSDKVersion();
            Intrinsics.checkNotNullExpressionValue(sDKVersion, "getSDKVersion()");
            return sDKVersion;
        }

        @NotNull
        public final IntegrationData getIntegrationData(@Nullable Context context) {
            return new IntegrationData("Pangle", "5.3.0");
        }

        @NotNull
        public final PangleAdapter startAdapter(@NotNull String providerName) {
            Intrinsics.checkNotNullParameter(providerName, "providerName");
            return new PangleAdapter(providerName);
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Companion.InitState.values().length];
            try {
                iArr[Companion.InitState.INIT_STATE_SUCCESS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Companion.InitState.INIT_STATE_FAILED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PangleAdapter(@NotNull String providerName) {
        super(providerName);
        Intrinsics.checkNotNullParameter(providerName, "providerName");
        this.mSlotIdToRewardedVideoListener = new ConcurrentHashMap<>();
        this.mSlotIdToRewardedVideoAdListener = new ConcurrentHashMap<>();
        this.mSlotIdToRewardedVideoAd = new ConcurrentHashMap<>();
        this.mSlotIdToRewardedVideoAdAvailability = new ConcurrentHashMap<>();
        this.mRewardedVideoSlotIdsForInitCallbacks = new CopyOnWriteArraySet<>();
        this.mSlotIdToInterstitialListener = new ConcurrentHashMap<>();
        this.mSlotIdToInterstitialAdListener = new ConcurrentHashMap<>();
        this.mSlotIdToInterstitialAd = new ConcurrentHashMap<>();
        this.mSlotIdToInterstitialAdAvailability = new ConcurrentHashMap<>();
        this.mSlotIdToBannerListener = new ConcurrentHashMap<>();
        this.mSlotIdToBannerAdListener = new ConcurrentHashMap<>();
        this.mSlotIdToBannerView = new ConcurrentHashMap<>();
        this.mLWSSupportState = LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_INSTANCE;
    }

    private final void collectBiddingData(final BiddingDataCallback biddingDataCallback, JSONObject config) {
        String strOptString = config.optString(SLOT_ID_KEY);
        if (mInitState == Companion.InitState.INIT_STATE_FAILED) {
            IronLog.INTERNAL.verbose("returning null as token since init is not successful");
            biddingDataCallback.onFailure("returning null as token since init is not successful - Pangle");
            return;
        }
        if (isCoppaChildUser()) {
            IronLog.INTERNAL.verbose(PANGLE_NOT_ALLOW_CHILD_ERROR_MSG);
            biddingDataCallback.onFailure("Pangle_COPPA indicates the user is a child. Pangle SDK V71 or higher does not support child users. - Pangle");
        } else {
            PAGBiddingRequest pAGBiddingRequest = new PAGBiddingRequest();
            pAGBiddingRequest.setSlotId(strOptString);
            pAGBiddingRequest.setAdxId(LEVELPLAY_ADXID);
            PAGSdk.getBiddingToken(ContextProvider.getInstance().getApplicationContext(), pAGBiddingRequest, new BiddingTokenCallback() { // from class: com.ironsource.adapters.pangle.a
                @Override // com.bytedance.sdk.openadsdk.api.init.BiddingTokenCallback
                public final void onBiddingTokenCollected(String str) {
                    PangleAdapter.collectBiddingData$lambda$18(biddingDataCallback, str);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void collectBiddingData$lambda$18(BiddingDataCallback biddingDataCallback, String bidToken) {
        Intrinsics.checkNotNullParameter(biddingDataCallback, "$biddingDataCallback");
        if (bidToken == null || bidToken.length() == 0) {
            biddingDataCallback.onFailure("Failed to receive token - Pangle");
            return;
        }
        IronLog.ADAPTER_API.verbose("token = " + bidToken);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Intrinsics.checkNotNullExpressionValue(bidToken, "bidToken");
        linkedHashMap.put("token", bidToken);
        biddingDataCallback.onSuccess(linkedHashMap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void destroyBanner$lambda$14(PangleAdapter this$0, String str) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PAGBannerAd pAGBannerAd = this$0.mSlotIdToBannerView.get(str);
        if (pAGBannerAd != null) {
            pAGBannerAd.setAdInteractionListener(null);
        }
        PAGBannerAd pAGBannerAd2 = this$0.mSlotIdToBannerView.get(str);
        if (pAGBannerAd2 != null) {
            pAGBannerAd2.destroy();
        }
        this$0.mSlotIdToBannerView.remove(str);
    }

    @NotNull
    public static final String getAdapterSDKVersion() {
        return INSTANCE.getAdapterSDKVersion();
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.widget.FrameLayout.LayoutParams getBannerLayoutParams(com.ironsource.mediationsdk.ISBannerSize r6) {
        /*
            r5 = this;
            com.ironsource.environment.ContextProvider r0 = com.ironsource.environment.ContextProvider.getInstance()
            android.content.Context r0 = r0.getApplicationContext()
            java.lang.String r6 = r6.getDescription()
            if (r6 == 0) goto L87
            int r1 = r6.hashCode()
            r2 = -387072689(0xffffffffe8edbd4f, float:-8.981544E24)
            if (r1 == r2) goto L6c
            r2 = 79011241(0x4b59da9, float:4.2697683E-36)
            r3 = 50
            r4 = 320(0x140, float:4.48E-43)
            if (r1 == r2) goto L3d
            r2 = 1951953708(0x7458732c, float:6.859571E31)
            if (r1 == r2) goto L26
            goto L87
        L26:
            java.lang.String r1 = "BANNER"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L2f
            goto L87
        L2f:
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            int r1 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r0, r4)
            int r0 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r0, r3)
            r6.<init>(r1, r0)
            goto L8d
        L3d:
            java.lang.String r1 = "SMART"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L46
            goto L87
        L46:
            boolean r6 = com.ironsource.mediationsdk.AdapterUtils.isLargeScreen(r0)
            if (r6 == 0) goto L5e
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r1 = 728(0x2d8, float:1.02E-42)
            int r1 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r0, r1)
            r2 = 90
            int r0 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r0, r2)
            r6.<init>(r1, r0)
            goto L8d
        L5e:
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            int r1 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r0, r4)
            int r0 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r0, r3)
            r6.<init>(r1, r0)
            goto L8d
        L6c:
            java.lang.String r1 = "RECTANGLE"
            boolean r6 = r6.equals(r1)
            if (r6 != 0) goto L75
            goto L87
        L75:
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r1 = 300(0x12c, float:4.2E-43)
            int r1 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r0, r1)
            r2 = 250(0xfa, float:3.5E-43)
            int r0 = com.ironsource.mediationsdk.AdapterUtils.dpToPixels(r0, r2)
            r6.<init>(r1, r0)
            goto L8d
        L87:
            android.widget.FrameLayout$LayoutParams r6 = new android.widget.FrameLayout$LayoutParams
            r0 = 0
            r6.<init>(r0, r0)
        L8d:
            r0 = 17
            r6.gravity = r0
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.adapters.pangle.PangleAdapter.getBannerLayoutParams(com.ironsource.mediationsdk.ISBannerSize):android.widget.FrameLayout$LayoutParams");
    }

    private final PAGBannerSize getBannerSize(ISBannerSize bannerSize) {
        String description = bannerSize.getDescription();
        if (description != null) {
            int iHashCode = description.hashCode();
            if (iHashCode != -387072689) {
                if (iHashCode != 79011241) {
                    if (iHashCode == 1951953708 && description.equals("BANNER")) {
                        PAGBannerSize BANNER_W_320_H_50 = PAGBannerSize.BANNER_W_320_H_50;
                        Intrinsics.checkNotNullExpressionValue(BANNER_W_320_H_50, "BANNER_W_320_H_50");
                        return BANNER_W_320_H_50;
                    }
                } else if (description.equals(l.f44065e)) {
                    PAGBannerSize pAGBannerSize = AdapterUtils.isLargeScreen(ContextProvider.getInstance().getApplicationContext()) ? PAGBannerSize.BANNER_W_728_H_90 : PAGBannerSize.BANNER_W_320_H_50;
                    Intrinsics.checkNotNullExpressionValue(pAGBannerSize, "if (AdapterUtils.isLarge…20_H_50\n                }");
                    return pAGBannerSize;
                }
            } else if (description.equals(l.f44063c)) {
                PAGBannerSize BANNER_W_300_H_250 = PAGBannerSize.BANNER_W_300_H_250;
                Intrinsics.checkNotNullExpressionValue(BANNER_W_300_H_250, "BANNER_W_300_H_250");
                return BANNER_W_300_H_250;
            }
        }
        return new PAGBannerSize(0, 0);
    }

    @NotNull
    public static final IntegrationData getIntegrationData(@Nullable Context context) {
        return INSTANCE.getIntegrationData(context);
    }

    private final String getMediationInfo() {
        JSONArray jSONArray = new JSONArray();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", MEDIATION_NAME_KEY);
            jSONObject.put("value", MEDIATION_NAME);
            jSONArray.put(jSONObject);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", ADAPTER_VERSION_KEY);
            jSONObject2.put("value", "5.3.0");
            jSONArray.put(jSONObject2);
            IronLog.INTERNAL.verbose("mediationInfo = " + jSONArray);
        } catch (JSONException e10) {
            IronLog.INTERNAL.error("Error while creating mediation info object - " + e10);
        }
        String string = jSONArray.toString();
        Intrinsics.checkNotNullExpressionValue(string, "mediationInfo.toString()");
        return string;
    }

    private final void initSdk(String appId) {
        if (mInitState == Companion.InitState.INIT_STATE_NONE || mInitState == Companion.InitState.INIT_STATE_IN_PROGRESS) {
            initCallbackListeners.add(this);
        }
        if (mWasInitCalled.compareAndSet(false, true)) {
            mInitState = Companion.InitState.INIT_STATE_IN_PROGRESS;
            IronLog.ADAPTER_API.verbose("appId = " + appId);
            if (isCoppaChildUser()) {
                initializationFailure(PANGLE_NOT_ALLOW_CHILD_ERROR_CODE, PANGLE_NOT_ALLOW_CHILD_ERROR_MSG);
                return;
            }
            final Context applicationContext = ContextProvider.getInstance().getApplicationContext();
            final PAGConfig pAGConfigBuild = mPAGConfigBuilder.appId(appId).setAdxId(LEVELPLAY_ADXID).setUserData(getMediationInfo()).debugLog(isAdaptersDebugEnabled()).supportMultiProcess(false).build();
            AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.pangle.b
                @Override // java.lang.Runnable
                public final void run() {
                    PangleAdapter.initSdk$lambda$0(applicationContext, pAGConfigBuild, this);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void initSdk$lambda$0(Context context, PAGConfig pAGConfig, final PangleAdapter this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        PAGSdk.init(context, pAGConfig, new PAGSdk.PAGInitCallback() { // from class: com.ironsource.adapters.pangle.PangleAdapter$initSdk$1$1
            @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
            public void fail(int code, @NotNull String message) {
                Intrinsics.checkNotNullParameter(message, "message");
                this.this$0.initializationFailure(code, message);
            }

            @Override // com.bytedance.sdk.openadsdk.api.init.PAGSdk.PAGInitCallback
            public void success() {
                this.this$0.initializationSuccess();
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializationFailure(int code, String message) {
        IronLog.ADAPTER_CALLBACK.verbose("error code = " + code + ", message = " + message);
        mInitState = Companion.InitState.INIT_STATE_FAILED;
        Iterator<INetworkInitCallbackListener> it = initCallbackListeners.iterator();
        while (it.hasNext()) {
            it.next().onNetworkInitCallbackFailed(message);
        }
        initCallbackListeners.clear();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initializationSuccess() {
        IronLog.ADAPTER_CALLBACK.verbose();
        mInitState = Companion.InitState.INIT_STATE_SUCCESS;
        for (INetworkInitCallbackListener initCallbackListeners2 : initCallbackListeners) {
            Intrinsics.checkNotNullExpressionValue(initCallbackListeners2, "initCallbackListeners");
            initCallbackListeners2.onNetworkInitCallbackSuccess();
        }
        initCallbackListeners.clear();
    }

    private final boolean isCoppaChildUser() {
        return mChildDirected == 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadBannerForBidding$lambda$13(ISBannerSize iSBannerSize, BannerSmashListener listener, String str, PAGBannerRequest bannerRequest, PangleBannerAdListener bannerAdListener) {
        Intrinsics.checkNotNullParameter(listener, "$listener");
        Intrinsics.checkNotNullParameter(bannerRequest, "$bannerRequest");
        Intrinsics.checkNotNullParameter(bannerAdListener, "$bannerAdListener");
        if (iSBannerSize != null) {
            PAGBannerAd.loadAd(str, bannerRequest, bannerAdListener);
        } else {
            IronLog.INTERNAL.error(BANNER_SIZE_IS_NULL_ERROR_MSG);
            listener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError(BANNER_SIZE_IS_NULL_ERROR_MSG));
        }
    }

    private final void loadInterstitialInternal(final String slotId, String serverData, InterstitialSmashListener listener) {
        setInterstitialAdAvailability$pangleadapter_release(slotId, false);
        if (isCoppaChildUser()) {
            IronLog.INTERNAL.error("Child user - Pangle_COPPA indicates the user is a child. Pangle SDK V71 or higher does not support child users.");
            listener.onInterstitialAdLoadFailed(new IronSourceError(PANGLE_NOT_ALLOW_CHILD_ERROR_CODE, "Child user - Pangle_COPPA indicates the user is a child. Pangle SDK V71 or higher does not support child users."));
            return;
        }
        final PangleInterstitialAdListener pangleInterstitialAdListener = new PangleInterstitialAdListener(listener, new WeakReference(this), slotId);
        this.mSlotIdToInterstitialAdListener.put(slotId, pangleInterstitialAdListener);
        final PAGInterstitialRequest pAGInterstitialRequest = new PAGInterstitialRequest();
        if (serverData != null) {
            pAGInterstitialRequest.setAdString(serverData);
        }
        AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.pangle.c
            @Override // java.lang.Runnable
            public final void run() {
                PangleAdapter.loadInterstitialInternal$lambda$10(slotId, pAGInterstitialRequest, pangleInterstitialAdListener);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadInterstitialInternal$lambda$10(String slotId, PAGInterstitialRequest request, PangleInterstitialAdListener interstitialAdListener) {
        Intrinsics.checkNotNullParameter(slotId, "$slotId");
        Intrinsics.checkNotNullParameter(request, "$request");
        Intrinsics.checkNotNullParameter(interstitialAdListener, "$interstitialAdListener");
        PAGInterstitialAd.loadAd(slotId, request, interstitialAdListener);
    }

    private final void loadRewardedVideoInternal(final String slotId, String serverData, RewardedVideoSmashListener listener) {
        IronLog.ADAPTER_API.verbose("slotId = " + slotId);
        setRewardedVideoAdAvailability$pangleadapter_release(slotId, false);
        if (isCoppaChildUser()) {
            IronLog.INTERNAL.error("Child user - Pangle_COPPA indicates the user is a child. Pangle SDK V71 or higher does not support child users.");
            listener.onRewardedVideoAvailabilityChanged(false);
            listener.onRewardedVideoLoadFailed(new IronSourceError(PANGLE_NOT_ALLOW_CHILD_ERROR_CODE, "Child user - Pangle_COPPA indicates the user is a child. Pangle SDK V71 or higher does not support child users."));
        } else {
            final PangleRewardedVideoAdListener pangleRewardedVideoAdListener = new PangleRewardedVideoAdListener(listener, new WeakReference(this), slotId);
            this.mSlotIdToRewardedVideoAdListener.put(slotId, pangleRewardedVideoAdListener);
            final PAGRewardedRequest pAGRewardedRequest = new PAGRewardedRequest();
            if (serverData != null) {
                pAGRewardedRequest.setAdString(serverData);
            }
            AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.pangle.f
                @Override // java.lang.Runnable
                public final void run() {
                    PangleAdapter.loadRewardedVideoInternal$lambda$7(slotId, pAGRewardedRequest, pangleRewardedVideoAdListener);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void loadRewardedVideoInternal$lambda$7(String slotId, PAGRewardedRequest request, PangleRewardedVideoAdListener rewardedVideoAdListener) {
        Intrinsics.checkNotNullParameter(slotId, "$slotId");
        Intrinsics.checkNotNullParameter(request, "$request");
        Intrinsics.checkNotNullParameter(rewardedVideoAdListener, "$rewardedVideoAdListener");
        PAGRewardedAd.loadAd(slotId, request, rewardedVideoAdListener);
    }

    private final void setCCPAValue(boolean doNotSell) {
        int i10;
        String str;
        if (doNotSell) {
            i10 = 0;
            str = "PAG_PA_CONSENT_TYPE_NO_CONSENT";
        } else {
            i10 = 1;
            str = "PAG_PA_CONSENT_TYPE_CONSENT";
        }
        IronLog.ADAPTER_API.verbose("ccpaValue = " + str);
        mPAGConfigBuilder.setPAConsent(i10);
    }

    private final void setCOPPAValue(String value) {
        String str;
        Integer intOrNull = StringsKt.toIntOrNull(value);
        if (intOrNull != null && intOrNull.intValue() == 1) {
            mChildDirected = 1;
            str = "PANGLE_CHILD_DIRECTED_TYPE_CHILD";
        } else if (intOrNull != null && intOrNull.intValue() == 0) {
            mChildDirected = 0;
            str = "PANGLE_CHILD_DIRECTED_TYPE_NON_CHILD";
        } else {
            mChildDirected = -1;
            str = "PANGLE_CHILD_DIRECTED_TYPE_DEFAULT";
        }
        IronLog.ADAPTER_API.verbose("coppaValue = " + str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showInterstitial$lambda$12$lambda$11(PAGInterstitialAd interstitialAd, Activity activity) {
        Intrinsics.checkNotNullParameter(interstitialAd, "$interstitialAd");
        interstitialAd.show(activity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void showRewardedVideo$lambda$9$lambda$8(PAGRewardedAd rewardedVideoAd, Activity activity) {
        Intrinsics.checkNotNullParameter(rewardedVideoAd, "$rewardedVideoAd");
        rewardedVideoAd.show(activity);
    }

    @NotNull
    public static final PangleAdapter startAdapter(@NotNull String str) {
        return INSTANCE.startAdapter(str);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void collectBannerBiddingData(@NotNull JSONObject config, @Nullable JSONObject adData, @NotNull BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        collectBiddingData(biddingDataCallback, config);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void collectInterstitialBiddingData(@NotNull JSONObject config, @Nullable JSONObject adData, @NotNull BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        collectBiddingData(biddingDataCallback, config);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void collectRewardedVideoBiddingData(@NotNull JSONObject config, @Nullable JSONObject adData, @NotNull BiddingDataCallback biddingDataCallback) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(biddingDataCallback, "biddingDataCallback");
        collectBiddingData(biddingDataCallback, config);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void destroyBanner(@Nullable JSONObject config) {
        final String strOptString = config != null ? config.optString(SLOT_ID_KEY) : null;
        IronLog ironLog = IronLog.ADAPTER_API;
        ironLog.verbose("slotId = " + strOptString);
        if (!this.mSlotIdToBannerView.containsKey(strOptString)) {
            ironLog.verbose("Banner is already destroyed");
        } else {
            if (strOptString == null || strOptString.length() == 0) {
                return;
            }
            AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.pangle.g
                @Override // java.lang.Runnable
                public final void run() {
                    PangleAdapter.destroyBanner$lambda$14(this.f42414b, strOptString);
                }
            });
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    @NotNull
    public String getCoreSDKVersion() {
        return INSTANCE.getAdapterSDKVersion();
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    @NotNull
    public String getVersion() {
        return "5.3.0";
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initAndLoadRewardedVideo(@Nullable String appKey, @Nullable String userId, @Nullable JSONObject config, @Nullable JSONObject adData, @NotNull RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        String strOptString = config != null ? config.optString(SLOT_ID_KEY) : null;
        String strOptString2 = config != null ? config.optString("appID") : null;
        if (strOptString == null || strOptString.length() == 0) {
            IronLog.INTERNAL.error("Missing param - slotID");
            listener.onRewardedVideoAvailabilityChanged(false);
            return;
        }
        if (strOptString2 == null || strOptString2.length() == 0) {
            IronLog.INTERNAL.error("Missing param - appID");
            listener.onRewardedVideoAvailabilityChanged(false);
            return;
        }
        IronLog.ADAPTER_API.verbose("slotId = " + strOptString);
        this.mSlotIdToRewardedVideoListener.put(strOptString, listener);
        int i10 = WhenMappings.$EnumSwitchMapping$0[mInitState.ordinal()];
        if (i10 == 1) {
            loadRewardedVideoInternal(strOptString, null, listener);
            return;
        }
        if (i10 != 2) {
            initSdk(strOptString2);
            return;
        }
        IronLog.INTERNAL.verbose("init failed - slotId = " + strOptString);
        listener.onRewardedVideoAvailabilityChanged(false);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void initBannerForBidding(@Nullable String appKey, @Nullable String userId, @Nullable JSONObject config, @NotNull BannerSmashListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        String strOptString = config != null ? config.optString(SLOT_ID_KEY) : null;
        String strOptString2 = config != null ? config.optString("appID") : null;
        if (strOptString == null || strOptString.length() == 0) {
            IronLog.INTERNAL.error("Missing param - slotID");
            listener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing params - slotID", "Banner"));
            return;
        }
        if (strOptString2 == null || strOptString2.length() == 0) {
            IronLog.INTERNAL.error("Missing param - appID");
            listener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Missing params - appID", "Banner"));
            return;
        }
        IronLog.ADAPTER_API.verbose("slotId = " + strOptString);
        this.mSlotIdToBannerListener.put(strOptString, listener);
        int i10 = WhenMappings.$EnumSwitchMapping$0[mInitState.ordinal()];
        if (i10 == 1) {
            listener.onBannerInitSuccess();
            return;
        }
        if (i10 != 2) {
            initSdk(strOptString2);
            return;
        }
        IronLog.INTERNAL.verbose("init failed - slotId = " + strOptString);
        listener.onBannerInitFailed(ErrorBuilder.buildInitFailedError("Pangle SDK init failed", "Banner"));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitial(@Nullable String appKey, @Nullable String userId, @Nullable JSONObject config, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        String strOptString = config != null ? config.optString(SLOT_ID_KEY) : null;
        String strOptString2 = config != null ? config.optString("appID") : null;
        if (strOptString == null || strOptString.length() == 0) {
            IronLog.INTERNAL.error("Missing param - slotID");
            listener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing params - slotID", "Interstitial"));
            return;
        }
        if (strOptString2 == null || strOptString2.length() == 0) {
            IronLog.INTERNAL.error("Missing param - appID");
            listener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Missing params - appID", "Interstitial"));
            return;
        }
        IronLog.ADAPTER_API.verbose("slotId = " + strOptString);
        this.mSlotIdToInterstitialListener.put(strOptString, listener);
        int i10 = WhenMappings.$EnumSwitchMapping$0[mInitState.ordinal()];
        if (i10 == 1) {
            listener.onInterstitialInitSuccess();
            return;
        }
        if (i10 != 2) {
            initSdk(strOptString2);
            return;
        }
        IronLog.INTERNAL.verbose("init failed - slotId = " + strOptString);
        listener.onInterstitialInitFailed(ErrorBuilder.buildInitFailedError("Pangle SDK init failed", "Interstitial"));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void initInterstitialForBidding(@Nullable String appKey, @Nullable String userId, @Nullable JSONObject config, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        IronLog.INTERNAL.verbose();
        initInterstitial(appKey, userId, config, listener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void initRewardedVideoWithCallback(@Nullable String appKey, @Nullable String userId, @Nullable JSONObject config, @NotNull RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        String strOptString = config != null ? config.optString(SLOT_ID_KEY) : null;
        String strOptString2 = config != null ? config.optString("appID") : null;
        if (strOptString == null || strOptString.length() == 0) {
            IronLog.INTERNAL.error("Missing param - slotID");
            listener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing params - slotID", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        if (strOptString2 == null || strOptString2.length() == 0) {
            IronLog.INTERNAL.error("Missing param - appID");
            listener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Missing params - appID", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            return;
        }
        IronLog.ADAPTER_API.verbose("slotId = " + strOptString);
        this.mSlotIdToRewardedVideoListener.put(strOptString, listener);
        this.mRewardedVideoSlotIdsForInitCallbacks.add(strOptString);
        int i10 = WhenMappings.$EnumSwitchMapping$0[mInitState.ordinal()];
        if (i10 == 1) {
            listener.onRewardedVideoInitSuccess();
            return;
        }
        if (i10 != 2) {
            initSdk(strOptString2);
            return;
        }
        IronLog.INTERNAL.verbose("init failed - slotId = " + strOptString);
        listener.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError("Pangle SDK init failed", IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public boolean isInterstitialReady(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        String strOptString = config.optString(SLOT_ID_KEY);
        return strOptString != null && strOptString.length() != 0 && this.mSlotIdToInterstitialAd.containsKey(strOptString) && this.mSlotIdToInterstitialAdAvailability.containsKey(strOptString) && Intrinsics.areEqual(this.mSlotIdToInterstitialAdAvailability.get(strOptString), Boolean.TRUE);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public boolean isRewardedVideoAvailable(@NotNull JSONObject config) {
        Intrinsics.checkNotNullParameter(config, "config");
        String strOptString = config.optString(SLOT_ID_KEY);
        return strOptString != null && strOptString.length() != 0 && this.mSlotIdToRewardedVideoAd.containsKey(strOptString) && this.mSlotIdToRewardedVideoAdAvailability.containsKey(strOptString) && Intrinsics.areEqual(this.mSlotIdToRewardedVideoAdAvailability.get(strOptString), Boolean.TRUE);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    public boolean isUsingActivityBeforeImpression(@NotNull LevelPlay.AdFormat adFormat) {
        Intrinsics.checkNotNullParameter(adFormat, "adFormat");
        return false;
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.BannerAdapterInterface
    public void loadBannerForBidding(@NotNull JSONObject config, @Nullable JSONObject adData, @Nullable String serverData, @Nullable final ISBannerSize bannerSize, @NotNull final BannerSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        final String slotId = config.optString(SLOT_ID_KEY);
        IronLog.ADAPTER_API.verbose("slotId = " + slotId);
        if (bannerSize == null) {
            IronLog.INTERNAL.error(BANNER_SIZE_IS_NULL_ERROR_MSG);
            listener.onBannerAdLoadFailed(ErrorBuilder.buildLoadFailedError(BANNER_SIZE_IS_NULL_ERROR_MSG));
            return;
        }
        if (isCoppaChildUser()) {
            IronLog.INTERNAL.error("Child user - Pangle_COPPA indicates the user is a child. Pangle SDK V71 or higher does not support child users.");
            listener.onBannerAdLoadFailed(new IronSourceError(PANGLE_NOT_ALLOW_CHILD_ERROR_CODE, "Child user - Pangle_COPPA indicates the user is a child. Pangle SDK V71 or higher does not support child users."));
            return;
        }
        FrameLayout.LayoutParams bannerLayoutParams = getBannerLayoutParams(bannerSize);
        WeakReference weakReference = new WeakReference(this);
        Intrinsics.checkNotNullExpressionValue(slotId, "slotId");
        final PangleBannerAdListener pangleBannerAdListener = new PangleBannerAdListener(listener, weakReference, slotId, bannerLayoutParams);
        this.mSlotIdToBannerAdListener.put(slotId, pangleBannerAdListener);
        final PAGBannerRequest pAGBannerRequest = new PAGBannerRequest(getBannerSize(bannerSize));
        pAGBannerRequest.setAdString(serverData);
        AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.pangle.h
            @Override // java.lang.Runnable
            public final void run() {
                PangleAdapter.loadBannerForBidding$lambda$13(bannerSize, listener, slotId, pAGBannerRequest, pangleBannerAdListener);
            }
        });
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitial(@NotNull JSONObject config, @Nullable JSONObject adData, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String slotId = config.optString(SLOT_ID_KEY);
        IronLog.ADAPTER_API.verbose("slotId = " + slotId);
        Intrinsics.checkNotNullExpressionValue(slotId, "slotId");
        loadInterstitialInternal(slotId, null, listener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void loadInterstitialForBidding(@NotNull JSONObject config, @Nullable JSONObject adData, @Nullable String serverData, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String slotId = config.optString(SLOT_ID_KEY);
        IronLog.ADAPTER_API.verbose("slotId = " + slotId);
        Intrinsics.checkNotNullExpressionValue(slotId, "slotId");
        loadInterstitialInternal(slotId, serverData, listener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideo(@NotNull JSONObject config, @Nullable JSONObject adData, @NotNull RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String slotId = config.optString(SLOT_ID_KEY);
        Intrinsics.checkNotNullExpressionValue(slotId, "slotId");
        loadRewardedVideoInternal(slotId, null, listener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void loadRewardedVideoForBidding(@NotNull JSONObject config, @Nullable JSONObject adData, @Nullable String serverData, @NotNull RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String slotId = config.optString(SLOT_ID_KEY);
        Intrinsics.checkNotNullExpressionValue(slotId, "slotId");
        loadRewardedVideoInternal(slotId, serverData, listener);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackFailed(@NotNull String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        for (Map.Entry<String, RewardedVideoSmashListener> entry : this.mSlotIdToRewardedVideoListener.entrySet()) {
            String key = entry.getKey();
            RewardedVideoSmashListener value = entry.getValue();
            if (this.mRewardedVideoSlotIdsForInitCallbacks.contains(key)) {
                value.onRewardedVideoInitFailed(ErrorBuilder.buildInitFailedError(error, IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
            } else {
                value.onRewardedVideoAvailabilityChanged(false);
            }
        }
        Iterator<Map.Entry<String, InterstitialSmashListener>> it = this.mSlotIdToInterstitialListener.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onInterstitialInitFailed(ErrorBuilder.buildInitFailedError(error, "Interstitial"));
        }
        Iterator<Map.Entry<String, BannerSmashListener>> it2 = this.mSlotIdToBannerListener.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().onBannerInitFailed(ErrorBuilder.buildInitFailedError(error, "Banner"));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.INetworkInitCallbackListener
    public void onNetworkInitCallbackSuccess() {
        for (Map.Entry<String, RewardedVideoSmashListener> entry : this.mSlotIdToRewardedVideoListener.entrySet()) {
            String key = entry.getKey();
            RewardedVideoSmashListener value = entry.getValue();
            if (this.mRewardedVideoSlotIdsForInitCallbacks.contains(key)) {
                value.onRewardedVideoInitSuccess();
            } else {
                loadRewardedVideoInternal(key, null, value);
            }
        }
        Iterator<Map.Entry<String, InterstitialSmashListener>> it = this.mSlotIdToInterstitialListener.entrySet().iterator();
        while (it.hasNext()) {
            it.next().getValue().onInterstitialInitSuccess();
        }
        Iterator<Map.Entry<String, BannerSmashListener>> it2 = this.mSlotIdToBannerListener.entrySet().iterator();
        while (it2.hasNext()) {
            it2.next().getValue().onBannerInitSuccess();
        }
    }

    public final void setBannerAd$pangleadapter_release(@NotNull String slotId, @Nullable PAGBannerAd bannerAd) {
        Intrinsics.checkNotNullParameter(slotId, "slotId");
        if (bannerAd != null) {
            this.mSlotIdToBannerView.put(slotId, bannerAd);
            bannerAd.setAdInteractionListener(this.mSlotIdToBannerAdListener.get(slotId));
        }
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter
    protected void setConsent(boolean consent) {
        int i10;
        String str;
        if (consent) {
            i10 = 1;
            str = "PAG_GDPR_CONSENT_TYPE_CONSENT";
        } else {
            i10 = 0;
            str = "PAG_GDPR_CONSENT_TYPE_NO_CONSENT";
        }
        IronLog.ADAPTER_API.verbose("consent = " + str);
        mPAGConfigBuilder.setGDPRConsent(i10);
    }

    public final void setInterstitialAd$pangleadapter_release(@NotNull String slotId, @Nullable PAGInterstitialAd interstitialAd) {
        Intrinsics.checkNotNullParameter(slotId, "slotId");
        if (interstitialAd != null) {
            this.mSlotIdToInterstitialAd.put(slotId, interstitialAd);
        }
    }

    public final void setInterstitialAdAvailability$pangleadapter_release(@NotNull String slotId, boolean isAvailable) {
        Intrinsics.checkNotNullParameter(slotId, "slotId");
        this.mSlotIdToInterstitialAdAvailability.put(slotId, Boolean.valueOf(isAvailable));
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
        } else if (MetaDataUtils.isValidMetaData(key, META_DATA_PANGLE_COPPA_KEY, str)) {
            setCOPPAValue(str);
        }
    }

    public final void setRewardedVideoAd$pangleadapter_release(@NotNull String slotId, @Nullable PAGRewardedAd rewardedVideoAd) {
        Intrinsics.checkNotNullParameter(slotId, "slotId");
        if (rewardedVideoAd != null) {
            this.mSlotIdToRewardedVideoAd.put(slotId, rewardedVideoAd);
        }
    }

    public final void setRewardedVideoAdAvailability$pangleadapter_release(@NotNull String slotId, boolean isAvailable) {
        Intrinsics.checkNotNullParameter(slotId, "slotId");
        this.mSlotIdToRewardedVideoAdAvailability.put(slotId, Boolean.valueOf(isAvailable));
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.InterstitialAdapterInterface
    public void showInterstitial(@NotNull JSONObject config, @NotNull InterstitialSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String slotId = config.optString(SLOT_ID_KEY);
        IronLog.ADAPTER_API.verbose("slotId = " + slotId);
        if (isCoppaChildUser()) {
            IronLog.INTERNAL.error("Child user - Pangle_COPPA indicates the user is a child. Pangle SDK V71 or higher does not support child users.");
            listener.onInterstitialAdShowFailed(new IronSourceError(PANGLE_NOT_ALLOW_CHILD_ERROR_CODE, "Child user - Pangle_COPPA indicates the user is a child. Pangle SDK V71 or higher does not support child users."));
            return;
        }
        if (isInterstitialReady(config)) {
            final Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
            final PAGInterstitialAd pAGInterstitialAd = this.mSlotIdToInterstitialAd.get(slotId);
            if (pAGInterstitialAd != null) {
                pAGInterstitialAd.setAdInteractionListener(this.mSlotIdToInterstitialAdListener.get(slotId));
                AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.pangle.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        PangleAdapter.showInterstitial$lambda$12$lambda$11(pAGInterstitialAd, currentActiveActivity);
                    }
                });
            }
        } else {
            listener.onInterstitialAdShowFailed(ErrorBuilder.buildNoAdsToShowError("Interstitial"));
        }
        Intrinsics.checkNotNullExpressionValue(slotId, "slotId");
        setInterstitialAdAvailability$pangleadapter_release(slotId, false);
    }

    @Override // com.ironsource.mediationsdk.AbstractAdapter, com.ironsource.mediationsdk.sdk.RewardedVideoAdapterInterface
    public void showRewardedVideo(@NotNull JSONObject config, @NotNull RewardedVideoSmashListener listener) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(listener, "listener");
        String slotId = config.optString(SLOT_ID_KEY);
        IronLog.ADAPTER_API.verbose("slotId = " + slotId);
        if (isCoppaChildUser()) {
            IronLog.INTERNAL.error("Child user - Pangle_COPPA indicates the user is a child. Pangle SDK V71 or higher does not support child users.");
            listener.onRewardedVideoAdShowFailed(new IronSourceError(PANGLE_NOT_ALLOW_CHILD_ERROR_CODE, "Child user - Pangle_COPPA indicates the user is a child. Pangle SDK V71 or higher does not support child users."));
            return;
        }
        if (isRewardedVideoAvailable(config)) {
            final Activity currentActiveActivity = ContextProvider.getInstance().getCurrentActiveActivity();
            final PAGRewardedAd pAGRewardedAd = this.mSlotIdToRewardedVideoAd.get(slotId);
            if (pAGRewardedAd != null) {
                pAGRewardedAd.setAdInteractionListener(this.mSlotIdToRewardedVideoAdListener.get(slotId));
                AbstractAdapter.postOnUIThread(new Runnable() { // from class: com.ironsource.adapters.pangle.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        PangleAdapter.showRewardedVideo$lambda$9$lambda$8(pAGRewardedAd, currentActiveActivity);
                    }
                });
            }
        } else {
            listener.onRewardedVideoAdShowFailed(ErrorBuilder.buildNoAdsToShowError(IronSourceConstants.REWARDED_VIDEO_AD_UNIT));
        }
        Intrinsics.checkNotNullExpressionValue(slotId, "slotId");
        setRewardedVideoAdAvailability$pangleadapter_release(slotId, false);
    }
}
