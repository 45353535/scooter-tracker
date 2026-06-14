package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion;

import android.content.Context;
import androidx.compose.ui.geometry.Offset;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.e;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.k;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import hg.c0;
import hg.l0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class e implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c f57770b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Context f57771c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f57772d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t0 f57773e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f57774f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final n f57775g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CoroutineScope f57776h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final f f57777i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public a.AbstractC0780a.f f57778j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final i f57779k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final MutableSharedFlow f57780l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Flow f57781m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final boolean f57782n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k f57783o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final MutableStateFlow f57784p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final StateFlow f57785q;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public Object f57786r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f57787s;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        public static final Unit c(e eVar) {
            eVar.f57779k.d(eVar.f57778j);
            eVar.r(b.a.f57764a);
            return Unit.f93236a;
        }

        public static final Unit i(e eVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c cVar) {
            eVar.t(cVar);
            return Unit.f93236a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return e.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            e eVar;
            Object objG = pf.b.g();
            int i10 = this.f57787s;
            if (i10 == 0) {
                kotlin.d.b(obj);
                e eVar2 = e.this;
                a0 a0VarE = eVar2.f57770b.e();
                Context context = e.this.f57771c;
                com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar = e.this.f57772d;
                t0 t0Var = e.this.f57773e;
                int iF = e.this.f57770b.f();
                int iD = e.this.f57770b.d();
                final e eVar3 = e.this;
                Function0 function0 = new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return e.a.c(eVar3);
                    }
                };
                final e eVar4 = e.this;
                Function1 function1 = new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.d
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return e.a.i(eVar4, (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c) obj2);
                    }
                };
                boolean z10 = e.this.f57774f;
                n nVar = e.this.f57775g;
                this.f57786r = eVar2;
                this.f57787s = 1;
                Object objB = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.n.b(a0VarE, context, aVar, t0Var, iF, iD, function0, function1, z10, nVar, this);
                if (objB == objG) {
                    return objG;
                }
                eVar = eVar2;
                obj = objB;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                eVar = (e) this.f57786r;
                kotlin.d.b(obj);
            }
            eVar.v((k) obj);
            return Unit.f93236a;
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f57789r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b f57791t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b bVar, Continuation continuation) {
            super(2, continuation);
            this.f57791t = bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return e.this.new b(this.f57791t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f57789r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                MutableSharedFlow mutableSharedFlow = e.this.f57780l;
                com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b bVar = this.f57791t;
                this.f57789r = 1;
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

    public /* synthetic */ e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c cVar, int i10, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, t0 t0Var, boolean z10, n nVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(cVar, i10, context, aVar, t0Var, z10, nVar);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public boolean J() {
        return this.f57782n;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j
    public StateFlow K() {
        return this.f57785q;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.a
    public Flow a() {
        return this.f57781m;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j
    public void b() {
        this.f57779k.a();
        r(b.c.f57766a);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    public void destroy() {
        kotlinx.coroutines.i.f(this.f57776h, null, 1, null);
        k kVar = this.f57783o;
        if (kVar != null) {
            kVar.destroy();
        }
        v(null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j
    public void j(a.AbstractC0780a.f position) {
        Intrinsics.checkNotNullParameter(position, "position");
        this.f57778j = position;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public void k(a.AbstractC0780a.f position) {
        Intrinsics.checkNotNullParameter(position, "position");
        String strA = this.f57770b.a();
        if (strA != null) {
            this.f57779k.d(position);
            r(b.a.f57764a);
            this.f57775g.a(strA);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    public StateFlow l() {
        return this.f57777i.l();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q
    public void m(a.AbstractC0780a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.f57779k.c(button);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q
    public void p(a.AbstractC0780a.c.EnumC0782a buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.f57779k.b(buttonType);
    }

    public final Job r(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.b bVar) {
        return eg.i.d(this.f57776h, null, null, new b(bVar, null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.f
    public void reset() {
        this.f57777i.reset();
    }

    public void t(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.c error) {
        Intrinsics.checkNotNullParameter(error, "error");
        r(new b.d(error));
    }

    public final void v(k kVar) {
        this.f57783o = kVar;
        this.f57784p.setValue(kVar != null ? kVar.k() : null);
    }

    public e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.c companion, int i10, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, t0 externalLinkHandler, boolean z10, n linkHandler) {
        Intrinsics.checkNotNullParameter(companion, "companion");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        this.f57770b = companion;
        this.f57771c = context;
        this.f57772d = customUserEventBuilderService;
        this.f57773e = externalLinkHandler;
        this.f57774f = z10;
        this.f57775g = linkHandler;
        CoroutineScope coroutineScopeA = kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f57776h = coroutineScopeA;
        this.f57777i = h.a(i10, coroutineScopeA);
        this.f57778j = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.utils.c.f57289a.c(Offset.INSTANCE.m1387getZeroF1C5BW0());
        this.f57779k = new i(customUserEventBuilderService, companion.b(), companion.c(), null, null, 24, null);
        MutableSharedFlow mutableSharedFlowB = c0.b(0, 0, null, 7, null);
        this.f57780l = mutableSharedFlowB;
        this.f57781m = mutableSharedFlowB;
        this.f57782n = companion.a() != null;
        k kVar = this.f57783o;
        MutableStateFlow mutableStateFlowA = l0.a(kVar != null ? kVar.k() : null);
        this.f57784p = mutableStateFlowA;
        this.f57785q = mutableStateFlowA;
        eg.i.d(coroutineScopeA, null, null, new a(null), 3, null);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.companion.j
    public void y() {
        r(b.C0752b.f57765a);
    }
}
