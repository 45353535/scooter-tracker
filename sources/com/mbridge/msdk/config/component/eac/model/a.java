package com.mbridge.msdk.config.component.eac.model;

import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object f46856a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46857b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46858c;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("iteration_data");
            if (obj != null) {
                a(obj);
            }
            Object obj2 = map.get("execute_condition");
            if (obj2 != null) {
                b(String.valueOf(obj2));
            }
            Object obj3 = map.get("end_condition");
            if (obj3 != null) {
                a(String.valueOf(obj3));
            }
        }
    }

    public String b() {
        return this.f46857b;
    }

    public Object c() {
        return this.f46856a;
    }

    public void b(String str) {
        this.f46857b = str;
    }

    public void a(Object obj) {
        this.f46856a = obj;
    }

    public String a() {
        return this.f46858c;
    }

    public void a(String str) {
        this.f46858c = str;
    }
}
