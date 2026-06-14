package androidx.lifecycle;

import androidx.lifecycle.Lifecycle;
import gg.v;
import gg.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a.\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"flowWithLifecycle", "Lkotlinx/coroutines/flow/Flow;", "T", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "minActiveState", "Landroidx/lifecycle/Lifecycle$State;", "lifecycle-runtime-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
public final class FlowExtKt {

    /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lgg/v;", "", "<anonymous>", "(Lgg/v;)V"}, k = 3, mv = {1, 8, 0})
    @kotlin.coroutines.jvm.internal.e(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1", f = "FlowExt.kt", l = {91}, m = "invokeSuspend")
    static final class AnonymousClass1 extends kotlin.coroutines.jvm.internal.k implements Function2<v, Continuation, Object> {
        final /* synthetic */ Lifecycle $lifecycle;
        final /* synthetic */ Lifecycle.State $minActiveState;
        final /* synthetic */ Flow $this_flowWithLifecycle;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX INFO: renamed from: androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1, reason: invalid class name and collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "T", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.e(c = "androidx.lifecycle.FlowExtKt$flowWithLifecycle$1$1", f = "FlowExt.kt", l = {92}, m = "invokeSuspend")
        static final class C01081 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
            final /* synthetic */ v $$this$callbackFlow;
            final /* synthetic */ Flow $this_flowWithLifecycle;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C01081(Flow flow, v vVar, Continuation continuation) {
                super(2, continuation);
                this.$this_flowWithLifecycle = flow;
                this.$$this$callbackFlow = vVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                return new C01081(this.$this_flowWithLifecycle, this.$$this$callbackFlow, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = pf.b.g();
                int i10 = this.label;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    Flow flow = this.$this_flowWithLifecycle;
                    final v vVar = this.$$this$callbackFlow;
                    FlowCollector flowCollector = new FlowCollector() { // from class: androidx.lifecycle.FlowExtKt.flowWithLifecycle.1.1.1
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        @Nullable
                        public final Object emit(T t10, @NotNull Continuation continuation) {
                            Object objW = vVar.w(t10, continuation);
                            return objW == pf.b.g() ? objW : Unit.f93236a;
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
                return ((C01081) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Lifecycle lifecycle, Lifecycle.State state, Flow flow, Continuation continuation) {
            super(2, continuation);
            this.$lifecycle = lifecycle;
            this.$minActiveState = state;
            this.$this_flowWithLifecycle = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$lifecycle, this.$minActiveState, this.$this_flowWithLifecycle, continuation);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull v vVar, @Nullable Continuation continuation) {
            return ((AnonymousClass1) create(vVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            v vVar;
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                v vVar2 = (v) this.L$0;
                Lifecycle lifecycle = this.$lifecycle;
                Lifecycle.State state = this.$minActiveState;
                C01081 c01081 = new C01081(this.$this_flowWithLifecycle, vVar2, null);
                this.L$0 = vVar2;
                this.label = 1;
                if (RepeatOnLifecycleKt.repeatOnLifecycle(lifecycle, state, c01081, this) == objG) {
                    return objG;
                }
                vVar = vVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                vVar = (v) this.L$0;
                kotlin.d.b(obj);
            }
            y.a.a(vVar, null, 1, null);
            return Unit.f93236a;
        }
    }

    @NotNull
    public static final <T> Flow flowWithLifecycle(@NotNull Flow flow, @NotNull Lifecycle lifecycle, @NotNull Lifecycle.State minActiveState) {
        Intrinsics.checkNotNullParameter(flow, "<this>");
        Intrinsics.checkNotNullParameter(lifecycle, "lifecycle");
        Intrinsics.checkNotNullParameter(minActiveState, "minActiveState");
        return hg.i.f(new AnonymousClass1(lifecycle, minActiveState, flow, null));
    }

    public static /* synthetic */ Flow flowWithLifecycle$default(Flow flow, Lifecycle lifecycle, Lifecycle.State state, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(flow, lifecycle, state);
    }
}
