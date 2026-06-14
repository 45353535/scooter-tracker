package hg;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes3.dex */
final class z implements StateFlow, c, ig.q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ StateFlow f73485b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Job f73486c;

    public z(StateFlow stateFlow, Job job) {
        this.f73485b = stateFlow;
        this.f73486c = job;
    }

    @Override // ig.q
    public Flow a(CoroutineContext coroutineContext, int i10, gg.a aVar) {
        return l0.d(this, coroutineContext, i10, aVar);
    }

    @Override // kotlinx.coroutines.flow.SharedFlow, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, Continuation continuation) {
        return this.f73485b.collect(flowCollector, continuation);
    }

    @Override // kotlinx.coroutines.flow.StateFlow
    public Object getValue() {
        return this.f73485b.getValue();
    }
}
