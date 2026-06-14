package androidx.compose.animation;

import androidx.compose.animation.SizeAnimationModifier;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationEndReason;
import androidx.compose.animation.core.AnimationResult;
import androidx.compose.animation.core.AnimationSpec;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.unit.IntSize;
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
@e(c = "androidx.compose.animation.SizeAnimationModifier$animateTo$data$1$1", f = "AnimationModifier.kt", l = {124}, m = "invokeSuspend")
final class SizeAnimationModifier$animateTo$data$1$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ long $targetSize;
    final /* synthetic */ SizeAnimationModifier.AnimData $this_apply;
    int label;
    final /* synthetic */ SizeAnimationModifier this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SizeAnimationModifier$animateTo$data$1$1(SizeAnimationModifier.AnimData animData, long j10, SizeAnimationModifier sizeAnimationModifier, Continuation continuation) {
        super(2, continuation);
        this.$this_apply = animData;
        this.$targetSize = j10;
        this.this$0 = sizeAnimationModifier;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new SizeAnimationModifier$animateTo$data$1$1(this.$this_apply, this.$targetSize, this.this$0, continuation);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        SizeAnimationModifier$animateTo$data$1$1 sizeAnimationModifier$animateTo$data$1$1;
        Function2<IntSize, IntSize, Unit> listener;
        Object objG = b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            Animatable<IntSize, AnimationVector2D> anim = this.$this_apply.getAnim();
            IntSize intSizeM4103boximpl = IntSize.m4103boximpl(this.$targetSize);
            AnimationSpec<IntSize> animSpec = this.this$0.getAnimSpec();
            this.label = 1;
            sizeAnimationModifier$animateTo$data$1$1 = this;
            obj = Animatable.animateTo$default(anim, intSizeM4103boximpl, animSpec, null, null, sizeAnimationModifier$animateTo$data$1$1, 12, null);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            sizeAnimationModifier$animateTo$data$1$1 = this;
        }
        AnimationResult animationResult = (AnimationResult) obj;
        if (animationResult.getEndReason() == AnimationEndReason.Finished && (listener = sizeAnimationModifier$animateTo$data$1$1.this$0.getListener()) != 0) {
            listener.invoke(IntSize.m4103boximpl(sizeAnimationModifier$animateTo$data$1$1.$this_apply.m92getStartSizeYbymL2g()), animationResult.getEndState().getValue());
        }
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((SizeAnimationModifier$animateTo$data$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
