package androidx.compose.material;

import androidx.compose.runtime.State;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.compose.material.SliderKt$Slider$3$drag$1$1", f = "Slider.kt", l = {}, m = "invokeSuspend")
final class SliderKt$Slider$3$drag$1$1 extends k implements Function3<CoroutineScope, Float, Continuation, Object> {
    final /* synthetic */ State<Function1<Float, Unit>> $gestureEndAction;
    /* synthetic */ float F$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SliderKt$Slider$3$drag$1$1(State<? extends Function1<? super Float, Unit>> state, Continuation continuation) {
        super(3, continuation);
        this.$gestureEndAction = state;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Float f10, Continuation continuation) {
        return invoke(coroutineScope, f10.floatValue(), continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        b.g();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        d.b(obj);
        this.$gestureEndAction.getValue().invoke(kotlin.coroutines.jvm.internal.b.c(this.F$0));
        return Unit.f93236a;
    }

    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, float f10, @Nullable Continuation continuation) {
        SliderKt$Slider$3$drag$1$1 sliderKt$Slider$3$drag$1$1 = new SliderKt$Slider$3$drag$1$1(this.$gestureEndAction, continuation);
        sliderKt$Slider$3$drag$1$1.F$0 = f10;
        return sliderKt$Slider$3$drag$1$1.invokeSuspend(Unit.f93236a);
    }
}
