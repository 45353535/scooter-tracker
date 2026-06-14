package com.bytedance.sdk.openadsdk.bjy.lnr;

import com.ironsource.N6;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mml {

    public static class qdl {
        public final String qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        public final JSONObject f16955ud;

        public qdl(String str, JSONObject jSONObject) {
            this.qdl = str;
            this.f16955ud = jSONObject;
            JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("device_info");
            if (jSONObjectOptJSONObject != null) {
                try {
                    jSONObjectOptJSONObject.put(N6.V0, com.bytedance.sdk.openadsdk.exc.qdl.ud.qdl.qdl().ud());
                    jSONObject.put("device_info", jSONObjectOptJSONObject);
                } catch (JSONException unused) {
                }
            }
        }
    }

    public static lnr qdl() {
        return mzz.qdl();
    }
}
