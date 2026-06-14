package hg;

import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class q {

    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f73290r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f73291s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f73292t;

        a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f73291s = obj;
            this.f73292t |= Integer.MIN_VALUE;
            return q.c(null, null, null, this);
        }
    }

    public static final class b implements Flow {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f73293b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function3 f73294c;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f73295r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f73296s;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            Object f73298u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            Object f73299v;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f73295r = obj;
                this.f73296s |= Integer.MIN_VALUE;
                return b.this.collect(null, this);
            }
        }

        public b(Flow flow, Function3 function3) {
            this.f73293b = flow;
            this.f73294c = function3;
        }

        /* JADX WARN: Removed duplicated region for block: B:35:0x0088  */
        /* JADX WARN: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.Flow
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r9, kotlin.coroutines.Continuation r10) throws java.lang.Throwable {
            /*
                r8 = this;
                boolean r0 = r10 instanceof hg.q.b.a
                if (r0 == 0) goto L13
                r0 = r10
                hg.q$b$a r0 = (hg.q.b.a) r0
                int r1 = r0.f73296s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f73296s = r1
                goto L18
            L13:
                hg.q$b$a r0 = new hg.q$b$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f73295r
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.f73296s
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L55
                if (r2 == r5) goto L47
                if (r2 == r4) goto L3e
                if (r2 != r3) goto L36
                java.lang.Object r9 = r0.f73298u
                ig.v r9 = (ig.v) r9
                kotlin.d.b(r10)     // Catch: java.lang.Throwable -> L34
                goto L89
            L34:
                r10 = move-exception
                goto L93
            L36:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L3e:
                java.lang.Object r9 = r0.f73298u
                java.lang.Throwable r9 = (java.lang.Throwable) r9
                kotlin.d.b(r10)
                goto Lad
            L47:
                java.lang.Object r9 = r0.f73299v
                kotlinx.coroutines.flow.FlowCollector r9 = (kotlinx.coroutines.flow.FlowCollector) r9
                java.lang.Object r2 = r0.f73298u
                hg.q$b r2 = (hg.q.b) r2
                kotlin.d.b(r10)     // Catch: java.lang.Throwable -> L53
                goto L68
            L53:
                r9 = move-exception
                goto L99
            L55:
                kotlin.d.b(r10)
                kotlinx.coroutines.flow.Flow r10 = r8.f73293b     // Catch: java.lang.Throwable -> L97
                r0.f73298u = r8     // Catch: java.lang.Throwable -> L97
                r0.f73299v = r9     // Catch: java.lang.Throwable -> L97
                r0.f73296s = r5     // Catch: java.lang.Throwable -> L97
                java.lang.Object r10 = r10.collect(r9, r0)     // Catch: java.lang.Throwable -> L97
                if (r10 != r1) goto L67
                goto Lac
            L67:
                r2 = r8
            L68:
                ig.v r10 = new ig.v
                kotlin.coroutines.CoroutineContext r4 = r0.getContext()
                r10.<init>(r9, r4)
                kotlin.jvm.functions.Function3 r9 = r2.f73294c     // Catch: java.lang.Throwable -> L8f
                r0.f73298u = r10     // Catch: java.lang.Throwable -> L8f
                r0.f73299v = r6     // Catch: java.lang.Throwable -> L8f
                r0.f73296s = r3     // Catch: java.lang.Throwable -> L8f
                r2 = 6
                kotlin.jvm.internal.z.c(r2)     // Catch: java.lang.Throwable -> L8f
                java.lang.Object r9 = r9.invoke(r10, r6, r0)     // Catch: java.lang.Throwable -> L8f
                r0 = 7
                kotlin.jvm.internal.z.c(r0)     // Catch: java.lang.Throwable -> L8f
                if (r9 != r1) goto L88
                goto Lac
            L88:
                r9 = r10
            L89:
                r9.releaseIntercepted()
                kotlin.Unit r9 = kotlin.Unit.f93236a
                return r9
            L8f:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L93:
                r9.releaseIntercepted()
                throw r10
            L97:
                r9 = move-exception
                r2 = r8
            L99:
                hg.p0 r10 = new hg.p0
                r10.<init>(r9)
                kotlin.jvm.functions.Function3 r2 = r2.f73294c
                r0.f73298u = r9
                r0.f73299v = r6
                r0.f73296s = r4
                java.lang.Object r10 = hg.q.a(r10, r2, r9, r0)
                if (r10 != r1) goto Lad
            Lac:
                return r1
            Lad:
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.q.b.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public static final class c implements Flow {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f73300b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Flow f73301c;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f73302r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f73303s;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            Object f73305u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            Object f73306v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            Object f73307w;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f73302r = obj;
                this.f73303s |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(Function2 function2, Flow flow) {
            this.f73300b = function2;
            this.f73301c = flow;
        }

        /* JADX WARN: Code restructure failed: missing block: B:26:0x0080, code lost:
        
            if (r7.collect(r2, r0) != r1) goto L28;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.Flow
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r7, kotlin.coroutines.Continuation r8) throws java.lang.Throwable {
            /*
                r6 = this;
                boolean r0 = r8 instanceof hg.q.c.a
                if (r0 == 0) goto L13
                r0 = r8
                hg.q$c$a r0 = (hg.q.c.a) r0
                int r1 = r0.f73303s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f73303s = r1
                goto L18
            L13:
                hg.q$c$a r0 = new hg.q$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f73302r
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.f73303s
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.d.b(r8)
                goto L83
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f73307w
                ig.v r7 = (ig.v) r7
                java.lang.Object r2 = r0.f73306v
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                java.lang.Object r4 = r0.f73305u
                hg.q$c r4 = (hg.q.c) r4
                kotlin.d.b(r8)     // Catch: java.lang.Throwable -> L44
                goto L6e
            L44:
                r8 = move-exception
                goto L8a
            L46:
                kotlin.d.b(r8)
                ig.v r8 = new ig.v
                kotlin.coroutines.CoroutineContext r2 = r0.getContext()
                r8.<init>(r7, r2)
                kotlin.jvm.functions.Function2 r2 = r6.f73300b     // Catch: java.lang.Throwable -> L86
                r0.f73305u = r6     // Catch: java.lang.Throwable -> L86
                r0.f73306v = r7     // Catch: java.lang.Throwable -> L86
                r0.f73307w = r8     // Catch: java.lang.Throwable -> L86
                r0.f73303s = r4     // Catch: java.lang.Throwable -> L86
                r4 = 6
                kotlin.jvm.internal.z.c(r4)     // Catch: java.lang.Throwable -> L86
                java.lang.Object r2 = r2.invoke(r8, r0)     // Catch: java.lang.Throwable -> L86
                r4 = 7
                kotlin.jvm.internal.z.c(r4)     // Catch: java.lang.Throwable -> L86
                if (r2 != r1) goto L6b
                goto L82
            L6b:
                r4 = r6
                r2 = r7
                r7 = r8
            L6e:
                r7.releaseIntercepted()
                kotlinx.coroutines.flow.Flow r7 = r4.f73301c
                r8 = 0
                r0.f73305u = r8
                r0.f73306v = r8
                r0.f73307w = r8
                r0.f73303s = r3
                java.lang.Object r7 = r7.collect(r2, r0)
                if (r7 != r1) goto L83
            L82:
                return r1
            L83:
                kotlin.Unit r7 = kotlin.Unit.f93236a
                return r7
            L86:
                r7 = move-exception
                r5 = r8
                r8 = r7
                r7 = r5
            L8a:
                r7.releaseIntercepted()
                throw r8
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.q.c.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public static final void b(FlowCollector flowCollector) {
        if (flowCollector instanceof p0) {
            throw ((p0) flowCollector).f73289b;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(kotlinx.coroutines.flow.FlowCollector r4, kotlin.jvm.functions.Function3 r5, java.lang.Throwable r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof hg.q.a
            if (r0 == 0) goto L13
            r0 = r7
            hg.q$a r0 = (hg.q.a) r0
            int r1 = r0.f73292t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73292t = r1
            goto L18
        L13:
            hg.q$a r0 = new hg.q$a
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f73291s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f73292t
            r3 = 1
            if (r2 == 0) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r4 = r0.f73290r
            r6 = r4
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            kotlin.d.b(r7)     // Catch: java.lang.Throwable -> L2e
            goto L46
        L2e:
            r4 = move-exception
            goto L49
        L30:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L38:
            kotlin.d.b(r7)
            r0.f73290r = r6     // Catch: java.lang.Throwable -> L2e
            r0.f73292t = r3     // Catch: java.lang.Throwable -> L2e
            java.lang.Object r4 = r5.invoke(r4, r6, r0)     // Catch: java.lang.Throwable -> L2e
            if (r4 != r1) goto L46
            return r1
        L46:
            kotlin.Unit r4 = kotlin.Unit.f93236a
            return r4
        L49:
            if (r6 == 0) goto L50
            if (r6 == r4) goto L50
            lf.c.a(r4, r6)
        L50:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.q.c(kotlinx.coroutines.flow.FlowCollector, kotlin.jvm.functions.Function3, java.lang.Throwable, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Flow d(Flow flow, Function3 function3) {
        return new b(flow, function3);
    }

    public static final Flow e(Flow flow, Function2 function2) {
        return new c(function2, flow);
    }
}
