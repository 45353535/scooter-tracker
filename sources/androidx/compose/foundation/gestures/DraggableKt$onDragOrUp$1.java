package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DraggableKt", f = "Draggable.kt", l = {470}, m = "onDragOrUp-Axegvzg")
final class DraggableKt$onDragOrUp$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;

    DraggableKt$onDragOrUp$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DraggableKt.m281onDragOrUpAxegvzg(null, null, 0L, null, this);
    }
}
