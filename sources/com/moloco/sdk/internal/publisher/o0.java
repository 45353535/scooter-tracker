package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.Init$SDKInitResponse;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.publisher.Initialization;
import com.moloco.sdk.publisher.MediationInfo;
import com.moloco.sdk.publisher.MolocoInitStatus;
import com.moloco.sdk.service_locator.b;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class o0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f55127f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f55128g = 8;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final MolocoInitStatus f55129h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final MolocoInitStatus f55130i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.i f55131a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final MutableStateFlow f55132b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final StateFlow f55133c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Init$SDKInitResponse f55134d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final MutableStateFlow f55135e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final MolocoInitStatus a() {
            return o0.f55129h;
        }

        public final MolocoInitStatus b(String errorMessage) {
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            return new MolocoInitStatus(Initialization.FAILURE, errorMessage);
        }

        public final MolocoInitStatus c() {
            return o0.f55130i;
        }

        public a() {
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f55136r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f55138t;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55136r = obj;
            this.f55138t |= Integer.MIN_VALUE;
            return o0.this.e(this);
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55139r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f55140s;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.internal.e eVar, Continuation continuation) {
            return ((c) create(eVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = new c(continuation);
            cVar.f55140s = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f55139r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(((com.moloco.sdk.internal.e) this.f55140s) != null);
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55141r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f55142s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f55143t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f55144u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public Object f55145v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public long f55146w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f55147x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f55149z;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55147x = obj;
            this.f55149z |= Integer.MIN_VALUE;
            return o0.this.c(null, 0L, null, null, null, this);
        }
    }

    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55150r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f55151s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f55152t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f55153u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f55155w;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55153u = obj;
            this.f55155w |= Integer.MIN_VALUE;
            return o0.this.d(null, null, null, null, this);
        }
    }

    public static final class f extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55156r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public long f55157s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f55158t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a f55159u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ o0 f55160v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ String f55161w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ MediationInfo f55162x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.services.init.m f55163y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.moloco.sdk.acm.recorder.a aVar, o0 o0Var, String str, MediationInfo mediationInfo, com.moloco.sdk.internal.services.init.m mVar, Continuation continuation) {
            super(2, continuation);
            this.f55159u = aVar;
            this.f55160v = o0Var;
            this.f55161w = str;
            this.f55162x = mediationInfo;
            this.f55163y = mVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new f(this.f55159u, this.f55160v, this.f55161w, this.f55162x, this.f55163y, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            com.moloco.sdk.acm.f fVarC;
            long j10;
            Object objG = pf.b.g();
            int i10 = this.f55158t;
            if (i10 == 0) {
                kotlin.d.b(obj);
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "InitializationHandler", "startInitialization switch to Dispatchers.IO", null, false, 12, null);
                fVarC = this.f55159u.c(com.moloco.sdk.internal.client_metrics_data.d.f54183c.g());
                long jA = this.f55160v.l().a();
                com.moloco.sdk.internal.services.init.j jVarC = b.f.f55817a.c();
                String str = this.f55161w;
                MediationInfo mediationInfo = this.f55162x;
                this.f55156r = fVarC;
                this.f55157s = jA;
                this.f55158t = 1;
                obj = jVarC.a(str, mediationInfo, this);
                if (obj != objG) {
                    j10 = jA;
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                com.moloco.sdk.internal.h0 h0Var = (com.moloco.sdk.internal.h0) this.f55156r;
                kotlin.d.b(obj);
                return h0Var;
            }
            j10 = this.f55157s;
            fVarC = (com.moloco.sdk.acm.f) this.f55156r;
            kotlin.d.b(obj);
            com.moloco.sdk.acm.f fVar = fVarC;
            com.moloco.sdk.internal.h0 h0Var2 = (com.moloco.sdk.internal.h0) obj;
            long jA2 = this.f55160v.l().a() - j10;
            o0 o0Var = this.f55160v;
            com.moloco.sdk.internal.services.init.m mVar = this.f55163y;
            com.moloco.sdk.acm.recorder.a aVar = this.f55159u;
            this.f55156r = h0Var2;
            this.f55158t = 2;
            return o0Var.c(h0Var2, jA2, mVar, aVar, fVar, this) == objG ? objG : h0Var2;
        }
    }

    static {
        Initialization initialization = Initialization.SUCCESS;
        f55129h = new MolocoInitStatus(initialization, "Already Initialized");
        f55130i = new MolocoInitStatus(initialization, "Initialized");
    }

    public o0(com.moloco.sdk.internal.services.i timeProviderService) {
        Intrinsics.checkNotNullParameter(timeProviderService, "timeProviderService");
        this.f55131a = timeProviderService;
        MutableStateFlow mutableStateFlowA = hg.l0.a(null);
        this.f55132b = mutableStateFlowA;
        this.f55133c = hg.i.c(mutableStateFlowA);
        this.f55135e = hg.l0.a(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:51:0x0255, code lost:
    
        if (r2.emit(r1, r8) != r9) goto L53;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(com.moloco.sdk.internal.h0 r24, long r25, com.moloco.sdk.internal.services.init.m r27, com.moloco.sdk.acm.recorder.a r28, com.moloco.sdk.acm.f r29, kotlin.coroutines.Continuation r30) {
        /*
            Method dump skipped, instruction units count: 609
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.o0.c(com.moloco.sdk.internal.h0, long, com.moloco.sdk.internal.services.init.m, com.moloco.sdk.acm.recorder.a, com.moloco.sdk.acm.f, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x00d7, code lost:
    
        if (r1.emit(r3, r5) == r6) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object d(java.lang.String r17, com.moloco.sdk.publisher.MediationInfo r18, com.moloco.sdk.internal.services.init.m r19, com.moloco.sdk.acm.recorder.a r20, kotlin.coroutines.Continuation r21) {
        /*
            Method dump skipped, instruction units count: 241
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.o0.d(java.lang.String, com.moloco.sdk.publisher.MediationInfo, com.moloco.sdk.internal.services.init.m, com.moloco.sdk.acm.recorder.a, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(kotlin.coroutines.Continuation r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof com.moloco.sdk.internal.publisher.o0.b
            if (r0 == 0) goto L13
            r0 = r12
            com.moloco.sdk.internal.publisher.o0$b r0 = (com.moloco.sdk.internal.publisher.o0.b) r0
            int r1 = r0.f55138t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55138t = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.o0$b r0 = new com.moloco.sdk.internal.publisher.o0$b
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f55136r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f55138t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r12)
            goto L53
        L29:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L31:
            kotlin.d.b(r12)
            com.moloco.sdk.internal.MolocoLogger r4 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r9 = 12
            r10 = 0
            java.lang.String r5 = "InitializationHandler"
            java.lang.String r6 = "Moloco SDK awaiting init to receive AdFactory"
            r7 = 0
            r8 = 0
            com.moloco.sdk.internal.MolocoLogger.info$default(r4, r5, r6, r7, r8, r9, r10)
            kotlinx.coroutines.flow.MutableStateFlow r12 = r11.f55135e
            com.moloco.sdk.internal.publisher.o0$c r2 = new com.moloco.sdk.internal.publisher.o0$c
            r4 = 0
            r2.<init>(r4)
            r0.f55138t = r3
            java.lang.Object r12 = hg.i.y(r12, r2, r0)
            if (r12 != r1) goto L53
            return r1
        L53:
            java.lang.String r0 = "null cannot be cast to non-null type com.moloco.sdk.internal.AdFactory"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r12, r0)
            com.moloco.sdk.internal.e r12 = (com.moloco.sdk.internal.e) r12
            com.moloco.sdk.internal.MolocoLogger r0 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r5 = 12
            r6 = 0
            java.lang.String r1 = "InitializationHandler"
            java.lang.String r2 = "Moloco SDK init completed, AdFactory received"
            r3 = 0
            r4 = 0
            com.moloco.sdk.internal.MolocoLogger.info$default(r0, r1, r2, r3, r4, r5, r6)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.o0.e(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object g(String str, MediationInfo mediationInfo, com.moloco.sdk.internal.services.init.m mVar, com.moloco.sdk.acm.recorder.a aVar, Continuation continuation) {
        return eg.g.g(com.moloco.sdk.internal.scheduling.c.a().getIo(), new f(aVar, this, str, mediationInfo, mVar, null), continuation);
    }

    public final Object h(Continuation continuation) {
        this.f55134d = null;
        this.f55135e.setValue(null);
        this.f55132b.setValue(null);
        Object objA = b.f.f55817a.c().a(continuation);
        return objA == pf.b.g() ? objA : Unit.f93236a;
    }

    public final boolean i() {
        return m();
    }

    public final StateFlow j() {
        return this.f55133c;
    }

    public final Init$SDKInitResponse k() {
        return this.f55134d;
    }

    public final com.moloco.sdk.internal.services.i l() {
        return this.f55131a;
    }

    public final boolean m() {
        try {
            b.i.f55834a.c();
            return true;
        } catch (IllegalStateException unused) {
            return false;
        }
    }
}
