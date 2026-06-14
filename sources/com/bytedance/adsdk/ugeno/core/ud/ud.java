package com.bytedance.adsdk.ugeno.core.ud;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.adsdk.ugeno.core.bjy;
import com.bytedance.adsdk.ugeno.core.exu;
import com.bytedance.adsdk.ugeno.core.to;
import com.bytedance.adsdk.ugeno.wd.tvp;
import com.pubmatic.sdk.common.ctaoverlay.POBCTAOverlayData;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ud implements tvp.qdl {
    private Context lnr;
    private exu mml;
    private Handler mo = new tvp(Looper.getMainLooper(), this);
    private com.bytedance.adsdk.ugeno.ud.lnr mzz;
    private int qdl;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private bjy f16167ud;

    public ud(Context context, exu exuVar, com.bytedance.adsdk.ugeno.ud.lnr lnrVar) {
        this.lnr = context;
        this.mml = exuVar;
        this.mzz = lnrVar;
    }

    public void qdl(bjy bjyVar) {
        this.f16167ud = bjyVar;
    }

    public void qdl() {
        exu exuVar = this.mml;
        if (exuVar == null) {
            return;
        }
        try {
            int i10 = Integer.parseInt(com.bytedance.adsdk.ugeno.lnr.ud.qdl(exuVar.lnr().optString(POBCTAOverlayData.KEY_CTA_DELAY), this.mzz.fs()));
            this.qdl = i10;
            this.mo.sendEmptyMessageDelayed(1001, i10);
        } catch (NumberFormatException unused) {
        }
    }

    @Override // com.bytedance.adsdk.ugeno.wd.tvp.qdl
    public void qdl(Message message) {
        if (message.what != 1001) {
            return;
        }
        JSONObject jSONObjectLnr = this.mml.lnr();
        if (TextUtils.equals(jSONObjectLnr.optString("type"), "onAnimation")) {
            String strOptString = jSONObjectLnr.optString("nodeId");
            com.bytedance.adsdk.ugeno.ud.lnr lnrVar = this.mzz;
            com.bytedance.adsdk.ugeno.ud.lnr lnrVarMzz = lnrVar.ud(lnrVar).mzz(strOptString);
            new to(lnrVarMzz.rq(), com.bytedance.adsdk.ugeno.core.qdl.qdl(jSONObjectLnr.optJSONObject("animatorSet"), lnrVarMzz)).qdl();
        } else {
            bjy bjyVar = this.f16167ud;
            if (bjyVar != null) {
                exu exuVar = this.mml;
                com.bytedance.adsdk.ugeno.ud.lnr lnrVar2 = this.mzz;
                bjyVar.qdl(exuVar, lnrVar2, lnrVar2);
            }
        }
        this.mo.removeMessages(1001);
    }
}
