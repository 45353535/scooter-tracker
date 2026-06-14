package androidx.work.impl;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "Landroidx/work/impl/WorkerWrapper$Resolution;", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.work.impl.WorkerWrapper$launch$1$resolution$1", f = "WorkerWrapper.kt", l = {98}, m = "invokeSuspend")
final class WorkerWrapper$launch$1$resolution$1 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
    int label;
    final /* synthetic */ WorkerWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WorkerWrapper$launch$1$resolution$1(WorkerWrapper workerWrapper, Continuation continuation) {
        super(2, continuation);
        this.this$0 = workerWrapper;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new WorkerWrapper$launch$1$resolution$1(this.this$0, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = pf.b.g();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        WorkerWrapper workerWrapper = this.this$0;
        this.label = 1;
        Object objRunWorker = workerWrapper.runWorker(this);
        return objRunWorker == objG ? objG : objRunWorker;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((WorkerWrapper$launch$1$resolution$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
