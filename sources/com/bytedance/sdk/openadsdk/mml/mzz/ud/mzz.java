package com.bytedance.sdk.openadsdk.mml.mzz.ud;

import com.bytedance.sdk.component.utils.aaj;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mzz implements lnr {
    private long qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private long f17718ud;

    public void qdl(long j10) {
        this.qdl = j10;
    }

    public void ud(long j10) {
        this.f17718ud = j10;
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mzz.ud.lnr
    public void qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("buffers_time", this.qdl);
            jSONObject.put("total_duration", this.f17718ud);
        } catch (Throwable th2) {
            aaj.lnr("FeedContinueModel", th2.getMessage());
        }
    }
}
