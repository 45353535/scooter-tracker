package com.bytedance.sdk.openadsdk.mml.mzz.ud;

import com.bytedance.sdk.component.utils.aaj;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class rq implements lnr {
    private final String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private final long f17721ud;

    public rq(String str, long j10) {
        this.qdl = str;
        this.f17721ud = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mzz.ud.lnr
    public void qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.qdl);
            jSONObject.put("preload_size", this.f17721ud);
        } catch (Throwable th2) {
            aaj.lnr("LoadVideoStartModel", th2.getMessage());
        }
    }
}
