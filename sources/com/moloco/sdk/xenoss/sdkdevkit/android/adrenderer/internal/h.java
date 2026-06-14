package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SharedFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class h implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f56120b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 f56121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r f56122d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CoroutineScope f56123e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a f56124f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f56125g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MutableStateFlow f56126h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Lazy f56127i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final MutableStateFlow f56128j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final StateFlow f56129k;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56130r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ boolean f56131s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ boolean f56132t;

        public a(Continuation continuation) {
            super(3, continuation);
        }

        public final Object c(boolean z10, boolean z11, Continuation continuation) {
            a aVar = new a(continuation);
            aVar.f56131s = z10;
            aVar.f56132t = z11;
            return aVar.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return c(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (Continuation) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f56130r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            return kotlin.coroutines.jvm.internal.b.a(this.f56131s && this.f56132t);
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56133r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f56134s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o f56136u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n f56137v;

        public /* synthetic */ class a extends kotlin.jvm.internal.y implements Function0 {
            public a(Object obj) {
                super(0, obj, h.class, "onClose", "onClose()V", 0);
            }

            public final void a() {
                ((h) this.receiver).x();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Unit.f93236a;
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h$b$b, reason: collision with other inner class name */
        public static final class C0694b extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f56138r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ h f56139s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n f56140t;

            /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h$b$b$a */
            public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                public int f56141r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                public /* synthetic */ Object f56142s;

                public a(Continuation continuation) {
                    super(2, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar, Continuation continuation) {
                    return ((a) create(gVar, continuation)).invokeSuspend(Unit.f93236a);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Continuation create(Object obj, Continuation continuation) {
                    a aVar = new a(continuation);
                    aVar.f56142s = obj;
                    return aVar;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    pf.b.g();
                    if (this.f56141r != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                    return kotlin.coroutines.jvm.internal.b.a(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) this.f56142s) != null);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0694b(h hVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n nVar, Continuation continuation) {
                super(2, continuation);
                this.f56139s = hVar;
                this.f56140t = nVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((C0694b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new C0694b(this.f56139s, this.f56140t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n nVar;
                Object objG = pf.b.g();
                int i10 = this.f56138r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    StateFlow unrecoverableError = this.f56139s.f56124f.getUnrecoverableError();
                    a aVar = new a(null);
                    this.f56138r = 1;
                    obj = hg.i.y(unrecoverableError, aVar, this);
                    if (obj == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                }
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g gVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.g) obj;
                if (gVar != null && (nVar = this.f56140t) != null) {
                    nVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.h.b(gVar));
                }
                return Unit.f93236a;
            }
        }

        public static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f56143r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ h f56144s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n f56145t;

            public static final class a implements FlowCollector {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n f56146b;

                public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n nVar) {
                    this.f56146b = nVar;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(Unit unit, Continuation continuation) {
                    com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n nVar = this.f56146b;
                    if (nVar != null) {
                        nVar.a();
                    }
                    return Unit.f93236a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(h hVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n nVar, Continuation continuation) {
                super(2, continuation);
                this.f56144s = hVar;
                this.f56145t = nVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new c(this.f56144s, this.f56145t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f56143r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    SharedFlow clickthroughEvent = this.f56144s.f56124f.getClickthroughEvent();
                    a aVar = new a(this.f56145t);
                    this.f56143r = 1;
                    if (clickthroughEvent.collect(aVar, this) == objG) {
                        return objG;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.d.b(obj);
                }
                throw new lf.g();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o oVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n nVar, Continuation continuation) {
            super(2, continuation);
            this.f56136u = oVar;
            this.f56137v = nVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            b bVar = h.this.new b(this.f56136u, this.f56137v, continuation);
            bVar.f56134s = obj;
            return bVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0097 A[LOOP:0: B:19:0x0091->B:21:0x0097, LOOP_END] */
        /* JADX WARN: Removed duplicated region for block: B:31:0x00c1 A[LOOP:1: B:29:0x00bb->B:31:0x00c1, LOOP_END] */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 217
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.h.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public h(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, String adm, t0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 watermark) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        this.f56120b = context;
        this.f56121c = watermark;
        this.f56122d = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r.f58896d;
        CoroutineScope coroutineScopeA = kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f56123e = coroutineScopeA;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a aVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.staticrenderer.a(context, null, new com.moloco.sdk.internal.services.d0(externalLinkHandler, customUserEventBuilderService), com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.t.a(), false, null, 50, null);
        this.f56124f = aVar;
        this.f56125g = new d(adm, coroutineScopeA, aVar);
        Boolean bool = Boolean.FALSE;
        this.f56126h = hg.l0.a(bool);
        this.f56127i = lf.i.a(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.g
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h.t(this.f56119b);
            }
        });
        MutableStateFlow mutableStateFlowA = hg.l0.a(bool);
        this.f56128j = mutableStateFlowA;
        this.f56129k = mutableStateFlowA;
    }

    public static final StateFlow t(h hVar) {
        return hg.i.T(hg.i.C(hVar.f56126h, hVar.f56124f.c(), new a(null)), hVar.f56123e, hg.g0.f73226a.c(), Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    public void destroy() {
        kotlinx.coroutines.i.f(this.f56123e, null, 1, null);
        this.f56124f.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r getCreativeType() {
        return this.f56122d;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public StateFlow isLoaded() {
        return this.f56125g.isLoaded();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void j(long j10, l.a aVar) {
        this.f56125g.j(j10, aVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public StateFlow l() {
        return (StateFlow) this.f56127i.getValue();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o options, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n nVar) {
        Intrinsics.checkNotNullParameter(options, "options");
        eg.i.d(this.f56123e, null, null, new b(options, nVar, null), 3, null);
    }

    public final void x() {
        this.f56126h.setValue(Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v
    public StateFlow k() {
        return this.f56129k;
    }
}
