package androidx.room.util;

import androidx.room.PooledConnection;
import androidx.room.TransactionScope;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.z;
import pf.b;

/* JADX INFO: Add missing generic type declarations: [R] */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u0002H\n"}, d2 = {"<anonymous>", "R", "Landroidx/room/TransactionScope;"}, k = 3, mv = {2, 1, 0}, xi = 176)
@e(c = "androidx.room.util.DBUtil__DBUtilKt$internalPerform$2$result$1", f = "DBUtil.kt", l = {59}, m = "invokeSuspend")
public final class DBUtil__DBUtilKt$internalPerform$2$result$1<R> extends k implements Function2<TransactionScope<R>, Continuation, Object> {
    final /* synthetic */ Function2<PooledConnection, Continuation, Object> $block;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DBUtil__DBUtilKt$internalPerform$2$result$1(Function2<? super PooledConnection, ? super Continuation, ? extends Object> function2, Continuation continuation) {
        super(2, continuation);
        this.$block = function2;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        DBUtil__DBUtilKt$internalPerform$2$result$1 dBUtil__DBUtilKt$internalPerform$2$result$1 = new DBUtil__DBUtilKt$internalPerform$2$result$1(this.$block, continuation);
        dBUtil__DBUtilKt$internalPerform$2$result$1.L$0 = obj;
        return dBUtil__DBUtilKt$internalPerform$2$result$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(TransactionScope<R> transactionScope, Continuation continuation) {
        return ((DBUtil__DBUtilKt$internalPerform$2$result$1) create(transactionScope, continuation)).invokeSuspend(Unit.f93236a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = b.g();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
            return obj;
        }
        d.b(obj);
        TransactionScope transactionScope = (TransactionScope) this.L$0;
        Function2<PooledConnection, Continuation, Object> function2 = this.$block;
        this.label = 1;
        Object objInvoke = function2.invoke(transactionScope, this);
        return objInvoke == objG ? objG : objInvoke;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        TransactionScope transactionScope = (TransactionScope) this.L$0;
        z.c(10);
        return this.$block.invoke(transactionScope, this);
    }
}
