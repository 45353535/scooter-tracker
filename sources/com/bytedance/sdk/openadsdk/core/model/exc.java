package com.bytedance.sdk.openadsdk.core.model;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class exc {
    public static int qdl = 1;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    public static int f17345ud = 2;
    private int lnr = 5;
    private int mml = 30;
    private int mzz = 70;
    private int mo = 1;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private int f17346wd = qdl;
    private int jpc = 0;
    private int tvp = 0;
    private int to = 3;

    public int jpc() {
        return this.f17346wd;
    }

    public int lnr() {
        return this.jpc;
    }

    public int mml() {
        return this.lnr;
    }

    public int mo() {
        return this.mzz;
    }

    public int mzz() {
        return this.mml;
    }

    public int qdl() {
        return this.to;
    }

    public int ud() {
        return this.tvp;
    }

    public int wd() {
        return this.mo;
    }

    public void jpc(int i10) {
        this.f17346wd = i10;
    }

    public void lnr(int i10) {
        this.jpc = i10;
    }

    public void mml(int i10) {
        this.lnr = i10;
    }

    public void mo(int i10) {
        this.mzz = i10;
    }

    public void mzz(int i10) {
        this.mml = i10;
    }

    public void qdl(int i10) {
        this.to = i10;
    }

    public void ud(int i10) {
        this.tvp = i10;
    }

    public void wd(int i10) {
        this.mo = i10;
    }

    public boolean qdl(boolean z10) {
        if (z10) {
            int i10 = this.jpc;
            return i10 == 1 || i10 == 3;
        }
        int i11 = this.jpc;
        return i11 == 3 || i11 == 2;
    }

    public JSONObject qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            jSONObject = new JSONObject();
        }
        try {
            jSONObject.put("ceiling_time", this.lnr);
            jSONObject.put("ceiling_ratio", this.mml);
            jSONObject.put("expand_ratio", this.mzz);
            jSONObject.put("back_type", this.mo);
            jSONObject.put("boc_return_type", this.f17346wd);
            jSONObject.put("pre_render_status", this.jpc);
            jSONObject.put("pre_render_use_gecko", this.tvp);
            jSONObject.put("pre_render_add_type", this.to);
            return jSONObject;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.aaj.lnr("InteractionParams", th2.getMessage());
            return jSONObject;
        }
    }
}
