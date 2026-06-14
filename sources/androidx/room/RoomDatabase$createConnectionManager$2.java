package androidx.room;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
final /* synthetic */ class RoomDatabase$createConnectionManager$2 extends kotlin.jvm.internal.y implements Function2<Function1<? super Continuation, ? extends Object>, Continuation, Object> {
    RoomDatabase$createConnectionManager$2(Object obj) {
        super(2, obj, RoomDatabaseKt__RoomDatabase_androidKt.class, "compatTransactionCoroutineExecute", "compatTransactionCoroutineExecute(Landroidx/room/RoomDatabase;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 1);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Function1<? super Continuation, ? extends Object> function1, Continuation continuation) {
        return RoomDatabaseKt.compatTransactionCoroutineExecute((RoomDatabase) this.receiver, function1, continuation);
    }
}
