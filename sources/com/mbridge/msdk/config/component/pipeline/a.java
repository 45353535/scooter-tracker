package com.mbridge.msdk.config.component.pipeline;

import android.os.Handler;
import android.os.HandlerThread;
import android.text.TextUtils;
import com.mbridge.msdk.config.component.base.b;
import com.mbridge.msdk.config.component.base.c;
import com.mbridge.msdk.config.component.common.express.d;
import com.mbridge.msdk.config.dynamic.utils.e;
import com.mbridge.msdk.foundation.tools.q0;
import com.pubmatic.sdk.openwrap.core.nativead.POBCoreNativeConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes10.dex */
public class a implements c {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f47217b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<String, Object> f47218c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Handler f47220e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Handler f47222g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a f47223h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private d f47224i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f47216a = "PipelineManager";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final HandlerThread f47219d = new HandlerThread("FilterPipelineThread");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final HandlerThread f47221f = new HandlerThread("ComponentThread");

    public a(String str, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (TextUtils.isEmpty(str)) {
            q0.b("PipelineManager", "Pipeline can not be null");
        }
        this.f47223h = aVar;
        this.f47217b = com.mbridge.msdk.config.component.pipeline.util.a.a();
        this.f47224i = new d();
        this.f47218c = new e().a(str);
        a();
    }

    private void a() {
        this.f47219d.start();
        this.f47220e = new Handler(this.f47219d.getLooper());
        this.f47221f.start();
        this.f47222g = new Handler(this.f47221f.getLooper());
    }

    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public void d(b bVar) {
        try {
            String strA = bVar.a();
            String strC = bVar.c();
            if (!TextUtils.isEmpty(strA) && !TextUtils.isEmpty(strC) && this.f47218c != null) {
                String strD = bVar.d();
                if (!a(bVar, strD, strA)) {
                    a(bVar, (Map<String, Object>) this.f47218c.get(strD), strD);
                    return;
                }
                for (Map.Entry<String, Object> entry : this.f47218c.entrySet()) {
                    Object value = entry.getValue();
                    String key = entry.getKey();
                    if (value instanceof Map) {
                        a(bVar, (Map<String, Object>) value, key);
                    }
                }
            }
        } catch (Throwable th2) {
            q0.b("PipelineManager", th2.getMessage(), th2);
        }
    }

    private com.mbridge.msdk.config.dynamic.binddata.wrapper.a c(b bVar) {
        com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = new com.mbridge.msdk.config.dynamic.binddata.wrapper.a();
        aVar.a("event", bVar.b().containsKey("event") ? bVar.b().get("event") : bVar.b());
        aVar.a(POBCoreNativeConstants.NATIVE_CONTEXT, bVar.b().containsKey(POBCoreNativeConstants.NATIVE_CONTEXT) ? bVar.b().get(POBCoreNativeConstants.NATIVE_CONTEXT) : new com.mbridge.msdk.config.dynamic.binddata.wrapper.a());
        aVar.a("global", this.f47223h);
        aVar.a("component_config", bVar.b().containsKey("component_config") ? bVar.b().get("component_config") : new HashMap());
        aVar.a("sdk_context", bVar.b().containsKey("sdk_context") ? bVar.b().get("sdk_context") : new HashMap());
        return aVar;
    }

    private boolean a(b bVar, String str, String str2) {
        if (TextUtils.isEmpty(str) || str2.equals("_")) {
            return true;
        }
        try {
            if (bVar.b().containsKey("event")) {
                Object obj = bVar.b().get("event");
                if (obj instanceof Map) {
                    Map map = (Map) obj;
                    if (map.containsKey("dispatchEvent")) {
                        Object obj2 = map.get("dispatchEvent");
                        if (obj2 instanceof String) {
                            return obj2.equals("1");
                        }
                        return (obj2 instanceof Integer) && ((Integer) obj2).intValue() == 1;
                    }
                }
            }
        } catch (Throwable th2) {
            q0.b("PipelineManager", th2.getMessage(), th2);
        }
        return false;
    }

