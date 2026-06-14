package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class bjy {
    private final int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final int f17340ud;

    public bjy(JSONObject jSONObject) {
        this.qdl = jSONObject.optInt("auto_click", 0);
        this.f17340ud = jSONObject.optInt("hidden_bar", 0);
    }

    public JSONObject lnr() {
        try {
            JSONObject jSONObject = new JSONObject();
            int i10 = this.qdl;
            if (i10 == 1) {
                jSONObject.put("auto_click", i10);
            }
            if (this.f17340ud == 1) {
                jSONObject.put("hidden_bar", 1);
            }
            return jSONObject;
        } catch (JSONException unused) {
            return null;
        }
    }

    public int qdl() {
        return this.qdl;
    }

    public boolean ud() {
        return this.f17340ud == 1;
    }

    public static boolean qdl(ljh ljhVar) {
        if (ljhVar == null || !ljhVar.uj() || ljhVar.yfh() == null) {
            return false;
        }
        return ljhVar.yfh().ud();
    }
}
