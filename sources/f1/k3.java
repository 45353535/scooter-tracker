package f1;

import g1.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class k3 implements p4, h3 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final dg f70228b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final yc f70229c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final o6 f70230d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final h1 f70231e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final h3 f70232f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final gd f70233g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final a4 f70234h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final d4 f70235i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final u7 f70236j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final ga f70237k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f70238l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Boolean f70239m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f70240n;

    public static final class a extends Lambda implements Function1 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ String f70241f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ a.EnumC0885a f70242g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ k3 f70243h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, a.EnumC0885a enumC0885a, k3 k3Var) {
            super(1);
            this.f70241f = str;
            this.f70242g = enumC0885a;
            this.f70243h = k3Var;
        }

        public final void a(a4 notify) {
            Intrinsics.checkNotNullParameter(notify, "$this$notify");
            notify.c(this.f70241f, this.f70242g);
            this.f70243h.b("Impression click callback for: " + this.f70241f + " failed with error: " + this.f70242g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a4) obj);
            return Unit.f93236a;
        }
    }

    public static final class b implements x1 {
        @Override // f1.x1
        public void a(String str) {
            eg.j("onClickRequestFailure " + str, null, 2, null);
        }

        @Override // f1.x1
        public void a(JSONObject jSONObject) {
            String string;
            if (jSONObject == null || (string = jSONObject.toString()) == null) {
                string = "";
            }
            eg.j("onClickRequestSuccess " + string, null, 2, null);
        }
    }

    public static final class c extends Lambda implements Function1 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ String f70245g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.f70245g = str;
        }

        public final void a(a4 notify) {
            Intrinsics.checkNotNullParameter(notify, "$this$notify");
            notify.d();
            k3.this.a("Url impression callback success: " + this.f70245g);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((a4) obj);
            return Unit.f93236a;
        }
    }

    public k3(dg adUnit, yc urlResolver, o6 intentResolver, h1 clickRequest, h3 clickTracking, gd mediaType, a4 impressionCallback, d4 openMeasurementImpressionCallback, u7 adUnitRendererImpressionCallback, ga sdkConfig) {
        Intrinsics.checkNotNullParameter(adUnit, "adUnit");
        Intrinsics.checkNotNullParameter(urlResolver, "urlResolver");
        Intrinsics.checkNotNullParameter(intentResolver, "intentResolver");
        Intrinsics.checkNotNullParameter(clickRequest, "clickRequest");
        Intrinsics.checkNotNullParameter(clickTracking, "clickTracking");
        Intrinsics.checkNotNullParameter(mediaType, "mediaType");
        Intrinsics.checkNotNullParameter(impressionCallback, "impressionCallback");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(adUnitRendererImpressionCallback, "adUnitRendererImpressionCallback");
        Intrinsics.checkNotNullParameter(sdkConfig, "sdkConfig");
        this.f70228b = adUnit;
        this.f70229c = urlResolver;
        this.f70230d = intentResolver;
        this.f70231e = clickRequest;
        this.f70232f = clickTracking;
        this.f70233g = mediaType;
        this.f70234h = impressionCallback;
        this.f70235i = openMeasurementImpressionCallback;
        this.f70236j = adUnitRendererImpressionCallback;
        this.f70237k = sdkConfig;
    }

    public final void a(a4 a4Var, String str) {
        d(a4Var, new c(str));
    }

    @Override // f1.h3
    public void b(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f70232f.b(message);
    }

    @Override // f1.p4
    public void c(String str, a.EnumC0885a error) {
        Intrinsics.checkNotNullParameter(error, "error");
        this.f70236j.b(this.f70228b.r(), str, error);
    }

    @Override // f1.p4
    public void d() {
        this.f70236j.b(this.f70228b.r());
        if (this.f70240n) {
            this.f70234h.D();
        }
    }

    public final void e(String str, Boolean bool, boolean z10) {
        Unit unit;
        this.f70235i.b();
        if (bool != null) {
            this.f70240n = bool.booleanValue();
        }
        a.EnumC0885a enumC0885aB = this.f70229c.b(str, this.f70228b.m(), this.f70232f, z10);
        if (enumC0885aB != null) {
            b(this.f70234h, str, enumC0885aB);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            a(this.f70234h, str);
        }
    }

    @Override // f1.p4
    public void f(n2 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        k(cbUrl.b());
    }

    @Override // f1.p4
    public void g(n2 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        e(cbUrl.b(), cbUrl.a(), true);
    }

    @Override // f1.p4
    public void h(n2 cbUrl) {
        Intrinsics.checkNotNullParameter(cbUrl, "cbUrl");
        n(cbUrl.b());
    }

    public boolean i() {
        return this.f70238l;
    }

    @Override // f1.p4
    public void j(String location, Float f10, Float f11) {
        Intrinsics.checkNotNullParameter(location, "location");
        this.f70231e.d(new b(), new a0(location, this.f70228b.f(), this.f70228b.a(), this.f70228b.l(), this.f70228b.n(), f10, f11, this.f70233g, this.f70239m));
    }

    public final void k(String str) {
        b(this.f70234h, str, a.EnumC0885a.f72110d);
    }

    @Override // f1.p4
    public boolean l(String urlFromCreative, Boolean bool, wd impressionState) {
        Intrinsics.checkNotNullParameter(urlFromCreative, "urlFromCreative");
        Intrinsics.checkNotNullParameter(impressionState, "impressionState");
        if (bool != null) {
            this.f70240n = bool.booleanValue();
        }
        if (impressionState != wd.f71450e) {
            return false;
        }
        if (!this.f70237k.A || StringsKt.y0(urlFromCreative)) {
            urlFromCreative = this.f70228b.t();
        }
        String strP = this.f70228b.p();
        if (this.f70230d.d(strP)) {
            this.f70239m = Boolean.TRUE;
            urlFromCreative = strP;
        } else {
            this.f70239m = Boolean.FALSE;
        }
        if (i()) {
            return false;
        }
        m(true);
        this.f70234h.b(false);
        e(urlFromCreative, Boolean.valueOf(this.f70240n), true);
        return true;
    }

    @Override // f1.p4
    public void m(boolean z10) {
        this.f70238l = z10;
    }

    public final void n(String str) {
        this.f70229c.b(str, this.f70228b.m(), this.f70232f, false);
    }

    @Override // f1.h3
    public void a(String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.f70232f.a(message);
    }

    public final void b(a4 a4Var, String str, a.EnumC0885a enumC0885a) {
        d(a4Var, new a(str, enumC0885a, this));
    }

    public final void d(a4 a4Var, Function1 function1) {
        Unit unit;
        if (a4Var != null) {
            a4Var.a(false);
            function1.invoke(a4Var);
            unit = Unit.f93236a;
        } else {
            unit = null;
        }
        if (unit == null) {
            eg.j("Impression callback is null", null, 2, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ k3(dg dgVar, yc ycVar, o6 o6Var, h1 h1Var, h3 h3Var, gd gdVar, a4 a4Var, d4 d4Var, u7 u7Var, ga gaVar, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        ga gaVar2;
        if ((i10 & 512) != 0) {
            Object obj = rd.f70996b.a().b().get();
            Intrinsics.checkNotNullExpressionValue(obj, "get(...)");
            gaVar2 = (ga) obj;
        } else {
            gaVar2 = gaVar;
        }
        this(dgVar, ycVar, o6Var, h1Var, h3Var, gdVar, a4Var, d4Var, u7Var, gaVar2);
    }
}
