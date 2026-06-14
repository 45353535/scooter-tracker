package yads;

import android.content.Context;
import android.location.Location;
import android.os.Build;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.collections.MapsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ft0 {
    public Location A;
    public String A0;
    public Integer B;
    public String B0;
    public Integer C;
    public String C0;
    public Float D;
    public String D0;
    public Integer E;
    public String E0;
    public Integer F;
    public String F0;
    public String G;
    public Boolean G0;
    public String H;
    public String H0;
    public e9 I;
    public Integer J;
    public String J0;
    public Integer K;
    public String K0;
    public String L;
    public String L0;
    public Boolean M;
    public String M0;
    public Boolean N;
    public String N0;
    public String O;
    public Boolean O0;
    public Boolean P;
    public Boolean P0;
    public String Q;
    public Boolean Q0;
    public Integer R;
    public Boolean S;
    public String T;
    public String U;
    public String V;
    public String W;
    public String X;
    public Long Y;
    public String Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f110856a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public String f110857a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public String f110859b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public String f110861c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public String f110863d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public String f110865e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f110866f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public String f110867f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f110868g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public String f110869g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public String f110871h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public String f110873i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Boolean f110874j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public String f110875j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Boolean f110876k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public String f110877k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f110878l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public String f110879l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Integer f110880m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public List f110881m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f110882n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public String f110883n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f110884o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public String f110885o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public String f110886p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public String f110887p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public String f110888q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public String f110889q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public String f110890r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public int f110891r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public String f110892s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public float f110893s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public String f110894t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public float f110895t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public String f110896u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public float f110897u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public String f110898v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public float f110899v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Integer f110900w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public float f110901w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Integer f110902x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public float f110903x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public String f110904y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public String f110905y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f110906z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public String f110907z0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final rf0 f110858b = new rf0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final bh f110860c = new bh();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final du2 f110862d = new du2();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final qd f110864e = new qd();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final HashMap f110870h = new HashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final HashMap f110872i = new HashMap();
    public Map I0 = MapsKt.emptyMap();

    public ft0(boolean z10) {
        this.f110856a = z10;
    }

    public final String A() {
        return this.f110861c0;
    }

    public final Integer B() {
        return this.f110902x;
    }

    public final Boolean C() {
        return this.P;
    }

    public final String D() {
        return this.V;
    }

    public final String E() {
        return this.f110877k0;
    }

    public final String F() {
        return this.f110873i0;
    }

    public final String G() {
        return this.f110875j0;
    }

    public final String H() {
        return this.G;
    }

    public final String I() {
        return this.f110859b0;
    }

    public final Boolean J() {
        return this.P0;
    }

    public final String K() {
        return this.f110906z;
    }

    public final String L() {
        return this.f110869g0;
    }

    public final String M() {
        return this.f110871h0;
    }

    public final HashMap N() {
        return this.f110872i;
    }

    public final List O() {
        return this.f110881m0;
    }

    public final String P() {
        return this.D0;
    }

    public final String Q() {
        return this.f110863d0;
    }

    public final String R() {
        return this.f110888q;
    }

    public final String S() {
        return this.W;
    }

    public final float T() {
        return this.f110899v0;
    }

    public final float U() {
        return this.f110893s0;
    }

    public final float V() {
        return this.f110897u0;
    }

    public final float W() {
        return this.f110895t0;
    }

    public final Float X() {
        return this.D;
    }

    public final int Y() {
        return this.f110891r0;
    }

    public final Integer Z() {
        return this.C;
    }

    public final String a() {
        return this.f110904y;
    }

    public final Integer a0() {
        return this.B;
    }

    public final String b() {
        return this.f110898v;
    }

    public final String b0() {
        return this.A0;
    }

    public final String c() {
        return this.f110896u;
    }

    public final String c0() {
        return this.B0;
    }

    public final String d() {
        return this.f110892s;
    }

    public final String d0() {
        return this.K0;
    }

    public final HashMap e() {
        return this.f110870h;
    }

    public final Long e0() {
        return this.Y;
    }

    public final Integer f() {
        return this.f110880m;
    }

    public final String f0() {
        return this.X;
    }

    public final Boolean g() {
        return this.f110876k;
    }

    public final Map g0() {
        return this.I0;
    }

    public final String h() {
        return this.f110883n0;
    }

    public final String h0() {
        return this.H0;
    }

    public final String i() {
        return this.f110879l0;
    }

    public final String i0() {
        return this.N0;
    }

    public final String j() {
        return this.C0;
    }

    public final String j0() {
        return this.J0;
    }

    public final String k() {
        return this.f110885o0;
    }

    public final Boolean k0() {
        return this.f110874j;
    }

    public final String l() {
        return this.f110887p0;
    }

    public final String l0() {
        return this.f110890r;
    }

    public final String m() {
        return this.H;
    }

    public final String m0() {
        return this.F0;
    }

    public final String n() {
        return this.Z;
    }

    public final Boolean n0() {
        return this.Q0;
    }

    public final boolean o() {
        return this.f110882n;
    }

    public final Boolean o0() {
        return this.G0;
    }

    public final String p() {
        return this.f110865e0;
    }

    public final Integer p0() {
        return this.f110900w;
    }

    public final float q() {
        return this.f110903x0;
    }

    public final Boolean q0() {
        return this.S;
    }

    public final float r() {
        return this.f110901w0;
    }

    public final String s() {
        return this.f110857a0;
    }

    public final String t() {
        return this.E0;
    }

    public final String u() {
        return this.f110867f0;
    }

    public final Boolean v() {
        return this.N;
    }

    public final String w() {
        return this.f110884o;
    }

    public final String x() {
        return this.f110886p;
    }

    public final Boolean y() {
        return this.O0;
    }

    public final Boolean z() {
        return this.M;
    }

    public final ft0 a(Context context, String str) {
        this.f110867f0 = this.f110858b.a(context);
        this.f110858b.getClass();
        this.f110869g0 = "android";
        this.f110858b.getClass();
        this.f110871h0 = Build.VERSION.RELEASE;
        this.f110858b.getClass();
        this.f110873i0 = rf0.a();
        this.f110858b.getClass();
        this.f110875j0 = Build.MODEL;
        kf1 kf1Var = this.f110858b.f115435b;
        kf1Var.getClass();
        Locale locale = context.getResources().getConfiguration().locale;
        kf1Var.f112700a.getClass();
        this.f110877k0 = if1.a(locale);
        this.f110879l0 = this.f110858b.f115435b.a(context);
        this.f110881m0 = this.f110858b.f115435b.b(context);
        if (this.f110856a) {
            str = null;
        }
        this.f110889q0 = str;
        this.f110858b.getClass();
        this.S = Boolean.valueOf(tp2.a());
        return this;
    }
}
