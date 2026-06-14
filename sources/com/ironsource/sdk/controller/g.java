package com.ironsource.sdk.controller;

import android.webkit.JavascriptInterface;
import com.ironsource.C4462o4;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f45118c = "com.ironsource.sdk.controller.g";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f45119d = "functionName";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f45120e = "params";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f45121f = "hash";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f45122a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final s f45123b;

    g(b bVar, s sVar) {
        this.f45122a = bVar;
        this.f45123b = sVar;
    }

    private void a(Exception exc) {
        if (!(exc instanceof NoSuchMethodException)) {
            a(exc.getLocalizedMessage());
            return;
        }
        IronLog.INTERNAL.error(exc.toString());
        Logger.i(f45118c, "messageHandler failed with exception " + exc.getMessage());
    }

    private void b(String str, String str2, String str3) {
        this.f45122a.a(a(str, str2, str3));
    }

    @JavascriptInterface
    public void messageHandler(String str, String str2, String str3) {
        try {
            Logger.i(f45118c, "messageHandler(" + str + " " + str3 + ")");
            if (this.f45123b.a(str, str2, str3)) {
                a(str, str2);
            } else {
                b(str, str2, str3);
            }
        } catch (Exception e10) {
            a(e10);
        }
    }

    private void a(String str, String str2) throws Exception {
        this.f45122a.a(str, str2);
    }

    private void a(String str) {
        this.f45122a.b(str);
    }

    private String a(String str, String str2, String str3) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("functionName", SDKUtils.encodeString(str));
            jSONObject.put("params", SDKUtils.encodeString(str2));
            jSONObject.put(f45121f, SDKUtils.encodeString(str3));
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
        return jSONObject.toString();
    }
}
