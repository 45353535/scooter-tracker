package com.bytedance.sdk.openadsdk.core.rq.ud.mml;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.adsdk.ugeno.core.fs;
import com.bytedance.adsdk.ugeno.mml;
import com.bytedance.adsdk.ugeno.ud.lnr;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ud extends com.bytedance.adsdk.ugeno.ud.qdl<qdl> {
    private int dps;
    private JSONArray iw;
    private int lme;

    public ud(Context context) {
        super(context);
        this.dps = 0;
        this.lme = 0;
    }

    private void lnr() {
        List<lnr<View>> list = ((com.bytedance.adsdk.ugeno.ud.qdl) this).qdl;
        if (list == null || list.isEmpty()) {
            return;
        }
        lnr<View> lnrVar = ((com.bytedance.adsdk.ugeno.ud.qdl) this).qdl.get(0);
        if (this.iw == null) {
            return;
        }
        for (int i10 = 0; i10 < this.iw.length(); i10++) {
            fs fsVar = new fs(this.f16262ud);
            fsVar.qdl(this.zvv);
            try {
                JSONObject jSONObjectOptJSONObject = this.iw.optJSONObject(i10);
                if (jSONObjectOptJSONObject != null) {
                    if (jSONObjectOptJSONObject.has("$chunk")) {
                        this.mml.put("$item", jSONObjectOptJSONObject.optJSONArray("$chunk"));
                    } else {
                        this.mml.put("$item", jSONObjectOptJSONObject);
                    }
                    ((qdl) this.mzz).qdl(fsVar.qdl(lnrVar.rc(), this.mml, (JSONObject) null));
                }
            } catch (Throwable unused) {
            }
        }
    }

    private void mml() {
        for (int i10 = 0; i10 < ((com.bytedance.adsdk.ugeno.ud.qdl) this).qdl.size(); i10++) {
            lnr<View> lnrVar = ((com.bytedance.adsdk.ugeno.ud.qdl) this).qdl.get(i10);
            if (lnrVar != null) {
                fs fsVar = new fs(this.f16262ud);
                fsVar.qdl(this.zvv);
                ((qdl) this.mzz).qdl(fsVar.qdl(lnrVar.rc(), this.mml, (JSONObject) null));
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [T extends android.view.View, android.view.View] */
    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public View qdl() {
        try {
            qdl qdlVar = new qdl(this.f16262ud);
            this.mzz = qdlVar;
            qdlVar.qdl((mml) this);
        } catch (Throwable unused) {
            this.mzz = new View(this.f16262ud);
        }
        return this.mzz;
    }

    @Override // com.bytedance.adsdk.ugeno.ud.qdl, com.bytedance.adsdk.ugeno.ud.lnr
    public void ud() {
        super.ud();
        T t10 = this.mzz;
        if (t10 instanceof qdl) {
            ((qdl) t10).setOrientation(this.dps);
            ((qdl) this.mzz).qdl(this);
            if (this.lme == 1) {
                mml();
            } else {
                lnr();
            }
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ud.lnr
    public void qdl(String str, String str2) {
        super.qdl(str, str2);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        str.getClass();
        switch (str) {
            case "driveMode":
                this.lme = com.bytedance.adsdk.ugeno.wd.lnr.qdl(str2, 0);
                break;
            case "direction":
                if (TextUtils.equals(str2, "vertical")) {
                    this.dps = 1;
                    break;
                } else {
                    this.dps = 0;
                    break;
                }
                break;
            case "dataList":
                this.iw = com.bytedance.adsdk.ugeno.wd.ud.qdl(str2, (JSONArray) null);
                break;
        }
    }

    @Override // com.bytedance.adsdk.ugeno.ud.qdl
    public void qdl(lnr lnrVar) {
        if (lnrVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.ud.qdl) this).qdl.add(lnrVar);
    }

    @Override // com.bytedance.adsdk.ugeno.ud.qdl
    public void qdl(lnr lnrVar, ViewGroup.LayoutParams layoutParams) {
        if (lnrVar == null) {
            return;
        }
        ((com.bytedance.adsdk.ugeno.ud.qdl) this).qdl.add(lnrVar);
    }
}
