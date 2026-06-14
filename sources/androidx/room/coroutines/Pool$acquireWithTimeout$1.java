package androidx.room.coroutines;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.room.coroutines.Pool", f = "ConnectionPoolImpl.kt", l = {231}, m = "acquireWithTimeout-KLykuaI")
final class Pool$acquireWithTimeout$1 extends kotlin.coroutines.jvm.internal.d {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ Pool this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Pool$acquireWithTimeout$1(Pool pool, Continuation continuation) {
        super(continuation);
        this.this$0 = pool;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m4248acquireWithTimeoutKLykuaI(0L, null, this);
    }
}
