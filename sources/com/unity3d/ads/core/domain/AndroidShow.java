package com.unity3d.ads.core.domain;

import com.google.protobuf.ByteString;
import com.unity3d.ads.UnityAdsShowOptions;
import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.configuration.GameServerIdReader;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import com.unity3d.ads.core.data.model.ShowEvent;
import com.unity3d.ads.core.data.repository.AdRepository;
import com.unity3d.ads.core.domain.SendDiagnosticEvent;
import hg.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ!\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidShow;", "Lcom/unity3d/ads/core/domain/Show;", "adRepository", "Lcom/unity3d/ads/core/data/repository/AdRepository;", "gameServerIdReader", "Lcom/unity3d/ads/core/configuration/GameServerIdReader;", "sendDiagnosticEvent", "Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;", "(Lcom/unity3d/ads/core/data/repository/AdRepository;Lcom/unity3d/ads/core/configuration/GameServerIdReader;Lcom/unity3d/ads/core/domain/SendDiagnosticEvent;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "adObject", "Lcom/unity3d/ads/core/data/model/AdObject;", "showOptions", "Lcom/unity3d/ads/UnityAdsShowOptions;", "terminate", "", "(Lcom/unity3d/ads/core/data/model/AdObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidShow implements Show {

    @NotNull
    private final AdRepository adRepository;

    @NotNull
    private final GameServerIdReader gameServerIdReader;

    @NotNull
    private final SendDiagnosticEvent sendDiagnosticEvent;

    /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/data/model/ShowEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1", f = "AndroidShow.kt", l = {57}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<FlowCollector, Continuation, Object> {
        final /* synthetic */ AdObject $adObject;
        final /* synthetic */ UnityAdsShowOptions $showOptions;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ AndroidShow this$0;

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/data/model/ShowEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$2", f = "AndroidShow.kt", l = {}, m = "invokeSuspend")
        static final class AnonymousClass2 extends k implements Function2<FlowCollector, Continuation, Object> {
            final /* synthetic */ AdObject $ad;
            final /* synthetic */ AdObject $adObject;
            final /* synthetic */ UnityAdsShowOptions $showOptions;
            int label;
            final /* synthetic */ AndroidShow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AdObject adObject, AndroidShow androidShow, AdObject adObject2, UnityAdsShowOptions unityAdsShowOptions, Continuation continuation) {
                super(2, continuation);
                this.$ad = adObject;
                this.this$0 = androidShow;
                this.$adObject = adObject2;
                this.$showOptions = unityAdsShowOptions;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                return new AnonymousClass2(this.$ad, this.this$0, this.$adObject, this.$showOptions, continuation);
            }

            /* JADX WARN: Removed duplicated region for block: B:11:0x002e  */
            @Override // kotlin.coroutines.jvm.internal.a
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) {
                /*
                    r13 = this;
                    pf.b.g()
                    int r0 = r13.label
                    if (r0 != 0) goto La5
                    kotlin.d.b(r14)
                    com.unity3d.ads.core.data.model.AdObject r14 = r13.$ad
                    com.unity3d.ads.core.domain.AndroidShow r0 = r13.this$0
                    com.unity3d.ads.core.configuration.GameServerIdReader r0 = com.unity3d.ads.core.domain.AndroidShow.access$getGameServerIdReader$p(r0)
                    com.unity3d.services.core.misc.JsonStorage r1 = r0.getJsonStorage()
                    java.lang.String r2 = r0.getKey()
                    java.lang.Object r1 = r1.get(r2)
                    java.lang.String r2 = "get(key)"
                    r3 = 0
                    if (r1 == 0) goto L2e
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
                    boolean r4 = r1 instanceof java.lang.String
                    if (r4 == 0) goto L2b
                    goto L2c
                L2b:
                    r1 = r3
                L2c:
                    if (r1 != 0) goto L2f
                L2e:
                    r1 = r3
                L2f:
                    com.unity3d.services.core.misc.JsonStorage r4 = r0.getJsonStorage()
                    java.lang.String r5 = r0.getKey()
                    java.lang.Object r4 = r4.get(r5)
                    if (r4 == 0) goto L4b
                    kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r4, r2)
                    com.unity3d.services.core.misc.JsonStorage r2 = r0.getJsonStorage()
                    java.lang.String r0 = r0.getKey()
                    r2.delete(r0)
                L4b:
                    java.lang.String r1 = (java.lang.String) r1
                    r14.setPlayerServerId(r1)
                    com.unity3d.ads.core.data.model.AdObject r14 = r13.$adObject
                    kotlinx.coroutines.flow.MutableStateFlow r14 = r14.getState()
                    com.unity3d.ads.core.data.model.AdObjectState r0 = com.unity3d.ads.core.data.model.AdObjectState.SHOWING
                    r14.setValue(r0)
                    com.unity3d.ads.core.data.model.AdObject r14 = r13.$ad
                    com.unity3d.ads.adplayer.AdPlayer r14 = r14.getAdPlayer()
                    com.unity3d.ads.UnityAdsShowOptions r0 = r13.$showOptions
                    if (r0 == 0) goto L6f
                    org.json.JSONObject r0 = r0.getData()
                    if (r0 == 0) goto L6f
                    java.util.Map r3 = com.unity3d.ads.core.extensions.JSONObjectExtensionsKt.toBuiltInMap(r0)
                L6f:
                    r5 = r3
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    boolean r7 = r0.isScarAd()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r9 = r0.getScarAdString()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r8 = r0.getScarQueryId()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r10 = r0.getScarAdUnitId()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    boolean r11 = r0.isOfferwallAd()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r12 = r0.getOfferwallPlacementName()
                    com.unity3d.ads.core.data.model.AdObject r0 = r13.$ad
                    java.lang.String r6 = r0.getPlacementId()
                    com.unity3d.ads.adplayer.AndroidShowOptions r4 = new com.unity3d.ads.adplayer.AndroidShowOptions
                    r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12)
                    r14.show(r4)
                    kotlin.Unit r14 = kotlin.Unit.f93236a
                    return r14
                La5:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r0)
                    throw r14
                */
                throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.AndroidShow.AnonymousClass1.AnonymousClass2.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Continuation continuation) {
                return ((AnonymousClass2) create(flowCollector, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "it", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$3", f = "AndroidShow.kt", l = {}, m = "invokeSuspend")
        static final class AnonymousClass3 extends k implements Function3<FlowCollector, Throwable, Continuation, Object> {
            final /* synthetic */ AdObject $adObject;
            final /* synthetic */ ByteString $opportunityId;
            int label;
            final /* synthetic */ AndroidShow this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(AdObject adObject, AndroidShow androidShow, ByteString byteString, Continuation continuation) {
                super(3, continuation);
                this.$adObject = adObject;
                this.this$0 = androidShow;
                this.$opportunityId = byteString;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                b.g();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
                this.$adObject.getState().setValue(AdObjectState.COMPLETED);
                this.this$0.adRepository.removeAd(this.$opportunityId);
                return Unit.f93236a;
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Throwable th2, @Nullable Continuation continuation) {
                return new AnonymousClass3(this.$adObject, this.this$0, this.$opportunityId, continuation).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX INFO: renamed from: com.unity3d.ads.core.domain.AndroidShow$invoke$1$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/data/model/ShowEvent;", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "com.unity3d.ads.core.domain.AndroidShow$invoke$1$4", f = "AndroidShow.kt", l = {54}, m = "invokeSuspend")
        static final class AnonymousClass4 extends k implements Function3<FlowCollector, ShowEvent, Continuation, Object> {
            private /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;

            AnonymousClass4(Continuation continuation) {
                super(3, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                ShowEvent showEvent;
                Object objG = b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    d.b(obj);
                    FlowCollector flowCollector = (FlowCollector) this.L$0;
                    ShowEvent showEvent2 = (ShowEvent) this.L$1;
                    this.L$0 = showEvent2;
                    this.label = 1;
                    if (flowCollector.emit(showEvent2, this) == objG) {
                        return objG;
                    }
                    showEvent = showEvent2;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    showEvent = (ShowEvent) this.L$0;
                    d.b(obj);
                }
                return kotlin.coroutines.jvm.internal.b.a(((showEvent instanceof ShowEvent.Completed) || (showEvent instanceof ShowEvent.Error)) ? false : true);
            }

            @Override // kotlin.jvm.functions.Function3
            @Nullable
            public final Object invoke(@NotNull FlowCollector flowCollector, @NotNull ShowEvent showEvent, @Nullable Continuation continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
                anonymousClass4.L$0 = flowCollector;
                anonymousClass4.L$1 = showEvent;
                return anonymousClass4.invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AdObject adObject, AndroidShow androidShow, UnityAdsShowOptions unityAdsShowOptions, Continuation continuation) {
            super(2, continuation);
            this.$adObject = adObject;
            this.this$0 = androidShow;
            this.$showOptions = unityAdsShowOptions;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$adObject, this.this$0, this.$showOptions, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                final FlowCollector flowCollector = (FlowCollector) this.L$0;
                if (this.$adObject.getOpportunityId().isEmpty()) {
                    throw new IllegalArgumentException("No opportunityId");
                }
                ByteString opportunityId = this.$adObject.getOpportunityId();
                AdObject ad2 = this.this$0.adRepository.getAd(opportunityId);
                if (ad2 == null) {
                    throw new IllegalStateException("No ad associated with opportunityId");
                }
                SendDiagnosticEvent.DefaultImpls.invoke$default(this.this$0.sendDiagnosticEvent, "native_show_started_ad_viewer", null, null, null, this.$adObject, null, 46, null);
                AdPlayer adPlayer = ad2.getAdPlayer();
                if (adPlayer == null) {
                    throw new IllegalStateException("No adPlayer associated with ad");
                }
                Flow flowX = i.X(i.J(i.L(adPlayer.getOnShowEvent(), new AnonymousClass2(ad2, this.this$0, this.$adObject, this.$showOptions, null)), new AnonymousClass3(this.$adObject, this.this$0, opportunityId, null)), new AnonymousClass4(null));
                FlowCollector flowCollector2 = new FlowCollector() { // from class: com.unity3d.ads.core.domain.AndroidShow.invoke.1.5
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    @Nullable
                    public final Object emit(@NotNull ShowEvent showEvent, @NotNull Continuation continuation) {
                        Object objEmit = flowCollector.emit(showEvent, continuation);
                        return objEmit == b.g() ? objEmit : Unit.f93236a;
                    }
                };
                this.label = 1;
                if (flowX.collect(flowCollector2, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(flowCollector, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public AndroidShow(@NotNull AdRepository adRepository, @NotNull GameServerIdReader gameServerIdReader, @NotNull SendDiagnosticEvent sendDiagnosticEvent) {
        Intrinsics.checkNotNullParameter(adRepository, "adRepository");
        Intrinsics.checkNotNullParameter(gameServerIdReader, "gameServerIdReader");
        Intrinsics.checkNotNullParameter(sendDiagnosticEvent, "sendDiagnosticEvent");
        this.adRepository = adRepository;
        this.gameServerIdReader = gameServerIdReader;
        this.sendDiagnosticEvent = sendDiagnosticEvent;
    }

    @Override // com.unity3d.ads.core.domain.Show
    @NotNull
    public Flow invoke(@NotNull AdObject adObject, @Nullable UnityAdsShowOptions showOptions) {
        Intrinsics.checkNotNullParameter(adObject, "adObject");
        return i.B(new AnonymousClass1(adObject, this, showOptions, null));
    }

    @Override // com.unity3d.ads.core.domain.Show
    @Nullable
    public Object terminate(@NotNull AdObject adObject, @NotNull Continuation continuation) {
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null) {
            return Unit.f93236a;
        }
        Object objDestroy = adPlayer.destroy(continuation);
        return objDestroy == b.g() ? objDestroy : Unit.f93236a;
    }
}
