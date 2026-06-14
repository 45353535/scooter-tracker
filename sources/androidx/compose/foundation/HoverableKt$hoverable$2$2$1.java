package androidx.compose.foundation;

import androidx.compose.foundation.HoverableKt;
import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.runtime.MutableState;
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
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.compose.foundation.HoverableKt$hoverable$2$2$1", f = "Hoverable.kt", l = {88}, m = "invokeSuspend")
final class HoverableKt$hoverable$2$2$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ boolean $enabled;
    final /* synthetic */ MutableState<HoverInteraction.Enter> $hoverInteraction$delegate;
    final /* synthetic */ MutableInteractionSource $interactionSource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HoverableKt$hoverable$2$2$1(boolean z10, MutableState<HoverInteraction.Enter> mutableState, MutableInteractionSource mutableInteractionSource, Continuation continuation) {
        super(2, continuation);
        this.$enabled = z10;
        this.$hoverInteraction$delegate = mutableState;
        this.$interactionSource = mutableInteractionSource;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new HoverableKt$hoverable$2$2$1(this.$enabled, this.$hoverInteraction$delegate, this.$interactionSource, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = pf.b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            if (!this.$enabled) {
                MutableState<HoverInteraction.Enter> mutableState = this.$hoverInteraction$delegate;
                MutableInteractionSource mutableInteractionSource = this.$interactionSource;
                this.label = 1;
                if (HoverableKt.AnonymousClass2.invoke$emitExit(mutableState, mutableInteractionSource, this) == objG) {
                    return objG;
                }
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
        }
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull CoroutineScope coroutineScope, @Nullable Continuation continuation) {
        return ((HoverableKt$hoverable$2$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
