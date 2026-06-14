package androidx.room;

import androidx.room.CoroutinesRoom;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.room.CoroutinesRoom$Companion", f = "CoroutinesRoom.android.kt", l = {64, 94}, m = "execute")
final class CoroutinesRoom$Companion$execute$3<R> extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CoroutinesRoom.Companion this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CoroutinesRoom$Companion$execute$3(CoroutinesRoom.Companion companion, Continuation continuation) {
        super(continuation);
        this.this$0 = companion;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.execute(null, false, null, null, this);
    }
}
