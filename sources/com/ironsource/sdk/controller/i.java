package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.C4240b4;
import com.ironsource.Ib;
import com.ironsource.InterfaceC4451na;
import com.ironsource.InterfaceC4634y7;
import com.ironsource.Yd;
import com.ironsource.sdk.utils.Logger;
import com.ironsource.sdk.utils.SDKUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f45132c = "i";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f45133d = "getDeviceData";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f45134e = "deviceDataFunction";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f45135f = "deviceDataParams";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f45136g = "success";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f45137h = "fail";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f45138a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4634y7 f45139b = Ib.U().i();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f45140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        JSONObject f45141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f45142c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f45143d;

        private a() {
        }
    }

    public i(Context context) {
        this.f45138a = context;
    }

    void a(String str, InterfaceC4451na interfaceC4451na) throws Exception {
        a aVarA = a(str);
        if (f45133d.equals(aVarA.f45140a)) {
            interfaceC4451na.a(true, aVarA.f45142c, a());
            return;
        }
        Logger.i(f45132c, "unhandled API request " + str);
    }

    private Yd a() {
        Yd yd2 = new Yd();
        yd2.b(SDKUtils.encodeString(C4240b4.j.f42683i0), SDKUtils.encodeString(String.valueOf(this.f45139b.j())));
        yd2.b(SDKUtils.encodeString(C4240b4.j.f42685j0), SDKUtils.encodeString(String.valueOf(this.f45139b.q(this.f45138a))));
        yd2.b(SDKUtils.encodeString(C4240b4.j.f42687k0), SDKUtils.encodeString(String.valueOf(this.f45139b.C(this.f45138a))));
        yd2.b(SDKUtils.encodeString(C4240b4.j.f42689l0), SDKUtils.encodeString(String.valueOf(this.f45139b.D(this.f45138a))));
        yd2.b(SDKUtils.encodeString(C4240b4.j.f42691m0), SDKUtils.encodeString(String.valueOf(this.f45139b.e(this.f45138a))));
        yd2.b(SDKUtils.encodeString(C4240b4.j.f42693n0), SDKUtils.encodeString(String.valueOf(this.f45139b.h(this.f45138a))));
        return yd2;
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a();
        aVar.f45140a = jSONObject.optString(f45134e);
        aVar.f45141b = jSONObject.optJSONObject(f45135f);
        aVar.f45142c = jSONObject.optString("success");
        aVar.f45143d = jSONObject.optString("fail");
        return aVar;
    }
}
