package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.AnimationScope;
import androidx.compose.animation.core.AnimationState;
import androidx.compose.animation.core.AnimationStateKt;
import androidx.compose.animation.core.AnimationVector1D;
import androidx.compose.animation.core.DecayAnimationSpec;
import androidx.compose.animation.core.SuspendAnimationKt;
import androidx.compose.ui.MotionDurationScale;
import eg.g;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001d\u0010\u000e\u001a\u00020\u0004*\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0004H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0011R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0012"}, d2 = {"Landroidx/compose/foundation/gestures/DefaultFlingBehavior;", "Landroidx/compose/foundation/gestures/FlingBehavior;", "flingDecay", "Landroidx/compose/animation/core/DecayAnimationSpec;", "", "motionDurationScale", "Landroidx/compose/ui/MotionDurationScale;", "(Landroidx/compose/animation/core/DecayAnimationSpec;Landroidx/compose/ui/MotionDurationScale;)V", "lastAnimationCycleCount", "", "getLastAnimationCycleCount", "()I", "setLastAnimationCycleCount", "(I)V", "performFling", "Landroidx/compose/foundation/gestures/ScrollScope;", "initialVelocity", "(Landroidx/compose/foundation/gestures/ScrollScope;FLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class DefaultFlingBehavior implements FlingBehavior {

    @NotNull
    private final DecayAnimationSpec<Float> flingDecay;
    private int lastAnimationCycleCount;

    @NotNull
    private final MotionDurationScale motionDurationScale;

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
    @kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DefaultFlingBehavior$performFling$2", f = "Scrollable.kt", l = {545}, m = "invokeSuspend")
    static final class AnonymousClass2 extends k implements Function2<CoroutineScope, Continuation, Object> {
        final /* synthetic */ float $initialVelocity;
        final /* synthetic */ ScrollScope $this_performFling;
        Object L$0;
        int label;
        final /* synthetic */ DefaultFlingBehavior this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(float f10, DefaultFlingBehavior defaultFlingBehavior, ScrollScope scrollScope, Continuation continuation) {
            super(2, continuation);
            this.$initialVelocity = f10;
            this.this$0 = defaultFlingBehavior;
            this.$this_performFling = scrollScope;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @NotNull
        public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
            return new AnonymousClass2(this.$initialVelocity, this.this$0, this.$this_performFling, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            float f10;
            s0 s0Var;
            Object objG = pf.b.g();
            int i10 = this.label;
            if (i10 == 0) {
                kotlin.d.b(obj);
                if (Math.abs(this.$initialVelocity) <= 1.0f) {
                    f10 = this.$initialVelocity;
                    return kotlin.coroutines.jvm.internal.b.c(f10);
                }
                final s0 s0Var2 = new s0();
                s0Var2.f93329b = this.$initialVelocity;
                final s0 s0Var3 = new s0();
                AnimationState animationStateAnimationState$default = AnimationStateKt.AnimationState$default(0.0f, this.$initialVelocity, 0L, 0L, false, 28, null);
                DecayAnimationSpec decayAnimationSpec = this.this$0.flingDecay;
                final ScrollScope scrollScope = this.$this_performFling;
                final DefaultFlingBehavior defaultFlingBehavior = this.this$0;
                Function1<AnimationScope<Float, AnimationVector1D>, Unit> function1 = new Function1<AnimationScope<Float, AnimationVector1D>, Unit>() { // from class: androidx.compose.foundation.gestures.DefaultFlingBehavior.performFling.2.1
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public /* bridge */ /* synthetic */ Unit invoke(AnimationScope<Float, AnimationVector1D> animationScope) {
                        invoke2(animationScope);
                        return Unit.f93236a;
                    }

                    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(@NotNull AnimationScope<Float, AnimationVector1D> animateDecay) {
                        Intrinsics.checkNotNullParameter(animateDecay, "$this$animateDecay");
                        float fFloatValue = animateDecay.getValue().floatValue() - s0Var3.f93329b;
                        float fScrollBy = scrollScope.scrollBy(fFloatValue);
                        s0Var3.f93329b = animateDecay.getValue().floatValue();
                        s0Var2.f93329b = animateDecay.getVelocity().floatValue();
                        if (Math.abs(fFloatValue - fScrollBy) > 0.5f) {
                            animateDecay.cancelAnimation();
                        }
                        DefaultFlingBehavior defaultFlingBehavior2 = defaultFlingBehavior;
                        defaultFlingBehavior2.setLastAnimationCycleCount(defaultFlingBehavior2.getLastAnimationCycleCount() + 1);
                    }
                };
                this.L$0 = s0Var2;
                this.label = 1;
                if (SuspendAnimationKt.animateDecay$default(animationStateAnimationState$default, decayAnimationSpec, false, function1, this, 2, null) == objG) {
                    return objG;
                }
                s0Var = s0Var2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s0Var = (s0) this.L$0;
                kotlin.d.b(obj);
            }
            f10 = s0Var.f93329b;
            return kotlin.coroutines.jvm.internal.b.c(f10);
        }

        @Override // kotlin.jvm.functions.Function2
        @Nullable
        public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
            return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public DefaultFlingBehavior(@NotNull DecayAnimationSpec<Float> flingDecay, @NotNull MotionDurationScale motionDurationScale) {
        Intrinsics.checkNotNullParameter(flingDecay, "flingDecay");
        Intrinsics.checkNotNullParameter(motionDurationScale, "motionDurationScale");
        this.flingDecay = flingDecay;
        this.motionDurationScale = motionDurationScale;
    }

    public final int getLastAnimationCycleCount() {
        return this.lastAnimationCycleCount;
    }

    @Override // androidx.compose.foundation.gestures.FlingBehavior
    @Nullable
    public Object performFling(@NotNull ScrollScope scrollScope, float f10, @NotNull Continuation continuation) {
        this.lastAnimationCycleCount = 0;
        return g.g(this.motionDurationScale, new AnonymousClass2(f10, this, scrollScope, null), continuation);
    }

    public final void setLastAnimationCycleCount(int i10) {
        this.lastAnimationCycleCount = i10;
    }

    public /* synthetic */ DefaultFlingBehavior(DecayAnimationSpec decayAnimationSpec, MotionDurationScale motionDurationScale, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(decayAnimationSpec, (i10 & 2) != 0 ? ScrollableKt.getDefaultScrollMotionDurationScale() : motionDurationScale);
    }
}
