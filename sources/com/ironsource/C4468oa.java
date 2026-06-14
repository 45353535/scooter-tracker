package com.ironsource;

import com.ironsource.C4240b4;
import com.ironsource.mediationsdk.logger.IronLog;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.oa, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4468oa {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f44565a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private JSONObject f44566b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f44567c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private String f44568d;

    public C4468oa(JSONObject jSONObject) {
        this.f44565a = jSONObject.optString(C4240b4.g.f42579b);
        this.f44566b = jSONObject.optJSONObject(C4240b4.g.f42580c);
        this.f44567c = jSONObject.optString("success");
        this.f44568d = jSONObject.optString(C4240b4.g.f42582e);
    }

    public String a() {
        return this.f44568d;
    }

    public String b() {
        return this.f44565a;
    }

    public JSONObject c() {
        return this.f44566b;
    }

    public String d() {
        return this.f44567c;
    }

    public JSONObject e() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(C4240b4.g.f42579b, this.f44565a);
            jSONObject.put(C4240b4.g.f42580c, this.f44566b);
            jSONObject.put("success", this.f44567c);
            jSONObject.put(C4240b4.g.f42582e, this.f44568d);
            return jSONObject;
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }
}
