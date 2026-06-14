package com.unity3d.ads.adplayer;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import androidx.core.view.ViewCompat;
import com.ironsource.C4329g8;
import com.ironsource.C4424m2;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.ads.core.data.datasource.LifecycleDataSource;
import com.unity3d.ads.core.data.manager.ScarManager;
import com.unity3d.ads.core.data.repository.OpenMeasurementRepository;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.BannerViewCache;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.banners.bridge.BannerBridge;
import com.unity3d.services.core.misc.ViewUtilities;
import eg.i;
import hg.g0;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000°\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B?\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013H\u0096\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0005H\u0096Aø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010 \u001a\u00020\u00132\u0016\u0010\u001f\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u001e\u0018\u00010\u001dH\u0096Aø\u0001\u0000¢\u0006\u0004\b \u0010!J\u0013\u0010\"\u001a\u00020\u0013H\u0096Aø\u0001\u0000¢\u0006\u0004\b\"\u0010#J\u001b\u0010&\u001a\u00020\u00132\u0006\u0010%\u001a\u00020$H\u0096Aø\u0001\u0000¢\u0006\u0004\b&\u0010'J\u001b\u0010)\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020(H\u0096Aø\u0001\u0000¢\u0006\u0004\b)\u0010*J\u001b\u0010,\u001a\u00020\u00132\u0006\u0010+\u001a\u00020$H\u0096Aø\u0001\u0000¢\u0006\u0004\b,\u0010'J\u001b\u0010.\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020-H\u0096Aø\u0001\u0000¢\u0006\u0004\b.\u0010/J\u001b\u00100\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0096Aø\u0001\u0000¢\u0006\u0004\b0\u0010\u0019J\u001b\u00102\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u000201H\u0096Aø\u0001\u0000¢\u0006\u0004\b2\u00103J\u001b\u00104\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0016H\u0096Aø\u0001\u0000¢\u0006\u0004\b4\u0010\u0019J\u001b\u00106\u001a\u00020\u00132\u0006\u00105\u001a\u00020$H\u0096Aø\u0001\u0000¢\u0006\u0004\b6\u0010'J\u001b\u00109\u001a\u00020\u00132\u0006\u00108\u001a\u000207H\u0096Aø\u0001\u0000¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\u00020\u00132\u0006\u0010<\u001a\u00020;H\u0016¢\u0006\u0004\b=\u0010>J\u0013\u0010?\u001a\u00020\u0013H\u0096@ø\u0001\u0000¢\u0006\u0004\b?\u0010#R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010@R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010AR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010B\u001a\u0004\bC\u0010DR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010ER\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010FR\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010GR\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010HR\u001a\u0010M\u001a\b\u0012\u0004\u0012\u00020J0I8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bK\u0010LR\u001a\u0010P\u001a\b\u0012\u0004\u0012\u00020N0I8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bO\u0010LR\u001a\u0010S\u001a\b\u0012\u0004\u0012\u00020Q0I8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bR\u0010LR\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020T0I8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bU\u0010LR\u0014\u0010Z\u001a\u00020W8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bX\u0010Y\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006["}, d2 = {"Lcom/unity3d/ads/adplayer/AndroidEmbeddableWebViewAdPlayer;", "Lcom/unity3d/ads/adplayer/AdPlayer;", "Lcom/unity3d/ads/adplayer/EmbeddableAdPlayer;", "Lcom/unity3d/ads/adplayer/WebViewAdPlayer;", "webViewAdPlayer", "", "opportunityId", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "webViewContainer", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "openMeasurementRepository", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "scarManager", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "lifecycleDataSource", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "<init>", "(Lcom/unity3d/ads/adplayer/WebViewAdPlayer;Ljava/lang/String;Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;Lcom/unity3d/ads/core/data/manager/ScarManager;Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;Landroid/content/Context;)V", "", "dispatchShowCompleted", "()V", "", "value", "onAllowedPiiChange", "([BLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "event", "onBroadcastEvent", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "", "unityAdsShowOptions", "requestShow", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendActivityDestroyed", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "isFocused", "sendFocusChange", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/unity3d/scar/adapter/common/c;", "sendGmaEvent", "(Lcom/unity3d/scar/adapter/common/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isMuted", "sendMuteChange", "Lcom/unity3d/services/ads/offerwall/OfferwallEvent;", "sendOfferwallEvent", "(Lcom/unity3d/services/ads/offerwall/OfferwallEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendPrivacyFsmChange", "Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;", "sendScarBannerEvent", "(Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "sendUserConsentChange", C4329g8.f43166k, "sendVisibilityChange", "", "volume", "sendVolumeChange", "(DLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/unity3d/ads/adplayer/ShowOptions;", "showOptions", C4424m2.f43623v, "(Lcom/unity3d/ads/adplayer/ShowOptions;)V", "destroy", "Lcom/unity3d/ads/adplayer/WebViewAdPlayer;", "Ljava/lang/String;", "Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "getWebViewContainer", "()Lcom/unity3d/ads/adplayer/AndroidWebViewContainer;", "Lcom/unity3d/ads/core/data/repository/OpenMeasurementRepository;", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "Lcom/unity3d/ads/core/data/datasource/LifecycleDataSource;", "Landroid/content/Context;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/adplayer/model/LoadEvent;", "getOnLoadEvent", "()Lkotlinx/coroutines/flow/Flow;", "onLoadEvent", "Lcom/unity3d/ads/core/data/model/OfferwallShowEvent;", "getOnOfferwallEvent", "onOfferwallEvent", "Lcom/unity3d/ads/core/data/model/ScarEvent;", "getOnScarEvent", "onScarEvent", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "getOnShowEvent", "onShowEvent", "Lkotlinx/coroutines/CoroutineScope;", "getScope", "()Lkotlinx/coroutines/CoroutineScope;", "scope", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidEmbeddableWebViewAdPlayer implements AdPlayer, EmbeddableAdPlayer {

    @NotNull
    private final Context context;

    @NotNull
    private final LifecycleDataSource lifecycleDataSource;

    @NotNull
    private final OpenMeasurementRepository openMeasurementRepository;

    @NotNull
    private final String opportunityId;

    @NotNull
    private final ScarManager scarManager;

    @NotNull
    private final WebViewAdPlayer webViewAdPlayer;

    @NotNull
    private final AndroidWebViewContainer webViewContainer;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {125, 128, 130}, m = "destroy")
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
            return AndroidEmbeddableWebViewAdPlayer.this.destroy(this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$2", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ BannerView $bannerView;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(BannerView bannerView, Continuation continuation) {
            super(2, continuation);
            this.$bannerView = bannerView;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return AndroidEmbeddableWebViewAdPlayer.this.new AnonymousClass2(this.$bannerView, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            AndroidEmbeddableWebViewAdPlayer.this.getWebViewContainer().getWebView().setLayoutParams(new ViewGroup.LayoutParams((int) ViewUtilities.pxFromDp(AndroidEmbeddableWebViewAdPlayer.this.context, this.$bannerView.getSize().getWidth()), (int) ViewUtilities.pxFromDp(AndroidEmbeddableWebViewAdPlayer.this.context, this.$bannerView.getSize().getHeight())));
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$4", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass4 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ BannerView $bannerView;
        int label;
        final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(BannerView bannerView, AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, Continuation continuation) {
            super(2, continuation);
            this.$bannerView = bannerView;
            this.this$0 = androidEmbeddableWebViewAdPlayer;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass4(this.$bannerView, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            this.$bannerView.addView(this.this$0.getWebViewContainer().getWebView());
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass4) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public AndroidEmbeddableWebViewAdPlayer(@NotNull WebViewAdPlayer webViewAdPlayer, @NotNull String opportunityId, @NotNull AndroidWebViewContainer webViewContainer, @NotNull OpenMeasurementRepository openMeasurementRepository, @NotNull ScarManager scarManager, @NotNull LifecycleDataSource lifecycleDataSource, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(webViewAdPlayer, "webViewAdPlayer");
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        Intrinsics.checkNotNullParameter(webViewContainer, "webViewContainer");
        Intrinsics.checkNotNullParameter(openMeasurementRepository, "openMeasurementRepository");
        Intrinsics.checkNotNullParameter(scarManager, "scarManager");
        Intrinsics.checkNotNullParameter(lifecycleDataSource, "lifecycleDataSource");
        Intrinsics.checkNotNullParameter(context, "context");
        this.webViewAdPlayer = webViewAdPlayer;
        this.opportunityId = opportunityId;
        this.webViewContainer = webViewContainer;
        this.openMeasurementRepository = openMeasurementRepository;
        this.scarManager = scarManager;
        this.lifecycleDataSource = lifecycleDataSource;
        this.context = context;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        if (eg.k0.a(1000, r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0083, code lost:
    
        if (com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r2, r0) != r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.adplayer.AdPlayer
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object destroy(@org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r8
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1 r0 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1 r0 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$destroy$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3f
            if (r2 == r4) goto L37
            if (r2 != r3) goto L2f
            kotlin.d.b(r8)
            goto L86
        L2f:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L37:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer) r2
            kotlin.d.b(r8)
            goto L7a
        L3f:
            java.lang.Object r2 = r0.L$0
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r2 = (com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer) r2
            kotlin.d.b(r8)
            goto L6b
        L47:
            kotlin.d.b(r8)
            com.unity3d.ads.adplayer.WebViewAdPlayer r8 = r7.webViewAdPlayer
            r8.dispatchShowCompleted()
            com.unity3d.ads.core.data.repository.OpenMeasurementRepository r8 = r7.openMeasurementRepository
            java.lang.String r2 = r7.opportunityId
            com.google.protobuf.ByteString r2 = com.google.protobuf.kotlin.ByteStringsKt.toByteStringUtf8(r2)
            boolean r8 = r8.hasSessionFinished(r2)
            if (r8 == 0) goto L6a
            r0.L$0 = r7
            r0.label = r5
            r5 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r8 = eg.k0.a(r5, r0)
            if (r8 != r1) goto L6a
            goto L85
        L6a:
            r2 = r7
        L6b:
            com.unity3d.ads.adplayer.AndroidWebViewContainer r8 = r2.getWebViewContainer()
            r0.L$0 = r2
            r0.label = r4
            java.lang.Object r8 = r8.destroy(r0)
            if (r8 != r1) goto L7a
            goto L85
        L7a:
            r8 = 0
            r0.L$0 = r8
            r0.label = r3
            java.lang.Object r8 = com.unity3d.ads.adplayer.AdPlayer.DefaultImpls.destroy(r2, r0)
            if (r8 != r1) goto L86
        L85:
            return r1
        L86:
            kotlin.Unit r8 = kotlin.Unit.f93236a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.destroy(kotlin.coroutines.Continuation):java.lang.Object");
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
    public void show(@NotNull final ShowOptions showOptions) {
        Intrinsics.checkNotNullParameter(showOptions, "showOptions");
        if (!(showOptions instanceof AndroidShowOptions)) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        BannerViewCache bannerViewCache = BannerViewCache.getInstance();
        final BannerView bannerView = bannerViewCache.getBannerView(this.opportunityId);
        if (bannerView == null) {
            throw new IllegalStateException((bannerViewCache.isBannerViewDeleted(this.opportunityId) ? "BannerView has been deleted" : "BannerView not found").toString());
        }
        AndroidShowOptions androidShowOptions = (AndroidShowOptions) showOptions;
        if (!androidShowOptions.isScarAd()) {
            i.d(kotlinx.coroutines.i.b(), null, null, new AnonymousClass2(bannerView, null), 3, null);
            final WebView webView = getWebViewContainer().getWebView();
            if (ViewCompat.isAttachedToWindow(webView)) {
                i.d(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$3$1(this, showOptions, null), 3, null);
                if (ViewCompat.isAttachedToWindow(webView)) {
                    webView.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$4$$inlined$doOnDetach$1(webView, this));
                } else {
                    i.d(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$3$2$1(this, null), 3, null);
                }
            } else {
                webView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$2
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(@NotNull View view) {
                        Intrinsics.checkNotNullParameter(view, "view");
                        webView.removeOnAttachStateChangeListener(this);
                        i.d(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$3$1(this, showOptions, null), 3, null);
                        if (ViewCompat.isAttachedToWindow(view)) {
                            view.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$4$$inlined$doOnDetach$1(view, this));
                        } else {
                            i.d(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$3$2$1(this, null), 3, null);
                        }
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(@NotNull View view) {
                        Intrinsics.checkNotNullParameter(view, "view");
                    }
                });
            }
            i.d(kotlinx.coroutines.i.b(), null, null, new AnonymousClass4(bannerView, this, null), 3, null);
            return;
        }
        String placementId = androidShowOptions.getPlacementId();
        if (placementId == null) {
            placementId = "";
        }
        String scarQueryId = androidShowOptions.getScarQueryId();
        if (scarQueryId == null) {
            scarQueryId = "";
        }
        String scarAdUnitId = androidShowOptions.getScarAdUnitId();
        if (scarAdUnitId == null) {
            scarAdUnitId = "";
        }
        String scarAdString = androidShowOptions.getScarAdString();
        m6.c cVar = new m6.c(placementId, scarQueryId, scarAdUnitId, scarAdString == null ? "" : scarAdString, 0);
        ScarManager scarManager = this.scarManager;
        Context context = this.context;
        UnityBannerSize size = bannerView.getSize();
        Intrinsics.checkNotNullExpressionValue(size, "bannerView.size");
        final SharedFlow sharedFlowR = hg.i.R(scarManager.loadBannerAd(context, bannerView, cVar, size, this.opportunityId), getScope(), g0.f73226a.c(), 10);
        if (!ViewCompat.isAttachedToWindow(bannerView)) {
            bannerView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$$inlined$doOnAttach$1
                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewAttachedToWindow(@NotNull View view) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    bannerView.removeOnAttachStateChangeListener(this);
                    i.d(this.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$1$1(this, sharedFlowR, showOptions, null), 3, null);
                    BannerView bannerView2 = bannerView;
                    if (ViewCompat.isAttachedToWindow(bannerView2)) {
                        bannerView2.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(bannerView2, this));
                    } else {
                        i.d(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$1$2$1(this, null), 3, null);
                    }
                }

                @Override // android.view.View.OnAttachStateChangeListener
                public void onViewDetachedFromWindow(@NotNull View view) {
                    Intrinsics.checkNotNullParameter(view, "view");
                }
            });
            return;
        }
        i.d(getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$1$1(this, sharedFlowR, showOptions, null), 3, null);
        if (ViewCompat.isAttachedToWindow(bannerView)) {
            bannerView.addOnAttachStateChangeListener(new AndroidEmbeddableWebViewAdPlayer$show$lambda$2$$inlined$doOnDetach$1(bannerView, this));
        } else {
            i.d(this.webViewAdPlayer.getScope(), null, null, new AndroidEmbeddableWebViewAdPlayer$show$1$2$1(this, null), 3, null);
        }
    }

    @Override // com.unity3d.ads.adplayer.AdPlayer
    @NotNull
    public AndroidWebViewContainer getWebViewContainer() {
        return this.webViewContainer;
    }
}
