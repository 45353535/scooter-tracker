package hg;

import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlinx.coroutines.flow.FlowCollector;

/* JADX INFO: loaded from: classes3.dex */
abstract /* synthetic */ class u {

    public static final class a implements FlowCollector {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef f73396b;

        public a(Ref$ObjectRef ref$ObjectRef) {
            this.f73396b = ref$ObjectRef;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public Object emit(Object obj, Continuation continuation) {
            this.f73396b.f93280b = obj;
            throw new ig.a(this);
        }
    }

    public static final class b implements FlowCollector {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f73397b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef f73398c;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f73399r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f73400s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f73401t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            Object f73403v;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f73400s = obj;
                this.f73401t |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(Function2 function2, Ref$ObjectRef ref$ObjectRef) {
            this.f73397b = function2;
            this.f73398c = ref$ObjectRef;
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
                boolean r0 = r6 instanceof hg.u.b.a
                if (r0 == 0) goto L13
                r0 = r6
                hg.u$b$a r0 = (hg.u.b.a) r0
                int r1 = r0.f73401t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f73401t = r1
                goto L18
            L13:
                hg.u$b$a r0 = new hg.u$b$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f73400s
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.f73401t
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f73403v
                java.lang.Object r0 = r0.f73399r
                hg.u$b r0 = (hg.u.b) r0
                kotlin.d.b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                kotlin.d.b(r6)
                kotlin.jvm.functions.Function2 r6 = r4.f73397b
                r0.f73399r = r4
                r0.f73403v = r5
                r0.f73401t = r3
                r2 = 6
                kotlin.jvm.internal.z.c(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.z.c(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5d
                kotlin.Unit r5 = kotlin.Unit.f93236a
                return r5
            L5d:
                kotlin.jvm.internal.Ref$ObjectRef r6 = r0.f73398c
                r6.f93280b = r5
                ig.a r5 = new ig.a
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.u.b.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f73404r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f73405s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f73406t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f73407u;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f73406t = obj;
            this.f73407u |= Integer.MIN_VALUE;
            return hg.i.x(null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f73408r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f73409s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f73410t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f73411u;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f73410t = obj;
            this.f73411u |= Integer.MIN_VALUE;
            return hg.i.y(null, null, this);
        }
    }

    public static final class e implements FlowCollector {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef f73412b;

        public e(Ref$ObjectRef ref$ObjectRef) {
            this.f73412b = ref$ObjectRef;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public Object emit(Object obj, Continuation continuation) {
            this.f73412b.f93280b = obj;
            throw new ig.a(this);
        }
    }

    public static final class f implements FlowCollector {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2 f73413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef f73414c;

        public static final class a extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            Object f73415r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            /* synthetic */ Object f73416s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            int f73417t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            Object f73419v;

            public a(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f73416s = obj;
                this.f73417t |= Integer.MIN_VALUE;
                return f.this.emit(null, this);
            }
        }

        public f(Function2 function2, Ref$ObjectRef ref$ObjectRef) {
            this.f73413b = function2;
            this.f73414c = ref$ObjectRef;
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
                boolean r0 = r6 instanceof hg.u.f.a
                if (r0 == 0) goto L13
                r0 = r6
                hg.u$f$a r0 = (hg.u.f.a) r0
                int r1 = r0.f73417t
                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                r3 = r1 & r2
                if (r3 == 0) goto L13
                int r1 = r1 - r2
                r0.f73417t = r1
                goto L18
            L13:
                hg.u$f$a r0 = new hg.u$f$a
                r0.<init>(r6)
            L18:
                java.lang.Object r6 = r0.f73416s
                java.lang.Object r1 = pf.b.g()
                int r2 = r0.f73417t
                r3 = 1
                if (r2 == 0) goto L37
                if (r2 != r3) goto L2f
                java.lang.Object r5 = r0.f73419v
                java.lang.Object r0 = r0.f73415r
                hg.u$f r0 = (hg.u.f) r0
                kotlin.d.b(r6)
                goto L52
            L2f:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                throw r5
            L37:
                kotlin.d.b(r6)
                kotlin.jvm.functions.Function2 r6 = r4.f73413b
                r0.f73415r = r4
                r0.f73419v = r5
                r0.f73417t = r3
                r2 = 6
                kotlin.jvm.internal.z.c(r2)
                java.lang.Object r6 = r6.invoke(r5, r0)
                r0 = 7
                kotlin.jvm.internal.z.c(r0)
                if (r6 != r1) goto L51
                return r1
            L51:
                r0 = r4
            L52:
                java.lang.Boolean r6 = (java.lang.Boolean) r6
                boolean r6 = r6.booleanValue()
                if (r6 != 0) goto L5d
                kotlin.Unit r5 = kotlin.Unit.f93236a
                return r5
            L5d:
                kotlin.jvm.internal.Ref$ObjectRef r6 = r0.f73414c
                r6.f93280b = r5
                ig.a r5 = new ig.a
                r5.<init>(r0)
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: hg.u.f.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f73420r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f73421s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f73422t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f73423u;

        g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f73422t = obj;
            this.f73423u |= Integer.MIN_VALUE;
            return hg.i.z(null, this);
        }
    }

    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f73424r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f73425s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        /* synthetic */ Object f73426t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        int f73427u;

        h(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f73426t = obj;
            this.f73427u |= Integer.MIN_VALUE;
            return hg.i.A(null, null, this);
        }
    }

    static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f73428r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f73429s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f73430t;

        i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f73429s = obj;
            this.f73430t |= Integer.MIN_VALUE;
            return hg.i.S(null, this);
        }
    }

    static final class j implements FlowCollector {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Ref$ObjectRef f73431b;

        j(Ref$ObjectRef ref$ObjectRef) {
            this.f73431b = ref$ObjectRef;
        }

        @Override // kotlinx.coroutines.flow.FlowCollector
        public final Object emit(Object obj, Continuation continuation) {
            Ref$ObjectRef ref$ObjectRef = this.f73431b;
            if (ref$ObjectRef.f93280b != ig.t.f74821a) {
                throw new IllegalArgumentException("Flow has more than one element");
            }
            ref$ObjectRef.f93280b = obj;
            return Unit.f93236a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object a(kotlinx.coroutines.flow.Flow r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof hg.u.c
            if (r0 == 0) goto L13
            r0 = r5
            hg.u$c r0 = (hg.u.c) r0
            int r1 = r0.f73407u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73407u = r1
            goto L18
        L13:
            hg.u$c r0 = new hg.u$c
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f73406t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f73407u
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f73405s
            hg.u$a r4 = (hg.u.a) r4
            java.lang.Object r1 = r0.f73404r
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            kotlin.d.b(r5)     // Catch: ig.a -> L31
            goto L69
        L31:
            r5 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.d.b(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            jg.e0 r2 = ig.t.f74821a
            r5.f93280b = r2
            hg.u$a r2 = new hg.u$a
            r2.<init>(r5)
            r0.f73404r = r5     // Catch: ig.a -> L5b
            r0.f73405s = r2     // Catch: ig.a -> L5b
            r0.f73407u = r3     // Catch: ig.a -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: ig.a -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r1 = r5
            goto L69
        L5b:
            r4 = move-exception
            r1 = r5
            r5 = r4
            r4 = r2
        L5f:
            ig.p.a(r5, r4)
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            kotlinx.coroutines.z.m(r4)
        L69:
            java.lang.Object r4 = r1.f93280b
            jg.e0 r5 = ig.t.f74821a
            if (r4 == r5) goto L70
            return r4
        L70:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.u.a(kotlinx.coroutines.flow.Flow, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object b(kotlinx.coroutines.flow.Flow r4, kotlin.jvm.functions.Function2 r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof hg.u.d
            if (r0 == 0) goto L13
            r0 = r6
            hg.u$d r0 = (hg.u.d) r0
            int r1 = r0.f73411u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73411u = r1
            goto L18
        L13:
            hg.u$d r0 = new hg.u$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f73410t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f73411u
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f73409s
            hg.u$b r4 = (hg.u.b) r4
            java.lang.Object r5 = r0.f73408r
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref$ObjectRef) r5
            kotlin.d.b(r6)     // Catch: ig.a -> L31
            goto L69
        L31:
            r6 = move-exception
            goto L5f
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.d.b(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            jg.e0 r2 = ig.t.f74821a
            r6.f93280b = r2
            hg.u$b r2 = new hg.u$b
            r2.<init>(r5, r6)
            r0.f73408r = r6     // Catch: ig.a -> L5b
            r0.f73409s = r2     // Catch: ig.a -> L5b
            r0.f73411u = r3     // Catch: ig.a -> L5b
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: ig.a -> L5b
            if (r4 != r1) goto L59
            return r1
        L59:
            r5 = r6
            goto L69
        L5b:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5f:
            ig.p.a(r6, r4)
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            kotlinx.coroutines.z.m(r4)
        L69:
            java.lang.Object r4 = r5.f93280b
            jg.e0 r5 = ig.t.f74821a
            if (r4 == r5) goto L70
            return r4
        L70:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Expected at least one element matching the predicate"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.u.b(kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object c(kotlinx.coroutines.flow.Flow r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof hg.u.g
            if (r0 == 0) goto L13
            r0 = r5
            hg.u$g r0 = (hg.u.g) r0
            int r1 = r0.f73423u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73423u = r1
            goto L18
        L13:
            hg.u$g r0 = new hg.u$g
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f73422t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f73423u
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f73421s
            hg.u$e r4 = (hg.u.e) r4
            java.lang.Object r1 = r0.f73420r
            kotlin.jvm.internal.Ref$ObjectRef r1 = (kotlin.jvm.internal.Ref$ObjectRef) r1
            kotlin.d.b(r5)     // Catch: ig.a -> L31
            goto L65
        L31:
            r5 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.d.b(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            hg.u$e r2 = new hg.u$e
            r2.<init>(r5)
            r0.f73420r = r5     // Catch: ig.a -> L57
            r0.f73421s = r2     // Catch: ig.a -> L57
            r0.f73423u = r3     // Catch: ig.a -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: ig.a -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r1 = r5
            goto L65
        L57:
            r4 = move-exception
            r1 = r5
            r5 = r4
            r4 = r2
        L5b:
            ig.p.a(r5, r4)
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            kotlinx.coroutines.z.m(r4)
        L65:
            java.lang.Object r4 = r1.f93280b
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.u.c(kotlinx.coroutines.flow.Flow, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object d(kotlinx.coroutines.flow.Flow r4, kotlin.jvm.functions.Function2 r5, kotlin.coroutines.Continuation r6) {
        /*
            boolean r0 = r6 instanceof hg.u.h
            if (r0 == 0) goto L13
            r0 = r6
            hg.u$h r0 = (hg.u.h) r0
            int r1 = r0.f73427u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73427u = r1
            goto L18
        L13:
            hg.u$h r0 = new hg.u$h
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f73426t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f73427u
            r3 = 1
            if (r2 == 0) goto L3b
            if (r2 != r3) goto L33
            java.lang.Object r4 = r0.f73425s
            hg.u$f r4 = (hg.u.f) r4
            java.lang.Object r5 = r0.f73424r
            kotlin.jvm.internal.Ref$ObjectRef r5 = (kotlin.jvm.internal.Ref$ObjectRef) r5
            kotlin.d.b(r6)     // Catch: ig.a -> L31
            goto L65
        L31:
            r6 = move-exception
            goto L5b
        L33:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L3b:
            kotlin.d.b(r6)
            kotlin.jvm.internal.Ref$ObjectRef r6 = new kotlin.jvm.internal.Ref$ObjectRef
            r6.<init>()
            hg.u$f r2 = new hg.u$f
            r2.<init>(r5, r6)
            r0.f73424r = r6     // Catch: ig.a -> L57
            r0.f73425s = r2     // Catch: ig.a -> L57
            r0.f73427u = r3     // Catch: ig.a -> L57
            java.lang.Object r4 = r4.collect(r2, r0)     // Catch: ig.a -> L57
            if (r4 != r1) goto L55
            return r1
        L55:
            r5 = r6
            goto L65
        L57:
            r4 = move-exception
            r5 = r6
            r6 = r4
            r4 = r2
        L5b:
            ig.p.a(r6, r4)
            kotlin.coroutines.CoroutineContext r4 = r0.getContext()
            kotlinx.coroutines.z.m(r4)
        L65:
            java.lang.Object r4 = r5.f93280b
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.u.d(kotlinx.coroutines.flow.Flow, kotlin.jvm.functions.Function2, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object e(kotlinx.coroutines.flow.Flow r4, kotlin.coroutines.Continuation r5) {
        /*
            boolean r0 = r5 instanceof hg.u.i
            if (r0 == 0) goto L13
            r0 = r5
            hg.u$i r0 = (hg.u.i) r0
            int r1 = r0.f73430t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f73430t = r1
            goto L18
        L13:
            hg.u$i r0 = new hg.u$i
            r0.<init>(r5)
        L18:
            java.lang.Object r5 = r0.f73429s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f73430t
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r4 = r0.f73428r
            kotlin.jvm.internal.Ref$ObjectRef r4 = (kotlin.jvm.internal.Ref$ObjectRef) r4
            kotlin.d.b(r5)
            goto L52
        L2d:
            java.lang.IllegalStateException r4 = new java.lang.IllegalStateException
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            r4.<init>(r5)
            throw r4
        L35:
            kotlin.d.b(r5)
            kotlin.jvm.internal.Ref$ObjectRef r5 = new kotlin.jvm.internal.Ref$ObjectRef
            r5.<init>()
            jg.e0 r2 = ig.t.f74821a
            r5.f93280b = r2
            hg.u$j r2 = new hg.u$j
            r2.<init>(r5)
            r0.f73428r = r5
            r0.f73430t = r3
            java.lang.Object r4 = r4.collect(r2, r0)
            if (r4 != r1) goto L51
            return r1
        L51:
            r4 = r5
        L52:
            java.lang.Object r4 = r4.f93280b
            jg.e0 r5 = ig.t.f74821a
            if (r4 == r5) goto L59
            return r4
        L59:
            java.util.NoSuchElementException r4 = new java.util.NoSuchElementException
            java.lang.String r5 = "Flow is empty"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: hg.u.e(kotlinx.coroutines.flow.Flow, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
