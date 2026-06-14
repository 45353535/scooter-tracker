package com.my.target;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes11.dex */
public final class u {
    public Boolean A;
    public Boolean B;
    public Boolean C;
    public Boolean D;
    public Boolean E;
    public Boolean F;
    public Boolean G;
    public Boolean H;
    public Boolean I;
    public j8 J;
    public c K;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60845a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60846b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ArrayList f60850f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ArrayList f60851g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public u f60852h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public String f60853i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public String f60854j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f60855k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f60856l;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f60864t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f60865u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f60866v;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Boolean f60868x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public Boolean f60869y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public Boolean f60870z;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f60847c = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ArrayList f60848d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final za f60849e = za.a(h0.f59787e);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f60857m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f60858n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f60859o = -1;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f60860p = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f60861q = -1;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public float f60862r = -1.0f;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public float f60863s = -1.0f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public float f60867w = -1.0f;

    public u(String str, String str2) {
        this.f60846b = str;
        this.f60845a = str2;
    }

    public static u a(String str, String str2) {
        return new u(str, str2);
    }

    public static u b(String str) {
        return a(str, null);
    }

    public int A() {
        return this.f60858n;
    }

    public int B() {
        return this.f60856l;
    }

    public int C() {
        return this.f60860p;
    }

    public ArrayList D() {
        return this.f60847c;
    }

    public boolean E() {
        return this.f60864t;
    }

    public boolean F() {
        return this.f60865u;
    }

    public Boolean G() {
        return this.I;
    }

    public boolean H() {
        return this.f60866v;
    }

    public void c(int i10) {
        this.f60857m = i10;
    }

    public void d(int i10) {
        this.f60858n = i10;
        u uVar = this.f60852h;
        if (uVar != null) {
            uVar.d(i10);
        }
    }

    public void e(int i10) {
        this.f60856l = i10;
    }

    public Boolean f() {
        return this.f60869y;
    }

    public void g(Boolean bool) {
        this.B = bool;
    }

    public Boolean h() {
        return this.f60870z;
    }

    public Boolean i() {
        return this.A;
    }

    public Boolean j() {
        return this.B;
    }

    public Boolean k() {
        return this.G;
    }

    public void l(Boolean bool) {
        this.D = bool;
    }

    public za m() {
        return this.f60849e;
    }

    public int n() {
        return this.f60861q;
    }

    public ArrayList o() {
        return this.f60851g;
    }

    public String p() {
        return this.f60854j;
    }

    public Boolean q() {
        return this.C;
    }

    public int r() {
        return this.f60859o;
    }

    public int s() {
        return this.f60857m;
    }

    public ArrayList t() {
        if (this.f60850f != null) {
            return new ArrayList(this.f60850f);
        }
        return null;
    }

    public String u() {
        return this.f60853i;
    }

    public j8 v() {
        return this.J;
    }

    public u w() {
        return this.f60852h;
    }

    public Boolean x() {
        return this.D;
    }

    public float y() {
        return this.f60862r;
    }

    public float z() {
        return this.f60863s;
    }

    public void a(j8 j8Var) {
        this.J = j8Var;
    }

    public void b(boolean z10) {
        this.f60865u = z10;
    }

    public void c(ArrayList arrayList) {
        this.f60850f = arrayList;
    }

    public void e(String str) {
        this.f60853i = str;
    }

    public void f(Boolean bool) {
        this.A = bool;
    }

    public Boolean g() {
        return this.E;
    }

    public void h(Boolean bool) {
        this.G = bool;
    }

    public void i(Boolean bool) {
        this.H = bool;
    }

    public void j(Boolean bool) {
        this.C = bool;
    }

    public void k(Boolean bool) {
        this.I = bool;
    }

    public Boolean l() {
        return this.H;
    }

    public void a(boolean z10) {
        this.f60864t = z10;
    }

    public void b(int i10) {
        this.f60859o = i10;
    }

    public void c(float f10) {
        this.f60863s = f10;
    }

    public float e() {
        return this.f60867w;
    }

    public void f(int i10) {
        this.f60860p = i10;
    }

    public void a(ya yaVar) {
        this.f60848d.add(yaVar);
    }

    public void b(u uVar) {
        this.f60852h = uVar;
        if (uVar != null) {
            uVar.d(this.f60858n);
        }
    }

    public void c(boolean z10) {
        this.f60866v = z10;
    }

    public void d(String str) {
        this.f60854j = str;
    }

    public void e(Boolean bool) {
        this.f60870z = bool;
    }

    public ArrayList a(String str) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = this.f60848d;
        int size = arrayList2.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList2.get(i10);
            i10++;
            ya yaVar = (ya) obj;
            if (str.equals(yaVar.a())) {
                arrayList.add(yaVar);
            }
        }
        return arrayList;
    }

    public void c(Boolean bool) {
        this.f60869y = bool;
    }

    public Boolean d() {
        return this.f60868x;
    }

    public void b(ArrayList arrayList) {
        this.f60851g = arrayList;
    }

    public Boolean c() {
        return this.F;
    }

    public void d(Boolean bool) {
        this.E = bool;
    }

    public void b(float f10) {
        this.f60862r = f10;
    }

    public void c(String str) {
        this.f60855k = str;
    }

    public void b(Boolean bool) {
        this.f60868x = bool;
    }

    public void a(u uVar) {
        this.f60847c.add(uVar);
    }

    public String b() {
        return this.f60855k;
    }

    public void a(ArrayList arrayList) {
        ArrayList arrayList2 = this.f60850f;
        if (arrayList2 == null) {
            this.f60850f = arrayList;
        } else if (arrayList != null) {
            arrayList2.addAll(arrayList);
        }
    }

    public void a(float f10) {
        this.f60867w = f10;
    }

    public void a(Boolean bool) {
        this.F = bool;
    }

    public void a(int i10) {
        this.f60861q = i10;
    }

    public c a() {
        return this.K;
    }

    public void a(c cVar) {
        this.K = cVar;
    }
}
