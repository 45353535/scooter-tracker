package androidx.compose.foundation.gestures;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.MutatorMutex;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.SnapshotStateKt__SnapshotStateKt;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.i;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B*\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u0002ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ?\u0010\u0010\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\"\u0010\u000f\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r\u0012\u0006\u0012\u0004\u0018\u00010\u000e0\u000bH\u0096@ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R2\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00050\u00028\u0006ø\u0001\u0000¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006 "}, d2 = {"Landroidx/compose/foundation/gestures/DefaultTransformableState;", "Landroidx/compose/foundation/gestures/TransformableState;", "Lkotlin/Function3;", "", "Landroidx/compose/ui/geometry/Offset;", "", "onTransformation", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "Landroidx/compose/foundation/MutatePriority;", "transformPriority", "Lkotlin/Function2;", "Landroidx/compose/foundation/gestures/TransformScope;", "Lkotlin/coroutines/Continuation;", "", "block", "transform", "(Landroidx/compose/foundation/MutatePriority;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/jvm/functions/Function3;", "getOnTransformation", "()Lkotlin/jvm/functions/Function3;", "transformScope", "Landroidx/compose/foundation/gestures/TransformScope;", "Landroidx/compose/foundation/MutatorMutex;", "transformMutex", "Landroidx/compose/foundation/MutatorMutex;", "Landroidx/compose/runtime/MutableState;", "", "isTransformingState", "Landroidx/compose/runtime/MutableState;", "isTransformInProgress", "()Z", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class DefaultTransformableState implements TransformableState {

    @NotNull
    private final MutableState<Boolean> isTransformingState;

    @NotNull
    private final Function3<Float, Offset, Float, Unit> onTransformation;

    @NotNull
    private final MutatorMutex transformMutex;

    @NotNull
    private final TransformScope transformScope;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultTransformableState$transform$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2", f = "TransformableState.kt", l = {249}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ Function2<TransformScope, Continuation, Object> $block;
        final /* synthetic */ MutatePriority $transformPriority;
        int label;

        /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1, reason: invalid class name */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
        @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DefaultTransformableState$transform$2$1", f = "TransformableState.kt", l = {252}, m = "invokeSuspend")
        static final class AnonymousClass1 extends k implements Function2<TransformScope, Continuation, Object> {
            final /* synthetic */ Function2<TransformScope, Continuation, Object> $block;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DefaultTransformableState this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(DefaultTransformableState defaultTransformableState, Function2<? super TransformScope, ? super Continuation, ? extends Object> function2, Continuation continuation) {
                super(2, continuation);
                this.this$0 = defaultTransformableState;
                this.$block = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @NotNull
            public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, this.$block, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            @Nullable
            public final Object invoke(@NotNull TransformScope transformScope, @Nullable Continuation continuation) {
                return ((AnonymousClass1) create(transformScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            @Nullable
            public final Object invokeSuspend(@NotNull Object obj) {
                Object objG = pf.b.g();
                int i10 = this.label;
                try {
                    if (i10 == 0) {
                        kotlin.d.b(obj);
                        TransformScope transformScope = (TransformScope) this.L$0;
                        this.this$0.isTransformingState.setValue(kotlin.coroutines.jvm.internal.b.a(true));
                        Function2<TransformScope, Continuation, Object> function2 = this.$block;
                        this.label = 1;
                        if (function2.invoke(transformScope, this) == objG) {
                            return objG;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        kotlin.d.b(obj);
                    }
                    this.this$0.isTransformingState.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    return Unit.f93236a;
                } catch (Throwable th2) {
                    this.this$0.isTransformingState.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    throw th2;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        AnonymousClass2(MutatePriority mutatePriority, Function2<? super TransformScope, ? super Continuation, ? extends Object> function2, Continuation continuation) {
            super(2, continuation);
            this.$transformPriority = mutatePriority;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return DefaultTransformableState.this.new AnonymousClass2(this.$transformPriority, this.$block, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                MutatorMutex mutatorMutex = DefaultTransformableState.this.transformMutex;
                TransformScope transformScope = DefaultTransformableState.this.transformScope;
                MutatePriority mutatePriority = this.$transformPriority;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DefaultTransformableState.this, this.$block, null);
                this.label = 1;
                if (mutatorMutex.mutateWith(transformScope, mutatePriority, anonymousClass1, this) == objG) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public DefaultTransformableState(@NotNull Function3<? super Float, ? super Offset, ? super Float, Unit> onTransformation) {
        Intrinsics.checkNotNullParameter(onTransformation, "onTransformation");
        this.onTransformation = onTransformation;
        this.transformScope = new TransformScope() { // from class: androidx.compose.foundation.gestures.DefaultTransformableState$transformScope$1
            @Override // androidx.compose.foundation.gestures.TransformScope
            /* JADX INFO: renamed from: transformBy-d-4ec7I, reason: not valid java name */
            public void mo244transformByd4ec7I(float zoomChange, long panChange, float rotationChange) {
                this.this$0.getOnTransformation().invoke(Float.valueOf(zoomChange), Offset.m1360boximpl(panChange), Float.valueOf(rotationChange));
            }
        };
        this.transformMutex = new MutatorMutex();
        this.isTransformingState = SnapshotStateKt__SnapshotStateKt.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    @NotNull
    public final Function3<Float, Offset, Float, Unit> getOnTransformation() {
        return this.onTransformation;
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    public boolean isTransformInProgress() {
        return this.isTransformingState.getValue().booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.TransformableState
    @Nullable
    public Object transform(@NotNull MutatePriority mutatePriority, @NotNull Function2<? super TransformScope, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
        Object objG = i.g(new AnonymousClass2(mutatePriority, function2, null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }
}
