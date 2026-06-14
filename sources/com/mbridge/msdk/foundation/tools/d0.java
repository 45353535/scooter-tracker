package com.mbridge.msdk.foundation.tools;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.inmobi.unification.sdk.InitializationStatus;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class d0 {
    public static String a(int i10, int i11, int i12, int i13, int i14) {
        JSONObject jSONObject = new JSONObject();
        try {
            try {
                jSONObject.put("code", 0);
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, InitializationStatus.SUCCESS);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("rotateAngle", i10);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("left", i11);
                jSONObject3.put("right", i12);
                jSONObject3.put("top", i13);
                jSONObject3.put("bottom", i14);
                jSONObject2.put("cutoutInfo", jSONObject3);
                jSONObject.put("data", jSONObject2);
            } catch (Exception e10) {
                q0.b("JSONUtils", e10.getMessage());
            }
        } catch (Throwable th2) {
            q0.b("JSONUtils", th2.getMessage());
            try {
                jSONObject.put("code", 1);
                jSONObject.put(PglCryptUtils.KEY_MESSAGE, "Fail");
            } catch (JSONException e11) {
                q0.b("JSONUtils", e11.getMessage());
            }
        }
        return jSONObject.toString();
    }

    public static ArrayList<String> a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        int length = jSONArray.length();
        ArrayList<String> arrayList = new ArrayList<>(length);
        for (int i10 = 0; i10 < length; i10++) {
            arrayList.add(jSONArray.optString(i10));
        }
        return arrayList;
    }
}
