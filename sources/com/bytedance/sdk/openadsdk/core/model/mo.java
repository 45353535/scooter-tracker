package com.bytedance.sdk.openadsdk.core.model;

import com.google.firebase.analytics.FirebaseAnalytics;
import com.mbridge.msdk.foundation.download.database.DownloadModel;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class mo {

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private int f17390wd;
    private String qdl = "";

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private String f17389ud = "";
    private String lnr = "";
    private String mml = "";
    private double mzz = -1.0d;
    private int mo = -1;

    public JSONObject jpc() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("app_name", ud());
            jSONObject.put(CampaignEx.JSON_KEY_APP_SIZE, mo());
            jSONObject.put("comment_num", mzz());
            jSONObject.put(DownloadModel.DOWNLOAD_URL, qdl());
            jSONObject.put("package_name", lnr());
            jSONObject.put(FirebaseAnalytics.Param.SCORE, mml());
            jSONObject.put("app_category", wd());
            return jSONObject;
        } catch (Exception e10) {
            com.bytedance.sdk.component.utils.aaj.lnr(e10.toString(), new Object[0]);
            return jSONObject;
        }
    }

    public String lnr() {
        return this.lnr;
    }

    public double mml() {
        return this.mzz;
    }

    public int mo() {
        return this.f17390wd;
    }

    public int mzz() {
        return this.mo;
    }

    public String qdl() {
        return this.qdl;
    }

    public String ud() {
        return this.f17389ud;
    }

    public String wd() {
        return this.mml;
    }

    public void lnr(String str) {
        this.lnr = str;
    }

    public void mml(String str) {
        this.mml = str;
    }

    public void qdl(String str) {
        this.qdl = str;
    }

    public void ud(String str) {
        this.f17389ud = str;
    }

    public void qdl(double d10) {
        if (d10 >= 1.0d && d10 <= 5.0d) {
            this.mzz = d10;
        } else {
            this.mzz = -1.0d;
        }
    }

    public void ud(int i10) {
        this.f17390wd = i10;
    }

    public void qdl(int i10) {
        if (i10 <= 0) {
            this.mo = -1;
        } else {
            this.mo = i10;
        }
    }
}
