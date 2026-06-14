package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import com.ironsource.C4240b4;
import com.mbridge.msdk.foundation.tools.q0;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f46734b = Arrays.asList("mapNew", "mapNewFromStr", "mapSetObj", "mapGetObj", "mapAddFromMap", "mapRemoveObj", "mapToStrFormatURL", "mapToJsonStr", "mapToSqlStr", "mapCount", "containsKey");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c f46735a;

    public j(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.f46735a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x007f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(java.lang.String r3, java.lang.Object r4, java.util.List<java.lang.Object> r5) {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.operator.j.a(java.lang.String, java.lang.Object, java.util.List):com.mbridge.msdk.config.component.common.express.operator.parts.a");
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a c(Object obj, List<Object> list) {
        String strValueOf = (list == null || list.isEmpty()) ? "" : String.valueOf(list.get(0));
        if (!TextUtils.isEmpty(strValueOf)) {
            if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).b(strValueOf));
            }
            if (obj instanceof Map) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(((Map) obj).get(strValueOf));
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a d(Object obj, List<Object> list) {
        Map<String, Object> mapA;
        String strValueOf = (list == null || list.isEmpty()) ? "" : String.valueOf(list.get(0));
        if (!TextUtils.isEmpty(strValueOf)) {
            try {
                mapA = new com.mbridge.msdk.config.dynamic.utils.e().a(new JSONObject(strValueOf));
            } catch (JSONException e10) {
                q0.b("MapOperator", e10.getMessage());
                mapA = null;
            }
            if (mapA != null) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(mapA);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a e(Object obj, List<Object> list) {
        String strValueOf = (list == null || list.isEmpty()) ? "" : String.valueOf(list.get(0));
        if (!TextUtils.isEmpty(strValueOf)) {
            if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj;
                aVar.c((Object) strValueOf);
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(aVar);
            }
            if (obj instanceof Map) {
                Map map = (Map) obj;
                map.remove(strValueOf);
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(map);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a f(Object obj, List<Object> list) {
        if (list != null && list.size() == 2) {
            String strValueOf = String.valueOf(list.get(0));
            Object obj2 = list.get(1);
            if (!TextUtils.isEmpty(strValueOf)) {
                if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                    com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj;
                    aVar.a(strValueOf.trim(), obj2);
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(aVar);
                }
                if (obj instanceof Map) {
                    Map map = (Map) obj;
                    map.put(strValueOf.trim(), obj2);
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(map);
                }
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x005f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a g(java.lang.Object r5, java.util.List<java.lang.Object> r6) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a
            if (r0 != 0) goto Lf
            boolean r1 = r5 instanceof java.util.Map
            if (r1 == 0) goto L9
            goto Lf
        L9:
            r5 = 0
            com.mbridge.msdk.config.component.common.express.operator.parts.a r5 = com.mbridge.msdk.config.component.common.express.operator.parts.a.a(r5)
            return r5
        Lf:
            if (r0 == 0) goto L3a
            com.mbridge.msdk.config.dynamic.binddata.wrapper.a r5 = (com.mbridge.msdk.config.dynamic.binddata.wrapper.a) r5
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.util.Set r5 = r5.a()
            java.util.Iterator r5 = r5.iterator()
        L20:
            boolean r1 = r5.hasNext()
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r5.next()
            java.util.Map$Entry r1 = (java.util.Map.Entry) r1
            java.lang.Object r2 = r1.getKey()
            java.lang.String r2 = (java.lang.String) r2
            java.lang.Object r1 = r1.getValue()
            r0.put(r2, r1)
            goto L20
        L3a:
            r0 = r5
            java.util.Map r0 = (java.util.Map) r0
        L3d:
            r5 = 0
            if (r6 == 0) goto L5f
            boolean r1 = r6.isEmpty()
            if (r1 != 0) goto L5f
            java.lang.Object r6 = r6.get(r5)
            java.lang.String r6 = java.lang.String.valueOf(r6)
            java.lang.String r6 = r6.trim()
            java.lang.String r6 = r6.toLowerCase()
            java.lang.String r1 = "or"
            boolean r6 = r1.equals(r6)
            if (r6 == 0) goto L5f
            goto L61
        L5f:
            java.lang.String r1 = "and"
        L61:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.util.Set r0 = r0.entrySet()
            java.util.Iterator r0 = r0.iterator()
            r2 = 1
        L6f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L9f
            java.lang.Object r3 = r0.next()
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3
            if (r2 != 0) goto L88
            java.lang.String r2 = " "
            r6.append(r2)
            r6.append(r1)
            r6.append(r2)
        L88:
            java.lang.Object r2 = r3.getKey()
            java.lang.String r2 = (java.lang.String) r2
            r6.append(r2)
            java.lang.String r2 = "="
            r6.append(r2)
            java.lang.Object r2 = r3.getValue()
            r6.append(r2)
            r2 = r5
            goto L6f
        L9f:
            java.lang.String r5 = r6.toString()
            com.mbridge.msdk.config.component.common.express.operator.parts.a r5 = com.mbridge.msdk.config.component.common.express.operator.parts.a.a(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.config.component.common.express.operator.j.g(java.lang.Object, java.util.List):com.mbridge.msdk.config.component.common.express.operator.parts.a");
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, List<Object> list) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        Iterator<String> it = f46734b.iterator();
        while (it.hasNext()) {
            if (str.contains(it.next())) {
                return a(str, obj, list);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(Object obj) {
        Map map;
        boolean z10 = obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a;
        if (!z10 && !(obj instanceof Map)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        if (z10) {
            map = new HashMap();
            for (Map.Entry<String, Object> entry : ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a()) {
                map.put(entry.getKey(), entry.getValue());
            }
        } else {
            map = (Map) obj;
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new JSONObject(map).toString());
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a c(Object obj) {
        Map map;
        boolean z10 = obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a;
        if (!z10 && !(obj instanceof Map)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
        if (z10) {
            map = new HashMap();
            for (Map.Entry<String, Object> entry : ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a()) {
                map.put(entry.getKey(), entry.getValue());
            }
        } else {
            map = (Map) obj;
        }
        try {
            StringBuilder sb2 = new StringBuilder();
            boolean z11 = true;
            for (Map.Entry entry2 : map.entrySet()) {
                if (!z11) {
                    sb2.append(C4240b4.j.f42670c);
                }
                sb2.append((String) entry2.getKey());
                sb2.append(C4240b4.j.f42668b);
                sb2.append(URLEncoder.encode(String.valueOf(entry2.getValue()), "UTF-8"));
                z11 = false;
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(sb2.toString());
        } catch (Throwable th2) {
            q0.b("MapOperator", "Error encoding URL parameters: " + th2.getMessage(), th2);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a() {
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(new HashMap());
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(Object obj, List<Object> list) {
        String strValueOf;
        if (list != null && !list.isEmpty()) {
            strValueOf = String.valueOf(list.get(0));
        } else {
            strValueOf = "";
        }
        if (!TextUtils.isEmpty(strValueOf)) {
            if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a((Object) strValueOf)));
            }
            if (obj instanceof Map) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Boolean.valueOf(((Map) obj).containsKey(strValueOf)));
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj, List<Object> list) {
        Object obj2 = (list == null || list.isEmpty()) ? null : list.get(0);
        if (obj2 instanceof Map) {
            Map<? extends String, ?> map = (Map) obj2;
            if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
                ((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).a(map);
            } else if (obj instanceof Map) {
                ((Map) obj).putAll(map);
            }
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(obj);
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj) {
        if (obj instanceof com.mbridge.msdk.config.dynamic.binddata.wrapper.a) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(((com.mbridge.msdk.config.dynamic.binddata.wrapper.a) obj).e()));
        }
        if (obj instanceof Map) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(((Map) obj).size()));
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(0);
    }
}
