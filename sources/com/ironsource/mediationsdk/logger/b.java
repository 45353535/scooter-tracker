package com.ironsource.mediationsdk.logger;

import com.bytedance.sdk.component.pglcrypt.PglCryptUtils;
import com.ironsource.C4462o4;
import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.taurusx.tax.y.z.w.s;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private IronSourceLogger.IronSourceTag f44090a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private String f44091b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f44092c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f44093d;

    public b(IronSourceLogger.IronSourceTag ironSourceTag, String str, String str2, int i10) {
        this.f44090a = ironSourceTag;
        this.f44091b = str;
        this.f44092c = str2;
        this.f44093d = i10;
    }

    public int a() {
        return this.f44093d;
    }

    public JSONObject b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("timestamp", this.f44091b);
            jSONObject.put(s.z.f67720z, this.f44090a);
            jSONObject.put("level", this.f44093d);
            jSONObject.put(PglCryptUtils.KEY_MESSAGE, this.f44092c);
            return jSONObject;
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            return jSONObject;
        }
    }
}
