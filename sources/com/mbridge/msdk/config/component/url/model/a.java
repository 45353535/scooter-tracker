package com.mbridge.msdk.config.component.url.model;

import android.content.Context;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f47297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f47298b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f47299c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<Object, Object> f47300d;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("target_name");
            if (obj != null) {
                a(String.valueOf(obj));
            }
            Object obj2 = map.get("scheme");
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get("extra");
            if (obj3 instanceof Map) {
                b((Map<Object, Object>) obj3);
            }
        }
    }

    public void b(String str) {
        this.f47299c = str;
    }

    public String c() {
        return this.f47298b;
    }

    public String d() {
        return this.f47299c;
    }

    public Map<Object, Object> b() {
        return this.f47300d;
    }

    public void b(Map<Object, Object> map) {
        this.f47300d = map;
    }

    public Context a() {
        return this.f47297a;
    }

    public void a(Context context) {
        this.f47297a = context;
    }

    public void a(String str) {
        this.f47298b = str;
    }
}
