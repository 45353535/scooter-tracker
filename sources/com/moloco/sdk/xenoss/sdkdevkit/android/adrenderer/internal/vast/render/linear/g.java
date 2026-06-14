package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear;

import android.content.Context;
import com.moloco.sdk.service_locator.b;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.a0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.d;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.o;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.t;
import com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a;
import hg.c0;
import hg.g0;
import hg.l0;
import java.util.List;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public final class g implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c {
    public boolean A;
    public int B;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f f58241b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f58242c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f58243d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a f58244e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t0 f58245f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n f58246g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final CoroutineScope f58247h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final MutableSharedFlow f58248i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Flow f58249j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f58250k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final MutableStateFlow f58251l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final StateFlow f58252m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final MutableStateFlow f58253n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final StateFlow f58254o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f58255p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f58256q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final boolean f58257r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.b f58258s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final p f58259t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final MutableStateFlow f58260u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final StateFlow f58261v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final MutableStateFlow f58262w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final StateFlow f58263x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final l f58264y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final i f58265z;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58266r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ boolean f58267s;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        public final Object c(boolean z10, Continuation continuation) {
            return ((a) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            a aVar = g.this.new a(continuation);
            aVar.f58267s = ((Boolean) obj).booleanValue();
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return c(((Boolean) obj).booleanValue(), (Continuation) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f58266r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            if (this.f58267s) {
                g.this.f58264y.g(kotlin.coroutines.jvm.internal.b.d(g.this.C()), g.this.f58250k);
            } else {
                g.this.f58264y.f(kotlin.coroutines.jvm.internal.b.d(g.this.C()), g.this.f58250k);
            }
            return Unit.f93236a;
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58269r;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ d f58271t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(d dVar, Continuation continuation) {
            super(2, continuation);
            this.f58271t = dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return g.this.new b(this.f58271t, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f58269r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                MutableSharedFlow mutableSharedFlow = g.this.f58248i;
                d dVar = this.f58271t;
                this.f58269r = 1;
                if (mutableSharedFlow.emit(dVar, this) == objG) {
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

    public static final class c extends kotlin.coroutines.jvm.internal.k implements Function3 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f58272r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ boolean f58273s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f58274t;

        public c(Continuation continuation) {
            super(3, continuation);
        }

        public final Object c(boolean z10, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar, Continuation continuation) {
            c cVar = new c(continuation);
            cVar.f58273s = z10;
            cVar.f58274t = jVar;
            return cVar.invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return c(((Boolean) obj).booleanValue(), (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j) obj2, (Continuation) obj3);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f58272r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            boolean z10 = this.f58273s;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j jVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.j) this.f58274t;
            if (z10) {
                return jVar;
            }
            return null;
        }
    }

    public g(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f linear, int i10, boolean z10, Boolean bool, int i11, boolean z11, boolean z12, Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, t0 externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.n linkHandler) {
        String absolutePath;
        Intrinsics.checkNotNullParameter(linear, "linear");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(linkHandler, "linkHandler");
        this.f58241b = linear;
        this.f58242c = z11;
        this.f58243d = z12;
        this.f58244e = customUserEventBuilderService;
        this.f58245f = externalLinkHandler;
        this.f58246g = linkHandler;
        CoroutineScope coroutineScopeA = kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f58247h = coroutineScopeA;
        MutableSharedFlow mutableSharedFlowB = c0.b(0, 0, null, 7, null);
        this.f58248i = mutableSharedFlowB;
        this.f58249j = mutableSharedFlowB;
        this.f58250k = linear.g();
        MutableStateFlow mutableStateFlowA = l0.a(Boolean.valueOf(z10));
        this.f58251l = mutableStateFlowA;
        this.f58252m = mutableStateFlowA;
        MutableStateFlow mutableStateFlowA2 = l0.a(new o(Long.valueOf(i10)));
        this.f58253n = mutableStateFlowA2;
        this.f58254o = hg.i.c(mutableStateFlowA2);
        this.f58255p = b.g.f55823a.b().d();
        if (L()) {
            absolutePath = linear.g();
        } else {
            absolutePath = linear.e().getAbsolutePath();
            Intrinsics.checkNotNullExpressionValue(absolutePath, "getAbsolutePath(...)");
        }
        this.f58256q = absolutePath;
        this.f58257r = linear.c() != null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e eVarD = linear.d();
        List listB = eVarD != null ? eVarD.b() : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e eVarD2 = linear.d();
        this.f58258s = new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.b(listB, eVarD2 != null ? eVarD2.g() : null, null, 4, null);
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e eVarD3 = linear.d();
        a0 a0VarF = eVarD3 != null ? eVarD3.f() : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e eVarD4 = linear.d();
        Integer numValueOf = eVarD4 != null ? Integer.valueOf(eVarD4.h()) : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e eVarD5 = linear.d();
        Integer numValueOf2 = eVarD5 != null ? Integer.valueOf(eVarD5.d()) : null;
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e eVarD6 = linear.d();
        p pVarA = t.a(a0VarF, numValueOf, numValueOf2, eVarD6 != null ? eVarD6.a() : null, coroutineScopeA, context, customUserEventBuilderService, externalLinkHandler, new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.e
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.X(this.f58239b);
            }
        }, new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.f
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g.Y(this.f58240b);
            }
        });
        this.f58259t = pVarA;
        Boolean bool2 = Boolean.FALSE;
        MutableStateFlow mutableStateFlowA3 = l0.a(bool2);
        this.f58260u = mutableStateFlowA3;
        this.f58261v = hg.i.T(hg.i.m(mutableStateFlowA3, pVarA.O(), new c(null)), coroutineScopeA, g0.a.b(g0.f73226a, 0L, 0L, 3, null), null);
        MutableStateFlow mutableStateFlowA4 = l0.a(bool2);
        this.f58262w = mutableStateFlowA4;
        this.f58263x = mutableStateFlowA4;
        this.f58264y = l.f58288p.a(linear.i(), customUserEventBuilderService);
        hg.i.F(hg.i.K(isPlaying(), new a(null)), coroutineScopeA);
        this.f58265z = k.d(bool, i11, linear.h());
    }

    public static final Unit X(g gVar) {
        gVar.f58258s.a(Integer.valueOf(gVar.C()), gVar.f58250k);
        return Unit.f93236a;
    }

    public static final Unit Y(g gVar) {
        gVar.f58258s.b(Integer.valueOf(gVar.C()), gVar.f58250k);
        return Unit.f93236a;
    }

    public int C() {
        return this.B;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m
    public void D() {
        this.f58265z.s();
    }

    public final void E() {
        this.f58260u.setValue(Boolean.FALSE);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m
    public void F() {
        this.f58265z.pause();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m
    public String G() {
        return this.f58256q;
    }

    public final void H() {
        if (this.f58243d) {
            T(false, h.a());
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public boolean J() {
        return this.f58257r;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m
    public boolean L() {
        return this.f58255p;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p
    public StateFlow O() {
        return this.f58261v;
    }

    public final void P() {
        if (this.f58242c) {
            T(false, h.a());
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m
    public StateFlow Q() {
        return this.f58254o;
    }

    public final Job S(d dVar) {
        return eg.i.d(this.f58247h, null, null, new b(dVar, null), 3, null);
    }

    public final void T(boolean z10, a.AbstractC0780a.f fVar) {
        String strC = this.f58241b.c();
        if (strC != null) {
            if (z10) {
                this.f58264y.c(fVar, Integer.valueOf(C()), this.f58250k);
            }
            this.f58246g.a(strC);
            S(d.a.f58234a);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void V(int r9, int r10) {
        /*
            r8 = this;
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.f r0 = r8.f58241b
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.e r0 = r0.d()
            if (r0 != 0) goto L9
            return
        L9:
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t r1 = r0.e()
            java.lang.Long r0 = r0.c()
            boolean r2 = r1 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t.a
            r3 = 0
            if (r2 == 0) goto L20
            int r2 = r10 / 100
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t$a r1 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t.a) r1
            int r1 = r1.a()
            int r2 = r2 * r1
            goto L2d
        L20:
            boolean r2 = r1 instanceof com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t.b
            if (r2 == 0) goto L2c
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t$b r1 = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.model.t.b) r1
            long r1 = r1.a()
            int r2 = (int) r1
            goto L2d
        L2c:
            r2 = r3
        L2d:
            kotlin.ranges.IntRange r1 = new kotlin.ranges.IntRange
            r1.<init>(r3, r10)
            int r10 = kotlin.ranges.g.o(r2, r1)
            kotlinx.coroutines.flow.MutableStateFlow r1 = r8.f58260u
            if (r0 != 0) goto L3d
            if (r9 < r10) goto L4d
            goto L4c
        L3d:
            long r4 = (long) r10
            long r6 = r0.longValue()
            long r6 = r6 + r4
            long r9 = (long) r9
            int r0 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r0 > 0) goto L4d
            int r9 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r9 > 0) goto L4d
        L4c:
            r3 = 1
        L4d:
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            r1.setValue(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.g.V(int, int):void");
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c
    public Flow a() {
        return this.f58249j;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m
    public void b() {
        S(d.c.f58236a);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m
    public void c(boolean z10) {
        this.f58251l.setValue(Boolean.valueOf(z10));
        l lVar = this.f58264y;
        if (z10) {
            lVar.e(Integer.valueOf(C()), this.f58250k);
        } else {
            lVar.j(Integer.valueOf(C()), this.f58250k);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    public void destroy() {
        kotlinx.coroutines.i.f(this.f58247h, null, 1, null);
        this.f58259t.destroy();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m
    public void e(boolean z10) {
        this.f58262w.setValue(Boolean.valueOf(z10));
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m
    public void h() {
        this.A = true;
        this.f58264y.i(Integer.valueOf(C()), this.f58250k);
        String strC = this.f58241b.c();
        if (strC != null) {
            this.f58246g.c(strC);
        }
        S(d.e.f58238a);
        P();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p
    public void i() {
        this.f58259t.i();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c
    public StateFlow isPlaying() {
        return this.f58263x;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.b
    public void k(a.AbstractC0780a.f position) {
        Intrinsics.checkNotNullParameter(position, "position");
        T(true, position);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.d
    public StateFlow l() {
        return this.f58265z.l();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q
    public void m(a.AbstractC0780a.c button) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.f58264y.b(button);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m
    public void n(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.i progress) {
        Pair pair;
        Intrinsics.checkNotNullParameter(progress, "progress");
        boolean z10 = progress instanceof i.a;
        if (z10) {
            int iA = (int) ((i.a) progress).a();
            pair = TuplesKt.to(Integer.valueOf(iA), Integer.valueOf(iA));
        } else if (progress instanceof i.c) {
            i.c cVar = (i.c) progress;
            pair = TuplesKt.to(Integer.valueOf((int) cVar.a()), Integer.valueOf((int) cVar.b()));
        } else {
            if (!(progress instanceof i.d)) {
                if (!Intrinsics.areEqual(progress, i.b.f58219a)) {
                    throw new lf.m();
                }
                return;
            }
            pair = TuplesKt.to(0, Integer.valueOf((int) ((i.d) progress).a()));
        }
        int iIntValue = ((Number) pair.component1()).intValue();
        int iIntValue2 = ((Number) pair.component2()).intValue();
        this.B = iIntValue;
        if (!this.A && !(progress instanceof i.d)) {
            this.f58264y.d(this.f58250k, iIntValue, iIntValue2);
        }
        if (z10) {
            if (!this.A) {
                S(d.b.f58235a);
                String strC = this.f58241b.c();
                if (strC != null) {
                    this.f58246g.b(strC);
                }
                H();
            }
            this.A = false;
        }
        this.f58265z.a(iIntValue, iIntValue2);
        V(iIntValue, iIntValue2);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.q
    public void p(a.AbstractC0780a.c.EnumC0782a buttonType) {
        Intrinsics.checkNotNullParameter(buttonType, "buttonType");
        this.f58264y.a(buttonType);
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m
    public StateFlow q() {
        return this.f58252m;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.c
    public void r() {
        if (!((Boolean) isPlaying().getValue()).booleanValue() && ((Number) ((o) this.f58253n.getValue()).a()).longValue() == 0 && C() == 0) {
            return;
        }
        this.f58253n.setValue(new o(0L));
        this.f58264y.h(Integer.valueOf(C()), this.f58250k);
        this.A = false;
        this.B = 0;
        this.f58265z.I();
        E();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.p
    public void u() {
        this.f58259t.u();
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.render.linear.m
    public void i(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.l error) {
        Intrinsics.checkNotNullParameter(error, "error");
        S(new d.C0769d(error));
    }
}
