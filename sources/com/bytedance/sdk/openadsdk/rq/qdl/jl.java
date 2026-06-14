package com.bytedance.sdk.openadsdk.rq.qdl;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.core.mrf;
import com.ironsource.C4240b4;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class jl extends com.bytedance.sdk.component.qdl.jl<JSONObject, JSONObject> {
    public static final HashSet<String> qdl = new HashSet<>(Arrays.asList("setStorageItem", "getStorageItem", "removeAllStorage", "removeStorageItem"));

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private ljh f17815ud;

    public jl(ljh ljhVar) {
        this.f17815ud = ljhVar;
    }

    public static void qdl(com.bytedance.sdk.component.qdl.bjy bjyVar, ljh ljhVar) {
        bjyVar.qdl(qdl, new jl(ljhVar));
    }

    @Override // com.bytedance.sdk.component.qdl.mml
    public JSONObject qdl(String str, JSONObject jSONObject, com.bytedance.sdk.component.qdl.mzz mzzVar) throws Exception {
        String strYot;
        JSONObject jSONObject2;
        ljh ljhVar = this.f17815ud;
        if (ljhVar == null || (strYot = ljhVar.yot()) == null) {
            return null;
        }
        jSONObject2 = new JSONObject();
        str.getClass();
        switch (str) {
            case "getStorageItem":
                String strOptString = jSONObject.optString(C4240b4.i.W);
                if (!TextUtils.isEmpty(strOptString) && mrf.qdl().ud(strYot, strOptString)) {
                    jSONObject2.put("value", mrf.qdl().qdl(strYot, strOptString));
                    jSONObject2.put("code", "0");
                    break;
                } else {
                    jSONObject2.put("code", "1");
                    break;
                }
                break;
            case "removeAllStorage":
                mrf.qdl().qdl(strYot);
                jSONObject2.put("code", "0");
                break;
            case "setStorageItem":
                String strOptString2 = jSONObject.optString(C4240b4.i.W);
                String strOptString3 = jSONObject.optString("value");
                if (strOptString2 != null) {
                    mrf.qdl().qdl(strYot, strOptString2, strOptString3);
                    jSONObject2.put("code", "0");
                    break;
                } else {
                    jSONObject2.put("code", "1");
                    break;
                }
                break;
            case "removeStorageItem":
                String strOptString4 = jSONObject.optString(C4240b4.i.W);
                if (!TextUtils.isEmpty(strOptString4)) {
                    jSONObject2.put("code", mrf.qdl().lnr(strYot, strOptString4) ? "0" : "1");
                    break;
                } else {
                    jSONObject2.put("code", "1");
                    break;
                }
                break;
        }
        return null;
    }
}
