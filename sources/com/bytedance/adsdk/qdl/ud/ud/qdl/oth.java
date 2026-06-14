package com.bytedance.adsdk.qdl.ud.ud.qdl;

import android.text.TextUtils;
import com.ironsource.C4240b4;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class oth implements com.bytedance.adsdk.qdl.ud.ud.qdl {
    private final String qdl;

    public oth(String str) {
        this.qdl = str;
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public Object qdl(Map<String, JSONObject> map) {
        Object objQdl;
        if (map == null || map.size() <= 0 || (objQdl = qdl(this.qdl, map.get("default_key"))) == JSONObject.NULL) {
            return null;
        }
        return objQdl;
    }

    public String toString() {
        return "VariableNode [literals=" + this.qdl + C4240b4.j.f42674e;
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public String ud() {
        return this.qdl;
    }

    @Override // com.bytedance.adsdk.qdl.ud.ud.qdl
    public com.bytedance.adsdk.qdl.ud.mml.mzz qdl() {
        return com.bytedance.adsdk.qdl.ud.mml.mo.VARIABLE;
    }

    public Object qdl(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return qdl(str.split("\\."), 0, jSONObject);
    }

    private Object qdl(String[] strArr, int i10, JSONObject jSONObject) {
        Object objOpt;
        if (strArr != null && strArr.length > 0 && i10 < strArr.length && jSONObject != null) {
            String str = strArr[i10];
            int iIndexOf = str.indexOf(C4240b4.j.f42672d);
            int iIndexOf2 = str.indexOf(C4240b4.j.f42674e);
            if (iIndexOf >= 0 && iIndexOf2 >= 0 && iIndexOf <= iIndexOf2) {
                String strSubstring = str.substring(0, iIndexOf);
                try {
                    int i11 = Integer.parseInt(str.substring(iIndexOf + 1, iIndexOf2));
                    Object objOpt2 = jSONObject.opt(strSubstring);
                    objOpt = objOpt2 instanceof JSONArray ? ((JSONArray) objOpt2).opt(i11) : null;
                } catch (NumberFormatException unused) {
                    return null;
                }
            } else {
                objOpt = jSONObject.opt(str);
            }
            if (i10 == strArr.length - 1) {
                return objOpt;
            }
            if (objOpt instanceof String) {
                try {
                    return qdl(strArr, i10 + 1, new JSONObject((String) objOpt));
                } catch (JSONException unused2) {
                    return objOpt;
                }
            }
            if (objOpt instanceof JSONObject) {
                return qdl(strArr, i10 + 1, (JSONObject) objOpt);
            }
        }
        return null;
    }
}
