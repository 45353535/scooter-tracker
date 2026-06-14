package com.bytedance.sdk.openadsdk.mml.mzz.ud;

import com.bytedance.sdk.component.utils.aaj;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class jpc implements lnr {
    private int lnr;
    private long qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private long f17715ud;

    public void qdl(long j10) {
        this.qdl = j10;
    }

    public void ud(long j10) {
        this.f17715ud = j10;
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
            jSONObject.put("video_start_duration", this.qdl);
            jSONObject.put("video_cache_size", this.f17715ud);
            jSONObject.put("is_auto_play", this.lnr);
        } catch (Throwable th2) {
            aaj.lnr("FeedPlayModel", th2.getMessage());
        }
    }
}
