package com.bytedance.adsdk.ugeno.mml;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mo {
    private qdl qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private List<qdl> f16190ud;

    public static class qdl {
        private String lnr = "global";
        private String mml;
        private Map<String, Object> mo;
        private Map<String, String> mzz;
        private String qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private String f16191ud;

        public Map<String, String> lnr() {
            return this.mzz;
        }

        public String mml() {
            return this.qdl;
        }

        public String mzz() {
            return this.f16191ud;
        }

        public String qdl() {
            return this.lnr;
        }

        public String toString() {
            return "Action{scheme='" + this.lnr + "', name='" + this.mml + "', params=" + this.mzz + ", host='" + this.f16191ud + "', origin='" + this.qdl + "', extra=" + this.mo + '}';
        }

        public String ud() {
            return this.mml;
        }

        public void lnr(String str) {
            this.qdl = str;
        }

        public void mml(String str) {
            this.f16191ud = str;
        }

        public void qdl(String str) {
            this.lnr = str;
        }

        public void ud(String str) {
            this.mml = str;
        }

        public void qdl(Map<String, String> map) {
            this.mzz = map;
        }

        public void ud(Map<String, Object> map) {
            this.mo = map;
        }
    }

    public qdl qdl() {
        return this.qdl;
    }

    public List<qdl> ud() {
        return this.f16190ud;
    }

    public static mo qdl(JSONObject jSONObject, JSONObject jSONObject2) {
        if (jSONObject == null) {
            return null;
        }
        mo moVar = new mo();
        String strOptString = jSONObject.optString("on");
        JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("handlers");
        moVar.qdl = fs.qdl(strOptString, jSONObject2);
        if (jSONArrayOptJSONArray == null || jSONArrayOptJSONArray.length() <= 0) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
            qdl qdlVarQdl = fs.qdl(jSONArrayOptJSONArray.optString(i10), jSONObject2);
            if (qdlVarQdl != null) {
                arrayList.add(qdlVarQdl);
            }
        }
        moVar.f16190ud = arrayList;
        return moVar;
    }
}
