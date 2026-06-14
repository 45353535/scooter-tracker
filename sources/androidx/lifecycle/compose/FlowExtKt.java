package androidx.lifecycle.compose;

import androidx.compose.runtime.Composable;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.State;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.RepeatOnLifecycleKt;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aG\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001aI\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000e\u001a?\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0010\u001aA\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, d2 = {"collectAsStateWithLifecycle", "Landroidx/compose/runtime/State;", "T", "Lkotlinx/coroutines/flow/Flow;", "initialValue", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "minActiveState", "Landroidx/lifecycle/Lifecycle$State;", POBCoreNativeConstants.NATIVE_CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "lifecycleOwner", "Landroidx/lifecycle/LifecycleOwner;", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Lkotlinx/coroutines/flow/StateFlow;", "(Lkotlinx/coroutines/flow/StateFlow;Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "(Lkotlinx/coroutines/flow/StateFlow;Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "lifecycle-runtime-compose_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FlowExtKt {

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1", f = "FlowExt.kt", l = {171}, m = "invokeSuspend")
    static final class AnonymousClass1<T> extends k implements Function2<ProduceStateScope<T>, Continuation, Object> {
        final /* synthetic */ CoroutineContext $context;
        final /* synthetic */ Lifecycle $lifecycle;
        final /* synthetic */ Lifecycle.State $minActiveState;
        final /* synthetic */ Flow $this_collectAsStateWithLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1", f = "FlowExt.kt", l = {TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 174}, m = "invokeSuspend")
        static final class C01101 extends k implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ ProduceStateScope<T> $$this$produceState;
            final /* synthetic */ CoroutineContext $context;
            final /* synthetic */ Flow $this_collectAsStateWithLifecycle;
            int label;

            /* JADX INFO: renamed from: androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$2, reason: invalid class name */
            @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
            @e(c = "androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$2", f = "FlowExt.kt", l = {175}, m = "invokeSuspend")
            static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
                final /* synthetic */ ProduceStateScope<T> $$this$produceState;
                final /* synthetic */ Flow $this_collectAsStateWithLifecycle;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass2(Flow flow, ProduceStateScope<T> produceStateScope, Continuation continuation) {
                    super(2, continuation);
                    this.$this_collectAsStateWithLifecycle = flow;
                    this.$$this$produceState = produceStateScope;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @NotNull
                public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                    return new AnonymousClass2(this.$this_collectAsStateWithLifecycle, this.$$this$produceState, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                @Nullable
                public final Object invokeSuspend(@NotNull Object obj) {
                    Object objG = b.g();
                    int i10 = this.label;
                    if (i10 == 0) {
                        d.b(obj);
                        Flow flow = this.$this_collectAsStateWithLifecycle;
                        final ProduceStateScope<T> produceStateScope = this.$$this$produceState;
                        FlowCollector flowCollector = new FlowCollector() { // from class: androidx.lifecycle.compose.FlowExtKt.collectAsStateWithLifecycle.1.1.2.1
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            @Nullable
                            public final Object emit(T t10, @NotNull Continuation continuation) {
                                produceStateScope.setValue(t10);
                                return Unit.f93236a;
                            }
                        };
                        this.label = 1;
                        if (flow.collect(flowCollector, this) == objG) {
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
                public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                    return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01101(CoroutineContext coroutineContext, Flow flow, ProduceStateScope<T> produceStateScope, Continuation continuation) {
                super(2, continuation);
                this.$context = coroutineContext;
                this.$this_collectAsStateWithLifecycle = flow;
                this.$$this$produceState = produceStateScope;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                return new C01101(this.$context, this.$this_collectAsStateWithLifecycle, this.$$this$produceState, continuation);
            }

            /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
            
                if (r7.collect(r1, r6) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
            
                if (eg.g.g(r7, r1, r6) == r0) goto L17;
             */
            /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
            
                return r0;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            @org.jetbrains.annotations.Nullable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = pf.b.g()
                    int r1 = r6.label
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L1b
                    if (r1 == r3) goto L17
                    if (r1 != r2) goto Lf
                    goto L17
                Lf:
                    java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r7.<init>(r0)
                    throw r7
                L17:
                    kotlin.d.b(r7)
                    goto L4f
                L1b:
                    kotlin.d.b(r7)
                    kotlin.coroutines.CoroutineContext r7 = r6.$context
                    kotlin.coroutines.e r1 = kotlin.coroutines.e.f93267b
                    boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual(r7, r1)
                    if (r7 == 0) goto L3a
                    kotlinx.coroutines.flow.Flow r7 = r6.$this_collectAsStateWithLifecycle
                    androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1 r1 = new androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$1
                    androidx.compose.runtime.ProduceStateScope<T> r2 = r6.$$this$produceState
                    r1.<init>()
                    r6.label = r3
                    java.lang.Object r7 = r7.collect(r1, r6)
                    if (r7 != r0) goto L4f
                    goto L4e
                L3a:
                    kotlin.coroutines.CoroutineContext r7 = r6.$context
                    androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$2 r1 = new androidx.lifecycle.compose.FlowExtKt$collectAsStateWithLifecycle$1$1$2
                    kotlinx.coroutines.flow.Flow r3 = r6.$this_collectAsStateWithLifecycle
                    androidx.compose.runtime.ProduceStateScope<T> r4 = r6.$$this$produceState
                    r5 = 0
                    r1.<init>(r3, r4, r5)
                    r6.label = r2
                    java.lang.Object r7 = eg.g.g(r7, r1, r6)
                    if (r7 != r0) goto L4f
                L4e:
                    return r0
                L4f:
                    kotlin.Unit r7 = kotlin.Unit.f93236a
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.compose.FlowExtKt.AnonymousClass1.C01101.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
                return ((C01101) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, CoroutineContext coroutineContext, Flow flow, Continuation continuation) {
            super(2, continuation);
            this.$lifecycle = lifecycle;
            this.$minActiveState = state;
            this.$context = coroutineContext;
            this.$this_collectAsStateWithLifecycle = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$lifecycle, this.$minActiveState, this.$context, this.$this_collectAsStateWithLifecycle, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ProduceStateScope<T> produceStateScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(produceStateScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = b.g();
            int i10 = this.label;
            if (i10 == 0) {
                d.b(obj);
                ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
                Lifecycle lifecycle = this.$lifecycle;
                Lifecycle.State state = this.$minActiveState;
                C01101 c01101 = new C01101(this.$context, this.$this_collectAsStateWithLifecycle, produceStateScope, null);
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c01101, this) == objG) {
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
    }

    @Composable
    @NotNull
    public static final <T> State<T> collectAsStateWithLifecycle(@NotNull StateFlow stateFlow, @Nullable LifecycleOwner lifecycleOwner, @Nullable Lifecycle.State state, @Nullable CoroutineContext coroutineContext, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(stateFlow, "<this>");
        composer.startReplaceableGroup(743249048);
        if ((i11 & 1) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        }
        if ((i11 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i11 & 4) != 0) {
            coroutineContext = kotlin.coroutines.e.f93267b;
        }
        State<T> stateCollectAsStateWithLifecycle = collectAsStateWithLifecycle(stateFlow, stateFlow.getValue(), lifecycleOwner.getLifecycle(), state2, coroutineContext, composer, ((i10 << 3) & 7168) | 33288, 0);
        composer.endReplaceableGroup();
        return stateCollectAsStateWithLifecycle;
    }

    @Composable
    @NotNull
    public static final <T> State<T> collectAsStateWithLifecycle(@NotNull StateFlow stateFlow, @NotNull Lifecycle lifecycle, @Nullable Lifecycle.State state, @Nullable CoroutineContext coroutineContext, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(stateFlow, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        composer.startReplaceableGroup(-1858162195);
        if ((i11 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i11 & 4) != 0) {
            coroutineContext = kotlin.coroutines.e.f93267b;
        }
        State<T> stateCollectAsStateWithLifecycle = collectAsStateWithLifecycle(stateFlow, stateFlow.getValue(), lifecycle, state2, coroutineContext, composer, ((i10 << 3) & 7168) | 33288, 0);
        composer.endReplaceableGroup();
        return stateCollectAsStateWithLifecycle;
    }

    @Composable
    @NotNull
    public static final <T> State<T> collectAsStateWithLifecycle(@NotNull Flow flow, T t10, @Nullable LifecycleOwner lifecycleOwner, @Nullable Lifecycle.State state, @Nullable CoroutineContext coroutineContext, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        composer.startReplaceableGroup(-1485997211);
        if ((i11 & 2) != 0) {
            lifecycleOwner = (LifecycleOwner) composer.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
        }
        if ((i11 & 4) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i11 & 8) != 0) {
            coroutineContext = kotlin.coroutines.e.f93267b;
        }
        State<T> stateCollectAsStateWithLifecycle = collectAsStateWithLifecycle(flow, t10, lifecycleOwner.getLifecycle(), state2, coroutineContext, composer, (((i10 >> 3) & 8) << 3) | 33288 | (i10 & 112) | (i10 & 7168), 0);
        composer.endReplaceableGroup();
        return stateCollectAsStateWithLifecycle;
    }

    @Composable
    @NotNull
    public static final <T> State<T> collectAsStateWithLifecycle(@NotNull Flow flow, T t10, @NotNull Lifecycle lifecycle, @Nullable Lifecycle.State state, @Nullable CoroutineContext coroutineContext, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        composer.startReplaceableGroup(1977777920);
        if ((i11 & 4) != 0) {
            state = Lifecycle.State.STARTED;
        }
        Lifecycle.State state2 = state;
        if ((i11 & 8) != 0) {
            coroutineContext = kotlin.coroutines.e.f93267b;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        Object[] objArr = {flow, lifecycle, state2, coroutineContext2};
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(lifecycle, state2, coroutineContext2, flow, null);
        int i12 = i10 >> 3;
        State<T> stateProduceState = SnapshotStateKt.produceState((Object) t10, objArr, (Function2) anonymousClass1, composer, (i12 & 14) | (i12 & 8) | 576);
        composer.endReplaceableGroup();
        return stateProduceState;
    }
}
