package ig;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g extends e {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected final Flow f74770e;

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f74771r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f74772s;

        a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = g.this.new a(continuation);
            aVar.f74772s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f74771r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f74772s;
                g gVar = g.this;
                this.f74771r = 1;
                if (gVar.q(flowCollector, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((a) create(flowCollector, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public g(Flow flow, CoroutineContext coroutineContext, int i10, gg.a aVar) {
        super(coroutineContext, i10, aVar);
        this.f74770e = flow;
    }

    static /* synthetic */ Object n(g gVar, FlowCollector flowCollector, Continuation continuation) {
        if (gVar.f74761c == -3) {
            CoroutineContext context = continuation.getContext();
            CoroutineContext coroutineContextJ = eg.a0.j(context, gVar.f74760b);
            if (Intrinsics.areEqual(coroutineContextJ, context)) {
                Object objQ = gVar.q(flowCollector, continuation);
                return objQ == pf.b.g() ? objQ : Unit.f93236a;
            }
            d.b bVar = kotlin.coroutines.d.M8;
            if (Intrinsics.areEqual(coroutineContextJ.get(bVar), context.get(bVar))) {
                Object objP = gVar.p(flowCollector, coroutineContextJ, continuation);
                return objP == pf.b.g() ? objP : Unit.f93236a;
            }
        }
        Object objCollect = super.collect(flowCollector, continuation);
        return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
    }

    static /* synthetic */ Object o(g gVar, gg.v vVar, Continuation continuation) {
        Object objQ = gVar.q(new z(vVar), continuation);
        return objQ == pf.b.g() ? objQ : Unit.f93236a;
    }

    private final Object p(FlowCollector flowCollector, CoroutineContext coroutineContext, Continuation continuation) {
        return f.c(coroutineContext, f.d(flowCollector, continuation.getContext()), null, new a(null), continuation, 4, null);
    }

    @Override // ig.e, kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, Continuation continuation) {
        return n(this, flowCollector, continuation);
    }

    @Override // ig.e
    protected Object f(gg.v vVar, Continuation continuation) {
        return o(this, vVar, continuation);
    }

    protected abstract Object q(FlowCollector flowCollector, Continuation continuation);

    @Override // ig.e
    public String toString() {
        return this.f74770e + " -> " + super.toString();
    }
}
