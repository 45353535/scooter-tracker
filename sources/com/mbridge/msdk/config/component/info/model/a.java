package com.mbridge.msdk.config.component.info.model;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46860a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List<String> f46861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List<String> f46862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<String> f46863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f46864e = 1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f46865f = 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f46866g = 1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.component.info.provider.a f46867h;

    public a(Map<String, Object> map) {
        a(map);
        f();
    }

    private void f() {
        com.mbridge.msdk.config.component.info.provider.a aVar = new com.mbridge.msdk.config.component.info.provider.a(this.f46864e, this.f46865f, this.f46866g);
        this.f46867h = aVar;
        aVar.c();
        this.f46867h.a();
        this.f46867h.b();
    }

    public List<String> a() {
        return this.f46863d;
    }

    public List<String> b() {
        return this.f46862c;
    }

    public Map<String, Object> c() {
        Map<String, Object> mapA = this.f46867h.a();
        Map<String, Object> mapB = this.f46867h.b();
        HashMap map = new HashMap();
        map.putAll(mapA);
        map.putAll(mapB);
        return map;
    }

    public List<String> d() {
        return this.f46861b;
    }

    public String e() {
        return this.f46860a;
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("field");
            if (obj != null) {
                this.f46860a = String.valueOf(obj);
            }
            Object obj2 = map.get("target_list");
            if (obj2 instanceof List) {
                this.f46861b = (List) obj2;
            }
            Object obj3 = map.get("cid_list");
            if (obj3 instanceof List) {
                this.f46862c = (List) obj3;
            }
            Object obj4 = map.get("activate_type_list");
            if (obj4 instanceof List) {
                this.f46863d = (List) obj4;
            }
            Object obj5 = map.get("allow_dev_id");
            if (obj5 != null) {
                this.f46864e = Integer.parseInt(String.valueOf(obj5));
            }
            Object obj6 = map.get("allow_normal_info");
            if (obj6 != null) {
                this.f46865f = Integer.parseInt(String.valueOf(obj6));
            }
            Object obj7 = map.get("allow_other_info");
            if (obj7 != null) {
                this.f46866g = Integer.parseInt(String.valueOf(obj7));
            }
        }
    }

    public Object b(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return a(str);
    }

    private String a(String str) {
        return this.f46867h.a(str);
    }
}
