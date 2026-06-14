package f1;

import f1.nf;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes6.dex */
public final class l5 implements nf.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e6 f70299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final nf f70300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineDispatcher f70301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f70302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f70303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ConcurrentLinkedQueue f70304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ConcurrentHashMap.KeySetView f70305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Mutex f70306h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Job f70307i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CoroutineScope f70308j;

    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f70309r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f70310s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f70311t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f70312u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f70313v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f70314w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f70316y;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f70314w = obj;
            this.f70316y |= Integer.MIN_VALUE;
            return l5.this.e(null, this);
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f70317r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f70318s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f70319t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f70321v;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f70319t = obj;
            this.f70321v |= Integer.MIN_VALUE;
            return l5.this.g(this);
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f70322r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f70323s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f70324t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f70325u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f70326v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public /* synthetic */ Object f70327w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f70329y;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f70327w = obj;
            this.f70329y |= Integer.MIN_VALUE;
            return l5.this.f(null, null, this);
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f70330r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f70331s;

        public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f70333r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ l5 f70334s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(l5 l5Var, Continuation continuation) {
                super(2, continuation);
                this.f70334s = l5Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f70334s, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f70333r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    l5 l5Var = this.f70334s;
                    this.f70333r = 1;
                    if (l5Var.g(this) == objG) {
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

        public d(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = l5.this.new d(continuation);
            dVar.f70331s = obj;
            return dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f70330r;
            try {
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.f70331s;
                    if (!Mutex.a.b(l5.this.f70306h, null, 1, null)) {
                        eg.e("Already running, skipping new trigger.", null, 2, null);
                        return Unit.f93236a;
                    }
                    if (!l5.this.f70300b.e()) {
                        eg.e("Offline, skipping.", null, 2, null);
                        Unit unit = Unit.f93236a;
                        eg.e("Releasing lock.", null, 2, null);
                        Mutex.a.c(l5.this.f70306h, null, 1, null);
                        return unit;
                    }
                    eg.e("Acquired lock, starting job.", null, 2, null);
                    l5 l5Var = l5.this;
                    l5Var.f70307i = eg.i.d(coroutineScope, null, null, new a(l5Var, null), 3, null);
                    Job job = l5.this.f70307i;
                    if (job != null) {
                        this.f70330r = 1;
                        if (job.i0(this) == objG) {
                            return objG;
                        }
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                }
                eg.e("Job finished.", null, 2, null);
                eg.e("Releasing lock.", null, 2, null);
                Mutex.a.c(l5.this.f70306h, null, 1, null);
                return Unit.f93236a;
            } catch (Throwable th2) {
                eg.e("Releasing lock.", null, 2, null);
                Mutex.a.c(l5.this.f70306h, null, 1, null);
                throw th2;
            }
        }
    }

    public l5(e6 networkClient, nf networkStateChecker, CoroutineDispatcher dispatcher, long j10, int i10) {
        Intrinsics.checkNotNullParameter(networkClient, "networkClient");
        Intrinsics.checkNotNullParameter(networkStateChecker, "networkStateChecker");
        Intrinsics.checkNotNullParameter(dispatcher, "dispatcher");
        this.f70299a = networkClient;
        this.f70300b = networkStateChecker;
        this.f70301c = dispatcher;
        this.f70302d = j10;
        this.f70303e = i10;
        this.f70304f = new ConcurrentLinkedQueue();
        this.f70305g = ConcurrentHashMap.newKeySet();
        this.f70306h = ng.f.b(false, 1, null);
        this.f70308j = kotlinx.coroutines.i.a(dispatcher.plus(kotlinx.coroutines.a0.b(null, 1, null)));
        networkStateChecker.b(this);
    }

    @Override // f1.nf.a
    public void b() {
        eg.e("Network is lost. Will wait for onNetworkAvailable().", null, 2, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x019e, code lost:
    
        if (eg.k0.a(r14, r2) == r3) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x014a -> B:38:0x01a1). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x019e -> B:38:0x01a1). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(f1.fd r19, kotlin.coroutines.Continuation r20) {
        /*
            Method dump skipped, instruction units count: 479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.l5.e(f1.fd, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0089 -> B:21:0x008c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object f(java.util.List r12, f1.t4 r13, kotlin.coroutines.Continuation r14) {
        /*
            r11 = this;
            boolean r0 = r14 instanceof f1.l5.c
            if (r0 == 0) goto L13
            r0 = r14
            f1.l5$c r0 = (f1.l5.c) r0
            int r1 = r0.f70329y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f70329y = r1
            goto L18
        L13:
            f1.l5$c r0 = new f1.l5$c
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f70327w
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f70329y
            r3 = 1
            if (r2 == 0) goto L47
            if (r2 != r3) goto L3f
            java.lang.Object r12 = r0.f70326v
            f1.de r12 = (f1.de) r12
            java.lang.Object r13 = r0.f70325u
            java.util.Iterator r13 = (java.util.Iterator) r13
            java.lang.Object r2 = r0.f70324t
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r4 = r0.f70323s
            f1.t4 r4 = (f1.t4) r4
            java.lang.Object r5 = r0.f70322r
            f1.l5 r5 = (f1.l5) r5
            kotlin.d.b(r14)
            r10 = r0
            r8 = r4
            goto L8c
        L3f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L47:
            kotlin.d.b(r14)
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            java.util.Iterator r12 = r12.iterator()
            r8 = r13
            r2 = r14
            r10 = r0
            r13 = r12
            r12 = r11
        L58:
            boolean r14 = r13.hasNext()
            if (r14 == 0) goto L99
            java.lang.Object r14 = r13.next()
            f1.de r14 = (f1.de) r14
            f1.e6 r4 = r12.f70299a
            java.lang.String r5 = r14.d()
            java.lang.String r6 = r14.c()
            java.lang.String r7 = r14.a()
            java.lang.String r9 = r14.b()
            r10.f70322r = r12
            r10.f70323s = r8
            r10.f70324t = r2
            r10.f70325u = r13
            r10.f70326v = r14
            r10.f70329y = r3
            java.lang.Object r0 = r4.a(r5, r6, r7, r8, r9, r10)
            if (r0 != r1) goto L89
            return r1
        L89:
            r5 = r12
            r12 = r14
            r14 = r0
        L8c:
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 != 0) goto L97
            r2.add(r12)
        L97:
            r12 = r5
            goto L58
        L99:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.l5.f(java.util.List, f1.t4, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x007d -> B:24:0x0080). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(kotlin.coroutines.Continuation r9) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.l5.g(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void h(t4 eventData, List trackers) {
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        Intrinsics.checkNotNullParameter(trackers, "trackers");
        eg.e("Received eventId=" + eventData.a() + " (type=" + eventData.getClass().getSimpleName() + ") with " + trackers.size() + " trackers.", null, 2, null);
        if (trackers.isEmpty()) {
            eg.e("No trackers configured for eventId=" + eventData.a() + "; skipping.", null, 2, null);
            return;
        }
        synchronized (this) {
            try {
                if (this.f70305g.add(eventData.a())) {
                    this.f70304f.offer(new fd(eventData, trackers));
                    eg.e("Enqueued eventId=" + eventData.a() + ", queue size=" + this.f70304f.size(), null, 2, null);
                    l();
                } else {
                    eg.e("EventId=" + eventData.a() + " has already been submitted; skipping duplicate.", null, 2, null);
                }
                Unit unit = Unit.f93236a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void l() {
        eg.i.d(this.f70308j, null, null, new d(null), 3, null);
    }

    @Override // f1.nf.a
    public void a() {
        eg.e("Network is available. Attempting to process queue.", null, 2, null);
        l();
    }

    public /* synthetic */ l5(e6 e6Var, nf nfVar, CoroutineDispatcher coroutineDispatcher, long j10, int i10, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(e6Var, nfVar, (i11 & 4) != 0 ? eg.o0.b() : coroutineDispatcher, (i11 & 8) != 0 ? 500L : j10, (i11 & 16) != 0 ? 3 : i10);
    }
}
