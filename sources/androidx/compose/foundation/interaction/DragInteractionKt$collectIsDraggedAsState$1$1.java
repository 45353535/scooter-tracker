package androidx.compose.foundation.interaction;

import androidx.compose.foundation.interaction.DragInteraction;
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
@e(c = "androidx.compose.foundation.interaction.DragInteractionKt$collectIsDraggedAsState$1$1", f = "DragInteraction.kt", l = {84}, m = "invokeSuspend")
final class DragInteractionKt$collectIsDraggedAsState$1$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ MutableState<Boolean> $isDragged;
    final /* synthetic */ InteractionSource $this_collectIsDraggedAsState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DragInteractionKt$collectIsDraggedAsState$1$1(InteractionSource interactionSource, MutableState<Boolean> mutableState, Continuation continuation) {
        super(2, continuation);
        this.$this_collectIsDraggedAsState = interactionSource;
        this.$isDragged = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        return new DragInteractionKt$collectIsDraggedAsState$1$1(this.$this_collectIsDraggedAsState, this.$isDragged, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            final ArrayList arrayList = new ArrayList();
            Flow interactions = this.$this_collectIsDraggedAsState.getInteractions();
            final MutableState<Boolean> mutableState = this.$isDragged;
            FlowCollector flowCollector = new FlowCollector() { // from class: androidx.compose.foundation.interaction.DragInteractionKt$collectIsDraggedAsState$1$1.1
                @Override // kotlinx.coroutines.flow.FlowCollector
                @Nullable
                public final Object emit(@NotNull Interaction interaction, @NotNull Continuation continuation) {
                    if (interaction instanceof DragInteraction.Start) {
                        arrayList.add(interaction);
                    } else if (interaction instanceof DragInteraction.Stop) {
                        arrayList.remove(((DragInteraction.Stop) interaction).getStart());
                    } else if (interaction instanceof DragInteraction.Cancel) {
                        arrayList.remove(((DragInteraction.Cancel) interaction).getStart());
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
        return ((DragInteractionKt$collectIsDraggedAsState$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
