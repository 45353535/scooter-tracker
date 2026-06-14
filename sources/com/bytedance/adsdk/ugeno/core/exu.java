package com.bytedance.adsdk.ugeno.core;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class exu {
    private JSONObject lnr;
    private exu mml;
    private exu mzz;
    private com.bytedance.adsdk.ugeno.ud.lnr qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f16149ud;

    public JSONObject lnr() {
        return this.lnr;
    }

    public exu mml() {
        return this.mml;
    }

    public com.bytedance.adsdk.ugeno.ud.lnr qdl() {
        return this.qdl;
    }

    public String toString() {
        return "UGenEvent{mWidget=" + this.qdl + ", mEventType=" + this.f16149ud + ", mEvent=" + this.lnr + '}';
    }

    public int ud() {
        return this.f16149ud;
    }

    public void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
        this.qdl = lnrVar;
    }

    public void ud(exu exuVar) {
        this.mzz = exuVar;
    }

    public void qdl(int i10) {
        this.f16149ud = i10;
    }

    public void qdl(JSONObject jSONObject) {
        this.lnr = jSONObject;
    }

    public void qdl(exu exuVar) {
        this.mml = exuVar;
    }
}
