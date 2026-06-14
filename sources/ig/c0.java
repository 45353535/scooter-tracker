package ig;

import jg.l0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
final class c0 implements FlowCollector {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CoroutineContext f74754b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Object f74755c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Function2 f74756d;

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f74757r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f74758s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ FlowCollector f74759t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(FlowCollector flowCollector, Continuation continuation) {
            super(2, continuation);
            this.f74759t = flowCollector;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = new a(this.f74759t, continuation);
            aVar.f74758s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f74757r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                Object obj2 = this.f74758s;
                FlowCollector flowCollector = this.f74759t;
                this.f74757r = 1;
                if (flowCollector.emit(obj2, this) == objG) {
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
        public final Object invoke(Object obj, Continuation continuation) {
            return ((a) create(obj, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public c0(FlowCollector flowCollector, CoroutineContext coroutineContext) {
        this.f74754b = coroutineContext;
        this.f74755c = l0.g(coroutineContext);
        this.f74756d = new a(flowCollector, null);
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(Object obj, Continuation continuation) {
        Object objB = f.b(this.f74754b, obj, this.f74755c, this.f74756d, continuation);
        return objB == pf.b.g() ? objB : Unit.f93236a;
    }
}
