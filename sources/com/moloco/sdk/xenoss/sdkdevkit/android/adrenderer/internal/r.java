package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.h0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.VastActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class r implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f56609b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.internal.ortb.model.e f56610c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 f56611d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.a f56612e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r f56613f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final CoroutineScope f56614g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final o f56615h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MutableStateFlow f56616i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final StateFlow f56617j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final MutableStateFlow f56618k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final StateFlow f56619l;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56620r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 f56622t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f0 f56623u;

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C0707a extends kotlin.jvm.internal.y implements Function0 {
            public C0707a(Object obj) {
                super(0, obj, r.class, "onClose", "onClose()V", 0);
            }

            public final void a() {
                ((r) this.receiver).x();
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                a();
                return Unit.f93236a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f0 f0Var, Continuation continuation) {
            super(2, continuation);
            this.f56622t = e0Var;
            this.f56623u = f0Var;
        }

        public static final Unit c(r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar) {
            rVar.p(bVar, e0Var);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return r.this.new a(this.f56622t, this.f56623u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            a aVar;
            Throwable th2;
            VastActivity.Companion companion;
            Context context;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f0 f0Var;
            C0707a c0707a;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 g0Var;
            String bundle;
            com.moloco.sdk.acm.recorder.a aVar2;
            Function1 function1;
            Object objG = pf.b.g();
            int i10 = this.f56620r;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    kotlin.d.b(obj);
                    aVar = this;
                    r.this.f56616i.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    return Unit.f93236a;
                } catch (Throwable th3) {
                    th2 = th3;
                    aVar = this;
                    r.this.f56616i.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                    throw th2;
                }
            }
            kotlin.d.b(obj);
            com.moloco.sdk.internal.h0 h0VarC = r.this.f56615h.c();
            if (h0VarC instanceof h0.a) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((h0.a) h0VarC).a();
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var = this.f56622t;
                if (e0Var != null) {
                    e0Var.a(cVar);
                }
                return Unit.f93236a;
            }
            if (!(h0VarC instanceof h0.b)) {
                throw new lf.m();
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a aVar3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((h0.b) h0VarC).a();
            if (!aVar3.g().e().exists()) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, "VastFullscreenAdImpl", "VAST ad media file does not exist", null, false, 12, null);
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var2 = this.f56622t;
                if (e0Var2 != null) {
                    e0Var2.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l.f56094e);
                }
                return Unit.f93236a;
            }
            try {
                companion = VastActivity.INSTANCE;
                context = r.this.f56609b;
                f0Var = this.f56623u;
                c0707a = new C0707a(r.this);
                g0Var = r.this.f56611d;
                bundle = r.this.f56610c.getBundle();
                aVar2 = r.this.f56612e;
                final r rVar = r.this;
                final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var3 = this.f56622t;
                function1 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.q
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return r.a.c(rVar, e0Var3, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) obj2);
                    }
                };
                this.f56620r = 1;
                aVar = this;
            } catch (Throwable th4) {
                th = th4;
                aVar = this;
            }
            try {
                if (companion.a(aVar3, context, f0Var, c0707a, g0Var, bundle, aVar2, function1, aVar) == objG) {
                    return objG;
                }
                r.this.f56616i.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                return Unit.f93236a;
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                r.this.f56616i.setValue(kotlin.coroutines.jvm.internal.b.a(false));
                throw th2;
            }
        }
    }

    public r(Context context, com.moloco.sdk.internal.ortb.model.e bid, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.g loadVast, o0 decLoader, boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 watermark, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(loadVast, "loadVast");
        Intrinsics.checkNotNullParameter(decLoader, "decLoader");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f56609b = context;
        this.f56610c = bid;
        this.f56611d = watermark;
        this.f56612e = metricsRecorder;
        this.f56613f = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r.f58894b;
        CoroutineScope coroutineScopeA = kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f56614g = coroutineScopeA;
        this.f56615h = new o(bid, coroutineScopeA, loadVast, decLoader, z10);
        Boolean bool = Boolean.FALSE;
        MutableStateFlow mutableStateFlowA = hg.l0.a(bool);
        this.f56616i = mutableStateFlowA;
        this.f56617j = mutableStateFlowA;
        MutableStateFlow mutableStateFlowA2 = hg.l0.a(bool);
        this.f56618k = mutableStateFlowA2;
        this.f56619l = mutableStateFlowA2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void x() {
        this.f56618k.setValue(Boolean.TRUE);
        this.f56616i.setValue(Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    public void destroy() {
        kotlinx.coroutines.i.f(this.f56614g, null, 1, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r getCreativeType() {
        return this.f56613f;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public StateFlow isLoaded() {
        return this.f56615h.isLoaded();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void j(long j10, l.a aVar) {
        this.f56615h.j(j10, aVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public StateFlow l() {
        return this.f56617j;
    }

    public final void p(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var) {
        if (Intrinsics.areEqual(bVar, b.g.f57682a)) {
            y();
            return;
        }
        if (Intrinsics.areEqual(bVar, b.C0745b.f57677a)) {
            y();
            return;
        }
        if (Intrinsics.areEqual(bVar, b.d.f57679a)) {
            y();
            return;
        }
        if (Intrinsics.areEqual(bVar, b.i.f57684a)) {
            if (e0Var != null) {
                e0Var.a(true);
                return;
            }
            return;
        }
        if (Intrinsics.areEqual(bVar, b.c.f57678a)) {
            if (e0Var != null) {
                e0Var.a(false);
            }
        } else if (Intrinsics.areEqual(bVar, b.a.f57676a)) {
            if (e0Var != null) {
                e0Var.a();
            }
        } else if (bVar instanceof b.f) {
            if (e0Var != null) {
                e0Var.a(((b.f) bVar).a());
            }
        } else if (!Intrinsics.areEqual(bVar, b.h.f57683a) && !Intrinsics.areEqual(bVar, b.e.f57680a)) {
            throw new lf.m();
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f0 options, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var) {
        Intrinsics.checkNotNullParameter(options, "options");
        eg.i.d(this.f56614g, null, null, new a(e0Var, options, null), 3, null);
    }

    public final void y() {
        this.f56616i.setValue(Boolean.TRUE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v
    public StateFlow k() {
        return this.f56619l;
    }
}
