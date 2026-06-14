package com.bytedance.sdk.openadsdk.mml.mzz.ud;

import com.bytedance.sdk.component.utils.aaj;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ud implements lnr {
    private int lnr;
    private int mml;
    private long qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private long f17724ud;

    public void qdl(long j10) {
        this.qdl = j10;
    }

    public void ud(long j10) {
        this.f17724ud = j10;
    }

    public void qdl(int i10) {
        this.lnr = i10;
    }

    public void ud(int i10) {
        this.mml = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mzz.ud.lnr
    public void qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.qdl);
            jSONObject.put("total_duration", this.f17724ud);
            jSONObject.put("vbtt_skip_type", this.lnr);
            jSONObject.put("skip_reason", this.mml);
        } catch (Throwable th2) {
            aaj.lnr("EndcardSkipModel", th2.getMessage());
        }
    }
}
