package com.my.target;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public abstract class n5 {
    public static String a(JSONObject jSONObject, String str) {
        if (jSONObject.isNull(str)) {
            return null;
        }
        return jSONObject.optString(str);
    }
}
