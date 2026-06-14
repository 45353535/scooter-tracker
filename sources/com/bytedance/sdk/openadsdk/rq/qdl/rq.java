package com.bytedance.sdk.openadsdk.rq.qdl;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.bytedance.sdk.openadsdk.core.hkc;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class rq extends com.bytedance.sdk.component.qdl.mml<JSONObject, JSONObject> {
    private final hkc qdl;

    public rq(hkc hkcVar) {
        this.qdl = hkcVar;
    }

    public static void qdl(com.bytedance.sdk.component.qdl.bjy bjyVar, hkc hkcVar) {
        bjyVar.qdl("overlayRenderFinish", new rq(hkcVar));
    }

    @Override // com.bytedance.sdk.component.qdl.mml
    @Nullable
    public JSONObject qdl(String str, @NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.qdl.mzz mzzVar) throws Exception {
        this.qdl.exu();
        return null;
    }
}
