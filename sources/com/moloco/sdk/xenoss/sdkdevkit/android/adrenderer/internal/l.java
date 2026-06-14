package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.fullscreen.FullscreenWebviewActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class l implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.d0 {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f56181r = new a(null);

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f56182s = 8;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f56183b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 f56184c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final t0 f56185d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l f56186e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.a f56187f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CoroutineScope f56188g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c f56189h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i f56190i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b f56191j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h f56192k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Set f56193l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.c f56194m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r f56195n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final MutableStateFlow f56196o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Lazy f56197p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final MutableStateFlow f56198q;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56199r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ boolean f56200s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ boolean f56201t;

        public b(Continuation continuation) {
            super(3, continuation);
        }

        public final Object c(boolean z10, boolean z11, Continuation continuation) {
            b bVar = new b(continuation);
            bVar.f56200s = z10;
            bVar.f56201t = z11;
            return bVar.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return c(((Boolean) obj).booleanValue(), ((Boolean) obj2).booleanValue(), (Continuation) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f56199r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            boolean z10 = this.f56200s;
            boolean z11 = this.f56201t;
            MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("isAdDisplaying final: ");
            boolean z12 = false;
            sb2.append(z10 && z11);
            sb2.append(", _isAdDisplaying: ");
            sb2.append(z10);
            sb2.append(", webViewIsDisplaying: ");
            sb2.append(z11);
            MolocoLogger.info$default(molocoLogger, "TemplateFullscreenAd", sb2.toString(), null, false, 12, null);
            if (z10 && z11) {
                z12 = true;
            }
            return kotlin.coroutines.jvm.internal.b.a(z12);
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56202r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f56203s;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ d f56205u;

        public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f56206r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ List f56207s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ l f56208t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(List list, l lVar, Continuation continuation) {
                super(2, continuation);
                this.f56207s = list;
                this.f56208t = lVar;
            }

            public static final void i(l lVar) {
                lVar.destroy();
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Unit unit, Continuation continuation) {
                return ((a) create(unit, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new a(this.f56207s, this.f56208t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f56206r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                Iterator it = this.f56207s.iterator();
                while (it.hasNext()) {
                    Job.a.a((Job) it.next(), null, 1, null);
                }
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateFullscreenAd", "Calling close()", null, false, 12, null);
                FullscreenWebviewActivity.INSTANCE.a();
                Handler handler = new Handler(Looper.getMainLooper());
                final l lVar = this.f56208t;
                handler.postDelayed(new Runnable() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        l.c.a.i(lVar);
                    }
                }, 1000L);
                return Unit.f93236a;
            }
        }

        public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f56209r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public final /* synthetic */ l f56210s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public final /* synthetic */ d f56211t;

            public static final class a implements FlowCollector {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ d f56212b;

                public a(d dVar) {
                    this.f56212b = dVar;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Object emit(Unit unit, Continuation continuation) {
                    this.f56212b.a();
                    return Unit.f93236a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(l lVar, d dVar, Continuation continuation) {
                super(2, continuation);
                this.f56210s = lVar;
                this.f56211t = dVar;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
                return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                return new b(this.f56210s, this.f56211t, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objG = pf.b.g();
                int i10 = this.f56209r;
                if (i10 == 0) {
                    kotlin.d.b(obj);
                    MutableSharedFlow mutableSharedFlowD = this.f56210s.f56191j.d();
                    a aVar = new a(this.f56211t);
                    this.f56209r = 1;
                    if (mutableSharedFlowD.collect(aVar, this) == objG) {
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
        public c(d dVar, Continuation continuation) {
            super(2, continuation);
            this.f56205u = dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((c) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = l.this.new c(this.f56205u, continuation);
            cVar.f56203s = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f56202r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                List listListOf = CollectionsKt.listOf(eg.i.d((CoroutineScope) this.f56203s, null, null, new b(l.this, this.f56205u, null), 3, null));
                MutableSharedFlow mutableSharedFlowC = l.this.f56189h.c();
                a aVar = new a(listListOf, l.this, null);
                this.f56202r = 1;
                if (hg.i.l(mutableSharedFlowC, aVar, this) == objG) {
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

    public l(Context context, String adm, com.moloco.sdk.internal.services.c0 clickthroughService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 watermark, t0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.l persistentHttpRequest, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(persistentHttpRequest, "persistentHttpRequest");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f56183b = context;
        this.f56184c = watermark;
        this.f56185d = externalLinkHandler;
        this.f56186e = persistentHttpRequest;
        this.f56187f = metricsRecorder;
        CoroutineScope coroutineScopeA = kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f56188g = coroutineScopeA;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c cVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.c(coroutineScopeA);
        this.f56189h = cVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i iVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.i(coroutineScopeA);
        this.f56190i = iVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b bVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.b(clickthroughService, coroutineScopeA);
        this.f56191j = bVar;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h hVar = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.h(coroutineScopeA);
        this.f56192k = hVar;
        Set of2 = SetsKt.setOf((Object[]) new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.a[]{cVar, bVar, iVar, new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.a(metricsRecorder), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.g(externalLinkHandler), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.events.handlers.f(persistentHttpRequest), hVar});
        this.f56193l = of2;
        this.f56194m = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.ad.c(context, adm, of2, bVar, iVar, hVar, metricsRecorder);
        Boolean bool = Boolean.FALSE;
        this.f56196o = hg.l0.a(bool);
        this.f56197p = lf.i.a(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l.q(this.f56171b);
            }
        });
        this.f56198q = hg.l0.a(bool);
    }

    public static final StateFlow q(l lVar) {
        return hg.i.T(hg.i.C(lVar.f56196o, lVar.f56194m.l(), new b(null)), lVar.f56188g, hg.g0.f73226a.c(), Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    public void destroy() {
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateFullscreenAd", "destroy called", null, false, 12, null);
        this.f56194m.destroy();
        FullscreenWebviewActivity.INSTANCE.a();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r getCreativeType() {
        return this.f56195n;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public StateFlow isLoaded() {
        return this.f56194m.isLoaded();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void j(long j10, l.a aVar) {
        this.f56194m.j(j10, aVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public StateFlow l() {
        return (StateFlow) this.f56197p.getValue();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.b0 options, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 c0Var) {
        Intrinsics.checkNotNullParameter(options, "options");
        MolocoLogger.info$default(MolocoLogger.INSTANCE, "TemplateFullscreenAd", "fullscreen ad show called", null, false, 12, null);
        d dVar = new d(c0Var, this);
        this.f56184c.a(this.f56194m.y());
        this.f56194m.p(dVar);
        FullscreenWebviewActivity.INSTANCE.b(this.f56183b, this.f56196o, this.f56194m, this.f56187f, this.f56198q);
        eg.i.d(this.f56188g, null, null, new c(dVar, null), 3, null);
    }

    public static final class d implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 f56213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ l f56214b;

        public d(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 c0Var, l lVar) {
            this.f56213a = c0Var;
            this.f56214b = lVar;
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
        public void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c internalShowError) {
            Intrinsics.checkNotNullParameter(internalShowError, "internalShowError");
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 c0Var = this.f56213a;
            if (c0Var != null) {
                c0Var.a(internalShowError);
            }
            this.f56214b.destroy();
        }

        @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n
        public void a() {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.c0 c0Var = this.f56213a;
            if (c0Var != null) {
                c0Var.a();
            }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v
    public StateFlow k() {
        return this.f56198q;
    }
}
