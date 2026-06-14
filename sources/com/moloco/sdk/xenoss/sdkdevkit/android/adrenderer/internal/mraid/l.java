package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid;

import android.content.Context;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.h0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.e0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.w;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.t0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.StateFlow;

/* JADX INFO: loaded from: classes10.dex */
public abstract class l implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f56452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final a0 f56453c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function0 f56454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Function1 f56455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Function1 f56456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final t0 f56457g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f56458h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final m f56459i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f56460j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final CoroutineScope f56461k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public g f56462l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public c0 f56463m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final e0 f56464n;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56465r;

        public a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return l.this.new a(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            g gVar;
            Object objG = pf.b.g();
            int i10 = this.f56465r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                m mVarC = l.this.C();
                String str = l.this.f56452b;
                this.f56465r = 1;
                obj = mVarC.a(str, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            h0 h0Var = (h0) obj;
            boolean z10 = h0Var instanceof h0.a;
            if (z10) {
                return h0Var;
            }
            m mVarC2 = l.this.C();
            l lVar = l.this;
            mVarC2.l(false, false, false, false, true);
            mVarC2.d(lVar.f56453c);
            mVarC2.a(((Boolean) lVar.f56464n.x().getValue()).booleanValue());
            mVarC2.f(((e0.a) lVar.f56464n.s().getValue()).a());
            lVar.g0(c0.f56385d);
            lVar.P();
            lVar.R();
            lVar.S();
            mVarC2.j();
            l lVar2 = l.this;
            if (h0Var instanceof h0.b) {
                MolocoLogger.info$default(MolocoLogger.INSTANCE, lVar2.f56460j, "Mraid Html data successfully loaded", null, false, 12, null);
                gVar = (g) ((h0.b) h0Var).a();
            } else {
                if (!z10) {
                    throw new lf.m();
                }
                MolocoLogger.error$default(MolocoLogger.INSTANCE, lVar2.f56460j, "Mraid Html data load failed.", null, false, 12, null);
                gVar = new g(null, 1, null);
            }
            lVar2.f56462l = gVar;
            return h0Var;
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56467r;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f56469a;

            static {
                int[] iArr = new int[a0.values().length];
                try {
                    iArr[a0.f56371d.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a0.f56370c.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f56469a = iArr;
            }
        }

        /* JADX INFO: renamed from: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.l$b$b, reason: collision with other inner class name */
        public static final class C0701b extends kotlin.coroutines.jvm.internal.k implements Function2 {

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public int f56470r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f56471s;

            public C0701b(Continuation continuation) {
                super(2, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final Object invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar, Continuation continuation) {
                return ((C0701b) create(dVar, continuation)).invokeSuspend(Unit.f93236a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Continuation create(Object obj, Continuation continuation) {
                C0701b c0701b = new C0701b(continuation);
                c0701b.f56471s = obj;
                return c0701b;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                pf.b.g();
                if (this.f56470r != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
                return kotlin.coroutines.jvm.internal.b.a(((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) this.f56471s) != null);
            }
        }

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
            return l.this.new b(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f56467r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                StateFlow stateFlowW = l.this.C().w();
                C0701b c0701b = new C0701b(null);
                this.f56467r = 1;
                obj = hg.i.y(stateFlowW, c0701b, this);
                if (obj == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d dVar = (com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj;
            if (dVar != null) {
                l lVar = l.this;
                int i11 = a.f56469a[lVar.f56453c.ordinal()];
                if (i11 == 1) {
                    lVar.E().invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.e.b(dVar));
                } else {
                    if (i11 != 2) {
                        throw new lf.m();
                    }
                    lVar.E().invoke(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.e.a(dVar));
                }
            }
            return Unit.f93236a;
        }
    }

    public static final class c extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56472r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f56473s;

        public c(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(w wVar, Continuation continuation) {
            return ((c) create(wVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            c cVar = l.this.new c(continuation);
            cVar.f56473s = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f56472r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            w wVar = (w) this.f56473s;
            if (Intrinsics.areEqual(wVar, w.a.f56527c)) {
                l.this.I();
            } else if (wVar instanceof w.d) {
                l.this.a0((w.d) wVar);
            } else if (!(wVar instanceof w.f)) {
                if (wVar instanceof w.c) {
                    l.this.Z((w.c) wVar);
                } else {
                    l.this.C().o(wVar, "unsupported command: " + wVar.b());
                }
            }
            return Unit.f93236a;
        }
    }

    public static final class d extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56475r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ boolean f56476s;

        public d(Continuation continuation) {
            super(2, continuation);
        }

        public final Object c(boolean z10, Continuation continuation) {
            return ((d) create(Boolean.valueOf(z10), continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            d dVar = l.this.new d(continuation);
            dVar.f56476s = ((Boolean) obj).booleanValue();
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return c(((Boolean) obj).booleanValue(), (Continuation) obj2);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f56475r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            l.this.C().a(this.f56476s);
            return Unit.f93236a;
        }
    }

    public static final class e extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f56478r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f56479s;

        public e(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Object invoke(e0.a aVar, Continuation continuation) {
            return ((e) create(aVar, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            e eVar = l.this.new e(continuation);
            eVar.f56479s = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            pf.b.g();
            if (this.f56478r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            l.this.C().f(((e0.a) this.f56479s).a());
            return Unit.f93236a;
        }
    }

    public l(Context context, String adm, a0 mraidPlacementType, Function0 onShowListenerClick, Function1 onClickthroughClick, Function1 onError, t0 externalLinkHandler, boolean z10, m mraidBridge) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(mraidPlacementType, "mraidPlacementType");
        Intrinsics.checkNotNullParameter(onShowListenerClick, "onShowListenerClick");
        Intrinsics.checkNotNullParameter(onClickthroughClick, "onClickthroughClick");
        Intrinsics.checkNotNullParameter(onError, "onError");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(mraidBridge, "mraidBridge");
        this.f56452b = adm;
        this.f56453c = mraidPlacementType;
        this.f56454d = onShowListenerClick;
        this.f56455e = onClickthroughClick;
        this.f56456f = onError;
        this.f56457g = externalLinkHandler;
        this.f56458h = z10;
        this.f56459i = mraidBridge;
        this.f56460j = "MraidBaseAd";
        CoroutineScope coroutineScopeA = kotlinx.coroutines.i.a(com.moloco.sdk.internal.scheduling.c.a().getMain());
        this.f56461k = coroutineScopeA;
        this.f56464n = new e0(mraidBridge.c(), context, coroutineScopeA);
    }

    public static final Unit U(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f93236a;
    }

    public static final Unit f0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.f93236a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o0() {
        return Unit.f93236a;
    }

    public final m C() {
        return this.f56459i;
    }

    public final Function1 E() {
        return this.f56456f;
    }

    public final Function0 H() {
        return this.f56454d;
    }

    public final void I() {
        if (((Boolean) this.f56464n.x().getValue()).booleanValue()) {
            p0();
        } else {
            this.f56459i.o(w.a.f56527c, "Can't close ad when mraid container is not visible to the user");
        }
    }

    public void J() {
    }

    public final void P() {
        eg.i.d(this.f56461k, null, null, new b(null), 3, null);
    }

    public final void R() {
        hg.i.F(hg.i.K(this.f56459i.v(), new c(null)), this.f56461k);
    }

    public final void S() {
        hg.i.F(hg.i.K(this.f56464n.x(), new d(null)), this.f56461k);
        hg.i.F(hg.i.K(this.f56464n.s(), new e(null)), this.f56461k);
    }

    public final void Z(w.c cVar) {
        if (this.f56458h) {
            this.f56459i.o(cVar, "expand() is force blocked for the current ad");
            return;
        }
        if (!((Boolean) this.f56464n.x().getValue()).booleanValue()) {
            this.f56459i.o(cVar, "Can't expand() when mraid container is not visible to the user");
            return;
        }
        if (this.f56463m != c0.f56385d) {
            this.f56459i.o(cVar, "In order to expand() mraid ad, container must be in Default view state");
            return;
        }
        if (this.f56453c == a0.f56371d) {
            this.f56459i.o(cVar, "expand() is not supported for interstitials");
        } else if (cVar.c() != null) {
            this.f56459i.o(cVar, "Two-part expand is not supported yet");
        } else {
            J();
            g0(c0.f56387f);
        }
    }

    public final void a0(w.d dVar) {
        if (!((Boolean) this.f56464n.x().getValue()).booleanValue()) {
            this.f56459i.o(dVar, "Can't open links when mraid container is not visible to the user");
            return;
        }
        Function1 function1 = this.f56455e;
        String string = dVar.c().toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        function1.invoke(string);
    }

    public final void b0(Function0 function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.f56454d = function0;
    }

    public final void c0(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f56455e = function1;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t
    public void destroy() {
        kotlinx.coroutines.i.f(this.f56461k, null, 1, null);
        this.f56459i.destroy();
        this.f56464n.destroy();
    }

    public final Object e0(Continuation continuation) {
        return eg.i.b(this.f56461k, null, null, new a(null), 3, null).await(continuation);
    }

    public final void g0(c0 c0Var) {
        this.f56463m = c0Var;
        if (c0Var != null) {
            this.f56459i.h(c0Var);
        }
    }

    public final void h0(Function1 function1) {
        Intrinsics.checkNotNullParameter(function1, "<set-?>");
        this.f56456f = function1;
    }

    public void p0() {
        if (this.f56463m == c0.f56387f) {
            g0(c0.f56385d);
        }
    }

    public /* synthetic */ l(Context context, String str, a0 a0Var, Function0 function0, Function1 function1, Function1 function12, t0 t0Var, boolean z10, m mVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, a0Var, (i10 & 8) != 0 ? new Function0() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.i
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return l.o0();
            }
        } : function0, (i10 & 16) != 0 ? new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.j
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.f0((String) obj);
            }
        } : function1, (i10 & 32) != 0 ? new Function1() { // from class: com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.mraid.k
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return l.U((com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.errors.d) obj);
            }
        } : function12, t0Var, (i10 & 128) != 0 ? false : z10, mVar);
    }
}
