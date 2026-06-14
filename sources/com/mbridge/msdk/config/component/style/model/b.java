package com.mbridge.msdk.config.component.style.model;

import com.mbridge.msdk.foundation.controller.c;
import com.mbridge.msdk.foundation.tools.m0;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f47279a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f47280b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f47281c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private List<a> f47282d;

    public b(Map<String, Object> map) {
        a(map);
    }

    private a b(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        a aVar = new a();
        Object obj = map.get("action_type");
        if (obj != null) {
            aVar.a(String.valueOf(obj));
        }
        Object obj2 = map.get("view_tag");
        if (obj2 != null) {
            aVar.c(String.valueOf(obj2));
        }
        Object obj3 = map.get("action_view");
        if (obj3 != null) {
            aVar.a(obj3);
        }
        Object obj4 = map.get("save_data");
        if (obj4 != null) {
            aVar.b(String.valueOf(obj4));
        }
        Object obj5 = map.get("widget_size");
        if (obj5 != null) {
            aVar.e(String.valueOf(obj5));
        }
        Object obj6 = map.get("widget_location");
        if (obj6 != null) {
            aVar.d(String.valueOf(obj6));
        }
        return aVar;
    }

    public void a(Map<String, Object> map) {
        if (map != null) {
            try {
                Object obj = map.get("url");
                if (obj != null) {
                    c(String.valueOf(obj));
                }
                Object obj2 = map.get("action");
                if (obj2 != null) {
                    a(String.valueOf(obj2));
                }
                Object obj3 = map.get("view_action");
                if (obj3 != null) {
                    a(obj3);
                }
                Object obj4 = map.get("orientation");
                if (obj4 != null) {
                    b(String.valueOf(obj4));
                } else {
                    b(String.valueOf(m0.F(c.n().d())));
                }
            } catch (Exception e10) {
                q0.b("XMLViewModel", e10.getMessage());
            }
        }
    }

    public String c() {
        return this.f47279a;
    }

    public List<a> d() {
        return this.f47282d;
    }

    public void c(String str) {
        this.f47279a = str;
    }

    private void a(Object obj) {
        a aVarB;
        a aVarB2;
        if (obj == null) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (obj instanceof List) {
            for (Object obj2 : (List) obj) {
                if ((obj2 instanceof Map) && (aVarB2 = b((Map<String, Object>) obj2)) != null) {
                    arrayList.add(aVarB2);
                }
            }
        } else if ((obj instanceof Map) && (aVarB = b((Map<String, Object>) obj)) != null) {
            arrayList.add(aVarB);
        }
        if (arrayList.isEmpty()) {
            return;
        }
        a((List<a>) arrayList);
    }

    public String b() {
        return this.f47281c;
    }

    public void b(String str) {
        this.f47281c = str;
    }

    public String a() {
        return this.f47280b;
    }

    public void a(String str) {
        this.f47280b = str;
    }

    public void a(List<a> list) {
        this.f47282d = list;
    }
}
