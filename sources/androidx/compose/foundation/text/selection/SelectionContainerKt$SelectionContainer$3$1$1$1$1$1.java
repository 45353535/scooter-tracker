package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.LongPressTextDragObserverKt;
import androidx.compose.foundation.text.TextDragObserver;
import androidx.compose.ui.input.pointer.PointerInputScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.compose.foundation.text.selection.SelectionContainerKt$SelectionContainer$3$1$1$1$1$1", f = "SelectionContainer.kt", l = {126}, m = "invokeSuspend")
final class SelectionContainerKt$SelectionContainer$3$1$1$1$1$1 extends k implements Function2<PointerInputScope, Continuation, Object> {
    final /* synthetic */ TextDragObserver $observer;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SelectionContainerKt$SelectionContainer$3$1$1$1$1$1(TextDragObserver textDragObserver, Continuation continuation) {
        super(2, continuation);
        this.$observer = textDragObserver;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final Continuation create(@Nullable Object obj, @NotNull Continuation continuation) {
        SelectionContainerKt$SelectionContainer$3$1$1$1$1$1 selectionContainerKt$SelectionContainer$3$1$1$1$1$1 = new SelectionContainerKt$SelectionContainer$3$1$1$1$1$1(this.$observer, continuation);
        selectionContainerKt$SelectionContainer$3$1$1$1$1$1.L$0 = obj;
        return selectionContainerKt$SelectionContainer$3$1$1$1$1$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull PointerInputScope pointerInputScope, @Nullable Continuation continuation) {
        return ((SelectionContainerKt$SelectionContainer$3$1$1$1$1$1) create(pointerInputScope, continuation)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object objG = pf.b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            PointerInputScope pointerInputScope = (PointerInputScope) this.L$0;
            TextDragObserver textDragObserver = this.$observer;
            this.label = 1;
            if (LongPressTextDragObserverKt.detectDownAndDragGesturesWithObserver(pointerInputScope, textDragObserver, this) == objG) {
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
}
