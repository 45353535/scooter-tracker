package androidx.room.coroutines;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.room.coroutines.Pool$acquireWithTimeout$2", f = "ConnectionPoolImpl.kt", l = {231}, m = "invokeSuspend")
final class Pool$acquireWithTimeout$2 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ Ref$ObjectRef $connection;
    Object L$0;
    int label;
    final /* synthetic */ Pool this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    Pool$acquireWithTimeout$2(Ref$ObjectRef ref$ObjectRef, Pool pool, Continuation continuation) {
        super(2, continuation);
        this.$connection = ref$ObjectRef;
        this.this$0 = pool;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new Pool$acquireWithTimeout$2(this.$connection, this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Ref$ObjectRef ref$ObjectRef;
        Object objG = pf.b.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.d.b(obj);
            Ref$ObjectRef ref$ObjectRef2 = this.$connection;
            Pool pool = this.this$0;
            this.L$0 = ref$ObjectRef2;
            this.label = 1;
            Object objAcquire = pool.acquire(this);
            if (objAcquire == objG) {
                return objG;
            }
            ref$ObjectRef = ref$ObjectRef2;
            obj = objAcquire;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ref$ObjectRef = (Ref$ObjectRef) this.L$0;
            kotlin.d.b(obj);
        }
        ref$ObjectRef.f93280b = obj;
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((Pool$acquireWithTimeout$2) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
