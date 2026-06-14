package sg.bigo.ads.controller.e;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import com.ironsource.X3;
import sg.bigo.ads.api.AdConfig;
import sg.bigo.ads.common.utils.p;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.common.utils.r;

/* JADX INFO: loaded from: classes4.dex */
public final class d implements sg.bigo.ads.common.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NonNull
    public AdConfig f103594a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    final Context f103595b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    final sg.bigo.ads.controller.b.d f103596c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f103597d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f103598e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f103599f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    String f103600g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    String f103601h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    String f103602i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    String f103603j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    String f103604k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f103605l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f103606m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    String f103607n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    String f103608o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f103609p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    long f103610q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    long f103611r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f103612s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    String f103613t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private long f103615v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private long f103616w = 0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    int f103614u = 0;

    d(@NonNull Context context, @NonNull AdConfig adConfig, @NonNull sg.bigo.ads.controller.b.d dVar) {
        this.f103595b = context;
        this.f103594a = adConfig;
        this.f103596c = dVar;
    }

    @Override // sg.bigo.ads.common.g
    public final String A() {
        sg.bigo.ads.common.a aVarL = this.f103596c.L();
        return aVarL != null ? aVarL.f102253b : "";
    }

    @Override // sg.bigo.ads.common.g
    public final String B() {
        return sg.bigo.ads.common.b.a.a(this.f103595b);
    }

    @Override // sg.bigo.ads.common.g
    public final String C() {
        return this.f103596c.F();
    }

    @Override // sg.bigo.ads.common.g
    public final int D() {
        return (int) (r.b() / 1000);
    }

    @Override // sg.bigo.ads.common.g
    public final String E() {
        return this.f103596c.j();
    }

    @Override // sg.bigo.ads.common.g
    public final boolean F() {
        sg.bigo.ads.common.a aVarK = this.f103596c.K();
        if (aVarK != null) {
            return aVarK.f102254c;
        }
        return true;
    }

    @Override // sg.bigo.ads.common.g
    public final String G() {
        sg.bigo.ads.common.a aVarK = this.f103596c.K();
        return aVarK != null ? aVarK.f102253b : "";
    }

    @Override // sg.bigo.ads.common.g
    public final String H() {
        return this.f103607n;
    }

    @Override // sg.bigo.ads.common.g
    public final String I() {
        return this.f103608o;
    }

    @Override // sg.bigo.ads.common.g
    public final int J() {
        return this.f103609p;
    }

    @Override // sg.bigo.ads.common.g
    public final long K() {
        return this.f103610q;
    }

    @Override // sg.bigo.ads.common.g
    public final long L() {
        return this.f103611r;
    }

    @Override // sg.bigo.ads.common.g
    public final long M() {
        return p.a(this.f103595b);
    }

    @Override // sg.bigo.ads.common.g
    public final long N() {
        return p.c();
    }

    @Override // sg.bigo.ads.common.g
    public final long O() {
        return p.a();
    }

    @Override // sg.bigo.ads.common.g
    public final String P() {
        return this.f103596c.l();
    }

    @Override // sg.bigo.ads.common.g
    public final String Q() {
        return "";
    }

    @Override // sg.bigo.ads.common.g
    public final String R() {
        return q.d(sg.bigo.ads.common.aa.b.e(this.f103595b));
    }

    @Override // sg.bigo.ads.common.g
    public final String S() {
        return q.d(sg.bigo.ads.common.aa.b.c(this.f103595b));
    }

    @Override // sg.bigo.ads.common.g
    public final String T() {
        return this.f103613t;
    }

    @Override // sg.bigo.ads.common.g
    public final String U() {
        sg.bigo.ads.controller.b.d dVar = this.f103596c;
        return dVar != null ? dVar.G() : "";
    }

    @Override // sg.bigo.ads.common.g
    public final long V() {
        return h.a().f103664e.f103669a;
    }

    @Override // sg.bigo.ads.common.g
    public final long W() {
        return h.a().f103664e.f103670b;
    }

    @Override // sg.bigo.ads.common.g
    public final String X() {
        return sg.bigo.ads.common.x.a.r();
    }

    @Override // sg.bigo.ads.common.g
    public final long Y() {
        if (this.f103615v == 0) {
            try {
                Context context = this.f103595b;
                this.f103615v = sg.bigo.ads.common.utils.c.c(context, context.getPackageName());
            } catch (Exception unused) {
                this.f103615v = -1L;
            }
        }
        return this.f103615v;
    }

    @Override // sg.bigo.ads.common.g
    public final long Z() {
        if (this.f103616w == 0) {
            try {
                Context context = this.f103595b;
                this.f103616w = sg.bigo.ads.common.utils.c.d(context, context.getPackageName());
            } catch (Exception unused) {
                this.f103616w = -1L;
            }
        }
        return this.f103616w;
    }

    @Override // sg.bigo.ads.common.g
    @NonNull
    public final String a() {
        return this.f103594a.getAppKey();
    }

    @Override // sg.bigo.ads.common.g
    public final String aa() {
        return "official";
    }

    @Override // sg.bigo.ads.common.g
    public final int ab() {
        return this.f103612s;
    }

    @Override // sg.bigo.ads.common.g
    public final sg.bigo.ads.common.b ac() {
        if (this.f103596c.n().a(15)) {
            return sg.bigo.ads.common.aa.b.h(this.f103595b);
        }
        sg.bigo.ads.common.aa.b.j(this.f103595b);
        return null;
    }

    @Override // sg.bigo.ads.common.g
    public final boolean ad() {
        sg.bigo.ads.common.a aVarM = this.f103596c.M();
        if (aVarM != null) {
            return aVarM.f102254c;
        }
        return true;
    }

    @Override // sg.bigo.ads.common.g
    public final String ae() {
        sg.bigo.ads.common.a aVarM = this.f103596c.M();
        return aVarM != null ? aVarM.f102253b : "";
    }

    @Override // sg.bigo.ads.common.g
    public final Context af() {
        return this.f103595b;
    }

    @Override // sg.bigo.ads.common.g
    public final boolean ag() {
        return sg.bigo.ads.common.aa.b.k(this.f103595b);
    }

    @Override // sg.bigo.ads.common.g
    public final int ah() {
        return sg.bigo.ads.common.aa.b.l(this.f103595b);
    }

    @Override // sg.bigo.ads.common.g
    public final boolean ai() {
        return sg.bigo.ads.common.aa.b.c();
    }

    @Override // sg.bigo.ads.common.g
    public final float aj() {
        return sg.bigo.ads.common.aa.b.m(this.f103595b);
    }

    @Override // sg.bigo.ads.common.g
    public final int ak() {
        return sg.bigo.ads.common.aa.b.o(this.f103595b);
    }

    @Override // sg.bigo.ads.common.g
    public final float al() {
        return sg.bigo.ads.common.aa.b.p(this.f103595b);
    }

    @Override // sg.bigo.ads.common.g
    public final int am() {
        return sg.bigo.ads.common.aa.b.q(this.f103595b);
    }

    @Override // sg.bigo.ads.common.g
    public final int an() {
        return sg.bigo.ads.common.aa.b.r(this.f103595b);
    }

    @Override // sg.bigo.ads.common.g
    public final boolean ao() {
        return sg.bigo.ads.common.aa.b.u(this.f103595b);
    }

    @Override // sg.bigo.ads.common.g
    public final int ap() {
        return sg.bigo.ads.common.aa.b.s(this.f103595b);
    }

    @Override // sg.bigo.ads.common.g
    public final int aq() {
        return sg.bigo.ads.common.aa.b.t(this.f103595b);
    }

    @Override // sg.bigo.ads.common.g
    public final long ar() {
        return sg.bigo.ads.common.aa.b.v(this.f103595b);
    }

    @Override // sg.bigo.ads.common.g
    public final boolean as() {
        return sg.bigo.ads.common.aa.b.w(this.f103595b);
    }

    @Override // sg.bigo.ads.common.g
    public final boolean at() {
        return sg.bigo.ads.common.aa.b.n(this.f103595b);
    }

    @Override // sg.bigo.ads.common.g
    public final boolean au() {
        return sg.bigo.ads.common.aa.b.d();
    }

    @Override // sg.bigo.ads.common.g
    public final int av() {
        return this.f103596c.n().a(25) ? 2 : 0;
    }

    @Override // sg.bigo.ads.common.g
    public final int aw() {
        return this.f103614u;
    }

    @Override // sg.bigo.ads.common.g
    public final boolean ax() {
        return this.f103596c.n().a(27);
    }

    @Override // sg.bigo.ads.common.g
    public final String b() {
        return this.f103597d;
    }

    @Override // sg.bigo.ads.common.g
    public final String c() {
        return this.f103598e;
    }

    @Override // sg.bigo.ads.common.g
    public final int d() {
        return this.f103599f;
    }

    @Override // sg.bigo.ads.common.g
    public final String e() {
        return this.f103594a.getChannel();
    }

    @Override // sg.bigo.ads.common.g
    public final int f() {
        return this.f103594a.getAge();
    }

    @Override // sg.bigo.ads.common.g
    public final int g() {
        return this.f103594a.getGender();
    }

    @Override // sg.bigo.ads.common.g
    public final long h() {
        return this.f103594a.getActivatedTime();
    }

    @Override // sg.bigo.ads.common.g
    public final String i() {
        return "android";
    }

    @Override // sg.bigo.ads.common.g
    public final String j() {
        return Build.VERSION.RELEASE;
    }

    @Override // sg.bigo.ads.common.g
    public final String k() {
        return this.f103600g;
    }

    @Override // sg.bigo.ads.common.g
    public final String l() {
        return this.f103601h;
    }

    @Override // sg.bigo.ads.common.g
    public final String m() {
        return this.f103602i;
    }

    @Override // sg.bigo.ads.common.g
    public final String n() {
        return this.f103603j;
    }

    @Override // sg.bigo.ads.common.g
    public final String o() {
        return this.f103604k;
    }

    @Override // sg.bigo.ads.common.g
    public final int p() {
        return this.f103605l;
    }

    @Override // sg.bigo.ads.common.g
    public final String q() {
        return this.f103606m;
    }

    @Override // sg.bigo.ads.common.g
    public final String r() {
        int iA = sg.bigo.ads.common.aa.c.a(this.f103595b);
        return iA != 1 ? iA != 2 ? iA != 3 ? iA != 4 ? iA != 5 ? "unknown" : "5g" : "4g" : X3.f42018b : X3.f42017a : "2g";
    }

    @Override // sg.bigo.ads.common.g
    public final String s() {
        return q.d(sg.bigo.ads.common.utils.c.a());
    }

    @Override // sg.bigo.ads.common.g
    public final String t() {
        String strK = this.f103596c.k();
        return !TextUtils.isEmpty(strK) ? strK : v();
    }

    @Override // sg.bigo.ads.common.g
    public final String u() {
        return this.f103596c.k();
    }

    @Override // sg.bigo.ads.common.g
    public final String v() {
        if (!TextUtils.isEmpty("")) {
            return "";
        }
        String strR = R();
        return !TextUtils.isEmpty(strR) ? strR : S();
    }

    @Override // sg.bigo.ads.common.g
    public final String w() {
        return "";
    }

    @Override // sg.bigo.ads.common.g
    public final String x() {
        return "";
    }

    @Override // sg.bigo.ads.common.g
    public final String y() {
        return "5.6.2";
    }

    @Override // sg.bigo.ads.common.g
    public final boolean z() {
        sg.bigo.ads.common.a aVarL = this.f103596c.L();
        if (aVarL != null) {
            return aVarL.f102254c;
        }
        return true;
    }
}
