package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class oth {
    private String qdl = "horizontal";

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f17393ud = 1;
    private int lnr = 1;
    private int mml = 0;
    private int mzz = 0;
    private int mo = 0;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private int f17394wd = 0;
    private int jpc = 5000;
    private int tvp = 500;
    private int to = 0;

    public int jpc() {
        return this.jpc;
    }

    public int lnr() {
        return this.lnr;
    }

    public int mml() {
        return this.mml;
    }

    public int mo() {
        return this.mo;
    }

    public int mzz() {
        return this.mzz;
    }

    public String qdl() {
        return this.qdl;
    }

    public JSONObject rq() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("direction", this.qdl);
            jSONObject.put("auto_loop", this.f17393ud);
            jSONObject.put("allow_manual_loop", this.lnr);
            jSONObject.put("unlimited_loop", this.mml);
            jSONObject.put("left_margin", this.mzz);
            jSONObject.put("right_margin", this.mo);
            jSONObject.put("ad_margin", this.f17394wd);
            jSONObject.put("loop_interval_time", this.jpc);
            jSONObject.put("flip_speed", this.tvp);
            jSONObject.put("stop_auto_loop", this.to);
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public int to() {
        return this.to;
    }

    public int tvp() {
        return this.tvp;
    }

    public int ud() {
        return this.f17393ud;
    }

    public int wd() {
        return this.f17394wd;
    }

    public static oth qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return new oth();
        }
        oth othVar = new oth();
        othVar.qdl = jSONObject.optString("direction", "horizontal");
        othVar.f17393ud = jSONObject.optInt("auto_loop", 1);
        othVar.lnr = jSONObject.optInt("allow_manual_loop", 1);
        othVar.mml = jSONObject.optInt("unlimited_loop", 0);
        othVar.mzz = jSONObject.optInt("left_margin", 0);
        othVar.mo = jSONObject.optInt("right_margin", 0);
        othVar.f17394wd = jSONObject.optInt("ad_margin", 0);
        othVar.jpc = jSONObject.optInt("loop_interval_time", 5000);
        othVar.tvp = jSONObject.optInt("flip_speed", 500);
        othVar.to = jSONObject.optInt("stop_auto_loop", 0);
        return othVar;
    }
}
