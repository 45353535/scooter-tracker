package com.bytedance.sdk.openadsdk.mml.mzz.ud;

import com.bytedance.sdk.openadsdk.core.model.ljh;
import com.bytedance.sdk.openadsdk.mml.mzz.ud.lnr;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class qdl<T extends lnr> {
    private JSONObject lnr;
    private T mml;
    private boolean mzz = false;
    private ljh qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private String f17719ud;

    public qdl(ljh ljhVar, String str, JSONObject jSONObject, T t10) {
        this.qdl = ljhVar;
        this.f17719ud = str;
        this.lnr = jSONObject;
        this.mml = t10;
    }

    public JSONObject lnr() {
        if (this.lnr == null) {
            this.lnr = new JSONObject();
        }
        return this.lnr;
    }

    public T mml() {
        return this.mml;
    }

    public boolean mzz() {
        return this.mzz;
    }

    public ljh qdl() {
        return this.qdl;
    }

    public String ud() {
        return this.f17719ud;
    }

    public void qdl(boolean z10) {
        this.mzz = z10;
    }
}
