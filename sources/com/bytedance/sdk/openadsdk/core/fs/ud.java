package com.bytedance.sdk.openadsdk.core.fs;

import com.bytedance.sdk.openadsdk.core.fs.lnr.qdl;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes6.dex */
public class ud extends lnr {
    private long rq;
    private long to;

    public ud(int i10, int i11, long j10, long j11, qdl.EnumC0258qdl enumC0258qdl, qdl.ud udVar, String str, List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list, List<com.bytedance.sdk.openadsdk.core.fs.ud.lnr> list2, String str2) {
        super(i10, i11, enumC0258qdl, udVar, str, list, list2, str2);
        this.to = j10;
        this.rq = j11;
        this.tvp = "icon_click";
    }

    @Override // com.bytedance.sdk.openadsdk.core.fs.lnr
    public JSONObject qdl() throws JSONException {
        JSONObject jSONObjectQdl = super.qdl();
        if (jSONObjectQdl != null) {
            jSONObjectQdl.put("offset", this.to);
            jSONObjectQdl.put("duration", this.rq);
        }
        return jSONObjectQdl;
    }

    public static ud qdl(JSONObject jSONObject) {
        lnr lnrVarUd = lnr.ud(jSONObject);
        if (lnrVarUd == null) {
            return null;
        }
        return new ud(lnrVarUd.qdl, lnrVarUd.f17206ud, jSONObject.optLong("offset", -1L), jSONObject.optLong("duration", -1L), lnrVarUd.lnr, lnrVarUd.mml, lnrVarUd.mzz, lnrVarUd.mo, lnrVarUd.f17207wd, lnrVarUd.jpc);
    }
}
