package androidx.compose.foundation.lazy;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVector2D;
import androidx.compose.ui.unit.IntOffset;
import com.vungle.ads.internal.protos.Sdk;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.compose.foundation.lazy.LazyListItemPlacementAnimator$getAnimatedOffset$1", f = "LazyListItemPlacementAnimator.kt", l = {Sdk.SDKError.Reason.AD_RESPONSE_TIMED_OUT_VALUE}, m = "invokeSuspend")
final class LazyListItemPlacementAnimator$getAnimatedOffset$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ PlaceableInfo $item;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyListItemPlacementAnimator$getAnimatedOffset$1(PlaceableInfo placeableInfo, Continuation continuation) {
        super(2, continuation);
        this.$item = placeableInfo;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new LazyListItemPlacementAnimator$getAnimatedOffset$1(this.$item, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = pf.b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            Animatable<IntOffset, AnimationVector2D> animatedOffset = this.$item.getAnimatedOffset();
            IntOffset intOffsetM4060boximpl = IntOffset.m4060boximpl(this.$item.getTargetOffset());
            this.label = 1;
            if (animatedOffset.snapTo(intOffsetM4060boximpl, this) == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
        }
        this.$item.setInProgress(false);
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((LazyListItemPlacementAnimator$getAnimatedOffset$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
