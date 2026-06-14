package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.internal.h0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.MraidActivity;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class e1 implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f55991b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 f55992c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final y0 f55993d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l f55994e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.q f55995f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final MraidActivity.Companion f55996g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f55997h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.a f55998i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r f55999j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CoroutineScope f56000k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public l.a f56001l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n f56002m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f56003n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final MutableStateFlow f56004o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final StateFlow f56005p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final MutableStateFlow f56006q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final StateFlow f56007r;

    public /* synthetic */ class a extends kotlin.jvm.internal.y implements Function1 {
        public a(Object obj) {
            super(1, obj, e1.class, "onError", "onError(Lcom/moloco/sdk/xenoss/sdkdevkit/android/adrenderer/internal/errors/MraidAdError;)V", 0);
        }

        public final void a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            ((e1) this.receiver).p(p02);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj);
            return Unit.f93236a;
        }
    }

    public /* synthetic */ class b extends kotlin.jvm.internal.y implements Function0 {
        public b(Object obj) {
            super(0, obj, e1.class, "destroy", "destroy()V", 0);
        }

        public final void a() {
            ((e1) this.receiver).destroy();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public /* synthetic */ class c extends kotlin.jvm.internal.y implements Function0 {
        public c(Object obj) {
            super(0, obj, e1.class, "onForciblyClosed", "onForciblyClosed()V", 0);
        }

        public final void a() {
            ((e1) this.receiver).x();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public e1(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g0 watermark, y0 mraidAdLoader, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l mraidBaseAd, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.q mraidFullscreenController, MraidActivity.Companion mraidActivity, String str, com.moloco.sdk.acm.recorder.a metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(mraidAdLoader, "mraidAdLoader");
        Intrinsics.checkNotNullParameter(mraidBaseAd, "mraidBaseAd");
        Intrinsics.checkNotNullParameter(mraidFullscreenController, "mraidFullscreenController");
        Intrinsics.checkNotNullParameter(mraidActivity, "mraidActivity");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f55991b = context;
        this.f55992c = watermark;
        this.f55993d = mraidAdLoader;
        this.f55994e = mraidBaseAd;
        this.f55995f = mraidFullscreenController;
        this.f55996g = mraidActivity;
        this.f55997h = str;
        this.f55998i = metricsRecorder;
        this.f55999j = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r.f58895c;
        this.f56000k = kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        Boolean bool = Boolean.FALSE;
        MutableStateFlow mutableStateFlowA = hg.l0.a(bool);
        this.f56004o = mutableStateFlowA;
        this.f56005p = mutableStateFlowA;
        MutableStateFlow mutableStateFlowA2 = hg.l0.a(bool);
        this.f56006q = mutableStateFlowA2;
        this.f56007r = mutableStateFlowA2;
    }

    public static final Unit s(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n nVar) {
        if (nVar != null) {
            nVar.a();
        }
        return Unit.f93236a;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    public void destroy() {
        kotlinx.coroutines.i.f(this.f56000k, null, 1, null);
        this.f55994e.destroy();
        this.f56004o.setValue(Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r getCreativeType() {
        return this.f55999j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public StateFlow isLoaded() {
        return this.f55993d.isLoaded();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l
    public void j(long j10, l.a aVar) {
        this.f56001l = aVar;
        this.f55994e.h0(new a(this));
        this.f55993d.j(j10, aVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.v
    public StateFlow k() {
        return this.f56007r;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.k
    public StateFlow l() {
        return this.f56005p;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public void b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.o options, final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n nVar) {
        Intrinsics.checkNotNullParameter(options, "options");
        this.f55994e.b0(new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.c1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e1.s(nVar);
            }
        });
        this.f55994e.c0(new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.d1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return e1.k(this.f55989b, (String) obj);
            }
        });
        this.f56002m = nVar;
        this.f56003n = true;
        com.moloco.sdk.internal.h0 h0VarC = this.f55993d.c();
        if (h0VarC instanceof h0.a) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) ((h0.a) h0VarC).a();
            if (nVar != null) {
                nVar.a(dVar);
                return;
            }
            return;
        }
        if (!(h0VarC instanceof h0.b)) {
            throw new lf.m();
        }
        if (this.f55996g.c((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.g) ((h0.b) h0VarC).a(), this.f55995f, this.f55991b, options, this.f55992c, new b(this), new c(this), this.f55994e.H(), this.f55997h, this.f55998i)) {
            this.f56004o.setValue(Boolean.TRUE);
        } else if (nVar != null) {
            nVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d.f56032k);
        }
    }

    public final void p(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar) {
        if (this.f56003n) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.n nVar = this.f56002m;
            if (nVar != null) {
                nVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.e.b(dVar));
                return;
            }
            return;
        }
        l.a aVar = this.f56001l;
        if (aVar != null) {
            aVar.a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.e.b(dVar));
        }
    }

    public final void x() {
        this.f56006q.setValue(Boolean.TRUE);
    }

    public static final Unit k(e1 e1Var, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        e1Var.f55995f.c(url, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.h.a());
        return Unit.f93236a;
    }
}
