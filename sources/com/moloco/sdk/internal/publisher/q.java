package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.ortb.model.A;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import com.moloco.sdk.publisher.MolocoAd;
import com.moloco.sdk.publisher.MolocoAdError;
import com.moloco.sdk.publisher.MolocoAdErrorKt;
import com.moloco.sdk.publisher.MolocoAdKt;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* JADX INFO: loaded from: classes10.dex */
public final class q implements AdLoad {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final a f55169p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f55170q = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Function1 f55171b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f55172c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Function1 f55173d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.internal.ortb.a f55174e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g0 f55175f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AdFormatType f55176g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.k f55177h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.a f55178i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CoroutineScope f55179j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f55180k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f55181l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.moloco.sdk.internal.ortb.model.g f55182m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.moloco.sdk.acm.f f55183n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Job f55184o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55185r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f55187t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ AdLoad.Listener f55188u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ long f55189v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, AdLoad.Listener listener, long j10, Continuation continuation) {
            super(2, continuation);
            this.f55187t = str;
            this.f55188u = listener;
            this.f55189v = j10;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return q.this.new b(this.f55187t, this.f55188u, this.f55189v, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            com.moloco.sdk.internal.ortb.model.f ext;
            com.moloco.sdk.internal.ortb.model.f ext2;
            Object objG = pf.b.g();
            int i10 = this.f55185r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                q qVar = q.this;
                String str = this.f55187t;
                this.f55185r = 1;
                obj = qVar.e(str, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            String str2 = (String) obj;
            if (str2 == null) {
                MolocoLogger.warn$default(MolocoLogger.INSTANCE, "AdLoadImpl", "Could not pre-process the bid response. Failing the load() call.", null, false, 12, null);
                AdLoad.Listener listener = this.f55188u;
                if (listener != null) {
                    listener.onAdLoadFailed(MolocoAdErrorKt.createAdErrorInfo(q.this.f55172c, MolocoAdError.ErrorType.AD_BID_PARSE_ERROR));
                }
                com.moloco.sdk.acm.recorder.a aVar = q.this.f55178i;
                com.moloco.sdk.acm.f fVarF = q.this.f55183n.f(com.moloco.sdk.internal.client_metrics_data.c.f54176e.g(), "failure");
                com.moloco.sdk.internal.client_metrics_data.c cVar = com.moloco.sdk.internal.client_metrics_data.c.f54174c;
                String strG = cVar.g();
                MolocoAdError.ErrorType errorType = MolocoAdError.ErrorType.AD_BID_PARSE_ERROR;
                com.moloco.sdk.acm.f fVarF2 = fVarF.f(strG, String.valueOf(errorType.getErrorCode()));
                com.moloco.sdk.internal.client_metrics_data.c cVar2 = com.moloco.sdk.internal.client_metrics_data.c.f54175d;
                String strG2 = cVar2.g();
                String strName = q.this.f55176g.name();
                Locale locale = Locale.ROOT;
                String lowerCase = strName.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
                aVar.a(fVarF2.f(strG2, lowerCase));
                com.moloco.sdk.acm.recorder.a aVar2 = q.this.f55178i;
                com.moloco.sdk.acm.c cVarE = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.f54161o.g()).e(cVar.g(), String.valueOf(errorType.getErrorCode()));
                String strG3 = cVar2.g();
                String lowerCase2 = q.this.f55176g.name().toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
                aVar2.b(cVarE.e(strG3, lowerCase2));
                return Unit.f93236a;
            }
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            MolocoLogger.info$default(molocoLogger, "AdLoad", "Processed the bidResponse, proceeding with the load() call.", null, false, 12, null);
            r0 r0VarA = t.a(this.f55188u, q.this.f55183n, q.this.f55176g, q.this.f55178i);
            if (Intrinsics.areEqual(q.this.f55181l, str2)) {
                if (q.this.isLoaded()) {
                    com.moloco.sdk.internal.ortb.model.z sdkEvents = null;
                    MolocoAd molocoAdCreateAdInfo$default = MolocoAdKt.createAdInfo$default(q.this.f55172c, null, null, 6, null);
                    long j10 = this.f55189v;
                    q qVar2 = q.this;
                    com.moloco.sdk.internal.ortb.model.e eVarB = qVar2.b(qVar2.f55182m);
                    r0VarA.a(molocoAdCreateAdInfo$default, j10, (eVarB == null || (ext2 = eVarB.getExt()) == null) ? null : ext2.getSdkEvents());
                    q qVar3 = q.this;
                    com.moloco.sdk.internal.ortb.model.e eVarB2 = qVar3.b(qVar3.f55182m);
                    if (eVarB2 != null && (ext = eVarB2.getExt()) != null) {
                        sdkEvents = ext.getSdkEvents();
                    }
                    r0VarA.b(molocoAdCreateAdInfo$default, sdkEvents);
                    return Unit.f93236a;
                }
                Job job = q.this.f55184o;
                if (job != null && job.isActive()) {
                    MolocoLogger.info$default(molocoLogger, "AdLoad", "Already loading ad " + q.this.f55176g + ' ' + q.this.f55172c + ". Returning", null, false, 12, null);
                    return Unit.f93236a;
                }
            }
            q.this.i(str2, this.f55189v, r0VarA);
            return Unit.f93236a;
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55190r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f55191s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f55193u;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55191s = obj;
            this.f55193u |= Integer.MIN_VALUE;
            return q.this.e(null, this);
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55194r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f55195s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f55197u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ long f55198v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ r0 f55199w;

        public static final class a implements l.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ q f55200a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ r0 f55201b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.internal.ortb.model.e f55202c;

            /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.q$d$a$a, reason: collision with other inner class name */
            public static final class C0678a extends kotlin.coroutines.jvm.internal.k implements Function2 {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public int f55203r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ q f55204s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ r0 f55205t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ com.moloco.sdk.internal.ortb.model.e f55206u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0678a(q qVar, r0 r0Var, com.moloco.sdk.internal.ortb.model.e eVar, Continuation continuation) {
                    super(2, continuation);
                    this.f55204s = qVar;
                    this.f55205t = r0Var;
                    this.f55206u = eVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((C0678a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation create(Object obj, Continuation continuation) {
                    return new C0678a(this.f55204s, this.f55205t, this.f55206u, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    com.moloco.sdk.internal.ortb.model.f ext;
                    pf.b.g();
                    if (this.f55203r != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    this.f55204s.f55180k = true;
                    r0 r0Var = this.f55205t;
                    MolocoAd molocoAdCreateAdInfo = MolocoAdKt.createAdInfo(this.f55204s.f55172c, kotlin.coroutines.jvm.internal.b.c(this.f55206u.getPrice()), this.f55206u.getCrid());
                    q qVar = this.f55204s;
                    com.moloco.sdk.internal.ortb.model.e eVarB = qVar.b(qVar.f55182m);
                    r0Var.b(molocoAdCreateAdInfo, (eVarB == null || (ext = eVarB.getExt()) == null) ? null : ext.getSdkEvents());
                    return Unit.f93236a;
                }
            }

            public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public int f55207r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ q f55208s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ r0 f55209t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c f55210u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(q qVar, r0 r0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar, Continuation continuation) {
                    super(2, continuation);
                    this.f55208s = qVar;
                    this.f55209t = r0Var;
                    this.f55210u = cVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation create(Object obj, Continuation continuation) {
                    return new b(this.f55208s, this.f55209t, this.f55210u, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    com.moloco.sdk.internal.ortb.model.f ext;
                    pf.b.g();
                    if (this.f55207r != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    this.f55208s.f55180k = false;
                    r0 r0Var = this.f55209t;
                    com.moloco.sdk.internal.d0 d0VarA = com.moloco.sdk.internal.e0.a(this.f55208s.f55172c, MolocoAdError.ErrorType.AD_LOAD_FAILED, this.f55210u);
                    q qVar = this.f55208s;
                    com.moloco.sdk.internal.ortb.model.e eVarB = qVar.b(qVar.f55182m);
                    r0Var.c(d0VarA, (eVarB == null || (ext = eVarB.getExt()) == null) ? null : ext.getSdkEvents());
                    return Unit.f93236a;
                }
            }

            public static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public int f55211r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public final /* synthetic */ q f55212s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                public final /* synthetic */ r0 f55213t;

                /* JADX INFO: renamed from: u, reason: collision with root package name */
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a f55214u;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public c(q qVar, r0 r0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a aVar, Continuation continuation) {
                    super(2, continuation);
                    this.f55212s = qVar;
                    this.f55213t = r0Var;
                    this.f55214u = aVar;
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                    return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation create(Object obj, Continuation continuation) {
                    return new c(this.f55212s, this.f55213t, this.f55214u, continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    com.moloco.sdk.internal.ortb.model.f ext;
                    pf.b.g();
                    if (this.f55211r != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    this.f55212s.f55180k = false;
                    r0 r0Var = this.f55213t;
                    com.moloco.sdk.internal.d0 d0VarA = com.moloco.sdk.internal.e0.a(this.f55212s.f55172c, MolocoAdError.ErrorType.AD_LOAD_TIMEOUT_ERROR, this.f55214u);
                    q qVar = this.f55212s;
                    com.moloco.sdk.internal.ortb.model.e eVarB = qVar.b(qVar.f55182m);
                    r0Var.c(d0VarA, (eVarB == null || (ext = eVarB.getExt()) == null) ? null : ext.getSdkEvents());
                    return Unit.f93236a;
                }
            }

            public a(q qVar, r0 r0Var, com.moloco.sdk.internal.ortb.model.e eVar) {
                this.f55200a = qVar;
                this.f55201b = r0Var;
                this.f55202c = eVar;
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.a
            public void a() {
                eg.i.d(this.f55200a.f55179j, null, null, new C0678a(this.f55200a, this.f55201b, this.f55202c, null), 3, null);
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.a
            public void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a timeoutError) {
                Intrinsics.checkNotNullParameter(timeoutError, "timeoutError");
                eg.i.d(this.f55200a.f55179j, null, null, new c(this.f55200a, this.f55201b, timeoutError, null), 3, null);
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.a
            public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalError) {
                Intrinsics.checkNotNullParameter(internalError, "internalError");
                eg.i.d(this.f55200a.f55179j, null, null, new b(this.f55200a, this.f55201b, internalError, null), 3, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, long j10, r0 r0Var, Continuation continuation) {
            super(2, continuation);
            this.f55197u = str;
            this.f55198v = j10;
            this.f55199w = r0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = q.this.new d(this.f55197u, this.f55198v, this.f55199w, continuation);
            dVar.f55195s = obj;
            return dVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:32:0x00c2  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x00c9  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00cc  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00f6  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                Method dump skipped, instruction units count: 295
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.q.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public q(CoroutineScope scope, Function1 timeout, String adUnitId, Function1 recreateXenossAdLoader, com.moloco.sdk.internal.ortb.a parseBidResponse, g0 adLoadPreprocessor, AdFormatType adFormatType, com.moloco.sdk.internal.services.k webViewChecker, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(timeout, "timeout");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(recreateXenossAdLoader, "recreateXenossAdLoader");
        Intrinsics.checkNotNullParameter(parseBidResponse, "parseBidResponse");
        Intrinsics.checkNotNullParameter(adLoadPreprocessor, "adLoadPreprocessor");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        Intrinsics.checkNotNullParameter(webViewChecker, "webViewChecker");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f55171b = timeout;
        this.f55172c = adUnitId;
        this.f55173d = recreateXenossAdLoader;
        this.f55174e = parseBidResponse;
        this.f55175f = adLoadPreprocessor;
        this.f55176g = adFormatType;
        this.f55177h = webViewChecker;
        this.f55178i = metricsRecorder;
        this.f55179j = kotlinx.coroutines.i.j(scope, com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f55183n = metricsRecorder.c(com.moloco.sdk.internal.client_metrics_data.d.f54191k.g());
    }

    public final com.moloco.sdk.internal.ortb.model.e b(com.moloco.sdk.internal.ortb.model.g gVar) {
        List seatBid;
        A a10;
        List bid;
        if (gVar == null || (seatBid = gVar.getSeatBid()) == null || (a10 = (A) seatBid.get(0)) == null || (bid = a10.getBid()) == null) {
            return null;
        }
        return (com.moloco.sdk.internal.ortb.model.e) bid.get(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object e(java.lang.String r5, kotlin.coroutines.Continuation r6) {
        /*
            r4 = this;
            boolean r0 = r6 instanceof com.moloco.sdk.internal.publisher.q.c
            if (r0 == 0) goto L13
            r0 = r6
            com.moloco.sdk.internal.publisher.q$c r0 = (com.moloco.sdk.internal.publisher.q.c) r0
            int r1 = r0.f55193u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f55193u = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.q$c r0 = new com.moloco.sdk.internal.publisher.q$c
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f55191s
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f55193u
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r5 = r0.f55190r
            java.lang.String r5 = (java.lang.String) r5
            kotlin.d.b(r6)
            goto L45
        L2d:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L35:
            kotlin.d.b(r6)
            com.moloco.sdk.internal.publisher.g0 r6 = r4.f55175f
            r0.f55190r = r5
            r0.f55193u = r3
            java.lang.Object r6 = r6.a(r5, r0)
            if (r6 != r1) goto L45
            return r1
        L45:
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L4a
            return r6
        L4a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.q.e(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final void i(String str, long j10, r0 r0Var) {
        Job job = this.f55184o;
        if (job != null) {
            Job.a.a(job, null, 1, null);
        }
        this.f55184o = eg.i.d(this.f55179j, null, null, new d(str, j10, r0Var, null), 3, null);
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public boolean isLoaded() {
        return this.f55180k;
    }

    @Override // com.moloco.sdk.publisher.AdLoad
    public void load(String bidResponseJson, AdLoad.Listener listener) {
        Intrinsics.checkNotNullParameter(bidResponseJson, "bidResponseJson");
        Throwable thG = Result.g(this.f55177h.a());
        if (thG != null) {
            MolocoLogger.INSTANCE.error("AdLoad", "WebView Error: " + thG.getMessage(), thG, true);
            if (listener != null) {
                listener.onAdLoadFailed(MolocoAdErrorKt.createAdErrorInfo(this.f55172c, MolocoAdError.ErrorType.AD_LOAD_WEBVIEW_FAILED));
                return;
            }
            return;
        }
        long jA = b.h.f55827a.h().a();
        MolocoLogger.debug$default(MolocoLogger.INSTANCE, "AdLoadImpl", "load() called with bidResponseJson: " + bidResponseJson, false, 4, null);
        this.f55183n.d();
        com.moloco.sdk.acm.recorder.a aVar = this.f55178i;
        com.moloco.sdk.acm.c cVar = new com.moloco.sdk.acm.c(com.moloco.sdk.internal.client_metrics_data.b.f54159m.g());
        String strG = com.moloco.sdk.internal.client_metrics_data.c.f54175d.g();
        String lowerCase = this.f55176g.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        aVar.b(cVar.e(strG, lowerCase));
        eg.i.d(this.f55179j, null, null, new b(bidResponseJson, listener, jA, null), 3, null);
    }
}
