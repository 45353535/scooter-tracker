package com.my.target;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class va {
    public static va a() {
        return new va();
    }

    public final void b(JSONObject jSONObject, ua uaVar) {
        uaVar.a(jSONObject.optBoolean("hasAdditionalAds", uaVar.d()));
    }

    public void a(JSONObject jSONObject, ua uaVar) {
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject != null) {
            b(jSONObjectOptJSONObject, uaVar);
        }
    }
}
