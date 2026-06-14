package f1;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import com.chartboost.sdk.view.CBImpressionActivity;
import com.vungle.ads.internal.model.AdPayload;
import f1.z2;
import g1.a;
import java.io.File;
import java.util.Collections;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/* JADX INFO: loaded from: classes6.dex */
public abstract class u3 implements ag {
    public int A;
    public int B;
    public int C;
    public int D;
    public int E;
    public int F;
    public int G;
    public boolean H;
    public int I;
    public ue J;
    public v4 K;
    public float L;
    public float M;
    public float N;
    public final v5 O;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f71197b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f71198c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a6 f71199d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f71200e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t6 f71201f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final m f71202g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final wf f71203h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final w1 f71204i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b1.e f71205j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final String f71206k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d4 f71207l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final u7 f71208m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final r1 f71209n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final ag f71210o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Function2 f71211p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f71212q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public long f71213r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public long f71214s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f71215t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f71216u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f71217v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f71218w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f71219x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f71220y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f71221z;

    public /* synthetic */ class a extends kotlin.jvm.internal.y implements Function2 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f71222b = new a();

        public a() {
            super(2, qe.class, "<init>", "<init>(Ljava/lang/String;Lcom/chartboost/sdk/tracking/EventTrackerExtensions;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public final qe invoke(String p02, ag p12) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            Intrinsics.checkNotNullParameter(p12, "p1");
            return new qe(p02, p12);
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f71223a;

        static {
            int[] iArr = new int[s7.values().length];
            try {
                iArr[s7.f71051b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s7.f71052c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[s7.f71053d.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[s7.f71054e.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[s7.f71055f.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[s7.f71056g.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[s7.f71057h.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[s7.f71058i.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[s7.f71059j.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[s7.f71060k.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[s7.f71061l.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            f71223a = iArr;
        }
    }

    public static final class d extends Lambda implements Function0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ v4 f71225f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(v4 v4Var) {
            super(0);
            this.f71225f = v4Var;
        }

        public final void a() {
            this.f71225f.a();
            this.f71225f.removeAllViews();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public static final class e extends Lambda implements Function0 {
        public e() {
            super(0);
        }

        public final void a() {
            if (u3.this.f71215t) {
                return;
            }
            eg.e("Webview seems to be taking more time loading the html content, so closing the view.", null, 2, null);
            u3.this.x(z2.i.f71751g, "");
            u3.this.f71209n.a();
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            a();
            return Unit.f93236a;
        }
    }

    public u3(Context context, String location, a6 adUnitMType, String adTypeTraitsName, t6 uiPoster, m fileCache, wf wfVar, w1 w1Var, b1.e eVar, String str, d4 openMeasurementImpressionCallback, u7 adUnitRendererCallback, r1 webViewTimeoutInterface, ag eventTracker, Function2 impressionTrackerRequestFactory) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(location, "location");
        Intrinsics.checkNotNullParameter(adUnitMType, "adUnitMType");
        Intrinsics.checkNotNullParameter(adTypeTraitsName, "adTypeTraitsName");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(fileCache, "fileCache");
        Intrinsics.checkNotNullParameter(openMeasurementImpressionCallback, "openMeasurementImpressionCallback");
        Intrinsics.checkNotNullParameter(adUnitRendererCallback, "adUnitRendererCallback");
        Intrinsics.checkNotNullParameter(webViewTimeoutInterface, "webViewTimeoutInterface");
        Intrinsics.checkNotNullParameter(eventTracker, "eventTracker");
        Intrinsics.checkNotNullParameter(impressionTrackerRequestFactory, "impressionTrackerRequestFactory");
        this.f71197b = context;
        this.f71198c = location;
        this.f71199d = adUnitMType;
        this.f71200e = adTypeTraitsName;
        this.f71201f = uiPoster;
        this.f71202g = fileCache;
        this.f71203h = wfVar;
        this.f71204i = w1Var;
        this.f71205j = eVar;
        this.f71206k = str;
        this.f71207l = openMeasurementImpressionCallback;
        this.f71208m = adUnitRendererCallback;
        this.f71209n = webViewTimeoutInterface;
        this.f71210o = eventTracker;
        this.f71211p = impressionTrackerRequestFactory;
        this.H = true;
        this.I = -1;
        this.J = ue.f71307e;
        this.O = new c();
    }

    public final void A(s7 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        eg.e("sendWebViewVastOmEvent: " + event.name(), null, 2, null);
        if (this.f71199d != a6.f69374e) {
            return;
        }
        d4 d4Var = this.f71207l;
        switch (b.f71223a[event.ordinal()]) {
            case 1:
                d4Var.a(this.L, this.N);
                break;
            case 2:
                if (this.J == ue.f71308f) {
                    d4Var.e();
                }
                break;
            case 3:
                d4Var.a();
                break;
            case 4:
                d4Var.a(true);
                break;
            case 5:
                d4Var.a(false);
                break;
            case 6:
                d4Var.a(o7.f70725b);
                break;
            case 7:
                d4Var.a(o7.f70726c);
                break;
            case 8:
                d4Var.a(o7.f70727d);
                break;
            case 9:
                d4Var.d();
                break;
            case 10:
                d4Var.c();
                break;
            case 11:
                d4Var.a(this.N);
                break;
        }
    }

    public final void B(ue newState) {
        Intrinsics.checkNotNullParameter(newState, "newState");
        this.J = newState;
    }

    public final void C(List verificationScriptResourceList, Integer num) {
        l4 webView;
        Intrinsics.checkNotNullParameter(verificationScriptResourceList, "verificationScriptResourceList");
        v4 v4Var = this.K;
        if (v4Var == null || (webView = v4Var.getWebView()) == null) {
            return;
        }
        this.f71207l.c(this.f71199d, webView, num, verificationScriptResourceList);
    }

    public final void D(boolean z10, String forceOrientationString) {
        Intrinsics.checkNotNullParameter(forceOrientationString, "forceOrientationString");
        this.H = z10;
        int iE = E(forceOrientationString);
        this.I = iE;
        this.f71208m.a(iE, z10);
    }

    public final int E(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        if (Intrinsics.areEqual(name, "portrait")) {
            return 1;
        }
        return Intrinsics.areEqual(name, "landscape") ? 0 : -1;
    }

    public abstract v4 G(Context context);

    public final void H(float f10) {
        this.M = f10;
    }

    public final a.b I(String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        x(z2.i.f71754j, error);
        eg.j(error, null, 2, null);
        this.f71215t = true;
        return a.b.F;
    }

    public final void K(String str) {
        wf wfVar;
        if (str == null || str.length() == 0 || (wfVar = this.f71203h) == null) {
            eg.e("###### Sending VAST Tracking Event Failed: " + str, null, 2, null);
            return;
        }
        wfVar.b((bd) this.f71211p.invoke(str, this.f71210o));
        eg.e("###### Sending VAST Tracking Event: " + str, null, 2, null);
    }

    public final void L() {
        v4 v4Var = this.K;
        if (v4Var == null || !this.f71215t) {
            this.D = this.f71221z;
            this.E = this.A;
            this.F = this.B;
            this.G = this.C;
            return;
        }
        int[] iArr = new int[2];
        v4Var.getLocationInWindow(iArr);
        int i10 = iArr[0];
        int i11 = iArr[1] - this.f71220y;
        int width = v4Var.getWidth();
        int height = v4Var.getHeight();
        this.f71221z = i10;
        this.A = i11;
        int i12 = width + i10;
        this.B = i12;
        int i13 = height + i11;
        this.C = i13;
        this.D = i10;
        this.E = i11;
        this.F = i12;
        this.G = i13;
        eg.e("CalculatePosition: defaultXPos: " + i10 + " , currentXPos: " + i10, null, 2, null);
    }

    public void M() {
        this.f71207l.f();
        v4 v4Var = this.K;
        if (v4Var != null) {
            this.f71201f.a(1000L, new d(v4Var));
        }
        this.K = null;
    }

    public final String N() {
        return this.f71200e;
    }

    public final String O() {
        return this.f71212q;
    }

    public final String P() {
        L();
        return r(this.D, this.E, this.F, this.G);
    }

    public final v5 Q() {
        return this.O;
    }

    public final String R() {
        L();
        return r(this.f71221z, this.A, this.B, this.C);
    }

    public final String S() {
        return this.f71198c;
    }

    public final String T() {
        String string = bb.c(bb.a("width", Integer.valueOf(this.f71218w)), bb.a("height", Integer.valueOf(this.f71219x))).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final d4 U() {
        return this.f71207l;
    }

    public final String V() {
        String string = bb.c(bb.a("allowOrientationChange", Boolean.valueOf(this.H)), bb.a("forceOrientation", q(this.I))).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final String W() {
        String string = bb.c(bb.a("width", Integer.valueOf(this.f71216u)), bb.a("height", Integer.valueOf(this.f71217v))).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final w1 X() {
        return this.f71204i;
    }

    public final t6 Y() {
        return this.f71201f;
    }

    public final float Z() {
        return this.L;
    }

    public final float a0() {
        return this.M;
    }

    public final v4 b0() {
        return this.K;
    }

    public final void c0() {
        this.N = 0.0f;
    }

    public abstract void d0();

    @Override // f1.ag
    public y0 e(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f71210o.e(y0Var);
    }

    public void e0() {
        l4 webView;
        Context context;
        this.f71215t = true;
        long jCurrentTimeMillis = System.currentTimeMillis();
        this.f71214s = jCurrentTimeMillis;
        eg.e("Total web view load response time " + ((jCurrentTimeMillis - this.f71213r) / ((long) 1000)), null, 2, null);
        v4 v4Var = this.K;
        if (v4Var != null && (context = v4Var.getContext()) != null) {
            v(context);
        }
        v4 v4Var2 = this.K;
        if (v4Var2 == null || (webView = v4Var2.getWebView()) == null) {
            return;
        }
        w(webView);
        L();
    }

    public final a.b f() {
        File file = this.f71202g.a().f69554a;
        if (file == null) {
            eg.j("External Storage path is unavailable or media not mounted", null, 2, null);
            return a.b.f72134v;
        }
        this.f71212q = AdPayload.FILE_SCHEME + file.getAbsolutePath() + "/";
        String str = this.f71206k;
        if (str == null || str.length() != 0) {
            return null;
        }
        eg.j("Empty template being passed in the response", null, 2, null);
        return a.b.f72132t;
    }

    public void f0() {
        l4 webView;
        w1 w1Var;
        v4 v4Var = this.K;
        if (v4Var == null || (webView = v4Var.getWebView()) == null || (w1Var = this.f71204i) == null) {
            return;
        }
        w1Var.b(webView, this.f71198c, this.f71200e);
        webView.onPause();
    }

    public final void g() {
        this.f71201f.a(15000L, new e());
    }

    public void g0() {
        l4 webView;
        w1 w1Var;
        v4 v4Var = this.K;
        if (v4Var == null || (webView = v4Var.getWebView()) == null || (w1Var = this.f71204i) == null) {
            return;
        }
        w1Var.g(webView, this.f71198c, this.f71200e);
        webView.onResume();
    }

    public final void h() {
        this.f71208m.a();
        this.H = true;
        this.I = -1;
    }

    public final void i() {
        this.N = 1.0f;
    }

    public final a.b k(ViewGroup viewGroup) {
        if (this.K == null) {
            if ((viewGroup != null ? viewGroup.getContext() : null) == null) {
                return a.b.f72131s;
            }
            Context context = viewGroup.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            this.K = G(context);
        }
        return null;
    }

    @Override // f1.Cif
    public void l(String type, String location) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(location, "location");
        this.f71210o.l(type, location);
    }

    @Override // f1.ag
    public xc m(xc xcVar) {
        Intrinsics.checkNotNullParameter(xcVar, "<this>");
        return this.f71210o.m(xcVar);
    }

    @Override // f1.ag
    public u n(u uVar) {
        Intrinsics.checkNotNullParameter(uVar, "<this>");
        return this.f71210o.n(uVar);
    }

    public final a.b o(CBImpressionActivity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (this.K == null) {
            Context applicationContext = activity.getApplicationContext();
            Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
            this.K = G(applicationContext);
        }
        this.f71208m.a(this.f71197b);
        return null;
    }

    @Override // f1.ag
    public y0 p(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f71210o.p(y0Var);
    }

    public final String q(int i10) {
        return i10 != -1 ? i10 != 0 ? i10 != 1 ? "error" : "portrait" : "landscape" : "none";
    }

    public final String r(int i10, int i11, int i12, int i13) {
        String string = bb.c(bb.a("x", Integer.valueOf(i10)), bb.a("y", Integer.valueOf(i11)), bb.a("width", Integer.valueOf(i12)), bb.a("height", Integer.valueOf(i13))).toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }

    public final void s(float f10) {
        this.L = f10;
    }

    public final void t(float f10, float f11) {
        float f12 = 4;
        float f13 = f10 / f12;
        float f14 = f10 / 2;
        float f15 = (f10 * 3) / f12;
        if (f11 >= f13 && f11 < f14) {
            A(s7.f71056g);
            return;
        }
        if (f11 >= f14 && f11 < f15) {
            A(s7.f71057h);
        } else if (f11 >= f15) {
            A(s7.f71058i);
        }
    }

    @Override // f1.ag
    public y0 u(y0 y0Var) {
        Intrinsics.checkNotNullParameter(y0Var, "<this>");
        return this.f71210o.u(y0Var);
    }

    public final void v(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        this.f71216u = displayMetrics.widthPixels;
        this.f71217v = displayMetrics.heightPixels;
    }

    public final void w(WebView webView) {
        Intrinsics.checkNotNullParameter(webView, "webView");
        this.f71218w = webView.getWidth();
        this.f71219x = webView.getHeight();
    }

    public final void x(z2 z2Var, String str) {
        if (str == null) {
            str = "no message";
        }
        e((y0) new w3(z2Var, str, this.f71200e, this.f71198c, this.f71205j, null, 32, null));
    }

    public static final class c implements v5 {
        public c() {
        }

        @Override // f1.v5
        public void a(String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            u3.this.I(message);
        }

        @Override // f1.v5
        public void b() {
            v4 v4VarB0 = u3.this.b0();
            l4 webView = v4VarB0 != null ? v4VarB0.getWebView() : null;
            if (u3.this.f71199d == a6.f69374e || webView == null) {
                return;
            }
            d4 d4VarU = u3.this.U();
            a6 a6Var = u3.this.f71199d;
            List list = Collections.EMPTY_LIST;
            Intrinsics.checkNotNullExpressionValue(list, "emptyList(...)");
            d4VarU.c(a6Var, webView, null, list);
        }

        @Override // f1.v5
        public void c() {
            u3.this.e0();
        }

        @Override // f1.v5
        public void d() {
            u3.this.g();
        }

        @Override // f1.v5
        public void a(View obstructionView) {
            Intrinsics.checkNotNullParameter(obstructionView, "obstructionView");
            u3.this.U().a(obstructionView);
        }

        @Override // f1.v5
        public void a() {
            u3.this.f71213r = System.currentTimeMillis();
        }
    }

    @Override // f1.Cif
    /* JADX INFO: renamed from: e */
    public void mo4436e(y0 event) {
        Intrinsics.checkNotNullParameter(event, "event");
        this.f71210o.mo4436e(event);
    }

    public /* synthetic */ u3(Context context, String str, a6 a6Var, String str2, t6 t6Var, m mVar, wf wfVar, w1 w1Var, b1.e eVar, String str3, d4 d4Var, u7 u7Var, r1 r1Var, ag agVar, Function2 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, a6Var, str2, t6Var, mVar, wfVar, w1Var, eVar, str3, d4Var, u7Var, r1Var, agVar, (i10 & 16384) != 0 ? a.f71222b : function2);
    }
}
