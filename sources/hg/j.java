package hg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class j {

    public static final class a implements Flow {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Iterable f73239b;

        /* JADX INFO: renamed from: hg.j$a$a, reason: collision with other inner class name */
        public static final class C0899a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f73240r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f73241s;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            Object f73243u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            Object f73244v;

            public C0899a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f73240r = obj;
                this.f73241s |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public a(Iterable iterable) {
            this.f73239b = iterable;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.Flow
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r6, kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof hg.j.a.C0899a
                if (r0 == 0) goto L13
                r0 = r7
                hg.j$a$a r0 = (hg.j.a.C0899a) r0
                int r1 = r0.f73241s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f73241s = r1
                goto L18
            L13:
                hg.j$a$a r0 = new hg.j$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f73240r
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.f73241s
                r3 = 1
                if (r2 == 0) goto L3a
                if (r2 != r3) goto L32
                java.lang.Object r6 = r0.f73244v
                java.util.Iterator r6 = (java.util.Iterator) r6
                java.lang.Object r2 = r0.f73243u
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                kotlin.d.b(r7)
                r7 = r2
                goto L46
            L32:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L3a:
                kotlin.d.b(r7)
                java.lang.Iterable r7 = r5.f73239b
                java.util.Iterator r7 = r7.iterator()
                r4 = r7
                r7 = r6
                r6 = r4
            L46:
                boolean r2 = r6.hasNext()
                if (r2 == 0) goto L5d
                java.lang.Object r2 = r6.next()
                r0.f73243u = r7
                r0.f73244v = r6
                r0.f73241s = r3
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L46
                return r1
            L5d:
                kotlin.Unit r6 = kotlin.Unit.f93236a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.j.a.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public static final class b implements Flow {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f73245b;

        public b(Object obj) {
            this.f73245b = obj;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objEmit = flowCollector.emit(this.f73245b, continuation);
            return objEmit == pf.b.g() ? objEmit : Unit.f93236a;
        }
    }

    public static final Flow a(Iterable iterable) {
        return new a(iterable);
    }

    public static final Flow b(Function2 function2) {
        return new hg.b(function2, null, 0, null, 14, null);
    }

    public static final Flow c(Function2 function2) {
        return new f(function2, null, 0, null, 14, null);
    }

    public static final Flow d() {
        return h.f73230b;
    }

    public static final Flow e(Function2 function2) {
        return new a0(function2);
    }

    public static final Flow f(Object obj) {
        return new b(obj);
    }
}
