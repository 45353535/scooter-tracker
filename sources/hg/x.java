package hg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class x {

    public static final class a implements Flow {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f73475b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Flow f73476c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function3 f73477d;

        public a(Flow flow, Flow flow2, Function3 function3) {
            this.f73475b = flow;
            this.f73476c = flow2;
            this.f73477d = function3;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objA = ig.l.a(flowCollector, new Flow[]{this.f73475b, this.f73476c}, x.d(), new b(this.f73477d, null), continuation);
            return objA == pf.b.g() ? objA : Unit.f93236a;
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f73478r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f73479s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f73480t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function3 f73481u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Function3 function3, Continuation continuation) {
            super(3, continuation);
            this.f73481u = function3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
        
            if (r1.emit(r7, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r6.f73478r
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L22
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.d.b(r7)
                goto L4c
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                java.lang.Object r1 = r6.f73479s
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                kotlin.d.b(r7)
                goto L40
            L22:
                kotlin.d.b(r7)
                java.lang.Object r7 = r6.f73479s
                r1 = r7
                kotlinx.coroutines.flow.FlowCollector r1 = (kotlinx.coroutines.flow.FlowCollector) r1
                java.lang.Object r7 = r6.f73480t
                java.lang.Object[] r7 = (java.lang.Object[]) r7
                kotlin.jvm.functions.Function3 r4 = r6.f73481u
                r5 = 0
                r5 = r7[r5]
                r7 = r7[r3]
                r6.f73479s = r1
                r6.f73478r = r3
                java.lang.Object r7 = r4.invoke(r5, r7, r6)
                if (r7 != r0) goto L40
                goto L4b
            L40:
                r3 = 0
                r6.f73479s = r3
                r6.f73478r = r2
                java.lang.Object r7 = r1.emit(r7, r6)
                if (r7 != r0) goto L4c
            L4b:
                return r0
            L4c:
                kotlin.Unit r7 = kotlin.Unit.f93236a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.x.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function3
        public final Object invoke(FlowCollector flowCollector, Object[] objArr, Continuation continuation) {
            b bVar = new b(this.f73481u, continuation);
            bVar.f73479s = flowCollector;
            bVar.f73480t = objArr;
            return bVar.invokeSuspend(Unit.f93236a);
        }
    }

    static final class c implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f73482b = new c();

        c() {
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke() {
            return null;
        }
    }

    public static final Flow b(Flow flow, Flow flow2, Function3 function3) {
        return i.C(flow, flow2, function3);
    }

    public static final Flow c(Flow flow, Flow flow2, Function3 function3) {
        return new a(flow, flow2, function3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function0 d() {
        return c.f73482b;
    }
}
