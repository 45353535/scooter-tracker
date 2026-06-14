package com.moloco.sdk.internal.publisher.nativead;

import android.content.Context;
import com.moloco.sdk.internal.d0;
import com.moloco.sdk.internal.ortb.model.z;
import com.moloco.sdk.internal.publisher.f0;
import com.moloco.sdk.internal.publisher.n;
import com.moloco.sdk.internal.publisher.r0;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.MolocoAdKt;
import java.util.Locale;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes10.dex */
public final class c {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f54878k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f54879l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f54880a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f54881b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f0 f54882c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.internal.publisher.nativead.parser.a f54883d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f54884e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.a f54885f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.i f54886g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final AdFormatType f54887h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.moloco.sdk.acm.f f54888i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.moloco.sdk.internal.scheduling.a f54889j;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final com.moloco.sdk.internal.ortb.model.e f54890a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final com.moloco.sdk.internal.publisher.nativead.model.a f54891b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final com.moloco.sdk.internal.publisher.nativead.model.d f54892c;

        public b(com.moloco.sdk.internal.ortb.model.e bid, com.moloco.sdk.internal.publisher.nativead.model.a ortbResponse, com.moloco.sdk.internal.publisher.nativead.model.d preparedAssets) {
            Intrinsics.checkNotNullParameter(bid, "bid");
            Intrinsics.checkNotNullParameter(ortbResponse, "ortbResponse");
            Intrinsics.checkNotNullParameter(preparedAssets, "preparedAssets");
            this.f54890a = bid;
            this.f54891b = ortbResponse;
            this.f54892c = preparedAssets;
        }

        public final com.moloco.sdk.internal.ortb.model.e a() {
            return this.f54890a;
        }

        public final com.moloco.sdk.internal.publisher.nativead.model.a b() {
            return this.f54891b;
        }

        public final com.moloco.sdk.internal.publisher.nativead.model.d c() {
            return this.f54892c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.areEqual(this.f54890a, bVar.f54890a) && Intrinsics.areEqual(this.f54891b, bVar.f54891b) && Intrinsics.areEqual(this.f54892c, bVar.f54892c);
        }

        public int hashCode() {
            return (((this.f54890a.hashCode() * 31) + this.f54891b.hashCode()) * 31) + this.f54892c.hashCode();
        }

