package com.appodeal.ads.segments;

import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.utils.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public final class i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final JSONObject f14479a;

    public i0(JSONObject jSONObject) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            this.f14479a = jSONObjectOptJSONObject;
        } else {
            this.f14479a = new JSONObject();
        }
    }

    public static /* synthetic */ int a(Set set, JSONObject jSONObject, JSONObject jSONObject2) {
        if (!set.contains(jSONObject.optString("status")) && !set.contains(jSONObject2.optString("status"))) {
            return 0;
        }
        double dOptDouble = jSONObject2.optDouble("ecpm") - jSONObject.optDouble("ecpm");
        if (dOptDouble == 0.0d) {
            return 0;
        }
        return dOptDouble < 0.0d ? -1 : 1;
    }

    public static void c(ArrayList arrayList, final HashSet hashSet) {
        if (hashSet.isEmpty()) {
            return;
        }
        Collections.sort(arrayList, new Comparator() { // from class: com.appodeal.ads.segments.h0
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return i0.a(hashSet, (JSONObject) obj, (JSONObject) obj2);
            }
        });
    }

    public static void d(ArrayList arrayList, HashSet hashSet, JSONObject jSONObject) throws JSONException {
        if (hashSet.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            JSONObject jSONObject2 = (JSONObject) it.next();
            String strOptString = jSONObject2.optString("status", null);
            String strOptString2 = jSONObject2.optString("name", null);
            if (strOptString2 != null && !strOptString2.isEmpty()) {
                strOptString = strOptString2;
            }
            if (strOptString != null && !strOptString.isEmpty() && hashSet.contains(strOptString)) {
                if (!jSONObject2.has("cap")) {
                    String strOptString3 = jSONObject2.optString("id");
                    String strOptString4 = jSONObject2.optString("status");
                    String strOptString5 = jSONObject2.optString("name", null);
                    if (strOptString5 != null && !strOptString5.isEmpty()) {
                        strOptString4 = strOptString5;
                    }
                    Iterator it2 = arrayList.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            jSONObject2.put("ecpm", jSONObject.getDouble(strOptString));
                            break;
                        }
                        JSONObject jSONObject3 = (JSONObject) it2.next();
                        String strOptString6 = jSONObject3.optString("id");
                        if (strOptString6 == null || !strOptString6.equals(strOptString3)) {
                            String strOptString7 = jSONObject3.optString("status");
                            String strOptString8 = jSONObject3.optString("name", null);
                            if (strOptString8 != null && !strOptString8.isEmpty()) {
                                strOptString7 = strOptString8;
                            }
                            if (strOptString7 == null || !strOptString7.equals(strOptString4)) {
                            }
                        }
                    }
                } else if (jSONObject2.getBoolean("cap")) {
                    it.remove();
                } else {
                    jSONObject2.put("ecpm", jSONObject.getDouble(strOptString));
                }
            }
        }
    }

    public final void b(ArrayList arrayList, AdType adType) {
        try {
            JSONObject jSONObjectOptJSONObject = this.f14479a.optJSONObject("disable_networks");
            JSONArray jSONArrayOptJSONArray = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.optJSONArray(l0.a(adType)) : null;
            if (jSONArrayOptJSONArray == null) {
                jSONArrayOptJSONArray = new JSONArray();
            }
            if (jSONArrayOptJSONArray.length() == 0) {
                return;
            }
            HashSet hashSet = new HashSet(jSONArrayOptJSONArray.length());
            for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                hashSet.add(jSONArrayOptJSONArray.getString(i10));
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                String strOptString = jSONObject.optString("status", null);
                String strOptString2 = jSONObject.optString("name", null);
                if ((strOptString != null && !strOptString.isEmpty() && hashSet.contains(strOptString)) || (strOptString2 != null && !strOptString2.isEmpty() && hashSet.contains(strOptString2))) {
                    it.remove();
                }
            }
        } catch (Exception e10) {
            Log.log(e10);
        }
    }

    public final boolean e(AdType adType) {
        JSONArray jSONArrayOptJSONArray = this.f14479a.optJSONArray("disable_type");
        if (jSONArrayOptJSONArray == null) {
            return false;
        }
        return jSONArrayOptJSONArray.toString().contains("\"" + l0.a(adType) + "\"");
    }
}
