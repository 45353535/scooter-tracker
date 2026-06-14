package com.bytedance.sdk.openadsdk.core.model;

import com.google.firebase.remoteconfig.RemoteConfigComponent;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ekw {
    private String lnr;
    private String mml;
    private qdl mo;
    private JSONObject mzz;
    private String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private String f17343ud;

    public static class qdl {
        private JSONArray lnr;
        private JSONArray qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private JSONArray f17344ud;

        public JSONArray lnr() {
            return this.lnr;
        }

        public JSONObject mml() {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("image", this.qdl);
                jSONObject.put(RemoteConfigComponent.FETCH_FILE_NAME, this.f17344ud);
                jSONObject.put("script", this.lnr);
                return jSONObject;
            } catch (JSONException e10) {
                e10.getMessage();
                return jSONObject;
            }
        }

        public JSONArray qdl() {
            return this.qdl;
        }

        public JSONArray ud() {
            return this.f17344ud;
        }

        public void lnr(JSONArray jSONArray) {
            this.lnr = jSONArray;
        }

        public void qdl(JSONArray jSONArray) {
            this.qdl = jSONArray;
        }

        public void ud(JSONArray jSONArray) {
            this.f17344ud = jSONArray;
        }

        public static qdl qdl(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("image");
            qdl qdlVar = new qdl();
            qdlVar.qdl(jSONArrayOptJSONArray);
            qdlVar.ud(jSONObject.optJSONArray(RemoteConfigComponent.FETCH_FILE_NAME));
            qdlVar.lnr(jSONObject.optJSONArray("script"));
            return qdlVar;
        }
    }

    public String lnr() {
        return this.lnr;
    }

    public String mml() {
        return this.mml;
    }

    public qdl mo() {
        return this.mo;
    }

    public JSONObject mzz() {
        return this.mzz;
    }

    public String qdl() {
        return this.qdl;
    }

    public String ud() {
        return this.f17343ud;
    }

    public JSONObject wd() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("id", this.qdl);
            jSONObject.put("md5", this.f17343ud);
            jSONObject.put("url", this.lnr);
            jSONObject.put("data", this.mml);
            jSONObject.put("custom_components", this.mzz);
            qdl qdlVar = this.mo;
            if (qdlVar != null) {
                jSONObject.put("preload", qdlVar.mml());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static ekw qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        ekw ekwVar = new ekw();
        ekwVar.qdl = jSONObject.optString("id");
        ekwVar.mml = jSONObject.optString("data");
        ekwVar.lnr = jSONObject.optString("url");
        ekwVar.f17343ud = jSONObject.optString("md5");
        ekwVar.mzz = jSONObject.optJSONObject("custom_components");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preload");
        if (jSONObjectOptJSONObject != null) {
            ekwVar.mo = qdl.qdl(jSONObjectOptJSONObject);
        }
        return ekwVar;
    }
}
