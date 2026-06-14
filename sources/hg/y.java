package hg;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.SharedFlow;

/* JADX INFO: loaded from: classes3.dex */
final class y implements SharedFlow, c, ig.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ SharedFlow f73483b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Job f73484c;

    public y(SharedFlow sharedFlow, Job job) {
        this.f73483b = sharedFlow;
        this.f73484c = job;
    }

    @Override // ig.q
    public Flow a(CoroutineContext coroutineContext, int i10, gg.a aVar) {
        return c0.e(this, coroutineContext, i10, aVar);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, Continuation continuation) {
        return this.f73483b.collect(flowCollector, continuation);
    }
}