        public String toString() {
            return "LoadedNativeAd(bid=" + this.f54890a + ", ortbResponse=" + this.f54891b + ", preparedAssets=" + this.f54892c + ')';
        }
    }

    /* JADX INFO: renamed from: com.moloco.sdk.internal.publisher.nativead.c$c, reason: collision with other inner class name */
    public static final class C0671c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f54893r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f54894s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f54895t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f54896u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f54898w;

        public C0671c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f54896u = obj;
            this.f54898w |= Integer.MIN_VALUE;
            return c.this.g(null, 0L, this);
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54899r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ r0 f54900s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ d0 f54901t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ z f54902u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(r0 r0Var, d0 d0Var, z zVar, Continuation continuation) {
            super(2, continuation);
            this.f54900s = r0Var;
            this.f54901t = d0Var;
            this.f54902u = zVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((d) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new d(this.f54900s, this.f54901t, this.f54902u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f54899r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            this.f54900s.c(this.f54901t, this.f54902u);
            return Unit.f93236a;
        }
    }

    public static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f54903r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f54904s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f54905t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f54906u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f54908w;

        public e(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f54906u = obj;
            this.f54908w |= Integer.MIN_VALUE;
            Object objB = c.this.b(null, null, null, 0L, this);
            return objB == pf.b.g() ? objB : Result.a(objB);
        }
    }

    public static final class f extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f54909r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.internal.publisher.nativead.model.a f54911t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ long f54912u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(com.moloco.sdk.internal.publisher.nativead.model.a aVar, long j10, Continuation continuation) {
            super(2, continuation);
            this.f54911t = aVar;
            this.f54912u = j10;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new f(this.f54911t, this.f54912u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f54909r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return obj;
            }
            kotlin.d.b(obj);
            c cVar = c.this;
            com.moloco.sdk.internal.publisher.nativead.model.a aVar = this.f54911t;
            long j10 = this.f54912u;
            this.f54909r = 1;
            Object objG2 = cVar.g(aVar, j10, this);
            return objG2 == objG ? objG : objG2;
        }
    }

    public static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f54913r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f54914s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f54915t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public /* synthetic */ Object f54916u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f54918w;

        public g(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f54916u = obj;
            this.f54918w |= Integer.MIN_VALUE;
            Object objI = c.this.i(null, null, null, this);
            return objI == pf.b.g() ? objI : Result.a(objI);
        }
    }

    public static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f54919r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f54920s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f54921t;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f54923v;

        public h(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f54921t = obj;
            this.f54923v |= Integer.MIN_VALUE;
            Object objJ = c.this.j(null, null, null, this);
            return objJ == pf.b.g() ? objJ : Result.a(objJ);
        }
    }

    public static final class i extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f54924r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f54926t;

        public i(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f54924r = obj;
            this.f54926t |= Integer.MIN_VALUE;
            Object objL = c.this.l(null, null, null, this);
            return objL == pf.b.g() ? objL : Result.a(objL);
        }
    }

    public static final class j extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public long f54927r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Object f54928s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public Object f54929t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f54930u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.acm.f f54932w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public final /* synthetic */ String f54933x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public final /* synthetic */ r0 f54934y;

        public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f54935r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ r0 f54936s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ c f54937t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.internal.ortb.model.e f54938u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ long f54939v;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(r0 r0Var, c cVar, com.moloco.sdk.internal.ortb.model.e eVar, long j10, Continuation continuation) {
                super(2, continuation);
                this.f54936s = r0Var;
                this.f54937t = cVar;
                this.f54938u = eVar;
                this.f54939v = j10;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f54936s, this.f54937t, this.f54938u, this.f54939v, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f54935r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                this.f54936s.a(MolocoAdKt.createAdInfo(this.f54937t.f54881b, kotlin.coroutines.jvm.internal.b.c(this.f54938u.getPrice()), this.f54938u.getCrid()), this.f54939v, this.f54938u.getExt().getSdkEvents());
                return Unit.f93236a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(com.moloco.sdk.acm.f fVar, String str, r0 r0Var, Continuation continuation) {
            super(2, continuation);
            this.f54932w = fVar;
            this.f54933x = str;
            this.f54934y = r0Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((j) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new j(this.f54932w, this.f54933x, this.f54934y, continuation);
        }

        /* JADX WARN: Removed duplicated region for block: B:27:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0136  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x0146  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0153  */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                Method dump skipped, instruction units count: 365
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.c.j.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public static final class k extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f54940r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f54942t;

        public k(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f54940r = obj;
            this.f54942t |= Integer.MIN_VALUE;
            return c.this.k(null, 0L, this);
        }
    }

    public c(Context context, String adUnitId, f0 bidLoader, com.moloco.sdk.internal.publisher.nativead.parser.a ortbResponseParser, n createLoadTimeoutManager, com.moloco.sdk.acm.recorder.a metricsRecorder, com.moloco.sdk.internal.services.i timeProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        Intrinsics.checkNotNullParameter(bidLoader, "bidLoader");
        Intrinsics.checkNotNullParameter(ortbResponseParser, "ortbResponseParser");
        Intrinsics.checkNotNullParameter(createLoadTimeoutManager, "createLoadTimeoutManager");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(timeProvider, "timeProvider");
        this.f54880a = context;
        this.f54881b = adUnitId;
        this.f54882c = bidLoader;
        this.f54883d = ortbResponseParser;
        this.f54884e = createLoadTimeoutManager;
        this.f54885f = metricsRecorder;
        this.f54886g = timeProvider;
        AdFormatType adFormatType = AdFormatType.NATIVE;
        this.f54887h = adFormatType;
        com.moloco.sdk.acm.f fVarC = metricsRecorder.c(com.moloco.sdk.internal.client_metrics_data.d.f54198r.g());
        String strG = com.moloco.sdk.internal.client_metrics_data.c.f54175d.g();
        String lowerCase = adFormatType.name().toLowerCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        this.f54888i = fVarC.f(strG, lowerCase);
        this.f54889j = com.moloco.sdk.internal.scheduling.c.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(com.moloco.sdk.internal.ortb.model.z r19, com.moloco.sdk.internal.publisher.nativead.model.a r20, com.moloco.sdk.internal.publisher.r0 r21, long r22, kotlin.coroutines.Continuation r24) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.c.b(com.moloco.sdk.internal.ortb.model.z, com.moloco.sdk.internal.publisher.nativead.model.a, com.moloco.sdk.internal.publisher.r0, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0015  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object g(com.moloco.sdk.internal.publisher.nativead.model.a r14, long r15, kotlin.coroutines.Continuation r17) {
        /*
            Method dump skipped, instruction units count: 544
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.c.g(com.moloco.sdk.internal.publisher.nativead.model.a, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final Object h(r0 r0Var, d0 d0Var, z zVar, Continuation continuation) {
        Object objG = eg.g.g(this.f54889j.getMain(), new d(r0Var, d0Var, zVar, null), continuation);
        return objG == pf.b.g() ? objG : Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object i(java.lang.String r12, com.moloco.sdk.acm.f r13, com.moloco.sdk.internal.publisher.r0 r14, kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 299
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.c.i(java.lang.String, com.moloco.sdk.acm.f, com.moloco.sdk.internal.publisher.r0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object j(java.lang.String r12, com.moloco.sdk.internal.ortb.model.z r13, com.moloco.sdk.internal.publisher.r0 r14, kotlin.coroutines.Continuation r15) {
        /*
            r11 = this;
            boolean r0 = r15 instanceof com.moloco.sdk.internal.publisher.nativead.c.h
            if (r0 == 0) goto L13
            r0 = r15
            com.moloco.sdk.internal.publisher.nativead.c$h r0 = (com.moloco.sdk.internal.publisher.nativead.c.h) r0
            int r1 = r0.f54923v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54923v = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.nativead.c$h r0 = new com.moloco.sdk.internal.publisher.nativead.c$h
            r0.<init>(r15)
        L18:
            java.lang.Object r15 = r0.f54921t
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f54923v
            r3 = 1
            if (r2 == 0) goto L33
            if (r2 != r3) goto L2b
            java.lang.Object r12 = r0.f54919r
            kotlin.d.b(r15)
            return r12
        L2b:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L33:
            kotlin.d.b(r15)
            com.moloco.sdk.internal.publisher.nativead.parser.a r15 = r11.f54883d
            java.lang.Object r12 = r15.c(r12)
            java.lang.Throwable r7 = kotlin.Result.g(r12)
            if (r7 == 0) goto L66
            com.moloco.sdk.internal.MolocoLogger r4 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            r9 = 8
            r10 = 0
            java.lang.String r5 = "NativeAdLoader"
            java.lang.String r6 = "handleOrtbParsing"
            r8 = 0
            com.moloco.sdk.internal.MolocoLogger.error$default(r4, r5, r6, r7, r8, r9, r10)
            java.lang.String r15 = r11.f54881b
            com.moloco.sdk.publisher.MolocoAdError$ErrorType r2 = com.moloco.sdk.publisher.MolocoAdError.ErrorType.AD_LOAD_FAILED
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f r4 = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.f.f56040b
            com.moloco.sdk.internal.d0 r15 = com.moloco.sdk.internal.e0.a(r15, r2, r4)
            r0.f54919r = r12
            r0.f54920s = r12
            r0.f54923v = r3
            java.lang.Object r13 = r11.h(r14, r15, r13, r0)
            if (r13 != r1) goto L66
            return r1
        L66:
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.c.j(java.lang.String, com.moloco.sdk.internal.ortb.model.z, com.moloco.sdk.internal.publisher.r0, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object k(java.util.List r8, long r9, kotlin.coroutines.Continuation r11) {
        /*
            r7 = this;
            boolean r0 = r11 instanceof com.moloco.sdk.internal.publisher.nativead.c.k
            if (r0 == 0) goto L13
            r0 = r11
            com.moloco.sdk.internal.publisher.nativead.c$k r0 = (com.moloco.sdk.internal.publisher.nativead.c.k) r0
            int r1 = r0.f54942t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54942t = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.nativead.c$k r0 = new com.moloco.sdk.internal.publisher.nativead.c$k
            r0.<init>(r11)
        L18:
            java.lang.Object r11 = r0.f54940r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f54942t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r11)
            goto L3f
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            kotlin.d.b(r11)
            android.content.Context r11 = r7.f54880a
            r0.f54942t = r3
            java.lang.Object r11 = com.moloco.sdk.internal.publisher.nativead.parser.d.b(r11, r8, r9, r0)
            if (r11 != r1) goto L3f
            return r1
        L3f:
            com.moloco.sdk.internal.h0 r11 = (com.moloco.sdk.internal.h0) r11
            boolean r8 = r11 instanceof com.moloco.sdk.internal.h0.b
            if (r8 == 0) goto L51
            com.moloco.sdk.internal.h0$b r8 = new com.moloco.sdk.internal.h0$b
            com.moloco.sdk.internal.h0$b r11 = (com.moloco.sdk.internal.h0.b) r11
            java.lang.Object r9 = r11.a()
            r8.<init>(r9)
            return r8
        L51:
            boolean r8 = r11 instanceof com.moloco.sdk.internal.h0.a
            if (r8 == 0) goto L75
            com.moloco.sdk.internal.MolocoLogger r0 = com.moloco.sdk.internal.MolocoLogger.INSTANCE
            com.moloco.sdk.internal.h0$a r11 = (com.moloco.sdk.internal.h0.a) r11
            java.lang.Object r8 = r11.a()
            r3 = r8
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r5 = 8
            r6 = 0
            java.lang.String r1 = "NativeAdLoader"
            java.lang.String r2 = "NativeAd prepareAssets failed"
            r4 = 0
            com.moloco.sdk.internal.MolocoLogger.error$default(r0, r1, r2, r3, r4, r5, r6)
            com.moloco.sdk.internal.h0$a r8 = new com.moloco.sdk.internal.h0$a
            java.lang.Object r9 = r11.a()
            r8.<init>(r9)
            return r8
        L75:
            lf.m r8 = new lf.m
            r8.<init>()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.c.k(java.util.List, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object l(java.lang.String r11, com.moloco.sdk.acm.f r12, com.moloco.sdk.internal.publisher.r0 r13, kotlin.coroutines.Continuation r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof com.moloco.sdk.internal.publisher.nativead.c.i
            if (r0 == 0) goto L13
            r0 = r14
            com.moloco.sdk.internal.publisher.nativead.c$i r0 = (com.moloco.sdk.internal.publisher.nativead.c.i) r0
            int r1 = r0.f54926t
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f54926t = r1
            goto L18
        L13:
            com.moloco.sdk.internal.publisher.nativead.c$i r0 = new com.moloco.sdk.internal.publisher.nativead.c$i
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f54924r
            java.lang.Object r1 = pf.b.g()
            int r2 = r0.f54926t
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            kotlin.d.b(r14)
            goto L4d
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            kotlin.d.b(r14)
            com.moloco.sdk.internal.scheduling.a r14 = r10.f54889j
            kotlin.coroutines.CoroutineContext r14 = r14.getDefault()
            com.moloco.sdk.internal.publisher.nativead.c$j r4 = new com.moloco.sdk.internal.publisher.nativead.c$j
            r9 = 0
            r5 = r10
            r7 = r11
            r6 = r12
            r8 = r13
            r4.<init>(r6, r7, r8, r9)
            r0.f54926t = r3
            java.lang.Object r14 = eg.g.g(r14, r4, r0)
            if (r14 != r1) goto L4d
            return r1
        L4d:
            kotlin.Result r14 = (kotlin.Result) r14
            java.lang.Object r11 = r14.l()
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.publisher.nativead.c.l(java.lang.String, com.moloco.sdk.acm.f, com.moloco.sdk.internal.publisher.r0, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
