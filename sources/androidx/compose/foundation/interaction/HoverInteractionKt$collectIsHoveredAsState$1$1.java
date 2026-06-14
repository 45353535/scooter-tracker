package androidx.compose.foundation.interaction;

import androidx.compose.foundation.interaction.HoverInteraction;
import androidx.compose.runtime.MutableState;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pf.b;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1$1", f = "HoverInteraction.kt", l = {69}, m = "invokeSuspend")
final class HoverInteractionKt$collectIsHoveredAsState$1$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ MutableState<Boolean> $isHovered;
    final /* synthetic */ InteractionSource $this_collectIsHoveredAsState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HoverInteractionKt$collectIsHoveredAsState$1$1(InteractionSource interactionSource, MutableState<Boolean> mutableState, Continuation continuation) {
        super(2, continuation);
        this.$this_collectIsHoveredAsState = interactionSource;
        this.$isHovered = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new HoverInteractionKt$collectIsHoveredAsState$1$1(this.$this_collectIsHoveredAsState, this.$isHovered, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            final ArrayList arrayList = new ArrayList();
            Flow interactions = this.$this_collectIsHoveredAsState.getInteractions();
            final MutableState<Boolean> mutableState = this.$isHovered;
            FlowCollector flowCollector = new FlowCollector() { // from class: androidx.compose.foundation.interaction.HoverInteractionKt$collectIsHoveredAsState$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(@NotNull Interaction interaction, @NotNull Continuation continuation) {
                    if (interaction instanceof HoverInteraction.Enter) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof HoverInteraction.Exit) {
                        arrayList.remove(((HoverInteraction.Exit) interaction).getEnter());
                    }
                    mutableState.setValue(kotlin.coroutines.jvm.internal.b.a(!arrayList.isEmpty()));
                    return Unit.f93236a;
                }
            };
            this.label = 1;
            if (interactions.collect(flowCollector, this) == objG) {
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
        return ((HoverInteractionKt$collectIsHoveredAsState$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
