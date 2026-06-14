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
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes10.dex */
public final class b0 extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f55874h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.moloco.sdk.internal.ortb.model.e f55875i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q f55876j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t0 f55877k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 f55878l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.moloco.sdk.internal.a f55879m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CoroutineScope f55880n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final com.moloco.sdk.internal.services.c0 f55881o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r f55882p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f55883q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r f55884r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p f55885s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j f55886t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j f55887u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j f55888v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l f55889w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final MutableStateFlow f55890x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final StateFlow f55891y;

    public static final class a implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final MutableStateFlow f55892b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final StateFlow f55893c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f55895e;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b0$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0686a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f55896a;

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
                f55896a = iArr;
            }
        }

        public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f55897r;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ b0 f55899t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public final /* synthetic */ long f55900u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public final /* synthetic */ l.a f55901v;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b0$a$b$a, reason: collision with other inner class name */
            public static final class C0687a implements l.a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ l.a f55902a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ b0 f55903b;

                /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b0$a$b$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C0688a {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public static final /* synthetic */ int[] f55904a;

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
                        f55904a = iArr;
                    }
                }

                public C0687a(l.a aVar, b0 b0Var) {
                    this.f55902a = aVar;
                    this.f55903b = b0Var;
                }

                @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.a
                public void a() {
                    l.a aVar = this.f55902a;
                    if (aVar != null) {
                        aVar.a();
                    }
                }

                @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.a
                public void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a timeoutError) {
                    Intrinsics.checkNotNullParameter(timeoutError, "timeoutError");
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r creativeType = this.f55903b.getCreativeType();
                    int i10 = creativeType == null ? -1 : C0688a.f55904a[creativeType.ordinal()];
                    if (i10 == -1) {
                        MolocoLogger.error$default(MolocoLogger.INSTANCE, this.f55903b.f55883q, "creativeType is null", new Throwable(), false, 8, null);
                        return;
                    }
                    if (i10 == 1) {
                        l.a aVar = this.f55902a;
                        if (aVar != null) {
                            aVar.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f56015i);
                            return;
                        }
                        return;
                    }
                    if (i10 == 2) {
                        l.a aVar2 = this.f55902a;
                        if (aVar2 != null) {
                            aVar2.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f56016j);
                            return;
                        }
                        return;
                    }
                    if (i10 != 3) {
                        throw new lf.m();
                    }
                    l.a aVar3 = this.f55902a;
                    if (aVar3 != null) {
                        aVar3.b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.a.f56017k);
                    }
                }

                @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l.a
                public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalError) {
                    Intrinsics.checkNotNullParameter(internalError, "internalError");
                    l.a aVar = this.f55902a;
                    if (aVar != null) {
                        aVar.a(internalError);
                    }
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(b0 b0Var, long j10, l.a aVar, Continuation continuation) {
                super(2, continuation);
                this.f55899t = b0Var;
                this.f55900u = j10;
                this.f55901v = aVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return a.this.new b(this.f55899t, this.f55900u, this.f55901v, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f55897r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    a aVar = a.this;
                    this.f55897r = 1;
                    if (aVar.c(this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j bannerImpl = this.f55899t.getBannerImpl();
                if (bannerImpl != null) {
                    bannerImpl.j(this.f55900u, new C0687a(this.f55901v, this.f55899t));
                }
                return Unit.f93236a;
            }
        }

        public static final class c extends kotlin.coroutines.jvm.internal.d {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public Object f55905r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f55906s;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public int f55908u;

            public c(Continuation continuation) {
                super(continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                this.f55906s = obj;
                this.f55908u |= Integer.MIN_VALUE;
                return a.this.c(this);
            }
        }

        public static final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f55909r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public /* synthetic */ boolean f55910s;

            public d(Continuation continuation) {
                super(2, continuation);
            }

            public final Object c(boolean z10, Continuation continuation) {
                return ((d) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                d dVar = a.this.new d(continuation);
                dVar.f55910s = ((Boolean) obj).booleanValue();
                return dVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return c(((Boolean) obj).booleanValue(), (Continuation) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f55909r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                a.this.f55892b.setValue(kotlin.coroutines.jvm.internal.b.a(this.f55910s));
                return Unit.f93236a;
            }
        }

        public static final class e extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f55912r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public /* synthetic */ boolean f55913s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ b0 f55914t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public e(b0 b0Var, Continuation continuation) {
                super(2, continuation);
                this.f55914t = b0Var;
            }

            public final Object c(boolean z10, Continuation continuation) {
                return ((e) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                e eVar = new e(this.f55914t, continuation);
                eVar.f55913s = ((Boolean) obj).booleanValue();
                return eVar;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return c(((Boolean) obj).booleanValue(), (Continuation) obj2);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f55912r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                this.f55914t.f55890x.setValue(kotlin.coroutines.jvm.internal.b.a(this.f55913s));
                return Unit.f93236a;
            }
        }

        public static final class f extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f55915r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ b0 f55916s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public f(b0 b0Var, Continuation continuation) {
                super(2, continuation);
                this.f55916s = b0Var;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((f) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new f(this.f55916s, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f55915r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVarC = j0.f56170a.c(this.f55916s.f55875i.getAdm());
                this.f55916s.f55884r = rVarC;
                return rVarC;
            }
        }

        public a(com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar) {
            this.f55895e = aVar;
            MutableStateFlow mutableStateFlowA = hg.l0.a(Boolean.FALSE);
            this.f55892b = mutableStateFlowA;
            this.f55893c = hg.i.c(mutableStateFlowA);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x007e  */
        /* JADX WARN: Removed duplicated region for block: B:39:0x012a  */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object c(kotlin.coroutines.Continuation r19) {
            /*
                Method dump skipped, instruction units count: 466
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.b0.a.c(kotlin.coroutines.Continuation):java.lang.Object");
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
        public StateFlow isLoaded() {
            return this.f55893c;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
        public void j(long j10, l.a aVar) {
            eg.i.d(b0.this.f55880n, null, null, new b(b0.this, j10, aVar, null), 3, null);
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f55917r;

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
            return b0.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f55917r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            b0.super.destroy();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j bannerImpl = b0.this.getBannerImpl();
            if (bannerImpl != null) {
                bannerImpl.destroy();
            }
            return Unit.f93236a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r rVar, com.moloco.sdk.internal.ortb.model.e bid, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.q options, t0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 watermark, com.moloco.sdk.internal.a viewLifecycleOwner, CoroutineScope scope, com.moloco.sdk.internal.services.c0 clickthroughService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.r buttonTracker) {
        super(context, scope);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        Intrinsics.checkNotNullParameter(buttonTracker, "buttonTracker");
        this.f55874h = context;
        this.f55875i = bid;
        this.f55876j = options;
        this.f55877k = externalLinkHandler;
        this.f55878l = watermark;
        this.f55879m = viewLifecycleOwner;
        this.f55880n = scope;
        this.f55881o = clickthroughService;
        this.f55882p = buttonTracker;
        this.f55883q = "AggregatedBanner";
        setTag("MolocoAggregatedBannerView");
        this.f55884r = rVar;
        this.f55889w = new a(customUserEventBuilderService);
        MutableStateFlow mutableStateFlowA = hg.l0.a(Boolean.FALSE);
        this.f55890x = mutableStateFlowA;
        this.f55891y = hg.i.c(mutableStateFlowA);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j getBannerImpl() {
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j jVar = this.f55886t;
        if (jVar != null) {
            return jVar;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j jVar2 = this.f55887u;
        return jVar2 == null ? this.f55888v : jVar2;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    public void destroy() {
        eg.i.d(this.f55880n, null, null, new b(null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l getAdLoader() {
        return this.f55889w;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s
    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r getCreativeType() {
        return this.f55884r;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public StateFlow l() {
        return this.f55891y;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    public void p() {
        setAdView(getBannerImpl());
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    @Nullable
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p getAdShowListener() {
        return this.f55885s;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    public void setAdShowListener(@Nullable com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.p pVar) {
        this.f55885s = pVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j jVar = this.f55886t;
        if (jVar != null) {
            jVar.setAdShowListener(pVar);
            return;
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j jVar2 = this.f55887u;
        if (jVar2 == null) {
            jVar2 = this.f55888v;
        }
        if (jVar2 != null) {
            jVar2.setAdShowListener(pVar);
        }
    }
}
