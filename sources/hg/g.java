package hg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
final class g implements Flow {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Flow f73217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function1 f73218c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function2 f73219d;

    static final class a implements FlowCollector {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef f73221c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ FlowCollector f73222d;

        /* JADX INFO: renamed from: hg.g$a$a, reason: collision with other inner class name */
        static final class C0896a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f73223r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f73225t;

            C0896a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f73223r = obj;
                this.f73225t |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        a(Ref$ObjectRef ref$ObjectRef, FlowCollector flowCollector) {
            this.f73221c = ref$ObjectRef;
            this.f73222d = flowCollector;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof hg.g.a.C0896a
                if (r0 == 0) goto L13
                r0 = r7
                hg.g$a$a r0 = (hg.g.a.C0896a) r0
                int r1 = r0.f73225t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f73225t = r1
                goto L18
            L13:
                hg.g$a$a r0 = new hg.g$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f73223r
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.f73225t
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.d.b(r7)
                goto L67
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.d.b(r7)
                hg.g r7 = hg.g.this
                kotlin.jvm.functions.Function1 r7 = r7.f73218c
                java.lang.Object r7 = r7.invoke(r6)
                kotlin.jvm.internal.Ref$ObjectRef r2 = r5.f73221c
                java.lang.Object r2 = r2.f93280b
                jg.e0 r4 = ig.t.f74821a
                if (r2 == r4) goto L58
                hg.g r4 = hg.g.this
                kotlin.jvm.functions.Function2 r4 = r4.f73219d
                java.lang.Object r2 = r4.invoke(r2, r7)
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 != 0) goto L55
                goto L58
            L55:
                kotlin.Unit r6 = kotlin.Unit.f93236a
                return r6
            L58:
                kotlin.jvm.internal.Ref$ObjectRef r2 = r5.f73221c
                r2.f93280b = r7
                kotlinx.coroutines.flow.FlowCollector r7 = r5.f73222d
                r0.f73225t = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L67
                return r1
            L67:
                kotlin.Unit r6 = kotlin.Unit.f93236a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.g.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public g(Flow flow, Function1 function1, Function2 function2) {
        this.f73217b = flow;
        this.f73218c = function1;
        this.f73219d = function2;
    }

    @Override // kotlinx.coroutines.flow.Flow
    public Object collect(FlowCollector flowCollector, Continuation continuation) {
        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        ref$ObjectRef.f93280b = ig.t.f74821a;
        Object objCollect = this.f73217b.collect(new a(ref$ObjectRef, flowCollector), continuation);
        return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
    }
}
