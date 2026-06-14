package com.ironsource;

import android.content.Context;

/* JADX INFO: loaded from: classes8.dex */
public class Z4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static Z4 f42228h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f42229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f42230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f42231c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f42232d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f42233e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f42234f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC4634y7 f42235g;

    private Z4(Context context) {
        InterfaceC4634y7 interfaceC4634y7I = Ib.U().i();
        this.f42235g = interfaceC4634y7I;
        this.f42229a = interfaceC4634y7I.q();
        this.f42230b = interfaceC4634y7I.l();
        this.f42231c = interfaceC4634y7I.f();
        this.f42232d = interfaceC4634y7I.i();
        this.f42233e = interfaceC4634y7I.e();
        this.f42234f = interfaceC4634y7I.u(context);
    }

    public static Z4 b(Context context) {
        if (f42228h == null) {
            f42228h = new Z4(context);
        }
        return f42228h;
    }

    public static void g() {
        f42228h = null;
    }

    public int a() {
        return this.f42233e;
    }

    public String c() {
        return this.f42230b;
    }

    public String d() {
        return this.f42229a;
    }

    public String e() {
        return this.f42231c;
    }

    public String f() {
        return this.f42232d;
    }

    public float a(Context context) {
        return this.f42235g.E(context);
    }

    public String b() {
        return this.f42234f;
    }
}
