package ig;

import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.jvm.internal.CoroutineStackFrame;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class v extends kotlin.coroutines.jvm.internal.d implements FlowCollector, CoroutineStackFrame {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final FlowCollector f74824r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final CoroutineContext f74825s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int f74826t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private CoroutineContext f74827u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private Continuation f74828v;

    public v(FlowCollector flowCollector, CoroutineContext coroutineContext) {
        super(r.f74818b, kotlin.coroutines.e.f93267b);
        this.f74824r = flowCollector;
        this.f74825s = coroutineContext;
        this.f74826t = ((Number) coroutineContext.fold(0, new Function2() { // from class: ig.u
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return Integer.valueOf(v.j(((Integer) obj).intValue(), (CoroutineContext.Element) obj2));
            }
        })).intValue();
    }

    private final void i(CoroutineContext coroutineContext, CoroutineContext coroutineContext2, Object obj) {
        if (coroutineContext2 instanceof m) {
            l((m) coroutineContext2, obj);
        }
        y.b(this, coroutineContext);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int j(int i10, CoroutineContext.Element element) {
        return i10 + 1;
    }

    private final Object k(Continuation continuation, Object obj) {
        CoroutineContext context = continuation.getContext();
        kotlinx.coroutines.z.m(context);
        CoroutineContext coroutineContext = this.f74827u;
        if (coroutineContext != context) {
            i(context, coroutineContext, obj);
            this.f74827u = context;
        }
        this.f74828v = continuation;
        Function3 function3 = w.f74829a;
        FlowCollector flowCollector = this.f74824r;
        Intrinsics.checkNotNull(flowCollector, "null cannot be cast to non-null type kotlinx.coroutines.flow.FlowCollector<kotlin.Any?>");
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Unit>");
        Object objInvoke = function3.invoke(flowCollector, obj, this);
        if (!Intrinsics.areEqual(objInvoke, pf.b.g())) {
            this.f74828v = null;
        }
        return objInvoke;
    }

    private final void l(m mVar, Object obj) {
        throw new IllegalStateException(StringsKt.n("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + mVar.f74817c + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(Object obj, Continuation continuation) {
        try {
            Object objK = k(continuation, obj);
            if (objK == pf.b.g()) {
                kotlin.coroutines.jvm.internal.g.c(continuation);
            }
            return objK == pf.b.g() ? objK : Unit.f93236a;
        } catch (Throwable th2) {
            this.f74827u = new m(th2, continuation.getContext());
            throw th2;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.a, kotlin.coroutines.jvm.internal.CoroutineStackFrame
    public CoroutineStackFrame getCallerFrame() {
        Continuation continuation = this.f74828v;
        if (continuation instanceof CoroutineStackFrame) {
            return (CoroutineStackFrame) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.Continuation
    public CoroutineContext getContext() {
        CoroutineContext coroutineContext = this.f74827u;
        return coroutineContext == null ? kotlin.coroutines.e.f93267b : coroutineContext;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    protected Object invokeSuspend(Object obj) {
        Throwable thG = Result.g(obj);
        if (thG != null) {
            this.f74827u = new m(thG, getContext());
        }
        Continuation continuation = this.f74828v;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        return pf.b.g();
    }

    @Override // kotlin.coroutines.jvm.internal.d, kotlin.coroutines.jvm.internal.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
