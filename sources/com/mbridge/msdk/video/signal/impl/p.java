package com.mbridge.msdk.video.signal.impl;

import com.ironsource.C4240b4;
import com.mbridge.msdk.foundation.tools.t;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class p extends g {
    public void a(JSONObject jSONObject) {
        try {
            jSONObject.put(C4240b4.i.G, new t(com.mbridge.msdk.foundation.controller.c.n().d()).a());
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }
}
