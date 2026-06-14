package androidx.work.impl;

import android.content.Context;
import androidx.work.ForegroundUpdater;
import androidx.work.ListenableWorker;
import androidx.work.Logger;
import androidx.work.impl.model.WorkSpec;
import androidx.work.impl.utils.WorkForegroundKt;
import androidx.work.impl.utils.taskexecutor.TaskExecutor;
import com.google.common.util.concurrent.ListenableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, d2 = {"<anonymous>", "Landroidx/work/ListenableWorker$Result;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@kotlin.coroutines.jvm.internal.e(c = "androidx.work.impl.WorkerWrapper$runWorker$result$1", f = "WorkerWrapper.kt", l = {300, 311}, m = "invokeSuspend")
final class WorkerWrapper$runWorker$result$1 extends kotlin.coroutines.jvm.internal.k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ ForegroundUpdater $foregroundUpdater;
    final /* synthetic */ ListenableWorker $worker;
    int label;
    final /* synthetic */ WorkerWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WorkerWrapper$runWorker$result$1(WorkerWrapper workerWrapper, ListenableWorker listenableWorker, ForegroundUpdater foregroundUpdater, Continuation continuation) {
        super(2, continuation);
        this.this$0 = workerWrapper;
        this.$worker = listenableWorker;
        this.$foregroundUpdater = foregroundUpdater;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new WorkerWrapper$runWorker$result$1(this.this$0, this.$worker, this.$foregroundUpdater, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        WorkerWrapper$runWorker$result$1 workerWrapper$runWorker$result$1;
        Object objG = pf.b.g();
        int i10 = this.label;
        if (i10 == 0) {
            kotlin.d.b(obj);
            Context context = this.this$0.appContext;
            WorkSpec workSpec = this.this$0.getWorkSpec();
            ListenableWorker listenableWorker = this.$worker;
            ForegroundUpdater foregroundUpdater = this.$foregroundUpdater;
            TaskExecutor taskExecutor = this.this$0.workTaskExecutor;
            this.label = 1;
            workerWrapper$runWorker$result$1 = this;
            if (WorkForegroundKt.workForeground(context, workSpec, listenableWorker, foregroundUpdater, taskExecutor, workerWrapper$runWorker$result$1) != objG) {
            }
        }
        if (i10 != 1) {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return obj;
        }
        kotlin.d.b(obj);
        workerWrapper$runWorker$result$1 = this;
        String str = WorkerWrapperKt.TAG;
        WorkerWrapper workerWrapper = workerWrapper$runWorker$result$1.this$0;
        Logger.get().debug(str, "Starting work for " + workerWrapper.getWorkSpec().workerClassName);
        ListenableFuture<ListenableWorker.Result> listenableFutureStartWork = workerWrapper$runWorker$result$1.$worker.startWork();
        Intrinsics.checkNotNullExpressionValue(listenableFutureStartWork, "startWork(...)");
        ListenableWorker listenableWorker2 = workerWrapper$runWorker$result$1.$worker;
        workerWrapper$runWorker$result$1.label = 2;
        Object objAwaitWithin = WorkerWrapperKt.awaitWithin(listenableFutureStartWork, listenableWorker2, this);
        return objAwaitWithin == objG ? objG : objAwaitWithin;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((WorkerWrapper$runWorker$result$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
