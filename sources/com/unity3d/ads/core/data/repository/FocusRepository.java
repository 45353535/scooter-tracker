package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.services.core.log.DeviceLog;
import com.vungle.ads.internal.protos.Sdk;
import hg.c0;
import hg.g0;
import hg.i;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/data/repository/FocusRepository;", "", "getLifecycleFlow", "Lcom/unity3d/ads/core/domain/AndroidGetLifecycleFlow;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/unity3d/ads/core/domain/AndroidGetLifecycleFlow;Lkotlinx/coroutines/CoroutineDispatcher;)V", "focusState", "Lkotlinx/coroutines/flow/SharedFlow;", "Lcom/unity3d/ads/core/data/repository/FocusState;", "getFocusState", "()Lkotlinx/coroutines/flow/SharedFlow;", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class FocusRepository {

    @NotNull
    private final SharedFlow focusState;

    public FocusRepository(@NotNull AndroidGetLifecycleFlow getLifecycleFlow, @NotNull CoroutineDispatcher defaultDispatcher) {
        SharedFlow sharedFlowB;
        Intrinsics.checkNotNullParameter(getLifecycleFlow, "getLifecycleFlow");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        try {
            final Flow flowInvoke = getLifecycleFlow.invoke();
            final Flow flow = new Flow() { // from class: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1

                /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2, reason: invalid class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    @e(c = "com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2", f = "FocusRepository.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
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
                            boolean r0 = r7 instanceof com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r7
                            com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2$1
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
                            com.unity3d.ads.core.domain.LifecycleEvent r2 = (com.unity3d.ads.core.domain.LifecycleEvent) r2
                            boolean r4 = r2 instanceof com.unity3d.ads.core.domain.LifecycleEvent.Paused
                            if (r4 != 0) goto L41
                            boolean r2 = r2 instanceof com.unity3d.ads.core.domain.LifecycleEvent.Resumed
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
                        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                @Nullable
                public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                    Object objCollect = flowInvoke.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == b.g() ? objCollect : Unit.f93236a;
                }
            };
            sharedFlowB = i.R(new Flow() { // from class: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1

                /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2, reason: invalid class name */
                @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
                public static final class AnonymousClass2<T> implements FlowCollector {
                    final /* synthetic */ FlowCollector $this_unsafeFlow;

                    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2$1, reason: invalid class name */
                    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                    @e(c = "com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2", f = "FocusRepository.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                    public static final class AnonymousClass1 extends d {
                        Object L$0;
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
                    public final java.lang.Object emit(java.lang.Object r5, @org.jetbrains.annotations.NotNull kotlin.coroutines.Continuation r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2$1 r0 = (com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2$1 r0 = new com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            java.lang.Object r1 = pf.b.g()
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L31
                            if (r2 != r3) goto L29
                            kotlin.d.b(r6)
                            goto L58
                        L29:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L31:
                            kotlin.d.b(r6)
                            kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                            com.unity3d.ads.core.domain.LifecycleEvent r5 = (com.unity3d.ads.core.domain.LifecycleEvent) r5
                            boolean r2 = r5 instanceof com.unity3d.ads.core.domain.LifecycleEvent.Resumed
                            if (r2 == 0) goto L46
                            com.unity3d.ads.core.data.repository.FocusState$Focused r2 = new com.unity3d.ads.core.data.repository.FocusState$Focused
                            java.lang.ref.WeakReference r5 = r5.getActivity()
                            r2.<init>(r5)
                            goto L4f
                        L46:
                            com.unity3d.ads.core.data.repository.FocusState$Unfocused r2 = new com.unity3d.ads.core.data.repository.FocusState$Unfocused
                            java.lang.ref.WeakReference r5 = r5.getActivity()
                            r2.<init>(r5)
                        L4f:
                            r0.label = r3
                            java.lang.Object r5 = r6.emit(r2, r0)
                            if (r5 != r1) goto L58
                            return r1
                        L58:
                            kotlin.Unit r5 = kotlin.Unit.f93236a
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }

                @Override // kotlinx.coroutines.flow.Flow
                @Nullable
                public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                    Object objCollect = flow.collect(new AnonymousClass2(flowCollector), continuation);
                    return objCollect == b.g() ? objCollect : Unit.f93236a;
                }
            }, kotlinx.coroutines.i.a(defaultDispatcher), g0.f73226a.c(), 1);
        } catch (Exception e10) {
            DeviceLog.error("Could not subscribe to lifecycle flow", e10);
            sharedFlowB = c0.b(0, 0, null, 7, null);
        }
        this.focusState = sharedFlowB;
    }

    @NotNull
    public final SharedFlow getFocusState() {
        return this.focusState;
    }
}
