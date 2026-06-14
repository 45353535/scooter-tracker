package com.mbridge.msdk.config.component.wei.model;

import com.iab.omid.library.mmadbridge.adsession.AdSession;
import com.mbridge.msdk.config.component.common.file.b;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f47332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f47333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f47334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f47335d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f47336e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private AdSession f47337f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f47338g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private String f47339h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private List<Map<String, Object>> f47340i;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(String str) {
        this.f47335d = str;
    }

    public void b(String str) {
        this.f47334c = str;
    }

    public String c() {
        return this.f47339h;
    }

    public void d(String str) {
        this.f47332a = str;
    }

    public void e(String str) {
        this.f47336e = str;
    }

    public String f() {
        return this.f47333b;
    }

    public String g() {
        return this.f47332a;
    }

    public String h() {
        return this.f47336e;
    }

    public boolean i() {
        return this.f47338g;
    }

    public AdSession a() {
        return this.f47337f;
    }

    public String b() {
        return this.f47335d;
    }

    public void c(String str) {
        this.f47333b = str;
    }

    public String d() {
        return this.f47334c;
    }

    public List<Map<String, Object>> e() {
        return this.f47340i;
    }

    public void a(List<Map<String, Object>> list) {
        this.f47340i = list;
    }

    public void a(Map<String, Object> map) {
        b bVarA;
        if (map != null) {
            Object obj = map.get("url");
            if (obj != null) {
                String strValueOf = String.valueOf(obj);
                if (strValueOf.contains(".zip") && (bVarA = com.mbridge.msdk.config.component.common.file.a.a(strValueOf, 1, null)) != null && bVarA.e()) {
                    c(com.mbridge.msdk.config.component.common.file.a.a(strValueOf, bVarA.d()));
                }
                d(strValueOf);
            }
            Object obj2 = map.get("html_code");
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get("action");
            if (obj3 != null) {
                a(String.valueOf(obj3));
            }
            Object obj4 = map.get("view_tag");
            if (obj4 != null) {
                e(String.valueOf(obj4));
            }
            Object obj5 = map.get("js_interaction");
            if (obj5 instanceof List) {
                a((List<Map<String, Object>>) obj5);
            }
        }
    }
}
