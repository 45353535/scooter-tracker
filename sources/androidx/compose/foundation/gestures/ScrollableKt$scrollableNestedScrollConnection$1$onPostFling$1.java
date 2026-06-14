package androidx.compose.foundation.gestures;

import androidx.compose.foundation.gestures.ScrollableKt;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.compose.foundation.gestures.ScrollableKt$scrollableNestedScrollConnection$1", f = "Scrollable.kt", l = {516}, m = "onPostFling-RZ2iAVY")
final class ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1 extends kotlin.coroutines.jvm.internal.d {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ScrollableKt.C14161 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ScrollableKt$scrollableNestedScrollConnection$1$onPostFling$1(ScrollableKt.C14161 c14161, Continuation continuation) {
        super(continuation);
        this.this$0 = c14161;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo314onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
