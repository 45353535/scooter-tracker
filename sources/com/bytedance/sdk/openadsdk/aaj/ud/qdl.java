package com.bytedance.sdk.openadsdk.aaj.ud;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    private List<C0245qdl> lnr;
    private String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private List<C0245qdl> f16803ud;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.aaj.ud.qdl$qdl, reason: collision with other inner class name */
    public static class C0245qdl {
        private int lnr;
        private String qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        private String f16804ud;

        public boolean equals(Object obj) {
            String str;
            if (!(obj instanceof C0245qdl)) {
                return super.equals(obj);
            }
            String str2 = this.qdl;
            if (str2 != null) {
                C0245qdl c0245qdl = (C0245qdl) obj;
                if (str2.equals(c0245qdl.qdl) && (str = this.f16804ud) != null && str.equals(c0245qdl.f16804ud)) {
                    return true;
                }
            }
            return false;
        }

        public static C0245qdl qdl(JSONObject jSONObject) {
            if (jSONObject == null) {
                return null;
            }
            C0245qdl c0245qdl = new C0245qdl();
            c0245qdl.qdl = jSONObject.optString("url");
            c0245qdl.f16804ud = jSONObject.optString("md5");
            c0245qdl.lnr = jSONObject.optInt("type");
            return c0245qdl;
        }

        public String qdl() {
            return this.qdl;
        }
    }

    public List<C0245qdl> lnr() {
        return this.lnr;
    }

    public void qdl(String str) {
        this.qdl = str;
    }

    public void ud(List<C0245qdl> list) {
        this.lnr = list;
    }

    public void qdl(List<C0245qdl> list) {
        this.f16803ud = list;
    }

    public List<C0245qdl> ud() {
        return this.f16803ud;
    }

    public static qdl ud(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            qdl qdlVar = new qdl();
            qdlVar.qdl(jSONObject.optString("version"));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("resources");
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            if (jSONArrayOptJSONArray != null && jSONArrayOptJSONArray.length() > 0) {
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    C0245qdl c0245qdlQdl = C0245qdl.qdl(jSONArrayOptJSONArray.optJSONObject(i10));
                    if (c0245qdlQdl != null) {
                        if (c0245qdlQdl.lnr != 1) {
                            if (c0245qdlQdl.lnr == 2 && arrayList2.size() < 10) {
                                arrayList2.add(c0245qdlQdl);
                            }
                        } else {
                            arrayList.add(c0245qdlQdl);
                        }
                    }
                }
            }
            qdlVar.qdl(arrayList);
            qdlVar.ud(arrayList2);
            return qdlVar;
        } catch (JSONException unused) {
            return null;
        }
    }

    public String qdl() {
        return this.qdl;
    }
}