    private void a(final b bVar, Map<String, Object> map, final String str) {
        Object obj = map.get(bVar.c() + "#" + bVar.a());
        List<Map> list = obj instanceof List ? (List) obj : null;
        if (list == null) {
            return;
        }
        final com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVarC = c(bVar);
        String strValueOf = "";
        for (Map map2 : list) {
            Object obj2 = map2.get("Conditions");
            Object obj3 = map2.get("executeConfig");
            boolean zEquals = true;
            if (obj2 != null) {
                strValueOf = String.valueOf(obj2);
                if (!TextUtils.isEmpty(strValueOf)) {
                    Object objA = this.f47224i.a(strValueOf, aVarC);
                    if (objA instanceof Integer) {
                        if (((Integer) objA).intValue() != 1) {
                            zEquals = false;
                        }
                    } else if (objA instanceof String) {
                        zEquals = String.valueOf(objA).equals("1");
                    }
                }
            }
            final String str2 = strValueOf;
            if (zEquals && obj3 != null && (obj3 instanceof List)) {
                List list2 = (List) obj3;
                if (!list2.isEmpty()) {
                    for (Object obj4 : list2) {
                        if (obj4 instanceof Map) {
                            final Map<?, ?> mapA = a((Map) obj4, aVarC);
                            int iA = com.mbridge.msdk.config.component.pipeline.util.a.a(String.valueOf(mapA.get("delayTime")));
                            if (iA > 0) {
                                this.f47222g.postDelayed(new Runnable() { // from class: d5.b
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f68433b.b(bVar, mapA, aVarC, str2, str);
                                    }
                                }, ((long) iA) * 1000);
                            } else {
                                this.f47222g.post(new Runnable() { // from class: d5.c
                                    @Override // java.lang.Runnable
                                    public final void run() {
                                        this.f68439b.c(bVar, mapA, aVarC, str2, str);
                                    }
                                });
                            }
                        }
                    }
                }
            }
            strValueOf = str2;
        }
    }

    private Map<?, ?> a(Map<?, ?> map, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Map<String, Object> mapA = (map == null || map.isEmpty()) ? null : com.mbridge.msdk.config.component.common.util.c.a((Map<String, Object>) map, aVar);
        return mapA == null ? new LinkedHashMap() : mapA;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void c(b bVar, Map<?, ?> map, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar, String str, String str2) {
        if (map != null) {
            try {
                if (map.isEmpty()) {
                    return;
                }
                String strValueOf = String.valueOf(map.get("componentName"));
                String strConcat = this.f47217b.concat(".").concat(strValueOf.toLowerCase()).concat(".").concat(strValueOf).concat("Cpt");
                com.mbridge.msdk.config.component.base.a aVarA = a(strConcat, map, aVar);
                if (aVarA == null) {
                    aVarA = (com.mbridge.msdk.config.component.base.a) Class.forName(strConcat).getDeclaredConstructor(null).newInstance(null);
                    a(strConcat, aVarA, aVar);
                }
                aVarA.a(this);
                aVarA.a(map, aVar, str2);
                aVarA.d();
            } catch (Throwable th2) {
                q0.b("PipelineManager", th2.getMessage(), th2);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private com.mbridge.msdk.config.component.base.a a(String str, Map<?, ?> map, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        Map map2;
        Map map3;
        List<com.mbridge.msdk.config.component.base.a> list;
        try {
        } catch (Throwable th2) {
            q0.b("PipelineManager", th2.getMessage(), th2);
        }
        if (!TextUtils.isEmpty(str) && map != null && !map.isEmpty() && (map2 = (Map) aVar.b("sdk_context")) != null && !map2.isEmpty() && (map3 = (Map) map2.get("component_cache")) != null && !map3.isEmpty() && map3.containsKey(str) && (list = (List) map3.get(str)) != null && !list.isEmpty()) {
            for (com.mbridge.msdk.config.component.base.a aVar2 : list) {
                if ((aVar2 instanceof com.mbridge.msdk.config.component.base.d) && ((com.mbridge.msdk.config.component.base.d) aVar2).a(map)) {
                    return aVar2;
                }
            }
            return null;
        }
        return null;
    }

    private void a(String str, com.mbridge.msdk.config.component.base.a aVar, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar2) {
        Map map;
        try {
            if ((aVar instanceof com.mbridge.msdk.config.component.base.d) && (map = (Map) aVar2.b("sdk_context")) != null && !map.isEmpty()) {
                Map map2 = (Map) map.get("component_cache");
                if (map2 == null || map2.isEmpty()) {
                    map2 = new HashMap();
                    map.put("component_cache", map2);
                }
                if (map2.containsKey(str)) {
                    List list = (List) map2.get(str);
                    if (list != null) {
                        list.add(aVar);
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(aVar);
                    map2.put(str, arrayList);
                    return;
                }
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(aVar);
                map2.put(str, arrayList2);
            }
        } catch (Throwable th2) {
            q0.b("PipelineManager", th2.getMessage(), th2);
        }
    }

    @Override // com.mbridge.msdk.config.component.base.c
    public void a(final b bVar) {
        this.f47220e.post(new Runnable() { // from class: d5.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f68431b.d(bVar);
            }
        });
    }
}
