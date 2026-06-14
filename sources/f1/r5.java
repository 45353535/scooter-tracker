package f1;

import android.view.ViewGroup;
import f1.bf;
import f1.z2;
import f1.zb;
import g1.a;
import java.net.URL;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* JADX INFO: loaded from: classes6.dex */
public final class r5 implements u7, pc, a4, zb, h6, ag {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bf f70941b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i f70942c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final m f70943d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q1 f70944e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t2 f70945f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m8 f70946g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final m3 f70947h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final cg f70948i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final of f70949j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final da f70950k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q7 f70951l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final b1.e f70952m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final CoroutineScope f70953n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ag f70954o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final h1.a f70955p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public y6 f70956q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public la f70957r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Map f70958s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final c f70959t;

    public static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f70960r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ ViewGroup f70961s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ViewGroup viewGroup, Continuation continuation) {
            super(2, continuation);
            this.f70961s = viewGroup;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((a) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new a(this.f70961s, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objG = pf.b.g();
            int i10 = this.f70960r;
            if (i10 == 0) {
                kotlin.d.b(obj);
                this.f70960r = 1;
                if (eg.k0.a(1000L, this) == objG) {
                    return objG;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.d.b(obj);
            }
            this.f70961s.removeAllViews();
            this.f70961s.invalidate();
            return Unit.f93236a;
        }
    }

    public static final class b extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f70962r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public final /* synthetic */ la f70963s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public final /* synthetic */ r5 f70964t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public final /* synthetic */ i6 f70965u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(la laVar, r5 r5Var, i6 i6Var, Continuation continuation) {
            super(2, continuation);
            this.f70963s = laVar;
            this.f70964t = r5Var;
            this.f70965u = i6Var;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(CoroutineScope coroutineScope, Continuation continuation) {
            return ((b) create(coroutineScope, continuation)).invokeSuspend(Unit.f93236a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Continuation create(Object obj, Continuation continuation) {
            return new b(this.f70963s, this.f70964t, this.f70965u, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Unit unit;
            pf.b.g();
            if (this.f70962r != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.d.b(obj);
            la laVar = this.f70963s;
            if (laVar != null) {
                laVar.w();
                unit = Unit.f93236a;
            } else {
                unit = null;
            }
            if (unit == null) {
                this.f70964t.V(this.f70965u, a.b.B);
            }
            return Unit.f93236a;
        }
    }

    public static final class c implements r1 {
        public c() {
        }

        @Override // f1.r1
        public void a() {
            la laVar = r5.this.f70957r;
            if (laVar != null) {
                laVar.M(a.b.E);
            }
        }
    }

    public r5(bf adType, i reachability, m fileCache, q1 videoRepository, t2 impressionBuilder, m8 adUnitRendererShowRequest, m3 openMeasurementController, cg viewProtocolBuilder, of rendererActivityBridge, da nativeBridgeCommand, q7 templateLoader, b1.e eVar, CoroutineScope uiScope, ag eventTracker, h1.a endpointRepository) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(reachability, "reachability");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(videoRepository, "videoRepository");
        Intrinsics.checkNotNullParameter(impressionBuilder, "impressionBuilder");
        Intrinsics.checkNotNullParameter(adUnitRendererShowRequest, "adUnitRendererShowRequest");
        Intrinsics.checkNotNullParameter(openMeasurementController, "openMeasurementController");
        Intrinsics.checkNotNullParameter(viewProtocolBuilder, "viewProtocolBuilder");
        Intrinsics.checkNotNullParameter(rendererActivityBridge, "rendererActivityBridge");
        Intrinsics.checkNotNullParameter(nativeBridgeCommand, "nativeBridgeCommand");
        Intrinsics.checkNotNullParameter(templateLoader, "templateLoader");
        Intrinsics.checkNotNullParameter(uiScope, "uiScope");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(endpointRepository, "endpointRepository");
        this.f70941b = adType;
        this.f70942c = reachability;
        this.f70943d = fileCache;
        this.f70944e = videoRepository;
        this.f70945f = impressionBuilder;
        this.f70946g = adUnitRendererShowRequest;
        this.f70947h = openMeasurementController;
        this.f70948i = viewProtocolBuilder;
        this.f70949j = rendererActivityBridge;
        this.f70950k = nativeBridgeCommand;
        this.f70951l = templateLoader;
        this.f70952m = eVar;
        this.f70953n = uiScope;
        this.f70954o = eventTracker;
        this.f70955p = endpointRepository;
        this.f70958s = new LinkedHashMap();
        this.f70959t = new c();
    }

    public static final void L(r5 this$0, i6 appRequest, String it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(appRequest, "$appRequest");
        Intrinsics.checkNotNullParameter(it, "it");
        this$0.X(appRequest);
    }

    public static final void M(r5 this$0, la it) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(it, "$it");
        this$0.P(it);
    }

    private final String R(i6 i6Var) {
        dg dgVarA;
        if (i6Var == null || (dgVarA = i6Var.a()) == null) {
            return null;
        }
        return dgVarA.r();
    }

    private final void S(i6 i6Var, a.b bVar) {
        Unit unit;
        y6 y6Var = this.f70956q;
        if (y6Var != null) {
            y6Var.c(R(i6Var), bVar);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.e("Missing AdUnitRendererAdCallback while sending onShowFailure with error: " + bVar, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V(i6 i6Var, a.b bVar) {
        S(i6Var, bVar);
        if (bVar == a.b.f72120h) {
            return;
        }
        String strB = this.f70941b.b();
        dg dgVarA = i6Var.a();
        String strF = dgVarA != null ? dgVarA.f() : null;
        eg.j("reportError: adTypeTraits: " + strB + " reason: cache  format: web error: " + bVar + " adId: " + strF + " appRequest.location: " + i6Var.i(), null, 2, null);
    }

    private final void W(i6 i6Var) {
        i6Var.g(false);
        i6Var.c(null);
    }

    @Override // f1.zb
    public void A() {
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.b0();
        }
    }

    @Override // f1.zb
    public String B() {
        String strY;
        la laVar = this.f70957r;
        return (laVar == null || (strY = laVar.Y()) == null) ? "" : strY;
    }

    @Override // f1.zb
    public String C() {
        String strX;
        la laVar = this.f70957r;
        return (laVar == null || (strX = laVar.X()) == null) ? "" : strX;
    }

    @Override // f1.a4
    public void D() {
        la laVar = this.f70957r;
        if ((laVar != null ? laVar.S() : null) != wd.f71450e || Intrinsics.areEqual(this.f70941b, bf.a.f69483g)) {
            return;
        }
        this.f70949j.finishActivity();
    }

    public final void E() {
        try {
            la laVar = this.f70957r;
            if (laVar != null) {
                this.f70947h.f();
                ViewGroup viewGroupI = laVar.i();
                if (viewGroupI != null) {
                    eg.i.d(this.f70953n, null, null, new a(viewGroupI, null), 3, null);
                }
                laVar.C();
                this.f70957r = null;
                this.f70956q = null;
            }
        } catch (Exception e10) {
            eg.i("detachBannerImpression error", e10);
        }
    }

    public final b1.e F() {
        return this.f70952m;
    }

    public final int G() {
        la laVar = this.f70957r;
        if (laVar != null) {
            return laVar.Z();
        }
        return -1;
    }

    public boolean H() {
        la laVar = this.f70957r;
        if (laVar != null) {
            return laVar.e();
        }
        return false;
    }

    public final void J(z2 z2Var, String str) {
        String strT;
        String strB = this.f70941b.b();
        la laVar = this.f70957r;
        if (laVar == null || (strT = laVar.T()) == null) {
            strT = "No location";
        }
        e((y0) new l1(z2Var, str, strB, strT, this.f70952m, null, 32, null));
    }

    public final void N(i6 appRequest, y6 callback) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(callback, "callback");
        this.f70956q = callback;
        if (!this.f70942c.e()) {
            S(appRequest, a.b.G);
            return;
        }
        dg dgVarA = appRequest.a();
        if (dgVarA == null) {
            V(appRequest, a.b.f72120h);
        } else if (!this.f70943d.c(dgVarA).booleanValue()) {
            V(appRequest, a.b.D);
        } else {
            b0(appRequest);
            Z(appRequest);
        }
    }

    public final void O(i6 i6Var, la laVar, a.b bVar) {
        if (bVar == null) {
            eg.i.d(this.f70953n, null, null, new b(laVar, this, i6Var, null), 3, null);
        } else {
            V(i6Var, bVar);
            W(i6Var);
        }
    }

    public final void P(la laVar) {
        eg.j("Visibility check success!", null, 2, null);
        laVar.c(true);
        if (!laVar.h() || laVar.f()) {
            return;
        }
        a0(laVar.Q());
    }

    public final void Q(i6 i6Var, a.b bVar) {
        V(i6Var, bVar);
        if (bVar != a.b.f72122j) {
            W(i6Var);
        }
        this.f70947h.g();
    }

    public void T(boolean z10) {
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.b(z10);
        }
    }

    public final void U(i6 i6Var) {
        m8 m8Var = this.f70946g;
        URL urlA = this.f70955p.a(this.f70941b.d());
        dg dgVarA = i6Var.a();
        m8Var.d(urlA, new pf(dgVarA != null ? dgVarA.f() : null, i6Var.i(), G(), this.f70941b.b(), this.f70952m));
    }

    public final void X(i6 i6Var) {
        if (this.f70957r != null && i6Var.f() == null) {
            eg.j("Fullscreen impression is currently loading.", null, 2, null);
            return;
        }
        if (!this.f70942c.e()) {
            S(i6Var, a.b.G);
            return;
        }
        y6 y6Var = this.f70956q;
        if (y6Var != null) {
            y6Var.d(R(i6Var));
        }
        t2 t2Var = this.f70945f;
        f1.a aVarF = i6Var.f();
        hb hbVarB = t2Var.b(i6Var, this, aVarF != null ? aVarF.b() : null, this, this, this.f70948i, this, this.f70959t, this.f70950k, this.f70951l);
        this.f70957r = hbVarB.b();
        O(i6Var, hbVarB.b(), hbVarB.a());
    }

    public final void Y(String str) {
        if (Intrinsics.areEqual(this.f70941b, bf.a.f69483g)) {
            return;
        }
        p(new l1(z2.i.f71759o, "dismiss_missing due to ad not finished", this.f70941b.b(), str, this.f70952m, null, 32, null));
    }

    public final void Z(final i6 i6Var) {
        String strC;
        String strB;
        dg dgVarA = i6Var.a();
        if (dgVarA == null || !dgVarA.d()) {
            X(i6Var);
            return;
        }
        q1 q1Var = this.f70944e;
        dg dgVarA2 = i6Var.a();
        String str = "";
        if (dgVarA2 == null || (strC = dgVarA2.c()) == null) {
            strC = "";
        }
        dg dgVarA3 = i6Var.a();
        if (dgVarA3 != null && (strB = dgVarA3.b()) != null) {
            str = strB;
        }
        q1Var.d(strC, str, true, new e9() { // from class: f1.p5
            @Override // f1.e9
            public final void a(String str2) {
                r5.L(this.f70758a, i6Var, str2);
            }
        });
    }

    @Override // f1.u7
    public void a(int i10, boolean z10) {
        this.f70949j.a(i10, z10);
    }

    public final void a0(String str) {
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.a(true);
        }
        y6 y6Var = this.f70956q;
        if (y6Var != null) {
            y6Var.c(str);
        }
        this.f70947h.i();
        i6 i6Var = (i6) kotlin.jvm.internal.b1.d(this.f70958s).remove(str);
        if (i6Var != null) {
            y6 y6Var2 = this.f70956q;
            if (y6Var2 != null) {
                y6Var2.e(str);
            }
            U(i6Var);
        }
    }

    @Override // f1.u7
    public void b(String impressionId) {
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        J(z2.b.f71704c, "");
        y6 y6Var = this.f70956q;
        if (y6Var != null) {
            y6Var.b(impressionId);
        }
    }

    public final void b0(i6 i6Var) {
        if (i6Var.j()) {
            return;
        }
        i6Var.g(true);
        e((y0) new l1(z2.i.f71747c, "", this.f70941b.b(), i6Var.i(), null, null, 48, null));
    }

    @Override // f1.pc
    public void c() {
        eg.e("DISMISS_MISSING event was successfully removed upon dismiss callback", null, 2, null);
        u(new oc(z2.i.f71759o, "", "", "", null, 16, null));
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.c();
        }
    }

    @Override // f1.a4
    public void d() {
        Unit unit;
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.r();
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.e("Missing impression on impression click success callback ", null, 2, null);
        }
    }

    @Override // f1.ag
    public y0 e(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70954o.e(y0Var);
    }

    @Override // f1.zb
    public void f() {
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.q();
        }
    }

    @Override // f1.pc
    public void g() {
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.O();
        }
    }

    @Override // f1.zb
    public String h() {
        String strW;
        la laVar = this.f70957r;
        return (laVar == null || (strW = laVar.W()) == null) ? "" : strW;
    }

    @Override // f1.zb
    public void i() {
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.n();
        }
    }

    @Override // f1.zb
    public String j() {
        String strR;
        la laVar = this.f70957r;
        return (laVar == null || (strR = laVar.R()) == null) ? "" : strR;
    }

    @Override // f1.zb
    public void k() {
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.u();
        }
    }

    @Override // f1.Cif
    public void l(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f70954o.l(type, location);
    }

    @Override // f1.ag
    public xc m(xc xcVar) {
        Intrinsics.checkNotNullParameter(xcVar, "<this>");
        return this.f70954o.m(xcVar);
    }

    @Override // f1.ag
    public u n(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return this.f70954o.n(uVar);
    }

    @Override // f1.u7
    public void o() {
        Unit unit;
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.L(wd.f71449d);
            if (laVar.y()) {
                laVar.a(laVar.i());
            } else {
                this.f70949j.c(this);
            }
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.j("Cannot display missing impression onImpressionReadyToBeDisplayed", null, 2, null);
        }
    }

    @Override // f1.ag
    public y0 p(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70954o.p(y0Var);
    }

    @Override // f1.zb
    public void q() {
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.s();
        }
    }

    @Override // f1.h6
    public void r() {
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.onResume();
        }
    }

    @Override // f1.zb
    public String s() {
        String strU;
        la laVar = this.f70957r;
        return (laVar == null || (strU = laVar.U()) == null) ? "" : strU;
    }

    @Override // f1.zb
    public void t() {
        this.f70949j.finishActivity();
    }

    @Override // f1.ag
    public y0 u(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70954o.u(y0Var);
    }

    @Override // f1.zb
    public void v() {
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.v();
        }
    }

    @Override // f1.zb
    public String w() {
        String strV;
        la laVar = this.f70957r;
        return (laVar == null || (strV = laVar.V()) == null) ? "" : strV;
    }

    @Override // f1.h6
    public void x() {
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.k();
        }
        this.f70950k.e(null);
        this.f70950k.d();
    }

    @Override // f1.h6
    public void y() {
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.b();
        }
    }

    @Override // f1.zb
    public void z() {
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.P();
        }
    }

    @Override // f1.h6
    public void a(a.b error) {
        Intrinsics.checkNotNullParameter(error, "error");
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.a(error);
        }
    }

    @Override // f1.Cif
    /* JADX INFO: renamed from: e */
    public void mo4436e(y0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f70954o.mo4436e(event);
    }

    @Override // f1.zb
    public void f(n2 url) {
        Intrinsics.checkNotNullParameter(url, "url");
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.g(url);
        }
    }

    @Override // f1.zb
    public void g(n2 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.N(cbUrl);
        }
    }

    @Override // f1.zb
    public void h(n2 url) {
        Intrinsics.checkNotNullParameter(url, "url");
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.h(url);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x001f  */
    @Override // f1.h6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void i(com.chartboost.sdk.view.CBImpressionActivity r4) {
        /*
            r3 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            f1.la r0 = r3.f70957r
            r1 = 0
            if (r0 == 0) goto L1f
            f1.wd r2 = r0.S()
            r0.k(r2, r4)
            f1.v4 r4 = r0.a0()
            if (r4 == 0) goto L1f
            f1.of r0 = r3.f70949j
            r0.b(r4)
            kotlin.Unit r4 = kotlin.Unit.f93236a
            goto L20
        L1f:
            r4 = r1
        L20:
            if (r4 != 0) goto L28
            java.lang.String r4 = "Cannot display missing impression onActivityIsReadyToDisplay"
            r0 = 2
            f1.eg.j(r4, r1, r0, r1)
        L28:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.r5.i(com.chartboost.sdk.view.CBImpressionActivity):void");
    }

    @Override // f1.u7
    public void j(i6 appRequest) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        W(appRequest);
        this.f70947h.g();
    }

    @Override // f1.zb
    public void k(List verificationScriptResourceList, Integer num) {
        Intrinsics.checkNotNullParameter(verificationScriptResourceList, "verificationScriptResourceList");
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.I(verificationScriptResourceList, num);
        }
    }

    @Override // f1.zb
    public void l() {
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.z();
        }
    }

    @Override // f1.u7
    public void m() {
        this.f70949j.finishActivity();
    }

    @Override // f1.pc
    public void n() {
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.C();
        }
        this.f70957r = null;
        this.f70956q = null;
    }

    @Override // f1.h6
    public void p() {
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.onStart();
        }
    }

    @Override // f1.zb
    public void q(ue playerState) {
        Intrinsics.checkNotNullParameter(playerState, "playerState");
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.G(playerState);
        }
    }

    @Override // f1.zb
    public void r(n2 url) {
        Intrinsics.checkNotNullParameter(url, "url");
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.f(url);
        }
    }

    @Override // f1.u7
    public void s(i6 appRequest, a.b error) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(error, "error");
        Q(appRequest, error);
        e((y0) new w3(z2.i.f71756l, "", this.f70941b.b(), appRequest.i(), this.f70952m, null, 32, null));
        this.f70949j.finishActivity();
    }

    @Override // f1.zb
    public void t(s7 vastVideoEvent) {
        Intrinsics.checkNotNullParameter(vastVideoEvent, "vastVideoEvent");
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.F(vastVideoEvent);
        }
    }

    @Override // f1.zb
    public void u() {
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.t();
        }
    }

    @Override // f1.zb
    public a.b d(String str) {
        return zb.a.a(this, str);
    }

    @Override // f1.h6
    public void e() {
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.B();
        }
    }

    @Override // f1.u7
    public void a(String str) {
        y6 y6Var = this.f70956q;
        if (y6Var != null) {
            y6Var.a(str);
        }
        this.f70947h.g();
    }

    @Override // f1.u7
    public void b(String impressionId, String str, a.EnumC0885a error) {
        Intrinsics.checkNotNullParameter(impressionId, "impressionId");
        Intrinsics.checkNotNullParameter(error, "error");
        J(z2.b.f71705d, error.name());
        y6 y6Var = this.f70956q;
        if (y6Var != null) {
            y6Var.b(impressionId, str, error);
        }
    }

    @Override // f1.pc
    public void d(wd state) {
        Intrinsics.checkNotNullParameter(state, "state");
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.L(state);
        }
    }

    @Override // f1.zb
    public void e(String event) {
        Intrinsics.checkNotNullParameter(event, "event");
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.H(event);
        }
    }

    @Override // f1.u7
    public void a(String str, int i10) {
        y6 y6Var = this.f70956q;
        if (y6Var != null) {
            y6Var.a(str, i10);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0045  */
    @Override // f1.u7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a(android.content.Context r8) {
        /*
            r7 = this;
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r0)
            f1.la r0 = r7.f70957r
            r1 = 2
            r2 = 0
            if (r0 == 0) goto L45
            f1.m3 r3 = r7.f70947h
            boolean r3 = r3.h()
            if (r3 != 0) goto L1d
            r8 = 1
            r0.c(r8)
            java.lang.String r8 = "Cannot create visibility tracker due to the OM SDK being disabled!"
            f1.eg.e(r8, r2, r1, r2)
            return
        L1d:
            boolean r3 = r0.p()
            if (r3 == 0) goto L29
            java.lang.String r8 = "Cannot create VisibilityTracker due to missing view!"
            f1.eg.j(r8, r2, r1, r2)
            return
        L29:
            f1.v4 r3 = r0.a0()
            if (r3 == 0) goto L45
            f1.m3 r4 = r7.f70947h
            android.view.View r5 = r3.getRootView()
            java.lang.String r6 = "getRootView(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            f1.q5 r6 = new f1.q5
            r6.<init>()
            r4.d(r8, r3, r5, r6)
            kotlin.Unit r8 = kotlin.Unit.f93236a
            goto L46
        L45:
            r8 = r2
        L46:
            if (r8 != 0) goto L4d
            java.lang.String r8 = "Missing impression onImpressionViewCreated"
            f1.eg.j(r8, r2, r1, r2)
        L4d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: f1.r5.a(android.content.Context):void");
    }

    @Override // f1.a4
    public void b(boolean z10) {
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.i(z10);
        }
    }

    @Override // f1.a4
    public void c(String str, a.EnumC0885a error) {
        Unit unit;
        Intrinsics.checkNotNullParameter(error, "error");
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.c(str, error);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.e("Missing impression on impression click failure callback ", null, 2, null);
        }
    }

    @Override // f1.zb
    public void b(float f10) {
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.D(f10);
        }
    }

    @Override // f1.u7
    public void o(i6 appRequest) {
        Unit unit;
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        T(true);
        String strR = R(appRequest);
        if (strR != null) {
            this.f70958s.put(strR, appRequest);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.j("Unable to store app request because impression ID is missing. Impression tracking will not work.", null, 2, null);
        }
        Y(appRequest.i());
        if (H()) {
            a0(strR);
        }
    }

    @Override // f1.zb
    public void b() {
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.A();
        }
    }

    @Override // f1.zb
    public void c(String msg) {
        Intrinsics.checkNotNullParameter(msg, "msg");
        eg.j("WebView warning occurred closing the webview " + msg, null, 2, null);
    }

    public /* synthetic */ r5(bf bfVar, i iVar, m mVar, q1 q1Var, t2 t2Var, m8 m8Var, m3 m3Var, cg cgVar, of ofVar, da daVar, q7 q7Var, b1.e eVar, CoroutineScope coroutineScope, ag agVar, h1.a aVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(bfVar, iVar, mVar, q1Var, t2Var, m8Var, m3Var, cgVar, ofVar, daVar, q7Var, eVar, (i10 & 4096) != 0 ? kotlinx.coroutines.i.a(eg.o0.c()) : coroutineScope, agVar, aVar);
    }

    @Override // f1.u7
    public void a() {
        this.f70949j.a();
    }

    @Override // f1.zb
    public void a(float f10, float f11) {
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.E(f10, f11);
        }
    }

    @Override // f1.a4
    public void a(boolean z10) {
        la laVar = this.f70957r;
        if (laVar == null) {
            return;
        }
        laVar.m(z10);
    }

    @Override // f1.zb
    public void a(boolean z10, String forceOrientation) {
        Intrinsics.checkNotNullParameter(forceOrientation, "forceOrientation");
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.J(z10, forceOrientation);
        }
    }

    @Override // f1.zb
    public void a(float f10) {
        la laVar = this.f70957r;
        if (laVar != null) {
            laVar.K(f10);
        }
    }
}
