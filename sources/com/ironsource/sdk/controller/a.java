package com.ironsource.sdk.controller;

import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4449n8;
import com.ironsource.InterfaceC4363i8;
import com.ironsource.jg;
import com.ironsource.zg;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class a implements InterfaceC4363i8 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f44983d = "loadWithUrl";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f44984e = "sendMessage";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final String f44985f = "removeAdView";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f44986g = "webviewAction";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final String f44987h = "handleGetViewVisibility";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f44988i = "functionName";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f44989j = "functionParams";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f44990k = "success";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f44991l = "fail";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final String f44992m = "errMsg";

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f44993n = "%s | unsupported AdViews API";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private zg f44994a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C4449n8 f44995b = C4449n8.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f44996c;

    /* JADX INFO: renamed from: com.ironsource.sdk.controller.a$a, reason: collision with other inner class name */
    private static class C0473a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f44997a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        JSONObject f44998b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f44999c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f45000d;

        private C0473a() {
        }
    }

    public a(Context context) {
        this.f44996c = context;
    }

    public void a(zg zgVar) {
        this.f44994a = zgVar;
    }

    @Override // com.ironsource.InterfaceC4363i8
    public void a(String str, JSONObject jSONObject) {
        if (this.f44994a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f44994a.a(str, jSONObject);
    }

    @Override // com.ironsource.InterfaceC4363i8
    public void a(String str, String str2, String str3) {
        a(str, jg.a(str2, str3));
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void a(java.lang.String r10, com.ironsource.InterfaceC4451na r11) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 234
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.a.a(java.lang.String, com.ironsource.na):void");
    }

    private C0473a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        C0473a c0473a = new C0473a();
        c0473a.f44997a = jSONObject.optString("functionName");
        c0473a.f44998b = jSONObject.optJSONObject("functionParams");
        c0473a.f44999c = jSONObject.optString("success");
        c0473a.f45000d = jSONObject.optString("fail");
        return c0473a;
    }
}
