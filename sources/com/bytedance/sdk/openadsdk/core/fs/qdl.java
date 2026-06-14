package com.bytedance.sdk.openadsdk.core.fs;

import android.text.TextUtils;
import com.bytedance.sdk.openadsdk.core.model.ljh;
import java.util.HashSet;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    private String fs;
    private double jpc;
    lnr lnr;
    private String mml;
    private String mo;
    private String mzz;
    final com.bytedance.sdk.openadsdk.core.model.mml qdl = new com.bytedance.sdk.openadsdk.core.model.mml();
    private String rq = "VAST_ACTION_BUTTON";
    private int to;
    private int tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    ud f17231ud;

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private String f17232wd;

    private JSONArray bjy() {
        Set<to> setUd = this.qdl.ud();
        if (setUd == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        for (to toVar : setUd) {
            if (toVar != null) {
                jSONArray.put(toVar.mml());
            }
        }
        return jSONArray;
    }

    public Set<to> exu() {
        return this.qdl.ud();
    }

    public int fs() {
        return this.to;
    }

    public double jpc() {
        return this.jpc;
    }

    public lnr lnr() {
        return this.lnr;
    }

    public String mml() {
        return this.mml;
    }

    public String mo() {
        return this.mo;
    }

    public String mzz() {
        return this.mzz;
    }

    public mml qdl() {
        return this.qdl.qdl();
    }

    public com.bytedance.sdk.openadsdk.core.model.mml rdp() {
        return this.qdl;
    }

    public int rq() {
        return this.tvp;
    }

    public JSONObject to() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        mml mmlVarQdl = this.qdl.qdl();
        if (mmlVarQdl != null) {
            jSONObject.put("videoTrackers", mmlVarQdl.qdl());
        }
        ud udVar = this.f17231ud;
        if (udVar != null) {
            jSONObject.put("vastIcon", udVar.qdl());
        }
        lnr lnrVar = this.lnr;
        if (lnrVar != null) {
            jSONObject.put("endCard", lnrVar.qdl());
        }
        jSONObject.put("title", this.mml);
        jSONObject.put("description", this.mzz);
        jSONObject.put("clickThroughUrl", this.mo);
        jSONObject.put("videoUrl", this.f17232wd);
        jSONObject.put("videDuration", this.jpc);
        jSONObject.put("videoWidth", this.tvp);
        jSONObject.put("videoHeight", this.to);
        jSONObject.put("viewabilityVendor", bjy());
        return jSONObject;
    }

    public String tvp() {
        lnr lnrVar;
        String str = this.mo;
        if (!TextUtils.isEmpty(this.fs)) {
            String str2 = this.fs;
            this.fs = null;
            return str2;
        }
        String str3 = this.rq;
        str3.getClass();
        if (str3.equals("VAST_ICON")) {
            ud udVar = this.f17231ud;
            if (udVar != null && !TextUtils.isEmpty(udVar.jpc)) {
                str = this.f17231ud.jpc;
            }
        } else if (str3.equals("VAST_END_CARD") && (lnrVar = this.lnr) != null && !TextUtils.isEmpty(lnrVar.jpc)) {
            str = this.lnr.jpc;
        }
        this.rq = "VAST_ACTION_BUTTON";
        return str;
    }

    public ud ud() {
        return this.f17231ud;
    }

    public String wd() {
        return this.f17232wd;
    }

    public void lnr(String str) {
        this.mo = str;
    }

    public void mml(String str) {
        this.f17232wd = str;
    }

    public void mo(String str) {
        this.fs = str;
    }

    public void mzz(String str) {
        this.rq = str;
    }

    public void qdl(ud udVar) {
        if (udVar != null) {
            udVar.qdl(this.f17232wd);
        }
        this.f17231ud = udVar;
    }

    public void ud(String str) {
        this.mzz = str;
    }

    public void ud(int i10) {
        this.to = i10;
    }

    public void qdl(lnr lnrVar) {
        if (lnrVar != null) {
            lnrVar.qdl(this.f17232wd);
        }
        this.lnr = lnrVar;
    }

    public void qdl(String str) {
        this.mml = str;
    }

    public void qdl(double d10) {
        this.jpc = d10;
    }

    public static qdl qdl(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        qdl qdlVar = new qdl();
        mml mmlVarQdl = qdlVar.qdl.qdl();
        if (mmlVarQdl == null) {
            mmlVarQdl = new mml();
            qdlVar.qdl.qdl(mmlVarQdl);
        }
        mmlVarQdl.qdl(jSONObject.optJSONObject("videoTrackers"));
        qdlVar.f17231ud = ud.qdl(jSONObject.optJSONObject("vastIcon"));
        qdlVar.lnr = lnr.ud(jSONObject.optJSONObject("endCard"));
        qdlVar.mml = jSONObject.optString("title");
        qdlVar.mzz = jSONObject.optString("description");
        qdlVar.mo = jSONObject.optString("clickThroughUrl");
        qdlVar.f17232wd = jSONObject.optString("videoUrl");
        qdlVar.jpc = jSONObject.optDouble("videDuration");
        qdlVar.tvp = jSONObject.optInt("videoWidth");
        qdlVar.tvp = jSONObject.optInt("videoHeight");
        Set<to> setUd = qdlVar.qdl.ud();
        if (setUd == null) {
            setUd = new HashSet<>();
            qdlVar.qdl.qdl(setUd);
        }
        setUd.addAll(to.qdl(jSONObject.optJSONArray("viewabilityVendor")));
        return qdlVar;
    }

    public void qdl(ljh ljhVar) {
        this.qdl.qdl(ljhVar);
        ud udVar = this.f17231ud;
        if (udVar != null) {
            udVar.qdl(ljhVar);
        }
        lnr lnrVar = this.lnr;
        if (lnrVar != null) {
            lnrVar.qdl(ljhVar);
        }
    }

    public void qdl(int i10) {
        this.tvp = i10;
    }

    public void qdl(Set<to> set) {
        this.qdl.ud(set);
    }
}
