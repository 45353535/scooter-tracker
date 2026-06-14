package com.bytedance.sdk.openadsdk.multipro.ud;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    public boolean lnr;
    public boolean mml;
    public long mo;
    public long mzz;
    public boolean qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public boolean f17774ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    public long f17775wd;

    /* JADX INFO: renamed from: com.bytedance.sdk.openadsdk.multipro.ud.qdl$qdl, reason: collision with other inner class name */
    public interface InterfaceC0295qdl {
        qdl mo();
    }

    public qdl lnr(boolean z10) {
        this.f17774ud = z10;
        return this;
    }

    public qdl mml(boolean z10) {
        this.lnr = z10;
        return this;
    }

    public qdl qdl(boolean z10) {
        this.mml = z10;
        return this;
    }

    public qdl ud(boolean z10) {
        this.qdl = z10;
        return this;
    }

    public qdl lnr(long j10) {
        this.f17775wd = j10;
        return this;
    }

    public qdl qdl(long j10) {
        this.mzz = j10;
        return this;
    }

    public qdl ud(long j10) {
        this.mo = j10;
        return this;
    }

    public JSONObject qdl() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("isCompleted", this.qdl);
            jSONObject.put("isFromVideoDetailPage", this.f17774ud);
            jSONObject.put("isFromDetailPage", this.lnr);
            jSONObject.put("duration", this.mzz);
            jSONObject.put("totalPlayDuration", this.mo);
            jSONObject.put("currentPlayPosition", this.f17775wd);
            jSONObject.put("isAutoPlay", this.mml);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static qdl qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        qdl qdlVar = new qdl();
        qdlVar.ud(jSONObject.optBoolean("isCompleted"));
        qdlVar.lnr(jSONObject.optBoolean("isFromVideoDetailPage"));
        qdlVar.mml(jSONObject.optBoolean("isFromDetailPage"));
        qdlVar.qdl(jSONObject.optLong("duration"));
        qdlVar.ud(jSONObject.optLong("totalPlayDuration"));
        qdlVar.lnr(jSONObject.optLong("currentPlayPosition"));
        qdlVar.qdl(jSONObject.optBoolean("isAutoPlay"));
        return qdlVar;
    }
}
