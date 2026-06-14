package androidx.compose.foundation;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.interaction.PressInteraction;
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
@e(c = "androidx.compose.foundation.ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1", f = "Clickable.kt", l = {549}, m = "invokeSuspend")
final class ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ MutableInteractionSource $interactionSource;
    final /* synthetic */ PressInteraction.Press $it;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1(MutableInteractionSource mutableInteractionSource, PressInteraction.Press press, Continuation continuation) {
        super(2, continuation);
        this.$interactionSource = mutableInteractionSource;
        this.$it = press;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1(this.$interactionSource, this.$it, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = pf.b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            MutableInteractionSource mutableInteractionSource = this.$interactionSource;
            PressInteraction.Release release = new PressInteraction.Release(this.$it);
            this.label = 1;
            if (mutableInteractionSource.emit(release, this) == objG) {
                return objG;
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
        return ((ClickableKt$genericClickableWithoutGesture$detectPressAndClickFromKey$1$2$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
