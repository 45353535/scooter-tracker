package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec;

import android.content.Context;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.k0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.s0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.h;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import hg.c0;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.i;

/* JADX INFO: loaded from: classes10.dex */
public final class c implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final k0 f58165b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t0 f58166c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f58167d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CoroutineScope f58168e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final f f58169f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final d f58170g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final MutableSharedFlow f58171h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Flow f58172i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final boolean f58173j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f58174k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final s0 f58175l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final p f58176m;

    public static final class a extends k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58177r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b f58179t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, Continuation continuation) {
            super(2, continuation);
            this.f58179t = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return c.this.new a(this.f58179t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f58177r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                MutableSharedFlow mutableSharedFlow = c.this.f58171h;
                b bVar = this.f58179t;
                this.f58177r = 1;
                if (mutableSharedFlow.emit(bVar, this) == objG) {
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

    public /* synthetic */ c(k0 k0Var, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e eVar, int i10, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, t0 t0Var, n nVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(k0Var, eVar, i10, context, aVar, t0Var, nVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public boolean J() {
        return this.f58173j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e
    public s0 M() {
        return this.f58175l;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p
    public StateFlow O() {
        return this.f58176m.O();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a
    public Flow a() {
        return this.f58172i;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e
    public void b() {
        this.f58170g.a();
        q(b.f58161b);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    public void destroy() {
        i.f(this.f58168e, null, 1, null);
        this.f58176m.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.e
    public String g() {
        return this.f58174k;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p
    public void i() {
        this.f58176m.i();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public void k(a.AbstractC0780a.f position) {
        Intrinsics.checkNotNullParameter(position, "position");
        String strF = this.f58165b.f();
        if (strF != null) {
            this.f58170g.d(position);
            this.f58167d.a(strF);
            q(b.f58162c);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    public StateFlow l() {
        return this.f58169f.l();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q
    public void m(a.AbstractC0780a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.f58170g.c(button);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q
    public void p(a.AbstractC0780a.c.EnumC0782a buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.f58170g.b(buttonType);
    }

    public final Job q(b bVar) {
        return eg.i.d(this.f58168e, null, null, new a(bVar, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.f
    public void reset() {
        this.f58169f.reset();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.dec.a
    public void t() {
        this.f58170g.e();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p
    public void u() {
        this.f58176m.u();
    }

    public c(k0 dec, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e eVar, int i10, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, t0 externalLinkHandler, n linkHandler) {
        Intrinsics.checkNotNullParameter(dec, "dec");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        this.f58165b = dec;
        this.f58166c = externalLinkHandler;
        this.f58167d = linkHandler;
        CoroutineScope coroutineScopeA = i.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f58168e = coroutineScopeA;
        this.f58169f = h.a(i10, coroutineScopeA);
        this.f58170g = new d(customUserEventBuilderService, CollectionsKt.listOfNotNull(dec.e()), CollectionsKt.listOfNotNull(dec.j()), CollectionsKt.listOfNotNull(dec.k()), null, null, 48, null);
        MutableSharedFlow mutableSharedFlowB = c0.b(0, 0, null, 7, null);
        this.f58171h = mutableSharedFlowB;
        this.f58172i = mutableSharedFlowB;
        this.f58173j = dec.f() != null;
        this.f58174k = dec.c();
        this.f58175l = new s0(dec.d(), dec.h(), dec.g(), dec.i());
        this.f58176m = t.a(eVar != null ? eVar.f() : null, eVar != null ? Integer.valueOf(eVar.h()) : null, eVar != null ? Integer.valueOf(eVar.d()) : null, eVar != null ? eVar.a() : null, coroutineScopeA, context, customUserEventBuilderService, externalLinkHandler, null, null);
    }
}
