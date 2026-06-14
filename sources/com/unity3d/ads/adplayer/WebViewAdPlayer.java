package com.unity3d.ads.adplayer;

import android.util.Base64;
import androidx.annotation.CallSuper;
import com.ironsource.C4329g8;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.adplayer.model.OnActivityDestroyedEvent;
import com.unity3d.ads.adplayer.model.OnAllowedPiiChangeEvent;
import com.unity3d.ads.adplayer.model.OnBroadcastEvent;
import com.unity3d.ads.adplayer.model.OnFocusChangeEvent;
import com.unity3d.ads.adplayer.model.OnGmaEvent;
import com.unity3d.ads.adplayer.model.OnMuteChangeEvent;
import com.unity3d.ads.adplayer.model.OnOfferwallEvent;
import com.unity3d.ads.adplayer.model.OnPrivacyFsmChangeEvent;
import com.unity3d.ads.adplayer.model.OnScarBannerEvent;
import com.unity3d.ads.adplayer.model.OnStorageEvent;
import com.unity3d.ads.adplayer.model.OnUserConsentChangeEvent;
import com.unity3d.ads.adplayer.model.OnVisibilityChangeEvent;
import com.unity3d.ads.adplayer.model.OnVolumeChangeEvent;
import com.unity3d.ads.adplayer.model.WebViewEvent;
import com.unity3d.ads.core.data.repository.DeviceInfoRepository;
import com.unity3d.ads.core.data.repository.SessionRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.device.Storage;
import com.unity3d.services.core.device.StorageEventInfo;
import com.vungle.ads.internal.protos.Sdk;
import eg.e0;
import eg.i;
import hg.g0;
import hg.l0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.y;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.z;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0016\u001a\u00020\u00152\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0082@ø\u0001\u0000¢\u0006\u0004\b\u0016\u0010\u0017J+\u0010\u001c\u001a\u00020\u00152\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0018\u00010\u0018H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u001b\u0010\"\u001a\u00020\u00152\u0006\u0010!\u001a\u00020 H\u0096@ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001b\u0010%\u001a\u00020\u00152\u0006\u0010!\u001a\u00020$H\u0096@ø\u0001\u0000¢\u0006\u0004\b%\u0010&J\u001b\u0010(\u001a\u00020\u00152\u0006\u0010!\u001a\u00020'H\u0096@ø\u0001\u0000¢\u0006\u0004\b(\u0010)J\u001b\u0010,\u001a\u00020\u00152\u0006\u0010+\u001a\u00020*H\u0096@ø\u0001\u0000¢\u0006\u0004\b,\u0010-J\u001b\u0010/\u001a\u00020\u00152\u0006\u0010.\u001a\u00020*H\u0096@ø\u0001\u0000¢\u0006\u0004\b/\u0010-J\u001b\u00101\u001a\u00020\u00152\u0006\u00100\u001a\u00020*H\u0096@ø\u0001\u0000¢\u0006\u0004\b1\u0010-J\u0013\u00102\u001a\u00020\u0015H\u0096@ø\u0001\u0000¢\u0006\u0004\b2\u00103J\u001b\u00106\u001a\u00020\u00152\u0006\u00105\u001a\u000204H\u0096@ø\u0001\u0000¢\u0006\u0004\b6\u00107J\u001b\u0010:\u001a\u00020\u00152\u0006\u00109\u001a\u000208H\u0096@ø\u0001\u0000¢\u0006\u0004\b:\u0010;J\u001b\u0010<\u001a\u00020\u00152\u0006\u00109\u001a\u000208H\u0096@ø\u0001\u0000¢\u0006\u0004\b<\u0010;J\u001b\u0010=\u001a\u00020\u00152\u0006\u0010!\u001a\u00020\u0019H\u0096@ø\u0001\u0000¢\u0006\u0004\b=\u0010>J\u001b\u0010?\u001a\u00020\u00152\u0006\u00109\u001a\u000208H\u0096@ø\u0001\u0000¢\u0006\u0004\b?\u0010;R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010@R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010AR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010BR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010CR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010DR\u001a\u0010\r\u001a\u00020\f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\r\u0010E\u001a\u0004\bF\u0010GR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020*0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR \u0010M\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\u00150K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001a\u0010O\u001a\u00020\u000e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR \u0010U\u001a\b\u0012\u0004\u0012\u00020T0S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bU\u0010V\u001a\u0004\bW\u0010XR \u0010Z\u001a\b\u0012\u0004\u0012\u00020Y0S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010V\u001a\u0004\b[\u0010XR \u0010]\u001a\b\u0012\u0004\u0012\u00020\\0S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b]\u0010V\u001a\u0004\b^\u0010XR \u0010`\u001a\b\u0012\u0004\u0012\u00020_0S8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b`\u0010V\u001a\u0004\ba\u0010XR\u001a\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00190S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010V\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006c"}, d2 = {"Lcom/unity3d/ads/adplayer/WebViewAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "bridge", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "deviceInfoRepository", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "sessionRepository", "Lkotlinx/coroutines/CoroutineDispatcher;", "dispatcher", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "sendDiagnosticEvent", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "webViewContainer", "Lkotlinx/coroutines/CoroutineScope;", "adPlayerScope", "<init>", "(Lcom/unity3d/ads/adplayer/WebViewBridge;Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;Lcom/unity3d/ads/core/data/repository/SessionRepository;Lkotlinx/coroutines/CoroutineDispatcher;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;Lcom/unity3d/ads/adplayer/WebViewContainer;Lkotlinx/coroutines/CoroutineScope;)V", "Lkotlin/Function0;", "Lcom/unity3d/ads/adplayer/model/WebViewEvent;", "getEvent", "", "sendEvent", "(Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "", "unityAdsShowOptions", "requestShow", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "dispatchShowCompleted", "()V", "Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;", "event", "sendScarBannerEvent", "(Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/unity3d/scar/adapter/common/c;", "sendGmaEvent", "(Lcom/unity3d/scar/adapter/common/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "sendOfferwallEvent", "(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isMuted", "sendMuteChange", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", C4329g8.f43166k, "sendVisibilityChange", "isFocused", "sendFocusChange", "sendActivityDestroyed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "volume", "sendVolumeChange", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "value", "sendUserConsentChange", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendPrivacyFsmChange", "onBroadcastEvent", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onAllowedPiiChange", "Lcom/unity3d/ads/adplayer/WebViewBridge;", "Lcom/unity3d/ads/core/data/repository/DeviceInfoRepository;", "Lcom/unity3d/ads/core/data/repository/SessionRepository;", "Lkotlinx/coroutines/CoroutineDispatcher;", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "Lcom/unity3d/ads/adplayer/WebViewContainer;", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/WebViewContainer;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "isCompletedManually", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlin/Function1;", "Lcom/unity3d/services/core/device/StorageEventInfo;", "storageEventCallback", "Lkotlin/jvm/functions/Function1;", "scope", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/data/model/ScarEvent$Show;", "onScarEvent", "Lkotlinx/coroutines/flow/Flow;", "getOnScarEvent", "()Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent$Show;", "onOfferwallEvent", "getOnOfferwallEvent", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "onShowEvent", "getOnShowEvent", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "onLoadEvent", "getOnLoadEvent", "onBroadcastEvents", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class WebViewAdPlayer implements AdPlayer {

    @NotNull
    private final WebViewBridge bridge;

    @NotNull
    private final DeviceInfoRepository deviceInfoRepository;

    @NotNull
    private final CoroutineDispatcher dispatcher;

    @NotNull
    private final MutableStateFlow isCompletedManually;

    @NotNull
    private final Flow onBroadcastEvents;

    @NotNull
    private final Flow onLoadEvent;

    @NotNull
    private final Flow onOfferwallEvent;

    @NotNull
    private final Flow onScarEvent;

    @NotNull
    private final Flow onShowEvent;

    @NotNull
    private final CoroutineScope scope;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    @NotNull
    private final SessionRepository sessionRepository;

    @NotNull
    private final Function1<StorageEventInfo, Unit> storageEventCallback;

    @NotNull
    private final WebViewContainer webViewContainer;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$2, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class AnonymousClass2 extends y implements Function2<String, Continuation, Object> {
        AnonymousClass2(Object obj) {
            super(2, obj, MutableSharedFlow.class, "emit", "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull String str, @NotNull Continuation continuation) {
            return ((MutableSharedFlow) this.receiver).emit(str, continuation);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$3, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class AnonymousClass3 extends y implements Function2<String, Continuation, Object> {
        AnonymousClass3(Object obj) {
            super(2, obj, WebViewAdPlayer.class, "onBroadcastEvent", "onBroadcastEvent(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull String str, @NotNull Continuation continuation) {
            return ((WebViewAdPlayer) this.receiver).onBroadcastEvent(str, continuation);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$requestShow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer", f = "WebViewAdPlayer.kt", l = {201, 202, Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE}, m = "requestShow")
    static final class C47531 extends d {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        /* synthetic */ Object result;

        C47531(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebViewAdPlayer.this.requestShow(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer", f = "WebViewAdPlayer.kt", l = {229, 243}, m = "sendEvent")
    static final class C47551 extends d {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C47551(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return WebViewAdPlayer.this.sendEvent(null, this);
        }
    }

    public WebViewAdPlayer(@NotNull WebViewBridge bridge, @NotNull DeviceInfoRepository deviceInfoRepository, @NotNull SessionRepository sessionRepository, @NotNull CoroutineDispatcher dispatcher, @NotNull SendDiagnosticEvent sendDiagnosticEvent, @NotNull WebViewContainer webViewContainer, @NotNull CoroutineScope adPlayerScope) {
        Intrinsics.checkNotNullParameter(bridge, "bridge");
        Intrinsics.checkNotNullParameter(deviceInfoRepository, "deviceInfoRepository");
        Intrinsics.checkNotNullParameter(sessionRepository, "sessionRepository");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        Intrinsics.checkNotNullParameter(webViewContainer, "webViewContainer");
        Intrinsics.checkNotNullParameter(adPlayerScope, "adPlayerScope");
        this.bridge = bridge;
        this.deviceInfoRepository = deviceInfoRepository;
        this.sessionRepository = sessionRepository;
        this.dispatcher = dispatcher;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
        this.webViewContainer = webViewContainer;
        MutableStateFlow mutableStateFlowA = l0.a(Boolean.FALSE);
        this.isCompletedManually = mutableStateFlowA;
        Function1<StorageEventInfo, Unit> function1 = new Function1<StorageEventInfo, Unit>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1$1, reason: invalid class name */
            @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
            @e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$storageEventCallback$1$1", f = "WebViewAdPlayer.kt", l = {90}, m = "invokeSuspend")
            static final class AnonymousClass1 extends k implements Function2<CoroutineScope, Continuation, Object> {
                final /* synthetic */ StorageEventInfo $it;
                int label;
                final /* synthetic */ WebViewAdPlayer this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(WebViewAdPlayer webViewAdPlayer, StorageEventInfo storageEventInfo, Continuation continuation) {
                    super(2, continuation);
                    this.this$0 = webViewAdPlayer;
                    this.$it = storageEventInfo;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new AnonymousClass1(this.this$0, this.$it, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objG = pf.b.g();
                    int i10 = this.label;
                    if (i10 == 0) {
                        kotlin.d.b(obj);
                        WebViewBridge webViewBridge = this.this$0.bridge;
                        OnStorageEvent onStorageEvent = new OnStorageEvent(this.$it.getEventType(), this.$it.getStorageType(), this.$it.getValue());
                        this.label = 1;
                        if (webViewBridge.sendEvent(onStorageEvent, this) == objG) {
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
            public /* bridge */ /* synthetic */ Unit invoke(StorageEventInfo storageEventInfo) {
                invoke2(storageEventInfo);
                return Unit.f93236a;
            }

            /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull StorageEventInfo it) {
                Intrinsics.checkNotNullParameter(it, "it");
                i.d(this.this$0.getScope(), null, null, new AnonymousClass1(this.this$0, it, null), 3, null);
            }
        };
        this.storageEventCallback = function1;
        this.scope = kotlinx.coroutines.i.j(kotlinx.coroutines.i.j(adPlayerScope, dispatcher), new e0("WebViewAdPlayer"));
        final SharedFlow onInvocation = bridge.getOnInvocation();
        final Flow flow = new Flow() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2", f = "WebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1$2$1
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
                        com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.showScarAd"
                        java.lang.String[] r4 = new java.lang.String[]{r4}
                        java.lang.String r2 = r2.getLocation()
                        boolean r2 = kotlin.collections.ArraysKt.contains(r4, r2)
                        if (r2 == 0) goto L52
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L52
                        return r1
                    L52:
                        kotlin.Unit r6 = kotlin.Unit.f93236a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                Object objCollect = onInvocation.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
            }
        };
        this.onScarEvent = new Flow() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2", f = "WebViewAdPlayer.kt", l = {224, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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

                /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
                
                    if (r2.emit(r7, r0) == r1) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = pf.b.g()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        r5 = 0
                        if (r2 == 0) goto L41
                        if (r2 == r4) goto L35
                        if (r2 != r3) goto L2d
                        kotlin.d.b(r8)
                        goto L70
                    L2d:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L35:
                        java.lang.Object r7 = r0.L$1
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        java.lang.Object r2 = r0.L$0
                        kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                        kotlin.d.b(r8)
                        goto L55
                    L41:
                        kotlin.d.b(r8)
                        kotlinx.coroutines.flow.FlowCollector r2 = r6.$this_unsafeFlow
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        r0.L$0 = r2
                        r0.L$1 = r7
                        r0.label = r4
                        java.lang.Object r8 = com.unity3d.ads.adplayer.Invocation.handle$default(r7, r5, r0, r4, r5)
                        if (r8 != r1) goto L55
                        goto L6f
                    L55:
                        java.lang.String r8 = r7.getLocation()
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.showScarAd"
                        boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r4)
                        if (r8 == 0) goto L73
                        com.unity3d.ads.core.data.model.ScarEvent$Show r7 = com.unity3d.ads.core.data.model.ScarEvent.Show.INSTANCE
                        r0.L$0 = r5
                        r0.L$1 = r5
                        r0.label = r3
                        java.lang.Object r7 = r2.emit(r7, r0)
                        if (r7 != r1) goto L70
                    L6f:
                        return r1
                    L70:
                        kotlin.Unit r7 = kotlin.Unit.f93236a
                        return r7
                    L73:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "Unexpected location: "
                        r0.append(r1)
                        java.lang.String r7 = r7.getLocation()
                        r0.append(r7)
                        java.lang.String r7 = r0.toString()
                        java.lang.String r7 = r7.toString()
                        r8.<init>(r7)
                        throw r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
            }
        };
        final SharedFlow onInvocation2 = bridge.getOnInvocation();
        final Flow flow2 = new Flow() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2", f = "WebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2$2$1
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
                        com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.showOfferwallAd"
                        java.lang.String[] r4 = new java.lang.String[]{r4}
                        java.lang.String r2 = r2.getLocation()
                        boolean r2 = kotlin.collections.ArraysKt.contains(r4, r2)
                        if (r2 == 0) goto L52
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L52
                        return r1
                    L52:
                        kotlin.Unit r6 = kotlin.Unit.f93236a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                Object objCollect = onInvocation2.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
            }
        };
        this.onOfferwallEvent = new Flow() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2", f = "WebViewAdPlayer.kt", l = {224, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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

                /* JADX WARN: Code restructure failed: missing block: B:22:0x006d, code lost:
                
                    if (r2.emit(r7, r0) == r1) goto L23;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = pf.b.g()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        r5 = 0
                        if (r2 == 0) goto L41
                        if (r2 == r4) goto L35
                        if (r2 != r3) goto L2d
                        kotlin.d.b(r8)
                        goto L70
                    L2d:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L35:
                        java.lang.Object r7 = r0.L$1
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        java.lang.Object r2 = r0.L$0
                        kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                        kotlin.d.b(r8)
                        goto L55
                    L41:
                        kotlin.d.b(r8)
                        kotlinx.coroutines.flow.FlowCollector r2 = r6.$this_unsafeFlow
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        r0.L$0 = r2
                        r0.L$1 = r7
                        r0.label = r4
                        java.lang.Object r8 = com.unity3d.ads.adplayer.Invocation.handle$default(r7, r5, r0, r4, r5)
                        if (r8 != r1) goto L55
                        goto L6f
                    L55:
                        java.lang.String r8 = r7.getLocation()
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.showOfferwallAd"
                        boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual(r8, r4)
                        if (r8 == 0) goto L73
                        com.unity3d.ads.core.data.model.OfferwallShowEvent$Show r7 = com.unity3d.ads.core.data.model.OfferwallShowEvent.Show.INSTANCE
                        r0.L$0 = r5
                        r0.L$1 = r5
                        r0.label = r3
                        java.lang.Object r7 = r2.emit(r7, r0)
                        if (r7 != r1) goto L70
                    L6f:
                        return r1
                    L70:
                        kotlin.Unit r7 = kotlin.Unit.f93236a
                        return r7
                    L73:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.StringBuilder r0 = new java.lang.StringBuilder
                        r0.<init>()
                        java.lang.String r1 = "Unexpected location: "
                        r0.append(r1)
                        java.lang.String r7 = r7.getLocation()
                        r0.append(r7)
                        java.lang.String r7 = r0.toString()
                        java.lang.String r7 = r7.toString()
                        r8.<init>(r7)
                        throw r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$2.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flow2.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
            }
        };
        final SharedFlow onInvocation3 = bridge.getOnInvocation();
        final Flow flow3 = new Flow() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2", f = "WebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = pf.b.g()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.d.b(r7)
                        goto L50
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.d.b(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                        java.lang.String[] r4 = com.unity3d.ads.adplayer.WebViewAdPlayerKt.access$getSHOW_EVENTS$p()
                        java.lang.String r2 = r2.getLocation()
                        boolean r2 = kotlin.collections.ArraysKt.contains(r4, r2)
                        if (r2 == 0) goto L50
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L50
                        return r1
                    L50:
                        kotlin.Unit r6 = kotlin.Unit.f93236a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$3.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                Object objCollect = onInvocation3.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
            }
        };
        this.onShowEvent = hg.i.C(new Flow() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3$2", f = "WebViewAdPlayer.kt", l = {244, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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

                /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
                /* JADX WARN: Code restructure failed: missing block: B:54:0x0109, code lost:
                
                    if (r2.emit(r13, r0) == r1) goto L55;
                 */
                /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
                /* JADX WARN: Removed duplicated region for block: B:52:0x00fe  */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r13, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r14) {
                    /*
                        Method dump skipped, instruction units count: 324
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$3.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flow3.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
            }
        }, mutableStateFlowA, new WebViewAdPlayer$onShowEvent$3(null));
        final SharedFlow onInvocation4 = bridge.getOnInvocation();
        final Flow flow4 = new Flow() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2", f = "WebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = pf.b.g()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.d.b(r7)
                        goto L50
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.d.b(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                        java.lang.String[] r4 = com.unity3d.ads.adplayer.WebViewAdPlayerKt.access$getLOAD_EVENTS$p()
                        java.lang.String r2 = r2.getLocation()
                        boolean r2 = kotlin.collections.ArraysKt.contains(r4, r2)
                        if (r2 == 0) goto L50
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L50
                        return r1
                    L50:
                        kotlin.Unit r6 = kotlin.Unit.f93236a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$4.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                Object objCollect = onInvocation4.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
            }
        };
        this.onLoadEvent = hg.i.U(hg.i.R(new Flow() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2", f = "WebViewAdPlayer.kt", l = {224, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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

                /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
                
                    if (r2.emit(r4, r0) == r1) goto L25;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r8, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r9) {
                    /*
                        r7 = this;
                        boolean r0 = r9 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r9
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4$2$1
                        r0.<init>(r9)
                    L18:
                        java.lang.Object r9 = r0.result
                        java.lang.Object r1 = pf.b.g()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        r5 = 0
                        if (r2 == 0) goto L41
                        if (r2 == r4) goto L35
                        if (r2 != r3) goto L2d
                        kotlin.d.b(r9)
                        goto L96
                    L2d:
                        java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                        java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                        r8.<init>(r9)
                        throw r8
                    L35:
                        java.lang.Object r8 = r0.L$1
                        com.unity3d.ads.adplayer.Invocation r8 = (com.unity3d.ads.adplayer.Invocation) r8
                        java.lang.Object r2 = r0.L$0
                        kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                        kotlin.d.b(r9)
                        goto L55
                    L41:
                        kotlin.d.b(r9)
                        kotlinx.coroutines.flow.FlowCollector r2 = r7.$this_unsafeFlow
                        com.unity3d.ads.adplayer.Invocation r8 = (com.unity3d.ads.adplayer.Invocation) r8
                        r0.L$0 = r2
                        r0.L$1 = r8
                        r0.label = r4
                        java.lang.Object r9 = com.unity3d.ads.adplayer.Invocation.handle$default(r8, r5, r0, r4, r5)
                        if (r9 != r1) goto L55
                        goto L95
                    L55:
                        java.lang.String r9 = r8.getLocation()
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.loadError"
                        boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual(r9, r4)
                        if (r9 == 0) goto L87
                        java.lang.Object[] r8 = r8.getParameters()
                        java.lang.Object r8 = kotlin.collections.ArraysKt.first(r8)
                        java.lang.String r9 = "null cannot be cast to non-null type org.json.JSONObject"
                        kotlin.jvm.internal.Intrinsics.checkNotNull(r8, r9)
                        org.json.JSONObject r8 = (org.json.JSONObject) r8
                        java.lang.String r9 = "code"
                        int r9 = r8.optInt(r9)
                        java.lang.String r4 = "message"
                        java.lang.String r8 = r8.optString(r4)
                        com.unity3d.ads.adplayer.model.LoadEvent$Error r4 = new com.unity3d.ads.adplayer.model.LoadEvent$Error
                        java.lang.String r6 = "errorMessage"
                        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r8, r6)
                        r4.<init>(r8, r9)
                        goto L89
                    L87:
                        com.unity3d.ads.adplayer.model.LoadEvent$Completed r4 = com.unity3d.ads.adplayer.model.LoadEvent.Completed.INSTANCE
                    L89:
                        r0.L$0 = r5
                        r0.L$1 = r5
                        r0.label = r3
                        java.lang.Object r8 = r2.emit(r4, r0)
                        if (r8 != r1) goto L96
                    L95:
                        return r1
                    L96:
                        kotlin.Unit r8 = kotlin.Unit.f93236a
                        return r8
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$4.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flow4.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
            }
        }, getScope(), g0.f73226a.c(), 1), 1);
        final SharedFlow onInvocation5 = bridge.getOnInvocation();
        final Flow flow5 = new Flow() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2", f = "WebViewAdPlayer.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                        boolean r0 = r7 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r7
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5$2$1
                        r0.<init>(r7)
                    L18:
                        java.lang.Object r7 = r0.result
                        java.lang.Object r1 = pf.b.g()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.d.b(r7)
                        goto L4e
                    L29:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r7)
                        throw r6
                    L31:
                        kotlin.d.b(r7)
                        kotlinx.coroutines.flow.FlowCollector r7 = r5.$this_unsafeFlow
                        r2 = r6
                        com.unity3d.ads.adplayer.Invocation r2 = (com.unity3d.ads.adplayer.Invocation) r2
                        java.lang.String r2 = r2.getLocation()
                        java.lang.String r4 = "com.unity3d.services.ads.api.AdViewer.broadcastEvent"
                        boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
                        if (r2 == 0) goto L4e
                        r0.label = r3
                        java.lang.Object r6 = r7.emit(r6, r0)
                        if (r6 != r1) goto L4e
                        return r1
                    L4e:
                        kotlin.Unit r6 = kotlin.Unit.f93236a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$filter$5.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                Object objCollect = onInvocation5.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
            }
        };
        Flow flow6 = new Flow() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5

            /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @e(c = "com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2", f = "WebViewAdPlayer.kt", l = {224, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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

                /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
                
                    if (r2.emit(r7, r0) == r1) goto L21;
                 */
                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.FlowCollector
                @org.jetbrains.annotations.Nullable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final java.lang.Object emit(java.lang.Object r7, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
                    /*
                        r6 = this;
                        boolean r0 = r8 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1 r0 = (com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1 r0 = new com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = pf.b.g()
                        int r2 = r0.label
                        r3 = 2
                        r4 = 1
                        r5 = 0
                        if (r2 == 0) goto L41
                        if (r2 == r4) goto L35
                        if (r2 != r3) goto L2d
                        kotlin.d.b(r8)
                        goto L6e
                    L2d:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L35:
                        java.lang.Object r7 = r0.L$1
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        java.lang.Object r2 = r0.L$0
                        kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                        kotlin.d.b(r8)
                        goto L55
                    L41:
                        kotlin.d.b(r8)
                        kotlinx.coroutines.flow.FlowCollector r2 = r6.$this_unsafeFlow
                        com.unity3d.ads.adplayer.Invocation r7 = (com.unity3d.ads.adplayer.Invocation) r7
                        r0.L$0 = r2
                        r0.L$1 = r7
                        r0.label = r4
                        java.lang.Object r8 = com.unity3d.ads.adplayer.Invocation.handle$default(r7, r5, r0, r4, r5)
                        if (r8 != r1) goto L55
                        goto L6d
                    L55:
                        java.lang.Object[] r7 = r7.getParameters()
                        java.lang.Object r7 = kotlin.collections.ArraysKt.first(r7)
                        java.lang.String r7 = r7.toString()
                        r0.L$0 = r5
                        r0.L$1 = r5
                        r0.label = r3
                        java.lang.Object r7 = r2.emit(r7, r0)
                        if (r7 != r1) goto L6e
                    L6d:
                        return r1
                    L6e:
                        kotlin.Unit r7 = kotlin.Unit.f93236a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer$special$$inlined$map$5.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flow5.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
            }
        };
        this.onBroadcastEvents = flow6;
        Storage.INSTANCE.addStorageEventCallback(function1);
        z.o(adPlayerScope.getCoroutineContext()).q(new Function1<Throwable, Unit>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.1
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
                Storage.INSTANCE.removeStorageEventCallback(WebViewAdPlayer.this.storageEventCallback);
            }
        });
        AdPlayer.Companion companion = AdPlayer.INSTANCE;
        hg.i.F(hg.i.K(flow6, new AnonymousClass2(companion.getBroadcastEventChannel())), getScope());
        hg.i.F(hg.i.K(companion.getBroadcastEventChannel(), new AnonymousClass3(this)), getScope());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00b7, code lost:
    
        if (r2.sendEvent(r1, r4) == r5) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object sendEvent(kotlin.jvm.functions.Function0<? extends com.unity3d.ads.adplayer.model.WebViewEvent> r19, kotlin.coroutines.Continuation r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r20
            r2 = 1
            r3 = 2
            boolean r4 = r1 instanceof com.unity3d.ads.adplayer.WebViewAdPlayer.C47551
            if (r4 == 0) goto L19
            r4 = r1
            com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1 r4 = (com.unity3d.ads.adplayer.WebViewAdPlayer.C47551) r4
            int r5 = r4.label
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L19
            int r5 = r5 - r6
            r4.label = r5
            goto L1e
        L19:
            com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1 r4 = new com.unity3d.ads.adplayer.WebViewAdPlayer$sendEvent$1
            r4.<init>(r1)
        L1e:
            java.lang.Object r1 = r4.result
            java.lang.Object r5 = pf.b.g()
            int r6 = r4.label
            if (r6 == 0) goto L45
            if (r6 == r2) goto L39
            if (r6 != r3) goto L31
            kotlin.d.b(r1)
            goto Lba
        L31:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L39:
            java.lang.Object r6 = r4.L$1
            kotlin.jvm.functions.Function0 r6 = (kotlin.jvm.functions.Function0) r6
            java.lang.Object r7 = r4.L$0
            com.unity3d.ads.adplayer.WebViewAdPlayer r7 = (com.unity3d.ads.adplayer.WebViewAdPlayer) r7
            kotlin.d.b(r1)
            goto L5c
        L45:
            kotlin.d.b(r1)
            kotlinx.coroutines.flow.Flow r1 = r0.getOnLoadEvent()
            r4.L$0 = r0
            r6 = r19
            r4.L$1 = r6
            r4.label = r2
            java.lang.Object r1 = hg.i.S(r1, r4)
            if (r1 != r5) goto L5b
            goto Lb9
        L5b:
            r7 = r0
        L5c:
            com.unity3d.ads.adplayer.model.LoadEvent r1 = (com.unity3d.ads.adplayer.model.LoadEvent) r1
            boolean r8 = r1 instanceof com.unity3d.ads.adplayer.model.LoadEvent.Error
            if (r8 == 0) goto La4
            com.unity3d.ads.core.domain.SendDiagnosticEvent r9 = r7.sendDiagnosticEvent
            java.lang.String r4 = "reason"
            java.lang.String r5 = "adviewer"
            kotlin.Pair r4 = kotlin.TuplesKt.to(r4, r5)
            com.unity3d.ads.adplayer.model.LoadEvent$Error r1 = (com.unity3d.ads.adplayer.model.LoadEvent.Error) r1
            java.lang.String r5 = r1.getMessage()
            java.lang.String r6 = "reason_debug"
            kotlin.Pair r5 = kotlin.TuplesKt.to(r6, r5)
            int r1 = r1.getErrorCode()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r6 = "reason_code"
            kotlin.Pair r1 = kotlin.TuplesKt.to(r6, r1)
            r6 = 3
            kotlin.Pair[] r6 = new kotlin.Pair[r6]
            r7 = 0
            r6[r7] = r4
            r6[r2] = r5
            r6[r3] = r1
            java.util.Map r12 = kotlin.collections.MapsKt.mapOf(r6)
            r16 = 58
            r17 = 0
            java.lang.String r10 = "bridge_send_event_failed"
            r11 = 0
            r13 = 0
            r14 = 0
            r15 = 0
            com.unity3d.ads.core.domain.SendDiagnosticEvent.DefaultImpls.invoke$default(r9, r10, r11, r12, r13, r14, r15, r16, r17)
            kotlin.Unit r1 = kotlin.Unit.f93236a
            return r1
        La4:
            java.lang.Object r1 = r6.invoke()
            com.unity3d.ads.adplayer.model.WebViewEvent r1 = (com.unity3d.ads.adplayer.model.WebViewEvent) r1
            com.unity3d.ads.adplayer.WebViewBridge r2 = r7.bridge
            r6 = 0
            r4.L$0 = r6
            r4.L$1 = r6
            r4.label = r3
            java.lang.Object r1 = r2.sendEvent(r1, r4)
            if (r1 != r5) goto Lba
        Lb9:
            return r5
        Lba:
            kotlin.Unit r1 = kotlin.Unit.f93236a
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer.sendEvent(kotlin.jvm.functions.Function0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @CallSuper
    @Nullable
    public Object destroy(@NotNull Continuation continuation) {
        return AdPlayer.DefaultImpls.destroy(this, continuation);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void dispatchShowCompleted() {
        this.isCompletedManually.setValue(Boolean.TRUE);
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public Flow getOnLoadEvent() {
        return this.onLoadEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public Flow getOnOfferwallEvent() {
        return this.onOfferwallEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public Flow getOnScarEvent() {
        return this.onScarEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public Flow getOnShowEvent() {
        return this.onShowEvent;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public CoroutineScope getScope() {
        return this.scope;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public WebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object onAllowedPiiChange(@NotNull final byte[] bArr, @NotNull Continuation continuation) {
        Object objSendEvent = sendEvent(new Function0<WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.onAllowedPiiChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WebViewEvent invoke() {
                String strEncodeToString = Base64.encodeToString(bArr, 2);
                Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(value, Base64.NO_WRAP)");
                return new OnAllowedPiiChangeEvent(strEncodeToString);
            }
        }, continuation);
        return objSendEvent == pf.b.g() ? objSendEvent : Unit.f93236a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object onBroadcastEvent(@NotNull final String str, @NotNull Continuation continuation) {
        Object objSendEvent = sendEvent(new Function0<WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.onBroadcastEvent.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WebViewEvent invoke() throws JSONException {
                JSONObject jSONObject = new JSONObject(str);
                String eventType = jSONObject.getString("eventType");
                String strOptString = jSONObject.optString("data");
                Intrinsics.checkNotNullExpressionValue(eventType, "eventType");
                return new OnBroadcastEvent(eventType, strOptString);
            }
        }, continuation);
        return objSendEvent == pf.b.g() ? objSendEvent : Unit.f93236a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0185, code lost:
    
        if (r14.request(com.ironsource.C4240b4.i.K, com.ironsource.C4424m2.f43623v, r15, r2) != r3) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object requestShow(@org.jetbrains.annotations.Nullable java.util.Map<java.lang.String, ? extends java.lang.Object> r14, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r15) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 395
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.WebViewAdPlayer.requestShow(java.util.Map, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendActivityDestroyed(@NotNull Continuation continuation) {
        Object objSendEvent = sendEvent(new Function0<WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendActivityDestroyed.2
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WebViewEvent invoke() {
                return new OnActivityDestroyedEvent();
            }
        }, continuation);
        return objSendEvent == pf.b.g() ? objSendEvent : Unit.f93236a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendFocusChange(final boolean z10, @NotNull Continuation continuation) {
        Object objSendEvent = sendEvent(new Function0<WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendFocusChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WebViewEvent invoke() {
                return new OnFocusChangeEvent(z10);
            }
        }, continuation);
        return objSendEvent == pf.b.g() ? objSendEvent : Unit.f93236a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendGmaEvent(@NotNull final com.unity3d.scar.adapter.common.c cVar, @NotNull Continuation continuation) {
        Object objSendEvent = sendEvent(new Function0<WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendGmaEvent.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WebViewEvent invoke() {
                return new OnGmaEvent(cVar);
            }
        }, continuation);
        return objSendEvent == pf.b.g() ? objSendEvent : Unit.f93236a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendMuteChange(final boolean z10, @NotNull Continuation continuation) {
        Object objSendEvent = sendEvent(new Function0<WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendMuteChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WebViewEvent invoke() {
                return new OnMuteChangeEvent(z10);
            }
        }, continuation);
        return objSendEvent == pf.b.g() ? objSendEvent : Unit.f93236a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendOfferwallEvent(@NotNull final OfferwallEvent offerwallEvent, @NotNull Continuation continuation) {
        Object objSendEvent = sendEvent(new Function0<WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendOfferwallEvent.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WebViewEvent invoke() {
                return new OnOfferwallEvent(offerwallEvent);
            }
        }, continuation);
        return objSendEvent == pf.b.g() ? objSendEvent : Unit.f93236a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendPrivacyFsmChange(@NotNull final byte[] bArr, @NotNull Continuation continuation) {
        Object objSendEvent = sendEvent(new Function0<WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendPrivacyFsmChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WebViewEvent invoke() {
                String strEncodeToString = Base64.encodeToString(bArr, 2);
                Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(value, Base64.NO_WRAP)");
                return new OnPrivacyFsmChangeEvent(strEncodeToString);
            }
        }, continuation);
        return objSendEvent == pf.b.g() ? objSendEvent : Unit.f93236a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendScarBannerEvent(@NotNull final BannerBridge.BannerEvent bannerEvent, @NotNull Continuation continuation) {
        Object objSendEvent = sendEvent(new Function0<WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendScarBannerEvent.2
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WebViewEvent invoke() {
                return new OnScarBannerEvent(bannerEvent);
            }
        }, continuation);
        return objSendEvent == pf.b.g() ? objSendEvent : Unit.f93236a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendUserConsentChange(@NotNull final byte[] bArr, @NotNull Continuation continuation) {
        Object objSendEvent = sendEvent(new Function0<WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendUserConsentChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WebViewEvent invoke() {
                String strEncodeToString = Base64.encodeToString(bArr, 2);
                Intrinsics.checkNotNullExpressionValue(strEncodeToString, "encodeToString(value, Base64.NO_WRAP)");
                return new OnUserConsentChangeEvent(strEncodeToString);
            }
        }, continuation);
        return objSendEvent == pf.b.g() ? objSendEvent : Unit.f93236a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendVisibilityChange(final boolean z10, @NotNull Continuation continuation) {
        Object objSendEvent = sendEvent(new Function0<WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendVisibilityChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WebViewEvent invoke() {
                return new OnVisibilityChangeEvent(z10);
            }
        }, continuation);
        return objSendEvent == pf.b.g() ? objSendEvent : Unit.f93236a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @Nullable
    public Object sendVolumeChange(final double d10, @NotNull Continuation continuation) {
        Object objSendEvent = sendEvent(new Function0<WebViewEvent>() { // from class: com.unity3d.ads.adplayer.WebViewAdPlayer.sendVolumeChange.2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function0
            @NotNull
            public final WebViewEvent invoke() {
                return new OnVolumeChangeEvent(d10);
            }
        }, continuation);
        return objSendEvent == pf.b.g() ? objSendEvent : Unit.f93236a;
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    public void show(@NotNull ShowOptions showOptions) {
        AdPlayer.DefaultImpls.show(this, showOptions);
    }
}
