package androidx.compose.foundation.gestures;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.DragGestureDetectorKt", f = "DragGestureDetector.kt", l = {876}, m = "awaitDragOrCancellation-rnUCldI")
final class DragGestureDetectorKt$awaitDragOrCancellation$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    DragGestureDetectorKt$awaitDragOrCancellation$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorKt.m249awaitDragOrCancellationrnUCldI(null, 0L, this);
    }
}
