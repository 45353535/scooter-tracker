package com.unity3d.ads.adplayer;

import android.content.Context;
import android.content.Intent;
import com.ironsource.C4329g8;
import com.ironsource.C4424m2;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.f.y;
import com.unity3d.ads.adplayer.DisplayMessage;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import com.unity3d.ads.core.data.manager.OfferwallManager;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.OfferwallShowEvent;
import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.ads.core.data.model.SessionChange;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.ads.core.data.repository.OrientationRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.ads.core.extensions.ProtobufExtensionsKt;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.vungle.ads.internal.protos.Sdk;
import eg.p;
import eg.r;
import hg.c0;
import hg.g0;
import java.util.Map;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.d0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.z;
import lf.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 |2\u00020\u00012\u00020\u0002:\u0001|Bg\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u001b\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0082@ø\u0001\u0000¢\u0006\u0004\b \u0010!J\u001b\u0010#\u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\"H\u0082@ø\u0001\u0000¢\u0006\u0004\b#\u0010$J\u0017\u0010(\u001a\u00020'2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u001fH\u0096\u0001¢\u0006\u0004\b*\u0010+J\u001b\u0010.\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020,H\u0096Aø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u001b\u00101\u001a\u00020\u001f2\u0006\u00100\u001a\u00020\u0005H\u0096Aø\u0001\u0000¢\u0006\u0004\b1\u00102J+\u00106\u001a\u00020\u001f2\u0016\u00105\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u000104\u0018\u000103H\u0096Aø\u0001\u0000¢\u0006\u0004\b6\u00107J\u0013\u00108\u001a\u00020\u001fH\u0096Aø\u0001\u0000¢\u0006\u0004\b8\u00109J\u001b\u0010<\u001a\u00020\u001f2\u0006\u0010;\u001a\u00020:H\u0096Aø\u0001\u0000¢\u0006\u0004\b<\u0010=J\u001b\u0010?\u001a\u00020\u001f2\u0006\u00100\u001a\u00020>H\u0096Aø\u0001\u0000¢\u0006\u0004\b?\u0010@J\u001b\u0010B\u001a\u00020\u001f2\u0006\u0010A\u001a\u00020:H\u0096Aø\u0001\u0000¢\u0006\u0004\bB\u0010=J\u001b\u0010D\u001a\u00020\u001f2\u0006\u00100\u001a\u00020CH\u0096Aø\u0001\u0000¢\u0006\u0004\bD\u0010EJ\u001b\u0010F\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020,H\u0096Aø\u0001\u0000¢\u0006\u0004\bF\u0010/J\u001b\u0010H\u001a\u00020\u001f2\u0006\u00100\u001a\u00020GH\u0096Aø\u0001\u0000¢\u0006\u0004\bH\u0010IJ\u001b\u0010J\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020,H\u0096Aø\u0001\u0000¢\u0006\u0004\bJ\u0010/J\u001b\u0010L\u001a\u00020\u001f2\u0006\u0010K\u001a\u00020:H\u0096Aø\u0001\u0000¢\u0006\u0004\bL\u0010=J\u001b\u0010O\u001a\u00020\u001f2\u0006\u0010N\u001a\u00020MH\u0096Aø\u0001\u0000¢\u0006\u0004\bO\u0010PJ\u0017\u0010S\u001a\u00020\u001f2\u0006\u0010R\u001a\u00020QH\u0016¢\u0006\u0004\bS\u0010TJ\u0013\u0010U\u001a\u00020\u001fH\u0096@ø\u0001\u0000¢\u0006\u0004\bU\u00109R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010VR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010WR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010X\u001a\u0004\bY\u0010ZR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010[R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\\R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010]R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010^R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010_R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010`R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010aR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010bR\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010cR\u001d\u0010i\u001a\u0004\u0018\u00010d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\be\u0010f\u001a\u0004\bg\u0010hR\u001a\u0010n\u001a\b\u0012\u0004\u0012\u00020k0j8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bl\u0010mR\u001a\u0010q\u001a\b\u0012\u0004\u0012\u00020o0j8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bp\u0010mR\u001a\u0010t\u001a\b\u0012\u0004\u0012\u00020r0j8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bs\u0010mR\u001a\u0010w\u001a\b\u0012\u0004\u0012\u00020u0j8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bv\u0010mR\u0014\u0010{\u001a\u00020x8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\by\u0010z\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006}"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidFullscreenWebViewAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "Lcom/unity3d/ads/adplayer/FullscreenAdPlayer;", "Lcom/unity3d/ads/adplayer/WebViewAdPlayer;", "webViewAdPlayer", "", "opportunityId", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "webViewContainer", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "openMeasurementRepository", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "scarManager", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "offerwallManager", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "adRepository", "Lcom/unity3d/ads/core/data/repository/OrientationRepository;", "orientationRepository", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "<init>", "(Lcom/unity3d/ads/adplayer/WebViewAdPlayer;Ljava/lang/String;Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;Lcom/unity3d/ads/core/data/manager/ScarManager;Lcom/unity3d/ads/core/data/manager/OfferwallManager;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/data/repository/OrientationRepository;Landroid/content/Context;)V", "Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;", "change", "", "handleVolumeSettingsChange", "(Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/model/SessionChange;", "handleSessionChange", "(Lcom/unity3d/ads/core/data/model/SessionChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "displayMessage", "Lkotlinx/coroutines/Job;", "displayEventsRouter", "(Lcom/unity3d/ads/adplayer/DisplayMessage;)Lkotlinx/coroutines/Job;", "dispatchShowCompleted", "()V", "", "value", "onAllowedPiiChange", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "event", "onBroadcastEvent", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "unityAdsShowOptions", "requestShow", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendActivityDestroyed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isFocused", "sendFocusChange", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/unity3d/scar/adapter/common/c;", "sendGmaEvent", "(Lcom/unity3d/scar/adapter/common/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isMuted", "sendMuteChange", "Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "sendOfferwallEvent", "(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendPrivacyFsmChange", "Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;", "sendScarBannerEvent", "(Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendUserConsentChange", C4329g8.f43166k, "sendVisibilityChange", "", "volume", "sendVolumeChange", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/ShowOptions;", "showOptions", C4424m2.f43623v, "(Lcom/unity3d/ads/adplayer/ShowOptions;)V", "destroy", "Lcom/unity3d/ads/adplayer/WebViewAdPlayer;", "Ljava/lang/String;", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "Lcom/unity3d/ads/core/data/repository/OrientationRepository;", "Landroid/content/Context;", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject$delegate", "Lkotlin/Lazy;", "getAdObject", "()Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "getOnLoadEvent", "()Lkotlinx/coroutines/flow/Flow;", "onLoadEvent", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;", "getOnOfferwallEvent", "onOfferwallEvent", "Lcom/unity3d/ads/core/data/model/ScarEvent;", "getOnScarEvent", "onScarEvent", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "getOnShowEvent", "onShowEvent", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope", y.f66058y, "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidFullscreenWebViewAdPlayer implements AdPlayer, FullscreenAdPlayer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private static final MutableSharedFlow displayMessages = c0.b(0, 0, null, 7, null);

    /* JADX INFO: renamed from: adObject$delegate, reason: from kotlin metadata */
    @NotNull
    private final Lazy adObject;

    @NotNull
    private final AdRepository adRepository;

    @NotNull
    private final Context context;

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final OfferwallManager offerwallManager;

    @NotNull
    private final OpenMeasurementRepository openMeasurementRepository;

    @NotNull
    private final String opportunityId;

    @NotNull
    private final OrientationRepository orientationRepository;

    @NotNull
    private final ScarManager scarManager;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final WebViewAdPlayer webViewAdPlayer;

    @NotNull
    private final AndroidWebViewContainer webViewContainer;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidFullscreenWebViewAdPlayer$Companion;", "", "()V", "displayMessages", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/unity3d/ads/adplayer/DisplayMessage;", "getDisplayMessages", "()Lkotlinx/coroutines/flow/MutableSharedFlow;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final MutableSharedFlow getDisplayMessages() {
            return AndroidFullscreenWebViewAdPlayer.displayMessages;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {185, 190, 194, 196}, m = "destroy")
    static final class AnonymousClass1 extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return AndroidFullscreenWebViewAdPlayer.this.destroy(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$displayEventsRouter$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {202, 203, 204, 205, 206, 208}, m = "invokeSuspend")
    static final class C47341 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ DisplayMessage $displayMessage;
        int label;
        final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47341(DisplayMessage displayMessage, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, Continuation continuation) {
            super(2, continuation);
            this.$displayMessage = displayMessage;
            this.this$0 = androidFullscreenWebViewAdPlayer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new C47341(this.$displayMessage, this.this$0, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
        
            if (r5.requestShow(r1, r4) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:15:0x005e, code lost:
        
            if (r5.emit(r1, r4) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x007a, code lost:
        
            if (r5.sendVisibilityChange(r1, r4) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0096, code lost:
        
            if (r5.sendFocusChange(r1, r4) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00aa, code lost:
        
            if (r5.sendActivityDestroyed(r4) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:35:0x00ba, code lost:
        
            if (r5.destroy(r4) == r0) goto L36;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00bc, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r5) {
            /*
                Method dump skipped, instruction units count: 210
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.C47341.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((C47341) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/adplayer/DisplayMessage;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
    static final class C47351 extends k implements Function2<FlowCollector, Continuation, Object> {
        final /* synthetic */ p $listenerStarted;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47351(p pVar, Continuation continuation) {
            super(2, continuation);
            this.$listenerStarted = pVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new C47351(this.$listenerStarted, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            p pVar = this.$listenerStarted;
            Unit unit = Unit.f93236a;
            pVar.s(unit);
            return unit;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Continuation continuation) {
            return ((C47351) create(flowCollector, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {144, 148}, m = "invokeSuspend")
    static final class AnonymousClass10 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ SharedFlow $scarEvents;
        final /* synthetic */ ShowOptions $showOptions;
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/data/model/ScarEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {143}, m = "invokeSuspend")
        static final class AnonymousClass1 extends k implements Function2<FlowCollector, Continuation, Object> {
            final /* synthetic */ ShowOptions $showOptions;
            int label;
            final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, Continuation continuation) {
                super(2, continuation);
                this.this$0 = androidFullscreenWebViewAdPlayer;
                this.$showOptions = showOptions;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                return new AnonymousClass1(this.this$0, this.$showOptions, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = pf.b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    MutableSharedFlow displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                    DisplayMessage.DisplayReady displayReady = new DisplayMessage.DisplayReady(this.this$0.opportunityId, ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions());
                    this.label = 1;
                    if (displayMessages.emit(displayReady, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                }
                return Unit.f93236a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Continuation continuation) {
                return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/data/model/ScarEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
        static final class AnonymousClass2 extends k implements Function2<ScarEvent, Continuation, Object> {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull ScarEvent scarEvent, @Nullable Continuation continuation) {
                return ((AnonymousClass2) create(scarEvent, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                pf.b.g();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(Intrinsics.areEqual((ScarEvent) this.L$0, ScarEvent.Show.INSTANCE));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$4, reason: invalid class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* synthetic */ class AnonymousClass4 implements FlowCollector, v {
            final /* synthetic */ WebViewAdPlayer $tmp0;

            AnonymousClass4(WebViewAdPlayer webViewAdPlayer) {
                this.$tmp0 = webViewAdPlayer;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            public final Object emit(@NotNull com.unity3d.scar.adapter.common.c cVar, @NotNull Continuation continuation) {
                Object objSendGmaEvent = this.$tmp0.sendGmaEvent(cVar, continuation);
                return objSendGmaEvent == pf.b.g() ? objSendGmaEvent : Unit.f93236a;
            }

            public final boolean equals(@Nullable Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof v)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((v) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.v
            @NotNull
            public final lf.e getFunctionDelegate() {
                return new kotlin.jvm.internal.y(2, this.$tmp0, WebViewAdPlayer.class, "sendGmaEvent", "sendGmaEvent(Lcom/unity3d/scar/adapter/common/GMAEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass10(SharedFlow sharedFlow, ShowOptions showOptions, Continuation continuation) {
            super(2, continuation);
            this.$scarEvents = sharedFlow;
            this.$showOptions = showOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return AndroidFullscreenWebViewAdPlayer.this.new AnonymousClass10(this.$scarEvents, this.$showOptions, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005b, code lost:
        
            if (r1.collect(r3, r7) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.d.b(r8)
                goto L5e
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                kotlin.d.b(r8)
                goto L43
            L1e:
                kotlin.d.b(r8)
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this
                kotlinx.coroutines.flow.Flow r8 = r8.getOnScarEvent()
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$1 r1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$1
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r4 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this
                com.unity3d.ads.adplayer.ShowOptions r5 = r7.$showOptions
                r6 = 0
                r1.<init>(r4, r5, r6)
                kotlinx.coroutines.flow.Flow r8 = hg.i.L(r8, r1)
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$2 r1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$2
                r1.<init>(r6)
                r7.label = r3
                java.lang.Object r8 = hg.i.y(r8, r1, r7)
                if (r8 != r0) goto L43
                goto L5d
            L43:
                kotlinx.coroutines.flow.SharedFlow r8 = r7.$scarEvents
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$invokeSuspend$$inlined$mapNotNull$1 r1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$invokeSuspend$$inlined$mapNotNull$1
                r1.<init>()
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this
                com.unity3d.ads.adplayer.WebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getWebViewAdPlayer$p(r8)
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$4 r3 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$10$4
                r3.<init>(r8)
                r7.label = r2
                java.lang.Object r8 = r1.collect(r3, r7)
                if (r8 != r0) goto L5e
            L5d:
                return r0
            L5e:
                kotlin.Unit r8 = kotlin.Unit.f93236a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.AnonymousClass10.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass10) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {157, 162}, m = "invokeSuspend")
    static final class AnonymousClass11 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ ShowOptions $showOptions;
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {156}, m = "invokeSuspend")
        static final class AnonymousClass1 extends k implements Function2<FlowCollector, Continuation, Object> {
            final /* synthetic */ ShowOptions $showOptions;
            int label;
            final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, ShowOptions showOptions, Continuation continuation) {
                super(2, continuation);
                this.this$0 = androidFullscreenWebViewAdPlayer;
                this.$showOptions = showOptions;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                return new AnonymousClass1(this.this$0, this.$showOptions, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = pf.b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    MutableSharedFlow displayMessages = AndroidFullscreenWebViewAdPlayer.INSTANCE.getDisplayMessages();
                    DisplayMessage.DisplayReady displayReady = new DisplayMessage.DisplayReady(this.this$0.opportunityId, ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions());
                    this.label = 1;
                    if (displayMessages.emit(displayReady, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                }
                return Unit.f93236a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Continuation continuation) {
                return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
        static final class AnonymousClass2 extends k implements Function2<OfferwallShowEvent, Continuation, Object> {
            /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull OfferwallShowEvent offerwallShowEvent, @Nullable Continuation continuation) {
                return ((AnonymousClass2) create(offerwallShowEvent, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                pf.b.g();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(Intrinsics.areEqual((OfferwallShowEvent) this.L$0, OfferwallShowEvent.Show.INSTANCE));
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$4, reason: invalid class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        /* synthetic */ class AnonymousClass4 implements FlowCollector, v {
            final /* synthetic */ WebViewAdPlayer $tmp0;

            AnonymousClass4(WebViewAdPlayer webViewAdPlayer) {
                this.$tmp0 = webViewAdPlayer;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            @Nullable
            public final Object emit(@NotNull OfferwallEvent offerwallEvent, @NotNull Continuation continuation) {
                Object objSendOfferwallEvent = this.$tmp0.sendOfferwallEvent(offerwallEvent, continuation);
                return objSendOfferwallEvent == pf.b.g() ? objSendOfferwallEvent : Unit.f93236a;
            }

            public final boolean equals(@Nullable Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof v)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((v) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.v
            @NotNull
            public final lf.e getFunctionDelegate() {
                return new kotlin.jvm.internal.y(2, this.$tmp0, WebViewAdPlayer.class, "sendOfferwallEvent", "sendOfferwallEvent(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass11(ShowOptions showOptions, Continuation continuation) {
            super(2, continuation);
            this.$showOptions = showOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return AndroidFullscreenWebViewAdPlayer.this.new AnonymousClass11(this.$showOptions, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0080, code lost:
        
            if (r1.collect(r3, r7) == r0) goto L18;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r7.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.d.b(r8)
                goto L83
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                kotlin.d.b(r8)
                goto L43
            L1e:
                kotlin.d.b(r8)
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this
                kotlinx.coroutines.flow.Flow r8 = r8.getOnOfferwallEvent()
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$1 r1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$1
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r4 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this
                com.unity3d.ads.adplayer.ShowOptions r5 = r7.$showOptions
                r6 = 0
                r1.<init>(r4, r5, r6)
                kotlinx.coroutines.flow.Flow r8 = hg.i.L(r8, r1)
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$2 r1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$2
                r1.<init>(r6)
                r7.label = r3
                java.lang.Object r8 = hg.i.y(r8, r1, r7)
                if (r8 != r0) goto L43
                goto L82
            L43:
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this
                com.unity3d.ads.core.data.manager.OfferwallManager r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getOfferwallManager$p(r8)
                com.unity3d.ads.adplayer.ShowOptions r1 = r7.$showOptions
                com.unity3d.ads.adplayer.AndroidShowOptions r1 = (com.unity3d.ads.adplayer.AndroidShowOptions) r1
                java.lang.String r1 = r1.getOfferwallPlacementName()
                if (r1 != 0) goto L55
                java.lang.String r1 = ""
            L55:
                kotlinx.coroutines.flow.Flow r8 = r8.showAd(r1)
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r1 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this
                kotlinx.coroutines.CoroutineScope r1 = r1.getScope()
                hg.g0$a r3 = hg.g0.f73226a
                hg.g0 r3 = r3.c()
                r4 = 5
                kotlinx.coroutines.flow.SharedFlow r8 = hg.i.R(r8, r1, r3, r4)
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$invokeSuspend$$inlined$mapNotNull$1 r1 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$invokeSuspend$$inlined$mapNotNull$1
                r1.<init>()
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.this
                com.unity3d.ads.adplayer.WebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getWebViewAdPlayer$p(r8)
                com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$4 r3 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$11$4
                r3.<init>(r8)
                r7.label = r2
                java.lang.Object r8 = r1.collect(r3, r7)
                if (r8 != r0) goto L83
            L82:
                return r0
            L83:
                kotlin.Unit r8 = kotlin.Unit.f93236a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.AnonymousClass11.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass11) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$3, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class AnonymousClass3 extends kotlin.jvm.internal.a implements Function2<DisplayMessage, Continuation, Object> {
        AnonymousClass3(Object obj) {
            super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "displayEventsRouter", "displayEventsRouter(Lcom/unity3d/ads/adplayer/DisplayMessage;)Lkotlinx/coroutines/Job;", 12);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull DisplayMessage displayMessage, @NotNull Continuation continuation) {
            return AndroidFullscreenWebViewAdPlayer.show$displayEventsRouter((AndroidFullscreenWebViewAdPlayer) this.receiver, displayMessage, continuation);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$4, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class AnonymousClass4 extends kotlin.jvm.internal.y implements Function2<VolumeSettingsChange, Continuation, Object> {
        AnonymousClass4(Object obj) {
            super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "handleVolumeSettingsChange", "handleVolumeSettingsChange(Lcom/unity3d/ads/core/data/datasource/VolumeSettingsChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull VolumeSettingsChange volumeSettingsChange, @NotNull Continuation continuation) {
            return ((AndroidFullscreenWebViewAdPlayer) this.receiver).handleVolumeSettingsChange(volumeSettingsChange, continuation);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/data/model/ShowEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$6", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {99}, m = "invokeSuspend")
    static final class AnonymousClass6 extends k implements Function2<ShowEvent, Continuation, Object> {
        int label;

        AnonymousClass6(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return AndroidFullscreenWebViewAdPlayer.this.new AnonymousClass6(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ShowEvent showEvent, @Nullable Continuation continuation) {
            return ((AnonymousClass6) create(showEvent, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = AndroidFullscreenWebViewAdPlayer.this;
                this.label = 1;
                if (androidFullscreenWebViewAdPlayer.destroy(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$7, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class AnonymousClass7 extends kotlin.jvm.internal.y implements Function2<SessionChange, Continuation, Object> {
        AnonymousClass7(Object obj) {
            super(2, obj, AndroidFullscreenWebViewAdPlayer.class, "handleSessionChange", "handleSessionChange(Lcom/unity3d/ads/core/data/model/SessionChange;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull SessionChange sessionChange, @NotNull Continuation continuation) {
            return ((AndroidFullscreenWebViewAdPlayer) this.receiver).handleSessionChange(sessionChange, continuation);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$9", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {127}, m = "invokeSuspend")
    static final class AnonymousClass9 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Intent $intent;
        final /* synthetic */ p $listenerStarted;
        int label;
        final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass9(p pVar, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, Intent intent, Continuation continuation) {
            super(2, continuation);
            this.$listenerStarted = pVar;
            this.this$0 = androidFullscreenWebViewAdPlayer;
            this.$intent = intent;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass9(this.$listenerStarted, this.this$0, this.$intent, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                p pVar = this.$listenerStarted;
                this.label = 1;
                if (pVar.await(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            this.this$0.context.startActivity(this.$intent);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass9) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public AndroidFullscreenWebViewAdPlayer(@NotNull WebViewAdPlayer webViewAdPlayer, @NotNull String opportunityId, @NotNull AndroidWebViewContainer webViewContainer, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull SessionRepository sessionRepository, @NotNull OpenMeasurementRepository openMeasurementRepository, @NotNull ScarManager scarManager, @NotNull OfferwallManager offerwallManager, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull AdRepository adRepository, @NotNull OrientationRepository orientationRepository, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(webViewAdPlayer, "webViewAdPlayer");
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        Intrinsics.checkNotNullParameter(webViewContainer, "webViewContainer");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        Intrinsics.checkNotNullParameter(scarManager, "scarManager");
        Intrinsics.checkNotNullParameter(offerwallManager, "offerwallManager");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        Intrinsics.checkNotNullParameter(orientationRepository, "orientationRepository");
        Intrinsics.checkNotNullParameter(context, "context");
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = opportunityId;
        this.webViewContainer = webViewContainer;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
        this.offerwallManager = offerwallManager;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.adRepository = adRepository;
        this.orientationRepository = orientationRepository;
        this.context = context;
        this.adObject = i.a(new Function0<AdObject>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$adObject$2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @Nullable
            public final AdObject invoke() {
                Object objB;
                AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
                try {
                    Result.Companion companion = Result.f93230c;
                    AdRepository adRepository2 = androidFullscreenWebViewAdPlayer.adRepository;
                    UUID uuidFromString = UUID.fromString(androidFullscreenWebViewAdPlayer.opportunityId);
                    Intrinsics.checkNotNullExpressionValue(uuidFromString, "fromString(opportunityId)");
                    objB = Result.b(adRepository2.getAd(ProtobufExtensionsKt.toByteString(uuidFromString)));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.f93230c;
                    objB = Result.b(kotlin.d.a(th2));
                }
                if (Result.i(objB)) {
                    objB = null;
                }
                return (AdObject) objB;
            }
        });
    }

    private final Job displayEventsRouter(DisplayMessage displayMessage) {
        return eg.i.d(getScope(), null, null, new C47341(displayMessage, this, null), 3, null);
    }

    private final AdObject getAdObject() {
        return (AdObject) this.adObject.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleSessionChange(SessionChange sessionChange, Continuation continuation) {
        if (sessionChange instanceof SessionChange.UserConsentChange) {
            WebViewAdPlayer webViewAdPlayer = this.webViewAdPlayer;
            byte[] byteArray = ((SessionChange.UserConsentChange) sessionChange).getValue().toByteArray();
            Intrinsics.checkNotNullExpressionValue(byteArray, "change.value.toByteArray()");
            Object objSendUserConsentChange = webViewAdPlayer.sendUserConsentChange(byteArray, continuation);
            return objSendUserConsentChange == pf.b.g() ? objSendUserConsentChange : Unit.f93236a;
        }
        if (!(sessionChange instanceof SessionChange.PrivacyFsmChange)) {
            return Unit.f93236a;
        }
        WebViewAdPlayer webViewAdPlayer2 = this.webViewAdPlayer;
        byte[] byteArray2 = ((SessionChange.PrivacyFsmChange) sessionChange).getValue().toByteArray();
        Intrinsics.checkNotNullExpressionValue(byteArray2, "change.value.toByteArray()");
        Object objSendPrivacyFsmChange = webViewAdPlayer2.sendPrivacyFsmChange(byteArray2, continuation);
        return objSendPrivacyFsmChange == pf.b.g() ? objSendPrivacyFsmChange : Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object handleVolumeSettingsChange(VolumeSettingsChange volumeSettingsChange, Continuation continuation) {
        if (volumeSettingsChange instanceof VolumeSettingsChange.MuteChange) {
            Object objSendMuteChange = this.webViewAdPlayer.sendMuteChange(((VolumeSettingsChange.MuteChange) volumeSettingsChange).isMuted(), continuation);
            return objSendMuteChange == pf.b.g() ? objSendMuteChange : Unit.f93236a;
        }
        if (!(volumeSettingsChange instanceof VolumeSettingsChange.VolumeChange)) {
            return Unit.f93236a;
        }
        Object objSendVolumeChange = this.webViewAdPlayer.sendVolumeChange(((VolumeSettingsChange.VolumeChange) volumeSettingsChange).getVolume(), continuation);
        return objSendVolumeChange == pf.b.g() ? objSendVolumeChange : Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ Object show$displayEventsRouter(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, DisplayMessage displayMessage, Continuation continuation) {
        androidFullscreenWebViewAdPlayer.displayEventsRouter(displayMessage);
        return Unit.f93236a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00a3, code lost:
    
        if (com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r2, r0) != r1) goto L35;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x009a A[PHI: r2
  0x009a: PHI (r2v5 com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) = 
  (r2v4 com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer)
  (r2v11 com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer)
 binds: [B:30:0x0097, B:17:0x003b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object destroy(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r9) {
        /*
            r8 = this;
            boolean r0 = r9 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r9
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1 r0 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$destroy$1
            r0.<init>(r9)
        L18:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L53
            if (r2 == r6) goto L4b
            if (r2 == r5) goto L43
            if (r2 == r4) goto L3b
            if (r2 != r3) goto L33
            kotlin.d.b(r9)
            goto La6
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L3b:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) r2
            kotlin.d.b(r9)
            goto L9a
        L43:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) r2
            kotlin.d.b(r9)
            goto L8b
        L4b:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer) r2
            kotlin.d.b(r9)
            goto L70
        L53:
            kotlin.d.b(r9)
            com.unity3d.ads.adplayer.WebViewAdPlayer r9 = r8.webViewAdPlayer
            r9.dispatchShowCompleted()
            kotlinx.coroutines.flow.MutableSharedFlow r9 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.displayMessages
            com.unity3d.ads.adplayer.DisplayMessage$DisplayFinishRequest r2 = new com.unity3d.ads.adplayer.DisplayMessage$DisplayFinishRequest
            java.lang.String r7 = r8.opportunityId
            r2.<init>(r7)
            r0.L$0 = r8
            r0.label = r6
            java.lang.Object r9 = r9.emit(r2, r0)
            if (r9 != r1) goto L6f
            goto La5
        L6f:
            r2 = r8
        L70:
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r9 = r2.openMeasurementRepository
            java.lang.String r6 = r2.opportunityId
            com.google.protobuf.ByteString r6 = com.google.protobuf.kotlin.ByteStringsKt.toByteStringUtf8(r6)
            boolean r9 = r9.hasSessionFinished(r6)
            if (r9 == 0) goto L8b
            r0.L$0 = r2
            r0.label = r5
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r9 = eg.k0.a(r5, r0)
            if (r9 != r1) goto L8b
            goto La5
        L8b:
            com.unity3d.ads.adplayer.AndroidWebViewContainer r9 = r2.getWebViewContainer()
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r9 = r9.destroy(r0)
            if (r9 != r1) goto L9a
            goto La5
        L9a:
            r9 = 0
            r0.L$0 = r9
            r0.label = r3
            java.lang.Object r9 = com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r2, r0)
            if (r9 != r1) goto La6
        La5:
            return r1
        La6:
            kotlin.Unit r9 = kotlin.Unit.f93236a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.destroy(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.webViewAdPlayer.dispatchShowCompleted();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public Flow getOnLoadEvent() {
        return this.webViewAdPlayer.getOnLoadEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public Flow getOnOfferwallEvent() {
        return this.webViewAdPlayer.getOnOfferwallEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public Flow getOnScarEvent() {
        return this.webViewAdPlayer.getOnScarEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public Flow getOnShowEvent() {
        return this.webViewAdPlayer.getOnShowEvent();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public CoroutineScope getScope() {
        return this.webViewAdPlayer.getScope();
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object onAllowedPiiChange(@NotNull byte[] bArr, @NotNull Continuation continuation) {
        return this.webViewAdPlayer.onAllowedPiiChange(bArr, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object onBroadcastEvent(@NotNull String str, @NotNull Continuation continuation) {
        return this.webViewAdPlayer.onBroadcastEvent(str, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object requestShow(@Nullable Map<String, ? extends Object> map, @NotNull Continuation continuation) {
        return this.webViewAdPlayer.requestShow(map, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendActivityDestroyed(@NotNull Continuation continuation) {
        return this.webViewAdPlayer.sendActivityDestroyed(continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendFocusChange(boolean z10, @NotNull Continuation continuation) {
        return this.webViewAdPlayer.sendFocusChange(z10, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendGmaEvent(@NotNull com.unity3d.scar.adapter.common.c cVar, @NotNull Continuation continuation) {
        return this.webViewAdPlayer.sendGmaEvent(cVar, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendMuteChange(boolean z10, @NotNull Continuation continuation) {
        return this.webViewAdPlayer.sendMuteChange(z10, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendOfferwallEvent(@NotNull OfferwallEvent offerwallEvent, @NotNull Continuation continuation) {
        return this.webViewAdPlayer.sendOfferwallEvent(offerwallEvent, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendPrivacyFsmChange(@NotNull byte[] bArr, @NotNull Continuation continuation) {
        return this.webViewAdPlayer.sendPrivacyFsmChange(bArr, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendScarBannerEvent(@NotNull BannerBridge.BannerEvent bannerEvent, @NotNull Continuation continuation) {
        return this.webViewAdPlayer.sendScarBannerEvent(bannerEvent, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendUserConsentChange(@NotNull byte[] bArr, @NotNull Continuation continuation) {
        return this.webViewAdPlayer.sendUserConsentChange(bArr, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendVisibilityChange(boolean z10, @NotNull Continuation continuation) {
        return this.webViewAdPlayer.sendVisibilityChange(z10, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendVolumeChange(double d10, @NotNull Continuation continuation) {
        return this.webViewAdPlayer.sendVolumeChange(d10, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(@NotNull ShowOptions showOptions) {
        Intrinsics.checkNotNullParameter(showOptions, "showOptions");
        if (!(showOptions instanceof AndroidShowOptions)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) showOptions;
        boolean zIsScarAd = androidShowOptions.isScarAd();
        boolean zIsOfferwallAd = androidShowOptions.isOfferwallAd();
        p pVarC = r.c(null, 1, null);
        final SharedFlow sharedFlowM = hg.i.M(displayMessages, new C47351(pVarC, null));
        hg.i.F(hg.i.K(new Flow() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector, AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer) {
                    this.$this_unsafeFlow = flowCollector;
                    this.this$0 = androidFullscreenWebViewAdPlayer;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = pf.b.g()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.d.b(r7)
                        goto L52
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.d.b(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.DisplayMessage r2 = (com.unity3d.ads.adplayer.DisplayMessage) r2
                        java.lang.String r2 = r2.getOpportunityId()
                        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer r4 = r5.this$0
                        java.lang.String r4 = com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.access$getOpportunityId$p(r4)
                        boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
                        if (r2 == 0) goto L52
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L52
                        return r1
                    L52:
                        kotlin.Unit r6 = kotlin.Unit.f93236a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                Object objCollect = sharedFlowM.collect(new AnonymousClass2(flowCollector, this), continuation);
                return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
            }
        }, new AnonymousClass3(this)), getScope());
        hg.i.F(hg.i.K(this.deviceInfoRepository.getVolumeSettingsChange(), new AnonymousClass4(this)), getScope());
        final Flow onShowEvent = this.webViewAdPlayer.getOnShowEvent();
        hg.i.F(hg.i.K(new Flow() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                public static final class AnonymousClass1 extends d {
                    Object L$0;
                    Object L$1;
                    int label;
                    /* synthetic */ Object result;

                    public AnonymousClass1(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.a
                    @Nullable
                    public final Object invokeSuspend(@NotNull Object obj) {
                        this.result = obj;
                        this.label |= Integer.MIN_VALUE;
                        return AnonymousClass2.this.emit(null, this);
                    }
                }

                public AnonymousClass2(FlowCollector flowCollector) {
                    this.$this_unsafeFlow = flowCollector;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) {
                    /*
                        r5 = this;
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1 r0 = (com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1 r0 = new com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = pf.b.g()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.d.b(r7)
                        goto L4a
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.d.b(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.core.data.model.ShowEvent r2 = (com.unity3d.ads.core.data.model.ShowEvent) r2
                        boolean r4 = r2 instanceof com.unity3d.ads.core.data.model.ShowEvent.Completed
                        if (r4 != 0) goto L41
                        boolean r2 = r2 instanceof com.unity3d.ads.core.data.model.ShowEvent.Error
                        if (r2 == 0) goto L4a
                    L41:
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L4a
                        return r1
                    L4a:
                        kotlin.Unit r6 = kotlin.Unit.f93236a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$$inlined$filter$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                Object objCollect = onShowEvent.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
            }
        }, new AnonymousClass6(null)), getScope());
        hg.i.F(hg.i.K(this.sessionRepository.getOnChange(), new AnonymousClass7(this)), getScope());
        z.o(getScope().getCoroutineContext()).q(new Function1<Throwable, Unit>() { // from class: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer.show.8

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$8$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @e(c = "com.unity3d.ads.adplayer.AndroidFullscreenWebViewAdPlayer$show$8$1", f = "AndroidFullscreenWebViewAdPlayer.kt", l = {109}, m = "invokeSuspend")
            static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
                int label;
                final /* synthetic */ AndroidFullscreenWebViewAdPlayer this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer, Continuation continuation) {
                    super(2, continuation);
                    this.this$0 = androidFullscreenWebViewAdPlayer;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new AnonymousClass1(this.this$0, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objG = pf.b.g();
                    int i10 = this.label;
                    if (i10 == 0) {
                        kotlin.d.b(obj);
                        AndroidFullscreenWebViewAdPlayer androidFullscreenWebViewAdPlayer = this.this$0;
                        this.label = 1;
                        if (androidFullscreenWebViewAdPlayer.destroy(this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.d.b(obj);
                    }
                    return Unit.f93236a;
                }

                @Override // kotlin.jvm.functions.Function2
                @Nullable
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }
            }

            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th2) {
                invoke2(th2);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@Nullable Throwable th2) {
                if (th2 != null) {
                    eg.i.d(kotlinx.coroutines.i.a(AndroidFullscreenWebViewAdPlayer.this.getScope().getCoroutineContext().plus(d0.f93604b)), null, null, new AnonymousClass1(AndroidFullscreenWebViewAdPlayer.this, null), 3, null);
                }
            }
        });
        if (zIsScarAd || zIsOfferwallAd) {
            if (!zIsScarAd) {
                eg.i.d(getScope(), null, null, new AnonymousClass11(showOptions, null), 3, null);
                return;
            }
            ScarManager scarManager = this.scarManager;
            String placementId = androidShowOptions.getPlacementId();
            if (placementId == null) {
                placementId = "";
            }
            String scarQueryId = androidShowOptions.getScarQueryId();
            eg.i.d(getScope(), null, null, new AnonymousClass10(hg.i.R(scarManager.show(placementId, scarQueryId != null ? scarQueryId : ""), getScope(), g0.f73226a.c(), 10), showOptions, null), 3, null);
            return;
        }
        SendDiagnosticEvent.DefaultImpls.invoke$default(this.sendDiagnosticEvent, "native_show_ad_viewer_fullscreen", null, null, null, getAdObject(), null, 46, null);
        Intent intent = new Intent(this.context, (Class<?>) FullScreenWebViewDisplay.class);
        intent.putExtra("opportunityId", this.opportunityId);
        Map<String, Object> unityAdsShowOptions = androidShowOptions.getUnityAdsShowOptions();
        if (unityAdsShowOptions != null) {
            intent.putExtra("showOptions", new JSONObject(unityAdsShowOptions).toString());
        }
        intent.addFlags(268500992);
        intent.putExtra("orientation", ((Number) this.orientationRepository.getResumedActivityOrientation().getValue()).intValue());
        eg.i.d(getScope(), null, null, new AnonymousClass9(pVarC, this, intent, null), 3, null);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }
}
