package com.applovin.impl;

import com.applovin.impl.s3;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.t3;
import com.applovin.mediation.MaxAdFormat;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class u3 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final HashMap f11054d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f11055e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final HashMap f11056f = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Object f11057g = new Object();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final HashMap f11058h = new LinkedHashMap();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Object f11059i = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.applovin.impl.sdk.k f11060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final JSONObject f11061b = a(r3.f10331r8);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final JSONObject f11062c = a(r3.f10329q8);

    public u3(com.applovin.impl.sdk.k kVar) {
        this.f11060a = kVar;
        a((String) a5.a(z4.K, (Object) null, com.applovin.impl.sdk.k.o()), t3.a.AD_UNIT_ID);
        a((String) a5.a(z4.L, (Object) null, com.applovin.impl.sdk.k.o()), t3.a.AD_FORMAT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long a(Long l10, Long l11) {
        return l10;
    }

    private JSONObject a(x4 x4Var) {
        return JsonUtils.jsonObjectFromJsonString((String) this.f11060a.a(x4Var), new JSONObject());
    }

    private Map b(s3 s3Var, t3 t3Var, s3.b bVar) {
        if (!a(s3Var, t3Var, bVar) || !b(s3Var, t3Var)) {
            return null;
        }
        String strB = t3Var.b();
        HashMap mapA = a(t3Var.a());
        Object objB = b(t3Var.a());
        HashMap map = new HashMap();
        synchronized (objB) {
            try {
                if (t3Var instanceof q3) {
                    a((q3) t3Var, mapA);
                }
                HashMap map2 = (HashMap) mapA.get(strB);
                if (map2 == null) {
                    map2 = new HashMap();
                    mapA.put(strB, map2);
                }
                Iterator it = s3Var.b().iterator();
                while (it.hasNext()) {
                    String strB2 = ((s3.a) it.next()).b();
                    HashMap map3 = (HashMap) map2.get(strB2);
                    if (map3 == null) {
                        map3 = new HashMap();
                        map2.put(strB2, map3);
                    }
                    Object objA = bVar.a(map3.get(s3Var));
                    map3.put(s3Var, objA);
                    map.put(strB2, objA);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Boolean bool = (Boolean) this.f11060a.a(r3.f10335t8);
        if (s3Var.a(s3.a.INSTALL) && bool.booleanValue()) {
            b(t3Var);
        }
        return map;
    }

    private z4 c(t3.a aVar) {
        if (aVar == t3.a.AD_UNIT_ID) {
            return z4.K;
        }
        if (aVar == t3.a.AD_FORMAT) {
            return z4.L;
        }
        return null;
    }

    public Map a(s3 s3Var, t3 t3Var) {
        return b(s3Var, t3Var, new s3.b() { // from class: com.applovin.impl.vf
            @Override // com.applovin.impl.s3.b
            public final Object a(Object obj) {
                return u3.a((Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Long a(Long l10) {
        return Long.valueOf(l10 != null ? 1 + l10.longValue() : 1L);
    }

    public void a(s3 s3Var, t3 t3Var, final Long l10) {
        b(s3Var, t3Var, new s3.b() { // from class: com.applovin.impl.uf
            @Override // com.applovin.impl.s3.b
            public final Object a(Object obj) {
                return u3.a(l10, (Long) obj);
            }
        });
    }

    public Map a(s3 s3Var, t3.a aVar) {
        return a(s3Var, aVar, s3.a.SESSION);
    }

    private Map a(s3 s3Var, t3.a aVar, s3.a aVar2) {
        HashMap mapA = a(aVar);
        Object objB = b(aVar);
        HashMap map = new HashMap();
        synchronized (objB) {
            try {
                for (String str : mapA.keySet()) {
                    HashMap map2 = (HashMap) mapA.get(str);
                    String strB = aVar2.b();
                    if (map2 != null && map2.containsKey(strB)) {
                        HashMap map3 = (HashMap) map2.get(strB);
                        if (aVar == t3.a.AD) {
                            map.put(j3.a(str).b(), map3.get(s3Var));
                        } else {
                            map.put(str, map3.get(s3Var));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map;
    }

    private void a(q3 q3Var, Map map) {
        MaxAdFormat maxAdFormatA = q3Var.c().a();
        Integer integer = JsonUtils.getInteger(this.f11062c, maxAdFormatA.getLabel(), null);
        if (integer == null) {
            return;
        }
        Iterator it = map.keySet().iterator();
        int i10 = 0;
        while (it.hasNext()) {
            if (j3.a((String) it.next()).a().equals(maxAdFormatA)) {
                i10++;
            }
        }
        if (i10 < integer.intValue()) {
            return;
        }
        Iterator it2 = map.entrySet().iterator();
        while (it2.hasNext() && i10 >= integer.intValue()) {
            if (j3.a((String) ((Map.Entry) it2.next()).getKey()).a().equals(maxAdFormatA)) {
                it2.remove();
                i10--;
            }
        }
    }

    private Object b(t3.a aVar) {
        if (aVar == t3.a.AD_UNIT_ID) {
            return f11055e;
        }
        if (aVar == t3.a.AD_FORMAT) {
            return f11057g;
        }
        return f11059i;
    }

    private boolean b(s3 s3Var, t3 t3Var) {
        Iterator<String> itKeys = this.f11061b.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            if (next.equals(t3Var.a().toString().toLowerCase()) && JsonUtils.valueExists(JsonUtils.getJSONArray(this.f11061b, next, new JSONArray()), s3Var.a())) {
                return false;
            }
        }
        return true;
    }

    private HashMap a(t3.a aVar) {
        if (aVar == t3.a.AD_UNIT_ID) {
            return f11054d;
        }
        if (aVar == t3.a.AD_FORMAT) {
            return f11056f;
        }
        return f11058h;
    }

    private void b(t3 t3Var) {
        z4 z4VarC = c(t3Var.a());
        if (z4VarC == null) {
            return;
        }
        a5.b(z4VarC, a((Map) a(t3Var)), com.applovin.impl.sdk.k.o());
    }

    private boolean a(s3 s3Var, t3 t3Var, s3.b bVar) {
        if (s3Var == null) {
            this.f11060a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11060a.O().b("MediationStatsManager", "Failed to update stat, no stat provided");
            }
            return false;
        }
        if (t3Var == null) {
            this.f11060a.O();
            if (com.applovin.impl.sdk.o.a()) {
                this.f11060a.O().b("MediationStatsManager", "Failed to update stat, no dimension key provided");
            }
            return false;
        }
        if (bVar != null) {
            return true;
        }
        this.f11060a.O();
        if (com.applovin.impl.sdk.o.a()) {
            this.f11060a.O().b("MediationStatsManager", "Failed to update stat, no stat updater provided");
        }
        return false;
    }

    private HashMap a(t3 t3Var) {
        HashMap map = new HashMap();
        HashMap mapA = a(t3Var.a());
        synchronized (b(t3Var.a())) {
            try {
                for (Map.Entry entry : mapA.entrySet()) {
                    String str = (String) entry.getKey();
                    HashMap map2 = (HashMap) entry.getValue();
                    if (!CollectionUtils.isEmpty(map2)) {
                        HashMap map3 = (HashMap) map2.get(s3.a.INSTALL.b());
                        if (!CollectionUtils.isEmpty(map3)) {
                            map.put(str, new HashMap(map3));
                        }
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return map;
    }

    private String a(Map map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            JSONObject jSONObject2 = new JSONObject();
            for (Map.Entry entry2 : ((HashMap) entry.getValue()).entrySet()) {
                s3 s3Var = (s3) entry2.getKey();
                Object value = entry2.getValue();
                if (value != null) {
                    JsonUtils.putObject(jSONObject2, s3Var.toString(), value);
                }
            }
            JsonUtils.putJSONObject(jSONObject, (String) entry.getKey(), jSONObject2);
        }
        return jSONObject.toString();
    }

    private void a(String str, t3.a aVar) {
        if (StringUtils.isValidString(str)) {
            HashMap mapA = a(aVar);
            Object objB = b(aVar);
            Map<String, Object> stringObjectMap = JsonUtils.toStringObjectMap(str);
            synchronized (objB) {
                try {
                    for (Map.Entry<String, Object> entry : stringObjectMap.entrySet()) {
                        String key = entry.getKey();
                        HashMap map = new HashMap();
                        for (Map.Entry entry2 : ((Map) entry.getValue()).entrySet()) {
                            s3 s3VarA = s3.a((String) entry2.getKey());
                            if (s3VarA != null) {
                                map.put(s3VarA, a(entry2.getValue()));
                            }
                        }
                        if (!CollectionUtils.isEmpty(map)) {
                            HashMap map2 = new HashMap();
                            map2.put(s3.a.INSTALL.b(), map);
                            mapA.put(key, map2);
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private Object a(Object obj) {
        return obj instanceof Integer ? Long.valueOf(((Integer) obj).longValue()) : obj;
    }
}
