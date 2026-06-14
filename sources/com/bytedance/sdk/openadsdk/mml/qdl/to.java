package com.bytedance.sdk.openadsdk.mml.qdl;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class to implements com.bytedance.sdk.openadsdk.bjy.ud {
    private final com.bytedance.sdk.component.mo.qdl.mo.mml qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final boolean f17735ud;

    public to(boolean z10, com.bytedance.sdk.component.mo.qdl.mo.mml mmlVar) {
        this.qdl = mmlVar;
        this.f17735ud = z10;
    }

    @Override // com.bytedance.sdk.openadsdk.bjy.ud
    @Nullable
    public com.bytedance.sdk.openadsdk.bjy.qdl.lnr getLogStats() throws Exception {
        if (this.qdl == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("success", this.f17735ud);
        jSONObject.put("url", this.qdl.ud());
        int iMml = this.qdl.mml();
        if (iMml <= 0) {
            iMml = 0;
        }
        jSONObject.put("retry_times", iMml);
        jSONObject.put("ad_id", this.qdl.mo());
        jSONObject.put("track_type", this.qdl.mzz());
        jSONObject.put("upload_scene", this.f17735ud ? this.qdl.to() ? 3 : this.qdl.mml() <= 0 ? 1 : 2 : 4);
        String strWd = this.qdl.wd();
        if (!TextUtils.isEmpty(strWd)) {
            JSONArray jSONArray = new JSONArray();
            for (String str : strWd.split(StringUtils.COMMA)) {
                jSONArray.put(str);
            }
            jSONObject.put("error_code", jSONArray);
        }
        String strTvp = this.qdl.tvp();
        if (!TextUtils.isEmpty(strTvp)) {
            JSONArray jSONArray2 = new JSONArray();
            for (String str2 : strTvp.split(StringUtils.COMMA)) {
                jSONArray2.put(str2);
            }
            jSONObject.put("error_msg", jSONArray2);
        }
        return com.bytedance.sdk.openadsdk.bjy.qdl.mml.ud().qdl("track_link_result").ud(jSONObject.toString());
    }
}
