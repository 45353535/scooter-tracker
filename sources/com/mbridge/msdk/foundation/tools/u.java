package com.mbridge.msdk.foundation.tools;

import android.content.Context;
import com.mbridge.msdk.MBridgeConstans;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class u extends e {

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f49079w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f49080x;

    public u(Context context) {
        super(context);
        this.f49080x = m0.v();
        this.f49079w = m0.h();
    }

    @Override // com.mbridge.msdk.foundation.tools.e
    public JSONObject a() {
        JSONObject jSONObjectA = super.a();
        try {
            if (com.mbridge.msdk.foundation.controller.authoritycontroller.c.m().c(MBridgeConstans.AUTHORITY_GENERAL_DATA)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("dmt", this.f49080x + "");
                jSONObject.put("dmf", this.f49079w);
                return jSONObjectA;
            }
        } catch (JSONException e10) {
            if (MBridgeConstans.DEBUG) {
                q0.b("DomainDeviceInfo", e10.getMessage());
            }
        }
        return jSONObjectA;
    }
}
