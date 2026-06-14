package hg;

import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class r {

    public static final class a implements Flow {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f73308b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function3 f73309c;

        /* JADX INFO: renamed from: hg.r$a$a, reason: collision with other inner class name */
        public static final class C0900a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f73310r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f73311s;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            Object f73313u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            Object f73314v;

            public C0900a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f73310r = obj;
                this.f73311s |= Integer.MIN_VALUE;
                return a.this.collect(null, this);
            }
        }

        public a(Flow flow, Function3 function3) {
            this.f73308b = flow;
            this.f73309c = function3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x006c, code lost:
        
            if (r6 == r1) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.Flow
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r6, kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof hg.r.a.C0900a
                if (r0 == 0) goto L13
                r0 = r7
                hg.r$a$a r0 = (hg.r.a.C0900a) r0
                int r1 = r0.f73311s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f73311s = r1
                goto L18
            L13:
                hg.r$a$a r0 = new hg.r$a$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f73310r
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.f73311s
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.d.b(r7)
                goto L6f
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                java.lang.Object r6 = r0.f73314v
                kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
                java.lang.Object r2 = r0.f73313u
                hg.r$a r2 = (hg.r.a) r2
                kotlin.d.b(r7)
                goto L53
            L40:
                kotlin.d.b(r7)
                kotlinx.coroutines.flow.Flow r7 = r5.f73308b
                r0.f73313u = r5
                r0.f73314v = r6
                r0.f73311s = r4
                java.lang.Object r7 = hg.i.i(r7, r6, r0)
                if (r7 != r1) goto L52
                goto L6e
            L52:
                r2 = r5
            L53:
                java.lang.Throwable r7 = (java.lang.Throwable) r7
                if (r7 == 0) goto L6f
                kotlin.jvm.functions.Function3 r2 = r2.f73309c
                r4 = 0
                r0.f73313u = r4
                r0.f73314v = r4
                r0.f73311s = r3
                r3 = 6
                kotlin.jvm.internal.z.c(r3)
                java.lang.Object r6 = r2.invoke(r6, r7, r0)
                r7 = 7
                kotlin.jvm.internal.z.c(r7)
                if (r6 != r1) goto L6f
            L6e:
                return r1
            L6f:
                kotlin.Unit r6 = kotlin.Unit.f93236a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.r.a.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f73315r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f73316s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f73317t;

        b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f73316s = obj;
            this.f73317t |= Integer.MIN_VALUE;
            return i.i(null, null, this);
        }
    }

    static final class c implements FlowCollector {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ FlowCollector f73318b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef f73319c;

        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f73320r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f73321s;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            int f73323u;

            a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f73321s = obj;
                this.f73323u |= Integer.MIN_VALUE;
                return c.this.emit(null, this);
            }
        }

        c(FlowCollector flowCollector, Ref$ObjectRef ref$ObjectRef) {
            this.f73318b = flowCollector;
            this.f73319c = ref$ObjectRef;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
            /*
                r4 = this;
                boolean r0 = r6 instanceof hg.r.c.a
                if (r0 == 0) goto L13
                r0 = r6
                hg.r$c$a r0 = (hg.r.c.a) r0
                int r1 = r0.f73323u
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f73323u = r1
                goto L18
            L13:
                hg.r$c$a r0 = new hg.r$c$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f73321s
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.f73323u
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f73320r
                hg.r$c r5 = (hg.r.c) r5
                kotlin.d.b(r6)     // Catch: java.lang.Throwable -> L2d
                goto L47
            L2d:
                r6 = move-exception
                goto L4c
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                kotlin.d.b(r6)
                kotlinx.coroutines.flow.FlowCollector r6 = r4.f73318b     // Catch: java.lang.Throwable -> L4a
                r0.f73320r = r4     // Catch: java.lang.Throwable -> L4a
                r0.f73323u = r3     // Catch: java.lang.Throwable -> L4a
                java.lang.Object r5 = r6.emit(r5, r0)     // Catch: java.lang.Throwable -> L4a
                if (r5 != r1) goto L47
                return r1
            L47:
                kotlin.Unit r5 = kotlin.Unit.f93236a
                return r5
            L4a:
                r6 = move-exception
                r5 = r4
            L4c:
                kotlin.jvm.internal.Ref$ObjectRef r5 = r5.f73319c
                r5.f93280b = r6
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.r.c.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public static final class d implements Flow {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f73324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function4 f73325c;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f73326r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f73327s;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            Object f73329u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            Object f73330v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            Object f73331w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            long f73332x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            int f73333y;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f73326r = obj;
                this.f73327s |= Integer.MIN_VALUE;
                return d.this.collect(null, this);
            }
        }

        public d(Flow flow, Function4 function4) {
            this.f73324b = flow;
            this.f73325c = function4;
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x006f  */
        /* JADX WARN: Removed duplicated region for block: B:23:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00a2  */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00a8  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00ab  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0076 -> B:30:0x00a6). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0097 -> B:27:0x009a). Please report as a decompilation issue!!! */
        @Override // kotlinx.coroutines.flow.Flow
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r12, kotlin.coroutines.Continuation r13) throws java.lang.Throwable {
            /*
                r11 = this;
                boolean r0 = r13 instanceof hg.r.d.a
                if (r0 == 0) goto L13
                r0 = r13
                hg.r$d$a r0 = (hg.r.d.a) r0
                int r1 = r0.f73327s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f73327s = r1
                goto L18
            L13:
                hg.r$d$a r0 = new hg.r$d$a
                r0.<init>(r13)
            L18:
                java.lang.Object r13 = r0.f73326r
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.f73327s
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L52
                if (r2 == r4) goto L42
                if (r2 != r3) goto L3a
                long r5 = r0.f73332x
                java.lang.Object r12 = r0.f73331w
                java.lang.Throwable r12 = (java.lang.Throwable) r12
                java.lang.Object r2 = r0.f73330v
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                java.lang.Object r7 = r0.f73329u
                hg.r$d r7 = (hg.r.d) r7
                kotlin.d.b(r13)
                goto L9a
            L3a:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                throw r12
            L42:
                int r12 = r0.f73333y
                long r5 = r0.f73332x
                java.lang.Object r2 = r0.f73330v
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                java.lang.Object r7 = r0.f73329u
                hg.r$d r7 = (hg.r.d) r7
                kotlin.d.b(r13)
                goto L74
            L52:
                kotlin.d.b(r13)
                r5 = 0
                r13 = r11
            L58:
                kotlinx.coroutines.flow.Flow r2 = r13.f73324b
                r0.f73329u = r13
                r0.f73330v = r12
                r7 = 0
                r0.f73331w = r7
                r0.f73332x = r5
                r7 = 0
                r0.f73333y = r7
                r0.f73327s = r4
                java.lang.Object r2 = hg.i.i(r2, r12, r0)
                if (r2 != r1) goto L6f
                goto L96
            L6f:
                r10 = r2
                r2 = r12
                r12 = r7
                r7 = r13
                r13 = r10
            L74:
                java.lang.Throwable r13 = (java.lang.Throwable) r13
                if (r13 == 0) goto La6
                kotlin.jvm.functions.Function4 r12 = r7.f73325c
                java.lang.Long r8 = kotlin.coroutines.jvm.internal.b.e(r5)
                r0.f73329u = r7
                r0.f73330v = r2
                r0.f73331w = r13
                r0.f73332x = r5
                r0.f73327s = r3
                r9 = 6
                kotlin.jvm.internal.z.c(r9)
                java.lang.Object r12 = r12.invoke(r2, r13, r8, r0)
                r8 = 7
                kotlin.jvm.internal.z.c(r8)
                if (r12 != r1) goto L97
            L96:
                return r1
            L97:
                r10 = r13
                r13 = r12
                r12 = r10
            L9a:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto La8
                r12 = 1
                long r5 = r5 + r12
                r12 = r4
            La6:
                r13 = r7
                goto La9
            La8:
                throw r12
            La9:
                if (r12 != 0) goto Lae
                kotlin.Unit r12 = kotlin.Unit.f93236a
                return r12
            Lae:
                r12 = r2
                goto L58
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.r.d.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public static final Flow a(Flow flow, Function3 function3) {
        return new a(flow, function3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(kotlinx.coroutines.flow.Flow r4, kotlinx.coroutines.flow.FlowCollector r5, kotlin.coroutines.Continuation r6) throws java.lang.Throwable {
        /*
            boolean r0 = r6 instanceof hg.r.b
            if (r0 == 0) goto L13
            r0 = r6
            hg.r$b r0 = (hg.r.b) r0
            int r1 = r0.f73317t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73317t = r1
            goto L18
        L13:
            hg.r$b r0 = new hg.r$b
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f73316s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f73317t
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r4 = r0.f73315r
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
            kotlin.d.b(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r5 = move-exception
            goto L53
        L2f:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L37:
            kotlin.d.b(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            hg.r$c r2 = new hg.r$c     // Catch: java.lang.Throwable -> L51
            r2.<init>(r5, r6)     // Catch: java.lang.Throwable -> L51
            r0.f73315r = r6     // Catch: java.lang.Throwable -> L51
            r0.f73317t = r3     // Catch: java.lang.Throwable -> L51
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: java.lang.Throwable -> L51
            if (r4 != r1) goto L4f
            return r1
        L4f:
            r4 = 0
            return r4
        L51:
            r5 = move-exception
            r4 = r6
        L53:
            java.lang.Object r4 = r4.f93280b
            java.lang.Throwable r4 = (java.lang.Throwable) r4
            boolean r6 = d(r5, r4)
            if (r6 != 0) goto L76
            kotlin.coroutines.CoroutineContext r6 = r0.getContext()
            boolean r6 = c(r5, r6)
            if (r6 != 0) goto L76
            if (r4 != 0) goto L6a
            return r5
        L6a:
            boolean r6 = r5 instanceof java.util.concurrent.CancellationException
            if (r6 == 0) goto L72
            lf.c.a(r4, r5)
            throw r4
        L72:
            lf.c.a(r5, r4)
            throw r5
        L76:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.r.b(kotlinx.coroutines.flow.Flow, kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private static final boolean c(Throwable th2, CoroutineContext coroutineContext) {
        Job job = (Job) coroutineContext.get(Job.N8);
        if (job == null || !job.isCancelled()) {
            return false;
        }
        return d(th2, job.W());
    }

    private static final boolean d(Throwable th2, Throwable th3) {
        return th3 != null && Intrinsics.areEqual(th3, th2);
    }

    public static final Flow e(Flow flow, Function4 function4) {
        return new d(flow, function4);
    }
}
