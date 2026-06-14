package com.bytedance.sdk.component.jpc.ud;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    public int lnr;
    public int mml;
    public int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public int f16509ud;

    public qdl(int i10, int i11, int i12, int i13) {
        this.qdl = i10;
        this.f16509ud = i11;
        this.lnr = i12;
        this.mml = i13;
    }

    public JSONObject qdl() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sdk_thread_num", this.qdl);
            jSONObject.put("sdk_max_thread_num", this.f16509ud);
            jSONObject.put("app_thread_num", this.lnr);
            jSONObject.put("app_max_thread_num", this.mml);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }
}
