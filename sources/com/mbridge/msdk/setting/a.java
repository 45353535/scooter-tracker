package com.mbridge.msdk.setting;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f50487e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f50488f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f50489g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f50483a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f50484b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f50485c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50486d = 0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f50490h = 0;

    public static a a(String str) {
        Exception e10;
        a aVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            aVar = new a();
            try {
                aVar.b(jSONObject.optString("http_domain", com.mbridge.msdk.foundation.same.net.utils.d.h().f48735h));
                aVar.c(jSONObject.optString("tcp_domain", com.mbridge.msdk.foundation.same.net.utils.d.h().f48739l));
                aVar.e(jSONObject.optInt("tcp_port", com.mbridge.msdk.foundation.same.net.utils.d.h().f48743p));
                aVar.f(jSONObject.optInt("type", 0));
                aVar.a(jSONObject.optInt("batch_size", 1));
                aVar.c(jSONObject.optInt("duration", 0));
                aVar.b(jSONObject.optInt("disable", 0));
                aVar.d(jSONObject.optInt("e_t_l", 0));
                return aVar;
            } catch (Exception e11) {
                e10 = e11;
                e10.printStackTrace();
                return aVar;
            }
        } catch (Exception e12) {
            e10 = e12;
            aVar = null;
        }
    }

    public int b() {
        return this.f50484b;
    }

    public int c() {
        return this.f50485c;
    }

    public int d() {
        return this.f50486d;
    }

    public String e() {
        return this.f50487e;
    }

    public String f() {
        return this.f50488f;
    }

    public int g() {
        return this.f50489g;
    }

    public int h() {
        return this.f50490h;
    }

    public void b(int i10) {
        this.f50484b = i10;
    }

    public void c(int i10) {
        this.f50485c = i10;
    }

    public void d(int i10) {
        this.f50486d = i10;
    }

    public void e(int i10) {
        this.f50489g = i10;
    }

    public void f(int i10) {
        this.f50490h = i10;
    }

    public void b(String str) {
        this.f50487e = str;
    }

    public void c(String str) {
        this.f50488f = str;
    }

    public int a() {
        return this.f50483a;
    }

    public void a(int i10) {
        if (i10 < 1) {
            i10 = 1;
        }
        this.f50483a = i10;
    }
}
