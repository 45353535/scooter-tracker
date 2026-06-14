package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import eg.k0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.compose.foundation.ClickableKt$handlePressInteraction$2$delayJob$1", f = "Clickable.kt", l = {439, 442}, m = "invokeSuspend")
final class ClickableKt$handlePressInteraction$2$delayJob$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ State<Function0<Boolean>> $delayPressInteraction;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ long $pressPoint;
    final /* synthetic */ MutableState<PressInteraction.Press> $pressedInteraction;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    ClickableKt$handlePressInteraction$2$delayJob$1(State<? extends Function0<Boolean>> state, long j10, MutableInteractionSource mutableInteractionSource, MutableState<PressInteraction.Press> mutableState, Continuation continuation) {
        super(2, continuation);
        this.$delayPressInteraction = state;
        this.$pressPoint = j10;
        this.$interactionSource = mutableInteractionSource;
        this.$pressedInteraction = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new ClickableKt$handlePressInteraction$2$delayJob$1(this.$delayPressInteraction, this.$pressPoint, this.$interactionSource, this.$pressedInteraction, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        PressInteraction.Press press;
        Object objG = pf.b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            if (this.$delayPressInteraction.getValue().invoke().booleanValue()) {
                long tapIndicationDelay = Clickable_androidKt.getTapIndicationDelay();
                this.label = 1;
                if (k0.a(tapIndicationDelay, this) != objG) {
                }
                return objG;
            }
        } else {
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                press = (PressInteraction.Press) this.L$0;
                d.b(obj);
                this.$pressedInteraction.setValue(press);
                return Unit.f93236a;
            }
            d.b(obj);
        }
        PressInteraction.Press press2 = new PressInteraction.Press(this.$pressPoint, null);
        MutableInteractionSource mutableInteractionSource = this.$interactionSource;
        this.L$0 = press2;
        this.label = 2;
        if (mutableInteractionSource.emit(press2, this) != objG) {
            press = press2;
            this.$pressedInteraction.setValue(press);
            return Unit.f93236a;
        }
        return objG;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((ClickableKt$handlePressInteraction$2$delayJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
