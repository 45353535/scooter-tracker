package com.unity3d.ads.core.data.repository;

import android.app.Activity;
import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.ads.core.domain.LifecycleEvent;
import com.vungle.ads.internal.protos.Sdk;
import hg.i;
import hg.l0;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.n0;
import kotlin.reflect.KProperty1;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes11.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u0010\u001a\u00020\u0011H\u0086\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\r¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/unity3d/ads/core/data/repository/OrientationRepository;", "", "getLifecycleFlow", "Lcom/unity3d/ads/core/domain/AndroidGetLifecycleFlow;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/unity3d/ads/core/domain/AndroidGetLifecycleFlow;Lkotlinx/coroutines/CoroutineDispatcher;)V", "_resumedActivityOrientation", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "isRunning", "", "resumedActivityOrientation", "Lkotlinx/coroutines/flow/StateFlow;", "getResumedActivityOrientation", "()Lkotlinx/coroutines/flow/StateFlow;", "invoke", "", "unity-ads_defaultRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class OrientationRepository {

    @NotNull
    private final MutableStateFlow _resumedActivityOrientation;

    @NotNull
    private final CoroutineDispatcher defaultDispatcher;

    @NotNull
    private final AndroidGetLifecycleFlow getLifecycleFlow;

    @NotNull
    private final MutableStateFlow isRunning;

    @NotNull
    private final StateFlow resumedActivityOrientation;

    /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u008a@"}, d2 = {"<anonymous>", "", "activity", "Ljava/lang/ref/WeakReference;", "Landroid/app/Activity;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "com.unity3d.ads.core.data.repository.OrientationRepository$invoke$4", f = "OrientationRepository.kt", l = {}, m = "invokeSuspend")
    static final class AnonymousClass4 extends k implements Function2<WeakReference<Activity>, Continuation, Object> {
        /* synthetic */ Object L$0;
        int label;

        AnonymousClass4(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass4 anonymousClass4 = OrientationRepository.this.new AnonymousClass4(continuation);
            anonymousClass4.L$0 = obj;
            return anonymousClass4;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            b.g();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            WeakReference weakReference = (WeakReference) this.L$0;
            MutableStateFlow mutableStateFlow = OrientationRepository.this._resumedActivityOrientation;
            Activity activity = (Activity) weakReference.get();
            mutableStateFlow.setValue(kotlin.coroutines.jvm.internal.b.d(activity != null ? activity.getRequestedOrientation() : -1));
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull WeakReference<Activity> weakReference, @Nullable Continuation continuation) {
            return ((AnonymousClass4) create(weakReference, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public OrientationRepository(@NotNull AndroidGetLifecycleFlow getLifecycleFlow, @NotNull CoroutineDispatcher defaultDispatcher) {
        Intrinsics.checkNotNullParameter(getLifecycleFlow, "getLifecycleFlow");
        Intrinsics.checkNotNullParameter(defaultDispatcher, "defaultDispatcher");
        this.getLifecycleFlow = getLifecycleFlow;
        this.defaultDispatcher = defaultDispatcher;
        this.isRunning = l0.a(Boolean.FALSE);
        MutableStateFlow mutableStateFlowA = l0.a(-1);
        this._resumedActivityOrientation = mutableStateFlowA;
        this.resumedActivityOrientation = mutableStateFlowA;
    }

    @NotNull
    public final StateFlow getResumedActivityOrientation() {
        return this.resumedActivityOrientation;
    }

    public final void invoke() {
        Object value;
        Boolean bool;
        MutableStateFlow mutableStateFlow = this.isRunning;
        do {
            value = mutableStateFlow.getValue();
            bool = (Boolean) value;
            bool.getClass();
        } while (!mutableStateFlow.b(value, Boolean.TRUE));
        if (bool.booleanValue()) {
            return;
        }
        final Flow flowInvoke = this.getLifecycleFlow.invoke();
        final Flow flow = new Flow() { // from class: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1

            /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;

                /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @e(c = "com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2", f = "OrientationRepository.kt", l = {224}, m = "emit")
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
                        boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2$1 r0 = (com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2$1 r0 = new com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = pf.b.g()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.d.b(r6)
                        goto L43
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.d.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        boolean r2 = r5 instanceof com.unity3d.ads.core.domain.LifecycleEvent.Resumed
                        if (r2 == 0) goto L43
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L43
                        return r1
                    L43:
                        kotlin.Unit r5 = kotlin.Unit.f93236a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$filterIsInstance$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flowInvoke.collect(new AnonymousClass2(flowCollector), continuation);
                return objCollect == b.g() ? objCollect : Unit.f93236a;
            }
        };
        final AnonymousClass3 anonymousClass3 = new n0() { // from class: com.unity3d.ads.core.data.repository.OrientationRepository.invoke.3
            @Override // kotlin.jvm.internal.n0, kotlin.reflect.KProperty1
            @Nullable
            public Object get(@Nullable Object obj) {
                return ((LifecycleEvent) obj).getActivity();
            }
        };
        i.F(i.K(new Flow() { // from class: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1

            /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2, reason: invalid class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 8, 0})
            public static final class AnonymousClass2<T> implements FlowCollector {
                final /* synthetic */ FlowCollector $this_unsafeFlow;
                final /* synthetic */ KProperty1 receiver$inlined;

                /* JADX INFO: renamed from: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2$1, reason: invalid class name */
                @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
                @e(c = "com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2", f = "OrientationRepository.kt", l = {Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE}, m = "emit")
                public static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.d {
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

                public AnonymousClass2(FlowCollector flowCollector, KProperty1 kProperty1) {
                    this.$this_unsafeFlow = flowCollector;
                    this.receiver$inlined = kProperty1;
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
                        boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2$1 r0 = (com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1.AnonymousClass2.AnonymousClass1) r0
                        int r1 = r0.label
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.label = r1
                        goto L18
                    L13:
                        com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2$1 r0 = new com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1$2$1
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.result
                        java.lang.Object r1 = pf.b.g()
                        int r2 = r0.label
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.d.b(r6)
                        goto L47
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.d.b(r6)
                        kotlinx.coroutines.flow.FlowCollector r6 = r4.$this_unsafeFlow
                        com.unity3d.ads.core.domain.LifecycleEvent r5 = (com.unity3d.ads.core.domain.LifecycleEvent) r5
                        kotlin.reflect.KProperty1 r2 = r4.receiver$inlined
                        java.lang.Object r5 = r2.get(r5)
                        r0.label = r3
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L47
                        return r1
                    L47:
                        kotlin.Unit r5 = kotlin.Unit.f93236a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.OrientationRepository$invoke$$inlined$map$1.AnonymousClass2.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            @Override // kotlinx.coroutines.flow.Flow
            @Nullable
            public Object collect(@NotNull FlowCollector flowCollector, @NotNull Continuation continuation) {
                Object objCollect = flow.collect(new AnonymousClass2(flowCollector, anonymousClass3), continuation);
                return objCollect == b.g() ? objCollect : Unit.f93236a;
            }
        }, new AnonymousClass4(null)), kotlinx.coroutines.i.a(this.defaultDispatcher));
    }
}
