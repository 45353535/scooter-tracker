package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: io.appmetrica.analytics.impl.nb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public abstract class AbstractC5295nb {
    public static String a(HashMap map) {
        if (map == null) {
            return null;
        }
        return map.isEmpty() ? "" : b(map);
    }

    public static String b(Map map) {
        if (no.a(map)) {
            return null;
        }
        return new JSONObject(map).toString();
    }

    public static HashMap c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            HashMap map = new HashMap();
            if (!JSONObject.NULL.equals(jSONObject)) {
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    map.put(next, jSONObject.optString(next));
                }
            }
            return map;
        } catch (Throwable unused) {
            return null;
        }
    }

    public static HashMap d(String str) {
        JSONObject jSONObject = new JSONObject(str);
        HashMap map = new HashMap();
        if (!JSONObject.NULL.equals(jSONObject)) {
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                map.put(next, jSONObject.optString(next));
            }
        }
        return map;
    }

    public static ScreenInfo e(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(str);
            return new ScreenInfo(jSONObject.optInt("width"), jSONObject.optInt("height"), jSONObject.optInt("dpi"), (float) jSONObject.optDouble("scaleFactor", 0.0d));
        } catch (Throwable unused) {
            return null;
        }
    }

    public static ArrayList b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONArray jSONArray = new JSONArray(str);
                ArrayList arrayList = new ArrayList(jSONArray.length());
                for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                    try {
                        arrayList.add(jSONArray.getString(i10));
                    } catch (Throwable unused) {
                        return arrayList;
                    }
                }
                return arrayList;
            } catch (Throwable unused2) {
            }
        }
        return null;
    }

    public static HashMap a(String str) {
        if (str == null) {
            return null;
        }
        if (str.isEmpty()) {
            return new HashMap();
        }
        return c(str);
    }

    public static Integer a(JSONObject jSONObject, String str, Integer num) {
        if (jSONObject != null && jSONObject.has(str)) {
            try {
                return Integer.valueOf(jSONObject.getInt(str));
            } catch (Throwable unused) {
            }
        }
        return num;
    }

    public static ArrayList a(JSONArray jSONArray) {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i10 = 0; i10 < jSONArray.length(); i10++) {
            arrayList.add(jSONArray.getString(i10));
        }
        return arrayList;
    }

    public static String a(ScreenInfo screenInfo) {
        JSONObject jSONObject;
        if (screenInfo == null) {
            jSONObject = null;
        } else {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("width", screenInfo.getWidth()).put("height", screenInfo.getHeight()).put("dpi", screenInfo.getDpi()).put("scaleFactor", screenInfo.getScaleFactor());
            } catch (Throwable unused) {
            }
        }
        if (jSONObject == null) {
            return null;
        }
        return jSONObject.toString();
    }

    public static String a(Map map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            for (Map.Entry entry : map.entrySet()) {
                List list = (List) entry.getValue();
                JSONArray jSONArray = no.a((Collection) list) ? null : new JSONArray((Collection) list);
                if (jSONArray != null) {
                    jSONObject.put((String) entry.getKey(), jSONArray.toString());
                }
            }
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }
}
