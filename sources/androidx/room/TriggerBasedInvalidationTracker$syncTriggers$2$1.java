package androidx.room;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "connection", "Landroidx/room/Transactor;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1", f = "InvalidationTracker.kt", l = {307, 314}, m = "invokeSuspend")
final class TriggerBasedInvalidationTracker$syncTriggers$2$1 extends kotlin.coroutines.jvm.internal.k implements Function2<Transactor, Continuation, Object> {
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ TriggerBasedInvalidationTracker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TriggerBasedInvalidationTracker$syncTriggers$2$1(TriggerBasedInvalidationTracker triggerBasedInvalidationTracker, Continuation continuation) {
        super(2, continuation);
        this.this$0 = triggerBasedInvalidationTracker;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        TriggerBasedInvalidationTracker$syncTriggers$2$1 triggerBasedInvalidationTracker$syncTriggers$2$1 = new TriggerBasedInvalidationTracker$syncTriggers$2$1(this.this$0, continuation);
        triggerBasedInvalidationTracker$syncTriggers$2$1.L$0 = obj;
        return triggerBasedInvalidationTracker$syncTriggers$2$1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Transactor transactor, Continuation continuation) {
        return ((TriggerBasedInvalidationTracker$syncTriggers$2$1) create(transactor, continuation)).invokeSuspend(Unit.f93236a);
    }

    /* JADX WARN: Removed duplicated region for block: B:77:0x00be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // kotlin.coroutines.jvm.internal.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.room.TriggerBasedInvalidationTracker$syncTriggers$2$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
