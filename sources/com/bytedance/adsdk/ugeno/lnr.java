package com.bytedance.adsdk.ugeno;

import android.content.Context;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.View;
import com.adjust.sdk.Constants;
import com.bytedance.adsdk.ugeno.core.fs;
import com.bytedance.adsdk.ugeno.wd.jpc;
import com.google.common.base.Ascii;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
@Deprecated
public class lnr extends com.bytedance.adsdk.ugeno.ud.qdl<com.bytedance.adsdk.ugeno.mo.ud> {

    /* JADX INFO: renamed from: ca, reason: collision with root package name */
    private int f16184ca;
    private String dps;
    private float fge;
    private int gsp;

    /* JADX INFO: renamed from: hd, reason: collision with root package name */
    private com.bytedance.adsdk.ugeno.ud.lnr f16185hd;
    private JSONArray hr;
    private boolean iw;
    private float kr;
    private boolean lme;

    /* JADX INFO: renamed from: se, reason: collision with root package name */
    private float f16186se;
    private String syy;
    private boolean tdy;

    /* JADX INFO: renamed from: vc, reason: collision with root package name */
    private float f16187vc;
    private float xx;
    private float ygv;

    public lnr(Context context) {
        super(context);
        this.iw = true;
        this.lme = true;
        this.kr = 0.0f;
        this.xx = 2000.0f;
        this.syy = Constants.NORMAL;
        this.tdy = true;
        this.f16184ca = Color.parseColor("#666666");
        this.gsp = Color.parseColor("#ffffff");
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public void qdl(JSONObject jSONObject) {
    }

    @Override // com.bytedance.adsdk.ugeno.ud.qdl, com.bytedance.adsdk.ugeno.ud.lnr
    public void ud() {
        super.ud();
        JSONArray jSONArray = this.hr;
        if (jSONArray == null || jSONArray.length() <= 0) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).wd((int) this.f16186se).jpc((int) this.f16187vc).tvp((int) this.fge).lnr(this.tdy).mzz(this.gsp).mo(this.f16184ca).lnr(this.syy).mml(this.iw).mzz(this.ygv).qdl(this.lme).mml((int) this.xx).lnr(this.tdy);
        for (int i10 = 0; i10 < this.hr.length(); i10++) {
            fs fsVar = new fs(this.f16262ud);
            fsVar.qdl(this.zvv);
            com.bytedance.adsdk.ugeno.ud.lnr<View> lnrVarUd = fsVar.ud(this.f16185hd.rc(), (com.bytedance.adsdk.ugeno.ud.lnr<View>) null);
            fsVar.ud(this.hr.optJSONObject(i10));
            ((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).qdl(lnrVarUd);
        }
        if (this.lme) {
            ((com.bytedance.adsdk.ugeno.mo.ud) this.mzz).lnr();
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public View qdl() {
        com.bytedance.adsdk.ugeno.mo.ud udVar = new com.bytedance.adsdk.ugeno.mo.ud(this.f16262ud);
        this.mzz = udVar;
        udVar.qdl((mml) this);
        return this.mzz;
    }

    public void qdl(com.bytedance.adsdk.ugeno.mo.lnr lnrVar) {
        T t10 = this.mzz;
        if (t10 != 0) {
            ((com.bytedance.adsdk.ugeno.mo.ud) t10).setOnPageChangeListener(lnrVar);
        }
    }

    public void qdl(int i10) {
        T t10 = this.mzz;
        if (t10 != 0) {
            ((com.bytedance.adsdk.ugeno.mo.ud) t10).exu(i10);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ud.qdl
    public void qdl(com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
        this.f16185hd = lnrVar;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public void qdl(String str, String str2) {
        super.qdl(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1657957217:
                if (str.equals("delayStart")) {
                    b10 = 0;
                }
                break;
            case -1575751020:
                if (str.equals("indicatorColor")) {
                    b10 = 1;
                }
                break;
            case -1453344127:
                if (str.equals("nextMargin")) {
                    b10 = 2;
                }
                break;
            case -1306084975:
                if (str.equals("effect")) {
                    b10 = 3;
                }
                break;
            case -962590849:
                if (str.equals("direction")) {
                    b10 = 4;
                }
                break;
            case -711999985:
                if (str.equals("indicator")) {
                    b10 = 5;
                }
                break;
            case -202057851:
                if (str.equals("previousMargin")) {
                    b10 = 6;
                }
                break;
            case 3327652:
                if (str.equals("loop")) {
                    b10 = 7;
                }
                break;
            case 109641799:
                if (str.equals("speed")) {
                    b10 = 8;
                }
                break;
            case 857882560:
                if (str.equals("pageCount")) {
                    b10 = 9;
                }
                break;
            case 1097821469:
                if (str.equals("pageMargin")) {
                    b10 = 10;
                }
                break;
            case 1196931001:
                if (str.equals("indicatorSelectedColor")) {
                    b10 = Ascii.VT;
                }
                break;
            case 1439562083:
                if (str.equals("autoplay")) {
                    b10 = Ascii.FF;
                }
                break;
            case 1788817256:
                if (str.equals("dataList")) {
                    b10 = 13;
                }
                break;
        }
        switch (b10) {
            case 0:
                this.kr = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f);
                break;
            case 1:
                this.f16184ca = com.bytedance.adsdk.ugeno.wd.qdl.qdl(str2);
                break;
            case 2:
                this.fge = jpc.qdl(this.f16262ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f));
                break;
            case 3:
                this.syy = str2;
                break;
            case 4:
                this.dps = str2;
                break;
            case 5:
                this.tdy = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, true);
                break;
            case 6:
                this.f16187vc = jpc.qdl(this.f16262ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f));
                break;
            case 7:
                this.iw = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, true);
                break;
            case 8:
                this.xx = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 500.0f);
                break;
            case 9:
                this.ygv = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 1.0f);
                break;
            case 10:
                this.f16186se = jpc.qdl(this.f16262ud, com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0.0f));
                break;
            case 11:
                this.gsp = com.bytedance.adsdk.ugeno.wd.qdl.qdl(str2);
                break;
            case 12:
                this.lme = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, true);
                break;
            case 13:
                this.hr = com.bytedance.adsdk.ugeno.wd.ud.qdl(str2, (JSONArray) null);
                break;
        }
    }
}
