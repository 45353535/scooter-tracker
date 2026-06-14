package com.bytedance.sdk.openadsdk.component.mml;

import android.os.Build;
import com.bytedance.sdk.component.utils.aaj;
import com.bytedance.sdk.openadsdk.bjy.lnr;
import com.bytedance.sdk.openadsdk.bjy.qdl.mml;
import com.bytedance.sdk.openadsdk.bjy.ud;
import com.bytedance.sdk.openadsdk.core.model.kdv;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.utils.mrf;
import com.ironsource.C4424m2;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    public static void qdl(final int i10, final int i11) {
        lnr.qdl("openad_load_ad_timeout", false, new ud() { // from class: com.bytedance.sdk.openadsdk.component.mml.qdl.1
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("timeout_type", i10);
                jSONObject.put("user_timeout_time", i11);
                return mml.ud().qdl("openad_load_ad_timeout").ud(jSONObject.toString());
            }
        });
    }

    public static void ud(ljh ljhVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("openad_creative_type", ljh.mzz(ljhVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException e10) {
            aaj.qdl("TTAppOpenAdReport", "reportCacheLoss json error", e10);
        }
        com.bytedance.sdk.openadsdk.mml.lnr.lnr(ljhVar, "cache_loss", jSONObject);
    }

    public static void qdl(ljh ljhVar, int i10, int i11, float f10) {
        JSONObject jSONObject = new JSONObject();
        try {
            qdl(jSONObject, ljhVar);
            jSONObject.put("openad_creative_type", ljh.mzz(ljhVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("total_time", f10);
            com.bytedance.sdk.openadsdk.mml.lnr.qdl(jSONObject, i11, i10);
        } catch (JSONException e10) {
            aaj.qdl("TTAppOpenAdReport", "reportSkip json error", e10);
        }
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, "skip", i10, jSONObject);
    }

    public static void ud(ljh ljhVar, long j10, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("size", ljhVar.tdy().mzz());
            jSONObject.put("video_duration", ljhVar.tdy().mo());
            jSONObject.put(C4424m2.f43622u, z10 ? 1 : 2);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, "download_video_duration", j10, jSONObject);
    }

    public static void qdl(ljh ljhVar, long j10, float f10, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            qdl(jSONObject, ljhVar);
            jSONObject.put("openad_creative_type", ljh.mzz(ljhVar) ? "video_normal_ad" : "image_normal_ad");
            if (z10) {
                double d10 = f10;
                jSONObject.put("video_duration", d10);
                jSONObject.put("video_percent", (int) (((j10 * 1.0d) / 10.0d) / d10));
            } else {
                jSONObject.put("image_duration", f10);
            }
        } catch (JSONException e10) {
            aaj.qdl("TTAppOpenAdReport", "reportDestroy json error", e10);
        }
        com.bytedance.sdk.openadsdk.mml.lnr.lnr(ljhVar, "destroy", jSONObject);
    }

    public static void qdl(ljh ljhVar) {
        com.bytedance.sdk.openadsdk.mml.lnr.lnr(ljhVar, "cache_expire", (JSONObject) null);
    }

    public static void qdl(ljh ljhVar, long j10, boolean z10) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C4424m2.f43622u, z10 ? 1 : 2);
        } catch (JSONException unused) {
        }
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, "download_image_duration", j10, jSONObject);
    }

    public static void qdl(ljh ljhVar, int i10, kdv kdvVar) {
        JSONObject jSONObject = new JSONObject();
        long jMo = 0;
        try {
            jSONObject.put("openad_creative_type", ljh.mzz(ljhVar) ? "video_normal_ad" : "image_normal_ad");
            jSONObject.put("open_ad_cache_type", i10);
            if (kdvVar != null) {
                kdvVar.ud(mrf.ud());
                qdl(jSONObject, ljhVar);
                jSONObject.put("client_start_time", kdvVar.ud());
                jSONObject.put("sever_time", kdvVar.mml());
                jSONObject.put("network_time", kdvVar.lnr());
                jSONObject.put("client_end_time", kdvVar.mzz());
                jSONObject.put("download_resource_duration", kdvVar.wd());
                jSONObject.put("resource_source", kdvVar.jpc());
                jSONObject.put("is_bidding", kdvVar.qdl ? 1 : 0);
                if (kdvVar.qdl) {
                    jSONObject.put("load_wait_time", kdvVar.f17361ud);
                }
                jMo = kdvVar.mo();
            }
        } catch (JSONException e10) {
            aaj.qdl("TTAppOpenAdReport", "reportLoadNetDuration json error", e10);
        }
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, "load_net_duration", jMo, jSONObject);
    }

    public static void qdl(ljh ljhVar, long j10) {
        JSONObject jSONObject = new JSONObject();
        try {
            qdl(jSONObject, ljhVar);
            jSONObject.put("openad_creative_type", ljh.mzz(ljhVar) ? "video_normal_ad" : "image_normal_ad");
        } catch (JSONException unused) {
            aaj.lnr("TTAppOpenAdReport", "reportLoadCacheDuration json error");
        }
        com.bytedance.sdk.openadsdk.mml.lnr.qdl(ljhVar, "load_cache_duration", j10, jSONObject);
    }

    public static void qdl(final kdv kdvVar, final int i10, final int i11) {
        if (kdvVar == null || Build.VERSION.SDK_INT < 24) {
            return;
        }
        lnr.qdl("app_running_time", false, new ud() { // from class: com.bytedance.sdk.openadsdk.component.mml.qdl.2
            @Override // com.bytedance.sdk.openadsdk.bjy.ud
            public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("app_running_time", kdvVar.tvp());
                jSONObject.put("loaded_app_running_time", com.bytedance.sdk.openadsdk.component.wd.qdl.ud());
                jSONObject.put("load_time", kdvVar.qdl().mml());
                jSONObject.put("load_index", kdvVar.to());
                jSONObject.put("load_from", i10);
                jSONObject.put("load_result", i11);
                return mml.ud().qdl("app_running_time").ud(jSONObject.toString());
            }
        });
    }

    public static void qdl(JSONObject jSONObject, int i10) {
        if (jSONObject == null || i10 != 3 || Build.VERSION.SDK_INT < 24) {
            return;
        }
        try {
            jSONObject.put("app_running_time", com.bytedance.sdk.openadsdk.component.wd.qdl.ud());
        } catch (JSONException e10) {
            aaj.lnr("TTAppOpenAdReport", e10.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void qdl(org.json.JSONObject r1, com.bytedance.sdk.openadsdk.core.model.ljh r2) {
        /*
            java.lang.String r0 = "is_icon_only"
            if (r2 == 0) goto Lc
            boolean r2 = r2.xmv()     // Catch: org.json.JSONException -> L11
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            r1.put(r0, r2)     // Catch: org.json.JSONException -> L11
            return
        L11:
            r1 = move-exception
            java.lang.String r2 = "TTAppOpenAdReport"
            java.lang.String r1 = r1.getMessage()
            com.bytedance.sdk.component.utils.aaj.lnr(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.mml.qdl.qdl(org.json.JSONObject, com.bytedance.sdk.openadsdk.core.model.ljh):void");
    }
}
