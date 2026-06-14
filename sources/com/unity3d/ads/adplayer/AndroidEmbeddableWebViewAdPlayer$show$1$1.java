package com.unity3d.ads.adplayer;

import com.unity3d.ads.core.data.model.ScarEvent;
import com.unity3d.services.banners.bridge.BannerBridge;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.v;
import kotlin.jvm.internal.y;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {75, 79}, m = "invokeSuspend")
final class AndroidEmbeddableWebViewAdPlayer$show$1$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ SharedFlow $scarEvents;
    final /* synthetic */ ShowOptions $showOptions;
    int label;
    final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/data/model/ScarEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$1", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {73}, m = "invokeSuspend")
    static final class AnonymousClass1 extends k implements Function2<FlowCollector, Continuation, Object> {
        final /* synthetic */ ShowOptions $showOptions;
        int label;
        final /* synthetic */ AndroidEmbeddableWebViewAdPlayer this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, ShowOptions showOptions, Continuation continuation) {
            super(2, continuation);
            this.this$0 = androidEmbeddableWebViewAdPlayer;
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
                d.b(obj);
                WebViewAdPlayer webViewAdPlayer = this.this$0.webViewAdPlayer;
                Map<String, Object> unityAdsShowOptions = ((AndroidShowOptions) this.$showOptions).getUnityAdsShowOptions();
                this.label = 1;
                if (webViewAdPlayer.requestShow(unityAdsShowOptions, this) == objG) {
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

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/data/model/ScarEvent;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$2", f = "AndroidEmbeddableWebViewAdPlayer.kt", l = {}, m = "invokeSuspend")
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
            d.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(Intrinsics.areEqual((ScarEvent) this.L$0, ScarEvent.Show.INSTANCE));
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$4, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* synthetic */ class AnonymousClass4 implements FlowCollector, v {
        final /* synthetic */ WebViewAdPlayer $tmp0;

        AnonymousClass4(WebViewAdPlayer webViewAdPlayer) {
            this.$tmp0 = webViewAdPlayer;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        @Nullable
        public final Object emit(@NotNull BannerBridge.BannerEvent bannerEvent, @NotNull Continuation continuation) {
            Object objSendScarBannerEvent = this.$tmp0.sendScarBannerEvent(bannerEvent, continuation);
            return objSendScarBannerEvent == pf.b.g() ? objSendScarBannerEvent : Unit.f93236a;
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
            return new y(2, this.$tmp0, WebViewAdPlayer.class, "sendScarBannerEvent", "sendScarBannerEvent(Lcom/unity3d/services/banners/bridge/BannerBridge$BannerEvent;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
        }

        public final int hashCode() {
            return getFunctionDelegate().hashCode();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AndroidEmbeddableWebViewAdPlayer$show$1$1(AndroidEmbeddableWebViewAdPlayer androidEmbeddableWebViewAdPlayer, SharedFlow sharedFlow, ShowOptions showOptions, Continuation continuation) {
        super(2, continuation);
        this.this$0 = androidEmbeddableWebViewAdPlayer;
        this.$scarEvents = sharedFlow;
        this.$showOptions = showOptions;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new AndroidEmbeddableWebViewAdPlayer$show$1$1(this.this$0, this.$scarEvents, this.$showOptions, continuation);
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
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r8 = r7.this$0
            kotlinx.coroutines.flow.Flow r8 = r8.getOnScarEvent()
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$1 r1 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$1
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r4 = r7.this$0
            com.unity3d.ads.adplayer.ShowOptions r5 = r7.$showOptions
            r6 = 0
            r1.<init>(r4, r5, r6)
            kotlinx.coroutines.flow.Flow r8 = hg.i.L(r8, r1)
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$2 r1 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$2
            r1.<init>(r6)
            r7.label = r3
            java.lang.Object r8 = hg.i.y(r8, r1, r7)
            if (r8 != r0) goto L43
            goto L5d
        L43:
            kotlinx.coroutines.flow.SharedFlow r8 = r7.$scarEvents
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$1 r1 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$invokeSuspend$$inlined$mapNotNull$1
            r1.<init>()
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer r8 = r7.this$0
            com.unity3d.ads.adplayer.WebViewAdPlayer r8 = com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer.access$getWebViewAdPlayer$p(r8)
            com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$4 r3 = new com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1$4
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
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.adplayer.AndroidEmbeddableWebViewAdPlayer$show$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((AndroidEmbeddableWebViewAdPlayer$show$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
