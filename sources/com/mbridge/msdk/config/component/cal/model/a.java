package com.mbridge.msdk.config.component.cal.model;

import com.mbridge.msdk.MBridgeConstans;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f46660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f46661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f46662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f46663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private String f46664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f46665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f46666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f46667h;

    public a(Map<String, Object> map) {
        a(map);
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            Object obj = map.get("action");
            if (obj != null) {
                this.f46660a = String.valueOf(obj);
            }
            Object obj2 = map.get(MBridgeConstans.PROPERTIES_UNIT_ID);
            if (obj2 != null) {
                this.f46661b = String.valueOf(obj2);
            }
            Object obj3 = map.get("reward");
            if (obj3 instanceof Map) {
                this.f46662c = (Map) obj3;
            }
            Object obj4 = map.get("code");
            if (obj4 != null) {
                this.f46663d = String.valueOf(obj4);
            }
            Object obj5 = map.get("reason");
            if (obj5 != null) {
                this.f46664e = String.valueOf(obj5);
            }
            Object obj6 = map.get("isReady");
            if (obj6 instanceof String) {
                this.f46665f = Integer.parseInt(String.valueOf(obj6));
            }
            if (obj6 instanceof Integer) {
                this.f46665f = ((Integer) obj6).intValue();
            }
            Object obj7 = map.get("buyer_id");
            if (obj7 instanceof String) {
                this.f46666g = String.valueOf(obj7);
            }
            String strValueOf = String.valueOf(map.get("init_status"));
            if (strValueOf.equalsIgnoreCase("null")) {
                a(1);
            } else {
                a(Integer.parseInt(strValueOf));
            }
        }
    }

    public String b() {
        return this.f46660a;
    }

    public String c() {
        return this.f46664e;
    }

    public int d() {
        return this.f46667h;
    }

    public int e() {
        return this.f46665f;
    }

    public Map<String, Object> f() {
        return this.f46662c;
    }

    public String g() {
        return this.f46661b;
    }

    public String a() {
        return this.f46666g;
    }

    public void a(int i10) {
        this.f46667h = i10;
    }
}
