package com.bytedance.sdk.openadsdk.mml.mzz.ud;

import com.bytedance.sdk.component.utils.aaj;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class exu implements lnr {
    public long lnr;
    public long qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public int f17713ud;

    public void qdl(long j10) {
        this.qdl = j10;
    }

    public void ud(long j10) {
        this.lnr = j10;
    }

    public void qdl(int i10) {
        this.f17713ud = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mzz.ud.lnr
    public void qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.qdl);
            jSONObject.put("buffers_count", this.f17713ud);
            jSONObject.put("total_duration", this.lnr);
        } catch (Throwable th2) {
            aaj.lnr("PlayBufferModel", th2.getMessage());
        }
    }
}
