package androidx.compose.material;

import androidx.compose.material.SwipeableState;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
@e(c = "androidx.compose.material.SwipeableState$snapTo$2", f = "Swipeable.kt", l = {316}, m = "emit")
final class SwipeableState$snapTo$2$emit$1 extends d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SwipeableState.C15442 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SwipeableState$snapTo$2$emit$1(SwipeableState.C15442 c15442, Continuation continuation) {
        super(continuation);
        this.this$0 = c15442;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit((Map) null, (Continuation) this);
    }
}
