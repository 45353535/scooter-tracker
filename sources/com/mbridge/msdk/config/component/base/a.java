package com.mbridge.msdk.config.component.base;

import android.text.TextUtils;
import android.view.ViewGroup;
import com.appodeal.ads.modules.common.internal.Constants;
import com.mbridge.msdk.foundation.tools.q0;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Map<?, ?> f46639a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public c f46640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f46641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public com.mbridge.msdk.config.dynamic.binddata.wrapper.a f46642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected boolean f46643e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected String f46644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private String f46645g;

    private void d(Map<?, ?> map) {
        Map map2;
        Map map3;
        Map map4;
        if (map == null || map.isEmpty()) {
            return;
        }
        if (this.f46639a == null) {
            this.f46639a = map;
            return;
        }
        try {
            HashMap map5 = new HashMap();
            map5.putAll(map);
            HashMap map6 = new HashMap();
            Map map7 = (Map) map.get("componentConfig");
            if ((map7 instanceof Map) && (map4 = (Map) map7.get("EventConfig")) != null) {
                map6.putAll(map4);
            }
            if ((map.get("EventConfig") instanceof Map) && (map3 = (Map) map.get("EventConfig")) != null) {
                map6.putAll(map3);
            }
            HashMap map8 = new HashMap();
            Map map9 = (Map) this.f46639a.get("componentConfig");
            if ((map9 instanceof Map) && (map2 = (Map) map9.get("EventConfig")) != null) {
                map8.putAll(map2);
            }
            com.mbridge.msdk.config.component.common.util.c.a(map8, map6);
            Object obj = map5.get("componentConfig");
            if (obj instanceof Map) {
                Map map10 = (Map) obj;
                if (!map10.isEmpty()) {
                    map10.put("EventConfig", map8);
                }
            } else {
                HashMap map11 = new HashMap();
                map11.put("EventConfig", map8);
                map5.put("componentConfig", map11);
            }
            this.f46639a = map5;
        } catch (Throwable th2) {
            q0.b("BaseComponent", th2.getMessage(), th2);
        }
    }

    public void a() {
    }

    protected void b(Map<String, Object> map) {
    }

    protected void c(Map<String, Object> map) {
    }

    public ViewGroup e() {
        com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = this.f46642d;
        if (aVar == null) {
            return null;
        }
        Object objB = aVar.b("sdk_context");
        if (!(objB instanceof Map)) {
            return null;
        }
        Object obj = ((Map) objB).get("rootView");
        if (obj instanceof ViewGroup) {
            return (ViewGroup) obj;
        }
        return null;
    }

    protected void f() {
        if (this.f46643e) {
            return;
        }
        a(a(this.f46644f, new HashMap()));
        this.f46643e = true;
    }

    private Map<String, Object> b(String str) {
        Map<?, ?> map = this.f46639a;
        if (map != null && !map.isEmpty()) {
            Object obj = this.f46639a.get("componentConfig");
            if (obj instanceof Map) {
                Object obj2 = ((Map) obj).get("EventConfig");
                if (obj2 instanceof Map) {
                    Object obj3 = ((Map) obj2).get(str);
                    if (obj3 instanceof Map) {
                        Map<String, Object> map2 = (Map) obj3;
                        if (!map2.isEmpty()) {
                            Map<String, Object> mapA = com.mbridge.msdk.config.component.common.util.c.a(map2, this.f46642d);
                            return !mapA.isEmpty() ? mapA : map2;
                        }
                    }
                }
            }
        }
        return null;
    }

    private void c() {
        Map<?, ?> map = this.f46639a;
        if (map == null) {
            q0.b("BaseComponent", "Execute config is null");
            return;
        }
        this.f46641c = String.valueOf(map.get("componentName"));
        Object obj = this.f46639a.get("componentConfig");
        if (!(obj instanceof Map)) {
            q0.b("BaseComponent", "Component config is not instance of Map");
            return;
        }
        Map<String, Object> map2 = (Map) obj;
        b(map2);
        if (map2.containsKey("EventConfig")) {
            Object obj2 = map2.get("EventConfig");
            if (obj2 instanceof Map) {
                c((Map) obj2);
            } else {
                q0.b("BaseComponent", "Component event is not instance of Map");
            }
        }
    }

    public void a(Map<?, ?> map, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar, String str) {
        if (map == null) {
            return;
        }
        this.f46645g = str;
        this.f46642d = aVar;
        d(map);
        b();
        c();
        a();
    }

    public void a(c cVar) {
        this.f46640b = cVar;
    }

    public void a(b bVar) {
        c cVar;
        if (bVar == null) {
            q0.b("BaseComponent", "baseComponentOut cannot be null");
            return;
        }
        bVar.a(this.f46641c);
        bVar.c(this.f46645g);
        String strC = bVar.c();
        if (strC != null && !strC.isEmpty()) {
            HashMap map = new HashMap();
            if (bVar.b() != null) {
                map.putAll(bVar.b());
            }
            Map<String, Object> mapB = b(strC);
            if (mapB != null && !mapB.isEmpty()) {
                map.putAll(mapB);
            }
            bVar.b().clear();
            bVar.b().put("event", map);
            boolean zA = a(mapB, Constants.REPORT);
            boolean zA2 = a(mapB, "report_log");
            Map<?, ?> map2 = this.f46639a;
            if (map2 != null && !map2.isEmpty()) {
                bVar.b().put("component_config", this.f46639a.get("componentConfig"));
            }
            if (this.f46642d != null) {
                bVar.b().put(POBCoreNativeConstants.NATIVE_CONTEXT, this.f46642d.b(POBCoreNativeConstants.NATIVE_CONTEXT));
                bVar.b().put("sdk_context", this.f46642d.b("sdk_context"));
            }
            if (zA2) {
                b(bVar);
            }
            if (!zA || (cVar = this.f46640b) == null) {
                return;
            }
            cVar.a(bVar);
            return;
        }
        q0.b("BaseComponent", "eventName cannot be null or empty");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b() {
        com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar;
        if (!(this instanceof com.mbridge.msdk.config.component.vc.inter.a) || (aVar = this.f46642d) == null) {
            return;
        }
        Object objB = aVar.b("lifecycleListeners");
        if (objB instanceof List) {
            try {
                List list = (List) objB;
                synchronized (list) {
                    list.add((com.mbridge.msdk.config.component.vc.inter.a) this);
                }
            } catch (ClassCastException unused) {
                q0.b("BaseComponent", "Failed to cast listeners to List<ILifecycleListener>");
            }
        }
    }

    private void b(b bVar) {
        try {
            Map<String, Object> mapA = com.mbridge.msdk.config.component.common.metrics.b.a(bVar, this.f46642d);
            if (mapA.isEmpty()) {
                return;
            }
            com.mbridge.msdk.config.component.common.metrics.a.a().a(mapA);
        } catch (Throwable th2) {
            q0.b("BaseComponent", th2.getMessage());
        }
    }

    public void d() {
        f();
    }

    private boolean a(Map<String, Object> map, String str) {
        Object obj;
        if (map == null || TextUtils.isEmpty(str) || !map.containsKey(str) || (obj = map.get(str)) == null) {
            return false;
        }
        return String.valueOf(obj).equals("1");
    }

    public b a(String str, Map<String, Object> map) {
        b bVar = new b();
        bVar.b(str);
        if (map == null) {
            map = new HashMap<>();
        }
        bVar.a(map);
        return bVar;
    }

    public void a(String str, String str2, String str3) {
        HashMap map = new HashMap();
        map.put("code", str2);
        map.put("reason", str3);
        a(a(str, map));
    }
}
