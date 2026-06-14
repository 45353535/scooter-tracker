package com.bytedance.sdk.openadsdk.core.model;

import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ud {
    private String lnr;
    private String mml;
    private boolean mzz;
    private String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private String f17400ud;

    public String lnr() {
        return this.lnr;
    }

    public String mml() {
        return this.mml;
    }

    public JSONObject mo() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(CampaignEx.JSON_KEY_PRIVACY_URL, this.lnr);
            jSONObject.put("privacy_title", this.mml);
            jSONObject.put("text", this.f17400ud);
            jSONObject.put("icon", this.qdl);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public boolean mzz() {
        return this.mzz;
    }

    public void qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        this.qdl = jSONObject.optString("icon");
        this.f17400ud = jSONObject.optString("text");
        this.lnr = jSONObject.optString(CampaignEx.JSON_KEY_PRIVACY_URL);
        this.mml = jSONObject.optString("privacy_title");
    }

    public String ud() {
        return this.f17400ud;
    }

    public String qdl() {
        return this.qdl;
    }

    public void qdl(boolean z10) {
        this.mzz = z10;
    }
}
