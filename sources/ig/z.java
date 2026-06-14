package ig;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class z implements FlowCollector {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final gg.y f74832b;

    public z(gg.y yVar) {
        this.f74832b = yVar;
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(Object obj, Continuation continuation) {
        Object objW = this.f74832b.w(obj, continuation);
        return objW == pf.b.g() ? objW : Unit.f93236a;
    }
}
