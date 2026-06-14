package f1;

import f1.z2;
import g1.a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public final class m0 implements t1, ab, ag {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final bf f70435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final m f70436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f70437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q1 f70438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final pd f70439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ya f70440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final lb f70441h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final b1.e f70442i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ag f70443j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public i6 f70444k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public d1 f70445l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f1.a f70446m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f70447n;

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f70448a;

        static {
            int[] iArr = new int[sb.values().length];
            try {
                iArr[sb.f71092b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[sb.f71093c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[sb.f71094d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f70448a = iArr;
        }
    }

    public static final class b extends Lambda implements Function1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ i6 f70450g;

        public static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ m0 f70451f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ i6 f70452g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m0 m0Var, i6 i6Var) {
                super(1);
                this.f70451f = m0Var;
                this.f70452g = i6Var;
            }

            public final void a(se fold) {
                Intrinsics.checkNotNullParameter(fold, "$this$fold");
                this.f70451f.G(fold, this.f70452g);
                this.f70451f.D(this.f70452g);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((se) obj);
                return Unit.f93236a;
            }
        }

        /* JADX INFO: renamed from: f1.m0$b$b, reason: collision with other inner class name */
        public static final class C0875b extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ m0 f70453f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ i6 f70454g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0875b(m0 m0Var, i6 i6Var) {
                super(2);
                this.f70453f = m0Var;
                this.f70454g = i6Var;
            }

            public final void a(se fold, g1.a error) {
                Intrinsics.checkNotNullParameter(fold, "$this$fold");
                Intrinsics.checkNotNullParameter(error, "error");
                this.f70453f.w(error, this.f70454g.i());
                this.f70453f.t(fold, this.f70454g);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((se) obj, (g1.a) obj2);
                return Unit.f93236a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i6 i6Var) {
            super(1);
            this.f70450g = i6Var;
        }

        public final void a(se loadAd) {
            Intrinsics.checkNotNullParameter(loadAd, "$this$loadAd");
            qc.a(loadAd, new a(m0.this, this.f70450g), new C0875b(m0.this, this.f70450g));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((se) obj);
            return Unit.f93236a;
        }
    }

    public static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ i6 f70455f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ m0 f70456g;

        public static final class a extends Lambda implements Function1 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ i6 f70457f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ m0 f70458g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(i6 i6Var, m0 m0Var) {
                super(1);
                this.f70457f = i6Var;
                this.f70458g = m0Var;
            }

            public final void a(se fold) {
                Intrinsics.checkNotNullParameter(fold, "$this$fold");
                this.f70457f.c(fold.a());
                this.f70458g.J(this.f70457f);
                this.f70458g.G(fold, this.f70457f);
                this.f70458g.a(this.f70457f, z2.a.f71694e);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((se) obj);
                return Unit.f93236a;
            }
        }

        public static final class b extends Lambda implements Function2 {

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ m0 f70459f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ i6 f70460g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(m0 m0Var, i6 i6Var) {
                super(2);
                this.f70459f = m0Var;
                this.f70460g = i6Var;
            }

            public final void a(se fold, g1.a it) {
                Intrinsics.checkNotNullParameter(fold, "$this$fold");
                Intrinsics.checkNotNullParameter(it, "it");
                this.f70459f.t(fold, this.f70460g);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                a((se) obj, (g1.a) obj2);
                return Unit.f93236a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(i6 i6Var, m0 m0Var) {
            super(1);
            this.f70455f = i6Var;
            this.f70456g = m0Var;
        }

        public final void a(se loadAd) {
            Intrinsics.checkNotNullParameter(loadAd, "$this$loadAd");
            qc.a(loadAd, new a(this.f70455f, this.f70456g), new b(this.f70456g, this.f70455f));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((se) obj);
            return Unit.f93236a;
        }
    }

    public /* synthetic */ class d extends kotlin.jvm.internal.y implements Function2 {
        public d(Object obj) {
            super(2, obj, m0.class, "loadOpenRTBAd", "loadOpenRTBAd(Lcom/chartboost/sdk/internal/AdUnitManager/data/AppRequest;Lcom/chartboost/sdk/internal/AdUnitManager/loaders/LoadParams;)V", 0);
        }

        public final void a(i6 p02, yd p12) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            ((m0) this.receiver).E(p02, p12);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((i6) obj, (yd) obj2);
            return Unit.f93236a;
        }
    }

    public /* synthetic */ class e extends kotlin.jvm.internal.y implements Function2 {
        public e(Object obj) {
            super(2, obj, m0.class, "loadAdGet", "loadAdGet(Lcom/chartboost/sdk/internal/AdUnitManager/data/AppRequest;Lcom/chartboost/sdk/internal/AdUnitManager/loaders/LoadParams;)V", 0);
        }

        public final void a(i6 p02, yd p12) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            ((m0) this.receiver).q(p02, p12);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            a((i6) obj, (yd) obj2);
            return Unit.f93236a;
        }
    }

    public m0(bf adType, m fileCache, i reachability, q1 videoRepository, pd assetsDownloader, ya adLoader, lb ortbLoader, b1.e eVar, ag eventTracker) {
        Intrinsics.checkNotNullParameter(adType, "adType");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(reachability, "reachability");
        Intrinsics.checkNotNullParameter(videoRepository, "videoRepository");
        Intrinsics.checkNotNullParameter(assetsDownloader, "assetsDownloader");
        Intrinsics.checkNotNullParameter(adLoader, "adLoader");
        Intrinsics.checkNotNullParameter(ortbLoader, "ortbLoader");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        this.f70435b = adType;
        this.f70436c = fileCache;
        this.f70437d = reachability;
        this.f70438e = videoRepository;
        this.f70439f = assetsDownloader;
        this.f70440g = adLoader;
        this.f70441h = ortbLoader;
        this.f70442i = eVar;
        this.f70443j = eventTracker;
        this.f70447n = new AtomicBoolean(false);
    }

    public static /* synthetic */ void j(m0 m0Var, String str, d1 d1Var, String str2, f1.a aVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            str2 = null;
        }
        if ((i10 & 8) != 0) {
            aVar = null;
        }
        m0Var.x(str, d1Var, str2, aVar);
    }

    public final void D(i6 i6Var) {
        this.f70439f.a(i6Var, this.f70435b.b(), this, this);
    }

    public final void E(i6 i6Var, yd ydVar) {
        this.f70441h.a(ydVar, new c(i6Var, this));
    }

    public final void F(i6 i6Var, a.b bVar) {
        this.f70447n.set(false);
        r(i6Var, bVar);
        if (bVar == a.b.f72120h) {
            return;
        }
        String strB = this.f70435b.b();
        dg dgVarA = i6Var.a();
        String strF = dgVarA != null ? dgVarA.f() : null;
        eg.j("reportError: adTypeTraits: " + strB + " reason: cache  format: web error: " + bVar + " adId: " + strF + " appRequest.location: " + i6Var.i(), null, 2, null);
    }

    public final void G(se seVar, i6 i6Var) {
        y(i6Var.i(), seVar.a());
        i6Var.c(seVar.a());
    }

    public final String H(i6 i6Var) {
        dg dgVarA = i6Var.a();
        if (dgVarA != null) {
            return dgVarA.r();
        }
        return null;
    }

    public final void I(i6 i6Var) {
        F(i6Var, a.b.f72130r);
        K(i6Var);
    }

    public final void J(i6 i6Var) {
        String strC;
        String strB;
        dg dgVarA = i6Var.a();
        if (dgVarA == null || !dgVarA.d()) {
            return;
        }
        q1 q1Var = this.f70438e;
        dg dgVarA2 = i6Var.a();
        String str = "";
        if (dgVarA2 == null || (strC = dgVarA2.c()) == null) {
            strC = "";
        }
        dg dgVarA3 = i6Var.a();
        if (dgVarA3 != null && (strB = dgVarA3.b()) != null) {
            str = strB;
        }
        q1Var.d(strC, str, false, null);
    }

    public final void K(i6 i6Var) {
        o(i6Var);
        i6Var.c(null);
        this.f70447n.set(false);
    }

    public final void L(i6 i6Var) {
        f1.a aVar = this.f70446m;
        Integer numValueOf = aVar != null ? Integer.valueOf(aVar.a()) : null;
        f1.a aVar2 = this.f70446m;
        Pair pairA = d3.f69579a.a(i6Var, new yd(i6Var, true, numValueOf, aVar2 != null ? Integer.valueOf(aVar2.c()) : null), new d(this), new e(this));
        ((Function2) pairA.component1()).invoke(i6Var, (yd) pairA.component2());
    }

    public final void M(i6 i6Var) {
        try {
            L(i6Var);
        } catch (Exception e10) {
            eg.i("sendAdGetRequest", e10);
            s(i6Var, new g1.a(a.c.f72139b, "error sending ad-get request"));
        }
    }

    @Override // f1.t1
    public void a(i6 appRequest, z2 trackingEventName) {
        Intrinsics.checkNotNullParameter(appRequest, "appRequest");
        Intrinsics.checkNotNullParameter(trackingEventName, "trackingEventName");
        d1 d1Var = this.f70445l;
        if (d1Var != null) {
            d1Var.d(H(appRequest), trackingEventName);
        }
        this.f70447n.set(false);
    }

    @Override // f1.ab
    public void b(i6 request, sb resultAsset) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(resultAsset, "resultAsset");
        int i10 = a.f70448a[resultAsset.ordinal()];
        if (i10 == 1) {
            I(request);
        } else if (i10 == 2) {
            eg.e("onAssetDownloaded: Ready to show", null, 2, null);
        } else {
            if (i10 != 3) {
                return;
            }
            eg.e("onAssetDownloaded: Success", null, 2, null);
        }
    }

    public final i6 c() {
        return this.f70444k;
    }

    public final a.b d(g1.a aVar) {
        return (aVar != null ? aVar.g() : null) != null ? aVar.g() : a.b.f72114b;
    }

    @Override // f1.ag
    public y0 e(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70443j.e(y0Var);
    }

    public final void k(z2 z2Var, String str) {
        e((y0) new l1(z2Var, "", this.f70435b.b(), str, this.f70442i, null, 32, null));
    }

    @Override // f1.Cif
    public void l(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f70443j.l(type, location);
    }

    @Override // f1.ag
    public xc m(xc xcVar) {
        Intrinsics.checkNotNullParameter(xcVar, "<this>");
        return this.f70443j.m(xcVar);
    }

    @Override // f1.ag
    public u n(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return this.f70443j.n(uVar);
    }

    public final void o(i6 i6Var) {
        String strW;
        ag agVar = this.f70443j;
        dg dgVarA = i6Var.a();
        if (dgVarA == null || (strW = dgVarA.w()) == null) {
            strW = "";
        }
        agVar.l(strW, i6Var.i());
    }

    @Override // f1.ag
    public y0 p(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70443j.p(y0Var);
    }

    public final void q(i6 i6Var, yd ydVar) {
        this.f70440g.a(ydVar, new b(i6Var));
    }

    public final void r(i6 i6Var, a.b bVar) {
        d1 d1Var = this.f70445l;
        if (d1Var != null) {
            d1Var.a(H(i6Var), bVar);
        }
    }

    public final void s(i6 i6Var, g1.a aVar) {
        F(i6Var, d(aVar));
        K(i6Var);
    }

    public final void t(se seVar, i6 i6Var) {
        y(i6Var.i(), null);
        s(i6Var, seVar.b());
    }

    @Override // f1.ag
    public y0 u(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f70443j.u(y0Var);
    }

    public final void v(g1.a aVar, z2 z2Var, String str) {
        String message = aVar.getMessage();
        if (message == null) {
            message = "";
        }
        e((y0) new oc(z2Var, message, this.f70435b.b(), str, this.f70442i));
    }

    public final void w(g1.a aVar, String str) {
        a.d dVarH = aVar.h();
        if (dVarH == a.c.f72144g || dVarH == a.c.f72145h) {
            v(aVar, z2.a.f71700k, str);
        } else if (dVarH == a.c.f72146i) {
            v(aVar, z2.f.f71730h, str);
        } else {
            v(aVar, z2.a.f71699j, str);
        }
    }

    public final void x(String location, d1 callback, String str, f1.a aVar) {
        dg dgVarA;
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (this.f70447n.getAndSet(true)) {
            k(z2.a.f71692c, location);
            return;
        }
        i6 i6Var = this.f70444k;
        if (i6Var != null && (dgVarA = i6Var.a()) != null && !this.f70436c.c(dgVarA).booleanValue()) {
            o(i6Var);
            this.f70444k = null;
        }
        i6 i6Var2 = this.f70444k;
        if (i6Var2 != null) {
            i6Var2.d(str);
        }
        i6 i6Var3 = this.f70444k;
        if (i6Var3 == null) {
            i6 i6Var4 = new i6((int) System.currentTimeMillis(), location, str, null, null, false, false, 120, null);
            this.f70445l = callback;
            this.f70446m = aVar;
            i6Var4.b(aVar);
            this.f70444k = i6Var4;
            i6Var3 = i6Var4;
        }
        if (!this.f70437d.e()) {
            F(i6Var3, a.b.H);
            return;
        }
        i6Var3.e(true);
        if (i6Var3.a() != null) {
            a(i6Var3, z2.a.f71692c);
        } else {
            k(z2.a.f71693d, i6Var3.i());
            M(i6Var3);
        }
    }

    public final void y(String str, dg dgVar) {
        String strR;
        String strN;
        String strU;
        String strG;
        String strD;
        if (str == null) {
            str = "no location";
        }
        String str2 = str;
        String strB = this.f70435b.b();
        if (dgVar == null || (strR = dgVar.r()) == null) {
            strR = "";
        }
        if (dgVar == null || (strN = dgVar.n()) == null) {
            strN = "";
        }
        if (dgVar == null || (strU = dgVar.u()) == null) {
            strU = "";
        }
        if (dgVar == null || (strG = dgVar.g()) == null) {
            strG = "";
        }
        m(new xc(str2, strB, strR, strN, strU, strG, (dgVar == null || (strD = dgVar.D()) == null) ? "" : strD, w.a(this.f70446m)));
    }

    public final void z() {
        if (this.f70447n.get()) {
            return;
        }
        i6 i6Var = this.f70444k;
        if (i6Var != null) {
            o(i6Var);
            i6Var.c(null);
        }
        this.f70444k = null;
    }

    @Override // f1.Cif
    /* JADX INFO: renamed from: e */
    public void mo4436e(y0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f70443j.mo4436e(event);
    }
}
