package hg;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements FlowCollector {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FlowCollector f73275b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Function2 f73276c;

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f73277r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f73278s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f73279t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f73281v;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f73279t = obj;
            this.f73281v |= Integer.MIN_VALUE;
            return n0.this.a(this);
        }
    }

    public n0(FlowCollector flowCollector, Function2 function2) {
        this.f73275b = flowCollector;
        this.f73276c = function2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0076, code lost:
    
        if (((hg.n0) r7).a(r0) == r1) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1, types: [ig.v] */
    /* JADX WARN: Type inference failed for: r2v4, types: [boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(kotlin.coroutines.Continuation r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof hg.n0.a
            if (r0 == 0) goto L13
            r0 = r7
            hg.n0$a r0 = (hg.n0.a) r0
            int r1 = r0.f73281v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73281v = r1
            goto L18
        L13:
            hg.n0$a r0 = new hg.n0$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f73279t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f73281v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.d.b(r7)
            goto L79
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L34:
            java.lang.Object r2 = r0.f73278s
            ig.v r2 = (ig.v) r2
            java.lang.Object r4 = r0.f73277r
            hg.n0 r4 = (hg.n0) r4
            kotlin.d.b(r7)     // Catch: java.lang.Throwable -> L40
            goto L60
        L40:
            r7 = move-exception
            goto L7f
        L42:
            kotlin.d.b(r7)
            ig.v r2 = new ig.v
            kotlinx.coroutines.flow.FlowCollector r7 = r6.f73275b
            kotlin.coroutines.CoroutineContext r5 = r0.getContext()
            r2.<init>(r7, r5)
            kotlin.jvm.functions.Function2 r7 = r6.f73276c     // Catch: java.lang.Throwable -> L40
            r0.f73277r = r6     // Catch: java.lang.Throwable -> L40
            r0.f73278s = r2     // Catch: java.lang.Throwable -> L40
            r0.f73281v = r4     // Catch: java.lang.Throwable -> L40
            java.lang.Object r7 = r7.invoke(r2, r0)     // Catch: java.lang.Throwable -> L40
            if (r7 != r1) goto L5f
            goto L78
        L5f:
            r4 = r6
        L60:
            r2.releaseIntercepted()
            kotlinx.coroutines.flow.FlowCollector r7 = r4.f73275b
            boolean r2 = r7 instanceof hg.n0
            if (r2 == 0) goto L7c
            hg.n0 r7 = (hg.n0) r7
            r2 = 0
            r0.f73277r = r2
            r0.f73278s = r2
            r0.f73281v = r3
            java.lang.Object r7 = r7.a(r0)
            if (r7 != r1) goto L79
        L78:
            return r1
        L79:
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        L7c:
            kotlin.Unit r7 = kotlin.Unit.f93236a
            return r7
        L7f:
            r2.releaseIntercepted()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.n0.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // kotlinx.coroutines.flow.FlowCollector
    public Object emit(Object obj, Continuation continuation) {
        return this.f73275b.emit(obj, continuation);
    }
}
