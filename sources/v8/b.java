package v8;

import eg.m1;
import id.a1;
import id.b1;
import id.i1;
import id.l;
import id.m0;
import id.n0;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.i;
import pd.g0;
import pd.x;

/* JADX INFO: loaded from: classes12.dex */
public final class b implements v8.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final CoroutineDispatcher f105765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Function0 f105766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Lazy f105767c;

    static final class a extends Lambda implements Function0 {
        a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final CoroutineScope invoke() {
            return i.a(m1.b(null, 1, null).plus(b.this.f105765a));
        }
    }

    /* JADX INFO: renamed from: v8.b$b, reason: collision with other inner class name */
    static final class C1318b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f105769r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f105770s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f105771t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f105772u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f105773v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        int f105774w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f105775x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f105777z;

        C1318b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f105775x = obj;
            this.f105777z |= Integer.MIN_VALUE;
            return b.this.j(null, 0, null, this);
        }
    }

    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f105778r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f105780t;

        c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f105778r = obj;
            this.f105780t |= Integer.MIN_VALUE;
            return b.this.getCacheParams(null, this);
        }
    }

    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f105781r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f105783t;

        d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f105781r = obj;
            this.f105783t |= Integer.MIN_VALUE;
            return b.this.g(null, this);
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f105784r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f105785s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f105786t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f105787u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f105788v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f105789w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f105790x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f105792z;

        e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f105790x = obj;
            this.f105792z |= Integer.MIN_VALUE;
            return b.this.h(null, null, this);
        }
    }

    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f105793r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        Object f105794s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        Object f105795t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        Object f105796u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        Object f105797v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        Object f105798w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        /* synthetic */ Object f105799x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        int f105801z;

        f(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f105799x = obj;
            this.f105801z |= Integer.MIN_VALUE;
            return b.this.i(null, null, this);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        /* synthetic */ Object f105802r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        int f105804t;

        g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f105802r = obj;
            this.f105804t |= Integer.MIN_VALUE;
            return b.this.n(null, null, this);
        }
    }

    static final class h extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f105805r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ qd.a f105806s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ String f105807t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(qd.a aVar, String str, Continuation continuation) {
            super(2, continuation);
            this.f105806s = aVar;
            this.f105807t = str;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new h(this.f105806s, this.f105807t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f105805r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            qd.a aVar = this.f105806s;
            String str = this.f105807t;
            this.f105805r = 1;
            Object objX = aVar.x(str, this);
            return objX == objG ? objG : objX;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }
    }

    public b(CoroutineDispatcher ioDispatcher, Function0 function0) {
        Intrinsics.checkNotNullParameter(ioDispatcher, "ioDispatcher");
        this.f105765a = ioDispatcher;
        this.f105766b = function0;
        this.f105767c = lf.i.a(new a());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(id.c r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof v8.b.d
            if (r0 == 0) goto L13
            r0 = r6
            v8.b$d r0 = (v8.b.d) r0
            int r1 = r0.f105783t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f105783t = r1
            goto L18
        L13:
            v8.b$d r0 = new v8.b$d
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f105781r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f105783t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r6)
            goto L49
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            kotlin.d.b(r6)
            kotlin.jvm.functions.Function0 r6 = r4.f105766b
            if (r6 == 0) goto L4c
            java.lang.Object r6 = r6.invoke()
            qd.a r6 = (qd.a) r6
            if (r6 == 0) goto L4c
            r0.f105783t = r3
            java.lang.Object r6 = r4.h(r5, r6, r0)
            if (r6 != r1) goto L49
            return r1
        L49:
            java.util.List r6 = (java.util.List) r6
            goto L4d
        L4c:
            r6 = 0
        L4d:
            java.util.Map r5 = kotlin.collections.MapsKt.createMapBuilder()
            r0 = r6
            java.util.Collection r0 = (java.util.Collection) r0
            if (r0 == 0) goto L62
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L5d
            goto L62
        L5d:
            java.lang.String r0 = "adaptive_resources_cache"
            r5.put(r0, r6)
        L62:
            java.util.Map r5 = kotlin.collections.MapsKt.build(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.b.g(id.c, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d7, code lost:
    
        if (r11 == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x00d7 -> B:30:0x00da). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object h(id.c r9, qd.a r10, kotlin.coroutines.Continuation r11) {
        /*
            Method dump skipped, instruction units count: 238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.b.h(id.c, qd.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(id.d r9, qd.a r10, kotlin.coroutines.Continuation r11) {
        /*
            r8 = this;
            boolean r0 = r11 instanceof v8.b.f
            if (r0 == 0) goto L13
            r0 = r11
            v8.b$f r0 = (v8.b.f) r0
            int r1 = r0.f105801z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f105801z = r1
            goto L18
        L13:
            v8.b$f r0 = new v8.b$f
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f105799x
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f105801z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L5c
            if (r2 == r4) goto L3d
            if (r2 != r3) goto L35
            java.lang.Object r9 = r0.f105794s
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r0.f105793r
            java.util.List r10 = (java.util.List) r10
            kotlin.d.b(r11)
            goto Lac
        L35:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3d:
            java.lang.Object r9 = r0.f105798w
            java.util.List r9 = (java.util.List) r9
            java.lang.Object r10 = r0.f105797v
            java.util.List r10 = (java.util.List) r10
            java.lang.Object r2 = r0.f105796u
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r0.f105795t
            qd.a r4 = (qd.a) r4
            java.lang.Object r5 = r0.f105794s
            id.d r5 = (id.d) r5
            java.lang.Object r6 = r0.f105793r
            v8.b r6 = (v8.b) r6
            kotlin.d.b(r11)
            r7 = r2
            r2 = r11
            r11 = r7
            goto L85
        L5c:
            kotlin.d.b(r11)
            java.util.List r11 = kotlin.collections.CollectionsKt.createListBuilder()
            java.util.List r2 = r9.a()
            int r5 = r9.h()
            r0.f105793r = r8
            r0.f105794s = r9
            r0.f105795t = r10
            r0.f105796u = r11
            r0.f105797v = r11
            r0.f105798w = r11
            r0.f105801z = r4
            java.lang.Object r2 = r8.j(r2, r5, r10, r0)
            if (r2 != r1) goto L80
            goto La7
        L80:
            r6 = r8
            r5 = r9
            r4 = r10
            r9 = r11
            r10 = r9
        L85:
            java.util.Collection r2 = (java.util.Collection) r2
            r9.addAll(r2)
            java.util.List r9 = r5.e()
            int r2 = r5.h()
            r0.f105793r = r11
            r0.f105794s = r10
            r5 = 0
            r0.f105795t = r5
            r0.f105796u = r5
            r0.f105797v = r5
            r0.f105798w = r5
            r0.f105801z = r3
            java.lang.Object r9 = r6.j(r9, r2, r4, r0)
            if (r9 != r1) goto La8
        La7:
            return r1
        La8:
            r7 = r11
            r11 = r9
            r9 = r10
            r10 = r7
        Lac:
            java.util.Collection r11 = (java.util.Collection) r11
            r9.addAll(r11)
            java.util.List r9 = kotlin.collections.CollectionsKt.build(r10)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.b.i(id.d, qd.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ae A[LOOP:0: B:22:0x00a8->B:24:0x00ae, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x008e -> B:21:0x0097). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.util.List r25, int r26, qd.a r27, kotlin.coroutines.Continuation r28) {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.b.j(java.util.List, int, qd.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    private final CoroutineScope l() {
        return (CoroutineScope) this.f105767c.getValue();
    }

    private final Set m(id.a aVar) {
        l lVarC;
        m0 m0VarA;
        a1 a1VarA;
        b1 b1VarA;
        b1 b1VarA2;
        Set setCreateSetBuilder = SetsKt.createSetBuilder();
        a1 a1VarL = aVar.l();
        if (a1VarL != null && (b1VarA2 = a1VarL.a()) != null) {
            i1 i1Var = (b1VarA2 instanceof i1 ? b1VarA2 : null) != null ? (i1) b1VarA2 : null;
            if (i1Var != null) {
                setCreateSetBuilder.addAll(i1Var.a());
            }
        }
        String strM = aVar.m();
        if (strM != null) {
            if (!g0.x(strM)) {
                strM = null;
            }
            if (strM != null) {
                setCreateSetBuilder.add(strM);
            }
        }
        String strK = aVar.k();
        if (strK != null) {
            if (!g0.x(strK)) {
                strK = null;
            }
            if (strK != null) {
                setCreateSetBuilder.add(strK);
            }
        }
        id.k kVarA = aVar.c().a();
        if (kVarA != null && (lVarC = kVarA.c()) != null) {
            n0 n0Var = (lVarC instanceof n0 ? lVarC : null) != null ? (n0) lVarC : null;
            if (n0Var != null && (m0VarA = n0Var.a()) != null && (a1VarA = m0VarA.a()) != null && (b1VarA = a1VarA.a()) != null) {
                i1 i1Var2 = (b1VarA instanceof i1 ? b1VarA : null) != null ? (i1) b1VarA : null;
                if (i1Var2 != null) {
                    setCreateSetBuilder.addAll(i1Var2.a());
                }
            }
        }
        return SetsKt.build(setCreateSetBuilder);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object n(id.a r11, qd.a r12, kotlin.coroutines.Continuation r13) {
        /*
            r10 = this;
            boolean r0 = r13 instanceof v8.b.g
            if (r0 == 0) goto L13
            r0 = r13
            v8.b$g r0 = (v8.b.g) r0
            int r1 = r0.f105804t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f105804t = r1
            goto L18
        L13:
            v8.b$g r0 = new v8.b$g
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f105802r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f105804t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r13)
            goto L73
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            kotlin.d.b(r13)
            java.util.Set r11 = r10.m(r11)
            java.lang.Iterable r11 = (java.lang.Iterable) r11
            java.util.ArrayList r13 = new java.util.ArrayList
            r2 = 10
            int r2 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r11, r2)
            r13.<init>(r2)
            java.util.Iterator r11 = r11.iterator()
        L49:
            boolean r2 = r11.hasNext()
            if (r2 == 0) goto L6a
            java.lang.Object r2 = r11.next()
            java.lang.String r2 = (java.lang.String) r2
            kotlinx.coroutines.CoroutineScope r4 = r10.l()
            v8.b$h r7 = new v8.b$h
            r5 = 0
            r7.<init>(r12, r2, r5)
            r8 = 3
            r9 = 0
            r6 = 0
            kotlinx.coroutines.Deferred r2 = eg.g.b(r4, r5, r6, r7, r8, r9)
            r13.add(r2)
            goto L49
        L6a:
            r0.f105804t = r3
            java.lang.Object r13 = eg.d.a(r13, r0)
            if (r13 != r1) goto L73
            return r1
        L73:
            java.lang.Iterable r13 = (java.lang.Iterable) r13
            java.util.List r11 = kotlin.collections.CollectionsKt.filterNotNull(r13)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.b.n(id.a, qd.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // v8.c
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object getCacheParams(od.k r6, kotlin.coroutines.Continuation r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof v8.b.c
            if (r0 == 0) goto L13
            r0 = r7
            v8.b$c r0 = (v8.b.c) r0
            int r1 = r0.f105780t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f105780t = r1
            goto L18
        L13:
            v8.b$c r0 = new v8.b$c
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.f105778r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f105780t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r7)     // Catch: java.lang.Exception -> L69
            goto L5f
        L29:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L31:
            kotlin.d.b(r7)
            java.lang.String r7 = "rendering_configuration"
            java.lang.Object r7 = r6.p(r7)     // Catch: java.lang.Exception -> L69
            if (r7 == 0) goto L64
            boolean r2 = r7 instanceof io.bidmachine.protobuf.rendering.Rendering     // Catch: java.lang.Exception -> L69
            r4 = 0
            if (r2 == 0) goto L43
            r2 = r7
            goto L44
        L43:
            r2 = r4
        L44:
            if (r2 == 0) goto L49
            r4 = r7
            io.bidmachine.protobuf.rendering.Rendering r4 = (io.bidmachine.protobuf.rendering.Rendering) r4     // Catch: java.lang.Exception -> L69
        L49:
            if (r4 == 0) goto L64
            io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams r7 = new io.bidmachine.ads.networks.adaptiverendering.AdaptiveRenderingParams     // Catch: java.lang.Exception -> L69
            r7.<init>(r6)     // Catch: java.lang.Exception -> L69
            id.c r6 = r7.getAdParams()     // Catch: java.lang.Exception -> L69
            if (r6 == 0) goto L64
            r0.f105780t = r3     // Catch: java.lang.Exception -> L69
            java.lang.Object r7 = r5.g(r6, r0)     // Catch: java.lang.Exception -> L69
            if (r7 != r1) goto L5f
            return r1
        L5f:
            java.util.Map r7 = (java.util.Map) r7     // Catch: java.lang.Exception -> L69
            if (r7 == 0) goto L64
            return r7
        L64:
            java.util.Map r6 = kotlin.collections.MapsKt.emptyMap()     // Catch: java.lang.Exception -> L69
            return r6
        L69:
            java.util.Map r6 = kotlin.collections.MapsKt.emptyMap()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: v8.b.getCacheParams(od.k, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ b(CoroutineDispatcher coroutineDispatcher, Function0 function0, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? x.f98252g.a().e() : coroutineDispatcher, function0);
    }
}
