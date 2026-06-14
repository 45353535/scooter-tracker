package hg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class w {

    public static final class a implements Flow {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f73444b;

        /* JADX INFO: renamed from: hg.w$a$a, reason: collision with other inner class name */
        public static final class C0904a implements FlowCollector {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ FlowCollector f73445b;

            /* JADX INFO: renamed from: hg.w$a$a$a, reason: collision with other inner class name */
            public static final class C0905a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f73446r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                int f73447s;

                public C0905a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f73446r = obj;
                    this.f73447s |= Integer.MIN_VALUE;
                    return C0904a.this.emit(null, this);
                }
            }

            public C0904a(FlowCollector flowCollector) {
                this.f73445b = flowCollector;
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
                    boolean r0 = r6 instanceof hg.w.a.C0904a.C0905a
                    if (r0 == 0) goto L13
                    r0 = r6
                    hg.w$a$a$a r0 = (hg.w.a.C0904a.C0905a) r0
                    int r1 = r0.f73447s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f73447s = r1
                    goto L18
                L13:
                    hg.w$a$a$a r0 = new hg.w$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f73446r
                    java.lang.Object r1 = pf.b.g()
                    int r2 = r0.f73447s
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.d.b(r6)
                    goto L41
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.d.b(r6)
                    kotlinx.coroutines.flow.FlowCollector r6 = r4.f73445b
                    if (r5 == 0) goto L41
                    r0.f73447s = r3
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L41
                    return r1
                L41:
                    kotlin.Unit r5 = kotlin.Unit.f93236a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: hg.w.a.C0904a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public a(Flow flow) {
            this.f73444b = flow;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f73444b.collect(new C0904a(flowCollector), continuation);
            return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
        }
    }

    public static final class b implements Flow {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Flow f73449b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function2 f73450c;

        public static final class a implements FlowCollector {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ FlowCollector f73451b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function2 f73452c;

            /* JADX INFO: renamed from: hg.w$b$a$a, reason: collision with other inner class name */
            public static final class C0906a extends kotlin.coroutines.jvm.internal.d {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                /* synthetic */ Object f73453r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                int f73454s;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                Object f73456u;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                Object f73457v;

                public C0906a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    this.f73453r = obj;
                    this.f73454s |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(FlowCollector flowCollector, Function2 function2) {
                this.f73451b = flowCollector;
                this.f73452c = function2;
            }

            /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
            
                if (r6.emit(r2, r0) == r1) goto L22;
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
                    boolean r0 = r7 instanceof hg.w.b.a.C0906a
                    if (r0 == 0) goto L13
                    r0 = r7
                    hg.w$b$a$a r0 = (hg.w.b.a.C0906a) r0
                    int r1 = r0.f73454s
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f73454s = r1
                    goto L18
                L13:
                    hg.w$b$a$a r0 = new hg.w$b$a$a
                    r0.<init>(r7)
                L18:
                    java.lang.Object r7 = r0.f73453r
                    java.lang.Object r1 = pf.b.g()
                    int r2 = r0.f73454s
                    r3 = 2
                    r4 = 1
                    if (r2 == 0) goto L3e
                    if (r2 == r4) goto L34
                    if (r2 != r3) goto L2c
                    kotlin.d.b(r7)
                    goto L6a
                L2c:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L34:
                    java.lang.Object r6 = r0.f73457v
                    kotlinx.coroutines.flow.FlowCollector r6 = (kotlinx.coroutines.flow.FlowCollector) r6
                    java.lang.Object r2 = r0.f73456u
                    kotlin.d.b(r7)
                    goto L5c
                L3e:
                    kotlin.d.b(r7)
                    kotlinx.coroutines.flow.FlowCollector r7 = r5.f73451b
                    kotlin.jvm.functions.Function2 r2 = r5.f73452c
                    r0.f73456u = r6
                    r0.f73457v = r7
                    r0.f73454s = r4
                    r4 = 6
                    kotlin.jvm.internal.z.c(r4)
                    java.lang.Object r2 = r2.invoke(r6, r0)
                    r4 = 7
                    kotlin.jvm.internal.z.c(r4)
                    if (r2 != r1) goto L5a
                    goto L69
                L5a:
                    r2 = r6
                    r6 = r7
                L5c:
                    r7 = 0
                    r0.f73456u = r7
                    r0.f73457v = r7
                    r0.f73454s = r3
                    java.lang.Object r6 = r6.emit(r2, r0)
                    if (r6 != r1) goto L6a
                L69:
                    return r1
                L6a:
                    kotlin.Unit r6 = kotlin.Unit.f93236a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: hg.w.b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public b(Flow flow, Function2 function2) {
            this.f73449b = flow;
            this.f73450c = function2;
        }

        @Override // kotlinx.coroutines.flow.Flow
        public Object collect(FlowCollector flowCollector, Continuation continuation) {
            Object objCollect = this.f73449b.collect(new a(flowCollector, this.f73450c), continuation);
            return objCollect == pf.b.g() ? objCollect : Unit.f93236a;
        }
    }

    public static final class c implements Flow {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f73458b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Flow f73459c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function3 f73460d;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            /* synthetic */ Object f73461r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            int f73462s;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            Object f73464u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            Object f73465v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            Object f73466w;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f73461r = obj;
                this.f73462s |= Integer.MIN_VALUE;
                return c.this.collect(null, this);
            }
        }

        public c(Object obj, Flow flow, Function3 function3) {
            this.f73458b = obj;
            this.f73459c = flow;
            this.f73460d = function3;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0078, code lost:
        
            if (r8.collect(r5, r0) == r1) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.Flow
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r7, kotlin.coroutines.Continuation r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof hg.w.c.a
                if (r0 == 0) goto L13
                r0 = r8
                hg.w$c$a r0 = (hg.w.c.a) r0
                int r1 = r0.f73462s
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f73462s = r1
                goto L18
            L13:
                hg.w$c$a r0 = new hg.w$c$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f73461r
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.f73462s
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L44
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.d.b(r8)
                goto L7b
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f73466w
                kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
                java.lang.Object r2 = r0.f73465v
                kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
                java.lang.Object r4 = r0.f73464u
                hg.w$c r4 = (hg.w.c) r4
                kotlin.d.b(r8)
                goto L62
            L44:
                kotlin.d.b(r8)
                kotlin.jvm.internal.Ref$ObjectRef r8 = new kotlin.jvm.internal.Ref$ObjectRef
                r8.<init>()
                java.lang.Object r2 = r6.f73458b
                r8.f93280b = r2
                r0.f73464u = r6
                r0.f73465v = r7
                r0.f73466w = r8
                r0.f73462s = r4
                java.lang.Object r2 = r7.emit(r2, r0)
                if (r2 != r1) goto L5f
                goto L7a
            L5f:
                r4 = r6
                r2 = r7
                r7 = r8
            L62:
                kotlinx.coroutines.flow.Flow r8 = r4.f73459c
                hg.w$d r5 = new hg.w$d
                kotlin.jvm.functions.Function3 r4 = r4.f73460d
                r5.<init>(r7, r4, r2)
                r7 = 0
                r0.f73464u = r7
                r0.f73465v = r7
                r0.f73466w = r7
                r0.f73462s = r3
                java.lang.Object r7 = r8.collect(r5, r0)
                if (r7 != r1) goto L7b
            L7a:
                return r1
            L7b:
                kotlin.Unit r7 = kotlin.Unit.f93236a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.w.c.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    static final class d implements FlowCollector {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef f73467b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function3 f73468c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ FlowCollector f73469d;

        static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f73470r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            Object f73471s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            /* synthetic */ Object f73472t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            int f73474v;

            a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f73472t = obj;
                this.f73474v |= Integer.MIN_VALUE;
                return d.this.emit(null, this);
            }
        }

        d(Ref$ObjectRef ref$ObjectRef, Function3 function3, FlowCollector flowCollector) {
            this.f73467b = ref$ObjectRef;
            this.f73468c = function3;
            this.f73469d = flowCollector;
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x006d, code lost:
        
            if (r7.emit(r8, r0) == r1) goto L22;
         */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.FlowCollector
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object emit(java.lang.Object r7, kotlin.coroutines.Continuation r8) {
            /*
                r6 = this;
                boolean r0 = r8 instanceof hg.w.d.a
                if (r0 == 0) goto L13
                r0 = r8
                hg.w$d$a r0 = (hg.w.d.a) r0
                int r1 = r0.f73474v
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f73474v = r1
                goto L18
            L13:
                hg.w$d$a r0 = new hg.w$d$a
                r0.<init>(r8)
            L18:
                java.lang.Object r8 = r0.f73472t
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.f73474v
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L40
                if (r2 == r4) goto L34
                if (r2 != r3) goto L2c
                kotlin.d.b(r8)
                goto L70
            L2c:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r8)
                throw r7
            L34:
                java.lang.Object r7 = r0.f73471s
                kotlin.jvm.internal.Ref$ObjectRef r7 = (kotlin.jvm.internal.Ref$ObjectRef) r7
                java.lang.Object r2 = r0.f73470r
                hg.w$d r2 = (hg.w.d) r2
                kotlin.d.b(r8)
                goto L5a
            L40:
                kotlin.d.b(r8)
                kotlin.jvm.internal.Ref$ObjectRef r8 = r6.f73467b
                kotlin.jvm.functions.Function3 r2 = r6.f73468c
                java.lang.Object r5 = r8.f93280b
                r0.f73470r = r6
                r0.f73471s = r8
                r0.f73474v = r4
                java.lang.Object r7 = r2.invoke(r5, r7, r0)
                if (r7 != r1) goto L56
                goto L6f
            L56:
                r2 = r8
                r8 = r7
                r7 = r2
                r2 = r6
            L5a:
                r7.f93280b = r8
                kotlinx.coroutines.flow.FlowCollector r7 = r2.f73469d
                kotlin.jvm.internal.Ref$ObjectRef r8 = r2.f73467b
                java.lang.Object r8 = r8.f93280b
                r2 = 0
                r0.f73470r = r2
                r0.f73471s = r2
                r0.f73474v = r3
                java.lang.Object r7 = r7.emit(r8, r0)
                if (r7 != r1) goto L70
            L6f:
                return r1
            L70:
                kotlin.Unit r7 = kotlin.Unit.f93236a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.w.d.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    public static final Flow a(Flow flow) {
        return new a(flow);
    }

    public static final Flow b(Flow flow, Function2 function2) {
        return new b(flow, function2);
    }

    public static final Flow c(Flow flow, Object obj, Function3 function3) {
        return new c(obj, flow, function3);
    }

    public static final Flow d(Flow flow, Object obj, Function3 function3) {
        return i.P(flow, obj, function3);
    }
}
