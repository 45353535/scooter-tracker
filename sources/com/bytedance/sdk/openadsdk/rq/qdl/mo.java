package com.bytedance.sdk.openadsdk.rq.qdl;

import com.bytedance.sdk.openadsdk.core.hkc;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mo extends com.bytedance.sdk.component.qdl.mml<JSONObject, JSONObject> {
    private final WeakReference<hkc> qdl;

    public mo(hkc hkcVar) {
        this.qdl = new WeakReference<>(hkcVar);
    }

    public static void qdl(com.bytedance.sdk.component.qdl.bjy bjyVar, hkc hkcVar) {
        bjyVar.qdl("interactiveFinish", new mo(hkcVar));
    }

    @Override // com.bytedance.sdk.component.qdl.mml
    public JSONObject qdl(String str, JSONObject jSONObject, com.bytedance.sdk.component.qdl.mzz mzzVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        WeakReference<hkc> weakReference = this.qdl;
        if (weakReference != null && weakReference.get() != null) {
            hkc hkcVar = this.qdl.get();
            ljh ljhVarMml = hkcVar.mml();
            try {
                boolean z10 = true;
                int i10 = 0;
                if (jSONObject.optInt("finish", 1) != 1) {
                    z10 = false;
                }
                int iOptInt = jSONObject.optInt("reduce_duration", -1);
                int iKxe = ljhVarMml != null ? ljhVarMml.kxe() : 0;
                if (iOptInt >= 0 && iKxe >= 0) {
                    iOptInt = Math.min(iOptInt, iKxe);
                } else if (iOptInt < 0) {
                    iOptInt = iKxe >= 0 ? iKxe : 0;
                }
                if (z10) {
                    hkcVar.lnr(iOptInt);
                } else {
                    i10 = -1;
                }
                jSONObject2.put("code", i10);
                jSONObject2.put("reduce_duration", iOptInt);
                return jSONObject2;
            } catch (JSONException e10) {
                com.bytedance.sdk.component.utils.aaj.lnr("InteractiveFinishMethod", e10.getMessage());
            }
        }
        return jSONObject2;
    }
}
