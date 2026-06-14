package io.bidmachine.analytics.internal.v;

import com.explorestack.protobuf.Struct;
import eg.e0;
import eg.m1;
import io.bidmachine.analytics.MonitorConfig;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.i;

/* JADX INFO: loaded from: classes12.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f79914g = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C0970b f79915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.bidmachine.analytics.internal.D.a f79916b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f79917c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CoroutineScope f79918d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Job f79919e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f79920f = new AtomicBoolean(false);

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: io.bidmachine.analytics.internal.v.b$b, reason: collision with other inner class name */
    public static final class C0970b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final MonitorConfig f79921a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f79922b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Struct f79923c;

        public C0970b(MonitorConfig monitorConfig, String str, Struct struct) {
            this.f79921a = monitorConfig;
            this.f79922b = str;
            this.f79923c = struct;
        }

        public final Struct a() {
            return this.f79923c;
        }

        public final MonitorConfig b() {
            return this.f79921a;
        }

        public final String c() {
            return this.f79922b;
        }
    }

    static final class c extends k implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f79924a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f79926c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(List list, Continuation continuation) {
            super(2, continuation);
            this.f79926c = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new c(this.f79926c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f79924a;
            if (i10 == 0) {
                kotlin.d.b(obj);
                b bVar = b.this;
                List list = this.f79926c;
                this.f79924a = 1;
                if (bVar.a(list, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            return Unit.f93236a;
        }
    }

    static final class d extends k implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f79927a;

        d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new d(continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
        
            if (r7.a(0, r6) == r0) goto L15;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r6.f79927a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                kotlin.d.b(r7)
                kotlin.Result r7 = (kotlin.Result) r7
                r7.l()
                goto L49
            L17:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1f:
                kotlin.d.b(r7)
                goto L3d
            L23:
                kotlin.d.b(r7)
                io.bidmachine.analytics.internal.v.b r7 = io.bidmachine.analytics.internal.v.b.this
                io.bidmachine.analytics.internal.v.b$b r7 = io.bidmachine.analytics.internal.v.b.a(r7)
                io.bidmachine.analytics.MonitorConfig r7 = r7.b()
                long r4 = r7.getInterval()
                r6.f79927a = r3
                java.lang.Object r7 = eg.k0.a(r4, r6)
                if (r7 != r0) goto L3d
                goto L48
            L3d:
                io.bidmachine.analytics.internal.v.b r7 = io.bidmachine.analytics.internal.v.b.this
                r6.f79927a = r2
                r1 = 0
                java.lang.Object r7 = io.bidmachine.analytics.internal.v.b.a(r7, r1, r6)
                if (r7 != r0) goto L49
            L48:
                return r0
            L49:
                kotlin.Unit r7 = kotlin.Unit.f93236a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.v.b.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f79929a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f79930b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f79931c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f79933e;

        e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f79931c = obj;
            this.f79933e |= Integer.MIN_VALUE;
            return b.this.a((List) null, this);
        }
    }

    static final class f extends k implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f79934a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List f79936c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(List list, Continuation continuation) {
            super(2, continuation);
            this.f79936c = list;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new f(this.f79936c, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objA;
            Object objG = pf.b.g();
            int i10 = this.f79934a;
            if (i10 == 0) {
                kotlin.d.b(obj);
                io.bidmachine.analytics.internal.x.a aVar = new io.bidmachine.analytics.internal.x.a(b.this.f79915a.b().getUrl(), b.this.f79915a.b().getName(), b.this.f79915a.a(), this.f79936c, null, 16, null);
                this.f79934a = 1;
                objA = aVar.a(this);
                if (objA == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                objA = ((Result) obj).l();
            }
            b bVar = b.this;
            List list = this.f79936c;
            if (Result.j(objA)) {
                bVar.f79916b.b(list);
            }
            b bVar2 = b.this;
            List list2 = this.f79936c;
            if (Result.g(objA) != null) {
                bVar2.f79916b.c(list2);
            }
            return Result.a(objA);
        }
    }

    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f79937a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f79938b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f79939c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f79941e;

        g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f79939c = obj;
            this.f79941e |= Integer.MIN_VALUE;
            Object objA = b.this.a(0, this);
            return objA == pf.b.g() ? objA : Result.a(objA);
        }
    }

    static final class h extends k implements Function2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f79942a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ io.bidmachine.analytics.internal.g.b f79944c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(io.bidmachine.analytics.internal.g.b bVar, Continuation continuation) {
            super(2, continuation);
            this.f79944c = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((h) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return b.this.new h(this.f79944c, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0048, code lost:
        
            if (r5.a(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0059, code lost:
        
            if (r5.a(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r4.f79942a
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L23
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.d.b(r5)
                goto L5c
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                kotlin.d.b(r5)
                kotlin.Result r5 = (kotlin.Result) r5
                r5.l()
                goto L5c
            L23:
                kotlin.d.b(r5)
                io.bidmachine.analytics.internal.v.b r5 = io.bidmachine.analytics.internal.v.b.this
                io.bidmachine.analytics.internal.g.b r1 = r4.f79944c
                java.lang.Object r5 = io.bidmachine.analytics.internal.v.b.a(r5, r1)
                boolean r5 = kotlin.Result.j(r5)
                if (r5 == 0) goto L4b
                io.bidmachine.analytics.internal.v.b r5 = io.bidmachine.analytics.internal.v.b.this
                io.bidmachine.analytics.internal.v.b$b r1 = io.bidmachine.analytics.internal.v.b.a(r5)
                io.bidmachine.analytics.MonitorConfig r1 = r1.b()
                int r1 = r1.getBatchSize()
                r4.f79942a = r3
                java.lang.Object r5 = io.bidmachine.analytics.internal.v.b.a(r5, r1, r4)
                if (r5 != r0) goto L5c
                goto L5b
            L4b:
                io.bidmachine.analytics.internal.v.b r5 = io.bidmachine.analytics.internal.v.b.this
                io.bidmachine.analytics.internal.g.b r1 = r4.f79944c
                java.util.List r1 = kotlin.collections.CollectionsKt.listOf(r1)
                r4.f79942a = r2
                java.lang.Object r5 = io.bidmachine.analytics.internal.v.b.a(r5, r1, r4)
                if (r5 != r0) goto L5c
            L5b:
                return r0
            L5c:
                kotlin.Unit r5 = kotlin.Unit.f93236a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.v.b.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public b(io.bidmachine.analytics.internal.a.d dVar, C0970b c0970b, io.bidmachine.analytics.internal.D.a aVar) {
        this.f79915a = c0970b;
        this.f79916b = aVar;
        this.f79917c = c0970b.b().getName();
        this.f79918d = i.a(new e0("AnalyticsMonitor: " + c0970b.b().getName()).plus(m1.b(null, 1, null)).plus(dVar.c()));
    }

    public final String b() {
        return this.f79917c;
    }

    public final void b(io.bidmachine.analytics.internal.g.b bVar) {
        if (this.f79920f.get()) {
            return;
        }
        eg.i.d(this.f79918d, null, null, new h(bVar, null), 3, null);
    }

    public final void a() {
        if (this.f79920f.compareAndSet(false, true)) {
            Object objA = this.f79916b.a(this.f79915a.b().getName(), this.f79915a.c());
            if (Result.j(objA)) {
                eg.i.d(this.f79918d, null, null, new c((List) objA, null), 3, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(io.bidmachine.analytics.internal.g.b bVar) {
        try {
            Result.Companion companion = Result.f93230c;
            return this.f79916b.a(bVar);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.f93230c;
            return Result.b(kotlin.d.a(th2));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(int r9, kotlin.coroutines.Continuation r10) {
        /*
            r8 = this;
            boolean r0 = r10 instanceof io.bidmachine.analytics.internal.v.b.g
            if (r0 == 0) goto L13
            r0 = r10
            io.bidmachine.analytics.internal.v.b$g r0 = (io.bidmachine.analytics.internal.v.b.g) r0
            int r1 = r0.f79941e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79941e = r1
            goto L18
        L13:
            io.bidmachine.analytics.internal.v.b$g r0 = new io.bidmachine.analytics.internal.v.b$g
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f79939c
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f79941e
            r3 = 0
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L3b
            if (r2 != r5) goto L33
            java.lang.Object r9 = r0.f79938b
            java.lang.Object r0 = r0.f79937a
            io.bidmachine.analytics.internal.v.b r0 = (io.bidmachine.analytics.internal.v.b) r0
            kotlin.d.b(r10)     // Catch: java.lang.Throwable -> L31
            goto L87
        L31:
            r9 = move-exception
            goto L99
        L33:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L3b:
            kotlin.d.b(r10)
            kotlin.Result$Companion r10 = kotlin.Result.f93230c     // Catch: java.lang.Throwable -> L31
            io.bidmachine.analytics.internal.D.a r10 = r8.f79916b     // Catch: java.lang.Throwable -> L31
            io.bidmachine.analytics.internal.v.b$b r2 = r8.f79915a     // Catch: java.lang.Throwable -> L31
            io.bidmachine.analytics.MonitorConfig r2 = r2.b()     // Catch: java.lang.Throwable -> L31
            java.lang.String r2 = r2.getName()     // Catch: java.lang.Throwable -> L31
            io.bidmachine.analytics.internal.v.b$b r6 = r8.f79915a     // Catch: java.lang.Throwable -> L31
            java.lang.String r6 = r6.c()     // Catch: java.lang.Throwable -> L31
            io.bidmachine.analytics.internal.v.b$b r7 = r8.f79915a     // Catch: java.lang.Throwable -> L31
            io.bidmachine.analytics.MonitorConfig r7 = r7.b()     // Catch: java.lang.Throwable -> L31
            int r7 = r7.getBatchSize()     // Catch: java.lang.Throwable -> L31
            java.lang.Object r10 = r10.a(r2, r6, r7)     // Catch: java.lang.Throwable -> L31
            boolean r2 = kotlin.Result.j(r10)     // Catch: java.lang.Throwable -> L31
            if (r2 == 0) goto L85
            r2 = r10
            java.util.List r2 = (java.util.List) r2     // Catch: java.lang.Throwable -> L31
            boolean r6 = r2.isEmpty()     // Catch: java.lang.Throwable -> L31
            if (r6 != 0) goto L82
            int r6 = r2.size()     // Catch: java.lang.Throwable -> L31
            if (r6 < r9) goto L82
            r0.f79937a = r8     // Catch: java.lang.Throwable -> L31
            r0.f79938b = r10     // Catch: java.lang.Throwable -> L31
            r0.f79941e = r5     // Catch: java.lang.Throwable -> L31
            java.lang.Object r9 = r8.a(r2, r0)     // Catch: java.lang.Throwable -> L31
            if (r9 != r1) goto L85
            return r1
        L82:
            a(r8, r4, r5, r3)     // Catch: java.lang.Throwable -> L31
        L85:
            r0 = r8
            r9 = r10
        L87:
            java.lang.Throwable r10 = kotlin.Result.g(r9)     // Catch: java.lang.Throwable -> L31
            if (r10 == 0) goto L90
            a(r0, r4, r5, r3)     // Catch: java.lang.Throwable -> L31
        L90:
            kotlin.Result r9 = kotlin.Result.a(r9)     // Catch: java.lang.Throwable -> L31
            java.lang.Object r9 = kotlin.Result.b(r9)     // Catch: java.lang.Throwable -> L31
            return r9
        L99:
            kotlin.Result$Companion r10 = kotlin.Result.f93230c
            java.lang.Object r9 = kotlin.d.a(r9)
            java.lang.Object r9 = kotlin.Result.b(r9)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.v.b.a(int, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.util.List r12, kotlin.coroutines.Continuation r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof io.bidmachine.analytics.internal.v.b.e
            if (r0 == 0) goto L13
            r0 = r13
            io.bidmachine.analytics.internal.v.b$e r0 = (io.bidmachine.analytics.internal.v.b.e) r0
            int r1 = r0.f79933e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f79933e = r1
            goto L18
        L13:
            io.bidmachine.analytics.internal.v.b$e r0 = new io.bidmachine.analytics.internal.v.b$e
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f79931c
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f79933e
            r3 = 1
            if (r2 == 0) goto L37
            if (r2 != r3) goto L2f
            java.lang.Object r12 = r0.f79930b
            java.lang.Object r0 = r0.f79929a
            io.bidmachine.analytics.internal.v.b r0 = (io.bidmachine.analytics.internal.v.b) r0
            kotlin.d.b(r13)
            goto L94
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            kotlin.d.b(r13)
            io.bidmachine.analytics.internal.D.a r13 = r11.f79916b
            java.lang.Object r13 = r13.a(r12)
            boolean r2 = kotlin.Result.j(r13)
            if (r2 == 0) goto L99
            r2 = r13
            kotlin.Unit r2 = (kotlin.Unit) r2
            io.bidmachine.analytics.internal.v.b$b r2 = r11.f79915a
            io.bidmachine.analytics.MonitorConfig r2 = r2.b()
            int r2 = r2.getBatchSize()
            java.util.List r12 = kotlin.collections.CollectionsKt.chunked(r12, r2)
            java.util.ArrayList r2 = new java.util.ArrayList
            r4 = 10
            int r4 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r12, r4)
            r2.<init>(r4)
            java.util.Iterator r12 = r12.iterator()
        L66:
            boolean r4 = r12.hasNext()
            if (r4 == 0) goto L85
            java.lang.Object r4 = r12.next()
            java.util.List r4 = (java.util.List) r4
            kotlinx.coroutines.CoroutineScope r5 = r11.f79918d
            io.bidmachine.analytics.internal.v.b$f r8 = new io.bidmachine.analytics.internal.v.b$f
            r6 = 0
            r8.<init>(r4, r6)
            r9 = 3
            r10 = 0
            r7 = 0
            kotlinx.coroutines.Deferred r4 = eg.g.b(r5, r6, r7, r8, r9, r10)
            r2.add(r4)
            goto L66
        L85:
            r0.f79929a = r11
            r0.f79930b = r13
            r0.f79933e = r3
            java.lang.Object r12 = eg.d.a(r2, r0)
            if (r12 != r1) goto L92
            return r1
        L92:
            r0 = r11
            r12 = r13
        L94:
            r0.a(r3)
            r13 = r12
            goto L9a
        L99:
            r0 = r11
        L9a:
            java.lang.Throwable r12 = kotlin.Result.g(r13)
            if (r12 == 0) goto La3
            r0.a(r3)
        La3:
            kotlin.Unit r12 = kotlin.Unit.f93236a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: io.bidmachine.analytics.internal.v.b.a(java.util.List, kotlin.coroutines.Continuation):java.lang.Object");
    }

    static /* synthetic */ void a(b bVar, boolean z10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        bVar.a(z10);
    }

    private final void a(boolean z10) {
        Job job;
        if (this.f79920f.get()) {
            return;
        }
        if (z10 || (job = this.f79919e) == null || !job.isActive()) {
            Job job2 = this.f79919e;
            if (job2 != null) {
                Job.a.a(job2, null, 1, null);
            }
            this.f79919e = eg.i.d(this.f79918d, null, null, new d(null), 3, null);
        }
    }
}
