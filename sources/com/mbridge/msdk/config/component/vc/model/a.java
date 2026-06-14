package com.mbridge.msdk.config.component.vc.model;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f47307a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f47308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f47309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f47310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f47311e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f47312f;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            try {
                Object obj = map.get("action");
                if (obj != null) {
                    a(String.valueOf(obj));
                }
                Object obj2 = map.get("hide_status_bar");
                if (obj2 != null) {
                    String strValueOf = String.valueOf(obj2);
                    if (!TextUtils.isEmpty(strValueOf)) {
                        b(Integer.valueOf(strValueOf).intValue());
                    }
                }
                Object obj3 = map.get("modal");
                if (obj3 != null) {
                    String strValueOf2 = String.valueOf(obj3);
                    if (!TextUtils.isEmpty(strValueOf2)) {
                        c(Integer.valueOf(strValueOf2).intValue());
                    }
                }
                Object obj4 = map.get("width");
                if (obj4 != null) {
                    String strValueOf3 = String.valueOf(obj4);
                    if (!TextUtils.isEmpty(strValueOf3)) {
                        e(Integer.valueOf(strValueOf3).intValue());
                    }
                }
                Object obj5 = map.get("height");
                if (obj5 != null) {
                    String strValueOf4 = String.valueOf(obj5);
                    if (!TextUtils.isEmpty(strValueOf4)) {
                        a(Integer.valueOf(strValueOf4).intValue());
                    }
                }
                Object obj6 = map.get("orientation");
                int iF = m0.F(c.n().d());
                if (obj6 == null) {
                    d(iF);
                    return;
                }
                String strValueOf5 = String.valueOf(obj6);
                if (TextUtils.isEmpty(strValueOf5) || !strValueOf5.equalsIgnoreCase("null")) {
                    d(iF);
                } else {
                    d(Integer.parseInt(strValueOf5));
                }
            } catch (Exception e10) {
                q0.b("RenderViewModel", e10.getMessage());
            }
        }
    }

    public void b(int i10) {
        this.f47308b = i10;
    }

    public int c() {
        return this.f47308b;
    }

    public int d() {
        return this.f47309c;
    }

    public void e(int i10) {
        this.f47310d = i10;
    }

    public int f() {
        return this.f47310d;
    }

    public int b() {
        return this.f47311e;
    }

    public void c(int i10) {
        this.f47309c = i10;
    }

    public void d(int i10) {
        this.f47312f = i10;
    }

    public int e() {
        return this.f47312f;
    }

    public String a() {
        return this.f47307a;
    }

    public void a(String str) {
        this.f47307a = str;
    }

    public void a(int i10) {
        this.f47311e = i10;
    }
}
