package com.mbridge.msdk.setting;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class d {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String f50589f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f50590g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f50591h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f50584a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f50585b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f50586c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f50587d = 30;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f50588e = 0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f50592i = 0;

    public static d a(String str) {
        Exception e10;
        d dVar;
        try {
            JSONObject jSONObject = new JSONObject(str);
            dVar = new d();
            try {
                dVar.b(jSONObject.optString("h_d", com.mbridge.msdk.foundation.same.net.utils.d.h().f48732f));
                dVar.c(jSONObject.optString("t_d", com.mbridge.msdk.foundation.same.net.utils.d.h().f48738k));
                dVar.c(jSONObject.optInt("t_p", com.mbridge.msdk.foundation.same.net.utils.d.h().f48742o));
                dVar.d(jSONObject.optInt("type", 1));
                dVar.b(jSONObject.optInt("d_t", 30));
                dVar.a(jSONObject.optInt("d_a", 0));
                return dVar;
            } catch (Exception e11) {
                e10 = e11;
                e10.printStackTrace();
                return dVar;
            }
        } catch (Exception e12) {
            e10 = e12;
            dVar = null;
        }
    }

    public int b() {
        return this.f50587d;
    }

    public String c() {
        return this.f50589f;
    }

    public String d() {
        return this.f50590g;
    }

    public int e() {
        return this.f50591h;
    }

    public void b(int i10) {
        this.f50587d = i10;
    }

    public void c(String str) {
        this.f50590g = str;
    }

    public void d(int i10) {
        this.f50592i = i10;
    }

    public void b(String str) {
        this.f50589f = str;
    }

    public void c(int i10) {
        this.f50591h = i10;
    }

    public int a() {
        return this.f50586c;
    }

    public void a(int i10) {
        this.f50586c = i10;
    }
}
