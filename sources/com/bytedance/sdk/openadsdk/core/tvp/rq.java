package com.bytedance.sdk.openadsdk.core.tvp;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class rq {
    public static void qdl(String str, int i10, String str2, String str3, String str4, com.bytedance.sdk.openadsdk.core.model.ljh ljhVar) {
        if (TextUtils.isEmpty(str2)) {
            str2 = com.bytedance.sdk.openadsdk.core.jpc.qdl(i10);
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("render_source", str);
            ljh.qdl qdlVarXdk = ljhVar.xdk();
            if (qdlVarXdk != null) {
                jSONObject.put("tpl_id", qdlVarXdk.mml());
                if ("Web".equals(str)) {
                    if (qdlVarXdk.fs()) {
                        jSONObject.put("engine_version", "v3");
                    } else {
                        jSONObject.put("engine_version", "v1");
                    }
                }
            } else if (ljhVar.kr() != null) {
                jSONObject.put("tpl_id", ljhVar.kr().qdl());
                if ("Web".equals(str)) {
                    jSONObject.put("engine_version", "v3");
                }
            }
        } catch (Exception unused) {
        }
        com.bytedance.sdk.openadsdk.bjy.lnr.qdl().qdl(com.bytedance.sdk.openadsdk.bjy.qdl.mml.ud().qdl(qdl(str3)).lnr(str4).mzz(ljhVar != null ? ljhVar.cev() : "").ud(i10).ud(jSONObject.toString()).mo(str2));
    }

    private static int qdl(String str) {
        str.getClass();
        switch (str) {
            case "banner_ad":
                return 1;
            case "rewarded_video":
                return 7;
            case "open_ad":
                return 3;
            case "fullscreen_interstitial_ad":
                return 8;
            case "interaction":
                return 2;
            default:
                return 5;
        }
    }
}
