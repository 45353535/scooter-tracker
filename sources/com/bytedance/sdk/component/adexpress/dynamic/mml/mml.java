package com.bytedance.sdk.component.adexpress.dynamic.mml;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mml {
    public String lnr;
    public String mml;
    public List<qdl> qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public String f16365ud;

    public static class qdl {
        public int qdl;

        /* JADX INFO: renamed from: ud, reason: collision with root package name */
        public JSONObject f16366ud;
    }

    public static mml qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        mml mmlVar = new mml();
        String strOptString = jSONObject.optString("custom_components");
        ArrayList arrayList = new ArrayList();
        try {
            JSONArray jSONArray = new JSONArray(strOptString);
            for (int i10 = 0; i10 < jSONArray.length(); i10++) {
                JSONObject jSONObjectOptJSONObject = jSONArray.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    qdl qdlVar = new qdl();
                    qdlVar.qdl = jSONObjectOptJSONObject.optInt("id");
                    qdlVar.f16366ud = new JSONObject(jSONObjectOptJSONObject.optString("componentLayout"));
                    arrayList.add(qdlVar);
                }
            }
        } catch (JSONException unused) {
        }
        mmlVar.qdl = arrayList;
        mmlVar.f16365ud = jSONObject.optString("diff_data");
        mmlVar.lnr = jSONObject.optString("style_diff");
        mmlVar.mml = jSONObject.optString("tag_diff");
        return mmlVar;
    }
}
