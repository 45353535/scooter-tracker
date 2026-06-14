package com.bytedance.sdk.openadsdk.mml.mzz.ud;

import com.bytedance.sdk.component.utils.aaj;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class to implements lnr {
    private long lnr;
    private int mml;
    private String mo;
    private String mzz;
    private String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private long f17722ud;

    public void lnr(String str) {
        this.mo = str;
    }

    public void qdl(String str) {
        this.qdl = str;
    }

    public void ud(long j10) {
        this.lnr = j10;
    }

    public void qdl(long j10) {
        this.f17722ud = j10;
    }

    public void ud(String str) {
        this.mzz = str;
    }

    public void qdl(int i10) {
        this.mml = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mzz.ud.lnr
    public void qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("preload_url", this.qdl);
            jSONObject.put("preload_size", this.f17722ud);
            jSONObject.put("load_time", this.lnr);
            jSONObject.put("error_code", this.mml);
            jSONObject.put("error_message", this.mzz);
            jSONObject.put("error_message_server", this.mo);
        } catch (Throwable th2) {
            aaj.lnr("LoadVideoErrorModel", th2.getMessage());
        }
    }
}
