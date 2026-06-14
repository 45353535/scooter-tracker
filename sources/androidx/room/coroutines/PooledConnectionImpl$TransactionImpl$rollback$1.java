package androidx.room.coroutines;

import androidx.room.coroutines.PooledConnectionImpl;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.room.coroutines.PooledConnectionImpl$TransactionImpl", f = "ConnectionPoolImpl.kt", l = {640}, m = "rollback")
final class PooledConnectionImpl$TransactionImpl$rollback$1 extends kotlin.coroutines.jvm.internal.d {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PooledConnectionImpl.TransactionImpl<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PooledConnectionImpl$TransactionImpl$rollback$1(PooledConnectionImpl.TransactionImpl<T> transactionImpl, Continuation continuation) {
        super(continuation);
        this.this$0 = transactionImpl;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.rollback(null, this);
    }
}
