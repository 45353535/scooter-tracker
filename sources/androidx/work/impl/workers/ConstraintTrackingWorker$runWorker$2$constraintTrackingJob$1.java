package androidx.work.impl.workers;

import androidx.work.ListenableWorker;
import androidx.work.impl.constraints.WorkConstraintsTracker;
import androidx.work.impl.model.WorkSpec;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.k;
import kotlin.d;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import pf.b;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 1, 0}, xi = 48)
@e(c = "androidx.work.impl.workers.ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1", f = "ConstraintTrackingWorker.kt", l = {129}, m = "invokeSuspend")
final class ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1 extends k implements Function2<CoroutineScope, Continuation, Object> {
    final /* synthetic */ AtomicInteger $atomicReason;
    final /* synthetic */ ListenableFuture<ListenableWorker.Result> $future;
    final /* synthetic */ WorkConstraintsTracker $workConstraintsTracker;
    final /* synthetic */ WorkSpec $workSpec;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1(WorkConstraintsTracker workConstraintsTracker, WorkSpec workSpec, AtomicInteger atomicInteger, ListenableFuture<ListenableWorker.Result> listenableFuture, Continuation continuation) {
        super(2, continuation);
        this.$workConstraintsTracker = workConstraintsTracker;
        this.$workSpec = workSpec;
        this.$atomicReason = atomicInteger;
        this.$future = listenableFuture;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Continuation create(Object obj, Continuation continuation) {
        return new ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1(this.$workConstraintsTracker, this.$workSpec, this.$atomicReason, this.$future, continuation);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Object objG = b.g();
        int i10 = this.label;
        if (i10 == 0) {
            d.b(obj);
            WorkConstraintsTracker workConstraintsTracker = this.$workConstraintsTracker;
            WorkSpec workSpec = this.$workSpec;
            this.label = 1;
            obj = ConstraintTrackingWorkerKt.awaitConstraintsNotMet(workConstraintsTracker, workSpec, this);
            if (obj == objG) {
                return objG;
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            d.b(obj);
        }
        this.$atomicReason.set(((Number) obj).intValue());
        this.$future.cancel(true);
        return Unit.f93236a;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
        return ((ConstraintTrackingWorker$runWorker$2$constraintTrackingJob$1) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
    }
}
