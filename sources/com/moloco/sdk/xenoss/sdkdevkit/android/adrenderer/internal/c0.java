package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class c0 implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f55935b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f55936c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.internal.ortb.model.e f55937d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t0 f55938e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 f55939f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.a f55940g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f55941h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r f55942i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final CoroutineScope f55943j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u f55944k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u f55945l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u f55946m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final w0 f55947n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final MutableStateFlow f55948o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final StateFlow f55949p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final MutableStateFlow f55950q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final StateFlow f55951r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final MutableStateFlow f55952s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final StateFlow f55953t;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f55954a;

        static {
            int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r.values().length];
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r.f58894b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r.f58895c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r.f58896d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f55954a = iArr;
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55955r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ long f55957t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ l.a f55958u;

        public static final class a implements l.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ l.a f55959a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ c0 f55960b;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0$b$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0691a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f55961a;

                static {
                    int[] iArr = new int[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r.values().length];
                    try {
                        iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r.f58894b.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r.f58895c.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r.f58896d.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f55961a = iArr;
                }
            }

            public a(l.a aVar, c0 c0Var) {
                this.f55959a = aVar;
                this.f55960b = c0Var;
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.a
            public void a() {
                l.a aVar = this.f55959a;
                if (aVar != null) {
                    aVar.a();
                }
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.a
            public void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a timeoutError) {
                Intrinsics.checkNotNullParameter(timeoutError, "timeoutError");
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r creativeType = this.f55960b.getCreativeType();
                int i10 = creativeType == null ? -1 : C0691a.f55961a[creativeType.ordinal()];
                if (i10 == -1) {
                    MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f55960b.f55941h, "creativeType is null", null, false, 12, null);
                    return;
                }
                if (i10 == 1) {
                    l.a aVar = this.f55959a;
                    if (aVar != null) {
                        aVar.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f56012f);
                        return;
                    }
                    return;
                }
                if (i10 == 2) {
                    l.a aVar2 = this.f55959a;
                    if (aVar2 != null) {
                        aVar2.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f56013g);
                        return;
                    }
                    return;
                }
                if (i10 != 3) {
                    throw new lf.m();
                }
                l.a aVar3 = this.f55959a;
                if (aVar3 != null) {
                    aVar3.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f56014h);
                }
            }

            @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.a
            public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalError) {
                Intrinsics.checkNotNullParameter(internalError, "internalError");
                l.a aVar = this.f55959a;
                if (aVar != null) {
                    aVar.a(internalError);
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j10, l.a aVar, Continuation continuation) {
            super(2, continuation);
            this.f55957t = j10;
            this.f55958u = aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return c0.this.new b(this.f55957t, this.f55958u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f55955r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                c0 c0Var = c0.this;
                this.f55955r = 1;
                if (c0Var.s(this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVarX = c0.this.x();
            if (uVarX != null) {
                uVarX.j(this.f55957t, new a(this.f55958u, c0.this));
            }
            return Unit.f93236a;
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f55962r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f55963s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f55965u;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.f55963s = obj;
            this.f55965u |= Integer.MIN_VALUE;
            return c0.this.s(this);
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55966r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ boolean f55967s;

        public d(Continuation continuation) {
            super(2, continuation);
        }

        public final Object c(boolean z10, Continuation continuation) {
            return ((d) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = c0.this.new d(continuation);
            dVar.f55967s = ((Boolean) obj).booleanValue();
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return c(((Boolean) obj).booleanValue(), (Continuation) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f55966r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            c0.this.f55948o.setValue(kotlin.coroutines.jvm.internal.b.a(this.f55967s));
            return Unit.f93236a;
        }
    }

    public static final class e extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55969r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ boolean f55970s;

        public e(Continuation continuation) {
            super(2, continuation);
        }

        public final Object c(boolean z10, Continuation continuation) {
            return ((e) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            e eVar = c0.this.new e(continuation);
            eVar.f55970s = ((Boolean) obj).booleanValue();
            return eVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return c(((Boolean) obj).booleanValue(), (Continuation) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f55969r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            c0.this.f55950q.setValue(kotlin.coroutines.jvm.internal.b.a(this.f55970s));
            return Unit.f93236a;
        }
    }

    public static final class f extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55972r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ boolean f55973s;

        public f(Continuation continuation) {
            super(2, continuation);
        }

        public final Object c(boolean z10, Continuation continuation) {
            return ((f) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            f fVar = c0.this.new f(continuation);
            fVar.f55973s = ((Boolean) obj).booleanValue();
            return fVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return c(((Boolean) obj).booleanValue(), (Continuation) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f55972r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            c0.this.f55952s.setValue(kotlin.coroutines.jvm.internal.b.a(this.f55973s));
            return Unit.f93236a;
        }
    }

    public static final class g extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55975r;

        public g(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((g) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return c0.this.new g(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f55975r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVarC = j0.f56170a.c(c0.this.f55937d.getAdm());
            c0.this.f55942i = rVarC;
            return rVarC;
        }
    }

    public c0(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVar, com.moloco.sdk.internal.ortb.model.e bid, t0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 watermark, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f55935b = context;
        this.f55936c = customUserEventBuilderService;
        this.f55937d = bid;
        this.f55938e = externalLinkHandler;
        this.f55939f = watermark;
        this.f55940g = metricsRecorder;
        this.f55941h = "AggregatedFullscreenAd";
        this.f55942i = rVar;
        this.f55943j = kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f55947n = new w0();
        Boolean bool = Boolean.FALSE;
        MutableStateFlow mutableStateFlowA = hg.l0.a(bool);
        this.f55948o = mutableStateFlowA;
        this.f55949p = mutableStateFlowA;
        MutableStateFlow mutableStateFlowA2 = hg.l0.a(bool);
        this.f55950q = mutableStateFlowA2;
        this.f55951r = mutableStateFlowA2;
        MutableStateFlow mutableStateFlowA3 = hg.l0.a(bool);
        this.f55952s = mutableStateFlowA3;
        this.f55953t = mutableStateFlowA3;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    public void destroy() {
        kotlinx.coroutines.i.f(this.f55943j, null, 1, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVarX = x();
        if (uVarX != null) {
            uVarX.destroy();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r getCreativeType() {
        return this.f55942i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public StateFlow isLoaded() {
        return this.f55949p;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void j(long j10, l.a aVar) {
        eg.i.d(this.f55943j, null, null, new b(j10, aVar, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public StateFlow l() {
        return this.f55951r;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q options, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p pVar) {
        Unit unit;
        Intrinsics.checkNotNullParameter(options, "options");
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVar = this.f55944k;
        if (uVar != null) {
            uVar.b(options.c(), pVar);
            Unit unit2 = Unit.f93236a;
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVar2 = this.f55945l;
        if (uVar2 != null) {
            uVar2.b(options.a(), pVar);
            Unit unit3 = Unit.f93236a;
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVar3 = this.f55946m;
        if (uVar3 != null) {
            uVar3.b(options.b(), pVar);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit != null || pVar == null) {
            return;
        }
        pVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.b.f56020b);
        Unit unit4 = Unit.f93236a;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object s(kotlin.coroutines.Continuation r15) {
        /*
            Method dump skipped, instruction units count: 297
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c0.s(kotlin.coroutines.Continuation):java.lang.Object");
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u x() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVar = this.f55944k;
        if (uVar != null) {
            return uVar;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u uVar2 = this.f55945l;
        return uVar2 == null ? this.f55946m : uVar2;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v
    public StateFlow k() {
        return this.f55953t;
    }
}
