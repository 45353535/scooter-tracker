package com.ironsource;

import com.ironsource.mediationsdk.logger.IronLog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.ia, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4365ia {
    public static boolean a(String str) {
        try {
            new JSONObject(str);
            return true;
        } catch (JSONException unused) {
            return false;
        }
    }

    public static List<String> b(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        return arrayList;
    }

    public static JSONObject a(JSONObject... jSONObjectArr) {
        JSONObject jSONObject = new JSONObject();
        if (jSONObjectArr != null) {
            for (JSONObject jSONObject2 : jSONObjectArr) {
                if (jSONObject2 != null) {
                    Iterator<String> itKeys = jSONObject2.keys();
                    while (itKeys.hasNext()) {
                        String next = itKeys.next();
                        try {
                            jSONObject.put(next, jSONObject2.get(next));
                        } catch (JSONException e10) {
                            C4462o4.d().a(e10);
                            IronLog.INTERNAL.error(e10.toString());
                        }
                    }
                }
            }
        }
        return jSONObject;
    }

    public static Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        if ((obj instanceof JSONArray) || (obj instanceof JSONObject) || obj.equals(JSONObject.NULL)) {
            return obj;
        }
        try {
            if (obj instanceof Collection) {
                return new JSONArray((Collection) obj);
            }
            if (obj.getClass().isArray()) {
                return new JSONArray((Collection) Arrays.asList(obj));
            }
            if (obj instanceof Map) {
                return new JSONObject((Map) obj);
            }
            if ((obj instanceof Boolean) || (obj instanceof Byte) || (obj instanceof Character) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long) || (obj instanceof Short) || (obj instanceof String)) {
                return obj;
            }
            if (obj instanceof Enum) {
                return obj.toString();
            }
            return obj.getClass().getPackage().getName().startsWith("java.") ? obj.toString() : obj;
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            return null;
        }
    }

    @NotNull
    public static Map<String, Object> a(JSONObject jSONObject) {
        HashMap map = new HashMap();
        if (jSONObject != null) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                try {
                    map.put(next, a(jSONObject.get(next)));
                } catch (JSONException e10) {
                    C4462o4.d().a(e10);
                    IronLog.INTERNAL.error(String.format("Could not put value in map: %s, %s", next, e10.getMessage()));
                }
            }
        }
        return map;
    }

    public static List<Object> a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            try {
                arrayList.add(a(jSONArray.get(i10)));
            } catch (JSONException e10) {
                C4462o4.d().a(e10);
                IronLog.INTERNAL.error(String.format("Could not put value into list: %s", e10.getMessage()));
            }
        }
        return arrayList;
    }

    private static Object a(Object obj) {
        if (obj instanceof JSONObject) {
            return a((JSONObject) obj);
        }
        return obj instanceof JSONArray ? a((JSONArray) obj) : obj;
    }

    public static JSONObject a(Map<String, Object> map) {
        JSONObject jSONObject = new JSONObject();
        if (map != null) {
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                try {
                    jSONObject.put(entry.getKey(), b(entry.getValue()));
                } catch (JSONException e10) {
                    C4462o4.d().a(e10);
                    IronLog.INTERNAL.error(String.format("Could not map entry to object: %s, %s", entry.getKey(), entry.getValue()));
                }
            }
        }
        return jSONObject;
    }
}
