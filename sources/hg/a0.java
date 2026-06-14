package hg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
final class a0 extends a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function2 f73171b;

    public a0(Function2 function2) {
        this.f73171b = function2;
    }

    @Override // hg.a
    public Object c(FlowCollector flowCollector, Continuation continuation) {
        Object objInvoke = this.f73171b.invoke(flowCollector, continuation);
        return objInvoke == pf.b.g() ? objInvoke : Unit.f93236a;
    }
}
