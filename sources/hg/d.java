package hg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
final class d implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Flow f73197b;

    static final class a implements FlowCollector {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FlowCollector f73198b;

        /* JADX INFO: renamed from: hg.d$a$a, reason: collision with other inner class name */
        static final class C0895a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f73199r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f73201t;

            C0895a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f73199r = obj;
                this.f73201t |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        a(FlowCollector flowCollector) {
            this.f73198b = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
            /*
                r4 = this;
                boolean r0 = r6 instanceof hg.d.a.C0895a
                if (r0 == 0) goto L13
                r0 = r6
                hg.d$a$a r0 = (hg.d.a.C0895a) r0
                int r1 = r0.f73201t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f73201t = r1
                goto L18
            L13:
                hg.d$a$a r0 = new hg.d$a$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f73199r
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.f73201t
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.d.b(r6)
                goto L46
            L29:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L31:
                kotlin.d.b(r6)
                kotlin.coroutines.CoroutineContext r6 = r0.getContext()
                kotlinx.coroutines.z.m(r6)
                kotlinx.coroutines.flow.FlowCollector r6 = r4.f73198b
                r0.f73201t = r3
                java.lang.Object r5 = r6.emit(r5, r0)
                if (r5 != r1) goto L46
                return r1
            L46:
                kotlin.Unit r5 = kotlin.Unit.f93236a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.d.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public d(Flow flow) {
        this.f73197b = flow;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, Continuation continuation) {
        Object objCollect = this.f73197b.collect(new a(flowCollector), continuation);
        return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
    }
}
