package com.bytedance.sdk.openadsdk.mml.mzz.ud;

import com.bytedance.sdk.component.utils.aaj;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mo implements lnr {
    private int lnr = 0;
    private long qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private long f17717ud;

    public void qdl(long j10) {
        this.qdl = j10;
    }

    public void ud(long j10) {
        this.f17717ud = j10;
    }

    public void qdl(int i10) {
        this.lnr = i10;
    }

    @Override // com.bytedance.sdk.openadsdk.mml.mzz.ud.lnr
    public void qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("total_duration", this.qdl);
            jSONObject.put("buffers_time", this.f17717ud);
            jSONObject.put("video_backup", this.lnr);
        } catch (Throwable th2) {
            aaj.lnr("FeedOverModel", th2.getMessage());
        }
    }
}
