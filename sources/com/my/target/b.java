package com.my.target;

import com.my.target.common.NavigationType;
import com.my.target.common.models.ImageData;

/* JADX INFO: loaded from: classes11.dex */
public abstract class b {
    public String A;
    public String B;
    public String C;
    public String D;
    public String E;
    public String F;
    public c G;
    public j8 H;
    public String I;
    public boolean J;
    public final h0 K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final za f59205a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final xb f59206b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public String f59207c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public String f59208d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f59209e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f59210f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public String f59211g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public float f59212h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f59213i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f59214j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f59215k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public String f59216l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public String f59217m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public String f59218n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public String f59219o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ImageData f59220p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ImageData f59221q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public d1 f59222r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f59223s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f59224t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f59225u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f59226v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f59227w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f59228x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public float f59229y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public String f59230z;

    public b() {
        this(h0.f59787e);
    }

    public String A() {
        return this.f59209e;
    }

    public String B() {
        return this.E;
    }

    public String C() {
        return this.f59230z;
    }

    public String D() {
        return this.B;
    }

    public xb E() {
        return this.f59206b;
    }

    public int F() {
        return this.f59213i;
    }

    public int G() {
        return this.f59227w;
    }

    public boolean H() {
        return this.f59225u;
    }

    public boolean I() {
        return this.f59224t;
    }

    public boolean J() {
        return this.J;
    }

    public boolean K() {
        return this.f59223s;
    }

    public void a(j8 j8Var) {
        this.H = j8Var;
    }

    public void b(String str) {
        this.f59211g = str;
    }

    public String c() {
        return this.f59211g;
    }

    public final h0 d() {
        return this.K;
    }

    public String e() {
        return this.C;
    }

    public String f() {
        return this.f59214j;
    }

    public void g(String str) {
        this.D = str;
    }

    public void h(String str) {
        this.f59207c = str;
    }

    public String i() {
        String str = this.f59208d;
        return str == null ? "store".equals(this.f59217m) ? "Install" : "Visit" : str;
    }

    public String j() {
        return this.D;
    }

    public String k() {
        return this.f59207c;
    }

    public String l() {
        return this.f59210f;
    }

    public int m() {
        return this.f59226v;
    }

    public String n() {
        return this.f59216l;
    }

    public void o(String str) {
        this.f59215k = str;
    }

    public int p() {
        return this.f59228x;
    }

    public ImageData q() {
        return this.f59221q;
    }

    public String r() {
        return this.A;
    }

    public ImageData s() {
        return this.f59220p;
    }

    public String t() {
        return this.f59217m;
    }

    public j8 u() {
        return this.H;
    }

    public String v() {
        return this.I;
    }

    public float w() {
        return this.f59212h;
    }

    public za x() {
        return this.f59205a;
    }

    public String y() {
        return this.f59218n;
    }

    public String z() {
        return this.f59215k;
    }

    public b(h0 h0Var) {
        this.f59206b = xb.d();
        this.f59207c = "";
        this.f59209e = "";
        this.f59210f = "";
        this.f59211g = "";
        this.f59214j = "";
        this.f59215k = "";
        this.f59216l = "";
        this.f59217m = NavigationType.WEB;
        this.f59219o = "";
        this.f59222r = d1.f59449p;
        this.f59223s = false;
        this.f59224t = false;
        this.f59225u = false;
        this.f59226v = 0;
        this.f59230z = "";
        this.A = "";
        this.J = true;
        this.K = h0Var;
        this.f59205a = za.a(h0Var);
    }

    public void a(int i10) {
        this.f59226v = i10;
    }

    public void b(int i10) {
        this.f59228x = i10;
    }

    public void c(String str) {
        this.C = str;
    }

    public void d(String str) {
        this.f59214j = str;
    }

    public void e(String str) {
        this.F = str;
    }

    public void f(String str) {
        this.f59208d = str;
    }

    public d1 g() {
        return this.f59222r;
    }

    public String h() {
        return this.F;
    }

    public void j(String str) {
        this.f59216l = str;
    }

    public void k(String str) {
        this.A = str;
    }

    public void l(String str) {
        this.f59217m = str;
    }

    public void m(String str) {
        this.I = str;
    }

    public void n(String str) {
        this.f59218n = str;
    }

    public float o() {
        return this.f59229y;
    }

    public void p(String str) {
        this.f59209e = str;
    }

    public void q(String str) {
        this.E = str;
    }

    public void r(String str) {
        this.f59230z = str;
    }

    public void s(String str) {
        this.B = str;
    }

    public void a(ImageData imageData) {
        this.f59221q = imageData;
    }

    public void b(ImageData imageData) {
        this.f59220p = imageData;
    }

    public void c(int i10) {
        this.f59213i = i10;
    }

    public void d(int i10) {
        this.f59227w = i10;
    }

    public void a(String str) {
        this.f59219o = str;
    }

    public void b(float f10) {
        this.f59212h = f10;
    }

    public void c(boolean z10) {
        this.J = z10;
    }

    public void d(boolean z10) {
        this.f59223s = z10;
    }

    public void a(float f10) {
        this.f59229y = f10;
    }

    public void b(boolean z10) {
        this.f59224t = z10;
    }

    public void i(String str) {
        this.f59210f = str;
    }

    public void a(d1 d1Var) {
        this.f59222r = d1Var;
    }

    public String b() {
        return this.f59219o;
    }

    public c a() {
        return this.G;
    }

    public void a(c cVar) {
        this.G = cVar;
    }

    public void a(boolean z10) {
        this.f59225u = z10;
    }
}
