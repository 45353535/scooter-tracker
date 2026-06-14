package com.bytedance.sdk.openadsdk.mml.mzz.ud;

import com.bytedance.sdk.component.utils.aaj;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class fs implements lnr {
    private long lnr;
    private long mml;
    private String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private long f17714ud;

    public void lnr(long j10) {
        this.mml = j10;
    }

    public void qdl(String str) {
        this.qdl = str;
    }

    public void ud(long j10) {
        this.lnr = j10;
    }

    public void qdl(long j10) {
        this.f17714ud = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mzz.ud.lnr
    public void qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.qdl);
            jSONObject.put("preload_size", this.f17714ud);
            jSONObject.put("load_time", this.lnr);
            jSONObject.put("local_cache", this.mml);
        } catch (Throwable th2) {
            aaj.lnr("LoadVideoSuccessModel", th2.getMessage());
        }
    }
}
