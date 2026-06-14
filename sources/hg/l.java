package hg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class l {

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f73270r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Flow f73271s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Flow flow, Continuation continuation) {
            super(2, continuation);
            this.f73271s = flow;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f73271s, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f73270r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                Flow flow = this.f73271s;
                this.f73270r = 1;
                if (i.k(flow, this) == objG) {
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
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public static final Object a(Flow flow, Continuation continuation) {
        Object objCollect = flow.collect(ig.s.f74820b, continuation);
        return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
    }

    public static final Object b(Flow flow, Function2 function2, Continuation continuation) {
        Object objK = i.k(m.b(i.G(flow, function2), 0, null, 2, null), continuation);
        return objK == pf.b.g() ? objK : Unit.f93236a;
    }

    public static final Object c(FlowCollector flowCollector, Flow flow, Continuation continuation) {
        i.v(flowCollector);
        Object objCollect = flow.collect(flowCollector, continuation);
        return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
    }

    public static final Job d(Flow flow, CoroutineScope coroutineScope) {
        return eg.i.d(coroutineScope, null, null, new a(flow, null), 3, null);
    }
}
