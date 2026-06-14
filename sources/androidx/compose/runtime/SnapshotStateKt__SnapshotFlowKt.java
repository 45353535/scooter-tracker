package androidx.compose.runtime;

import com.ironsource.mediationsdk.logger.IronSourceError;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import hg.i;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\"\n\u0002\b\u0003\u001a \u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0004\u001a?\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0006\"\b\b\u0000\u0010\u0002*\u0002H\u0007\"\u0004\b\u0001\u0010\u0007*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\b\u001a\u0002H\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a-\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\f2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\r\u001a+\u0010\u000e\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0010H\u0002¢\u0006\u0002\b\u0012¨\u0006\u0013"}, d2 = {"snapshotFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "block", "Lkotlin/Function0;", "collectAsState", "Landroidx/compose/runtime/State;", "R", "initial", POBCoreNativeConstants.NATIVE_CONTEXT, "Lkotlin/coroutines/CoroutineContext;", "(Lkotlinx/coroutines/flow/Flow;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "Lkotlinx/coroutines/flow/StateFlow;", "(Lkotlinx/coroutines/flow/StateFlow;Lkotlin/coroutines/CoroutineContext;Landroidx/compose/runtime/Composer;II)Landroidx/compose/runtime/State;", "intersects", "", "", "other", "intersects$SnapshotStateKt__SnapshotFlowKt", "runtime_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "androidx/compose/runtime/SnapshotStateKt")
final /* synthetic */ class SnapshotStateKt__SnapshotFlowKt {

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* JADX INFO: renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1, reason: invalid class name */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1", f = "SnapshotFlow.kt", l = {65, 66}, m = "invokeSuspend")
    static final class AnonymousClass1<R> extends k implements Function2<ProduceStateScope<R>, Continuation, Object> {
        final /* synthetic */ CoroutineContext $context;
        final /* synthetic */ Flow $this_collectAsState;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2, reason: invalid class name */
        @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
        @e(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2", f = "SnapshotFlow.kt", l = {67}, m = "invokeSuspend")
        static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ ProduceStateScope<R> $$this$produceState;
            final /* synthetic */ Flow $this_collectAsState;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Flow flow, ProduceStateScope<R> produceStateScope, Continuation continuation) {
                super(2, continuation);
                this.$this_collectAsState = flow;
                this.$$this$produceState = produceStateScope;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                return new AnonymousClass2(this.$this_collectAsState, this.$$this$produceState, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = pf.b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    Flow flow = this.$this_collectAsState;
                    final ProduceStateScope<R> produceStateScope = this.$$this$produceState;
                    FlowCollector flowCollector = new FlowCollector() { // from class: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.collectAsState.1.2.1
                        /* JADX WARN: Multi-variable type inference failed */
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
                    kotlin.d.b(obj);
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
        AnonymousClass1(CoroutineContext coroutineContext, Flow flow, Continuation continuation) {
            super(2, continuation);
            this.$context = coroutineContext;
            this.$this_collectAsState = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$context, this.$this_collectAsState, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull ProduceStateScope<R> produceStateScope, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(produceStateScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0039, code lost:
        
            if (r1.collect(r2, r6) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        
            if (eg.g.g(r1, r3, r6) == r0) goto L17;
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
                java.lang.Object r7 = r6.L$0
                androidx.compose.runtime.ProduceStateScope r7 = (androidx.compose.runtime.ProduceStateScope) r7
                kotlin.coroutines.CoroutineContext r1 = r6.$context
                kotlin.coroutines.e r4 = kotlin.coroutines.e.f93267b
                boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual(r1, r4)
                if (r1 == 0) goto L3c
                kotlinx.coroutines.flow.Flow r1 = r6.$this_collectAsState
                androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1 r2 = new androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$1
                r2.<init>()
                r6.label = r3
                java.lang.Object r7 = r1.collect(r2, r6)
                if (r7 != r0) goto L4f
                goto L4e
            L3c:
                kotlin.coroutines.CoroutineContext r1 = r6.$context
                androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2 r3 = new androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$collectAsState$1$2
                kotlinx.coroutines.flow.Flow r4 = r6.$this_collectAsState
                r5 = 0
                r3.<init>(r4, r7, r5)
                r6.label = r2
                java.lang.Object r7 = eg.g.g(r1, r3, r6)
                if (r7 != r0) goto L4f
            L4e:
                return r0
            L4f:
                kotlin.Unit r7 = kotlin.Unit.f93236a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1, reason: invalid class name and case insensitive filesystem */
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/flow/FlowCollector;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @e(c = "androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt$snapshotFlow$1", f = "SnapshotFlow.kt", l = {134, 138, 160}, m = "invokeSuspend")
    static final class C15881 extends k implements Function2<FlowCollector, Continuation, Object> {
        final /* synthetic */ Function0<T> $block;
        int I$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C15881(Function0<? extends T> function0, Continuation continuation) {
            super(2, continuation);
            this.$block = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            C15881 c15881 = new C15881(this.$block, continuation);
            c15881.L$0 = obj;
            return c15881;
        }

        /* JADX WARN: Path cross not found for [B:34:0x00e2, B:38:0x00eb], limit reached: 75 */
        /* JADX WARN: Path cross not found for [B:42:0x00fa, B:58:0x0139], limit reached: 75 */
        /* JADX WARN: Path cross not found for [B:58:0x0139, B:42:0x00fa], limit reached: 75 */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00d7  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00fa A[Catch: all -> 0x0055, TRY_LEAVE, TryCatch #3 {all -> 0x0055, blocks: (B:32:0x00de, B:34:0x00e2, B:39:0x00ec, B:42:0x00fa, B:46:0x0110, B:48:0x0119, B:56:0x0135, B:57:0x0138, B:15:0x0050, B:43:0x0105, B:45:0x010d, B:54:0x0131, B:55:0x0134), top: B:74:0x0050, inners: #5 }] */
        @Override // kotlin.coroutines.jvm.internal.a
        @org.jetbrains.annotations.Nullable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(@org.jetbrains.annotations.NotNull java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 335
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.runtime.SnapshotStateKt__SnapshotFlowKt.C15881.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull FlowCollector flowCollector, @Nullable Continuation continuation) {
            return ((C15881) create(flowCollector, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    @Composable
    @NotNull
    public static final <T> State<T> collectAsState(@NotNull StateFlow stateFlow, @Nullable CoroutineContext coroutineContext, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(stateFlow, "<this>");
        composer.startReplaceableGroup(-1439883919);
        if ((i11 & 1) != 0) {
            coroutineContext = kotlin.coroutines.e.f93267b;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1439883919, i10, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:45)");
        }
        State<T> stateCollectAsState = SnapshotStateKt.collectAsState(stateFlow, stateFlow.getValue(), coroutineContext2, composer, IronSourceError.ERROR_NO_INTERNET_CONNECTION, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateCollectAsState;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> boolean intersects$SnapshotStateKt__SnapshotFlowKt(Set<? extends T> set, Set<? extends T> set2) {
        if (set.size() < set2.size()) {
            Set<? extends T> set3 = set;
            if ((set3 instanceof Collection) && set3.isEmpty()) {
                return false;
            }
            Iterator<T> it = set3.iterator();
            while (it.hasNext()) {
                if (set2.contains(it.next())) {
                    return true;
                }
            }
            return false;
        }
        Set<? extends T> set4 = set2;
        if ((set4 instanceof Collection) && set4.isEmpty()) {
            return false;
        }
        Iterator<T> it2 = set4.iterator();
        while (it2.hasNext()) {
            if (set.contains(it2.next())) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public static final <T> Flow snapshotFlow(@NotNull Function0<? extends T> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        return i.B(new C15881(block, null));
    }

    @Composable
    @NotNull
    public static final <T extends R, R> State<R> collectAsState(@NotNull Flow flow, R r10, @Nullable CoroutineContext coroutineContext, @Nullable Composer composer, int i10, int i11) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        composer.startReplaceableGroup(-606625098);
        if ((i11 & 2) != 0) {
            coroutineContext = kotlin.coroutines.e.f93267b;
        }
        CoroutineContext coroutineContext2 = coroutineContext;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-606625098, i10, -1, "androidx.compose.runtime.collectAsState (SnapshotFlow.kt:59)");
        }
        int i12 = i10 >> 3;
        State<R> stateProduceState = SnapshotStateKt.produceState(r10, flow, coroutineContext2, new AnonymousClass1(coroutineContext2, flow, null), composer, (i12 & 8) | 4672 | (i12 & 14));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return stateProduceState;
    }
}
