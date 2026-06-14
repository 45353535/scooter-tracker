package hg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$BooleanRef;
import kotlin.jvm.internal.t0;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class s {

    public static final class a implements Flow {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f73334b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f73335c;

        public a(Flow flow, int i10) {
            this.f73334b = flow;
            this.f73335c = i10;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f73334b.collect(new b(new t0(), this.f73335c, flowCollector), continuation);
            return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
        }
    }

    static final class b implements FlowCollector {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t0 f73336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f73337c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ FlowCollector f73338d;

        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f73339r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f73341t;

            a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f73339r = obj;
                this.f73341t |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        b(t0 t0Var, int i10, FlowCollector flowCollector) {
            this.f73336b = t0Var;
            this.f73337c = i10;
            this.f73338d = flowCollector;
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
                boolean r0 = r7 instanceof hg.s.b.a
                if (r0 == 0) goto L13
                r0 = r7
                hg.s$b$a r0 = (hg.s.b.a) r0
                int r1 = r0.f73341t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f73341t = r1
                goto L18
            L13:
                hg.s$b$a r0 = new hg.s$b$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f73339r
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.f73341t
                r3 = 1
                if (r2 == 0) goto L31
                if (r2 != r3) goto L29
                kotlin.d.b(r7)
                goto L47
            L29:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L31:
                kotlin.d.b(r7)
                kotlin.jvm.internal.t0 r7 = r5.f73336b
                int r2 = r7.f93331b
                int r4 = r5.f73337c
                if (r2 < r4) goto L4a
                kotlinx.coroutines.flow.FlowCollector r7 = r5.f73338d
                r0.f73341t = r3
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L47
                return r1
            L47:
                kotlin.Unit r6 = kotlin.Unit.f93236a
                return r6
            L4a:
                int r2 = r2 + r3
                r7.f93331b = r2
                kotlin.Unit r6 = kotlin.Unit.f93236a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.s.b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public static final class c implements Flow {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f73342b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f73343c;

        public c(Flow flow, Function2 function2) {
            this.f73342b = flow;
            this.f73343c = function2;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f73342b.collect(new d(new Ref$BooleanRef(), flowCollector, this.f73343c), continuation);
            return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
        }
    }

    static final class d implements FlowCollector {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref$BooleanRef f73344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FlowCollector f73345c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2 f73346d;

        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f73347r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            Object f73348s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f73349t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            int f73351v;

            a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f73349t = obj;
                this.f73351v |= Integer.MIN_VALUE;
                return d.this.emit(null, this);
            }
        }

        d(Ref$BooleanRef ref$BooleanRef, FlowCollector flowCollector, Function2 function2) {
            this.f73344b = ref$BooleanRef;
            this.f73345c = flowCollector;
            this.f73346d = function2;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Removed duplicated region for block: B:31:0x0074  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof hg.s.d.a
                if (r0 == 0) goto L13
                r0 = r8
                hg.s$d$a r0 = (hg.s.d.a) r0
                int r1 = r0.f73351v
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f73351v = r1
                goto L18
            L13:
                hg.s$d$a r0 = new hg.s$d$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f73349t
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.f73351v
                r3 = 3
                r4 = 2
                r5 = 1
                if (r2 == 0) goto L45
                if (r2 == r5) goto L41
                if (r2 == r4) goto L37
                if (r2 != r3) goto L2f
                kotlin.d.b(r8)
                goto L88
            L2f:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L37:
                java.lang.Object r7 = r0.f73348s
                java.lang.Object r2 = r0.f73347r
                hg.s$d r2 = (hg.s.d) r2
                kotlin.d.b(r8)
                goto L6c
            L41:
                kotlin.d.b(r8)
                goto L59
            L45:
                kotlin.d.b(r8)
                kotlin.jvm.internal.Ref$BooleanRef r8 = r6.f73344b
                boolean r8 = r8.f93279b
                if (r8 == 0) goto L5c
                kotlinx.coroutines.flow.FlowCollector r8 = r6.f73345c
                r0.f73351v = r5
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L59
                goto L87
            L59:
                kotlin.Unit r7 = kotlin.Unit.f93236a
                return r7
            L5c:
                kotlin.jvm.functions.Function2 r8 = r6.f73346d
                r0.f73347r = r6
                r0.f73348s = r7
                r0.f73351v = r4
                java.lang.Object r8 = r8.invoke(r7, r0)
                if (r8 != r1) goto L6b
                goto L87
            L6b:
                r2 = r6
            L6c:
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                if (r8 != 0) goto L8b
                kotlin.jvm.internal.Ref$BooleanRef r8 = r2.f73344b
                r8.f93279b = r5
                kotlinx.coroutines.flow.FlowCollector r8 = r2.f73345c
                r2 = 0
                r0.f73347r = r2
                r0.f73348s = r2
                r0.f73351v = r3
                java.lang.Object r7 = r8.emit(r7, r0)
                if (r7 != r1) goto L88
            L87:
                return r1
            L88:
                kotlin.Unit r7 = kotlin.Unit.f93236a
                return r7
            L8b:
                kotlin.Unit r7 = kotlin.Unit.f93236a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.s.d.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f73352r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f73353s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f73354t;

        e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f73353s = obj;
            this.f73354t |= Integer.MIN_VALUE;
            return s.d(null, null, null, this);
        }
    }

    public static final class f implements Flow {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f73355b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f73356c;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f73357r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f73358s;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            Object f73360u;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f73357r = obj;
                this.f73358s |= Integer.MIN_VALUE;
                return f.this.collect(null, this);
            }
        }

        public f(Flow flow, int i10) {
            this.f73355b = flow;
            this.f73356c = i10;
        }

        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.Flow
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r9, kotlin.coroutines.Continuation r10) {
            /*
                r8 = this;
                boolean r0 = r10 instanceof hg.s.f.a
                if (r0 == 0) goto L13
                r0 = r10
                hg.s$f$a r0 = (hg.s.f.a) r0
                int r1 = r0.f73358s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f73358s = r1
                goto L18
            L13:
                hg.s$f$a r0 = new hg.s$f$a
                r0.<init>(r10)
            L18:
                java.lang.Object r10 = r0.f73357r
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.f73358s
                r3 = 1
                if (r2 == 0) goto L35
                if (r2 != r3) goto L2d
                java.lang.Object r9 = r0.f73360u
                kotlin.d.b(r10)     // Catch: ig.a -> L2b
                goto L5d
            L2b:
                r10 = move-exception
                goto L5a
            L2d:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r10)
                throw r9
            L35:
                kotlin.d.b(r10)
                java.lang.Object r10 = new java.lang.Object
                r10.<init>()
                kotlin.jvm.internal.t0 r2 = new kotlin.jvm.internal.t0
                r2.<init>()
                kotlinx.coroutines.flow.Flow r4 = r8.f73355b     // Catch: ig.a -> L56
                hg.s$g r5 = new hg.s$g     // Catch: ig.a -> L56
                int r6 = r8.f73356c     // Catch: ig.a -> L56
                r5.<init>(r2, r6, r9, r10)     // Catch: ig.a -> L56
                r0.f73360u = r10     // Catch: ig.a -> L56
                r0.f73358s = r3     // Catch: ig.a -> L56
                java.lang.Object r9 = r4.collect(r5, r0)     // Catch: ig.a -> L56
                if (r9 != r1) goto L5d
                return r1
            L56:
                r9 = move-exception
                r7 = r10
                r10 = r9
                r9 = r7
            L5a:
                ig.p.a(r10, r9)
            L5d:
                kotlin.Unit r9 = kotlin.Unit.f93236a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.s.f.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    static final class g implements FlowCollector {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t0 f73361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ int f73362c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ FlowCollector f73363d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Object f73364e;

        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f73365r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f73367t;

            a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f73365r = obj;
                this.f73367t |= Integer.MIN_VALUE;
                return g.this.emit(null, this);
            }
        }

        g(t0 t0Var, int i10, FlowCollector flowCollector, Object obj) {
            this.f73361b = t0Var;
            this.f73362c = i10;
            this.f73363d = flowCollector;
            this.f73364e = obj;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x004e, code lost:
        
            if (r7.emit(r6, r0) == r1) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
        
            if (hg.s.d(r7, r6, r2, r0) == r1) goto L25;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r6, kotlin.coroutines.Continuation r7) {
            /*
                r5 = this;
                boolean r0 = r7 instanceof hg.s.g.a
                if (r0 == 0) goto L13
                r0 = r7
                hg.s$g$a r0 = (hg.s.g.a) r0
                int r1 = r0.f73367t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f73367t = r1
                goto L18
            L13:
                hg.s$g$a r0 = new hg.s$g$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f73365r
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.f73367t
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L38
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.d.b(r7)
                goto L61
            L2c:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L34:
                kotlin.d.b(r7)
                goto L51
            L38:
                kotlin.d.b(r7)
                kotlin.jvm.internal.t0 r7 = r5.f73361b
                int r2 = r7.f93331b
                int r2 = r2 + r4
                r7.f93331b = r2
                int r7 = r5.f73362c
                if (r2 >= r7) goto L54
                kotlinx.coroutines.flow.FlowCollector r7 = r5.f73363d
                r0.f73367t = r4
                java.lang.Object r6 = r7.emit(r6, r0)
                if (r6 != r1) goto L51
                goto L60
            L51:
                kotlin.Unit r6 = kotlin.Unit.f93236a
                return r6
            L54:
                kotlinx.coroutines.flow.FlowCollector r7 = r5.f73363d
                java.lang.Object r2 = r5.f73364e
                r0.f73367t = r3
                java.lang.Object r6 = hg.s.a(r7, r6, r2, r0)
                if (r6 != r1) goto L61
            L60:
                return r1
            L61:
                kotlin.Unit r6 = kotlin.Unit.f93236a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.s.g.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public static final class h implements Flow {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f73368b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f73369c;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f73370r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f73371s;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            Object f73373u;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f73370r = obj;
                this.f73371s |= Integer.MIN_VALUE;
                return h.this.collect(null, this);
            }
        }

        public h(Flow flow, Function2 function2) {
            this.f73368b = flow;
            this.f73369c = function2;
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
                boolean r0 = r7 instanceof hg.s.h.a
                if (r0 == 0) goto L13
                r0 = r7
                hg.s$h$a r0 = (hg.s.h.a) r0
                int r1 = r0.f73371s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f73371s = r1
                goto L18
            L13:
                hg.s$h$a r0 = new hg.s$h$a
                r0.<init>(r7)
            L18:
                java.lang.Object r7 = r0.f73370r
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.f73371s
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r6 = r0.f73373u
                hg.s$i r6 = (hg.s.i) r6
                kotlin.d.b(r7)     // Catch: ig.a -> L2d
                goto L5a
            L2d:
                r7 = move-exception
                goto L50
            L2f:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r7)
                throw r6
            L37:
                kotlin.d.b(r7)
                kotlinx.coroutines.flow.Flow r7 = r5.f73368b
                hg.s$i r2 = new hg.s$i
                kotlin.jvm.functions.Function2 r4 = r5.f73369c
                r2.<init>(r4, r6)
                r0.f73373u = r2     // Catch: ig.a -> L4e
                r0.f73371s = r3     // Catch: ig.a -> L4e
                java.lang.Object r6 = r7.collect(r2, r0)     // Catch: ig.a -> L4e
                if (r6 != r1) goto L5a
                return r1
            L4e:
                r7 = move-exception
                r6 = r2
            L50:
                ig.p.a(r7, r6)
                kotlin.coroutines.CoroutineContext r6 = r0.getContext()
                kotlinx.coroutines.z.m(r6)
            L5a:
                kotlin.Unit r6 = kotlin.Unit.f93236a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.s.h.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public static final class i implements FlowCollector {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f73374b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ FlowCollector f73375c;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f73376r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f73377s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f73378t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            Object f73380v;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f73377s = obj;
                this.f73378t |= Integer.MIN_VALUE;
                return i.this.emit(null, this);
            }
        }

        public i(Function2 function2, FlowCollector flowCollector) {
            this.f73374b = function2;
            this.f73375c = flowCollector;
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
        
            if (r2.emit(r9, r0) == r1) goto L24;
         */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0081  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object emit(java.lang.Object r8, kotlin.coroutines.Continuation r9) {
            /*
                r7 = this;
                boolean r0 = r9 instanceof hg.s.i.a
                if (r0 == 0) goto L13
                r0 = r9
                hg.s$i$a r0 = (hg.s.i.a) r0
                int r1 = r0.f73378t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f73378t = r1
                goto L18
            L13:
                hg.s$i$a r0 = new hg.s$i$a
                r0.<init>(r9)
            L18:
                java.lang.Object r9 = r0.f73377s
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.f73378t
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L46
                if (r2 == r4) goto L38
                if (r2 != r3) goto L30
                java.lang.Object r8 = r0.f73376r
                hg.s$i r8 = (hg.s.i) r8
                kotlin.d.b(r9)
                goto L7c
            L30:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r9)
                throw r8
            L38:
                java.lang.Object r8 = r0.f73380v
                java.lang.Object r2 = r0.f73376r
                hg.s$i r2 = (hg.s.i) r2
                kotlin.d.b(r9)
                r6 = r9
                r9 = r8
                r8 = r2
                r2 = r6
                goto L63
            L46:
                kotlin.d.b(r9)
                kotlin.jvm.functions.Function2 r9 = r7.f73374b
                r0.f73376r = r7
                r0.f73380v = r8
                r0.f73378t = r4
                r2 = 6
                kotlin.jvm.internal.z.c(r2)
                java.lang.Object r9 = r9.invoke(r8, r0)
                r2 = 7
                kotlin.jvm.internal.z.c(r2)
                if (r9 != r1) goto L60
                goto L7a
            L60:
                r2 = r9
                r9 = r8
                r8 = r7
            L63:
                java.lang.Boolean r2 = (java.lang.Boolean) r2
                boolean r2 = r2.booleanValue()
                if (r2 == 0) goto L7b
                kotlinx.coroutines.flow.FlowCollector r2 = r8.f73375c
                r0.f73376r = r8
                r5 = 0
                r0.f73380v = r5
                r0.f73378t = r3
                java.lang.Object r9 = r2.emit(r9, r0)
                if (r9 != r1) goto L7c
            L7a:
                return r1
            L7b:
                r4 = 0
            L7c:
                if (r4 == 0) goto L81
                kotlin.Unit r8 = kotlin.Unit.f93236a
                return r8
            L81:
                ig.a r9 = new ig.a
                r9.<init>(r8)
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.s.i.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    static final class j extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f73381r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private /* synthetic */ Object f73382s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ Flow f73383t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final /* synthetic */ Function3 f73384u;

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ Function3 f73385b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ FlowCollector f73386c;

            /* JADX INFO: renamed from: hg.s$j$a$a, reason: collision with other inner class name */
            public static final class C0901a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                Object f73387r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                /* synthetic */ Object f73388s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f73389t;

                public C0901a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f73388s = obj;
                    this.f73389t |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(Function3 function3, FlowCollector flowCollector) {
                this.f73385b = function3;
                this.f73386c = flowCollector;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.FlowCollector
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public java.lang.Object emit(java.lang.Object r5, kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof hg.s.j.a.C0901a
                    if (r0 == 0) goto L13
                    r0 = r6
                    hg.s$j$a$a r0 = (hg.s.j.a.C0901a) r0
                    int r1 = r0.f73389t
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f73389t = r1
                    goto L18
                L13:
                    hg.s$j$a$a r0 = new hg.s$j$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f73388s
                    java.lang.Object r1 = pf.b.g()
                    int r2 = r0.f73389t
                    r3 = 1
                    if (r2 == 0) goto L35
                    if (r2 != r3) goto L2d
                    java.lang.Object r5 = r0.f73387r
                    hg.s$j$a r5 = (hg.s.j.a) r5
                    kotlin.d.b(r6)
                    goto L50
                L2d:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L35:
                    kotlin.d.b(r6)
                    kotlin.jvm.functions.Function3 r6 = r4.f73385b
                    kotlinx.coroutines.flow.FlowCollector r2 = r4.f73386c
                    r0.f73387r = r4
                    r0.f73389t = r3
                    r3 = 6
                    kotlin.jvm.internal.z.c(r3)
                    java.lang.Object r6 = r6.invoke(r2, r5, r0)
                    r5 = 7
                    kotlin.jvm.internal.z.c(r5)
                    if (r6 != r1) goto L4f
                    return r1
                L4f:
                    r5 = r4
                L50:
                    java.lang.Boolean r6 = (java.lang.Boolean) r6
                    boolean r6 = r6.booleanValue()
                    if (r6 == 0) goto L5b
                    kotlin.Unit r5 = kotlin.Unit.f93236a
                    return r5
                L5b:
                    ig.a r6 = new ig.a
                    r6.<init>(r5)
                    throw r6
                */
                throw new UnsupportedOperationException("Method not decompiled: hg.s.j.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(Flow flow, Function3 function3, Continuation continuation) {
            super(2, continuation);
            this.f73383t = flow;
            this.f73384u = function3;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            j jVar = new j(this.f73383t, this.f73384u, continuation);
            jVar.f73382s = obj;
            return jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar;
            Object objG = pf.b.g();
            int i10 = this.f73381r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                FlowCollector flowCollector = (FlowCollector) this.f73382s;
                Flow flow = this.f73383t;
                a aVar2 = new a(this.f73384u, flowCollector);
                try {
                    this.f73382s = aVar2;
                    this.f73381r = 1;
                    if (flow.collect(aVar2, this) == objG) {
                        return objG;
                    }
                } catch (ig.a e10) {
                    e = e10;
                    aVar = aVar2;
                    ig.p.a(e, aVar);
                    kotlinx.coroutines.z.m(getContext());
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (a) this.f73382s;
                try {
                    kotlin.d.b(obj);
                } catch (ig.a e11) {
                    e = e11;
                    ig.p.a(e, aVar);
                    kotlinx.coroutines.z.m(getContext());
                }
            }
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector flowCollector, Continuation continuation) {
            return ((j) create(flowCollector, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public static final Flow b(Flow flow, int i10) {
        if (i10 >= 0) {
            return new a(flow, i10);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i10).toString());
    }

    public static final Flow c(Flow flow, Function2 function2) {
        return new c(flow, function2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(kotlinx.coroutines.flow.FlowCollector r4, java.lang.Object r5, java.lang.Object r6, kotlin.coroutines.Continuation r7) {
        /*
            boolean r0 = r7 instanceof hg.s.e
            if (r0 == 0) goto L13
            r0 = r7
            hg.s$e r0 = (hg.s.e) r0
            int r1 = r0.f73354t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73354t = r1
            goto L18
        L13:
            hg.s$e r0 = new hg.s$e
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f73353s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f73354t
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 == r3) goto L2d
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L2d:
            java.lang.Object r6 = r0.f73352r
            kotlin.d.b(r7)
            goto L41
        L33:
            kotlin.d.b(r7)
            r0.f73352r = r6
            r0.f73354t = r3
            java.lang.Object r4 = r4.emit(r5, r0)
            if (r4 != r1) goto L41
            return r1
        L41:
            ig.a r4 = new ig.a
            r4.<init>(r6)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.s.d(kotlinx.coroutines.flow.FlowCollector, java.lang.Object, java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final Flow e(Flow flow, int i10) {
        if (i10 > 0) {
            return new f(flow, i10);
        }
        throw new IllegalArgumentException(("Requested element count " + i10 + " should be positive").toString());
    }

    public static final Flow f(Flow flow, Function2 function2) {
        return new h(flow, function2);
    }

    public static final Flow g(Flow flow, Function3 function3) {
        return hg.i.B(new j(flow, function3, null));
    }
}
