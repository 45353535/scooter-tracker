package hg;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes3.dex */
public abstract class i {
    public static final Object A(Flow flow, Function2 function2, Continuation continuation) {
        return u.d(flow, function2, continuation);
    }

    public static final Flow B(Function2 function2) {
        return j.e(function2);
    }

    public static final Flow C(Flow flow, Flow flow2, Function3 function3) {
        return x.c(flow, flow2, function3);
    }

    public static final Flow D(Object obj) {
        return j.f(obj);
    }

    public static final Flow E(Flow flow, CoroutineContext coroutineContext) {
        return m.f(flow, coroutineContext);
    }

    public static final Job F(Flow flow, CoroutineScope coroutineScope) {
        return l.d(flow, coroutineScope);
    }

    public static final Flow G(Flow flow, Function2 function2) {
        return t.a(flow, function2);
    }

    public static final Flow H(Iterable iterable) {
        return t.b(iterable);
    }

    public static final Flow I(Flow... flowArr) {
        return t.c(flowArr);
    }

    public static final Flow J(Flow flow, Function3 function3) {
        return q.d(flow, function3);
    }

    public static final Flow K(Flow flow, Function2 function2) {
        return w.b(flow, function2);
    }

    public static final Flow L(Flow flow, Function2 function2) {
        return q.e(flow, function2);
    }

    public static final SharedFlow M(SharedFlow sharedFlow, Function2 function2) {
        return v.e(sharedFlow, function2);
    }

    public static final Flow N(gg.x xVar) {
        return k.e(xVar);
    }

    public static final Flow O(Flow flow, Function4 function4) {
        return r.e(flow, function4);
    }

    public static final Flow P(Flow flow, Object obj, Function3 function3) {
        return w.c(flow, obj, function3);
    }

    public static final Flow Q(Flow flow, Object obj, Function3 function3) {
        return w.d(flow, obj, function3);
    }

    public static final SharedFlow R(Flow flow, CoroutineScope coroutineScope, g0 g0Var, int i10) {
        return v.f(flow, coroutineScope, g0Var, i10);
    }

    public static final Object S(Flow flow, Continuation continuation) {
        return u.e(flow, continuation);
    }

    public static final StateFlow T(Flow flow, CoroutineScope coroutineScope, g0 g0Var, Object obj) {
        return v.g(flow, coroutineScope, g0Var, obj);
    }

    public static final Flow U(Flow flow, int i10) {
        return s.e(flow, i10);
    }

    public static final Flow V(Flow flow, Function2 function2) {
        return s.f(flow, function2);
    }

    public static final Flow W(Flow flow, Function3 function3) {
        return t.d(flow, function3);
    }

    public static final Flow X(Flow flow, Function3 function3) {
        return s.g(flow, function3);
    }

    public static final Flow a(Iterable iterable) {
        return j.a(iterable);
    }

    public static final SharedFlow b(MutableSharedFlow mutableSharedFlow) {
        return v.a(mutableSharedFlow);
    }

    public static final StateFlow c(MutableStateFlow mutableStateFlow) {
        return v.b(mutableStateFlow);
    }

    public static final Flow d(Flow flow, int i10, gg.a aVar) {
        return m.a(flow, i10, aVar);
    }

    public static final Flow f(Function2 function2) {
        return j.b(function2);
    }

    public static final Flow g(Flow flow) {
        return m.c(flow);
    }

    public static final Flow h(Flow flow, Function3 function3) {
        return r.a(flow, function3);
    }

    public static final Object i(Flow flow, FlowCollector flowCollector, Continuation continuation) {
        return r.b(flow, flowCollector, continuation);
    }

    public static final Flow j(Function2 function2) {
        return j.c(function2);
    }

    public static final Object k(Flow flow, Continuation continuation) {
        return l.a(flow, continuation);
    }

    public static final Object l(Flow flow, Function2 function2, Continuation continuation) {
        return l.b(flow, function2, continuation);
    }

    public static final Flow m(Flow flow, Flow flow2, Function3 function3) {
        return x.b(flow, flow2, function3);
    }

    public static final Flow n(Flow flow) {
        return m.e(flow);
    }

    public static final Flow o(gg.x xVar) {
        return k.b(xVar);
    }

    public static final Flow p(Flow flow) {
        return p.e(flow);
    }

    public static final Flow q(Flow flow, int i10) {
        return s.b(flow, i10);
    }

    public static final Flow r(Flow flow, Function2 function2) {
        return s.c(flow, function2);
    }

    public static final Object s(FlowCollector flowCollector, gg.x xVar, Continuation continuation) {
        return k.c(flowCollector, xVar, continuation);
    }

    public static final Object t(FlowCollector flowCollector, Flow flow, Continuation continuation) {
        return l.c(flowCollector, flow, continuation);
    }

    public static final Flow u() {
        return j.d();
    }

    public static final void v(FlowCollector flowCollector) {
        q.b(flowCollector);
    }

    public static final Flow w(Flow flow) {
        return w.a(flow);
    }

    public static final Object x(Flow flow, Continuation continuation) {
        return u.a(flow, continuation);
    }

    public static final Object y(Flow flow, Function2 function2, Continuation continuation) {
        return u.b(flow, function2, continuation);
    }

    public static final Object z(Flow flow, Continuation continuation) {
        return u.c(flow, continuation);
    }
}
