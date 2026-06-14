package com.ironsource;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.ironsource.C4240b4;
import com.ironsource.C4500q8;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.sdk.utils.IronSourceQaProperties;
import com.ironsource.sdk.utils.IronSourceStorageUtils;
import com.ironsource.sdk.utils.SDKUtils;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: com.ironsource.lc, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public class C4417lc {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final InterfaceC4634y7 f43557b = Ib.U().i();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    R6 f43556a = new R6();

    public void a(Context context) {
        if (context instanceof Activity) {
            this.f43556a.a(N6.f41404n, Boolean.valueOf(this.f43557b.a((Activity) context)));
        }
    }

    public void b() {
        String controllerConfig = SDKUtils.getControllerConfig();
        if (TextUtils.isEmpty(controllerConfig)) {
            return;
        }
        try {
            this.f43556a.a(N6.f41389i, new JSONObject(controllerConfig).opt(C4240b4.a.f42512q));
        } catch (JSONException e10) {
            C4462o4.d().a(e10);
            IronLog.INTERNAL.error(e10.toString());
        }
    }

    public void c() {
        this.f43556a.a("uxt", Boolean.valueOf(IronSourceStorageUtils.isUxt()));
    }

    public void d() {
        this.f43556a.a(N6.V, "9.1.0");
    }

    public void e() {
        HashMap map = new HashMap();
        map.put(N6.E, Dc.f40606f);
        map.put(N6.D, "7");
        this.f43556a.a(map);
    }

    public void a() {
        JSONObject jSONObject = new JSONObject(IronSourceQaProperties.getInstance().getParameters());
        if (jSONObject.length() > 0) {
            this.f43556a.a("debug", jSONObject);
        }
    }

    public void b(Context context) {
        this.f43556a.a("gpi", Boolean.valueOf(Yc.e(context)));
    }

    public void a(JSONObject jSONObject) {
        this.f43556a.a(N6.f41398l, jSONObject);
    }

    public void a(C4500q8.c cVar) {
        this.f43556a.a(N6.f41439y1, Integer.valueOf(cVar.ordinal()));
    }

    public void a(Map<String, JSONObject> map) {
        for (Map.Entry<String, JSONObject> entry : map.entrySet()) {
            this.f43556a.a(entry.getKey(), (Object) entry.getValue());
        }
    }

    public void a(List<String> list) {
        this.f43556a.a(N6.B1, list);
    }

    public void a(boolean z10) {
        this.f43556a.a(N6.S0, Boolean.valueOf(z10));
    }
}
