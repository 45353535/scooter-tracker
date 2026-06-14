package com.unity3d.ads.core.data.manager;

import android.content.Context;
import com.ironsource.C4424m2;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.ads.core.domain.scar.CommonScarEventReceiver;
import com.unity3d.ads.core.domain.scar.GmaEventData;
import com.unity3d.ads.core.domain.scar.ScarTimeHackFixer;
import com.unity3d.ads.core.extensions.AdFormatExtensions;
import com.unity3d.scar.adapter.common.c;
import com.unity3d.services.ads.gmascar.GMAScarAdapterBridge;
import com.unity3d.services.ads.gmascar.handlers.BiddingSignalsHandler;
import com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener;
import com.unity3d.services.ads.gmascar.models.BiddingSignals;
import com.unity3d.services.banners.BannerView;
import com.unity3d.services.banners.UnityBannerSize;
import com.unity3d.services.core.di.ServiceProvider;
import com.vungle.ads.internal.protos.Sdk;
import eg.x1;
import gatewayprotocol.v1.AdFormatOuterClass;
import hg.i;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.g;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuation;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012JC\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ=\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010$\u001a\u00020\nH\u0016¢\u0006\u0004\b'\u0010(J%\u0010)\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\nH\u0016¢\u0006\u0004\b)\u0010*R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010+R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010-\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006."}, d2 = {"Lcom/unity3d/ads/core/data/manager/AndroidScarManager;", "Lcom/unity3d/ads/core/data/manager/ScarManager;", "Lcom/unity3d/ads/core/domain/scar/CommonScarEventReceiver;", "scarEventReceiver", "Lcom/unity3d/services/ads/gmascar/GMAScarAdapterBridge;", "gmaBridge", "Lcom/unity3d/ads/core/domain/scar/ScarTimeHackFixer;", "scarTimeHackFixer", "<init>", "(Lcom/unity3d/ads/core/domain/scar/CommonScarEventReceiver;Lcom/unity3d/services/ads/gmascar/GMAScarAdapterBridge;Lcom/unity3d/ads/core/domain/scar/ScarTimeHackFixer;)V", "", "getVersion", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "", "Lgatewayprotocol/v1/AdFormatOuterClass$AdFormat;", "adFormat", "Lcom/unity3d/services/ads/gmascar/models/BiddingSignals;", "getSignals", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "placementId", HandleInvocationsFromAdViewer.KEY_AD_STRING, "adUnitId", HandleInvocationsFromAdViewer.KEY_QUERY_ID, "", "videoLength", "", "loadAd", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/content/Context;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lcom/unity3d/services/banners/BannerView;", "bannerView", "Lm6/c;", "scarAdMetadata", "Lcom/unity3d/services/banners/UnityBannerSize;", "bannerSize", "opportunityId", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/domain/scar/GmaEventData;", "loadBannerAd", "(Landroid/content/Context;Lcom/unity3d/services/banners/BannerView;Lm6/c;Lcom/unity3d/services/banners/UnityBannerSize;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", C4424m2.f43623v, "(Ljava/lang/String;Ljava/lang/String;)Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/domain/scar/CommonScarEventReceiver;", "Lcom/unity3d/services/ads/gmascar/GMAScarAdapterBridge;", "Lcom/unity3d/ads/core/domain/scar/ScarTimeHackFixer;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidScarManager implements ScarManager {

    @NotNull
    private final GMAScarAdapterBridge gmaBridge;

    @NotNull
    private final CommonScarEventReceiver scarEventReceiver;

    @NotNull
    private final ScarTimeHackFixer scarTimeHackFixer;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "Lcom/unity3d/services/ads/gmascar/models/BiddingSignals;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2", f = "AndroidScarManager.kt", l = {134}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ List<AdFormatOuterClass.AdFormat> $adFormat;
        Object L$0;
        Object L$1;
        int label;
        final /* synthetic */ AndroidScarManager this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(List<? extends AdFormatOuterClass.AdFormat> list, AndroidScarManager androidScarManager, Continuation continuation) {
            super(2, continuation);
            this.$adFormat = list;
            this.this$0 = androidScarManager;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass2(this.$adFormat, this.this$0, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            ArrayList arrayList;
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
                return obj;
            }
            d.b(obj);
            List<AdFormatOuterClass.AdFormat> list = this.$adFormat;
            AndroidScarManager androidScarManager = this.this$0;
            this.L$0 = list;
            this.L$1 = androidScarManager;
            this.label = 1;
            final kotlinx.coroutines.e eVar = new kotlinx.coroutines.e(pf.b.d(this), 1);
            eVar.I();
            if (list != null) {
                arrayList = new ArrayList();
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    m6.d unityAdFormat = AdFormatExtensions.toUnityAdFormat((AdFormatOuterClass.AdFormat) it.next());
                    if (unityAdFormat == m6.d.UNSPECIFIED) {
                        unityAdFormat = null;
                    }
                    if (unityAdFormat != null) {
                        arrayList.add(unityAdFormat);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList == null || arrayList.isEmpty()) {
                eVar.resumeWith(Result.b(null));
            } else {
                androidScarManager.gmaBridge.getSCARBiddingSignals(arrayList, new BiddingSignalsHandler(true, new IBiddingSignalsListener() { // from class: com.unity3d.ads.core.data.manager.AndroidScarManager$getSignals$2$1$1
                    @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
                    public void onSignalsFailure(@Nullable String msg) {
                        CancellableContinuation cancellableContinuation = eVar;
                        Result.Companion companion = Result.f93230c;
                        cancellableContinuation.resumeWith(Result.b(d.a(new Exception(msg))));
                    }

                    @Override // com.unity3d.services.ads.gmascar.listeners.IBiddingSignalsListener
                    public void onSignalsReady(@Nullable BiddingSignals signals) {
                        eVar.resumeWith(Result.b(signals));
                    }
                }));
            }
            Object objC = eVar.C();
            if (objC == pf.b.g()) {
                g.c(this);
            }
            return objC == objG ? objG : objC;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2", f = "AndroidScarManager.kt", l = {42}, m = "invokeSuspend")
    static final class C47722 extends k implements Function2<CoroutineScope, Continuation, Object> {
        int label;

        /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\u0010\u0000\u001a\u00020\u0001*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$getVersion$2$1", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
        static final class AnonymousClass1 extends k implements Function2<FlowCollector, Continuation, Object> {
            int label;
            final /* synthetic */ AndroidScarManager this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(AndroidScarManager androidScarManager, Continuation continuation) {
                super(2, continuation);
                this.this$0 = androidScarManager;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                pf.b.g();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
                this.this$0.gmaBridge.getVersion();
                return Unit.f93236a;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Continuation continuation) {
                return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        C47722(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return AndroidScarManager.this.new C47722(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
                return obj;
            }
            d.b(obj);
            SharedFlow sharedFlowM = i.M(AndroidScarManager.this.scarEventReceiver.getVersionFlow(), new AnonymousClass1(AndroidScarManager.this, null));
            this.label = 1;
            Object objX = i.x(sharedFlowM, this);
            return objX == objG ? objG : objX;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((C47722) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager", f = "AndroidScarManager.kt", l = {93}, m = "loadAd")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
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
            return AndroidScarManager.this.loadAd(null, null, null, null, null, 0, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/domain/scar/GmaEventData;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    static final class C47732 extends k implements Function2<FlowCollector, Continuation, Object> {
        final /* synthetic */ String $adString;
        final /* synthetic */ String $adUnitId;
        final /* synthetic */ boolean $canSkip;
        final /* synthetic */ String $placementId;
        final /* synthetic */ String $queryId;
        final /* synthetic */ int $videoLength;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47732(boolean z10, String str, String str2, String str3, String str4, int i10, Continuation continuation) {
            super(2, continuation);
            this.$canSkip = z10;
            this.$placementId = str;
            this.$queryId = str2;
            this.$adString = str3;
            this.$adUnitId = str4;
            this.$videoLength = i10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return AndroidScarManager.this.new C47732(this.$canSkip, this.$placementId, this.$queryId, this.$adString, this.$adUnitId, this.$videoLength, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            AndroidScarManager.this.gmaBridge.load(this.$canSkip, this.$placementId, this.$queryId, this.$adString, this.$adUnitId, AndroidScarManager.this.scarTimeHackFixer.invoke(this.$videoLength));
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Continuation continuation) {
            return ((C47732) create(flowCollector, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/domain/scar/GmaEventData;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass3 extends k implements Function2<GmaEventData, Continuation, Object> {
        final /* synthetic */ String $placementId;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(String str, Continuation continuation) {
            super(2, continuation);
            this.$placementId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$placementId, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull GmaEventData gmaEventData, @Nullable Continuation continuation) {
            return ((AnonymousClass3) create(gmaEventData, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            boolean z10 = true;
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            GmaEventData gmaEventData = (GmaEventData) this.L$0;
            if ((!CollectionsKt.listOf((Object[]) new c[]{c.AD_LOADED, c.LOAD_ERROR}).contains(gmaEventData.getGmaEvent()) || !Intrinsics.areEqual(gmaEventData.getPlacementId(), this.$placementId)) && !CollectionsKt.listOf((Object[]) new c[]{c.METHOD_ERROR, c.SCAR_NOT_PRESENT, c.INTERNAL_LOAD_ERROR}).contains(gmaEventData.getGmaEvent())) {
                z10 = false;
            }
            return kotlin.coroutines.jvm.internal.b.a(z10);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/domain/scar/GmaEventData;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$1", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    static final class C47741 extends k implements Function2<FlowCollector, Continuation, Object> {
        final /* synthetic */ UnityBannerSize $bannerSize;
        final /* synthetic */ BannerView $bannerView;
        final /* synthetic */ Context $context;
        final /* synthetic */ String $opportunityId;
        final /* synthetic */ m6.c $scarAdMetadata;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47741(Context context, BannerView bannerView, String str, m6.c cVar, UnityBannerSize unityBannerSize, Continuation continuation) {
            super(2, continuation);
            this.$context = context;
            this.$bannerView = bannerView;
            this.$opportunityId = str;
            this.$scarAdMetadata = cVar;
            this.$bannerSize = unityBannerSize;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return AndroidScarManager.this.new C47741(this.$context, this.$bannerView, this.$opportunityId, this.$scarAdMetadata, this.$bannerSize, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            AndroidScarManager.this.gmaBridge.loadBanner(this.$context, this.$bannerView, this.$opportunityId, this.$scarAdMetadata, this.$bannerSize);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Continuation continuation) {
            return ((C47741) create(flowCollector, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$show$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/domain/scar/GmaEventData;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$show$1", f = "AndroidScarManager.kt", l = {}, m = "invokeSuspend")
    static final class C47751 extends k implements Function2<FlowCollector, Continuation, Object> {
        final /* synthetic */ String $placementId;
        final /* synthetic */ String $queryId;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47751(String str, String str2, Continuation continuation) {
            super(2, continuation);
            this.$placementId = str;
            this.$queryId = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return AndroidScarManager.this.new C47751(this.$placementId, this.$queryId, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            AndroidScarManager.this.gmaBridge.show(this.$placementId, this.$queryId);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Continuation continuation) {
            return ((C47751) create(flowCollector, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$show$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/domain/scar/GmaEventData;", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$show$2", f = "AndroidScarManager.kt", l = {127}, m = "invokeSuspend")
    static final class C47762 extends k implements Function3<FlowCollector, GmaEventData, Continuation, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C47762(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            GmaEventData gmaEventData;
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                GmaEventData gmaEventData2 = (GmaEventData) this.L$1;
                this.L$0 = gmaEventData2;
                this.label = 1;
                if (flowCollector.emit(gmaEventData2, this) == objG) {
                    return objG;
                }
                gmaEventData = gmaEventData2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gmaEventData = (GmaEventData) this.L$0;
                d.b(obj);
            }
            return kotlin.coroutines.jvm.internal.b.a(!ArraysKt.contains(new c[]{c.AD_CLOSED, c.NO_AD_ERROR, c.INTERSTITIAL_SHOW_ERROR, c.REWARDED_SHOW_ERROR}, gmaEventData.getGmaEvent()));
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        public final Object invoke(@NotNull FlowCollector flowCollector, @NotNull GmaEventData gmaEventData, @Nullable Continuation continuation) {
            C47762 c47762 = new C47762(continuation);
            c47762.L$0 = flowCollector;
            c47762.L$1 = gmaEventData;
            return c47762.invokeSuspend(Unit.f93236a);
        }
    }

    public AndroidScarManager(@NotNull CommonScarEventReceiver scarEventReceiver, @NotNull GMAScarAdapterBridge gmaBridge, @NotNull ScarTimeHackFixer scarTimeHackFixer) {
        Intrinsics.checkNotNullParameter(scarEventReceiver, "scarEventReceiver");
        Intrinsics.checkNotNullParameter(gmaBridge, "gmaBridge");
        Intrinsics.checkNotNullParameter(scarTimeHackFixer, "scarTimeHackFixer");
        this.scarEventReceiver = scarEventReceiver;
        this.gmaBridge = gmaBridge;
        this.scarTimeHackFixer = scarTimeHackFixer;
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    @Nullable
    public Object getSignals(@Nullable List<? extends AdFormatOuterClass.AdFormat> list, @NotNull Continuation continuation) {
        return x1.e(ServiceProvider.SCAR_SIGNALS_FETCH_TIMEOUT, new AnonymousClass2(list, this, null), continuation);
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    @Nullable
    public Object getVersion(@NotNull Continuation continuation) {
        return x1.e(5000L, new C47722(null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0016  */
    @Override // com.unity3d.ads.core.data.manager.ScarManager
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object loadAd(@org.jetbrains.annotations.NotNull java.lang.String r15, @org.jetbrains.annotations.NotNull java.lang.String r16, @org.jetbrains.annotations.NotNull java.lang.String r17, @org.jetbrains.annotations.NotNull java.lang.String r18, @org.jetbrains.annotations.NotNull java.lang.String r19, int r20, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r21) throws com.unity3d.ads.core.data.model.exception.LoadException {
        /*
            r14 = this;
            r0 = r21
            boolean r2 = r0 instanceof com.unity3d.ads.core.data.manager.AndroidScarManager.AnonymousClass1
            if (r2 == 0) goto L16
            r2 = r0
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1 r2 = (com.unity3d.ads.core.data.manager.AndroidScarManager.AnonymousClass1) r2
            int r3 = r2.label
            r4 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r3 & r4
            if (r5 == 0) goto L16
            int r3 = r3 - r4
            r2.label = r3
        L14:
            r9 = r2
            goto L1c
        L16:
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1 r2 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$1
            r2.<init>(r0)
            goto L14
        L1c:
            java.lang.Object r0 = r9.result
            java.lang.Object r10 = pf.b.g()
            int r2 = r9.label
            r11 = 0
            r12 = 1
            if (r2 == 0) goto L36
            if (r2 != r12) goto L2e
            kotlin.d.b(r0)
            goto L6c
        L2e:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L36:
            kotlin.d.b(r0)
            m6.d r0 = m6.d.INTERSTITIAL
            java.lang.String r0 = r0.toString()
            boolean r2 = kotlin.text.StringsKt.N(r15, r0, r12)
            com.unity3d.ads.core.domain.scar.CommonScarEventReceiver r0 = r14.scarEventReceiver
            kotlinx.coroutines.flow.SharedFlow r13 = r0.getGmaEventFlow()
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2 r0 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$2
            r8 = 0
            r1 = r14
            r3 = r16
            r5 = r17
            r6 = r18
            r4 = r19
            r7 = r20
            r0.<init>(r2, r3, r4, r5, r6, r7, r8)
            kotlinx.coroutines.flow.SharedFlow r0 = hg.i.M(r13, r0)
            com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3 r1 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadAd$3
            r1.<init>(r3, r11)
            r9.label = r12
            java.lang.Object r0 = hg.i.y(r0, r1, r9)
            if (r0 != r10) goto L6c
            return r10
        L6c:
            r1 = r0
            com.unity3d.ads.core.domain.scar.GmaEventData r1 = (com.unity3d.ads.core.domain.scar.GmaEventData) r1
            com.unity3d.scar.adapter.common.c r1 = r1.getGmaEvent()
            com.unity3d.scar.adapter.common.c r2 = com.unity3d.scar.adapter.common.c.AD_LOADED
            if (r1 == r2) goto L78
            r11 = r0
        L78:
            com.unity3d.ads.core.domain.scar.GmaEventData r11 = (com.unity3d.ads.core.domain.scar.GmaEventData) r11
            if (r11 == 0) goto L9e
            com.unity3d.ads.core.data.model.exception.LoadException r0 = new com.unity3d.ads.core.data.model.exception.LoadException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Error loading SCAR ad: "
            r1.append(r2)
            java.lang.String r2 = r11.getErrorMessage()
            if (r2 != 0) goto L92
            com.unity3d.scar.adapter.common.c r2 = r11.getGmaEvent()
        L92:
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r2 = 0
            r0.<init>(r2, r1)
            throw r0
        L9e:
            kotlin.Unit r0 = kotlin.Unit.f93236a
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidScarManager.loadAd(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    @NotNull
    public Flow loadBannerAd(@NotNull Context context, @NotNull BannerView bannerView, @NotNull m6.c scarAdMetadata, @NotNull UnityBannerSize bannerSize, @NotNull final String opportunityId) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bannerView, "bannerView");
        Intrinsics.checkNotNullParameter(scarAdMetadata, "scarAdMetadata");
        Intrinsics.checkNotNullParameter(bannerSize, "bannerSize");
        Intrinsics.checkNotNullParameter(opportunityId, "opportunityId");
        final Flow flowL = i.L(this.scarEventReceiver.getGmaEventFlow(), new C47741(context, bannerView, opportunityId, scarAdMetadata, bannerSize, null));
        return new Flow() { // from class: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1

            /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ String $opportunityId$inlined;
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @e(c = "com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2", f = "AndroidScarManager.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
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

                public AnonymousClass2(FlowCollector flowCollector, String str) {
                    this.$this_unsafeFlow = flowCollector;
                    this.$opportunityId$inlined = str;
                }

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
                        boolean r0 = r8 instanceof com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r8
                        com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1$2$1
                        r0.<init>(r8)
                    L18:
                        java.lang.Object r8 = r0.result
                        java.lang.Object r1 = pf.b.g()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.d.b(r8)
                        goto L56
                    L29:
                        java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                        java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                        r7.<init>(r8)
                        throw r7
                    L31:
                        kotlin.d.b(r8)
                        kotlinx.coroutines.flow.FlowCollector r8 = r6.$this_unsafeFlow
                        r2 = r7
                        com.unity3d.ads.core.domain.scar.GmaEventData r2 = (com.unity3d.ads.core.domain.scar.GmaEventData) r2
                        com.unity3d.scar.adapter.common.c r4 = r2.getGmaEvent()
                        com.unity3d.scar.adapter.common.c r5 = com.unity3d.scar.adapter.common.c.BANNER
                        if (r4 != r5) goto L56
                        java.lang.String r2 = r2.getOpportunityId()
                        java.lang.String r4 = r6.$opportunityId$inlined
                        boolean r2 = kotlin.jvm.internal.Intrinsics.areEqual(r2, r4)
                        if (r2 == 0) goto L56
                        r0.label = r3
                        java.lang.Object r7 = r8.emit(r7, r0)
                        if (r7 != r1) goto L56
                        return r1
                    L56:
                        kotlin.Unit r7 = kotlin.Unit.f93236a
                        return r7
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidScarManager$loadBannerAd$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowL.collect(new AnonymousClass2(flowCollector, opportunityId), continuation);
                return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
            }
        };
    }

    @Override // com.unity3d.ads.core.data.manager.ScarManager
    @NotNull
    public Flow show(@NotNull String placementId, @NotNull String queryId) {
        Intrinsics.checkNotNullParameter(placementId, "placementId");
        Intrinsics.checkNotNullParameter(queryId, "queryId");
        return i.X(i.M(this.scarEventReceiver.getGmaEventFlow(), new C47751(placementId, queryId, null)), new C47762(null));
    }
}
