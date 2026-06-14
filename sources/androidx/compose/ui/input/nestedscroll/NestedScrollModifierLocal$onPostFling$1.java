package androidx.compose.ui.input.nestedscroll;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.compose.ui.input.nestedscroll.NestedScrollModifierLocal", f = "NestedScrollModifierLocal.kt", l = {94, 96}, m = "onPostFling-RZ2iAVY")
final class NestedScrollModifierLocal$onPostFling$1 extends d {
    long J$0;
    long J$1;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollModifierLocal this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NestedScrollModifierLocal$onPostFling$1(NestedScrollModifierLocal nestedScrollModifierLocal, Continuation continuation) {
        super(continuation);
        this.this$0 = nestedScrollModifierLocal;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.mo314onPostFlingRZ2iAVY(0L, 0L, this);
    }
}
