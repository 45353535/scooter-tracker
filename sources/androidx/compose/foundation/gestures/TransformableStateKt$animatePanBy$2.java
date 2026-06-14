package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.animation.core.VectorConvertersKt;
import androidx.compose.ui.geometry.Offset;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.u0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Landroidx/compose/foundation/gestures/TransformScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2", f = "TransformableState.kt", l = {182}, m = "invokeSuspend")
final class TransformableStateKt$animatePanBy$2 extends k implements Function2<TransformScope, Continuation, Object> {
    final /* synthetic */ AnimationSpec<Offset> $animationSpec;
    final /* synthetic */ long $offset;
    final /* synthetic */ u0 $previous;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TransformableStateKt$animatePanBy$2(u0 u0Var, long j10, AnimationSpec<Offset> animationSpec, Continuation continuation) {
        super(2, continuation);
        this.$previous = u0Var;
        this.$offset = j10;
        this.$animationSpec = animationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        TransformableStateKt$animatePanBy$2 transformableStateKt$animatePanBy$2 = new TransformableStateKt$animatePanBy$2(this.$previous, this.$offset, this.$animationSpec, continuation);
        transformableStateKt$animatePanBy$2.L$0 = obj;
        return transformableStateKt$animatePanBy$2;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull TransformScope transformScope, @Nullable Continuation continuation) {
        return ((TransformableStateKt$animatePanBy$2) create(transformScope, continuation)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = pf.b.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.d.b(obj);
            final TransformScope transformScope = (TransformScope) this.L$0;
            AnimationState animationState = new AnimationState(VectorConvertersKt.getVectorConverter(Offset.INSTANCE), Offset.m1360boximpl(this.$previous.f93333b), null, 0L, 0L, false, 60, null);
            Offset offsetM1360boximpl = Offset.m1360boximpl(this.$offset);
            AnimationSpec<Offset> animationSpec = this.$animationSpec;
            final u0 u0Var = this.$previous;
            Function1<AnimationScope<Offset, AnimationVector2D>, Unit> function1 = new Function1<AnimationScope<Offset, AnimationVector2D>, Unit>() { // from class: androidx.compose.foundation.gestures.TransformableStateKt$animatePanBy$2.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Offset, AnimationVector2D> animationScope) {
                    invoke2(animationScope);
                    return Unit.f93236a;
                }

                /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(@NotNull AnimationScope<Offset, AnimationVector2D> animateTo) {
                    Intrinsics.checkNotNullParameter(animateTo, "$this$animateTo");
                    d.a(transformScope, 0.0f, Offset.m1375minusMKHz9U(animateTo.getValue().getPackedValue(), u0Var.f93333b), 0.0f, 5, null);
                    u0Var.f93333b = animateTo.getValue().getPackedValue();
                }
            };
            this.label = 1;
            if (SuspendAnimationKt.animateTo$default(animationState, offsetM1360boximpl, animationSpec, false, function1, this, 4, null) == objG) {
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
}
