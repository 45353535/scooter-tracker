package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C4417lc;
import com.ironsource.C4462o4;
import com.ironsource.InterfaceC4451na;
import com.ironsource.Qf;
import com.ironsource.Yd;
import com.ironsource.environment.StringUtils;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.Logger;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f45247d = "u";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f45248e = "updateToken";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f45249f = "getToken";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f45250g = "functionName";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f45251h = "functionParams";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f45252i = "success";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f45253j = "fail";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Context f45255b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private C4417lc f45254a = new C4417lc();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Qf f45256c = new Qf();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f45257a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        JSONObject f45258b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f45259c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f45260d;

        private a() {
        }
    }

    public u(Context context) {
        this.f45255b = context;
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a();
        aVar.f45257a = jSONObject.optString("functionName");
        aVar.f45258b = jSONObject.optJSONObject("functionParams");
        aVar.f45259c = jSONObject.optString("success");
        aVar.f45260d = jSONObject.optString("fail");
        return aVar;
    }

    void a(String str, InterfaceC4451na interfaceC4451na) throws Exception {
        a aVarA = a(str);
        if (f45248e.equals(aVarA.f45257a)) {
            a(aVarA.f45258b, aVarA, interfaceC4451na);
            return;
        }
        if (f45249f.equals(aVarA.f45257a)) {
            a(aVarA, interfaceC4451na);
            return;
        }
        Logger.i(f45247d, "unhandled API request " + str);
    }

    public void a(JSONObject jSONObject, a aVar, InterfaceC4451na interfaceC4451na) {
        Yd yd2 = new Yd();
        try {
            this.f45254a.a(jSONObject);
            interfaceC4451na.a(true, aVar.f45259c, yd2);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
            Logger.i(f45247d, "updateToken exception " + e10.getMessage());
            interfaceC4451na.a(false, aVar.f45260d, yd2);
        }
    }

    private void a(a aVar, InterfaceC4451na interfaceC4451na) {
        try {
            JSONObject jSONObjectA = this.f45256c.a();
            Iterator<String> itKeys = jSONObjectA.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                Object obj = jSONObjectA.get(next);
                if (obj instanceof String) {
                    jSONObjectA.put(next, StringUtils.encodeURI((String) obj));
                }
            }
            interfaceC4451na.a(true, aVar.f45259c, jSONObjectA);
        } catch (Exception e10) {
            C4462o4.d().a(e10);
            interfaceC4451na.a(false, aVar.f45260d, e10.getMessage());
        }
    }
}
