package com.moloco.sdk.acm;

import eg.m1;
import eg.o0;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes10.dex */
public final class a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static com.moloco.sdk.acm.eventprocessing.f f53925b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static com.moloco.sdk.acm.services.c f53926c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static h f53927d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static g f53928e;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static com.moloco.sdk.acm.eventprocessing.i f53934k;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f53924a = new a();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final Mutex f53929f = ng.f.b(false, 1, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final CoroutineScope f53930g = kotlinx.coroutines.i.a(o0.b().plus(m1.b(null, 1, null)));

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final AtomicReference f53931h = new AtomicReference(k.f54089d);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final CopyOnWriteArrayList f53932i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final CopyOnWriteArrayList f53933j = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: com.moloco.sdk.acm.a$a, reason: collision with other inner class name */
    public static final class C0653a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f53935r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f53936s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.e f53937t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0653a(com.moloco.sdk.acm.e eVar, com.moloco.sdk.acm.b bVar, Continuation continuation) {
            super(2, continuation);
            this.f53937t = eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((C0653a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new C0653a(this.f53937t, null, continuation);
        }

        /* JADX WARN: Code restructure failed: missing block: B:34:0x00e8, code lost:
        
            if (r3.y(r13, r12) == r0) goto L35;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v11, types: [kotlinx.coroutines.sync.Mutex] */
        /* JADX WARN: Type inference failed for: r1v12 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v20 */
        /* JADX WARN: Type inference failed for: r1v3, types: [kotlinx.coroutines.sync.Mutex] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 298
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.a.C0653a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f53938r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f53939s;

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
            return new b(continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = pf.b.g()
                int r1 = r7.f53939s
                r2 = 0
                java.lang.String r3 = "eventProcessor"
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L29
                if (r1 == r5) goto L21
                if (r1 != r4) goto L19
                java.lang.Object r1 = r7.f53938r
                java.util.Iterator r1 = (java.util.Iterator) r1
                kotlin.d.b(r8)
                goto L60
            L19:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L21:
                java.lang.Object r1 = r7.f53938r
                java.util.Iterator r1 = (java.util.Iterator) r1
                kotlin.d.b(r8)
                goto L34
            L29:
                kotlin.d.b(r8)
                java.util.concurrent.CopyOnWriteArrayList r8 = com.moloco.sdk.acm.a.g()
                java.util.Iterator r1 = r8.iterator()
            L34:
                boolean r8 = r1.hasNext()
                if (r8 == 0) goto L58
                java.lang.Object r8 = r1.next()
                com.moloco.sdk.acm.f r8 = (com.moloco.sdk.acm.f) r8
                com.moloco.sdk.acm.eventprocessing.f r6 = com.moloco.sdk.acm.a.c()
                if (r6 != 0) goto L4a
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
                r6 = r2
            L4a:
                kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
                r7.f53938r = r1
                r7.f53939s = r5
                java.lang.Object r8 = r6.a(r8, r7)
                if (r8 != r0) goto L34
                goto L83
            L58:
                java.util.concurrent.CopyOnWriteArrayList r8 = com.moloco.sdk.acm.a.f()
                java.util.Iterator r1 = r8.iterator()
            L60:
                boolean r8 = r1.hasNext()
                if (r8 == 0) goto L84
                java.lang.Object r8 = r1.next()
                com.moloco.sdk.acm.c r8 = (com.moloco.sdk.acm.c) r8
                com.moloco.sdk.acm.eventprocessing.f r5 = com.moloco.sdk.acm.a.c()
                if (r5 != 0) goto L76
                kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r3)
                r5 = r2
            L76:
                kotlin.jvm.internal.Intrinsics.checkNotNull(r8)
                r7.f53938r = r1
                r7.f53939s = r4
                java.lang.Object r8 = r5.b(r8, r7)
                if (r8 != r0) goto L60
            L83:
                return r0
            L84:
                java.util.concurrent.CopyOnWriteArrayList r8 = com.moloco.sdk.acm.a.g()
                r8.clear()
                java.util.concurrent.CopyOnWriteArrayList r8 = com.moloco.sdk.acm.a.f()
                r8.clear()
                kotlin.Unit r8 = kotlin.Unit.f93236a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.a.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f53940r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.c f53941s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(com.moloco.sdk.acm.c cVar, Continuation continuation) {
            super(2, continuation);
            this.f53941s = cVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new c(this.f53941s, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f53940r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                com.moloco.sdk.acm.eventprocessing.f fVar = a.f53925b;
                if (fVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventProcessor");
                    fVar = null;
                }
                com.moloco.sdk.acm.c cVar = this.f53941s;
                this.f53940r = 1;
                if (fVar.b(cVar, this) == objG) {
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

    public static final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f53942r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ f f53943s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(f fVar, Continuation continuation) {
            super(2, continuation);
            this.f53943s = fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.f53943s, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f53942r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                com.moloco.sdk.acm.eventprocessing.f fVar = a.f53925b;
                if (fVar == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("eventProcessor");
                    fVar = null;
                }
                f fVar2 = this.f53943s;
                this.f53942r = 1;
                if (fVar.a(fVar2, this) == objG) {
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

    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f53944r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f53945s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f53946t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f53948v;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f53946t = obj;
            this.f53948v |= Integer.MIN_VALUE;
            return a.this.x(null, this);
        }
    }

    private a() {
    }

    public static /* synthetic */ void r(a aVar, com.moloco.sdk.acm.e eVar, com.moloco.sdk.acm.b bVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            bVar = null;
        }
        aVar.q(eVar, bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s() {
        eg.i.d(f53930g, null, null, new b(null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object y(g gVar, Continuation continuation) {
        String strA = gVar.a();
        if (strA != null) {
            f53924a.p().b(strA);
        }
        Long lB = gVar.b();
        if (lB != null) {
            f53924a.p().a(lB.longValue());
        }
        com.moloco.sdk.acm.eventprocessing.i iVar = f53934k;
        if (iVar == null) {
            Intrinsics.throwUninitializedPropertyAccessException("requestScheduler");
            iVar = null;
        }
        Object objA = iVar.a(continuation);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }

    public final h p() {
        h hVar = f53927d;
        if (hVar != null) {
            return hVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("opsConfig");
        return null;
    }

    public final void q(com.moloco.sdk.acm.e config, com.moloco.sdk.acm.b bVar) {
        Intrinsics.checkNotNullParameter(config, "config");
        com.moloco.sdk.acm.services.d.m(com.moloco.sdk.acm.services.d.f54105a, "AndroidClientMetrics", "ACM initialize", false, 4, null);
        if (androidx.compose.animation.core.c.a(f53931h, k.f54089d, k.f54088c)) {
            v(j.a(config));
            eg.i.d(f53930g, null, null, new C0653a(config, bVar, null), 3, null);
        }
    }

    public final void t(com.moloco.sdk.acm.c event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (f53931h.get() == k.f54087b) {
            eg.i.d(f53930g, null, null, new c(event, null), 3, null);
        } else {
            f53933j.add(event);
            com.moloco.sdk.acm.services.d.f(com.moloco.sdk.acm.services.d.f54105a, "AndroidClientMetrics", "Moloco Client Metrics not initialized", false, 4, null);
        }
    }

    public final void u(f event) {
        Intrinsics.checkNotNullParameter(event, "event");
        event.e();
        if (f53931h.get() == k.f54087b) {
            eg.i.d(f53930g, null, null, new d(event, null), 3, null);
        } else {
            f53932i.add(event);
            com.moloco.sdk.acm.services.d.f(com.moloco.sdk.acm.services.d.f54105a, "AndroidClientMetrics", "Moloco Client Metrics not initialized", false, 4, null);
        }
    }

    public final void v(h hVar) {
        Intrinsics.checkNotNullParameter(hVar, "<set-?>");
        f53927d = hVar;
    }

    public final f w(String eventName) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        if (f53931h.get() != k.f54087b) {
            com.moloco.sdk.acm.services.d.f(com.moloco.sdk.acm.services.d.f54105a, "AndroidClientMetrics", "Moloco Client Metrics not initialized", false, 4, null);
        }
        f fVarA = f.Companion.a(eventName);
        fVarA.d();
        return fVarA;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006a, code lost:
    
        if (r15.lock(null, r0) == r1) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008d, code lost:
    
        if (y(r14, r0) == r1) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object x(com.moloco.sdk.acm.g r14, kotlin.coroutines.Continuation r15) {
        /*
            r13 = this;
            boolean r0 = r15 instanceof com.moloco.sdk.acm.a.e
            if (r0 == 0) goto L13
            r0 = r15
            com.moloco.sdk.acm.a$e r0 = (com.moloco.sdk.acm.a.e) r0
            int r1 = r0.f53948v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f53948v = r1
            goto L18
        L13:
            com.moloco.sdk.acm.a$e r0 = new com.moloco.sdk.acm.a$e
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f53946t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f53948v
            r3 = 2
            r4 = 1
            r5 = 0
            if (r2 == 0) goto L43
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            kotlin.d.b(r15)
            goto L90
        L2d:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            java.lang.String r15 = "call to 'resume' before 'invoke' with coroutine"
            r14.<init>(r15)
            throw r14
        L35:
            java.lang.Object r14 = r0.f53945s
            kotlinx.coroutines.sync.Mutex r14 = (kotlinx.coroutines.sync.Mutex) r14
            java.lang.Object r0 = r0.f53944r
            com.moloco.sdk.acm.g r0 = (com.moloco.sdk.acm.g) r0
            kotlin.d.b(r15)
            r15 = r14
            r14 = r0
            goto L6d
        L43:
            kotlin.d.b(r15)
            java.util.concurrent.atomic.AtomicReference r15 = com.moloco.sdk.acm.a.f53931h
            java.lang.Object r15 = r15.get()
            com.moloco.sdk.acm.k r2 = com.moloco.sdk.acm.k.f54087b
            if (r15 == r2) goto L7b
            com.moloco.sdk.acm.services.d r6 = com.moloco.sdk.acm.services.d.f54105a
            r11 = 12
            r12 = 0
            java.lang.String r7 = "AndroidClientMetrics"
            java.lang.String r8 = "ACM updateConfig called when the SDK was not initialized. Initialize the SDK first."
            r9 = 0
            r10 = 0
            com.moloco.sdk.acm.services.d.l(r6, r7, r8, r9, r10, r11, r12)
            kotlinx.coroutines.sync.Mutex r15 = com.moloco.sdk.acm.a.f53929f
            r0.f53944r = r14
            r0.f53945s = r15
            r0.f53948v = r4
            java.lang.Object r0 = r15.lock(r5, r0)
            if (r0 != r1) goto L6d
            goto L8f
        L6d:
            com.moloco.sdk.acm.a.f53928e = r14     // Catch: java.lang.Throwable -> L75
            kotlin.Unit r14 = kotlin.Unit.f93236a     // Catch: java.lang.Throwable -> L75
            r15.unlock(r5)
            return r14
        L75:
            r0 = move-exception
            r14 = r0
            r15.unlock(r5)
            throw r14
        L7b:
            com.moloco.sdk.acm.services.d r6 = com.moloco.sdk.acm.services.d.f54105a
            r10 = 4
            r11 = 0
            java.lang.String r7 = "AndroidClientMetrics"
            java.lang.String r8 = "ACM update called. ACM initialized already, proceeding with update"
            r9 = 0
            com.moloco.sdk.acm.services.d.m(r6, r7, r8, r9, r10, r11)
            r0.f53948v = r3
            java.lang.Object r14 = r13.y(r14, r0)
            if (r14 != r1) goto L90
        L8f:
            return r1
        L90:
            kotlin.Unit r14 = kotlin.Unit.f93236a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.acm.a.x(com.moloco.sdk.acm.g, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
