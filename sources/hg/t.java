package hg;

import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f73391a = jg.f0.b("kotlinx.coroutines.flow.defaultConcurrency", 16, 1, Integer.MAX_VALUE);

    static final class a extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f73392r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f73393s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f73394t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function2 f73395u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Function2 function2, Continuation continuation) {
            super(3, continuation);
            this.f73395u = function2;
        }

        @Override // kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(FlowCollector flowCollector, Object obj, Continuation continuation) {
            a aVar = new a(this.f73395u, continuation);
            aVar.f73393s = flowCollector;
            aVar.f73394t = obj;
            return aVar.invokeSuspend(Unit.f93236a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (r1.emit(r6, r5) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r5.f73392r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.d.b(r6)
                goto L45
            L12:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1a:
                java.lang.Object r1 = r5.f73393s
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                kotlin.d.b(r6)
                goto L39
            L22:
                kotlin.d.b(r6)
                java.lang.Object r6 = r5.f73393s
                r1 = r6
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                java.lang.Object r6 = r5.f73394t
                kotlin.jvm.functions.Function2 r4 = r5.f73395u
                r5.f73393s = r1
                r5.f73392r = r3
                java.lang.Object r6 = r4.invoke(r6, r5)
                if (r6 != r0) goto L39
                goto L44
            L39:
                r3 = 0
                r5.f73393s = r3
                r5.f73392r = r2
                java.lang.Object r6 = r1.emit(r6, r5)
                if (r6 != r0) goto L45
            L44:
                return r0
            L45:
                kotlin.Unit r6 = kotlin.Unit.f93236a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.t.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final Flow a(Flow flow, Function2 function2) {
        return i.W(flow, new a(function2, null));
    }

    public static final Flow b(Iterable iterable) {
        return new ig.j(iterable, null, 0, null, 14, null);
    }

    public static final Flow c(Flow... flowArr) {
        return i.H(ArraysKt.asIterable(flowArr));
    }

    public static final Flow d(Flow flow, Function3 function3) {
        return new ig.i(function3, flow, null, 0, null, 28, null);
    }
}
