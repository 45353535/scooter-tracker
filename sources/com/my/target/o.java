package com.my.target;

/* JADX INFO: loaded from: classes11.dex */
public final class o {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final o f60433i = new o("", null, -1, 999, 0, j6.f59960b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f60434a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f60435b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f60436c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Integer f60437d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f60438e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final k6 f60439f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f60440g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public String f60441h;

    public o(String str, String str2, Integer num, int i10, int i11, k6 k6Var) {
        this.f60434a = str;
        this.f60435b = str2;
        this.f60437d = num;
        this.f60436c = i10;
        this.f60438e = i11;
        this.f60439f = k6Var;
    }

    public static o a(String str, int i10, int i11, k6 k6Var) {
        return new o(str, null, Integer.valueOf(i10), i11, 0, k6Var);
    }

    public int b() {
        return this.f60440g;
    }

    public void c(int i10, int i11, String str) {
        a(i10, 1, i11, str);
    }

    public void b(int i10, int i11) {
        a(i10, 3, i11, (String) null);
    }

    public static o a(String str, String str2, int i10, k6 k6Var) {
        return new o(str, str2, -1, i10, 1, k6Var);
    }

    public void b(int i10, int i11, String str) {
        a(i10, 3, i11, str);
    }

    public static o a(String str, int i10, k6 k6Var) {
        return new o(str, null, -1, i10, 2, k6Var);
    }

    public static o a(String str, o oVar) {
        o oVar2 = new o(str, null, oVar.f60437d, oVar.f60436c, oVar.f60438e, oVar.f60439f);
        oVar2.f60440g = oVar.f60440g;
        oVar2.f60441h = oVar.f60441h;
        return oVar2;
    }

    public h0 a(String str, String str2) {
        return new h0(this, str, str2);
    }

    public void a(int i10) {
        this.f60440g = i10;
    }

    public String a() {
        return this.f60441h;
    }

    public void a(String str) {
        this.f60441h = str;
    }

    public void a(int i10, int i11) {
        a(i10, 0, i11, (String) null);
    }

    public void a(int i10, int i11, String str) {
        a(i10, 0, i11, str);
    }

    public final void a(int i10, int i11, int i12, String str) {
        a(i10, i11, i12, str, null);
    }

    public final void a(int i10, int i11, int i12, String str, String str2) {
        this.f60439f.a(this, i10, i11, i12, str, str2);
    }
}
