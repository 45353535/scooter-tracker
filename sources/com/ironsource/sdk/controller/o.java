package com.ironsource.sdk.controller;

import android.content.Context;
import com.ironsource.Dc;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes10.dex */
public class o {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final String f45198c = "o";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f45199d = "activate";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f45200e = "startSession";

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f45201f = "finishSession";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f45202g = "impressionOccurred";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f45203h = "getOmidData";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f45204i = "omidFunction";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f45205j = "omidParams";

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f45206k = "success";

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final String f45207l = "fail";

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final String f45208m = "%s | unsupported OMID API";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f45209a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Dc f45210b = new Dc();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        String f45211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        JSONObject f45212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f45213c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        String f45214d;

        private a() {
        }
    }

    public o(Context context) {
        this.f45209a = context;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    void a(java.lang.String r9, com.ironsource.InterfaceC4451na r10) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.sdk.controller.o.a(java.lang.String, com.ironsource.na):void");
    }

    private a a(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject(str);
        a aVar = new a();
        aVar.f45211a = jSONObject.optString(f45204i);
        aVar.f45212b = jSONObject.optJSONObject(f45205j);
        aVar.f45213c = jSONObject.optString("success");
        aVar.f45214d = jSONObject.optString("fail");
        return aVar;
    }
}
