package androidx.compose.material;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.compose.material.DragGestureDetectorCopyKt", f = "DragGestureDetectorCopy.kt", l = {123, 161}, m = "awaitHorizontalPointerSlopOrCancellation-gDDlDlE")
final class DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1 extends d {
    float F$0;
    float F$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;

    DragGestureDetectorCopyKt$awaitHorizontalPointerSlopOrCancellation$1(Continuation continuation) {
        super(continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return DragGestureDetectorCopyKt.m998awaitHorizontalPointerSlopOrCancellationgDDlDlE(null, 0L, 0, null, this);
    }
}
