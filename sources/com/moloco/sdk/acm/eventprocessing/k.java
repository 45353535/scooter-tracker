package com.moloco.sdk.acm.eventprocessing;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes10.dex */
public final class k implements i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.acm.eventprocessing.b f54034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.acm.h f54035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ScheduledExecutorService f54036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final CoroutineScope f54037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ScheduledFuture f54038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Mutex f54039f;

    public static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f54040r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f54041s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f54042t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f54044v;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f54042t = obj;
            this.f54044v |= Integer.MIN_VALUE;
            return k.this.a(this);
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54045r;

        public b(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return k.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f54045r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            k.this.f54034a.a();
            return Unit.f93236a;
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f54047r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f54048s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f54049t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f54051v;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f54049t = obj;
            this.f54051v |= Integer.MIN_VALUE;
            return k.this.b(this);
        }
    }

    public k(com.moloco.sdk.acm.eventprocessing.b dbWorkRequest, com.moloco.sdk.acm.h opsConfig, ScheduledExecutorService scheduler, CoroutineScope coroutineScope) {
        Intrinsics.checkNotNullParameter(dbWorkRequest, "dbWorkRequest");
        Intrinsics.checkNotNullParameter(opsConfig, "opsConfig");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        this.f54034a = dbWorkRequest;
        this.f54035b = opsConfig;
        this.f54036c = scheduler;
        this.f54037d = coroutineScope;
        this.f54039f = ng.f.b(false, 1, null);
    }

    public static final void d(k kVar) {
        eg.i.d(kVar.f54037d, null, null, kVar.new b(null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.acm.eventprocessing.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object b(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.moloco.sdk.acm.eventprocessing.k.c
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.acm.eventprocessing.k$c r0 = (com.moloco.sdk.acm.eventprocessing.k.c) r0
            int r1 = r0.f54051v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54051v = r1
            goto L18
        L13:
            com.moloco.sdk.acm.eventprocessing.k$c r0 = new com.moloco.sdk.acm.eventprocessing.k$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f54049t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f54051v
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.f54048s
            kotlinx.coroutines.sync.Mutex r1 = (kotlinx.coroutines.sync.Mutex) r1
            java.lang.Object r0 = r0.f54047r
            com.moloco.sdk.acm.eventprocessing.k r0 = (com.moloco.sdk.acm.eventprocessing.k) r0
            kotlin.d.b(r6)
            goto L4e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            kotlin.d.b(r6)
            kotlinx.coroutines.sync.Mutex r6 = r5.f54039f
            r0.f54047r = r5
            r0.f54048s = r6
            r0.f54051v = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
            r1 = r6
        L4e:
            r0.c()     // Catch: java.lang.Throwable -> L57
            kotlin.Unit r6 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L57
            r1.unlock(r4)
            return r6
        L57:
            r6 = move-exception
            r1.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.eventprocessing.k.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void c() {
        ScheduledFuture scheduledFuture = this.f54038e;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            this.f54038e = this.f54036c.scheduleWithFixedDelay(new Runnable() { // from class: com.moloco.sdk.acm.eventprocessing.j
                @Override // java.lang.Runnable
                public final void run() {
                    k.d(this.f54033b);
                }
            }, this.f54035b.e(), this.f54035b.e(), TimeUnit.SECONDS);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // com.moloco.sdk.acm.eventprocessing.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object a(kotlin.coroutines.Continuation r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.moloco.sdk.acm.eventprocessing.k.a
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.acm.eventprocessing.k$a r0 = (com.moloco.sdk.acm.eventprocessing.k.a) r0
            int r1 = r0.f54044v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54044v = r1
            goto L18
        L13:
            com.moloco.sdk.acm.eventprocessing.k$a r0 = new com.moloco.sdk.acm.eventprocessing.k$a
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f54042t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f54044v
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.f54041s
            kotlinx.coroutines.sync.Mutex r1 = (kotlinx.coroutines.sync.Mutex) r1
            java.lang.Object r0 = r0.f54040r
            com.moloco.sdk.acm.eventprocessing.k r0 = (com.moloco.sdk.acm.eventprocessing.k) r0
            kotlin.d.b(r6)
            goto L4e
        L32:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L3a:
            kotlin.d.b(r6)
            kotlinx.coroutines.sync.Mutex r6 = r5.f54039f
            r0.f54040r = r5
            r0.f54041s = r6
            r0.f54044v = r3
            java.lang.Object r0 = r6.lock(r4, r0)
            if (r0 != r1) goto L4c
            return r1
        L4c:
            r0 = r5
            r1 = r6
        L4e:
            java.util.concurrent.ScheduledFuture r6 = r0.f54038e     // Catch: java.lang.Throwable -> L5b
            if (r6 == 0) goto L5d
            r2 = 0
            boolean r6 = r6.cancel(r2)     // Catch: java.lang.Throwable -> L5b
            kotlin.coroutines.jvm.internal.b.a(r6)     // Catch: java.lang.Throwable -> L5b
            goto L5d
        L5b:
            r6 = move-exception
            goto L66
        L5d:
            r0.c()     // Catch: java.lang.Throwable -> L5b
            kotlin.Unit r6 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L5b
            r1.unlock(r4)
            return r6
        L66:
            r1.unlock(r4)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.eventprocessing.k.a(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public /* synthetic */ k(com.moloco.sdk.acm.eventprocessing.b bVar, com.moloco.sdk.acm.h hVar, ScheduledExecutorService scheduledExecutorService, CoroutineScope coroutineScope, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bVar, hVar, (i10 & 4) != 0 ? Executors.newSingleThreadScheduledExecutor() : scheduledExecutorService, coroutineScope);
    }
}
