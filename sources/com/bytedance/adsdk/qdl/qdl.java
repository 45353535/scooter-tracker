package com.bytedance.adsdk.qdl;

import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class qdl implements tvp {
    @Override // com.bytedance.adsdk.qdl.tvp
    public Object qdl(JSONObject jSONObject, Object[] objArr) {
        if (objArr == null || objArr.length != 2) {
            return null;
        }
        String strValueOf = String.valueOf(objArr[0]);
        JSONArray jSONArray = new JSONArray();
        try {
            JSONArray jSONArray2 = new JSONArray(strValueOf);
            int i10 = Integer.parseInt(String.valueOf(objArr[1]));
            for (int i11 = 0; i11 < jSONArray2.length(); i11 += i10) {
                JSONObject jSONObject2 = new JSONObject();
                JSONArray jSONArray3 = new JSONArray();
                for (int i12 = 0; i12 < i10; i12++) {
                    int i13 = i11 + i12;
                    if (i13 >= jSONArray2.length()) {
                        break;
                    }
                    jSONArray3.put(jSONArray2.optJSONObject(i13));
                }
                jSONObject2.put("$chunk", jSONArray3);
                jSONArray.put(jSONObject2);
            }
        } catch (Throwable unused) {
        }
        return jSONArray;
    }
}
