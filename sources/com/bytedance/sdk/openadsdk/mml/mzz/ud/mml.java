package com.bytedance.sdk.openadsdk.mml.mzz.ud;

import com.bytedance.sdk.component.utils.aaj;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mml implements lnr {
    public int lnr;
    public int mml = 0;
    public long qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public long f17716ud;

    public void qdl(long j10) {
        this.qdl = j10;
    }

    public void ud(long j10) {
        this.f17716ud = j10;
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
            jSONObject.put("total_duration", this.qdl);
            jSONObject.put("buffers_time", this.f17716ud);
            jSONObject.put("break_reason", this.lnr);
            jSONObject.put("video_backup", this.mml);
        } catch (Throwable th2) {
            aaj.lnr("FeedBreakModel", th2.getMessage());
        }
    }
}
