package com.bytedance.sdk.openadsdk.rq.qdl;

import com.bytedance.sdk.openadsdk.core.hkc;
import java.util.Arrays;
import java.util.HashSet;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class fs extends com.bytedance.sdk.component.qdl.jl<JSONObject, JSONObject> {
    private static final HashSet<String> qdl = new HashSet<>(Arrays.asList("popupShow", "popupDismiss", "changeCountdownStatus", "getCurrentCountdownStatus", "popupRenderDidFinish"));

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final hkc f17814ud;

    public fs(hkc hkcVar) {
        this.f17814ud = hkcVar;
    }

    public static void qdl(com.bytedance.sdk.component.qdl.bjy bjyVar, hkc hkcVar) {
        bjyVar.qdl(qdl, new fs(hkcVar));
    }

    @Override // com.bytedance.sdk.component.qdl.mml
    public JSONObject qdl(String str, JSONObject jSONObject, com.bytedance.sdk.component.qdl.mzz mzzVar) throws Exception {
        str.getClass();
        switch (str) {
            case "popupDismiss":
                this.f17814ud.jtx();
                break;
            case "popupShow":
                this.f17814ud.bjy();
                break;
            case "popupRenderDidFinish":
                this.f17814ud.jl();
                break;
            case "changeCountdownStatus":
                this.f17814ud.rq(jSONObject);
                break;
        }
        return null;
    }
}
