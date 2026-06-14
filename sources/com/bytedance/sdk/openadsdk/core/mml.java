package com.bytedance.sdk.openadsdk.core;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mml {
    public static void qdl(com.bytedance.sdk.openadsdk.core.model.ljh ljhVar, String str, int i10, JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("type", i10);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.mml.lnr.ud(ljhVar, str, "convert_track", jSONObject);
    }
}
