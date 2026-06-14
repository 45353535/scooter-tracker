package androidx.room.util;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import pf.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\b\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "androidx.room.util.DBUtil__DBUtil_androidKt$compatCoroutineExecute$2", f = "DBUtil.android.kt", l = {118}, m = "invokeSuspend")
public final class DBUtil__DBUtil_androidKt$compatCoroutineExecute$2 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ Function1<Continuation, Object> $block;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DBUtil__DBUtil_androidKt$compatCoroutineExecute$2(Function1<? super Continuation, ? extends Object> function1, Continuation continuation) {
        super(2, continuation);
        this.$block = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new DBUtil__DBUtil_androidKt$compatCoroutineExecute$2(this.$block, continuation);
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
        Function1<Continuation, Object> function1 = this.$block;
        this.label = 1;
        Object objInvoke = function1.invoke(this);
        return objInvoke == objG ? objG : objInvoke;
    }

    public final Object invokeSuspend$$forInline(Object obj) {
        return this.$block.invoke(this);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((DBUtil__DBUtil_androidKt$compatCoroutineExecute$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
