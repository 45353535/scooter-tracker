package ig;

import jg.l0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.b1;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public abstract class f {
    public static final Object b(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, Continuation continuation) {
        Object objI = l0.i(coroutineContext, obj2);
        try {
            a0 a0Var = new a0(continuation, coroutineContext);
            Object objE = !(function2 instanceof kotlin.coroutines.jvm.internal.a) ? pf.b.e(function2, obj, a0Var) : ((Function2) b1.g(function2, 2)).invoke(obj, a0Var);
            l0.f(coroutineContext, objI);
            if (objE == pf.b.g()) {
                kotlin.coroutines.jvm.internal.g.c(continuation);
            }
            return objE;
        } catch (Throwable th2) {
            l0.f(coroutineContext, objI);
            throw th2;
        }
    }

    public static /* synthetic */ Object c(CoroutineContext coroutineContext, Object obj, Object obj2, Function2 function2, Continuation continuation, int i10, Object obj3) {
        if ((i10 & 4) != 0) {
            obj2 = l0.g(coroutineContext);
        }
        return b(coroutineContext, obj, obj2, function2, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final FlowCollector d(FlowCollector flowCollector, CoroutineContext coroutineContext) {
        return ((flowCollector instanceof z) || (flowCollector instanceof s)) ? flowCollector : new c0(flowCollector, coroutineContext);
    }
}
