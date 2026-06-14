package com.taurusx.tax.w.c;

import android.text.TextUtils;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import com.taurusx.tax.api.TaurusXAds;
import com.taurusx.tax.g.b;
import com.taurusx.tax.g.l;
import com.taurusx.tax.g.v;
import com.taurusx.tax.log.LogUtil;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class y implements Serializable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public w f67265c;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f67266o;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public String f67267w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public z f67268y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f67269z;

    public static class w implements Serializable {

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public C0823w f67270w;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public z f67271z;

        /* JADX INFO: renamed from: com.taurusx.tax.w.c.y$w$w, reason: collision with other inner class name */
        public static class C0823w implements Serializable {
            public long A;
            public long B;
            public int C = -1;
            public int D = -1;
            public boolean E;
            public int F;
            public boolean G;
            public String H;
            public String I;
            public String J;
            public boolean K;
            public boolean L;
            public int M;
            public int N;
            public long O;
            public int P;
            public int Q;
            public int R;
            public int S;
            public int T;
            public int U;
            public boolean V;
            public int W;
            public int X;
            public boolean Y;

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f67272a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f67273b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public float f67274c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f67275d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public boolean f67276e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public long f67277f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public long f67278g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public boolean f67279h;

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public boolean f67280i;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public long f67281j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            public boolean f67282k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public boolean f67283l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            public int f67284m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            public long f67285n;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public float f67286o;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            public boolean f67287p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            public String f67288q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            public long f67289r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public String f67290s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            public long f67291t;

            /* JADX INFO: renamed from: u, reason: collision with root package name */
            public float f67292u;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            public int f67293v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public int f67294w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            public long f67295x;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public float f67296y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public int f67297z;

            public int A() {
                return this.f67272a;
            }

            public String B() {
                return this.f67290s;
            }

            public long C() {
                return this.f67285n;
            }

            public int D() {
                return this.Q;
            }

            public int E() {
                return this.R;
            }

            public int F() {
                return this.f67275d;
            }

            public int G() {
                return this.F;
            }

            public int H() {
                return this.W;
            }

            public int I() {
                return this.f67297z;
            }

            public boolean J() {
                return this.f67273b;
            }

            public boolean K() {
                return this.E;
            }

            public boolean L() {
                return this.f67282k;
            }

            public boolean M() {
                return this.f67279h;
            }

            public boolean N() {
                return this.f67287p;
            }

            public boolean O() {
                return this.f67283l;
            }

            public boolean P() {
                return this.f67280i;
            }

            public boolean Q() {
                return this.G;
            }

            public boolean R() {
                return this.f67276e;
            }

            public boolean S() {
                return this.Y;
            }

            public boolean T() {
                return this.V;
            }

            public void a(int i10) {
                this.C = i10;
            }

            public int b() {
                return this.P;
            }

            public void c(boolean z10) {
                this.f67280i = z10;
            }

            public int d() {
                return this.f67284m;
            }

            public void e(int i10) {
                this.f67297z = i10;
            }

            public void f(int i10) {
                this.f67272a = i10;
            }

            public int g() {
                return this.f67293v;
            }

            public long h() {
                return this.A;
            }

            public void i(int i10) {
                this.f67275d = i10;
            }

            public int j() {
                return this.C;
            }

            public float k() {
                return this.f67274c;
            }

            public long l() {
                return this.f67278g;
            }

            public int m() {
                return this.f67294w;
            }

            public float n() {
                return this.f67296y;
            }

            public void o(int i10) {
                this.f67294w = i10;
            }

            public String p() {
                return this.J;
            }

            public int q() {
                return this.U;
            }

            public float r() {
                return this.f67286o;
            }

            public void s(long j10) {
                this.f67285n = j10;
            }

            public void t(int i10) {
                this.f67284m = i10;
            }

            public long u() {
                return this.B;
            }

            public void v(int i10) {
                this.F = i10;
            }

            public void w(long j10) {
                this.f67278g = j10;
            }

            public int x() {
                return this.S;
            }

            public void y(long j10) {
                this.f67291t = j10;
            }

            public void z(float f10) {
                this.f67296y = f10;
            }

            public int a() {
                return this.T;
            }

            public float c() {
                return this.f67292u;
            }

            public long e() {
                return this.f67291t;
            }

            public int f() {
                return this.X;
            }

            public void g(int i10) {
                this.U = i10;
            }

            public String i() {
                return this.I;
            }

            public void l(int i10) {
                this.W = i10;
            }

            public void m(int i10) {
                this.Q = i10;
            }

            public void n(int i10) {
                this.P = i10;
            }

            public void o(String str) {
                this.f67290s = str;
            }

            public void p(int i10) {
                this.R = i10;
            }

            public void s(boolean z10) {
                this.f67276e = z10;
            }

            public String t() {
                return this.f67288q;
            }

            public String v() {
                return this.H;
            }

            public void w(boolean z10) {
                this.f67287p = z10;
            }

            public void y(int i10) {
                this.f67293v = i10;
            }

            public long z() {
                return this.f67277f;
            }

            public void a(boolean z10) {
                this.Y = z10;
            }

            public void c(long j10) {
                this.B = j10;
            }

            public void n(boolean z10) {
                this.V = z10;
            }

            public long o() {
                return this.f67289r;
            }

            public long s() {
                return this.f67281j;
            }

            public void w(String str) {
                this.J = str;
            }

            public void y(boolean z10) {
                this.f67283l = z10;
            }

            public void z(long j10) {
                this.f67277f = j10;
            }

            public void c(String str) {
                this.H = str;
            }

            public void o(long j10) {
                this.A = j10;
            }

            public void s(int i10) {
                this.S = i10;
            }

            public void w(float f10) {
                this.f67274c = f10;
            }

            public long y() {
                return this.f67295x;
            }

            public void z(String str) {
                this.f67288q = str;
            }

            public void c(int i10) {
                this.X = i10;
            }

            public void o(boolean z10) {
                this.G = z10;
            }

            public int w() {
                return this.D;
            }

            public void y(String str) {
                this.I = str;
            }

            public void z(int i10) {
                this.D = i10;
            }

            public void w(int i10) {
                this.T = i10;
            }

            public void y(float f10) {
                this.f67286o = f10;
            }

            public void z(boolean z10) {
                this.E = z10;
            }

            public static C0823w z(JSONObject jSONObject) {
                C0823w c0823w = new C0823w();
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.taurusx.tax.w.o.z.f67413j0);
                if (jSONObjectOptJSONObject != null) {
                    c0823w.f67297z = (int) jSONObjectOptJSONObject.optLong(com.taurusx.tax.w.o.z.f67461z0, com.taurusx.tax.w.o.w.c0());
                    c0823w.f67294w = (int) jSONObjectOptJSONObject.optLong(com.taurusx.tax.w.o.z.B0, com.taurusx.tax.w.o.w.C());
                    c0823w.f67296y = (float) jSONObjectOptJSONObject.optDouble(com.taurusx.tax.w.o.z.f67458y0, com.taurusx.tax.w.o.w.d());
                    c0823w.f67274c = (float) jSONObjectOptJSONObject.optDouble(com.taurusx.tax.w.o.z.V0, com.taurusx.tax.w.o.w.K());
                    c0823w.f67286o = (float) jSONObjectOptJSONObject.optDouble(com.taurusx.tax.w.o.z.W0, com.taurusx.tax.w.o.w.N());
                    c0823w.f67290s = jSONObjectOptJSONObject.optString(com.taurusx.tax.w.o.z.f67422m0, null);
                    c0823w.f67272a = jSONObjectOptJSONObject.optInt(com.taurusx.tax.w.o.z.f67425n0, 0);
                    c0823w.f67285n = jSONObjectOptJSONObject.optLong(com.taurusx.tax.w.o.z.A0, com.taurusx.tax.w.o.w.d0());
                    c0823w.f67291t = jSONObjectOptJSONObject.optLong(com.taurusx.tax.w.o.z.D0, com.taurusx.tax.w.o.w.I());
                    c0823w.f67278g = jSONObjectOptJSONObject.optLong(com.taurusx.tax.w.o.z.C0, com.taurusx.tax.w.o.w.J());
                    c0823w.f67277f = jSONObjectOptJSONObject.optLong(com.taurusx.tax.w.o.z.f67440s0, com.taurusx.tax.w.o.w.w());
                    c0823w.f67284m = jSONObjectOptJSONObject.optInt(com.taurusx.tax.w.o.z.f67390b1, com.taurusx.tax.w.o.w.Q());
                    c0823w.f67287p = jSONObjectOptJSONObject.optBoolean(com.taurusx.tax.w.o.z.E0, com.taurusx.tax.w.o.w.z());
                    c0823w.f67280i = jSONObjectOptJSONObject.optBoolean(com.taurusx.tax.w.o.z.H0, false);
                    c0823w.f67293v = jSONObjectOptJSONObject.optInt(com.taurusx.tax.w.o.z.I0, 0);
                    c0823w.f67283l = jSONObjectOptJSONObject.optBoolean(com.taurusx.tax.w.o.z.G0, false);
                    c0823w.f67276e = jSONObjectOptJSONObject.optBoolean(com.taurusx.tax.w.o.z.F0, false);
                    c0823w.f67282k = jSONObjectOptJSONObject.optBoolean(com.taurusx.tax.w.o.z.J0, com.taurusx.tax.w.o.w.l());
                    c0823w.f67292u = (float) jSONObjectOptJSONObject.optDouble(com.taurusx.tax.w.o.z.K0, com.taurusx.tax.w.o.w.e());
                    c0823w.f67295x = jSONObjectOptJSONObject.optLong(com.taurusx.tax.w.o.z.L0, com.taurusx.tax.w.o.w.v());
                    c0823w.f67289r = jSONObjectOptJSONObject.optLong(com.taurusx.tax.w.o.z.M0, com.taurusx.tax.w.o.w.k());
                    c0823w.f67279h = jSONObjectOptJSONObject.optBoolean(com.taurusx.tax.w.o.z.O0, com.taurusx.tax.w.o.w.u());
                    c0823w.f67281j = jSONObjectOptJSONObject.optLong(com.taurusx.tax.w.o.z.N0, com.taurusx.tax.w.o.w.x());
                    c0823w.f67273b = jSONObjectOptJSONObject.optBoolean(com.taurusx.tax.w.o.z.P0, com.taurusx.tax.w.o.w.g());
                    c0823w.f67275d = jSONObjectOptJSONObject.optInt(com.taurusx.tax.w.o.z.S0, com.taurusx.tax.w.o.w.i0());
                    c0823w.f67288q = jSONObjectOptJSONObject.optString(com.taurusx.tax.w.o.z.f67419l0, null);
                    c0823w.A = jSONObjectOptJSONObject.optLong(com.taurusx.tax.w.o.z.T0, com.taurusx.tax.w.o.w.O());
                    c0823w.B = jSONObjectOptJSONObject.optLong(com.taurusx.tax.w.o.z.U0, com.taurusx.tax.w.o.w.L());
                    c0823w.F = jSONObjectOptJSONObject.optInt(com.taurusx.tax.w.o.z.X0, 1);
                    c0823w.G = jSONObjectOptJSONObject.optBoolean(com.taurusx.tax.w.o.z.Y0, com.taurusx.tax.w.o.w.j0());
                    c0823w.H = jSONObjectOptJSONObject.optString(com.taurusx.tax.w.o.z.Z0, com.taurusx.tax.w.o.w.h0());
                    c0823w.I = jSONObjectOptJSONObject.optString(com.taurusx.tax.w.o.z.f67387a1, com.taurusx.tax.w.o.w.g0());
                    c0823w.J = jSONObjectOptJSONObject.optString(com.taurusx.tax.w.o.z.A1, com.taurusx.tax.w.o.w.f0());
                    c0823w.C = jSONObjectOptJSONObject.optInt(com.taurusx.tax.w.o.z.f67428o0, -1);
                    c0823w.D = jSONObjectOptJSONObject.optInt(com.taurusx.tax.w.o.z.f67431p0, -1);
                    c0823w.E = jSONObjectOptJSONObject.optBoolean(com.taurusx.tax.w.o.z.f67426n1, com.taurusx.tax.w.o.w.m());
                    c0823w.K = jSONObjectOptJSONObject.optBoolean(com.taurusx.tax.w.o.z.f67393c1, com.taurusx.tax.w.o.w.U());
                    c0823w.L = jSONObjectOptJSONObject.optBoolean(com.taurusx.tax.w.o.z.f67396d1, com.taurusx.tax.w.o.w.V());
                    if (jSONObjectOptJSONObject.has(com.taurusx.tax.w.o.z.f67399e1)) {
                        c0823w.M = jSONObjectOptJSONObject.optInt(com.taurusx.tax.w.o.z.f67399e1);
                        b.z().z(TaurusXAds.getContext(), b.f66094p, System.currentTimeMillis());
                    } else {
                        c0823w.M = com.taurusx.tax.w.o.w.R();
                    }
                    c0823w.N = jSONObjectOptJSONObject.optInt(com.taurusx.tax.w.o.z.f67402f1, com.taurusx.tax.w.o.w.S());
                    long jOptLong = jSONObjectOptJSONObject.optLong(com.taurusx.tax.w.o.z.f67405g1, com.taurusx.tax.w.o.w.T());
                    c0823w.O = jOptLong;
                    com.taurusx.tax.w.o.w.z(c0823w.K, c0823w.L, c0823w.M, c0823w.N, jOptLong);
                    c0823w.P = jSONObjectOptJSONObject.optInt(com.taurusx.tax.w.o.z.f67408h1, com.taurusx.tax.w.o.w.P());
                    c0823w.Q = jSONObjectOptJSONObject.optInt(com.taurusx.tax.w.o.z.f67411i1, com.taurusx.tax.w.o.w.a0());
                    c0823w.R = jSONObjectOptJSONObject.optInt(com.taurusx.tax.w.o.z.f67414j1, com.taurusx.tax.w.o.w.e0());
                    c0823w.S = jSONObjectOptJSONObject.optInt(com.taurusx.tax.w.o.z.f67417k1, com.taurusx.tax.w.o.w.M());
                    c0823w.U = jSONObjectOptJSONObject.optInt(com.taurusx.tax.w.o.z.f67423m1, com.taurusx.tax.w.o.w.X());
                    c0823w.T = jSONObjectOptJSONObject.optInt(com.taurusx.tax.w.o.z.f67420l1, com.taurusx.tax.w.o.w.r());
                    c0823w.S = jSONObjectOptJSONObject.optInt(com.taurusx.tax.w.o.z.f67417k1, com.taurusx.tax.w.o.w.M());
                    c0823w.V = jSONObjectOptJSONObject.optBoolean(com.taurusx.tax.w.o.z.f67429o1, com.taurusx.tax.w.o.w.m0());
                    c0823w.W = jSONObjectOptJSONObject.optInt(com.taurusx.tax.w.o.z.f67432p1, com.taurusx.tax.w.o.w.k0());
                    c0823w.X = jSONObjectOptJSONObject.optInt(com.taurusx.tax.w.o.z.f67435q1, com.taurusx.tax.w.o.w.B());
                    c0823w.Y = jSONObjectOptJSONObject.optBoolean(com.taurusx.tax.w.o.z.f67438r1, com.taurusx.tax.w.o.w.l0());
                } else {
                    c0823w.f67297z = (int) com.taurusx.tax.w.o.w.c0();
                    c0823w.f67294w = (int) com.taurusx.tax.w.o.w.C();
                    c0823w.f67296y = com.taurusx.tax.w.o.w.d();
                    c0823w.f67274c = com.taurusx.tax.w.o.w.K();
                    c0823w.f67286o = com.taurusx.tax.w.o.w.N();
                    c0823w.f67290s = com.taurusx.tax.w.o.w.Z();
                    c0823w.f67272a = com.taurusx.tax.w.o.w.b0();
                    c0823w.f67285n = com.taurusx.tax.w.o.w.d0();
                    c0823w.f67278g = com.taurusx.tax.w.o.w.J();
                    c0823w.f67277f = com.taurusx.tax.w.o.w.w();
                    c0823w.f67284m = com.taurusx.tax.w.o.w.Q();
                    c0823w.f67287p = com.taurusx.tax.w.o.w.z();
                    c0823w.f67276e = com.taurusx.tax.w.o.w.n0();
                    c0823w.f67282k = com.taurusx.tax.w.o.w.l();
                    c0823w.f67292u = com.taurusx.tax.w.o.w.e();
                    c0823w.f67295x = com.taurusx.tax.w.o.w.v();
                    c0823w.f67289r = com.taurusx.tax.w.o.w.k();
                    c0823w.f67279h = com.taurusx.tax.w.o.w.u();
                    c0823w.f67281j = com.taurusx.tax.w.o.w.x();
                    c0823w.f67273b = com.taurusx.tax.w.o.w.g();
                    c0823w.f67275d = com.taurusx.tax.w.o.w.i0();
                    c0823w.A = com.taurusx.tax.w.o.w.O();
                    c0823w.B = com.taurusx.tax.w.o.w.L();
                    c0823w.G = com.taurusx.tax.w.o.w.j0();
                    c0823w.H = com.taurusx.tax.w.o.w.h0();
                    c0823w.I = com.taurusx.tax.w.o.w.g0();
                    c0823w.J = com.taurusx.tax.w.o.w.f0();
                    c0823w.E = com.taurusx.tax.w.o.w.m();
                    c0823w.P = com.taurusx.tax.w.o.w.P();
                    c0823w.Q = com.taurusx.tax.w.o.w.a0();
                    c0823w.S = com.taurusx.tax.w.o.w.M();
                    c0823w.R = com.taurusx.tax.w.o.w.e0();
                    c0823w.V = com.taurusx.tax.w.o.w.m0();
                    c0823w.W = com.taurusx.tax.w.o.w.k0();
                    c0823w.X = com.taurusx.tax.w.o.w.B();
                    c0823w.Y = com.taurusx.tax.w.o.w.l0();
                }
                l.z(c0823w.f67284m == 2);
                return c0823w;
            }
        }

        public static class z implements Serializable {

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public int f67298w;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public int f67299y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public int f67300z;

            public int w() {
                return this.f67298w;
            }

            public int y() {
                return this.f67299y;
            }

            public int z() {
                return this.f67300z;
            }

            public void w(int i10) {
                this.f67298w = i10;
            }

            public void y(int i10) {
                this.f67299y = i10;
            }

            public void z(int i10) {
                this.f67300z = i10;
            }

            public static z z(JSONObject jSONObject) {
                try {
                    z zVar = new z();
                    JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.taurusx.tax.w.o.z.f67413j0);
                    if (jSONObjectOptJSONObject != null) {
                        JSONObject jSONObjectOptJSONObject2 = jSONObjectOptJSONObject.optJSONObject(com.taurusx.tax.w.o.z.f67446u0);
                        if (jSONObjectOptJSONObject2 != null) {
                            if (jSONObjectOptJSONObject2.has(com.taurusx.tax.w.o.z.f67449v0)) {
                                zVar.f67300z = (int) new BigDecimal(String.valueOf(jSONObjectOptJSONObject2.getDouble(com.taurusx.tax.w.o.z.f67449v0))).multiply(new BigDecimal(String.valueOf(100))).doubleValue();
                            } else {
                                zVar.f67300z = (int) new BigDecimal(String.valueOf(com.taurusx.tax.w.o.w.b())).multiply(new BigDecimal(String.valueOf(100))).doubleValue();
                            }
                            zVar.f67298w = (int) (jSONObjectOptJSONObject2.optLong(com.taurusx.tax.w.o.z.f67452w0, com.taurusx.tax.w.o.w.j()) / 1000);
                            zVar.f67299y = (int) (jSONObjectOptJSONObject2.optLong(com.taurusx.tax.w.o.z.f67455x0, com.taurusx.tax.w.o.w.h()) / 1000);
                            return zVar;
                        }
                        zVar.f67300z = (int) new BigDecimal(String.valueOf(com.taurusx.tax.w.o.w.b())).multiply(new BigDecimal(String.valueOf(100))).doubleValue();
                        zVar.f67298w = (int) (com.taurusx.tax.w.o.w.j() / 1000);
                        zVar.f67299y = (int) (com.taurusx.tax.w.o.w.h() / 1000);
                        return zVar;
                    }
                    zVar.f67300z = (int) new BigDecimal(String.valueOf(com.taurusx.tax.w.o.w.b())).multiply(new BigDecimal(String.valueOf(100))).doubleValue();
                    zVar.f67298w = (int) (com.taurusx.tax.w.o.w.j() / 1000);
                    zVar.f67299y = (int) (com.taurusx.tax.w.o.w.h() / 1000);
                    return zVar;
                } catch (JSONException e10) {
                    e10.printStackTrace();
                    return new z();
                }
            }
        }

        public C0823w w() {
            return this.f67270w;
        }

        public z z() {
            return this.f67271z;
        }

        public void z(z zVar) {
            this.f67271z = zVar;
        }

        public void z(C0823w c0823w) {
            this.f67270w = c0823w;
        }

        public static w z(JSONObject jSONObject) {
            w wVar = new w();
            wVar.f67271z = z.z(jSONObject);
            wVar.f67270w = C0823w.z(jSONObject);
            return wVar;
        }
    }

    public static class z implements Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public String f67301a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f67302c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public String f67303e;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f67307k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public String f67308l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public String f67310n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public String f67311o;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public String f67313s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public String f67314t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public C0824z f67315u;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public float f67317w;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public String f67318y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public String f67319z;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ArrayList<String> f67305g = new ArrayList<>();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public ArrayList<String> f67304f = new ArrayList<>();

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public ArrayList<String> f67309m = new ArrayList<>();

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public ArrayList<String> f67312p = new ArrayList<>();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public ArrayList<String> f67306i = new ArrayList<>();

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public ArrayList<String> f67316v = new ArrayList<>();

        /* JADX INFO: renamed from: com.taurusx.tax.w.c.y$z$z, reason: collision with other inner class name */
        public static class C0824z implements Serializable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f67320a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public String f67321c;

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public String f67322o;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            public String f67323s;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            public String f67324w;

            /* JADX INFO: renamed from: y, reason: collision with root package name */
            public String f67325y;

            /* JADX INFO: renamed from: z, reason: collision with root package name */
            public C0825z f67326z;

            /* JADX INFO: renamed from: com.taurusx.tax.w.c.y$z$z$z, reason: collision with other inner class name */
            public static class C0825z implements Serializable {

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                public int f67327w;

                /* JADX INFO: renamed from: z, reason: collision with root package name */
                public String f67328z;

                public String w() {
                    return this.f67328z;
                }

                public void z(String str) {
                    this.f67328z = str;
                }

                public int z() {
                    return this.f67327w;
                }

                public void z(int i10) {
                    this.f67327w = i10;
                }
            }

            public String a() {
                return this.f67321c;
            }

            public int s() {
                return this.f67320a;
            }

            public C0825z c() {
                return this.f67326z;
            }

            public String o() {
                return this.f67325y;
            }

            public String w() {
                return this.f67323s;
            }

            public String y() {
                return this.f67322o;
            }

            public void c(String str) {
                this.f67325y = str;
            }

            public void o(String str) {
                this.f67321c = str;
            }

            public void w(String str) {
                this.f67323s = str;
            }

            public void y(String str) {
                this.f67322o = str;
            }

            public void z(C0825z c0825z) {
                this.f67326z = c0825z;
            }

            public String z() {
                return this.f67324w;
            }

            public void z(String str) {
                this.f67324w = str;
            }

            public void z(int i10) {
                this.f67320a = i10;
            }
        }

        public String a() {
            return this.f67308l;
        }

        public void c(ArrayList<String> arrayList) {
            this.f67306i = arrayList;
        }

        public float e() {
            return this.f67317w;
        }

        public C0824z f() {
            return this.f67315u;
        }

        public void g(String str) {
            this.f67314t = str;
        }

        public ArrayList<String> i() {
            return this.f67305g;
        }

        public String k() {
            return this.f67314t;
        }

        public ArrayList<String> l() {
            return this.f67316v;
        }

        public String m() {
            return this.f67303e;
        }

        public void n(String str) {
            this.f67303e = str;
        }

        public String o() {
            return this.f67301a;
        }

        public String p() {
            return this.f67319z;
        }

        public ArrayList<String> s() {
            return this.f67304f;
        }

        public void t(String str) {
            this.f67319z = str;
        }

        public ArrayList<String> u() {
            return this.f67312p;
        }

        public ArrayList<String> v() {
            return this.f67306i;
        }

        public String w() {
            return this.f67310n;
        }

        public void y(String str) {
            this.f67301a = str;
        }

        public void z(C0824z c0824z) {
            this.f67315u = c0824z;
        }

        public void a(String str) {
            this.f67311o = str;
        }

        public ArrayList<String> c() {
            return this.f67309m;
        }

        public String g() {
            return this.f67311o;
        }

        public String n() {
            return this.f67313s;
        }

        public void o(ArrayList<String> arrayList) {
            this.f67316v = arrayList;
        }

        public void s(ArrayList<String> arrayList) {
            this.f67312p = arrayList;
        }

        public String t() {
            return this.f67302c;
        }

        public void w(String str) {
            this.f67310n = str;
        }

        public void y(ArrayList<String> arrayList) {
            this.f67305g = arrayList;
        }

        public void z(float f10) {
            this.f67317w = f10;
        }

        public void c(String str) {
            this.f67308l = str;
        }

        public void o(String str) {
            this.f67313s = str;
        }

        public void s(String str) {
            this.f67302c = str;
        }

        public void w(ArrayList<String> arrayList) {
            this.f67304f = arrayList;
        }

        public int y() {
            return this.f67307k;
        }

        public String z() {
            return this.f67318y;
        }

        public void z(String str) {
            this.f67318y = str;
        }

        public void z(ArrayList<String> arrayList) {
            this.f67309m = arrayList;
        }

        public void z(int i10) {
            this.f67307k = i10;
        }

        public static z z(JSONObject jSONObject) {
            z zVar;
            if (jSONObject == null || !jSONObject.has(com.taurusx.tax.w.o.z.f67403g)) {
                zVar = null;
            } else {
                zVar = new z();
                z(zVar, jSONObject);
                JSONObject jSONObjectW = v.w(jSONObject, com.taurusx.tax.w.o.z.f67403g);
                String strC = v.c(jSONObjectW, com.taurusx.tax.w.o.z.f67400f);
                zVar.f67310n = strC;
                if ("vast".equalsIgnoreCase(strC)) {
                    zVar.f67318y = v.c(jSONObjectW, com.taurusx.tax.w.o.z.f67421m);
                } else if ("native".equalsIgnoreCase(zVar.f67310n)) {
                    zVar.f67318y = v.c(jSONObjectW, com.taurusx.tax.w.o.z.f67409i);
                } else if ("html".equalsIgnoreCase(zVar.f67310n)) {
                    zVar.f67318y = v.c(jSONObjectW, com.taurusx.tax.w.o.z.f67430p);
                } else if (POBCoreNativeConstants.NATIVE_LINK.equalsIgnoreCase(zVar.f67310n)) {
                    zVar.f67318y = v.c(jSONObjectW, com.taurusx.tax.w.o.z.f67448v);
                }
                JSONObject jSONObjectW2 = v.w(jSONObjectW, com.taurusx.tax.w.o.z.B);
                if (jSONObjectW2 != null) {
                    zVar.f67315u = new C0824z();
                    JSONObject jSONObjectW3 = v.w(jSONObjectW2, com.taurusx.tax.w.o.z.C);
                    if (jSONObjectW3 != null) {
                        zVar.f67315u.f67326z = new C0824z.C0825z();
                        String strC2 = v.c(jSONObjectW3, com.taurusx.tax.w.o.z.E);
                        int iZ = v.z(jSONObjectW3, com.taurusx.tax.w.o.z.D);
                        zVar.f67315u.f67326z.f67328z = strC2;
                        zVar.f67315u.f67326z.f67327w = iZ;
                    }
                    String strC3 = v.c(jSONObjectW2, com.taurusx.tax.w.o.z.F);
                    if (!TextUtils.isEmpty(strC3)) {
                        zVar.f67315u.f67324w = strC3;
                    }
                    String strC4 = v.c(jSONObjectW2, com.taurusx.tax.w.o.z.f67436r);
                    if (!TextUtils.isEmpty(strC4)) {
                        zVar.f67315u.f67325y = strC4;
                    }
                    String strC5 = v.c(jSONObjectW2, com.taurusx.tax.w.o.z.f67397e);
                    if (!TextUtils.isEmpty(strC5)) {
                        zVar.f67315u.f67321c = strC5;
                    }
                    String strC6 = v.c(jSONObjectW2, com.taurusx.tax.w.o.z.f67389b0);
                    if (!TextUtils.isEmpty(strC6)) {
                        zVar.f67315u.f67322o = strC6;
                    }
                    String strC7 = v.c(jSONObjectW2, com.taurusx.tax.w.o.z.f67445u);
                    if (!TextUtils.isEmpty(strC7)) {
                        zVar.f67315u.f67323s = strC7;
                    }
                    zVar.f67315u.f67320a = v.z(jSONObjectW2, com.taurusx.tax.w.o.z.f67392c0);
                }
                zVar.f67302c = v.c(jSONObjectW, com.taurusx.tax.w.o.z.f67433q);
                zVar.f67311o = v.c(jSONObjectW, com.taurusx.tax.w.o.z.f67394d);
                zVar.f67313s = v.c(jSONObjectW, com.taurusx.tax.w.o.z.f67388b);
                zVar.f67308l = v.c(jSONObjectW, com.taurusx.tax.w.o.z.f67406h);
                zVar.f67303e = v.c(jSONObjectW, com.taurusx.tax.w.o.z.f67412j);
                zVar.f67307k = v.z(jSONObjectW, com.taurusx.tax.w.o.z.A);
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("adm : ");
            sb2.append(zVar != null ? zVar.f67318y : null);
            LogUtil.sensitiveD("taurusx", sb2.toString());
            return zVar;
        }

        public static void z(z zVar, JSONObject jSONObject) {
            if (zVar == null || jSONObject == null) {
                return;
            }
            zVar.f67314t = jSONObject.optString(com.taurusx.tax.w.o.z.f67427o);
            zVar.f67317w = Double.valueOf(jSONObject.optDouble(com.taurusx.tax.w.o.z.f67442t)).floatValue();
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(com.taurusx.tax.w.o.z.f67398e0);
            ArrayList<String> arrayListZ = v.z(jSONObjectOptJSONObject.optJSONArray(com.taurusx.tax.w.o.z.f67444t1));
            if (arrayListZ != null && !arrayListZ.isEmpty()) {
                zVar.f67305g.addAll(arrayListZ);
            }
            ArrayList<String> arrayListZ2 = v.z(jSONObjectOptJSONObject.optJSONArray(com.taurusx.tax.w.o.z.f67441s1));
            if (arrayListZ2 != null && !arrayListZ2.isEmpty()) {
                zVar.f67309m.addAll(arrayListZ2);
            }
            ArrayList<String> arrayListZ3 = v.z(jSONObjectOptJSONObject.optJSONArray(com.taurusx.tax.w.o.z.f67447u1));
            if (arrayListZ3 != null && !arrayListZ3.isEmpty()) {
                zVar.f67304f.addAll(arrayListZ3);
            }
            ArrayList<String> arrayListZ4 = v.z(jSONObjectOptJSONObject.optJSONArray(com.taurusx.tax.w.o.z.f67450v1));
            if (arrayListZ4 != null && !arrayListZ4.isEmpty()) {
                zVar.f67312p.addAll(arrayListZ4);
            }
            ArrayList<String> arrayListZ5 = v.z(jSONObjectOptJSONObject.optJSONArray(com.taurusx.tax.w.o.z.f67453w1));
            if (arrayListZ5 != null && !arrayListZ5.isEmpty()) {
                zVar.f67306i.addAll(arrayListZ5);
            }
            ArrayList<String> arrayListZ6 = v.z(jSONObjectOptJSONObject.optJSONArray(com.taurusx.tax.w.o.z.f67401f0));
            if (arrayListZ6 != null && !arrayListZ6.isEmpty()) {
                zVar.f67316v.addAll(arrayListZ6);
            }
            zVar.f67301a = jSONObject.optString(com.taurusx.tax.w.o.z.f67395d0);
        }
    }

    public w c() {
        return this.f67265c;
    }

    public String o() {
        return this.f67266o;
    }

    public void w(String str) {
        this.f67267w = str;
    }

    public String y() {
        return this.f67267w;
    }

    public String z() {
        return this.f67269z;
    }

    public z w() {
        return this.f67268y;
    }

    public void y(String str) {
        this.f67266o = str;
    }

    public void z(String str) {
        this.f67269z = str;
    }

    public void z(z zVar) {
        this.f67268y = zVar;
    }

    public void z(w wVar) {
        this.f67265c = wVar;
    }

    public static y z(JSONObject jSONObject) {
        y yVar = new y();
        yVar.f67269z = jSONObject.optString(com.taurusx.tax.w.o.z.f67439s, null);
        yVar.f67267w = jSONObject.optString(com.taurusx.tax.w.o.z.f67385a, null);
        yVar.f67266o = jSONObject.optString(com.taurusx.tax.w.o.z.f67424n, null);
        yVar.f67268y = z.z(jSONObject);
        yVar.f67265c = w.z(jSONObject);
        return yVar;
    }
}
