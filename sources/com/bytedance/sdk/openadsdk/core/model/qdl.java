package com.bytedance.sdk.openadsdk.core.model;

import android.text.TextUtils;
import androidx.annotation.Nullable;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class qdl {
    private ljh fs;
    private String lnr;
    private uw mo;
    private ljh mzz;
    private String qdl;
    private String rq;
    private oth to;
    private int tvp;

    /* JADX INFO: renamed from: ud, reason: collision with root package name */
    private int f17395ud;
    private List<ljh> mml = new ArrayList();

    /* JADX INFO: renamed from: wd, reason: collision with root package name */
    private JSONObject f17396wd = new JSONObject();
    private volatile boolean jpc = false;

    public ljh bjy() {
        return this.mzz;
    }

    @Nullable
    public JSONObject exu() {
        try {
            JSONObject jSONObject = new JSONObject();
            oth othVarWd = wd();
            if (othVarWd != null) {
                jSONObject.put("loop_config", othVarWd.rq());
            }
            uw uwVarFs = fs();
            if (uwVarFs != null) {
                jSONObject.put("multi_ad_config", uwVarFs.jl());
            }
            List<ljh> list = this.mml;
            if (list != null && list.size() > 0) {
                JSONArray jSONArray = new JSONArray();
                for (int i10 = 0; i10 < this.mml.size(); i10++) {
                    jSONArray.put(this.mml.get(i10).rdz());
                }
                jSONObject.put("creatives", jSONArray);
            }
            jSONObject.put("multi_ad_style", this.tvp);
            jSONObject.put(CommonUrlParts.REQUEST_ID, this.qdl);
            return jSONObject;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.aaj.qdl("AdInfo", "toJsonObj: ", th2);
            return null;
        }
    }

    public uw fs() {
        return this.mo;
    }

    public boolean jpc() {
        return this.jpc;
    }

    public int lnr() {
        return this.f17395ud;
    }

    public List<ljh> mml() {
        return this.mml;
    }

    public ljh mo() {
        if (this.mml.size() > 0) {
            return this.mml.get(0);
        }
        return null;
    }

    public boolean mzz() {
        List<ljh> list = this.mml;
        return list != null && list.size() > 0;
    }

    public JSONObject qdl() {
        return this.f17396wd;
    }

    public String rdp() {
        return this.rq;
    }

    public ljh rq() {
        return this.fs;
    }

    public boolean to() {
        return this.tvp == 1;
    }

    public void tvp() {
        this.jpc = false;
    }

    public String ud() {
        ljh ljhVarMo = mo();
        return ljhVarMo != null ? ljhVarMo.cev() : "";
    }

    public oth wd() {
        return this.to;
    }

    public void lnr(String str) {
        this.rq = str;
    }

    public void qdl(JSONObject jSONObject) {
        this.f17396wd = jSONObject;
    }

    public void qdl(String str) {
        this.qdl = str;
    }

    public void qdl(int i10) {
        this.f17395ud = i10;
    }

    public void ud(String str) {
        this.lnr = str;
    }

    public void qdl(ljh ljhVar) {
        this.mml.add(ljhVar);
        if (this.fs == null) {
            this.fs = ljhVar;
        }
    }

    public void ud(int i10) {
        this.tvp = i10;
    }

    public static qdl ud(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            qdl qdlVar = new qdl();
            qdlVar.qdl(oth.qdl(jSONObject.optJSONObject("loop_config")));
            qdlVar.ud(jSONObject.optInt("multi_ad_style", 0));
            JSONArray jSONArrayOptJSONArray = jSONObject.optJSONArray("creatives");
            if (jSONArrayOptJSONArray != null) {
                ArrayList arrayList = new ArrayList();
                for (int i10 = 0; i10 < jSONArrayOptJSONArray.length(); i10++) {
                    ljh ljhVarQdl = com.bytedance.sdk.openadsdk.core.ud.qdl(jSONArrayOptJSONArray.optJSONObject(i10), null, null, qdlVar, i10);
                    if (ljhVarQdl != null) {
                        arrayList.add(ljhVarQdl);
                    }
                }
                qdlVar.qdl(arrayList);
            }
            qdlVar.qdl(jSONObject.optString(CommonUrlParts.REQUEST_ID, ""));
            String strOptString = jSONObject.optString("multi_ad_config");
            if (!TextUtils.isEmpty(strOptString)) {
                qdlVar.qdl(uw.qdl(strOptString));
            }
            return qdlVar;
        } catch (Throwable th2) {
            com.bytedance.sdk.component.utils.aaj.qdl("AdInfo", "fromJson: ", th2);
            return null;
        }
    }

    public void qdl(List<ljh> list) {
        this.mml = list;
        if (list.isEmpty()) {
            return;
        }
        this.fs = list.get(0);
    }

    public static Map<String, ljh> qdl(qdl qdlVar) {
        if (qdlVar == null) {
            return null;
        }
        HashMap map = new HashMap();
        for (ljh ljhVar : qdlVar.mml()) {
            if (!TextUtils.isEmpty(ljhVar.xmr())) {
                map.put(ljhVar.xmr(), ljhVar);
            }
        }
        if (map.size() != 0) {
            return map;
        }
        return null;
    }

    public void qdl(oth othVar) {
        this.to = othVar;
    }

    public void qdl(uw uwVar) {
        this.mo = uwVar;
    }

    public void ud(ljh ljhVar) {
        this.mzz = ljhVar;
    }
}
