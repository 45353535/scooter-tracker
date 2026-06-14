package androidx.room.util;

import androidx.room.RoomDatabase;
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
@Metadata(d1 = {"\u0000\n\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\n¨\u0006\u0003"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;", "androidx/room/util/DBUtil__DBUtil_androidKt$compatCoroutineExecute$2"}, k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "androidx.room.util.DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1", f = "DBUtil.android.kt", l = {261}, m = "invokeSuspend")
public final class DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ Function1 $block$inlined;
    final /* synthetic */ RoomDatabase $db$inlined;
    final /* synthetic */ boolean $inTransaction$inlined;
    final /* synthetic */ boolean $isReadOnly$inlined;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1(Continuation continuation, RoomDatabase roomDatabase, boolean z10, boolean z11, Function1 function1) {
        super(2, continuation);
        this.$db$inlined = roomDatabase;
        this.$isReadOnly$inlined = z10;
        this.$inTransaction$inlined = z11;
        this.$block$inlined = function1;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1(continuation, this.$db$inlined, this.$isReadOnly$inlined, this.$inTransaction$inlined, this.$block$inlined);
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
        RoomDatabase roomDatabase = this.$db$inlined;
        boolean z10 = this.$isReadOnly$inlined;
        DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1 = new DBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1(this.$inTransaction$inlined, z10, roomDatabase, null, this.$block$inlined);
        this.label = 1;
        Object objUseConnection = roomDatabase.useConnection(z10, dBUtil__DBUtil_androidKt$performSuspending$lambda$1$$inlined$internalPerform$1, this);
        return objUseConnection == objG ? objG : objUseConnection;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((DBUtil__DBUtil_androidKt$performSuspending$$inlined$compatCoroutineExecute$DBUtil__DBUtil_androidKt$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
