package ig;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class h extends g {
    public /* synthetic */ h(Flow flow, CoroutineContext coroutineContext, int i10, gg.a aVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(flow, (i11 & 2) != 0 ? kotlin.coroutines.e.f93267b : coroutineContext, (i11 & 4) != 0 ? -3 : i10, (i11 & 8) != 0 ? gg.a.f72765b : aVar);
    }

    @Override // ig.e
    protected e i(CoroutineContext coroutineContext, int i10, gg.a aVar) {
        return new h(this.f74770e, coroutineContext, i10, aVar);
    }

    @Override // ig.e
    public Flow j() {
        return this.f74770e;
    }

    @Override // ig.g
    protected Object q(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f74770e.collect(flowCollector, continuation);
        return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
    }

    public h(Flow flow, CoroutineContext coroutineContext, int i10, gg.a aVar) {
        super(flow, coroutineContext, i10, aVar);
    }
}
