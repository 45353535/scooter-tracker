package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import com.unity3d.services.core.log.DeviceLog;
import hg.i;
import java.lang.reflect.InvocationTargetException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0005\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0019\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0011\u0010\f\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0007J\u0019\u0010\r\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u0006H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u000bJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\n\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/data/manager/AndroidOfferwallManager;", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "offerwallBridge", "Lcom/unity3d/services/ads/offerwall/OfferwallAdapterBridge;", "(Lcom/unity3d/services/ads/offerwall/OfferwallAdapterBridge;)V", "getVersion", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isAdReady", "", "placementName", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isConnected", "loadAd", "", "showAd", "Lkotlinx/coroutines/flow/Flow;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class AndroidOfferwallManager implements OfferwallManager {

    @NotNull
    private final OfferwallAdapterBridge offerwallBridge;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager", f = "AndroidOfferwallManager.kt", l = {28}, m = "loadAd")
    static final class AnonymousClass1 extends d {
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
            return AndroidOfferwallManager.this.loadAd(null, this);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2", f = "AndroidOfferwallManager.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<FlowCollector, Continuation, Object> {
        final /* synthetic */ String $placementName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(String str, Continuation continuation) {
            super(2, continuation);
            this.$placementName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return AndroidOfferwallManager.this.new AnonymousClass2(this.$placementName, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws IllegalAccessException, InvocationTargetException {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            AndroidOfferwallManager.this.offerwallBridge.loadAd(this.$placementName);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(flowCollector, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3", f = "AndroidOfferwallManager.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass3 extends k implements Function2<OfferwallEventData, Continuation, Object> {
        final /* synthetic */ String $placementName;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(String str, Continuation continuation) {
            super(2, continuation);
            this.$placementName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.$placementName, continuation);
            anonymousClass3.L$0 = obj;
            return anonymousClass3;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull OfferwallEventData offerwallEventData, @Nullable Continuation continuation) {
            return ((AnonymousClass3) create(offerwallEventData, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            OfferwallEventData offerwallEventData = (OfferwallEventData) this.L$0;
            return kotlin.coroutines.jvm.internal.b.a(CollectionsKt.listOf((Object[]) new OfferwallEvent[]{OfferwallEvent.REQUEST_SUCCESS, OfferwallEvent.REQUEST_FAILED}).contains(offerwallEventData.getOfferwallEvent()) && Intrinsics.areEqual(offerwallEventData.getPlacementName(), this.$placementName));
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$1", f = "AndroidOfferwallManager.kt", l = {}, m = "invokeSuspend")
    static final class C47701 extends k implements Function2<FlowCollector, Continuation, Object> {
        final /* synthetic */ String $placementName;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C47701(String str, Continuation continuation) {
            super(2, continuation);
            this.$placementName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return AndroidOfferwallManager.this.new C47701(this.$placementName, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) throws IllegalAccessException, InvocationTargetException {
            pf.b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            AndroidOfferwallManager.this.offerwallBridge.showAd(this.$placementName);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Continuation continuation) {
            return ((C47701) create(flowCollector, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$2, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "it"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.manager.AndroidOfferwallManager$showAd$2", f = "AndroidOfferwallManager.kt", l = {44}, m = "invokeSuspend")
    static final class C47712 extends k implements Function3<FlowCollector, OfferwallEventData, Continuation, Object> {
        private /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        int label;

        C47712(Continuation continuation) {
            super(3, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            OfferwallEventData offerwallEventData;
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                OfferwallEventData offerwallEventData2 = (OfferwallEventData) this.L$1;
                this.L$0 = offerwallEventData2;
                this.label = 1;
                if (flowCollector.emit(offerwallEventData2, this) == objG) {
                    return objG;
                }
                offerwallEventData = offerwallEventData2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                offerwallEventData = (OfferwallEventData) this.L$0;
                kotlin.d.b(obj);
            }
            return kotlin.coroutines.jvm.internal.b.a(!ArraysKt.contains(new OfferwallEvent[]{OfferwallEvent.ON_CONTENT_DISMISS, OfferwallEvent.SHOW_FAILED}, offerwallEventData.getOfferwallEvent()));
        }

        @Override // kotlin.jvm.functions.Function3
        @Nullable
        public final Object invoke(@NotNull FlowCollector flowCollector, @NotNull OfferwallEventData offerwallEventData, @Nullable Continuation continuation) {
            C47712 c47712 = new C47712(continuation);
            c47712.L$0 = flowCollector;
            c47712.L$1 = offerwallEventData;
            return c47712.invokeSuspend(Unit.f93236a);
        }
    }

    public AndroidOfferwallManager(@NotNull OfferwallAdapterBridge offerwallBridge) {
        Intrinsics.checkNotNullParameter(offerwallBridge, "offerwallBridge");
        this.offerwallBridge = offerwallBridge;
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    @Nullable
    public Object getVersion(@NotNull Continuation continuation) {
        return this.offerwallBridge.getVersion();
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    @Nullable
    public Object isAdReady(@NotNull String str, @NotNull Continuation continuation) {
        return kotlin.coroutines.jvm.internal.b.a(this.offerwallBridge.isAdReady(str));
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    @Nullable
    public Object isConnected(@NotNull Continuation continuation) {
        return kotlin.coroutines.jvm.internal.b.a(this.offerwallBridge.isConnected());
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    @org.jetbrains.annotations.Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object loadAd(@org.jetbrains.annotations.NotNull java.lang.String r6, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r7) throws com.unity3d.ads.core.data.model.exception.LoadException {
        /*
            r5 = this;
            boolean r0 = r7 instanceof com.unity3d.ads.core.data.manager.AndroidOfferwallManager.AnonymousClass1
            if (r0 == 0) goto L13
            r0 = r7
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1 r0 = (com.unity3d.ads.core.data.manager.AndroidOfferwallManager.AnonymousClass1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1 r0 = new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$1
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.result
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.label
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2a
            kotlin.d.b(r7)
            goto L66
        L2a:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L32:
            kotlin.d.b(r7)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r2 = "Offerwall Manager - loadAd: "
            r7.append(r2)
            r7.append(r6)
            java.lang.String r7 = r7.toString()
            com.unity3d.services.core.log.DeviceLog.debug(r7)
            com.unity3d.services.ads.offerwall.OfferwallAdapterBridge r7 = r5.offerwallBridge
            kotlinx.coroutines.flow.SharedFlow r7 = r7.getOfferwallEventFlow()
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2 r2 = new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$2
            r2.<init>(r6, r4)
            kotlinx.coroutines.flow.SharedFlow r7 = hg.i.M(r7, r2)
            com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3 r2 = new com.unity3d.ads.core.data.manager.AndroidOfferwallManager$loadAd$3
            r2.<init>(r6, r4)
            r0.label = r3
            java.lang.Object r7 = hg.i.y(r7, r2, r0)
            if (r7 != r1) goto L66
            return r1
        L66:
            r6 = r7
            com.unity3d.ads.core.domain.offerwall.OfferwallEventData r6 = (com.unity3d.ads.core.domain.offerwall.OfferwallEventData) r6
            com.unity3d.services.ads.offerwall.OfferwallEvent r6 = r6.getOfferwallEvent()
            com.unity3d.services.ads.offerwall.OfferwallEvent r0 = com.unity3d.services.ads.offerwall.OfferwallEvent.REQUEST_SUCCESS
            if (r6 == r0) goto L72
            r4 = r7
        L72:
            com.unity3d.ads.core.domain.offerwall.OfferwallEventData r4 = (com.unity3d.ads.core.domain.offerwall.OfferwallEventData) r4
            if (r4 == 0) goto L98
            com.unity3d.ads.core.data.model.exception.LoadException r6 = new com.unity3d.ads.core.data.model.exception.LoadException
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.String r0 = "Error loading offerwall ad: "
            r7.append(r0)
            java.lang.String r0 = r4.getErrorMessage()
            if (r0 != 0) goto L8c
            com.unity3d.services.ads.offerwall.OfferwallEvent r0 = r4.getOfferwallEvent()
        L8c:
            r7.append(r0)
            java.lang.String r7 = r7.toString()
            r0 = 0
            r6.<init>(r0, r7)
            throw r6
        L98:
            kotlin.Unit r6 = kotlin.Unit.f93236a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.manager.AndroidOfferwallManager.loadAd(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    @NotNull
    public Flow showAd(@NotNull String placementName) {
        Intrinsics.checkNotNullParameter(placementName, "placementName");
        DeviceLog.debug("Offerwall Manager - showAd: " + placementName);
        return i.X(i.M(this.offerwallBridge.getOfferwallEventFlow(), new C47701(placementName, null)), new C47712(null));
    }
}
