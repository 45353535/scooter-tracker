package com.bytedance.adsdk.qdl;

import com.bytedance.adsdk.ugeno.lnr.qdl;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class lnr implements com.bytedance.adsdk.ugeno.lnr.qdl {

    static class qdl implements qdl.InterfaceC0208qdl {
        private com.bytedance.adsdk.qdl.ud.qdl qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private String f15964ud;

        private qdl(String str) {
            this.f15964ud = str;
            this.qdl = com.bytedance.adsdk.qdl.ud.qdl.qdl(str);
        }

        public static qdl qdl(String str) {
            return new qdl(str);
        }

        @Override // com.bytedance.adsdk.ugeno.lnr.qdl.InterfaceC0208qdl
        public Object qdl(JSONObject jSONObject) {
            com.bytedance.adsdk.qdl.ud.qdl qdlVar = this.qdl;
            if (qdlVar == null) {
                return this.f15964ud;
            }
            Object objQdl = qdlVar.qdl(jSONObject);
            if (objQdl instanceof String) {
                return objQdl;
            }
            if (objQdl instanceof com.bytedance.adsdk.qdl.ud.qdl.qdl) {
                return String.valueOf(jtx.qdl((com.bytedance.adsdk.qdl.ud.qdl.qdl) objQdl));
            }
            if (objQdl == null || !objQdl.getClass().isArray()) {
                return String.valueOf(objQdl);
            }
            try {
                return new JSONArray(objQdl).toString();
            } catch (JSONException unused) {
                return String.valueOf(objQdl);
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.lnr.qdl
    public qdl.InterfaceC0208qdl qdl(String str) {
        return qdl.qdl(str);
    }
}
