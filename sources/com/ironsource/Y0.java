package com.ironsource;

/* JADX INFO: loaded from: classes8.dex */
public class Y0 extends Yd {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static String f42096h = "type";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static String f42097i = "numOfAdUnits";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static String f42098j = "firstCampaignCredits";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static String f42099k = "totalNumberCredits";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static String f42100l = "productType";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f42101b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f42102c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f42103d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f42104e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f42105f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f42106g;

    public Y0(String str) {
        super(str);
        if (a(f42096h)) {
            k(d(f42096h));
        }
        if (a(f42097i)) {
            h(d(f42097i));
            a(true);
        } else {
            a(false);
        }
        if (a(f42098j)) {
            g(d(f42098j));
        }
        if (a(f42099k)) {
            j(d(f42099k));
        }
        if (a(f42100l)) {
            i(d(f42100l));
        }
    }

    private void a(boolean z10) {
        this.f42106g = z10;
    }

    public String b() {
        return this.f42104e;
    }

    public String c() {
        return this.f42103d;
    }

    public String d() {
        return this.f42102c;
    }

    public String e() {
        return this.f42105f;
    }

    public String f() {
        return this.f42101b;
    }

    public void g(String str) {
        this.f42104e = str;
    }

    public void h(String str) {
        this.f42103d = str;
    }

    public void i(String str) {
        this.f42102c = str;
    }

    public void j(String str) {
        this.f42105f = str;
    }

    public void k(String str) {
        this.f42101b = str;
    }

    public boolean g() {
        return this.f42106g;
    }
}
