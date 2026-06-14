package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes7.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f20426a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f20427b = new HashMap();

    public final String a(String str, String str2) {
        return this.f20426a.containsKey(str) ? (String) this.f20426a.get(str) : str2;
    }

    public final int b(String str, int i10, int i11) {
        int i12;
        try {
            i12 = Integer.parseInt(a(str, Integer.toString(i10)));
        } catch (Throwable unused) {
            i12 = i10;
        }
        return (i12 < i11 || i12 > 30) ? i10 : i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && o.class == obj.getClass()) {
            o oVar = (o) obj;
            if (this.f20426a.equals(oVar.f20426a) && this.f20427b.equals(oVar.f20427b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.f20426a.hashCode();
    }

    public static o a(JSONObject jSONObject) {
        o oVar = new o();
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("params");
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("overrides");
        JSONArray jSONArrayNames = jSONObjectOptJSONObject.names();
        for (int i10 = 0; i10 < jSONArrayNames.length(); i10++) {
            String strOptString = jSONArrayNames.optString(i10, null);
            String strOptString2 = jSONObjectOptJSONObject.optString(strOptString, null);
            if (strOptString != null && strOptString2 != null) {
                oVar.f20426a.put(strOptString, strOptString2);
            }
        }
        if (jSONObjectOptJSONObject2 != null) {
            JSONArray jSONArrayNames2 = jSONObjectOptJSONObject2.names();
            for (int i11 = 0; i11 < jSONArrayNames2.length(); i11++) {
                String strOptString3 = jSONArrayNames2.optString(i11, null);
                JSONObject jSONObjectOptJSONObject3 = jSONObjectOptJSONObject2.optJSONObject(strOptString3);
                if (strOptString3 != null && jSONObjectOptJSONObject3 != null) {
                    oVar.f20427b.put(strOptString3, new m(jSONObjectOptJSONObject3));
                }
            }
        }
        return oVar;
    }

    public final int a(String str, int i10, int i11) {
        try {
            i10 = Integer.parseInt(a(str, Integer.toString(i10)));
        } catch (Throwable unused) {
        }
        return Math.max(i10, i11);
    }

    public final boolean a(boolean z10, String str) {
        try {
            return Boolean.parseBoolean(a(str, Boolean.toString(z10)));
        } catch (Throwable unused) {
            return z10;
        }
    }

    public final l a(String str) {
        m mVar;
        String str2 = IAConfigManager.O.f20298d;
        if (this.f20427b.containsKey(str2)) {
            mVar = (m) this.f20427b.get(str2);
        } else {
            mVar = new m();
        }
        mVar.getClass();
        return mVar.f20423a.containsKey(str) ? (l) mVar.f20423a.get(str) : new l();
    }
}
