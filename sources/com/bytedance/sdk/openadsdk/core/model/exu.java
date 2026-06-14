package com.bytedance.sdk.openadsdk.core.model;

import androidx.annotation.Nullable;
import com.amazon.aps.shared.metrics.model.ApsMetricsDataMap;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class exu {
    private int lnr;
    private String qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private String f17347ud;

    public int lnr() {
        return this.lnr;
    }

    @Nullable
    public JSONObject mml() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put(ApsMetricsDataMap.APSMETRICS_FIELD_URL, this.qdl);
            jSONObject.put("ft", this.lnr);
            jSONObject.put("fu", this.f17347ud);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    public String qdl() {
        return this.qdl;
    }

    public String ud() {
        return this.f17347ud;
    }

    public void qdl(String str) {
        this.qdl = str;
    }

    public void ud(String str) {
        this.f17347ud = str;
    }

    public void qdl(int i10) {
        this.lnr = i10;
    }
}
