package com.bytedance.sdk.openadsdk.mml.ud;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class lnr implements ud {
    ud qdl;

    @Override // com.bytedance.sdk.openadsdk.mml.ud.ud
    public void qdl(JSONObject jSONObject, long j10) throws JSONException {
        ud udVar = this.qdl;
        if (udVar != null) {
            udVar.qdl(jSONObject, j10);
        }
        if (j10 <= 0) {
            j10 = System.currentTimeMillis();
        }
        jSONObject.put("event_ts", j10);
    }
}
