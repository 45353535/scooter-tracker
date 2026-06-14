package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import android.view.View;
import com.moloco.sdk.internal.h0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes10.dex */
public final class p extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Context f56587h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f56588i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f0 f56589j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final t0 f56590k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final CoroutineScope f56591l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final o f56592m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r f56593n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a f56594o;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56595r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f56596s;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar, Continuation continuation) {
            return ((a) create(bVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = p.this.new a(continuation);
            aVar.f56596s = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f56595r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b bVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.b) this.f56596s;
            if (Intrinsics.areEqual(bVar, b.i.f57684a)) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0) p.this.getAdShowListener();
                if (e0Var != null) {
                    e0Var.a(true);
                }
            } else if (Intrinsics.areEqual(bVar, b.c.f57678a)) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var2 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0) p.this.getAdShowListener();
                if (e0Var2 != null) {
                    e0Var2.a(false);
                }
            } else if (Intrinsics.areEqual(bVar, b.a.f57676a)) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var3 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0) p.this.getAdShowListener();
                if (e0Var3 != null) {
                    e0Var3.a();
                }
            } else if (bVar instanceof b.f) {
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var4 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0) p.this.getAdShowListener();
                if (e0Var4 != null) {
                    e0Var4.a(((b.f) bVar).a());
                }
            } else if (!Intrinsics.areEqual(bVar, b.g.f57682a) && !Intrinsics.areEqual(bVar, b.C0745b.f57677a) && !Intrinsics.areEqual(bVar, b.d.f57679a) && !Intrinsics.areEqual(bVar, b.h.f57683a) && !Intrinsics.areEqual(bVar, b.e.f57680a)) {
                throw new lf.m();
            }
            return Unit.f93236a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.f0 options, t0 externalLinkHandler, CoroutineScope scope, o adLoader) {
        super(context, scope);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(scope, "scope");
        Intrinsics.checkNotNullParameter(adLoader, "adLoader");
        this.f56587h = context;
        this.f56588i = customUserEventBuilderService;
        this.f56589j = options;
        this.f56590k = externalLinkHandler;
        this.f56591l = scope;
        this.f56592m = adLoader;
        setTag("MolocoVastBannerView");
        this.f56593n = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r.f58894b;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    public void destroy() {
        super.destroy();
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.f56594o;
        if (aVar != null) {
            aVar.destroy();
        }
        this.f56594o = null;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.s
    @NotNull
    public com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.r getCreativeType() {
        return this.f56593n;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    public void p() {
        com.moloco.sdk.internal.h0 h0VarC = getAdLoader().c();
        if (h0VarC instanceof h0.a) {
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) ((h0.a) h0VarC).a();
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0 e0Var = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.e0) getAdShowListener();
            if (e0Var != null) {
                e0Var.a(cVar);
                return;
            }
            return;
        }
        if (!(h0VarC instanceof h0.b)) {
            throw new lf.m();
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVarB = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.g.b((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.a) ((h0.b) h0VarC).a(), this.f56590k, this.f56587h, this.f56588i, this.f56589j.i(), this.f56589j.g(), this.f56589j.h(), this.f56589j.e(), this.f56589j.f(), this.f56589j.d(), this.f56589j.c(), new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l(false, false, false).a(this.f56590k, null));
        this.f56594o = aVarB;
        setAdView((View) this.f56589j.j().invoke(this.f56587h, aVarB));
        s();
        aVarB.d();
    }

    public final void s() {
        Flow flowA;
        Flow flowK;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.ad.a aVar = this.f56594o;
        if (aVar == null || (flowA = aVar.a()) == null || (flowK = hg.i.K(flowA, new a(null))) == null) {
            return;
        }
        hg.i.F(flowK, this.f56591l);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j
    @NotNull
    public o getAdLoader() {
        return this.f56592m;
    }
}
