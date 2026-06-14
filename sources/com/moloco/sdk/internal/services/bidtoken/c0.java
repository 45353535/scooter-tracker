package com.moloco.sdk.internal.services.bidtoken;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.h0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.sync.Mutex;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 implements b0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.bidtoken.d f55294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final CoroutineScope f55295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y f55296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f55297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f55298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Mutex f55299g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Job f55300h;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function1 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55301r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a f55303t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.acm.recorder.a aVar, Continuation continuation) {
            super(1, continuation);
            this.f55303t = aVar;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((a) create(continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Continuation continuation) {
            return c0.this.new a(this.f55303t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f55301r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                c0.this.h("[Thread: " + Thread.currentThread().getName() + "] Acquired lock, fetching status of current token");
                y yVar = c0.this.f55296d;
                this.f55301r = 1;
                obj = yVar.a(this);
                if (obj != objG) {
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            com.moloco.sdk.internal.services.bidtoken.c cVar = (com.moloco.sdk.internal.services.bidtoken.c) obj;
            c0.this.f("[Thread: " + Thread.currentThread().getName() + "] bidToken status: " + cVar);
            if (!cVar.g()) {
                c0.this.h("[Thread: " + Thread.currentThread().getName() + "] bidToken needs refresh, fetching new token");
                c0 c0Var = c0.this;
                com.moloco.sdk.acm.recorder.a aVar = this.f55303t;
                n nVarC = h.c();
                this.f55301r = 2;
                Object objC = c0Var.c(aVar, nVarC, false, false, this);
                return objC == objG ? objG : objC;
            }
            com.moloco.sdk.acm.recorder.a aVar2 = this.f55303t;
            com.moloco.sdk.acm.c cVarE = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.f54170x.g()).e(com.moloco.sdk.internal.client_metrics_data.c.f54176e.g(), "true").e("initial_fetch", "false");
            com.moloco.sdk.internal.services.bidtoken.c cVar2 = com.moloco.sdk.internal.services.bidtoken.c.f55290c;
            aVar2.b(cVarE.e("expiring", cVar != cVar2 ? "false" : "true"));
            n nVarA = c0.this.f55296d.a();
            if (cVar != cVar2) {
                c0.this.f("[Thread: " + Thread.currentThread().getName() + "] bidToken doesn't need refresh, returning cached");
                return nVarA;
            }
            c0.this.f("[Thread: " + Thread.currentThread().getName() + "] bidToken is expiring, returning cached, and refreshing async");
            c0.this.d(this.f55303t);
            return nVarA;
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55304r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f55305s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f55306t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public Object f55307u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public boolean f55308v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public boolean f55309w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f55310x;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public int f55312z;

        public b(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55310x = obj;
            this.f55312z |= Integer.MIN_VALUE;
            return c0.this.c(null, null, false, false, this);
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.k implements Function1 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55313r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ h0 f55315t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(h0 h0Var, Continuation continuation) {
            super(1, continuation);
            this.f55315t = h0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Continuation continuation) {
            return ((c) create(continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Continuation continuation) {
            return c0.this.new c(this.f55315t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f55313r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                y yVar = c0.this.f55296d;
                n nVar = (n) ((h0.b) this.f55315t).a();
                this.f55313r = 1;
                if (yVar.a(nVar, this) == objG) {
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
        public int f55316r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.recorder.a f55318t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(com.moloco.sdk.acm.recorder.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f55318t = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return c0.this.new d(this.f55318t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            d dVar;
            Object objG = pf.b.g();
            int i10 = this.f55316r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                c0.this.h("[Thread: " + Thread.currentThread().getName() + "] Fetching token from server");
                c0 c0Var = c0.this;
                com.moloco.sdk.acm.recorder.a aVar = this.f55318t;
                n nVarC = h.c();
                this.f55316r = 1;
                dVar = this;
                if (c0Var.c(aVar, nVarC, true, true, dVar) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                dVar = this;
            }
            c0.this.h("[Thread: " + Thread.currentThread().getName() + "] Finished fetching token from server");
            return Unit.f93236a;
        }
    }

    public c0(com.moloco.sdk.internal.services.bidtoken.d bidTokenApi, CoroutineScope scope, y tokenCache) {
        Intrinsics.checkNotNullParameter(bidTokenApi, "bidTokenApi");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(tokenCache, "tokenCache");
        this.f55294b = bidTokenApi;
        this.f55295c = scope;
        this.f55296d = tokenCache;
        this.f55297e = "ServerBidTokenServiceImpl";
        this.f55298f = true;
        this.f55299g = ng.f.b(false, 1, null);
    }

    @Override // com.moloco.sdk.internal.services.bidtoken.b0
    public Object a(com.moloco.sdk.acm.recorder.a aVar, Continuation continuation) {
        h("[Thread: " + Thread.currentThread().getName() + "] Fetching bidToken(), acquiring lock");
        return com.moloco.sdk.internal.utils.a.a(this.f55299g, new a(aVar, null), continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0019  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(com.moloco.sdk.acm.recorder.a r20, com.moloco.sdk.internal.services.bidtoken.n r21, boolean r22, boolean r23, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.bidtoken.c0.c(com.moloco.sdk.acm.recorder.a, com.moloco.sdk.internal.services.bidtoken.n, boolean, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void d(com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        h("[Thread: " + Thread.currentThread().getName() + "] Refreshing token async");
        com.moloco.sdk.acm.c cVar = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.f54172z.g());
        Job job = this.f55300h;
        metricsRecorder.b(cVar.e("async", String.valueOf(job != null ? job.isActive() : false)));
        Job job2 = this.f55300h;
        if (job2 != null && job2.isActive()) {
            h("[Thread: " + Thread.currentThread().getName() + "] Async refresh already in progress. Returning");
            return;
        }
        h("[Thread: " + Thread.currentThread().getName() + "] Scheduling to fetch token from server");
        this.f55300h = eg.i.d(this.f55295c, null, null, new d(metricsRecorder, null), 3, null);
    }

    public final void f(String str) {
        MolocoLogger.debugBuildLog$default(MolocoLogger.INSTANCE, this.f55297e, "[Thread: " + Thread.currentThread().getName() + "] " + str, false, 4, null);
    }

    public final void h(String str) {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, this.f55297e, "[Thread: " + Thread.currentThread().getName() + "][sbt] " + str, null, false, 12, null);
    }
}
