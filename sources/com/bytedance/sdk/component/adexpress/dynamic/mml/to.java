package com.bytedance.sdk.component.adexpress.dynamic.mml;

import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class to {
    private JSONObject jpc;
    private int lnr;
    private int mml;
    private JSONObject mo;
    private int mzz;
    private int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f16383ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private JSONObject f16384wd;

    public JSONObject jpc() {
        return this.jpc;
    }

    public int lnr() {
        return this.lnr;
    }

    public int mml() {
        return this.mml;
    }

    public JSONObject mo() {
        return this.mo;
    }

    public int mzz() {
        return this.mzz;
    }

    public int qdl() {
        return this.qdl;
    }

    public int ud() {
        return this.f16383ud;
    }

    public JSONObject wd() {
        return this.f16384wd;
    }

    public void lnr(int i10) {
        this.lnr = i10;
    }

    public void mml(int i10) {
        this.mml = i10;
    }

    public void mzz(int i10) {
        this.mzz = i10;
    }

    public void qdl(int i10) {
        this.qdl = i10;
    }

    public void ud(int i10) {
        this.f16383ud = i10;
    }

    public void lnr(JSONObject jSONObject) {
        this.jpc = jSONObject;
    }

    public void qdl(JSONObject jSONObject) {
        this.mo = jSONObject;
    }

    public void ud(JSONObject jSONObject) {
        this.f16384wd = jSONObject;
    }
}
