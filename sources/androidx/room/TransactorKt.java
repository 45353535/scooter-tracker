package androidx.room;

import androidx.room.Transactor;
import androidx.sqlite.SQLiteStatement;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\u001a\u001c\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0086@¢\u0006\u0004\b\u0004\u0010\u0005\u001aD\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0006*\u00020\u00072(\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH\u0086@¢\u0006\u0004\b\r\u0010\u000e\u001aD\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0006*\u00020\u00072(\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH\u0086@¢\u0006\u0004\b\u000f\u0010\u000e\u001aD\u0010\u0010\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0006*\u00020\u00072(\u0010\f\u001a$\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\bH\u0086@¢\u0006\u0004\b\u0010\u0010\u000e¨\u0006\u0011"}, d2 = {"Landroidx/room/PooledConnection;", "", "sql", "", "execSQL", "(Landroidx/room/PooledConnection;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "R", "Landroidx/room/Transactor;", "Lkotlin/Function2;", "Landroidx/room/TransactionScope;", "Lkotlin/coroutines/Continuation;", "", "block", "deferredTransaction", "(Landroidx/room/Transactor;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "immediateTransaction", "exclusiveTransaction", "room-runtime"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class TransactorKt {
    @Nullable
    public static final <R> Object deferredTransaction(@NotNull Transactor transactor, @NotNull Function2<? super TransactionScope<R>, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
        return transactor.withTransaction(Transactor.SQLiteTransactionType.DEFERRED, function2, continuation);
    }

    @Nullable
    public static final <R> Object exclusiveTransaction(@NotNull Transactor transactor, @NotNull Function2<? super TransactionScope<R>, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
        return transactor.withTransaction(Transactor.SQLiteTransactionType.EXCLUSIVE, function2, continuation);
    }

    @Nullable
    public static final Object execSQL(@NotNull PooledConnection pooledConnection, @NotNull String str, @NotNull Continuation continuation) {
        Object objUsePrepared = pooledConnection.usePrepared(str, new Function1() { // from class: androidx.room.u
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(TransactorKt.execSQL$lambda$0((SQLiteStatement) obj));
            }
        }, continuation);
        return objUsePrepared == pf.b.g() ? objUsePrepared : Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean execSQL$lambda$0(SQLiteStatement it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.step();
    }

    @Nullable
    public static final <R> Object immediateTransaction(@NotNull Transactor transactor, @NotNull Function2<? super TransactionScope<R>, ? super Continuation, ? extends Object> function2, @NotNull Continuation continuation) {
        return transactor.withTransaction(Transactor.SQLiteTransactionType.IMMEDIATE, function2, continuation);
    }
}
