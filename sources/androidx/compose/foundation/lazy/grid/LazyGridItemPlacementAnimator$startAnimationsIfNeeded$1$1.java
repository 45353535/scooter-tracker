package androidx.compose.foundation.lazy.grid;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.ui.unit.IntOffset;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.compose.foundation.lazy.grid.LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1", f = "LazyGridItemPlacementAnimator.kt", l = {357}, m = "invokeSuspend")
final class LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ FiniteAnimationSpec<IntOffset> $animationSpec;
    final /* synthetic */ PlaceableInfo $placeableInfo;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1(PlaceableInfo placeableInfo, FiniteAnimationSpec<IntOffset> finiteAnimationSpec, Continuation continuation) {
        super(2, continuation);
        this.$placeableInfo = placeableInfo;
        this.$animationSpec = finiteAnimationSpec;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1(this.$placeableInfo, this.$animationSpec, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        AnimationSpec animationSpec;
        LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1 lazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1;
        Object objG = b.g();
        int i10 = this.label;
        try {
            if (i10 == 0) {
                d.b(obj);
                if (this.$placeableInfo.getAnimatedOffset().isRunning()) {
                    FiniteAnimationSpec<IntOffset> finiteAnimationSpec = this.$animationSpec;
                    animationSpec = finiteAnimationSpec instanceof SpringSpec ? (SpringSpec) finiteAnimationSpec : LazyGridItemPlacementAnimatorKt.InterruptionSpec;
                } else {
                    animationSpec = this.$animationSpec;
                }
                AnimationSpec animationSpec2 = animationSpec;
                Animatable<IntOffset, AnimationVector2D> animatedOffset = this.$placeableInfo.getAnimatedOffset();
                IntOffset intOffsetM4060boximpl = IntOffset.m4060boximpl(this.$placeableInfo.getTargetOffset());
                this.label = 1;
                lazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1 = this;
                try {
                    if (Animatable.animateTo$default(animatedOffset, intOffsetM4060boximpl, animationSpec2, null, null, lazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1, 12, null) == objG) {
                        return objG;
                    }
                } catch (CancellationException unused) {
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                d.b(obj);
                lazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1 = this;
            }
            lazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1.$placeableInfo.setInProgress(false);
        } catch (CancellationException unused2) {
        }
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((LazyGridItemPlacementAnimator$startAnimationsIfNeeded$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
