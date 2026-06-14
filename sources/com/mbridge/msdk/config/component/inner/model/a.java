package com.mbridge.msdk.config.component.inner.model;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    Context f46913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    String f46914b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    String f46915c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    String f46916d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    String f46917e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Map<String, Object> f46918f;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("type");
            if (obj != null) {
                d(String.valueOf(obj));
            }
            Object obj2 = map.get("url");
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get("store_info");
            if (obj3 instanceof Map) {
                Map<String, Object> map2 = (Map) obj3;
                b(map2);
                if (map2 != null && !map2.isEmpty()) {
                    c(String.valueOf(map2.get("target_name")));
                }
            }
            Object obj4 = map.get("action");
            if (obj4 != null) {
                a(String.valueOf(obj4));
            }
        }
    }

    public void b(String str) {
        this.f46915c = str;
    }

    public void c(String str) {
        this.f46916d = str;
    }

    public void d(String str) {
        this.f46914b = str;
    }

    public String e() {
        return this.f46916d;
    }

    public String f() {
        return this.f46914b;
    }

    public Map<String, Object> b() {
        return this.f46918f;
    }

    public String c() {
        return this.f46917e;
    }

    public String d() {
        return this.f46915c;
    }

    public void b(Map<String, Object> map) {
        this.f46918f = map;
    }

    public Context a() {
        return this.f46913a;
    }

    public void a(Context context) {
        this.f46913a = context;
    }

    public void a(String str) {
        this.f46917e = str;
    }
}
