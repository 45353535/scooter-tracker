package com.bytedance.sdk.openadsdk.rq.qdl;

import androidx.annotation.NonNull;
import com.bytedance.sdk.component.qdl.lnr;
import com.bytedance.sdk.openadsdk.core.hkc;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class lnr extends com.bytedance.sdk.component.qdl.lnr<JSONObject, JSONObject> {
    private final WeakReference<hkc> qdl;

    public lnr(hkc hkcVar) {
        this.qdl = new WeakReference<>(hkcVar);
    }

    public static void qdl(com.bytedance.sdk.component.qdl.bjy bjyVar, final hkc hkcVar) {
        bjyVar.qdl("newClickEvent", new lnr.ud() { // from class: com.bytedance.sdk.openadsdk.rq.qdl.lnr.1
            @Override // com.bytedance.sdk.component.qdl.lnr.ud
            public com.bytedance.sdk.component.qdl.lnr qdl() {
                return new lnr(hkcVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.bytedance.sdk.component.qdl.lnr
    public void qdl(@NonNull JSONObject jSONObject, @NonNull com.bytedance.sdk.component.qdl.mzz mzzVar) throws Exception {
        hkc hkcVar = this.qdl.get();
        if (hkcVar == null) {
            lnr();
        } else {
            hkcVar.mzz(jSONObject);
        }
    }
}
