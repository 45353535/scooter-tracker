package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.B1;
import com.ironsource.C4462o4;
import com.ironsource.InterfaceC4451na;
import com.ironsource.Yd;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final String f45225b = "q";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f45226c = "getPermissions";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f45227d = "isPermissionGranted";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f45228e = "permissions";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f45229f = "permission";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f45230g = "status";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f45231h = "functionName";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f45232i = "functionParams";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f45233j = "success";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f45234k = "fail";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f45235l = "unhandledPermission";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f45236a;

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f45237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        JSONObject f45238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f45239c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f45240d;

        private a() {
        }
    }

    public q(Context context) {
        this.f45236a = context;
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a();
        aVar.f45237a = jSONObject.optString("functionName");
        aVar.f45238b = jSONObject.optJSONObject("functionParams");
        aVar.f45239c = jSONObject.optString("success");
        aVar.f45240d = jSONObject.optString("fail");
        return aVar;
    }

    public void b(JSONObject jSONObject, a aVar, InterfaceC4451na interfaceC4451na) {
        Yd yd2 = new Yd();
        try {
            String string = jSONObject.getString(f45229f);
            yd2.b(f45229f, string);
            if (B1.d(this.f45236a, string)) {
                yd2.b("status", String.valueOf(B1.c(this.f45236a, string)));
                interfaceC4451na.a(true, aVar.f45239c, yd2);
            } else {
                yd2.b("status", f45235l);
                interfaceC4451na.a(false, aVar.f45240d, yd2);
            }
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            yd2.b("errMsg", e10.getMessage());
            interfaceC4451na.a(false, aVar.f45240d, yd2);
        }
    }

    void a(String str, InterfaceC4451na interfaceC4451na) throws Exception {
        a aVarA = a(str);
        if (f45226c.equals(aVarA.f45237a)) {
            a(aVarA.f45238b, aVarA, interfaceC4451na);
            return;
        }
        if (f45227d.equals(aVarA.f45237a)) {
            b(aVarA.f45238b, aVarA, interfaceC4451na);
            return;
        }
        Logger.i(f45225b, "PermissionsJSAdapter unhandled API request " + str);
    }

    public void a(JSONObject jSONObject, a aVar, InterfaceC4451na interfaceC4451na) {
        Yd yd2 = new Yd();
        try {
            yd2.a(f45228e, B1.a(this.f45236a, jSONObject.getJSONArray(f45228e)));
            interfaceC4451na.a(true, aVar.f45239c, yd2);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            Logger.i(f45225b, "PermissionsJSAdapter getPermissions JSON Exception when getting permissions parameter " + e10.getMessage());
            yd2.b("errMsg", e10.getMessage());
            interfaceC4451na.a(false, aVar.f45240d, yd2);
        }
    }
}
